package j40;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import java.util.Locale;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import n40.b0;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f¨\u0006\""}, d2 = {"Lj40/g;", "Lj40/f;", "Ln40/b0;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Ljava/util/Locale;", "locale", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lw30/h;", "requestExecutor", "<init>", "(Ln40/b0;Lcom/stripe/android/financialconnections/a$b;Ljava/util/Locale;Landroid/content/Context;Lw30/h;)V", "", "", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lj40/e;", "event", "Ljn0/h0;", "a", "(Lj40/e;)V", "Ln40/b0;", "b", "Lcom/stripe/android/financialconnections/a$b;", "c", "Ljava/util/Locale;", DateTokenConverter.CONVERTER_KEY, "Lw30/h;", "Lw30/i;", "Lw30/i;", "requestFactory", "f", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f82598g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 getOrFetchSync;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.Configuration configuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w30.h requestExecutor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final w30.i requestFactory;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl", f = "FinancialConnectionsAnalyticsTracker.kt", i = {0}, l = {110}, m = "commonParams", n = {"this"}, s = {"L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f82604n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f82605o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f82607q;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f82605o = obj;
            this.f82607q |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl$track$1", f = "FinancialConnectionsAnalyticsTracker.kt", i = {}, l = {102, 105}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f82608n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f82609o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f82610p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f82611q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsEvent f82613s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FinancialConnectionsEvent financialConnectionsEvent, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f82613s = financialConnectionsEvent;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return g.this.new c(this.f82613s, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
        
            if (r1.a(r7, r6) == r0) goto L18;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f82611q
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r7)
                goto L77
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f82610p
                java.util.Map r1 = (java.util.Map) r1
                java.lang.Object r4 = r6.f82609o
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r5 = r6.f82608n
                w30.i r5 = (w30.i) r5
                jn0.t.b(r7)
                goto L57
            L2a:
                jn0.t.b(r7)
                j40.g r7 = j40.g.this
                w30.i r5 = j40.g.d(r7)
                j40.e r7 = r6.f82613s
                java.lang.String r4 = r7.getEventName()
                j40.e r7 = r6.f82613s
                java.util.Map r7 = r7.c()
                if (r7 != 0) goto L45
                java.util.Map r7 = p013kotlin.collections.v0.i()
            L45:
                r1 = r7
                j40.g r7 = j40.g.this
                r6.f82608n = r5
                r6.f82609o = r4
                r6.f82610p = r1
                r6.f82611q = r3
                java.lang.Object r7 = j40.g.b(r7, r6)
                if (r7 != r0) goto L57
                goto L76
            L57:
                java.util.Map r7 = (java.util.Map) r7
                java.util.Map r7 = p013kotlin.collections.v0.r(r1, r7)
                w30.g r7 = r5.a(r4, r7, r3)
                j40.g r1 = j40.g.this
                w30.h r1 = j40.g.c(r1)
                r3 = 0
                r6.f82608n = r3
                r6.f82609o = r3
                r6.f82610p = r3
                r6.f82611q = r2
                java.lang.Object r7 = r1.a(r7, r6)
                if (r7 != r0) goto L77
            L76:
                return r0
            L77:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: j40.g.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public g(b0 getOrFetchSync, com.stripe.android.financialconnections.a.Configuration configuration, Locale locale, Context context, w30.h requestExecutor) {
        s.k(getOrFetchSync, "getOrFetchSync");
        s.k(configuration, "configuration");
        s.k(locale, "locale");
        s.k(context, "context");
        s.k(requestExecutor, "requestExecutor");
        this.getOrFetchSync = getOrFetchSync;
        this.configuration = configuration;
        this.locale = locale;
        this.requestExecutor = requestExecutor;
        this.requestFactory = new w30.i(context, "mobile-clients-linked-accounts", "stripe-linked-accounts-android", null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(Continuation<? super Map<String, String>> continuation) {
        b bVar;
        g gVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f82607q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f82607q = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objB = bVar.f82605o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f82607q;
        if (i12 == 0) {
            t.b(objB);
            b0 b0Var = this.getOrFetchSync;
            bVar.f82604n = this;
            bVar.f82607q = 1;
            objB = b0.b(b0Var, null, bVar, 1, null);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            gVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (g) bVar.f82604n;
            t.b(objB);
        }
        FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) objB).getManifest();
        return v0.m(x.a("las_client_secret", gVar.configuration.getFinancialConnectionsSessionClientSecret()), x.a(Action.KEY_ATTRIBUTE, gVar.configuration.getPublishableKey()), x.a("stripe_account", gVar.configuration.getStripeAccountId()), x.a("navigator_language", gVar.locale.toLanguageTag()), x.a("is_webview", "false"), x.a("livemode", String.valueOf(manifest.getLivemode())), x.a("product", manifest.getProduct().getValue()), x.a("is_stripe_direct", String.valueOf(manifest.getIsStripeDirect())), x.a("single_account", String.valueOf(manifest.getSingleAccount())), x.a("allow_manual_entry", String.valueOf(manifest.getAllowManualEntry())), x.a("account_holder_id", manifest.getAccountholderToken()));
    }

    @Override // j40.f
    public void a(FinancialConnectionsEvent event) {
        s.k(event, "event");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new c(event, null), 2, null);
    }
}
