package c50;

import j40.f;
import javax.inject.Provider;
import n40.b0;
import n40.p0;
import t50.z;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<b0> f18774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<z> f18775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<f> f18776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<p0> f18777d;

    public d(Provider<b0> provider, Provider<z> provider2, Provider<f> provider3, Provider<p0> provider4) {
        this.f18774a = provider;
        this.f18775b = provider2;
        this.f18776c = provider3;
        this.f18777d = provider4;
    }

    public static d a(Provider<b0> provider, Provider<z> provider2, Provider<f> provider3, Provider<p0> provider4) {
        return new d(provider, provider2, provider3, provider4);
    }

    public static c c(ManualEntrySuccessState manualEntrySuccessState, b0 b0Var, z zVar, f fVar, p0 p0Var) {
        return new c(manualEntrySuccessState, b0Var, zVar, fVar, p0Var);
    }

    public c b(ManualEntrySuccessState manualEntrySuccessState) {
        return c(manualEntrySuccessState, this.f18774a.get(), this.f18775b.get(), this.f18776c.get(), this.f18777d.get());
    }
}
