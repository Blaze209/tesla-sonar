package com.google.android.exoplayer2.mediacodec;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import br.r;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.u0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import cr.q1;
import dr.u;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import ts.l0;
import ts.n0;
import ts.p0;
import ts.z;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class MediaCodecRenderer extends com.google.android.exoplayer2.f {
    private static final byte[] F0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final u A;
    private ExoPlaybackException A0;
    private u0 B;
    protected fr.e B0;
    private u0 C;
    private b C0;
    private DrmSession D;
    private long D0;
    private DrmSession E;
    private boolean E0;
    private MediaCrypto F;
    private boolean G;
    private long H;
    private float I;
    private float J;
    private j K;
    private u0 L;
    private MediaFormat M;
    private boolean N;
    private float O;
    private ArrayDeque<k> P;
    private DecoderInitializationException Q;
    private k R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f40139a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f40140b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f40141c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private g f40142d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private long f40143e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f40144f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f40145g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private ByteBuffer f40146h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f40147i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f40148j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f40149k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f40150l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f40151m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f40152n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f40153o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final j.b f40154p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f40155p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final l f40156q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f40157q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f40158r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f40159r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f40160s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f40161s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DecoderInputBuffer f40162t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f40163t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final DecoderInputBuffer f40164u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private long f40165u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final DecoderInputBuffer f40166v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f40167v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final f f40168w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f40169w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ArrayList<Long> f40170x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f40171x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final MediaCodec.BufferInfo f40172y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f40173y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ArrayDeque<b> f40174z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f40175z0;

    private static final class a {
        public static void a(j.a aVar, q1 q1Var) {
            LogSessionId logSessionIdA = q1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f40248b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f40181e = new b(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f40182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f40183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f40184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l0<u0> f40185d = new l0<>();

        public b(long j11, long j12, long j13) {
            this.f40182a = j11;
            this.f40183b = j12;
            this.f40184c = j13;
        }
    }

    public MediaCodecRenderer(int i11, j.b bVar, l lVar, boolean z11, float f11) {
        super(i11);
        this.f40154p = bVar;
        this.f40156q = (l) ts.a.e(lVar);
        this.f40158r = z11;
        this.f40160s = f11;
        this.f40162t = DecoderInputBuffer.t();
        this.f40164u = new DecoderInputBuffer(0);
        this.f40166v = new DecoderInputBuffer(2);
        f fVar = new f();
        this.f40168w = fVar;
        this.f40170x = new ArrayList<>();
        this.f40172y = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = -9223372036854775807L;
        this.f40174z = new ArrayDeque<>();
        o1(b.f40181e);
        fVar.q(0);
        fVar.f39720c.order(ByteOrder.nativeOrder());
        this.A = new u();
        this.O = -1.0f;
        this.S = 0;
        this.f40153o0 = 0;
        this.f40144f0 = -1;
        this.f40145g0 = -1;
        this.f40143e0 = -9223372036854775807L;
        this.f40165u0 = -9223372036854775807L;
        this.f40167v0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        this.f40155p0 = 0;
        this.f40157q0 = 0;
    }

    private boolean I0() {
        return this.f40145g0 >= 0;
    }

    private void J0(u0 u0Var) {
        n0();
        String str = u0Var.f40712l;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f40168w.B(32);
        } else {
            this.f40168w.B(1);
        }
        this.f40149k0 = true;
    }

    private void K0(k kVar, MediaCrypto mediaCrypto) {
        String str = kVar.f40253a;
        int i11 = p0.f115040a;
        float fB0 = i11 < 23 ? -1.0f : B0(this.J, this.B, M());
        float f11 = fB0 > this.f40160s ? fB0 : -1.0f;
        b1(this.B);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        j.a aVarE0 = E0(kVar, this.B, mediaCrypto, f11);
        if (i11 >= 31) {
            a.a(aVarE0, L());
        }
        try {
            n0.a("createCodec:" + str);
            this.K = this.f40154p.a(aVarE0);
            n0.c();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!kVar.o(this.B)) {
                ts.u.i("MediaCodecRenderer", p0.B("Format exceeds selected codec's capabilities [%s, %s]", u0.j(this.B), str));
            }
            this.R = kVar;
            this.O = f11;
            this.L = this.B;
            this.S = d0(str);
            this.T = e0(str, this.L);
            this.U = j0(str);
            this.V = l0(str);
            this.W = g0(str);
            this.X = h0(str);
            this.Y = f0(str);
            this.Z = k0(str, this.L);
            this.f40141c0 = i0(kVar) || A0();
            if (this.K.b()) {
                this.f40152n0 = true;
                this.f40153o0 = 1;
                this.f40139a0 = this.S != 0;
            }
            if ("c2.android.mp3.decoder".equals(kVar.f40253a)) {
                this.f40142d0 = new g();
            }
            if (getState() == 2) {
                this.f40143e0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.B0.f66342a++;
            T0(str, aVarE0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            n0.c();
            throw th2;
        }
    }

    private boolean M0(long j11) {
        int size = this.f40170x.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f40170x.get(i11).longValue() == j11) {
                this.f40170x.remove(i11);
                return true;
            }
        }
        return false;
    }

    private static boolean N0(IllegalStateException illegalStateException) {
        if (p0.f115040a >= 21 && O0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private static boolean O0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean P0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x004a A[SYNTHETIC] */
    private void R0(MediaCrypto mediaCrypto, boolean z11) throws DecoderInitializationException {
        DecoderInitializationException decoderInitializationException;
        DecoderInitializationException decoderInitializationException2;
        if (this.P == null) {
            try {
                List<k> listX0 = x0(z11);
                ArrayDeque<k> arrayDeque = new ArrayDeque<>();
                this.P = arrayDeque;
                if (this.f40158r) {
                    arrayDeque.addAll(listX0);
                } else if (!listX0.isEmpty()) {
                    this.P.add(listX0.get(0));
                }
                this.Q = null;
            } catch (MediaCodecUtil.DecoderQueryException e11) {
                throw new DecoderInitializationException(this.B, e11, z11, -49998);
            }
        }
        if (this.P.isEmpty()) {
            throw new DecoderInitializationException(this.B, (Throwable) null, z11, -49999);
        }
        k kVarPeekFirst = this.P.peekFirst();
        while (this.K == null) {
            k kVarPeekFirst2 = this.P.peekFirst();
            if (!t1(kVarPeekFirst2)) {
                return;
            }
            try {
                K0(kVarPeekFirst2, mediaCrypto);
            } catch (Exception e12) {
                if (kVarPeekFirst2 != kVarPeekFirst) {
                    throw e12;
                }
                try {
                    ts.u.i("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    K0(kVarPeekFirst2, mediaCrypto);
                } catch (Exception e13) {
                    ts.u.j("MediaCodecRenderer", "Failed to initialize decoder: " + kVarPeekFirst2, e13);
                    this.P.removeFirst();
                    decoderInitializationException = new DecoderInitializationException(this.B, e13, z11, kVarPeekFirst2);
                    S0(decoderInitializationException);
                    decoderInitializationException2 = this.Q;
                    if (decoderInitializationException2 == null) {
                        this.Q = decoderInitializationException;
                    } else {
                        this.Q = decoderInitializationException2.c(decoderInitializationException);
                    }
                    if (!this.P.isEmpty()) {
                        throw this.Q;
                    }
                }
                ts.u.j("MediaCodecRenderer", "Failed to initialize decoder: " + kVarPeekFirst2, e13);
                this.P.removeFirst();
                decoderInitializationException = new DecoderInitializationException(this.B, e13, z11, kVarPeekFirst2);
                S0(decoderInitializationException);
                decoderInitializationException2 = this.Q;
                if (decoderInitializationException2 == null) {
                    this.Q = decoderInitializationException;
                } else {
                    this.Q = decoderInitializationException2.c(decoderInitializationException);
                }
                if (!this.P.isEmpty()) {
                    throw this.Q;
                }
            }
        }
        this.P = null;
    }

    private void a0() throws ExoPlaybackException {
        String str;
        ts.a.g(!this.f40169w0);
        r rVarJ = J();
        this.f40166v.f();
        do {
            this.f40166v.f();
            int iX = X(rVarJ, this.f40166v, 0);
            if (iX == -5) {
                V0(rVarJ);
                return;
            }
            if (iX != -4) {
                if (iX != -3) {
                    throw new IllegalStateException();
                }
                return;
            }
            if (this.f40166v.k()) {
                this.f40169w0 = true;
                return;
            }
            if (this.f40173y0) {
                u0 u0Var = (u0) ts.a.e(this.B);
                this.C = u0Var;
                W0(u0Var, null);
                this.f40173y0 = false;
            }
            this.f40166v.r();
            u0 u0Var2 = this.B;
            if (u0Var2 != null && (str = u0Var2.f40712l) != null && str.equals("audio/opus")) {
                this.A.a(this.f40166v, this.B.f40714n);
            }
        } while (this.f40168w.v(this.f40166v));
        this.f40150l0 = true;
    }

    private boolean b0(long j11, long j12) throws ExoPlaybackException {
        boolean z11;
        ts.a.g(!this.f40171x0);
        if (this.f40168w.A()) {
            f fVar = this.f40168w;
            z11 = false;
            if (!d1(j11, j12, null, fVar.f39720c, this.f40145g0, 0, fVar.z(), this.f40168w.x(), this.f40168w.j(), this.f40168w.k(), this.C)) {
                return false;
            }
            Y0(this.f40168w.y());
            this.f40168w.f();
        } else {
            z11 = false;
        }
        if (this.f40169w0) {
            this.f40171x0 = true;
            return z11;
        }
        if (this.f40150l0) {
            ts.a.g(this.f40168w.v(this.f40166v));
            this.f40150l0 = z11;
        }
        if (this.f40151m0) {
            if (this.f40168w.A()) {
                return true;
            }
            n0();
            this.f40151m0 = z11;
            Q0();
            if (!this.f40149k0) {
                return z11;
            }
        }
        a0();
        if (this.f40168w.A()) {
            this.f40168w.r();
        }
        if (this.f40168w.A() || this.f40169w0 || this.f40151m0) {
            return true;
        }
        return z11;
    }

    @TargetApi(23)
    private void c1() throws ExoPlaybackException {
        int i11 = this.f40157q0;
        if (i11 == 1) {
            u0();
            return;
        }
        if (i11 == 2) {
            u0();
            z1();
        } else if (i11 == 3) {
            g1();
        } else {
            this.f40171x0 = true;
            i1();
        }
    }

    private int d0(String str) {
        int i11 = p0.f115040a;
        if (i11 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = p0.f115043d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i11 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = p0.f115041b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean e0(String str, u0 u0Var) {
        return p0.f115040a < 21 && u0Var.f40714n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private void e1() {
        this.f40163t0 = true;
        MediaFormat outputFormat = this.K.getOutputFormat();
        if (this.S != 0 && outputFormat.getInteger(Snapshot.WIDTH) == 32 && outputFormat.getInteger(Snapshot.HEIGHT) == 32) {
            this.f40140b0 = true;
            return;
        }
        if (this.Z) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.M = outputFormat;
        this.N = true;
    }

    private static boolean f0(String str) {
        if (p0.f115040a >= 21 || !"OMX.SEC.mp3.dec".equals(str) || !"samsung".equals(p0.f115042c)) {
            return false;
        }
        String str2 = p0.f115041b;
        return str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01");
    }

    private boolean f1(int i11) throws ExoPlaybackException {
        r rVarJ = J();
        this.f40162t.f();
        int iX = X(rVarJ, this.f40162t, i11 | 4);
        if (iX == -5) {
            V0(rVarJ);
            return true;
        }
        if (iX != -4 || !this.f40162t.k()) {
            return false;
        }
        this.f40169w0 = true;
        c1();
        return false;
    }

    private static boolean g0(String str) {
        int i11 = p0.f115040a;
        if (i11 <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i11 > 19) {
            return false;
        }
        String str2 = p0.f115041b;
        if ("hb2000".equals(str2) || "stvm8".equals(str2)) {
            return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
        }
        return false;
    }

    private void g1() throws ExoPlaybackException {
        h1();
        Q0();
    }

    private static boolean h0(String str) {
        return p0.f115040a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean i0(k kVar) {
        String str = kVar.f40253a;
        int i11 = p0.f115040a;
        if (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i11 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) {
            return true;
        }
        if (i11 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(p0.f115042c) && "AFTS".equals(p0.f115043d) && kVar.f40259g;
        }
        return true;
    }

    private static boolean j0(String str) {
        int i11 = p0.f115040a;
        if (i11 < 18) {
            return true;
        }
        if (i11 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i11 == 19 && p0.f115043d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    private static boolean k0(String str, u0 u0Var) {
        return p0.f115040a <= 18 && u0Var.f40725y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    private static boolean l0(String str) {
        return p0.f115040a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void l1() {
        this.f40144f0 = -1;
        this.f40164u.f39720c = null;
    }

    private void m1() {
        this.f40145g0 = -1;
        this.f40146h0 = null;
    }

    private void n0() {
        this.f40151m0 = false;
        this.f40168w.f();
        this.f40166v.f();
        this.f40150l0 = false;
        this.f40149k0 = false;
        this.A.d();
    }

    private void n1(DrmSession drmSession) {
        DrmSession.h(this.D, drmSession);
        this.D = drmSession;
    }

    private boolean o0() {
        if (this.f40159r0) {
            this.f40155p0 = 1;
            if (this.U || this.W) {
                this.f40157q0 = 3;
                return false;
            }
            this.f40157q0 = 1;
        }
        return true;
    }

    private void o1(b bVar) {
        this.C0 = bVar;
        long j11 = bVar.f40184c;
        if (j11 != -9223372036854775807L) {
            this.E0 = true;
            X0(j11);
        }
    }

    private void p0() throws ExoPlaybackException {
        if (!this.f40159r0) {
            g1();
        } else {
            this.f40155p0 = 1;
            this.f40157q0 = 3;
        }
    }

    @TargetApi(23)
    private boolean q0() throws ExoPlaybackException {
        if (this.f40159r0) {
            this.f40155p0 = 1;
            if (this.U || this.W) {
                this.f40157q0 = 3;
                return false;
            }
            this.f40157q0 = 2;
        } else {
            z1();
        }
        return true;
    }

    private boolean r0(long j11, long j12) throws ExoPlaybackException {
        boolean z11;
        boolean zD1;
        int iD;
        if (!I0()) {
            if (this.X && this.f40161s0) {
                try {
                    iD = this.K.d(this.f40172y);
                } catch (IllegalStateException unused) {
                    c1();
                    if (this.f40171x0) {
                        h1();
                    }
                    return false;
                }
            } else {
                iD = this.K.d(this.f40172y);
            }
            if (iD < 0) {
                if (iD == -2) {
                    e1();
                    return true;
                }
                if (this.f40141c0 && (this.f40169w0 || this.f40155p0 == 2)) {
                    c1();
                }
                return false;
            }
            if (this.f40140b0) {
                this.f40140b0 = false;
                this.K.releaseOutputBuffer(iD, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f40172y;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                c1();
                return false;
            }
            this.f40145g0 = iD;
            ByteBuffer outputBuffer = this.K.getOutputBuffer(iD);
            this.f40146h0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.f40172y.offset);
                ByteBuffer byteBuffer = this.f40146h0;
                MediaCodec.BufferInfo bufferInfo2 = this.f40172y;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo3 = this.f40172y;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j13 = this.f40165u0;
                    if (j13 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j13;
                    }
                }
            }
            this.f40147i0 = M0(this.f40172y.presentationTimeUs);
            long j14 = this.f40167v0;
            long j15 = this.f40172y.presentationTimeUs;
            this.f40148j0 = j14 == j15;
            A1(j15);
        }
        if (this.X && this.f40161s0) {
            try {
                j jVar = this.K;
                ByteBuffer byteBuffer2 = this.f40146h0;
                int i11 = this.f40145g0;
                MediaCodec.BufferInfo bufferInfo4 = this.f40172y;
                z11 = false;
                try {
                    zD1 = d1(j11, j12, jVar, byteBuffer2, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f40147i0, this.f40148j0, this.C);
                } catch (IllegalStateException unused2) {
                    c1();
                    if (this.f40171x0) {
                        h1();
                    }
                    return z11;
                }
            } catch (IllegalStateException unused3) {
                z11 = false;
            }
        } else {
            z11 = false;
            j jVar2 = this.K;
            ByteBuffer byteBuffer3 = this.f40146h0;
            int i12 = this.f40145g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f40172y;
            zD1 = d1(j11, j12, jVar2, byteBuffer3, i12, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f40147i0, this.f40148j0, this.C);
        }
        if (zD1) {
            Y0(this.f40172y.presentationTimeUs);
            boolean z12 = (this.f40172y.flags & 4) != 0 ? true : z11;
            m1();
            if (!z12) {
                return true;
            }
            c1();
        }
        return z11;
    }

    private void r1(DrmSession drmSession) {
        DrmSession.h(this.E, drmSession);
        this.E = drmSession;
    }

    private boolean s0(k kVar, u0 u0Var, DrmSession drmSession, DrmSession drmSession2) {
        fr.b bVarC;
        fr.b bVarC2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (bVarC = drmSession2.c()) != null && (bVarC2 = drmSession.c()) != null && bVarC.getClass().equals(bVarC2.getClass())) {
            if (!(bVarC instanceof gr.l)) {
                return false;
            }
            gr.l lVar = (gr.l) bVarC;
            if (!drmSession2.e().equals(drmSession.e()) || p0.f115040a < 23) {
                return true;
            }
            UUID uuid = br.d.f17906e;
            if (!uuid.equals(drmSession.e()) && !uuid.equals(drmSession2.e())) {
                return !kVar.f40259g && (lVar.f69370c ? false : drmSession2.f(u0Var.f40712l));
            }
        }
        return true;
    }

    private boolean s1(long j11) {
        return this.H == -9223372036854775807L || SystemClock.elapsedRealtime() - j11 < this.H;
    }

    private boolean t0() throws ExoPlaybackException {
        int i11;
        if (this.K == null || (i11 = this.f40155p0) == 2 || this.f40169w0) {
            return false;
        }
        if (i11 == 0 && u1()) {
            p0();
        }
        if (this.f40144f0 < 0) {
            int iF = this.K.f();
            this.f40144f0 = iF;
            if (iF < 0) {
                return false;
            }
            this.f40164u.f39720c = this.K.getInputBuffer(iF);
            this.f40164u.f();
        }
        if (this.f40155p0 == 1) {
            if (!this.f40141c0) {
                this.f40161s0 = true;
                this.K.queueInputBuffer(this.f40144f0, 0, 0, 0L, 4);
                l1();
            }
            this.f40155p0 = 2;
            return false;
        }
        if (this.f40139a0) {
            this.f40139a0 = false;
            ByteBuffer byteBuffer = this.f40164u.f39720c;
            byte[] bArr = F0;
            byteBuffer.put(bArr);
            this.K.queueInputBuffer(this.f40144f0, 0, bArr.length, 0L, 0);
            l1();
            this.f40159r0 = true;
            return true;
        }
        if (this.f40153o0 == 1) {
            for (int i12 = 0; i12 < this.L.f40714n.size(); i12++) {
                this.f40164u.f39720c.put(this.L.f40714n.get(i12));
            }
            this.f40153o0 = 2;
        }
        int iPosition = this.f40164u.f39720c.position();
        r rVarJ = J();
        try {
            int iX = X(rVarJ, this.f40164u, 0);
            if (h() || this.f40164u.n()) {
                this.f40167v0 = this.f40165u0;
            }
            if (iX == -3) {
                return false;
            }
            if (iX == -5) {
                if (this.f40153o0 == 2) {
                    this.f40164u.f();
                    this.f40153o0 = 1;
                }
                V0(rVarJ);
                return true;
            }
            if (this.f40164u.k()) {
                if (this.f40153o0 == 2) {
                    this.f40164u.f();
                    this.f40153o0 = 1;
                }
                this.f40169w0 = true;
                if (!this.f40159r0) {
                    c1();
                    return false;
                }
                try {
                    if (!this.f40141c0) {
                        this.f40161s0 = true;
                        this.K.queueInputBuffer(this.f40144f0, 0, 0, 0L, 4);
                        l1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e11) {
                    throw G(e11, this.B, p0.S(e11.getErrorCode()));
                }
            }
            if (!this.f40159r0 && !this.f40164u.m()) {
                this.f40164u.f();
                if (this.f40153o0 == 2) {
                    this.f40153o0 = 1;
                }
                return true;
            }
            boolean zS = this.f40164u.s();
            if (zS) {
                this.f40164u.f39719b.b(iPosition);
            }
            if (this.T && !zS) {
                z.b(this.f40164u.f39720c);
                if (this.f40164u.f39720c.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            DecoderInputBuffer decoderInputBuffer = this.f40164u;
            long jD = decoderInputBuffer.f39722e;
            g gVar = this.f40142d0;
            if (gVar != null) {
                jD = gVar.d(this.B, decoderInputBuffer);
                this.f40165u0 = Math.max(this.f40165u0, this.f40142d0.b(this.B));
            }
            long j11 = jD;
            if (this.f40164u.j()) {
                this.f40170x.add(Long.valueOf(j11));
            }
            if (this.f40173y0) {
                if (this.f40174z.isEmpty()) {
                    this.C0.f40185d.a(j11, this.B);
                } else {
                    this.f40174z.peekLast().f40185d.a(j11, this.B);
                }
                this.f40173y0 = false;
            }
            this.f40165u0 = Math.max(this.f40165u0, j11);
            this.f40164u.r();
            if (this.f40164u.i()) {
                H0(this.f40164u);
            }
            a1(this.f40164u);
            try {
                if (zS) {
                    this.K.g(this.f40144f0, 0, this.f40164u.f39719b, j11, 0);
                } else {
                    this.K.queueInputBuffer(this.f40144f0, 0, this.f40164u.f39720c.limit(), j11, 0);
                }
                l1();
                this.f40159r0 = true;
                this.f40153o0 = 0;
                this.B0.f66344c++;
                return true;
            } catch (MediaCodec.CryptoException e12) {
                throw G(e12, this.B, p0.S(e12.getErrorCode()));
            }
        } catch (DecoderInputBuffer.InsufficientCapacityException e13) {
            S0(e13);
            f1(0);
            u0();
            return true;
        }
    }

    private void u0() {
        try {
            this.K.flush();
        } finally {
            j1();
        }
    }

    private List<k> x0(boolean z11) {
        List<k> listD0 = D0(this.f40156q, this.B, z11);
        if (!listD0.isEmpty() || !z11) {
            return listD0;
        }
        List<k> listD1 = D0(this.f40156q, this.B, false);
        if (!listD1.isEmpty()) {
            ts.u.i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f40712l + ", but no secure decoder available. Trying to proceed with " + listD1 + ".");
        }
        return listD1;
    }

    protected static boolean x1(u0 u0Var) {
        int i11 = u0Var.G;
        return i11 == 0 || i11 == 2;
    }

    private boolean y1(u0 u0Var) throws ExoPlaybackException {
        if (p0.f115040a >= 23 && this.K != null && this.f40157q0 != 3 && getState() != 0) {
            float fB0 = B0(this.J, u0Var, M());
            float f11 = this.O;
            if (f11 == fB0) {
                return true;
            }
            if (fB0 == -1.0f) {
                p0();
                return false;
            }
            if (f11 == -1.0f && fB0 <= this.f40160s) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fB0);
            this.K.setParameters(bundle);
            this.O = fB0;
        }
        return true;
    }

    private void z1() throws ExoPlaybackException {
        fr.b bVarC = this.E.c();
        if (bVarC instanceof gr.l) {
            try {
                this.F.setMediaDrmSession(((gr.l) bVarC).f69369b);
            } catch (MediaCryptoException e11) {
                throw G(e11, this.B, 6006);
            }
        }
        n1(this.E);
        this.f40155p0 = 0;
        this.f40157q0 = 0;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.a2
    public final int A() {
        return 8;
    }

    protected boolean A0() {
        return false;
    }

    protected final void A1(long j11) {
        u0 u0VarJ = this.C0.f40185d.j(j11);
        if (u0VarJ == null && this.E0 && this.M != null) {
            u0VarJ = this.C0.f40185d.i();
        }
        if (u0VarJ != null) {
            this.C = u0VarJ;
        } else if (!this.N || this.C == null) {
            return;
        }
        W0(this.C, this.M);
        this.N = false;
        this.E0 = false;
    }

    protected abstract float B0(float f11, u0 u0Var, u0[] u0VarArr);

    protected final MediaFormat C0() {
        return this.M;
    }

    protected abstract List<k> D0(l lVar, u0 u0Var, boolean z11);

    protected abstract j.a E0(k kVar, u0 u0Var, MediaCrypto mediaCrypto, float f11);

    protected final long F0() {
        return this.C0.f40184c;
    }

    protected float G0() {
        return this.I;
    }

    protected void H0(DecoderInputBuffer decoderInputBuffer) {
    }

    protected final boolean L0(u0 u0Var) {
        return this.E == null && v1(u0Var);
    }

    @Override // com.google.android.exoplayer2.f
    protected void O() {
        this.B = null;
        o1(b.f40181e);
        this.f40174z.clear();
        w0();
    }

    @Override // com.google.android.exoplayer2.f
    protected void P(boolean z11, boolean z12) {
        this.B0 = new fr.e();
    }

    @Override // com.google.android.exoplayer2.f
    protected void Q(long j11, boolean z11) throws ExoPlaybackException {
        this.f40169w0 = false;
        this.f40171x0 = false;
        this.f40175z0 = false;
        if (this.f40149k0) {
            this.f40168w.f();
            this.f40166v.f();
            this.f40150l0 = false;
            this.A.d();
        } else {
            v0();
        }
        if (this.C0.f40185d.l() > 0) {
            this.f40173y0 = true;
        }
        this.C0.f40185d.c();
        this.f40174z.clear();
    }

    protected final void Q0() throws ExoPlaybackException {
        u0 u0Var;
        if (this.K != null || this.f40149k0 || (u0Var = this.B) == null) {
            return;
        }
        if (L0(u0Var)) {
            J0(this.B);
            return;
        }
        n1(this.E);
        String str = this.B.f40712l;
        DrmSession drmSession = this.D;
        if (drmSession != null) {
            fr.b bVarC = drmSession.c();
            if (this.F == null) {
                if (bVarC == null) {
                    if (this.D.a() == null) {
                        return;
                    }
                } else if (bVarC instanceof gr.l) {
                    gr.l lVar = (gr.l) bVarC;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(lVar.f69368a, lVar.f69369b);
                        this.F = mediaCrypto;
                        this.G = !lVar.f69370c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e11) {
                        throw G(e11, this.B, 6006);
                    }
                }
            }
            if (gr.l.f69367d && (bVarC instanceof gr.l)) {
                int state = this.D.getState();
                if (state == 1) {
                    DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) ts.a.e(this.D.a());
                    throw G(drmSessionException, this.B, drmSessionException.f39803a);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            R0(this.F, this.G);
        } catch (DecoderInitializationException e12) {
            throw G(e12, this.B, 4001);
        }
    }

    protected abstract void S0(Exception exc);

    @Override // com.google.android.exoplayer2.f
    protected void T() {
        try {
            n0();
            h1();
        } finally {
            r1(null);
        }
    }

    protected abstract void T0(String str, j.a aVar, long j11, long j12);

    @Override // com.google.android.exoplayer2.f
    protected void U() {
    }

    protected abstract void U0(String str);

    @Override // com.google.android.exoplayer2.f
    protected void V() {
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    protected fr.g V0(r rVar) throws ExoPlaybackException {
        int i11;
        boolean z11 = true;
        this.f40173y0 = true;
        u0 u0Var = (u0) ts.a.e(rVar.f17943b);
        if (u0Var.f40712l == null) {
            throw G(new IllegalArgumentException(), u0Var, 4005);
        }
        r1(rVar.f17942a);
        this.B = u0Var;
        if (this.f40149k0) {
            this.f40151m0 = true;
            return null;
        }
        j jVar = this.K;
        if (jVar == null) {
            this.P = null;
            Q0();
            return null;
        }
        k kVar = this.R;
        u0 u0Var2 = this.L;
        if (s0(kVar, u0Var, this.D, this.E)) {
            p0();
            return new fr.g(kVar.f40253a, u0Var2, u0Var, 0, 128);
        }
        boolean z12 = this.E != this.D;
        ts.a.g(!z12 || p0.f115040a >= 23);
        fr.g gVarC0 = c0(kVar, u0Var2, u0Var);
        int i12 = gVarC0.f66359d;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    if (y1(u0Var)) {
                        this.L = u0Var;
                        if (z12 && !q0()) {
                            i11 = 2;
                        }
                    } else {
                        i11 = 16;
                    }
                } else if (y1(u0Var)) {
                    this.f40152n0 = true;
                    this.f40153o0 = 1;
                    int i13 = this.S;
                    if (i13 != 2 && (i13 != 1 || u0Var.f40717q != u0Var2.f40717q || u0Var.f40718r != u0Var2.f40718r)) {
                        z11 = false;
                    }
                    this.f40139a0 = z11;
                    this.L = u0Var;
                    if (z12 && !q0()) {
                        i11 = 2;
                    }
                } else {
                    i11 = 16;
                }
            } else if (y1(u0Var)) {
                this.L = u0Var;
                if (!z12 ? !o0() : !q0()) {
                    i11 = 2;
                }
            } else {
                i11 = 16;
            }
            return (gVarC0.f66359d != 0 || (this.K == jVar && this.f40157q0 != 3)) ? gVarC0 : new fr.g(kVar.f40253a, u0Var2, u0Var, 0, i11);
        }
        p0();
        i11 = 0;
        if (gVarC0.f66359d != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // com.google.android.exoplayer2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void W(com.google.android.exoplayer2.u0[] r13, long r14, long r16) {
        /*
            r12 = this;
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r13 = r12.C0
            long r0 = r13.f40184c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r4 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.o1(r4)
            return
        L1e:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b> r13 = r12.f40174z
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L52
            long r0 = r12.f40165u0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L36
            long r4 = r12.D0
            int r13 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r13 == 0) goto L52
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L52
        L36:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r5 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.o1(r5)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r13 = r12.C0
            long r13 = r13.f40184c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.Z0()
        L51:
            return
        L52:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b> r13 = r12.f40174z
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b r5 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$b
            long r6 = r12.f40165u0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.W(com.google.android.exoplayer2.u0[], long, long):void");
    }

    protected abstract void W0(u0 u0Var, MediaFormat mediaFormat);

    protected void X0(long j11) {
    }

    protected void Y0(long j11) {
        this.D0 = j11;
        while (!this.f40174z.isEmpty() && j11 >= this.f40174z.peek().f40182a) {
            o1(this.f40174z.poll());
            Z0();
        }
    }

    protected void Z0() {
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean a() {
        return this.f40171x0;
    }

    protected abstract void a1(DecoderInputBuffer decoderInputBuffer);

    @Override // com.google.android.exoplayer2.a2
    public final int b(u0 u0Var) throws ExoPlaybackException {
        try {
            return w1(this.f40156q, u0Var);
        } catch (MediaCodecUtil.DecoderQueryException e11) {
            throw G(e11, u0Var, 4002);
        }
    }

    protected void b1(u0 u0Var) {
    }

    protected abstract fr.g c0(k kVar, u0 u0Var, u0 u0Var2);

    @Override // com.google.android.exoplayer2.z1
    public void d(long j11, long j12) throws ExoPlaybackException {
        boolean z11 = false;
        if (this.f40175z0) {
            this.f40175z0 = false;
            c1();
        }
        ExoPlaybackException exoPlaybackException = this.A0;
        if (exoPlaybackException != null) {
            this.A0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f40171x0) {
                i1();
                return;
            }
            if (this.B != null || f1(2)) {
                Q0();
                if (this.f40149k0) {
                    n0.a("bypassRender");
                    while (b0(j11, j12)) {
                    }
                    n0.c();
                } else if (this.K != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    n0.a("drainAndFeed");
                    while (r0(j11, j12) && s1(jElapsedRealtime)) {
                    }
                    while (t0() && s1(jElapsedRealtime)) {
                    }
                    n0.c();
                } else {
                    this.B0.f66345d += Z(j11);
                    f1(1);
                }
                this.B0.c();
            }
        } catch (IllegalStateException e11) {
            if (!N0(e11)) {
                throw e11;
            }
            S0(e11);
            if (p0.f115040a >= 21 && P0(e11)) {
                z11 = true;
            }
            if (z11) {
                h1();
            }
            throw H(m0(e11, z0()), this.B, z11, 4003);
        }
    }

    protected abstract boolean d1(long j11, long j12, j jVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, u0 u0Var);

    /* JADX WARN: Multi-variable type inference failed */
    protected void h1() {
        try {
            j jVar = this.K;
            if (jVar != null) {
                jVar.release();
                this.B0.f66343b++;
                U0(this.R.f40253a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.F = null;
                n1(null);
                k1();
            }
        } catch (Throwable th2) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.F = null;
                n1(null);
                k1();
            }
        }
    }

    protected void i1() {
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean isReady() {
        if (this.B == null) {
            return false;
        }
        if (N() || I0()) {
            return true;
        }
        return this.f40143e0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f40143e0;
    }

    protected void j1() {
        l1();
        m1();
        this.f40143e0 = -9223372036854775807L;
        this.f40161s0 = false;
        this.f40159r0 = false;
        this.f40139a0 = false;
        this.f40140b0 = false;
        this.f40147i0 = false;
        this.f40148j0 = false;
        this.f40170x.clear();
        this.f40165u0 = -9223372036854775807L;
        this.f40167v0 = -9223372036854775807L;
        this.D0 = -9223372036854775807L;
        g gVar = this.f40142d0;
        if (gVar != null) {
            gVar.c();
        }
        this.f40155p0 = 0;
        this.f40157q0 = 0;
        this.f40153o0 = this.f40152n0 ? 1 : 0;
    }

    protected void k1() {
        j1();
        this.A0 = null;
        this.f40142d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f40163t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f40141c0 = false;
        this.f40152n0 = false;
        this.f40153o0 = 0;
        this.G = false;
    }

    protected MediaCodecDecoderException m0(Throwable th2, k kVar) {
        return new MediaCodecDecoderException(th2, kVar);
    }

    protected final void p1() {
        this.f40175z0 = true;
    }

    protected final void q1(ExoPlaybackException exoPlaybackException) {
        this.A0 = exoPlaybackException;
    }

    protected boolean t1(k kVar) {
        return true;
    }

    protected boolean u1() {
        return false;
    }

    protected final boolean v0() throws ExoPlaybackException {
        boolean zW0 = w0();
        if (zW0) {
            Q0();
        }
        return zW0;
    }

    protected boolean v1(u0 u0Var) {
        return false;
    }

    protected boolean w0() {
        if (this.K == null) {
            return false;
        }
        int i11 = this.f40157q0;
        if (i11 == 3 || this.U || ((this.V && !this.f40163t0) || (this.W && this.f40161s0))) {
            h1();
            return true;
        }
        if (i11 == 2) {
            int i12 = p0.f115040a;
            ts.a.g(i12 >= 23);
            if (i12 >= 23) {
                try {
                    z1();
                } catch (ExoPlaybackException e11) {
                    ts.u.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e11);
                    h1();
                    return true;
                }
            }
        }
        u0();
        return false;
    }

    protected abstract int w1(l lVar, u0 u0Var);

    protected final j y0() {
        return this.K;
    }

    @Override // com.google.android.exoplayer2.z1
    public void z(float f11, float f12) throws ExoPlaybackException {
        this.I = f11;
        this.J = f12;
        y1(this.L);
    }

    protected final k z0() {
        return this.R;
    }

    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f40177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final k f40178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f40179d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DecoderInitializationException f40180e;

        public DecoderInitializationException(u0 u0Var, Throwable th2, boolean z11, int i11) {
            this("Decoder init failed: [" + i11 + "], " + u0Var, th2, u0Var.f40712l, z11, null, b(i11), null);
        }

        private static String b(int i11) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i11 < 0 ? "neg_" : "") + Math.abs(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f40176a, this.f40177b, this.f40178c, this.f40179d, decoderInitializationException);
        }

        private static String d(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        public DecoderInitializationException(u0 u0Var, Throwable th2, boolean z11, k kVar) {
            this("Decoder init failed: " + kVar.f40253a + ", " + u0Var, th2, u0Var.f40712l, z11, kVar, p0.f115040a >= 21 ? d(th2) : null, null);
        }

        private DecoderInitializationException(String str, Throwable th2, String str2, boolean z11, k kVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.f40176a = str2;
            this.f40177b = z11;
            this.f40178c = kVar;
            this.f40179d = str3;
            this.f40180e = decoderInitializationException;
        }
    }
}
