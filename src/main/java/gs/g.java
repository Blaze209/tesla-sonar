package gs;

import com.google.common.collect.x;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f69513a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f69514b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deque<n> f69515c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f69516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f69517e;

    class a extends n {
        a() {
        }

        @Override // fr.f
        public void p() {
            g.this.i(this);
        }
    }

    private static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f69519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final x<gs.b> f69520b;

        public b(long j11, x<gs.b> xVar) {
            this.f69519a = j11;
            this.f69520b = xVar;
        }

        @Override // gs.i
        public long a(int i11) {
            ts.a.a(i11 == 0);
            return this.f69519a;
        }

        @Override // gs.i
        public int b() {
            return 1;
        }

        @Override // gs.i
        public int c(long j11) {
            return this.f69519a > j11 ? 0 : -1;
        }

        @Override // gs.i
        public List<gs.b> d(long j11) {
            return j11 >= this.f69519a ? this.f69520b : x.r();
        }
    }

    public g() {
        for (int i11 = 0; i11 < 2; i11++) {
            this.f69515c.addFirst(new a());
        }
        this.f69516d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(n nVar) {
        ts.a.g(this.f69515c.size() < 2);
        ts.a.a(!this.f69515c.contains(nVar));
        nVar.f();
        this.f69515c.addFirst(nVar);
    }

    @Override // fr.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public m b() {
        ts.a.g(!this.f69517e);
        if (this.f69516d != 0) {
            return null;
        }
        this.f69516d = 1;
        return this.f69514b;
    }

    @Override // fr.d
    public void flush() {
        ts.a.g(!this.f69517e);
        this.f69514b.f();
        this.f69516d = 0;
    }

    @Override // fr.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public n a() {
        ts.a.g(!this.f69517e);
        if (this.f69516d != 2 || this.f69515c.isEmpty()) {
            return null;
        }
        n nVarRemoveFirst = this.f69515c.removeFirst();
        if (this.f69514b.k()) {
            nVarRemoveFirst.e(4);
        } else {
            m mVar = this.f69514b;
            nVarRemoveFirst.q(this.f69514b.f39722e, new b(mVar.f39722e, this.f69513a.a(((ByteBuffer) ts.a.e(mVar.f39720c)).array())), 0L);
        }
        this.f69514b.f();
        this.f69516d = 0;
        return nVarRemoveFirst;
    }

    @Override // fr.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(m mVar) {
        ts.a.g(!this.f69517e);
        ts.a.g(this.f69516d == 1);
        ts.a.a(this.f69514b == mVar);
        this.f69516d = 2;
    }

    @Override // fr.d
    public void release() {
        this.f69517e = true;
    }

    @Override // gs.j
    public void c(long j11) {
    }
}
