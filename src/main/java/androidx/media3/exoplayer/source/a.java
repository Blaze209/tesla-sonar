package androidx.media3.exoplayer.source;

import a8.o2;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p7.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<r.c> f10834a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<r.c> f10835b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s.a f10836c = new s.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.h.a f10837d = new androidx.media3.exoplayer.drm.h.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f10838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r0 f10839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o2 f10840g;

    protected void A() {
    }

    protected void B() {
    }

    protected final o2 C() {
        return (o2) s7.a.j(this.f10840g);
    }

    protected final boolean D() {
        return !this.f10835b.isEmpty();
    }

    protected abstract void E(v7.q qVar);

    protected final void F(r0 r0Var) {
        this.f10839f = r0Var;
        Iterator<r.c> it = this.f10834a.iterator();
        while (it.hasNext()) {
            it.next().a(this, r0Var);
        }
    }

    protected abstract void G();

    @Override // androidx.media3.exoplayer.source.r
    public final void e(Handler handler, s sVar) {
        s7.a.f(handler);
        s7.a.f(sVar);
        this.f10836c.h(handler, sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void f(Handler handler, androidx.media3.exoplayer.drm.h hVar) {
        s7.a.f(handler);
        s7.a.f(hVar);
        this.f10837d.g(handler, hVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void j(r.c cVar) {
        this.f10834a.remove(cVar);
        if (!this.f10834a.isEmpty()) {
            u(cVar);
            return;
        }
        this.f10838e = null;
        this.f10839f = null;
        this.f10840g = null;
        this.f10835b.clear();
        G();
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void l(s sVar) {
        this.f10836c.x(sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void n(r.c cVar, v7.q qVar, o2 o2Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f10838e;
        s7.a.a(looper == null || looper == looperMyLooper);
        this.f10840g = o2Var;
        r0 r0Var = this.f10839f;
        this.f10834a.add(cVar);
        if (this.f10838e == null) {
            this.f10838e = looperMyLooper;
            this.f10835b.add(cVar);
            E(qVar);
        } else if (r0Var != null) {
            t(cVar);
            cVar.a(this, r0Var);
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void o(androidx.media3.exoplayer.drm.h hVar) {
        this.f10837d.n(hVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void t(r.c cVar) {
        s7.a.f(this.f10838e);
        boolean zIsEmpty = this.f10835b.isEmpty();
        this.f10835b.add(cVar);
        if (zIsEmpty) {
            B();
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void u(r.c cVar) {
        boolean zIsEmpty = this.f10835b.isEmpty();
        this.f10835b.remove(cVar);
        if (zIsEmpty || !this.f10835b.isEmpty()) {
            return;
        }
        A();
    }

    protected final androidx.media3.exoplayer.drm.h.a w(int i11, r.b bVar) {
        return this.f10837d.o(i11, bVar);
    }

    protected final androidx.media3.exoplayer.drm.h.a x(r.b bVar) {
        return this.f10837d.o(0, bVar);
    }

    protected final s.a y(int i11, r.b bVar) {
        return this.f10836c.A(i11, bVar);
    }

    protected final s.a z(r.b bVar) {
        return this.f10836c.A(0, bVar);
    }
}
