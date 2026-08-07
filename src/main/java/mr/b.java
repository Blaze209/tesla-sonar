package mr;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f92488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f92489b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f92492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f92493d;

        public a(String str, String str2, long j11, long j12) {
            this.f92490a = str;
            this.f92491b = str2;
            this.f92492c = j11;
            this.f92493d = j12;
        }
    }

    public b(long j11, List<a> list) {
        this.f92488a = j11;
        this.f92489b = list;
    }

    public as.b a(long j11) {
        long j12;
        if (this.f92489b.size() < 2) {
            return null;
        }
        long j13 = j11;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        long j17 = -1;
        boolean z11 = false;
        for (int size = this.f92489b.size() - 1; size >= 0; size--) {
            a aVar = this.f92489b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f92490a) | z11;
            if (size == 0) {
                j13 -= aVar.f92493d;
                j12 = 0;
            } else {
                j12 = j13 - aVar.f92492c;
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
        return new as.b(j14, j15, this.f92488a, j16, j17);
    }
}
