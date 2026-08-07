package de;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsManager;
import java.util.concurrent.CancellationException;
import jn0.h0;
import jn0.s;
import jn0.t;
import ke.AnalyticsParams;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import wn0.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 72\u00020\u0001:\u0001 B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0016\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lde/g;", "Lcom/adyen/checkout/components/core/internal/analytics/AnalyticsManager;", "Lee/a;", "analyticsRepository", "Lke/a;", "analyticsParams", "Lkotlinx/coroutines/CoroutineDispatcher;", "coroutineDispatcher", "<init>", "(Lee/a;Lke/a;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Ljn0/h0;", "m", "()V", "n", "l", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "j", "()Z", "", "owner", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "b", "(Ljava/lang/Object;Lkotlinx/coroutines/CoroutineScope;)V", "Lde/a;", "event", DateTokenConverter.CONVERTER_KEY, "(Lde/a;)V", "", "c", "()Ljava/lang/String;", "a", "(Ljava/lang/Object;)V", "Lee/a;", "Lke/a;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lde/f;", "Lde/f;", "checkoutAttemptIdState", "e", "Z", "isInitialized", "f", "Lkotlinx/coroutines/CoroutineScope;", "_coroutineScope", "Lkotlinx/coroutines/Job;", "g", "Lkotlinx/coroutines/Job;", "timerJob", "h", "Ljava/lang/String;", "ownerReference", "k", "()Lkotlinx/coroutines/CoroutineScope;", IntegerTokenConverter.CONVERTER_KEY, "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements AnalyticsManager {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f60493j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ee.a analyticsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AnalyticsParams analyticsParams;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher coroutineDispatcher;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f checkoutAttemptIdState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isInitialized;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private CoroutineScope _coroutineScope;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Job timerJob;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String ownerReference;

    /* JADX INFO: renamed from: de.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lde/g$a;", "", "<init>", "()V", "", "DISPATCH_INTERVAL_MILLIS", "J", "a", "()J", "getDISPATCH_INTERVAL_MILLIS$components_core_release$annotations", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return g.f60493j;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$initialize$2", f = "DefaultAnalyticsManager.kt", i = {0}, l = {56}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f60502n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f60503o;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = g.this.new b(continuation);
            bVar.f60503o = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Throwable th2;
            Object objB;
            f available;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f60502n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f60503o;
                    g gVar = g.this;
                    try {
                        s.Companion companion = s.INSTANCE;
                        ee.a aVar = gVar.analyticsRepository;
                        this.f60503o = coroutineScope2;
                        this.f60502n = 1;
                        Object objA = aVar.a(this);
                        if (objA == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineScope = coroutineScope2;
                        obj = objA;
                    } catch (Throwable th3) {
                        coroutineScope = coroutineScope2;
                        th2 = th3;
                        s.Companion companion2 = s.INSTANCE;
                        objB = s.b(t.a(th2));
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    coroutineScope = (CoroutineScope) this.f60503o;
                    try {
                        t.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        s.Companion companion3 = s.INSTANCE;
                        objB = s.b(t.a(th2));
                    }
                }
                objB = s.b((String) obj);
                g gVar2 = g.this;
                Throwable thE = s.e(objB);
                if (thE == null) {
                    String str = (String) objB;
                    if (str != null) {
                        available = new f.Available(str);
                        gVar2.m();
                    } else {
                        available = f.b.f60490a;
                    }
                    gVar2.checkoutAttemptIdState = available;
                } else {
                    me.a aVar2 = me.a.WARN;
                    me.b.Companion companion4 = me.b.INSTANCE;
                    if (companion4.a().a(aVar2)) {
                        String name = coroutineScope.getClass().getName();
                        p013kotlin.jvm.internal.s.h(name);
                        String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                        if (strU1.length() != 0) {
                            name = p013kotlin.text.t.W0(strU1, "Kt");
                        }
                        companion4.a().b(aVar2, "CO." + name, "Failed to fetch checkoutAttemptId.", thE);
                    }
                    gVar2.checkoutAttemptIdState = f.b.f60490a;
                }
                return h0.f84049a;
            } catch (CancellationException e11) {
                throw e11;
            }
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager", f = "DefaultAnalyticsManager.kt", i = {0}, l = {115}, m = "sendEvents", n = {"this"}, s = {"L$0"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f60505n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f60506o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f60508q;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f60506o = obj;
            this.f60508q |= Integer.MIN_VALUE;
            return g.this.l(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$startTimer$1", f = "DefaultAnalyticsManager.kt", i = {0, 1}, l = {97, 98}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f60509n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f60510o;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = g.this.new d(continuation);
            dVar.f60510o = obj;
            return dVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0034  */
        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Code duplicated, block: B:21:0x0053  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        
            if (r7.l(r6) == r0) goto L20;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0050 -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f60509n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r6.f60510o
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                jn0.t.b(r7)
            L15:
                r7 = r1
                goto L2e
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                java.lang.Object r1 = r6.f60510o
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                jn0.t.b(r7)
                goto L46
            L27:
                jn0.t.b(r7)
                java.lang.Object r7 = r6.f60510o
                kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            L2e:
                boolean r1 = kotlinx.coroutines.CoroutineScopeKt.isActive(r7)
                if (r1 == 0) goto L53
                de.g$a r1 = de.g.INSTANCE
                long r4 = r1.a()
                r6.f60510o = r7
                r6.f60509n = r3
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r4, r6)
                if (r1 != r0) goto L45
                goto L52
            L45:
                r1 = r7
            L46:
                de.g r7 = de.g.this
                r6.f60510o = r1
                r6.f60509n = r2
                java.lang.Object r7 = de.g.g(r7, r6)
                if (r7 != r0) goto L15
            L52:
                return r0
            L53:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: de.g.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.adyen.checkout.components.core.internal.analytics.DefaultAnalyticsManager$trackEvent$2", f = "DefaultAnalyticsManager.kt", i = {0, 1}, l = {80, 83}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f60512n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f60513o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f60514p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f60515q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ a f60517s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a aVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f60517s = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = g.this.new e(this.f60517s, continuation);
            eVar.f60515q = obj;
            return eVar;
        }

        /* JADX WARN: Code duplicated, block: B:38:0x0094  */
        /* JADX WARN: Code duplicated, block: B:39:0x0097  */
        /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v26 */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v28 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            ?? r11;
            Throwable thE;
            me.a aVar;
            me.b.Companion companion;
            String name;
            String strU1;
            g gVar;
            CoroutineScope coroutineScope;
            a aVar2;
            g gVar2;
            CoroutineScope coroutineScope2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r12 = this.f60514p;
            try {
                try {
                    if (r12 == 0) {
                        t.b(obj);
                        CoroutineScope coroutineScope3 = (CoroutineScope) this.f60515q;
                        gVar = g.this;
                        a aVar3 = this.f60517s;
                        s.Companion companion2 = s.INSTANCE;
                        ee.a aVar4 = gVar.analyticsRepository;
                        this.f60515q = coroutineScope3;
                        this.f60512n = gVar;
                        this.f60513o = aVar3;
                        this.f60514p = 1;
                        if (aVar4.c(aVar3, this) != coroutine_suspended) {
                            coroutineScope = coroutineScope3;
                            aVar2 = aVar3;
                        }
                        return coroutine_suspended;
                    }
                    if (r12 == 1) {
                        aVar2 = (a) this.f60513o;
                        g gVar3 = (g) this.f60512n;
                        coroutineScope = (CoroutineScope) this.f60515q;
                        try {
                            t.b(obj);
                            gVar = gVar3;
                        } catch (Throwable th2) {
                            th = th2;
                            r12 = coroutineScope;
                            s.Companion companion3 = s.INSTANCE;
                            objB = s.b(t.a(th));
                            r11 = r12;
                        }
                    } else {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        gVar2 = (g) this.f60512n;
                        CoroutineScope coroutineScope4 = (CoroutineScope) this.f60515q;
                        t.b(obj);
                        coroutineScope2 = coroutineScope4;
                    }
                    gVar2.m();
                    r12 = coroutineScope2;
                    objB = s.b(h0.f84049a);
                    r11 = r12;
                    thE = s.e(objB);
                    if (thE == null) {
                    } else {
                        aVar = me.a.WARN;
                        companion = me.b.INSTANCE;
                        if (companion.a().a(aVar)) {
                            name = r11.getClass().getName();
                            p013kotlin.jvm.internal.s.h(name);
                            strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                            if (strU1.length() != 0) {
                                name = p013kotlin.text.t.W0(strU1, "Kt");
                            }
                            companion.a().b(aVar, "CO." + name, "Storing event failed", thE);
                        }
                    }
                    return h0.f84049a;
                    if (aVar2.getShouldForceSend()) {
                        this.f60515q = coroutineScope;
                        this.f60512n = gVar;
                        this.f60513o = null;
                        this.f60514p = 2;
                        if (gVar.l(this) != coroutine_suspended) {
                            gVar2 = gVar;
                            coroutineScope2 = coroutineScope;
                            gVar2.m();
                            r12 = coroutineScope2;
                        }
                        return coroutine_suspended;
                    }
                    r12 = coroutineScope;
                    objB = s.b(h0.f84049a);
                    r11 = r12;
                } catch (CancellationException e11) {
                    throw e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
            thE = s.e(objB);
            if (thE == null) {
            } else {
                aVar = me.a.WARN;
                companion = me.b.INSTANCE;
                if (companion.a().a(aVar)) {
                    name = r11.getClass().getName();
                    p013kotlin.jvm.internal.s.h(name);
                    strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU1.length() != 0) {
                        name = p013kotlin.text.t.W0(strU1, "Kt");
                    }
                    companion.a().b(aVar, "CO." + name, "Storing event failed", thE);
                }
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    static {
        io0.b.Companion companion = io0.b.INSTANCE;
        f60493j = io0.b.p(io0.d.s(10, io0.e.SECONDS));
    }

    public g(ee.a analyticsRepository, AnalyticsParams analyticsParams, CoroutineDispatcher coroutineDispatcher) {
        p013kotlin.jvm.internal.s.k(analyticsRepository, "analyticsRepository");
        p013kotlin.jvm.internal.s.k(analyticsParams, "analyticsParams");
        p013kotlin.jvm.internal.s.k(coroutineDispatcher, "coroutineDispatcher");
        this.analyticsRepository = analyticsRepository;
        this.analyticsParams = analyticsParams;
        this.coroutineDispatcher = coroutineDispatcher;
        this.checkoutAttemptIdState = f.c.f60491a;
    }

    private final boolean j() {
        return this.analyticsParams.getLevel().getPriority() <= ke.c.NONE.getPriority();
    }

    private final CoroutineScope k() {
        CoroutineScope coroutineScope = this._coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Continuation<? super h0> continuation) {
        c cVar;
        g gVar;
        Object objB;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f60508q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f60508q = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f60506o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f60508q;
        try {
            if (i12 == 0) {
                t.b(obj);
                f fVar = this.checkoutAttemptIdState;
                f.Available available = fVar instanceof f.Available ? (f.Available) fVar : null;
                if (available == null) {
                    me.a aVar = me.a.WARN;
                    me.b.Companion companion = me.b.INSTANCE;
                    if (companion.a().a(aVar)) {
                        String name = g.class.getName();
                        p013kotlin.jvm.internal.s.h(name);
                        String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                        if (strU1.length() != 0) {
                            name = p013kotlin.text.t.W0(strU1, "Kt");
                        }
                        companion.a().b(aVar, "CO." + name, "checkoutAttemptId should be available at this point.", null);
                    }
                    return h0.f84049a;
                }
                try {
                    s.Companion companion2 = s.INSTANCE;
                    ee.a aVar2 = this.analyticsRepository;
                    String checkoutAttemptId = available.getCheckoutAttemptId();
                    cVar.f60505n = this;
                    cVar.f60508q = 1;
                    if (aVar2.b(checkoutAttemptId, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gVar = this;
                } catch (Throwable th2) {
                    th = th2;
                    gVar = this;
                    s.Companion companion3 = s.INSTANCE;
                    objB = s.b(t.a(th));
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (g) cVar.f60505n;
                try {
                    t.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    s.Companion companion4 = s.INSTANCE;
                    objB = s.b(t.a(th));
                }
            }
            objB = s.b(h0.f84049a);
            Throwable thE = s.e(objB);
            if (thE == null) {
            } else {
                me.a aVar3 = me.a.WARN;
                me.b.Companion companion5 = me.b.INSTANCE;
                if (companion5.a().a(aVar3)) {
                    String name2 = gVar.getClass().getName();
                    p013kotlin.jvm.internal.s.h(name2);
                    String strU2 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                    if (strU2.length() != 0) {
                        name2 = p013kotlin.text.t.W0(strU2, "Kt");
                    }
                    companion5.a().b(aVar3, "CO." + name2, "Failed sending analytics events", thE);
                }
            }
            return h0.f84049a;
        } catch (CancellationException e11) {
            throw e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        n();
        this.timerJob = BuildersKt__Builders_commonKt.launch$default(k(), this.coroutineDispatcher, null, new d(null), 2, null);
    }

    private final void n() {
        Job job = this.timerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsManager
    public void a(Object owner) {
        p013kotlin.jvm.internal.s.k(owner, "owner");
        if (!p013kotlin.jvm.internal.s.f(this.ownerReference, o0.b(owner.getClass()).c())) {
            me.a aVar = me.a.DEBUG;
            me.b.Companion companion = me.b.INSTANCE;
            if (companion.a().a(aVar)) {
                String name = g.class.getName();
                p013kotlin.jvm.internal.s.h(name);
                String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
                if (strU1.length() != 0) {
                    name = p013kotlin.text.t.W0(strU1, "Kt");
                }
                companion.a().b(aVar, "CO." + name, "Clear called by not the original owner, ignoring.", null);
                return;
            }
            return;
        }
        me.a aVar2 = me.a.DEBUG;
        me.b.Companion companion2 = me.b.INSTANCE;
        if (companion2.a().a(aVar2)) {
            String name2 = g.class.getName();
            p013kotlin.jvm.internal.s.h(name2);
            String strU2 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name2, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU2.length() != 0) {
                name2 = p013kotlin.text.t.W0(strU2, "Kt");
            }
            companion2.a().b(aVar2, "CO." + name2, "Clearing analytics manager", null);
        }
        this._coroutineScope = null;
        this.checkoutAttemptIdState = f.c.f60491a;
        this.ownerReference = null;
        this.isInitialized = false;
        n();
        this.timerJob = null;
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsManager
    public void b(Object owner, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(owner, "owner");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        if (!this.isInitialized) {
            this.isInitialized = true;
            this.ownerReference = o0.b(owner.getClass()).c();
            this._coroutineScope = coroutineScope;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, this.coroutineDispatcher, null, new b(null), 2, null);
            return;
        }
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = g.class.getName();
            p013kotlin.jvm.internal.s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "Already initialized, ignoring.", null);
        }
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsManager
    public String c() {
        f fVar = this.checkoutAttemptIdState;
        if (fVar instanceof f.Available) {
            return ((f.Available) fVar).getCheckoutAttemptId();
        }
        if (p013kotlin.jvm.internal.s.f(fVar, f.b.f60490a)) {
            return "fetch-checkoutAttemptId-failed";
        }
        if (p013kotlin.jvm.internal.s.f(fVar, f.c.f60491a)) {
            return "checkoutAttemptId-not-fetched";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.adyen.checkout.components.core.internal.analytics.AnalyticsManager
    public void d(a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (!j()) {
            BuildersKt__Builders_commonKt.launch$default(k(), this.coroutineDispatcher, null, new e(event, null), 2, null);
            return;
        }
        me.a aVar = me.a.DEBUG;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = g.class.getName();
            p013kotlin.jvm.internal.s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            companion.a().b(aVar, "CO." + name, "Not allowed to track events, ignoring.", null);
        }
    }

    public /* synthetic */ g(ee.a aVar, AnalyticsParams analyticsParams, CoroutineDispatcher coroutineDispatcher, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, analyticsParams, (i11 & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
