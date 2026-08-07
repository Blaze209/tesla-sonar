package ce;

import p013kotlin.Metadata;

/* JADX INFO: renamed from: ce.s, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lce/s;", "", "", "requiredPermission", "Lme/d;", "permissionCallback", "<init>", "(Ljava/lang/String;Lme/d;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lme/d;", "()Lme/d;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class PermissionRequestData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String requiredPermission;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final me.d permissionCallback;

    public PermissionRequestData(String requiredPermission, me.d permissionCallback) {
        p013kotlin.jvm.internal.s.k(requiredPermission, "requiredPermission");
        p013kotlin.jvm.internal.s.k(permissionCallback, "permissionCallback");
        this.requiredPermission = requiredPermission;
        this.permissionCallback = permissionCallback;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final me.d getPermissionCallback() {
        return this.permissionCallback;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRequiredPermission() {
        return this.requiredPermission;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionRequestData)) {
            return false;
        }
        PermissionRequestData permissionRequestData = (PermissionRequestData) other;
        return p013kotlin.jvm.internal.s.f(this.requiredPermission, permissionRequestData.requiredPermission) && p013kotlin.jvm.internal.s.f(this.permissionCallback, permissionRequestData.permissionCallback);
    }

    public int hashCode() {
        return (this.requiredPermission.hashCode() * 31) + this.permissionCallback.hashCode();
    }

    public String toString() {
        return "PermissionRequestData(requiredPermission=" + this.requiredPermission + ", permissionCallback=" + this.permissionCallback + ")";
    }
}
