package kotlinx.coroutines.rx3;

import ch.qos.logback.core.CoreConstants;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.r;
import io.reactivex.rxjava3.core.s;
import io.reactivex.rxjava3.core.u;
import java.util.concurrent.atomic.AtomicReference;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.reactive.ReactiveFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a2\u0010\t\u001a\n\u0012\u0006\u0012\u0004\b\u00028\u00000\b\"\u0004\b\u0000\u0010\u0006*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00072\u0006\u0010\u0002\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0006*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\b\b\u0000\u0010\u0006*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a1\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0006*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\b\b\u0000\u0010\u0006*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\b\b\u0000\u0010\u0006*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u0018\u001a3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0006*\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00102\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u0015\u0082\u0002\u0004\n\u0002\b9¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/rxjava3/core/b;", "asCompletable", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/rxjava3/core/b;", "T", "Lkotlinx/coroutines/Deferred;", "Lio/reactivex/rxjava3/core/j;", "asMaybe", "(Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/rxjava3/core/j;", "", "Lio/reactivex/rxjava3/core/u;", "asSingle", "(Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/rxjava3/core/u;", "Lio/reactivex/rxjava3/core/r;", "Lkotlinx/coroutines/flow/Flow;", "asFlow", "(Lio/reactivex/rxjava3/core/r;)Lkotlinx/coroutines/flow/Flow;", "Lio/reactivex/rxjava3/core/o;", "asObservable", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/rxjava3/core/o;", "Lio/reactivex/rxjava3/core/h;", "asFlowable", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lio/reactivex/rxjava3/core/h;", "from", "_asFlowable", "_asObservable", "kotlinx-coroutines-rx3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class RxConvertKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxConvertKt$asCompletable$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asCompletable$1", f = "RxConvert.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
        final /* synthetic */ Job $this_asCompletable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Job job, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_asCompletable = job;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_asCompletable, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                Job job = this.$this_asCompletable;
                this.label = 1;
                if (job.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxConvertKt$asFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lkotlinx/coroutines/channels/ProducerScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/channels/ProducerScope;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asFlow$1", f = "RxConvert.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    static final class C47831<T> extends SuspendLambda implements p<ProducerScope<? super T>, Continuation<? super h0>, Object> {
        final /* synthetic */ r<T> $this_asFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47831(r<T> rVar, Continuation<? super C47831> continuation) {
            super(2, continuation);
            this.$this_asFlow = rVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 invokeSuspend$lambda$0(AtomicReference atomicReference) {
            am0.b bVar = (am0.b) atomicReference.getAndSet(am0.b.c());
            if (bVar != null) {
                bVar.dispose();
            }
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            C47831 c47831 = new C47831(this.$this_asFlow, continuation);
            c47831.L$0 = obj;
            return c47831;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                final AtomicReference atomicReference = new AtomicReference();
                this.$this_asFlow.a(new s<T>() { // from class: kotlinx.coroutines.rx3.RxConvertKt$asFlow$1$observer$1
                    @Override // io.reactivex.rxjava3.core.s
                    public void onComplete() {
                        SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
                    }

                    @Override // io.reactivex.rxjava3.core.s
                    public void onError(Throwable e11) {
                        producerScope.close(e11);
                    }

                    @Override // io.reactivex.rxjava3.core.s
                    public void onNext(T t11) {
                        try {
                            ChannelsKt.trySendBlocking(producerScope, t11);
                        } catch (InterruptedException unused) {
                        }
                    }

                    @Override // io.reactivex.rxjava3.core.s
                    public void onSubscribe(am0.b d11) {
                        if (androidx.camera.view.i.a(atomicReference, null, d11)) {
                            return;
                        }
                        d11.dispose();
                    }
                });
                wn0.a aVar = new wn0.a() { // from class: kotlinx.coroutines.rx3.h
                    @Override // wn0.a
                    public final Object invoke() {
                        return RxConvertKt.C47831.invokeSuspend$lambda$0(atomicReference);
                    }
                };
                this.label = 1;
                if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(ProducerScope<? super T> producerScope, Continuation<? super h0> continuation) {
            return ((C47831) create(producerScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxConvertKt$asMaybe$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asMaybe$1", f = "RxConvert.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    static final class C47841<T> extends SuspendLambda implements p<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Deferred<T> $this_asMaybe;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C47841(Deferred<? extends T> deferred, Continuation<? super C47841> continuation) {
            super(2, continuation);
            this.$this_asMaybe = deferred;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C47841(this.$this_asMaybe, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            Deferred<T> deferred = this.$this_asMaybe;
            this.label = 1;
            Object objAwait = deferred.await(this);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C47841) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.rx3.RxConvertKt$asSingle$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H\n"}, d2 = {"<anonymous>", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.rx3.RxConvertKt$asSingle$1", f = "RxConvert.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class C47851<T> extends SuspendLambda implements p<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Deferred<T> $this_asSingle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C47851(Deferred<? extends T> deferred, Continuation<? super C47851> continuation) {
            super(2, continuation);
            this.$this_asSingle = deferred;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C47851(this.$this_asSingle, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                return obj;
            }
            t.b(obj);
            Deferred<T> deferred = this.$this_asSingle;
            this.label = 1;
            Object objAwait = deferred.await(this);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
            return ((C47851) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final io.reactivex.rxjava3.core.b asCompletable(Job job, CoroutineContext coroutineContext) {
        return RxCompletableKt.rxCompletable(coroutineContext, new AnonymousClass1(job, null));
    }

    public static final <T> Flow<T> asFlow(r<T> rVar) {
        return FlowKt.callbackFlow(new C47831(rVar, null));
    }

    public static final <T> io.reactivex.rxjava3.core.h<T> asFlowable(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        return io.reactivex.rxjava3.core.h.k(ReactiveFlowKt.asPublisher(flow, coroutineContext));
    }

    public static /* synthetic */ io.reactivex.rxjava3.core.h asFlowable$default(Flow flow, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return asFlowable(flow, coroutineContext);
    }

    public static final <T> io.reactivex.rxjava3.core.j<T> asMaybe(Deferred<? extends T> deferred, CoroutineContext coroutineContext) {
        return RxMaybeKt.rxMaybe(coroutineContext, new C47841(deferred, null));
    }

    public static final <T> io.reactivex.rxjava3.core.o<T> asObservable(final Flow<? extends T> flow, final CoroutineContext coroutineContext) {
        return io.reactivex.rxjava3.core.o.g(new q() { // from class: kotlinx.coroutines.rx3.g
            @Override // io.reactivex.rxjava3.core.q
            public final void a(io.reactivex.rxjava3.core.p pVar) {
                RxConvertKt.asObservable$lambda$0(coroutineContext, flow, pVar);
            }
        });
    }

    public static /* synthetic */ io.reactivex.rxjava3.core.o asObservable$default(Flow flow, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return asObservable(flow, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void asObservable$lambda$0(CoroutineContext coroutineContext, Flow flow, io.reactivex.rxjava3.core.p pVar) {
        pVar.b(new RxCancellable(BuildersKt.launch(GlobalScope.INSTANCE, Dispatchers.getUnconfined().plus(coroutineContext), CoroutineStart.ATOMIC, new RxConvertKt$asObservable$1$job$1(flow, pVar, null))));
    }

    public static final <T> u<T> asSingle(Deferred<? extends T> deferred, CoroutineContext coroutineContext) {
        return RxSingleKt.rxSingle(coroutineContext, new C47851(deferred, null));
    }

    public static /* synthetic */ io.reactivex.rxjava3.core.h from$default(Flow flow, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return asFlowable(flow, coroutineContext);
    }

    /* JADX INFO: renamed from: from$default, reason: collision with other method in class */
    public static /* synthetic */ io.reactivex.rxjava3.core.o m589from$default(Flow flow, CoroutineContext coroutineContext, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return asObservable(flow, coroutineContext);
    }
}
