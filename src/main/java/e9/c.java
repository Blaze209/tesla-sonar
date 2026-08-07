package e9;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f62271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f62272b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f62275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f62276d;

        public a(String str, String str2, long j11, long j12) {
            this.f62273a = str;
            this.f62274b = str2;
            this.f62275c = j11;
            this.f62276d = j12;
        }
    }

    public c(long j11, List<a> list) {
        this.f62271a = j11;
        this.f62272b = list;
    }

    public l9.a a(long j11) {
        long j12;
        if (this.f62272b.size() < 2) {
            return null;
        }
        long j13 = j11;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        long j17 = -1;
        boolean z11 = false;
        for (int size = this.f62272b.size() - 1; size >= 0; size--) {
            a aVar = this.f62272b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f62273a) | z11;
            if (size == 0) {
                j13 -= aVar.f62276d;
                j12 = 0;
            } else {
                j12 = j13 - aVar.f62275c;
            }
            long j18 = j12;
            long j19 = j13;
            j13 = j18;
            if (!zEquals || j13 == j19) {
                z11 = zEquals;
            } else {
                j17 = j19 - j13;
                j16 = j13;
                z11 = false;
            }
            if (size == 0) {
                j14 = j13;
                j15 = j19;
            }
        }
        if (j16 == -1 || j17 == -1 || j14 == -1 || j15 == -1) {
            return null;
        }
        return new l9.a(j14, j15, this.f62271a, j16, j17);
    }
}
