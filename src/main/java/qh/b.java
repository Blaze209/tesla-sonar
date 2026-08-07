package qh;

import android.annotation.SuppressLint;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ boolean f105494a = true;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f105495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f105496b;
    }

    /* JADX INFO: renamed from: qh.b$b, reason: collision with other inner class name */
    public static class C2238b extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int[] f105497f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int[] f105498g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f105499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f105500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f105501e;

        public C2238b(int i11, byte[] bArr) {
            this.f105495a = bArr;
            this.f105501e = (i11 & 8) == 0 ? f105497f : f105498g;
            this.f105499c = 0;
            this.f105500d = 0;
        }

        /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
        public boolean a(byte[] bArr, int i11, int i12, boolean z11) {
            int i13 = this.f105499c;
            if (i13 == 6) {
                return false;
            }
            int i14 = i12 + i11;
            int i15 = this.f105500d;
            byte[] bArr2 = this.f105495a;
            int[] iArr = this.f105501e;
            int i16 = 0;
            int i17 = i15;
            int i18 = i13;
            int i19 = i11;
            while (i19 < i14) {
                if (i18 == 0) {
                    while (true) {
                        int i21 = i19 + 4;
                        if (i21 > i14 || (i17 = (iArr[bArr[i19] & 255] << 18) | (iArr[bArr[i19 + 1] & 255] << 12) | (iArr[bArr[i19 + 2] & 255] << 6) | iArr[bArr[i19 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i16 + 2] = (byte) i17;
                        bArr2[i16 + 1] = (byte) (i17 >> 8);
                        bArr2[i16] = (byte) (i17 >> 16);
                        i16 += 3;
                        i19 = i21;
                    }
                    if (i19 >= i14) {
                        break;
                    }
                }
                int i22 = i19 + 1;
                int i23 = iArr[bArr[i19] & 255];
                if (i18 != 0) {
                    if (i18 != 1) {
                        if (i18 != 2) {
                            if (i18 != 3) {
                                if (i18 != 4) {
                                    if (i18 == 5 && i23 != -1) {
                                        this.f105499c = 6;
                                        return false;
                                    }
                                } else if (i23 == -2) {
                                    i18++;
                                } else if (i23 != -1) {
                                    this.f105499c = 6;
                                    return false;
                                }
                            } else if (i23 >= 0) {
                                i17 = (i17 << 6) | i23;
                                bArr2[i16 + 2] = (byte) i17;
                                bArr2[i16 + 1] = (byte) (i17 >> 8);
                                bArr2[i16] = (byte) (i17 >> 16);
                                i16 += 3;
                                i18 = 0;
                            } else if (i23 == -2) {
                                bArr2[i16 + 1] = (byte) (i17 >> 2);
                                bArr2[i16] = (byte) (i17 >> 10);
                                i16 += 2;
                                i18 = 5;
                            } else if (i23 != -1) {
                                this.f105499c = 6;
                                return false;
                            }
                        } else if (i23 >= 0) {
                            i17 = (i17 << 6) | i23;
                            i18++;
                        } else if (i23 == -2) {
                            bArr2[i16] = (byte) (i17 >> 4);
                            i16++;
                            i18 = 4;
                        } else if (i23 != -1) {
                            this.f105499c = 6;
                            return false;
                        }
                    } else if (i23 >= 0) {
                        i17 = (i17 << 6) | i23;
                        i18++;
                    } else if (i23 != -1) {
                        this.f105499c = 6;
                        return false;
                    }
                } else if (i23 >= 0) {
                    i18++;
                    i17 = i23;
                } else if (i23 != -1) {
                    this.f105499c = 6;
                    return false;
                }
                i19 = i22;
            }
            if (!z11) {
                this.f105499c = i18;
                this.f105500d = i17;
                this.f105496b = i16;
                return true;
            }
            if (i18 == 1) {
                this.f105499c = 6;
                return false;
            }
            if (i18 == 2) {
                bArr2[i16] = (byte) (i17 >> 4);
                i16++;
            } else if (i18 == 3) {
                int i24 = i16 + 1;
                bArr2[i16] = (byte) (i17 >> 10);
                i16 += 2;
                bArr2[i24] = (byte) (i17 >> 2);
            } else if (i18 == 4) {
                this.f105499c = 6;
                return false;
            }
            this.f105499c = i18;
            this.f105496b = i16;
            return true;
        }
    }

    public static class c extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final byte[] f105502j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final byte[] f105503k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ boolean f105504l = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f105505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f105506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f105507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f105508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f105509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f105510h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final byte[] f105511i;

        public c(int i11, byte[] bArr) {
            this.f105495a = bArr;
            this.f105508f = (i11 & 1) == 0;
            boolean z11 = (i11 & 2) == 0;
            this.f105509g = z11;
            this.f105510h = (i11 & 4) != 0;
            this.f105511i = (i11 & 8) == 0 ? f105502j : f105503k;
            this.f105505c = new byte[2];
            this.f105506d = 0;
            this.f105507e = z11 ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        public boolean a(byte[] bArr, int i11, int i12, boolean z11) {
            int i13;
            int i14;
            int i15;
            int i16;
            byte b11;
            int i17;
            byte b12;
            byte b13;
            int i18;
            int i19;
            byte[] bArr2 = this.f105511i;
            byte[] bArr3 = this.f105495a;
            int i21 = this.f105507e;
            int i22 = i12 + i11;
            int i23 = this.f105506d;
            char c11 = 2;
            int i24 = 0;
            if (i23 != 1) {
                if (i23 == 2 && (i19 = i11 + 1) <= i22) {
                    byte[] bArr4 = this.f105505c;
                    i14 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i11] & 255);
                    this.f105506d = 0;
                    i13 = i19;
                } else {
                    i13 = i11;
                    i14 = -1;
                }
            } else if (i11 + 2 <= i22) {
                i13 = i11 + 2;
                i14 = (bArr[i11 + 1] & 255) | ((this.f105505c[0] & 255) << 16) | ((bArr[i11] & 255) << 8);
                this.f105506d = 0;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (i14 != -1) {
                bArr3[0] = bArr2[(i14 >> 18) & 63];
                bArr3[1] = bArr2[(i14 >> 12) & 63];
                bArr3[2] = bArr2[(i14 >> 6) & 63];
                bArr3[3] = bArr2[i14 & 63];
                i21--;
                if (i21 == 0) {
                    if (this.f105510h) {
                        bArr3[4] = 13;
                        i18 = 5;
                    } else {
                        i18 = 4;
                    }
                    i15 = i18 + 1;
                    bArr3[i18] = 10;
                    i21 = 19;
                } else {
                    i15 = 4;
                }
            } else {
                i15 = 0;
            }
            while (true) {
                i13 += 3;
                if (i13 > i22) {
                    break;
                }
                c11 = c11;
                int i25 = ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16) | (bArr[i13 + 2] & 255);
                bArr3[i15] = bArr2[(i25 >> 18) & 63];
                bArr3[i15 + 1] = bArr2[(i25 >> 12) & 63];
                bArr3[i15 + 2] = bArr2[(i25 >> 6) & 63];
                bArr3[i15 + 3] = bArr2[i25 & 63];
                int i26 = i15 + 4;
                i21--;
                if (i21 == 0) {
                    if (this.f105510h) {
                        bArr3[i26] = 13;
                        i26 = i15 + 5;
                    }
                    i15 = i26 + 1;
                    bArr3[i26] = 10;
                    i21 = 19;
                } else {
                    i15 = i26;
                }
            }
            if (z11) {
                int i27 = this.f105506d;
                int i28 = i13 - i27;
                if (i28 == i22 - 1) {
                    if (i27 > 0) {
                        b13 = this.f105505c[0];
                        i24 = 1;
                    } else {
                        byte b14 = bArr[i13];
                        i13++;
                        b13 = b14;
                    }
                    int i29 = (b13 & 255) << 4;
                    this.f105506d = i27 - i24;
                    bArr3[i15] = bArr2[(i29 >> 6) & 63];
                    int i31 = i15 + 2;
                    bArr3[i15 + 1] = bArr2[i29 & 63];
                    if (this.f105508f) {
                        bArr3[i31] = 61;
                        i31 = i15 + 4;
                        bArr3[i15 + 3] = 61;
                    }
                    if (this.f105509g) {
                        if (this.f105510h) {
                            bArr3[i31] = 13;
                            i31++;
                        }
                        i16 = i31 + 1;
                        bArr3[i31] = 10;
                        i15 = i16;
                    } else {
                        i15 = i31;
                    }
                } else if (i28 == i22 - 2) {
                    if (i27 > 1) {
                        b11 = this.f105505c[0];
                        i24 = 1;
                    } else {
                        byte b15 = bArr[i13];
                        i13++;
                        b11 = b15;
                    }
                    int i32 = (b11 & 255) << 10;
                    if (i27 > 0) {
                        i17 = i24 + 1;
                        b12 = this.f105505c[i24];
                    } else {
                        i17 = i24;
                        b12 = bArr[i13];
                        i13++;
                    }
                    int i33 = i32 | ((b12 & 255) << 2);
                    this.f105506d = i27 - i17;
                    bArr3[i15] = bArr2[(i33 >> 12) & 63];
                    bArr3[i15 + 1] = bArr2[(i33 >> 6) & 63];
                    int i34 = i15 + 3;
                    bArr3[i15 + 2] = bArr2[i33 & 63];
                    if (this.f105508f) {
                        bArr3[i34] = 61;
                        i34 = i15 + 4;
                    }
                    if (this.f105509g) {
                        if (this.f105510h) {
                            bArr3[i34] = 13;
                            i34++;
                        }
                        i16 = i34 + 1;
                        bArr3[i34] = 10;
                        i15 = i16;
                    } else {
                        i15 = i34;
                    }
                } else if (this.f105509g && i15 > 0 && i21 != 19) {
                    if (this.f105510h) {
                        bArr3[i15] = 13;
                        i15++;
                    }
                    i16 = i15 + 1;
                    bArr3[i15] = 10;
                    i15 = i16;
                }
                boolean z12 = f105504l;
                if (!z12 && this.f105506d != 0) {
                    throw new AssertionError();
                }
                if (!z12 && i13 != i22) {
                    throw new AssertionError();
                }
            } else if (i13 == i22 - 1) {
                byte[] bArr5 = this.f105505c;
                int i35 = this.f105506d;
                this.f105506d = i35 + 1;
                bArr5[i35] = bArr[i13];
            } else if (i13 == i22 - 2) {
                byte[] bArr6 = this.f105505c;
                int i36 = this.f105506d;
                int i37 = i36 + 1;
                this.f105506d = i37;
                bArr6[i36] = bArr[i13];
                this.f105506d = i36 + 2;
                bArr6[i37] = bArr[i13 + 1];
            }
            this.f105496b = i15;
            this.f105507e = i21;
            return true;
        }
    }

    public static byte[] a(byte[] bArr, int i11) {
        return b(bArr, 0, bArr.length, i11);
    }

    public static byte[] b(byte[] bArr, int i11, int i12, int i13) {
        C2238b c2238b = new C2238b(i13, new byte[(i12 * 3) / 4]);
        if (!c2238b.a(bArr, i11, i12, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i14 = c2238b.f105496b;
        byte[] bArr2 = c2238b.f105495a;
        if (i14 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i14];
        System.arraycopy(bArr2, 0, bArr3, 0, i14);
        return bArr3;
    }

    public static byte[] c(byte[] bArr, int i11) {
        return d(bArr, 0, bArr.length, i11);
    }

    @SuppressLint({"Assert"})
    public static byte[] d(byte[] bArr, int i11, int i12, int i13) {
        c cVar = new c(i13, null);
        int i14 = (i12 / 3) * 4;
        if (!cVar.f105508f) {
            int i15 = i12 % 3;
            if (i15 == 1) {
                i14 += 2;
            } else if (i15 == 2) {
                i14 += 3;
            }
        } else if (i12 % 3 > 0) {
            i14 += 4;
        }
        if (cVar.f105509g && i12 > 0) {
            i14 += (((i12 - 1) / 57) + 1) * (cVar.f105510h ? 2 : 1);
        }
        cVar.f105495a = new byte[i14];
        cVar.a(bArr, i11, i12, true);
        if (f105494a || cVar.f105496b == i14) {
            return cVar.f105495a;
        }
        throw new AssertionError();
    }

    public static String e(byte[] bArr, int i11) {
        try {
            return new String(c(bArr, i11), "US-ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }
}
