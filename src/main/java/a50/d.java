package a50;

import j40.f;
import javax.inject.Provider;
import n40.b0;
import n40.l;
import n40.l0;
import n40.p0;
import n40.t1;
import n40.v1;
import n40.y;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<f> f462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<b0> f463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<v1> f464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<t50.f> f465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<l> f466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<t1> f467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<y> f468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Provider<l0> f469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Provider<o50.f> f470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Provider<o30.d> f471k;

    public d(Provider<p0> provider, Provider<f> provider2, Provider<b0> provider3, Provider<v1> provider4, Provider<t50.f> provider5, Provider<l> provider6, Provider<t1> provider7, Provider<y> provider8, Provider<l0> provider9, Provider<o50.f> provider10, Provider<o30.d> provider11) {
        this.f461a = provider;
        this.f462b = provider2;
        this.f463c = provider3;
        this.f464d = provider4;
        this.f465e = provider5;
        this.f466f = provider6;
        this.f467g = provider7;
        this.f468h = provider8;
        this.f469i = provider9;
        this.f470j = provider10;
        this.f471k = provider11;
    }

    public static d a(Provider<p0> provider, Provider<f> provider2, Provider<b0> provider3, Provider<v1> provider4, Provider<t50.f> provider5, Provider<l> provider6, Provider<t1> provider7, Provider<y> provider8, Provider<l0> provider9, Provider<o50.f> provider10, Provider<o30.d> provider11) {
        return new d(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11);
    }

    public static c c(LinkStepUpVerificationState linkStepUpVerificationState, p0 p0Var, f fVar, b0 b0Var, v1 v1Var, t50.f fVar2, l lVar, t1 t1Var, y yVar, l0 l0Var, o50.f fVar3, o30.d dVar) {
        return new c(linkStepUpVerificationState, p0Var, fVar, b0Var, v1Var, fVar2, lVar, t1Var, yVar, l0Var, fVar3, dVar);
    }

    public c b(LinkStepUpVerificationState linkStepUpVerificationState) {
        return c(linkStepUpVerificationState, this.f461a.get(), this.f462b.get(), this.f463c.get(), this.f464d.get(), this.f465e.get(), this.f466f.get(), this.f467g.get(), this.f468h.get(), this.f469i.get(), this.f470j.get(), this.f471k.get());
    }
}
