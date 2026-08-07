package d70;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import java.util.List;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import w30.l;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ>\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Ld70/a;", "", "Lz60/g;", "stripeRepository", "<init>", "(Lz60/g;)V", "", "publishableKey", "linkedAccountSessionId", "clientSecret", "stripeAccountId", "Ljn0/s;", "Lcom/stripe/android/model/u0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/d1;", "b", "Lz60/g;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C1221a f59744b = new C1221a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f59745c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f59746d = v.e("payment_method");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g stripeRepository;

    /* JADX INFO: renamed from: d70.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld70/a$a;", "", "<init>", "()V", "", "", "EXPAND_PAYMENT_METHOD", "Ljava/util/List;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class C1221a {
        public /* synthetic */ C1221a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1221a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession", f = "AttachFinancialConnectionsSession.kt", i = {}, l = {30}, m = "forPaymentIntent-yxL6bBk", n = {}, s = {})
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f59748n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f59750p;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59748n = obj;
            this.f59750p |= Integer.MIN_VALUE;
            Object objA = a.this.a(null, null, null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession", f = "AttachFinancialConnectionsSession.kt", i = {}, l = {60}, m = "forSetupIntent-yxL6bBk", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f59751n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f59753p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59751n = obj;
            this.f59753p |= Integer.MIN_VALUE;
            Object objB = a.this.b(null, null, null, null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : s.a(objB);
        }
    }

    public a(g stripeRepository) {
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(String str, String str2, String str3, String str4, Continuation<? super s<PaymentIntent>> continuation) {
        b bVar;
        Object objA;
        Object objB;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f59750p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f59750p = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f59748n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar2.f59750p;
        try {
            if (i12 == 0) {
                t.b(obj);
                try {
                    s.Companion companion = s.INSTANCE;
                    objA = s.b(new PaymentIntent.ClientSecret(str3));
                } catch (Throwable th2) {
                    s.Companion companion2 = s.INSTANCE;
                    objA = s.b(t.a(th2));
                }
                if (s.h(objA)) {
                    PaymentIntent.ClientSecret clientSecret = (PaymentIntent.ClientSecret) objA;
                    g gVar = this.stripeRepository;
                    String value = clientSecret.getValue();
                    String paymentIntentId = clientSecret.getPaymentIntentId();
                    l.Options options = new l.Options(str, str4, null, 4, null);
                    List<String> list = f59746d;
                    bVar2.f59750p = 1;
                    objB = gVar.B(value, paymentIntentId, str2, options, list, bVar2);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return s.b(objA);
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            objB = ((s) obj).getValue();
            t.b(objB);
            return s.b((PaymentIntent) objB);
        } catch (Throwable th3) {
            s.Companion companion3 = s.INSTANCE;
            objA = t.a(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object b(String str, String str2, String str3, String str4, Continuation<? super s<SetupIntent>> continuation) {
        c cVar;
        Object objA;
        Object objW;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f59753p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f59753p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f59751n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar2.f59753p;
        try {
            if (i12 == 0) {
                t.b(obj);
                try {
                    s.Companion companion = s.INSTANCE;
                    objA = s.b(new SetupIntent.ClientSecret(str3));
                } catch (Throwable th2) {
                    s.Companion companion2 = s.INSTANCE;
                    objA = s.b(t.a(th2));
                }
                if (s.h(objA)) {
                    SetupIntent.ClientSecret clientSecret = (SetupIntent.ClientSecret) objA;
                    g gVar = this.stripeRepository;
                    String value = clientSecret.getValue();
                    String setupIntentId = clientSecret.getSetupIntentId();
                    l.Options options = new l.Options(str, str4, null, 4, null);
                    List<String> list = f59746d;
                    cVar2.f59753p = 1;
                    objW = gVar.w(value, setupIntentId, str2, options, list, cVar2);
                    if (objW == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return s.b(objA);
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            objW = ((s) obj).getValue();
            t.b(objW);
            return s.b((SetupIntent) objW);
        } catch (Throwable th3) {
            s.Companion companion3 = s.INSTANCE;
            objA = t.a(th3);
        }
    }
}
