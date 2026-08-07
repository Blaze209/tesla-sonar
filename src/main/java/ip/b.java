package ip;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b f81676a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final AtomicReference<C1713b> f81677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f81678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f81679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f81680e;

    private static final class a {
    }

    /* JADX INFO: renamed from: ip.b$b, reason: collision with other inner class name */
    private static final class C1713b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f81681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f81682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f81683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d[] f81684d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a[] f81685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f81686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f81687g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f81688h;

        public C1713b(int i11, int i12, int[] iArr, d[] dVarArr, a[] aVarArr, int i13, int i14, int i15) {
            this.f81681a = i11;
            this.f81682b = i12;
            this.f81683c = iArr;
            this.f81684d = dVarArr;
            this.f81685e = aVarArr;
            this.f81686f = i13;
            this.f81687g = i14;
            this.f81688h = i15;
        }
    }

    private b(int i11, boolean z11, int i12, boolean z12) {
        this.f81678c = i12;
        this.f81679d = z11;
        this.f81680e = z12;
        int i13 = 16;
        if (i11 < 16) {
            i11 = i13;
        } else if (((i11 - 1) & i11) != 0) {
            while (i13 < i11) {
                i13 += i13;
            }
            i11 = i13;
        }
        this.f81677b = new AtomicReference<>(c(i11));
    }

    public static b a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return b((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    protected static b b(int i11) {
        return new b(64, true, i11, true);
    }

    private C1713b c(int i11) {
        return new C1713b(0, i11 - 1, new int[i11], new d[i11], null, 0, 0, 0);
    }
}
