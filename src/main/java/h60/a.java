package h60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.q;
import com.stripe.android.model.w;
import java.util.Locale;
import java.util.Map;
import jn0.h0;
import jn0.s;
import jn0.t;
import jn0.x;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import w30.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 ?2\u00020\u0001:\u0001\u0019BW\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJF\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00172\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"JN\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u00172\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00032\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u00032\u0006\u0010+\u001a\u00020*H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J<\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00172\u0006\u0010$\u001a\u00020#2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J.\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00172\u0006\u0010(\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00106R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00107R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010:R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006@"}, d2 = {"Lh60/a;", "Lh60/c;", "Lkotlin/Function0;", "", "publishableKeyProvider", "stripeAccountIdProvider", "Lz60/g;", "stripeRepository", "Lm80/a;", "consumersApiService", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Ljava/util/Locale;", "locale", "Lh70/h;", "errorReporter", "<init>", "(Lwn0/a;Lwn0/a;Lz60/g;Lm80/a;Lkotlin/coroutines/CoroutineContext;Ljava/util/Locale;Lh70/h;)V", "consumerAccountPublishableKey", "Lw30/l$c;", "k", "(Ljava/lang/String;)Lw30/l$c;", Scopes.EMAIL, "Ljn0/s;", "Lcom/stripe/android/model/u;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phone", PlaceTypes.COUNTRY, "name", "Lcom/stripe/android/model/w;", "consentAction", "Lcom/stripe/android/model/v;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/w;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "userEmail", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "consumerSessionClientSecret", "consumerPublishableKey", "", "active", "Lc60/e$a;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/w0;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "last4", "Lc60/e;", "e", "(Lcom/stripe/android/model/w0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/t;", "c", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwn0/a;", "Lz60/g;", "Lm80/a;", "Lkotlin/coroutines/CoroutineContext;", "f", "Ljava/util/Locale;", "g", "Lh70/h;", "h", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements h60.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final C1484a f70914h = new C1484a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f70915i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> publishableKeyProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<String> stripeAccountIdProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final m80.a consumersApiService;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Locale locale;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: h60.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh60/a$a;", "", "<init>", "()V", "", "REQUEST_SURFACE", "Ljava/lang/String;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class C1484a {
        public /* synthetic */ C1484a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1484a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository", f = "LinkApiRepository.kt", i = {}, l = {62}, m = "consumerSignUp-hUnOzRk", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f70923n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f70925p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70923n = obj;
            this.f70925p |= Integer.MIN_VALUE;
            Object objB = a.this.b(null, null, null, null, null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : s.a(objB);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lcom/stripe/android/model/v;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$consumerSignUp$2", f = "LinkApiRepository.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends ConsumerSessionSignup>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70926n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f70928p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f70929q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f70930r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f70931s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ w f70932t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, String str3, String str4, w wVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f70928p = str;
            this.f70929q = str2;
            this.f70930r = str3;
            this.f70931s = str4;
            this.f70932t = wVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new c(this.f70928p, this.f70929q, this.f70930r, this.f70931s, this.f70932t, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends ConsumerSessionSignup>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<ConsumerSessionSignup>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f70926n;
            if (i11 == 0) {
                t.b(obj);
                m80.a aVar = a.this.consumersApiService;
                Locale locale = a.this.locale;
                l.Options optionsL = a.l(a.this, null, 1, null);
                String str = this.f70928p;
                String str2 = this.f70929q;
                String str3 = this.f70930r;
                String str4 = this.f70931s;
                w wVar = this.f70932t;
                this.f70926n = 1;
                objF = aVar.f(str, str2, str3, str4, locale, null, null, null, null, "android_payment_element", wVar, optionsL, this);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objF = ((s) obj).getValue();
            }
            return s.a(objF);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<ConsumerSessionSignup>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository", f = "LinkApiRepository.kt", i = {}, l = {86}, m = "createCardPaymentDetails-bMdYcbs", n = {}, s = {})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f70933n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f70935p;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70933n = obj;
            this.f70935p |= Integer.MIN_VALUE;
            Object objD = a.this.d(null, null, null, null, null, false, this);
            return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : s.a(objD);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lc60/e$a;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$createCardPaymentDetails$2", f = "LinkApiRepository.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends c60.e.a>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70936n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f70938p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ PaymentMethodCreateParams f70939q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f70940r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f70941s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f70942t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, PaymentMethodCreateParams paymentMethodCreateParams, String str2, boolean z11, String str3, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f70938p = str;
            this.f70939q = paymentMethodCreateParams;
            this.f70940r = str2;
            this.f70941s = z11;
            this.f70942t = str3;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new e(this.f70938p, this.f70939q, this.f70940r, this.f70941s, this.f70942t, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends c60.e.a>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<c60.e.a>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Object objE;
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f70936n;
            if (i11 == 0) {
                t.b(obj);
                m80.a aVar = a.this.consumersApiService;
                String str = this.f70938p;
                q.Card card = new q.Card(this.f70939q.c3(), this.f70940r, this.f70941s);
                l.Options optionsK = a.this.k(this.f70942t);
                this.f70936n = 1;
                eVar = this;
                objE = aVar.e(str, card, "android_payment_element", optionsK, eVar);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objE = ((s) obj).getValue();
                eVar = this;
            }
            PaymentMethodCreateParams paymentMethodCreateParams = eVar.f70939q;
            String str2 = eVar.f70938p;
            if (s.h(objE)) {
                try {
                    ConsumerPaymentDetails.e eVar2 = (ConsumerPaymentDetails.e) v.o0(((ConsumerPaymentDetails) objE).a());
                    objB = s.b(new c60.e.a(eVar2, PaymentMethodCreateParams.INSTANCE.L(eVar2.getId(), str2, q.Card.INSTANCE.a(paymentMethodCreateParams.c3())), paymentMethodCreateParams));
                } catch (Throwable th2) {
                    s.Companion companion = s.INSTANCE;
                    objE = t.a(th2);
                    objB = s.b(objE);
                }
            } else {
                objB = s.b(objE);
            }
            a aVar2 = a.this;
            Throwable thE = s.e(objB);
            if (thE != null) {
                h70.h.b.a(aVar2.errorReporter, h70.h.d.LINK_CREATE_CARD_FAILURE, StripeException.INSTANCE.b(thE), null, 4, null);
            }
            return s.a(objB);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<c60.e.a>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository", f = "LinkApiRepository.kt", i = {}, l = {149}, m = "logOut-0E7RQCE", n = {}, s = {})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f70943n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f70945p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70943n = obj;
            this.f70945p |= Integer.MIN_VALUE;
            Object objC = a.this.c(null, null, this);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : s.a(objC);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lcom/stripe/android/model/t;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$logOut$2", f = "LinkApiRepository.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends ConsumerSession>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70946n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f70948p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f70949q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f70948p = str;
            this.f70949q = str2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new g(this.f70948p, this.f70949q, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends ConsumerSession>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<ConsumerSession>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f70946n;
            if (i11 == 0) {
                t.b(obj);
                z60.g gVar = a.this.stripeRepository;
                String str = this.f70948p;
                String str2 = this.f70949q;
                l.Options optionsK = a.this.k(str2);
                this.f70946n = 1;
                objA = gVar.a(str, str2, optionsK, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objA = ((s) obj).getValue();
            }
            return s.a(objA);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<ConsumerSession>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository", f = "LinkApiRepository.kt", i = {}, l = {44}, m = "lookupConsumer-gIAlu-s", n = {}, s = {})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f70950n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f70952p;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70950n = obj;
            this.f70952p |= Integer.MIN_VALUE;
            Object objA = a.this.a(null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lcom/stripe/android/model/u;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$lookupConsumer$2", f = "LinkApiRepository.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends ConsumerSessionLookup>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70953n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f70954o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f70956q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f70956q = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            i iVar = a.this.new i(this.f70956q, continuation);
            iVar.f70954o = obj;
            return iVar;
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends ConsumerSessionLookup>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<ConsumerSessionLookup>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f70953n;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    a aVar = a.this;
                    String str = this.f70956q;
                    s.Companion companion = s.INSTANCE;
                    m80.a aVar2 = aVar.consumersApiService;
                    l.Options optionsL = a.l(aVar, null, 1, null);
                    this.f70953n = 1;
                    obj = aVar2.a(str, "android_payment_element", optionsL, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                if (obj == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                objB = s.b((ConsumerSessionLookup) obj);
                return s.a(objB);
            } catch (Throwable th2) {
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th2));
            }
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<ConsumerSessionLookup>> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository", f = "LinkApiRepository.kt", i = {}, l = {121}, m = "shareCardPaymentDetails-yxL6bBk", n = {}, s = {})
    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f70957n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f70959p;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f70957n = obj;
            this.f70959p |= Integer.MIN_VALUE;
            Object objE = a.this.e(null, null, null, null, this);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : s.a(objE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "Lc60/e$b;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.link.repositories.LinkApiRepository$shareCardPaymentDetails$2", f = "LinkApiRepository.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
    static final class k extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends c60.e.b>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f70960n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f70962p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f70963q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ PaymentMethodCreateParams f70964r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f70965s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f70962p = str;
            this.f70963q = str2;
            this.f70964r = paymentMethodCreateParams;
            this.f70965s = str3;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return a.this.new k(this.f70962p, this.f70963q, this.f70964r, this.f70965s, continuation);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends c60.e.b>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super s<c60.e.b>>) continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            k kVar;
            Object objD;
            Object objB;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f70960n;
            if (i11 == 0) {
                t.b(obj);
                z60.g gVar = a.this.stripeRepository;
                String str = this.f70962p;
                String str2 = this.f70963q;
                Map<String, ?> mapF = v0.f(x.a("payment_method_options", q.Card.INSTANCE.a(this.f70964r.c3())));
                l.Options optionsL = a.l(a.this, null, 1, null);
                this.f70960n = 1;
                kVar = this;
                objD = gVar.d(str, str2, mapF, optionsL, kVar);
                if (objD == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objD = ((s) obj).getValue();
                kVar = this;
            }
            a aVar = a.this;
            Throwable thE = s.e(objD);
            if (thE != null) {
                h70.h.b.a(aVar.errorReporter, h70.h.d.LINK_SHARE_CARD_FAILURE, StripeException.INSTANCE.b(thE), null, 4, null);
            }
            String str3 = kVar.f70965s;
            String str4 = kVar.f70962p;
            PaymentMethodCreateParams paymentMethodCreateParams = kVar.f70964r;
            if (s.h(objD)) {
                String str5 = (String) objD;
                objB = s.b(new c60.e.b(new ConsumerPaymentDetails.Passthrough(str5, str3), PaymentMethodCreateParams.INSTANCE.L(str5, str4, q.Card.INSTANCE.a(paymentMethodCreateParams.c3()))));
            } else {
                objB = s.b(objD);
            }
            return s.a(objB);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super s<c60.e.b>> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public a(wn0.a<String> publishableKeyProvider, wn0.a<String> stripeAccountIdProvider, z60.g stripeRepository, m80.a consumersApiService, CoroutineContext workContext, Locale locale, h70.h errorReporter) {
        p013kotlin.jvm.internal.s.k(publishableKeyProvider, "publishableKeyProvider");
        p013kotlin.jvm.internal.s.k(stripeAccountIdProvider, "stripeAccountIdProvider");
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        p013kotlin.jvm.internal.s.k(consumersApiService, "consumersApiService");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.stripeRepository = stripeRepository;
        this.consumersApiService = consumersApiService;
        this.workContext = workContext;
        this.locale = locale;
        this.errorReporter = errorReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l.Options k(String consumerAccountPublishableKey) {
        String strInvoke = consumerAccountPublishableKey == null ? this.publishableKeyProvider.invoke() : consumerAccountPublishableKey;
        String strInvoke2 = this.stripeAccountIdProvider.invoke();
        if (consumerAccountPublishableKey != null) {
            strInvoke2 = null;
        }
        return new l.Options(strInvoke, strInvoke2, null, 4, null);
    }

    static /* synthetic */ l.Options l(a aVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return aVar.k(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // h60.c
    public Object a(String str, Continuation<? super s<ConsumerSessionLookup>> continuation) {
        h hVar;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i11 = hVar.f70952p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.f70952p = i11 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objWithContext = hVar.f70950n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = hVar.f70952p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            i iVar = new i(str, null);
            hVar.f70952p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, iVar, hVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // h60.c
    public Object b(String str, String str2, String str3, String str4, w wVar, Continuation<? super s<ConsumerSessionSignup>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f70925p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f70925p = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object objWithContext = bVar2.f70923n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar2.f70925p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            c cVar = new c(str, str2, str3, str4, wVar, null);
            bVar2.f70925p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, cVar, bVar2);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // h60.c
    public Object c(String str, String str2, Continuation<? super s<ConsumerSession>> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f70945p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f70945p = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objWithContext = fVar.f70943n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f70945p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            g gVar = new g(str, str2, null);
            fVar.f70945p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, gVar, fVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // h60.c
    public Object d(PaymentMethodCreateParams paymentMethodCreateParams, String str, StripeIntent stripeIntent, String str2, String str3, boolean z11, Continuation<? super s<c60.e.a>> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f70935p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f70935p = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objWithContext = dVar.f70933n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f70935p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            e eVar = new e(str2, paymentMethodCreateParams, str, z11, str3, null);
            dVar.f70935p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, eVar, dVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // h60.c
    public Object e(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, String str3, Continuation<? super s<? extends c60.e>> continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i11 = jVar.f70959p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.f70959p = i11 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        j jVar2 = jVar;
        Object objWithContext = jVar2.f70957n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = jVar2.f70959p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            k kVar = new k(str3, str, paymentMethodCreateParams, str2, null);
            jVar2.f70959p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, kVar, jVar2);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objWithContext);
        }
        return ((s) objWithContext).getValue();
    }
}
