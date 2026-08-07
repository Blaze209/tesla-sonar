package gv;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
final class j extends f0.e.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69847a;

    @Override // gv.f0.e.a.b
    @NonNull
    public String a() {
        return this.f69847a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.a.b) {
            return this.f69847a.equals(((f0.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f69847a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f69847a + "}";
    }
}
