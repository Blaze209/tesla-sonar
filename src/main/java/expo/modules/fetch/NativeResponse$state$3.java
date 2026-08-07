package expo.modules.fetch;

import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "expo.modules.fetch.NativeResponse$state$3", f = "NativeResponse.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class NativeResponse$state$3 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ ResponseState $value;
    int label;
    final /* synthetic */ NativeResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NativeResponse$state$3(NativeResponse nativeResponse, ResponseState responseState, Continuation<? super NativeResponse$state$3> continuation) {
        super(2, continuation);
        this.this$0 = nativeResponse;
        this.$value = responseState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(ResponseState responseState, l lVar) {
        return ((Boolean) lVar.invoke(responseState)).booleanValue();
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new NativeResponse$state$3(this.this$0, this.$value, continuation);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        List list = this.this$0.stateChangeOnceListeners;
        final ResponseState responseState = this.$value;
        v.L(list, new l() { // from class: expo.modules.fetch.g
            @Override // wn0.l
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(NativeResponse$state$3.invokeSuspend$lambda$0(responseState, (l) obj2));
            }
        });
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((NativeResponse$state$3) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
