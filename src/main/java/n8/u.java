package n8;

import android.net.Uri;
import p7.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends r0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f93597r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final p7.y f93598s = new p7.y.c().c("SinglePeriodTimeline").i(Uri.EMPTY).a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f93599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f93600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f93601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f93602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f93603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f93604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final long f93605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f93606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f93607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f93608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f93609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final p7.y f93610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final p7.y.g f93611q;

    public u(long j11, boolean z11, boolean z12, boolean z13, Object obj, p7.y yVar) {
        this(j11, j11, 0L, 0L, z11, z12, z13, obj, yVar);
    }

    @Override // p7.r0
    public int f(Object obj) {
        return f93597r.equals(obj) ? 0 : -1;
    }

    @Override // p7.r0
    public r0.b k(int i11, r0.b bVar, boolean z11) {
        s7.a.c(i11, 0, 1);
        return bVar.u(null, z11 ? f93597r : null, 0, this.f93602h, -this.f93604j);
    }

    @Override // p7.r0
    public int m() {
        return 1;
    }

    @Override // p7.r0
    public Object q(int i11) {
        s7.a.c(i11, 0, 1);
        return f93597r;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e A[PHI: r1
      0x002e: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x000d, B:5:0x0011, B:7:0x0017, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p7.r0
    public r0.d s(int i11, r0.d dVar, long j11) {
        long j12;
        s7.a.c(i11, 0, 1);
        long j13 = this.f93605k;
        boolean z11 = this.f93607m;
        if (!z11 || this.f93608n || j11 == 0) {
            j12 = j13;
        } else {
            long j14 = this.f93603i;
            if (j14 != -9223372036854775807L) {
                j13 += j11;
                if (j13 <= j14) {
                    j12 = j13;
                }
            }
            j12 = -9223372036854775807L;
        }
        return dVar.h(r0.d.f101471q, this.f93610p, this.f93609o, this.f93599e, this.f93600f, this.f93601g, this.f93606l, z11, this.f93611q, j12, this.f93603i, 0, 0, this.f93604j);
    }

    @Override // p7.r0
    public int t() {
        return 1;
    }

    public u(long j11, long j12, long j13, long j14, boolean z11, boolean z12, boolean z13, Object obj, p7.y yVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j11, j12, j13, j14, z11, z12, false, obj, yVar, z13 ? yVar.f101684d : null);
    }

    public u(long j11, long j12, long j13, long j14, long j15, long j16, long j17, boolean z11, boolean z12, boolean z13, Object obj, p7.y yVar, p7.y.g gVar) {
        this.f93599e = j11;
        this.f93600f = j12;
        this.f93601g = j13;
        this.f93602h = j14;
        this.f93603i = j15;
        this.f93604j = j16;
        this.f93605k = j17;
        this.f93606l = z11;
        this.f93607m = z12;
        this.f93608n = z13;
        this.f93609o = obj;
        this.f93610p = (p7.y) s7.a.f(yVar);
        this.f93611q = gVar;
    }
}
