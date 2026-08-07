package j50;

import j40.f;
import javax.inject.Provider;
import n40.f0;
import n40.p0;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<f0> f82704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<p0> f82705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<f> f82706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<o50.f> f82707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Provider<o30.d> f82708e;

    public d(Provider<f0> provider, Provider<p0> provider2, Provider<f> provider3, Provider<o50.f> provider4, Provider<o30.d> provider5) {
        this.f82704a = provider;
        this.f82705b = provider2;
        this.f82706c = provider3;
        this.f82707d = provider4;
        this.f82708e = provider5;
    }

    public static d a(Provider<f0> provider, Provider<p0> provider2, Provider<f> provider3, Provider<o50.f> provider4, Provider<o30.d> provider5) {
        return new d(provider, provider2, provider3, provider4, provider5);
    }

    public static c c(ResetState resetState, f0 f0Var, p0 p0Var, f fVar, o50.f fVar2, o30.d dVar) {
        return new c(resetState, f0Var, p0Var, fVar, fVar2, dVar);
    }

    public c b(ResetState resetState) {
        return c(resetState, this.f82704a.get(), this.f82705b.get(), this.f82706c.get(), this.f82707d.get(), this.f82708e.get());
    }
}
