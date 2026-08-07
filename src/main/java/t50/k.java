package t50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.AttachConsumerToLinkAccountSession;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.t1;
import expo.modules.contacts.Columns;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import n40.e0;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import r30.FraudDetectionData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0019H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b)\u0010\u001bJ(\u0010,\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b,\u0010-J4\u00104\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010\u00162\u0006\u00101\u001a\u0002002\b\u00103\u001a\u0004\u0018\u000102H\u0096@¢\u0006\u0004\b4\u00105J(\u00107\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u00162\u0006\u00101\u001a\u000200H\u0096@¢\u0006\u0004\b7\u00108J \u0010:\u001a\u0002092\u0006\u0010.\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b:\u0010\u001bJ \u0010=\u001a\u00020<2\u0006\u0010;\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b=\u0010\u001bJ(\u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0016H\u0096@¢\u0006\u0004\bA\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010ER\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010HR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010IR\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010KR\u0014\u0010N\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010M¨\u0006O"}, d2 = {"Lt50/k;", "Lt50/j;", "Lu50/a;", "financialConnectionsConsumersApiService", "Lm80/a;", "consumersApiService", "Lt50/g;", "consumerSessionRepository", "Lu50/c;", "provideApiRequestOptions", "Ljava/util/Locale;", "locale", "Lo30/d;", "logger", "Lr30/g;", "fraudDetectionDataRepository", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "Ln40/e0;", "isLinkWithStripe", "<init>", "(Lu50/a;Lm80/a;Lt50/g;Lu50/c;Ljava/util/Locale;Lo30/d;Lr30/g;Lcom/stripe/android/financialconnections/a$c;Ln40/e0;)V", "", Scopes.EMAIL, "clientSecret", "Lcom/stripe/android/model/u;", "h", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "source", "Lcom/stripe/android/model/t;", "consumerSession", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lcom/stripe/android/model/t;)V", Columns.LOOKUP_KEY, "j", "(Lcom/stripe/android/model/u;)V", "Lcom/stripe/android/model/v;", "signup", "k", "(Lcom/stripe/android/model/v;)V", "g", "phoneNumber", PlaceTypes.COUNTRY, "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "consumerSessionClientSecret", "connectionsMerchantName", "Lcom/stripe/android/model/t1;", "type", "Lcom/stripe/android/model/z;", "customEmailType", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/t1;Lcom/stripe/android/model/z;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verificationCode", "e", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/t1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/c;", "f", "bankAccountId", "Lcom/stripe/android/model/p;", "c", "paymentDetailsId", "expectedPaymentMethodType", "Lcom/stripe/android/model/e1;", "b", "Lu50/a;", "Lm80/a;", "Lt50/g;", "Lu50/c;", "Ljava/util/Locale;", "Lo30/d;", "Lr30/g;", "Lcom/stripe/android/financialconnections/a$c;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Ljava/lang/String;", "requestSurface", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class k implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u50.a financialConnectionsConsumersApiService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m80.a consumersApiService;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g consumerSessionRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final u50.c provideApiRequestOptions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final r30.g fraudDetectionDataRepository;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Mutex mutex;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String requestSurface;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {EnumC4419g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 178}, m = "confirmConsumerVerification", n = {"this", "consumerSessionClientSecret", "verificationCode", "type", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112543n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f112544o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f112545p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f112546q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f112547r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f112548s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f112550u;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112548s = obj;
            this.f112550u |= Integer.MIN_VALUE;
            return k.this.e(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CLIPBOARD_VALUE}, m = "createPaymentDetails", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f112551n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f112553p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112551n = obj;
            this.f112553p |= Integer.MIN_VALUE;
            return k.this.c(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {0, 0, 0, 0, 1, 1}, l = {EnumC4419g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 126}, m = "lookupConsumerSession", n = {"this", Scopes.EMAIL, "clientSecret", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112554n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f112555o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f112556p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f112557q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f112558r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f112560t;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112558r = obj;
            this.f112560t |= Integer.MIN_VALUE;
            return k.this.g(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE}, m = "sharePaymentDetails", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f112561n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f112563p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112561n = obj;
            this.f112563p |= Integer.MIN_VALUE;
            return k.this.b(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {EnumC4419g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 136}, m = "signUp", n = {"this", Scopes.EMAIL, "phoneNumber", PlaceTypes.COUNTRY, "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112564n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f112565o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f112566p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f112567q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f112568r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f112569s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f112571u;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112569s = obj;
            this.f112571u |= Integer.MIN_VALUE;
            return k.this.a(null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepositoryImpl", f = "FinancialConnectionsConsumerSessionRepository.kt", i = {0, 0, 0, 0, 0, 0, 1, 1}, l = {EnumC4419g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 160}, m = "startConsumerVerification", n = {"this", "consumerSessionClientSecret", "connectionsMerchantName", "type", "customEmailType", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1"})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112572n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f112573o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f112574p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f112575q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f112576r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f112577s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f112578t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f112580v;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f112578t = obj;
            this.f112580v |= Integer.MIN_VALUE;
            return k.this.d(null, null, null, null, this);
        }
    }

    public k(u50.a financialConnectionsConsumersApiService, m80.a consumersApiService, g consumerSessionRepository, u50.c provideApiRequestOptions, Locale locale, o30.d logger, r30.g fraudDetectionDataRepository, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext, e0 isLinkWithStripe) {
        p013kotlin.jvm.internal.s.k(financialConnectionsConsumersApiService, "financialConnectionsConsumersApiService");
        p013kotlin.jvm.internal.s.k(consumersApiService, "consumersApiService");
        p013kotlin.jvm.internal.s.k(consumerSessionRepository, "consumerSessionRepository");
        p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        p013kotlin.jvm.internal.s.k(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        p013kotlin.jvm.internal.s.k(isLinkWithStripe, "isLinkWithStripe");
        this.financialConnectionsConsumersApiService = financialConnectionsConsumersApiService;
        this.consumersApiService = consumersApiService;
        this.consumerSessionRepository = consumerSessionRepository;
        this.provideApiRequestOptions = provideApiRequestOptions;
        this.locale = locale;
        this.logger = logger;
        this.fraudDetectionDataRepository = fraudDetectionDataRepository;
        this.elementsSessionContext = elementsSessionContext;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
        this.requestSurface = isLinkWithStripe.invoke() ? "android_instant_debits" : "android_connections";
        fraudDetectionDataRepository.b();
    }

    private final Object h(String str, String str2, Continuation<? super ConsumerSessionLookup> continuation) {
        return this.financialConnectionsConsumersApiService.a(str, str2, this.requestSurface, continuation);
    }

    private final void i(String source, ConsumerSession consumerSession) {
        this.logger.debug("SYNC_CACHE: updating local consumer session from " + source);
        this.consumerSessionRepository.c(consumerSession);
    }

    private final void j(ConsumerSessionLookup lookup) {
        this.logger.debug("SYNC_CACHE: updating local consumer session from lookupConsumerSession");
        this.consumerSessionRepository.b(lookup.getConsumerSession(), lookup.getPublishableKey());
    }

    private final void k(ConsumerSessionSignup signup) {
        this.logger.debug("SYNC_CACHE: updating local consumer session from signUp");
        this.consumerSessionRepository.b(signup.getConsumerSession(), signup.getPublishableKey());
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00fc A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:59:0x00f6, B:61:0x00fc, B:64:0x0105), top: B:82:0x00f6 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // t50.j
    public Object a(String str, String str2, String str3, Continuation<? super ConsumerSessionSignup> continuation) throws Throwable {
        e eVar;
        String str4;
        String str5;
        String str6;
        Mutex mutex;
        k kVar;
        Object obj;
        Mutex mutex2;
        Mutex mutex3;
        m80.a aVar;
        String str7;
        Locale locale;
        Long amount;
        String currency;
        String strC;
        String strD;
        w30.l.Options optionsA;
        String str8;
        String str9;
        Long l11;
        String str10;
        String str11;
        com.stripe.android.model.w wVar;
        e eVar2;
        k kVar2;
        Object value;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f112571u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f112571u = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj2 = eVar.f112569s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f112571u;
        try {
            try {
                try {
                    try {
                        if (i12 == 0) {
                            jn0.t.b(obj2);
                            Mutex mutex4 = this.mutex;
                            eVar.f112564n = this;
                            str4 = str;
                            eVar.f112565o = str4;
                            str5 = str2;
                            eVar.f112566p = str5;
                            eVar.f112567q = str3;
                            eVar.f112568r = mutex4;
                            eVar.f112571u = 1;
                            if (mutex4.lock(null, eVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str6 = str3;
                            mutex = mutex4;
                            kVar = this;
                        } else {
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex3 = (Mutex) eVar.f112565o;
                                k kVar3 = (k) eVar.f112564n;
                                try {
                                    jn0.t.b(obj2);
                                    value = ((jn0.s) obj2).getValue();
                                    kVar2 = kVar3;
                                    obj = null;
                                    try {
                                        if (jn0.s.h(value)) {
                                            kVar2.k((ConsumerSessionSignup) value);
                                        }
                                        jn0.t.b(value);
                                        ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) value;
                                        mutex3.unlock(obj);
                                        return consumerSessionSignup;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        mutex3.unlock(obj);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    obj = null;
                                    mutex3.unlock(obj);
                                    throw th;
                                }
                            }
                            Mutex mutex5 = (Mutex) eVar.f112568r;
                            str6 = (String) eVar.f112567q;
                            str5 = (String) eVar.f112566p;
                            String str12 = (String) eVar.f112565o;
                            k kVar4 = (k) eVar.f112564n;
                            jn0.t.b(obj2);
                            mutex = mutex5;
                            str4 = str12;
                            kVar = kVar4;
                        }
                        Object objF = aVar.f(str4, str7, str6, null, locale, l11, str8, str11, str10, str9, wVar, optionsA, eVar2);
                        if (objF == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        kVar2 = kVar;
                        value = objF;
                        mutex3 = mutex2;
                        if (jn0.s.h(value)) {
                            kVar2.k((ConsumerSessionSignup) value);
                        }
                        jn0.t.b(value);
                        ConsumerSessionSignup consumerSessionSignup2 = (ConsumerSessionSignup) value;
                        mutex3.unlock(obj);
                        return consumerSessionSignup2;
                    } catch (Throwable th4) {
                        th = th4;
                        mutex3 = mutex2;
                        mutex3.unlock(obj);
                        throw th;
                    }
                    eVar.f112566p = null;
                    eVar.f112567q = null;
                    eVar.f112568r = null;
                    eVar.f112571u = 2;
                    eVar2 = eVar;
                    mutex2 = mutex;
                    obj = null;
                } catch (Throwable th5) {
                    th = th5;
                    obj = null;
                    mutex2 = mutex;
                    mutex3 = mutex2;
                    mutex3.unlock(obj);
                    throw th;
                }
                optionsA = kVar.provideApiRequestOptions.a(false);
                str8 = currency;
                str9 = kVar.requestSurface;
                l11 = amount;
                str10 = strD;
                str11 = strC;
                wVar = com.stripe.android.model.w.EnteredPhoneNumberClickedSaveToLink;
                eVar.f112564n = kVar;
                eVar.f112565o = mutex;
            } catch (Throwable th6) {
                th = th6;
                mutex2 = mutex;
                obj = null;
            }
            aVar = kVar.consumersApiService;
            str7 = str5;
            locale = kVar.locale;
            com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = kVar.elementsSessionContext;
            if (elementsSessionContext != null) {
                try {
                    amount = elementsSessionContext.getAmount();
                } catch (Throwable th7) {
                    th = th7;
                    obj = null;
                    mutex3 = mutex;
                    mutex3.unlock(obj);
                    throw th;
                }
            } else {
                amount = null;
            }
            com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext2 = kVar.elementsSessionContext;
            currency = elementsSessionContext2 != null ? elementsSessionContext2.getCurrency() : null;
            com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext3 = kVar.elementsSessionContext;
            strC = elementsSessionContext3 != null ? elementsSessionContext3.c() : null;
            com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext4 = kVar.elementsSessionContext;
            strD = elementsSessionContext4 != null ? elementsSessionContext4.d() : null;
        } catch (Throwable th8) {
            th = th8;
            obj = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // t50.j
    public Object b(String str, String str2, String str3, Continuation<? super SharePaymentDetails> continuation) {
        d dVar;
        Object objB;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f112563p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f112563p = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f112561n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar2.f112563p;
        if (i12 == 0) {
            jn0.t.b(obj);
            FraudDetectionData fraudDetectionDataA = this.fraudDetectionDataRepository.a();
            Map<String, String> mapC = fraudDetectionDataA != null ? fraudDetectionDataA.c() : null;
            if (mapC == null) {
                mapC = v0.i();
            }
            m80.a aVar = this.consumersApiService;
            String str4 = this.requestSurface;
            w30.l.Options optionsA = this.provideApiRequestOptions.a(false);
            dVar2.f112563p = 1;
            objB = aVar.b(str2, str, str3, str4, optionsA, mapC, dVar2);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            objB = ((jn0.s) obj).getValue();
        }
        jn0.t.b(objB);
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // t50.j
    public Object c(String str, String str2, Continuation<? super ConsumerPaymentDetails> continuation) {
        b bVar;
        Object objE;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f112553p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f112553p = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f112551n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar2.f112553p;
        if (i12 == 0) {
            jn0.t.b(obj);
            m80.a aVar = this.consumersApiService;
            com.stripe.android.model.q.BankAccount aVar2 = new com.stripe.android.model.q.BankAccount(str);
            String str3 = this.requestSurface;
            w30.l.Options optionsA = this.provideApiRequestOptions.a(true);
            bVar2.f112553p = 1;
            objE = aVar.e(str2, aVar2, str3, optionsA, bVar2);
            if (objE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            objE = ((jn0.s) obj).getValue();
        }
        jn0.t.b(objE);
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // t50.j
    public Object d(String str, String str2, t1 t1Var, com.stripe.android.model.z zVar, Continuation<? super ConsumerSession> continuation) throws Throwable {
        f fVar;
        String str3;
        t1 t1Var2;
        com.stripe.android.model.z zVar2;
        Mutex mutex;
        k kVar;
        String str4;
        Mutex mutex2;
        k kVar2;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f112580v;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f112580v = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f112578t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar2.f112580v;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                Mutex mutex3 = this.mutex;
                fVar2.f112572n = this;
                str3 = str;
                fVar2.f112573o = str3;
                fVar2.f112574p = str2;
                t1Var2 = t1Var;
                fVar2.f112575q = t1Var2;
                zVar2 = zVar;
                fVar2.f112576r = zVar2;
                fVar2.f112577s = mutex3;
                fVar2.f112580v = 1;
                if (mutex3.lock(null, fVar2) != coroutine_suspended) {
                    mutex = mutex3;
                    kVar = this;
                    str4 = str2;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) fVar2.f112573o;
                kVar2 = (k) fVar2.f112572n;
                try {
                    jn0.t.b(obj);
                    kVar2.i("startConsumerVerification", (ConsumerSession) obj);
                    ConsumerSession consumerSession = (ConsumerSession) obj;
                    mutex2.unlock(null);
                    return consumerSession;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex4 = (Mutex) fVar2.f112577s;
            com.stripe.android.model.z zVar3 = (com.stripe.android.model.z) fVar2.f112576r;
            t1 t1Var3 = (t1) fVar2.f112575q;
            String str5 = (String) fVar2.f112574p;
            String str6 = (String) fVar2.f112573o;
            k kVar3 = (k) fVar2.f112572n;
            jn0.t.b(obj);
            mutex = mutex4;
            str3 = str6;
            kVar = kVar3;
            zVar2 = zVar3;
            str4 = str5;
            t1Var2 = t1Var3;
            m80.a aVar = kVar.consumersApiService;
            Locale locale = kVar.locale;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            String str7 = kVar.requestSurface;
            w30.l.Options optionsA = kVar.provideApiRequestOptions.a(false);
            p013kotlin.jvm.internal.s.h(locale);
            fVar2.f112572n = kVar;
            fVar2.f112573o = mutex;
            fVar2.f112574p = null;
            fVar2.f112575q = null;
            fVar2.f112576r = null;
            fVar2.f112577s = null;
            fVar2.f112580v = 2;
            Object objC = aVar.c(str3, locale, str7, t1Var2, zVar2, str4, optionsA, fVar2);
            if (objC != coroutine_suspended) {
                kVar2 = kVar;
                obj = objC;
                mutex2 = mutex;
                kVar2.i("startConsumerVerification", (ConsumerSession) obj);
                ConsumerSession consumerSession2 = (ConsumerSession) obj;
                mutex2.unlock(null);
                return consumerSession2;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // t50.j
    public Object e(String str, String str2, t1 t1Var, Continuation<? super ConsumerSession> continuation) throws Throwable {
        a aVar;
        Mutex mutex;
        String str3;
        k kVar;
        t1 t1Var2;
        Throwable th2;
        Mutex mutex2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f112550u;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f112550u = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f112548s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f112550u;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                mutex = this.mutex;
                aVar2.f112543n = this;
                aVar2.f112544o = str;
                aVar2.f112545p = str2;
                aVar2.f112546q = t1Var;
                aVar2.f112547r = mutex;
                aVar2.f112550u = 1;
                if (mutex.lock(null, aVar2) != coroutine_suspended) {
                    str3 = str2;
                    kVar = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) aVar2.f112544o;
                kVar = (k) aVar2.f112543n;
                try {
                    jn0.t.b(obj);
                    kVar.i("confirmConsumerVerification", (ConsumerSession) obj);
                    mutex2.unlock(null);
                    return obj;
                } catch (Throwable th3) {
                    th2 = th3;
                    mutex2.unlock(null);
                    throw th2;
                }
            }
            Mutex mutex3 = (Mutex) aVar2.f112547r;
            t1Var = (t1) aVar2.f112546q;
            String str4 = (String) aVar2.f112545p;
            String str5 = (String) aVar2.f112544o;
            k kVar2 = (k) aVar2.f112543n;
            jn0.t.b(obj);
            str3 = str4;
            kVar = kVar2;
            mutex = mutex3;
            str = str5;
            m80.a aVar3 = kVar.consumersApiService;
            String str6 = kVar.requestSurface;
            w30.l.Options optionsA = kVar.provideApiRequestOptions.a(false);
            aVar2.f112543n = kVar;
            aVar2.f112544o = mutex;
            aVar2.f112545p = null;
            aVar2.f112546q = null;
            aVar2.f112547r = null;
            aVar2.f112550u = 2;
            Object objD = aVar3.d(str, str3, str6, t1Var2, optionsA, aVar2);
            if (objD != coroutine_suspended) {
                Mutex mutex4 = mutex;
                obj = objD;
                mutex2 = mutex4;
                kVar.i("confirmConsumerVerification", (ConsumerSession) obj);
                mutex2.unlock(null);
                return obj;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            th2 = th4;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th2;
        }
        t1Var2 = t1Var;
    }

    @Override // t50.j
    public Object f(String str, String str2, Continuation<? super AttachConsumerToLinkAccountSession> continuation) {
        return this.consumersApiService.g(str, str2, this.requestSurface, this.provideApiRequestOptions.a(false), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // t50.j
    public Object g(String str, String str2, Continuation<? super ConsumerSessionLookup> continuation) throws Throwable {
        c cVar;
        Mutex mutex;
        String str3;
        k kVar;
        Mutex mutex2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f112560t;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f112560t = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f112558r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f112560t;
        try {
            if (i12 == 0) {
                jn0.t.b(obj);
                mutex = this.mutex;
                cVar.f112554n = this;
                cVar.f112555o = str;
                cVar.f112556p = str2;
                cVar.f112557q = mutex;
                cVar.f112560t = 1;
                if (mutex.lock(null, cVar) != coroutine_suspended) {
                    str3 = str2;
                    kVar = this;
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) cVar.f112555o;
                kVar = (k) cVar.f112554n;
                try {
                    jn0.t.b(obj);
                    kVar.j((ConsumerSessionLookup) obj);
                    ConsumerSessionLookup consumerSessionLookup = (ConsumerSessionLookup) obj;
                    mutex2.unlock(null);
                    return consumerSessionLookup;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) cVar.f112557q;
            String str4 = (String) cVar.f112556p;
            String str5 = (String) cVar.f112555o;
            k kVar2 = (k) cVar.f112554n;
            jn0.t.b(obj);
            mutex = mutex3;
            str = str5;
            str3 = str4;
            kVar = kVar2;
            cVar.f112554n = kVar;
            cVar.f112555o = mutex;
            cVar.f112556p = null;
            cVar.f112557q = null;
            cVar.f112560t = 2;
            Object objH = kVar.h(str, str3, cVar);
            if (objH != coroutine_suspended) {
                Mutex mutex4 = mutex;
                obj = objH;
                mutex2 = mutex4;
                kVar.j((ConsumerSessionLookup) obj);
                ConsumerSessionLookup consumerSessionLookup2 = (ConsumerSessionLookup) obj;
                mutex2.unlock(null);
                return consumerSessionLookup2;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
