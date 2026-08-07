package j80;

import androidx.p003lifecycle.d1;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import u60.PaymentMethodMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lj80/u;", "", "<init>", "()V", "Lk80/a;", "viewModel", "Lu60/e;", "paymentMethodMetadata", "Ln70/b;", "customerStateHolder", "", "Lx70/c;", "a", "(Lk80/a;Lu60/e;Ln70/b;)Ljava/util/List;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f83115a = new u();

    private u() {
    }

    public final List<x70.c> a(k80.a viewModel, PaymentMethodMetadata paymentMethodMetadata, n70.b customerStateHolder) {
        p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
        p013kotlin.jvm.internal.s.k(paymentMethodMetadata, "paymentMethodMetadata");
        p013kotlin.jvm.internal.s.k(customerStateHolder, "customerStateHolder");
        List<String> listK = paymentMethodMetadata.K();
        if (listK.size() == 1 && customerStateHolder.c().getValue().isEmpty()) {
            return v.e(new x70.c.l(d.INSTANCE.a((String) v.o0(listK), viewModel, paymentMethodMetadata, customerStateHolder), true));
        }
        List listC = v.c();
        listC.add(new x70.c.k(c.INSTANCE.a(viewModel, paymentMethodMetadata, customerStateHolder)));
        w70.j value = viewModel.C().getValue();
        w70.j.e eVar = value instanceof w70.j.e ? (w70.j.e) value : null;
        if (eVar != null) {
            String strI = eVar.getPaymentMethodCreateParams().i();
            if (n70.k.INSTANCE.a(viewModel, n70.m.INSTANCE.a(viewModel, d1.a(viewModel)), paymentMethodMetadata).d(strI)) {
                listC.add(new x70.c.l(d.INSTANCE.a(strI, viewModel, paymentMethodMetadata, customerStateHolder), false, 2, null));
            }
        }
        return v.a(listC);
    }
}
