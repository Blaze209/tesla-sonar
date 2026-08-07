package org.spongycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public class HexEncoder implements Encoder {
    protected final byte[] encodingTable = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    protected final byte[] decodingTable = new byte[128];

    public HexEncoder() {
        initialiseDecodingTable();
    }

    private static boolean ignore(char c11) {
        return c11 == '\n' || c11 == '\r' || c11 == '\t' || c11 == ' ';
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i11, int i12, OutputStream outputStream) throws IOException {
        int i13 = i12 + i11;
        while (i13 > i11 && ignore((char) bArr[i13 - 1])) {
            i13--;
        }
        int i14 = 0;
        while (i11 < i13) {
            while (i11 < i13 && ignore((char) bArr[i11])) {
                i11++;
            }
            int i15 = i11 + 1;
            byte b11 = this.decodingTable[bArr[i11]];
            while (i15 < i13 && ignore((char) bArr[i15])) {
                i15++;
            }
            int i16 = i15 + 1;
            byte b12 = this.decodingTable[bArr[i15]];
            if ((b11 | b12) < 0) {
                throw new IOException("invalid characters encountered in Hex data");
            }
            outputStream.write((b11 << 4) | b12);
            i14++;
            i11 = i16;
        }
        return i14;
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i11, int i12, OutputStream outputStream) throws IOException {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            byte b11 = bArr[i13];
            outputStream.write(this.encodingTable[(b11 & 255) >>> 4]);
            outputStream.write(this.encodingTable[b11 & 15]);
        }
        return i12 * 2;
    }

    protected void initialiseDecodingTable() {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.decodingTable;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        while (true) {
            byte[] bArr2 = this.encodingTable;
            if (i11 >= bArr2.length) {
                byte[] bArr3 = this.decodingTable;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            this.decodingTable[bArr2[i11]] = (byte) i11;
            i11++;
        }
    }

    @Override // org.spongycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && ignore(str.charAt(length - 1))) {
            length--;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            while (i11 < length && ignore(str.charAt(i11))) {
                i11++;
            }
            int i13 = i11 + 1;
            byte b11 = this.decodingTable[str.charAt(i11)];
            while (i13 < length && ignore(str.charAt(i13))) {
                i13++;
            }
            int i14 = i13 + 1;
            byte b12 = this.decodingTable[str.charAt(i13)];
            if ((b11 | b12) >= 0) {
                outputStream.write((b11 << 4) | b12);
                i12++;
                i11 = i14;
            } else {
                throw new IOException("invalid characters encountered in Hex string");
            }
        }
        return i12;
    }
}
