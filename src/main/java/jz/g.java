package jz;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f84463b = new g("JOSE");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f84464c = new g("JOSE+JSON");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f84465d = new g("JWT");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f84466a;

    public g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The object type must not be null");
        }
        this.f84466a = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && this.f84466a.equalsIgnoreCase(((g) obj).f84466a);
    }

    public int hashCode() {
        return this.f84466a.toLowerCase().hashCode();
    }

    public String toString() {
        return this.f84466a;
    }
}
