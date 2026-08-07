package g40;

import com.stripe.android.model.PaymentMethod;
import java.util.Comparator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import w70.j;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Lcom/stripe/android/model/v0;", "paymentMethods", "Lw70/j$f;", "selection", "b", "(Ljava/util/List;Lw70/j$f;)Ljava/util/List;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/model/v0;", "kotlin.jvm.PlatformType", "left", "right", "", "a", "(Lcom/stripe/android/model/v0;Lcom/stripe/android/model/v0;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements p<PaymentMethod, PaymentMethod, Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PaymentMethod f67330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(PaymentMethod paymentMethod) {
            super(2);
            this.f67330c = paymentMethod;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(PaymentMethod paymentMethod, PaymentMethod paymentMethod2) {
            int i11;
            if (s.f(paymentMethod.id, this.f67330c.id)) {
                i11 = -1;
            } else {
                i11 = s.f(paymentMethod2.id, this.f67330c.id) ? 1 : 0;
            }
            return Integer.valueOf(i11);
        }
    }

    public static final List<PaymentMethod> b(List<PaymentMethod> paymentMethods, j.Saved saved) {
        s.k(paymentMethods, "paymentMethods");
        if (saved != null) {
            final a aVar = new a(saved.getPaymentMethod());
            List<PaymentMethod> listA1 = v.a1(paymentMethods, new Comparator() { // from class: g40.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return d.c(aVar, obj, obj2);
                }
            });
            if (listA1 != null) {
                return listA1;
            }
        }
        return paymentMethods;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(p tmp0, Object obj, Object obj2) {
        s.k(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }
}
