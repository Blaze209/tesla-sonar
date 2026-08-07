package xz;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f124264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected u f124265b;

    public u(int i11) {
        this(i11, null);
    }

    public abstract void a();

    public abstract void b(String str, int i11, String... strArr);

    public abstract void c(String str);

    public abstract void d(String str, int i11, String... strArr);

    public abstract void e(String str);

    public abstract void f(String str, String... strArr);

    public abstract void g(String str, int i11, String str2);

    public abstract void h(String str);

    public u(int i11, u uVar) {
        if (i11 != 589824 && i11 != 524288 && i11 != 458752 && i11 != 393216 && i11 != 327680 && i11 != 262144 && i11 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i11);
        }
        if (i11 == 17432576) {
            i.a(this);
        }
        this.f124264a = i11;
        this.f124265b = uVar;
    }
}
