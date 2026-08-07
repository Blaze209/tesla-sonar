package p013kotlin.coroutines.jvm.internal;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.ContinuationKt;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "block", "runSuspend", "(Lwn0/l;)V", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RunSuspendKt {
    public static final void runSuspend(l<? super Continuation<? super h0>, ? extends Object> block) {
        s.k(block, "block");
        RunSuspend runSuspend = new RunSuspend();
        ContinuationKt.startCoroutine(block, runSuspend);
        runSuspend.await();
    }
}
