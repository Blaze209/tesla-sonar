package b50;

import javax.inject.Provider;
import n40.b0;
import n40.p0;
import n40.s0;
import n40.x1;
import t50.z;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f16666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<s0> f16667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<z> f16668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<x1> f16669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<j40.f> f16670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<b0> f16671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<o50.f> f16672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<o30.d> f16673h;

    public g(Provider<p0> provider, Provider<s0> provider2, Provider<z> provider3, Provider<x1> provider4, Provider<j40.f> provider5, Provider<b0> provider6, Provider<o50.f> provider7, Provider<o30.d> provider8) {
        this.f16666a = provider;
        this.f16667b = provider2;
        this.f16668c = provider3;
        this.f16669d = provider4;
        this.f16670e = provider5;
        this.f16671f = provider6;
        this.f16672g = provider7;
        this.f16673h = provider8;
    }

    public static g a(Provider<p0> provider, Provider<s0> provider2, Provider<z> provider3, Provider<x1> provider4, Provider<j40.f> provider5, Provider<b0> provider6, Provider<o50.f> provider7, Provider<o30.d> provider8) {
        return new g(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static f c(ManualEntryState manualEntryState, p0 p0Var, s0 s0Var, z zVar, x1 x1Var, j40.f fVar, b0 b0Var, o50.f fVar2, o30.d dVar) {
        return new f(manualEntryState, p0Var, s0Var, zVar, x1Var, fVar, b0Var, fVar2, dVar);
    }

    public f b(ManualEntryState manualEntryState) {
        return c(manualEntryState, this.f16666a.get(), this.f16667b.get(), this.f16668c.get(), this.f16669d.get(), this.f16670e.get(), this.f16671f.get(), this.f16672g.get(), this.f16673h.get());
    }
}
