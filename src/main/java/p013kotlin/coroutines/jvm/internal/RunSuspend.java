package p013kotlin.coroutines.jvm.internal;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.action.AwaitAction;
import jn0.h0;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/jvm/internal/RunSuspend;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "<init>", "()V", "Ljn0/s;", "result", "resumeWith", "(Ljava/lang/Object;)V", AwaitAction.ACTION_TYPE, "Ljn0/s;", "getResult-xLWZpok", "()Ljn0/s;", "setResult", "(Ljn0/s;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class RunSuspend implements Continuation<h0> {
    private s<h0> result;

    public final void await() {
        synchronized (this) {
            while (true) {
                try {
                    s<h0> sVar = this.result;
                    if (sVar == null) {
                        p013kotlin.jvm.internal.s.i(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } else {
                        t.b(sVar.getValue());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // p013kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    /* JADX INFO: renamed from: getResult-xLWZpok, reason: not valid java name */
    public final s<h0> m493getResultxLWZpok() {
        return this.result;
    }

    @Override // p013kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        synchronized (this) {
            this.result = s.a(result);
            p013kotlin.jvm.internal.s.i(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            h0 h0Var = h0.f84049a;
        }
    }

    public final void setResult(s<h0> sVar) {
        this.result = sVar;
    }
}
