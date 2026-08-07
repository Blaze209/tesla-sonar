package z40;

import javax.inject.Provider;
import n40.b0;
import n40.p0;
import n40.t1;
import n40.u;
import n40.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f126966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<j40.f> f126967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<t50.f> f126968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<v50.d> f126969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<u> f126970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<t1> f126971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<x1> f126972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<b0> f126973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<o50.f> f126974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<o30.d> f126975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<n40.a> f126976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Provider<h50.f> f126977l;

    public g(Provider<p0> provider, Provider<j40.f> provider2, Provider<t50.f> provider3, Provider<v50.d> provider4, Provider<u> provider5, Provider<t1> provider6, Provider<x1> provider7, Provider<b0> provider8, Provider<o50.f> provider9, Provider<o30.d> provider10, Provider<n40.a> provider11, Provider<h50.f> provider12) {
        this.f126966a = provider;
        this.f126967b = provider2;
        this.f126968c = provider3;
        this.f126969d = provider4;
        this.f126970e = provider5;
        this.f126971f = provider6;
        this.f126972g = provider7;
        this.f126973h = provider8;
        this.f126974i = provider9;
        this.f126975j = provider10;
        this.f126976k = provider11;
        this.f126977l = provider12;
    }

    public static g a(Provider<p0> provider, Provider<j40.f> provider2, Provider<t50.f> provider3, Provider<v50.d> provider4, Provider<u> provider5, Provider<t1> provider6, Provider<x1> provider7, Provider<b0> provider8, Provider<o50.f> provider9, Provider<o30.d> provider10, Provider<n40.a> provider11, Provider<h50.f> provider12) {
        return new g(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static e c(LinkAccountPickerState linkAccountPickerState, p0 p0Var, j40.f fVar, t50.f fVar2, v50.d dVar, u uVar, t1 t1Var, x1 x1Var, b0 b0Var, o50.f fVar3, o30.d dVar2, n40.a aVar, h50.f fVar4) {
        return new e(linkAccountPickerState, p0Var, fVar, fVar2, dVar, uVar, t1Var, x1Var, b0Var, fVar3, dVar2, aVar, fVar4);
    }

    public e b(LinkAccountPickerState linkAccountPickerState) {
        return c(linkAccountPickerState, this.f126966a.get(), this.f126967b.get(), this.f126968c.get(), this.f126969d.get(), this.f126970e.get(), this.f126971f.get(), this.f126972g.get(), this.f126973h.get(), this.f126974i.get(), this.f126975j.get(), this.f126976k.get(), this.f126977l.get());
    }
}
