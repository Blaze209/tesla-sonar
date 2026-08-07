package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Rect;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.util.concurrent.ExecutorService;
import nk.g;
import nk.i;
import nm.n;
import pk.d;
import pk.o;
import pm.p;
import um.e;
import um.k;

/* JADX INFO: loaded from: classes3.dex */
@d
public class AnimatedFactoryV2Impl implements im.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mm.d f21565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f21566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n<jk.d, e> f21567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private im.d f21569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private jm.b f21570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private km.a f21571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private tm.a f21572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f21573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f21575k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f21576l;

    class a implements sm.b {
        a() {
        }

        @Override // sm.b
        public e a(k kVar, int i11, um.p pVar, om.c cVar) {
            return AnimatedFactoryV2Impl.this.n().a(kVar, cVar, cVar.f98031i);
        }
    }

    class b implements jm.b {
        b() {
        }

        @Override // jm.b
        public hm.a a(hm.e eVar, Rect rect) {
            return new jm.a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f21568d);
        }
    }

    class c implements jm.b {
        c() {
        }

        @Override // jm.b
        public hm.a a(hm.e eVar, Rect rect) {
            return new jm.a(AnimatedFactoryV2Impl.this.m(), eVar, rect, AnimatedFactoryV2Impl.this.f21568d);
        }
    }

    @d
    public AnimatedFactoryV2Impl(mm.d dVar, p pVar, n<jk.d, e> nVar, boolean z11, boolean z12, int i11, int i12, g gVar) {
        this.f21565a = dVar;
        this.f21566b = pVar;
        this.f21567c = nVar;
        this.f21574j = i11;
        this.f21575k = z12;
        this.f21568d = z11;
        this.f21573i = gVar;
        this.f21576l = i12;
    }

    public static /* synthetic */ Integer e() {
        return 2;
    }

    public static /* synthetic */ Integer f() {
        return 3;
    }

    private im.d j() {
        return new im.e(new c(), this.f21565a, this.f21575k);
    }

    private yl.d k() {
        pk.n nVar = new pk.n() { // from class: yl.b
            @Override // pk.n
            public final Object get() {
                return AnimatedFactoryV2Impl.e();
            }
        };
        ExecutorService dVar = this.f21573i;
        if (dVar == null) {
            dVar = new nk.d(this.f21566b.getDecodeExecutor());
        }
        pk.n nVar2 = new pk.n() { // from class: yl.c
            @Override // pk.n
            public final Object get() {
                return AnimatedFactoryV2Impl.f();
            }
        };
        pk.n<Boolean> nVar3 = o.f103136b;
        return new yl.d(l(), i.h(), dVar, RealtimeSinceBootClock.get(), this.f21565a, this.f21567c, nVar, nVar2, nVar3, o.a(Boolean.valueOf(this.f21575k)), o.a(Boolean.valueOf(this.f21568d)), o.a(Integer.valueOf(this.f21574j)), o.a(Integer.valueOf(this.f21576l)));
    }

    private jm.b l() {
        if (this.f21570f == null) {
            this.f21570f = new b();
        }
        return this.f21570f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public km.a m() {
        if (this.f21571g == null) {
            this.f21571g = new km.a();
        }
        return this.f21571g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public im.d n() {
        if (this.f21569e == null) {
            this.f21569e = j();
        }
        return this.f21569e;
    }

    @Override // im.a
    public tm.a a(Context context) {
        if (this.f21572h == null) {
            this.f21572h = k();
        }
        return this.f21572h;
    }

    @Override // im.a
    public sm.b b() {
        return new sm.b() { // from class: yl.a
            @Override // sm.b
            public final e a(k kVar, int i11, um.p pVar, om.c cVar) {
                return this.f125689a.n().b(kVar, cVar, cVar.f98031i);
            }
        };
    }

    @Override // im.a
    public sm.b c() {
        return new a();
    }
}
