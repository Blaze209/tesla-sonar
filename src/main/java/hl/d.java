package hl;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f73124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f73125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f73126c;

    public d() {
        a();
    }

    public void a() {
        this.f73124a = false;
        this.f73125b = 4;
        c();
    }

    public void b() {
        this.f73126c++;
    }

    public void c() {
        this.f73126c = 0;
    }

    public void d(boolean z11) {
        this.f73124a = z11;
    }

    public boolean e() {
        return this.f73124a && this.f73126c < this.f73125b;
    }
}
