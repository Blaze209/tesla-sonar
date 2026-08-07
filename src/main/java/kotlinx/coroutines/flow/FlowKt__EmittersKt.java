package kotlinx.coroutines.flow;

import jn0.g;
import jn0.h0;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\t\u001a^\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000220\b\u0005\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a^\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u000220\b\u0005\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0081\b¢\u0006\u0004\b\n\u0010\t\u001aM\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0004\b\r\u0010\u000e\u001aU\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000220\u0010\f\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0004\b\u0010\u0010\t\u001aM\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u0017\u0010\u0012\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\\\u0010\u0017\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000420\u0010\f\u001a,\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "", "transform", "(Lkotlinx/coroutines/flow/Flow;Lwn0/q;)Lkotlinx/coroutines/flow/Flow;", "unsafeTransform", "Lkotlin/Function2;", "action", "onStart", "(Lkotlinx/coroutines/flow/Flow;Lwn0/p;)Lkotlinx/coroutines/flow/Flow;", "", "onCompletion", "onEmpty", "ensureActive", "(Lkotlinx/coroutines/flow/FlowCollector;)V", "cause", "invokeSafely$FlowKt__EmittersKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lwn0/q;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeSafely", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__EmittersKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1<R> extends SuspendLambda implements p<FlowCollector<? super R>, Continuation<? super h0>, Object> {
        final /* synthetic */ Flow<T> $this_transform;
        final /* synthetic */ q<FlowCollector<? super R>, T, Continuation<? super h0>, Object> $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
        public static final class C18731<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<R> $$this$flow;
            final /* synthetic */ q<FlowCollector<? super R>, T, Continuation<? super h0>, Object> $transform;

            /* JADX WARN: Multi-variable type inference failed */
            public C18731(q<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar, FlowCollector<? super R> flowCollector) {
                this.$transform = qVar;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t11, Continuation<? super h0> continuation) {
                FlowKt__EmittersKt$transform$1$1$emit$1 flowKt__EmittersKt$transform$1$1$emit$1;
                if (continuation instanceof FlowKt__EmittersKt$transform$1$1$emit$1) {
                    flowKt__EmittersKt$transform$1$1$emit$1 = (FlowKt__EmittersKt$transform$1$1$emit$1) continuation;
                    int i11 = flowKt__EmittersKt$transform$1$1$emit$1.label;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        flowKt__EmittersKt$transform$1$1$emit$1.label = i11 - Integer.MIN_VALUE;
                    } else {
                        flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, continuation);
                    }
                } else {
                    flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, continuation);
                }
                Object obj = flowKt__EmittersKt$transform$1$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = flowKt__EmittersKt$transform$1$1$emit$1.label;
                if (i12 == 0) {
                    t.b(obj);
                    q<FlowCollector<? super R>, T, Continuation<? super h0>, Object> qVar = this.$transform;
                    FlowCollector<R> flowCollector = this.$$this$flow;
                    flowKt__EmittersKt$transform$1$1$emit$1.label = 1;
                    if (qVar.invoke((FlowCollector<? super R>) flowCollector, t11, flowKt__EmittersKt$transform$1$1$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                return h0.f84049a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final Object emit$$forInline(T t11, Continuation<? super h0> continuation) {
                p013kotlin.jvm.internal.q.c(4);
                new FlowKt__EmittersKt$transform$1$1$emit$1(this, continuation);
                p013kotlin.jvm.internal.q.c(5);
                this.$transform.invoke((FlowCollector<? super R>) this.$$this$flow, t11, continuation);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> flow, q<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_transform = flow;
            this.$transform = qVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_transform, this.$transform, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1<R> for r5v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r6)
                goto L30
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                kotlinx.coroutines.flow.Flow<T> r1 = r5.$this_transform
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 r3 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1
                wn0.q<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r4 = r5.$transform
                r3.<init>(r4, r6)
                r5.label = r2
                java.lang.Object r6 = r1.collect(r3, r5)
                if (r6 != r0) goto L30
                return r0
            L30:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1<R> for r3v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r4 = r3.L$0
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                kotlinx.coroutines.flow.Flow<T> r0 = r3.$this_transform
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1
                wn0.q<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r2 = r3.$transform
                r1.<init>(r2, r4)
                r4 = 0
                p013kotlin.jvm.internal.q.c(r4)
                r0.collect(r1, r3)
                r4 = 1
                p013kotlin.jvm.internal.q.c(r4)
                jn0.h0 r4 = jn0.h0.f84049a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.AnonymousClass1.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super R> flowCollector, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object invokeSafely$FlowKt__EmittersKt(FlowCollector<? super T> flowCollector, q<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super h0>, ? extends Object> qVar, Throwable th2, Continuation<? super h0> continuation) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (continuation instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) continuation;
            int i11 = flowKt__EmittersKt$invokeSafely$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.label = i11 - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuation);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(continuation);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = flowKt__EmittersKt$invokeSafely$1.label;
        try {
            if (i12 == 0) {
                t.b(obj);
                flowKt__EmittersKt$invokeSafely$1.L$0 = th2;
                flowKt__EmittersKt$invokeSafely$1.label = 1;
                if (qVar.invoke(flowCollector, th2, flowKt__EmittersKt$invokeSafely$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) flowKt__EmittersKt$invokeSafely$1.L$0;
                t.b(obj);
            }
            return h0.f84049a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                g.a(th3, th2);
            }
            throw th3;
        }
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, q<? super FlowCollector<? super T>, ? super Throwable, ? super Continuation<? super h0>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(flow, qVar);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, p<? super FlowCollector<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(flow, pVar);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, p<? super FlowCollector<? super T>, ? super Continuation<? super h0>, ? extends Object> pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, flow);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, q<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar) {
        return FlowKt.flow(new AnonymousClass1(flow, qVar, null));
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, q<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super h0>, ? extends Object> qVar) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(flow, qVar);
    }
}
