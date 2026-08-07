package g80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.PaymentMethod;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Lcom/stripe/android/model/v0;", "Lw70/m;", "savedSelection", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;Lw70/m;)Ljava/util/List;", "Lw70/j$f;", "c", "(Lcom/stripe/android/model/v0;)Lw70/j$f;", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class i {
    /* JADX INFO: Access modifiers changed from: private */
    public static final w70.j.Saved c(PaymentMethod paymentMethod) {
        return new w70.j.Saved(paymentMethod, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<PaymentMethod> d(List<PaymentMethod> list, w70.m mVar) {
        Integer num = null;
        if ((mVar instanceof w70.m.PaymentMethod ? (w70.m.PaymentMethod) mVar : null) != null) {
            Iterator<PaymentMethod> it = list.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                if (s.f(it.next().id, ((w70.m.PaymentMethod) mVar).getId())) {
                    break;
                }
                i11++;
            }
            Integer numValueOf = Integer.valueOf(i11);
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num == null) {
            return list;
        }
        PaymentMethod paymentMethod = list.get(num.intValue());
        return v.P0(v.e(paymentMethod), v.M0(list, paymentMethod));
    }
}
