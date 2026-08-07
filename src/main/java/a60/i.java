package a60;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import jn0.h0;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/tasks/CancellationTokenSource;", "cancellationTokenSource", "a", "(Lcom/google/android/gms/tasks/Task;Lcom/google/android/gms/tasks/CancellationTokenSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Ljn0/h0;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements l<Throwable, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f480c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f480c = cancellationTokenSource;
        }

        public final void a(Throwable th2) {
            this.f480c.cancel();
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Throwable th2) {
            a(th2);
            return h0.f84049a;
        }
    }

    public static final <T> Object a(Task<T> task, CancellationTokenSource cancellationTokenSource, Continuation<? super Task<T>> continuation) {
        if (task.isComplete()) {
            return task;
        }
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        task.addOnCompleteListener(c.f475a, new OnCompleteListener() { // from class: a60.i.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<T> p11) {
                s.k(p11, "p0");
                cancellableContinuationImpl.resumeWith(jn0.s.b(p11));
            }
        });
        if (cancellationTokenSource != null) {
            cancellableContinuationImpl.invokeOnCancellation(new b(cancellationTokenSource));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ Object b(Task task, CancellationTokenSource cancellationTokenSource, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationTokenSource = null;
        }
        return a(task, cancellationTokenSource, continuation);
    }
}
