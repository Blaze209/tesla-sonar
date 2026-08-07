package nq;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95292a;

    private c(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f95292a = str;
    }

    public static c b(@NonNull String str) {
        return new c(str);
    }

    public String a() {
        return this.f95292a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f95292a.equals(((c) obj).f95292a);
        }
        return false;
    }

    public int hashCode() {
        return this.f95292a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return "Encoding{name=\"" + this.f95292a + "\"}";
    }
}
