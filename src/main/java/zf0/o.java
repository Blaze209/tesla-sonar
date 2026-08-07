package zf0;

import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements qj0.e<MutableSharedFlow<jn0.s<q0>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f128243a;

    public o(m mVar) {
        this.f128243a = mVar;
    }

    public static o a(m mVar) {
        return new o(mVar);
    }

    public static MutableSharedFlow<jn0.s<q0>> c(m mVar) {
        return (MutableSharedFlow) qj0.h.d(mVar.b());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public MutableSharedFlow<jn0.s<q0>> get() {
        return c(this.f128243a);
    }
}
