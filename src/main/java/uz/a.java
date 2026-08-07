package uz;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f116783c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f116784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f116785b;

    static {
        f116783c = System.getProperty("JSON_SMART_SIMPLE") != null ? 4032 : -1;
    }

    public a(int i11) {
        this.f116784a = i11;
    }

    private d a() {
        if (this.f116785b == null) {
            this.f116785b = new d(this.f116784a);
        }
        return this.f116785b;
    }

    public Object b(String str) {
        return a().x(str);
    }
}
