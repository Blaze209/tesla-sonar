package ab0;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ab0.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0013\u0010\n¨\u0006\u0017"}, d2 = {"Lab0/d;", "", "", "json", "", "verified", "publicKey", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "ChargingMetrology_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class MetrologyValidationResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String json;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean verified;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publicKey;

    public MetrologyValidationResult(String json, boolean z11, String publicKey) {
        s.k(json, "json");
        s.k(publicKey, "publicKey");
        this.json = json;
        this.verified = z11;
        this.publicKey = publicKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getJson() {
        return this.json;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getVerified() {
        return this.verified;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetrologyValidationResult)) {
            return false;
        }
        MetrologyValidationResult metrologyValidationResult = (MetrologyValidationResult) other;
        return s.f(this.json, metrologyValidationResult.json) && this.verified == metrologyValidationResult.verified && s.f(this.publicKey, metrologyValidationResult.publicKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = this.json.hashCode() * 31;
        boolean z11 = this.verified;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return ((iHashCode + r11) * 31) + this.publicKey.hashCode();
    }

    public String toString() {
        return "MetrologyValidationResult(json=" + this.json + ", verified=" + this.verified + ", publicKey=" + this.publicKey + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
