package xz;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f124188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected m f124189b;

    public m(int i11) {
        this(i11, null);
    }

    public abstract a a(String str, boolean z11);

    public abstract void b(c cVar);

    public abstract void c();

    public abstract a d(int i11, c0 c0Var, String str, boolean z11);

    public m(int i11, m mVar) {
        if (i11 != 589824 && i11 != 524288 && i11 != 458752 && i11 != 393216 && i11 != 327680 && i11 != 262144 && i11 != 17432576) {
            throw new IllegalArgumentException("Unsupported api " + i11);
        }
        if (i11 == 17432576) {
            i.a(this);
        }
        this.f124188a = i11;
        this.f124189b = mVar;
    }
}
