package s50;

import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import co0.o;
import com.facebook.react.bridge.BaseJavaModule;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import n40.p0;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJm\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u000f*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00102\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0014\u0018\u00010\u00132\u001e\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0014\u0012\u0004\u0012\u00028\u00000\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\t2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0010H\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ{\u0010\"\u001a\u00020\t\"\u0004\b\u0001\u0010\u000f2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00140\u00132$\b\u0002\u0010\u001f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00162$\b\u0002\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0016H\u0014¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\t2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0010H\u0004¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Ls50/i;", "S", "Landroidx/lifecycle/c1;", "initialState", "Ln40/p0;", "nativeAuthFlowCoordinator", "<init>", "(Ljava/lang/Object;Ln40/p0;)V", "state", "Ljn0/h0;", "l", "(Ljava/lang/Object;)V", "Lq50/c;", "m", "(Ljava/lang/Object;)Lq50/c;", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "Lco0/o;", "Ls50/a;", "retainValue", "Lkotlin/Function2;", "reducer", "Lkotlinx/coroutines/Job;", "f", "(Lwn0/l;Lco0/o;Lwn0/p;)Lkotlinx/coroutines/Job;", "action", "n", "(Lwn0/l;)V", "prop", "onSuccess", "", "onFail", IntegerTokenConverter.CONVERTER_KEY, "(Lco0/o;Lwn0/p;Lwn0/p;)V", "k", "s", "Ln40/p0;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "t", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "u", "Lkotlinx/coroutines/flow/StateFlow;", "h", "()Lkotlinx/coroutines/flow/StateFlow;", "stateFlow", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class i<S> extends c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0 nativeAuthFlowCoordinator;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<S> _stateFlow;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<S> stateFlow;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$1", f = "FinancialConnectionsViewModel.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110294n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ i<S> f110295o;

        /* JADX INFO: renamed from: s50.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class C2344a implements FlowCollector, m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i<S> f110296a;

            C2344a(i<S> iVar) {
                this.f110296a = iVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(S s11, Continuation<? super h0> continuation) {
                Object objB = a.b(this.f110296a, s11, continuation);
                return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : h0.f84049a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof m)) {
                    return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // p013kotlin.jvm.internal.m
            public final jn0.i<?> getFunctionDelegate() {
                return new p013kotlin.jvm.internal.a(2, this.f110296a, i.class, "updateHostWithTopAppBarState", "updateHostWithTopAppBarState(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i<S> iVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f110295o = iVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object b(i iVar, Object obj, Continuation continuation) {
            iVar.l(obj);
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f110295o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f110294n;
            if (i11 == 0) {
                t.b(obj);
                StateFlow<S> stateFlowH = this.f110295o.h();
                C2344a c2344a = new C2344a(this.f110295o);
                this.f110294n = 1;
                if (stateFlowH.collect(c2344a, this) == coroutine_suspended) {
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

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "S", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$execute$1", f = "FinancialConnectionsViewModel.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110297n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f110298o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ i<S> f110299p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p<S, s50.a<? extends T>, S> f110300q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ o<S, s50.a<T>> f110301r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ l<Continuation<? super T>, Object> f110302s;

        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "S", "T", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class a extends u implements l<S, S> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<S, s50.a<? extends T>, S> f110303c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ o<S, s50.a<T>> f110304d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super S, ? super s50.a<? extends T>, ? extends S> pVar, o<S, ? extends s50.a<? extends T>> oVar) {
                super(1);
                this.f110303c = pVar;
                this.f110304d = oVar;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final S invoke(S s11) {
                s50.a aVar;
                p<S, s50.a<? extends T>, S> pVar = this.f110303c;
                o<S, s50.a<T>> oVar = this.f110304d;
                return pVar.invoke(s11, new s50.a.Loading((oVar == 0 || (aVar = (s50.a) oVar.get(s11)) == null) ? null : aVar.a()));
            }
        }

        /* JADX INFO: renamed from: s50.i$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "S", "T", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class C2345b extends u implements l<S, S> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<S, s50.a<? extends T>, S> f110305c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f110306d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2345b(p<? super S, ? super s50.a<? extends T>, ? extends S> pVar, T t11) {
                super(1);
                this.f110305c = pVar;
                this.f110306d = t11;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final S invoke(S s11) {
                return this.f110305c.invoke(s11, new s50.a.Success(this.f110306d));
            }
        }

        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "S", "T", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        static final class c extends u implements l<S, S> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p<S, s50.a<? extends T>, S> f110307c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Throwable f110308d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(p<? super S, ? super s50.a<? extends T>, ? extends S> pVar, Throwable th2) {
                super(1);
                this.f110307c = pVar;
                this.f110308d = th2;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final S invoke(S s11) {
                return this.f110307c.invoke(s11, new s50.a.Fail(this.f110308d));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(i<S> iVar, p<? super S, ? super s50.a<? extends T>, ? extends S> pVar, o<S, ? extends s50.a<? extends T>> oVar, l<? super Continuation<? super T>, ? extends Object> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f110299p = iVar;
            this.f110300q = pVar;
            this.f110301r = oVar;
            this.f110302s = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f110299p, this.f110300q, this.f110301r, this.f110302s, continuation);
            bVar.f110298o = obj;
            return bVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to s50.i$b for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f110297n
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                jn0.t.b(r6)     // Catch: java.lang.Throwable -> Lf
                goto L3b
            Lf:
                r6 = move-exception
                goto L40
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L19:
                jn0.t.b(r6)
                java.lang.Object r6 = r5.f110298o
                kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
                s50.i<S> r6 = r5.f110299p
                s50.i$b$a r1 = new s50.i$b$a
                wn0.p<S, s50.a<? extends T>, S> r3 = r5.f110300q
                co0.o<S, s50.a<T>> r4 = r5.f110301r
                r1.<init>(r3, r4)
                r6.k(r1)
                wn0.l<kotlin.coroutines.Continuation<? super T>, java.lang.Object> r6 = r5.f110302s
                jn0.s$a r1 = jn0.s.INSTANCE     // Catch: java.lang.Throwable -> Lf
                r5.f110297n = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r6 = r6.invoke(r5)     // Catch: java.lang.Throwable -> Lf
                if (r6 != r0) goto L3b
                return r0
            L3b:
                java.lang.Object r6 = jn0.s.b(r6)     // Catch: java.lang.Throwable -> Lf
                goto L4a
            L40:
                jn0.s$a r0 = jn0.s.INSTANCE
                java.lang.Object r6 = jn0.t.a(r6)
                java.lang.Object r6 = jn0.s.b(r6)
            L4a:
                s50.i<S> r0 = r5.f110299p
                wn0.p<S, s50.a<? extends T>, S> r1 = r5.f110300q
                java.lang.Throwable r2 = jn0.s.e(r6)
                if (r2 != 0) goto L5d
                s50.i$b$b r2 = new s50.i$b$b
                r2.<init>(r1, r6)
                r0.k(r2)
                goto L65
            L5d:
                s50.i$b$c r6 = new s50.i$b$c
                r6.<init>(r1, r2)
                r0.k(r6)
            L65:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: s50.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "S", "it", "Ljn0/h0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$1", f = "FinancialConnectionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    protected static final class c extends SuspendLambda implements p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110309n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f110309n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Object obj, Continuation continuation) {
            return ((c) create(obj, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "S", "", "it", "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$2", f = "FinancialConnectionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    protected static final class d extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110310n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f110310n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((d) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "S", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$3", f = "FinancialConnectionsViewModel.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110311n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ i<S> f110312o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ o<S, s50.a<T>> f110313p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ p<T, Continuation<? super h0>, Object> f110314q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ p<Throwable, Continuation<? super h0>, Object> f110315r;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "S", "Ls50/a;", BaseJavaModule.METHOD_TYPE_ASYNC, "Ljn0/h0;", "a", "(Ls50/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ p<T, Continuation<? super h0>, Object> f110316a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p<Throwable, Continuation<? super h0>, Object> f110317b;

            /* JADX WARN: Multi-variable type inference failed */
            a(p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar, p<? super Throwable, ? super Continuation<? super h0>, ? extends Object> pVar2) {
                this.f110316a = pVar;
                this.f110317b = pVar2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(s50.a<? extends T> aVar, Continuation<? super h0> continuation) {
                if (aVar instanceof s50.a.Success) {
                    Object objInvoke = this.f110316a.invoke((T) ((s50.a.Success) aVar).a(), continuation);
                    return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : h0.f84049a;
                }
                if (aVar instanceof s50.a.Fail) {
                    Object objInvoke2 = this.f110317b.invoke(((s50.a.Fail) aVar).getError(), continuation);
                    return objInvoke2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke2 : h0.f84049a;
                }
                if (!(aVar instanceof s50.a.Loading)) {
                    s.f(aVar, s50.a.d.f110198b);
                }
                return h0.f84049a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b<T> implements Flow<s50.a<? extends T>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow f110318a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f110319b;

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ FlowCollector f110320a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ o f110321b;

                /* JADX INFO: renamed from: s50.i$e$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$onAsync$3$invokeSuspend$$inlined$map$1$2", f = "FinancialConnectionsViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
                public static final class C2346a extends ContinuationImpl {

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    /* synthetic */ Object f110322n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    int f110323o;

                    public C2346a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f110322n = obj;
                        this.f110323o |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(FlowCollector flowCollector, o oVar) {
                    this.f110320a = flowCollector;
                    this.f110321b = oVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    C2346a c2346a;
                    if (continuation instanceof C2346a) {
                        c2346a = (C2346a) continuation;
                        int i11 = c2346a.f110323o;
                        if ((i11 & Integer.MIN_VALUE) != 0) {
                            c2346a.f110323o = i11 - Integer.MIN_VALUE;
                        } else {
                            c2346a = new C2346a(continuation);
                        }
                    } else {
                        c2346a = new C2346a(continuation);
                    }
                    Object obj2 = c2346a.f110322n;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = c2346a.f110323o;
                    if (i12 == 0) {
                        t.b(obj2);
                        FlowCollector flowCollector = this.f110320a;
                        Object obj3 = this.f110321b.get(obj);
                        c2346a.f110323o = 1;
                        if (flowCollector.emit(obj3, c2346a) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t.b(obj2);
                    }
                    return h0.f84049a;
                }
            }

            public b(Flow flow, o oVar) {
                this.f110318a = flow;
                this.f110319b = oVar;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f110318a.collect(new a(flowCollector, this.f110319b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(i<S> iVar, o<S, ? extends s50.a<? extends T>> oVar, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar, p<? super Throwable, ? super Continuation<? super h0>, ? extends Object> pVar2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f110312o = iVar;
            this.f110313p = oVar;
            this.f110314q = pVar;
            this.f110315r = pVar2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new e(this.f110312o, this.f110313p, this.f110314q, this.f110315r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f110311n;
            if (i11 == 0) {
                t.b(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new b(this.f110312o.h(), this.f110313p));
                a aVar = new a(this.f110314q, this.f110315r);
                this.f110311n = 1;
                if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel$updateHostWithTopAppBarState$1", f = "FinancialConnectionsViewModel.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f110325n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ i<S> f110326o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ S f110327p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(i<S> iVar, S s11, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f110326o = iVar;
            this.f110327p = s11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new f(this.f110326o, this.f110327p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f110325n;
            if (i11 == 0) {
                t.b(obj);
                TopAppBarStateUpdate topAppBarStateUpdateM = this.f110326o.m(this.f110327p);
                if (topAppBarStateUpdateM == null) {
                    return h0.f84049a;
                }
                MutableSharedFlow<p0.a> mutableSharedFlowA = ((i) this.f110326o).nativeAuthFlowCoordinator.a();
                p0.a.UpdateTopAppBar updateTopAppBar = new p0.a.UpdateTopAppBar(topAppBarStateUpdateM);
                this.f110325n = 1;
                if (mutableSharedFlowA.emit(updateTopAppBar, this) == coroutine_suspended) {
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
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public i(S s11, p0 nativeAuthFlowCoordinator) {
        s.k(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        this.nativeAuthFlowCoordinator = nativeAuthFlowCoordinator;
        MutableStateFlow<S> MutableStateFlow = StateFlowKt.MutableStateFlow(s11);
        this._stateFlow = MutableStateFlow;
        this.stateFlow = FlowKt.asStateFlow(MutableStateFlow);
        l(s11);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new a(this, null), 3, null);
    }

    public static /* synthetic */ Job g(i iVar, l lVar, o oVar, p pVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: execute");
        }
        if ((i11 & 1) != 0) {
            oVar = null;
        }
        return iVar.f(lVar, oVar, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(i iVar, o oVar, p pVar, p pVar2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAsync");
        }
        if ((i11 & 2) != 0) {
            pVar = new c(null);
        }
        if ((i11 & 4) != 0) {
            pVar2 = new d(null);
        }
        iVar.i(oVar, pVar, pVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(S state) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new f(this, state, null), 3, null);
    }

    protected <T> Job f(l<? super Continuation<? super T>, ? extends Object> lVar, o<S, ? extends s50.a<? extends T>> oVar, p<? super S, ? super s50.a<? extends T>, ? extends S> reducer) {
        s.k(lVar, "<this>");
        s.k(reducer, "reducer");
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new b(this, reducer, oVar, lVar, null), 3, null);
    }

    public final StateFlow<S> h() {
        return this.stateFlow;
    }

    protected <T> void i(o<S, ? extends s50.a<? extends T>> prop, p<? super T, ? super Continuation<? super h0>, ? extends Object> onSuccess, p<? super Throwable, ? super Continuation<? super h0>, ? extends Object> onFail) {
        s.k(prop, "prop");
        s.k(onSuccess, "onSuccess");
        s.k(onFail, "onFail");
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new e(this, prop, onSuccess, onFail, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void k(l<? super S, ? extends S> reducer) {
        a.a.Companion companion;
        s.k(reducer, "reducer");
        MutableStateFlow<S> mutableStateFlow = this._stateFlow;
        do {
            companion = (Object) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(companion, reducer.invoke(companion)));
    }

    public abstract TopAppBarStateUpdate m(S state);

    protected final void n(l<? super S, h0> action) {
        s.k(action, "action");
        action.invoke(this.stateFlow.getValue());
    }
}
