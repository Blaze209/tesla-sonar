package p013kotlin.coroutines.jvm.internal;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX WARN: Classes with same name are omitted, all sources:
  Tesla (2).apk:DebugProbesKt.bin
  classes9.dex
 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"T", "Lkotlin/coroutines/Continuation;", "completion", "probeCoroutineCreated", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "frame", "Ljn0/h0;", "probeCoroutineResumed", "(Lkotlin/coroutines/Continuation;)V", "probeCoroutineSuspended", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DebugProbesKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Continuation<T> probeCoroutineCreated(Continuation<? super T> completion) {
        s.k(completion, "completion");
        return completion;
    }

    public static final void probeCoroutineResumed(Continuation<?> frame) {
        s.k(frame, "frame");
    }

    public static final void probeCoroutineSuspended(Continuation<?> frame) {
        s.k(frame, "frame");
    }
}
