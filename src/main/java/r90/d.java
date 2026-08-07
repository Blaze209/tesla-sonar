package r90;

import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.s;
import p020r2.e2;
import p020r2.p1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0011\u001a\u00028\u00008\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lr90/d;", "T", "Lr2/e2;", "Lr2/p1;", "state", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lr2/p1;Lkotlin/coroutines/CoroutineContext;)V", "a", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class d<T> implements e2<T>, p1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p1<T> f107380b;

    public d(p1<T> state, CoroutineContext coroutineContext) {
        s.k(state, "state");
        s.k(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
        this.f107380b = state;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // p020r2.p1, p020r2.y3
    public T getValue() {
        return this.f107380b.getValue();
    }

    @Override // p020r2.p1
    public void setValue(T t11) {
        this.f107380b.setValue(t11);
    }
}
