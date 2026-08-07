package kh;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f86079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f86080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f86081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86082d;

    public a(String str) {
        this.f86081c = str;
    }

    public void a(int i11) {
        this.f86082d = i11;
    }

    public void b(long j11) {
        this.f86079a = j11;
    }

    public void c(String str) {
        this.f86080b = str;
    }

    public boolean d() {
        return this.f86079a > System.currentTimeMillis();
    }

    public void e() {
        this.f86079a = 0L;
    }
}
