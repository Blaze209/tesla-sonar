package org.bouncycastle.pqc.jcajce.provider.kyber;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.jcajce.spec.KEMParameterSpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMExtractor;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberKEMGenerator;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.jcajce.provider.util.WrapUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes10.dex */
class KyberCipherSpi extends CipherSpi {
    private final String algorithmName;
    private AlgorithmParameters engineParams;
    private KyberKEMGenerator kemGen;
    private KTSParameterSpec kemParameterSpec;
    private KyberParameters kyberParameters;
    private BCKyberPrivateKey unwrapKey;
    private BCKyberPublicKey wrapKey;

    public static class Base extends KyberCipherSpi {
        public Base() {
            super("KYBER");
        }
    }

    public static class Kyber1024 extends KyberCipherSpi {
        public Kyber1024() {
            super(KyberParameters.kyber1024);
        }
    }

    public static class Kyber512 extends KyberCipherSpi {
        public Kyber512() {
            super(KyberParameters.kyber512);
        }
    }

    public static class Kyber768 extends KyberCipherSpi {
        public Kyber768() {
            super(KyberParameters.kyber768);
        }
    }

    KyberCipherSpi(String str) {
        this.algorithmName = str;
        this.kyberParameters = null;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return 2048;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i11) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.algorithmName, "BCPQC");
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.kemParameterSpec);
            } catch (Exception e11) {
                throw Exceptions.illegalStateException(e11.toString(), e11);
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(KEMParameterSpec.class);
            } catch (Exception unused) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i11, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(String str) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException("Cannot support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(String str) throws NoSuchPaddingException {
        throw new NoSuchPaddingException("Padding " + str + " unknown");
    }

    @Override // javax.crypto.CipherSpi
    protected Key engineUnwrap(byte[] bArr, String str, int i11) throws InvalidKeyException {
        if (i11 != 3) {
            throw new InvalidKeyException("only SECRET_KEY supported");
        }
        byte[] bArrExtractSecret = null;
        try {
            try {
                KyberKEMExtractor kyberKEMExtractor = new KyberKEMExtractor(this.unwrapKey.getKeyParams());
                bArrExtractSecret = kyberKEMExtractor.extractSecret(Arrays.copyOfRange(bArr, 0, kyberKEMExtractor.getEncapsulationLength()));
                Wrapper keyUnwrapper = WrapUtil.getKeyUnwrapper(this.kemParameterSpec, bArrExtractSecret);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, kyberKEMExtractor.getEncapsulationLength(), bArr.length);
                SecretKeySpec secretKeySpec = new SecretKeySpec(keyUnwrapper.unwrap(bArrCopyOfRange, 0, bArrCopyOfRange.length), str);
                if (bArrExtractSecret != null) {
                    Arrays.clear(bArrExtractSecret);
                }
                return secretKeySpec;
            } catch (IllegalArgumentException e11) {
                throw new NoSuchAlgorithmException("unable to extract KTS secret: " + e11.getMessage());
            } catch (InvalidCipherTextException e12) {
                throw new InvalidKeyException("unable to extract KTS secret: " + e12.getMessage());
            }
        } catch (Throwable th2) {
            if (bArrExtractSecret != null) {
                Arrays.clear(bArrExtractSecret);
            }
            throw th2;
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        if (key.getEncoded() == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        SecretWithEncapsulation secretWithEncapsulationGenerateEncapsulated = null;
        try {
            try {
                secretWithEncapsulationGenerateEncapsulated = this.kemGen.generateEncapsulated(this.wrapKey.getKeyParams());
                Wrapper keyWrapper = WrapUtil.getKeyWrapper(this.kemParameterSpec, secretWithEncapsulationGenerateEncapsulated.getSecret());
                byte[] encapsulation = secretWithEncapsulationGenerateEncapsulated.getEncapsulation();
                byte[] encoded = key.getEncoded();
                byte[] bArrConcatenate = Arrays.concatenate(encapsulation, keyWrapper.wrap(encoded, 0, encoded.length));
                Arrays.clear(encoded);
                try {
                    secretWithEncapsulationGenerateEncapsulated.destroy();
                    return bArrConcatenate;
                } catch (DestroyFailedException e11) {
                    throw new IllegalBlockSizeException("unable to destroy interim values: " + e11.getMessage());
                }
            } catch (IllegalArgumentException e12) {
                throw new IllegalBlockSizeException("unable to generate KTS secret: " + e12.getMessage());
            }
        } catch (Throwable th2) {
            if (secretWithEncapsulationGenerateEncapsulated != null) {
                try {
                    secretWithEncapsulationGenerateEncapsulated.destroy();
                } catch (DestroyFailedException e13) {
                    throw new IllegalBlockSizeException("unable to destroy interim values: " + e13.getMessage());
                }
            }
            throw th2;
        }
    }

    KyberCipherSpi(KyberParameters kyberParameters) {
        this.kyberParameters = kyberParameters;
        this.algorithmName = Strings.toUpperCase(kyberParameters.getName());
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i11, int i12) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e11) {
            throw Exceptions.illegalArgumentException(e11.getMessage(), e11);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        KTSParameterSpec kEMParameterSpec;
        if (algorithmParameterSpec == null) {
            kEMParameterSpec = new KEMParameterSpec("AES-KWP");
        } else {
            if (!(algorithmParameterSpec instanceof KTSParameterSpec)) {
                throw new InvalidAlgorithmParameterException(this.algorithmName + " can only accept KTSParameterSpec");
            }
            kEMParameterSpec = (KTSParameterSpec) algorithmParameterSpec;
        }
        this.kemParameterSpec = kEMParameterSpec;
        if (i11 == 3) {
            if (!(key instanceof BCKyberPublicKey)) {
                throw new InvalidKeyException("Only a " + this.algorithmName + " public key can be used for wrapping");
            }
            this.wrapKey = (BCKyberPublicKey) key;
            this.kemGen = new KyberKEMGenerator(CryptoServicesRegistrar.getSecureRandom(secureRandom));
        } else {
            if (i11 != 4) {
                throw new InvalidParameterException("Cipher only valid for wrapping/unwrapping");
            }
            if (!(key instanceof BCKyberPrivateKey)) {
                throw new InvalidKeyException("Only a " + this.algorithmName + " private key can be used for unwrapping");
            }
            this.unwrapKey = (BCKyberPrivateKey) key;
        }
        KyberParameters kyberParameters = this.kyberParameters;
        if (kyberParameters != null) {
            String upperCase = Strings.toUpperCase(kyberParameters.getName());
            if (upperCase.equals(key.getAlgorithm())) {
                return;
            }
            throw new InvalidKeyException("cipher locked to " + upperCase);
        }
    }
}
