package xe0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: xe0.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\f\u0010\u0004¨\u0006\u0013"}, d2 = {"Lxe0/c;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "supported", "Ljava/lang/String;", "notSupportedReason", "tesla-oem-wallet_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OemWalletSupportStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean supported;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String notSupportedReason;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNotSupportedReason() {
        return this.notSupportedReason;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSupported() {
        return this.supported;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OemWalletSupportStatus)) {
            return false;
        }
        OemWalletSupportStatus oemWalletSupportStatus = (OemWalletSupportStatus) other;
        return this.supported == oemWalletSupportStatus.supported && s.f(this.notSupportedReason, oemWalletSupportStatus.notSupportedReason);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.supported) * 31;
        String str = this.notSupportedReason;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OemWalletSupportStatus(supported=" + this.supported + ", notSupportedReason=" + this.notSupportedReason + ")";
    }
}
