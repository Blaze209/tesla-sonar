package a70;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n1;
import f30.j0;
import java.util.List;
import javax.inject.Provider;
import jn0.h0;
import jn0.s;
import jn0.t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.l0;
import p013kotlin.jvm.internal.n0;
import w30.f0;
import w30.u;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 O*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0010\b\u0001\u0010\u0004 \u0001*\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0005:\u0001?BA\b\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\"\u0010#J4\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0082@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\u00020\u00162\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00010(H\u0002¢\u0006\u0004\b,\u0010-J$\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010(2\u0006\u0010/\u001a\u00020.H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J:\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010%\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\t02H¤@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J:\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010%\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\t02H¤@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00105J4\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u00107\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u00108\u001a\u00020\tH¤@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010:J)\u0010=\u001a\u00028\u00012\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010;\u001a\u00020\u001a2\b\u0010<\u001a\u0004\u0018\u00010\tH$¢\u0006\u0004\b=\u0010>R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010\f\u001a\u00020\u000b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M\u0082\u0001\u0002PQ\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"La70/e;", "Lcom/stripe/android/model/StripeIntent;", "T", "Lf30/j0;", "S", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljavax/inject/Provider;", "", "publishableKeyProvider", "Lz60/g;", "stripeRepository", "Lo30/d;", "logger", "Lkotlin/coroutines/CoroutineContext;", "workContext", "Lw30/f0;", "retryDelaySupplier", "<init>", "(Landroid/content/Context;Ljavax/inject/Provider;Lz60/g;Lo30/d;Lkotlin/coroutines/CoroutineContext;Lw30/f0;)V", "stripeIntent", "", "shouldCancelSource", "u", "(Lcom/stripe/android/model/StripeIntent;Z)Z", "", "flowOutcome", "v", "(Lcom/stripe/android/model/StripeIntent;I)Z", AnalyticsAttribute.Intent, "originalFlowOutcome", "n", "(Lcom/stripe/android/model/StripeIntent;I)I", "t", "(Lcom/stripe/android/model/StripeIntent;)Z", "originalIntent", "clientSecret", "Lw30/l$c;", "requestOptions", "Ljn0/s;", "r", "(Lcom/stripe/android/model/StripeIntent;Ljava/lang/String;Lw30/l$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripeIntentResult", "w", "(Ljava/lang/Object;)Z", "La70/c;", "unvalidatedResult", "p", "(La70/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "expandFields", "s", "(Ljava/lang/String;Lw30/l$c;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "q", "stripeIntentId", "sourceId", "l", "(Ljava/lang/String;Lw30/l$c;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "outcomeFromFlow", "failureMessage", "m", "(Lcom/stripe/android/model/StripeIntent;ILjava/lang/String;)Lf30/j0;", "a", "Ljavax/inject/Provider;", "b", "Lz60/g;", "o", "()Lz60/g;", "c", "Lo30/d;", DateTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "e", "Lw30/f0;", "La70/b;", "f", "La70/b;", "failureMessageFactory", "g", "La70/g;", "La70/j;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class e<T extends StripeIntent, S extends j0<? extends T>> {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f509h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List<String> f510i = v.e("payment_method");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Provider<String> publishableKeyProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f0 retryDelaySupplier;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a70.b failureMessageFactory;

    /* JADX INFO: renamed from: a70.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La70/e$a;", "", "<init>", "()V", "", "", "EXPAND_PAYMENT_METHOD", "Ljava/util/List;", "a", "()Ljava/util/List;", "", "MAX_RETRIES", "I", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<String> a() {
            return e.f510i;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f517a;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f517a = iArr;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.PaymentFlowResultProcessor", f = "PaymentFlowResultProcessor.kt", i = {}, l = {47}, m = "processResult-gIAlu-s", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f518n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ e<T, S> f519o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f520p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(e<T, ? extends S> eVar, Continuation<? super c> continuation) {
            super(continuation);
            this.f519o = eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f518n = obj;
            this.f520p |= Integer.MIN_VALUE;
            Object objP = this.f519o.p(null, this);
            return objP == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objP : s.a(objP);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "T", "Lf30/j0;", "S", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/s;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Ljn0/s;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.PaymentFlowResultProcessor$processResult$2", f = "PaymentFlowResultProcessor.kt", i = {0, 0, 1, 2}, l = {57, 72, 95}, m = "invokeSuspend", n = {"result", "requestOptions", "result", "result"}, s = {"L$0", "L$1", "L$0", "L$0"})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super s<? extends S>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f521n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f522o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f523p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ e<T, S> f524q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Unvalidated f525r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(e<T, ? extends S> eVar, Unvalidated unvalidated, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f524q = eVar;
            this.f525r = unvalidated;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f524q, this.f525r, continuation);
            dVar.f523p = obj;
            return dVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objB2;
            Object objS;
            Validated validated;
            w30.l.Options options;
            j0 j0VarM;
            Object objL;
            Validated validated2;
            e<T, S> eVar;
            String publishableKey;
            String threeDS2IntentId;
            Object objR;
            Validated validated3;
            e<T, S> eVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f522o;
            try {
                if (i11 == 0) {
                    t.b(obj);
                    Unvalidated unvalidated = this.f525r;
                    try {
                        s.Companion companion = s.INSTANCE;
                        objB2 = s.b(unvalidated.j());
                    } catch (Throwable th2) {
                        s.Companion companion2 = s.INSTANCE;
                        objB2 = s.b(t.a(th2));
                    }
                    Throwable thE = s.e(objB2);
                    if (thE != null) {
                        return s.a(s.b(t.a(thE)));
                    }
                    Validated validated4 = (Validated) objB2;
                    Object obj2 = ((e) this.f524q).publishableKeyProvider.get();
                    p013kotlin.jvm.internal.s.j(obj2, "get(...)");
                    w30.l.Options options2 = new w30.l.Options((String) obj2, validated4.getStripeAccountId(), null, 4, null);
                    e<T, S> eVar3 = this.f524q;
                    String clientSecret = validated4.getClientSecret();
                    List<String> listA = e.INSTANCE.a();
                    this.f523p = validated4;
                    this.f521n = options2;
                    this.f522o = 1;
                    objS = eVar3.s(clientSecret, options2, listA, this);
                    if (objS != coroutine_suspended) {
                        validated = validated4;
                        options = options2;
                    }
                    return coroutine_suspended;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        eVar2 = (e) this.f521n;
                        validated3 = (Validated) this.f523p;
                        t.b(obj);
                        objR = ((s) obj).getValue();
                        t.b(objR);
                        StripeIntent stripeIntent = (StripeIntent) objR;
                        j0VarM = eVar2.m(stripeIntent, eVar2.n(stripeIntent, validated3.getFlowOutcome()), ((e) eVar2).failureMessageFactory.a(stripeIntent, validated3.getFlowOutcome()));
                        objB = s.b(j0VarM);
                        return s.a(objB);
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (e) this.f521n;
                    validated2 = (Validated) this.f523p;
                    t.b(obj);
                    objL = ((s) obj).getValue();
                    t.b(objL);
                    StripeIntent stripeIntent2 = (StripeIntent) objL;
                    j0VarM = eVar.m(stripeIntent2, validated2.getFlowOutcome(), ((e) eVar).failureMessageFactory.a(stripeIntent2, validated2.getFlowOutcome()));
                    objB = s.b(j0VarM);
                    return s.a(objB);
                }
                options = (w30.l.Options) this.f521n;
                validated = (Validated) this.f523p;
                t.b(obj);
                objS = ((s) obj).getValue();
                e<T, S> eVar4 = this.f524q;
                if (s.h(objS)) {
                    StripeIntent stripeIntent3 = (StripeIntent) objS;
                    if (stripeIntent3.getStatus() != StripeIntent.Status.Succeeded && stripeIntent3.getStatus() != StripeIntent.Status.RequiresCapture) {
                        if (eVar4.v(stripeIntent3, validated.getFlowOutcome())) {
                            String clientSecret2 = validated.getClientSecret();
                            this.f523p = validated;
                            this.f521n = eVar4;
                            this.f522o = 2;
                            objR = eVar4.r(stripeIntent3, clientSecret2, options, this);
                            if (objR != coroutine_suspended) {
                                validated3 = validated;
                                eVar2 = eVar4;
                                t.b(objR);
                                StripeIntent stripeIntent4 = (StripeIntent) objR;
                                j0VarM = eVar2.m(stripeIntent4, eVar2.n(stripeIntent4, validated3.getFlowOutcome()), ((e) eVar2).failureMessageFactory.a(stripeIntent4, validated3.getFlowOutcome()));
                            }
                        } else if (eVar4.u(stripeIntent3, validated.getCanCancelSource())) {
                            String sourceId = validated.getSourceId();
                            String str = "";
                            if (sourceId == null) {
                                sourceId = "";
                            }
                            ((e) eVar4).logger.debug("Canceling source '" + sourceId + "' for '" + stripeIntent3.getClass().getSimpleName() + "'");
                            StripeIntent.a nextActionData = stripeIntent3.getNextActionData();
                            StripeIntent.a.j.Use3DS2 use3DS2 = nextActionData instanceof StripeIntent.a.j.Use3DS2 ? (StripeIntent.a.j.Use3DS2) nextActionData : null;
                            if (use3DS2 == null || (threeDS2IntentId = use3DS2.getThreeDS2IntentId()) == null) {
                                String id2 = stripeIntent3.getId();
                                if (id2 != null) {
                                    str = id2;
                                }
                            } else {
                                str = threeDS2IntentId;
                            }
                            if (use3DS2 != null && (publishableKey = use3DS2.getPublishableKey()) != null) {
                                options = new w30.l.Options(publishableKey, null, null, 6, null);
                            }
                            this.f523p = validated;
                            this.f521n = eVar4;
                            this.f522o = 3;
                            objL = eVar4.l(str, options, sourceId, this);
                            if (objL != coroutine_suspended) {
                                validated2 = validated;
                                eVar = eVar4;
                                t.b(objL);
                                StripeIntent stripeIntent5 = (StripeIntent) objL;
                                j0VarM = eVar.m(stripeIntent5, validated2.getFlowOutcome(), ((e) eVar).failureMessageFactory.a(stripeIntent5, validated2.getFlowOutcome()));
                            }
                        } else {
                            j0VarM = eVar4.m(stripeIntent3, validated.getFlowOutcome(), ((e) eVar4).failureMessageFactory.a(stripeIntent3, validated.getFlowOutcome()));
                        }
                        return coroutine_suspended;
                    }
                    j0VarM = eVar4.m(stripeIntent3, 1, ((e) eVar4).failureMessageFactory.a(stripeIntent3, validated.getFlowOutcome()));
                    objB = s.b(j0VarM);
                } else {
                    objB = s.b(objS);
                }
            } catch (Throwable th3) {
                s.Companion companion3 = s.INSTANCE;
                objB = s.b(t.a(th3));
            }
            return s.a(objB);
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super s<? extends S>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: a70.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.PaymentFlowResultProcessor", f = "PaymentFlowResultProcessor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2}, l = {EnumC4419g.SDK_ASSET_ICON_PIN_VALUE, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE}, m = "refreshStripeIntentUntilTerminalState-BWLJW6A", n = {"this", "originalIntent", "clientSecret", "requestOptions", "remainingRetries", "stripeIntentResult", "maxRetries", "this", "originalIntent", "clientSecret", "requestOptions", "remainingRetries", "stripeIntentResult", "maxRetries", "stripeIntentResult"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0"})
    static final class C0023e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f526n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f527o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f528p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f529q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f530r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f531s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f532t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f533u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f534v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        final /* synthetic */ e<T, S> f535w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f536x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0023e(e<T, ? extends S> eVar, Continuation<? super C0023e> continuation) {
            super(continuation);
            this.f535w = eVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f534v = obj;
            this.f536x |= Integer.MIN_VALUE;
            Object objR = this.f535w.r(null, null, null, this);
            return objR == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objR : s.a(objR);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "T", "Lf30/j0;", "S", "Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.PaymentFlowResultProcessor$refreshStripeIntentUntilTerminalState$2", f = "PaymentFlowResultProcessor.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f537n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f538o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ e<T, S> f539p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ n0<s<T>> f540q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ l0 f541r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f542s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ StripeIntent f543t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f544u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ w30.l.Options f545v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(e<T, ? extends S> eVar, n0<s<T>> n0Var, l0 l0Var, int i11, StripeIntent stripeIntent, String str, w30.l.Options options, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f539p = eVar;
            this.f540q = n0Var;
            this.f541r = l0Var;
            this.f542s = i11;
            this.f543t = stripeIntent;
            this.f544u = str;
            this.f545v = options;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new f(this.f539p, this.f540q, this.f541r, this.f542s, this.f543t, this.f544u, this.f545v, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        /* JADX WARN: Code duplicated, block: B:25:0x0080  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
        
            if (r9 == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
        
            if (r9 == r0) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:28:0x0097). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:28:0x0097). Please report as a decompilation issue!!! */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f538o
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2c
                if (r1 == r4) goto L28
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1a:
                java.lang.Object r1 = r8.f537n
                kotlin.jvm.internal.n0 r1 = (p013kotlin.jvm.internal.n0) r1
                jn0.t.b(r9)
                jn0.s r9 = (jn0.s) r9
                java.lang.Object r9 = r9.getValue()
                goto L97
            L28:
                jn0.t.b(r9)
                goto L5d
            L2c:
                jn0.t.b(r9)
            L2f:
                a70.e<T extends com.stripe.android.model.StripeIntent, S extends f30.j0<? extends T>> r9 = r8.f539p
                kotlin.jvm.internal.n0<jn0.s<T extends com.stripe.android.model.StripeIntent>> r1 = r8.f540q
                T r1 = r1.f86529a
                boolean r9 = a70.e.k(r9, r1)
                if (r9 == 0) goto La2
                kotlin.jvm.internal.l0 r9 = r8.f541r
                int r9 = r9.f86527a
                if (r9 <= r4) goto La2
                a70.e<T extends com.stripe.android.model.StripeIntent, S extends f30.j0<? extends T>> r9 = r8.f539p
                w30.f0 r9 = a70.e.f(r9)
                int r1 = r8.f542s
                kotlin.jvm.internal.l0 r5 = r8.f541r
                int r5 = r5.f86527a
                long r5 = r9.b(r1, r5)
                r9 = 0
                r8.f537n = r9
                r8.f538o = r4
                java.lang.Object r9 = kotlinx.coroutines.DelayKt.m506delayVtjQ1oo(r5, r8)
                if (r9 != r0) goto L5d
                goto L96
            L5d:
                kotlin.jvm.internal.n0<jn0.s<T extends com.stripe.android.model.StripeIntent>> r1 = r8.f540q
                a70.e<T extends com.stripe.android.model.StripeIntent, S extends f30.j0<? extends T>> r9 = r8.f539p
                com.stripe.android.model.StripeIntent r5 = r8.f543t
                boolean r9 = a70.e.h(r9, r5)
                if (r9 == 0) goto L80
                a70.e<T extends com.stripe.android.model.StripeIntent, S extends f30.j0<? extends T>> r9 = r8.f539p
                java.lang.String r5 = r8.f544u
                w30.l$c r6 = r8.f545v
                a70.e$a r7 = a70.e.INSTANCE
                java.util.List r7 = r7.a()
                r8.f537n = r1
                r8.f538o = r3
                java.lang.Object r9 = r9.q(r5, r6, r7, r8)
                if (r9 != r0) goto L97
                goto L96
            L80:
                a70.e<T extends com.stripe.android.model.StripeIntent, S extends f30.j0<? extends T>> r9 = r8.f539p
                java.lang.String r5 = r8.f544u
                w30.l$c r6 = r8.f545v
                a70.e$a r7 = a70.e.INSTANCE
                java.util.List r7 = r7.a()
                r8.f537n = r1
                r8.f538o = r2
                java.lang.Object r9 = r9.s(r5, r6, r7, r8)
                if (r9 != r0) goto L97
            L96:
                return r0
            L97:
                r1.f86529a = r9
                kotlin.jvm.internal.l0 r9 = r8.f541r
                int r1 = r9.f86527a
                int r1 = r1 + (-1)
                r9.f86527a = r1
                goto L2f
            La2:
                jn0.h0 r9 = jn0.h0.f84049a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: a70.e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public /* synthetic */ e(Context context, Provider provider, z60.g gVar, o30.d dVar, CoroutineContext coroutineContext, f0 f0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, provider, gVar, dVar, coroutineContext, f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int n(StripeIntent intent, int originalFlowOutcome) {
        StripeIntent.Status status = intent.getStatus();
        int i11 = status == null ? -1 : b.f517a[status.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return 1;
        }
        return originalFlowOutcome;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ba, code lost:
    
        if (r9 == r6) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        r9 = r9;
        r9 = r9;
        r12 = r23;
        r10 = r7;
        r7 = r11;
        r11 = r24;
        r1 = r4;
        r4 = r7;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        if (r9 == r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r14v0, types: [a70.e] */
    /* JADX WARN: Type inference failed for: r23v0, types: [a70.e, a70.e<T extends com.stripe.android.model.StripeIntent, S extends f30.j0<? extends T>>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(com.stripe.android.model.StripeIntent r24, java.lang.String r25, w30.l.Options r26, p013kotlin.coroutines.Continuation<? super jn0.s<? extends T>> r27) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a70.e.r(com.stripe.android.model.StripeIntent, java.lang.String, w30.l$c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(StripeIntent stripeIntent) {
        PaymentMethod.p pVar;
        PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
        return ((paymentMethod == null || (pVar = paymentMethod.type) == null) ? null : pVar.getAfterRedirectAction()) instanceof PaymentMethod.a.Refresh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean u(StripeIntent stripeIntent, boolean shouldCancelSource) {
        return shouldCancelSource && stripeIntent.f2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    /* JADX WARN: Code duplicated, block: B:31:0x004a  */
    public final boolean v(StripeIntent stripeIntent, int flowOutcome) {
        boolean z11;
        boolean z12;
        PaymentMethod paymentMethod;
        PaymentMethod.p pVar;
        PaymentMethod.a afterRedirectAction;
        boolean z13 = flowOutcome == 1 && n1.b(stripeIntent);
        if (flowOutcome == 3 && stripeIntent.getStatus() == StripeIntent.Status.Processing) {
            PaymentMethod paymentMethod2 = stripeIntent.getPaymentMethod();
            if ((paymentMethod2 != null ? paymentMethod2.type : null) == PaymentMethod.p.Card) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (flowOutcome == 3 && stripeIntent.getStatus() == StripeIntent.Status.RequiresAction) {
            PaymentMethod paymentMethod3 = stripeIntent.getPaymentMethod();
            if ((paymentMethod3 != null ? paymentMethod3.type : null) == PaymentMethod.p.Card && stripeIntent.P0() == StripeIntent.NextActionType.UseStripeSdk) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        return z13 || z11 || z12 || (stripeIntent.f2() && (paymentMethod = stripeIntent.getPaymentMethod()) != null && (pVar = paymentMethod.type) != null && (afterRedirectAction = pVar.getAfterRedirectAction()) != null && afterRedirectAction.getShouldRefresh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    public final boolean w(Object stripeIntentResult) {
        boolean z11;
        if (s.g(stripeIntentResult)) {
            stripeIntentResult = null;
        }
        StripeIntent stripeIntent = (StripeIntent) stripeIntentResult;
        if (stripeIntent == null) {
            return true;
        }
        boolean zF2 = stripeIntent.f2();
        if (stripeIntent.getStatus() != StripeIntent.Status.Processing) {
            z11 = false;
        } else {
            PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
            if ((paymentMethod != null ? paymentMethod.type : null) == PaymentMethod.p.Card) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return zF2 || z11;
    }

    protected abstract Object l(String str, w30.l.Options options, String str2, Continuation<? super s<? extends T>> continuation);

    protected abstract S m(T stripeIntent, int outcomeFromFlow, String failureMessage);

    /* JADX INFO: renamed from: o, reason: from getter */
    protected final z60.g getStripeRepository() {
        return this.stripeRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(Unvalidated unvalidated, Continuation<? super s<? extends S>> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f520p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f520p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, continuation);
            }
        } else {
            cVar = new c(this, continuation);
        }
        Object objWithContext = cVar.f518n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f520p;
        if (i12 == 0) {
            t.b(objWithContext);
            CoroutineContext coroutineContext = this.workContext;
            d dVar = new d(this, unvalidated, null);
            cVar.f520p = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, dVar, cVar);
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

    protected abstract Object q(String str, w30.l.Options options, List<String> list, Continuation<? super s<? extends T>> continuation);

    protected abstract Object s(String str, w30.l.Options options, List<String> list, Continuation<? super s<? extends T>> continuation);

    private e(Context context, Provider<String> provider, z60.g gVar, o30.d dVar, CoroutineContext coroutineContext, f0 f0Var) {
        this.publishableKeyProvider = provider;
        this.stripeRepository = gVar;
        this.logger = dVar;
        this.workContext = coroutineContext;
        this.retryDelaySupplier = f0Var;
        this.failureMessageFactory = new a70.b(context);
    }

    public /* synthetic */ e(Context context, Provider provider, z60.g gVar, o30.d dVar, CoroutineContext coroutineContext, f0 f0Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, provider, gVar, dVar, coroutineContext, (i11 & 32) != 0 ? new u() : f0Var, null);
    }
}
