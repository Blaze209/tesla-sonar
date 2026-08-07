package ip;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final c f81689l = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected c f81690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f81691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f81692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f81693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String[] f81694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected a[] f81695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f81696g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f81697h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f81698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f81699j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected boolean f81700k;

    static final class a {
    }

    private c() {
        this.f81693d = true;
        this.f81692c = -1;
        this.f81700k = true;
        this.f81691b = 0;
        this.f81699j = 0;
        d(64);
    }

    private static int a(int i11) {
        return i11 - (i11 >> 2);
    }

    public static c b() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return c((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static c c(int i11) {
        return f81689l.e(i11);
    }

    private void d(int i11) {
        this.f81694e = new String[i11];
        this.f81695f = new a[i11 >> 1];
        this.f81698i = i11 - 1;
        this.f81696g = 0;
        this.f81699j = 0;
        this.f81697h = a(i11);
    }

    private c e(int i11) {
        return new c(null, -1, this.f81694e, this.f81695f, this.f81696g, i11, this.f81699j);
    }

    private c(c cVar, int i11, String[] strArr, a[] aVarArr, int i12, int i13, int i14) {
        this.f81690a = cVar;
        this.f81692c = i11;
        this.f81693d = gp.a.EnumC1419a.CANONICALIZE_FIELD_NAMES.enabledIn(i11);
        this.f81694e = strArr;
        this.f81695f = aVarArr;
        this.f81696g = i12;
        this.f81691b = i13;
        int length = strArr.length;
        this.f81697h = a(length);
        this.f81698i = length - 1;
        this.f81699j = i14;
        this.f81700k = false;
    }
}
