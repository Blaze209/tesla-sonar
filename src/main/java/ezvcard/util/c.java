package ezvcard.util;

/* JADX INFO: loaded from: classes8.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f63665a = new StringBuilder();

    public c a(char c11) {
        this.f63665a.append(c11);
        return this;
    }

    public c b() {
        this.f63665a.setLength(0);
        return this;
    }

    public String c() {
        return this.f63665a.toString();
    }

    public String d() {
        String strC = c();
        b();
        return strC;
    }
}
