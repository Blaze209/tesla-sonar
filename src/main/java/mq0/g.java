package mq0;

/* JADX INFO: loaded from: classes9.dex */
class g implements kq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class f92463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f92464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f92465c;

    g(Class cls, String str, int i11) {
        this.f92463a = cls;
        this.f92464b = str;
        this.f92465c = i11;
    }

    public String a() {
        return this.f92464b;
    }

    public int b() {
        return this.f92465c;
    }

    public String toString() {
        return a() + ":" + b();
    }
}
