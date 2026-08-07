package io.sentry.vendor;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: io.sentry.vendor.a$a, reason: collision with other inner class name */
    static abstract class AbstractC1709a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f81517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f81518b;

        AbstractC1709a() {
        }
    }

    static class b extends AbstractC1709a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int[] f81519f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int[] f81520g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f81521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f81522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f81523e;

        public b(int i11, byte[] bArr) {
            this.f81517a = bArr;
            this.f81523e = (i11 & 8) == 0 ? f81519f : f81520g;
            this.f81521c = 0;
            this.f81522d = 0;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
        public boolean a(byte[] bArr, int i11, int i12, boolean z11) {
            int i13 = this.f81521c;
            if (i13 == 6) {
                return false;
            }
            int i14 = i12 + i11;
            int i15 = this.f81522d;
            byte[] bArr2 = this.f81517a;
            int[] iArr = this.f81523e;
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
                                        this.f81521c = 6;
                                        return false;
                                    }
                                } else if (i23 == -2) {
                                    i18++;
                                } else if (i23 != -1) {
                                    this.f81521c = 6;
                                    return false;
                                }
                            } else if (i23 >= 0) {
                                int i24 = i23 | (i17 << 6);
                                bArr2[i16 + 2] = (byte) i24;
                                bArr2[i16 + 1] = (byte) (i24 >> 8);
                                bArr2[i16] = (byte) (i24 >> 16);
                                i16 += 3;
                                i17 = i24;
                                i18 = 0;
                            } else if (i23 == -2) {
                                bArr2[i16 + 1] = (byte) (i17 >> 2);
                                bArr2[i16] = (byte) (i17 >> 10);
                                i16 += 2;
                                i18 = 5;
                            } else if (i23 != -1) {
                                this.f81521c = 6;
                                return false;
                            }
                        } else if (i23 >= 0) {
                            i23 |= i17 << 6;
                            i18++;
                            i17 = i23;
                        } else if (i23 == -2) {
                            bArr2[i16] = (byte) (i17 >> 4);
                            i16++;
                            i18 = 4;
                        } else if (i23 != -1) {
                            this.f81521c = 6;
                            return false;
                        }
                    } else if (i23 >= 0) {
                        i23 |= i17 << 6;
                        i18++;
                        i17 = i23;
                    } else if (i23 != -1) {
                        this.f81521c = 6;
                        return false;
                    }
                } else if (i23 >= 0) {
                    i18++;
                    i17 = i23;
                } else if (i23 != -1) {
                    this.f81521c = 6;
                    return false;
                }
                i19 = i22;
            }
            if (!z11) {
                this.f81521c = i18;
                this.f81522d = i17;
                this.f81518b = i16;
                return true;
            }
            if (i18 == 1) {
                this.f81521c = 6;
                return false;
            }
            if (i18 == 2) {
                bArr2[i16] = (byte) (i17 >> 4);
                i16++;
            } else if (i18 == 3) {
                int i25 = i16 + 1;
                bArr2[i16] = (byte) (i17 >> 10);
                i16 += 2;
                bArr2[i25] = (byte) (i17 >> 2);
            } else if (i18 == 4) {
                this.f81521c = 6;
                return false;
            }
            this.f81521c = i18;
            this.f81518b = i16;
            return true;
        }
    }

    static class c extends AbstractC1709a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final byte[] f81524j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final byte[] f81525k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final byte[] f81526c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f81527d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f81528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f81529f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f81530g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f81531h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final byte[] f81532i;

        public c(int i11, byte[] bArr) {
            this.f81517a = bArr;
            this.f81529f = (i11 & 1) == 0;
            boolean z11 = (i11 & 2) == 0;
            this.f81530g = z11;
            this.f81531h = (i11 & 4) != 0;
            this.f81532i = (i11 & 8) == 0 ? f81524j : f81525k;
            this.f81526c = new byte[2];
            this.f81527d = 0;
            this.f81528e = z11 ? 19 : -1;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0050  */
        public boolean a(byte[] bArr, int i11, int i12, boolean z11) {
            int i13;
            int i14;
            int i15;
            int i16;
            byte b11;
            byte b12;
            byte b13;
            int i17;
            int i18;
            byte[] bArr2 = this.f81532i;
            byte[] bArr3 = this.f81517a;
            int i19 = this.f81528e;
            int i21 = i12 + i11;
            int i22 = this.f81527d;
            char c11 = 2;
            int i23 = 0;
            if (i22 != 1) {
                if (i22 == 2 && (i18 = i11 + 1) <= i21) {
                    byte[] bArr4 = this.f81526c;
                    i14 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i11] & 255);
                    this.f81527d = 0;
                    i13 = i18;
                } else {
                    i13 = i11;
                    i14 = -1;
                }
            } else if (i11 + 2 <= i21) {
                i13 = i11 + 2;
                i14 = (bArr[i11 + 1] & 255) | ((this.f81526c[0] & 255) << 16) | ((bArr[i11] & 255) << 8);
                this.f81527d = 0;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (i14 != -1) {
                bArr3[0] = bArr2[(i14 >> 18) & 63];
                bArr3[1] = bArr2[(i14 >> 12) & 63];
                bArr3[2] = bArr2[(i14 >> 6) & 63];
                bArr3[3] = bArr2[i14 & 63];
                i19--;
                if (i19 == 0) {
                    if (this.f81531h) {
                        bArr3[4] = 13;
                        i17 = 5;
                    } else {
                        i17 = 4;
                    }
                    i15 = i17 + 1;
                    bArr3[i17] = 10;
                    i19 = 19;
                } else {
                    i15 = 4;
                }
            } else {
                i15 = 0;
            }
            while (true) {
                i13 += 3;
                if (i13 > i21) {
                    break;
                }
                c11 = c11;
                int i24 = ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16) | (bArr[i13 + 2] & 255);
                bArr3[i15] = bArr2[(i24 >> 18) & 63];
                bArr3[i15 + 1] = bArr2[(i24 >> 12) & 63];
                bArr3[i15 + 2] = bArr2[(i24 >> 6) & 63];
                bArr3[i15 + 3] = bArr2[i24 & 63];
                int i25 = i15 + 4;
                i19--;
                if (i19 == 0) {
                    if (this.f81531h) {
                        bArr3[i25] = 13;
                        i25 = i15 + 5;
                    }
                    i15 = i25 + 1;
                    bArr3[i25] = 10;
                    i19 = 19;
                } else {
                    i15 = i25;
                }
            }
            if (z11) {
                int i26 = this.f81527d;
                if (i13 - i26 == i21 - 1) {
                    if (i26 > 0) {
                        b13 = this.f81526c[0];
                        i23 = 1;
                    } else {
                        b13 = bArr[i13];
                    }
                    int i27 = (b13 & 255) << 4;
                    this.f81527d = i26 - i23;
                    bArr3[i15] = bArr2[(i27 >> 6) & 63];
                    int i28 = i15 + 2;
                    bArr3[i15 + 1] = bArr2[i27 & 63];
                    if (this.f81529f) {
                        bArr3[i28] = 61;
                        i28 = i15 + 4;
                        bArr3[i15 + 3] = 61;
                    }
                    if (this.f81530g) {
                        if (this.f81531h) {
                            bArr3[i28] = 13;
                            i28++;
                        }
                        i16 = i28 + 1;
                        bArr3[i28] = 10;
                        i15 = i16;
                    } else {
                        i15 = i28;
                    }
                } else if (i13 - i26 == i21 - 2) {
                    if (i26 > 1) {
                        b11 = this.f81526c[0];
                        i23 = 1;
                    } else {
                        byte b14 = bArr[i13];
                        i13++;
                        b11 = b14;
                    }
                    int i29 = (b11 & 255) << 10;
                    if (i26 > 0) {
                        b12 = this.f81526c[i23];
                        i23++;
                    } else {
                        b12 = bArr[i13];
                    }
                    int i31 = i29 | ((b12 & 255) << 2);
                    this.f81527d = i26 - i23;
                    bArr3[i15] = bArr2[(i31 >> 12) & 63];
                    bArr3[i15 + 1] = bArr2[(i31 >> 6) & 63];
                    int i32 = i15 + 3;
                    bArr3[i15 + 2] = bArr2[i31 & 63];
                    if (this.f81529f) {
                        bArr3[i32] = 61;
                        i32 = i15 + 4;
                    }
                    if (this.f81530g) {
                        if (this.f81531h) {
                            bArr3[i32] = 13;
                            i32++;
                        }
                        i16 = i32 + 1;
                        bArr3[i32] = 10;
                        i15 = i16;
                    } else {
                        i15 = i32;
                    }
                } else if (this.f81530g && i15 > 0 && i19 != 19) {
                    if (this.f81531h) {
                        bArr3[i15] = 13;
                        i15++;
                    }
                    i16 = i15 + 1;
                    bArr3[i15] = 10;
                    i15 = i16;
                }
            } else if (i13 == i21 - 1) {
                byte[] bArr5 = this.f81526c;
                int i33 = this.f81527d;
                this.f81527d = i33 + 1;
                bArr5[i33] = bArr[i13];
            } else if (i13 == i21 - 2) {
                byte[] bArr6 = this.f81526c;
                int i34 = this.f81527d;
                int i35 = i34 + 1;
                this.f81527d = i35;
                bArr6[i34] = bArr[i13];
                this.f81527d = i34 + 2;
                bArr6[i35] = bArr[i13 + 1];
            }
            this.f81518b = i15;
            this.f81528e = i19;
            return true;
        }
    }

    public static byte[] a(String str, int i11) {
        return b(str.getBytes(), i11);
    }

    public static byte[] b(byte[] bArr, int i11) {
        return c(bArr, 0, bArr.length, i11);
    }

    public static byte[] c(byte[] bArr, int i11, int i12, int i13) {
        b bVar = new b(i13, new byte[(i12 * 3) / 4]);
        if (!bVar.a(bArr, i11, i12, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i14 = bVar.f81518b;
        byte[] bArr2 = bVar.f81517a;
        if (i14 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i14];
        System.arraycopy(bArr2, 0, bArr3, 0, i14);
        return bArr3;
    }

    public static byte[] d(byte[] bArr, int i11) {
        return e(bArr, 0, bArr.length, i11);
    }

    public static byte[] e(byte[] bArr, int i11, int i12, int i13) {
        c cVar = new c(i13, null);
        int i14 = (i12 / 3) * 4;
        if (!cVar.f81529f) {
            int i15 = i12 % 3;
            if (i15 == 1) {
                i14 += 2;
            } else if (i15 == 2) {
                i14 += 3;
            }
        } else if (i12 % 3 > 0) {
            i14 += 4;
        }
        if (cVar.f81530g && i12 > 0) {
            i14 += (((i12 - 1) / 57) + 1) * (cVar.f81531h ? 2 : 1);
        }
        cVar.f81517a = new byte[i14];
        cVar.a(bArr, i11, i12, true);
        return cVar.f81517a;
    }

    public static String f(byte[] bArr, int i11) {
        try {
            return new String(d(bArr, i11), "US-ASCII");
        } catch (UnsupportedEncodingException e11) {
            throw new AssertionError(e11);
        }
    }
}
