package qz;

import java.io.Serializable;
import jz.t;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f106251c = new g("EC", t.RECOMMENDED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f106252d = new g("RSA", t.REQUIRED);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f106253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f106254f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f106256b;

    static {
        t tVar = t.OPTIONAL;
        f106253e = new g("oct", tVar);
        f106254f = new g("OKP", tVar);
    }

    public g(String str, t tVar) {
        if (str == null) {
            throw new IllegalArgumentException("The key type value must not be null");
        }
        this.f106255a = str;
        this.f106256b = tVar;
    }

    public static g b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("The key type to parse must not be null");
        }
        g gVar = f106251c;
        if (str.equals(gVar.a())) {
            return gVar;
        }
        g gVar2 = f106252d;
        if (str.equals(gVar2.a())) {
            return gVar2;
        }
        g gVar3 = f106253e;
        if (str.equals(gVar3.a())) {
            return gVar3;
        }
        g gVar4 = f106254f;
        return str.equals(gVar4.a()) ? gVar4 : new g(str, null);
    }

    public String a() {
        return this.f106255a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f106255a.hashCode();
    }

    public String toString() {
        return this.f106255a;
    }
}
