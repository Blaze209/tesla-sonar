package cu;

import android.app.PendingIntent;

/* JADX INFO: loaded from: classes5.dex */
final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingIntent f59176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f59177b;

    d(PendingIntent pendingIntent, boolean z11) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null pendingIntent");
        }
        this.f59176a = pendingIntent;
        this.f59177b = z11;
    }

    @Override // cu.a
    final PendingIntent a() {
        return this.f59176a;
    }

    @Override // cu.a
    final boolean b() {
        return this.f59177b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f59176a.equals(aVar.a()) && this.f59177b == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f59176a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f59177b ? 1237 : 1231);
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f59176a.toString() + ", isNoOp=" + this.f59177b + "}";
    }
}
