package a8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public final class l2 implements a8.b, m2.a {
    private int A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f675a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m2 f677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PlaybackSession f678d;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PlaybackMetrics.Builder f685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f686l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private PlaybackException f689o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private b f690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private b f691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private b f692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p7.u f693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private p7.u f694t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private p7.u f695u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f696v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f697w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f698x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f699y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f700z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f676b = s7.c.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p7.r0.d f680f = new p7.r0.d();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p7.r0.b f681g = new p7.r0.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final HashMap<String, Long> f683i = new HashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<String, Long> f682h = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f679e = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f687m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f688n = 0;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f702b;

        public a(int i11, int i12) {
            this.f701a = i11;
            this.f702b = i12;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p7.u f703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f704b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f705c;

        public b(p7.u uVar, int i11, String str) {
            this.f703a = uVar;
            this.f704b = i11;
            this.f705c = str;
        }
    }

    private l2(Context context, PlaybackSession playbackSession) {
        this.f675a = context.getApplicationContext();
        this.f678d = playbackSession;
        y1 y1Var = new y1();
        this.f677c = y1Var;
        y1Var.d(this);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private boolean I0(b bVar) {
        return bVar != null && bVar.f705c.equals(this.f677c.a());
    }

    public static l2 J0(Context context) {
        MediaMetricsManager mediaMetricsManagerA = f2.a(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerA == null) {
            return null;
        }
        return new l2(context, mediaMetricsManagerA.createPlaybackSession());
    }

    private void K0() {
        PlaybackMetrics.Builder builder = this.f685k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.f685k.setVideoFramesDropped(this.f699y);
            this.f685k.setVideoFramesPlayed(this.f700z);
            Long l11 = this.f682h.get(this.f684j);
            this.f685k.setNetworkTransferDurationMillis(l11 == null ? 0L : l11.longValue());
            Long l12 = this.f683i.get(this.f684j);
            this.f685k.setNetworkBytesRead(l12 == null ? 0L : l12.longValue());
            this.f685k.setStreamSource((l12 == null || l12.longValue() <= 0) ? 0 : 1);
            final PlaybackMetrics playbackMetricsBuild = this.f685k.build();
            this.f676b.execute(new Runnable() { // from class: a8.g2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f631a.f678d.reportPlaybackMetrics(playbackMetricsBuild);
                }
            });
        }
        this.f685k = null;
        this.f684j = null;
        this.A = 0;
        this.f699y = 0;
        this.f700z = 0;
        this.f693s = null;
        this.f694t = null;
        this.f695u = null;
        this.B = false;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int L0(int i11) {
        switch (s7.q0.i0(i11)) {
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

    private static p7.n M0(com.google.common.collect.x<p7.a1.a> xVar) {
        p7.n nVar;
        com.google.common.collect.d1<p7.a1.a> it = xVar.iterator();
        while (it.hasNext()) {
            p7.a1.a next = it.next();
            for (int i11 = 0; i11 < next.f101190a; i11++) {
                if (next.j(i11) && (nVar = next.d(i11).f101548s) != null) {
                    return nVar;
                }
            }
        }
        return null;
    }

    private static int N0(p7.n nVar) {
        for (int i11 = 0; i11 < nVar.f101433d; i11++) {
            UUID uuid = nVar.h(i11).f101435b;
            if (uuid.equals(p7.h.f101351d)) {
                return 3;
            }
            if (uuid.equals(p7.h.f101352e)) {
                return 2;
            }
            if (uuid.equals(p7.h.f101350c)) {
                return 6;
            }
        }
        return 1;
    }

    private static a O0(PlaybackException playbackException, Context context, boolean z11) {
        int i11;
        boolean z12;
        if (playbackException.f9018a == 1001) {
            return new a(20, 0);
        }
        if (playbackException instanceof ExoPlaybackException) {
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            z12 = exoPlaybackException.f9294j == 1;
            i11 = exoPlaybackException.f9298n;
        } else {
            i11 = 0;
            z12 = false;
        }
        Throwable th2 = (Throwable) s7.a.f(playbackException.getCause());
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
                return new a(13, s7.q0.j0(((MediaCodecRenderer.DecoderInitializationException) th2).f10483d));
            }
            if (th2 instanceof MediaCodecDecoderException) {
                return new a(14, ((MediaCodecDecoderException) th2).f10445c);
            }
            if (th2 instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th2 instanceof AudioSink.InitializationException) {
                return new a(17, ((AudioSink.InitializationException) th2).f9339a);
            }
            if (th2 instanceof AudioSink.WriteException) {
                return new a(18, ((AudioSink.WriteException) th2).f9344a);
            }
            if (!(th2 instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th2).getErrorCode();
            return new a(L0(errorCode), errorCode);
        }
        if (th2 instanceof HttpDataSource$InvalidResponseCodeException) {
            return new a(5, ((HttpDataSource$InvalidResponseCodeException) th2).f9128d);
        }
        if ((th2 instanceof HttpDataSource$InvalidContentTypeException) || (th2 instanceof ParserException)) {
            return new a(z11 ? 10 : 11, 0);
        }
        boolean z13 = th2 instanceof HttpDataSource$HttpDataSourceException;
        if (z13 || (th2 instanceof UdpDataSource.UdpDataSourceException)) {
            if (s7.y.e(context).g() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th2.getCause();
            if (cause instanceof UnknownHostException) {
                return new a(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new a(7, 0);
            }
            return (z13 && ((HttpDataSource$HttpDataSourceException) th2).f9126c == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (playbackException.f9018a == 1002) {
            return new a(21, 0);
        }
        if (!(th2 instanceof DrmSession.DrmSessionException)) {
            if (!(th2 instanceof FileDataSource.FileDataSourceException) || !(th2.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) s7.a.f(th2.getCause())).getCause();
            return ((cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th3 = (Throwable) s7.a.f(th2.getCause());
        if (th3 instanceof MediaDrm.MediaDrmStateException) {
            int iJ0 = s7.q0.j0(((MediaDrm.MediaDrmStateException) th3).getDiagnosticInfo());
            return new a(L0(iJ0), iJ0);
        }
        if (th3 instanceof MediaDrmResetException) {
            return new a(27, 0);
        }
        if (th3 instanceof NotProvisionedException) {
            return new a(24, 0);
        }
        if (th3 instanceof DeniedByServerException) {
            return new a(29, 0);
        }
        if (th3 instanceof UnsupportedDrmException) {
            return new a(23, 0);
        }
        return th3 instanceof DefaultDrmSessionManager.MissingSchemeDataException ? new a(28, 0) : new a(30, 0);
    }

    private static Pair<String, String> P0(String str) {
        String[] strArrE1 = s7.q0.E1(str, "-");
        return Pair.create(strArrE1[0], strArrE1.length >= 2 ? strArrE1[1] : null);
    }

    private static int R0(Context context) {
        switch (s7.y.e(context).g()) {
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

    private static int S0(p7.y yVar) {
        p7.y.h hVar = yVar.f101682b;
        if (hVar == null) {
            return 0;
        }
        int iL0 = s7.q0.L0(hVar.f101783a, hVar.f101784b);
        if (iL0 == 0) {
            return 3;
        }
        if (iL0 != 1) {
            return iL0 != 2 ? 1 : 4;
        }
        return 5;
    }

    private static int T0(int i11) {
        if (i11 == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? 1 : 4;
        }
        return 3;
    }

    private void U0(a8.b.C0024b c0024b) {
        for (int i11 = 0; i11 < c0024b.d(); i11++) {
            int iB = c0024b.b(i11);
            a8.b.a aVarC = c0024b.c(iB);
            if (iB == 0) {
                this.f677c.c(aVarC);
            } else if (iB == 11) {
                this.f677c.f(aVarC, this.f686l);
            } else {
                this.f677c.b(aVarC);
            }
        }
    }

    private void V0(long j11) {
        int iR0 = R0(this.f675a);
        if (iR0 != this.f688n) {
            this.f688n = iR0;
            final NetworkEvent networkEventBuild = a2.a().setNetworkType(iR0).setTimeSinceCreatedMillis(j11 - this.f679e).build();
            this.f676b.execute(new Runnable() { // from class: a8.j2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f657a.f678d.reportNetworkEvent(networkEventBuild);
                }
            });
        }
    }

    private void W0(long j11) {
        PlaybackException playbackException = this.f689o;
        if (playbackException == null) {
            return;
        }
        a aVarO0 = O0(playbackException, this.f675a, this.f697w == 4);
        final PlaybackErrorEvent playbackErrorEventBuild = c2.a().setTimeSinceCreatedMillis(j11 - this.f679e).setErrorCode(aVarO0.f701a).setSubErrorCode(aVarO0.f702b).setException(playbackException).build();
        this.f676b.execute(new Runnable() { // from class: a8.k2
            @Override // java.lang.Runnable
            public final void run() {
                this.f668a.f678d.reportPlaybackErrorEvent(playbackErrorEventBuild);
            }
        });
        this.B = true;
        this.f689o = null;
    }

    private void X0(p7.j0 j0Var, a8.b.C0024b c0024b, long j11) {
        if (j0Var.g() != 2) {
            this.f696v = false;
        }
        if (j0Var.a() == null) {
            this.f698x = false;
        } else if (c0024b.a(10)) {
            this.f698x = true;
        }
        int iF1 = f1(j0Var);
        if (this.f687m != iF1) {
            this.f687m = iF1;
            this.B = true;
            final PlaybackStateEvent playbackStateEventBuild = d2.a().setState(this.f687m).setTimeSinceCreatedMillis(j11 - this.f679e).build();
            this.f676b.execute(new Runnable() { // from class: a8.h2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f640a.f678d.reportPlaybackStateEvent(playbackStateEventBuild);
                }
            });
        }
    }

    private void Y0(p7.j0 j0Var, a8.b.C0024b c0024b, long j11) {
        if (c0024b.a(2)) {
            p7.a1 a1VarP = j0Var.p();
            boolean zD = a1VarP.d(2);
            boolean zD2 = a1VarP.d(1);
            boolean zD3 = a1VarP.d(3);
            if (zD || zD2 || zD3) {
                if (!zD) {
                    d1(j11, null, 0);
                }
                if (!zD2) {
                    Z0(j11, null, 0);
                }
                if (!zD3) {
                    b1(j11, null, 0);
                }
            }
        }
        if (I0(this.f690p)) {
            b bVar = this.f690p;
            p7.u uVar = bVar.f703a;
            if (uVar.f101552w != -1) {
                d1(j11, uVar, bVar.f704b);
                this.f690p = null;
            }
        }
        if (I0(this.f691q)) {
            b bVar2 = this.f691q;
            Z0(j11, bVar2.f703a, bVar2.f704b);
            this.f691q = null;
        }
        if (I0(this.f692r)) {
            b bVar3 = this.f692r;
            b1(j11, bVar3.f703a, bVar3.f704b);
            this.f692r = null;
        }
    }

    private void Z0(long j11, p7.u uVar, int i11) {
        if (Objects.equals(this.f694t, uVar)) {
            return;
        }
        if (this.f694t == null && i11 == 0) {
            i11 = 1;
        }
        this.f694t = uVar;
        e1(0, j11, uVar, i11);
    }

    private void a1(p7.j0 j0Var, a8.b.C0024b c0024b) {
        p7.n nVarM0;
        if (c0024b.a(0)) {
            a8.b.a aVarC = c0024b.c(0);
            if (this.f685k != null) {
                c1(aVarC.f583b, aVarC.f585d);
            }
        }
        if (c0024b.a(2) && this.f685k != null && (nVarM0 = M0(j0Var.p().b())) != null) {
            e2.a(s7.q0.l(this.f685k)).setDrmType(N0(nVarM0));
        }
        if (c0024b.a(1011)) {
            this.A++;
        }
    }

    private void b1(long j11, p7.u uVar, int i11) {
        if (Objects.equals(this.f695u, uVar)) {
            return;
        }
        if (this.f695u == null && i11 == 0) {
            i11 = 1;
        }
        this.f695u = uVar;
        e1(2, j11, uVar, i11);
    }

    @RequiresNonNull({"metricsBuilder"})
    private void c1(p7.r0 r0Var, androidx.media3.exoplayer.source.r.b bVar) {
        int iF;
        PlaybackMetrics.Builder builder = this.f685k;
        if (bVar == null || (iF = r0Var.f(bVar.f11103a)) == -1) {
            return;
        }
        r0Var.j(iF, this.f681g);
        r0Var.r(this.f681g.f101462c, this.f680f);
        builder.setStreamType(S0(this.f680f.f101483c));
        p7.r0.d dVar = this.f680f;
        if (dVar.f101493m != -9223372036854775807L && !dVar.f101491k && !dVar.f101489i && !dVar.g()) {
            builder.setMediaDurationMillis(this.f680f.e());
        }
        builder.setPlaybackType(this.f680f.g() ? 2 : 1);
        this.B = true;
    }

    private void d1(long j11, p7.u uVar, int i11) {
        if (Objects.equals(this.f693s, uVar)) {
            return;
        }
        if (this.f693s == null && i11 == 0) {
            i11 = 1;
        }
        this.f693s = uVar;
        e1(1, j11, uVar, i11);
    }

    private void e1(int i11, long j11, p7.u uVar, int i12) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = z1.a(i11).setTimeSinceCreatedMillis(j11 - this.f679e);
        if (uVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(T0(i12));
            String str = uVar.f101543n;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = uVar.f101544o;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = uVar.f101540k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i13 = uVar.f101539j;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = uVar.f101551v;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = uVar.f101552w;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = uVar.G;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = uVar.H;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str4 = uVar.f101533d;
            if (str4 != null) {
                Pair<String, String> pairP0 = P0(str4);
                timeSinceCreatedMillis.setLanguage((String) pairP0.first);
                Object obj = pairP0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f11 = uVar.f101555z;
            if (f11 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f11);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        final TrackChangeEvent trackChangeEventBuild = timeSinceCreatedMillis.build();
        this.f676b.execute(new Runnable() { // from class: a8.i2
            @Override // java.lang.Runnable
            public final void run() {
                this.f648a.f678d.reportTrackChangeEvent(trackChangeEventBuild);
            }
        });
    }

    private int f1(p7.j0 j0Var) {
        int iG = j0Var.g();
        if (this.f696v) {
            return 5;
        }
        if (this.f698x) {
            return 13;
        }
        if (iG == 4) {
            return 11;
        }
        if (iG == 2) {
            int i11 = this.f687m;
            if (i11 == 0 || i11 == 2 || i11 == 12) {
                return 2;
            }
            if (j0Var.t()) {
                return j0Var.I() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iG == 3) {
            if (j0Var.t()) {
                return j0Var.I() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iG != 1 || this.f687m == 0) {
            return this.f687m;
        }
        return 12;
    }

    @Override // a8.b
    public void E(a8.b.a aVar, n8.j jVar) {
        if (aVar.f585d == null) {
            return;
        }
        b bVar = new b((p7.u) s7.a.f(jVar.f93566c), jVar.f93567d, this.f677c.g(aVar.f583b, (androidx.media3.exoplayer.source.r.b) s7.a.f(aVar.f585d)));
        int i11 = jVar.f93565b;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f691q = bVar;
                return;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f692r = bVar;
                return;
            }
        }
        this.f690p = bVar;
    }

    public LogSessionId Q0() {
        return this.f678d.getSessionId();
    }

    @Override // a8.m2.a
    public void Z(a8.b.a aVar, String str, boolean z11) {
        androidx.media3.exoplayer.source.r.b bVar = aVar.f585d;
        if ((bVar == null || !bVar.b()) && str.equals(this.f684j)) {
            K0();
        }
        this.f682h.remove(str);
        this.f683i.remove(str);
    }

    @Override // a8.b
    public void f0(p7.j0 j0Var, a8.b.C0024b c0024b) {
        if (c0024b.d() == 0) {
            return;
        }
        U0(c0024b);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a1(j0Var, c0024b);
        W0(jElapsedRealtime);
        Y0(j0Var, c0024b, jElapsedRealtime);
        V0(jElapsedRealtime);
        X0(j0Var, c0024b, jElapsedRealtime);
        if (c0024b.a(1028)) {
            this.f677c.e(c0024b.c(1028));
        }
    }

    @Override // a8.b
    public void k(a8.b.a aVar, int i11, long j11, long j12) {
        androidx.media3.exoplayer.source.r.b bVar = aVar.f585d;
        if (bVar != null) {
            String strG = this.f677c.g(aVar.f583b, (androidx.media3.exoplayer.source.r.b) s7.a.f(bVar));
            Long l11 = this.f683i.get(strG);
            Long l12 = this.f682h.get(strG);
            this.f683i.put(strG, Long.valueOf((l11 == null ? 0L : l11.longValue()) + j11));
            this.f682h.put(strG, Long.valueOf((l12 != null ? l12.longValue() : 0L) + ((long) i11)));
        }
    }

    @Override // a8.b
    public void m0(a8.b.a aVar, p7.e1 e1Var) {
        b bVar = this.f690p;
        if (bVar != null) {
            p7.u uVar = bVar.f703a;
            if (uVar.f101552w == -1) {
                this.f690p = new b(uVar.b().F0(e1Var.f101332a).h0(e1Var.f101333b).P(), bVar.f704b, bVar.f705c);
            }
        }
    }

    @Override // a8.b
    public void q(a8.b.a aVar, n8.i iVar, n8.j jVar, IOException iOException, boolean z11) {
        this.f697w = jVar.f93564a;
    }

    @Override // a8.b
    public void u0(a8.b.a aVar, z7.b bVar) {
        this.f699y += bVar.f127067g;
        this.f700z += bVar.f127065e;
    }

    @Override // a8.b
    public void x0(a8.b.a aVar, PlaybackException playbackException) {
        this.f689o = playbackException;
    }

    @Override // a8.b
    public void y(a8.b.a aVar, p7.j0.e eVar, p7.j0.e eVar2, int i11) {
        if (i11 == 1) {
            this.f696v = true;
        }
        this.f686l = i11;
    }

    @Override // a8.m2.a
    public void y0(a8.b.a aVar, String str) {
        androidx.media3.exoplayer.source.r.b bVar = aVar.f585d;
        if (bVar == null || !bVar.b()) {
            K0();
            this.f684j = str;
            this.f685k = b2.a().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            c1(aVar.f583b, aVar.f585d);
        }
    }

    @Override // a8.m2.a
    public void e(a8.b.a aVar, String str) {
    }

    @Override // a8.m2.a
    public void n0(a8.b.a aVar, String str, String str2) {
    }
}
