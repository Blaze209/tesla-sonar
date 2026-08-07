package i70;

import jn0.h0;
import kotlinx.coroutines.CompletableDeferred;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0082@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "Ljn0/h0;", "b", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g {

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends u implements wn0.a<Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CompletableDeferred f76102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CompletableDeferred completableDeferred) {
            super(0);
            this.f76102c = completableDeferred;
        }

        @Override // wn0.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f76102c.complete(h0.f84049a));
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.core.authentication.PaymentNextActionHandlerKt", f = "PaymentNextActionHandler.kt", i = {0}, l = {61, 49}, m = "awaitResumed", n = {"completable"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f76103n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f76104o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f76105p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f76104o = obj;
            this.f76105p |= Integer.MIN_VALUE;
            return g.b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (r11.await(r6) == r0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.p003lifecycle.LifecycleOwner r10, p013kotlin.coroutines.Continuation<? super jn0.h0> r11) {
        /*
            boolean r0 = r11 instanceof i70.g.b
            if (r0 == 0) goto L14
            r0 = r11
            i70.g$b r0 = (i70.g.b) r0
            int r1 = r0.f76105p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f76105p = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            i70.g$b r0 = new i70.g$b
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f76104o
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f76105p
            r7 = 2
            r8 = 0
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L38
            if (r1 != r7) goto L30
            jn0.t.b(r11)
            goto L9f
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            java.lang.Object r10 = r6.f76103n
            kotlinx.coroutines.CompletableDeferred r10 = (kotlinx.coroutines.CompletableDeferred) r10
            jn0.t.b(r11)
            goto L93
        L40:
            jn0.t.b(r11)
            kotlinx.coroutines.CompletableDeferred r11 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(r8, r2, r8)
            androidx.lifecycle.Lifecycle r1 = r10.getLifecycle()
            r10 = r2
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.RESUMED
            kotlinx.coroutines.MainCoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.MainCoroutineDispatcher r4 = r3.getImmediate()
            kotlin.coroutines.CoroutineContext r3 = r6.getContext()
            boolean r3 = r4.isDispatchNeeded(r3)
            if (r3 != 0) goto L82
            androidx.lifecycle.Lifecycle$State r5 = r1.getState()
            androidx.lifecycle.Lifecycle$State r9 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r5 == r9) goto L7c
            androidx.lifecycle.Lifecycle$State r5 = r1.getState()
            int r5 = r5.compareTo(r2)
            if (r5 < 0) goto L82
            jn0.h0 r10 = jn0.h0.f84049a
            boolean r10 = r11.complete(r10)
            p013kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r10)
            goto L94
        L7c:
            androidx.lifecycle.LifecycleDestroyedException r10 = new androidx.lifecycle.LifecycleDestroyedException
            r10.<init>()
            throw r10
        L82:
            i70.g$a r5 = new i70.g$a
            r5.<init>(r11)
            r6.f76103n = r11
            r6.f76105p = r10
            java.lang.Object r10 = androidx.p003lifecycle.i1.a(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L92
            goto L9e
        L92:
            r10 = r11
        L93:
            r11 = r10
        L94:
            r6.f76103n = r8
            r6.f76105p = r7
            java.lang.Object r10 = r11.await(r6)
            if (r10 != r0) goto L9f
        L9e:
            return r0
        L9f:
            jn0.h0 r10 = jn0.h0.f84049a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i70.g.b(androidx.lifecycle.LifecycleOwner, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
