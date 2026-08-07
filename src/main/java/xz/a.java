package xz;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f124083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected a f124084b;

    public a(int i11) {
        this(i11, null);
    }

    public abstract void a(String str, Object obj);

    public abstract a b(String str, String str2);

    public abstract a c(String str);

    public abstract void d();

    public abstract void e(String str, String str2, String str3);

    public a(int i11, a aVar) {
        if (i11 != 589824 && i11 != 524288 && i11 != 458752 && i11 != 393216 && i11 != 327680 && i11 != 262144 && i11 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i11);
        }
        if (i11 == 17432576) {
            i.a(this);
        }
        this.f124083a = i11;
        this.f124084b = aVar;
    }
}
