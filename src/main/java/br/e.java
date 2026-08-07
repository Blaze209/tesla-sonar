package br;

import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.z1;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class e implements t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ss.m f17907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f17908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f17909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f17910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f17911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f17912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f17913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f17914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f17915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17917l;

    public e() {
        this(new ss.m(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    private static void k(int i11, int i12, String str, String str2) {
        ts.a.b(i11 >= i12, str + " cannot be less than " + str2);
    }

    private static int m(int i11) {
        switch (i11) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void n(boolean z11) {
        int i11 = this.f17912g;
        if (i11 == -1) {
            i11 = 13107200;
        }
        this.f17916k = i11;
        this.f17917l = false;
        if (z11) {
            this.f17907b.g();
        }
    }

    @Override // br.t
    public void a() {
        n(false);
    }

    @Override // br.t
    public void b() {
        n(true);
    }

    @Override // br.t
    public boolean c() {
        return this.f17915j;
    }

    @Override // br.t
    public boolean d(long j11, long j12, float f11) {
        boolean z11 = true;
        boolean z12 = this.f17907b.f() >= this.f17916k;
        long jMin = this.f17908c;
        if (f11 > 1.0f) {
            jMin = Math.min(ts.p0.Y(jMin, f11), this.f17909d);
        }
        if (j12 < Math.max(jMin, 500000L)) {
            if (!this.f17913h && z12) {
                z11 = false;
            }
            this.f17917l = z11;
            if (!z11 && j12 < 500000) {
                ts.u.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j12 >= this.f17909d || z12) {
            this.f17917l = false;
        }
        return this.f17917l;
    }

    @Override // br.t
    public long e() {
        return this.f17914i;
    }

    @Override // br.t
    public ss.b g() {
        return this.f17907b;
    }

    @Override // br.t
    public boolean h(f2 f2Var, es.j jVar, long j11, float f11, boolean z11, long j12) {
        long jD0 = ts.p0.d0(j11, f11);
        long jMin = z11 ? this.f17911f : this.f17910e;
        if (j12 != -9223372036854775807L) {
            jMin = Math.min(j12 / 2, jMin);
        }
        if (jMin <= 0 || jD0 >= jMin) {
            return true;
        }
        return !this.f17913h && this.f17907b.f() >= this.f17916k;
    }

    @Override // br.t
    public void i(f2 f2Var, es.j jVar, z1[] z1VarArr, es.w wVar, qs.r[] rVarArr) {
        int iL = this.f17912g;
        if (iL == -1) {
            iL = l(z1VarArr, rVarArr);
        }
        this.f17916k = iL;
        this.f17907b.h(iL);
    }

    protected int l(z1[] z1VarArr, qs.r[] rVarArr) {
        int iM = 0;
        for (int i11 = 0; i11 < z1VarArr.length; i11++) {
            if (rVarArr[i11] != null) {
                iM += m(z1VarArr[i11].c());
            }
        }
        return Math.max(13107200, iM);
    }

    @Override // br.t
    public void onReleased() {
        n(true);
    }

    protected e(ss.m mVar, int i11, int i12, int i13, int i14, int i15, boolean z11, int i16, boolean z12) {
        k(i13, 0, "bufferForPlaybackMs", WebrtcBuildVersion.maint_version);
        k(i14, 0, "bufferForPlaybackAfterRebufferMs", WebrtcBuildVersion.maint_version);
        k(i11, i13, "minBufferMs", "bufferForPlaybackMs");
        k(i11, i14, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i12, i11, "maxBufferMs", "minBufferMs");
        k(i16, 0, "backBufferDurationMs", WebrtcBuildVersion.maint_version);
        this.f17907b = mVar;
        this.f17908c = ts.p0.D0(i11);
        this.f17909d = ts.p0.D0(i12);
        this.f17910e = ts.p0.D0(i13);
        this.f17911f = ts.p0.D0(i14);
        this.f17912g = i15;
        this.f17916k = i15 == -1 ? 13107200 : i15;
        this.f17913h = z11;
        this.f17914i = ts.p0.D0(i16);
        this.f17915j = z12;
    }
}
