package lv;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f90793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f90794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f90795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f90798f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f90799g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f90800h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f90801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f90803c;

        public a(boolean z11, boolean z12, boolean z13) {
            this.f90801a = z11;
            this.f90802b = z12;
            this.f90803c = z13;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f90804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f90805b;

        public b(int i11, int i12) {
            this.f90804a = i11;
            this.f90805b = i12;
        }
    }

    public d(long j11, b bVar, a aVar, int i11, int i12, double d11, double d12, int i13) {
        this.f90795c = j11;
        this.f90793a = bVar;
        this.f90794b = aVar;
        this.f90796d = i11;
        this.f90797e = i12;
        this.f90798f = d11;
        this.f90799g = d12;
        this.f90800h = i13;
    }

    public boolean a(long j11) {
        return this.f90795c < j11;
    }
}
