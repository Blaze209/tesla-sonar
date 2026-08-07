package j80;

import com.stripe.android.model.PaymentMethod;
import n70.DisplayableSavedPaymentMethod;
import p013kotlin.Metadata;
import u60.PaymentMethodMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\t\u001a\u00020\b*\u00020\u00002\u001a\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/v0;", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lx30/c;", "providePaymentMethodName", "Lu60/e;", "paymentMethodMetadata", "Ln70/g;", "a", "(Lcom/stripe/android/model/v0;Lwn0/l;Lu60/e;)Ln70/g;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class q {
    public static final DisplayableSavedPaymentMethod a(PaymentMethod paymentMethod, wn0.l<? super String, ? extends x30.c> providePaymentMethodName, PaymentMethodMetadata paymentMethodMetadata) {
        p013kotlin.jvm.internal.s.k(paymentMethod, "<this>");
        p013kotlin.jvm.internal.s.k(providePaymentMethodName, "providePaymentMethodName");
        PaymentMethod.p pVar = paymentMethod.type;
        return new DisplayableSavedPaymentMethod(providePaymentMethodName.invoke(pVar != null ? pVar.code : null), paymentMethod, (paymentMethodMetadata != null ? paymentMethodMetadata.getCbcEligibility() : null) instanceof x80.a.Eligible);
    }
}
