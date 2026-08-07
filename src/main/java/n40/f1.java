package n40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.SharePaymentDetails;
import java.util.ArrayList;
import java.util.List;
import l50.InstantDebitsResult;
import m50.PaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import t50.CachedConsumerSession;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln40/f1;", "Ln40/n;", "Lt50/j;", "consumerRepository", "Lt50/r;", "repository", "Lt50/f;", "consumerSessionProvider", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "<init>", "(Lt50/j;Lt50/r;Lt50/f;Lcom/stripe/android/financialconnections/a$c;)V", "", "bankAccountId", "Ll50/f;", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lt50/j;", "b", "Lt50/r;", "c", "Lt50/f;", DateTokenConverter.CONVERTER_KEY, "Lcom/stripe/android/financialconnections/a$c;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f1 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t50.j consumerRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t50.r repository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t50.f consumerSessionProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.RealCreateInstantDebitsResult", f = "CreateInstantDebitsResult.kt", i = {0, 0, 1, 2}, l = {33, 41, 47}, m = "invoke", n = {"this", "clientSecret", "paymentDetails", "paymentDetails"}, s = {"L$0", "L$1", "L$0", "L$0"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f93093n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f93094o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f93095p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f93097r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f93095p = obj;
            this.f93097r |= Integer.MIN_VALUE;
            return f1.this.a(null, this);
        }
    }

    public f1(t50.j consumerRepository, t50.r repository, t50.f consumerSessionProvider, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        p013kotlin.jvm.internal.s.k(consumerRepository, "consumerRepository");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(consumerSessionProvider, "consumerSessionProvider");
        this.consumerRepository = consumerRepository;
        this.repository = repository;
        this.consumerSessionProvider = consumerSessionProvider;
        this.elementsSessionContext = elementsSessionContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // n40.n
    public Object a(String str, Continuation<? super InstantDebitsResult> continuation) {
        a aVar;
        String str2;
        f1 f1Var;
        ConsumerPaymentDetails.BankAccount bankAccount;
        String paymentMethodId;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f93097r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f93097r = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f93095p;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f93097r;
        if (i12 == 0) {
            jn0.t.b(obj);
            CachedConsumerSession cachedConsumerSessionA = this.consumerSessionProvider.a();
            String clientSecret = cachedConsumerSessionA != null ? cachedConsumerSessionA.getClientSecret() : null;
            if (clientSecret == null) {
                throw new IllegalArgumentException("Consumer session client secret cannot be null");
            }
            t50.j jVar = this.consumerRepository;
            aVar.f93093n = this;
            aVar.f93094o = clientSecret;
            aVar.f93097r = 1;
            Object objC = jVar.c(str, clientSecret, aVar);
            if (objC != coroutine_suspended) {
                String str3 = clientSecret;
                obj = objC;
                str2 = str3;
                f1Var = this;
            }
            return coroutine_suspended;
        }
        if (i12 != 1) {
            if (i12 == 2) {
                bankAccount = (ConsumerPaymentDetails.BankAccount) aVar.f93093n;
                jn0.t.b(obj);
                paymentMethodId = ((SharePaymentDetails) obj).getPaymentMethodId();
                return new InstantDebitsResult(paymentMethodId, bankAccount.getLast4(), bankAccount.getBankName());
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bankAccount = (ConsumerPaymentDetails.BankAccount) aVar.f93093n;
            jn0.t.b(obj);
            paymentMethodId = ((PaymentMethod) obj).getId();
            return new InstantDebitsResult(paymentMethodId, bankAccount.getLast4(), bankAccount.getBankName());
        }
        str2 = (String) aVar.f93094o;
        f1Var = (f1) aVar.f93093n;
        jn0.t.b(obj);
        List<ConsumerPaymentDetails.e> listA = ((ConsumerPaymentDetails) obj).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listA) {
            if (obj2 instanceof ConsumerPaymentDetails.BankAccount) {
                arrayList.add(obj2);
            }
        }
        ConsumerPaymentDetails.BankAccount bankAccount2 = (ConsumerPaymentDetails.BankAccount) p013kotlin.collections.v.o0(arrayList);
        com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext = f1Var.elementsSessionContext;
        if ((elementsSessionContext != null ? elementsSessionContext.getLinkMode() : null) == com.stripe.android.model.n0.LinkCardBrand) {
            t50.j jVar2 = f1Var.consumerRepository;
            String id2 = bankAccount2.getId();
            String expectedPaymentMethodType = f1Var.elementsSessionContext.getLinkMode().getExpectedPaymentMethodType();
            aVar.f93093n = bankAccount2;
            aVar.f93094o = null;
            aVar.f93097r = 2;
            Object objB = jVar2.b(id2, str2, expectedPaymentMethodType, aVar);
            if (objB != coroutine_suspended) {
                obj = objB;
                bankAccount = bankAccount2;
                paymentMethodId = ((SharePaymentDetails) obj).getPaymentMethodId();
                return new InstantDebitsResult(paymentMethodId, bankAccount.getLast4(), bankAccount.getBankName());
            }
        } else {
            t50.r rVar = f1Var.repository;
            String id3 = bankAccount2.getId();
            aVar.f93093n = bankAccount2;
            aVar.f93094o = null;
            aVar.f93097r = 3;
            Object objE = rVar.e(id3, str2, aVar);
            if (objE != coroutine_suspended) {
                obj = objE;
                bankAccount = bankAccount2;
                paymentMethodId = ((PaymentMethod) obj).getId();
                return new InstantDebitsResult(paymentMethodId, bankAccount.getLast4(), bankAccount.getBankName());
            }
        }
        return coroutine_suspended;
    }
}
