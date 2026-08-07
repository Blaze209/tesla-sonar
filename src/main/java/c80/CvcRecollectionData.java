package c80;

import com.stripe.android.model.PaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: c80.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0011B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Lc80/d;", "", "", "lastFour", "Lcom/stripe/android/model/h;", "brand", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/stripe/android/model/h;", "()Lcom/stripe/android/model/h;", "c", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CvcRecollectionData {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastFour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final com.stripe.android.model.h brand;

    /* JADX INFO: renamed from: c80.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc80/d$a;", "", "<init>", "()V", "Lcom/stripe/android/model/v0$g;", "paymentSelection", "Lc80/d;", "a", "(Lcom/stripe/android/model/v0$g;)Lc80/d;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CvcRecollectionData a(PaymentMethod.Card paymentSelection) {
            if (paymentSelection != null) {
                return new CvcRecollectionData(paymentSelection.last4, paymentSelection.brand);
            }
            return null;
        }

        private Companion() {
        }
    }

    public CvcRecollectionData(String str, com.stripe.android.model.h brand) {
        s.k(brand, "brand");
        this.lastFour = str;
        this.brand = brand;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.stripe.android.model.h getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvcRecollectionData)) {
            return false;
        }
        CvcRecollectionData cvcRecollectionData = (CvcRecollectionData) other;
        return s.f(this.lastFour, cvcRecollectionData.lastFour) && this.brand == cvcRecollectionData.brand;
    }

    public int hashCode() {
        String str = this.lastFour;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.brand.hashCode();
    }

    public String toString() {
        return "CvcRecollectionData(lastFour=" + this.lastFour + ", brand=" + this.brand + ")";
    }
}
