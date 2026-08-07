package z0;

import android.net.Uri;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class h extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f126148a;

    h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null outputUri");
        }
        this.f126148a = uri;
    }

    @Override // z0.v
    @NonNull
    public Uri a() {
        return this.f126148a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            return this.f126148a.equals(((v) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f126148a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "OutputResults{outputUri=" + this.f126148a + "}";
    }
}
