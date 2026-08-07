package u9;

import java.util.ArrayDeque;
import s7.q0;
import t9.j;
import t9.k;
import t9.n;
import t9.o;

/* JADX INFO: loaded from: classes3.dex */
abstract class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayDeque<b> f116033a = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<o> f116034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f116035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f116036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f116037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f116038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f116039g;

    private static final class b extends n implements Comparable<b> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private long f116040k;

        private b() {
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (i() != bVar.i()) {
                return i() ? 1 : -1;
            }
            long j11 = this.f9288f - bVar.f9288f;
            if (j11 == 0) {
                j11 = this.f116040k - bVar.f116040k;
                if (j11 == 0) {
                    return 0;
                }
            }
            return j11 > 0 ? 1 : -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends o {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private y7.e.a<c> f116041g;

        public c(y7.e.a<c> aVar) {
            this.f116041g = aVar;
        }

        @Override // y7.e
        public final void o() {
            this.f116041g.a(this);
        }
    }

    public e() {
        for (int i11 = 0; i11 < 10; i11++) {
            this.f116033a.add(new b());
        }
        this.f116034b = new ArrayDeque<>();
        for (int i12 = 0; i12 < 2; i12++) {
            this.f116034b.add(new c(new y7.e.a() { // from class: u9.d
                @Override // y7.e.a
                public final void a(y7.e eVar) {
                    this.f116032a.p((e.c) eVar);
                }
            }));
        }
        this.f116035c = new ArrayDeque<>();
        this.f116039g = -9223372036854775807L;
    }

    private void o(b bVar) {
        bVar.f();
        this.f116033a.add(bVar);
    }

    @Override // t9.k
    public void c(long j11) {
        this.f116037e = j11;
    }

    @Override // y7.d
    public final void e(long j11) {
        this.f116039g = j11;
    }

    @Override // y7.d
    public void flush() {
        this.f116038f = 0L;
        this.f116037e = 0L;
        while (!this.f116035c.isEmpty()) {
            o((b) q0.l(this.f116035c.poll()));
        }
        b bVar = this.f116036d;
        if (bVar != null) {
            o(bVar);
            this.f116036d = null;
        }
    }

    protected abstract j g();

    protected abstract void h(n nVar);

    @Override // y7.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public n b() {
        s7.a.h(this.f116036d == null);
        if (this.f116033a.isEmpty()) {
            return null;
        }
        b bVarPollFirst = this.f116033a.pollFirst();
        this.f116036d = bVarPollFirst;
        return bVarPollFirst;
    }

    @Override // y7.d, i8.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public o a() {
        if (this.f116034b.isEmpty()) {
            return null;
        }
        while (!this.f116035c.isEmpty() && ((b) q0.l(this.f116035c.peek())).f9288f <= this.f116037e) {
            b bVar = (b) q0.l(this.f116035c.poll());
            if (bVar.i()) {
                o oVar = (o) q0.l(this.f116034b.pollFirst());
                oVar.e(4);
                o(bVar);
                return oVar;
            }
            h(bVar);
            if (m()) {
                j jVarG = g();
                o oVar2 = (o) q0.l(this.f116034b.pollFirst());
                oVar2.p(bVar.f9288f, jVarG, Long.MAX_VALUE);
                o(bVar);
                return oVar2;
            }
            o(bVar);
        }
        return null;
    }

    protected final o k() {
        return this.f116034b.pollFirst();
    }

    protected final long l() {
        return this.f116037e;
    }

    protected abstract boolean m();

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    @Override // y7.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void d(n nVar) {
        s7.a.a(nVar == this.f116036d);
        b bVar = (b) nVar;
        if (bVar.i()) {
            long j11 = this.f116038f;
            this.f116038f = 1 + j11;
            bVar.f116040k = j11;
            this.f116035c.add(bVar);
        } else {
            long j12 = bVar.f9288f;
            if (j12 != Long.MIN_VALUE) {
                long j13 = this.f116039g;
                if (j13 == -9223372036854775807L || j12 >= j13) {
                    long j14 = this.f116038f;
                    this.f116038f = 1 + j14;
                    bVar.f116040k = j14;
                    this.f116035c.add(bVar);
                } else {
                    o(bVar);
                }
            } else {
                long j15 = this.f116038f;
                this.f116038f = 1 + j15;
                bVar.f116040k = j15;
                this.f116035c.add(bVar);
            }
        }
        this.f116036d = null;
    }

    protected void p(o oVar) {
        oVar.f();
        this.f116034b.add(oVar);
    }

    @Override // y7.d
    public void release() {
    }
}
