package c40;

import com.stripe.android.model.ElementsSession;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: c40.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lc40/d;", "", "Lcom/stripe/android/model/h0;", "elementsSession", "Lcom/stripe/android/model/h0$d;", "customer", "Lc40/a;", "ephemeralKey", "<init>", "(Lcom/stripe/android/model/h0;Lcom/stripe/android/model/h0$d;Lc40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/model/h0;", "b", "()Lcom/stripe/android/model/h0;", "Lcom/stripe/android/model/h0$d;", "()Lcom/stripe/android/model/h0$d;", "c", "Lc40/a;", "()Lc40/a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CustomerSessionElementsSession {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f18657d = ElementsSession.Customer.f51191d | ElementsSession.f51179k;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ElementsSession elementsSession;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ElementsSession.Customer customer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CachedCustomerEphemeralKey ephemeralKey;

    public CustomerSessionElementsSession(ElementsSession elementsSession, ElementsSession.Customer customer, CachedCustomerEphemeralKey ephemeralKey) {
        s.k(elementsSession, "elementsSession");
        s.k(customer, "customer");
        s.k(ephemeralKey, "ephemeralKey");
        this.elementsSession = elementsSession;
        this.customer = customer;
        this.ephemeralKey = ephemeralKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ElementsSession.Customer getCustomer() {
        return this.customer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ElementsSession getElementsSession() {
        return this.elementsSession;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CachedCustomerEphemeralKey getEphemeralKey() {
        return this.ephemeralKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerSessionElementsSession)) {
            return false;
        }
        CustomerSessionElementsSession customerSessionElementsSession = (CustomerSessionElementsSession) other;
        return s.f(this.elementsSession, customerSessionElementsSession.elementsSession) && s.f(this.customer, customerSessionElementsSession.customer) && s.f(this.ephemeralKey, customerSessionElementsSession.ephemeralKey);
    }

    public int hashCode() {
        return (((this.elementsSession.hashCode() * 31) + this.customer.hashCode()) * 31) + this.ephemeralKey.hashCode();
    }

    public String toString() {
        return "CustomerSessionElementsSession(elementsSession=" + this.elementsSession + ", customer=" + this.customer + ", ephemeralKey=" + this.ephemeralKey + ")";
    }
}
