package zf0;

import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 implements qj0.e<e0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qj0.i<MutableSharedFlow<jn0.s<q0>>> f128207a;

    public f0(qj0.i<MutableSharedFlow<jn0.s<q0>>> iVar) {
        this.f128207a = iVar;
    }

    public static f0 a(qj0.i<MutableSharedFlow<jn0.s<q0>>> iVar) {
        return new f0(iVar);
    }

    public static e0 c(MutableSharedFlow<jn0.s<q0>> mutableSharedFlow) {
        return new e0(mutableSharedFlow);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e0 get() {
        return c(this.f128207a.get());
    }
}
