package org.spongycastle.pqc.crypto.gmss.util;

/* JADX INFO: loaded from: classes10.dex */
public class GMSSUtil {
    public int bytesToIntLittleEndian(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public byte[] concatenateArray(byte[][] bArr) {
        byte[] bArr2 = new byte[bArr.length * bArr[0].length];
        int length = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte[] bArr3 = bArr[i11];
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr[i11].length;
        }
        return bArr2;
    }

    public int getLog(int i11) {
        int i12 = 1;
        int i13 = 2;
        while (i13 < i11) {
            i13 <<= 1;
            i12++;
        }
        return i12;
    }

    public byte[] intToBytesLittleEndian(int i11) {
        return new byte[]{(byte) (i11 & 255), (byte) ((i11 >> 8) & 255), (byte) ((i11 >> 16) & 255), (byte) ((i11 >> 24) & 255)};
    }

    public void printArray(String str, byte[][] bArr) {
        System.out.println(str);
        int i11 = 0;
        for (byte[] bArr2 : bArr) {
            for (int i12 = 0; i12 < bArr[0].length; i12++) {
                System.out.println(i11 + "; " + ((int) bArr2[i12]));
                i11++;
            }
        }
    }

    public boolean testPowerOfTwo(int i11) {
        int i12 = 1;
        while (i12 < i11) {
            i12 <<= 1;
        }
        return i11 == i12;
    }

    public int bytesToIntLittleEndian(byte[] bArr, int i11) {
        int i12 = ((bArr[i11 + 1] & 255) << 8) | (bArr[i11] & 255);
        return ((bArr[i11 + 3] & 255) << 24) | i12 | ((bArr[i11 + 2] & 255) << 16);
    }

    public void printArray(String str, byte[] bArr) {
        System.out.println(str);
        int i11 = 0;
        for (byte b11 : bArr) {
            System.out.println(i11 + "; " + ((int) b11));
            i11++;
        }
    }
}
