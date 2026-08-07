package com.stripe.android.paymentsheet;

import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.List;
import n70.DisplayableSavedPaymentMethod;
import n70.PaymentOptionsState;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u001a\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u0004\u0018\u00010\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018Ja\u0010\u001a\u001a\u00020\u00192\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u001a\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/v;", "", "<init>", "()V", "", "Lcom/stripe/android/model/v0;", "paymentMethods", "", "showGooglePay", "showLink", "Lkotlin/Function1;", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lx30/c;", "nameProvider", "canRemovePaymentMethods", "isCbcEligible", "Lcom/stripe/android/paymentsheet/t;", "b", "(Ljava/util/List;ZZLwn0/l;ZZ)Ljava/util/List;", "items", "Lw70/j;", "currentSelection", "c", "(Ljava/util/List;Lw70/j;)Lcom/stripe/android/paymentsheet/t;", "Ln70/p;", "a", "(Ljava/util/List;ZZLw70/j;Lwn0/l;ZZ)Ln70/p;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f53787a = new v();

    private v() {
    }

    public final PaymentOptionsState a(List<PaymentMethod> paymentMethods, boolean showGooglePay, boolean showLink, w70.j currentSelection, wn0.l<? super String, ? extends x30.c> nameProvider, boolean canRemovePaymentMethods, boolean isCbcEligible) {
        p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
        p013kotlin.jvm.internal.s.k(nameProvider, "nameProvider");
        List<t> listB = b(paymentMethods, showGooglePay, showLink, nameProvider, canRemovePaymentMethods, isCbcEligible);
        return new PaymentOptionsState(listB, c(listB, currentSelection));
    }

    public final List<t> b(List<PaymentMethod> paymentMethods, boolean showGooglePay, boolean showLink, wn0.l<? super String, ? extends x30.c> nameProvider, boolean canRemovePaymentMethods, boolean isCbcEligible) {
        p013kotlin.jvm.internal.s.k(paymentMethods, "paymentMethods");
        p013kotlin.jvm.internal.s.k(nameProvider, "nameProvider");
        t.b bVar = t.b.f53570a;
        if (!showGooglePay) {
            bVar = null;
        }
        t.c cVar = t.c.f53573a;
        if (!showLink) {
            cVar = null;
        }
        List listR = p013kotlin.collections.v.r(t.a.f53567a, bVar, cVar);
        List<PaymentMethod> list = paymentMethods;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        for (PaymentMethod paymentMethod : list) {
            PaymentMethod.p pVar = paymentMethod.type;
            arrayList.add(new t.SavedPaymentMethod(new DisplayableSavedPaymentMethod(nameProvider.invoke(pVar != null ? pVar.code : null), paymentMethod, isCbcEligible), canRemovePaymentMethods));
        }
        return p013kotlin.collections.v.P0(listR, arrayList);
    }

    public final t c(List<? extends t> items, w70.j currentSelection) {
        p013kotlin.jvm.internal.s.k(items, "items");
        if (currentSelection != null) {
            return w.b(items, currentSelection);
        }
        return null;
    }
}
