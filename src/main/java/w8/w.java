package w8;

import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f121420a;

        public a(y yVar) {
            this.f121420a = yVar;
        }
    }

    public static boolean a(q qVar) {
        s7.c0 c0Var = new s7.c0(4);
        qVar.e(c0Var.f(), 0, 4);
        return c0Var.O() == 1716281667;
    }

    public static int b(q qVar) throws ParserException {
        qVar.g();
        s7.c0 c0Var = new s7.c0(2);
        qVar.e(c0Var.f(), 0, 2);
        int iU = c0Var.U();
        if ((iU >> 2) == 16382) {
            qVar.g();
            return iU;
        }
        qVar.g();
        throw ParserException.a("First frame does not start with sync code.", null);
    }

    public static p7.f0 c(q qVar, boolean z11) throws Throwable {
        p7.f0 f0VarA = new d0().a(qVar, z11 ? null : k9.h.f85421b);
        if (f0VarA == null || f0VarA.e() == 0) {
            return null;
        }
        return f0VarA;
    }

    public static p7.f0 d(q qVar, boolean z11) throws Throwable {
        qVar.g();
        long jH = qVar.h();
        p7.f0 f0VarC = c(qVar, z11);
        qVar.k((int) (qVar.h() - jH));
        return f0VarC;
    }

    public static boolean e(q qVar, a aVar) {
        qVar.g();
        s7.b0 b0Var = new s7.b0(new byte[4]);
        qVar.e(b0Var.f110390a, 0, 4);
        boolean zG = b0Var.g();
        int iH = b0Var.h(7);
        int iH2 = b0Var.h(24) + 4;
        if (iH == 0) {
            aVar.f121420a = h(qVar);
            return zG;
        }
        y yVar = aVar.f121420a;
        if (yVar == null) {
            throw new IllegalArgumentException();
        }
        if (iH == 3) {
            aVar.f121420a = yVar.b(g(qVar, iH2));
            return zG;
        }
        if (iH == 4) {
            aVar.f121420a = yVar.c(j(qVar, iH2));
            return zG;
        }
        if (iH != 6) {
            qVar.k(iH2);
            return zG;
        }
        s7.c0 c0Var = new s7.c0(iH2);
        qVar.readFully(c0Var.f(), 0, iH2);
        c0Var.c0(4);
        aVar.f121420a = yVar.a(com.google.common.collect.x.s(i9.a.a(c0Var)));
        return zG;
    }

    public static y.a f(s7.c0 c0Var) {
        c0Var.c0(1);
        int iP = c0Var.P();
        long jG = ((long) c0Var.g()) + ((long) iP);
        int i11 = iP / 18;
        long[] jArrCopyOf = new long[i11];
        long[] jArrCopyOf2 = new long[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            long jF = c0Var.F();
            if (jF == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i12);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i12);
                break;
            }
            jArrCopyOf[i12] = jF;
            jArrCopyOf2[i12] = c0Var.F();
            c0Var.c0(2);
        }
        c0Var.c0((int) (jG - ((long) c0Var.g())));
        return new y.a(jArrCopyOf, jArrCopyOf2);
    }

    private static y.a g(q qVar, int i11) {
        s7.c0 c0Var = new s7.c0(i11);
        qVar.readFully(c0Var.f(), 0, i11);
        return f(c0Var);
    }

    private static y h(q qVar) {
        byte[] bArr = new byte[38];
        qVar.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(q qVar) throws ParserException {
        s7.c0 c0Var = new s7.c0(4);
        qVar.readFully(c0Var.f(), 0, 4);
        if (c0Var.O() != 1716281667) {
            throw ParserException.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(q qVar, int i11) {
        s7.c0 c0Var = new s7.c0(i11);
        qVar.readFully(c0Var.f(), 0, i11);
        c0Var.c0(4);
        return Arrays.asList(r0.k(c0Var, false, false).f121402b);
    }
}
