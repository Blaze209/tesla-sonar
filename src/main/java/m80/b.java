package m80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.AttachConsumerToLinkAccountSession;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.q;
import com.stripe.android.model.t1;
import com.stripe.android.model.w;
import com.stripe.android.model.z;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import jn0.s;
import jn0.t;
import jn0.x;
import o30.AppInfo;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import w30.b0;
import w30.j0;
import w30.l;
import x60.g;
import x60.i;
import x60.j;
import x60.k;
import x60.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001 B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0088\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010 \u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b \u0010!JL\u0010)\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b)\u0010*J8\u0010,\u001a\u00020(2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b,\u0010-J0\u00100\u001a\u00020/2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b0\u00101J<\u00105\u001a\b\u0012\u0004\u0012\u0002040\u001b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106JZ\u0010=\u001a\b\u0012\u0004\u0012\u00020<0\u001b2\u0006\u0010\"\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\u0006\u00108\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010:09H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010?R\u0014\u0010B\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010D\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Lm80/b;", "Lm80/a;", "Lw30/j0;", "stripeNetworkClient", "", "apiVersion", "sdkVersion", "Lo30/c;", "appInfo", "<init>", "(Lw30/j0;Ljava/lang/String;Ljava/lang/String;Lo30/c;)V", Scopes.EMAIL, "phoneNumber", PlaceTypes.COUNTRY, "name", "Ljava/util/Locale;", "locale", "", "amount", "currency", "paymentIntentId", "setupIntentId", "requestSurface", "Lcom/stripe/android/model/w;", "consentAction", "Lw30/l$c;", "requestOptions", "Ljn0/s;", "Lcom/stripe/android/model/v;", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/w;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/u;", "a", "(Ljava/lang/String;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSessionClientSecret", "Lcom/stripe/android/model/t1;", "type", "Lcom/stripe/android/model/z;", "customEmailType", "connectionsMerchantName", "Lcom/stripe/android/model/t;", "c", "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Lcom/stripe/android/model/t1;Lcom/stripe/android/model/z;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verificationCode", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/t1;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clientSecret", "Lcom/stripe/android/model/c;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/q;", "paymentDetailsCreateParams", "Lcom/stripe/android/model/p;", "e", "(Ljava/lang/String;Lcom/stripe/android/model/q;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentDetailsId", "expectedPaymentMethodType", "", "", "extraParams", "Lcom/stripe/android/model/e1;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lw30/l$c;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lw30/j0;", "Lu30/b;", "Lu30/b;", "stripeErrorJsonParser", "Lw30/l$b;", "Lw30/l$b;", "apiRequestFactory", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f91569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f91570f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f91571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f91572h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f91573i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f91574j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f91575k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j0 stripeNetworkClient;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u30.b stripeErrorJsonParser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final l.b apiRequestFactory;

    /* JADX INFO: renamed from: m80.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lm80/b$a;", "", "<init>", "()V", "", "path", "b", "(Ljava/lang/String;)Ljava/lang/String;", "createPaymentDetails", "Ljava/lang/String;", "sharePaymentDetails", "payments-model_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(String path) {
            return "https://api.stripe.com/v1/" + path;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: m80.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.repository.ConsumersApiServiceImpl", f = "ConsumersApiService.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE}, m = "createPaymentDetails-yxL6bBk", n = {}, s = {})
    static final class C1956b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f91579n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f91581p;

        C1956b(Continuation<? super C1956b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f91579n = obj;
            this.f91581p |= Integer.MIN_VALUE;
            Object objE = b.this.e(null, null, null, null, this);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : s.a(objE);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.repository.ConsumersApiServiceImpl", f = "ConsumersApiService.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE}, m = "sharePaymentDetails-bMdYcbs", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f91582n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f91584p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f91582n = obj;
            this.f91584p |= Integer.MIN_VALUE;
            Object objB = b.this.b(null, null, null, null, null, null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : s.a(objB);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.repository.ConsumersApiServiceImpl", f = "ConsumersApiService.kt", i = {}, l = {125}, m = "signUp-1iavgos", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f91585n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f91587p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f91585n = obj;
            this.f91587p |= Integer.MIN_VALUE;
            Object objF = b.this.f(null, null, null, null, null, null, null, null, null, null, null, null, this);
            return objF == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objF : s.a(objF);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f91569e = companion.b("consumers/accounts/sign_up");
        f91570f = companion.b("consumers/sessions/lookup");
        f91571g = companion.b("consumers/sessions/start_verification");
        f91572h = companion.b("consumers/sessions/confirm_verification");
        f91573i = companion.b("consumers/attach_link_consumer_to_link_account_session");
        f91574j = companion.b("consumers/payment_details");
        f91575k = companion.b("consumers/payment_details/share");
    }

    public b(j0 stripeNetworkClient, String apiVersion, String sdkVersion, AppInfo appInfo) {
        p013kotlin.jvm.internal.s.k(stripeNetworkClient, "stripeNetworkClient");
        p013kotlin.jvm.internal.s.k(apiVersion, "apiVersion");
        p013kotlin.jvm.internal.s.k(sdkVersion, "sdkVersion");
        this.stripeNetworkClient = stripeNetworkClient;
        this.stripeErrorJsonParser = new u30.b();
        this.apiRequestFactory = new l.b(appInfo, apiVersion, sdkVersion);
    }

    @Override // m80.a
    public Object a(String str, String str2, l.Options options, Continuation<? super ConsumerSessionLookup> continuation) {
        u30.b bVar = this.stripeErrorJsonParser;
        j0 j0Var = this.stripeNetworkClient;
        l.b bVar2 = this.apiRequestFactory;
        String str3 = f91570f;
        Pair pairA = x.a("request_surface", str2);
        String lowerCase = str.toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        return b0.a(j0Var, bVar, l.b.d(bVar2, str3, options, v0.m(pairA, x.a("email_address", lowerCase)), false, 8, null), new j(), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // m80.a
    public Object b(String str, String str2, String str3, String str4, l.Options options, Map<String, ? extends Object> map, Continuation<? super s<SharePaymentDetails>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f91584p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f91584p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f91582n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f91584p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        t.b(obj);
        u30.b bVar = this.stripeErrorJsonParser;
        j0 j0Var = this.stripeNetworkClient;
        l lVarD = l.b.d(this.apiRequestFactory, f91575k, options, v0.r(v0.m(x.a("request_surface", str4), x.a("id", str2), x.a("expected_payment_method_type", str3), x.a("credentials", v0.f(x.a("consumer_session_client_secret", str)))), map), false, 8, null);
        y yVar = y.f122906b;
        cVar.f91584p = 1;
        Object objB = b0.b(j0Var, bVar, lVarD, yVar, cVar);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    @Override // m80.a
    public Object c(String str, Locale locale, String str2, t1 t1Var, z zVar, String str3, l.Options options, Continuation<? super ConsumerSession> continuation) {
        u30.b bVar = this.stripeErrorJsonParser;
        j0 j0Var = this.stripeNetworkClient;
        l.b bVar2 = this.apiRequestFactory;
        String str4 = f91571g;
        Map mapM = v0.m(x.a("request_surface", str2), x.a("credentials", v0.f(x.a("consumer_session_client_secret", str))), x.a("type", t1Var.getValue()), x.a("custom_email_type", zVar != null ? zVar.getValue() : null), x.a("connections_merchant_name", str3), x.a("locale", locale.toLanguageTag()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return b0.a(j0Var, bVar, l.b.d(bVar2, str4, options, linkedHashMap, false, 8, null), new i(), continuation);
    }

    @Override // m80.a
    public Object d(String str, String str2, String str3, t1 t1Var, l.Options options, Continuation<? super ConsumerSession> continuation) {
        return b0.a(this.stripeNetworkClient, this.stripeErrorJsonParser, l.b.d(this.apiRequestFactory, f91572h, options, v0.m(x.a("request_surface", str3), x.a("credentials", v0.f(x.a("consumer_session_client_secret", str))), x.a("type", t1Var.getValue()), x.a("code", str2)), false, 8, null), new i(), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // m80.a
    public Object e(String str, q qVar, String str2, l.Options options, Continuation<? super s<ConsumerPaymentDetails>> continuation) {
        C1956b c1956b;
        if (continuation instanceof C1956b) {
            c1956b = (C1956b) continuation;
            int i11 = c1956b.f91581p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1956b.f91581p = i11 - Integer.MIN_VALUE;
            } else {
                c1956b = new C1956b(continuation);
            }
        } else {
            c1956b = new C1956b(continuation);
        }
        Object obj = c1956b.f91579n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1956b.f91581p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        t.b(obj);
        u30.b bVar = this.stripeErrorJsonParser;
        j0 j0Var = this.stripeNetworkClient;
        l lVarD = l.b.d(this.apiRequestFactory, f91574j, options, v0.r(v0.m(x.a("request_surface", str2), x.a("credentials", v0.f(x.a("consumer_session_client_secret", str)))), qVar.c3()), false, 8, null);
        g gVar = g.f122840b;
        c1956b.f91581p = 1;
        Object objB = b0.b(j0Var, bVar, lVarD, gVar, c1956b);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // m80.a
    public Object f(String str, String str2, String str3, String str4, Locale locale, Long l11, String str5, String str6, String str7, String str8, w wVar, l.Options options, Continuation<? super s<ConsumerSessionSignup>> continuation) {
        d dVar;
        Map mapI;
        Map mapI2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f91587p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f91587p = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f91585n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f91587p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        t.b(obj);
        u30.b bVar = this.stripeErrorJsonParser;
        j0 j0Var = this.stripeNetworkClient;
        l.b bVar2 = this.apiRequestFactory;
        String str9 = f91569e;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
        Map mapM = v0.m(x.a("email_address", lowerCase), x.a("phone_number", str2), x.a(PlaceTypes.COUNTRY, str3), x.a("country_inferring_method", "PHONE_NUMBER"), x.a("amount", l11), x.a("currency", str5), x.a("consent_action", wVar.getValue()), x.a("request_surface", str8));
        if (locale == null || (mapI = v0.f(x.a("locale", locale.toLanguageTag()))) == null) {
            mapI = v0.i();
        }
        Map mapR = v0.r(mapM, mapI);
        if (str4 == null || (mapI2 = v0.f(x.a("legal_name", str4))) == null) {
            mapI2 = v0.i();
        }
        Map mapR2 = v0.r(mapR, mapI2);
        Map mapF = str6 != null ? v0.f(x.a("financial_incentive[payment_intent]", str6)) : null;
        if (mapF == null) {
            mapF = v0.i();
        }
        Map mapR3 = v0.r(mapR2, mapF);
        Map mapF2 = str7 != null ? v0.f(x.a("financial_incentive[setup_intent]", str7)) : null;
        if (mapF2 == null) {
            mapF2 = v0.i();
        }
        l lVarD = l.b.d(bVar2, str9, options, v0.r(mapR3, mapF2), false, 8, null);
        k kVar = k.f122847b;
        dVar.f91587p = 1;
        Object objB = b0.b(j0Var, bVar, lVarD, kVar, dVar);
        return objB == coroutine_suspended ? coroutine_suspended : objB;
    }

    @Override // m80.a
    public Object g(String str, String str2, String str3, l.Options options, Continuation<? super AttachConsumerToLinkAccountSession> continuation) {
        return b0.a(this.stripeNetworkClient, this.stripeErrorJsonParser, l.b.d(this.apiRequestFactory, f91573i, options, v0.m(x.a("request_surface", str3), x.a("credentials", v0.f(x.a("consumer_session_client_secret", str))), x.a("link_account_session", str2)), false, 8, null), x60.c.f122824b, continuation);
    }
}
