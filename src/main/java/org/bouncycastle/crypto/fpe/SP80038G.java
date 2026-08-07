package org.bouncycastle.crypto.fpe;

import java.math.BigInteger;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.util.RadixConverter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes9.dex */
class SP80038G {
    protected static final int BLOCK_SIZE = 16;
    static final String FF1_DISABLED = "org.bouncycastle.fpe.disable_ff1";
    static final String FPE_DISABLED = "org.bouncycastle.fpe.disable";
    protected static final double LOG2 = Math.log(2.0d);
    protected static final double TWO_TO_96 = Math.pow(2.0d, 96.0d);

    SP80038G() {
    }

    protected static int calculateB_FF1(int i11, int i12) {
        int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i11);
        int iBitLength = iNumberOfTrailingZeros * i12;
        int i13 = i11 >>> iNumberOfTrailingZeros;
        if (i13 != 1) {
            iBitLength += BigInteger.valueOf(i13).pow(i12).bitLength();
        }
        return (iBitLength + 7) / 8;
    }

    protected static BigInteger[] calculateModUV(BigInteger bigInteger, int i11, int i12) {
        BigInteger bigIntegerPow = bigInteger.pow(i11);
        BigInteger[] bigIntegerArr = {bigIntegerPow, bigIntegerPow};
        if (i12 != i11) {
            bigIntegerArr[1] = bigIntegerPow.multiply(bigInteger);
        }
        return bigIntegerArr;
    }

    protected static byte[] calculateP_FF1(int i11, byte b11, int i12, int i13) {
        byte[] bArr = {1, 2, 1, 0, (byte) (i11 >> 8), (byte) i11, 10, b11, 0, 0, 0, 0, 0, 0, 0, 0};
        Pack.intToBigEndian(i12, bArr, 8);
        Pack.intToBigEndian(i13, bArr, 12);
        return bArr;
    }

    protected static byte[] calculateTweak64_FF3_1(byte[] bArr) {
        byte b11 = bArr[0];
        byte b12 = bArr[1];
        byte b13 = bArr[2];
        byte b14 = bArr[3];
        return new byte[]{b11, b12, b13, (byte) (b14 & 240), bArr[4], bArr[5], bArr[6], (byte) (b14 << 4)};
    }

    protected static BigInteger calculateY_FF1(BlockCipher blockCipher, byte[] bArr, int i11, int i12, int i13, byte[] bArr2, short[] sArr, RadixConverter radixConverter) {
        int length = bArr.length;
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(radixConverter.fromEncoding(sArr));
        int i14 = ((-(length + i11 + 1)) & 15) + length;
        int i15 = i14 + 1 + i11;
        byte[] bArr3 = new byte[i15];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        bArr3[i14] = (byte) i13;
        System.arraycopy(bArrAsUnsignedByteArray, 0, bArr3, i15 - bArrAsUnsignedByteArray.length, bArrAsUnsignedByteArray.length);
        byte[] bArrPrf = prf(blockCipher, Arrays.concatenate(bArr2, bArr3));
        if (i12 > 16) {
            int i16 = (i12 + 15) / 16;
            byte[] bArr4 = new byte[i16 * 16];
            int iBigEndianToInt = Pack.bigEndianToInt(bArrPrf, 12);
            System.arraycopy(bArrPrf, 0, bArr4, 0, 16);
            for (int i17 = 1; i17 < i16; i17++) {
                int i18 = i17 * 16;
                System.arraycopy(bArrPrf, 0, bArr4, i18, 12);
                Pack.intToBigEndian(iBigEndianToInt ^ i17, bArr4, i18 + 12);
                blockCipher.processBlock(bArr4, i18, bArr4, i18);
            }
            bArrPrf = bArr4;
        }
        return num(bArrPrf, 0, i12);
    }

    protected static BigInteger calculateY_FF3(BlockCipher blockCipher, byte[] bArr, int i11, int i12, short[] sArr, RadixConverter radixConverter) {
        byte[] bArr2 = new byte[16];
        Pack.intToBigEndian(Pack.bigEndianToInt(bArr, i11) ^ i12, bArr2, 0);
        BigIntegers.asUnsignedByteArray(radixConverter.fromEncoding(sArr), bArr2, 4, 12);
        Arrays.reverseInPlace(bArr2);
        blockCipher.processBlock(bArr2, 0, bArr2, 0);
        Arrays.reverseInPlace(bArr2);
        return num(bArr2, 0, 16);
    }

    protected static void checkArgs(BlockCipher blockCipher, boolean z11, int i11, byte[] bArr, int i12, int i13) {
        checkCipher(blockCipher);
        if (i11 < 2 || i11 > 256) {
            throw new IllegalArgumentException();
        }
        checkData(z11, i11, bArr, i12, i13);
    }

    protected static void checkCipher(BlockCipher blockCipher) {
        if (16 != blockCipher.getBlockSize()) {
            throw new IllegalArgumentException();
        }
    }

    protected static void checkData(boolean z11, int i11, byte[] bArr, int i12, int i13) {
        checkLength(z11, i11, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            if ((bArr[i12 + i14] & 255) >= i11) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }

    private static void checkLength(boolean z11, int i11, int i12) {
        int iFloor;
        if (i12 >= 2) {
            double d11 = i11;
            if (Math.pow(d11, i12) >= 1000000.0d) {
                if (z11 || i12 <= (iFloor = ((int) Math.floor(Math.log(TWO_TO_96) / Math.log(d11))) * 2)) {
                    return;
                }
                throw new IllegalArgumentException("maximum input length is " + iFloor);
            }
        }
        throw new IllegalArgumentException("input too short");
    }

    static short[] decFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i11, int i12, int i13, short[] sArr, short[] sArr2) {
        int radix = radixConverter.getRadix();
        int length = bArr.length;
        int iCalculateB_FF1 = calculateB_FF1(radix, i13);
        int i14 = (iCalculateB_FF1 + 7) & (-4);
        byte[] bArrCalculateP_FF1 = calculateP_FF1(radix, (byte) i12, i11, length);
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radix), i12, i13);
        int i15 = 9;
        short[] sArr3 = sArr2;
        int i16 = i12;
        short[] sArr4 = sArr;
        while (i15 >= 0) {
            int i17 = iCalculateB_FF1;
            byte[] bArr2 = bArrCalculateP_FF1;
            int i18 = i15;
            i16 = i11 - i16;
            radixConverter.toEncoding(radixConverter.fromEncoding(sArr3).subtract(calculateY_FF1(blockCipher, bArr, i17, i14, i18, bArr2, sArr4, radixConverter)).mod(bigIntegerArrCalculateModUV[i18 & 1]), i16, sArr3);
            i15 = i18 - 1;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            bArrCalculateP_FF1 = bArr2;
            iCalculateB_FF1 = i17;
        }
        return Arrays.concatenate(sArr4, sArr3);
    }

    private static short[] decFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i11, int i12, int i13, short[] sArr, short[] sArr2) {
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radixConverter.getRadix()), i12, i13);
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr2);
        short[] sArr3 = sArr;
        short[] sArr4 = sArr2;
        int i14 = 7;
        while (i14 >= 0) {
            i13 = i11 - i13;
            int i15 = i14 & 1;
            BlockCipher blockCipher2 = blockCipher;
            RadixConverter radixConverter2 = radixConverter;
            radixConverter2.toEncoding(radixConverter2.fromEncoding(sArr4).subtract(calculateY_FF3(blockCipher2, bArr, 4 - (i15 * 4), i14, sArr3, radixConverter2)).mod(bigIntegerArrCalculateModUV[1 - i15]), i13, sArr4);
            i14--;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            blockCipher = blockCipher2;
            radixConverter = radixConverter2;
        }
        Arrays.reverseInPlace(sArr3);
        Arrays.reverseInPlace(sArr4);
        return Arrays.concatenate(sArr3, sArr4);
    }

    static byte[] decryptFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i11, int i12) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), bArr2, i11, i12);
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        return toByte(decFF1(blockCipher, radixConverter, bArr, i12, i13, i14, toShort(bArr2, i11, i13), toShort(bArr2, i11 + i13, i14)));
    }

    static short[] decryptFF1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i11, int i12) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), sArr, i11, i12);
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        short[] sArr2 = new short[i13];
        short[] sArr3 = new short[i14];
        System.arraycopy(sArr, i11, sArr2, 0, i13);
        System.arraycopy(sArr, i11 + i13, sArr3, 0, i14);
        return decFF1(blockCipher, radixConverter, bArr, i12, i13, i14, sArr2, sArr3);
    }

    static byte[] decryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i11, int i12) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i11, i12);
        if (bArr.length == 8) {
            return implDecryptFF3(blockCipher, radixConverter, bArr, bArr2, i11, i12);
        }
        throw new IllegalArgumentException();
    }

    static byte[] decryptFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i11, int i12) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i11, i12);
        if (bArr.length == 7) {
            return implDecryptFF3(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), bArr2, i11, i12);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    static short[] decryptFF3_1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i11, int i12) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i11, i12);
        if (bArr.length == 7) {
            return implDecryptFF3w(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), sArr, i11, i12);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    private static short[] encFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i11, int i12, int i13, short[] sArr, short[] sArr2) {
        int radix = radixConverter.getRadix();
        int length = bArr.length;
        int iCalculateB_FF1 = calculateB_FF1(radix, i13);
        int i14 = (iCalculateB_FF1 + 7) & (-4);
        byte[] bArrCalculateP_FF1 = calculateP_FF1(radix, (byte) i12, i11, length);
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radix), i12, i13);
        int i15 = 0;
        short[] sArr3 = sArr;
        int i16 = i13;
        short[] sArr4 = sArr2;
        while (i15 < 10) {
            int i17 = iCalculateB_FF1;
            byte[] bArr2 = bArrCalculateP_FF1;
            int i18 = i15;
            i16 = i11 - i16;
            radixConverter.toEncoding(radixConverter.fromEncoding(sArr3).add(calculateY_FF1(blockCipher, bArr, i17, i14, i18, bArr2, sArr4, radixConverter)).mod(bigIntegerArrCalculateModUV[i18 & 1]), i16, sArr3);
            i15 = i18 + 1;
            short[] sArr5 = sArr3;
            sArr3 = sArr4;
            sArr4 = sArr5;
            bArrCalculateP_FF1 = bArr2;
            iCalculateB_FF1 = i17;
        }
        return Arrays.concatenate(sArr3, sArr4);
    }

    private static short[] encFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, int i11, int i12, int i13, short[] sArr, short[] sArr2) {
        BigInteger[] bigIntegerArrCalculateModUV = calculateModUV(BigInteger.valueOf(radixConverter.getRadix()), i12, i13);
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr2);
        short[] sArr3 = sArr2;
        int i14 = 0;
        while (i14 < 8) {
            i12 = i11 - i12;
            int i15 = i14 & 1;
            BlockCipher blockCipher2 = blockCipher;
            RadixConverter radixConverter2 = radixConverter;
            radixConverter2.toEncoding(radixConverter2.fromEncoding(sArr).add(calculateY_FF3(blockCipher2, bArr, 4 - (i15 * 4), i14, sArr3, radixConverter2)).mod(bigIntegerArrCalculateModUV[1 - i15]), i12, sArr);
            i14++;
            short[] sArr4 = sArr3;
            sArr3 = sArr;
            sArr = sArr4;
            blockCipher = blockCipher2;
            radixConverter = radixConverter2;
        }
        Arrays.reverseInPlace(sArr);
        Arrays.reverseInPlace(sArr3);
        return Arrays.concatenate(sArr, sArr3);
    }

    static byte[] encryptFF1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i11, int i12) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), bArr2, i11, i12);
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        return toByte(encFF1(blockCipher, radixConverter, bArr, i12, i13, i14, toShort(bArr2, i11, i13), toShort(bArr2, i11 + i13, i14)));
    }

    static short[] encryptFF1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i11, int i12) {
        checkArgs(blockCipher, true, radixConverter.getRadix(), sArr, i11, i12);
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        short[] sArr2 = new short[i13];
        short[] sArr3 = new short[i14];
        System.arraycopy(sArr, i11, sArr2, 0, i13);
        System.arraycopy(sArr, i11 + i13, sArr3, 0, i14);
        return encFF1(blockCipher, radixConverter, bArr, i12, i13, i14, sArr2, sArr3);
    }

    static byte[] encryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i11, int i12) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i11, i12);
        if (bArr.length == 8) {
            return implEncryptFF3(blockCipher, radixConverter, bArr, bArr2, i11, i12);
        }
        throw new IllegalArgumentException();
    }

    static byte[] encryptFF3_1(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i11, int i12) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), bArr2, i11, i12);
        if (bArr.length == 7) {
            return encryptFF3(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), bArr2, i11, i12);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    static short[] encryptFF3_1w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i11, int i12) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i11, i12);
        if (bArr.length == 7) {
            return encryptFF3w(blockCipher, radixConverter, calculateTweak64_FF3_1(bArr), sArr, i11, i12);
        }
        throw new IllegalArgumentException("tweak should be 56 bits");
    }

    static short[] encryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i11, int i12) {
        checkArgs(blockCipher, false, radixConverter.getRadix(), sArr, i11, i12);
        if (bArr.length == 8) {
            return implEncryptFF3w(blockCipher, radixConverter, bArr, sArr, i11, i12);
        }
        throw new IllegalArgumentException();
    }

    protected static byte[] implDecryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i11, int i12) {
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        return toByte(decFF3_1(blockCipher, radixConverter, bArr, i12, i13, i14, toShort(bArr2, i11, i14), toShort(bArr2, i11 + i14, i13)));
    }

    protected static short[] implDecryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i11, int i12) {
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        short[] sArr2 = new short[i14];
        short[] sArr3 = new short[i13];
        System.arraycopy(sArr, i11, sArr2, 0, i14);
        System.arraycopy(sArr, i11 + i14, sArr3, 0, i13);
        return decFF3_1(blockCipher, radixConverter, bArr, i12, i13, i14, sArr2, sArr3);
    }

    protected static byte[] implEncryptFF3(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, byte[] bArr2, int i11, int i12) {
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        return toByte(encFF3_1(blockCipher, radixConverter, bArr, i12, i13, i14, toShort(bArr2, i11, i14), toShort(bArr2, i11 + i14, i13)));
    }

    protected static short[] implEncryptFF3w(BlockCipher blockCipher, RadixConverter radixConverter, byte[] bArr, short[] sArr, int i11, int i12) {
        int i13 = i12 / 2;
        int i14 = i12 - i13;
        short[] sArr2 = new short[i14];
        short[] sArr3 = new short[i13];
        System.arraycopy(sArr, i11, sArr2, 0, i14);
        System.arraycopy(sArr, i11 + i14, sArr3, 0, i13);
        return encFF3_1(blockCipher, radixConverter, bArr, i12, i13, i14, sArr2, sArr3);
    }

    protected static BigInteger num(byte[] bArr, int i11, int i12) {
        return new BigInteger(1, Arrays.copyOfRange(bArr, i11, i12 + i11));
    }

    protected static byte[] prf(BlockCipher blockCipher, byte[] bArr) {
        if (bArr.length % 16 != 0) {
            throw new IllegalArgumentException();
        }
        int length = bArr.length / 16;
        byte[] bArr2 = new byte[16];
        for (int i11 = 0; i11 < length; i11++) {
            Bytes.xorTo(16, bArr, i11 * 16, bArr2, 0);
            blockCipher.processBlock(bArr2, 0, bArr2, 0);
        }
        return bArr2;
    }

    private static byte[] toByte(short[] sArr) {
        int length = sArr.length;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            bArr[i11] = (byte) sArr[i11];
        }
        return bArr;
    }

    private static short[] toShort(byte[] bArr, int i11, int i12) {
        short[] sArr = new short[i12];
        for (int i13 = 0; i13 != i12; i13++) {
            sArr[i13] = (short) (bArr[i11 + i13] & 255);
        }
        return sArr;
    }

    protected static void checkArgs(BlockCipher blockCipher, boolean z11, int i11, short[] sArr, int i12, int i13) {
        checkCipher(blockCipher);
        if (i11 < 2 || i11 > 65536) {
            throw new IllegalArgumentException();
        }
        checkData(z11, i11, sArr, i12, i13);
    }

    protected static void checkData(boolean z11, int i11, short[] sArr, int i12, int i13) {
        checkLength(z11, i11, i13);
        for (int i14 = 0; i14 < i13; i14++) {
            if ((sArr[i12 + i14] & HPKE.aead_EXPORT_ONLY) >= i11) {
                throw new IllegalArgumentException("input data outside of radix");
            }
        }
    }
}
