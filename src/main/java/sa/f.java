package sa;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.n0;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", i = {}, l = {171}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f110661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f110662o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final /* synthetic */ n0<i> f110663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final /* synthetic */ k f110664q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n0<i> n0Var, k kVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f110663p = n0Var;
        this.f110664q = kVar;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        return new f(this.f110663p, this.f110664q, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n0<i> n0Var;
        T t11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f110662o;
        if (i11 == 0) {
            t.b(obj);
            n0<i> n0Var2 = this.f110663p;
            k kVar = this.f110664q;
            this.f110661n = n0Var2;
            this.f110662o = 1;
            Object objA = kVar.a(this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            n0Var = n0Var2;
            t11 = objA;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n0Var = (n0) this.f110661n;
            t.b(obj);
            t11 = obj;
        }
        n0Var.f86529a = t11;
        return h0.f84049a;
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
