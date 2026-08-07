package androidx.media3.exoplayer.mediacodec;

import a8.o2;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.l2;
import b8.u;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.h0;
import s7.j0;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MediaCodecRenderer extends androidx.media3.exoplayer.h {
    private static final byte[] I0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final MediaCodec.BufferInfo A;
    protected z7.b A0;
    private final ArrayDeque<d> B;
    private d B0;
    private final u C;
    private long C0;
    private p7.u D;
    private boolean D0;
    private p7.u E;
    private boolean E0;
    private DrmSession F;
    private boolean F0;
    private DrmSession G;
    private long G0;
    private l2.a H;
    private long H0;
    private MediaCrypto I;
    private long J;
    private float K;
    private float L;
    private h M;
    private p7.u N;
    private MediaFormat O;
    private boolean P;
    private float Q;
    private ArrayDeque<j> R;
    private DecoderInitializationException S;
    private j T;
    private int U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f10446a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private long f10447b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f10448c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f10449d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f10450e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f10451f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private ByteBuffer f10452g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f10453h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f10454i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f10455j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f10456k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f10457l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f10458m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f10459n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f10460o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f10461p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f10462q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f10463r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final h.b f10464s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f10465s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final l f10466t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private long f10467t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f10468u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private long f10469u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final float f10470v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f10471v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final DecoderInputBuffer f10472w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f10473w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final DecoderInputBuffer f10474x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f10475x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final DecoderInputBuffer f10476y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f10477y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final f f10478z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private ExoPlaybackException f10479z0;

    private static final class b {
        public static void a(h.a aVar, o2 o2Var) {
            LogSessionId logSessionIdA = o2Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f10549b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    private final class c implements h.c {
        private c() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.c
        public void a() {
            if (MediaCodecRenderer.this.H != null) {
                MediaCodecRenderer.this.H.b();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.h.c
        public void b() {
            if (MediaCodecRenderer.this.H != null) {
                MediaCodecRenderer.this.H.b();
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f10486e = new d(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f10488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f10489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final h0<p7.u> f10490d = new h0<>();

        public d(long j11, long j12, long j13) {
            this.f10487a = j11;
            this.f10488b = j12;
            this.f10489c = j13;
        }
    }

    public MediaCodecRenderer(int i11, h.b bVar, l lVar, boolean z11, float f11) {
        super(i11);
        this.f10464s = bVar;
        this.f10466t = (l) s7.a.f(lVar);
        this.f10468u = z11;
        this.f10470v = f11;
        this.f10472w = DecoderInputBuffer.s();
        this.f10474x = new DecoderInputBuffer(0);
        this.f10476y = new DecoderInputBuffer(2);
        f fVar = new f();
        this.f10478z = fVar;
        this.A = new MediaCodec.BufferInfo();
        this.K = 1.0f;
        this.L = 1.0f;
        this.J = -9223372036854775807L;
        this.B = new ArrayDeque<>();
        this.B0 = d.f10486e;
        fVar.p(0);
        fVar.f9286d.order(ByteOrder.nativeOrder());
        this.C = new u();
        this.Q = -1.0f;
        this.U = 0;
        this.f10459n0 = 0;
        this.f10450e0 = -1;
        this.f10451f0 = -1;
        this.f10449d0 = -9223372036854775807L;
        this.f10467t0 = -9223372036854775807L;
        this.f10469u0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.f10447b0 = -9223372036854775807L;
        this.f10460o0 = 0;
        this.f10461p0 = 0;
        this.A0 = new z7.b();
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
    }

    private void A0() {
        this.f10455j0 = false;
        G1();
    }

    private boolean B0() {
        if (this.f10462q0) {
            this.f10460o0 = 1;
            if (this.W) {
                this.f10461p0 = 3;
                return false;
            }
            this.f10461p0 = 1;
        }
        return true;
    }

    private void B1() {
        this.f10465s0 = true;
        MediaFormat outputFormat = ((h) s7.a.f(this.M)).getOutputFormat();
        if (this.U != 0 && outputFormat.getInteger(Snapshot.WIDTH) == 32 && outputFormat.getInteger(Snapshot.HEIGHT) == 32) {
            this.Z = true;
        } else {
            this.O = outputFormat;
            this.P = true;
        }
    }

    private void C0() throws ExoPlaybackException {
        if (!this.f10462q0) {
            D1();
        } else {
            this.f10460o0 = 1;
            this.f10461p0 = 3;
        }
    }

    private boolean C1(int i11) throws ExoPlaybackException {
        z7.u uVarU = U();
        this.f10472w.f();
        int iN0 = n0(uVarU, this.f10472w, i11 | 4);
        if (iN0 == -5) {
            s1(uVarU);
            return true;
        }
        if (iN0 != -4 || !this.f10472w.i()) {
            return false;
        }
        this.f10471v0 = true;
        z1();
        return false;
    }

    @TargetApi(23)
    private boolean D0() throws ExoPlaybackException {
        if (this.f10462q0) {
            this.f10460o0 = 1;
            if (this.W) {
                this.f10461p0 = 3;
                return false;
            }
            this.f10461p0 = 2;
        } else {
            d2();
        }
        return true;
    }

    private void D1() throws ExoPlaybackException {
        E1();
        m1();
    }

    private boolean E0(long j11, long j12) throws ExoPlaybackException {
        boolean z11;
        boolean zA1;
        int iD;
        h hVar = (h) s7.a.f(this.M);
        if (!c1()) {
            if (this.X && this.f10463r0) {
                try {
                    iD = hVar.d(this.A);
                } catch (IllegalStateException unused) {
                    z1();
                    if (this.f10473w0) {
                        E1();
                    }
                    return false;
                }
            } else {
                iD = hVar.d(this.A);
            }
            if (iD < 0) {
                if (iD == -2) {
                    B1();
                    return true;
                }
                if (this.f10446a0 && (this.f10471v0 || this.f10460o0 == 2)) {
                    z1();
                }
                long j13 = this.f10447b0;
                if (j13 != -9223372036854775807L && j13 + 100 < S().currentTimeMillis()) {
                    z1();
                }
                return false;
            }
            if (this.Z) {
                this.Z = false;
                hVar.releaseOutputBuffer(iD, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.A;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                z1();
                return false;
            }
            this.f10451f0 = iD;
            ByteBuffer outputBuffer = hVar.getOutputBuffer(iD);
            this.f10452g0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.A.offset);
                ByteBuffer byteBuffer = this.f10452g0;
                MediaCodec.BufferInfo bufferInfo2 = this.A;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            e2(this.A.presentationTimeUs);
        }
        this.f10453h0 = this.A.presentationTimeUs < W();
        long j14 = this.f10469u0;
        this.f10454i0 = j14 != -9223372036854775807L && j14 <= this.A.presentationTimeUs;
        if (this.F0) {
            long j15 = this.G0;
            if (j15 == -9223372036854775807L || this.A.presentationTimeUs > j15) {
                this.G0 = this.A.presentationTimeUs;
                this.f10453h0 = true;
                this.f10454i0 = false;
            } else {
                this.F0 = false;
                this.G0 = -9223372036854775807L;
            }
        }
        if (this.X && this.f10463r0) {
            try {
                ByteBuffer byteBuffer2 = this.f10452g0;
                int i11 = this.f10451f0;
                MediaCodec.BufferInfo bufferInfo3 = this.A;
                z11 = false;
                try {
                    zA1 = A1(j11, j12, hVar, byteBuffer2, i11, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.f10453h0, this.f10454i0, (p7.u) s7.a.f(this.E));
                } catch (IllegalStateException unused2) {
                    z1();
                    if (this.f10473w0) {
                        E1();
                    }
                    return z11;
                }
            } catch (IllegalStateException unused3) {
                z11 = false;
            }
        } else {
            z11 = false;
            ByteBuffer byteBuffer3 = this.f10452g0;
            int i12 = this.f10451f0;
            MediaCodec.BufferInfo bufferInfo4 = this.A;
            zA1 = A1(j11, j12, hVar, byteBuffer3, i12, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f10453h0, this.f10454i0, (p7.u) s7.a.f(this.E));
        }
        if (zA1) {
            v1(this.A.presentationTimeUs);
            boolean z12 = (this.A.flags & 4) != 0 ? true : z11;
            if (!z12 && this.f10463r0 && this.f10454i0) {
                this.f10447b0 = S().currentTimeMillis();
            }
            L1();
            if (!z12) {
                return true;
            }
            z1();
        }
        return z11;
    }

    private boolean F0(j jVar, p7.u uVar, DrmSession drmSession, DrmSession drmSession2) {
        y7.b bVarC;
        y7.b bVarC2;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 != null && drmSession != null && (bVarC = drmSession2.c()) != null && (bVarC2 = drmSession.c()) != null && bVarC.getClass().equals(bVarC2.getClass())) {
            if (!(bVarC instanceof e8.l)) {
                return false;
            }
            if (!drmSession2.e().equals(drmSession.e())) {
                return true;
            }
            UUID uuid = p7.h.f101352e;
            if (!uuid.equals(drmSession.e()) && !uuid.equals(drmSession2.e())) {
                return !jVar.f10561g && (drmSession2.getState() == 2 || ((drmSession2.getState() == 3 || drmSession2.getState() == 4) && drmSession2.f((String) s7.a.f(uVar.f101544o))));
            }
        }
        return true;
    }

    private void G1() {
        J1();
        this.f10457l0 = false;
        this.f10478z.f();
        this.f10476y.f();
        this.f10456k0 = false;
        this.C.d();
    }

    private boolean H0() throws ExoPlaybackException {
        int i11;
        if (this.M == null || (i11 = this.f10460o0) == 2 || this.f10471v0) {
            return false;
        }
        if (i11 == 0 && V1()) {
            C0();
        }
        h hVar = (h) s7.a.f(this.M);
        if (this.f10450e0 < 0) {
            int iF = hVar.f();
            this.f10450e0 = iF;
            if (iF < 0) {
                return false;
            }
            this.f10474x.f9286d = hVar.getInputBuffer(iF);
            this.f10474x.f();
        }
        if (this.f10460o0 == 1) {
            if (!this.f10446a0) {
                this.f10463r0 = true;
                hVar.queueInputBuffer(this.f10450e0, 0, 0, 0L, 4);
                K1();
            }
            this.f10460o0 = 2;
            return false;
        }
        if (this.Y) {
            this.Y = false;
            ByteBuffer byteBuffer = (ByteBuffer) s7.a.f(this.f10474x.f9286d);
            byte[] bArr = I0;
            byteBuffer.put(bArr);
            hVar.queueInputBuffer(this.f10450e0, 0, bArr.length, 0L, 0);
            K1();
            this.f10462q0 = true;
            return true;
        }
        if (this.f10459n0 == 1) {
            for (int i12 = 0; i12 < ((p7.u) s7.a.f(this.N)).f101547r.size(); i12++) {
                ((ByteBuffer) s7.a.f(this.f10474x.f9286d)).put(this.N.f101547r.get(i12));
            }
            this.f10459n0 = 2;
        }
        int iPosition = ((ByteBuffer) s7.a.f(this.f10474x.f9286d)).position();
        z7.u uVarU = U();
        try {
            int iN0 = n0(uVarU, this.f10474x, 0);
            if (iN0 == -3) {
                if (h()) {
                    this.f10469u0 = this.f10467t0;
                }
                return false;
            }
            if (iN0 == -5) {
                if (this.f10459n0 == 2) {
                    this.f10474x.f();
                    this.f10459n0 = 1;
                }
                s1(uVarU);
                return true;
            }
            if (this.f10474x.i()) {
                this.f10469u0 = this.f10467t0;
                if (this.f10459n0 == 2) {
                    this.f10474x.f();
                    this.f10459n0 = 1;
                }
                this.f10471v0 = true;
                if (!this.f10462q0) {
                    z1();
                    return false;
                }
                if (!this.f10446a0) {
                    this.f10463r0 = true;
                    hVar.queueInputBuffer(this.f10450e0, 0, 0, 0L, 4);
                    K1();
                }
                return false;
            }
            if (!this.f10462q0 && !this.f10474x.k()) {
                this.f10474x.f();
                if (this.f10459n0 == 2) {
                    this.f10459n0 = 1;
                }
                return true;
            }
            if (S1(this.f10474x)) {
                return true;
            }
            boolean zR = this.f10474x.r();
            if (zR) {
                this.f10474x.f9285c.b(iPosition);
            }
            long j11 = this.f10474x.f9288f;
            if (this.f10475x0) {
                if (this.B.isEmpty()) {
                    this.B0.f10490d.a(j11, (p7.u) s7.a.f(this.D));
                } else {
                    this.B.peekLast().f10490d.a(j11, (p7.u) s7.a.f(this.D));
                }
                this.f10475x0 = false;
            }
            this.f10467t0 = Math.max(this.f10467t0, j11);
            if (h() || this.f10474x.l()) {
                this.f10469u0 = this.f10467t0;
            }
            this.f10474x.q();
            if (this.f10474x.h()) {
                b1(this.f10474x);
            }
            x1(this.f10474x);
            int iN1 = N0(this.f10474x);
            if ((Build.VERSION.SDK_INT < 34 || (iN1 & 32) == 0) && !T().f127119b) {
                this.H0 = Math.max(this.H0, this.f10474x.f9288f);
            }
            if (zR) {
                ((h) s7.a.f(hVar)).g(this.f10450e0, 0, this.f10474x.f9285c, j11, iN1);
            } else {
                ((h) s7.a.f(hVar)).queueInputBuffer(this.f10450e0, 0, ((ByteBuffer) s7.a.f(this.f10474x.f9286d)).limit(), j11, iN1);
            }
            K1();
            this.f10462q0 = true;
            this.f10459n0 = 0;
            this.A0.f127063c++;
            return true;
        } catch (DecoderInputBuffer.InsufficientCapacityException e11) {
            p1(e11);
            C1(0);
            I0();
            return true;
        }
    }

    private void I0() {
        try {
            ((h) s7.a.j(this.M)).flush();
        } finally {
            H1();
        }
    }

    private void J1() {
        this.f10467t0 = -9223372036854775807L;
        this.f10469u0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
    }

    private boolean K0() {
        if (this.M == null) {
            return false;
        }
        if (W1()) {
            E1();
            return true;
        }
        if (T1()) {
            I0();
        } else {
            y1();
        }
        return false;
    }

    private void K1() {
        this.f10450e0 = -1;
        this.f10474x.f9286d = null;
    }

    private List<j> L0(boolean z11) {
        p7.u uVar = (p7.u) s7.a.f(this.D);
        List<j> listT0 = T0(this.f10466t, uVar, z11);
        if (!listT0.isEmpty() || !z11) {
            return listT0;
        }
        List<j> listT1 = T0(this.f10466t, uVar, false);
        if (!listT1.isEmpty()) {
            t.i("MediaCodecRenderer", "Drm session requires secure decoder for " + uVar.f101544o + ", but no secure decoder available. Trying to proceed with " + listT1 + ".");
        }
        return listT1;
    }

    private void L1() {
        this.f10451f0 = -1;
        this.f10452g0 = null;
    }

    private void M1(DrmSession drmSession) {
        DrmSession.g(this.F, drmSession);
        this.F = drmSession;
    }

    private void N1(d dVar) {
        this.B0 = dVar;
        long j11 = dVar.f10489c;
        if (j11 != -9223372036854775807L) {
            this.D0 = true;
            u1(j11);
        }
    }

    private void Q1(DrmSession drmSession) {
        DrmSession.g(this.G, drmSession);
        this.G = drmSession;
    }

    private boolean R1(long j11) {
        return this.J == -9223372036854775807L || S().elapsedRealtime() - j11 < this.J;
    }

    protected static boolean a2(p7.u uVar) {
        int i11 = uVar.P;
        return i11 == 0 || i11 == 2;
    }

    private boolean c1() {
        return this.f10451f0 >= 0;
    }

    private boolean c2(p7.u uVar) throws ExoPlaybackException {
        if (this.M != null && this.f10461p0 != 3 && getState() != 0) {
            float fR0 = R0(this.L, (p7.u) s7.a.f(uVar), Y());
            float f11 = this.Q;
            if (f11 == fR0) {
                return true;
            }
            if (fR0 == -1.0f) {
                C0();
                return false;
            }
            if (f11 == -1.0f && fR0 <= this.f10470v) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fR0);
            ((h) s7.a.f(this.M)).setParameters(bundle);
            this.Q = fR0;
        }
        return true;
    }

    private void d2() throws ExoPlaybackException {
        y7.b bVarC = ((DrmSession) s7.a.f(this.G)).c();
        if (bVarC instanceof e8.l) {
            try {
                ((MediaCrypto) s7.a.f(this.I)).setMediaDrmSession(((e8.l) bVarC).f62231b);
            } catch (MediaCryptoException e11) {
                throw Q(e11, this.D, 6006);
            }
        }
        M1(this.G);
        this.f10460o0 = 0;
        this.f10461p0 = 0;
    }

    private boolean e1() {
        if (!this.f10478z.z()) {
            return true;
        }
        long jW = W();
        return k1(jW, this.f10478z.x()) == k1(jW, this.f10476y.f9288f);
    }

    private void f1(p7.u uVar) {
        A0();
        String str = uVar.f101544o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f10478z.A(32);
        } else {
            this.f10478z.A(1);
        }
        this.f10455j0 = true;
    }

    private void g1(j jVar, MediaCrypto mediaCrypto) {
        this.T = jVar;
        p7.u uVar = (p7.u) s7.a.f(this.D);
        String str = jVar.f10555a;
        int i11 = Build.VERSION.SDK_INT;
        float fR0 = R0(this.L, uVar, Y());
        if (fR0 <= this.f10470v) {
            fR0 = -1.0f;
        }
        long jElapsedRealtime = S().elapsedRealtime();
        h.a aVarW0 = W0(jVar, uVar, mediaCrypto, fR0);
        if (i11 >= 31) {
            b.a(aVarW0, X());
        }
        try {
            j0.a("createCodec:" + str);
            h hVarA = this.f10464s.a(aVarW0);
            this.M = hVarA;
            this.f10448c0 = hVarA.h(new c());
            j0.b();
            long jElapsedRealtime2 = S().elapsedRealtime();
            if (!jVar.p(uVar)) {
                t.i("MediaCodecRenderer", q0.J("Format exceeds selected codec's capabilities [%s, %s]", p7.u.l(uVar), str));
            }
            this.Q = fR0;
            this.N = uVar;
            this.U = u0(str);
            this.V = y0(str);
            this.W = v0(str);
            this.X = w0(str);
            this.f10446a0 = x0(jVar) || Q0();
            if (((h) s7.a.f(this.M)).b()) {
                this.f10458m0 = true;
                this.f10459n0 = 1;
                this.Y = this.U != 0;
            }
            if (getState() == 2) {
                this.f10449d0 = S().elapsedRealtime() + 1000;
            }
            this.A0.f127061a++;
            q1(str, aVarW0, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
        } catch (Throwable th2) {
            j0.b();
            throw th2;
        }
    }

    @RequiresNonNull({"this.codecDrmSession"})
    private boolean h1() throws ExoPlaybackException {
        s7.a.h(this.I == null);
        DrmSession drmSession = this.F;
        y7.b bVarC = drmSession.c();
        if (e8.l.f62229d && (bVarC instanceof e8.l)) {
            int state = drmSession.getState();
            if (state == 1) {
                DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) s7.a.f(drmSession.a());
                throw Q(drmSessionException, this.D, drmSessionException.f9783a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (bVarC == null) {
            return drmSession.a() != null;
        }
        if (bVarC instanceof e8.l) {
            e8.l lVar = (e8.l) bVarC;
            try {
                this.I = new MediaCrypto(lVar.f62230a, lVar.f62231b);
            } catch (MediaCryptoException e11) {
                throw Q(e11, this.D, 6006);
            }
        }
        return true;
    }

    private boolean k1(long j11, long j12) {
        if (j12 >= j11) {
            return false;
        }
        p7.u uVar = this.E;
        return (uVar != null && Objects.equals(uVar.f101544o, "audio/opus") && w8.h0.g(j11, j12)) ? false : true;
    }

    private static boolean l1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void n1(MediaCrypto mediaCrypto, boolean z11) throws DecoderInitializationException {
        p7.u uVar = (p7.u) s7.a.f(this.D);
        if (this.R == null) {
            try {
                List<j> listL0 = L0(z11);
                ArrayDeque<j> arrayDeque = new ArrayDeque<>();
                this.R = arrayDeque;
                if (this.f10468u) {
                    arrayDeque.addAll(listL0);
                } else if (!listL0.isEmpty()) {
                    this.R.add(listL0.get(0));
                }
                this.S = null;
            } catch (MediaCodecUtil.DecoderQueryException e11) {
                throw new DecoderInitializationException(uVar, e11, z11, -49998);
            }
        }
        if (this.R.isEmpty()) {
            throw new DecoderInitializationException(uVar, (Throwable) null, z11, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) s7.a.f(this.R);
        while (this.M == null) {
            j jVar = (j) s7.a.f((j) arrayDeque2.peekFirst());
            if (!o1(uVar) || !U1(jVar)) {
                return;
            }
            try {
                g1(jVar, mediaCrypto);
            } catch (Exception e12) {
                t.j("MediaCodecRenderer", "Failed to initialize decoder: " + jVar, e12);
                arrayDeque2.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException(uVar, e12, z11, jVar);
                p1(decoderInitializationException);
                if (this.S == null) {
                    this.S = decoderInitializationException;
                } else {
                    this.S = this.S.c(decoderInitializationException);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.S;
                }
            }
        }
        this.R = null;
    }

    private void r0() throws ExoPlaybackException {
        s7.a.h(!this.f10471v0);
        z7.u uVarU = U();
        this.f10476y.f();
        do {
            this.f10476y.f();
            int iN0 = n0(uVarU, this.f10476y, 0);
            if (iN0 == -5) {
                s1(uVarU);
                return;
            }
            if (iN0 == -4) {
                if (!this.f10476y.i()) {
                    this.f10467t0 = Math.max(this.f10467t0, this.f10476y.f9288f);
                    if (h() || this.f10474x.l()) {
                        this.f10469u0 = this.f10467t0;
                    }
                    if (this.f10475x0) {
                        p7.u uVar = (p7.u) s7.a.f(this.D);
                        this.E = uVar;
                        if (Objects.equals(uVar.f101544o, "audio/opus") && !this.E.f101547r.isEmpty()) {
                            this.E = this.E.b().d0(w8.h0.f(this.E.f101547r.get(0))).P();
                        }
                        t1(this.E, null);
                        this.f10475x0 = false;
                    }
                    this.f10476y.q();
                    p7.u uVar2 = this.E;
                    if (uVar2 != null && Objects.equals(uVar2.f101544o, "audio/opus")) {
                        if (this.f10476y.h()) {
                            DecoderInputBuffer decoderInputBuffer = this.f10476y;
                            decoderInputBuffer.f9284b = this.E;
                            b1(decoderInputBuffer);
                        }
                        if (w8.h0.g(W(), this.f10476y.f9288f)) {
                            this.C.a(this.f10476y, this.E.f101547r);
                        }
                    }
                    if (!e1()) {
                        break;
                    }
                } else {
                    this.f10471v0 = true;
                    this.f10469u0 = this.f10467t0;
                    return;
                }
            } else {
                if (iN0 != -3) {
                    throw new IllegalStateException();
                }
                if (h()) {
                    this.f10469u0 = this.f10467t0;
                    return;
                }
                return;
            }
        } while (this.f10478z.u(this.f10476y));
        this.f10456k0 = true;
    }

    private boolean s0(long j11, long j12) throws ExoPlaybackException {
        boolean z11;
        s7.a.h(!this.f10473w0);
        if (this.f10478z.z()) {
            f fVar = this.f10478z;
            z11 = false;
            if (!A1(j11, j12, null, fVar.f9286d, this.f10451f0, 0, fVar.y(), this.f10478z.w(), k1(W(), this.f10478z.x()), this.f10478z.i(), (p7.u) s7.a.f(this.E))) {
                return false;
            }
            v1(this.f10478z.x());
            this.f10478z.f();
        } else {
            z11 = false;
        }
        if (this.f10471v0) {
            this.f10473w0 = true;
            return z11;
        }
        if (this.f10456k0) {
            s7.a.h(this.f10478z.u(this.f10476y));
            this.f10456k0 = z11;
        }
        if (this.f10457l0) {
            if (this.f10478z.z()) {
                return true;
            }
            A0();
            this.f10457l0 = z11;
            m1();
            if (!this.f10455j0) {
                return z11;
            }
        }
        r0();
        if (this.f10478z.z()) {
            this.f10478z.q();
        }
        if (this.f10478z.z() || this.f10471v0 || this.f10457l0) {
            return true;
        }
        return z11;
    }

    private int u0(String str) {
        if (Build.VERSION.SDK_INT > 25 || !"OMX.Exynos.avc.dec.secure".equals(str)) {
            return 0;
        }
        String str2 = Build.MODEL;
        return (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) ? 2 : 0;
    }

    private static boolean v0(String str) {
        return false;
    }

    private static boolean w0(String str) {
        return false;
    }

    private static boolean x0(j jVar) {
        String str = jVar.f10555a;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i11 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) {
            return "Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && jVar.f10561g;
        }
        return true;
    }

    private static boolean y0(String str) {
        return Build.VERSION.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private void y1() {
        if (this.H0 != -9223372036854775807L) {
            long jW = W();
            long j11 = this.H0;
            if (jW > j11 || this.C0 >= j11) {
                return;
            }
            this.F0 = true;
            this.H0 = -9223372036854775807L;
        }
    }

    @TargetApi(23)
    private void z1() throws ExoPlaybackException {
        int i11 = this.f10461p0;
        if (i11 == 1) {
            I0();
            return;
        }
        if (i11 == 2) {
            I0();
            d2();
        } else if (i11 == 3) {
            D1();
        } else {
            this.f10473w0 = true;
            F1();
        }
    }

    @Override // androidx.media3.exoplayer.h, androidx.media3.exoplayer.m2
    public final int A() {
        return 8;
    }

    protected abstract boolean A1(long j11, long j12, h hVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, p7.u uVar);

    /* JADX WARN: Multi-variable type inference failed */
    protected void E1() {
        try {
            h hVar = this.M;
            if (hVar != null) {
                hVar.release();
                this.A0.f127062b++;
                r1(((j) s7.a.f(this.T)).f10555a);
            }
            this.M = null;
            try {
                MediaCrypto mediaCrypto = this.I;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.I = null;
                M1(null);
                I1();
            }
        } catch (Throwable th2) {
            this.M = null;
            try {
                MediaCrypto mediaCrypto2 = this.I;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.I = null;
                M1(null);
                I1();
            }
        }
    }

    protected abstract void F1();

    public void G0() {
        this.E0 = true;
    }

    protected void H1() {
        K1();
        L1();
        J1();
        this.f10449d0 = -9223372036854775807L;
        this.f10463r0 = false;
        this.f10447b0 = -9223372036854775807L;
        this.f10462q0 = false;
        this.Y = false;
        this.Z = false;
        this.f10453h0 = false;
        this.f10454i0 = false;
        this.f10460o0 = 0;
        this.f10461p0 = 0;
        this.f10459n0 = this.f10458m0 ? 1 : 0;
        this.F0 = false;
        this.G0 = -9223372036854775807L;
        this.H0 = -9223372036854775807L;
    }

    protected void I1() {
        H1();
        this.f10479z0 = null;
        this.R = null;
        this.T = null;
        this.N = null;
        this.O = null;
        this.P = false;
        this.f10465s0 = false;
        this.Q = -1.0f;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.f10446a0 = false;
        this.f10448c0 = false;
        this.f10458m0 = false;
        this.f10459n0 = 0;
    }

    protected final boolean J0() throws ExoPlaybackException {
        boolean zK0 = K0();
        if (zK0) {
            m1();
        }
        return zK0;
    }

    @Override // androidx.media3.exoplayer.l2
    public final long M(long j11, long j12) {
        return U0(j11, j12, this.f10448c0);
    }

    protected final h M0() {
        return this.M;
    }

    protected int N0(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    protected final j O0() {
        return this.T;
    }

    protected final void O1() {
        this.f10477y0 = true;
    }

    protected final p7.u P0() {
        return this.N;
    }

    protected final void P1(ExoPlaybackException exoPlaybackException) {
        this.f10479z0 = exoPlaybackException;
    }

    protected boolean Q0() {
        return false;
    }

    protected abstract float R0(float f11, p7.u uVar, p7.u[] uVarArr);

    protected final MediaFormat S0() {
        return this.O;
    }

    protected boolean S1(DecoderInputBuffer decoderInputBuffer) {
        if (!X1(decoderInputBuffer)) {
            return false;
        }
        decoderInputBuffer.f();
        this.A0.f127064d++;
        return true;
    }

    protected abstract List<j> T0(l lVar, p7.u uVar, boolean z11);

    protected boolean T1() {
        return true;
    }

    protected long U0(long j11, long j12, boolean z11) {
        return super.M(j11, j12);
    }

    protected boolean U1(j jVar) {
        return true;
    }

    protected long V0() {
        return this.f10469u0;
    }

    protected boolean V1() {
        return false;
    }

    protected abstract h.a W0(j jVar, p7.u uVar, MediaCrypto mediaCrypto, float f11);

    protected boolean W1() {
        int i11 = this.f10461p0;
        if (i11 == 3 || ((this.V && !this.f10465s0) || (this.W && this.f10463r0))) {
            return true;
        }
        if (i11 != 2) {
            return false;
        }
        s7.a.h(true);
        try {
            d2();
            return false;
        } catch (ExoPlaybackException e11) {
            t.j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e11);
            return true;
        }
    }

    protected final long X0() {
        return this.B0.f10489c;
    }

    protected boolean X1(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    protected final long Y0() {
        return this.B0.f10488b;
    }

    protected boolean Y1(p7.u uVar) {
        return false;
    }

    protected float Z0() {
        return this.K;
    }

    protected abstract int Z1(l lVar, p7.u uVar);

    @Override // androidx.media3.exoplayer.l2
    public boolean a() {
        return this.f10473w0;
    }

    protected final l2.a a1() {
        return this.H;
    }

    @Override // androidx.media3.exoplayer.m2
    public final int b(p7.u uVar) throws ExoPlaybackException {
        try {
            return Z1(this.f10466t, uVar);
        } catch (MediaCodecUtil.DecoderQueryException e11) {
            throw Q(e11, uVar, 4002);
        }
    }

    protected abstract void b1(DecoderInputBuffer decoderInputBuffer);

    protected final boolean b2() {
        return c2(this.N);
    }

    @Override // androidx.media3.exoplayer.h
    protected void c0() {
        this.D = null;
        N1(d.f10486e);
        this.B.clear();
        if (this.f10455j0) {
            A0();
        } else {
            K0();
        }
    }

    @Override // androidx.media3.exoplayer.l2
    public void d(long j11, long j12) throws ExoPlaybackException {
        boolean z11 = false;
        if (this.f10477y0) {
            this.f10477y0 = false;
            z1();
        }
        ExoPlaybackException exoPlaybackException = this.f10479z0;
        if (exoPlaybackException != null) {
            this.f10479z0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f10473w0) {
                F1();
                return;
            }
            if (this.D != null || C1(2)) {
                m1();
                if (this.f10455j0) {
                    j0.a("bypassRender");
                    while (s0(j11, j12)) {
                    }
                    j0.b();
                } else if (this.M != null) {
                    long jElapsedRealtime = S().elapsedRealtime();
                    j0.a("drainAndFeed");
                    while (E0(j11, j12) && R1(jElapsedRealtime)) {
                    }
                    while (H0() && R1(jElapsedRealtime)) {
                    }
                    j0.b();
                } else {
                    this.A0.f127064d += p0(j11);
                    C1(1);
                }
                this.A0.c();
            }
        } catch (MediaCodec.CryptoException e11) {
            throw Q(e11, this.D, q0.i0(e11.getErrorCode()));
        } catch (IllegalStateException e12) {
            if (!l1(e12)) {
                throw e12;
            }
            p1(e12);
            if ((e12 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e12).isRecoverable()) {
                z11 = true;
            }
            if (z11) {
                E1();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionZ0 = z0(e12, O0());
            throw R(mediaCodecDecoderExceptionZ0, this.D, z11, mediaCodecDecoderExceptionZ0.f10445c == 1101 ? 4006 : 4003);
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void d0(boolean z11, boolean z12) {
        this.A0 = new z7.b();
    }

    protected boolean d1() {
        return this.F0;
    }

    protected final void e2(long j11) {
        p7.u uVarJ = this.B0.f10490d.j(j11);
        if (uVarJ == null && this.D0 && this.O != null) {
            uVarJ = this.B0.f10490d.i();
        }
        if (uVarJ != null) {
            this.E = uVarJ;
        } else if (!this.P || this.E == null) {
            return;
        }
        t1((p7.u) s7.a.f(this.E), this.O);
        this.P = false;
        this.D0 = false;
    }

    @Override // androidx.media3.exoplayer.h
    protected void f0(long j11, boolean z11) throws ExoPlaybackException {
        this.f10471v0 = false;
        this.f10473w0 = false;
        this.f10477y0 = false;
        if (this.f10455j0) {
            G1();
        } else {
            J0();
        }
        if (this.B0.f10490d.l() > 0) {
            this.f10475x0 = true;
        }
        this.B0.f10490d.c();
        this.B.clear();
    }

    @Override // androidx.media3.exoplayer.h
    protected void i0() {
        try {
            A0();
            E1();
        } finally {
            Q1(null);
        }
    }

    protected final boolean i1() {
        return this.f10455j0;
    }

    @Override // androidx.media3.exoplayer.l2
    public boolean isReady() {
        if (this.D == null) {
            return false;
        }
        if (b0() || c1()) {
            return true;
        }
        return this.f10449d0 != -9223372036854775807L && S().elapsedRealtime() < this.f10449d0;
    }

    @Override // androidx.media3.exoplayer.h
    protected void j0() {
    }

    protected final boolean j1(p7.u uVar) {
        return this.G == null && Y1(uVar);
    }

    @Override // androidx.media3.exoplayer.h, androidx.media3.exoplayer.j2.b
    public void k(int i11, Object obj) {
        if (i11 == 11) {
            this.H = (l2.a) s7.a.f((l2.a) obj);
        } else {
            super.k(i11, obj);
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void k0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void l0(p7.u[] r12, long r13, long r15, androidx.media3.exoplayer.source.r.b r17) {
        /*
            r11 = this;
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r12 = r11.B0
            long r0 = r12.f10489c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.N1(r4)
            boolean r12 = r11.E0
            if (r12 == 0) goto L56
            r11.w1()
            return
        L24:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d> r12 = r11.B
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L57
            long r0 = r11.f10467t0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r4 = r11.C0
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L57
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 < 0) goto L57
        L3c:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.N1(r4)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r12 = r11.B0
            long r12 = r12.f10489c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.w1()
        L56:
            return
        L57:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d> r12 = r11.B
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d r0 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$d
            long r1 = r11.f10467t0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.l0(p7.u[], long, long, androidx.media3.exoplayer.source.r$b):void");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    protected final void m1() throws ExoPlaybackException {
        p7.u uVar;
        boolean z11;
        if (this.M != null || this.f10455j0 || (uVar = this.D) == null) {
            return;
        }
        if (j1(uVar)) {
            f1(uVar);
            return;
        }
        M1(this.G);
        if (this.F == null || h1()) {
            try {
                DrmSession drmSession = this.F;
                if (drmSession == null || !(drmSession.getState() == 3 || this.F.getState() == 4)) {
                    z11 = false;
                } else if (this.F.f((String) s7.a.j(uVar.f101544o))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n1(this.I, z11);
            } catch (DecoderInitializationException e11) {
                throw Q(e11, uVar, 4001);
            }
        }
        MediaCrypto mediaCrypto = this.I;
        if (mediaCrypto == null || this.M != null) {
            return;
        }
        mediaCrypto.release();
        this.I = null;
    }

    protected boolean o1(p7.u uVar) {
        return true;
    }

    protected abstract void p1(Exception exc);

    protected abstract void q1(String str, h.a aVar, long j11, long j12);

    protected abstract void r1(String str);

    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    protected z7.c s1(z7.u uVar) throws ExoPlaybackException {
        int i11;
        boolean z11 = true;
        this.f10475x0 = true;
        p7.u uVarP = (p7.u) s7.a.f(uVar.f127112b);
        String str = uVarP.f101544o;
        if (str == null) {
            throw Q(new IllegalArgumentException("Sample MIME type is null."), uVarP, 4005);
        }
        if ((Objects.equals(str, "video/av01") || Objects.equals(uVarP.f101544o, "video/x-vnd.on2.vp9")) && !uVarP.f101547r.isEmpty()) {
            uVarP = uVarP.b().k0(null).P();
        }
        p7.u uVar2 = uVarP;
        Q1(uVar.f127111a);
        this.D = uVar2;
        if (this.f10455j0) {
            this.f10457l0 = true;
            return null;
        }
        h hVar = this.M;
        if (hVar == null) {
            this.R = null;
            m1();
            return null;
        }
        j jVar = (j) s7.a.f(this.T);
        p7.u uVar3 = (p7.u) s7.a.f(this.N);
        if (F0(jVar, uVar2, this.F, this.G)) {
            C0();
            return new z7.c(jVar.f10555a, uVar3, uVar2, 0, 128);
        }
        boolean z12 = this.G != this.F;
        s7.a.h(true);
        z7.c cVarT0 = t0(jVar, uVar3, uVar2);
        int i12 = cVarT0.f127083d;
        if (i12 != 0) {
            i11 = 16;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    if (c2(uVar2)) {
                        this.N = uVar2;
                        if (z12 && !D0()) {
                            i11 = 2;
                        }
                    }
                } else if (c2(uVar2)) {
                    this.f10458m0 = true;
                    this.f10459n0 = 1;
                    int i13 = this.U;
                    if (i13 != 2 && (i13 != 1 || uVar2.f101551v != uVar3.f101551v || uVar2.f101552w != uVar3.f101552w)) {
                        z11 = false;
                    }
                    this.Y = z11;
                    this.N = uVar2;
                    if (z12 && !D0()) {
                        i11 = 2;
                    }
                }
            } else if (c2(uVar2)) {
                this.N = uVar2;
                if (!z12 ? !B0() : !D0()) {
                    i11 = 2;
                }
            }
            return (cVarT0.f127083d != 0 || (this.M == hVar && this.f10461p0 != 3)) ? cVarT0 : new z7.c(jVar.f10555a, uVar3, uVar2, 0, i11);
        }
        C0();
        i11 = 0;
        if (cVarT0.f127083d != 0) {
        }
    }

    protected abstract z7.c t0(j jVar, p7.u uVar, p7.u uVar2);

    protected abstract void t1(p7.u uVar, MediaFormat mediaFormat);

    protected void u1(long j11) {
    }

    protected void v1(long j11) {
        this.C0 = j11;
        while (!this.B.isEmpty() && j11 >= this.B.peek().f10487a) {
            N1((d) s7.a.f(this.B.poll()));
            w1();
        }
    }

    protected void w1() {
    }

    protected void x1(DecoderInputBuffer decoderInputBuffer) {
    }

    @Override // androidx.media3.exoplayer.l2
    public void z(float f11, float f12) throws ExoPlaybackException {
        this.K = f11;
        this.L = f12;
        c2(this.N);
    }

    protected MediaCodecDecoderException z0(Throwable th2, j jVar) {
        return new MediaCodecDecoderException(th2, jVar);
    }

    public static class DecoderInitializationException extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10480a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f10481b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f10482c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f10483d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final DecoderInitializationException f10484e;

        public DecoderInitializationException(p7.u uVar, Throwable th2, boolean z11, int i11) {
            this("Decoder init failed: [" + i11 + "], " + uVar, th2, uVar.f101544o, z11, null, b(i11), null);
        }

        private static String b(int i11) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i11 < 0 ? "neg_" : "") + Math.abs(i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public DecoderInitializationException c(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.f10480a, this.f10481b, this.f10482c, this.f10483d, decoderInitializationException);
        }

        public DecoderInitializationException(p7.u uVar, Throwable th2, boolean z11, j jVar) {
            this("Decoder init failed: " + jVar.f10555a + ", " + uVar, th2, uVar.f101544o, z11, jVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
        }

        private DecoderInitializationException(String str, Throwable th2, String str2, boolean z11, j jVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th2);
            this.f10480a = str2;
            this.f10481b = z11;
            this.f10482c = jVar;
            this.f10483d = str3;
            this.f10484e = decoderInitializationException;
        }
    }
}
