package org.bouncycastle.jcajce.provider.symmetric.util;

import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class BCPBEKey implements PBEKey, Destroyable {
    String algorithm;
    int digest;
    private final AtomicBoolean hasBeenDestroyed;
    private final int iterationCount;
    int ivSize;
    int keySize;
    ASN1ObjectIdentifier oid;
    private final CipherParameters param;
    private final char[] password;
    private final byte[] salt;
    boolean tryWrong;
    int type;

    public BCPBEKey(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, int i11, int i12, int i13, int i14, PBEKeySpec pBEKeySpec, CipherParameters cipherParameters) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.tryWrong = false;
        this.algorithm = str;
        this.oid = aSN1ObjectIdentifier;
        this.type = i11;
        this.digest = i12;
        this.keySize = i13;
        this.ivSize = i14;
        this.password = pBEKeySpec.getPassword();
        this.iterationCount = pBEKeySpec.getIterationCount();
        this.salt = pBEKeySpec.getSalt();
        this.param = cipherParameters;
    }

    static void checkDestroyed(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
    }

    @Override // javax.security.auth.Destroyable
    public void destroy() {
        if (this.hasBeenDestroyed.getAndSet(true)) {
            return;
        }
        char[] cArr = this.password;
        if (cArr != null) {
            Arrays.fill(cArr, (char) 0);
        }
        byte[] bArr = this.salt;
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        String str = this.algorithm;
        checkDestroyed(this);
        return str;
    }

    int getDigest() {
        int i11 = this.digest;
        checkDestroyed(this);
        return i11;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        byte[] bArrPKCS5PasswordToUTF8Bytes;
        CipherParameters parameters = this.param;
        if (parameters != null) {
            if (parameters instanceof ParametersWithIV) {
                parameters = ((ParametersWithIV) parameters).getParameters();
            }
            bArrPKCS5PasswordToUTF8Bytes = ((KeyParameter) parameters).getKey();
        } else {
            int i11 = this.type;
            if (i11 == 2) {
                bArrPKCS5PasswordToUTF8Bytes = PBEParametersGenerator.PKCS12PasswordToBytes(this.password);
            } else {
                bArrPKCS5PasswordToUTF8Bytes = i11 == 5 ? PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(this.password) : PBEParametersGenerator.PKCS5PasswordToBytes(this.password);
            }
        }
        checkDestroyed(this);
        return bArrPKCS5PasswordToUTF8Bytes;
    }

    @Override // java.security.Key
    public String getFormat() {
        checkDestroyed(this);
        return "RAW";
    }

    @Override // javax.crypto.interfaces.PBEKey
    public int getIterationCount() {
        int i11 = this.iterationCount;
        checkDestroyed(this);
        return i11;
    }

    public int getIvSize() {
        int i11 = this.ivSize;
        checkDestroyed(this);
        return i11;
    }

    int getKeySize() {
        int i11 = this.keySize;
        checkDestroyed(this);
        return i11;
    }

    public ASN1ObjectIdentifier getOID() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.oid;
        checkDestroyed(this);
        return aSN1ObjectIdentifier;
    }

    public CipherParameters getParam() {
        CipherParameters cipherParameters = this.param;
        checkDestroyed(this);
        return cipherParameters;
    }

    @Override // javax.crypto.interfaces.PBEKey
    public char[] getPassword() {
        char[] cArrClone = Arrays.clone(this.password);
        checkDestroyed(this);
        if (cArrClone != null) {
            return cArrClone;
        }
        throw new IllegalStateException("no password available");
    }

    @Override // javax.crypto.interfaces.PBEKey
    public byte[] getSalt() {
        byte[] bArrClone = Arrays.clone(this.salt);
        checkDestroyed(this);
        return bArrClone;
    }

    int getType() {
        int i11 = this.type;
        checkDestroyed(this);
        return i11;
    }

    @Override // javax.security.auth.Destroyable
    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public void setTryWrongPKCS12Zero(boolean z11) {
        this.tryWrong = z11;
    }

    boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }

    public BCPBEKey(String str, CipherParameters cipherParameters) {
        this.hasBeenDestroyed = new AtomicBoolean(false);
        this.tryWrong = false;
        this.algorithm = str;
        this.param = cipherParameters;
        this.password = null;
        this.iterationCount = -1;
        this.salt = null;
    }
}
