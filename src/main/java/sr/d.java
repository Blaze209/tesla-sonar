package sr;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import hr.l;
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class d {

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f111630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f111631b;

        private a(int i11, long j11) {
            this.f111630a = i11;
            this.f111631b = j11;
        }

        public static a a(l lVar, d0 d0Var) {
            lVar.e(d0Var.e(), 0, 8);
            d0Var.U(0);
            return new a(d0Var.q(), d0Var.x());
        }
    }

    public static boolean a(l lVar) {
        d0 d0Var = new d0(8);
        int i11 = a.a(lVar, d0Var).f111630a;
        if (i11 != 1380533830 && i11 != 1380333108) {
            return false;
        }
        lVar.e(d0Var.e(), 0, 4);
        d0Var.U(0);
        int iQ = d0Var.q();
        if (iQ == 1463899717) {
            return true;
        }
        u.c("WavHeaderReader", "Unsupported form type: " + iQ);
        return false;
    }

    public static c b(l lVar) throws ParserException {
        byte[] bArr;
        d0 d0Var = new d0(16);
        a aVarD = d(1718449184, lVar, d0Var);
        ts.a.g(aVarD.f111631b >= 16);
        lVar.e(d0Var.e(), 0, 16);
        d0Var.U(0);
        int iZ = d0Var.z();
        int iZ2 = d0Var.z();
        int iY = d0Var.y();
        int iY2 = d0Var.y();
        int iZ3 = d0Var.z();
        int iZ4 = d0Var.z();
        int i11 = ((int) aVarD.f111631b) - 16;
        if (i11 > 0) {
            bArr = new byte[i11];
            lVar.e(bArr, 0, i11);
        } else {
            bArr = p0.f115045f;
        }
        byte[] bArr2 = bArr;
        lVar.k((int) (lVar.h() - lVar.getPosition()));
        return new c(iZ, iZ2, iY, iY2, iZ3, iZ4, bArr2);
    }

    public static long c(l lVar) {
        d0 d0Var = new d0(8);
        a aVarA = a.a(lVar, d0Var);
        if (aVarA.f111630a != 1685272116) {
            lVar.g();
            return -1L;
        }
        lVar.i(8);
        d0Var.U(0);
        lVar.e(d0Var.e(), 0, 8);
        long jV = d0Var.v();
        lVar.k(((int) aVarA.f111631b) + 8);
        return jV;
    }

    private static a d(int i11, l lVar, d0 d0Var) throws ParserException {
        a aVarA = a.a(lVar, d0Var);
        while (aVarA.f111630a != i11) {
            u.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f111630a);
            long j11 = aVarA.f111631b + 8;
            if (j11 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + aVarA.f111630a);
            }
            lVar.k((int) j11);
            aVarA = a.a(lVar, d0Var);
        }
        return aVarA;
    }

    public static Pair<Long, Long> e(l lVar) throws ParserException {
        lVar.g();
        a aVarD = d(1684108385, lVar, new d0(8));
        lVar.k(8);
        return Pair.create(Long.valueOf(lVar.getPosition()), Long.valueOf(aVarD.f111631b));
    }
}
