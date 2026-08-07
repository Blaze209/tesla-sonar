package ce;

import com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0003\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "T", "Lkotlin/Function1;", "Lce/p;", "Ljn0/h0;", "Lce/b;", "a", "(Lwn0/l;)Lwn0/l;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "T", "Lce/b;", "actionComponentEvent", "Ljn0/h0;", "a", "(Lce/b;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.l<b, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l<p<T>, h0> f19070c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(wn0.l<? super p<T>, h0> lVar) {
            super(1);
            this.f19070c = lVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public final void a(b actionComponentEvent) {
            p013kotlin.jvm.internal.s.k(actionComponentEvent, "actionComponentEvent");
            if (actionComponentEvent instanceof b.a) {
                this.f19070c.invoke(new p.a(((b.a) actionComponentEvent).getData()));
                return;
            }
            if (actionComponentEvent instanceof b.C0392b) {
                this.f19070c.invoke(new p.b(((b.C0392b) actionComponentEvent).getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String()));
            } else if (actionComponentEvent instanceof b.c) {
                b.c cVar = (b.c) actionComponentEvent;
                this.f19070c.invoke(new p.c(cVar.getRequiredPermission(), cVar.getPermissionCallback()));
            }
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(b bVar) {
            a(bVar);
            return h0.f84049a;
        }
    }

    public static final <T extends be.h<? extends PaymentMethodDetails>> wn0.l<b, h0> a(wn0.l<? super p<T>, h0> lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<this>");
        return new a(lVar);
    }
}
