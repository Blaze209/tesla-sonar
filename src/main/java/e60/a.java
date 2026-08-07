package e60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import h70.h;
import java.util.Map;
import jn0.h0;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0015\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001/B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J\u001f\u0010+\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020$2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001bH\u0016¢\u0006\u0004\b/\u0010#J\u000f\u00100\u001a\u00020\u001bH\u0016¢\u0006\u0004\b0\u0010#J\u000f\u00101\u001a\u00020\u001bH\u0016¢\u0006\u0004\b1\u0010#J\u0017\u00102\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b2\u0010.J\u000f\u00103\u001a\u00020\u001bH\u0016¢\u0006\u0004\b3\u0010#J\u000f\u00104\u001a\u00020\u001bH\u0016¢\u0006\u0004\b4\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010:R\u0018\u0010=\u001a\u00020\u0013*\u00020\u001e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006>"}, d2 = {"Le60/a;", "Le60/e;", "Lw30/c;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lh70/h;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lo30/d;", "logger", "Lz30/d;", "durationProvider", "<init>", "(Lw30/c;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lh70/h;Lkotlin/coroutines/CoroutineContext;Lo30/d;Lz30/d;)V", "Lio0/b;", "duration", "", "", "", "o", "(Lio0/b;)Ljava/util/Map;", "Le60/d;", "event", "", "additionalParams", "Ljn0/h0;", "p", "(Le60/d;Ljava/util/Map;)V", "Le60/e$a;", "state", DateTokenConverter.CONVERTER_KEY, "(Le60/e$a;)V", "b", "()V", "", "isInline", "g", "(Z)V", "c", "", AnalyticsAttribute.Error, "e", "(ZLjava/lang/Throwable;)V", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Throwable;)V", "a", "f", "h", "k", "l", "j", "Lw30/c;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lh70/h;", "Lkotlin/coroutines/CoroutineContext;", "Lo30/d;", "Lz30/d;", "r", "(Le60/e$a;)Ljava/lang/String;", "analyticsValue", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C1275a f62098g = new C1275a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f62099h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final w30.c analyticsRequestExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h errorReporter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z30.d durationProvider;

    /* JADX INFO: renamed from: e60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Le60/a$a;", "", "<init>", "()V", "", "FIELD_ERROR_MESSAGE", "Ljava/lang/String;", "FIELD_SESSION_STATE", "VALUE_REQUIRES_SIGN_UP", "VALUE_REQUIRES_VERIFICATION", "VALUE_VERIFIED", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class C1275a {
        public /* synthetic */ C1275a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1275a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62106a;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                iArr[e.a.RequiresSignUp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.RequiresVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.a.Verified.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f62106a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.analytics.DefaultLinkEventsReporter$fireEvent$1", f = "DefaultLinkEventsReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f62107n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ d f62109p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ Map<String, Object> f62110q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d dVar, Map<String, ? extends Object> map, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f62109p = dVar;
            this.f62110q = map;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new c(this.f62109p, this.f62110q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f62107n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            w30.c cVar = a.this.analyticsRequestExecutor;
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = a.this.paymentAnalyticsRequestFactory;
            d dVar = this.f62109p;
            Map<String, ? extends Object> mapI = this.f62110q;
            if (mapI == null) {
                mapI = v0.i();
            }
            cVar.a(paymentAnalyticsRequestFactory.g(dVar, mapI));
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(w30.c analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, h errorReporter, CoroutineContext workContext, o30.d logger, z30.d durationProvider) {
        s.k(analyticsRequestExecutor, "analyticsRequestExecutor");
        s.k(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        s.k(errorReporter, "errorReporter");
        s.k(workContext, "workContext");
        s.k(logger, "logger");
        s.k(durationProvider, "durationProvider");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.logger = logger;
        this.durationProvider = durationProvider;
    }

    private final Map<String, Float> o(io0.b duration) {
        if (duration != null) {
            return v0.f(x.a("duration", Float.valueOf((float) io0.b.H(duration.getRawValue(), io0.e.SECONDS))));
        }
        return null;
    }

    private final void p(d event, Map<String, ? extends Object> additionalParams) {
        this.logger.debug("Link event: " + event.getEventName() + " " + additionalParams);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new c(event, additionalParams, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void q(a aVar, d dVar, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        aVar.p(dVar, map);
    }

    private final String r(e.a aVar) {
        int i11 = b.f62106a[aVar.ordinal()];
        if (i11 == 1) {
            return "requiresSignUp";
        }
        if (i11 == 2) {
            return "requiresVerification";
        }
        if (i11 == 3) {
            return "verified";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // e60.e
    public void a() {
        q(this, d.e.f62127a, null, 2, null);
    }

    @Override // e60.e
    public void b() {
        q(this, d.h.f62133a, null, 2, null);
    }

    @Override // e60.e
    public void c(boolean isInline) {
        p(d.i.f62135a, o(this.durationProvider.b(z30.d.b.LinkSignup)));
    }

    @Override // e60.e
    public void d(e.a state) {
        s.k(state, "state");
        Map<String, ? extends Object> mapF = v0.f(x.a("sessionState", r(state)));
        h.b.a(this.errorReporter, h.f.LINK_INVALID_SESSION_STATE, null, null, 6, null);
        p(d.k.f62139a, mapF);
    }

    @Override // e60.e
    public void e(boolean isInline, Throwable error) {
        StripeError stripeError;
        String message;
        s.k(error, "error");
        Map mapF = null;
        if ((error instanceof APIException) && (stripeError = ((APIException) error).getStripeError()) != null && (message = stripeError.getMessage()) != null) {
            mapF = v0.f(x.a("error_message", message));
        }
        if (mapF == null) {
            mapF = v0.f(x.a("error_message", q30.a.a(error)));
        }
        p(d.j.f62137a, v0.r(mapF, h.INSTANCE.c(error)));
    }

    @Override // e60.e
    public void f() {
        q(this, d.g.f62131a, null, 2, null);
    }

    @Override // e60.e
    public void g(boolean isInline) {
        z30.d.a.a(this.durationProvider, z30.d.b.LinkSignup, false, 2, null);
        q(this, d.l.f62141a, null, 2, null);
    }

    @Override // e60.e
    public void h() {
        q(this, d.b.f62121a, null, 2, null);
    }

    @Override // e60.e
    public void i(Throwable error) {
        s.k(error, "error");
        p(d.a.f62119a, v0.r(v0.f(x.a("error_message", q30.a.a(error))), h.INSTANCE.c(error)));
    }

    @Override // e60.e
    public void j() {
        q(this, d.f.f62129a, null, 2, null);
    }

    @Override // e60.e
    public void k(Throwable error) {
        s.k(error, "error");
        p(d.c.f62123a, v0.f(x.a("error_message", q30.a.a(error))));
    }

    @Override // e60.e
    public void l() {
        q(this, d.C1276d.f62125a, null, 2, null);
    }
}
