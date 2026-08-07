package q40;

import j40.f;
import javax.inject.Provider;
import n40.b0;
import n40.p0;
import n40.s0;
import n40.y;
import t50.z;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f104806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<z> f104807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<s0> f104808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<f> f104809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<y> f104810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Provider<o50.f> f104811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Provider<b0> f104812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Provider<o30.d> f104813h;

    public d(Provider<p0> provider, Provider<z> provider2, Provider<s0> provider3, Provider<f> provider4, Provider<y> provider5, Provider<o50.f> provider6, Provider<b0> provider7, Provider<o30.d> provider8) {
        this.f104806a = provider;
        this.f104807b = provider2;
        this.f104808c = provider3;
        this.f104809d = provider4;
        this.f104810e = provider5;
        this.f104811f = provider6;
        this.f104812g = provider7;
        this.f104813h = provider8;
    }

    public static d a(Provider<p0> provider, Provider<z> provider2, Provider<s0> provider3, Provider<f> provider4, Provider<y> provider5, Provider<o50.f> provider6, Provider<b0> provider7, Provider<o30.d> provider8) {
        return new d(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static c c(AttachPaymentState attachPaymentState, p0 p0Var, z zVar, s0 s0Var, f fVar, y yVar, o50.f fVar2, b0 b0Var, o30.d dVar) {
        return new c(attachPaymentState, p0Var, zVar, s0Var, fVar, yVar, fVar2, b0Var, dVar);
    }

    public c b(AttachPaymentState attachPaymentState) {
        return c(attachPaymentState, this.f104806a.get(), this.f104807b.get(), this.f104808c.get(), this.f104809d.get(), this.f104810e.get(), this.f104811f.get(), this.f104812g.get(), this.f104813h.get());
    }
}
