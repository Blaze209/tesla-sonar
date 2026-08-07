package sa;

import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.ContinuationInterceptor;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a9\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "a", "(Lwn0/p;)Ljava/lang/Object;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class n {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends SuspendLambda implements p<CoroutineScope, Continuation<? super T>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110751n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f110752o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<CoroutineScope, Continuation<? super T>, Object> f110753p;

        /* JADX INFO: renamed from: sa.n$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
        static final class C2358a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f110754n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f110755o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ CompletableDeferred<T> f110756p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ p<CoroutineScope, Continuation<? super T>, Object> f110757q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2358a(CompletableDeferred<T> completableDeferred, p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super C2358a> continuation) {
                super(2, continuation);
                this.f110756p = completableDeferred;
                this.f110757q = pVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                C2358a c2358a = new C2358a(this.f110756p, this.f110757q, continuation);
                c2358a.f110755o = obj;
                return c2358a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CompletableDeferred<T> completableDeferred;
                Object objB;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f110754n;
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f110755o;
                    CompletableDeferred<T> completableDeferred2 = this.f110756p;
                    p<CoroutineScope, Continuation<? super T>, Object> pVar = this.f110757q;
                    try {
                        s.Companion companion = s.INSTANCE;
                        this.f110755o = completableDeferred2;
                        this.f110754n = 1;
                        obj = pVar.invoke(coroutineScope, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        completableDeferred = completableDeferred2;
                    } catch (Throwable th2) {
                        th = th2;
                        completableDeferred = completableDeferred2;
                        s.Companion companion2 = s.INSTANCE;
                        objB = s.b(t.a(th));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completableDeferred = (CompletableDeferred) this.f110755o;
                    try {
                        t.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        s.Companion companion3 = s.INSTANCE;
                        objB = s.b(t.a(th));
                    }
                }
                objB = s.b(obj);
                CompletableDeferredKt.completeWith(completableDeferred, objB);
                return h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((C2358a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super T>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f110758n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ CompletableDeferred<T> f110759o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CompletableDeferred<T> completableDeferred, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f110759o = completableDeferred;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f110759o, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f110758n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    return obj;
                }
                t.b(obj);
                CompletableDeferred<T> completableDeferred = this.f110759o;
                this.f110758n = 1;
                Object objAwait = completableDeferred.await(this);
                return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f110753p = pVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f110753p, continuation);
            aVar.f110752o = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f110751n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            CoroutineContext.Element element = ((CoroutineScope) this.f110752o).getCoroutineContext().get(ContinuationInterceptor.INSTANCE);
            p013kotlin.jvm.internal.s.h(element);
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) element;
            CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
            BuildersKt.launch(GlobalScope.INSTANCE, continuationInterceptor, CoroutineStart.UNDISPATCHED, new C2358a(completableDeferredCompletableDeferred$default, this.f110753p, null));
            while (!completableDeferredCompletableDeferred$default.isCompleted()) {
                try {
                    return BuildersKt.runBlocking(continuationInterceptor, new b(completableDeferredCompletableDeferred$default, null));
                } catch (InterruptedException unused) {
                }
            }
            return completableDeferredCompletableDeferred$default.getCompleted();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <T> T a(p<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> block) {
        p013kotlin.jvm.internal.s.k(block, "block");
        Thread.interrupted();
        return (T) BuildersKt__BuildersKt.runBlocking$default(null, new a(block, null), 1, null);
    }
}
