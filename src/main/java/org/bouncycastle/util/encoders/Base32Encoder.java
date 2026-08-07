package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes10.dex */
public class Base32Encoder implements Encoder {
    private static final byte[] DEAULT_ENCODING_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55};
    private static final byte DEFAULT_PADDING = 61;
    private final byte[] decodingTable;
    private final byte[] encodingTable;
    private final byte padding;

    public Base32Encoder() {
        this.decodingTable = new byte[128];
        this.encodingTable = DEAULT_ENCODING_TABLE;
        this.padding = DEFAULT_PADDING;
        initialiseDecodingTable();
    }

    private int decodeLastBlock(OutputStream outputStream, char c11, char c12, char c13, char c14, char c15, char c16, char c17, char c18) throws IOException {
        char c19 = this.padding;
        if (c18 != c19) {
            byte[] bArr = this.decodingTable;
            byte b11 = bArr[c11];
            byte b12 = bArr[c12];
            byte b13 = bArr[c13];
            byte b14 = bArr[c14];
            byte b15 = bArr[c15];
            byte b16 = bArr[c16];
            byte b17 = bArr[c17];
            byte b18 = bArr[c18];
            if ((b11 | b12 | b13 | b14 | b15 | b16 | b17 | b18) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b11 << 3) | (b12 >> 2));
            outputStream.write((b12 << 6) | (b13 << 1) | (b14 >> 4));
            outputStream.write((b14 << 4) | (b15 >> 1));
            outputStream.write((b15 << 7) | (b16 << 2) | (b17 >> 3));
            outputStream.write((b17 << 5) | b18);
            return 5;
        }
        if (c17 != c19) {
            byte[] bArr2 = this.decodingTable;
            byte b19 = bArr2[c11];
            byte b21 = bArr2[c12];
            byte b22 = bArr2[c13];
            byte b23 = bArr2[c14];
            byte b24 = bArr2[c15];
            byte b25 = bArr2[c16];
            byte b26 = bArr2[c17];
            if ((b19 | b21 | b22 | b23 | b24 | b25 | b26) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b19 << 3) | (b21 >> 2));
            outputStream.write((b21 << 6) | (b22 << 1) | (b23 >> 4));
            outputStream.write((b23 << 4) | (b24 >> 1));
            outputStream.write((b24 << 7) | (b25 << 2) | (b26 >> 3));
            return 4;
        }
        if (c16 != c19) {
            throw new IOException("invalid characters encountered at end of base32 data");
        }
        if (c15 != c19) {
            byte[] bArr3 = this.decodingTable;
            byte b27 = bArr3[c11];
            byte b28 = bArr3[c12];
            byte b29 = bArr3[c13];
            byte b31 = bArr3[c14];
            byte b32 = bArr3[c15];
            if ((b27 | b28 | b29 | b31 | b32) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b27 << 3) | (b28 >> 2));
            outputStream.write((b28 << 6) | (b29 << 1) | (b31 >> 4));
            outputStream.write((b31 << 4) | (b32 >> 1));
            return 3;
        }
        if (c14 == c19) {
            if (c13 != c19) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            byte[] bArr4 = this.decodingTable;
            byte b33 = bArr4[c11];
            byte b34 = bArr4[c12];
            if ((b33 | b34) < 0) {
                throw new IOException("invalid characters encountered at end of base32 data");
            }
            outputStream.write((b33 << 3) | (b34 >> 2));
            return 1;
        }
        byte[] bArr5 = this.decodingTable;
        byte b35 = bArr5[c11];
        byte b36 = bArr5[c12];
        byte b37 = bArr5[c13];
        byte b38 = bArr5[c14];
        if ((b35 | b36 | b37 | b38) < 0) {
            throw new IOException("invalid characters encountered at end of base32 data");
        }
        outputStream.write((b35 << 3) | (b36 >> 2));
        outputStream.write((b36 << 6) | (b37 << 1) | (b38 >> 4));
        return 2;
    }

    private void encodeBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        byte b11 = bArr[i11];
        int i13 = bArr[i11 + 1] & 255;
        int i14 = bArr[i11 + 2] & 255;
        int i15 = bArr[i11 + 3] & 255;
        byte b12 = bArr[i11 + 4];
        byte[] bArr3 = this.encodingTable;
        bArr2[i12] = bArr3[(b11 >>> 3) & 31];
        bArr2[i12 + 1] = bArr3[((b11 << 2) | (i13 >>> 6)) & 31];
        bArr2[i12 + 2] = bArr3[(i13 >>> 1) & 31];
        bArr2[i12 + 3] = bArr3[((i13 << 4) | (i14 >>> 4)) & 31];
        bArr2[i12 + 4] = bArr3[((i14 << 1) | (i15 >>> 7)) & 31];
        bArr2[i12 + 5] = bArr3[(i15 >>> 2) & 31];
        bArr2[i12 + 6] = bArr3[(((b12 & 255) >>> 5) | (i15 << 3)) & 31];
        bArr2[i12 + 7] = bArr3[b12 & 31];
    }

    private boolean ignore(char c11) {
        return c11 == '\n' || c11 == '\r' || c11 == '\t' || c11 == ' ';
    }

    private int nextI(byte[] bArr, int i11, int i12) {
        while (i11 < i12 && ignore((char) bArr[i11])) {
            i11++;
        }
        return i11;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(String str, OutputStream outputStream) {
        byte[] byteArray = Strings.toByteArray(str);
        return decode(byteArray, 0, byteArray.length, outputStream);
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int encode(byte[] bArr, int i11, int i12, OutputStream outputStream) throws IOException {
        if (i12 < 0) {
            return 0;
        }
        byte[] bArr2 = new byte[72];
        int i13 = i11;
        int i14 = i12;
        while (i14 > 0) {
            int iMin = Math.min(45, i14);
            byte[] bArr3 = bArr;
            outputStream.write(bArr2, 0, encode(bArr3, i13, iMin, bArr2, 0));
            i13 += iMin;
            i14 -= iMin;
            bArr = bArr3;
        }
        return ((i12 + 2) / 3) * 4;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getEncodedLength(int i11) {
        return ((i11 + 4) / 5) * 8;
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int getMaxDecodedLength(int i11) {
        return (i11 / 8) * 5;
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
                return;
            }
            this.decodingTable[bArr2[i11]] = (byte) i11;
            i11++;
        }
    }

    public Base32Encoder(byte[] bArr, byte b11) {
        this.decodingTable = new byte[128];
        if (bArr.length != 32) {
            throw new IllegalArgumentException("encoding table needs to be length 32");
        }
        this.encodingTable = Arrays.clone(bArr);
        this.padding = b11;
        initialiseDecodingTable();
    }

    @Override // org.bouncycastle.util.encoders.Encoder
    public int decode(byte[] bArr, int i11, int i12, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[55];
        int i13 = i11 + i12;
        while (i13 > i11 && ignore((char) bArr[i13 - 1])) {
            i13--;
        }
        if (i13 == 0) {
            return 0;
        }
        int i14 = i13;
        int i15 = 0;
        while (i14 > i11 && i15 != 8) {
            if (!ignore((char) bArr[i14 - 1])) {
                i15++;
            }
            i14--;
        }
        int iNextI = nextI(bArr, i11, i14);
        int i16 = 0;
        int i17 = 0;
        while (iNextI < i14) {
            int i18 = iNextI + 1;
            byte b11 = this.decodingTable[bArr[iNextI]];
            int iNextI2 = nextI(bArr, i18, i14);
            int i19 = iNextI2 + 1;
            byte b12 = this.decodingTable[bArr[iNextI2]];
            int iNextI3 = nextI(bArr, i19, i14);
            int i21 = iNextI3 + 1;
            byte b13 = this.decodingTable[bArr[iNextI3]];
            int iNextI4 = nextI(bArr, i21, i14);
            int i22 = iNextI4 + 1;
            byte b14 = this.decodingTable[bArr[iNextI4]];
            int iNextI5 = nextI(bArr, i22, i14);
            int i23 = iNextI5 + 1;
            byte b15 = this.decodingTable[bArr[iNextI5]];
            int iNextI6 = nextI(bArr, i23, i14);
            int i24 = iNextI6 + 1;
            byte b16 = this.decodingTable[bArr[iNextI6]];
            int iNextI7 = nextI(bArr, i24, i14);
            int i25 = iNextI7 + 1;
            byte b17 = this.decodingTable[bArr[iNextI7]];
            int iNextI8 = nextI(bArr, i25, i14);
            int i26 = iNextI8 + 1;
            byte b18 = this.decodingTable[bArr[iNextI8]];
            if ((b11 | b12 | b13 | b14 | b15 | b16 | b17 | b18) < 0) {
                throw new IOException("invalid characters encountered in base32 data");
            }
            bArr2[i16] = (byte) ((b11 << 3) | (b12 >> 2));
            bArr2[i16 + 1] = (byte) ((b12 << 6) | (b13 << 1) | (b14 >> 4));
            bArr2[i16 + 2] = (byte) ((b14 << 4) | (b15 >> 1));
            int i27 = i16 + 4;
            bArr2[i16 + 3] = (byte) ((b16 << 2) | (b15 << 7) | (b17 >> 3));
            i16 += 5;
            bArr2[i27] = (byte) ((b17 << 5) | b18);
            if (i16 == 55) {
                outputStream.write(bArr2);
                i16 = 0;
            }
            i17 += 5;
            iNextI = nextI(bArr, i26, i14);
        }
        if (i16 > 0) {
            outputStream.write(bArr2, 0, i16);
        }
        int iNextI9 = nextI(bArr, iNextI, i13);
        int iNextI10 = nextI(bArr, iNextI9 + 1, i13);
        int iNextI11 = nextI(bArr, iNextI10 + 1, i13);
        int iNextI12 = nextI(bArr, iNextI11 + 1, i13);
        int iNextI13 = nextI(bArr, iNextI12 + 1, i13);
        int iNextI14 = nextI(bArr, iNextI13 + 1, i13);
        int iNextI15 = nextI(bArr, iNextI14 + 1, i13);
        return i17 + decodeLastBlock(outputStream, (char) bArr[iNextI9], (char) bArr[iNextI10], (char) bArr[iNextI11], (char) bArr[iNextI12], (char) bArr[iNextI13], (char) bArr[iNextI14], (char) bArr[iNextI15], (char) bArr[nextI(bArr, iNextI15 + 1, i13)]);
    }

    public int encode(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int i14 = (i11 + i12) - 4;
        int i15 = i11;
        int i16 = i13;
        while (i15 < i14) {
            encodeBlock(bArr, i15, bArr2, i16);
            i15 += 5;
            i16 += 8;
        }
        int i17 = i12 - (i15 - i11);
        if (i17 > 0) {
            byte[] bArr3 = new byte[5];
            System.arraycopy(bArr, i15, bArr3, 0, i17);
            encodeBlock(bArr3, 0, bArr2, i16);
            if (i17 == 1) {
                byte b11 = this.padding;
                bArr2[i16 + 2] = b11;
                bArr2[i16 + 3] = b11;
                bArr2[i16 + 4] = b11;
                bArr2[i16 + 5] = b11;
                bArr2[i16 + 6] = b11;
                bArr2[i16 + 7] = b11;
            } else if (i17 == 2) {
                byte b12 = this.padding;
                bArr2[i16 + 4] = b12;
                bArr2[i16 + 5] = b12;
                bArr2[i16 + 6] = b12;
                bArr2[i16 + 7] = b12;
            } else if (i17 == 3) {
                byte b13 = this.padding;
                bArr2[i16 + 5] = b13;
                bArr2[i16 + 6] = b13;
                bArr2[i16 + 7] = b13;
            } else if (i17 == 4) {
                bArr2[i16 + 7] = this.padding;
            }
            i16 += 8;
        }
        return i16 - i13;
    }
}
