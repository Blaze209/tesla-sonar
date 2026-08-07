package us;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.video.MediaCodecVideoDecoderException;
import com.google.android.gms.common.Scopes;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.math.ec.Tnaf;
import ts.g0;
import ts.i0;
import ts.n0;
import ts.p0;
import ts.q0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class g extends MediaCodecRenderer {
    private static boolean L1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int[] f116578x1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static boolean f116579y1;
    private final Context G0;
    private final m H0;
    private final x.a I0;
    private final d J0;
    private final long K0;
    private final int L0;
    private final boolean M0;
    private b N0;
    private boolean O0;
    private boolean P0;
    private Surface Q0;
    private h R0;
    private boolean S0;
    private int T0;
    private boolean U0;
    private boolean V0;
    private boolean W0;
    private long X0;
    private long Y0;
    private long Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f116580a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f116581b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f116582c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private long f116583d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private long f116584e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private long f116585f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private int f116586g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private long f116587h1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private z f116588n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private z f116589o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f116590p1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private int f116591s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    c f116592t1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private k f116593v1;

    private static final class a {
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

    protected static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f116594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f116595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f116596c;

        public b(int i11, int i12, int i13) {
            this.f116594a = i11;
            this.f116595b = i12;
            this.f116596c = i13;
        }
    }

    private final class c implements com.google.android.exoplayer2.mediacodec.j.c, Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f116597a;

        public c(com.google.android.exoplayer2.mediacodec.j jVar) {
            Handler handlerW = p0.w(this);
            this.f116597a = handlerW;
            jVar.h(this, handlerW);
        }

        private void b(long j11) {
            g gVar = g.this;
            if (this != gVar.f116592t1 || gVar.y0() == null) {
                return;
            }
            if (j11 == Long.MAX_VALUE) {
                g.this.p2();
                return;
            }
            try {
                g.this.o2(j11);
            } catch (ExoPlaybackException e11) {
                g.this.q1(e11);
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.j.c
        public void a(com.google.android.exoplayer2.mediacodec.j jVar, long j11, long j12) {
            if (p0.f115040a >= 30) {
                b(j11);
            } else {
                this.f116597a.sendMessageAtFrontOfQueue(Message.obtain(this.f116597a, 0, (int) (j11 >> 32), (int) j11));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(p0.X0(message.arg1, message.arg2));
            return true;
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m f116599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f116600b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f116603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private q0 f116604f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private CopyOnWriteArrayList<ts.l> f116605g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private u0 f116606h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Pair<Long, u0> f116607i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Pair<Surface, g0> f116608j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f116611m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f116612n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f116613o;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayDeque<Long> f116601c = new ArrayDeque<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ArrayDeque<Pair<Long, u0>> f116602d = new ArrayDeque<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f116609k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f116610l = true;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f116614p = -9223372036854775807L;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private z f116615q = z.f116707e;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private long f116616r = -9223372036854775807L;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private long f116617s = -9223372036854775807L;

        class a implements q0.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u0 f116618a;

            a(u0 u0Var) {
                this.f116618a = u0Var;
            }
        }

        private static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static Constructor<?> f116620a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f116621b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static Method f116622c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static Constructor<?> f116623d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static Method f116624e;

            public static ts.l a(float f11) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
                c();
                Object objNewInstance = f116620a.newInstance(null);
                f116621b.invoke(objNewInstance, Float.valueOf(f11));
                return (ts.l) ts.a.e(f116622c.invoke(objNewInstance, null));
            }

            public static q0.a b() throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
                c();
                return (q0.a) ts.a.e(f116624e.invoke(f116623d.newInstance(null), null));
            }

            @EnsuresNonNull({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
            private static void c() throws ClassNotFoundException {
                if (f116620a == null || f116621b == null || f116622c == null) {
                    Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
                    f116620a = cls.getConstructor(null);
                    f116621b = cls.getMethod("setRotationDegrees", Float.TYPE);
                    f116622c = cls.getMethod("build", null);
                }
                if (f116623d == null || f116624e == null) {
                    Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    f116623d = cls2.getConstructor(null);
                    f116624e = cls2.getMethod("build", null);
                }
            }
        }

        public d(m mVar, g gVar) {
            this.f116599a = mVar;
            this.f116600b = gVar;
        }

        private void k(long j11, boolean z11) {
            ts.a.i(this.f116604f);
            this.f116604f.a(j11);
            this.f116601c.remove();
            this.f116600b.f116584e1 = SystemClock.elapsedRealtime() * 1000;
            if (j11 != -2) {
                this.f116600b.i2();
            }
            if (z11) {
                this.f116613o = true;
            }
        }

        public MediaFormat a(MediaFormat mediaFormat) {
            if (p0.f115040a >= 29 && this.f116600b.G0.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            return mediaFormat;
        }

        public void b() {
            ((q0) ts.a.e(this.f116604f)).e(null);
            this.f116608j = null;
        }

        public void c() {
            ts.a.i(this.f116604f);
            this.f116604f.flush();
            this.f116601c.clear();
            this.f116603e.removeCallbacksAndMessages(null);
            if (this.f116611m) {
                this.f116611m = false;
                this.f116612n = false;
                this.f116613o = false;
            }
        }

        public long d(long j11, long j12) {
            ts.a.g(this.f116617s != -9223372036854775807L);
            return (j11 + j12) - this.f116617s;
        }

        public Surface e() {
            return ((q0) ts.a.e(this.f116604f)).m();
        }

        public boolean f() {
            return this.f116604f != null;
        }

        public boolean g() {
            Pair<Surface, g0> pair = this.f116608j;
            return pair == null || !((g0) pair.second).equals(g0.f114998c);
        }

        public boolean h(u0 u0Var, long j11) throws ExoPlaybackException {
            int i11;
            ts.a.g(!f());
            if (!this.f116610l) {
                return false;
            }
            if (this.f116605g == null) {
                this.f116610l = false;
                return false;
            }
            this.f116603e = p0.v();
            Pair<us.c, us.c> pairW1 = this.f116600b.W1(u0Var.f40724x);
            try {
                if (!g.Q1() && (i11 = u0Var.f40720t) != 0) {
                    this.f116605g.add(0, b.a(i11));
                }
                q0.a aVarB = b.b();
                Context context = this.f116600b.G0;
                List<ts.l> list = (List) ts.a.e(this.f116605g);
                ts.k kVar = ts.k.f115015a;
                us.c cVar = (us.c) pairW1.first;
                us.c cVar2 = (us.c) pairW1.second;
                Handler handler = this.f116603e;
                Objects.requireNonNull(handler);
                q0 q0VarA = aVarB.a(context, list, kVar, cVar, cVar2, false, new b8.t(handler), new a(u0Var));
                this.f116604f = q0VarA;
                q0VarA.b(1);
                this.f116617s = j11;
                Pair<Surface, g0> pair = this.f116608j;
                if (pair != null) {
                    g0 g0Var = (g0) pair.second;
                    this.f116604f.e(new i0((Surface) pair.first, g0Var.b(), g0Var.a()));
                }
                o(u0Var);
                return true;
            } catch (Exception e11) {
                throw this.f116600b.G(e11, u0Var, 7000);
            }
        }

        public boolean i(u0 u0Var, long j11, boolean z11) {
            ts.a.i(this.f116604f);
            ts.a.g(this.f116609k != -1);
            if (this.f116604f.f() >= this.f116609k) {
                return false;
            }
            this.f116604f.d();
            Pair<Long, u0> pair = this.f116607i;
            if (pair == null) {
                this.f116607i = Pair.create(Long.valueOf(j11), u0Var);
            } else if (!p0.c(u0Var, pair.second)) {
                this.f116602d.add(Pair.create(Long.valueOf(j11), u0Var));
            }
            if (z11) {
                this.f116611m = true;
                this.f116614p = j11;
            }
            return true;
        }

        public void j(String str) {
            this.f116609k = p0.X(this.f116600b.G0, str, false);
        }

        public void l(long j11, long j12) {
            ts.a.i(this.f116604f);
            while (!this.f116601c.isEmpty()) {
                boolean z11 = false;
                boolean z12 = this.f116600b.getState() == 2;
                long jLongValue = ((Long) ts.a.e(this.f116601c.peek())).longValue();
                long j13 = jLongValue + this.f116617s;
                long jN1 = this.f116600b.N1(j11, j12, SystemClock.elapsedRealtime() * 1000, j13, z12);
                if (this.f116612n && this.f116601c.size() == 1) {
                    z11 = true;
                }
                if (this.f116600b.A2(j11, jN1)) {
                    k(-1L, z11);
                    return;
                }
                if (!z12 || j11 == this.f116600b.X0 || jN1 > 50000) {
                    return;
                }
                this.f116599a.h(j13);
                long jB = this.f116599a.b(System.nanoTime() + (jN1 * 1000));
                if (this.f116600b.z2((jB - System.nanoTime()) / 1000, j12, z11)) {
                    k(-2L, z11);
                } else {
                    if (!this.f116602d.isEmpty() && j13 > ((Long) this.f116602d.peek().first).longValue()) {
                        this.f116607i = this.f116602d.remove();
                    }
                    this.f116600b.n2(jLongValue, jB, (u0) this.f116607i.second);
                    if (this.f116616r >= j13) {
                        this.f116616r = -9223372036854775807L;
                        this.f116600b.k2(this.f116615q);
                    }
                    k(jB, z11);
                }
            }
        }

        public boolean m() {
            return this.f116613o;
        }

        public void n() {
            ((q0) ts.a.e(this.f116604f)).release();
            this.f116604f = null;
            Handler handler = this.f116603e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            CopyOnWriteArrayList<ts.l> copyOnWriteArrayList = this.f116605g;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            this.f116601c.clear();
            this.f116610l = true;
        }

        public void o(u0 u0Var) {
            ((q0) ts.a.e(this.f116604f)).c(new ts.p.b(u0Var.f40717q, u0Var.f40718r).b(u0Var.f40721u).a());
            this.f116606h = u0Var;
            if (this.f116611m) {
                this.f116611m = false;
                this.f116612n = false;
                this.f116613o = false;
            }
        }

        public void p(Surface surface, g0 g0Var) {
            Pair<Surface, g0> pair = this.f116608j;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((g0) this.f116608j.second).equals(g0Var)) {
                return;
            }
            this.f116608j = Pair.create(surface, g0Var);
            if (f()) {
                ((q0) ts.a.e(this.f116604f)).e(new i0(surface, g0Var.b(), g0Var.a()));
            }
        }

        public void q(List<ts.l> list) {
            CopyOnWriteArrayList<ts.l> copyOnWriteArrayList = this.f116605g;
            if (copyOnWriteArrayList == null) {
                this.f116605g = new CopyOnWriteArrayList<>(list);
            } else {
                copyOnWriteArrayList.clear();
                this.f116605g.addAll(list);
            }
        }
    }

    public g(Context context, com.google.android.exoplayer2.mediacodec.j.b bVar, com.google.android.exoplayer2.mediacodec.l lVar, long j11, boolean z11, Handler handler, x xVar, int i11) {
        this(context, bVar, lVar, j11, z11, handler, xVar, i11, 30.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A2(long j11, long j12) {
        boolean z11 = getState() == 2;
        return this.Y0 == -9223372036854775807L && j11 >= F0() && ((this.W0 ? !this.U0 : !(!z11 && !this.V0)) || (z11 && B2(j12, (SystemClock.elapsedRealtime() * 1000) - this.f116584e1)));
    }

    private boolean C2(com.google.android.exoplayer2.mediacodec.k kVar) {
        if (p0.f115040a < 23 || this.f116590p1 || R1(kVar.f40253a)) {
            return false;
        }
        return !kVar.f40259g || h.b(this.G0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long N1(long j11, long j12, long j13, long j14, boolean z11) {
        long jG0 = (long) ((j14 - j11) / ((double) G0()));
        return z11 ? jG0 - (j13 - j12) : jG0;
    }

    private void O1() {
        com.google.android.exoplayer2.mediacodec.j jVarY0;
        this.U0 = false;
        if (p0.f115040a < 23 || !this.f116590p1 || (jVarY0 = y0()) == null) {
            return;
        }
        this.f116592t1 = new c(jVarY0);
    }

    private void P1() {
        this.f116589o1 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean Q1() {
        return p0.f115040a >= 21;
    }

    private static void S1(MediaFormat mediaFormat, int i11) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i11);
    }

    private static boolean T1() {
        return "NVIDIA".equals(p0.f115042c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean V1() {
        int i11 = p0.f115040a;
        byte b11 = 7;
        if (i11 <= 28) {
            String str = p0.f115041b;
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
        if (i11 <= 27 && "HWEML".equals(p0.f115041b)) {
            return true;
        }
        String str2 = p0.f115043d;
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
                    String str3 = p0.f115041b;
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

    public static int X1(com.google.android.exoplayer2.mediacodec.k kVar, u0 u0Var) {
        int iIntValue;
        int i11 = u0Var.f40717q;
        int i12 = u0Var.f40718r;
        if (i11 == -1 || i12 == -1) {
            return -1;
        }
        String str = u0Var.f40712l;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> pairR = MediaCodecUtil.r(u0Var);
            str = (pairR == null || !((iIntValue = ((Integer) pairR.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.getClass();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return c2(i11 * i12, 2);
            case "video/hevc":
                return Math.max(PKIFailureInfo.badSenderNonce, c2(i11 * i12, 2));
            case "video/avc":
                String str2 = p0.f115043d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(p0.f115042c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && kVar.f40259g)))) {
                    return -1;
                }
                return c2(p0.l(i11, 16) * p0.l(i12, 16) * 256, 2);
            case "video/x-vnd.on2.vp9":
                return c2(i11 * i12, 4);
            default:
                return -1;
        }
    }

    private static Point Y1(com.google.android.exoplayer2.mediacodec.k kVar, u0 u0Var) {
        int i11 = u0Var.f40718r;
        int i12 = u0Var.f40717q;
        boolean z11 = i11 > i12;
        int i13 = z11 ? i11 : i12;
        if (z11) {
            i11 = i12;
        }
        float f11 = i11 / i13;
        for (int i14 : f116578x1) {
            int i15 = (int) (i14 * f11);
            if (i14 <= i13 || i15 <= i11) {
                break;
            }
            if (p0.f115040a >= 21) {
                int i16 = z11 ? i15 : i14;
                if (!z11) {
                    i14 = i15;
                }
                Point pointC = kVar.c(i16, i14);
                if (kVar.w(pointC.x, pointC.y, u0Var.f40719s)) {
                    return pointC;
                }
            } else {
                try {
                    int iL = p0.l(i14, 16) * 16;
                    int iL2 = p0.l(i15, 16) * 16;
                    if (iL * iL2 <= MediaCodecUtil.L()) {
                        int i17 = z11 ? iL2 : iL;
                        if (!z11) {
                            iL = iL2;
                        }
                        return new Point(i17, iL);
                    }
                } catch (MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    private static List<com.google.android.exoplayer2.mediacodec.k> a2(Context context, com.google.android.exoplayer2.mediacodec.l lVar, u0 u0Var, boolean z11, boolean z12) {
        String str = u0Var.f40712l;
        if (str == null) {
            return com.google.common.collect.x.r();
        }
        if (p0.f115040a >= 26 && "video/dolby-vision".equals(str) && !a.a(context)) {
            List<com.google.android.exoplayer2.mediacodec.k> listN = MediaCodecUtil.n(lVar, u0Var, z11, z12);
            if (!listN.isEmpty()) {
                return listN;
            }
        }
        return MediaCodecUtil.v(lVar, u0Var, z11, z12);
    }

    protected static int b2(com.google.android.exoplayer2.mediacodec.k kVar, u0 u0Var) {
        if (u0Var.f40713m == -1) {
            return X1(kVar, u0Var);
        }
        int size = u0Var.f40714n.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += u0Var.f40714n.get(i11).length;
        }
        return u0Var.f40713m + length;
    }

    private static int c2(int i11, int i12) {
        return (i11 * 3) / (i12 * 2);
    }

    private static boolean e2(long j11) {
        return j11 < -30000;
    }

    private static boolean f2(long j11) {
        return j11 < -500000;
    }

    private void h2() {
        if (this.f116580a1 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.I0.n(this.f116580a1, jElapsedRealtime - this.Z0);
            this.f116580a1 = 0;
            this.Z0 = jElapsedRealtime;
        }
    }

    private void j2() {
        int i11 = this.f116586g1;
        if (i11 != 0) {
            this.I0.r(this.f116585f1, i11);
            this.f116585f1 = 0L;
            this.f116586g1 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k2(z zVar) {
        if (zVar.equals(z.f116707e) || zVar.equals(this.f116589o1)) {
            return;
        }
        this.f116589o1 = zVar;
        this.I0.t(zVar);
    }

    private void l2() {
        if (this.S0) {
            this.I0.q(this.Q0);
        }
    }

    private void m2() {
        z zVar = this.f116589o1;
        if (zVar != null) {
            this.I0.t(zVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n2(long j11, long j12, u0 u0Var) {
        k kVar = this.f116593v1;
        if (kVar != null) {
            kVar.g(j11, j12, u0Var, C0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p2() {
        p1();
    }

    private void q2() {
        Surface surface = this.Q0;
        h hVar = this.R0;
        if (surface == hVar) {
            this.Q0 = null;
        }
        hVar.release();
        this.R0 = null;
    }

    private void s2(com.google.android.exoplayer2.mediacodec.j jVar, u0 u0Var, int i11, long j11, boolean z11) {
        long j12;
        long jD = this.J0.f() ? this.J0.d(j11, F0()) * 1000 : System.nanoTime();
        if (z11) {
            j12 = j11;
            n2(j12, jD, u0Var);
        } else {
            j12 = j11;
        }
        if (p0.f115040a >= 21) {
            t2(jVar, i11, j12, jD);
        } else {
            r2(jVar, i11, j12);
        }
    }

    private static void u2(com.google.android.exoplayer2.mediacodec.j jVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        jVar.setParameters(bundle);
    }

    private void v2() {
        this.Y0 = this.K0 > 0 ? SystemClock.elapsedRealtime() + this.K0 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [us.m] */
    /* JADX WARN: Type inference failed for: r0v8, types: [us.g$d] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.exoplayer2.f, com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, us.g] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v8, types: [us.h] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void w2(Object obj) throws ExoPlaybackException {
        ?? C;
        Surface surface;
        if (obj instanceof Surface) {
            surface = (Surface) obj;
        } else {
            C = 0;
        }
        if (C == 0) {
            h hVar = this.R0;
            if (hVar != null) {
                C = surface;
                C = hVar;
            } else {
                com.google.android.exoplayer2.mediacodec.k kVarZ0 = z0();
                if (kVarZ0 != null && C2(kVarZ0)) {
                    C = surface;
                    C = h.c(this.G0, kVarZ0.f40259g);
                    this.R0 = C;
                }
            }
        }
        C = surface;
        C = surface;
        C = surface;
        if (this.Q0 == C) {
            if (C == 0 || C == this.R0) {
                return;
            }
            m2();
            l2();
            return;
        }
        this.Q0 = C;
        this.H0.m(C);
        this.S0 = false;
        int state = getState();
        com.google.android.exoplayer2.mediacodec.j jVarY0 = y0();
        if (jVarY0 != null && !this.J0.f()) {
            if (p0.f115040a < 23 || C == 0 || this.O0) {
                h1();
                Q0();
            } else {
                x2(jVarY0, C);
            }
        }
        if (C == 0 || C == this.R0) {
            P1();
            O1();
            if (this.J0.f()) {
                this.J0.b();
                return;
            }
            return;
        }
        m2();
        O1();
        if (state == 2) {
            v2();
        }
        if (this.J0.f()) {
            this.J0.p(C, g0.f114998c);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean A0() {
        return this.f116590p1 && p0.f115040a < 23;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float B0(float f11, u0 u0Var, u0[] u0VarArr) {
        float fMax = -1.0f;
        for (u0 u0Var2 : u0VarArr) {
            float f12 = u0Var2.f40719s;
            if (f12 != -1.0f) {
                fMax = Math.max(fMax, f12);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f11;
    }

    protected boolean B2(long j11, long j12) {
        return e2(j11) && j12 > 100000;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List<com.google.android.exoplayer2.mediacodec.k> D0(com.google.android.exoplayer2.mediacodec.l lVar, u0 u0Var, boolean z11) {
        return MediaCodecUtil.w(a2(this.G0, lVar, u0Var, z11, this.f116590p1), u0Var);
    }

    protected void D2(com.google.android.exoplayer2.mediacodec.j jVar, int i11, long j11) {
        n0.a("skipVideoBuffer");
        jVar.releaseOutputBuffer(i11, false);
        n0.c();
        this.B0.f66347f++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    protected com.google.android.exoplayer2.mediacodec.j.a E0(com.google.android.exoplayer2.mediacodec.k kVar, u0 u0Var, MediaCrypto mediaCrypto, float f11) {
        h hVar = this.R0;
        if (hVar != null && hVar.f116627a != kVar.f40259g) {
            q2();
        }
        String str = kVar.f40255c;
        b bVarZ1 = Z1(kVar, u0Var, M());
        this.N0 = bVarZ1;
        MediaFormat mediaFormatD2 = d2(u0Var, str, bVarZ1, f11, this.M0, this.f116590p1 ? this.f116591s1 : 0);
        if (this.Q0 == null) {
            if (!C2(kVar)) {
                throw new IllegalStateException();
            }
            if (this.R0 == null) {
                this.R0 = h.c(this.G0, kVar.f40259g);
            }
            this.Q0 = this.R0;
        }
        if (this.J0.f()) {
            mediaFormatD2 = this.J0.a(mediaFormatD2);
        }
        return com.google.android.exoplayer2.mediacodec.j.a.b(kVar, mediaFormatD2, u0Var, this.J0.f() ? this.J0.e() : this.Q0, mediaCrypto);
    }

    protected void E2(int i11, int i12) {
        fr.e eVar = this.B0;
        eVar.f66349h += i11;
        int i13 = i11 + i12;
        eVar.f66348g += i13;
        this.f116580a1 += i13;
        int i14 = this.f116581b1 + i13;
        this.f116581b1 = i14;
        eVar.f66350i = Math.max(i14, eVar.f66350i);
        int i15 = this.L0;
        if (i15 <= 0 || this.f116580a1 < i15) {
            return;
        }
        h2();
    }

    protected void F2(long j11) {
        this.B0.a(j11);
        this.f116585f1 += j11;
        this.f116586g1++;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    @TargetApi(29)
    protected void H0(DecoderInputBuffer decoderInputBuffer) {
        if (this.P0) {
            ByteBuffer byteBuffer = (ByteBuffer) ts.a.e(decoderInputBuffer.f39723f);
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
                        u2(y0(), bArr);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void O() {
        P1();
        O1();
        this.S0 = false;
        this.f116592t1 = null;
        try {
            super.O();
        } finally {
            this.I0.m(this.B0);
            this.I0.t(z.f116707e);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void P(boolean z11, boolean z12) {
        super.P(z11, z12);
        boolean z13 = I().f17930a;
        ts.a.g((z13 && this.f116591s1 == 0) ? false : true);
        if (this.f116590p1 != z13) {
            this.f116590p1 = z13;
            h1();
        }
        this.I0.o(this.B0);
        this.V0 = z12;
        this.W0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void Q(long j11, boolean z11) throws ExoPlaybackException {
        super.Q(j11, z11);
        if (this.J0.f()) {
            this.J0.c();
        }
        O1();
        this.H0.j();
        this.f116583d1 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.f116581b1 = 0;
        if (z11) {
            v2();
        } else {
            this.Y0 = -9223372036854775807L;
        }
    }

    protected boolean R1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (g.class) {
            try {
                if (!f116579y1) {
                    L1 = V1();
                    f116579y1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return L1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void S0(Exception exc) {
        ts.u.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.I0.s(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    @TargetApi(17)
    protected void T() {
        try {
            super.T();
        } finally {
            if (this.J0.f()) {
                this.J0.n();
            }
            if (this.R0 != null) {
                q2();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void T0(String str, com.google.android.exoplayer2.mediacodec.j.a aVar, long j11, long j12) {
        this.I0.k(str, j11, j12);
        this.O0 = R1(str);
        this.P0 = ((com.google.android.exoplayer2.mediacodec.k) ts.a.e(z0())).p();
        if (p0.f115040a >= 23 && this.f116590p1) {
            this.f116592t1 = new c((com.google.android.exoplayer2.mediacodec.j) ts.a.e(y0()));
        }
        this.J0.j(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void U() {
        super.U();
        this.f116580a1 = 0;
        this.Z0 = SystemClock.elapsedRealtime();
        this.f116584e1 = SystemClock.elapsedRealtime() * 1000;
        this.f116585f1 = 0L;
        this.f116586g1 = 0;
        this.H0.k();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void U0(String str) {
        this.I0.l(str);
    }

    protected void U1(com.google.android.exoplayer2.mediacodec.j jVar, int i11, long j11) {
        n0.a("dropVideoBuffer");
        jVar.releaseOutputBuffer(i11, false);
        n0.c();
        E2(0, 1);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void V() {
        this.Y0 = -9223372036854775807L;
        h2();
        j2();
        this.H0.l();
        super.V();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected fr.g V0(br.r rVar) throws ExoPlaybackException {
        fr.g gVarV0 = super.V0(rVar);
        this.I0.p(rVar.f17943b, gVarV0);
        return gVarV0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void W0(u0 u0Var, MediaFormat mediaFormat) {
        int integer;
        int i11;
        com.google.android.exoplayer2.mediacodec.j jVarY0 = y0();
        if (jVarY0 != null) {
            jVarY0.a(this.T0);
        }
        int i12 = 0;
        if (this.f116590p1) {
            i11 = u0Var.f40717q;
            integer = u0Var.f40718r;
        } else {
            ts.a.e(mediaFormat);
            boolean z11 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z11 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(Snapshot.WIDTH);
            integer = z11 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(Snapshot.HEIGHT);
            i11 = integer2;
        }
        float f11 = u0Var.f40721u;
        if (Q1()) {
            int i13 = u0Var.f40720t;
            if (i13 == 90 || i13 == 270) {
                f11 = 1.0f / f11;
                int i14 = integer;
                integer = i11;
                i11 = i14;
            }
        } else if (!this.J0.f()) {
            i12 = u0Var.f40720t;
        }
        this.f116588n1 = new z(i11, integer, i12, f11);
        this.H0.g(u0Var.f40719s);
        if (this.J0.f()) {
            this.J0.o(u0Var.b().n0(i11).S(integer).f0(i12).c0(f11).G());
        }
    }

    protected Pair<us.c, us.c> W1(us.c cVar) {
        if (us.c.f(cVar)) {
            return cVar.f116545c == 7 ? Pair.create(cVar, cVar.b().d(6).a()) : Pair.create(cVar, cVar);
        }
        us.c cVar2 = us.c.f116536f;
        return Pair.create(cVar2, cVar2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void Y0(long j11) {
        super.Y0(j11);
        if (this.f116590p1) {
            return;
        }
        this.f116582c1--;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void Z0() {
        super.Z0();
        O1();
    }

    protected b Z1(com.google.android.exoplayer2.mediacodec.k kVar, u0 u0Var, u0[] u0VarArr) {
        int iX1;
        int iMax = u0Var.f40717q;
        int iMax2 = u0Var.f40718r;
        int iB2 = b2(kVar, u0Var);
        if (u0VarArr.length == 1) {
            if (iB2 != -1 && (iX1 = X1(kVar, u0Var)) != -1) {
                iB2 = Math.min((int) (iB2 * 1.5f), iX1);
            }
            return new b(iMax, iMax2, iB2);
        }
        int length = u0VarArr.length;
        boolean z11 = false;
        for (int i11 = 0; i11 < length; i11++) {
            u0 u0VarG = u0VarArr[i11];
            if (u0Var.f40724x != null && u0VarG.f40724x == null) {
                u0VarG = u0VarG.b().L(u0Var.f40724x).G();
            }
            if (kVar.f(u0Var, u0VarG).f66359d != 0) {
                int i12 = u0VarG.f40717q;
                z11 |= i12 == -1 || u0VarG.f40718r == -1;
                iMax = Math.max(iMax, i12);
                iMax2 = Math.max(iMax2, u0VarG.f40718r);
                iB2 = Math.max(iB2, b2(kVar, u0VarG));
            }
        }
        if (z11) {
            ts.u.i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointY1 = Y1(kVar, u0Var);
            if (pointY1 != null) {
                iMax = Math.max(iMax, pointY1.x);
                iMax2 = Math.max(iMax2, pointY1.y);
                iB2 = Math.max(iB2, X1(kVar, u0Var.b().n0(iMax).S(iMax2).G()));
                ts.u.i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new b(iMax, iMax2, iB2);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public boolean a() {
        boolean zA = super.a();
        return this.J0.f() ? zA & this.J0.m() : zA;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void a1(DecoderInputBuffer decoderInputBuffer) {
        boolean z11 = this.f116590p1;
        if (!z11) {
            this.f116582c1++;
        }
        if (p0.f115040a >= 23 || !z11) {
            return;
        }
        o2(decoderInputBuffer.f39722e);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void b1(u0 u0Var) throws ExoPlaybackException {
        if (this.J0.f()) {
            return;
        }
        this.J0.h(u0Var, F0());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected fr.g c0(com.google.android.exoplayer2.mediacodec.k kVar, u0 u0Var, u0 u0Var2) {
        fr.g gVarF = kVar.f(u0Var, u0Var2);
        int i11 = gVarF.f66360e;
        int i12 = u0Var2.f40717q;
        b bVar = this.N0;
        if (i12 > bVar.f116594a || u0Var2.f40718r > bVar.f116595b) {
            i11 |= 256;
        }
        if (b2(kVar, u0Var2) > this.N0.f116596c) {
            i11 |= 64;
        }
        int i13 = i11;
        return new fr.g(kVar.f40253a, u0Var, u0Var2, i13 != 0 ? 0 : gVarF.f66359d, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public void d(long j11, long j12) throws ExoPlaybackException {
        super.d(j11, j12);
        if (this.J0.f()) {
            this.J0.l(j11, j12);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean d1(long j11, long j12, com.google.android.exoplayer2.mediacodec.j jVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, u0 u0Var) {
        long j14;
        boolean z13;
        ts.a.e(jVar);
        if (this.X0 == -9223372036854775807L) {
            this.X0 = j11;
        }
        if (j13 != this.f116583d1) {
            if (!this.J0.f()) {
                this.H0.h(j13);
            }
            this.f116583d1 = j13;
        }
        long jF0 = j13 - F0();
        if (z11 && !z12) {
            D2(jVar, i11, jF0);
            return true;
        }
        boolean z14 = getState() == 2;
        long jN1 = N1(j11, j12, SystemClock.elapsedRealtime() * 1000, j13, z14);
        if (this.Q0 == this.R0) {
            if (!e2(jN1)) {
                return false;
            }
            D2(jVar, i11, jF0);
            F2(jN1);
            return true;
        }
        if (A2(j11, jN1)) {
            if (!this.J0.f()) {
                z13 = true;
            } else {
                if (!this.J0.i(u0Var, jF0, z12)) {
                    return false;
                }
                z13 = false;
            }
            s2(jVar, u0Var, i11, jF0, z13);
            F2(jN1);
            return true;
        }
        if (z14 && j11 != this.X0) {
            long jNanoTime = System.nanoTime();
            long jB = this.H0.b((jN1 * 1000) + jNanoTime);
            if (!this.J0.f()) {
                jN1 = (jB - jNanoTime) / 1000;
            }
            boolean z15 = this.Y0 != -9223372036854775807L;
            long j15 = jN1;
            if (y2(j15, j12, z12) && g2(j11, z15)) {
                return false;
            }
            if (z2(j15, j12, z12)) {
                if (z15) {
                    D2(jVar, i11, jF0);
                } else {
                    U1(jVar, i11, jF0);
                }
                F2(j15);
                return true;
            }
            if (this.J0.f()) {
                this.J0.l(j11, j12);
                if (!this.J0.i(u0Var, jF0, z12)) {
                    return false;
                }
                s2(jVar, u0Var, i11, jF0, false);
                return true;
            }
            if (p0.f115040a >= 21) {
                if (j15 < 50000) {
                    if (jB == this.f116587h1) {
                        D2(jVar, i11, jF0);
                        j14 = jB;
                    } else {
                        n2(jF0, jB, u0Var);
                        t2(jVar, i11, jF0, jB);
                        j14 = jB;
                    }
                    F2(j15);
                    this.f116587h1 = j14;
                    return true;
                }
            } else if (j15 < 30000) {
                if (j15 > 11000) {
                    try {
                        Thread.sleep((j15 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                n2(jF0, jB, u0Var);
                r2(jVar, i11, jF0);
                F2(j15);
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    protected MediaFormat d2(u0 u0Var, String str, b bVar, float f11, boolean z11, int i11) {
        Pair<Integer, Integer> pairR;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(Snapshot.WIDTH, u0Var.f40717q);
        mediaFormat.setInteger(Snapshot.HEIGHT, u0Var.f40718r);
        ts.x.e(mediaFormat, u0Var.f40714n);
        ts.x.c(mediaFormat, "frame-rate", u0Var.f40719s);
        ts.x.d(mediaFormat, "rotation-degrees", u0Var.f40720t);
        ts.x.b(mediaFormat, u0Var.f40724x);
        if ("video/dolby-vision".equals(u0Var.f40712l) && (pairR = MediaCodecUtil.r(u0Var)) != null) {
            ts.x.d(mediaFormat, Scopes.PROFILE, ((Integer) pairR.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f116594a);
        mediaFormat.setInteger("max-height", bVar.f116595b);
        ts.x.d(mediaFormat, "max-input-size", bVar.f116596c);
        if (p0.f115040a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f11 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f11);
            }
        }
        if (z11) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i11 != 0) {
            S1(mediaFormat, i11);
        }
        return mediaFormat;
    }

    protected boolean g2(long j11, boolean z11) throws ExoPlaybackException {
        int iZ = Z(j11);
        if (iZ == 0) {
            return false;
        }
        if (z11) {
            fr.e eVar = this.B0;
            eVar.f66345d += iZ;
            eVar.f66347f += this.f116582c1;
        } else {
            this.B0.f66351j++;
            E2(iZ, this.f116582c1);
        }
        v0();
        if (this.J0.f()) {
            this.J0.c();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    void i2() {
        this.W0 = true;
        if (this.U0) {
            return;
        }
        this.U0 = true;
        this.I0.q(this.Q0);
        this.S0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public boolean isReady() {
        h hVar;
        if (super.isReady() && ((!this.J0.f() || this.J0.g()) && (this.U0 || (((hVar = this.R0) != null && this.Q0 == hVar) || y0() == null || this.f116590p1)))) {
            this.Y0 = -9223372036854775807L;
            return true;
        }
        if (this.Y0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Y0) {
            return true;
        }
        this.Y0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void j1() {
        super.j1();
        this.f116582c1 = 0;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.w1.b
    public void k(int i11, Object obj) throws ExoPlaybackException {
        Surface surface;
        if (i11 == 1) {
            w2(obj);
            return;
        }
        if (i11 == 7) {
            this.f116593v1 = (k) obj;
            return;
        }
        if (i11 == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.f116591s1 != iIntValue) {
                this.f116591s1 = iIntValue;
                if (this.f116590p1) {
                    h1();
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == 4) {
            this.T0 = ((Integer) obj).intValue();
            com.google.android.exoplayer2.mediacodec.j jVarY0 = y0();
            if (jVarY0 != null) {
                jVarY0.a(this.T0);
                return;
            }
            return;
        }
        if (i11 == 5) {
            this.H0.o(((Integer) obj).intValue());
            return;
        }
        if (i11 == 13) {
            this.J0.q((List) ts.a.e(obj));
            return;
        }
        if (i11 != 14) {
            super.k(i11, obj);
            return;
        }
        g0 g0Var = (g0) ts.a.e(obj);
        if (g0Var.b() == 0 || g0Var.a() == 0 || (surface = this.Q0) == null) {
            return;
        }
        this.J0.p(surface, g0Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected MediaCodecDecoderException m0(Throwable th2, com.google.android.exoplayer2.mediacodec.k kVar) {
        return new MediaCodecVideoDecoderException(th2, kVar, this.Q0);
    }

    protected void o2(long j11) {
        A1(j11);
        k2(this.f116588n1);
        this.B0.f66346e++;
        i2();
        Y0(j11);
    }

    protected void r2(com.google.android.exoplayer2.mediacodec.j jVar, int i11, long j11) {
        n0.a("releaseOutputBuffer");
        jVar.releaseOutputBuffer(i11, true);
        n0.c();
        this.B0.f66346e++;
        this.f116581b1 = 0;
        if (this.J0.f()) {
            return;
        }
        this.f116584e1 = SystemClock.elapsedRealtime() * 1000;
        k2(this.f116588n1);
        i2();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean t1(com.google.android.exoplayer2.mediacodec.k kVar) {
        return this.Q0 != null || C2(kVar);
    }

    protected void t2(com.google.android.exoplayer2.mediacodec.j jVar, int i11, long j11, long j12) {
        n0.a("releaseOutputBuffer");
        jVar.c(i11, j12);
        n0.c();
        this.B0.f66346e++;
        this.f116581b1 = 0;
        if (this.J0.f()) {
            return;
        }
        this.f116584e1 = SystemClock.elapsedRealtime() * 1000;
        k2(this.f116588n1);
        i2();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int w1(com.google.android.exoplayer2.mediacodec.l lVar, u0 u0Var) {
        boolean z11;
        int i11 = 0;
        if (!ts.y.o(u0Var.f40712l)) {
            return a2.g(0);
        }
        boolean z12 = u0Var.f40715o != null;
        List<com.google.android.exoplayer2.mediacodec.k> listA2 = a2(this.G0, lVar, u0Var, z12, false);
        if (z12 && listA2.isEmpty()) {
            listA2 = a2(this.G0, lVar, u0Var, false, false);
        }
        if (listA2.isEmpty()) {
            return a2.g(1);
        }
        if (!MediaCodecRenderer.x1(u0Var)) {
            return a2.g(2);
        }
        com.google.android.exoplayer2.mediacodec.k kVar = listA2.get(0);
        boolean zO = kVar.o(u0Var);
        if (!zO) {
            int i12 = 1;
            while (true) {
                if (i12 >= listA2.size()) {
                    z11 = true;
                    break;
                }
                com.google.android.exoplayer2.mediacodec.k kVar2 = listA2.get(i12);
                if (kVar2.o(u0Var)) {
                    z11 = false;
                    zO = true;
                    kVar = kVar2;
                    break;
                }
                i12++;
            }
        } else {
            z11 = true;
            break;
        }
        int i13 = zO ? 4 : 3;
        int i14 = kVar.r(u0Var) ? 16 : 8;
        int i15 = kVar.f40260h ? 64 : 0;
        int i16 = z11 ? 128 : 0;
        if (p0.f115040a >= 26 && "video/dolby-vision".equals(u0Var.f40712l) && !a.a(this.G0)) {
            i16 = 256;
        }
        if (zO) {
            List<com.google.android.exoplayer2.mediacodec.k> listA3 = a2(this.G0, lVar, u0Var, z12, true);
            if (!listA3.isEmpty()) {
                com.google.android.exoplayer2.mediacodec.k kVar3 = MediaCodecUtil.w(listA3, u0Var).get(0);
                if (kVar3.o(u0Var) && kVar3.r(u0Var)) {
                    i11 = 32;
                }
            }
        }
        return a2.u(i13, i14, i11, i15, i16);
    }

    protected void x2(com.google.android.exoplayer2.mediacodec.j jVar, Surface surface) {
        jVar.e(surface);
    }

    protected boolean y2(long j11, long j12, boolean z11) {
        return f2(j11) && !z11;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public void z(float f11, float f12) throws ExoPlaybackException {
        super.z(f11, f12);
        this.H0.i(f11);
    }

    protected boolean z2(long j11, long j12, boolean z11) {
        return e2(j11) && !z11;
    }

    public g(Context context, com.google.android.exoplayer2.mediacodec.j.b bVar, com.google.android.exoplayer2.mediacodec.l lVar, long j11, boolean z11, Handler handler, x xVar, int i11, float f11) {
        super(2, bVar, lVar, z11, f11);
        this.K0 = j11;
        this.L0 = i11;
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        m mVar = new m(applicationContext);
        this.H0 = mVar;
        this.I0 = new x.a(handler, xVar);
        this.J0 = new d(mVar, this);
        this.M0 = T1();
        this.Y0 = -9223372036854775807L;
        this.T0 = 1;
        this.f116588n1 = z.f116707e;
        this.f116591s1 = 0;
        P1();
    }
}
