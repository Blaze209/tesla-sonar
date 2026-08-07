package jz;

import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public class a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f84432c = new a("none", t.REQUIRED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f84433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f84434b;

    public a(String str, t tVar) {
        if (str == null) {
            throw new IllegalArgumentException("The algorithm name must not be null");
        }
        this.f84433a = str;
        this.f84434b = tVar;
    }

    public static a a(String str) {
        if (str == null) {
            return null;
        }
        return new a(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && toString().equals(obj.toString());
    }

    public final String getName() {
        return this.f84433a;
    }

    public final int hashCode() {
        return this.f84433a.hashCode();
    }

    public final String toString() {
        return this.f84433a;
    }

    public a(String str) {
        this(str, null);
    }
}
