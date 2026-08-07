package p020r2;

import androidx.collection.l0;
import androidx.collection.v0;
import androidx.compose.runtime.snapshots.e;
import androidx.compose.runtime.snapshots.g;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Collection;
import java.util.Set;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.EmptyCoroutineContext;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.u;
import t2.d;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00028\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0015\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"T", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lr2/y3;", "c", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Lr2/l;II)Lr2/y3;", "R", "Lkotlinx/coroutines/flow/Flow;", "initial", "b", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Lr2/l;II)Lr2/y3;", "Lkotlin/Function0;", "block", "e", "(Lwn0/a;)Lkotlinx/coroutines/flow/Flow;", "Landroidx/collection/l0;", "", "", "set", "", DateTokenConverter.CONVERTER_KEY, "(Landroidx/collection/l0;Ljava/util/Set;)Z", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class q3 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lr2/e2;", "Ljn0/h0;", "<anonymous>", "(Lr2/e2;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
    static final class a<R> extends SuspendLambda implements p<e2<R>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f106763n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f106764o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f106765p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Flow<T> f106766q;

        /* JADX INFO: renamed from: r2.q3$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "it", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        static final class C2265a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e2<R> f106767a;

            C2265a(e2<R> e2Var) {
                this.f106767a = e2Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t11, Continuation<? super h0> continuation) {
                this.f106767a.setValue(t11);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f106768n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ Flow<T> f106769o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ e2<R> f106770p;

            /* JADX INFO: renamed from: r2.q3$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "it", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            static final class C2266a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ e2<R> f106771a;

                C2266a(e2<R> e2Var) {
                    this.f106771a = e2Var;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t11, Continuation<? super h0> continuation) {
                    this.f106771a.setValue(t11);
                    return h0.f84049a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Flow<? extends T> flow, e2<R> e2Var, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f106769o = flow;
                this.f106770p = e2Var;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f106769o, this.f106770p, continuation);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to r2.q3$a$b for r4v1 'this'  kotlin.coroutines.Continuation
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r4.f106768n
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    jn0.t.b(r5)
                    goto L2c
                Lf:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L17:
                    jn0.t.b(r5)
                    kotlinx.coroutines.flow.Flow<T> r5 = r4.f106769o
                    r2.q3$a$b$a r1 = new r2.q3$a$b$a
                    r2.e2<R> r3 = r4.f106770p
                    r1.<init>(r3)
                    r4.f106768n = r2
                    java.lang.Object r5 = r5.collect(r1, r4)
                    if (r5 != r0) goto L2c
                    return r0
                L2c:
                    jn0.h0 r5 = jn0.h0.f84049a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: r2.q3.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(CoroutineContext coroutineContext, Flow<? extends T> flow, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f106765p = coroutineContext;
            this.f106766q = flow;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e2<R> e2Var, Continuation<? super h0> continuation) {
            return ((a) create(e2Var, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f106765p, this.f106766q, continuation);
            aVar.f106764o = obj;
            return aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to r2.q3$a<R> for r6v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f106763n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                jn0.t.b(r7)
                goto L4f
            L1b:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f106764o
                r2.e2 r7 = (p020r2.e2) r7
                kotlin.coroutines.CoroutineContext r1 = r6.f106765p
                kotlin.coroutines.EmptyCoroutineContext r4 = p013kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                boolean r1 = p013kotlin.jvm.internal.s.f(r1, r4)
                if (r1 == 0) goto L3c
                kotlinx.coroutines.flow.Flow<T> r1 = r6.f106766q
                r2.q3$a$a r2 = new r2.q3$a$a
                r2.<init>(r7)
                r6.f106763n = r3
                java.lang.Object r7 = r1.collect(r2, r6)
                if (r7 != r0) goto L4f
                goto L4e
            L3c:
                kotlin.coroutines.CoroutineContext r1 = r6.f106765p
                r2.q3$a$b r3 = new r2.q3$a$b
                kotlinx.coroutines.flow.Flow<T> r4 = r6.f106766q
                r5 = 0
                r3.<init>(r4, r7, r5)
                r6.f106763n = r2
                java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.q3.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {148, 152, 174}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class b<T> extends SuspendLambda implements p<FlowCollector<? super T>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f106772n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f106773o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f106774p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f106775q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f106776r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f106777s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f106778t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private /* synthetic */ Object f106779u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ wn0.a<T> f106780v;

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Ljn0/h0;", "b", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends u implements l<Object, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l0<Object> f106781c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l0<Object> l0Var) {
                super(1);
                this.f106781c = l0Var;
            }

            public final void b(Object obj) {
                if (obj instanceof b3.l) {
                    ((b3.l) obj).E(e.a(4));
                }
                this.f106781c.h(obj);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
                b(obj);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: r2.q3$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "", "", "changed", "Landroidx/compose/runtime/snapshots/g;", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/g;)V"}, k = 3, mv = {1, 8, 0})
        static final class C2267b extends u implements p<Set<? extends Object>, g, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Channel<Set<Object>> f106782c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2267b(Channel<Set<Object>> channel) {
                super(2);
                this.f106782c = channel;
            }

            public final void a(Set<? extends Object> set, g gVar) {
                if (!(set instanceof d)) {
                    Set<? extends Object> set2 = set;
                    if ((set2 instanceof Collection) && set2.isEmpty()) {
                        return;
                    }
                    for (T t11 : set2) {
                        if (!(t11 instanceof b3.l) || ((b3.l) t11).D(e.a(4))) {
                        }
                    }
                    return;
                }
                v0<T> v0VarB = ((d) set).b();
                Object[] objArr = v0VarB.elements;
                long[] jArr = v0VarB.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i11 = 0;
                loop0: while (true) {
                    long j11 = jArr[i11];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((255 & j11) < 128) {
                                Object obj = objArr[(i11 << 3) + i13];
                                if (!(obj instanceof b3.l) || ((b3.l) obj).D(e.a(4))) {
                                    break loop0;
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i12 != 8) {
                            return;
                        }
                    }
                    if (i11 == length) {
                        return;
                    } else {
                        i11++;
                    }
                }
                this.f106782c.mo85trySendJP2dKIU(set);
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Set<? extends Object> set, g gVar) {
                a(set, gVar);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.a<? extends T> aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f106780v = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f106780v, continuation);
            bVar.f106779u = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:33:0x00cb A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:15:0x0050, B:31:0x00c7, B:33:0x00cb, B:38:0x00d5, B:41:0x00e3, B:45:0x00f9, B:47:0x0102, B:55:0x011e, B:56:0x0121, B:42:0x00ee, B:44:0x00f6, B:53:0x011a, B:54:0x011d), top: B:68:0x0050, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e3 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:15:0x0050, B:31:0x00c7, B:33:0x00cb, B:38:0x00d5, B:41:0x00e3, B:45:0x00f9, B:47:0x0102, B:55:0x011e, B:56:0x0121, B:42:0x00ee, B:44:0x00f6, B:53:0x011a, B:54:0x011d), top: B:68:0x0050, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0102 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:15:0x0050, B:31:0x00c7, B:33:0x00cb, B:38:0x00d5, B:41:0x00e3, B:45:0x00f9, B:47:0x0102, B:55:0x011e, B:56:0x0121, B:42:0x00ee, B:44:0x00f6, B:53:0x011a, B:54:0x011d), top: B:68:0x0050, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:58:0x0123  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:41:0x00e3, B:57:0x0122], limit reached: 74 */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v8, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r11v5 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 312
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.q3.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super h0> continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <T extends R, R> y3<R> b(Flow<? extends T> flow, R r11, CoroutineContext coroutineContext, l lVar, int i11, int i12) {
        if ((i12 & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (o.J()) {
            o.S(-606625098, i11, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean zK = lVar.K(coroutineContext2) | lVar.K(flow);
        Object objI = lVar.I();
        if (zK || objI == l.INSTANCE.a()) {
            objI = new a(coroutineContext2, flow, null);
            lVar.B(objI);
        }
        y3<R> y3VarK = n3.k(r11, flow, coroutineContext2, (p) objI, lVar, ((i11 >> 3) & 14) | ((i11 << 3) & 112) | (i11 & 896));
        if (o.J()) {
            o.R();
        }
        return y3VarK;
    }

    public static final <T> y3<T> c(StateFlow<? extends T> stateFlow, CoroutineContext coroutineContext, l lVar, int i11, int i12) {
        if ((i12 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (o.J()) {
            o.S(-1439883919, i11, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        y3<T> y3VarA = n3.a(stateFlow, stateFlow.getValue(), coroutineContext2, lVar, (i11 & 14) | ((i11 << 3) & 896), 0);
        if (o.J()) {
            o.R();
        }
        return y3VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public static final boolean d(l0<Object> l0Var, Set<? extends Object> set) {
        Object[] objArr = l0Var.elements;
        long[] jArr = l0Var.com.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && set.contains(objArr[(i11 << 3) + i13])) {
                            return true;
                        }
                        j11 >>= 8;
                    }
                    if (i12 == 8) {
                        if (i11 != length) {
                            i11++;
                        }
                    }
                } else if (i11 != length) {
                    i11++;
                }
            }
        }
        return false;
    }

    public static final <T> Flow<T> e(wn0.a<? extends T> aVar) {
        return FlowKt.flow(new b(aVar, null));
    }
}
