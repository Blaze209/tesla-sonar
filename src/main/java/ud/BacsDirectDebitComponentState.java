package ud;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.PaymentComponentData;
import com.adyen.checkout.components.core.paymentmethod.BacsDirectDebitPaymentMethod;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ud.b, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u0007\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001c¨\u0006#"}, d2 = {"Lud/b;", "Lbe/h;", "Lcom/adyen/checkout/components/core/paymentmethod/BacsDirectDebitPaymentMethod;", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "data", "", "isInputValid", "isReady", "Lud/e;", "mode", "<init>", "(Lcom/adyen/checkout/components/core/PaymentComponentData;ZZLud/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/adyen/checkout/components/core/PaymentComponentData;", "getData", "()Lcom/adyen/checkout/components/core/PaymentComponentData;", "b", "Z", "()Z", "c", DateTokenConverter.CONVERTER_KEY, "Lud/e;", "getMode", "()Lud/e;", "isValid", "bacs_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BacsDirectDebitComponentState implements be.h<BacsDirectDebitPaymentMethod> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PaymentComponentData<BacsDirectDebitPaymentMethod> data;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isInputValid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isReady;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final e mode;

    public BacsDirectDebitComponentState(PaymentComponentData<BacsDirectDebitPaymentMethod> data, boolean z11, boolean z12, e mode) {
        s.k(data, "data");
        s.k(mode, "mode");
        this.data = data;
        this.isInputValid = z11;
        this.isReady = z12;
        this.mode = mode;
    }

    @Override // be.h
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getIsInputValid() {
        return this.isInputValid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacsDirectDebitComponentState)) {
            return false;
        }
        BacsDirectDebitComponentState bacsDirectDebitComponentState = (BacsDirectDebitComponentState) other;
        return s.f(this.data, bacsDirectDebitComponentState.data) && this.isInputValid == bacsDirectDebitComponentState.isInputValid && this.isReady == bacsDirectDebitComponentState.isReady && this.mode == bacsDirectDebitComponentState.mode;
    }

    @Override // be.h
    public PaymentComponentData<BacsDirectDebitPaymentMethod> getData() {
        return this.data;
    }

    public int hashCode() {
        return (((((this.data.hashCode() * 31) + Boolean.hashCode(this.isInputValid)) * 31) + Boolean.hashCode(this.isReady)) * 31) + this.mode.hashCode();
    }

    @Override // be.h
    /* JADX INFO: renamed from: isReady, reason: from getter */
    public boolean getIsReady() {
        return this.isReady;
    }

    @Override // be.h
    public boolean isValid() {
        return be.h.a.a(this) && this.mode == e.CONFIRMATION;
    }

    public String toString() {
        return "BacsDirectDebitComponentState(data=" + this.data + ", isInputValid=" + this.isInputValid + ", isReady=" + this.isReady + ", mode=" + this.mode + ")";
    }
}
