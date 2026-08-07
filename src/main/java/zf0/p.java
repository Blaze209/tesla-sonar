package zf0;

import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements qj0.e<MutableSharedFlow<dg0.c>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f128268a;

    public p(m mVar) {
        this.f128268a = mVar;
    }

    public static p a(m mVar) {
        return new p(mVar);
    }

    public static MutableSharedFlow<dg0.c> c(m mVar) {
        return (MutableSharedFlow) qj0.h.d(mVar.c());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow<dg0.c> get() {
        return c(this.f128268a);
    }
}
