package n70;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: n70.p, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Ln70/p;", "", "", "Lcom/stripe/android/paymentsheet/t;", "items", "selectedItem", "<init>", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lcom/stripe/android/paymentsheet/t;", "()Lcom/stripe/android/paymentsheet/t;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PaymentOptionsState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<com.stripe.android.paymentsheet.t> items;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.paymentsheet.t selectedItem;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsState(List<? extends com.stripe.android.paymentsheet.t> items, com.stripe.android.paymentsheet.t tVar) {
        p013kotlin.jvm.internal.s.k(items, "items");
        this.items = items;
        this.selectedItem = tVar;
    }

    public final List<com.stripe.android.paymentsheet.t> a() {
        return this.items;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final com.stripe.android.paymentsheet.t getSelectedItem() {
        return this.selectedItem;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentOptionsState)) {
            return false;
        }
        PaymentOptionsState paymentOptionsState = (PaymentOptionsState) other;
        return p013kotlin.jvm.internal.s.f(this.items, paymentOptionsState.items) && p013kotlin.jvm.internal.s.f(this.selectedItem, paymentOptionsState.selectedItem);
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        com.stripe.android.paymentsheet.t tVar = this.selectedItem;
        return iHashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    public String toString() {
        return "PaymentOptionsState(items=" + this.items + ", selectedItem=" + this.selectedItem + ")";
    }
}
