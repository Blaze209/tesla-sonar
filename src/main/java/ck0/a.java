package ck0;

import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes8.dex */
public class a extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final byte[] f19387l = {13, 10};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f19388m = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final byte[] f19389n = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final byte[] f19390o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, Tnaf.POW_2_WIDTH, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f19391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final byte[] f19392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[] f19393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f19394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f19395k;

    public a() {
        this(0);
    }

    public static byte[] p(String str) {
        return new a().d(str);
    }

    public static byte[] q(byte[] bArr, boolean z11) {
        return r(bArr, z11, false);
    }

    public static byte[] r(byte[] bArr, boolean z11, boolean z12) {
        return s(bArr, z11, z12, Integer.MAX_VALUE);
    }

    public static byte[] s(byte[] bArr, boolean z11, boolean z12, int i11) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        a aVar = z11 ? new a(z12) : new a(0, f19387l, z12);
        long jK = aVar.k(bArr);
        if (jK <= i11) {
            return aVar.g(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + jK + ") than the specified maximum size of " + i11);
    }

    public static String t(byte[] bArr) {
        return b.m(q(bArr, false));
    }

    @Override // ck0.b
    void c(byte[] bArr, int i11, int i12, b.a aVar) {
        byte b11;
        if (aVar.f19407f) {
            return;
        }
        if (i12 < 0) {
            aVar.f19407f = true;
        }
        int i13 = 0;
        while (i13 < i12) {
            byte[] bArrH = h(this.f19394j, aVar);
            int i14 = i11 + 1;
            byte b12 = bArr[i11];
            if (b12 == this.f19397b) {
                aVar.f19407f = true;
                break;
            }
            if (b12 >= 0) {
                byte[] bArr2 = f19390o;
                if (b12 < bArr2.length && (b11 = bArr2[b12]) >= 0) {
                    int i15 = (aVar.f19409h + 1) % 4;
                    aVar.f19409h = i15;
                    int i16 = (aVar.f19402a << 6) + b11;
                    aVar.f19402a = i16;
                    if (i15 == 0) {
                        int i17 = aVar.f19405d;
                        int i18 = i17 + 1;
                        aVar.f19405d = i18;
                        bArrH[i17] = (byte) ((i16 >> 16) & 255);
                        int i19 = i17 + 2;
                        aVar.f19405d = i19;
                        bArrH[i18] = (byte) ((i16 >> 8) & 255);
                        aVar.f19405d = i17 + 3;
                        bArrH[i19] = (byte) (i16 & 255);
                    }
                }
            }
            i13++;
            i11 = i14;
        }
        if (!aVar.f19407f || aVar.f19409h == 0) {
            return;
        }
        byte[] bArrH2 = h(this.f19394j, aVar);
        int i21 = aVar.f19409h;
        if (i21 != 1) {
            if (i21 == 2) {
                int i22 = aVar.f19402a >> 4;
                aVar.f19402a = i22;
                int i23 = aVar.f19405d;
                aVar.f19405d = i23 + 1;
                bArrH2[i23] = (byte) (i22 & 255);
                return;
            }
            if (i21 != 3) {
                throw new IllegalStateException("Impossible modulus " + aVar.f19409h);
            }
            int i24 = aVar.f19402a;
            int i25 = i24 >> 2;
            aVar.f19402a = i25;
            int i26 = aVar.f19405d;
            int i27 = i26 + 1;
            aVar.f19405d = i27;
            bArrH2[i26] = (byte) ((i24 >> 10) & 255);
            aVar.f19405d = i26 + 2;
            bArrH2[i27] = (byte) (i25 & 255);
        }
    }

    @Override // ck0.b
    void f(byte[] bArr, int i11, int i12, b.a aVar) {
        if (aVar.f19407f) {
            return;
        }
        if (i12 >= 0) {
            int i13 = 0;
            while (i13 < i12) {
                byte[] bArrH = h(this.f19395k, aVar);
                int i14 = (aVar.f19409h + 1) % 3;
                aVar.f19409h = i14;
                int i15 = i11 + 1;
                int i16 = bArr[i11];
                if (i16 < 0) {
                    i16 += 256;
                }
                int i17 = (aVar.f19402a << 8) + i16;
                aVar.f19402a = i17;
                if (i14 == 0) {
                    int i18 = aVar.f19405d;
                    int i19 = i18 + 1;
                    aVar.f19405d = i19;
                    byte[] bArr2 = this.f19391g;
                    bArrH[i18] = bArr2[(i17 >> 18) & 63];
                    int i21 = i18 + 2;
                    aVar.f19405d = i21;
                    bArrH[i19] = bArr2[(i17 >> 12) & 63];
                    int i22 = i18 + 3;
                    aVar.f19405d = i22;
                    bArrH[i21] = bArr2[(i17 >> 6) & 63];
                    int i23 = i18 + 4;
                    aVar.f19405d = i23;
                    bArrH[i22] = bArr2[i17 & 63];
                    int i24 = aVar.f19408g + 4;
                    aVar.f19408g = i24;
                    int i25 = this.f19400e;
                    if (i25 > 0 && i25 <= i24) {
                        byte[] bArr3 = this.f19393i;
                        System.arraycopy(bArr3, 0, bArrH, i23, bArr3.length);
                        aVar.f19405d += this.f19393i.length;
                        aVar.f19408g = 0;
                    }
                }
                i13++;
                i11 = i15;
            }
            return;
        }
        aVar.f19407f = true;
        if (aVar.f19409h == 0 && this.f19400e == 0) {
            return;
        }
        byte[] bArrH2 = h(this.f19395k, aVar);
        int i26 = aVar.f19405d;
        int i27 = aVar.f19409h;
        if (i27 != 0) {
            if (i27 == 1) {
                int i28 = i26 + 1;
                aVar.f19405d = i28;
                byte[] bArr4 = this.f19391g;
                int i29 = aVar.f19402a;
                bArrH2[i26] = bArr4[(i29 >> 2) & 63];
                int i31 = i26 + 2;
                aVar.f19405d = i31;
                bArrH2[i28] = bArr4[(i29 << 4) & 63];
                if (bArr4 == f19388m) {
                    int i32 = i26 + 3;
                    aVar.f19405d = i32;
                    byte b11 = this.f19397b;
                    bArrH2[i31] = b11;
                    aVar.f19405d = i26 + 4;
                    bArrH2[i32] = b11;
                }
            } else {
                if (i27 != 2) {
                    throw new IllegalStateException("Impossible modulus " + aVar.f19409h);
                }
                int i33 = i26 + 1;
                aVar.f19405d = i33;
                byte[] bArr5 = this.f19391g;
                int i34 = aVar.f19402a;
                bArrH2[i26] = bArr5[(i34 >> 10) & 63];
                int i35 = i26 + 2;
                aVar.f19405d = i35;
                bArrH2[i33] = bArr5[(i34 >> 4) & 63];
                int i36 = i26 + 3;
                aVar.f19405d = i36;
                bArrH2[i35] = bArr5[(i34 << 2) & 63];
                if (bArr5 == f19388m) {
                    aVar.f19405d = i26 + 4;
                    bArrH2[i36] = this.f19397b;
                }
            }
        }
        int i37 = aVar.f19408g;
        int i38 = aVar.f19405d;
        int i39 = i37 + (i38 - i26);
        aVar.f19408g = i39;
        if (this.f19400e <= 0 || i39 <= 0) {
            return;
        }
        byte[] bArr6 = this.f19393i;
        System.arraycopy(bArr6, 0, bArrH2, i38, bArr6.length);
        aVar.f19405d += this.f19393i.length;
    }

    @Override // ck0.b
    protected boolean l(byte b11) {
        if (b11 < 0) {
            return false;
        }
        byte[] bArr = this.f19392h;
        return b11 < bArr.length && bArr[b11] != -1;
    }

    public a(boolean z11) {
        this(76, f19387l, z11);
    }

    public a(int i11) {
        this(i11, f19387l);
    }

    public a(int i11, byte[] bArr) {
        this(i11, bArr, false);
    }

    public a(int i11, byte[] bArr, boolean z11) {
        super(3, 4, i11, bArr == null ? 0 : bArr.length);
        this.f19392h = f19390o;
        if (bArr != null) {
            if (b(bArr)) {
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + b.m(bArr) + "]");
            }
            if (i11 > 0) {
                this.f19395k = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.f19393i = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.f19395k = 4;
                this.f19393i = null;
            }
        } else {
            this.f19395k = 4;
            this.f19393i = null;
        }
        this.f19394j = this.f19395k - 1;
        this.f19391g = z11 ? f19389n : f19388m;
    }
}
