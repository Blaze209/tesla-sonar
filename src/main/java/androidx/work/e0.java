package androidx.work;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/work/e0;", "Landroidx/work/d0;", "Landroidx/lifecycle/d0;", "Landroidx/work/d0$b;", "state", "Lcom/google/common/util/concurrent/s;", "Landroidx/work/d0$b$c;", "future", "<init>", "(Landroidx/lifecycle/d0;Lcom/google/common/util/concurrent/s;)V", "getResult", "()Lcom/google/common/util/concurrent/s;", "c", "Landroidx/lifecycle/d0;", DateTokenConverter.CONVERTER_KEY, "Lcom/google/common/util/concurrent/s;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e0 implements d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.p003lifecycle.d0<d0.b> state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.google.common.util.concurrent.s<d0.b.c> future;

    public e0(androidx.p003lifecycle.d0<d0.b> state, com.google.common.util.concurrent.s<d0.b.c> future) {
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(future, "future");
        this.state = state;
        this.future = future;
    }

    @Override // androidx.work.d0
    public com.google.common.util.concurrent.s<d0.b.c> getResult() {
        return this.future;
    }
}
