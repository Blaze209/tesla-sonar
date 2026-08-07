package androidx.media3.exoplayer.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.l2;
import androidx.media3.exoplayer.m2;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import com.google.android.gms.common.Scopes;
import com.google.common.collect.x;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import p7.g0;
import p7.i0;
import p7.u;
import s7.q0;
import s7.t;
import w8.r0;
import z7.w;

/* JADX INFO: loaded from: classes.dex */
public class l extends MediaCodecRenderer implements w {
    private final Context J0;
    private final e.a K0;
    private final AudioSink L0;
    private final j8.c M0;
    private int N0;
    private boolean O0;
    private boolean P0;
    private u Q0;
    private u R0;
    private long S0;
    private boolean T0;
    private boolean U0;
    private boolean V0;
    private int W0;
    private boolean X0;
    private long Y0;

    private static final class b {
        public static void a(AudioSink audioSink, Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    private final class c implements AudioSink.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void a(Exception exc) {
            t.e("MediaCodecAudioRenderer", "Audio sink error", exc);
            l.this.K0.p(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void b(long j11) {
            l.this.K0.x(j11);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void c(int i11, long j11, long j12) {
            l.this.K0.z(i11, j11, j12);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void d() {
            l.this.h0();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void e() {
            l2.a aVarA1 = l.this.a1();
            if (aVarA1 != null) {
                aVarA1.a();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void f() {
            l.this.t2();
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void g() {
            l2.a aVarA1 = l.this.a1();
            if (aVarA1 != null) {
                aVarA1.b();
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void h() {
            l.this.V0 = true;
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void o(AudioSink.a aVar) {
            l.this.K0.q(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void onAudioSessionIdChanged(int i11) {
            if (Build.VERSION.SDK_INT >= 35 && l.this.M0 != null) {
                l.this.M0.e(i11);
            }
            l.this.K0.o(i11);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void onSkipSilenceEnabledChanged(boolean z11) {
            l.this.K0.y(z11);
        }

        @Override // androidx.media3.exoplayer.audio.AudioSink.b
        public void p(AudioSink.a aVar) {
            l.this.K0.r(aVar);
        }
    }

    public l(Context context, androidx.media3.exoplayer.mediacodec.h.b bVar, androidx.media3.exoplayer.mediacodec.l lVar, boolean z11, Handler handler, e eVar, AudioSink audioSink) {
        this(context, bVar, lVar, z11, handler, eVar, audioSink, Build.VERSION.SDK_INT >= 35 ? new j8.c() : null);
    }

    private static boolean l2(String str) {
        return false;
    }

    private static boolean m2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean n2() {
        return false;
    }

    private int o2(u uVar) {
        d dVarY = this.L0.y(uVar);
        if (!dVarY.f9469a) {
            return 0;
        }
        int i11 = dVarY.f9470b ? 1536 : 512;
        return dVarY.f9471c ? i11 | 2048 : i11;
    }

    private int p2(androidx.media3.exoplayer.mediacodec.j jVar, u uVar) {
        "OMX.google.raw.decoder".equals(jVar.f10555a);
        return uVar.f101545p;
    }

    private static List<androidx.media3.exoplayer.mediacodec.j> r2(androidx.media3.exoplayer.mediacodec.l lVar, u uVar, boolean z11, AudioSink audioSink) {
        androidx.media3.exoplayer.mediacodec.j jVarP;
        if (uVar.f101544o == null) {
            return x.r();
        }
        return (!audioSink.b(uVar) || (jVarP = MediaCodecUtil.p()) == null) ? MediaCodecUtil.m(lVar, uVar, z11, false) : x.s(jVarP);
    }

    private void u2(int i11) {
        j8.c cVar;
        this.L0.o(i11);
        if (Build.VERSION.SDK_INT < 35 || (cVar = this.M0) == null) {
            return;
        }
        cVar.e(i11);
    }

    private void v2() {
        androidx.media3.exoplayer.mediacodec.h hVarM0 = M0();
        if (hVarM0 != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.W0));
            hVarM0.setParameters(bundle);
        }
    }

    private void w2() {
        long jR = this.L0.r(a());
        if (jR != Long.MIN_VALUE) {
            if (!this.T0) {
                jR = Math.max(this.S0, jR);
            }
            this.S0 = jR;
            this.T0 = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean A1(long j11, long j12, androidx.media3.exoplayer.mediacodec.h hVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, u uVar) throws ExoPlaybackException {
        s7.a.f(byteBuffer);
        this.Y0 = -9223372036854775807L;
        if (this.R0 != null && (i12 & 2) != 0) {
            ((androidx.media3.exoplayer.mediacodec.h) s7.a.f(hVar)).releaseOutputBuffer(i11, false);
            return true;
        }
        if (z11) {
            if (hVar != null) {
                hVar.releaseOutputBuffer(i11, false);
            }
            this.A0.f127066f += i13;
            this.L0.t();
            return true;
        }
        try {
            if (!this.L0.p(byteBuffer, j13, i13)) {
                this.Y0 = j13;
                return false;
            }
            if (hVar != null) {
                hVar.releaseOutputBuffer(i11, false);
            }
            this.A0.f127065e += i13;
            return true;
        } catch (AudioSink.InitializationException e11) {
            throw R(e11, this.Q0, e11.f9340b, (!i1() || T().f127118a == 0) ? 5001 : 5004);
        } catch (AudioSink.WriteException e12) {
            throw R(e12, uVar, e12.f9345b, (!i1() || T().f127118a == 0) ? 5002 : 5003);
        }
    }

    @Override // z7.w
    public boolean C() {
        boolean z11 = this.V0;
        this.V0 = false;
        return z11;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void F1() throws ExoPlaybackException {
        try {
            this.L0.q();
            if (V0() != -9223372036854775807L) {
                this.Y0 = V0();
            }
        } catch (AudioSink.WriteException e11) {
            throw R(e11, e11.f9346c, e11.f9345b, i1() ? 5003 : 5002);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float R0(float f11, u uVar, u[] uVarArr) {
        int iMax = -1;
        for (u uVar2 : uVarArr) {
            int i11 = uVar2.H;
            if (i11 != -1) {
                iMax = Math.max(iMax, i11);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f11;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected List<androidx.media3.exoplayer.mediacodec.j> T0(androidx.media3.exoplayer.mediacodec.l lVar, u uVar, boolean z11) {
        return MediaCodecUtil.n(r2(lVar, uVar, z11, this.L0), uVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected long U0(long j11, long j12, boolean z11) {
        boolean z12 = this.Y0 != -9223372036854775807L;
        if (!this.X0) {
            return (z12 || super.a()) ? 1000000L : 10000L;
        }
        long jV = this.L0.v();
        if (!z12 || jV == -9223372036854775807L) {
            return 10000L;
        }
        return Math.max(10000L, ((long) ((Math.min(jV, this.Y0 - j11) / (e() != null ? e().f101379a : 1.0f)) / 2.0f)) - (q0.b1(S().elapsedRealtime()) - j12));
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.mediacodec.h.a W0(androidx.media3.exoplayer.mediacodec.j jVar, u uVar, MediaCrypto mediaCrypto, float f11) {
        this.N0 = q2(jVar, uVar, Y());
        this.O0 = l2(jVar.f10555a);
        this.P0 = m2(jVar.f10555a);
        MediaFormat mediaFormatS2 = s2(uVar, jVar.f10557c, this.N0, f11);
        this.R0 = (!"audio/raw".equals(jVar.f10556b) || "audio/raw".equals(uVar.f101544o)) ? null : uVar;
        return androidx.media3.exoplayer.mediacodec.h.a.a(jVar, mediaFormatS2, uVar, mediaCrypto, this.M0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean Y1(u uVar) {
        if (T().f127118a != 0) {
            int iO2 = o2(uVar);
            if ((iO2 & 512) != 0) {
                if (T().f127118a == 2 || (iO2 & 1024) != 0) {
                    return true;
                }
                if (uVar.J == 0 && uVar.K == 0) {
                    return true;
                }
            }
        }
        return this.L0.b(uVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int Z1(androidx.media3.exoplayer.mediacodec.l lVar, u uVar) {
        int iO2;
        boolean z11;
        if (!g0.o(uVar.f101544o)) {
            return m2.g(0);
        }
        boolean z12 = true;
        boolean z13 = uVar.P != 0;
        boolean zA2 = MediaCodecRenderer.a2(uVar);
        int i11 = 8;
        if (!zA2 || (z13 && MediaCodecUtil.p() == null)) {
            iO2 = 0;
        } else {
            iO2 = o2(uVar);
            if (this.L0.b(uVar)) {
                return m2.B(4, 8, 32, iO2);
            }
        }
        if ("audio/raw".equals(uVar.f101544o) && !this.L0.b(uVar)) {
            return m2.g(1);
        }
        if (!this.L0.b(q0.s0(2, uVar.G, uVar.H))) {
            return m2.g(1);
        }
        List<androidx.media3.exoplayer.mediacodec.j> listR2 = r2(lVar, uVar, false, this.L0);
        if (listR2.isEmpty()) {
            return m2.g(1);
        }
        if (!zA2) {
            return m2.g(2);
        }
        androidx.media3.exoplayer.mediacodec.j jVar = listR2.get(0);
        boolean zP = jVar.p(uVar);
        if (!zP) {
            int i12 = 1;
            while (true) {
                if (i12 >= listR2.size()) {
                    z11 = true;
                    z12 = zP;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.j jVar2 = listR2.get(i12);
                if (jVar2.p(uVar)) {
                    z11 = false;
                    jVar = jVar2;
                    break;
                }
                i12++;
            }
        } else {
            z11 = true;
            z12 = zP;
            break;
        }
        int i13 = z12 ? 4 : 3;
        if (z12 && jVar.s(uVar)) {
            i11 = 16;
        }
        return m2.F(i13, i11, 32, jVar.f10562h ? 64 : 0, z11 ? 128 : 0, iO2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.l2
    public boolean a() {
        return super.a() && this.L0.a();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void b1(DecoderInputBuffer decoderInputBuffer) {
        u uVar;
        if (Build.VERSION.SDK_INT < 29 || (uVar = decoderInputBuffer.f9284b) == null || !Objects.equals(uVar.f101544o, "audio/opus") || !i1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) s7.a.f(decoderInputBuffer.f9289g);
        int i11 = ((u) s7.a.f(decoderInputBuffer.f9284b)).J;
        if (byteBuffer.remaining() == 8) {
            this.L0.D(i11, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void c0() {
        this.U0 = true;
        this.Q0 = null;
        this.Y0 = -9223372036854775807L;
        try {
            this.L0.flush();
            try {
                super.c0();
            } finally {
                this.K0.u(this.A0);
            }
        } catch (Throwable th2) {
            try {
                super.c0();
                throw th2;
            } finally {
                this.K0.u(this.A0);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void d0(boolean z11, boolean z12) {
        super.d0(z11, z12);
        this.K0.v(this.A0);
        if (T().f127119b) {
            this.L0.m();
        } else {
            this.L0.l();
        }
        this.L0.E(X());
        this.L0.A(S());
    }

    @Override // z7.w
    public i0 e() {
        return this.L0.e();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void f0(long j11, boolean z11) throws ExoPlaybackException {
        super.f0(j11, z11);
        this.L0.flush();
        this.S0 = j11;
        this.Y0 = -9223372036854775807L;
        this.V0 = false;
        this.T0 = true;
    }

    @Override // androidx.media3.exoplayer.h
    protected void g0() {
        j8.c cVar;
        this.L0.release();
        if (Build.VERSION.SDK_INT < 35 || (cVar = this.M0) == null) {
            return;
        }
        cVar.c();
    }

    @Override // androidx.media3.exoplayer.l2, androidx.media3.exoplayer.m2
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void i0() {
        this.V0 = false;
        this.Y0 = -9223372036854775807L;
        try {
            super.i0();
        } finally {
            if (this.U0) {
                this.U0 = false;
                this.L0.reset();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.l2
    public boolean isReady() {
        return this.L0.n() || super.isReady();
    }

    @Override // z7.w
    public void j(i0 i0Var) {
        this.L0.j(i0Var);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void j0() {
        super.j0();
        this.L0.f();
        this.X0 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h, androidx.media3.exoplayer.j2.b
    public void k(int i11, Object obj) {
        if (i11 == 2) {
            this.L0.k(((Float) s7.a.f(obj)).floatValue());
            return;
        }
        if (i11 == 3) {
            this.L0.z((p7.d) s7.a.f((p7.d) obj));
            return;
        }
        if (i11 == 6) {
            this.L0.C((p7.e) s7.a.f((p7.e) obj));
            return;
        }
        if (i11 == 12) {
            b.a(this.L0, obj);
            return;
        }
        if (i11 == 16) {
            this.W0 = ((Integer) s7.a.f(obj)).intValue();
            v2();
        } else if (i11 == 9) {
            this.L0.u(((Boolean) s7.a.f(obj)).booleanValue());
        } else if (i11 != 10) {
            super.k(i11, obj);
        } else {
            u2(((Integer) s7.a.f(obj)).intValue());
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.h
    protected void k0() {
        w2();
        this.X0 = false;
        this.L0.d();
        super.k0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void p1(Exception exc) {
        t.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.K0.n(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void q1(String str, androidx.media3.exoplayer.mediacodec.h.a aVar, long j11, long j12) {
        this.K0.s(str, j11, j12);
    }

    protected int q2(androidx.media3.exoplayer.mediacodec.j jVar, u uVar, u[] uVarArr) {
        int iP2 = p2(jVar, uVar);
        if (uVarArr.length == 1) {
            return iP2;
        }
        for (u uVar2 : uVarArr) {
            if (jVar.e(uVar, uVar2).f127083d != 0) {
                iP2 = Math.max(iP2, p2(jVar, uVar2));
            }
        }
        return iP2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void r1(String str) {
        this.K0.t(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected z7.c s1(z7.u uVar) throws ExoPlaybackException {
        u uVar2 = (u) s7.a.f(uVar.f127112b);
        this.Q0 = uVar2;
        z7.c cVarS1 = super.s1(uVar);
        this.K0.w(uVar2, cVarS1);
        return cVarS1;
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat s2(u uVar, String str, int i11, float f11) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", uVar.G);
        mediaFormat.setInteger("sample-rate", uVar.H);
        s7.w.e(mediaFormat, uVar.f101547r);
        s7.w.d(mediaFormat, "max-input-size", i11);
        int i12 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f11 != -1.0f && !n2()) {
            mediaFormat.setFloat("operating-rate", f11);
        }
        if ("audio/ac4".equals(uVar.f101544o)) {
            Pair<Integer, Integer> pairS = s7.k.s(uVar);
            if (pairS != null) {
                s7.w.d(mediaFormat, Scopes.PROFILE, ((Integer) pairS.first).intValue());
                s7.w.d(mediaFormat, "level", ((Integer) pairS.second).intValue());
            }
            if (i12 <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        if (this.L0.B(q0.s0(4, uVar.G, uVar.H)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i12 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i12 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.W0));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected z7.c t0(androidx.media3.exoplayer.mediacodec.j jVar, u uVar, u uVar2) {
        z7.c cVarE = jVar.e(uVar, uVar2);
        int i11 = cVarE.f127084e;
        if (j1(uVar2)) {
            i11 |= 32768;
        }
        if (p2(jVar, uVar2) > this.N0) {
            i11 |= 64;
        }
        int i12 = i11;
        return new z7.c(jVar.f10555a, uVar, uVar2, i12 != 0 ? 0 : cVarE.f127083d, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void t1(u uVar, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iQ0;
        int i11;
        u uVar2 = this.R0;
        int[] iArrA = null;
        if (uVar2 != null) {
            uVar = uVar2;
        } else if (M0() != null) {
            s7.a.f(mediaFormat);
            if ("audio/raw".equals(uVar.f101544o)) {
                iQ0 = uVar.I;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iQ0 = mediaFormat.getInteger("pcm-encoding");
            } else {
                iQ0 = mediaFormat.containsKey("v-bits-per-sample") ? q0.q0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            u uVarP = new u.b().y0("audio/raw").s0(iQ0).d0(uVar.J).e0(uVar.K).r0(uVar.f101541l).Z(uVar.f101542m).j0(uVar.f101530a).l0(uVar.f101531b).m0(uVar.f101532c).n0(uVar.f101533d).A0(uVar.f101534e).w0(uVar.f101535f).T(mediaFormat.getInteger("channel-count")).z0(mediaFormat.getInteger("sample-rate")).P();
            if (this.O0 && uVarP.G == 6 && (i11 = uVar.G) < 6) {
                iArrA = new int[i11];
                for (int i12 = 0; i12 < uVar.G; i12++) {
                    iArrA[i12] = i12;
                }
            } else if (this.P0) {
                iArrA = r0.a(uVarP.G);
            }
            uVar = uVarP;
        }
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                if (!i1() || T().f127118a == 0) {
                    this.L0.x(0);
                } else {
                    this.L0.x(T().f127118a);
                }
            }
            this.L0.F(uVar, 0, iArrA);
        } catch (AudioSink.ConfigurationException e11) {
            throw Q(e11, e11.f9338a, 5001);
        }
    }

    protected void t2() {
        this.T0 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void u1(long j11) {
        this.L0.s(j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void w1() {
        super.w1();
        this.L0.t();
    }

    @Override // z7.w
    public long y() {
        if (getState() == 2) {
            w2();
        }
        return this.S0;
    }

    public l(Context context, androidx.media3.exoplayer.mediacodec.h.b bVar, androidx.media3.exoplayer.mediacodec.l lVar, boolean z11, Handler handler, e eVar, AudioSink audioSink, j8.c cVar) {
        super(1, bVar, lVar, z11, 44100.0f);
        this.J0 = context.getApplicationContext();
        this.L0 = audioSink;
        this.M0 = cVar;
        this.W0 = -1000;
        this.K0 = new e.a(handler, eVar);
        this.Y0 = -9223372036854775807L;
        audioSink.w(new c());
    }

    @Override // androidx.media3.exoplayer.h, androidx.media3.exoplayer.l2
    public w p() {
        return this;
    }
}
