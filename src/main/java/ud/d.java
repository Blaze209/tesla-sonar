package ud;

import ce.k;
import com.adyen.checkout.components.core.paymentmethod.BacsDirectDebitPaymentMethod;
import java.util.Iterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbe/d;", "Lud/c;", "a", "(Lbe/d;)Lud/c;", "b", "(Lud/c;)Lbe/d;", "bacs_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbe/d;", "Ljn0/h0;", "a", "(Lbe/d;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<be.d, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f116125c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f116125c = cVar;
        }

        public final void a(be.d $receiver) {
            s.k($receiver, "$this$$receiver");
            $receiver.b(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE, this.f116125c);
            Iterator<T> it = this.f116125c.getGenericActionConfiguration().a().iterator();
            while (it.hasNext()) {
                $receiver.a((k) it.next());
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(be.d dVar) {
            a(dVar);
            return h0.f84049a;
        }
    }

    public static final c a(be.d dVar) {
        s.k(dVar, "<this>");
        return (c) dVar.g(BacsDirectDebitPaymentMethod.PAYMENT_METHOD_TYPE);
    }

    public static final be.d b(c cVar) {
        s.k(cVar, "<this>");
        return new be.d(cVar.getCom.fourthline.analytics.internal.AnalyticsAttribute.Environment java.lang.String(), cVar.getClientKey(), cVar.getShopperLocale(), cVar.getAmount(), cVar.getAnalyticsConfiguration(), new a(cVar));
    }
}
