package d60;

import c60.LinkConfiguration;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.w;
import expo.modules.contacts.Columns;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import m60.l;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJF\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\"\u001a\u00020!*\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0004\b\"\u0010#J.\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J$\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010)\u001a\u00020(H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170\u0013H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-JF\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010\u0016J$\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00132\u0006\u00100\u001a\u00020/H\u0096@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J!\u00106\u001a\u0004\u0018\u00010\u00142\u0006\u00105\u001a\u0002042\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010>R\"\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\b;\u0010CR*\u0010M\u001a\u0004\u0018\u00010\f8\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\bE\u0010F\u0012\u0004\bK\u0010L\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR \u0010R\u001a\b\u0012\u0004\u0012\u00020!0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bA\u0010QR\u0018\u0010V\u001a\u00020S*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006W"}, d2 = {"Ld60/a;", "Ld60/c;", "Lc60/c;", "config", "Lh60/c;", "linkRepository", "Le60/e;", "linkEventsReporter", "Lh70/h;", "errorReporter", "<init>", "(Lc60/c;Lh60/c;Le60/e;Lh70/h;)V", "", Scopes.EMAIL, "phone", PlaceTypes.COUNTRY, "name", "Lm60/l;", "consentAction", "Ljn0/s;", "Lg60/b;", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm60/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/t;", "consumerSession", "publishableKey", "m", "(Lcom/stripe/android/model/t;Ljava/lang/String;)Lg60/b;", "n", "newEmail", "Ljn0/h0;", "l", "(Ljava/lang/String;Ljava/lang/String;)V", "Lg60/a;", IntegerTokenConverter.CONVERTER_KEY, "(Lg60/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "startSession", "b", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lm60/m;", "userInput", "e", "(Lm60/m;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "Lcom/stripe/android/model/w0;", "paymentMethodCreateParams", "Lc60/e;", "c", "(Lcom/stripe/android/model/w0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/u;", Columns.LOOKUP_KEY, "p", "(Lcom/stripe/android/model/u;Z)Lg60/b;", "Lc60/c;", "Lh60/c;", "Le60/e;", DateTokenConverter.CONVERTER_KEY, "Lh70/h;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_linkAccount", "Lkotlinx/coroutines/flow/StateFlow;", "f", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "linkAccount", "g", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "getConsumerPublishableKey$annotations", "()V", "consumerPublishableKey", "Lkotlinx/coroutines/flow/Flow;", "h", "Lkotlinx/coroutines/flow/Flow;", "()Lkotlinx/coroutines/flow/Flow;", "accountStatus", "Lcom/stripe/android/model/w;", "j", "(Lm60/l;)Lcom/stripe/android/model/w;", "consumerAction", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements d60.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final LinkConfiguration config;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h60.c linkRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e60.e linkEventsReporter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h70.h errorReporter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<g60.b> _linkAccount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<g60.b> linkAccount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile String consumerPublishableKey;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Flow<g60.a> accountStatus;

    /* JADX INFO: renamed from: d60.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C1218a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f59685b;

        static {
            int[] iArr = new int[g60.a.values().length];
            try {
                iArr[g60.a.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g60.a.NeedsVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g60.a.VerificationStarted.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g60.a.SignedOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g60.a.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f59684a = iArr;
            int[] iArr2 = new int[l.values().length];
            try {
                iArr2[l.Checkbox.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[l.CheckboxWithPrefilledEmail.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[l.CheckboxWithPrefilledEmailAndPhone.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[l.Implied.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[l.ImpliedWithPrefilledEmail.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            f59685b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {0, 0, 0, 1}, l = {168, 177}, m = "createCardPaymentDetails-gIAlu-s", n = {"this", "paymentMethodCreateParams", "account", "this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f59686n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f59687o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f59688p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f59689q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f59691s;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59689q = obj;
            this.f59691s |= Integer.MIN_VALUE;
            Object objC = a.this.c(null, this);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : s.a(objC);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE}, m = "fetchAccountStatus", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f59692n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f59694p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59692n = obj;
            this.f59694p |= Integer.MIN_VALUE;
            return a.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {0}, l = {82}, m = "logOut-IoAF18A", n = {"this"}, s = {"L$0"})
    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f59695n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f59696o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f59698q;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59696o = obj;
            this.f59698q |= Integer.MIN_VALUE;
            Object objA = a.this.a(this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {0, 0}, l = {52}, m = "lookupConsumer-0E7RQCE", n = {"this", "startSession"}, s = {"L$0", "Z$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f59699n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f59700o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f59701p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f59703r;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59701p = obj;
            this.f59703r |= Integer.MIN_VALUE;
            Object objB = a.this.b(null, false, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : s.a(objB);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {}, l = {66, 69}, m = "signInWithUserInput-gIAlu-s", n = {}, s = {})
    static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f59704n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f59706p;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59704n = obj;
            this.f59706p |= Integer.MIN_VALUE;
            Object objE = a.this.e(null, this);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : s.a(objE);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {0}, l = {154}, m = "signUp-hUnOzRk", n = {"this"}, s = {"L$0"})
    static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f59707n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f59708o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f59710q;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59708o = obj;
            this.f59710q |= Integer.MIN_VALUE;
            Object objQ = a.this.q(null, null, null, null, null, this);
            return objQ == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objQ : s.a(objQ);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager", f = "DefaultLinkAccountManager.kt", i = {0, 0, 0, 0, 0, 0, 0, 1}, l = {108, 132}, m = "signUpIfValidSessionState-hUnOzRk", n = {"this", Scopes.EMAIL, "phone", PlaceTypes.COUNTRY, "name", "consentAction", "currentEmail", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0"})
    static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f59711n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f59712o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f59713p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f59714q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f59715r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f59716s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f59717t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f59718u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f59720w;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59718u = obj;
            this.f59720w |= Integer.MIN_VALUE;
            Object objR = a.this.r(null, null, null, null, null, this);
            return objR == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objR : s.a(objR);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements Flow<g60.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f59721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f59722b;

        /* JADX INFO: renamed from: d60.a$i$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C1219a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f59723a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f59724b;

            /* JADX INFO: renamed from: d60.a$i$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.link.account.DefaultLinkAccountManager$special$$inlined$map$1$2", f = "DefaultLinkAccountManager.kt", i = {}, l = {224, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C1220a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f59725n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f59726o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                Object f59727p;

                public C1220a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f59725n = obj;
                    this.f59726o |= Integer.MIN_VALUE;
                    return C1219a.this.emit(null, this);
                }
            }

            public C1219a(FlowCollector flowCollector, a aVar) {
                this.f59723a = flowCollector;
                this.f59724b = aVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
            
                if (r7.emit(r8, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, p013kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof d60.a.i.C1219a.C1220a
                    if (r0 == 0) goto L13
                    r0 = r8
                    d60.a$i$a$a r0 = (d60.a.i.C1219a.C1220a) r0
                    int r1 = r0.f59726o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f59726o = r1
                    goto L18
                L13:
                    d60.a$i$a$a r0 = new d60.a$i$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f59725n
                    java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f59726o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    jn0.t.b(r8)
                    goto L5f
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    java.lang.Object r7 = r0.f59727p
                    kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                    jn0.t.b(r8)
                    goto L53
                L3c:
                    jn0.t.b(r8)
                    kotlinx.coroutines.flow.FlowCollector r8 = r6.f59723a
                    g60.b r7 = (g60.b) r7
                    d60.a r2 = r6.f59724b
                    r0.f59727p = r8
                    r0.f59726o = r4
                    java.lang.Object r7 = d60.a.g(r2, r7, r0)
                    if (r7 != r1) goto L50
                    goto L5e
                L50:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L53:
                    r2 = 0
                    r0.f59727p = r2
                    r0.f59726o = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5f
                L5e:
                    return r1
                L5f:
                    jn0.h0 r7 = jn0.h0.f84049a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: d60.a.i.C1219a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public i(Flow flow, a aVar) {
            this.f59721a = flow;
            this.f59722b = aVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super g60.a> flowCollector, Continuation continuation) {
            Object objCollect = this.f59721a.collect(new C1219a(flowCollector, this.f59722b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    public a(LinkConfiguration config, h60.c linkRepository, e60.e linkEventsReporter, h70.h errorReporter) {
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(linkRepository, "linkRepository");
        p013kotlin.jvm.internal.s.k(linkEventsReporter, "linkEventsReporter");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        this.config = config;
        this.linkRepository = linkRepository;
        this.linkEventsReporter = linkEventsReporter;
        this.errorReporter = errorReporter;
        MutableStateFlow<g60.b> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._linkAccount = MutableStateFlow;
        this.linkAccount = MutableStateFlow;
        this.accountStatus = new i(d(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object i(g60.b bVar, Continuation<? super g60.a> continuation) {
        c cVar;
        Object objA;
        g60.a accountStatus;
        Object objB;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f59694p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f59694p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f59692n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar2.f59694p;
        g60.a aVar = null;
        if (i12 == 0) {
            t.b(obj);
            if (bVar != null && (accountStatus = bVar.getAccountStatus()) != null) {
                return accountStatus;
            }
            String email = this.config.getCustomerInfo().getEmail();
            if (email != null) {
                cVar2.f59694p = 1;
                objA = d60.c.a.a(this, email, false, cVar2, 2, null);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (aVar == null) {
                return g60.a.SignedOut;
            }
            return aVar;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t.b(obj);
        objA = ((s) obj).getValue();
        if (s.h(objA)) {
            g60.b bVar2 = (g60.b) objA;
            objB = s.b(bVar2 != null ? bVar2.getAccountStatus() : null);
        } else {
            objB = s.b(objA);
        }
        if (s.e(objB) != null) {
            objB = g60.a.Error;
        }
        aVar = (g60.a) objB;
        if (aVar == null) {
            return g60.a.SignedOut;
        }
        return aVar;
    }

    private final w j(l lVar) {
        int i11 = C1218a.f59685b[lVar.ordinal()];
        if (i11 == 1) {
            return w.Checkbox;
        }
        if (i11 == 2) {
            return w.CheckboxWithPrefilledEmail;
        }
        if (i11 == 3) {
            return w.CheckboxWithPrefilledEmailAndPhone;
        }
        if (i11 == 4) {
            return w.Implied;
        }
        if (i11 == 5) {
            return w.ImpliedWithPrefilledEmail;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void l(String newEmail, String publishableKey) {
        if (publishableKey != null) {
            o(publishableKey);
            return;
        }
        g60.b value = this._linkAccount.getValue();
        if (p013kotlin.jvm.internal.s.f(value != null ? value.getEmail() : null, newEmail)) {
            return;
        }
        o(null);
    }

    private final g60.b m(ConsumerSession consumerSession, String publishableKey) {
        l(consumerSession.getEmailAddress(), publishableKey);
        g60.b bVar = new g60.b(consumerSession);
        this._linkAccount.setValue(bVar);
        return bVar;
    }

    private final g60.b n(ConsumerSession consumerSession, String publishableKey) {
        g60.b bVarM;
        if (consumerSession != null && (bVarM = m(consumerSession, publishableKey)) != null) {
            return bVarM;
        }
        this._linkAccount.setValue(null);
        o(null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final java.lang.Object r(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, m60.l r14, p013kotlin.coroutines.Continuation<? super jn0.s<g60.b>> r15) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d60.a.r(java.lang.String, java.lang.String, java.lang.String, java.lang.String, m60.l, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00c9, please report this as an issue */
    @Override // d60.c
    public Object a(Continuation<? super s<ConsumerSession>> continuation) {
        d dVar;
        Object objB;
        a aVar;
        Object objC;
        Object objB2;
        Throwable thE;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f59698q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f59698q = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        d dVar2 = dVar;
        Object obj = dVar2.f59696o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar2.f59698q;
        if (i12 == 0) {
            t.b(obj);
            try {
                s.Companion companion = s.INSTANCE;
                g60.b value = d().getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                objB = s.b(value);
                if (s.h(objB)) {
                    try {
                        h60.c cVar = this.linkRepository;
                        String clientSecret = ((g60.b) objB).getClientSecret();
                        String consumerPublishableKey = getConsumerPublishableKey();
                        dVar2.f59695n = this;
                        dVar2.f59698q = 1;
                        objC = cVar.c(clientSecret, consumerPublishableKey, dVar2);
                        if (objC == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        aVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = this;
                        s.Companion companion2 = s.INSTANCE;
                        objB2 = s.b(t.a(th));
                    }
                } else {
                    objB2 = s.b(objB);
                    aVar = this;
                }
                if (s.h(objB2)) {
                    h70.h.b.a(aVar.errorReporter, h70.h.e.LINK_LOG_OUT_SUCCESS, null, null, 6, null);
                    o30.d.INSTANCE.a(false).debug("Logged out of Link successfully");
                }
                thE = s.e(objB2);
                if (thE != null) {
                    h70.h.b.a(aVar.errorReporter, h70.h.d.LINK_LOG_OUT_FAILURE, StripeException.INSTANCE.b(thE), null, 4, null);
                    o30.d.INSTANCE.a(false).a("Failed to log out of Link: " + thE);
                }
                return objB2;
            } catch (Throwable th3) {
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th3));
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) dVar2.f59695n;
            try {
                t.b(obj);
                objC = ((s) obj).getValue();
            } catch (Throwable th4) {
                th = th4;
                s.Companion companion4 = s.INSTANCE;
                objB2 = s.b(t.a(th));
            }
        }
        t.b(objC);
        objB2 = s.b((ConsumerSession) objC);
        if (s.h(objB2)) {
            h70.h.b.a(aVar.errorReporter, h70.h.e.LINK_LOG_OUT_SUCCESS, null, null, 6, null);
            o30.d.INSTANCE.a(false).debug("Logged out of Link successfully");
        }
        thE = s.e(objB2);
        if (thE != null) {
            h70.h.b.a(aVar.errorReporter, h70.h.d.LINK_LOG_OUT_FAILURE, StripeException.INSTANCE.b(thE), null, 4, null);
            o30.d.INSTANCE.a(false).a("Failed to log out of Link: " + thE);
        }
        return objB2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // d60.c
    public Object b(String str, boolean z11, Continuation<? super s<g60.b>> continuation) {
        e eVar;
        Object objA;
        a aVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i11 = eVar.f59703r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f59703r = i11 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f59701p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = eVar.f59703r;
        if (i12 == 0) {
            t.b(obj);
            h60.c cVar = this.linkRepository;
            eVar.f59699n = this;
            eVar.f59700o = z11;
            eVar.f59703r = 1;
            objA = cVar.a(str, eVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = eVar.f59700o;
            aVar = (a) eVar.f59699n;
            t.b(obj);
            objA = ((s) obj).getValue();
        }
        Throwable thE = s.e(objA);
        if (thE != null) {
            aVar.linkEventsReporter.i(thE);
        }
        return s.h(objA) ? s.b(aVar.p((ConsumerSessionLookup) objA, z11)) : s.b(objA);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x010a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // d60.c
    public Object c(PaymentMethodCreateParams paymentMethodCreateParams, Continuation<? super s<? extends c60.e>> continuation) {
        b bVar;
        g60.b bVar2;
        Object value;
        a aVar;
        PaymentMethodCreateParams paymentMethodCreateParams2;
        a aVar2;
        c60.e eVar;
        Object objE;
        Object objB;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f59691s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f59691s = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar3 = bVar;
        Object obj = bVar3.f59689q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar3.f59691s;
        if (i12 == 0) {
            t.b(obj);
            g60.b value2 = d().getValue();
            if (value2 == null) {
                h70.h.b.a(this.errorReporter, h70.h.f.LINK_ATTACH_CARD_WITH_NULL_ACCOUNT, null, null, 6, null);
                s.Companion companion = s.INSTANCE;
                return s.b(t.a(new IllegalStateException("A non-null Link account is needed to create payment details")));
            }
            h60.c cVar = this.linkRepository;
            String email = value2.getEmail();
            StripeIntent stripeIntent = this.config.getStripeIntent();
            String clientSecret = value2.getClientSecret();
            String consumerPublishableKey = this.config.getPassthroughModeEnabled() ? null : getConsumerPublishableKey();
            boolean passthroughModeEnabled = this.config.getPassthroughModeEnabled();
            bVar3.f59686n = this;
            bVar3.f59687o = paymentMethodCreateParams;
            bVar3.f59688p = value2;
            bVar3.f59691s = 1;
            Object objD = cVar.d(paymentMethodCreateParams, email, stripeIntent, clientSecret, consumerPublishableKey, passthroughModeEnabled, bVar3);
            bVar3 = bVar3;
            if (objD != coroutine_suspended) {
                bVar2 = value2;
                value = objD;
                aVar = this;
                paymentMethodCreateParams2 = paymentMethodCreateParams;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar2 = (a) bVar3.f59686n;
            try {
                t.b(obj);
                objE = ((s) obj).getValue();
                t.b(objE);
                eVar = (c60.e) objE;
                objB = s.b(eVar);
            } catch (Throwable th2) {
                th = th2;
                s.Companion companion2 = s.INSTANCE;
                objB = s.b(t.a(th));
            }
            aVar = aVar2;
            if (s.h(objB)) {
                h70.h.b.a(aVar.errorReporter, h70.h.e.LINK_CREATE_CARD_SUCCESS, null, null, 6, null);
            }
            return objB;
        }
        bVar2 = (g60.b) bVar3.f59688p;
        paymentMethodCreateParams2 = (PaymentMethodCreateParams) bVar3.f59687o;
        a aVar3 = (a) bVar3.f59686n;
        t.b(obj);
        value = ((s) obj).getValue();
        aVar = aVar3;
        if (s.h(value)) {
            try {
                eVar = (c60.e.a) value;
                if (aVar.config.getPassthroughModeEnabled()) {
                    g60.b bVar4 = bVar2;
                    h60.c cVar2 = aVar.linkRepository;
                    String id2 = eVar.getPaymentDetails().getId();
                    String strB = paymentMethodCreateParams2.b();
                    if (strB == null) {
                        strB = "";
                    }
                    String clientSecret2 = bVar4.getClientSecret();
                    bVar3.f59686n = aVar;
                    bVar3.f59687o = null;
                    bVar3.f59688p = null;
                    bVar3.f59691s = 2;
                    objE = cVar2.e(paymentMethodCreateParams2, id2, strB, clientSecret2, bVar3);
                    if (objE != coroutine_suspended) {
                        aVar2 = aVar;
                        t.b(objE);
                        eVar = (c60.e) objE;
                    }
                    return coroutine_suspended;
                }
                aVar2 = aVar;
                objB = s.b(eVar);
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th));
            }
            aVar = aVar2;
        } else {
            objB = s.b(value);
        }
        if (s.h(objB)) {
            h70.h.b.a(aVar.errorReporter, h70.h.e.LINK_CREATE_CARD_SUCCESS, null, null, 6, null);
        }
        return objB;
    }

    @Override // d60.c
    public StateFlow<g60.b> d() {
        return this.linkAccount;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r9 == r0) goto L40;
     */
    @Override // d60.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(m60.m r9, p013kotlin.coroutines.Continuation<? super jn0.s<g60.b>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof d60.a.f
            if (r0 == 0) goto L14
            r0 = r10
            d60.a$f r0 = (d60.a.f) r0
            int r1 = r0.f59706p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f59706p = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            d60.a$f r0 = new d60.a$f
            r0.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r10 = r4.f59704n
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f59706p
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L46
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            jn0.t.b(r10)
            jn0.s r10 = (jn0.s) r10
            java.lang.Object r9 = r10.getValue()
            return r9
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            jn0.t.b(r10)
            jn0.s r10 = (jn0.s) r10
            java.lang.Object r9 = r10.getValue()
            goto L60
        L46:
            jn0.t.b(r10)
            boolean r10 = r9 instanceof m60.m.SignIn
            if (r10 == 0) goto L8a
            m60.m$a r9 = (m60.m.SignIn) r9
            java.lang.String r2 = r9.getEmail()
            r4.f59706p = r3
            r3 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            java.lang.Object r9 = d60.c.a.a(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L60
            goto Laf
        L60:
            boolean r10 = jn0.s.h(r9)
            if (r10 == 0) goto L85
            g60.b r9 = (g60.b) r9     // Catch: java.lang.Throwable -> L6f
            if (r9 == 0) goto L72
            java.lang.Object r9 = jn0.s.b(r9)     // Catch: java.lang.Throwable -> L6f
            goto L84
        L6f:
            r0 = move-exception
            r9 = r0
            goto L7a
        L72:
            java.lang.String r9 = "Error fetching user account"
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L6f
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L6f
            throw r10     // Catch: java.lang.Throwable -> L6f
        L7a:
            jn0.s$a r10 = jn0.s.INSTANCE
            java.lang.Object r9 = jn0.t.a(r9)
            java.lang.Object r9 = jn0.s.b(r9)
        L84:
            return r9
        L85:
            java.lang.Object r9 = jn0.s.b(r9)
            return r9
        L8a:
            boolean r10 = r9 instanceof m60.m.SignUp
            if (r10 == 0) goto Lb1
            m60.m$b r9 = (m60.m.SignUp) r9
            r10 = r2
            java.lang.String r2 = r9.getEmail()
            r7 = r4
            java.lang.String r4 = r9.getCountry()
            java.lang.String r3 = r9.getPhone()
            java.lang.String r5 = r9.getName()
            m60.l r6 = r9.getConsentAction()
            r7.f59706p = r10
            r1 = r8
            java.lang.Object r9 = r1.r(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto Lb0
        Laf:
            return r0
        Lb0:
            return r9
        Lb1:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d60.a.e(m60.m, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // d60.c
    public Flow<g60.a> f() {
        return this.accountStatus;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public String getConsumerPublishableKey() {
        return this.consumerPublishableKey;
    }

    public void o(String str) {
        this.consumerPublishableKey = str;
    }

    public g60.b p(ConsumerSessionLookup lookup, boolean startSession) {
        p013kotlin.jvm.internal.s.k(lookup, "lookup");
        ConsumerSession consumerSession = lookup.getConsumerSession();
        if (consumerSession != null) {
            return startSession ? n(consumerSession, lookup.getPublishableKey()) : new g60.b(consumerSession);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object q(String str, String str2, String str3, String str4, l lVar, Continuation<? super s<g60.b>> continuation) {
        g gVar;
        Object objB;
        a aVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i11 = gVar.f59710q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f59710q = i11 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f59708o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = gVar2.f59710q;
        if (i12 == 0) {
            t.b(obj);
            h60.c cVar = this.linkRepository;
            w wVarJ = j(lVar);
            gVar2.f59707n = this;
            gVar2.f59710q = 1;
            objB = cVar.b(str, str2, str3, str4, wVarJ, gVar2);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            aVar = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) gVar2.f59707n;
            t.b(obj);
            objB = ((s) obj).getValue();
        }
        if (!s.h(objB)) {
            return s.b(objB);
        }
        ConsumerSessionSignup consumerSessionSignup = (ConsumerSessionSignup) objB;
        return s.b(aVar.m(consumerSessionSignup.getConsumerSession(), consumerSessionSignup.getPublishableKey()));
    }
}
