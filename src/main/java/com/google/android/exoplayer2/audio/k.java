package com.google.android.exoplayer2.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import br.r;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.z1;
import com.google.common.collect.x;
import java.nio.ByteBuffer;
import java.util.List;
import ts.p0;
import ts.u;
import ts.w;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class k extends MediaCodecRenderer implements w {
    private final Context G0;
    private final e.a H0;
    private final AudioSink I0;
    private int J0;
    private boolean K0;
    private u0 L0;
    private u0 M0;
    private long N0;
    private boolean O0;
    private boolean P0;
    private boolean Q0;
    private boolean R0;
    private z1.a S0;

    private static final class b {
        public static void a(AudioSink audioSink, Object obj) {
            audioSink.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    private final class c implements AudioSink.a {
        private c() {
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void a(Exception exc) {
            u.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            k.this.H0.l(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void b(long j11) {
            k.this.H0.r(j11);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void c(int i11, long j11, long j12) {
            k.this.H0.t(i11, j11, j12);
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void d() {
            k.this.S();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void e() {
            if (k.this.S0 != null) {
                k.this.S0.a();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void f() {
            k.this.K1();
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void g() {
            if (k.this.S0 != null) {
                k.this.S0.b();
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioSink.a
        public void onSkipSilenceEnabledChanged(boolean z11) {
            k.this.H0.s(z11);
        }
    }

    public k(Context context, com.google.android.exoplayer2.mediacodec.j.b bVar, com.google.android.exoplayer2.mediacodec.l lVar, boolean z11, Handler handler, e eVar, AudioSink audioSink) {
        super(1, bVar, lVar, z11, 44100.0f);
        this.G0 = context.getApplicationContext();
        this.I0 = audioSink;
        this.H0 = new e.a(handler, eVar);
        audioSink.i(new c());
    }

    private static boolean E1(String str) {
        if (p0.f115040a >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(p0.f115042c)) {
            return false;
        }
        String str2 = p0.f115041b;
        return str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte");
    }

    private static boolean F1() {
        if (p0.f115040a != 23) {
            return false;
        }
        String str = p0.f115043d;
        return "ZTE B2017G".equals(str) || "AXON 7 mini".equals(str);
    }

    private int G1(com.google.android.exoplayer2.mediacodec.k kVar, u0 u0Var) {
        int i11;
        if (!"OMX.google.raw.decoder".equals(kVar.f40253a) || (i11 = p0.f115040a) >= 24 || (i11 == 23 && p0.z0(this.G0))) {
            return u0Var.f40713m;
        }
        return -1;
    }

    private static List<com.google.android.exoplayer2.mediacodec.k> I1(com.google.android.exoplayer2.mediacodec.l lVar, u0 u0Var, boolean z11, AudioSink audioSink) {
        com.google.android.exoplayer2.mediacodec.k kVarX;
        if (u0Var.f40712l == null) {
            return x.r();
        }
        return (!audioSink.b(u0Var) || (kVarX = MediaCodecUtil.x()) == null) ? MediaCodecUtil.v(lVar, u0Var, z11, false) : x.s(kVarX);
    }

    private void L1() {
        long jR = this.I0.r(a());
        if (jR != Long.MIN_VALUE) {
            if (!this.P0) {
                jR = Math.max(this.N0, jR);
            }
            this.N0 = jR;
            this.P0 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected float B0(float f11, u0 u0Var, u0[] u0VarArr) {
        int iMax = -1;
        for (u0 u0Var2 : u0VarArr) {
            int i11 = u0Var2.f40726z;
            if (i11 != -1) {
                iMax = Math.max(iMax, i11);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f11;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected List<com.google.android.exoplayer2.mediacodec.k> D0(com.google.android.exoplayer2.mediacodec.l lVar, u0 u0Var, boolean z11) {
        return MediaCodecUtil.w(I1(lVar, u0Var, z11, this.I0), u0Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected com.google.android.exoplayer2.mediacodec.j.a E0(com.google.android.exoplayer2.mediacodec.k kVar, u0 u0Var, MediaCrypto mediaCrypto, float f11) {
        this.J0 = H1(kVar, u0Var, M());
        this.K0 = E1(kVar.f40253a);
        MediaFormat mediaFormatJ1 = J1(u0Var, kVar.f40255c, this.J0, f11);
        this.M0 = (!"audio/raw".equals(kVar.f40254b) || "audio/raw".equals(u0Var.f40712l)) ? null : u0Var;
        return com.google.android.exoplayer2.mediacodec.j.a.a(kVar, mediaFormatJ1, u0Var, mediaCrypto);
    }

    protected int H1(com.google.android.exoplayer2.mediacodec.k kVar, u0 u0Var, u0[] u0VarArr) {
        int iG1 = G1(kVar, u0Var);
        if (u0VarArr.length == 1) {
            return iG1;
        }
        for (u0 u0Var2 : u0VarArr) {
            if (kVar.f(u0Var, u0Var2).f66359d != 0) {
                iG1 = Math.max(iG1, G1(kVar, u0Var2));
            }
        }
        return iG1;
    }

    @SuppressLint({"InlinedApi"})
    protected MediaFormat J1(u0 u0Var, String str, int i11, float f11) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", u0Var.f40725y);
        mediaFormat.setInteger("sample-rate", u0Var.f40726z);
        ts.x.e(mediaFormat, u0Var.f40714n);
        ts.x.d(mediaFormat, "max-input-size", i11);
        int i12 = p0.f115040a;
        if (i12 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f11 != -1.0f && !F1()) {
                mediaFormat.setFloat("operating-rate", f11);
            }
        }
        if (i12 <= 28 && "audio/ac4".equals(u0Var.f40712l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i12 >= 24 && this.I0.v(p0.b0(4, u0Var.f40725y, u0Var.f40726z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i12 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    protected void K1() {
        this.P0 = true;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void O() {
        this.Q0 = true;
        this.L0 = null;
        try {
            this.I0.flush();
            try {
                super.O();
            } finally {
                this.H0.o(this.B0);
            }
        } catch (Throwable th2) {
            try {
                super.O();
                throw th2;
            } finally {
                this.H0.o(this.B0);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void P(boolean z11, boolean z12) {
        super.P(z11, z12);
        this.H0.p(this.B0);
        if (I().f17930a) {
            this.I0.m();
        } else {
            this.I0.l();
        }
        this.I0.g(L());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void Q(long j11, boolean z11) throws ExoPlaybackException {
        super.Q(j11, z11);
        if (this.R0) {
            this.I0.h();
        } else {
            this.I0.flush();
        }
        this.N0 = j11;
        this.O0 = true;
        this.P0 = true;
    }

    @Override // com.google.android.exoplayer2.f
    protected void R() {
        this.I0.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void S0(Exception exc) {
        u.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.H0.k(exc);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void T() {
        try {
            super.T();
        } finally {
            if (this.Q0) {
                this.Q0 = false;
                this.I0.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void T0(String str, com.google.android.exoplayer2.mediacodec.j.a aVar, long j11, long j12) {
        this.H0.m(str, j11, j12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void U() {
        super.U();
        this.I0.f();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void U0(String str) {
        this.H0.n(str);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.f
    protected void V() {
        L1();
        this.I0.d();
        super.V();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected fr.g V0(r rVar) throws ExoPlaybackException {
        this.L0 = (u0) ts.a.e(rVar.f17943b);
        fr.g gVarV0 = super.V0(rVar);
        this.H0.q(this.L0, gVarV0);
        return gVarV0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void W0(u0 u0Var, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iA0;
        int i11;
        u0 u0Var2 = this.M0;
        int[] iArr = null;
        if (u0Var2 != null) {
            u0Var = u0Var2;
        } else if (y0() != null) {
            if ("audio/raw".equals(u0Var.f40712l)) {
                iA0 = u0Var.A;
            } else if (p0.f115040a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iA0 = mediaFormat.containsKey("v-bits-per-sample") ? p0.a0(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iA0 = mediaFormat.getInteger("pcm-encoding");
            }
            u0 u0VarG = new u0.b().g0("audio/raw").a0(iA0).P(u0Var.B).Q(u0Var.C).J(mediaFormat.getInteger("channel-count")).h0(mediaFormat.getInteger("sample-rate")).G();
            if (this.K0 && u0VarG.f40725y == 6 && (i11 = u0Var.f40725y) < 6) {
                iArr = new int[i11];
                for (int i12 = 0; i12 < u0Var.f40725y; i12++) {
                    iArr[i12] = i12;
                }
            }
            u0Var = u0VarG;
        }
        try {
            this.I0.x(u0Var, 0, iArr);
        } catch (AudioSink.ConfigurationException e11) {
            throw G(e11, e11.f39421a, 5001);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void X0(long j11) {
        this.I0.s(j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void Z0() {
        super.Z0();
        this.I0.t();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public boolean a() {
        return super.a() && this.I0.a();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void a1(DecoderInputBuffer decoderInputBuffer) {
        if (!this.O0 || decoderInputBuffer.j()) {
            return;
        }
        if (Math.abs(decoderInputBuffer.f39722e - this.N0) > 500000) {
            this.N0 = decoderInputBuffer.f39722e;
        }
        this.O0 = false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected fr.g c0(com.google.android.exoplayer2.mediacodec.k kVar, u0 u0Var, u0 u0Var2) {
        fr.g gVarF = kVar.f(u0Var, u0Var2);
        int i11 = gVarF.f66360e;
        if (L0(u0Var2)) {
            i11 |= 32768;
        }
        if (G1(kVar, u0Var2) > this.J0) {
            i11 |= 64;
        }
        int i12 = i11;
        return new fr.g(kVar.f40253a, u0Var, u0Var2, i12 != 0 ? 0 : gVarF.f66359d, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean d1(long j11, long j12, com.google.android.exoplayer2.mediacodec.j jVar, ByteBuffer byteBuffer, int i11, int i12, int i13, long j13, boolean z11, boolean z12, u0 u0Var) throws ExoPlaybackException {
        ts.a.e(byteBuffer);
        if (this.M0 != null && (i12 & 2) != 0) {
            ((com.google.android.exoplayer2.mediacodec.j) ts.a.e(jVar)).releaseOutputBuffer(i11, false);
            return true;
        }
        if (z11) {
            if (jVar != null) {
                jVar.releaseOutputBuffer(i11, false);
            }
            this.B0.f66347f += i13;
            this.I0.t();
            return true;
        }
        try {
            if (!this.I0.p(byteBuffer, j13, i13)) {
                return false;
            }
            if (jVar != null) {
                jVar.releaseOutputBuffer(i11, false);
            }
            this.B0.f66346e += i13;
            return true;
        } catch (AudioSink.InitializationException e11) {
            throw H(e11, this.L0, e11.f39423b, 5001);
        } catch (AudioSink.WriteException e12) {
            throw H(e12, u0Var, e12.f39428b, 5002);
        }
    }

    @Override // ts.w
    public u1 e() {
        return this.I0.e();
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected void i1() throws ExoPlaybackException {
        try {
            this.I0.q();
        } catch (AudioSink.WriteException e11) {
            throw H(e11, e11.f39429c, e11.f39428b, 5002);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z1
    public boolean isReady() {
        return this.I0.n() || super.isReady();
    }

    @Override // ts.w
    public void j(u1 u1Var) {
        this.I0.j(u1Var);
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.w1.b
    public void k(int i11, Object obj) {
        if (i11 == 2) {
            this.I0.k(((Float) obj).floatValue());
            return;
        }
        if (i11 == 3) {
            this.I0.c((com.google.android.exoplayer2.audio.a) obj);
            return;
        }
        if (i11 == 6) {
            this.I0.w((dr.p) obj);
            return;
        }
        switch (i11) {
            case 9:
                this.I0.u(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.I0.o(((Integer) obj).intValue());
                break;
            case 11:
                this.S0 = (z1.a) obj;
                break;
            case 12:
                if (p0.f115040a >= 23) {
                    b.a(this.I0, obj);
                }
                break;
            default:
                super.k(i11, obj);
                break;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected boolean v1(u0 u0Var) {
        return this.I0.b(u0Var);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    protected int w1(com.google.android.exoplayer2.mediacodec.l lVar, u0 u0Var) {
        boolean z11;
        if (!y.l(u0Var.f40712l)) {
            return a2.g(0);
        }
        int i11 = p0.f115040a >= 21 ? 32 : 0;
        boolean z12 = true;
        boolean z13 = u0Var.G != 0;
        boolean zX1 = MediaCodecRenderer.x1(u0Var);
        int i12 = 8;
        if (zX1 && this.I0.b(u0Var) && (!z13 || MediaCodecUtil.x() != null)) {
            return a2.B(4, 8, i11);
        }
        if ("audio/raw".equals(u0Var.f40712l) && !this.I0.b(u0Var)) {
            return a2.g(1);
        }
        if (!this.I0.b(p0.b0(2, u0Var.f40725y, u0Var.f40726z))) {
            return a2.g(1);
        }
        List<com.google.android.exoplayer2.mediacodec.k> listI1 = I1(lVar, u0Var, false, this.I0);
        if (listI1.isEmpty()) {
            return a2.g(1);
        }
        if (!zX1) {
            return a2.g(2);
        }
        com.google.android.exoplayer2.mediacodec.k kVar = listI1.get(0);
        boolean zO = kVar.o(u0Var);
        if (!zO) {
            int i13 = 1;
            while (true) {
                if (i13 >= listI1.size()) {
                    z11 = true;
                    z12 = zO;
                    break;
                }
                com.google.android.exoplayer2.mediacodec.k kVar2 = listI1.get(i13);
                if (kVar2.o(u0Var)) {
                    z11 = false;
                    kVar = kVar2;
                    break;
                }
                i13++;
            }
        } else {
            z11 = true;
            z12 = zO;
            break;
        }
        int i14 = z12 ? 4 : 3;
        if (z12 && kVar.r(u0Var)) {
            i12 = 16;
        }
        return a2.u(i14, i12, i11, kVar.f40260h ? 64 : 0, z11 ? 128 : 0);
    }

    @Override // ts.w
    public long y() {
        if (getState() == 2) {
            L1();
        }
        return this.N0;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z1
    public w p() {
        return this;
    }
}
