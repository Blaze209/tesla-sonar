package q9;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import s7.c0;
import w8.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f105074a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i11, boolean z11) {
        if ((i11 >>> 8) == 3368816) {
            return true;
        }
        if (i11 == 1751476579 && z11) {
            return true;
        }
        for (int i12 : f105074a) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    public static n0 b(w8.q qVar) {
        return c(qVar, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:78:0x012f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0132  */
    /* JADX WARN: Code duplicated, block: B:82:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:85:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x013e A[RETURN] */
    private static n0 c(w8.q qVar, boolean z11, boolean z12) {
        n0 n0Var;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        long length = qVar.getLength();
        long j11 = -1;
        long j12 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        if (length != -1 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            j12 = length;
        }
        int i14 = (int) j12;
        c0 c0Var = new c0(64);
        int i15 = 0;
        int i16 = 0;
        boolean z13 = false;
        while (true) {
            if (i16 < i14) {
                c0Var.X(8);
                boolean z14 = true;
                if (qVar.f(c0Var.f(), i15, 8, true)) {
                    long jO = c0Var.O();
                    int iV = c0Var.v();
                    if (jO == 1) {
                        j11 = j11;
                        qVar.e(c0Var.f(), 8, 8);
                        i12 = 16;
                        c0Var.a0(16);
                        jO = c0Var.F();
                        i16 = i16;
                    } else {
                        j11 = j11;
                        if (jO == 0) {
                            long length2 = qVar.getLength();
                            if (length2 != j11) {
                                jO = (length2 - qVar.h()) + ((long) 8);
                            }
                        }
                        i12 = 8;
                    }
                    long j13 = jO;
                    long j14 = i12;
                    if (j13 < j14) {
                        return new a(iV, j13, i12);
                    }
                    int i17 = i16 + i12;
                    n0Var = null;
                    if (iV == 1836019574) {
                        i14 += (int) j13;
                        if (length != -1 && i14 > length) {
                            i14 = (int) length;
                        }
                        i16 = i17;
                        i15 = 0;
                    } else if (iV == 1836019558 || iV == 1836475768) {
                        i11 = 1;
                    } else {
                        if (iV == 1835295092) {
                            z13 = true;
                        }
                        long j15 = length;
                        if ((((long) i17) + j13) - j14 >= i14) {
                            i11 = 0;
                        } else {
                            int i18 = (int) (j13 - j14);
                            i16 = i17 + i18;
                            if (iV != 1718909296) {
                                i13 = 0;
                                if (i18 != 0) {
                                    qVar.i(i18);
                                }
                            } else {
                                if (i18 < 8) {
                                    return new a(iV, i18, 8);
                                }
                                c0Var.X(i18);
                                i13 = 0;
                                qVar.e(c0Var.f(), 0, i18);
                                int iV2 = c0Var.v();
                                if (a(iV2, z12)) {
                                    z13 = true;
                                }
                                c0Var.c0(4);
                                int iA = c0Var.a() / 4;
                                if (!z13 && iA > 0) {
                                    iArr = new int[iA];
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= iA) {
                                            z14 = z13;
                                            break;
                                        }
                                        int iV3 = c0Var.v();
                                        iArr[i19] = iV3;
                                        if (a(iV3, z12)) {
                                            break;
                                        }
                                        i19++;
                                    }
                                } else {
                                    z14 = z13;
                                    iArr = null;
                                }
                                if (!z14) {
                                    return new x(iV2, iArr);
                                }
                                z13 = z14;
                            }
                            i15 = i13;
                            length = j15;
                        }
                    }
                }
                if (!z13) {
                    return o.f105061a;
                }
                if (z11 != i11) {
                    return i11 != 0 ? i.f105027b : i.f105028c;
                }
                return n0Var;
            }
            n0Var = null;
            i11 = i15;
            if (!z13) {
                return o.f105061a;
            }
            if (z11 != i11) {
                if (i11 != 0) {
                }
            }
            return n0Var;
        }
    }

    public static n0 d(w8.q qVar, boolean z11) {
        return c(qVar, false, z11);
    }
}
