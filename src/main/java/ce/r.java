package ce;

import androidx.p003lifecycle.LifecycleOwner;
import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import com.adyen.checkout.core.exception.CheckoutException;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Ju\u0010\u0016\u001a\u00020\u0014\"\u0010\b\u0000\u0010\b*\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0018\u0010\u0015\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0004\u0012\u00020\u00140\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"Lce/r;", "", "Lce/n;", "observerContainer", "<init>", "(Lce/n;)V", "Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "T", "Lkotlinx/coroutines/flow/Flow;", "stateFlow", "Lcom/adyen/checkout/core/exception/CheckoutException;", "exceptionFlow", "submitFlow", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function1;", "Lce/p;", "Ljn0/h0;", "callback", "a", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/CoroutineScope;Lwn0/l;)V", "b", "()V", "Lce/n;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n observerContainer;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "T", "it", "Ljn0/h0;", "a", "(Lbe/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class a<T> extends p013kotlin.jvm.internal.u implements wn0.l<T, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p<T>, h0> f19090c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super p<T>, h0> lVar) {
            super(1);
            this.f19090c = lVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public final void a(be.h it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            this.f19090c.invoke(new p.d(it));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            a((be.h) obj);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "T", "Lcom/adyen/checkout/core/exception/CheckoutException;", "it", "Ljn0/h0;", "a", "(Lcom/adyen/checkout/core/exception/CheckoutException;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<CheckoutException, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p<T>, h0> f19091c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(wn0.l<? super p<T>, h0> lVar) {
            super(1);
            this.f19091c = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void a(CheckoutException it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            this.f19091c.invoke(new p.b(new be.g(it)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(CheckoutException checkoutException) {
            a(checkoutException);
            return h0.f84049a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "T", "it", "Ljn0/h0;", "a", "(Lbe/h;)V"}, k = 3, mv = {1, 9, 0})
    static final class c<T> extends p013kotlin.jvm.internal.u implements wn0.l<T, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p<T>, h0> f19092c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(wn0.l<? super p<T>, h0> lVar) {
            super(1);
            this.f19092c = lVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        public final void a(be.h it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            this.f19092c.invoke(new p.e(it));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(Object obj) {
            a((be.h) obj);
            return h0.f84049a;
        }
    }

    public r(n observerContainer) {
        p013kotlin.jvm.internal.s.k(observerContainer, "observerContainer");
        this.observerContainer = observerContainer;
    }

    public final <T extends be.h<? extends PaymentMethodDetails>> void a(Flow<? extends T> stateFlow, Flow<? extends CheckoutException> exceptionFlow, Flow<? extends T> submitFlow, LifecycleOwner lifecycleOwner, CoroutineScope coroutineScope, wn0.l<? super p<T>, h0> callback) {
        p013kotlin.jvm.internal.s.k(stateFlow, "stateFlow");
        p013kotlin.jvm.internal.s.k(submitFlow, "submitFlow");
        p013kotlin.jvm.internal.s.k(lifecycleOwner, "lifecycleOwner");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        n nVar = this.observerContainer;
        nVar.b();
        nVar.a(stateFlow, lifecycleOwner, coroutineScope, new a(callback));
        if (exceptionFlow != null) {
            nVar.a(exceptionFlow, lifecycleOwner, coroutineScope, new b(callback));
        }
        nVar.a(submitFlow, lifecycleOwner, coroutineScope, new c(callback));
    }

    public final void b() {
        this.observerContainer.b();
    }

    public /* synthetic */ r(n nVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new n() : nVar);
    }
}
