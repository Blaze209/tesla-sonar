package cr;

import a8.a2;
import a8.b2;
import a8.c2;
import a8.d2;
import a8.e2;
import a8.z1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.android.exoplayer2.v1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o1 implements cr.b, p1.a {
    private boolean A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f59037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p1 f59038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PlaybackSession f59039c;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f59045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PlaybackMetrics.Builder f59046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f59047k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PlaybackException f59050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f59051o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f59052p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f59053q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.android.exoplayer2.u0 f59054r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.android.exoplayer2.u0 f59055s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.exoplayer2.u0 f59056t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f59057u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f59058v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f59059w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f59060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f59061y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f59062z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f2.d f59041e = new f2.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f2.b f59042f = new f2.b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f59044h = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap<String, Long> f59043g = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f59040d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f59048l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f59049m = 0;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f59064b;

        public a(int i11, int i12) {
            this.f59063a = i11;
            this.f59064b = i12;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.u0 f59065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f59066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f59067c;

        public b(com.google.android.exoplayer2.u0 u0Var, int i11, String str) {
            this.f59065a = u0Var;
            this.f59066b = i11;
            this.f59067c = str;
        }
    }

    private o1(Context context, PlaybackSession playbackSession) {
        this.f59037a = context.getApplicationContext();
        this.f59039c = playbackSession;
        n1 n1Var = new n1();
        this.f59038b = n1Var;
        n1Var.c(this);
    }

    private static Pair<String, String> A0(String str) {
        String[] strArrP0 = ts.p0.P0(str, "-");
        return Pair.create(strArrP0[0], strArrP0.length >= 2 ? strArrP0[1] : null);
    }

    private static int C0(Context context) {
        switch (ts.b0.d(context).f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int D0(com.google.android.exoplayer2.x0 x0Var) {
        com.google.android.exoplayer2.x0.h hVar = x0Var.f41167b;
        if (hVar == null) {
            return 0;
        }
        int iR0 = ts.p0.r0(hVar.f41264a, hVar.f41265b);
        if (iR0 == 0) {
            return 3;
        }
        if (iR0 != 1) {
            return iR0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int E0(int i11) {
        if (i11 == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void F0(cr.b.C1204b c1204b) {
        for (int i11 = 0; i11 < c1204b.d(); i11++) {
            int iB = c1204b.b(i11);
            cr.b.a aVarC = c1204b.c(iB);
            if (iB == 0) {
                this.f59038b.g(aVarC);
            } else if (iB == 11) {
                this.f59038b.e(aVarC, this.f59047k);
            } else {
                this.f59038b.b(aVarC);
            }
        }
    }

    private void G0(long j11) {
        int iC0 = C0(this.f59037a);
        if (iC0 != this.f59049m) {
            this.f59049m = iC0;
            this.f59039c.reportNetworkEvent(a2.a().setNetworkType(iC0).setTimeSinceCreatedMillis(j11 - this.f59040d).build());
        }
    }

    private void H0(long j11) {
        PlaybackException playbackException = this.f59050n;
        if (playbackException == null) {
            return;
        }
        a aVarZ0 = z0(playbackException, this.f59037a, this.f59058v == 4);
        this.f59039c.reportPlaybackErrorEvent(c2.a().setTimeSinceCreatedMillis(j11 - this.f59040d).setErrorCode(aVarZ0.f59063a).setSubErrorCode(aVarZ0.f59064b).setException(playbackException).build());
        this.A = true;
        this.f59050n = null;
    }

    private void I0(v1 v1Var, cr.b.C1204b c1204b, long j11) {
        if (v1Var.g() != 2) {
            this.f59057u = false;
        }
        if (v1Var.a() == null) {
            this.f59059w = false;
        } else if (c1204b.a(10)) {
            this.f59059w = true;
        }
        int iQ0 = Q0(v1Var);
        if (this.f59048l != iQ0) {
            this.f59048l = iQ0;
            this.A = true;
            this.f59039c.reportPlaybackStateEvent(d2.a().setState(this.f59048l).setTimeSinceCreatedMillis(j11 - this.f59040d).build());
        }
    }

    private void J0(v1 v1Var, cr.b.C1204b c1204b, long j11) {
        if (c1204b.a(2)) {
            g2 g2VarP = v1Var.p();
            boolean zD = g2VarP.d(2);
            boolean zD2 = g2VarP.d(1);
            boolean zD3 = g2VarP.d(3);
            if (zD || zD2 || zD3) {
                if (!zD) {
                    O0(j11, null, 0);
                }
                if (!zD2) {
                    K0(j11, null, 0);
                }
                if (!zD3) {
                    M0(j11, null, 0);
                }
            }
        }
        if (t0(this.f59051o)) {
            b bVar = this.f59051o;
            com.google.android.exoplayer2.u0 u0Var = bVar.f59065a;
            if (u0Var.f40718r != -1) {
                O0(j11, u0Var, bVar.f59066b);
                this.f59051o = null;
            }
        }
        if (t0(this.f59052p)) {
            b bVar2 = this.f59052p;
            K0(j11, bVar2.f59065a, bVar2.f59066b);
            this.f59052p = null;
        }
        if (t0(this.f59053q)) {
            b bVar3 = this.f59053q;
            M0(j11, bVar3.f59065a, bVar3.f59066b);
            this.f59053q = null;
        }
    }

    private void K0(long j11, com.google.android.exoplayer2.u0 u0Var, int i11) {
        if (ts.p0.c(this.f59055s, u0Var)) {
            return;
        }
        if (this.f59055s == null && i11 == 0) {
            i11 = 1;
        }
        this.f59055s = u0Var;
        P0(0, j11, u0Var, i11);
    }

    private void L0(v1 v1Var, cr.b.C1204b c1204b) {
        com.google.android.exoplayer2.drm.h hVarX0;
        if (c1204b.a(0)) {
            cr.b.a aVarC = c1204b.c(0);
            if (this.f59046j != null) {
                N0(aVarC.f58911b, aVarC.f58913d);
            }
        }
        if (c1204b.a(2) && this.f59046j != null && (hVarX0 = x0(v1Var.p().b())) != null) {
            e2.a(ts.p0.j(this.f59046j)).setDrmType(y0(hVarX0));
        }
        if (c1204b.a(1011)) {
            this.f59062z++;
        }
    }

    private void M0(long j11, com.google.android.exoplayer2.u0 u0Var, int i11) {
        if (ts.p0.c(this.f59056t, u0Var)) {
            return;
        }
        if (this.f59056t == null && i11 == 0) {
            i11 = 1;
        }
        this.f59056t = u0Var;
        P0(2, j11, u0Var, i11);
    }

    @RequiresNonNull({"metricsBuilder"})
    private void N0(f2 f2Var, com.google.android.exoplayer2.source.o.b bVar) {
        int iF;
        PlaybackMetrics.Builder builder = this.f59046j;
        if (bVar == null || (iF = f2Var.f(bVar.f63157a)) == -1) {
            return;
        }
        f2Var.j(iF, this.f59042f);
        f2Var.r(this.f59042f.f39924c, this.f59041e);
        builder.setStreamType(D0(this.f59041e.f39944c));
        f2.d dVar = this.f59041e;
        if (dVar.f39955n != -9223372036854775807L && !dVar.f39953l && !dVar.f39950i && !dVar.h()) {
            builder.setMediaDurationMillis(this.f59041e.f());
        }
        builder.setPlaybackType(this.f59041e.h() ? 2 : 1);
        this.A = true;
    }

    private void O0(long j11, com.google.android.exoplayer2.u0 u0Var, int i11) {
        if (ts.p0.c(this.f59054r, u0Var)) {
            return;
        }
        if (this.f59054r == null && i11 == 0) {
            i11 = 1;
        }
        this.f59054r = u0Var;
        P0(1, j11, u0Var, i11);
    }

    private void P0(int i11, long j11, com.google.android.exoplayer2.u0 u0Var, int i12) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = z1.a(i11).setTimeSinceCreatedMillis(j11 - this.f59040d);
        if (u0Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(E0(i12));
            String str = u0Var.f40711k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = u0Var.f40712l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = u0Var.f40709i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = u0Var.f40708h;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = u0Var.f40717q;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = u0Var.f40718r;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = u0Var.f40725y;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = u0Var.f40726z;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = u0Var.f40703c;
            if (str4 != null) {
                Pair<String, String> pairA0 = A0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairA0.first);
                Object obj = pairA0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f11 = u0Var.f40719s;
            if (f11 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f11);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.A = true;
        this.f59039c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private int Q0(v1 v1Var) {
        int iG = v1Var.g();
        if (this.f59057u) {
            return 5;
        }
        if (this.f59059w) {
            return 13;
        }
        if (iG == 4) {
            return 11;
        }
        if (iG == 2) {
            int i11 = this.f59048l;
            if (i11 == 0 || i11 == 2) {
                return 2;
            }
            if (v1Var.t()) {
                return v1Var.I() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iG == 3) {
            if (v1Var.t()) {
                return v1Var.I() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iG != 1 || this.f59048l == 0) {
            return this.f59048l;
        }
        return 12;
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private boolean t0(b bVar) {
        return bVar != null && bVar.f59067c.equals(this.f59038b.a());
    }

    public static o1 u0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = a8.f2.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new o1(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void v0() {
        PlaybackMetrics.Builder builder = this.f59046j;
        if (builder != null && this.A) {
            builder.setAudioUnderrunCount(this.f59062z);
            this.f59046j.setVideoFramesDropped(this.f59060x);
            this.f59046j.setVideoFramesPlayed(this.f59061y);
            Long l11 = this.f59043g.get(this.f59045i);
            this.f59046j.setNetworkTransferDurationMillis(l11 == null ? 0L : l11.longValue());
            Long l12 = this.f59044h.get(this.f59045i);
            this.f59046j.setNetworkBytesRead(l12 == null ? 0L : l12.longValue());
            this.f59046j.setStreamSource((l12 == null || l12.longValue() <= 0) ? 0 : 1);
            this.f59039c.reportPlaybackMetrics(this.f59046j.build());
        }
        this.f59046j = null;
        this.f59045i = null;
        this.f59062z = 0;
        this.f59060x = 0;
        this.f59061y = 0;
        this.f59054r = null;
        this.f59055s = null;
        this.f59056t = null;
        this.A = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int w0(int i11) {
        switch (ts.p0.S(i11)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private static com.google.android.exoplayer2.drm.h x0(com.google.common.collect.x<g2.a> xVar) {
        com.google.android.exoplayer2.drm.h hVar;
        com.google.common.collect.d1<g2.a> it = xVar.iterator();
        while (it.hasNext()) {
            g2.a next = it.next();
            for (int i11 = 0; i11 < next.f39971a; i11++) {
                if (next.g(i11) && (hVar = next.c(i11).f40715o) != null) {
                    return hVar;
                }
            }
        }
        return null;
    }

    private static int y0(com.google.android.exoplayer2.drm.h hVar) {
        for (int i11 = 0; i11 < hVar.f39823d; i11++) {
            UUID uuid = hVar.c(i11).f39825b;
            if (uuid.equals(br.d.f17905d)) {
                return 3;
            }
            if (uuid.equals(br.d.f17906e)) {
                return 2;
            }
            if (uuid.equals(br.d.f17904c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a z0(PlaybackException playbackException, Context context, boolean z11) {
        int i11;
        boolean z12;
        if (playbackException.f39400a == 1001) {
            return new a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z12 = exoPlaybackException.f39381i == 1;
            i11 = exoPlaybackException.f39385m;
        } else {
            i11 = 0;
            z12 = false;
        }
        Throwable th2 = (Throwable) ts.a.e(playbackException.getCause());
        if (!(th2 instanceof IOException)) {
            if (z12 && (i11 == 0 || i11 == 1)) {
                return new a(35, 0);
            }
            if (z12 && i11 == 3) {
                return new a(15, 0);
            }
            if (z12 && i11 == 2) {
                return new a(23, 0);
            }
            if (th2 instanceof MediaCodecRenderer.DecoderInitializationException) {
                return new a(13, ts.p0.T(((MediaCodecRenderer.DecoderInitializationException) th2).f40179d));
            }
            if (th2 instanceof MediaCodecDecoderException) {
                return new a(14, ts.p0.T(((MediaCodecDecoderException) th2).f40138b));
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof AudioSink.InitializationException) {
                return new a(17, ((AudioSink.InitializationException) th2).f39422a);
            }
            if (th2 instanceof AudioSink.WriteException) {
                return new a(18, ((AudioSink.WriteException) th2).f39427a);
            }
            if (ts.p0.f115040a < 16 || !(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(w0(errorCode), errorCode);
        }
        if (th2 instanceof HttpDataSource$InvalidResponseCodeException) {
            return new a(5, ((HttpDataSource$InvalidResponseCodeException) th2).f41036d);
        }
        if ((th2 instanceof HttpDataSource$InvalidContentTypeException) || (th2 instanceof ParserException)) {
            return new a(z11 ? 10 : 11, 0);
        }
        boolean z13 = th2 instanceof HttpDataSource$HttpDataSourceException;
        if (z13 || (th2 instanceof UdpDataSource.UdpDataSourceException)) {
            if (ts.b0.d(context).f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            if (cause instanceof UnknownHostException) {
                return new a(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new a(7, 0);
            }
            return (z13 && ((HttpDataSource$HttpDataSourceException) th2).f41034c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (playbackException.f39400a == 1002) {
            return new a(21, 0);
        }
        if (!(th2 instanceof DrmSession.DrmSessionException)) {
            if (!(th2 instanceof FileDataSource.FileDataSourceException) || !(th2.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) ts.a.e(th2.getCause())).getCause();
            return (ts.p0.f115040a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th3 = (Throwable) ts.a.e(th2.getCause());
        int i12 = ts.p0.f115040a;
        if (i12 >= 21 && (th3 instanceof MediaDrm.MediaDrmStateException)) {
            int iT = ts.p0.T(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new a(w0(iT), iT);
        }
        if (i12 >= 23 && (th3 instanceof MediaDrmResetException)) {
            return new a(27, 0);
        }
        if (i12 >= 18 && (th3 instanceof NotProvisionedException)) {
            return new a(24, 0);
        }
        if (i12 >= 18 && (th3 instanceof DeniedByServerException)) {
            return new a(29, 0);
        }
        if (th3 instanceof UnsupportedDrmException) {
            return new a(23, 0);
        }
        return th3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0);
    }

    public LogSessionId B0() {
        return this.f59039c.getSessionId();
    }

    @Override // cr.b
    public void D(v1 v1Var, cr.b.C1204b c1204b) {
        if (c1204b.d() == 0) {
            return;
        }
        F0(c1204b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        L0(v1Var, c1204b);
        H0(jElapsedRealtime);
        J0(v1Var, c1204b, jElapsedRealtime);
        G0(jElapsedRealtime);
        I0(v1Var, c1204b, jElapsedRealtime);
        if (c1204b.a(1028)) {
            this.f59038b.d(c1204b.c(1028));
        }
    }

    @Override // cr.p1.a
    public void F(cr.b.a aVar, String str) {
        com.google.android.exoplayer2.source.o.b bVar = aVar.f58913d;
        if (bVar == null || !bVar.b()) {
            v0();
            this.f59045i = str;
            this.f59046j = b2.a().setPlayerName("ExoPlayerLib").setPlayerVersion("2.19.1");
            N0(aVar.f58911b, aVar.f58913d);
        }
    }

    @Override // cr.p1.a
    public void G(cr.b.a aVar, String str, boolean z11) {
        com.google.android.exoplayer2.source.o.b bVar = aVar.f58913d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f59045i)) {
            v0();
        }
        this.f59043g.remove(str);
        this.f59044h.remove(str);
    }

    @Override // cr.b
    public void M(cr.b.a aVar, int i11, long j11, long j12) {
        com.google.android.exoplayer2.source.o.b bVar = aVar.f58913d;
        if (bVar != null) {
            String strF = this.f59038b.f(aVar.f58911b, (com.google.android.exoplayer2.source.o.b) ts.a.e(bVar));
            Long l11 = this.f59044h.get(strF);
            Long l12 = this.f59043g.get(strF);
            this.f59044h.put(strF, Long.valueOf((l11 == null ? 0L : l11.longValue()) + j11));
            this.f59043g.put(strF, Long.valueOf((l12 != null ? l12.longValue() : 0L) + ((long) i11)));
        }
    }

    @Override // cr.b
    public void V(cr.b.a aVar, es.h hVar, es.i iVar, IOException iOException, boolean z11) {
        this.f59058v = iVar.f63150a;
    }

    @Override // cr.b
    public void a(cr.b.a aVar, fr.e eVar) {
        this.f59060x += eVar.f66348g;
        this.f59061y += eVar.f66346e;
    }

    @Override // cr.b
    public void f0(cr.b.a aVar, us.z zVar) {
        b bVar = this.f59051o;
        if (bVar != null) {
            com.google.android.exoplayer2.u0 u0Var = bVar.f59065a;
            if (u0Var.f40718r == -1) {
                this.f59051o = new b(u0Var.b().n0(zVar.f116713a).S(zVar.f116714b).G(), bVar.f59066b, bVar.f59067c);
            }
        }
    }

    @Override // cr.b
    public void n(cr.b.a aVar, es.i iVar) {
        if (aVar.f58913d == null) {
            return;
        }
        b bVar = new b((com.google.android.exoplayer2.u0) ts.a.e(iVar.f63152c), iVar.f63153d, this.f59038b.f(aVar.f58911b, (com.google.android.exoplayer2.source.o.b) ts.a.e(aVar.f58913d)));
        int i11 = iVar.f63151b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f59052p = bVar;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f59053q = bVar;
                return;
            }
        }
        this.f59051o = bVar;
    }

    @Override // cr.b
    public void o0(cr.b.a aVar, PlaybackException playbackException) {
        this.f59050n = playbackException;
    }

    @Override // cr.b
    public void q0(cr.b.a aVar, v1.e eVar, v1.e eVar2, int i11) {
        if (i11 == 1) {
            this.f59057u = true;
        }
        this.f59047k = i11;
    }

    @Override // cr.p1.a
    public void E(cr.b.a aVar, String str) {
    }

    @Override // cr.p1.a
    public void K(cr.b.a aVar, String str, String str2) {
    }
}
