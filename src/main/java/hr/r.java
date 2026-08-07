package hr;

import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class r {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t f73377a;

        public a(t tVar) {
            this.f73377a = tVar;
        }
    }

    public static boolean a(l lVar) {
        ts.d0 d0Var = new ts.d0(4);
        lVar.e(d0Var.e(), 0, 4);
        return d0Var.J() == 1716281667;
    }

    public static int b(l lVar) throws ParserException {
        lVar.g();
        ts.d0 d0Var = new ts.d0(2);
        lVar.e(d0Var.e(), 0, 2);
        int iN = d0Var.N();
        if ((iN >> 2) == 16382) {
            lVar.g();
            return iN;
        }
        lVar.g();
        throw ParserException.a("First frame does not start with sync code.", null);
    }

    public static ur.a c(l lVar, boolean z11) throws Throwable {
        ur.a aVarA = new w().a(lVar, z11 ? null : zr.h.f128522b);
        if (aVarA == null || aVarA.e() == 0) {
            return null;
        }
        return aVarA;
    }

    public static ur.a d(l lVar, boolean z11) throws Throwable {
        lVar.g();
        long jH = lVar.h();
        ur.a aVarC = c(lVar, z11);
        lVar.k((int) (lVar.h() - jH));
        return aVarC;
    }

    public static boolean e(l lVar, a aVar) {
        lVar.g();
        ts.c0 c0Var = new ts.c0(new byte[4]);
        lVar.e(c0Var.f114975a, 0, 4);
        boolean zG = c0Var.g();
        int iH = c0Var.h(7);
        int iH2 = c0Var.h(24) + 4;
        if (iH == 0) {
            aVar.f73377a = h(lVar);
            return zG;
        }
        t tVar = aVar.f73377a;
        if (tVar == null) {
            throw new IllegalArgumentException();
        }
        if (iH == 3) {
            aVar.f73377a = tVar.b(f(lVar, iH2));
            return zG;
        }
        if (iH == 4) {
            aVar.f73377a = tVar.c(j(lVar, iH2));
            return zG;
        }
        if (iH != 6) {
            lVar.k(iH2);
            return zG;
        }
        ts.d0 d0Var = new ts.d0(iH2);
        lVar.readFully(d0Var.e(), 0, iH2);
        d0Var.V(4);
        aVar.f73377a = tVar.a(com.google.common.collect.x.s(xr.a.a(d0Var)));
        return zG;
    }

    private static t.a f(l lVar, int i11) {
        ts.d0 d0Var = new ts.d0(i11);
        lVar.readFully(d0Var.e(), 0, i11);
        return g(d0Var);
    }

    public static t.a g(ts.d0 d0Var) {
        d0Var.V(1);
        int iK = d0Var.K();
        long jF = ((long) d0Var.f()) + ((long) iK);
        int i11 = iK / 18;
        long[] jArrCopyOf = new long[i11];
        long[] jArrCopyOf2 = new long[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            long jA = d0Var.A();
            if (jA == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i12);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i12);
                break;
            }
            jArrCopyOf[i12] = jA;
            jArrCopyOf2[i12] = d0Var.A();
            d0Var.V(2);
        }
        d0Var.V((int) (jF - ((long) d0Var.f())));
        return new t.a(jArrCopyOf, jArrCopyOf2);
    }

    private static t h(l lVar) {
        byte[] bArr = new byte[38];
        lVar.readFully(bArr, 0, 38);
        return new t(bArr, 4);
    }

    public static void i(l lVar) throws ParserException {
        ts.d0 d0Var = new ts.d0(4);
        lVar.readFully(d0Var.e(), 0, 4);
        if (d0Var.J() != 1716281667) {
            throw ParserException.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(l lVar, int i11) {
        ts.d0 d0Var = new ts.d0(i11);
        lVar.readFully(d0Var.e(), 0, i11);
        d0Var.V(4);
        return Arrays.asList(e0.i(d0Var, false, false).f73339b);
    }
}
