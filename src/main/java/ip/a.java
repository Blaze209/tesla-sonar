package ip;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a f81658a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AtomicReference<C1712a> f81659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f81660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f81661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f81662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int[] f81663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f81664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f81665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f81666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f81667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f81668k;

    /* JADX INFO: renamed from: ip.a$a, reason: collision with other inner class name */
    private static final class C1712a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f81671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f81672d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String[] f81673e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81674f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f81675g;

        public C1712a(int i11, int i12, int i13, int[] iArr, String[] strArr, int i14, int i15) {
            this.f81669a = i11;
            this.f81670b = i12;
            this.f81671c = i13;
            this.f81672d = iArr;
            this.f81673e = strArr;
            this.f81674f = i14;
            this.f81675g = i15;
        }

        public static C1712a a(int i11) {
            int i12 = i11 << 3;
            return new C1712a(i11, 0, a.a(i11), new int[i12], new String[i11 << 1], i12 - i11, i12);
        }
    }

    private a(int i11, boolean z11, int i12, boolean z12) {
        this.f81660c = i12;
        this.f81661d = z11;
        this.f81662e = z12;
        int i13 = 16;
        if (i11 < 16) {
            i11 = i13;
        } else if (((i11 - 1) & i11) != 0) {
            while (i13 < i11) {
                i13 += i13;
            }
            i11 = i13;
        }
        this.f81659b = new AtomicReference<>(C1712a.a(i11));
    }

    static int a(int i11) {
        int i12 = i11 >> 2;
        if (i12 < 64) {
            return 4;
        }
        if (i12 <= 256) {
            return 5;
        }
        return i12 <= 1024 ? 6 : 7;
    }

    private final int b() {
        int i11 = this.f81664g;
        return (i11 << 3) - i11;
    }

    public static a c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return d((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static a d(int i11) {
        return new a(64, true, i11, true);
    }

    public int e() {
        int i11 = this.f81665h;
        int i12 = 0;
        for (int i13 = 3; i13 < i11; i13 += 4) {
            if (this.f81663f[i13] != 0) {
                i12++;
            }
        }
        return i12;
    }

    public int f() {
        int i11 = this.f81666i;
        int i12 = 0;
        for (int i13 = this.f81665h + 3; i13 < i11; i13 += 4) {
            if (this.f81663f[i13] != 0) {
                i12++;
            }
        }
        return i12;
    }

    public int g() {
        return (this.f81668k - b()) >> 2;
    }

    public int h() {
        int i11 = this.f81666i + 3;
        int i12 = this.f81664g + i11;
        int i13 = 0;
        while (i11 < i12) {
            if (this.f81663f[i11] != 0) {
                i13++;
            }
            i11 += 4;
        }
        return i13;
    }

    public int i() {
        int i11 = this.f81664g << 3;
        int i12 = 0;
        for (int i13 = 3; i13 < i11; i13 += 4) {
            if (this.f81663f[i13] != 0) {
                i12++;
            }
        }
        return i12;
    }

    public String toString() {
        int iE = e();
        int iF = f();
        int iH = h();
        int iG = g();
        int i11 = i();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", a.class.getName(), Integer.valueOf(this.f81667j), Integer.valueOf(this.f81664g), Integer.valueOf(iE), Integer.valueOf(iF), Integer.valueOf(iH), Integer.valueOf(iG), Integer.valueOf(i11), Integer.valueOf(iE + iF + iH + iG), Integer.valueOf(i11));
    }
}
