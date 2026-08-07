package jr;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.u0;
import com.google.common.collect.d1;
import hr.b0;
import hr.i;
import hr.k;
import hr.l;
import hr.m;
import hr.z;
import java.util.ArrayList;
import ts.d0;
import ts.u;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f84240c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private jr.c f84242e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f84245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f84246i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f84250m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f84251n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f84238a = new d0(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f84239b = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f84241d = new i();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private e[] f84244g = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f84248k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f84249l = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f84247j = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f84243f = -9223372036854775807L;

    /* JADX INFO: renamed from: jr.b$b, reason: collision with other inner class name */
    private class C1786b implements z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f84252a;

        public C1786b(long j11) {
            this.f84252a = j11;
        }

        @Override // hr.z
        public z.a c(long j11) {
            z.a aVarI = b.this.f84244g[0].i(j11);
            for (int i11 = 1; i11 < b.this.f84244g.length; i11++) {
                z.a aVarI2 = b.this.f84244g[i11].i(j11);
                if (aVarI2.f73404a.f73302b < aVarI.f73404a.f73302b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // hr.z
        public boolean d() {
            return true;
        }

        @Override // hr.z
        public long g() {
            return this.f84252a;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f84254a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f84255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f84256c;

        private c() {
        }

        public void a(d0 d0Var) {
            this.f84254a = d0Var.u();
            this.f84255b = d0Var.u();
            this.f84256c = 0;
        }

        public void b(d0 d0Var) throws ParserException {
            a(d0Var);
            if (this.f84254a == 1414744396) {
                this.f84256c = d0Var.u();
                return;
            }
            throw ParserException.a("LIST expected, found: " + this.f84254a, null);
        }
    }

    private static void c(l lVar) {
        if ((lVar.getPosition() & 1) == 1) {
            lVar.k(1);
        }
    }

    private e d(int i11) {
        for (e eVar : this.f84244g) {
            if (eVar.j(i11)) {
                return eVar;
            }
        }
        return null;
    }

    private void f(d0 d0Var) throws ParserException {
        f fVarC = f.c(1819436136, d0Var);
        if (fVarC.getType() != 1819436136) {
            throw ParserException.a("Unexpected header list type " + fVarC.getType(), null);
        }
        jr.c cVar = (jr.c) fVarC.b(jr.c.class);
        if (cVar == null) {
            throw ParserException.a("AviHeader not found", null);
        }
        this.f84242e = cVar;
        this.f84243f = ((long) cVar.f84259c) * ((long) cVar.f84257a);
        ArrayList arrayList = new ArrayList();
        d1<jr.a> it = fVarC.f84279a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jr.a next = it.next();
            if (next.getType() == 1819440243) {
                int i12 = i11 + 1;
                e eVarK = k((f) next, i11);
                if (eVarK != null) {
                    arrayList.add(eVarK);
                }
                i11 = i12;
            }
        }
        this.f84244g = (e[]) arrayList.toArray(new e[0]);
        this.f84241d.j();
    }

    private void g(d0 d0Var) {
        long j11 = j(d0Var);
        while (d0Var.a() >= 16) {
            int iU = d0Var.u();
            int iU2 = d0Var.u();
            long jU = ((long) d0Var.u()) + j11;
            d0Var.u();
            e eVarD = d(iU);
            if (eVarD != null) {
                if ((iU2 & 16) == 16) {
                    eVarD.b(jU);
                }
                eVarD.k();
            }
        }
        for (e eVar : this.f84244g) {
            eVar.c();
        }
        this.f84251n = true;
        this.f84241d.p(new C1786b(this.f84243f));
    }

    private long j(d0 d0Var) {
        if (d0Var.a() < 16) {
            return 0L;
        }
        int iF = d0Var.f();
        d0Var.V(8);
        long jU = d0Var.u();
        long j11 = this.f84248k;
        long j12 = jU <= j11 ? j11 + 8 : 0L;
        d0Var.U(iF);
        return j12;
    }

    private e k(f fVar, int i11) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            u.i("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            u.i("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        u0 u0Var = gVar.f84281a;
        u0.b bVarB = u0Var.b();
        bVarB.T(i11);
        int i12 = dVar.f84266f;
        if (i12 != 0) {
            bVarB.Y(i12);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.W(hVar.f84282a);
        }
        int i13 = y.i(u0Var.f40712l);
        if (i13 != 1 && i13 != 2) {
            return null;
        }
        b0 b0VarB = this.f84241d.b(i11, i13);
        b0VarB.b(bVarB.G());
        e eVar = new e(i11, i13, jA, dVar.f84265e, b0VarB);
        this.f84243f = jA;
        return eVar;
    }

    private int l(l lVar) {
        if (lVar.getPosition() >= this.f84249l) {
            return -1;
        }
        e eVar = this.f84246i;
        if (eVar == null) {
            c(lVar);
            lVar.e(this.f84238a.e(), 0, 12);
            this.f84238a.U(0);
            int iU = this.f84238a.u();
            if (iU == 1414744396) {
                this.f84238a.U(8);
                lVar.k(this.f84238a.u() != 1769369453 ? 8 : 12);
                lVar.g();
                return 0;
            }
            int iU2 = this.f84238a.u();
            if (iU == 1263424842) {
                this.f84245h = lVar.getPosition() + ((long) iU2) + 8;
                return 0;
            }
            lVar.k(8);
            lVar.g();
            e eVarD = d(iU);
            if (eVarD == null) {
                this.f84245h = lVar.getPosition() + ((long) iU2);
                return 0;
            }
            eVarD.n(iU2);
            this.f84246i = eVarD;
        } else if (eVar.m(lVar)) {
            this.f84246i = null;
        }
        return 0;
    }

    private boolean m(l lVar, hr.y yVar) {
        boolean z11;
        if (this.f84245h != -1) {
            long position = lVar.getPosition();
            long j11 = this.f84245h;
            if (j11 < position || j11 > 262144 + position) {
                yVar.f73403a = j11;
                z11 = true;
            } else {
                lVar.k((int) (j11 - position));
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.f84245h = -1L;
        return z11;
    }

    @Override // hr.k
    public void a(long j11, long j12) {
        this.f84245h = -1L;
        this.f84246i = null;
        for (e eVar : this.f84244g) {
            eVar.o(j11);
        }
        if (j11 != 0) {
            this.f84240c = 6;
        } else if (this.f84244g.length == 0) {
            this.f84240c = 0;
        } else {
            this.f84240c = 3;
        }
    }

    @Override // hr.k
    public void e(m mVar) {
        this.f84240c = 0;
        this.f84241d = mVar;
        this.f84245h = -1L;
    }

    @Override // hr.k
    public boolean h(l lVar) {
        lVar.e(this.f84238a.e(), 0, 12);
        this.f84238a.U(0);
        if (this.f84238a.u() != 1179011410) {
            return false;
        }
        this.f84238a.V(4);
        return this.f84238a.u() == 541677121;
    }

    @Override // hr.k
    public int i(l lVar, hr.y yVar) throws ParserException {
        if (m(lVar, yVar)) {
            return 1;
        }
        switch (this.f84240c) {
            case 0:
                if (!h(lVar)) {
                    throw ParserException.a("AVI Header List not found", null);
                }
                lVar.k(12);
                this.f84240c = 1;
                return 0;
            case 1:
                lVar.readFully(this.f84238a.e(), 0, 12);
                this.f84238a.U(0);
                this.f84239b.b(this.f84238a);
                c cVar = this.f84239b;
                if (cVar.f84256c == 1819436136) {
                    this.f84247j = cVar.f84255b;
                    this.f84240c = 2;
                    return 0;
                }
                throw ParserException.a("hdrl expected, found: " + this.f84239b.f84256c, null);
            case 2:
                int i11 = this.f84247j - 4;
                d0 d0Var = new d0(i11);
                lVar.readFully(d0Var.e(), 0, i11);
                f(d0Var);
                this.f84240c = 3;
                return 0;
            case 3:
                if (this.f84248k != -1) {
                    long position = lVar.getPosition();
                    long j11 = this.f84248k;
                    if (position != j11) {
                        this.f84245h = j11;
                        return 0;
                    }
                }
                lVar.e(this.f84238a.e(), 0, 12);
                lVar.g();
                this.f84238a.U(0);
                this.f84239b.a(this.f84238a);
                int iU = this.f84238a.u();
                int i12 = this.f84239b.f84254a;
                if (i12 == 1179011410) {
                    lVar.k(12);
                    return 0;
                }
                if (i12 != 1414744396 || iU != 1769369453) {
                    this.f84245h = lVar.getPosition() + ((long) this.f84239b.f84255b) + 8;
                    return 0;
                }
                long position2 = lVar.getPosition();
                this.f84248k = position2;
                this.f84249l = position2 + ((long) this.f84239b.f84255b) + 8;
                if (!this.f84251n) {
                    if (((jr.c) ts.a.e(this.f84242e)).a()) {
                        this.f84240c = 4;
                        this.f84245h = this.f84249l;
                        return 0;
                    }
                    this.f84241d.p(new z.b(this.f84243f));
                    this.f84251n = true;
                }
                this.f84245h = lVar.getPosition() + 12;
                this.f84240c = 6;
                return 0;
            case 4:
                lVar.readFully(this.f84238a.e(), 0, 8);
                this.f84238a.U(0);
                int iU2 = this.f84238a.u();
                int iU3 = this.f84238a.u();
                if (iU2 == 829973609) {
                    this.f84240c = 5;
                    this.f84250m = iU3;
                } else {
                    this.f84245h = lVar.getPosition() + ((long) iU3);
                }
                return 0;
            case 5:
                d0 d0Var2 = new d0(this.f84250m);
                lVar.readFully(d0Var2.e(), 0, this.f84250m);
                g(d0Var2);
                this.f84240c = 6;
                this.f84245h = this.f84248k;
                return 0;
            case 6:
                return l(lVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // hr.k
    public void release() {
    }
}
