package org.bouncycastle.util.encoders;

/* JADX INFO: loaded from: classes10.dex */
public class BufferedEncoder {
    protected byte[] buf;
    protected int bufOff;
    protected Translator translator;

    public BufferedEncoder(Translator translator, int i11) {
        this.translator = translator;
        if (i11 % translator.getEncodedBlockSize() != 0) {
            throw new IllegalArgumentException("buffer size not multiple of input block size");
        }
        this.buf = new byte[i11];
        this.bufOff = 0;
    }

    public int processByte(byte b11, byte[] bArr, int i11) {
        byte[] bArr2 = this.buf;
        int i12 = this.bufOff;
        int i13 = i12 + 1;
        this.bufOff = i13;
        bArr2[i12] = b11;
        if (i13 != bArr2.length) {
            return 0;
        }
        int iEncode = this.translator.encode(bArr2, 0, bArr2.length, bArr, i11);
        this.bufOff = 0;
        return iEncode;
    }

    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        byte[] bArr3;
        if (i12 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        byte[] bArr4 = this.buf;
        int length = bArr4.length;
        int i14 = this.bufOff;
        int i15 = length - i14;
        int iEncode = 0;
        if (i12 > i15) {
            System.arraycopy(bArr, i11, bArr4, i14, i15);
            Translator translator = this.translator;
            byte[] bArr5 = this.buf;
            int iEncode2 = translator.encode(bArr5, 0, bArr5.length, bArr2, i13);
            this.bufOff = 0;
            int i16 = i12 - i15;
            int i17 = i11 + i15;
            int length2 = i16 - (i16 % this.buf.length);
            bArr3 = bArr;
            iEncode = iEncode2 + this.translator.encode(bArr3, i17, length2, bArr2, i13 + iEncode2);
            i12 = i16 - length2;
            i11 = i17 + length2;
        } else {
            bArr3 = bArr;
        }
        if (i12 != 0) {
            System.arraycopy(bArr3, i11, this.buf, this.bufOff, i12);
            this.bufOff += i12;
        }
        return iEncode;
    }
}
