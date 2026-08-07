package pi;

import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import wn0.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a[\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", "", "", "transform", "a", "(Lkotlinx/coroutines/flow/Flow;Lwn0/q;)Lkotlinx/coroutines/flow/Flow;", "apollo-runtime"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class g {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.apollographql.apollo3.internal.FlowsKt$transformWhile$1", f = "flows.kt", i = {0}, l = {61}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    static final class a<R> extends SuspendLambda implements p<FlowCollector<? super R>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f103005n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f103006o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ Flow<T> f103007p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ q<FlowCollector<? super R>, T, Continuation<? super Boolean>, Object> f103008q;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: pi.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"pi/g$a$a", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class C2185a<T> implements FlowCollector<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f103009a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FlowCollector f103010b;

            /* JADX INFO: renamed from: pi.g$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo3.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "flows.kt", i = {0}, l = {53}, m = "emit", n = {"this"}, s = {"L$0"})
            public static final class C2186a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f103011n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f103012o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                int f103013p;

                public C2186a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f103012o = obj;
                    this.f103013p |= Integer.MIN_VALUE;
                    return C2185a.this.emit(null, this);
                }
            }

            public C2185a(q qVar, FlowCollector flowCollector) {
                this.f103009a = qVar;
                this.f103010b = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public Object emit(T t11, Continuation<? super h0> continuation) {
                C2186a c2186a;
                C2185a<T> c2185a;
                if (continuation instanceof C2186a) {
                    c2186a = (C2186a) continuation;
                    int i11 = c2186a.f103013p;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2186a.f103013p = i11 - Integer.MIN_VALUE;
                    } else {
                        c2186a = new C2186a(continuation);
                    }
                } else {
                    c2186a = new C2186a(continuation);
                }
                Object objInvoke = c2186a.f103012o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2186a.f103013p;
                if (i12 == 0) {
                    t.b(objInvoke);
                    q qVar = this.f103009a;
                    FlowCollector flowCollector = this.f103010b;
                    c2186a.f103011n = this;
                    c2186a.f103013p = 1;
                    p013kotlin.jvm.internal.q.c(6);
                    objInvoke = qVar.invoke(flowCollector, t11, c2186a);
                    p013kotlin.jvm.internal.q.c(7);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c2185a = this;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2185a = (C2185a) c2186a.f103011n;
                    t.b(objInvoke);
                }
                if (((Boolean) objInvoke).booleanValue()) {
                    return h0.f84049a;
                }
                throw new pi.a(c2185a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2185a f103015a;

            public b(C2185a c2185a) {
                this.f103015a = c2185a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t11, Continuation<? super h0> continuation) {
                Object objEmit = this.f103015a.emit(t11, continuation);
                return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Flow<? extends T> flow, q<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> qVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f103007p = flow;
            this.f103008q = qVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f103007p, this.f103008q, continuation);
            aVar.f103006o = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to pi.g$a<R> for r5v1 'this'  kotlin.coroutines.Continuation
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
                int r1 = r5.f103005n
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.f103006o
                pi.g$a$a r0 = (pi.g.a.C2185a) r0
                jn0.t.b(r6)     // Catch: pi.a -> L13
                goto L42
            L13:
                r6 = move-exception
                goto L3f
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f103006o
                kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                kotlinx.coroutines.flow.Flow<T> r1 = r5.f103007p
                wn0.q<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f103008q
                pi.g$a$a r4 = new pi.g$a$a
                r4.<init>(r3, r6)
                pi.g$a$b r6 = new pi.g$a$b     // Catch: pi.a -> L3d
                r6.<init>(r4)     // Catch: pi.a -> L3d
                r5.f103006o = r4     // Catch: pi.a -> L3d
                r5.f103005n = r2     // Catch: pi.a -> L3d
                java.lang.Object r6 = r1.collect(r6, r5)     // Catch: pi.a -> L3d
                if (r6 != r0) goto L42
                return r0
            L3d:
                r6 = move-exception
                r0 = r4
            L3f:
                r6.a(r0)
            L42:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pi.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super R> flowCollector, Continuation<? super h0> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <T, R> Flow<R> a(Flow<? extends T> flow, q<? super FlowCollector<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> transform) {
        s.k(flow, "<this>");
        s.k(transform, "transform");
        return FlowKt.flow(new a(flow, transform, null));
    }
}
