package es;

import android.net.Uri;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.x0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class s extends f2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Object f63187s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final x0 f63188t = new x0.c().c("SinglePeriodTimeline").f(Uri.EMPTY).a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f63189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f63190g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f63191h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f63192i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f63193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f63194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f63195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f63196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f63197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f63198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Object f63199p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final x0 f63200q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final x0.g f63201r;

    public s(long j11, boolean z11, boolean z12, boolean z13, Object obj, x0 x0Var) {
        this(j11, j11, 0L, 0L, z11, z12, z13, obj, x0Var);
    }

    @Override // com.google.android.exoplayer2.f2
    public int f(Object obj) {
        return f63187s.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.f2
    public f2.b k(int i11, f2.b bVar, boolean z11) {
        ts.a.c(i11, 0, 1);
        return bVar.v(null, z11 ? f63187s : null, 0, this.f63192i, -this.f63194k);
    }

    @Override // com.google.android.exoplayer2.f2
    public int m() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.f2
    public Object q(int i11) {
        ts.a.c(i11, 0, 1);
        return f63187s;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.f2
    public f2.d s(int i11, f2.d dVar, long j11) {
        long j12;
        ts.a.c(i11, 0, 1);
        long j13 = this.f63195l;
        boolean z11 = this.f63197n;
        if (!z11 || this.f63198o || j11 == 0) {
            j12 = j13;
        } else {
            long j14 = this.f63193j;
            if (j14 != -9223372036854775807L) {
                j13 += j11;
                if (j13 <= j14) {
                    j12 = j13;
                }
            }
            j12 = -9223372036854775807L;
        }
        return dVar.i(f2.d.f39933r, this.f63200q, this.f63199p, this.f63189f, this.f63190g, this.f63191h, this.f63196m, z11, this.f63201r, j12, this.f63193j, 0, 0, this.f63194k);
    }

    @Override // com.google.android.exoplayer2.f2
    public int t() {
        return 1;
    }

    public s(long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, Object obj, x0 x0Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j11, j12, j13, j14, z11, z12, false, obj, x0Var, z13 ? x0Var.f41169d : null);
    }

    public s(long j11, long j12, long j13, long j14, long j15, long j16, long j17, boolean z11, boolean z12, boolean z13, Object obj, x0 x0Var, x0.g gVar) {
        this.f63189f = j11;
        this.f63190g = j12;
        this.f63191h = j13;
        this.f63192i = j14;
        this.f63193j = j15;
        this.f63194k = j16;
        this.f63195l = j17;
        this.f63196m = z11;
        this.f63197n = z12;
        this.f63198o = z13;
        this.f63199p = obj;
        this.f63200q = (x0) ts.a.e(x0Var);
        this.f63201r = gVar;
    }
}
