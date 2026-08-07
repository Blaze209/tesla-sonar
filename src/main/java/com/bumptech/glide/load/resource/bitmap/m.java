package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f20811a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f20812b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m f20813c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f20814d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m f20815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final m f20816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f20817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final dj.g<m> f20818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final boolean f20819i;

    private static class a extends m {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public float b(int i11, int i12, int i13, int i14) {
            int iMin = Math.min(i12 / i14, i11 / i13);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    private static class b extends m {
        b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public g a(int i11, int i12, int i13, int i14) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public float b(int i11, int i12, int i13, int i14) {
            int iCeil = (int) Math.ceil(Math.max(i12 / i14, i11 / i13));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    private static class c extends m {
        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public g a(int i11, int i12, int i13, int i14) {
            return b(i11, i12, i13, i14) == 1.0f ? g.QUALITY : m.f20813c.a(i11, i12, i13, i14);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public float b(int i11, int i12, int i13, int i14) {
            return Math.min(1.0f, m.f20813c.b(i11, i12, i13, i14));
        }
    }

    private static class d extends m {
        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public float b(int i11, int i12, int i13, int i14) {
            return Math.max(i13 / i11, i14 / i12);
        }
    }

    private static class e extends m {
        e() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public g a(int i11, int i12, int i13, int i14) {
            return m.f20819i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public float b(int i11, int i12, int i13, int i14) {
            if (m.f20819i) {
                return Math.min(i13 / i11, i14 / i12);
            }
            int iMax = Math.max(i12 / i14, i11 / i13);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    private static class f extends m {
        f() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public g a(int i11, int i12, int i13, int i14) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m
        public float b(int i11, int i12, int i13, int i14) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f20815e = dVar;
        f20816f = new f();
        f20817g = dVar;
        f20818h = dj.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f20819i = true;
    }

    public abstract g a(int i11, int i12, int i13, int i14);

    public abstract float b(int i11, int i12, int i13, int i14);
}
