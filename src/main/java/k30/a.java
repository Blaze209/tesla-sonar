package k30;

import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\\\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006H\u0080@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/Function1;", "", "Ljn0/h0;", "onFailure", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "task", "Ljn0/s;", "a", "(Lkotlin/coroutines/CoroutineContext;Lwn0/l;Lwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: k30.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.common.coroutines.CoroutinesKtxKt", f = "CoroutinesKtx.kt", i = {}, l = {26}, m = "runCatching", n = {}, s = {})
    static final class C1790a<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f84896n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f84897o;

        C1790a(Continuation<? super C1790a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f84896n = obj;
            this.f84897o |= Integer.MIN_VALUE;
            Object objA = a.a(null, null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.common.coroutines.CoroutinesKtxKt$runCatching$2", f = "CoroutinesKtx.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends T>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f84898n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f84899o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<CoroutineScope, Continuation<? super T>, Object> f84900p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ l<Throwable, h0> f84901q;

        /* JADX INFO: renamed from: k30.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.common.coroutines.CoroutinesKtxKt$runCatching$2$1$1", f = "CoroutinesKtx.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
        static final class C1791a extends SuspendLambda implements p<CoroutineScope, Continuation<? super T>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f84902n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f84903o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ p<CoroutineScope, Continuation<? super T>, Object> f84904p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1791a(p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super C1791a> continuation) {
                super(2, continuation);
                this.f84904p = pVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                C1791a c1791a = new C1791a(this.f84904p, continuation);
                c1791a.f84903o = obj;
                return c1791a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f84902n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f84903o;
                p<CoroutineScope, Continuation<? super T>, Object> pVar = this.f84904p;
                this.f84902n = 1;
                Object objInvoke = pVar.invoke(coroutineScope, this);
                return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
                return ((C1791a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, l<? super Throwable, h0> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f84900p = pVar;
            this.f84901q = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f84900p, this.f84901q, continuation);
            bVar.f84899o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f84898n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    p<CoroutineScope, Continuation<? super T>, Object> pVar = this.f84900p;
                    s.Companion companion = s.INSTANCE;
                    C1791a c1791a = new C1791a(pVar, null);
                    this.f84898n = 1;
                    obj = CoroutineScopeKt.coroutineScope(c1791a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                objB = s.b(obj);
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
            l<Throwable, h0> lVar = this.f84901q;
            Throwable thE = s.e(objB);
            if (thE != null && lVar != null) {
                lVar.invoke(thE);
            }
            return s.a(objB);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends T>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object a(CoroutineContext coroutineContext, l<? super Throwable, h0> lVar, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super s<? extends T>> continuation) {
        C1790a c1790a;
        if (continuation instanceof C1790a) {
            c1790a = (C1790a) continuation;
            int i11 = c1790a.f84897o;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1790a.f84897o = i11 - Integer.MIN_VALUE;
            } else {
                c1790a = new C1790a(continuation);
            }
        } else {
            c1790a = new C1790a(continuation);
        }
        Object objWithContext = c1790a.f84896n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1790a.f84897o;
        if (i12 == 0) {
            t.b(objWithContext);
            b bVar = new b(pVar, lVar, null);
            c1790a.f84897o = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, bVar, c1790a);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, l lVar, p pVar, Continuation continuation, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = null;
        }
        return a(coroutineContext, lVar, pVar, continuation);
    }
}
