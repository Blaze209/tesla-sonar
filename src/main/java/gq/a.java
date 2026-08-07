package gq;

/* JADX INFO: loaded from: classes4.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f69328a = new StringBuilder(1024);

    a() {
    }

    public a a(char c11) {
        this.f69328a.append(c11);
        return this;
    }

    public a b(CharSequence charSequence) {
        this.f69328a.append(charSequence);
        return this;
    }

    public a c() {
        if (g() > 0) {
            StringBuilder sb2 = this.f69328a;
            sb2.setLength(sb2.length() - 1);
        }
        return this;
    }

    public a d() {
        this.f69328a.setLength(0);
        return this;
    }

    public String e() {
        return this.f69328a.toString();
    }

    public String f() {
        String strE = e();
        d();
        return strE;
    }

    public int g() {
        return this.f69328a.length();
    }
}
