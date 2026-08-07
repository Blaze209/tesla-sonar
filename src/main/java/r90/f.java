package r90;

import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.e2;
import p020r2.l;
import p020r2.o;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a]\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lkotlin/Function0;", "produceInitialValue", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function2;", "Lr2/e2;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "producer", "Lr2/y3;", "b", "(Lwn0/a;Ljava/lang/Object;Lwn0/p;Lr2/l;I)Lr2/y3;", "Lkotlinx/coroutines/flow/StateFlow;", "a", "(Lkotlinx/coroutines/flow/StateFlow;Lr2/l;I)Lr2/y3;", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "T", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a<T> extends u implements wn0.a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ StateFlow<T> f107387c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(StateFlow<? extends T> stateFlow) {
            super(0);
            this.f107387c = stateFlow;
        }

        @Override // wn0.a
        public final T invoke() {
            return this.f107387c.getValue();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lr2/e2;", "Ljn0/h0;", "<anonymous>", "(Lr2/e2;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.utils.StateFlowsComposeKt$collectAsState$2", f = "StateFlowsCompose.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class b<T> extends SuspendLambda implements p<e2<T>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f107388n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f107389o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ StateFlow<T> f107390p;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e2<T> f107391a;

            a(e2<T> e2Var) {
                this.f107391a = e2Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t11, Continuation<? super h0> continuation) {
                this.f107391a.setValue(t11);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(StateFlow<? extends T> stateFlow, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f107390p = stateFlow;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e2<T> e2Var, Continuation<? super h0> continuation) {
            return ((b) create(e2Var, continuation)).invokeSuspend(h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f107390p, continuation);
            bVar.f107389o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f107388n;
            if (i11 == 0) {
                t.b(obj);
                e2 e2Var = (e2) this.f107389o;
                StateFlow<T> stateFlow = this.f107390p;
                a aVar = new a(e2Var);
                this.f107388n = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.utils.StateFlowsComposeKt$produceState$1", f = "StateFlowsCompose.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f107392n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f107393o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p<e2<T>, Continuation<? super h0>, Object> f107394p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p1<T> f107395q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, p1<T> p1Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f107394p = pVar;
            this.f107395q = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f107394p, this.f107395q, continuation);
            cVar.f107393o = obj;
            return cVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to r90.f$c for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f107392n
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                jn0.t.b(r6)
                goto L34
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f107393o
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                wn0.p<r2.e2<T>, kotlin.coroutines.Continuation<? super jn0.h0>, java.lang.Object> r1 = r5.f107394p
                r90.d r3 = new r90.d
                r2.p1<T> r4 = r5.f107395q
                kotlin.coroutines.CoroutineContext r6 = r6.getCoroutineContext()
                r3.<init>(r4, r6)
                r5.f107392n = r2
                java.lang.Object r6 = r1.invoke(r3, r5)
                if (r6 != r0) goto L34
                return r0
            L34:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r90.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public static final <T> y3<T> a(StateFlow<? extends T> stateFlow, l lVar, int i11) {
        s.k(stateFlow, "<this>");
        lVar.H(-419709006);
        if (o.J()) {
            o.S(-419709006, i11, -1, "com.stripe.android.uicore.utils.collectAsState (StateFlowsCompose.kt:42)");
        }
        lVar.H(-2023564304);
        Object objI = lVar.I();
        if (objI == l.INSTANCE.a()) {
            objI = new a(stateFlow);
            lVar.B(objI);
        }
        lVar.T();
        y3<T> y3VarB = b((wn0.a) objI, stateFlow, new b(stateFlow, null), lVar, 582);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return y3VarB;
    }

    private static final <T> y3<T> b(wn0.a<? extends T> aVar, Object obj, p<? super e2<T>, ? super Continuation<? super h0>, ? extends Object> pVar, l lVar, int i11) {
        lVar.H(2085798134);
        if (o.J()) {
            o.S(2085798134, i11, -1, "com.stripe.android.uicore.utils.produceState (StateFlowsCompose.kt:32)");
        }
        lVar.H(-1742439704);
        Object objI = lVar.I();
        if (objI == l.INSTANCE.a()) {
            objI = s3.d(aVar.invoke(), null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        lVar.T();
        Function0.g(obj, new c(pVar, p1Var, null), lVar, 72);
        if (o.J()) {
            o.R();
        }
        lVar.T();
        return p1Var;
    }
}
