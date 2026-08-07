package androidx.media3.exoplayer;

import java.util.HashMap;
import java.util.Iterator;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes.dex */
public class j implements n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s8.g f10307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f10308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f10309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f10310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f10311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f10312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f10313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f10314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f10315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HashMap<a8.o2, b> f10316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f10317l;

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10319b;

        private b() {
        }
    }

    public j() {
        this(new s8.g(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    private static void r(int i11, int i12, String str, String str2) {
        s7.a.b(i11 >= i12, str + " cannot be less than " + str2);
    }

    private static int u(int i11) {
        switch (i11) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 26214400;
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void v(a8.o2 o2Var) {
        if (this.f10316k.remove(o2Var) != null) {
            x();
        }
    }

    private void w(a8.o2 o2Var) {
        b bVar = (b) s7.a.f(this.f10316k.get(o2Var));
        int i11 = this.f10312g;
        if (i11 == -1) {
            i11 = 13107200;
        }
        bVar.f10319b = i11;
        bVar.f10318a = false;
    }

    private void x() {
        if (this.f10316k.isEmpty()) {
            this.f10307b.g();
        } else {
            this.f10307b.h(t());
        }
    }

    @Override // androidx.media3.exoplayer.n1
    public s8.b g() {
        return this.f10307b;
    }

    @Override // androidx.media3.exoplayer.n1
    public long h(a8.o2 o2Var) {
        return this.f10314i;
    }

    @Override // androidx.media3.exoplayer.n1
    public boolean j(n1.a aVar) {
        b bVar = (b) s7.a.f(this.f10316k.get(aVar.f10581a));
        boolean z11 = true;
        boolean z12 = this.f10307b.e() >= t();
        long jMin = this.f10308c;
        float f11 = aVar.f10586f;
        if (f11 > 1.0f) {
            jMin = Math.min(s7.q0.o0(jMin, f11), this.f10309d);
        }
        long jMax = Math.max(jMin, 500000L);
        long j11 = aVar.f10585e;
        if (j11 < jMax) {
            if (!this.f10313h && z12) {
                z11 = false;
            }
            bVar.f10318a = z11;
            if (!z11 && j11 < 500000) {
                s7.t.i("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f10309d || z12) {
            bVar.f10318a = false;
        }
        return bVar.f10318a;
    }

    @Override // androidx.media3.exoplayer.n1
    public boolean k(n1.a aVar) {
        long jU0 = s7.q0.u0(aVar.f10585e, aVar.f10586f);
        long jMin = aVar.f10588h ? this.f10311f : this.f10310e;
        long j11 = aVar.f10589i;
        if (j11 != -9223372036854775807L) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || jU0 >= jMin) {
            return true;
        }
        return !this.f10313h && this.f10307b.e() >= t();
    }

    @Override // androidx.media3.exoplayer.n1
    public boolean l(a8.o2 o2Var) {
        return this.f10315j;
    }

    @Override // androidx.media3.exoplayer.n1
    public void m(a8.o2 o2Var) {
        long id2 = Thread.currentThread().getId();
        long j11 = this.f10317l;
        s7.a.i(j11 == -1 || j11 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f10317l = id2;
        if (!this.f10316k.containsKey(o2Var)) {
            this.f10316k.put(o2Var, new b());
        }
        w(o2Var);
    }

    @Override // androidx.media3.exoplayer.n1
    public boolean n(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar, long j11) {
        Iterator<b> it = this.f10316k.values().iterator();
        while (it.hasNext()) {
            if (it.next().f10318a) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.n1
    public void o(a8.o2 o2Var) {
        v(o2Var);
    }

    @Override // androidx.media3.exoplayer.n1
    public void p(a8.o2 o2Var) {
        v(o2Var);
        if (this.f10316k.isEmpty()) {
            this.f10317l = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.n1
    public void q(n1.a aVar, n8.y yVar, r8.t[] tVarArr) {
        b bVar = (b) s7.a.f(this.f10316k.get(aVar.f10581a));
        int iS = this.f10312g;
        if (iS == -1) {
            iS = s(tVarArr);
        }
        bVar.f10319b = iS;
        x();
    }

    protected int s(r8.t[] tVarArr) {
        int iU = 0;
        for (r8.t tVar : tVarArr) {
            if (tVar != null) {
                iU += u(tVar.e().f101501c);
            }
        }
        return Math.max(13107200, iU);
    }

    int t() {
        Iterator<b> it = this.f10316k.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += it.next().f10319b;
        }
        return i11;
    }

    protected j(s8.g gVar, int i11, int i12, int i13, int i14, int i15, boolean z11, int i16, boolean z12) {
        r(i13, 0, "bufferForPlaybackMs", WebrtcBuildVersion.maint_version);
        r(i14, 0, "bufferForPlaybackAfterRebufferMs", WebrtcBuildVersion.maint_version);
        r(i11, i13, "minBufferMs", "bufferForPlaybackMs");
        r(i11, i14, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        r(i12, i11, "maxBufferMs", "minBufferMs");
        r(i16, 0, "backBufferDurationMs", WebrtcBuildVersion.maint_version);
        this.f10307b = gVar;
        this.f10308c = s7.q0.b1(i11);
        this.f10309d = s7.q0.b1(i12);
        this.f10310e = s7.q0.b1(i13);
        this.f10311f = s7.q0.b1(i14);
        this.f10312g = i15;
        this.f10313h = z11;
        this.f10314i = s7.q0.b1(i16);
        this.f10315j = z12;
        this.f10316k = new HashMap<>();
        this.f10317l = -1L;
    }
}
