package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.f2;
import cr.q1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<o.c> f40350a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<o.c> f40351b = new HashSet<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p.a f40352c = new p.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.i.a f40353d = new com.google.android.exoplayer2.drm.i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f40354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private f2 f40355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q1 f40356g;

    @Override // com.google.android.exoplayer2.source.o
    public final void e(o.c cVar) {
        this.f40350a.remove(cVar);
        if (!this.f40350a.isEmpty()) {
            l(cVar);
            return;
        }
        this.f40354e = null;
        this.f40355f = null;
        this.f40356g = null;
        this.f40351b.clear();
        z();
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void f(p pVar) {
        this.f40352c.q(pVar);
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void h(Handler handler, p pVar) {
        ts.a.e(handler);
        ts.a.e(pVar);
        this.f40352c.f(handler, pVar);
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void j(o.c cVar) {
        ts.a.e(this.f40354e);
        boolean zIsEmpty = this.f40351b.isEmpty();
        this.f40351b.add(cVar);
        if (zIsEmpty) {
            u();
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void k(o.c cVar, ss.z zVar, q1 q1Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f40354e;
        ts.a.a(looper == null || looper == looperMyLooper);
        this.f40356g = q1Var;
        f2 f2Var = this.f40355f;
        this.f40350a.add(cVar);
        if (this.f40354e == null) {
            this.f40354e = looperMyLooper;
            this.f40351b.add(cVar);
            x(zVar);
        } else if (f2Var != null) {
            j(cVar);
            cVar.a(this, f2Var);
        }
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void l(o.c cVar) {
        boolean zIsEmpty = this.f40351b.isEmpty();
        this.f40351b.remove(cVar);
        if (zIsEmpty || !this.f40351b.isEmpty()) {
            return;
        }
        t();
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void n(Handler handler, com.google.android.exoplayer2.drm.i iVar) {
        ts.a.e(handler);
        ts.a.e(iVar);
        this.f40353d.g(handler, iVar);
    }

    @Override // com.google.android.exoplayer2.source.o
    public final void o(com.google.android.exoplayer2.drm.i iVar) {
        this.f40353d.n(iVar);
    }

    protected final com.google.android.exoplayer2.drm.i.a p(int i11, o.b bVar) {
        return this.f40353d.o(i11, bVar);
    }

    protected final com.google.android.exoplayer2.drm.i.a q(o.b bVar) {
        return this.f40353d.o(0, bVar);
    }

    protected final p.a r(int i11, o.b bVar) {
        return this.f40352c.r(i11, bVar);
    }

    protected final p.a s(o.b bVar) {
        return this.f40352c.r(0, bVar);
    }

    protected void t() {
    }

    protected void u() {
    }

    protected final q1 v() {
        return (q1) ts.a.i(this.f40356g);
    }

    protected final boolean w() {
        return !this.f40351b.isEmpty();
    }

    protected abstract void x(ss.z zVar);

    protected final void y(f2 f2Var) {
        this.f40355f = f2Var;
        Iterator<o.c> it = this.f40350a.iterator();
        while (it.hasNext()) {
            it.next().a(this, f2Var);
        }
    }

    protected abstract void z();
}
