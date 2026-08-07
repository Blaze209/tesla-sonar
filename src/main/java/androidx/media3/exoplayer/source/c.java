package androidx.media3.exoplayer.source;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p7.r0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f10902h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f10903i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private v7.q f10904j;

    private final class a implements s, androidx.media3.exoplayer.drm.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f10905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private s.a f10906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.media3.exoplayer.drm.h.a f10907c;

        public a(T t11) {
            this.f10906b = c.this.z(null);
            this.f10907c = c.this.x(null);
            this.f10905a = t11;
        }

        private boolean b(int i11, r.b bVar) {
            r.b bVarI;
            if (bVar != null) {
                bVarI = c.this.I(this.f10905a, bVar);
                if (bVarI == null) {
                    return false;
                }
            } else {
                bVarI = null;
            }
            int iK = c.this.K(this.f10905a, i11);
            s.a aVar = this.f10906b;
            if (aVar.f11108a != iK || !Objects.equals(aVar.f11109b, bVarI)) {
                this.f10906b = c.this.y(iK, bVarI);
            }
            androidx.media3.exoplayer.drm.h.a aVar2 = this.f10907c;
            if (aVar2.f9801a == iK && Objects.equals(aVar2.f9802b, bVarI)) {
                return true;
            }
            this.f10907c = c.this.w(iK, bVarI);
            return true;
        }

        private n8.j q(n8.j jVar, r.b bVar) {
            long J = c.this.J(this.f10905a, jVar.f93569f, bVar);
            long J2 = c.this.J(this.f10905a, jVar.f93570g, bVar);
            return (J == jVar.f93569f && J2 == jVar.f93570g) ? jVar : new n8.j(jVar.f93564a, jVar.f93565b, jVar.f93566c, jVar.f93567d, jVar.f93568e, J, J2);
        }

        @Override // androidx.media3.exoplayer.source.s
        public void I(int i11, r.b bVar, n8.i iVar, n8.j jVar) {
            if (b(i11, bVar)) {
                this.f10906b.n(iVar, q(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void L(int i11, r.b bVar, n8.j jVar) {
            if (b(i11, bVar)) {
                this.f10906b.z(q(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void M(int i11, r.b bVar, n8.i iVar, n8.j jVar, int i12) {
            if (b(i11, bVar)) {
                this.f10906b.w(iVar, q(jVar, bVar), i12);
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void N(int i11, r.b bVar) {
            if (b(i11, bVar)) {
                this.f10907c.m();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void O(int i11, r.b bVar, n8.i iVar, n8.j jVar, IOException iOException, boolean z11) {
            if (b(i11, bVar)) {
                this.f10906b.t(iVar, q(jVar, bVar), iOException, z11);
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void T(int i11, r.b bVar, n8.i iVar, n8.j jVar) {
            if (b(i11, bVar)) {
                this.f10906b.q(iVar, q(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void W(int i11, r.b bVar, int i12) {
            if (b(i11, bVar)) {
                this.f10907c.k(i12);
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void X(int i11, r.b bVar) {
            if (b(i11, bVar)) {
                this.f10907c.i();
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void Y(int i11, r.b bVar, Exception exc) {
            if (b(i11, bVar)) {
                this.f10907c.l(exc);
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void b0(int i11, r.b bVar) {
            if (b(i11, bVar)) {
                this.f10907c.j();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void n(int i11, r.b bVar, n8.j jVar) {
            if (b(i11, bVar)) {
                this.f10906b.k(q(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void z(int i11, r.b bVar) {
            if (b(i11, bVar)) {
                this.f10907c.h();
            }
        }
    }

    private static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f10909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.c f10910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T>.a f10911c;

        public b(r rVar, r.c cVar, c<T>.a aVar) {
            this.f10909a = rVar;
            this.f10910b = cVar;
            this.f10911c = aVar;
        }
    }

    protected c() {
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void A() {
        for (b<T> bVar : this.f10902h.values()) {
            bVar.f10909a.u(bVar.f10910b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void B() {
        for (b<T> bVar : this.f10902h.values()) {
            bVar.f10909a.t(bVar.f10910b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void E(v7.q qVar) {
        this.f10904j = qVar;
        this.f10903i = q0.C();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void G() {
        for (b<T> bVar : this.f10902h.values()) {
            bVar.f10909a.j(bVar.f10910b);
            bVar.f10909a.l(bVar.f10911c);
            bVar.f10909a.o(bVar.f10911c);
        }
        this.f10902h.clear();
    }

    protected abstract r.b I(T t11, r.b bVar);

    protected long J(T t11, long j11, r.b bVar) {
        return j11;
    }

    protected int K(T t11, int i11) {
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void L(T t11, r rVar, r0 r0Var);

    protected final void M(final T t11, r rVar) {
        s7.a.a(!this.f10902h.containsKey(t11));
        r.c cVar = new r.c() { // from class: n8.c
            @Override // androidx.media3.exoplayer.source.r.c
            public final void a(androidx.media3.exoplayer.source.r rVar2, r0 r0Var) {
                this.f93548a.L(t11, rVar2, r0Var);
            }
        };
        a aVar = new a(t11);
        this.f10902h.put(t11, new b<>(rVar, cVar, aVar));
        rVar.e((Handler) s7.a.f(this.f10903i), aVar);
        rVar.f((Handler) s7.a.f(this.f10903i), aVar);
        rVar.n(cVar, this.f10904j, C());
        if (D()) {
            return;
        }
        rVar.u(cVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void b() {
        Iterator<b<T>> it = this.f10902h.values().iterator();
        while (it.hasNext()) {
            it.next().f10909a.b();
        }
    }
}
