package t8;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import ch.qos.logback.classic.spi.CallerData;
import com.google.common.collect.x;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import n8.i;
import n8.j;
import p7.a1;
import p7.d;
import p7.e1;
import p7.f0;
import p7.i0;
import p7.j0;
import p7.r0;
import p7.u;
import p7.y;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes3.dex */
public class a implements a8.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final NumberFormat f112869e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f112870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r0.d f112871b = new r0.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r0.b f112872c = new r0.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f112873d = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        f112869e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public a(String str) {
        this.f112870a = str;
    }

    private static String D0(int i11) {
        if (i11 == 0) {
            return "REPEAT";
        }
        if (i11 == 1) {
            return "AUTO";
        }
        if (i11 != 2) {
            return i11 != 3 ? CallerData.NA : "PLAYLIST_CHANGED";
        }
        return "SEEK";
    }

    private static String E0(int i11) {
        if (i11 == 1) {
            return "USER_REQUEST";
        }
        if (i11 == 2) {
            return "AUDIO_FOCUS_LOSS";
        }
        if (i11 == 3) {
            return "AUDIO_BECOMING_NOISY";
        }
        if (i11 != 4) {
            return i11 != 5 ? CallerData.NA : "END_OF_MEDIA_ITEM";
        }
        return "REMOTE";
    }

    private static String F0(int i11) {
        if (i11 == 0) {
            return "NONE";
        }
        if (i11 == 1) {
            return "TRANSIENT_AUDIO_FOCUS_LOSS";
        }
        if (i11 != 3) {
            return i11 != 4 ? CallerData.NA : "SCRUBBING";
        }
        return "UNSUITABLE_AUDIO_OUTPUT";
    }

    private static String G0(int i11) {
        if (i11 == 0) {
            return "OFF";
        }
        if (i11 != 1) {
            return i11 != 2 ? CallerData.NA : "ALL";
        }
        return "ONE";
    }

    private static String H0(int i11) {
        if (i11 == 1) {
            return "IDLE";
        }
        if (i11 == 2) {
            return "BUFFERING";
        }
        if (i11 != 3) {
            return i11 != 4 ? CallerData.NA : "ENDED";
        }
        return "READY";
    }

    private static String I0(long j11) {
        return j11 == -9223372036854775807L ? CallerData.NA : f112869e.format(j11 / 1000.0f);
    }

    private static String J0(int i11) {
        if (i11 != 0) {
            return i11 != 1 ? CallerData.NA : "SOURCE_UPDATE";
        }
        return "PLAYLIST_CHANGED";
    }

    private static String K0(boolean z11) {
        return z11 ? "[X]" : "[ ]";
    }

    private void L0(a8.b.a aVar, String str) {
        N0(n0(aVar, str, null, null));
    }

    private void M0(a8.b.a aVar, String str, String str2) {
        N0(n0(aVar, str, str2, null));
    }

    private void O0(a8.b.a aVar, String str, String str2, Throwable th2) {
        Q0(n0(aVar, str, str2, th2));
    }

    private void P0(a8.b.a aVar, String str, Throwable th2) {
        Q0(n0(aVar, str, null, th2));
    }

    private void R0(a8.b.a aVar, String str, Exception exc) {
        O0(aVar, "internalError", str, exc);
    }

    private void S0(f0 f0Var, String str) {
        for (int i11 = 0; i11 < f0Var.e(); i11++) {
            N0(str + f0Var.d(i11));
        }
    }

    private static String Z(int i11) {
        switch (i11) {
            case 0:
                return "AUTO_TRANSITION";
            case 1:
                return "SEEK";
            case 2:
                return "SEEK_ADJUSTMENT";
            case 3:
                return "SKIP";
            case 4:
                return "REMOVE";
            case 5:
                return "INTERNAL";
            case 6:
                return "SILENCE_SKIP";
            default:
                return CallerData.NA;
        }
    }

    private static String e(AudioSink.a aVar) {
        return aVar.f9347a + "," + aVar.f9349c + "," + aVar.f9348b + "," + aVar.f9350d + "," + aVar.f9351e + "," + aVar.f9352f;
    }

    private String n0(a8.b.a aVar, String str, String str2, Throwable th2) {
        String str3 = str + " [" + y0(aVar);
        if (th2 instanceof PlaybackException) {
            str3 = str3 + ", errorCode=" + ((PlaybackException) th2).f();
        }
        if (str2 != null) {
            str3 = str3 + ", " + str2;
        }
        String strF = t.f(th2);
        if (!TextUtils.isEmpty(strF)) {
            str3 = str3 + "\n  " + strF.replace("\n", "\n  ") + '\n';
        }
        return str3 + "]";
    }

    private String y0(a8.b.a aVar) {
        String str = "window=" + aVar.f584c;
        if (aVar.f585d != null) {
            str = str + ", period=" + aVar.f583b.f(aVar.f585d.f11103a);
            if (aVar.f585d.b()) {
                str = (str + ", adGroup=" + aVar.f585d.f11104b) + ", ad=" + aVar.f585d.f11105c;
            }
        }
        return "eventTime=" + I0(aVar.f582a - this.f112873d) + ", mediaPos=" + I0(aVar.f586e) + ", " + str;
    }

    @Override // a8.b
    public void B0(a8.b.a aVar) {
        L0(aVar, "drmKeysRestored");
    }

    @Override // a8.b
    public void C0(a8.b.a aVar, int i11, long j11, long j12) {
        O0(aVar, "audioTrackUnderrun", i11 + ", " + j11 + ", " + j12, null);
    }

    @Override // a8.b
    public void E(a8.b.a aVar, j jVar) {
        M0(aVar, "downstreamFormat", u.l(jVar.f93566c));
    }

    @Override // a8.b
    public void F(a8.b.a aVar, d dVar) {
        M0(aVar, "audioAttributes", dVar.f101238a + "," + dVar.f101239b + "," + dVar.f101240c + "," + dVar.f101241d);
    }

    @Override // a8.b
    public void G(a8.b.a aVar, boolean z11, int i11) {
        M0(aVar, "playWhenReady", z11 + ", " + E0(i11));
    }

    @Override // a8.b
    public void H(a8.b.a aVar) {
        L0(aVar, "drmKeysRemoved");
    }

    @Override // a8.b
    public void I(a8.b.a aVar, long j11) {
        M0(aVar, "audioPositionAdvancing", "since " + I0(((j11 - System.currentTimeMillis()) + SystemClock.elapsedRealtime()) - this.f112873d));
    }

    @Override // a8.b
    public void J(a8.b.a aVar, z7.b bVar) {
        L0(aVar, "audioDisabled");
    }

    @Override // a8.b
    public void M(a8.b.a aVar, boolean z11) {
        M0(aVar, "isPlaying", Boolean.toString(z11));
    }

    protected void N0(String str) {
        t.b(this.f112870a, str);
    }

    @Override // a8.b
    public void O(a8.b.a aVar, z7.b bVar) {
        L0(aVar, "videoEnabled");
    }

    @Override // a8.b
    public void Q(a8.b.a aVar, i0 i0Var) {
        M0(aVar, "playbackParameters", i0Var.toString());
    }

    protected void Q0(String str) {
        t.d(this.f112870a, str);
    }

    @Override // a8.b
    public void S(a8.b.a aVar, z7.b bVar) {
        L0(aVar, "audioEnabled");
    }

    @Override // a8.b
    public void T(a8.b.a aVar, int i11, int i12) {
        M0(aVar, "surfaceSize", "w=" + i11 + ", h=" + i12);
    }

    @Override // a8.b
    public void U(a8.b.a aVar) {
        L0(aVar, "drmSessionReleased");
    }

    @Override // a8.b
    public void X(a8.b.a aVar, j jVar) {
        M0(aVar, "upstreamDiscarded", u.l(jVar.f93566c));
    }

    @Override // a8.b
    public void Y(a8.b.a aVar, boolean z11) {
        M0(aVar, "shuffleModeEnabled", Boolean.toString(z11));
    }

    @Override // a8.b
    public void a(a8.b.a aVar) {
        L0(aVar, "drmKeysLoaded");
    }

    @Override // a8.b
    public void a0(a8.b.a aVar, int i11) {
        M0(aVar, "state", H0(i11));
    }

    @Override // a8.b
    public void b(a8.b.a aVar, int i11) {
        int iM = aVar.f583b.m();
        int iT = aVar.f583b.t();
        N0("timeline [" + y0(aVar) + ", periodCount=" + iM + ", windowCount=" + iT + ", reason=" + J0(i11));
        for (int i12 = 0; i12 < Math.min(iM, 3); i12++) {
            aVar.f583b.j(i12, this.f112872c);
            N0("  period [" + I0(this.f112872c.k()) + "]");
        }
        if (iM > 3) {
            N0("  ...");
        }
        for (int i13 = 0; i13 < Math.min(iT, 3); i13++) {
            aVar.f583b.r(i13, this.f112871b);
            N0("  window [" + I0(this.f112871b.e()) + ", seekable=" + this.f112871b.f101488h + ", dynamic=" + this.f112871b.f101489i + "]");
        }
        if (iT > 3) {
            N0("  ...");
        }
        N0("]");
    }

    @Override // a8.b
    public void c(a8.b.a aVar, y yVar, int i11) {
        N0("mediaItem [" + y0(aVar) + ", reason=" + D0(i11) + "]");
    }

    @Override // a8.b
    public void d0(a8.b.a aVar, a1 a1Var) {
        f0 f0Var;
        N0("tracks [" + y0(aVar));
        x<a1.a> xVarB = a1Var.b();
        for (int i11 = 0; i11 < xVarB.size(); i11++) {
            a1.a aVar2 = xVarB.get(i11);
            N0("  group [ id=" + aVar2.c().f101500b);
            for (int i12 = 0; i12 < aVar2.f101190a; i12++) {
                N0("    " + K0(aVar2.j(i12)) + " Track:" + i12 + ", " + u.l(aVar2.d(i12)) + ", supported=" + q0.k0(aVar2.e(i12)));
            }
            N0("  ]");
        }
        boolean z11 = false;
        for (int i13 = 0; !z11 && i13 < xVarB.size(); i13++) {
            a1.a aVar3 = xVarB.get(i13);
            for (int i14 = 0; !z11 && i14 < aVar3.f101190a; i14++) {
                if (aVar3.j(i14) && (f0Var = aVar3.d(i14).f101541l) != null && f0Var.e() > 0) {
                    N0("  Metadata [");
                    S0(f0Var, "    ");
                    N0("  ]");
                    z11 = true;
                }
            }
        }
        N0("]");
    }

    @Override // a8.b
    public void e0(a8.b.a aVar, u uVar, z7.c cVar) {
        M0(aVar, "videoInputFormat", u.l(uVar));
    }

    @Override // a8.b
    public void g(a8.b.a aVar, int i11, long j11) {
        M0(aVar, "droppedFrames", Integer.toString(i11));
    }

    @Override // a8.b
    public void g0(a8.b.a aVar, int i11) {
        M0(aVar, "playbackSuppressionReason", F0(i11));
    }

    @Override // a8.b
    public void h(a8.b.a aVar, String str, long j11, long j12) {
        M0(aVar, "audioDecoderInitialized", str);
    }

    @Override // a8.b
    public void h0(a8.b.a aVar, AudioSink.a aVar2) {
        M0(aVar, "audioTrackInit", e(aVar2));
    }

    @Override // a8.b
    public void i0(a8.b.a aVar, String str, long j11, long j12) {
        M0(aVar, "videoDecoderInitialized", str);
    }

    @Override // a8.b
    public void j(a8.b.a aVar, int i11) {
        M0(aVar, "repeatMode", G0(i11));
    }

    @Override // a8.b
    public void j0(a8.b.a aVar, Object obj, long j11) {
        M0(aVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // a8.b
    public void k0(a8.b.a aVar, AudioSink.a aVar2) {
        M0(aVar, "audioTrackReleased", e(aVar2));
    }

    @Override // a8.b
    public void l(a8.b.a aVar, u uVar, z7.c cVar) {
        M0(aVar, "audioInputFormat", u.l(uVar));
    }

    @Override // a8.b
    public void l0(a8.b.a aVar, int i11, int i12, boolean z11) {
        M0(aVar, "rendererReady", "rendererIndex=" + i11 + ", " + q0.C0(i12) + ", " + z11);
    }

    @Override // a8.b
    public void m(a8.b.a aVar, String str) {
        M0(aVar, "videoDecoderReleased", str);
    }

    @Override // a8.b
    public void m0(a8.b.a aVar, e1 e1Var) {
        StringBuilder sb2 = new StringBuilder("w=" + e1Var.f101332a + ", h=" + e1Var.f101333b);
        if (e1Var.f101335d != 1.0f) {
            sb2.append(", par=");
            sb2.append(e1Var.f101335d);
        }
        M0(aVar, "videoSize", sb2.toString());
    }

    @Override // a8.b
    public void o0(a8.b.a aVar, boolean z11) {
        M0(aVar, "skipSilenceEnabled", Boolean.toString(z11));
    }

    @Override // a8.b
    public void p(a8.b.a aVar, float f11) {
        M0(aVar, "volume", Float.toString(f11));
    }

    @Override // a8.b
    public void q(a8.b.a aVar, i iVar, j jVar, IOException iOException, boolean z11) {
        R0(aVar, "loadError", iOException);
    }

    @Override // a8.b
    public void s(a8.b.a aVar, int i11) {
        M0(aVar, "audioSessionId", Integer.toString(i11));
    }

    @Override // a8.b
    public void s0(a8.b.a aVar, f0 f0Var) {
        N0("metadata [" + y0(aVar));
        S0(f0Var, "  ");
        N0("]");
    }

    @Override // a8.b
    public void t(a8.b.a aVar, Exception exc) {
        R0(aVar, "drmSessionManagerError", exc);
    }

    @Override // a8.b
    public void u0(a8.b.a aVar, z7.b bVar) {
        L0(aVar, "videoDisabled");
    }

    @Override // a8.b
    public void v(a8.b.a aVar, int i11) {
        M0(aVar, "drmSessionAcquired", "state=" + i11);
    }

    @Override // a8.b
    public void w(a8.b.a aVar, String str) {
        M0(aVar, "audioDecoderReleased", str);
    }

    @Override // a8.b
    public void x(a8.b.a aVar, boolean z11) {
        M0(aVar, "loading", Boolean.toString(z11));
    }

    @Override // a8.b
    public void x0(a8.b.a aVar, PlaybackException playbackException) {
        P0(aVar, "playerFailed", playbackException);
    }

    @Override // a8.b
    public void y(a8.b.a aVar, j0.e eVar, j0.e eVar2, int i11) {
        M0(aVar, "positionDiscontinuity", "reason=" + Z(i11) + ", PositionInfo:old [" + eVar + "], PositionInfo:new [" + eVar2 + "]");
    }
}
