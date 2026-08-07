package pr;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f103879a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i11, boolean z11) {
        if ((i11 >>> 8) == 3368816) {
            return true;
        }
        if (i11 == 1751476579 && z11) {
            return true;
        }
        for (int i12 : f103879a) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(hr.l lVar) {
        return c(lVar, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean c(hr.l lVar, boolean z11, boolean z12) {
        boolean z13;
        int i11;
        long length = lVar.getLength();
        long j11 = -1;
        int i12 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j12 = ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF;
        if (i12 != 0 && length <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
            j12 = length;
        }
        int i13 = (int) j12;
        d0 d0Var = new d0(64);
        int i14 = 0;
        int i15 = 0;
        boolean z14 = false;
        while (true) {
            if (i15 < i13) {
                d0Var.Q(8);
                if (lVar.f(d0Var.e(), i14, 8, true)) {
                    long J = d0Var.J();
                    int iQ = d0Var.q();
                    if (J == 1) {
                        lVar.e(d0Var.e(), 8, 8);
                        d0Var.T(16);
                        i11 = 16;
                        J = d0Var.A();
                    } else {
                        if (J == 0) {
                            long length2 = lVar.getLength();
                            if (length2 != j11) {
                                J = (length2 - lVar.h()) + ((long) 8);
                            }
                        }
                        i11 = 8;
                    }
                    long j13 = i11;
                    if (J < j13) {
                        return i14;
                    }
                    int i16 = i15 + i11;
                    boolean z15 = i14;
                    if (iQ == 1836019574) {
                        i13 += (int) J;
                        if (i12 != 0 && i13 > length) {
                            i13 = (int) length;
                        }
                        i15 = i16;
                        i14 = z15 ? 1 : 0;
                        j11 = -1;
                    } else {
                        if (iQ == 1836019558 || iQ == 1836475768) {
                            z13 = true;
                            return z14 && z11 == z13;
                        }
                        int i17 = i12;
                        if ((((long) i16) + J) - j13 < i13) {
                            int i18 = (int) (J - j13);
                            i15 = i16 + i18;
                            if (iQ == 1718909296) {
                                if (i18 < 8) {
                                    return z15;
                                }
                                d0Var.Q(i18);
                                lVar.e(d0Var.e(), z15 ? 1 : 0, i18);
                                int i19 = i18 / 4;
                                for (int i21 = 0; i21 < i19; i21++) {
                                    if (i21 != 1) {
                                        if (a(d0Var.q(), z12)) {
                                            z14 = true;
                                            break;
                                        }
                                    } else {
                                        d0Var.V(4);
                                    }
                                }
                                if (!z14) {
                                    return false;
                                }
                            } else if (i18 != 0) {
                                lVar.i(i18);
                            }
                            i12 = i17;
                            j11 = -1;
                            i14 = 0;
                        }
                    }
                }
            }
            z13 = false;
            if (z14) {
                return false;
            }
        }
    }

    public static boolean d(hr.l lVar, boolean z11) {
        return c(lVar, false, z11);
    }
}
