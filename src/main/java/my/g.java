package my;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ly.b f92565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ly.a f92566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ly.c f92567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f92568d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f92569e;

    public static boolean b(int i11) {
        return i11 >= 0 && i11 < 8;
    }

    public b a() {
        return this.f92569e;
    }

    public void c(ly.a aVar) {
        this.f92566b = aVar;
    }

    public void d(int i11) {
        this.f92568d = i11;
    }

    public void e(b bVar) {
        this.f92569e = bVar;
    }

    public void f(ly.b bVar) {
        this.f92565a = bVar;
    }

    public void g(ly.c cVar) {
        this.f92567c = cVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f92565a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f92566b);
        sb2.append("\n version: ");
        sb2.append(this.f92567c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f92568d);
        if (this.f92569e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f92569e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
