package androidx.media3.exoplayer.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.l2;
import androidx.media3.exoplayer.m2;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.r;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.x;
import com.google.common.util.concurrent.w;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.math.ec.Tnaf;
import p7.c1;
import p7.e1;
import p7.g0;
import p7.r0;
import p7.u;
import s7.e0;
import s7.j0;
import s7.q0;
import s7.t;
import z7.a0;

/* JADX INFO: loaded from: classes3.dex */
public class h extends MediaCodecRenderer implements l.b {
    private static final int[] X1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean Y1;
    private static boolean Z1;
    private final Context J0;
    private final boolean K0;
    private final o.a L0;
    private long L1;
    private final int M0;
    private e1 M1;
    private final boolean N0;
    private e1 N1;
    private final l O0;
    private int O1;
    private final l.a P0;
    private boolean P1;
    private final u8.a Q0;
    private int Q1;
    private final long R0;
    f R1;
    private final m S0;
    private u8.k S1;
    private final PriorityQueue<Long> T0;
    private long T1;
    private final boolean U0;
    private long U1;
    private e V0;
    private boolean V1;
    private boolean W0;
    private int W1;
    private boolean X0;
    private VideoSink Y0;
    private boolean Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f11199a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private List<Object> f11200b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private Surface f11201c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private u8.c f11202d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private e0 f11203e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private boolean f11204f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f11205g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private int f11206h1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private long f11207n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private int f11208o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f11209p1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f11210s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private a0 f11211t1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private boolean f11212v1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private long f11213x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f11214y1;

    class b implements VideoSink.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media3.exoplayer.mediacodec.h f11216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f11217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f11218c;

        b(androidx.media3.exoplayer.mediacodec.h hVar, int i11, long j11) {
            this.f11216a = hVar;
            this.f11217b = i11;
            this.f11218c = j11;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void a() {
            h.this.i3(this.f11216a, this.f11217b, this.f11218c);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void b(long j11) {
            h.this.V2(this.f11216a, this.f11217b, this.f11218c, j11);
        }
    }

    private static final class c {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i11 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i11 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f11220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11221b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.exoplayer.mediacodec.h.b f11223d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f11224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f11225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Handler f11226g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private o f11227h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f11228i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private VideoSink f11230k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f11231l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f11233n;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.media3.exoplayer.mediacodec.l f11222c = androidx.media3.exoplayer.mediacodec.l.f10571a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f11229j = 30.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f11232m = -9223372036854775807L;

        public d(Context context) {
            this.f11220a = context;
            this.f11223d = androidx.media3.exoplayer.mediacodec.h.b.b(context);
        }

        public h n() {
            s7.a.h(!this.f11221b);
            Handler handler = this.f11226g;
            s7.a.h((handler == null && this.f11227h == null) || !(handler == null || this.f11227h == null));
            this.f11221b = true;
            return new h(this);
        }

        public d o(boolean z11) {
            this.f11233n = z11;
            return this;
        }

        public d p(long j11) {
            this.f11232m = j11;
            return this;
        }

        public d q(boolean z11) {
            this.f11231l = z11;
            return this;
        }

        public d r(long j11) {
            this.f11224e = j11;
            return this;
        }

        public d s(androidx.media3.exoplayer.mediacodec.h.b bVar) {
            this.f11223d = bVar;
            return this;
        }

        public d t(boolean z11) {
            this.f11225f = z11;
            return this;
        }

        public d u(Handler handler) {
            this.f11226g = handler;
            return this;
        }

        public d v(o oVar) {
            this.f11227h = oVar;
            return this;
        }

        public d w(int i11) {
            this.f11228i = i11;
            return this;
        }

        public d x(androidx.media3.exoplayer.mediacodec.l lVar) {
            this.f11222c = lVar;
            return this;
        }
    }

    protected static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11235b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11236c;

        public e(int i11, int i12, int i13) {
            this.f11234a = i11;
            this.f11235b = i12;
            this.f11236c = i13;
        }
    }

    private final class f implements androidx.media3.exoplayer.mediacodec.h.d, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f11237a;

        public f(androidx.media3.exoplayer.mediacodec.h hVar) {
            Handler handlerD = q0.D(this);
            this.f11237a = handlerD;
            hVar.i(this, handlerD);
        }

        private void b(long j11) {
            h hVar = h.this;
            if (this != hVar.R1 || hVar.M0() == null) {
                return;
            }
            if (j11 == Long.MAX_VALUE) {
                h.this.S2();
                return;
            }
            try {
                h.this.R2(j11);
            } catch (ExoPlaybackException e11) {
                h.this.P1(e11);
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.d
        public void a(androidx.media3.exoplayer.mediacodec.h hVar, long j11, long j12) {
            if (Build.VERSION.SDK_INT >= 30) {
                b(j11);
            } else {
                this.f11237a.sendMessageAtFrontOfQueue(Message.obtain(this.f11237a, 0, (int) (j11 >> 32), (int) j11));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(q0.K1(message.arg1, message.arg2));
            return true;
        }
    }

    protected h(d dVar) {
        super(2, dVar.f11223d, dVar.f11222c, dVar.f11225f, dVar.f11229j);
        Context applicationContext = dVar.f11220a.getApplicationContext();
        this.J0 = applicationContext;
        this.M0 = dVar.f11228i;
        this.Y0 = dVar.f11230k;
        this.L0 = new o.a(dVar.f11226g, dVar.f11227h);
        this.K0 = this.Y0 == null;
        this.O0 = new l(applicationContext, this, dVar.f11224e);
        this.P0 = new l.a();
        this.N0 = r2();
        this.f11203e1 = e0.f110405c;
        this.f11205g1 = 1;
        this.f11206h1 = 0;
        this.M1 = e1.f101328e;
        this.Q1 = 0;
        this.N1 = null;
        this.O1 = -1000;
        this.T1 = -9223372036854775807L;
        this.U1 = -9223372036854775807L;
        this.Q0 = dVar.f11231l ? new u8.a() : null;
        this.T0 = new PriorityQueue<>();
        if (dVar.f11232m != -9223372036854775807L) {
            this.R0 = -dVar.f11232m;
            this.S0 = new m(1.0f);
        } else {
            this.R0 = -9223372036854775807L;
            this.S0 = null;
        }
        this.U0 = dVar.f11233n;
        this.f11211t1 = null;
    }

    private static int A2(int i11, int i12) {
        return (i11 * 3) / (i12 * 2);
    }

    private Surface C2(androidx.media3.exoplayer.mediacodec.j jVar) {
        VideoSink videoSink = this.Y0;
        if (videoSink != null) {
            return videoSink.m();
        }
        Surface surface = this.f11201c1;
        if (surface != null) {
            return surface;
        }
        if (g3(jVar)) {
            return null;
        }
        s7.a.h(h3(jVar));
        u8.c cVar = this.f11202d1;
        if (cVar != null && cVar.f115867a != jVar.f10561g) {
            U2();
        }
        if (this.f11202d1 == null) {
            this.f11202d1 = u8.c.c(this.J0, jVar.f10561g);
        }
        return this.f11202d1;
    }

    private boolean D2(androidx.media3.exoplayer.mediacodec.j jVar) {
        if (this.Y0 != null) {
            return true;
        }
        Surface surface = this.f11201c1;
        return (surface != null && surface.isValid()) || g3(jVar) || h3(jVar);
    }

    private boolean E2(DecoderInputBuffer decoderInputBuffer) {
        return decoderInputBuffer.f9288f < W();
    }

    private boolean F2(DecoderInputBuffer decoderInputBuffer) {
        if (h() || decoderInputBuffer.l() || this.U1 == -9223372036854775807L) {
            return true;
        }
        return this.U1 - (decoderInputBuffer.f9288f - X0()) <= 100000;
    }

    private void H2() {
        if (this.f11208o1 > 0) {
            long jElapsedRealtime = S().elapsedRealtime();
            this.L0.n(this.f11208o1, jElapsedRealtime - this.f11207n1);
            this.f11208o1 = 0;
            this.f11207n1 = jElapsedRealtime;
        }
    }

    private void I2() {
        if (!this.O0.g() || this.f11201c1 == null) {
            return;
        }
        Q2();
    }

    private void J2() {
        int i11 = this.f11214y1;
        if (i11 != 0) {
            this.L0.r(this.f11213x1, i11);
            this.f11213x1 = 0L;
            this.f11214y1 = 0;
        }
    }

    private void K2(e1 e1Var) {
        if (e1Var.equals(e1.f101328e) || e1Var.equals(this.N1)) {
            return;
        }
        this.N1 = e1Var;
        this.L0.t(e1Var);
    }

    private void L2() {
        Surface surface = this.f11201c1;
        if (surface == null || !this.f11204f1) {
            return;
        }
        this.L0.q(surface);
    }

    private void M2() {
        e1 e1Var = this.N1;
        if (e1Var != null) {
            this.L0.t(e1Var);
        }
    }

    private void N2(MediaFormat mediaFormat) {
        if (this.Y0 == null || q0.S0(this.J0)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void O2() {
        if (this.P1) {
            int i11 = Build.VERSION.SDK_INT;
            androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
            if (hVarM0 == null) {
                return;
            }
            this.R1 = new f(hVarM0);
            if (i11 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                hVarM0.setParameters(bundle);
            }
        }
    }

    private void P2(long j11, long j12, u uVar) {
        u8.k kVar = this.S1;
        if (kVar != null) {
            kVar.g(j11, j12, uVar, S0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresNonNull({"displaySurface"})
    public void Q2() {
        this.L0.q(this.f11201c1);
        this.f11204f1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2() {
        O1();
    }

    private void T2(androidx.media3.exoplayer.mediacodec.h hVar, int i11, long j11, u uVar) {
        h hVar2;
        long jG = this.P0.g();
        long jF = this.P0.f();
        if (f3() && jG == this.L1) {
            i3(hVar, i11, j11);
            hVar2 = this;
        } else {
            hVar2 = this;
            hVar2.P2(j11, jG, uVar);
            hVar2.W2(hVar, i11, j11, jG);
            jG = jG;
        }
        o3(jF);
        hVar2.L1 = jG;
    }

    private void U2() {
        u8.c cVar = this.f11202d1;
        if (cVar != null) {
            cVar.release();
            this.f11202d1 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V2(androidx.media3.exoplayer.mediacodec.h hVar, int i11, long j11, long j12) {
        W2(hVar, i11, j11, j12);
    }

    private static void X2(androidx.media3.exoplayer.mediacodec.h hVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        hVar.setParameters(bundle);
    }

    private void Y2(Object obj) throws ExoPlaybackException {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f11201c1 == surface) {
            if (surface != null) {
                M2();
                L2();
                return;
            }
            return;
        }
        this.f11201c1 = surface;
        if (this.Y0 == null) {
            this.O0.o(surface);
        }
        this.f11204f1 = false;
        int state = getState();
        androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
        if (hVarM0 != null && this.Y0 == null) {
            androidx.media3.exoplayer.mediacodec.j jVar = (androidx.media3.exoplayer.mediacodec.j) s7.a.f(O0());
            if (!D2(jVar) || this.W0) {
                E1();
                m1();
            } else {
                Z2(hVarM0, C2(jVar));
            }
        }
        if (surface != null) {
            M2();
        } else {
            this.N1 = null;
            VideoSink videoSink = this.Y0;
            if (videoSink != null) {
                videoSink.B();
            }
        }
        if (state == 2) {
            VideoSink videoSink2 = this.Y0;
            if (videoSink2 != null) {
                videoSink2.D(true);
            } else {
                this.O0.e(true);
            }
        }
        O2();
    }

    private void Z2(androidx.media3.exoplayer.mediacodec.h hVar, Surface surface) {
        int i11 = Build.VERSION.SDK_INT;
        if (surface != null) {
            a3(hVar, surface);
        } else {
            if (i11 < 35) {
                throw new IllegalStateException();
            }
            q2(hVar);
        }
    }

    private static int j3(Context context, androidx.media3.exoplayer.mediacodec.l lVar, u uVar) {
        boolean z11;
        int i11 = 0;
        if (!g0.t(uVar.f101544o)) {
            return m2.g(0);
        }
        boolean z12 = uVar.f101548s != null;
        List<androidx.media3.exoplayer.mediacodec.j> listY2 = y2(context, lVar, uVar, z12, false);
        if (z12 && listY2.isEmpty()) {
            listY2 = y2(context, lVar, uVar, false, false);
        }
        if (listY2.isEmpty()) {
            return m2.g(1);
        }
        if (!MediaCodecRenderer.a2(uVar)) {
            return m2.g(2);
        }
        androidx.media3.exoplayer.mediacodec.j jVar = listY2.get(0);
        boolean zP = jVar.p(uVar);
        if (!zP) {
            int i12 = 1;
            while (true) {
                if (i12 >= listY2.size()) {
                    z11 = true;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.j jVar2 = listY2.get(i12);
                if (jVar2.p(uVar)) {
                    z11 = false;
                    zP = true;
                    jVar = jVar2;
                    break;
                }
                i12++;
            }
        } else {
            z11 = true;
            break;
        }
        int i13 = zP ? 4 : 3;
        int i14 = jVar.s(uVar) ? 16 : 8;
        int i15 = jVar.f10562h ? 64 : 0;
        int i16 = z11 ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(uVar.f101544o) && !c.a(context)) {
            i16 = 256;
        }
        if (zP) {
            List<androidx.media3.exoplayer.mediacodec.j> listY3 = y2(context, lVar, uVar, z12, true);
            if (!listY3.isEmpty()) {
                androidx.media3.exoplayer.mediacodec.j jVar3 = MediaCodecUtil.n(listY3, uVar).get(0);
                if (jVar3.p(uVar) && jVar3.s(uVar)) {
                    i11 = 32;
                }
            }
        }
        return m2.u(i13, i14, i11, i15, i16);
    }

    private void k3() {
        androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
        if (hVarM0 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.O1));
            hVarM0.setParameters(bundle);
        }
    }

    private void m3(long j11) {
        int i11 = 0;
        while (true) {
            Long lPeek = this.T0.peek();
            if (lPeek == null || lPeek.longValue() >= j11) {
                break;
            }
            i11++;
            this.T0.poll();
        }
        l3(i11, 0);
    }

    private void n3(r.b bVar) {
        r0 r0VarA0 = a0();
        if (r0VarA0.u()) {
            this.U1 = -9223372036854775807L;
        } else {
            this.U1 = r0VarA0.l(((r.b) s7.a.f(bVar)).f11103a, new r0.b()).l();
        }
    }

    @RequiresNonNull({"videoSink"})
    private void o2() {
        this.Y0.u(new a(), w.b());
        u8.k kVar = this.S1;
        if (kVar != null) {
            this.Y0.p(kVar);
        }
        if (this.f11201c1 != null && !this.f11203e1.equals(e0.f110405c)) {
            this.Y0.w(this.f11201c1, this.f11203e1);
        }
        this.Y0.t(this.f11206h1);
        this.Y0.l(Z0());
        List<Object> list = this.f11200b1;
        if (list != null) {
            this.Y0.y(list);
        }
    }

    private static boolean r2() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean t2() {
        int i11 = Build.VERSION.SDK_INT;
        byte b11 = 7;
        if (i11 <= 28) {
            String str = Build.DEVICE;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i11 <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i11 <= 26) {
                    String str3 = Build.DEVICE;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b11 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b11 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b11 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b11 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b11 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b11 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b11 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b11 = -1;
                            }
                            break;
                        case -1936688066:
                            b11 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b11 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b11 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b11 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b11 = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b11 = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b11 = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b11 = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b11 = !str3.equals("vernee_M5") ? (byte) -1 : Tnaf.POW_2_WIDTH;
                            break;
                        case -1481772737:
                            b11 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b11 = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b11 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b11 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b11 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b11 = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b11 = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b11 = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b11 = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b11 = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b11 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b11 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b11 = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b11 = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b11 = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b11 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b11 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b11 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b11 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b11 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b11 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b11 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b11 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b11 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b11 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b11 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b11 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b11 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b11 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b11 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b11 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b11 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b11 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b11 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b11 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b11 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b11 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b11 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b11 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b11 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b11 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b11 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b11 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b11 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b11 = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b11 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b11 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b11 = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b11 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b11 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b11 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b11 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b11 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b11 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b11 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b11 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b11 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b11 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b11 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b11 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b11 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b11 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b11 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b11 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b11 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b11 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b11 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b11 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b11 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b11 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b11 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b11 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b11 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b11 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b11 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b11 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b11 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b11 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b11 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b11 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b11 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b11 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b11 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b11 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b11 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b11 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b11 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b11 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b11 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b11 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b11 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b11 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b11 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b11 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b11 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b11 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b11 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b11 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b11 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b11 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b11 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b11 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b11 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b11 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b11 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b11 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b11 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b11 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b11 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b11 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b11 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b11 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b11 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b11 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b11 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b11 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b11 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b11 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b11 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b11 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b11 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b11 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b11 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b11 = -1;
                            break;
                    }
                    switch (b11) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    public static int v2(androidx.media3.exoplayer.mediacodec.j jVar, u uVar) {
        int i11 = uVar.f101551v;
        int i12 = uVar.f101552w;
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        String str = (String) s7.a.f(uVar.f101544o);
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairI = MediaCodecUtil.i(uVar);
            if (pairI == null) {
                str = "video/hevc";
            } else {
                int iIntValue = ((Integer) pairI.first).intValue();
                if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                    str = "video/avc";
                } else if (iIntValue == 1024) {
                    str = "video/av01";
                } else {
                    str = "video/hevc";
                }
            }
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return A2(i11 * i12, 2);
            case "video/hevc":
                return Math.max(PKIFailureInfo.badSenderNonce, A2(i11 * i12, 2));
            case "video/avc":
                String str2 = Build.MODEL;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Build.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && jVar.f10561g)))) {
                    return -1;
                }
                return A2(q0.n(i11, 16) * q0.n(i12, 16) * 256, 2);
            case "video/x-vnd.on2.vp9":
                return A2(i11 * i12, 4);
            default:
                return -1;
        }
    }

    private static Point w2(androidx.media3.exoplayer.mediacodec.j jVar, u uVar) {
        int i11 = uVar.f101552w;
        int i12 = uVar.f101551v;
        boolean z11 = i11 > i12;
        int i13 = z11 ? i11 : i12;
        if (z11) {
            i11 = i12;
        }
        float f11 = i11 / i13;
        for (int i14 : X1) {
            int i15 = (int) (i14 * f11);
            if (i14 <= i13 || i15 <= i11) {
                break;
            }
            int i16 = z11 ? i15 : i14;
            if (!z11) {
                i14 = i15;
            }
            Point pointC = jVar.c(i16, i14);
            float f12 = uVar.f101555z;
            if (pointC != null && jVar.v(pointC.x, pointC.y, f12)) {
                return pointC;
            }
        }
        return null;
    }

    private static List<androidx.media3.exoplayer.mediacodec.j> y2(Context context, androidx.media3.exoplayer.mediacodec.l lVar, u uVar, boolean z11, boolean z12) {
        String str = uVar.f101544o;
        if (str == null) {
            return x.r();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            List<androidx.media3.exoplayer.mediacodec.j> listG = MediaCodecUtil.g(lVar, uVar, z11, z12);
            if (!listG.isEmpty()) {
                return listG;
            }
        }
        return MediaCodecUtil.m(lVar, uVar, z11, z12);
    }

    protected static int z2(androidx.media3.exoplayer.mediacodec.j jVar, u uVar) {
        if (uVar.f101545p == -1) {
            return v2(jVar, uVar);
        }
        int size = uVar.f101547r.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += uVar.f101547r.get(i11).length;
        }
        return uVar.f101545p + length;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean A1(long j11, long j12, androidx.media3.exoplayer.mediacodec.h hVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, u uVar) {
        s7.a.f(hVar);
        long jX0 = j13 - X0();
        m3(j13);
        VideoSink videoSink = this.Y0;
        if (videoSink != null) {
            if (!z11 || z12) {
                return videoSink.v(j13, new b(hVar, i11, jX0));
            }
            i3(hVar, i11, jX0);
            return true;
        }
        int iC = this.O0.c(j13, j11, j12, Y0(), z11, z12, this.P0);
        m mVar = this.S0;
        if (mVar != null && iC != 5 && iC != 4) {
            mVar.b(j13, this.P0.f());
        }
        if (iC == 0) {
            long jNanoTime = S().nanoTime();
            P2(jX0, jNanoTime, uVar);
            V2(hVar, i11, jX0, jNanoTime);
            o3(this.P0.f());
            return true;
        }
        if (iC == 1) {
            T2((androidx.media3.exoplayer.mediacodec.h) s7.a.j(hVar), i11, jX0, uVar);
            return true;
        }
        if (iC == 2) {
            s2(hVar, i11, jX0);
            o3(this.P0.f());
            return true;
        }
        if (iC == 3) {
            i3(hVar, i11, jX0);
            o3(this.P0.f());
            return true;
        }
        if (iC == 4 || iC == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iC));
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat B2(u uVar, String str, e eVar, float f11, boolean z11, int i11) {
        Pair<Integer, Integer> pairI;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(Snapshot.WIDTH, uVar.f101551v);
        mediaFormat.setInteger(Snapshot.HEIGHT, uVar.f101552w);
        s7.w.e(mediaFormat, uVar.f101547r);
        s7.w.c(mediaFormat, "frame-rate", uVar.f101555z);
        s7.w.d(mediaFormat, "rotation-degrees", uVar.A);
        s7.w.b(mediaFormat, uVar.E);
        if ("video/dolby-vision".equals(uVar.f101544o) && (pairI = MediaCodecUtil.i(uVar)) != null) {
            s7.w.d(mediaFormat, Scopes.PROFILE, ((Integer) pairI.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.f11234a);
        mediaFormat.setInteger("max-height", eVar.f11235b);
        s7.w.d(mediaFormat, "max-input-size", eVar.f11236c);
        int i12 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("operating-rate", f11);
        }
        if (z11) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i11 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i11);
        }
        if (i12 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.O1));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.video.l.b
    public boolean E(long j11, long j12) {
        return e3(j11, j12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void F1() {
        VideoSink videoSink = this.Y0;
        if (videoSink != null) {
            videoSink.o();
        }
    }

    protected boolean G2(long j11, boolean z11) throws ExoPlaybackException {
        int iP0 = p0(j11);
        if (iP0 == 0) {
            return false;
        }
        if (z11) {
            z7.b bVar = this.A0;
            int i11 = bVar.f127064d + iP0;
            bVar.f127064d = i11;
            bVar.f127066f += this.f11210s1;
            bVar.f127064d = i11 + this.T0.size();
        } else {
            this.A0.f127070j++;
            l3(iP0 + this.T0.size(), this.f11210s1);
        }
        J0();
        VideoSink videoSink = this.Y0;
        if (videoSink != null) {
            videoSink.C(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.video.l.b
    public boolean H(long j11, long j12, boolean z11) {
        return d3(j11, j12, z11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void H1() {
        super.H1();
        this.T0.clear();
        this.f11210s1 = 0;
        this.W1 = 0;
        this.f11212v1 = false;
        u8.a aVar = this.Q0;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // androidx.media3.exoplayer.l2
    public void K() {
        VideoSink videoSink = this.Y0;
        if (videoSink == null) {
            this.O0.a();
            return;
        }
        int i11 = this.f11199a1;
        if (i11 == 0 || i11 == 1) {
            this.f11199a1 = 0;
        } else {
            videoSink.q();
        }
    }

    @Override // androidx.media3.exoplayer.video.l.b
    public boolean L(long j11, long j12, long j13, boolean z11, boolean z12) {
        if (this.Y0 != null && this.K0) {
            j12 -= u2();
        }
        return c3(j11, j13, z11) && G2(j12, z12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int N0(DecoderInputBuffer decoderInputBuffer) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.U0 || (((a0Var = this.f11211t1) != null && a0Var.f127053h) || this.P1)) && E2(decoderInputBuffer) && !F2(decoderInputBuffer)) ? 32 : 0;
        }
        return 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean Q0() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float R0(float f11, u uVar, u[] uVarArr) {
        androidx.media3.exoplayer.mediacodec.j jVarO0;
        float fMax = -1.0f;
        for (u uVar2 : uVarArr) {
            float f12 = uVar2.f101555z;
            if (f12 != -1.0f) {
                fMax = Math.max(fMax, f12);
            }
        }
        float f13 = fMax == -1.0f ? -1.0f : fMax * f11;
        if (this.f11211t1 == null || (jVarO0 = O0()) == null) {
            return f13;
        }
        float fG = jVarO0.g(uVar.f101551v, uVar.f101552w);
        return f13 != -1.0f ? Math.max(f13, fG) : fG;
    }

    protected void R2(long j11) {
        e2(j11);
        K2(this.M1);
        this.A0.f127065e++;
        I2();
        v1(j11);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean S1(DecoderInputBuffer decoderInputBuffer) {
        boolean z11;
        ByteBuffer byteBuffer;
        boolean z12 = false;
        if (F2(decoderInputBuffer)) {
            return false;
        }
        boolean zE2 = E2(decoderInputBuffer);
        m mVar = this.S0;
        if (mVar != null) {
            long jC = mVar.c(decoderInputBuffer.f9288f);
            if (jC == -9223372036854775807L || jC >= this.R0) {
                z11 = false;
            } else {
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if ((!zE2 && !z11) || decoderInputBuffer.h()) {
            return false;
        }
        if (!decoderInputBuffer.m()) {
            if (this.Q0 != null && ((androidx.media3.exoplayer.mediacodec.j) s7.a.f(O0())).f10556b.equals("video/av01") && (byteBuffer = decoderInputBuffer.f9286d) != null) {
                boolean z13 = zE2 || this.W1 <= 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                byteBufferAsReadOnlyBuffer.flip();
                int iD = this.Q0.d(byteBufferAsReadOnlyBuffer, z13);
                if (iD == 0) {
                    decoderInputBuffer.f();
                } else if (iD != byteBufferAsReadOnlyBuffer.limit() && ((e) s7.a.f(this.V0)).f11236c + iD < byteBufferAsReadOnlyBuffer.capacity() && !decoderInputBuffer.r()) {
                    ((ByteBuffer) s7.a.f(decoderInputBuffer.f9286d)).position(iD);
                }
            }
            if (z12) {
                if (zE2) {
                    this.A0.f127064d++;
                    return z12;
                }
                this.T0.add(Long.valueOf(decoderInputBuffer.f9288f));
                this.W1++;
            }
            return z12;
        }
        decoderInputBuffer.f();
        z12 = true;
        if (z12) {
            if (zE2) {
                this.A0.f127064d++;
                return z12;
            }
            this.T0.add(Long.valueOf(decoderInputBuffer.f9288f));
            this.W1++;
        }
        return z12;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List<androidx.media3.exoplayer.mediacodec.j> T0(androidx.media3.exoplayer.mediacodec.l lVar, u uVar, boolean z11) {
        return MediaCodecUtil.n(y2(this.J0, lVar, uVar, z11, this.P1), uVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected final boolean T1() {
        u uVarP0 = P0();
        a0 a0Var = this.f11211t1;
        if (a0Var == null) {
            return super.T1();
        }
        if (!a0Var.f127051f || this.f11212v1 || this.P1) {
            return true;
        }
        return (uVarP0 != null && uVarP0.f101546q > 0) || d1() || V0() != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean U1(androidx.media3.exoplayer.mediacodec.j jVar) {
        return D2(jVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.mediacodec.h.a W0(androidx.media3.exoplayer.mediacodec.j jVar, u uVar, MediaCrypto mediaCrypto, float f11) {
        String str = jVar.f10557c;
        e eVarX2 = x2(jVar, uVar, Y());
        this.V0 = eVarX2;
        MediaFormat mediaFormatB2 = B2(uVar, str, eVarX2, f11, this.N0, this.P1 ? this.Q1 : 0);
        Surface surfaceC2 = C2(jVar);
        N2(mediaFormatB2);
        return androidx.media3.exoplayer.mediacodec.h.a.b(jVar, mediaFormatB2, uVar, surfaceC2, mediaCrypto);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected final boolean W1() {
        androidx.media3.exoplayer.mediacodec.j jVarO0 = O0();
        if (this.Y0 == null || jVarO0 == null || !(jVarO0.f10555a.equals("c2.mtk.avc.decoder") || jVarO0.f10555a.equals("c2.mtk.hevc.decoder"))) {
            return super.W1();
        }
        return true;
    }

    protected void W2(androidx.media3.exoplayer.mediacodec.h hVar, int i11, long j11, long j12) {
        j0.a("releaseOutputBuffer");
        hVar.c(i11, j12);
        j0.b();
        this.A0.f127065e++;
        this.f11209p1 = 0;
        if (this.Y0 == null) {
            K2(this.M1);
            I2();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int Z1(androidx.media3.exoplayer.mediacodec.l lVar, u uVar) {
        return j3(this.J0, lVar, uVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.l2
    public boolean a() {
        if (!super.a()) {
            return false;
        }
        VideoSink videoSink = this.Y0;
        return videoSink == null || videoSink.a();
    }

    protected void a3(androidx.media3.exoplayer.mediacodec.h hVar, Surface surface) {
        hVar.e(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    protected void b1(DecoderInputBuffer decoderInputBuffer) {
        if (this.X0) {
            ByteBuffer byteBuffer = (ByteBuffer) s7.a.f(decoderInputBuffer.f9289g);
            if (byteBuffer.remaining() >= 7) {
                byte b11 = byteBuffer.get();
                short s11 = byteBuffer.getShort();
                short s12 = byteBuffer.getShort();
                byte b12 = byteBuffer.get();
                byte b13 = byteBuffer.get();
                byteBuffer.position(0);
                if (b11 == -75 && s11 == 60 && s12 == 1 && b12 == 4) {
                    if (b13 == 0 || b13 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        X2((androidx.media3.exoplayer.mediacodec.h) s7.a.f(M0()), bArr);
                    }
                }
            }
        }
    }

    public void b3(List<Object> list) {
        if (list.equals(c1.f101230a)) {
            VideoSink videoSink = this.Y0;
            if (videoSink == null || !videoSink.isInitialized()) {
                return;
            }
            this.Y0.n();
            return;
        }
        this.f11200b1 = list;
        VideoSink videoSink2 = this.Y0;
        if (videoSink2 != null) {
            videoSink2.y(list);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void c0() {
        this.N1 = null;
        this.U1 = -9223372036854775807L;
        O2();
        this.f11204f1 = false;
        this.R1 = null;
        this.f11212v1 = true;
        try {
            super.c0();
        } finally {
            this.L0.m(this.A0);
            this.L0.t(e1.f101328e);
        }
    }

    protected boolean c3(long j11, long j12, boolean z11) {
        return j11 < -500000 && !z11;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.l2
    public void d(long j11, long j12) throws ExoPlaybackException {
        VideoSink videoSink = this.Y0;
        if (videoSink != null) {
            try {
                videoSink.d(j11, j12);
            } catch (VideoSink.VideoSinkException e11) {
                throw Q(e11, e11.f11181a, 7001);
            }
        }
        super.d(j11, j12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void d0(boolean z11, boolean z12) {
        super.d0(z11, z12);
        boolean z13 = T().f127119b;
        s7.a.h((z13 && this.Q1 == 0) ? false : true);
        if (this.P1 != z13) {
            this.P1 = z13;
            E1();
        }
        this.L0.o(this.A0);
        if (!this.Z0) {
            if (this.f11200b1 != null && this.Y0 == null) {
                i iVarP2 = p2(this.J0, this.O0);
                iVarP2.S(1);
                this.Y0 = iVarP2.F(0);
            }
            this.Z0 = true;
        }
        if (this.Y0 == null) {
            this.O0.m(S());
            this.O0.j(!z12 ? 1 : 0);
        } else {
            o2();
            this.f11199a1 = !z12 ? 1 : 0;
            G0();
        }
    }

    protected boolean d3(long j11, long j12, boolean z11) {
        return j11 < -30000 && !z11;
    }

    @Override // androidx.media3.exoplayer.h
    protected void e0() {
        super.e0();
    }

    protected boolean e3(long j11, long j12) {
        return j11 < -30000 && j12 > 100000;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void f0(long j11, boolean z11) throws ExoPlaybackException {
        VideoSink videoSink = this.Y0;
        if (videoSink != null && !z11) {
            videoSink.C(true);
        }
        super.f0(j11, z11);
        if (this.Y0 == null) {
            this.O0.k();
        }
        m mVar = this.S0;
        if (mVar != null) {
            mVar.d();
        }
        if (z11) {
            VideoSink videoSink2 = this.Y0;
            if (videoSink2 != null) {
                videoSink2.D(false);
            } else {
                this.O0.e(false);
            }
        }
        O2();
        this.f11209p1 = 0;
    }

    protected boolean f3() {
        return true;
    }

    @Override // androidx.media3.exoplayer.h
    protected void g0() {
        super.g0();
        VideoSink videoSink = this.Y0;
        if (videoSink == null || !this.K0) {
            return;
        }
        videoSink.release();
    }

    protected boolean g3(androidx.media3.exoplayer.mediacodec.j jVar) {
        return Build.VERSION.SDK_INT >= 35 && jVar.f10565k;
    }

    @Override // androidx.media3.exoplayer.l2, androidx.media3.exoplayer.m2
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    protected boolean h3(androidx.media3.exoplayer.mediacodec.j jVar) {
        if (this.P1 || n2(jVar.f10555a)) {
            return false;
        }
        return !jVar.f10561g || u8.c.b(this.J0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void i0() {
        try {
            super.i0();
        } finally {
            this.Z0 = false;
            this.T1 = -9223372036854775807L;
            U2();
        }
    }

    protected void i3(androidx.media3.exoplayer.mediacodec.h hVar, int i11, long j11) {
        j0.a("skipVideoBuffer");
        hVar.releaseOutputBuffer(i11, false);
        j0.b();
        this.A0.f127066f++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.l2
    public boolean isReady() {
        boolean zIsReady = super.isReady();
        VideoSink videoSink = this.Y0;
        if (videoSink != null) {
            return videoSink.z(zIsReady);
        }
        if (zIsReady && (M0() == null || this.P1)) {
            return true;
        }
        return this.O0.d(zIsReady);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void j0() {
        super.j0();
        this.f11208o1 = 0;
        this.f11207n1 = S().elapsedRealtime();
        this.f11213x1 = 0L;
        this.f11214y1 = 0;
        VideoSink videoSink = this.Y0;
        if (videoSink != null) {
            videoSink.s();
        } else {
            this.O0.h();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h, androidx.media3.exoplayer.j2.b
    public void k(int i11, Object obj) throws ExoPlaybackException {
        if (i11 == 1) {
            Y2(obj);
            return;
        }
        if (i11 == 7) {
            u8.k kVar = (u8.k) s7.a.f(obj);
            this.S1 = kVar;
            VideoSink videoSink = this.Y0;
            if (videoSink != null) {
                videoSink.p(kVar);
                return;
            }
            return;
        }
        if (i11 == 10) {
            int iIntValue = ((Integer) s7.a.f(obj)).intValue();
            if (this.Q1 != iIntValue) {
                this.Q1 = iIntValue;
                if (this.P1) {
                    E1();
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 4) {
            this.f11205g1 = ((Integer) s7.a.f(obj)).intValue();
            androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
            if (hVarM0 != null) {
                hVarM0.a(this.f11205g1);
                return;
            }
            return;
        }
        if (i11 == 5) {
            int iIntValue2 = ((Integer) s7.a.f(obj)).intValue();
            this.f11206h1 = iIntValue2;
            VideoSink videoSink2 = this.Y0;
            if (videoSink2 != null) {
                videoSink2.t(iIntValue2);
                return;
            } else {
                this.O0.l(iIntValue2);
                return;
            }
        }
        if (i11 == 13) {
            b3((List) s7.a.f(obj));
            return;
        }
        if (i11 == 14) {
            e0 e0Var = (e0) s7.a.f(obj);
            if (e0Var.b() == 0 || e0Var.a() == 0) {
                return;
            }
            this.f11203e1 = e0Var;
            VideoSink videoSink3 = this.Y0;
            if (videoSink3 != null) {
                videoSink3.w((Surface) s7.a.j(this.f11201c1), e0Var);
                return;
            }
            return;
        }
        switch (i11) {
            case 16:
                this.O1 = ((Integer) s7.a.f(obj)).intValue();
                k3();
                break;
            case 17:
                Surface surface = this.f11201c1;
                Y2(null);
                ((h) s7.a.f(obj)).k(1, surface);
                break;
            case 18:
                a0 a0Var = this.f11211t1;
                boolean z11 = a0Var != null && a0Var.f127049d;
                a0 a0Var2 = (a0) obj;
                this.f11211t1 = a0Var2;
                if (z11 != (a0Var2 != null && a0Var2.f127049d)) {
                    b2();
                }
                break;
            default:
                super.k(i11, obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void k0() {
        H2();
        J2();
        VideoSink videoSink = this.Y0;
        if (videoSink != null) {
            videoSink.r();
        } else {
            this.O0.i();
        }
        m mVar = this.S0;
        if (mVar != null) {
            mVar.d();
        }
        super.k0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void l0(u[] uVarArr, long j11, long j12, r.b bVar) {
        super.l0(uVarArr, j11, j12, bVar);
        n3(bVar);
        m mVar = this.S0;
        if (mVar != null) {
            mVar.d();
        }
    }

    protected void l3(int i11, int i12) {
        z7.b bVar = this.A0;
        bVar.f127068h += i11;
        int i13 = i11 + i12;
        bVar.f127067g += i13;
        this.f11208o1 += i13;
        int i14 = this.f11209p1 + i13;
        this.f11209p1 = i14;
        bVar.f127069i = Math.max(i14, bVar.f127069i);
        int i15 = this.M0;
        if (i15 <= 0 || this.f11208o1 < i15) {
            return;
        }
        H2();
    }

    protected void m2(VideoSink videoSink, int i11, u uVar, int i12) {
        List<Object> listR = this.f11200b1;
        if (listR == null) {
            listR = x.r();
        }
        videoSink.A(i11, uVar, Y0(), i12, listR);
    }

    protected boolean n2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            try {
                if (!Y1) {
                    Z1 = t2();
                    Y1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Z1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean o1(u uVar) throws ExoPlaybackException {
        VideoSink videoSink = this.Y0;
        if (videoSink == null || videoSink.isInitialized()) {
            return true;
        }
        try {
            return this.Y0.E(uVar);
        } catch (VideoSink.VideoSinkException e11) {
            throw Q(e11, uVar, 7000);
        }
    }

    protected void o3(long j11) {
        this.A0.a(j11);
        this.f11213x1 += j11;
        this.f11214y1++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void p1(Exception exc) {
        t.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.L0.s(exc);
    }

    protected i p2(Context context, l lVar) {
        return new i.b(context, lVar).h(true).g(S()).f();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void q1(String str, androidx.media3.exoplayer.mediacodec.h.a aVar, long j11, long j12) {
        this.L0.k(str, j11, j12);
        this.W0 = n2(str);
        this.X0 = ((androidx.media3.exoplayer.mediacodec.j) s7.a.f(O0())).q();
        O2();
    }

    protected void q2(androidx.media3.exoplayer.mediacodec.h hVar) {
        hVar.j();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void r1(String str) {
        this.L0.l(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected z7.c s1(z7.u uVar) throws ExoPlaybackException {
        z7.c cVarS1 = super.s1(uVar);
        this.L0.p((u) s7.a.f(uVar.f127112b), cVarS1);
        m mVar = this.S0;
        if (mVar != null) {
            mVar.d();
        }
        return cVarS1;
    }

    protected void s2(androidx.media3.exoplayer.mediacodec.h hVar, int i11, long j11) {
        j0.a("dropVideoBuffer");
        hVar.releaseOutputBuffer(i11, false);
        j0.b();
        l3(0, 1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected z7.c t0(androidx.media3.exoplayer.mediacodec.j jVar, u uVar, u uVar2) {
        z7.c cVarE = jVar.e(uVar, uVar2);
        int i11 = cVarE.f127084e;
        e eVar = (e) s7.a.f(this.V0);
        if (uVar2.f101551v > eVar.f11234a || uVar2.f101552w > eVar.f11235b) {
            i11 |= 256;
        }
        if (z2(jVar, uVar2) > eVar.f11236c) {
            i11 |= 64;
        }
        int i12 = i11;
        return new z7.c(jVar.f10555a, uVar, uVar2, i12 != 0 ? 0 : cVarE.f127083d, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void t1(u uVar, MediaFormat mediaFormat) {
        int integer;
        int i11;
        androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
        if (hVarM0 != null) {
            hVarM0.a(this.f11205g1);
        }
        if (this.P1) {
            i11 = uVar.f101551v;
            integer = uVar.f101552w;
        } else {
            s7.a.f(mediaFormat);
            boolean z11 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z11 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(Snapshot.WIDTH);
            integer = z11 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(Snapshot.HEIGHT);
            i11 = integer2;
        }
        float f11 = uVar.B;
        int i12 = uVar.A;
        if (i12 == 90 || i12 == 270) {
            f11 = 1.0f / f11;
            int i13 = integer;
            integer = i11;
            i11 = i13;
        }
        this.M1 = new e1(i11, integer, f11);
        VideoSink videoSink = this.Y0;
        if (videoSink == null || !this.V1) {
            this.O0.n(uVar.f101555z);
        } else {
            m2(videoSink, 1, uVar.b().F0(i11).h0(integer).u0(f11).P(), this.f11199a1);
            this.f11199a1 = 2;
        }
        this.V1 = false;
    }

    protected long u2() {
        return -this.T1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void v1(long j11) {
        super.v1(j11);
        if (this.P1) {
            return;
        }
        this.f11210s1--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void w1() {
        super.w1();
        VideoSink videoSink = this.Y0;
        if (videoSink != null) {
            videoSink.o();
            if (this.T1 == -9223372036854775807L) {
                this.T1 = Y0();
            }
            this.Y0.x(u2());
        } else {
            this.O0.j(2);
        }
        this.V1 = true;
        O2();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void x1(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (this.Q0 != null && ((androidx.media3.exoplayer.mediacodec.j) s7.a.f(O0())).f10556b.equals("video/av01") && (byteBuffer = decoderInputBuffer.f9286d) != null) {
            this.Q0.b(byteBuffer);
        }
        this.W1 = 0;
        int iN0 = N0(decoderInputBuffer);
        if ((Build.VERSION.SDK_INT < 34 || (iN0 & 32) == 0) && !this.P1) {
            this.f11210s1++;
        }
    }

    protected e x2(androidx.media3.exoplayer.mediacodec.j jVar, u uVar, u[] uVarArr) {
        int iV2;
        int iMax = uVar.f101551v;
        int iMax2 = uVar.f101552w;
        int iZ2 = z2(jVar, uVar);
        if (uVarArr.length == 1) {
            if (iZ2 != -1 && (iV2 = v2(jVar, uVar)) != -1) {
                iZ2 = Math.min((int) (iZ2 * 1.5f), iV2);
            }
            return new e(iMax, iMax2, iZ2);
        }
        int length = uVarArr.length;
        boolean z11 = false;
        for (int i11 = 0; i11 < length; i11++) {
            u uVarP = uVarArr[i11];
            if (uVar.E != null && uVarP.E == null) {
                uVarP = uVarP.b().V(uVar.E).P();
            }
            if (jVar.e(uVar, uVarP).f127083d != 0) {
                int i12 = uVarP.f101551v;
                z11 |= i12 == -1 || uVarP.f101552w == -1;
                iMax = Math.max(iMax, i12);
                iMax2 = Math.max(iMax2, uVarP.f101552w);
                iZ2 = Math.max(iZ2, z2(jVar, uVarP));
            }
        }
        if (z11) {
            t.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointW2 = w2(jVar, uVar);
            if (pointW2 != null) {
                iMax = Math.max(iMax, pointW2.x);
                iMax2 = Math.max(iMax2, pointW2.y);
                iZ2 = Math.max(iZ2, v2(jVar, uVar.b().F0(iMax).h0(iMax2).P()));
                t.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new e(iMax, iMax2, iZ2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.l2
    public void z(float f11, float f12) throws ExoPlaybackException {
        super.z(f11, f12);
        VideoSink videoSink = this.Y0;
        if (videoSink != null) {
            videoSink.l(f11);
        } else {
            this.O0.p(f11);
        }
        m mVar = this.S0;
        if (mVar != null) {
            mVar.e(f11);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException z0(Throwable th2, androidx.media3.exoplayer.mediacodec.j jVar) {
        return new MediaCodecVideoDecoderException(th2, jVar, this.f11201c1);
    }

    class a implements VideoSink.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void a() {
            l2.a aVarA1 = h.this.a1();
            if (aVarA1 != null) {
                aVarA1.b();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void c() {
            if (h.this.f11201c1 != null) {
                h.this.l3(0, 1);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void onFirstFrameRendered() {
            if (h.this.f11201c1 != null) {
                h.this.Q2();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void b(e1 e1Var) {
        }
    }
}
