package xz;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f124210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f124211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f124212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f124213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f124214e;

    public p(int i11, String str, String str2, String str3, boolean z11) {
        this.f124210a = i11;
        this.f124211b = str;
        this.f124212c = str2;
        this.f124213d = str3;
        this.f124214e = z11;
    }

    public String a() {
        return this.f124213d;
    }

    public String b() {
        return this.f124212c;
    }

    public String c() {
        return this.f124211b;
    }

    public int d() {
        return this.f124210a;
    }

    public boolean e() {
        return this.f124214e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f124210a == pVar.f124210a && this.f124214e == pVar.f124214e && this.f124211b.equals(pVar.f124211b) && this.f124212c.equals(pVar.f124212c) && this.f124213d.equals(pVar.f124213d);
    }

    public int hashCode() {
        return this.f124210a + (this.f124214e ? 64 : 0) + (this.f124211b.hashCode() * this.f124212c.hashCode() * this.f124213d.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f124211b);
        sb2.append(CoreConstants.DOT);
        sb2.append(this.f124212c);
        sb2.append(this.f124213d);
        sb2.append(" (");
        sb2.append(this.f124210a);
        sb2.append(this.f124214e ? " itf" : "");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}
