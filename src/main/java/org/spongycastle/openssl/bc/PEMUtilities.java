package org.spongycastle.openssl.bc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.engines.AESEngine;
import org.spongycastle.crypto.engines.BlowfishEngine;
import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.engines.DESedeEngine;
import org.spongycastle.crypto.engines.RC2Engine;
import org.spongycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.modes.CFBBlockCipher;
import org.spongycastle.crypto.modes.OFBBlockCipher;
import org.spongycastle.crypto.paddings.PKCS7Padding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.RC2Parameters;
import org.spongycastle.openssl.EncryptionException;
import org.spongycastle.util.Integers;

/* JADX INFO: loaded from: classes10.dex */
class PEMUtilities {
    private static final Map KEYSIZES;
    private static final Set PKCS5_SCHEME_1;
    private static final Set PKCS5_SCHEME_2;

    static {
        HashMap map = new HashMap();
        KEYSIZES = map;
        HashSet hashSet = new HashSet();
        PKCS5_SCHEME_1 = hashSet;
        HashSet hashSet2 = new HashSet();
        PKCS5_SCHEME_2 = hashSet2;
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC);
        hashSet.add(PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC);
        hashSet2.add(PKCSObjectIdentifiers.id_PBES2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.des_EDE3_CBC;
        hashSet2.add(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_CBC;
        hashSet2.add(aSN1ObjectIdentifier2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes192_CBC;
        hashSet2.add(aSN1ObjectIdentifier3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes256_CBC;
        hashSet2.add(aSN1ObjectIdentifier4);
        map.put(aSN1ObjectIdentifier.getId(), Integers.valueOf(192));
        map.put(aSN1ObjectIdentifier2.getId(), Integers.valueOf(128));
        map.put(aSN1ObjectIdentifier3.getId(), Integers.valueOf(192));
        map.put(aSN1ObjectIdentifier4.getId(), Integers.valueOf(256));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4.getId(), Integers.valueOf(128));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4, Integers.valueOf(40));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, Integers.valueOf(128));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, Integers.valueOf(192));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, Integers.valueOf(128));
        map.put(PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, Integers.valueOf(40));
    }

    PEMUtilities() {
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0130 A[Catch: Exception -> 0x0166, TRY_ENTER, TryCatch #0 {Exception -> 0x0166, blocks: (B:63:0x0130, B:66:0x013d, B:68:0x0149, B:71:0x0160, B:67:0x0141, B:64:0x0136), top: B:80:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0136 A[Catch: Exception -> 0x0166, TryCatch #0 {Exception -> 0x0166, blocks: (B:63:0x0130, B:66:0x013d, B:68:0x0149, B:71:0x0160, B:67:0x0141, B:64:0x0136), top: B:80:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:66:0x013d A[Catch: Exception -> 0x0166, TryCatch #0 {Exception -> 0x0166, blocks: (B:63:0x0130, B:66:0x013d, B:68:0x0149, B:71:0x0160, B:67:0x0141, B:64:0x0136), top: B:80:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0141 A[Catch: Exception -> 0x0166, TryCatch #0 {Exception -> 0x0166, blocks: (B:63:0x0130, B:66:0x013d, B:68:0x0149, B:71:0x0160, B:67:0x0141, B:64:0x0136), top: B:80:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:70:0x015f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0160 A[Catch: Exception -> 0x0166, TRY_LEAVE, TryCatch #0 {Exception -> 0x0166, blocks: (B:63:0x0130, B:66:0x013d, B:68:0x0149, B:71:0x0160, B:67:0x0141, B:64:0x0136), top: B:80:0x012e }] */
    static byte[] crypt(boolean z11, byte[] bArr, char[] cArr, String str, byte[] bArr2) throws EncryptionException {
        String str2;
        byte[] bArr3;
        KeyParameter key;
        BlockCipher aESEngine;
        BlockCipher oFBBlockCipher;
        BufferedBlockCipher paddedBufferedBlockCipher;
        int outputSize;
        byte[] bArr4;
        int iDoFinal;
        byte[] bArr5 = bArr2;
        PKCS7Padding pKCS7Padding = new PKCS7Padding();
        PKCS7Padding pKCS7Padding2 = null;
        if (str.endsWith("-CFB")) {
            str2 = "CFB";
            pKCS7Padding = null;
        } else {
            str2 = "CBC";
        }
        if (str.endsWith("-ECB") || "DES-EDE".equals(str) || "DES-EDE3".equals(str)) {
            str2 = "ECB";
            bArr3 = null;
        } else {
            bArr3 = bArr5;
        }
        if (str.endsWith("-OFB")) {
            str2 = "OFB";
        } else {
            pKCS7Padding2 = pKCS7Padding;
        }
        if (str.startsWith("DES-EDE")) {
            key = getKey(cArr, 24, bArr5, !str.startsWith("DES-EDE3"));
            aESEngine = new DESedeEngine();
        } else if (str.startsWith("DES-")) {
            key = getKey(cArr, 8, bArr5);
            aESEngine = new DESEngine();
        } else if (str.startsWith("BF-")) {
            key = getKey(cArr, 16, bArr5);
            aESEngine = new BlowfishEngine();
        } else {
            int i11 = 128;
            if (str.startsWith("RC2-")) {
                if (str.startsWith("RC2-40-")) {
                    i11 = 40;
                } else if (str.startsWith("RC2-64-")) {
                    i11 = 64;
                }
                RC2Parameters rC2Parameters = new RC2Parameters(getKey(cArr, i11 / 8, bArr5).getKey(), i11);
                aESEngine = new RC2Engine();
                key = rC2Parameters;
            } else {
                if (!str.startsWith("AES-")) {
                    throw new EncryptionException("unknown encryption with private key: " + str);
                }
                if (bArr5.length > 8) {
                    byte[] bArr6 = new byte[8];
                    System.arraycopy(bArr5, 0, bArr6, 0, 8);
                    bArr5 = bArr6;
                }
                if (!str.startsWith("AES-128-")) {
                    if (str.startsWith("AES-192-")) {
                        i11 = 192;
                    } else {
                        if (!str.startsWith("AES-256-")) {
                            throw new EncryptionException("unknown AES encryption with private key: " + str);
                        }
                        i11 = 256;
                    }
                }
                key = getKey(cArr, i11 / 8, bArr5);
                aESEngine = new AESEngine();
            }
        }
        try {
            if (str2.equals("CBC")) {
                oFBBlockCipher = new CBCBlockCipher(aESEngine);
            } else {
                if (!str2.equals("CFB")) {
                    if (str2.equals("OFB")) {
                        oFBBlockCipher = new OFBBlockCipher(aESEngine, aESEngine.getBlockSize() * 8);
                    }
                    if (pKCS7Padding2 == null) {
                        paddedBufferedBlockCipher = new BufferedBlockCipher(aESEngine);
                    } else {
                        paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(aESEngine, pKCS7Padding2);
                    }
                    if (bArr3 == null) {
                        paddedBufferedBlockCipher.init(z11, key);
                    } else {
                        paddedBufferedBlockCipher.init(z11, new ParametersWithIV(key, bArr3));
                    }
                    outputSize = paddedBufferedBlockCipher.getOutputSize(bArr.length);
                    BufferedBlockCipher bufferedBlockCipher = paddedBufferedBlockCipher;
                    bArr4 = new byte[outputSize];
                    int iProcessBytes = bufferedBlockCipher.processBytes(bArr, 0, bArr.length, bArr4, 0);
                    iDoFinal = iProcessBytes + bufferedBlockCipher.doFinal(bArr4, iProcessBytes);
                    if (iDoFinal == outputSize) {
                        return bArr4;
                    }
                    byte[] bArr7 = new byte[iDoFinal];
                    System.arraycopy(bArr4, 0, bArr7, 0, iDoFinal);
                    return bArr7;
                }
                oFBBlockCipher = new CFBBlockCipher(aESEngine, aESEngine.getBlockSize() * 8);
            }
            if (pKCS7Padding2 == null) {
                paddedBufferedBlockCipher = new BufferedBlockCipher(aESEngine);
            } else {
                paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(aESEngine, pKCS7Padding2);
            }
            if (bArr3 == null) {
                paddedBufferedBlockCipher.init(z11, key);
            } else {
                paddedBufferedBlockCipher.init(z11, new ParametersWithIV(key, bArr3));
            }
            outputSize = paddedBufferedBlockCipher.getOutputSize(bArr.length);
            BufferedBlockCipher bufferedBlockCipher2 = paddedBufferedBlockCipher;
            bArr4 = new byte[outputSize];
            int iProcessBytes2 = bufferedBlockCipher2.processBytes(bArr, 0, bArr.length, bArr4, 0);
            iDoFinal = iProcessBytes2 + bufferedBlockCipher2.doFinal(bArr4, iProcessBytes2);
            if (iDoFinal == outputSize) {
                return bArr4;
            }
            byte[] bArr8 = new byte[iDoFinal];
            System.arraycopy(bArr4, 0, bArr8, 0, iDoFinal);
            return bArr8;
        } catch (Exception e11) {
            throw new EncryptionException("exception using cipher - please check password and data.", e11);
        }
        aESEngine = oFBBlockCipher;
    }

    public static KeyParameter generateSecretKeyForPKCS5Scheme2(String str, char[] cArr, byte[] bArr, int i11) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(new SHA1Digest());
        pKCS5S2ParametersGenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr, i11);
        return (KeyParameter) pKCS5S2ParametersGenerator.generateDerivedParameters(getKeySize(str));
    }

    private static KeyParameter getKey(char[] cArr, int i11, byte[] bArr) {
        return getKey(cArr, i11, bArr, false);
    }

    static int getKeySize(String str) {
        Map map = KEYSIZES;
        if (map.containsKey(str)) {
            return ((Integer) map.get(str)).intValue();
        }
        throw new IllegalStateException("no key size for algorithm: " + str);
    }

    public static boolean isPKCS12(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.getId().startsWith(PKCSObjectIdentifiers.pkcs_12PbeIds.getId());
    }

    static boolean isPKCS5Scheme1(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCS5_SCHEME_1.contains(aSN1ObjectIdentifier);
    }

    static boolean isPKCS5Scheme2(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return PKCS5_SCHEME_2.contains(aSN1ObjectIdentifier);
    }

    private static KeyParameter getKey(char[] cArr, int i11, byte[] bArr, boolean z11) {
        OpenSSLPBEParametersGenerator openSSLPBEParametersGenerator = new OpenSSLPBEParametersGenerator();
        openSSLPBEParametersGenerator.init(PBEParametersGenerator.PKCS5PasswordToBytes(cArr), bArr, 1);
        KeyParameter keyParameter = (KeyParameter) openSSLPBEParametersGenerator.generateDerivedParameters(i11 * 8);
        if (!z11 || keyParameter.getKey().length != 24) {
            return keyParameter;
        }
        byte[] key = keyParameter.getKey();
        System.arraycopy(key, 0, key, 16, 8);
        return new KeyParameter(key);
    }
}
