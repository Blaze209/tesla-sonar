package d70;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.FinancialConnectionsSession;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.s1;
import com.stripe.android.model.y;
import jn0.s;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import w30.l;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJH\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013JH\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0006H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0013Jh\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Ld70/b;", "", "Lz60/g;", "stripeRepository", "<init>", "(Lz60/g;)V", "Lb70/a;", "", "clientSecret", "hostedSurface", "Lcom/stripe/android/model/y;", DateTokenConverter.CONVERTER_KEY, "(Lb70/a;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/y;", "publishableKey", "stripeAccountId", "configuration", "Ljn0/s;", "Lcom/stripe/android/model/l0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lb70/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "elementsSessionId", "customerId", "onBehalfOf", "", "amount", "currency", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lz60/g;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g stripeRepository;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession", f = "CreateFinancialConnectionsSession.kt", i = {}, l = {95}, m = "forDeferredPayments-tZkwj4A", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f59755n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f59757p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59755n = obj;
            this.f59757p |= Integer.MIN_VALUE;
            Object objA = b.this.a(null, null, null, null, null, null, null, null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : s.a(objA);
        }
    }

    /* JADX INFO: renamed from: d70.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession", f = "CreateFinancialConnectionsSession.kt", i = {}, l = {33}, m = "forPaymentIntent-hUnOzRk", n = {}, s = {})
    static final class C1222b extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f59758n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f59760p;

        C1222b(Continuation<? super C1222b> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59758n = obj;
            this.f59760p |= Integer.MIN_VALUE;
            Object objB = b.this.b(null, null, null, null, null, this);
            return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : s.a(objB);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession", f = "CreateFinancialConnectionsSession.kt", i = {}, l = {62}, m = "forSetupIntent-hUnOzRk", n = {}, s = {})
    static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f59761n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f59763p;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59761n = obj;
            this.f59763p |= Integer.MIN_VALUE;
            Object objC = b.this.c(null, null, null, null, null, this);
            return objC == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objC : s.a(objC);
        }
    }

    public b(g stripeRepository) {
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    private final y d(b70.a aVar, String str, String str2) {
        if (aVar instanceof b70.a.USBankAccount) {
            b70.a.USBankAccount uSBankAccount = (b70.a.USBankAccount) aVar;
            return new y.USBankAccount(str, uSBankAccount.getName(), uSBankAccount.getEmail(), str2);
        }
        if (aVar instanceof b70.a.InstantDebits) {
            return new y.InstantDebits(str, ((b70.a.InstantDebits) aVar).getEmail(), str2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, Continuation<? super s<FinancialConnectionsSession>> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f59757p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f59757p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f59755n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f59757p;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return ((s) obj).getValue();
        }
        t.b(obj);
        g gVar = this.stripeRepository;
        CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams = new CreateFinancialConnectionsSessionForDeferredPaymentParams(str3, null, null, null, s1.Automatic, str6, str4, str5, num, str7);
        l.Options options = new l.Options(str, str2, null, 4, null);
        aVar.f59757p = 1;
        Object objF = gVar.f(createFinancialConnectionsSessionForDeferredPaymentParams, options, aVar);
        return objF == coroutine_suspended ? coroutine_suspended : objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(String str, String str2, String str3, String str4, b70.a aVar, Continuation<? super s<FinancialConnectionsSession>> continuation) {
        C1222b c1222b;
        Object objB;
        Object objL;
        if (continuation instanceof C1222b) {
            c1222b = (C1222b) continuation;
            int i11 = c1222b.f59760p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c1222b.f59760p = i11 - Integer.MIN_VALUE;
            } else {
                c1222b = new C1222b(continuation);
            }
        } else {
            c1222b = new C1222b(continuation);
        }
        Object obj = c1222b.f59758n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c1222b.f59760p;
        try {
            if (i12 == 0) {
                t.b(obj);
                try {
                    s.Companion companion = s.INSTANCE;
                    objB = s.b(new PaymentIntent.ClientSecret(str2));
                } catch (Throwable th2) {
                    s.Companion companion2 = s.INSTANCE;
                    objB = s.b(t.a(th2));
                }
                if (!s.h(objB)) {
                    return s.b(objB);
                }
                g gVar = this.stripeRepository;
                String paymentIntentId = ((PaymentIntent.ClientSecret) objB).getPaymentIntentId();
                y yVarD = d(aVar, str2, str4);
                l.Options options = new l.Options(str, str3, null, 4, null);
                c1222b.f59760p = 1;
                objL = gVar.l(paymentIntentId, yVarD, options, c1222b);
                if (objL == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objL = ((s) obj).getValue();
            }
            t.b(objL);
            return s.b((FinancialConnectionsSession) objL);
        } catch (Throwable th3) {
            s.Companion companion3 = s.INSTANCE;
            return s.b(t.a(th3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(String str, String str2, String str3, String str4, b70.a aVar, Continuation<? super s<FinancialConnectionsSession>> continuation) {
        c cVar;
        Object objB;
        Object objO;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i11 = cVar.f59763p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.f59763p = i11 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f59761n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = cVar.f59763p;
        try {
            if (i12 == 0) {
                t.b(obj);
                try {
                    s.Companion companion = s.INSTANCE;
                    objB = s.b(new SetupIntent.ClientSecret(str2));
                } catch (Throwable th2) {
                    s.Companion companion2 = s.INSTANCE;
                    objB = s.b(t.a(th2));
                }
                if (!s.h(objB)) {
                    return s.b(objB);
                }
                g gVar = this.stripeRepository;
                String setupIntentId = ((SetupIntent.ClientSecret) objB).getSetupIntentId();
                y yVarD = d(aVar, str2, str4);
                l.Options options = new l.Options(str, str3, null, 4, null);
                cVar.f59763p = 1;
                objO = gVar.o(setupIntentId, yVarD, options, cVar);
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                objO = ((s) obj).getValue();
            }
            t.b(objO);
            return s.b((FinancialConnectionsSession) objO);
        } catch (Throwable th3) {
            s.Companion companion3 = s.INSTANCE;
            return s.b(t.a(th3));
        }
    }
}
