package b4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\r\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001aR\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aZ\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aZ\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001c\u001a?\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0016H\u0000¢\u0006\u0004\b$\u0010%\u001a#\u0010&\u001a\u00020\n*\u00020\u00162\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0002¢\u0006\u0004\b&\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"", "oldSize", "newSize", "Lb4/p;", "cb", "Lb4/x;", DateTokenConverter.CONVERTER_KEY, "(IILb4/p;)Lb4/x;", "diagonals", "callback", "Ljn0/h0;", "b", "(Lb4/x;Lb4/p;)V", "e", "(IILb4/p;)V", "oldStart", "oldEnd", "newStart", "newEnd", "Lb4/f;", "forward", "backward", "", "snake", "", "h", "(IIIILb4/p;[I[I[I)Z", "g", "(IIIILb4/p;[I[II[I)Z", "c", "startX", "startY", "endX", "endY", "reverse", "data", "f", "(IIIIZ[I)V", IntegerTokenConverter.CONVERTER_KEY, "j", "([III)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class v0 {
    private static final void b(x xVar, p pVar) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < xVar.getLastIndex()) {
            int i14 = i11 + 2;
            int iB = xVar.b(i11) - xVar.b(i14);
            int iB2 = xVar.b(i11 + 1) - xVar.b(i14);
            int iB3 = xVar.b(i14);
            i11 += 3;
            while (i12 < iB) {
                pVar.a(i13, i12);
                i12++;
            }
            while (i13 < iB2) {
                pVar.c(i13);
                i13++;
            }
            while (true) {
                int i15 = iB3 - 1;
                if (iB3 > 0) {
                    pVar.d(i12, i13);
                    i12++;
                    i13++;
                    iB3 = i15;
                }
            }
        }
    }

    private static final boolean c(int i11, int i12, int i13, int i14, p pVar, int[] iArr, int[] iArr2, int i15, int[] iArr3) {
        int iB;
        int i16;
        int i17;
        int i18 = (i12 - i11) - (i14 - i13);
        boolean z11 = i18 % 2 == 0;
        int i19 = -i15;
        for (int i21 = i19; i21 <= i15; i21 += 2) {
            if (i21 == i19 || (i21 != i15 && f.b(iArr2, i21 + 1) < f.b(iArr2, i21 - 1))) {
                iB = f.b(iArr2, i21 + 1);
                i16 = iB;
            } else {
                iB = f.b(iArr2, i21 - 1);
                i16 = iB - 1;
            }
            int i22 = i14 - ((i12 - i16) - i21);
            int i23 = (i15 == 0 || i16 != iB) ? i22 : i22 + 1;
            while (true) {
                if (i16 <= i11 || i22 <= i13) {
                    break;
                }
                if (!pVar.b(i16 - 1, i22 - 1)) {
                    break;
                }
                i16--;
                i22--;
            }
            f.d(iArr2, i21, i16);
            if (z11 && (i17 = i18 - i21) >= i19 && i17 <= i15) {
                if (f.b(iArr, i17) >= i16) {
                    f(i16, i22, iB, i23, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final x d(int i11, int i12, p pVar) {
        int i13 = ((i11 + i12) + 1) / 2;
        x xVar = new x(i13 * 3);
        x xVar2 = new x(i13 * 4);
        xVar2.h(0, i11, 0, i12);
        int i14 = (i13 * 2) + 1;
        int[] iArrA = f.a(new int[i14]);
        int[] iArrA2 = f.a(new int[i14]);
        int[] iArrB = u1.b(new int[5]);
        while (xVar2.d()) {
            int iF = xVar2.f();
            int iF2 = xVar2.f();
            int iF3 = xVar2.f();
            int iF4 = xVar2.f();
            p pVar2 = pVar;
            if (h(iF4, iF3, iF2, iF, pVar2, iArrA, iArrA2, iArrB)) {
                if (u1.c(iArrB) > 0) {
                    u1.a(iArrB, xVar);
                }
                xVar2.h(iF4, u1.h(iArrB), iF2, u1.i(iArrB));
                xVar2.h(u1.d(iArrB), iF3, u1.e(iArrB), iF);
            }
            pVar = pVar2;
        }
        xVar.j();
        xVar.g(i11, i12, 0);
        return xVar;
    }

    public static final void e(int i11, int i12, p pVar) {
        b(d(i11, i12, pVar), pVar);
    }

    public static final void f(int i11, int i12, int i13, int i14, boolean z11, int[] iArr) {
        iArr[0] = i11;
        iArr[1] = i12;
        iArr[2] = i13;
        iArr[3] = i14;
        iArr[4] = z11 ? 1 : 0;
    }

    private static final boolean g(int i11, int i12, int i13, int i14, p pVar, int[] iArr, int[] iArr2, int i15, int[] iArr3) {
        int iB;
        int i16;
        int i17 = (i12 - i11) - (i14 - i13);
        boolean z11 = Math.abs(i17) % 2 == 1;
        int i18 = -i15;
        for (int i19 = i18; i19 <= i15; i19 += 2) {
            if (i19 == i18 || (i19 != i15 && f.b(iArr, i19 + 1) > f.b(iArr, i19 - 1))) {
                iB = f.b(iArr, i19 + 1);
                i16 = iB;
            } else {
                iB = f.b(iArr, i19 - 1);
                i16 = iB + 1;
            }
            int i21 = (i13 + (i16 - i11)) - i19;
            int i22 = (i15 == 0 || i16 != iB) ? i21 : i21 - 1;
            while (true) {
                if (i16 >= i12 || i21 >= i14) {
                    break;
                }
                if (!pVar.b(i16, i21)) {
                    break;
                }
                i16++;
                i21++;
            }
            f.d(iArr, i19, i16);
            if (z11) {
                int i23 = i17 - i19;
                if (i23 >= i18 + 1 && i23 <= i15 - 1) {
                    if (f.b(iArr2, i23) <= i16) {
                        f(iB, i22, i16, i21, false, iArr3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean h(int i11, int i12, int i13, int i14, p pVar, int[] iArr, int[] iArr2, int[] iArr3) {
        int i15 = i12 - i11;
        int i16 = i14 - i13;
        if (i15 >= 1 && i16 >= 1) {
            int i17 = ((i15 + i16) + 1) / 2;
            int[] iArr4 = iArr;
            f.d(iArr4, 1, i11);
            int[] iArr5 = iArr2;
            f.d(iArr5, 1, i12);
            int i18 = 0;
            while (i18 < i17) {
                if (g(i11, i12, i13, i14, pVar, iArr4, iArr5, i18, iArr3) || c(i11, i12, i13, i14, pVar, iArr, iArr2, i18, iArr3)) {
                    return true;
                }
                i18++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int[] iArr, int i11, int i12) {
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
    }
}
