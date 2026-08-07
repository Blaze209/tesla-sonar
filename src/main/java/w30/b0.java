package w30;

import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0087@¢\u0006\u0004\b\n\u0010\u000b\u001aF\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0087@¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lt30/f;", "Response", "Lw30/j0;", "stripeNetworkClient", "Lu30/b;", "stripeErrorJsonParser", "Lw30/k0;", "request", "Lu30/a;", "responseJsonParser", "a", "(Lw30/j0;Lu30/b;Lw30/k0;Lu30/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljn0/s;", "b", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b0 {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.RequestExecutorKt", f = "RequestExecutor.kt", i = {0, 0, 0}, l = {20}, m = "executeRequestWithModelJsonParser", n = {"stripeErrorJsonParser", "request", "responseJsonParser"}, s = {"L$0", "L$1", "L$2"})
    static final class a<Response extends t30.f> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f120554n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f120555o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f120556p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f120557q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f120558r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120557q = obj;
            this.f120558r |= Integer.MIN_VALUE;
            return b0.a(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.RequestExecutorKt", f = "RequestExecutor.kt", i = {0, 0, 0}, l = {54}, m = "executeRequestWithResultParser", n = {"stripeErrorJsonParser", "request", "responseJsonParser"}, s = {"L$0", "L$1", "L$2"})
    static final class b<Response extends t30.f> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f120559n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f120560o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f120561p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f120562q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f120563r;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120562q = obj;
            this.f120563r |= Integer.MIN_VALUE;
            Object objB = b0.b(null, null, null, null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.s.a(objB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <Response extends t30.f> Object a(j0 j0Var, u30.b bVar, k0 k0Var, u30.a<? extends Response> aVar, Continuation<? super Response> continuation) throws APIConnectionException, APIException {
        a aVar2;
        Object objB;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f120558r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f120558r = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object objA = aVar2.f120557q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f120558r;
        try {
            if (i12 == 0) {
                jn0.t.b(objA);
                jn0.s.Companion companion = jn0.s.INSTANCE;
                aVar2.f120554n = bVar;
                aVar2.f120555o = k0Var;
                aVar2.f120556p = aVar;
                aVar2.f120558r = 1;
                objA = j0Var.a(k0Var, aVar2);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (u30.a) aVar2.f120556p;
                k0Var = (k0) aVar2.f120555o;
                bVar = (u30.b) aVar2.f120554n;
                jn0.t.b(objA);
            }
            objB = jn0.s.b((l0) objA);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            throw new APIConnectionException("Failed to execute " + k0Var, thE);
        }
        l0 l0Var = (l0) objB;
        if (l0Var.getIsError()) {
            StripeError stripeErrorA = bVar.a(e0.a(l0Var));
            d0 requestId = l0Var.getRequestId();
            throw new APIException(stripeErrorA, requestId != null ? requestId.getValue() : null, l0Var.getCode(), null, null, 24, null);
        }
        t30.f fVarA = aVar.a(e0.a(l0Var));
        if (fVarA != null) {
            return fVarA;
        }
        throw new APIException(null, null, 0, aVar + " returns null for " + e0.a(l0Var), null, 23, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <Response extends t30.f> Object b(j0 j0Var, u30.b bVar, k0 k0Var, u30.a<? extends Response> aVar, Continuation<? super jn0.s<? extends Response>> continuation) {
        b bVar2;
        Object objB;
        Object objB2;
        if (continuation instanceof b) {
            bVar2 = (b) continuation;
            int i11 = bVar2.f120563r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar2.f120563r = i11 - Integer.MIN_VALUE;
            } else {
                bVar2 = new b(continuation);
            }
        } else {
            bVar2 = new b(continuation);
        }
        Object objA = bVar2.f120562q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar2.f120563r;
        try {
            if (i12 == 0) {
                jn0.t.b(objA);
                jn0.s.Companion companion = jn0.s.INSTANCE;
                bVar2.f120559n = bVar;
                bVar2.f120560o = k0Var;
                bVar2.f120561p = aVar;
                bVar2.f120563r = 1;
                objA = j0Var.a(k0Var, bVar2);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (u30.a) bVar2.f120561p;
                k0Var = (k0) bVar2.f120560o;
                bVar = (u30.b) bVar2.f120559n;
                jn0.t.b(objA);
            }
            objB = jn0.s.b((l0) objA);
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        Throwable thE = jn0.s.e(objB);
        if (thE != null) {
            return jn0.s.b(jn0.t.a(new APIConnectionException("Failed to execute " + k0Var, thE)));
        }
        l0 l0Var = (l0) objB;
        if (l0Var.getIsError()) {
            StripeError stripeErrorA = bVar.a(e0.a(l0Var));
            d0 requestId = l0Var.getRequestId();
            return jn0.s.b(jn0.t.a(new APIException(stripeErrorA, requestId != null ? requestId.getValue() : null, l0Var.getCode(), null, null, 24, null)));
        }
        try {
            objB2 = jn0.s.b(aVar.a(e0.a(l0Var)));
        } catch (Throwable th3) {
            jn0.s.Companion companion3 = jn0.s.INSTANCE;
            objB2 = jn0.s.b(jn0.t.a(th3));
        }
        t30.f fVar = (t30.f) (jn0.s.g(objB2) ? null : objB2);
        if (fVar != null) {
            return jn0.s.b(fVar);
        }
        return jn0.s.b(jn0.t.a(new APIException(null, null, 0, aVar + " returns null for " + e0.a(l0Var), null, 23, null)));
    }
}
