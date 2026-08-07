package y8;

import androidx.media3.common.ParserException;
import com.google.common.collect.d1;
import java.util.ArrayList;
import p7.u;
import s7.c0;
import s7.t;
import t9.q;
import w8.g0;
import w8.i0;
import w8.j0;
import w8.o0;
import w8.p;
import w8.r;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f125226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f125227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f125228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q.a f125229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f125230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f125231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private y8.c f125232g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f125233h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e[] f125234i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f125235j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private e f125236k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f125237l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f125238m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f125239n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f125240o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f125241p;

    /* JADX INFO: renamed from: y8.b$b, reason: collision with other inner class name */
    private class C2722b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f125242a;

        public C2722b(long j11) {
            this.f125242a = j11;
        }

        @Override // w8.j0
        public j0.a c(long j11) {
            j0.a aVarI = b.this.f125234i[0].i(j11);
            for (int i11 = 1; i11 < b.this.f125234i.length; i11++) {
                j0.a aVarI2 = b.this.f125234i[i11].i(j11);
                if (aVarI2.f121331a.f121337b < aVarI.f121331a.f121337b) {
                    aVarI = aVarI2;
                }
            }
            return aVarI;
        }

        @Override // w8.j0
        public boolean d() {
            return true;
        }

        @Override // w8.j0
        public long g() {
            return this.f125242a;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f125244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f125245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f125246c;

        private c() {
        }

        public void a(c0 c0Var) {
            this.f125244a = c0Var.z();
            this.f125245b = c0Var.z();
            this.f125246c = 0;
        }

        public void b(c0 c0Var) throws ParserException {
            a(c0Var);
            if (this.f125244a == 1414744396) {
                this.f125246c = c0Var.z();
                return;
            }
            throw ParserException.a("LIST expected, found: " + this.f125244a, null);
        }
    }

    public b(int i11, q.a aVar) {
        this.f125229d = aVar;
        this.f125228c = (i11 & 1) == 0;
        this.f125226a = new c0(12);
        this.f125227b = new c();
        this.f125231f = new g0();
        this.f125234i = new e[0];
        this.f125238m = -1L;
        this.f125239n = -1L;
        this.f125237l = -1;
        this.f125233h = -9223372036854775807L;
    }

    private static void c(w8.q qVar) {
        if ((qVar.getPosition() & 1) == 1) {
            qVar.k(1);
        }
    }

    private e d(int i11) {
        for (e eVar : this.f125234i) {
            if (eVar.j(i11)) {
                return eVar;
            }
        }
        return null;
    }

    private void f(c0 c0Var) throws ParserException {
        f fVarC = f.c(1819436136, c0Var);
        if (fVarC.getType() != 1819436136) {
            throw ParserException.a("Unexpected header list type " + fVarC.getType(), null);
        }
        y8.c cVar = (y8.c) fVarC.b(y8.c.class);
        if (cVar == null) {
            throw ParserException.a("AviHeader not found", null);
        }
        this.f125232g = cVar;
        this.f125233h = ((long) cVar.f125249c) * ((long) cVar.f125247a);
        ArrayList arrayList = new ArrayList();
        d1<y8.a> it = fVarC.f125272a.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            y8.a next = it.next();
            if (next.getType() == 1819440243) {
                int i12 = i11 + 1;
                e eVarM = m((f) next, i11);
                if (eVarM != null) {
                    arrayList.add(eVarM);
                }
                i11 = i12;
            }
        }
        this.f125234i = (e[]) arrayList.toArray(new e[0]);
        this.f125231f.j();
    }

    private void g(c0 c0Var) {
        int i11;
        long jK = k(c0Var);
        while (true) {
            if (c0Var.a() < 16) {
                break;
            }
            int iZ = c0Var.z();
            int iZ2 = c0Var.z();
            long jZ = ((long) c0Var.z()) + jK;
            c0Var.c0(4);
            e eVarD = d(iZ);
            if (eVarD != null) {
                eVarD.b(jZ, (iZ2 & 16) == 16);
            }
        }
        for (e eVar : this.f125234i) {
            eVar.c();
        }
        this.f125241p = true;
        if (this.f125234i.length == 0) {
            this.f125231f.t(new j0.b(this.f125233h));
        } else {
            this.f125231f.t(new C2722b(this.f125233h));
        }
    }

    private long k(c0 c0Var) {
        if (c0Var.a() < 16) {
            return 0L;
        }
        int iG = c0Var.g();
        c0Var.c0(8);
        long jZ = c0Var.z();
        long j11 = this.f125238m;
        long j12 = jZ <= j11 ? j11 + 8 : 0L;
        c0Var.b0(iG);
        return j12;
    }

    private e m(f fVar, int i11) {
        d dVar = (d) fVar.b(d.class);
        g gVar = (g) fVar.b(g.class);
        if (dVar == null) {
            t.i("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (gVar == null) {
            t.i("AviExtractor", "Missing Stream Format");
            return null;
        }
        long jA = dVar.a();
        u uVar = gVar.f125274a;
        u.b bVarB = uVar.b();
        bVarB.i0(i11);
        int i12 = dVar.f125256f;
        if (i12 != 0) {
            bVarB.o0(i12);
        }
        h hVar = (h) fVar.b(h.class);
        if (hVar != null) {
            bVarB.l0(hVar.f125275a);
        }
        int iK = p7.g0.k(uVar.f101544o);
        if (iK != 1 && iK != 2) {
            return null;
        }
        o0 o0VarB = this.f125231f.b(i11, iK);
        o0VarB.g(bVarB.P());
        o0VarB.d(jA);
        this.f125233h = Math.max(this.f125233h, jA);
        return new e(i11, dVar, o0VarB);
    }

    private int n(w8.q qVar) {
        if (qVar.getPosition() >= this.f125239n) {
            return -1;
        }
        e eVar = this.f125236k;
        if (eVar == null) {
            c(qVar);
            qVar.e(this.f125226a.f(), 0, 12);
            this.f125226a.b0(0);
            int iZ = this.f125226a.z();
            if (iZ == 1414744396) {
                this.f125226a.b0(8);
                qVar.k(this.f125226a.z() != 1769369453 ? 8 : 12);
                qVar.g();
                return 0;
            }
            int iZ2 = this.f125226a.z();
            if (iZ == 1263424842) {
                this.f125235j = qVar.getPosition() + ((long) iZ2) + 8;
                return 0;
            }
            qVar.k(8);
            qVar.g();
            e eVarD = d(iZ);
            if (eVarD == null) {
                this.f125235j = qVar.getPosition() + ((long) iZ2);
                return 0;
            }
            eVarD.n(iZ2);
            this.f125236k = eVarD;
        } else if (eVar.m(qVar)) {
            this.f125236k = null;
        }
        return 0;
    }

    private boolean o(w8.q qVar, i0 i0Var) {
        boolean z11;
        if (this.f125235j != -1) {
            long position = qVar.getPosition();
            long j11 = this.f125235j;
            if (j11 < position || j11 > 262144 + position) {
                i0Var.f121323a = j11;
                z11 = true;
            } else {
                qVar.k((int) (j11 - position));
                z11 = false;
            }
        } else {
            z11 = false;
        }
        this.f125235j = -1L;
        return z11;
    }

    @Override // w8.p
    public void a(long j11, long j12) {
        this.f125235j = -1L;
        this.f125236k = null;
        for (e eVar : this.f125234i) {
            eVar.o(j11);
        }
        if (j11 != 0) {
            this.f125230e = 6;
        } else if (this.f125234i.length == 0) {
            this.f125230e = 0;
        } else {
            this.f125230e = 3;
        }
    }

    @Override // w8.p
    public void e(r rVar) {
        this.f125230e = 0;
        if (this.f125228c) {
            rVar = new t9.r(rVar, this.f125229d);
        }
        this.f125231f = rVar;
        this.f125235j = -1L;
    }

    @Override // w8.p
    public int h(w8.q qVar, i0 i0Var) throws ParserException {
        if (o(qVar, i0Var)) {
            return 1;
        }
        switch (this.f125230e) {
            case 0:
                if (!l(qVar)) {
                    throw ParserException.a("AVI Header List not found", null);
                }
                qVar.k(12);
                this.f125230e = 1;
                return 0;
            case 1:
                qVar.readFully(this.f125226a.f(), 0, 12);
                this.f125226a.b0(0);
                this.f125227b.b(this.f125226a);
                c cVar = this.f125227b;
                if (cVar.f125246c == 1819436136) {
                    this.f125237l = cVar.f125245b;
                    this.f125230e = 2;
                    return 0;
                }
                throw ParserException.a("hdrl expected, found: " + this.f125227b.f125246c, null);
            case 2:
                int i11 = this.f125237l - 4;
                c0 c0Var = new c0(i11);
                qVar.readFully(c0Var.f(), 0, i11);
                f(c0Var);
                this.f125230e = 3;
                return 0;
            case 3:
                if (this.f125238m != -1) {
                    long position = qVar.getPosition();
                    long j11 = this.f125238m;
                    if (position != j11) {
                        this.f125235j = j11;
                        return 0;
                    }
                }
                qVar.e(this.f125226a.f(), 0, 12);
                qVar.g();
                this.f125226a.b0(0);
                this.f125227b.a(this.f125226a);
                int iZ = this.f125226a.z();
                int i12 = this.f125227b.f125244a;
                if (i12 == 1179011410) {
                    qVar.k(12);
                    return 0;
                }
                if (i12 != 1414744396 || iZ != 1769369453) {
                    this.f125235j = qVar.getPosition() + ((long) this.f125227b.f125245b) + 8;
                    return 0;
                }
                long position2 = qVar.getPosition();
                this.f125238m = position2;
                this.f125239n = position2 + ((long) this.f125227b.f125245b) + 8;
                if (!this.f125241p) {
                    if (((y8.c) s7.a.f(this.f125232g)).a()) {
                        this.f125230e = 4;
                        this.f125235j = this.f125239n;
                        return 0;
                    }
                    this.f125231f.t(new j0.b(this.f125233h));
                    this.f125241p = true;
                }
                this.f125235j = qVar.getPosition() + 12;
                this.f125230e = 6;
                return 0;
            case 4:
                qVar.readFully(this.f125226a.f(), 0, 8);
                this.f125226a.b0(0);
                int iZ2 = this.f125226a.z();
                int iZ3 = this.f125226a.z();
                if (iZ2 == 829973609) {
                    this.f125230e = 5;
                    this.f125240o = iZ3;
                } else {
                    this.f125235j = qVar.getPosition() + ((long) iZ3);
                }
                return 0;
            case 5:
                c0 c0Var2 = new c0(this.f125240o);
                qVar.readFully(c0Var2.f(), 0, this.f125240o);
                g(c0Var2);
                this.f125230e = 6;
                this.f125235j = this.f125238m;
                return 0;
            case 6:
                return n(qVar);
            default:
                throw new AssertionError();
        }
    }

    @Override // w8.p
    public boolean l(w8.q qVar) {
        qVar.e(this.f125226a.f(), 0, 12);
        this.f125226a.b0(0);
        if (this.f125226a.z() != 1179011410) {
            return false;
        }
        this.f125226a.c0(4);
        return this.f125226a.z() == 541677121;
    }

    @Override // w8.p
    public void release() {
    }
}
