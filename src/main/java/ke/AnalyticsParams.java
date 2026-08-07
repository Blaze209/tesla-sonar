package ke;

import be.AnalyticsConfiguration;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ke.a, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\f¨\u0006\u001a"}, d2 = {"Lke/a;", "", "Lke/c;", "level", "", "clientKey", "<init>", "(Lke/c;Ljava/lang/String;)V", "Lbe/b;", "analyticsConfiguration", "(Lbe/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lke/c;", "()Lke/c;", "b", "Ljava/lang/String;", "getClientKey", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c level;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clientKey;

    public AnalyticsParams(c level, String clientKey) {
        s.k(level, "level");
        s.k(clientKey, "clientKey");
        this.level = level;
        this.clientKey = clientKey;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getLevel() {
        return this.level;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsParams)) {
            return false;
        }
        AnalyticsParams analyticsParams = (AnalyticsParams) other;
        return this.level == analyticsParams.level && s.f(this.clientKey, analyticsParams.clientKey);
    }

    public int hashCode() {
        return (this.level.hashCode() * 31) + this.clientKey.hashCode();
    }

    public String toString() {
        return "AnalyticsParams(level=" + this.level + ", clientKey=" + this.clientKey + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnalyticsParams(AnalyticsConfiguration analyticsConfiguration, String clientKey) {
        this(b.b(analyticsConfiguration), clientKey);
        s.k(clientKey, "clientKey");
    }
}
