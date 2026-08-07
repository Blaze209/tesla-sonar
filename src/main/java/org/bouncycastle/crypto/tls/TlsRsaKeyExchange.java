package org.bouncycastle.crypto.tls;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TlsRsaKeyExchange {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    public static final int PRE_MASTER_SECRET_LENGTH = 48;

    private TlsRsaKeyExchange() {
    }

    private static int caddTo(int i11, int i12, byte[] bArr, byte[] bArr2) {
        int i13 = i12 & 255;
        int i14 = 0;
        for (int i15 = i11 - 1; i15 >= 0; i15--) {
            int i16 = i14 + (bArr2[i15] & 255) + (bArr[i15] & i13);
            bArr2[i15] = (byte) i16;
            i14 = i16 >>> 8;
        }
        return i14;
    }

    private static int checkPkcs1Encoding2(byte[] bArr, int i11, int i12) {
        int i13 = (i11 - i12) - 10;
        int length = bArr.length - i11;
        int length2 = (bArr.length - 1) - i12;
        for (int i14 = 0; i14 < length; i14++) {
            i13 |= -(bArr[i14] & 255);
        }
        int i15 = -((bArr[length] & 255) ^ 2);
        while (true) {
            i15 |= i13;
            length++;
            if (length >= length2) {
                return ((-(bArr[length2] & 255)) | i15) >> 31;
            }
            i13 = (bArr[length] & 255) - 1;
        }
    }

    private static BigInteger convertInput(BigInteger bigInteger, byte[] bArr, int i11, int i12) {
        BigInteger bigIntegerFromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, i11, i12);
        if (bigIntegerFromUnsignedByteArray.compareTo(bigInteger) < 0) {
            return bigIntegerFromUnsignedByteArray;
        }
        throw new DataLengthException("input too large for RSA cipher.");
    }

    public static byte[] decryptPreMasterSecret(byte[] bArr, int i11, int i12, RSAKeyParameters rSAKeyParameters, int i13, SecureRandom secureRandom) {
        if (bArr == null || i12 < 1 || i12 > getInputLimit(rSAKeyParameters) || i11 < 0 || i11 > bArr.length - i12) {
            throw new IllegalArgumentException("input not a valid EncryptedPreMasterSecret");
        }
        if (!rSAKeyParameters.isPrivate()) {
            throw new IllegalArgumentException("'privateKey' must be an RSA private key");
        }
        BigInteger modulus = rSAKeyParameters.getModulus();
        int iBitLength = modulus.bitLength();
        if (iBitLength < 512) {
            throw new IllegalArgumentException("'privateKey' must be at least 512 bits");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("RSA", ConstraintUtils.bitsOfSecurityFor(modulus), rSAKeyParameters, CryptoServicePurpose.DECRYPTION));
        if ((i13 & 65535) != i13) {
            throw new IllegalArgumentException("'protocolVersion' must be a 16 bit value");
        }
        SecureRandom secureRandom2 = CryptoServicesRegistrar.getSecureRandom(secureRandom);
        byte[] bArr2 = new byte[48];
        secureRandom2.nextBytes(bArr2);
        try {
            byte[] bArrRsaBlinded = rsaBlinded(rSAKeyParameters, convertInput(modulus, bArr, i11, i12), secureRandom2);
            int length = bArrRsaBlinded.length - 48;
            int iCheckPkcs1Encoding2 = checkPkcs1Encoding2(bArrRsaBlinded, (iBitLength - 1) / 8, 48) | ((-((Pack.bigEndianToShort(bArrRsaBlinded, length) ^ i13) & 65535)) >> 31);
            for (int i14 = 0; i14 < 48; i14++) {
                bArr2[i14] = (byte) ((bArr2[i14] & iCheckPkcs1Encoding2) | (bArrRsaBlinded[length + i14] & (~iCheckPkcs1Encoding2)));
            }
            Arrays.fill(bArrRsaBlinded, (byte) 0);
        } catch (Exception unused) {
        }
        return bArr2;
    }

    public static int getInputLimit(RSAKeyParameters rSAKeyParameters) {
        return (rSAKeyParameters.getModulus().bitLength() + 7) / 8;
    }

    private static BigInteger rsa(RSAKeyParameters rSAKeyParameters, BigInteger bigInteger) {
        return bigInteger.modPow(rSAKeyParameters.getExponent(), rSAKeyParameters.getModulus());
    }

    private static byte[] rsaBlinded(RSAKeyParameters rSAKeyParameters, BigInteger bigInteger, SecureRandom secureRandom) {
        RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters;
        BigInteger publicExponent;
        BigInteger modulus = rSAKeyParameters.getModulus();
        int iBitLength = (modulus.bitLength() / 8) + 1;
        if (!(rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) || (publicExponent = (rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) rSAKeyParameters).getPublicExponent()) == null) {
            return toBytes(rsa(rSAKeyParameters, bigInteger), iBitLength);
        }
        BigInteger bigInteger2 = ONE;
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger2, modulus.subtract(bigInteger2), secureRandom);
        BigInteger bigIntegerModPow = bigIntegerCreateRandomInRange.modPow(publicExponent, modulus);
        BigInteger bigIntegerModOddInverse = BigIntegers.modOddInverse(modulus, bigIntegerCreateRandomInRange);
        BigInteger bigIntegerRsaCrt = rsaCrt(rSAPrivateCrtKeyParameters, bigIntegerModPow.multiply(bigInteger).mod(modulus));
        BigInteger bigIntegerMod = bigIntegerModOddInverse.add(bigInteger2).multiply(bigIntegerRsaCrt).mod(modulus);
        byte[] bytes = toBytes(bigIntegerRsaCrt, iBitLength);
        byte[] bytes2 = toBytes(modulus, iBitLength);
        byte[] bytes3 = toBytes(bigIntegerMod, iBitLength);
        caddTo(iBitLength, subFrom(iBitLength, bytes, bytes3), bytes2, bytes3);
        return bytes3;
    }

    private static BigInteger rsaCrt(RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters, BigInteger bigInteger) {
        BigInteger publicExponent = rSAPrivateCrtKeyParameters.getPublicExponent();
        BigInteger p11 = rSAPrivateCrtKeyParameters.getP();
        BigInteger q11 = rSAPrivateCrtKeyParameters.getQ();
        BigInteger dp2 = rSAPrivateCrtKeyParameters.getDP();
        BigInteger dq2 = rSAPrivateCrtKeyParameters.getDQ();
        BigInteger qInv = rSAPrivateCrtKeyParameters.getQInv();
        BigInteger bigIntegerModPow = bigInteger.remainder(p11).modPow(dp2, p11);
        BigInteger bigIntegerModPow2 = bigInteger.remainder(q11).modPow(dq2, q11);
        BigInteger bigIntegerAdd = bigIntegerModPow.subtract(bigIntegerModPow2).multiply(qInv).mod(p11).multiply(q11).add(bigIntegerModPow2);
        if (bigIntegerAdd.modPow(publicExponent, rSAPrivateCrtKeyParameters.getModulus()).equals(bigInteger)) {
            return bigIntegerAdd;
        }
        throw new IllegalStateException("RSA engine faulty decryption/signing detected");
    }

    private static int subFrom(int i11, byte[] bArr, byte[] bArr2) {
        int i12 = 0;
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            int i14 = i12 + ((bArr2[i13] & 255) - (bArr[i13] & 255));
            bArr2[i13] = (byte) i14;
            i12 = i14 >> 8;
        }
        return i12;
    }

    private static byte[] toBytes(BigInteger bigInteger, int i11) {
        byte[] byteArray = bigInteger.toByteArray();
        byte[] bArr = new byte[i11];
        System.arraycopy(byteArray, 0, bArr, i11 - byteArray.length, byteArray.length);
        return bArr;
    }
}
