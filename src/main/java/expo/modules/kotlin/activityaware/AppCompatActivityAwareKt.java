package expo.modules.kotlin.activityaware;

import androidx.appcompat.app.c;
import jn0.h0;
import kotlinx.coroutines.CancellableContinuationImpl;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;
import p013kotlin.jvm.internal.q;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0086H¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"R", "Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;", "Lkotlin/Function1;", "Landroidx/appcompat/app/c;", "onActivityAvailable", "withActivityAvailable", "(Lexpo/modules/kotlin/activityaware/AppCompatActivityAware;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AppCompatActivityAwareKt {
    public static final <R> Object withActivityAvailable(AppCompatActivityAware appCompatActivityAware, l<? super c, ? extends R> lVar, Continuation<? super R> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        AppCompatActivityAwareKt$withActivityAvailable$2$listener$1 appCompatActivityAwareKt$withActivityAvailable$2$listener$1 = new AppCompatActivityAwareKt$withActivityAvailable$2$listener$1(cancellableContinuationImpl, appCompatActivityAware, lVar);
        appCompatActivityAware.addOnActivityAvailableListener(appCompatActivityAwareKt$withActivityAvailable$2$listener$1);
        cancellableContinuationImpl.invokeOnCancellation(new AppCompatActivityAwareKt$withActivityAvailable$2$1(appCompatActivityAware, appCompatActivityAwareKt$withActivityAvailable$2$listener$1));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    private static final <R> Object withActivityAvailable$$forInline(AppCompatActivityAware appCompatActivityAware, l<? super c, ? extends R> lVar, Continuation<? super R> continuation) {
        q.c(0);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        AppCompatActivityAwareKt$withActivityAvailable$2$listener$1 appCompatActivityAwareKt$withActivityAvailable$2$listener$1 = new AppCompatActivityAwareKt$withActivityAvailable$2$listener$1(cancellableContinuationImpl, appCompatActivityAware, lVar);
        appCompatActivityAware.addOnActivityAvailableListener(appCompatActivityAwareKt$withActivityAvailable$2$listener$1);
        cancellableContinuationImpl.invokeOnCancellation(new AppCompatActivityAwareKt$withActivityAvailable$2$1(appCompatActivityAware, appCompatActivityAwareKt$withActivityAvailable$2$listener$1));
        h0 h0Var = h0.f84049a;
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        q.c(1);
        return result;
    }
}
