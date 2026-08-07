package c40;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: c40.a, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001b"}, d2 = {"Lc40/a;", "", "", "customerId", "customerSessionClientSecret", "ephemeralKey", "", "expiresAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "currentTimeInMillis", "", DateTokenConverter.CONVERTER_KEY, "(J)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "I", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CachedCustomerEphemeralKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerSessionClientSecret;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ephemeralKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int expiresAt;

    public CachedCustomerEphemeralKey(String customerId, String customerSessionClientSecret, String ephemeralKey, int i11) {
        s.k(customerId, "customerId");
        s.k(customerSessionClientSecret, "customerSessionClientSecret");
        s.k(ephemeralKey, "ephemeralKey");
        this.customerId = customerId;
        this.customerSessionClientSecret = customerSessionClientSecret;
        this.ephemeralKey = ephemeralKey;
        this.expiresAt = i11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCustomerSessionClientSecret() {
        return this.customerSessionClientSecret;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEphemeralKey() {
        return this.ephemeralKey;
    }

    public final boolean d(long currentTimeInMillis) {
        long j11 = this.expiresAt;
        io0.b.Companion companion = io0.b.INSTANCE;
        return j11 - io0.b.r(io0.d.t(currentTimeInMillis, io0.e.MILLISECONDS)) <= io0.b.r(io0.d.s(5, io0.e.MINUTES));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedCustomerEphemeralKey)) {
            return false;
        }
        CachedCustomerEphemeralKey cachedCustomerEphemeralKey = (CachedCustomerEphemeralKey) other;
        return s.f(this.customerId, cachedCustomerEphemeralKey.customerId) && s.f(this.customerSessionClientSecret, cachedCustomerEphemeralKey.customerSessionClientSecret) && s.f(this.ephemeralKey, cachedCustomerEphemeralKey.ephemeralKey) && this.expiresAt == cachedCustomerEphemeralKey.expiresAt;
    }

    public int hashCode() {
        return (((((this.customerId.hashCode() * 31) + this.customerSessionClientSecret.hashCode()) * 31) + this.ephemeralKey.hashCode()) * 31) + Integer.hashCode(this.expiresAt);
    }

    public String toString() {
        return "CachedCustomerEphemeralKey(customerId=" + this.customerId + ", customerSessionClientSecret=" + this.customerSessionClientSecret + ", ephemeralKey=" + this.ephemeralKey + ", expiresAt=" + this.expiresAt + ")";
    }
}
