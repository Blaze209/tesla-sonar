package sd;

import com.adyen.checkout.components.core.action.Action;
import ke.m;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: sd.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"Lsd/a;", "Lke/m;", "", "isValid", "", Action.PAYMENT_METHOD_TYPE, "<init>", "(ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "await_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AwaitOutputData implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentMethodType;

    public AwaitOutputData(boolean z11, String str) {
        this.isValid = z11;
        this.paymentMethodType = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPaymentMethodType() {
        return this.paymentMethodType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AwaitOutputData)) {
            return false;
        }
        AwaitOutputData awaitOutputData = (AwaitOutputData) other;
        return this.isValid == awaitOutputData.isValid && s.f(this.paymentMethodType, awaitOutputData.paymentMethodType);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isValid) * 31;
        String str = this.paymentMethodType;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AwaitOutputData(isValid=" + this.isValid + ", paymentMethodType=" + this.paymentMethodType + ")";
    }
}
