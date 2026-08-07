package hs;

import gs.i;
import gs.j;
import gs.m;
import gs.n;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
abstract class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f73615a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<n> f73616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityQueue<b> f73617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f73618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f73619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f73620f;

    private static final class b extends m implements Comparable<b> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f73621j;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (k() != bVar.k()) {
                return k() ? 1 : -1;
            }
            long j11 = this.f39722e - bVar.f39722e;
            if (j11 == 0) {
                j11 = this.f73621j - bVar.f73621j;
                if (j11 == 0) {
                    return 0;
                }
            }
            return j11 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends n {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private fr.f.a<c> f73622f;

        public c(fr.f.a<c> aVar) {
            this.f73622f = aVar;
        }

        @Override // fr.f
        public final void p() {
            this.f73622f.a(this);
        }
    }

    public e() {
        for (int i11 = 0; i11 < 10; i11++) {
            this.f73615a.add(new b());
        }
        this.f73616b = new ArrayDeque<>();
        for (int i12 = 0; i12 < 2; i12++) {
            this.f73616b.add(new c(new fr.f.a() { // from class: hs.d
                @Override // fr.f.a
                public final void a(fr.f fVar) {
                    this.f73614a.n((e.c) fVar);
                }
            }));
        }
        this.f73617c = new PriorityQueue<>();
    }

    private void m(b bVar) {
        bVar.f();
        this.f73615a.add(bVar);
    }

    @Override // gs.j
    public void c(long j11) {
        this.f73619e = j11;
    }

    protected abstract i e();

    protected abstract void f(m mVar);

    @Override // fr.d
    public void flush() {
        this.f73620f = 0L;
        this.f73619e = 0L;
        while (!this.f73617c.isEmpty()) {
            m((b) p0.j(this.f73617c.poll()));
        }
        b bVar = this.f73618d;
        if (bVar != null) {
            m(bVar);
            this.f73618d = null;
        }
    }

    @Override // fr.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public m b() {
        ts.a.g(this.f73618d == null);
        if (this.f73615a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f73615a.pollFirst();
        this.f73618d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // fr.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public n a() {
        if (this.f73616b.isEmpty()) {
            return null;
        }
        while (!this.f73617c.isEmpty() && ((b) p0.j(this.f73617c.peek())).f39722e <= this.f73619e) {
            b bVar = (b) p0.j(this.f73617c.poll());
            if (bVar.k()) {
                n nVar = (n) p0.j(this.f73616b.pollFirst());
                nVar.e(4);
                m(bVar);
                return nVar;
            }
            f(bVar);
            if (k()) {
                i iVarE = e();
                n nVar2 = (n) p0.j(this.f73616b.pollFirst());
                nVar2.q(bVar.f39722e, iVarE, Long.MAX_VALUE);
                m(bVar);
                return nVar2;
            }
            m(bVar);
        }
        return null;
    }

    protected final n i() {
        return this.f73616b.pollFirst();
    }

    protected final long j() {
        return this.f73619e;
    }

    protected abstract boolean k();

    @Override // fr.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void d(m mVar) {
        ts.a.a(mVar == this.f73618d);
        b bVar = (b) mVar;
        if (bVar.j()) {
            m(bVar);
        } else {
            long j11 = this.f73620f;
            this.f73620f = 1 + j11;
            bVar.f73621j = j11;
            this.f73617c.add(bVar);
        }
        this.f73618d = null;
    }

    protected void n(n nVar) {
        nVar.f();
        this.f73616b.add(nVar);
    }

    @Override // fr.d
    public void release() {
    }
}
