package f30;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.CvcTokenParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.q1;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o30.ApiVersion;
import o30.AppInfo;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001a\b\u0007\u0018\u0000 Z2\u00020\u0001:\u0001SB7\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB?\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u000b\u0010\u0014B3\b\u0012\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000b\u0010\u0015B+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\u0016J;\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010&\u001a\u00020\u001d\"\b\b\u0000\u0010!*\u00020 2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\"\u0010%\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0#\u0012\u0006\u0012\u0004\u0018\u00010\u00010\"H\u0002¢\u0006\u0004\b&\u0010'J6\u0010)\u001a\u00020\u001d\"\b\b\u0000\u0010!*\u00020 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000$2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0082@¢\u0006\u0004\b)\u0010*JA\u0010/\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060,2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020.0\u001aH\u0007¢\u0006\u0004\b/\u00100J3\u00101\u001a\u00020.2\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060,H\u0007¢\u0006\u0004\b1\u00102JA\u00104\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060,2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002030\u001aH\u0007¢\u0006\u0004\b4\u00100J3\u00105\u001a\u0002032\u0006\u0010+\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060,H\u0007¢\u0006\u0004\b5\u00106J=\u0010:\u001a\u00020\u001d2\u0006\u00108\u001a\u0002072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002090\u001aH\u0007¢\u0006\u0004\b:\u0010;J?\u0010=\u001a\u00020\u001d2\b\b\u0001\u0010<\u001a\u00020\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0007¢\u0006\u0004\b=\u0010>J.\u0010?\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0080@¢\u0006\u0004\b?\u0010@J5\u0010D\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020.0\u001aH\u0007¢\u0006\u0004\bD\u0010EJ-\u0010G\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020.0\u001aH\u0007¢\u0006\u0004\bG\u0010HJ5\u0010I\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020A2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002030\u001aH\u0007¢\u0006\u0004\bI\u0010EJ-\u0010J\u001a\u00020\u001d2\u0006\u0010+\u001a\u00020\u00062\u0006\u0010F\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002030\u001aH\u0007¢\u0006\u0004\bJ\u0010HR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010T\u001a\u0004\bY\u0010V¨\u0006["}, d2 = {"Lf30/h0;", "", "Lz60/g;", "stripeRepository", "Lf30/p;", "paymentController", "", "publishableKey", "stripeAccountId", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lz60/g;Lf30/p;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "enableLogging", "", "Lf30/i0;", "betas", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Set;)V", "(Landroid/content/Context;Lz60/g;Ljava/lang/String;Ljava/lang/String;Z)V", "(Lz60/g;Lf30/p;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/stripe/android/model/q1;", "tokenParams", "idempotencyKey", "Lf30/a;", "Lcom/stripe/android/model/p1;", "callback", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/q1;Ljava/lang/String;Ljava/lang/String;Lf30/a;)V", "Lt30/f;", "T", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Ljn0/s;", "apiMethod", "l", "(Lf30/a;Lwn0/l;)V", "result", "k", "(Ljava/lang/Object;Lf30/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clientSecret", "", "expand", "Lcom/stripe/android/model/u0;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lf30/a;)V", "q", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/model/u0;", "Lcom/stripe/android/model/d1;", "s", "t", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/stripe/android/model/d1;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lcom/stripe/android/model/v0;", "g", "(Lcom/stripe/android/model/w0;Ljava/lang/String;Ljava/lang/String;Lf30/a;)V", "cvc", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf30/a;)V", "j", "(Lcom/stripe/android/model/q1;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "firstAmount", "secondAmount", "v", "(Ljava/lang/String;IILf30/a;)V", "descriptorCode", "w", "(Ljava/lang/String;Ljava/lang/String;Lf30/a;)V", "x", "y", "a", "Lz60/g;", "o", "()Lz60/g;", "b", "Lf30/p;", "getPaymentController$payments_core_release", "()Lf30/p;", "c", "Ljava/lang/String;", "n", "()Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "m", "f", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static AppInfo f64036i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f30.p paymentController;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String stripeAccountId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String publishableKey;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f64034g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f64035h = ApiVersion.INSTANCE.a().b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static boolean f64037j = true;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f64043c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(0);
            this.f64043c = str;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f64043c;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f64044c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(0);
            this.f64044c = str;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return this.f64044c;
        }
    }

    /* JADX INFO: renamed from: f30.h0$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lf30/h0$c;", "", "<init>", "()V", "Lo30/c;", "appInfo", "Lo30/c;", "b", "()Lo30/c;", "c", "(Lo30/c;)V", "getAppInfo$annotations", "", "advancedFraudSignalsEnabled", "Z", "a", "()Z", "setAdvancedFraudSignalsEnabled", "(Z)V", "getAdvancedFraudSignalsEnabled$annotations", "", "API_VERSION", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return h0.f64037j;
        }

        public final AppInfo b() {
            return h0.f64036i;
        }

        public final void c(AppInfo appInfo) {
            h0.f64036i = appInfo;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/s;", "Lcom/stripe/android/model/v0;", "<anonymous>", "()Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$createPaymentMethod$1", f = "Stripe.kt", i = {}, l = {779}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.l<Continuation<? super jn0.s<? extends PaymentMethod>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64045n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ PaymentMethodCreateParams f64047p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f64048q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f64049r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Continuation<? super d> continuation) {
            super(1, continuation);
            this.f64047p = paymentMethodCreateParams;
            this.f64048q = str;
            this.f64049r = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return h0.this.new d(this.f64047p, this.f64048q, this.f64049r, continuation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super jn0.s<? extends PaymentMethod>> continuation) {
            return invoke2((Continuation<? super jn0.s<PaymentMethod>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objJ;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64045n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z60.g stripeRepository = h0.this.getStripeRepository();
                PaymentMethodCreateParams paymentMethodCreateParams = this.f64047p;
                w30.l.Options options = new w30.l.Options(h0.this.getPublishableKey(), this.f64048q, this.f64049r);
                this.f64045n = 1;
                objJ = stripeRepository.j(paymentMethodCreateParams, options, this);
                if (objJ == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objJ = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objJ);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super jn0.s<PaymentMethod>> continuation) {
            return ((d) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/s;", "Lcom/stripe/android/model/p1;", "<anonymous>", "()Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$createToken$1", f = "Stripe.kt", i = {}, l = {1552}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.l<Continuation<? super jn0.s<? extends Token>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64050n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ q1 f64052p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f64053q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f64054r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(q1 q1Var, String str, String str2, Continuation<? super e> continuation) {
            super(1, continuation);
            this.f64052p = q1Var;
            this.f64053q = str;
            this.f64054r = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return h0.this.new e(this.f64052p, this.f64053q, this.f64054r, continuation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super jn0.s<? extends Token>> continuation) {
            return invoke2((Continuation<? super jn0.s<Token>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objC;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64050n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z60.g stripeRepository = h0.this.getStripeRepository();
                q1 q1Var = this.f64052p;
                w30.l.Options options = new w30.l.Options(h0.this.getPublishableKey(), this.f64053q, this.f64054r);
                this.f64050n = 1;
                objC = stripeRepository.c(q1Var, options, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objC = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objC);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super jn0.s<Token>> continuation) {
            return ((e) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.Stripe", f = "Stripe.kt", i = {}, l = {1535}, m = "createTokenOrThrow$payments_core_release", n = {}, s = {})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f64055n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f64057p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f64055n = obj;
            this.f64057p |= Integer.MIN_VALUE;
            return h0.this.j(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt30/f;", "T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$dispatchResult$2", f = "Stripe.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64058n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Object f64059o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f30.a<T> f64060p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Object obj, f30.a<? super T> aVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f64059o = obj;
            this.f64060p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new g(this.f64059o, this.f64060p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f64058n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            Object obj2 = this.f64059o;
            f30.a<T> aVar = this.f64060p;
            Throwable thE = jn0.s.e(obj2);
            if (thE == null) {
                aVar.a((t30.f) obj2);
            } else {
                aVar.onError(StripeException.INSTANCE.b(thE));
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt30/f;", "T", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$executeAsyncForResult$1", f = "Stripe.kt", i = {}, l = {1839, 1840}, m = "invokeSuspend", n = {}, s = {})
    static final class h extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64061n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ wn0.l<Continuation<? super jn0.s<? extends T>>, Object> f64062o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ h0 f64063p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ f30.a<T> f64064q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(wn0.l<? super Continuation<? super jn0.s<? extends T>>, ? extends Object> lVar, h0 h0Var, f30.a<? super T> aVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f64062o = lVar;
            this.f64063p = h0Var;
            this.f64064q = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return new h(this.f64062o, this.f64063p, this.f64064q, continuation);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to f30.h0$h for r4v1 'this'  java.lang.Object
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
                int r1 = r4.f64061n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L3f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                goto L2c
            L1e:
                jn0.t.b(r5)
                wn0.l<kotlin.coroutines.Continuation<? super jn0.s<? extends T>>, java.lang.Object> r5 = r4.f64062o
                r4.f64061n = r3
                java.lang.Object r5 = r5.invoke(r4)
                if (r5 != r0) goto L2c
                goto L3e
            L2c:
                jn0.s r5 = (jn0.s) r5
                java.lang.Object r5 = r5.getValue()
                f30.h0 r1 = r4.f64063p
                f30.a<T> r3 = r4.f64064q
                r4.f64061n = r2
                java.lang.Object r5 = f30.h0.a(r1, r5, r3, r4)
                if (r5 != r0) goto L3f
            L3e:
                return r0
            L3f:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: f30.h0.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/s;", "Lcom/stripe/android/model/u0;", "<anonymous>", "()Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$retrievePaymentIntent$1", f = "Stripe.kt", i = {}, l = {404}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements wn0.l<Continuation<? super jn0.s<? extends PaymentIntent>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64065n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f64067p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f64068q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List<String> f64069r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, String str2, List<String> list, Continuation<? super i> continuation) {
            super(1, continuation);
            this.f64067p = str;
            this.f64068q = str2;
            this.f64069r = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return h0.this.new i(this.f64067p, this.f64068q, this.f64069r, continuation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super jn0.s<? extends PaymentIntent>> continuation) {
            return invoke2((Continuation<? super jn0.s<PaymentIntent>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64065n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z60.g stripeRepository = h0.this.getStripeRepository();
                String str = this.f64067p;
                w30.l.Options options = new w30.l.Options(h0.this.getPublishableKey(), this.f64068q, null, 4, null);
                List<String> list = this.f64069r;
                this.f64065n = 1;
                objM = stripeRepository.m(str, options, list, this);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objM = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objM);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super jn0.s<PaymentIntent>> continuation) {
            return ((i) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/stripe/android/model/u0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/model/u0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$retrievePaymentIntentSynchronous$1", f = "Stripe.kt", i = {}, l = {442}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super PaymentIntent>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64070n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f64072p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f64073q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List<String> f64074r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, String str2, List<String> list, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f64072p = str;
            this.f64073q = str2;
            this.f64074r = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return h0.this.new j(this.f64072p, this.f64073q, this.f64074r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object objM;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64070n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z60.g stripeRepository = h0.this.getStripeRepository();
                String value = new PaymentIntent.ClientSecret(this.f64072p).getValue();
                w30.l.Options options = new w30.l.Options(h0.this.getPublishableKey(), this.f64073q, null, 4, null);
                List<String> list = this.f64074r;
                this.f64070n = 1;
                objM = stripeRepository.m(value, options, list, this);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objM = ((jn0.s) obj).getValue();
            }
            Throwable thE = jn0.s.e(objM);
            if (thE == null) {
                return objM;
            }
            throw StripeException.INSTANCE.b(thE);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PaymentIntent> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/s;", "Lcom/stripe/android/model/d1;", "<anonymous>", "()Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$retrieveSetupIntent$1", f = "Stripe.kt", i = {}, l = {668}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements wn0.l<Continuation<? super jn0.s<? extends SetupIntent>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64075n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f64077p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f64078q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List<String> f64079r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, List<String> list, Continuation<? super k> continuation) {
            super(1, continuation);
            this.f64077p = str;
            this.f64078q = str2;
            this.f64079r = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return h0.this.new k(this.f64077p, this.f64078q, this.f64079r, continuation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super jn0.s<? extends SetupIntent>> continuation) {
            return invoke2((Continuation<? super jn0.s<SetupIntent>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objG;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64075n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z60.g stripeRepository = h0.this.getStripeRepository();
                String str = this.f64077p;
                w30.l.Options options = new w30.l.Options(h0.this.getPublishableKey(), this.f64078q, null, 4, null);
                List<String> list = this.f64079r;
                this.f64075n = 1;
                objG = stripeRepository.g(str, options, list, this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objG = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objG);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super jn0.s<SetupIntent>> continuation) {
            return ((k) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/stripe/android/model/d1;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lcom/stripe/android/model/d1;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$retrieveSetupIntentSynchronous$1", f = "Stripe.kt", i = {}, l = {706}, m = "invokeSuspend", n = {}, s = {})
    static final class l extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super SetupIntent>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64080n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f64082p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f64083q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ List<String> f64084r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, List<String> list, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f64082p = str;
            this.f64083q = str2;
            this.f64084r = list;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return h0.this.new l(this.f64082p, this.f64083q, this.f64084r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws StripeException {
            Object objG;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64080n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z60.g stripeRepository = h0.this.getStripeRepository();
                String value = new SetupIntent.ClientSecret(this.f64082p).getValue();
                w30.l.Options options = new w30.l.Options(h0.this.getPublishableKey(), this.f64083q, null, 4, null);
                List<String> list = this.f64084r;
                this.f64080n = 1;
                objG = stripeRepository.g(value, options, list, this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objG = ((jn0.s) obj).getValue();
            }
            Throwable thE = jn0.s.e(objG);
            if (thE == null) {
                return objG;
            }
            throw StripeException.INSTANCE.b(thE);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SetupIntent> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/s;", "Lcom/stripe/android/model/u0;", "<anonymous>", "()Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$verifyPaymentIntentWithMicrodeposits$1", f = "Stripe.kt", i = {}, l = {1700}, m = "invokeSuspend", n = {}, s = {})
    static final class m extends SuspendLambda implements wn0.l<Continuation<? super jn0.s<? extends PaymentIntent>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64085n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f64087p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f64088q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f64089r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, int i11, int i12, Continuation<? super m> continuation) {
            super(1, continuation);
            this.f64087p = str;
            this.f64088q = i11;
            this.f64089r = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return h0.this.new m(this.f64087p, this.f64088q, this.f64089r, continuation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super jn0.s<? extends PaymentIntent>> continuation) {
            return invoke2((Continuation<? super jn0.s<PaymentIntent>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objN;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64085n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z60.g stripeRepository = h0.this.getStripeRepository();
                String str = this.f64087p;
                int i12 = this.f64088q;
                int i13 = this.f64089r;
                w30.l.Options options = new w30.l.Options(h0.this.getPublishableKey(), h0.this.getStripeAccountId(), null, 4, null);
                this.f64085n = 1;
                objN = stripeRepository.n(str, i12, i13, options, this);
                if (objN == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objN = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objN);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super jn0.s<PaymentIntent>> continuation) {
            return ((m) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/s;", "Lcom/stripe/android/model/u0;", "<anonymous>", "()Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$verifyPaymentIntentWithMicrodeposits$2", f = "Stripe.kt", i = {}, l = {1732}, m = "invokeSuspend", n = {}, s = {})
    static final class n extends SuspendLambda implements wn0.l<Continuation<? super jn0.s<? extends PaymentIntent>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64090n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f64092p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f64093q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(String str, String str2, Continuation<? super n> continuation) {
            super(1, continuation);
            this.f64092p = str;
            this.f64093q = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return h0.this.new n(this.f64092p, this.f64093q, continuation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super jn0.s<? extends PaymentIntent>> continuation) {
            return invoke2((Continuation<? super jn0.s<PaymentIntent>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objR;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64090n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z60.g stripeRepository = h0.this.getStripeRepository();
                String str = this.f64092p;
                String str2 = this.f64093q;
                w30.l.Options options = new w30.l.Options(h0.this.getPublishableKey(), h0.this.getStripeAccountId(), null, 4, null);
                this.f64090n = 1;
                objR = stripeRepository.r(str, str2, options, this);
                if (objR == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objR = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objR);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super jn0.s<PaymentIntent>> continuation) {
            return ((n) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/s;", "Lcom/stripe/android/model/d1;", "<anonymous>", "()Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$verifySetupIntentWithMicrodeposits$1", f = "Stripe.kt", i = {}, l = {1766}, m = "invokeSuspend", n = {}, s = {})
    static final class o extends SuspendLambda implements wn0.l<Continuation<? super jn0.s<? extends SetupIntent>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64094n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f64096p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f64097q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f64098r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str, int i11, int i12, Continuation<? super o> continuation) {
            super(1, continuation);
            this.f64096p = str;
            this.f64097q = i11;
            this.f64098r = i12;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return h0.this.new o(this.f64096p, this.f64097q, this.f64098r, continuation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super jn0.s<? extends SetupIntent>> continuation) {
            return invoke2((Continuation<? super jn0.s<SetupIntent>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objU;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64094n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z60.g stripeRepository = h0.this.getStripeRepository();
                String str = this.f64096p;
                int i12 = this.f64097q;
                int i13 = this.f64098r;
                w30.l.Options options = new w30.l.Options(h0.this.getPublishableKey(), h0.this.getStripeAccountId(), null, 4, null);
                this.f64094n = 1;
                objU = stripeRepository.u(str, i12, i13, options, this);
                if (objU == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objU = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objU);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super jn0.s<SetupIntent>> continuation) {
            return ((o) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljn0/s;", "Lcom/stripe/android/model/d1;", "<anonymous>", "()Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.Stripe$verifySetupIntentWithMicrodeposits$2", f = "Stripe.kt", i = {}, l = {1798}, m = "invokeSuspend", n = {}, s = {})
    static final class p extends SuspendLambda implements wn0.l<Continuation<? super jn0.s<? extends SetupIntent>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f64099n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f64101p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f64102q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(String str, String str2, Continuation<? super p> continuation) {
            super(1, continuation);
            this.f64101p = str;
            this.f64102q = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Continuation<?> continuation) {
            return h0.this.new p(this.f64101p, this.f64102q, continuation);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super jn0.s<? extends SetupIntent>> continuation) {
            return invoke2((Continuation<? super jn0.s<SetupIntent>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f64099n;
            if (i11 == 0) {
                jn0.t.b(obj);
                z60.g stripeRepository = h0.this.getStripeRepository();
                String str = this.f64101p;
                String str2 = this.f64102q;
                w30.l.Options options = new w30.l.Options(h0.this.getPublishableKey(), h0.this.getStripeAccountId(), null, 4, null);
                this.f64099n = 1;
                objI = stripeRepository.i(str, str2, options, this);
                if (objI == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                objI = ((jn0.s) obj).getValue();
            }
            return jn0.s.a(objI);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super jn0.s<SetupIntent>> continuation) {
            return ((p) create(continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public h0(z60.g stripeRepository, f30.p paymentController, String publishableKey, String str, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(paymentController, "paymentController");
        p013kotlin.jvm.internal.s.k(publishableKey, "publishableKey");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.stripeRepository = stripeRepository;
        this.paymentController = paymentController;
        this.stripeAccountId = str;
        this.workContext = workContext;
        this.publishableKey = new o30.a().b(publishableKey);
    }

    public static /* synthetic */ void f(h0 h0Var, String str, String str2, String str3, f30.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = h0Var.stripeAccountId;
        }
        h0Var.e(str, str2, str3, aVar);
    }

    public static /* synthetic */ void h(h0 h0Var, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, f30.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            str2 = h0Var.stripeAccountId;
        }
        h0Var.g(paymentMethodCreateParams, str, str2, aVar);
    }

    private final void i(q1 tokenParams, String stripeAccountId, String idempotencyKey, f30.a<? super Token> callback) {
        l(callback, new e(tokenParams, stripeAccountId, idempotencyKey, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends t30.f> Object k(Object obj, f30.a<? super T> aVar, Continuation<? super jn0.h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new g(obj, aVar, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
    }

    private final <T extends t30.f> void l(f30.a<? super T> callback, wn0.l<? super Continuation<? super jn0.s<? extends T>>, ? extends Object> apiMethod) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new h(apiMethod, this, callback, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentIntent r(h0 h0Var, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = h0Var.stripeAccountId;
        }
        if ((i11 & 4) != 0) {
            list = p013kotlin.collections.v.m();
        }
        return h0Var.q(str, str2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetupIntent u(h0 h0Var, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = h0Var.stripeAccountId;
        }
        if ((i11 & 4) != 0) {
            list = p013kotlin.collections.v.m();
        }
        return h0Var.t(str, str2, list);
    }

    public final void e(String cvc, String idempotencyKey, String stripeAccountId, f30.a<? super Token> callback) {
        p013kotlin.jvm.internal.s.k(cvc, "cvc");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        i(new CvcTokenParams(cvc), stripeAccountId, idempotencyKey, callback);
    }

    public final void g(PaymentMethodCreateParams paymentMethodCreateParams, String idempotencyKey, String stripeAccountId, f30.a<? super PaymentMethod> callback) {
        p013kotlin.jvm.internal.s.k(paymentMethodCreateParams, "paymentMethodCreateParams");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        l(callback, new d(paymentMethodCreateParams, stripeAccountId, idempotencyKey, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(q1 q1Var, String str, String str2, Continuation<? super Token> continuation) throws StripeException {
        f fVar;
        Object objC;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f64057p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f64057p = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object obj = fVar.f64055n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f64057p;
        if (i12 == 0) {
            jn0.t.b(obj);
            z60.g gVar = this.stripeRepository;
            w30.l.Options options = new w30.l.Options(this.publishableKey, str, str2);
            fVar.f64057p = 1;
            objC = gVar.c(q1Var, options, fVar);
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            objC = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(objC);
        if (thE == null) {
            return objC;
        }
        throw StripeException.INSTANCE.b(thE);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final z60.g getStripeRepository() {
        return this.stripeRepository;
    }

    public final void p(String clientSecret, String stripeAccountId, List<String> expand, f30.a<? super PaymentIntent> callback) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(expand, "expand");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        l(callback, new i(clientSecret, stripeAccountId, expand, null));
    }

    public final PaymentIntent q(String clientSecret, String stripeAccountId, List<String> expand) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(expand, "expand");
        return (PaymentIntent) BuildersKt__BuildersKt.runBlocking$default(null, new j(clientSecret, stripeAccountId, expand, null), 1, null);
    }

    public final void s(String clientSecret, String stripeAccountId, List<String> expand, f30.a<? super SetupIntent> callback) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(expand, "expand");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        l(callback, new k(clientSecret, stripeAccountId, expand, null));
    }

    public final SetupIntent t(String clientSecret, String stripeAccountId, List<String> expand) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(expand, "expand");
        return (SetupIntent) BuildersKt__BuildersKt.runBlocking$default(null, new l(clientSecret, stripeAccountId, expand, null), 1, null);
    }

    public final void v(String clientSecret, int firstAmount, int secondAmount, f30.a<? super PaymentIntent> callback) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        l(callback, new m(clientSecret, firstAmount, secondAmount, null));
    }

    public final void w(String clientSecret, String descriptorCode, f30.a<? super PaymentIntent> callback) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(descriptorCode, "descriptorCode");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        l(callback, new n(clientSecret, descriptorCode, null));
    }

    public final void x(String clientSecret, int firstAmount, int secondAmount, f30.a<? super SetupIntent> callback) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        l(callback, new o(clientSecret, firstAmount, secondAmount, null));
    }

    public final void y(String clientSecret, String descriptorCode, f30.a<? super SetupIntent> callback) {
        p013kotlin.jvm.internal.s.k(clientSecret, "clientSecret");
        p013kotlin.jvm.internal.s.k(descriptorCode, "descriptorCode");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        l(callback, new p(clientSecret, descriptorCode, null));
    }

    public /* synthetic */ h0(Context context, String str, String str2, boolean z11, Set set, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? false : z11, (Set<? extends i0>) ((i11 & 16) != 0 ? d1.d() : set));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h0(Context context, String publishableKey, String str, boolean z11, Set<? extends i0> betas) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(publishableKey, "publishableKey");
        p013kotlin.jvm.internal.s.k(betas, "betas");
        Context applicationContext = context.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        Context applicationContext2 = context.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext2, "getApplicationContext(...)");
        this(applicationContext, new com.stripe.android.networking.a(applicationContext2, new a(publishableKey), f64036i, o30.d.INSTANCE.a(z11), null, null, null, null, null, null, null, null, betas, null, null, 28656, null), o30.a.INSTANCE.a().b(publishableKey), str, z11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private h0(Context context, z60.g gVar, String str, String str2, boolean z11) {
        Context applicationContext = context.getApplicationContext();
        p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
        this(gVar, new com.stripe.android.b(applicationContext, new b(str), gVar, z11, null, null, null, null, null, DownloaderService.STATUS_HTTP_EXCEPTION, null), str, str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(z60.g stripeRepository, f30.p paymentController, String publishableKey, String str) {
        this(stripeRepository, paymentController, publishableKey, str, Dispatchers.getIO());
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(paymentController, "paymentController");
        p013kotlin.jvm.internal.s.k(publishableKey, "publishableKey");
    }
}
