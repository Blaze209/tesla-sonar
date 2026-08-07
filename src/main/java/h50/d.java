package h50;

import javax.inject.Provider;
import n40.p0;
import t50.u;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider<p0> f70888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Provider<o50.f> f70889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Provider<u> f70890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Provider<v50.d> f70891d;

    public d(Provider<p0> provider, Provider<o50.f> provider2, Provider<u> provider3, Provider<v50.d> provider4) {
        this.f70888a = provider;
        this.f70889b = provider2;
        this.f70890c = provider3;
        this.f70891d = provider4;
    }

    public static d a(Provider<p0> provider, Provider<o50.f> provider2, Provider<u> provider3, Provider<v50.d> provider4) {
        return new d(provider, provider2, provider3, provider4);
    }

    public static c c(NoticeSheetState noticeSheetState, p0 p0Var, o50.f fVar, u uVar, v50.d dVar) {
        return new c(noticeSheetState, p0Var, fVar, uVar, dVar);
    }

    public c b(NoticeSheetState noticeSheetState) {
        return c(noticeSheetState, this.f70888a.get(), this.f70889b.get(), this.f70890c.get(), this.f70891d.get());
    }
}
