package v5;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0010\u0010\t¨\u0006\u0012"}, d2 = {"Lv5/m;", "", "", "configType", "ntfProximityNearCm", "ntfProximityFarCm", "<init>", "(III)V", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "uwb_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int configType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int ntfProximityNearCm;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int ntfProximityFarCm;

    public m(int i11, int i12, int i13) {
        this.configType = i11;
        this.ntfProximityNearCm = i12;
        this.ntfProximityFarCm = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getConfigType() {
        return this.configType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNtfProximityFarCm() {
        return this.ntfProximityFarCm;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getNtfProximityNearCm() {
        return this.ntfProximityNearCm;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!s.f(m.class, other != null ? other.getClass() : null)) {
            return false;
        }
        s.i(other, "null cannot be cast to non-null type androidx.core.uwb.UwbRangeDataNtfConfig");
        m mVar = (m) other;
        return this.configType == mVar.configType && this.ntfProximityNearCm == mVar.ntfProximityNearCm && this.ntfProximityFarCm == mVar.ntfProximityFarCm;
    }

    public int hashCode() {
        return (((this.configType * 31) + this.ntfProximityNearCm) * 31) + this.ntfProximityFarCm;
    }
}
