package zo0;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f128473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f128474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f128475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient int f128476d;

    public f(byte[] bArr) {
        this.f128473a = (byte[]) bArr.clone();
        k();
    }

    private static int a(byte[] bArr) {
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    private void b(byte[] bArr, int i11, int i12) {
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException("Offset and length must not be negative");
        }
        if (bArr != null) {
            if (i11 > bArr.length - i12) {
                throw new IllegalArgumentException("Offset plus length exceed array size");
            }
        } else if (i11 != 0 && i12 != 0) {
            throw new IllegalArgumentException("offset and length must be 0 if array is null");
        }
    }

    private void k() {
        byte[] bArr = this.f128473a;
        if (bArr.length < 4) {
            throw new IllegalArgumentException("apdu must be at least 4 bytes long");
        }
        if (bArr.length == 4) {
            return;
        }
        int i11 = bArr[4] & 255;
        if (bArr.length == 5) {
            if (i11 == 0) {
                i11 = 256;
            }
            this.f128475c = i11;
            return;
        }
        if (i11 != 0) {
            if (bArr.length == i11 + 5) {
                this.f128474b = i11;
                this.f128476d = 5;
                return;
            }
            if (bArr.length == i11 + 6) {
                this.f128474b = i11;
                this.f128476d = 5;
                int i12 = bArr[bArr.length - 1] & 255;
                this.f128475c = i12 != 0 ? i12 : 256;
                return;
            }
            throw new IllegalArgumentException("Invalid APDU: length=" + this.f128473a.length + ", b1=" + i11);
        }
        if (bArr.length < 7) {
            throw new IllegalArgumentException("Invalid APDU: length=" + this.f128473a.length + ", b1=" + i11);
        }
        int i13 = ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        if (bArr.length == 7) {
            if (i13 == 0) {
                i13 = 65536;
            }
            this.f128475c = i13;
            return;
        }
        if (i13 == 0) {
            throw new IllegalArgumentException("Invalid APDU: length=" + this.f128473a.length + ", b1=" + i11 + ", b2||b3=" + i13);
        }
        if (bArr.length == i13 + 7) {
            this.f128474b = i13;
            this.f128476d = 7;
            return;
        }
        if (bArr.length == i13 + 9) {
            this.f128474b = i13;
            this.f128476d = 7;
            int length = bArr.length;
            int i14 = (bArr[length - 1] & 255) | ((bArr[length - 2] & 255) << 8);
            this.f128475c = i14 != 0 ? i14 : 65536;
            return;
        }
        throw new IllegalArgumentException("Invalid APDU: length=" + this.f128473a.length + ", b1=" + i11 + ", b2||b3=" + i13);
    }

    private void l(int i11, int i12, int i13, int i14) {
        byte[] bArr = this.f128473a;
        bArr[0] = (byte) i11;
        bArr[1] = (byte) i12;
        bArr[2] = (byte) i13;
        bArr[3] = (byte) i14;
    }

    public byte[] c() {
        return (byte[]) this.f128473a.clone();
    }

    public int d() {
        return this.f128473a[0] & 255;
    }

    public byte[] e() {
        int i11 = this.f128474b;
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f128473a, this.f128476d, bArr, 0, i11);
        return bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return Arrays.equals(this.f128473a, ((f) obj).f128473a);
        }
        return false;
    }

    public int f() {
        return this.f128473a[1] & 255;
    }

    public int g() {
        return this.f128474b;
    }

    public int h() {
        return this.f128475c;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f128473a);
    }

    public int i() {
        return this.f128473a[2] & 255;
    }

    public int j() {
        return this.f128473a[3] & 255;
    }

    public String toString() {
        return "CommmandAPDU: " + this.f128473a.length + " bytes, nc=" + this.f128474b + ", ne=" + this.f128475c;
    }

    public f(int i11, int i12, int i13, int i14, int i15) {
        this(i11, i12, i13, i14, null, 0, 0, i15);
    }

    public f(int i11, int i12, int i13, int i14, byte[] bArr) {
        this(i11, i12, i13, i14, bArr, 0, a(bArr), 0);
    }

    public f(int i11, int i12, int i13, int i14, byte[] bArr, int i15) {
        this(i11, i12, i13, i14, bArr, 0, a(bArr), i15);
    }

    public f(int i11, int i12, int i13, int i14, byte[] bArr, int i15, int i16, int i17) {
        byte b11;
        b(bArr, i15, i16);
        if (i16 > 65535) {
            throw new IllegalArgumentException("dataLength is too large");
        }
        if (i17 < 0) {
            throw new IllegalArgumentException("ne must not be negative");
        }
        if (i17 <= 65536) {
            this.f128475c = i17;
            this.f128474b = i16;
            byte b12 = 0;
            if (i16 == 0) {
                if (i17 == 0) {
                    this.f128473a = new byte[4];
                    l(i11, i12, i13, i14);
                    return;
                }
                if (i17 <= 256) {
                    b12 = i17 != 256 ? (byte) i17 : (byte) 0;
                    this.f128473a = new byte[5];
                    l(i11, i12, i13, i14);
                    this.f128473a[4] = b12;
                    return;
                }
                if (i17 == 65536) {
                    b11 = 0;
                } else {
                    b12 = (byte) (i17 >> 8);
                    b11 = (byte) i17;
                }
                this.f128473a = new byte[7];
                l(i11, i12, i13, i14);
                byte[] bArr2 = this.f128473a;
                bArr2[5] = b12;
                bArr2[6] = b11;
                return;
            }
            if (i17 == 0) {
                if (i16 <= 255) {
                    this.f128473a = new byte[i16 + 5];
                    l(i11, i12, i13, i14);
                    byte[] bArr3 = this.f128473a;
                    bArr3[4] = (byte) i16;
                    this.f128476d = 5;
                    System.arraycopy(bArr, i15, bArr3, 5, i16);
                    return;
                }
                this.f128473a = new byte[i16 + 7];
                l(i11, i12, i13, i14);
                byte[] bArr4 = this.f128473a;
                bArr4[4] = 0;
                bArr4[5] = (byte) (i16 >> 8);
                bArr4[6] = (byte) i16;
                this.f128476d = 7;
                System.arraycopy(bArr, i15, bArr4, 7, i16);
                return;
            }
            if (i16 <= 255 && i17 <= 256) {
                this.f128473a = new byte[i16 + 6];
                l(i11, i12, i13, i14);
                byte[] bArr5 = this.f128473a;
                bArr5[4] = (byte) i16;
                this.f128476d = 5;
                System.arraycopy(bArr, i15, bArr5, 5, i16);
                byte[] bArr6 = this.f128473a;
                bArr6[bArr6.length - 1] = i17 != 256 ? (byte) i17 : (byte) 0;
                return;
            }
            this.f128473a = new byte[i16 + 9];
            l(i11, i12, i13, i14);
            byte[] bArr7 = this.f128473a;
            bArr7[4] = 0;
            bArr7[5] = (byte) (i16 >> 8);
            bArr7[6] = (byte) i16;
            this.f128476d = 7;
            System.arraycopy(bArr, i15, bArr7, 7, i16);
            if (i17 != 65536) {
                byte[] bArr8 = this.f128473a;
                int length = bArr8.length;
                bArr8[length - 2] = (byte) (i17 >> 8);
                bArr8[length - 1] = (byte) i17;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ne is too large");
    }
}
