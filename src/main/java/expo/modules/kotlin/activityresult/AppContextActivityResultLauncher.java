package expo.modules.kotlin.activityresult;

import androidx.p002activity.result.ActivityResultCallback;
import ezvcard.property.Gender;
import java.io.Serializable;
import jn0.s;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.SafeContinuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u000b\u0010\rR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;", "Ljava/io/Serializable;", "I", Gender.OTHER, "", "<init>", "()V", "input", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Ljn0/h0;", "launch", "(Ljava/io/Serializable;Landroidx/activity/result/ActivityResultCallback;)V", "(Ljava/io/Serializable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "getContract", "()Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;", "contract", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AppContextActivityResultLauncher<I extends Serializable, O> {
    public abstract AppContextActivityResultContract<I, O> getContract();

    public final Object launch(I i11, Continuation<? super O> continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        launch(i11, new ActivityResultCallback() { // from class: expo.modules.kotlin.activityresult.AppContextActivityResultLauncher$launch$2$1
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final void onActivityResult(O o11) {
                safeContinuation.resumeWith(s.b(o11));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public abstract void launch(I input, ActivityResultCallback<O> callback);
}
