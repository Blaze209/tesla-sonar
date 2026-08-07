package v40;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import j40.h;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import n40.b0;
import n40.p0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import q50.TopAppBarStateUpdate;
import s50.i;
import t50.l;
import wn0.p;
import z50.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u0014J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\"\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lv40/c;", "Ls50/i;", "Lv40/b;", "initialState", "Ln40/p0;", "coordinator", "Ln40/b0;", "getOrFetchSync", "Lt50/l;", "errorRepository", "Lj40/f;", "eventTracker", "Lo50/f;", "navigationManager", "Lo30/d;", "logger", "<init>", "(Lv40/b;Ln40/p0;Ln40/b0;Lt50/l;Lj40/f;Lo50/f;Lo30/d;)V", "Ljn0/h0;", "w", "()V", "reset", "state", "Lq50/c;", "z", "(Lv40/b;)Lq50/c;", "x", "", AnalyticsAttribute.Error, "v", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/Job;", "y", "()Lkotlinx/coroutines/Job;", "onCleared", "Ln40/p0;", "Ln40/b0;", "Lt50/l;", "Lj40/f;", "Lo50/f;", "A", "Lo30/d;", "B", "c", DateTokenConverter.CONVERTER_KEY, "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c extends i<ErrorState> {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int C = 8;
    private static final FinancialConnectionsSessionManifest.Pane D = FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p0 coordinator;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final l errorRepository;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final j40.f eventTracker;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final o50.f navigationManager;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv40/b$a;", "<anonymous>", "()Lv40/b$a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.error.ErrorViewModel$1", f = "ErrorViewModel.kt", i = {}, l = {44, 45}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.l<Continuation<? super ErrorState.Payload>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f117832n;

        a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f117832n
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L1f
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                jn0.t.b(r6)
                goto L46
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                jn0.t.b(r6)
                goto L37
            L1f:
                jn0.t.b(r6)
                v40.c r6 = v40.c.this
                n40.p0 r6 = v40.c.o(r6)
                kotlinx.coroutines.flow.MutableSharedFlow r6 = r6.a()
                n40.p0$a$a r1 = n40.p0.a.C1987a.f93230a
                r5.f117832n = r4
                java.lang.Object r6 = r6.emit(r1, r5)
                if (r6 != r0) goto L37
                goto L45
            L37:
                v40.c r6 = v40.c.this
                n40.b0 r6 = v40.c.r(r6)
                r5.f117832n = r2
                java.lang.Object r6 = n40.b0.b(r6, r3, r5, r4, r3)
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                com.stripe.android.financialconnections.model.k0 r6 = (com.stripe.android.financialconnections.model.SynchronizeSessionResponse) r6
                com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest r6 = r6.getManifest()
                v40.b$a r0 = new v40.b$a
                v40.c r1 = v40.c.this
                t50.l r1 = v40.c.p(r1)
                android.os.Parcelable r1 = r1.b()
                t50.l$a r1 = (t50.l.State) r1
                if (r1 == 0) goto L60
                java.lang.Throwable r3 = r1.getError()
            L60:
                if (r3 == 0) goto L6e
                boolean r1 = r6.getDisableLinkMoreAccounts()
                boolean r6 = r6.getAllowManualEntry()
                r0.<init>(r3, r1, r6)
                return r0
            L6e:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required value was null."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: v40.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.l
        public final Object invoke(Continuation<? super ErrorState.Payload> continuation) {
            return ((a) create(continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv40/b;", "Ls50/a;", "Lv40/b$a;", "it", "a", "(Lv40/b;Ls50/a;)Lv40/b;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<ErrorState, s50.a<? extends ErrorState.Payload>, ErrorState> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f117834c = new b();

        b() {
            super(2);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ErrorState invoke(ErrorState execute, s50.a<ErrorState.Payload> it) {
            s.k(execute, "$this$execute");
            s.k(it, "it");
            return execute.a(it);
        }
    }

    /* JADX INFO: renamed from: v40.c$c, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lv40/c$c;", "", "<init>", "()V", "Lm40/p;", "parentComponent", "Landroidx/lifecycle/ViewModelProvider$Factory;", "a", "(Lm40/p;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "PANE", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "b", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: v40.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Lv40/c;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Lv40/c;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<CreationExtras, c> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ m40.p f117835c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m40.p pVar) {
                super(1);
                this.f117835c = pVar;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(CreationExtras initializer) {
                s.k(initializer, "$this$initializer");
                return this.f117835c.v().a(new ErrorState(null, 1, null));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ViewModelProvider.Factory a(m40.p parentComponent) {
            s.k(parentComponent, "parentComponent");
            m7.b bVar = new m7.b();
            bVar.a(o0.b(c.class), new a(parentComponent));
            return bVar.b();
        }

        public final FinancialConnectionsSessionManifest.Pane b() {
            return c.D;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lv40/c$d;", "", "Lv40/b;", "initialState", "Lv40/c;", "a", "(Lv40/b;)Lv40/c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d {
        c a(ErrorState initialState);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", AnalyticsAttribute.Error, "Ljn0/h0;", "<anonymous>", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.error.ErrorViewModel$logErrors$2", f = "ErrorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<Throwable, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f117837n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f117838o;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = c.this.new f(continuation);
            fVar.f117838o = obj;
            return fVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f117837n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            h.b(c.this.eventTracker, "Error loading the error screen payload", (Throwable) this.f117838o, c.this.logger, c.INSTANCE.b());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(Throwable th2, Continuation<? super h0> continuation) {
            return ((f) create(th2, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.error.ErrorViewModel$onSelectAnotherBank$1", f = "ErrorViewModel.kt", i = {}, l = {106, 111}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f117840n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f117841o;

        g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return c.this.new g(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
        
            if (r1.v(r3, r5) == r0) goto L30;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f117841o
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r6)
                goto L7f
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                jn0.t.b(r6)     // Catch: java.lang.Throwable -> L1e
                goto L53
            L1e:
                r6 = move-exception
                goto L62
            L20:
                jn0.t.b(r6)
                v40.c r6 = v40.c.this
                jn0.s$a r1 = jn0.s.INSTANCE     // Catch: java.lang.Throwable -> L1e
                kotlinx.coroutines.flow.StateFlow r1 = r6.h()     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1e
                v40.b r1 = (v40.ErrorState) r1     // Catch: java.lang.Throwable -> L1e
                s50.a r1 = r1.b()     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L1e
                if (r1 == 0) goto L5a
                v40.b$a r1 = (v40.ErrorState.Payload) r1     // Catch: java.lang.Throwable -> L1e
                boolean r4 = r1.getDisableLinkMoreAccounts()     // Catch: java.lang.Throwable -> L1e
                if (r4 == 0) goto L50
                java.lang.Throwable r1 = r1.getError()     // Catch: java.lang.Throwable -> L1e
                r5.f117841o = r3     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r6 = r6.v(r1, r5)     // Catch: java.lang.Throwable -> L1e
                if (r6 != r0) goto L53
                goto L7e
            L50:
                v40.c.u(r6)     // Catch: java.lang.Throwable -> L1e
            L53:
                jn0.h0 r6 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r6 = jn0.s.b(r6)     // Catch: java.lang.Throwable -> L1e
                goto L6c
            L5a:
                java.lang.String r6 = "Required value was null."
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1e
                r1.<init>(r6)     // Catch: java.lang.Throwable -> L1e
                throw r1     // Catch: java.lang.Throwable -> L1e
            L62:
                jn0.s$a r1 = jn0.s.INSTANCE
                java.lang.Object r6 = jn0.t.a(r6)
                java.lang.Object r6 = jn0.s.b(r6)
            L6c:
                v40.c r1 = v40.c.this
                java.lang.Throwable r3 = jn0.s.e(r6)
                if (r3 == 0) goto L7f
                r5.f117840n = r6
                r5.f117841o = r2
                java.lang.Object r6 = r1.v(r3, r5)
                if (r6 != r0) goto L7f
            L7e:
                return r0
            L7f:
                jn0.h0 r6 = jn0.h0.f84049a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: v40.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ErrorState initialState, p0 coordinator, b0 getOrFetchSync, l errorRepository, j40.f eventTracker, o50.f navigationManager, o30.d logger) {
        super(initialState, coordinator);
        s.k(initialState, "initialState");
        s.k(coordinator, "coordinator");
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(errorRepository, "errorRepository");
        s.k(eventTracker, "eventTracker");
        s.k(navigationManager, "navigationManager");
        s.k(logger, "logger");
        this.coordinator = coordinator;
        this.getOrFetchSync = getOrFetchSync;
        this.errorRepository = errorRepository;
        this.eventTracker = eventTracker;
        this.navigationManager = navigationManager;
        this.logger = logger;
        w();
        i.g(this, new a(null), null, b.f117834c, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reset() {
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.x.f96763i, D, null, 2, null), new o50.i.Current(true), false, 4, null);
    }

    private final void w() {
        i.j(this, new f0() { // from class: v40.c.e
            @Override // p013kotlin.jvm.internal.f0, co0.o
            public Object get(Object obj) {
                return ((ErrorState) obj).b();
            }
        }, null, new f(null), 2, null);
    }

    @Override // androidx.p003lifecycle.c1
    protected void onCleared() {
        this.errorRepository.a();
        super.onCleared();
    }

    public final Object v(Throwable th2, Continuation<? super h0> continuation) {
        Object objEmit = this.coordinator.a().emit(new p0.a.CloseWithError(th2), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : h0.f84049a;
    }

    public final void x() {
        o50.f.a.a(this.navigationManager, o50.b.k(o50.b.o.f96753i, D, null, 2, null), null, false, 6, null);
    }

    public final Job y() {
        return BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new g(null), 3, null);
    }

    @Override // s50.i
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public TopAppBarStateUpdate m(ErrorState state) {
        Throwable thA;
        s.k(state, "state");
        ErrorState.Payload payloadA = state.b().a();
        if (payloadA == null || (thA = payloadA.getError()) == null) {
            thA = n.a(state.b());
        }
        return new TopAppBarStateUpdate(D, false, thA, null, false, 24, null);
    }
}
