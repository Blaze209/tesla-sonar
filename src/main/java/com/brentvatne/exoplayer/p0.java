package com.brentvatne.exoplayer;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.PictureInPictureParams;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.ui.PlayerView;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.DebugKt;
import org.webrtc.MediaStreamTrack;
import p7.a1;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public class p0 extends FrameLayout implements LifecycleEventListener, p7.j0.d, s8.d.a, zi.b, androidx.media3.exoplayer.drm.h {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final CookieManager f20353y0;
    private com.brentvatne.exoplayer.a A;
    private float B;
    private int C;
    private boolean D;
    private boolean E;
    private boolean F;
    private final Handler G;
    private Runnable H;
    private Runnable I;
    private boolean J;
    private boolean K;
    private vi.e L;
    private ArrayList<Integer> M;
    private boolean N;
    private long O;
    private boolean P;
    private vi.i Q;
    private boolean R;
    private String S;
    private String T;
    private String U;
    private String V;
    private String W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final wi.u0 f20354a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f20355a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f20356b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f20357b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s8.i f20358c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f20359c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f20360d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private vi.c.a f20361d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private n f20362e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f20363e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h8.a f20364f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f20365f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.media3.datasource.a.InterfaceC0192a f20366g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private float f20367g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ExoPlayer f20368h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    protected boolean f20369h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r8.n f20370i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f20371i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20372j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f20373j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ServiceConnection f20374k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f20375k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private v f20376l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final com.facebook.react.uimanager.v0 f20377l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private t8.a f20378m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final AudioManager f20379m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20380n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final zi.a f20381n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20382o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final zi.c f20383o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f20384p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f20385p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f20386q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private long f20387q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f20388r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private long f20389r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f20390s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private long f20391s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f20392t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f20393t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f20394u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f20395u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f20396v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private final String f20397v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f20398w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private s8.e.a f20399w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private PictureInPictureParams.Builder f20400x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private final Handler f20401x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f20402y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f20403z;

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                p0.this.S1();
                sendMessageDelayed(obtainMessage(1), Math.round(p0.this.f20367g0));
            }
        }
    }

    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            xi.a.b("ReactExoplayerView", "Could not register ExoPlayer");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            p0.this.f20376l = (v) iBinder;
            try {
                Activity currentActivity = p0.this.f20377l0.getCurrentActivity();
                if (currentActivity != null) {
                    p0.this.f20376l.getService().D(p0.this.f20368h, currentActivity.getClass());
                } else {
                    xi.a.f("ReactExoplayerView", "Could not register ExoPlayer: currentActivity is null");
                }
            } catch (Exception e11) {
                xi.a.b("ReactExoplayerView", "Could not register ExoPlayer: " + e11.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            try {
                if (p0.this.f20376l != null) {
                    p0.this.f20376l.getService().E(p0.this.f20368h);
                }
            } catch (Exception unused) {
            }
            p0.this.f20376l = null;
        }
    }

    class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.media3.datasource.a f20406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Uri f20407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f20408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.media3.datasource.a f20409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Uri f20410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f20411f;

        c(androidx.media3.datasource.a aVar, Uri uri, long j11) {
            this.f20409d = aVar;
            this.f20410e = uri;
            this.f20411f = j11;
            this.f20406a = aVar;
            this.f20407b = uri;
            this.f20408c = j11 * 1000;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<vi.m> call() {
            int i11;
            ArrayList<vi.m> arrayList = new ArrayList<>();
            try {
                d8.c cVarB = c8.f.b(this.f20406a, this.f20407b);
                int iE = cVarB.e();
                int i12 = 0;
                while (i12 < iE) {
                    d8.g gVarD = cVarB.d(i12);
                    int i13 = 0;
                    while (i13 < gVarD.f59816c.size()) {
                        d8.a aVar = gVarD.f59816c.get(i13);
                        if (aVar.f59769b != 2) {
                            i11 = i12;
                        } else {
                            int i14 = 0;
                            boolean z11 = false;
                            while (true) {
                                if (i14 >= aVar.f59770c.size()) {
                                    i11 = i12;
                                    break;
                                }
                                d8.j jVar = aVar.f59770c.get(i14);
                                p7.u uVar = jVar.f59829b;
                                if (p0.this.l1(uVar)) {
                                    i11 = i12;
                                    if (jVar.f59831d <= this.f20408c) {
                                        break;
                                    }
                                    arrayList.add(p0.this.U0(uVar, i14));
                                    z11 = true;
                                } else {
                                    i11 = i12;
                                }
                                i14++;
                                i12 = i11;
                            }
                            if (z11) {
                                return arrayList;
                            }
                        }
                        i13++;
                        i12 = i11;
                    }
                    i12++;
                }
                return null;
            } catch (Exception e11) {
                xi.a.f("ReactExoplayerView", "error in getVideoTrackInfoFromManifest:" + e11.getMessage());
                return null;
            }
        }
    }

    class d extends androidx.p002activity.b0 {
        d(boolean z11) {
            super(z11);
        }

        @Override // androidx.p002activity.b0
        public void handleOnBackPressed() {
            p0.this.setFullscreen(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p0 f20414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.facebook.react.uimanager.v0 f20415b;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            this.f20414a.f20368h.k(this.f20414a.B * 0.8f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e() {
            this.f20414a.f20368h.k(this.f20414a.B * 1.0f);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i11) {
            Activity currentActivity = this.f20415b.getCurrentActivity();
            if (i11 == -2) {
                this.f20414a.f20354a.onAudioFocusChanged.invoke(Boolean.FALSE);
            } else if (i11 == -1) {
                this.f20414a.f20402y = false;
                this.f20414a.f20354a.onAudioFocusChanged.invoke(Boolean.FALSE);
                if (currentActivity != null) {
                    final p0 p0Var = this.f20414a;
                    Objects.requireNonNull(p0Var);
                    currentActivity.runOnUiThread(new Runnable() { // from class: com.brentvatne.exoplayer.q0
                        @Override // java.lang.Runnable
                        public final void run() {
                            p0Var.C1();
                        }
                    });
                }
                this.f20414a.f20379m0.abandonAudioFocus(this);
            } else if (i11 == 1) {
                this.f20414a.f20402y = true;
                this.f20414a.f20354a.onAudioFocusChanged.invoke(Boolean.TRUE);
            }
            if (this.f20414a.f20368h == null || currentActivity == null) {
                return;
            }
            if (i11 == -3) {
                if (this.f20414a.f20396v) {
                    return;
                }
                currentActivity.runOnUiThread(new Runnable() { // from class: com.brentvatne.exoplayer.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20423a.d();
                    }
                });
            } else {
                if (i11 != 1 || this.f20414a.f20396v) {
                    return;
                }
                currentActivity.runOnUiThread(new Runnable() { // from class: com.brentvatne.exoplayer.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20427a.e();
                    }
                });
            }
        }

        private e(p0 p0Var, com.facebook.react.uimanager.v0 v0Var) {
            this.f20414a = p0Var;
            this.f20415b = v0Var;
        }
    }

    private class f extends androidx.media3.exoplayer.j {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f20416m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Runtime f20417n;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(s8.g gVar, vi.b bVar) {
            int minBufferMs = bVar.getMinBufferMs();
            vi.b.Companion companion = vi.b.INSTANCE;
            super(gVar, minBufferMs != companion.b() ? bVar.getMinBufferMs() : 50000, bVar.getMaxBufferMs() != companion.b() ? bVar.getMaxBufferMs() : 50000, bVar.getBufferForPlaybackMs() != companion.b() ? bVar.getBufferForPlaybackMs() : 1000, bVar.getBufferForPlaybackAfterRebufferMs() != companion.b() ? bVar.getBufferForPlaybackAfterRebufferMs() : 2000, -1, true, bVar.getBackBufferDurationMs() != companion.b() ? bVar.getBackBufferDurationMs() : 0, false);
            this.f20417n = Runtime.getRuntime();
            this.f20416m = (int) Math.floor(((double) ((ActivityManager) p0.this.f20377l0.getSystemService("activity")).getMemoryClass()) * (bVar.getMaxHeapAllocationPercent() != companion.a() ? bVar.getMaxHeapAllocationPercent() : 1.0d) * 1024.0d * 1024.0d);
        }

        @Override // androidx.media3.exoplayer.n1
        public boolean d(long j11, long j12, float f11) {
            if (p0.this.f20361d0 == vi.c.a.DisableBuffering) {
                return false;
            }
            if (p0.this.f20361d0 == vi.c.a.DependingOnMemory) {
                int iE = g().e();
                int i11 = this.f20416m;
                if (i11 > 0 && iE >= i11) {
                    return false;
                }
                long j13 = j12 / 1000;
                if (((long) (p0.this.Q.getBufferConfig().getMinBufferMemoryReservePercent() != vi.b.INSTANCE.a() ? p0.this.Q.getBufferConfig().getMinBufferMemoryReservePercent() : 0.0d)) * this.f20417n.maxMemory() > this.f20417n.maxMemory() - (this.f20417n.totalMemory() - this.f20417n.freeMemory()) && j13 > 2000) {
                    return false;
                }
                if (this.f20417n.freeMemory() == 0) {
                    xi.a.f("ReactExoplayerView", "Free memory reached 0, forcing garbage collection");
                    this.f20417n.gc();
                    return false;
                }
            }
            return super.d(j11, j12, f11);
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        f20353y0 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public p0(com.facebook.react.uimanager.v0 v0Var, y yVar) {
        super(v0Var);
        this.f20378m = null;
        this.f20380n = false;
        this.f20396v = false;
        this.f20398w = false;
        this.f20402y = false;
        this.f20403z = 1.0f;
        this.A = com.brentvatne.exoplayer.a.SPEAKER;
        this.B = 1.0f;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.J = false;
        this.K = false;
        this.L = new vi.e();
        this.M = new ArrayList<>();
        this.N = false;
        this.O = -1L;
        this.P = false;
        this.Q = new vi.i();
        this.W = "disabled";
        this.f20359c0 = true;
        this.f20365f0 = true;
        this.f20367g0 = 250.0f;
        this.f20369h0 = false;
        this.f20371i0 = false;
        this.f20373j0 = false;
        this.f20375k0 = false;
        this.f20387q0 = -1L;
        this.f20389r0 = -1L;
        this.f20391s0 = -1L;
        this.f20393t0 = false;
        this.f20395u0 = 1;
        this.f20397v0 = String.valueOf(UUID.randomUUID());
        this.f20401x0 = new a(Looper.getMainLooper());
        this.f20377l0 = v0Var;
        this.f20354a = new wi.u0();
        this.f20356b = yVar;
        this.f20358c = yVar.getBandWidthMeter();
        if (Build.VERSION.SDK_INT >= 26 && this.f20400x == null) {
            this.f20400x = a0.a();
        }
        this.G = new Handler();
        P0();
        this.f20379m0 = (AudioManager) v0Var.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        v0Var.addLifecycleEventListener(this);
        this.f20381n0 = new zi.a(v0Var);
        this.f20385p0 = new e(v0Var);
        this.f20383o0 = new zi.c(this, v0Var);
    }

    private void A0() {
        Q1();
    }

    private void A1(boolean z11) {
        if (this.f20394u == z11) {
            return;
        }
        if (this.f20392t && this.N && !z11) {
            this.f20354a.onVideoSeek.invoke(Long.valueOf(this.f20368h.D()), Long.valueOf(this.O));
            this.N = false;
        }
        this.f20394u = z11;
        this.f20354a.onVideoBuffer.invoke(Boolean.valueOf(z11));
    }

    private void B0() {
        setRepeatModifier(this.R);
        setMutedModifier(this.f20396v);
    }

    private void B1() {
        this.f20379m0.abandonAudioFocus(this.f20385p0);
    }

    private androidx.media3.datasource.a.InterfaceC0192a C0(boolean z11) {
        return i.f(this.f20377l0, z11 ? this.f20358c : null, this.Q.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C1() {
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer != null && exoPlayer.t()) {
            setPlayWhenReady(false);
        }
        setKeepScreenOn(false);
    }

    private androidx.media3.exoplayer.drm.i D0(UUID uuid, vi.f fVar) throws UnsupportedDrmException {
        if (s7.q0.f110454a < 18) {
            return null;
        }
        try {
            yi.c.Companion companion = yi.c.INSTANCE;
            g customDRMManager = companion.a().getCustomDRMManager();
            if (customDRMManager == null) {
                customDRMManager = new com.brentvatne.exoplayer.f(E0(false));
            }
            androidx.media3.exoplayer.drm.i iVarA = customDRMManager.a(uuid, fVar);
            if (iVarA == null) {
                this.f20354a.onVideoError.invoke("Failed to build DRM session manager", new Exception("DRM session manager is null"), "3007");
            }
            androidx.media3.exoplayer.drm.i iVarA2 = companion.a().a(this.Q, iVarA);
            return iVarA2 != null ? iVarA2 : iVarA;
        } catch (UnsupportedDrmException e11) {
            throw e11;
        } catch (Exception e12) {
            this.f20354a.onVideoError.invoke(e12.toString(), e12, "3006");
            return null;
        }
    }

    private void D1(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    private androidx.media3.datasource.g E0(boolean z11) {
        return i.g(this.f20377l0, z11 ? this.f20358c : null, this.Q.j());
    }

    private void E1() {
        D1(this.f20360d);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    /* JADX WARN: Code duplicated, block: B:62:0x0188  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4 A[RETURN] */
    private androidx.media3.exoplayer.source.r F0(Uri uri, String str, final androidx.media3.exoplayer.drm.i iVar, long j11, long j12) {
        String lastPathSegment;
        int iJ0;
        androidx.media3.exoplayer.source.r.a factory;
        androidx.media3.exoplayer.source.r.a aVarE;
        final s8.e.a aVar;
        p7.y.c cVarF;
        p7.y yVarA;
        androidx.media3.exoplayer.source.r rVarG;
        if (uri == null) {
            throw new IllegalStateException("Invalid video uri");
        }
        if ("rtsp".equals(str)) {
            iJ0 = 3;
        } else {
            if (TextUtils.isEmpty(str)) {
                lastPathSegment = uri.getLastPathSegment();
            } else {
                lastPathSegment = "." + str;
            }
            iJ0 = s7.q0.J0(lastPathSegment);
        }
        this.f20356b.d(this.f20363e0);
        p7.y.c cVarI = new p7.y.c().i(uri);
        p7.e0 e0VarA = com.brentvatne.exoplayer.d.a(this.Q.getCom.fourthline.adapters.serialization.OrcaKeys.METADATA java.lang.String());
        if (e0VarA != null) {
            cVarI.d(e0VarA);
        }
        List<p7.y.k> listG0 = G0();
        if (listG0 != null) {
            cVarI.g(listG0);
        }
        this.Q.b();
        cVarI.b(com.brentvatne.exoplayer.d.b(this.Q.getBufferConfig()).f());
        ArrayList arrayList = new ArrayList();
        e8.k gVar = iVar != null ? new e8.k() { // from class: com.brentvatne.exoplayer.c0
            @Override // e8.k
            public final androidx.media3.exoplayer.drm.i a(p7.y yVar) {
                return p0.L(iVar, yVar);
            }
        } : new androidx.media3.exoplayer.drm.g();
        if (iJ0 != 0) {
            if (iJ0 == 1) {
                factory = new SsMediaSource.Factory(new androidx.media3.exoplayer.smoothstreaming.a.C0202a(this.f20366g), C0(false));
            } else if (iJ0 == 2) {
                androidx.media3.datasource.a.InterfaceC0192a interfaceC0192aA = this.f20366g;
                if (this.J && !this.K) {
                    interfaceC0192aA = x.f20439a.a(E0(true));
                }
                aVarE = new HlsMediaSource.Factory(interfaceC0192aA).k(this.Q.getTextTracksAllowChunklessPreparation());
            } else {
                if (iJ0 == 3) {
                    xi.a.b("Exo Player Exception", "RTSP is not enabled!");
                    throw new IllegalStateException("RTSP is not enabled!");
                }
                if (iJ0 != 4) {
                    throw new IllegalStateException("Unsupported type: " + iJ0);
                }
                if ("asset".equals(uri.getScheme())) {
                    try {
                        aVarE = new androidx.media3.exoplayer.source.c0.b(i.b(this.f20377l0, uri));
                    } catch (Exception unused) {
                        throw new IllegalStateException("cannot open input file:" + uri);
                    }
                } else {
                    aVarE = (Action.FILE_ATTRIBUTE.equals(uri.getScheme()) || !this.J) ? new androidx.media3.exoplayer.source.c0.b(this.f20366g) : new androidx.media3.exoplayer.source.c0.b(x.f20439a.a(E0(true)));
                }
            }
            aVar = this.f20399w0;
            if (aVar != null) {
                Objects.requireNonNull(aVar);
                aVarE = aVarE.e(new s8.e.a() { // from class: com.brentvatne.exoplayer.d0
                    @Override // s8.e.a
                    public final s8.e a(p7.y yVar) {
                        return aVar.a(yVar);
                    }
                });
            }
            yi.c.Companion companion = yi.c.INSTANCE;
            androidx.media3.exoplayer.source.r.a aVar2 = (androidx.media3.exoplayer.source.r.a) b0.a(companion.a().b(this.Q, aVarE, this.f20366g), aVarE);
            cVarI.f(arrayList);
            cVarF = companion.a().f(this.Q, cVarI);
            if (cVarF != null) {
                yVarA = cVarF.a();
            } else {
                yVarA = cVarI.a();
            }
            rVarG = aVar2.d(gVar).f(this.f20356b.a(this.Q.getMinLoadRetryCount())).g(yVarA);
            if (j11 < 0 && j12 >= 0) {
                return new ClippingMediaSource(rVarG, j11 * 1000, j12 * 1000);
            }
            if (j11 >= 0) {
                return new ClippingMediaSource(rVarG, 1000 * j11, Long.MIN_VALUE);
            }
            if (j12 >= 0) {
                return new ClippingMediaSource(rVarG, 0L, j12 * 1000);
            }
            return rVarG;
        }
        factory = new DashMediaSource.Factory(new androidx.media3.exoplayer.dash.d.a(this.f20366g), C0(false));
        aVarE = factory;
        aVar = this.f20399w0;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            aVarE = aVarE.e(new s8.e.a() { // from class: com.brentvatne.exoplayer.d0
                @Override // s8.e.a
                public final s8.e a(p7.y yVar) {
                    return aVar.a(yVar);
                }
            });
        }
        yi.c.Companion companion2 = yi.c.INSTANCE;
        androidx.media3.exoplayer.source.r.a aVar3 = (androidx.media3.exoplayer.source.r.a) b0.a(companion2.a().b(this.Q, aVarE, this.f20366g), aVarE);
        cVarI.f(arrayList);
        cVarF = companion2.a().f(this.Q, cVarI);
        if (cVarF != null) {
            yVarA = cVarF.a();
        } else {
            yVarA = cVarI.a();
        }
        rVarG = aVar3.d(gVar).f(this.f20356b.a(this.Q.getMinLoadRetryCount())).g(yVarA);
        if (j11 < 0) {
        }
        if (j11 >= 0) {
            return new ClippingMediaSource(rVarG, 1000 * j11, Long.MIN_VALUE);
        }
        if (j12 >= 0) {
            return new ClippingMediaSource(rVarG, 0L, j12 * 1000);
        }
        return rVarG;
    }

    private void F1() {
        if (this.f20360d == null || this.f20368h == null || !this.f20373j0) {
            return;
        }
        R1();
    }

    private List<p7.y.k> G0() {
        String str;
        if (this.Q.getSideLoadedTextTracks() == null || this.Q.getSideLoadedTextTracks().a().isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (vi.g gVar : this.Q.getSideLoadedTextTracks().a()) {
            try {
                String str2 = "external-subtitle-" + i11;
                String title = gVar.getTitle();
                if (title == null || title.isEmpty()) {
                    title = "External " + (i11 + 1);
                    if (gVar.getLanguage() != null && !gVar.getLanguage().isEmpty()) {
                        title = title + " (" + gVar.getLanguage() + ")";
                    }
                }
                p7.y.k.a aVarO = new p7.y.k.a(gVar.getUri()).k(str2).n(gVar.getType()).l(title).o(128);
                if (gVar.getLanguage() != null && !gVar.getLanguage().isEmpty()) {
                    aVarO.m(gVar.getLanguage());
                }
                if (i11 == 0 && ((str = this.W) == null || "disabled".equals(str))) {
                    aVarO.p(1);
                } else {
                    aVarO.p(0);
                }
                arrayList.add(aVarO.i());
                xi.a.a("ReactExoplayerView", "Created subtitle configuration: " + str2 + " - " + title + " (" + gVar.getType() + ")");
                i11++;
            } catch (Exception e11) {
                xi.a.b("ReactExoplayerView", "Error creating SubtitleConfiguration for URI " + gVar.getUri() + ": " + e11.getMessage());
            }
        }
        if (!arrayList.isEmpty()) {
            xi.a.a("ReactExoplayerView", "Built " + arrayList.size() + " external subtitle configurations");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private void G1() {
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer == null) {
            return;
        }
        if (this.f20380n) {
            t8.a aVar = new t8.a("RNVExoplayer");
            this.f20378m = aVar;
            this.f20368h.W0(aVar);
        } else {
            t8.a aVar2 = this.f20378m;
            if (aVar2 != null) {
                exoPlayer.S0(aVar2);
                this.f20378m = null;
            }
        }
    }

    private void H0(com.brentvatne.exoplayer.a aVar) {
        if (this.f20368h != null) {
            int streamType = aVar.getStreamType();
            this.f20368h.o0(new p7.d.e().g(s7.q0.R(streamType)).c(s7.q0.O(streamType)).a(), false);
            AudioManager audioManager = (AudioManager) this.f20377l0.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            boolean z11 = aVar == com.brentvatne.exoplayer.a.SPEAKER;
            audioManager.setMode(z11 ? 0 : 3);
            audioManager.setSpeakerphoneOn(z11);
        }
    }

    private void H1() {
        Runnable runnable;
        if (this.f20368h != null) {
            v vVar = this.f20376l;
            if (vVar != null) {
                vVar.getService().E(this.f20368h);
                this.f20377l0.unbindService(this.f20374k);
            }
            T1();
            this.f20368h.release();
            this.f20368h.e0(this);
            t.h(this.f20377l0, this.f20400x, false);
            Runnable runnable2 = this.I;
            if (runnable2 != null) {
                runnable2.run();
            }
            this.f20370i = null;
            yi.c.INSTANCE.a().c(this.f20397v0, this.f20368h);
            this.f20368h = null;
        }
        h8.a aVar = this.f20364f;
        if (aVar != null) {
            aVar.a();
            this.f20364f = null;
        }
        this.f20401x0.removeMessages(1);
        this.f20381n0.a();
        this.f20383o0.b();
        this.f20358c.g(this);
        Handler handler = this.G;
        if (handler == null || (runnable = this.H) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.H = null;
    }

    private boolean I1() {
        return this.f20357b0 || this.Q.getUri() == null || this.f20402y || this.f20379m0.requestAudioFocus(this.f20385p0, 3, 1) == 1;
    }

    private void J0() {
        v vVar;
        try {
            if (this.f20368h != null && (vVar = this.f20376l) != null) {
                vVar.getService().E(this.f20368h);
            }
            this.f20376l = null;
            ServiceConnection serviceConnection = this.f20374k;
            if (serviceConnection != null) {
                this.f20377l0.unbindService(serviceConnection);
            }
        } catch (Exception unused) {
            xi.a.f("ReactExoplayerView", "Cloud not cleanup playback service");
        }
    }

    private void J1(vi.i iVar) {
        h8.a aVar = this.f20364f;
        if (aVar == null) {
            this.f20354a.onVideoError.invoke("DaiAdsLoader is null", null, "DAI_ADS_LOADER_NULL_ERROR");
        } else {
            aVar.b(this.f20368h);
            iVar.b();
            throw null;
        }
    }

    private void K0() {
        this.f20401x0.removeMessages(1);
    }

    private void K1() {
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer != null) {
            if (!exoPlayer.t()) {
                setPlayWhenReady(true);
            }
            setKeepScreenOn(this.f20365f0);
        }
    }

    public static /* synthetic */ androidx.media3.exoplayer.drm.i L(androidx.media3.exoplayer.drm.i iVar, p7.y yVar) {
        return iVar;
    }

    private void L0() {
        this.f20382o = -1;
        this.f20384p = -9223372036854775807L;
    }

    private void M1(String str, String str2) {
        int iZ0;
        String str3;
        String str4;
        if (this.f20368h == null || this.f20370i == null) {
            return;
        }
        xi.a.a("ReactExoplayerView", "selectTextTrackInternal: type=" + str + ", value=" + str2);
        r8.n.e.a aVarI = this.f20370i.b().I();
        if ("disabled".equals(str) || str2 == null) {
            aVarI.W(3, true);
        } else {
            aVarI.W(3, false);
            aVarI.I(3);
            r8.w.a aVarO = this.f20370i.o();
            if (aVarO != null && (iZ0 = Z0(3)) != -1) {
                n8.y yVarF = aVarO.f(iZ0);
                boolean z11 = false;
                for (int i11 = 0; i11 < yVarF.f93615a; i11++) {
                    p7.t0 t0VarB = yVarF.b(i11);
                    for (int i12 = 0; i12 < t0VarB.f101499a; i12++) {
                        p7.u uVarC = t0VarB.c(i12);
                        if (("language".equals(str) && (str4 = uVarC.f101533d) != null && str4.equals(str2)) || (("title".equals(str) && (str3 = uVarC.f101531b) != null && str3.equals(str2)) || ("index".equals(str) && xi.b.i(str2, -1) == i12))) {
                            aVarI.F(new p7.u0(t0VarB, Arrays.asList(Integer.valueOf(i12))));
                            z11 = true;
                            break;
                        }
                    }
                    if (z11) {
                        break;
                    }
                }
                if (!z11) {
                    xi.a.f("ReactExoplayerView", "Text track not found for type=" + str + ", value=" + str2 + ". Keeping current selection.");
                }
            }
        }
        try {
            this.f20370i.m(aVarI.G());
            this.G.postDelayed(new Runnable() { // from class: com.brentvatne.exoplayer.h0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20305a.w1();
                }
            }, 100L);
        } catch (Exception e11) {
            xi.a.b("ReactExoplayerView", "Error setting text track parameters: " + e11.getMessage());
        }
    }

    private h8.a N0() {
        return new h8.a.C1488a(getContext(), this.f20360d.getPlayerView()).c(this).b(this).a();
    }

    private void N1() {
        if (!this.f20375k0 || this.f20368h == null) {
            return;
        }
        this.f20374k = new b();
        Intent intent = new Intent(this.f20377l0, (Class<?>) w0.class);
        intent.setAction("androidx.media3.session.MediaSessionService");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f20377l0.startForegroundService(intent);
        } else {
            this.f20377l0.startService(intent);
        }
        this.f20377l0.bindService(intent, this.f20374k, i11 >= 29 ? 4097 : 1);
    }

    private androidx.media3.exoplayer.source.i O0() {
        this.f20364f = N0();
        androidx.media3.exoplayer.source.i iVar = new androidx.media3.exoplayer.source.i(new androidx.media3.datasource.c.a(getContext()));
        iVar.v(new h8.b(this.f20364f, iVar));
        return iVar;
    }

    private void O1() {
        this.f20401x0.sendEmptyMessage(1);
    }

    private void P0() {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = f20353y0;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        l lVar = new l(getContext());
        this.f20360d = lVar;
        lVar.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.brentvatne.exoplayer.k0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                this.f20317a.p1(view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        });
        this.f20360d.setLayoutParams(layoutParams);
        addView(this.f20360d, 0, layoutParams);
        this.f20360d.setFocusable(this.f20359c0);
    }

    private void P1() {
        B1();
        H1();
    }

    private void Q1() {
        l lVar = this.f20360d;
        if (lVar == null) {
            return;
        }
        lVar.setControllerShowTimeoutMs(5000);
        this.f20360d.setControllerAutoShow(true);
        this.f20360d.setControllerHideOnTouch(true);
        R1();
    }

    private void R1() {
        l lVar = this.f20360d;
        if (lVar == null) {
            return;
        }
        lVar.setUseController(this.f20373j0 && !this.L.getHideFullscreen());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1() {
        if (this.f20368h != null) {
            if (this.f20360d != null && m1() && this.f20373j0) {
                this.f20360d.e();
            }
            long jW0 = (((long) this.f20368h.w0()) * this.f20368h.getDuration()) / 100;
            long duration = this.f20368h.getDuration();
            long jD = this.f20368h.D();
            if (jD > duration) {
                jD = duration;
            }
            if (this.f20387q0 == jD && this.f20389r0 == jW0 && this.f20391s0 == duration) {
                return;
            }
            this.f20387q0 = jD;
            this.f20389r0 = jW0;
            this.f20391s0 = duration;
            this.f20354a.onVideoProgress.invoke(Long.valueOf(jD), Long.valueOf(jW0), Long.valueOf(this.f20368h.getDuration()), Double.valueOf(Y0(jD)));
        }
    }

    private vi.l T0(p7.u uVar, int i11, r8.x xVar, p7.t0 t0Var) {
        vi.l lVar = new vi.l();
        lVar.g(i11);
        String str = uVar.f101544o;
        if (str != null) {
            lVar.i(str);
        }
        String str2 = uVar.f101533d;
        if (str2 != null) {
            lVar.h(str2);
        }
        String str3 = uVar.f101531b;
        if (str3 != null) {
            lVar.k(str3);
        }
        lVar.j(n1(xVar, t0Var, i11));
        return lVar;
    }

    private void T1() {
        this.f20382o = this.f20368h.R();
        this.f20384p = this.f20368h.n0() ? Math.max(0L, this.f20368h.D()) : -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vi.m U0(p7.u uVar, int i11) {
        vi.m mVar = new vi.m();
        int i12 = uVar.f101551v;
        if (i12 == -1) {
            i12 = 0;
        }
        mVar.o(i12);
        int i13 = uVar.f101552w;
        if (i13 == -1) {
            i13 = 0;
        }
        mVar.k(i13);
        int i14 = uVar.f101539j;
        mVar.i(i14 != -1 ? i14 : 0);
        mVar.m(uVar.A);
        String str = uVar.f101540k;
        if (str != null) {
            mVar.j(str);
        }
        String strValueOf = uVar.f101530a;
        if (strValueOf == null) {
            strValueOf = String.valueOf(i11);
        }
        mVar.n(strValueOf);
        mVar.l(i11);
        return mVar;
    }

    private void U1() {
        if (this.f20360d == null) {
            return;
        }
        this.f20360d.setShowSubtitleButton(!(this.Q.getSideLoadedTextTracks() == null || this.Q.getSideLoadedTextTracks().a().isEmpty()) || b1());
    }

    private void V0() {
        f1();
        setControls(this.f20373j0);
        B0();
    }

    private void V1() {
        final int i11;
        int i12;
        if (this.f20368h.m() || !this.f20386q) {
            return;
        }
        int i13 = 0;
        this.f20386q = false;
        String str = this.S;
        if (str != null) {
            setSelectedAudioTrack(str, this.T);
        }
        String str2 = this.U;
        if (str2 != null) {
            setSelectedVideoTrack(str2, this.V);
        }
        String str3 = this.W;
        if (str3 != null) {
            setSelectedTextTrack(str3, this.f20355a0);
        }
        p7.u uVarV0 = this.f20368h.V0();
        boolean z11 = uVarV0 != null && ((i12 = uVarV0.A) == 90 || i12 == 270);
        if (uVarV0 != null) {
            i11 = z11 ? uVarV0.f101552w : uVarV0.f101551v;
        } else {
            i11 = 0;
        }
        if (uVarV0 != null) {
            i13 = z11 ? uVarV0.f101551v : uVarV0.f101552w;
        }
        final int i14 = i13;
        final String str4 = uVarV0 != null ? uVarV0.f101530a : null;
        final long duration = this.f20368h.getDuration();
        final long jD = this.f20368h.D();
        final ArrayList<vi.l> audioTrackInfo = getAudioTrackInfo();
        final ArrayList<vi.l> textTrackInfo = getTextTrackInfo();
        if (this.Q.getContentStartTime() != -1) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.brentvatne.exoplayer.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20292a.z1(duration, jD, i11, i14, audioTrackInfo, textTrackInfo, str4);
                }
            });
            return;
        }
        this.f20354a.onVideoLoad.g(Long.valueOf(duration), Long.valueOf(jD), Integer.valueOf(i11), Integer.valueOf(i14), audioTrackInfo, textTrackInfo, getVideoTrackInfo(), str4);
        U1();
        F1();
    }

    private int X0(n8.y yVar) {
        if (yVar.f93615a == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i11 = 0; i11 < yVar.f93615a; i11++) {
            String str = yVar.b(i11).c(0).f101533d;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i11;
            }
        }
        return 0;
    }

    private ArrayList<vi.m> a1(int i11) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        try {
            ArrayList<vi.m> arrayList = (ArrayList) executorServiceNewSingleThreadExecutor.submit(new c(this.f20366g.a(), this.Q.getUri(), (this.Q.getContentStartTime() * 1000) - 100)).get(3000L, TimeUnit.MILLISECONDS);
            if (arrayList == null && i11 < 1) {
                return a1(i11 + 1);
            }
            executorServiceNewSingleThreadExecutor.shutdown();
            return arrayList;
        } catch (Exception e11) {
            xi.a.f("ReactExoplayerView", "error in getVideoTrackInfoFromManifest handling request:" + e11.getMessage());
            return null;
        }
    }

    private boolean b1() {
        r8.n nVar;
        r8.w.a aVarO;
        int iZ0;
        if (this.f20368h == null || (nVar = this.f20370i) == null || (aVarO = nVar.o()) == null || (iZ0 = Z0(3)) == -1) {
            return false;
        }
        n8.y yVarF = aVarO.f(iZ0);
        for (int i11 = 0; i11 < yVarF.f93615a; i11++) {
            p7.t0 t0VarB = yVarF.b(i11);
            for (int i12 = 0; i12 < t0VarB.f101499a; i12++) {
                String str = t0VarB.c(i12).f101530a;
                if (str == null || !str.startsWith("external-subtitle-")) {
                    return true;
                }
            }
        }
        return false;
    }

    private AdsMediaSource c1(androidx.media3.exoplayer.source.r rVar, vi.i iVar) {
        iVar.b();
        iVar.getUri();
        return null;
    }

    private void d1(vi.i iVar) {
        if (this.f20368h == null) {
            xi.a.f("ReactExoplayerView", "Player is null in initializeDaiSource, skipping DAI initialization");
            return;
        }
        J1(iVar);
        this.f20368h.b();
        this.f20372j = false;
        this.f20354a.onVideoLoadStart.invoke();
        this.f20386q = true;
        V0();
    }

    private void e1() {
        this.K = yi.c.INSTANCE.a().e(this.Q);
        final Activity currentActivity = this.f20377l0.getCurrentActivity();
        final vi.i iVar = this.Q;
        Runnable runnable = new Runnable() { // from class: com.brentvatne.exoplayer.l0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20326a.s1(iVar, this, currentActivity);
            }
        };
        this.H = runnable;
        this.G.postDelayed(runnable, 1L);
    }

    private void f1() {
        this.f20360d.setPlayer(this.f20368h);
        this.f20360d.setControllerVisibilityListener(new PlayerView.d() { // from class: com.brentvatne.exoplayer.f0
            @Override // androidx.media3.ui.PlayerView.d
            public final void a(int i11) {
                this.f20302a.t1(i11);
            }
        });
        this.f20360d.setFullscreenButtonClickListener(new PlayerView.e() { // from class: com.brentvatne.exoplayer.g0
            @Override // androidx.media3.ui.PlayerView.e
            public final void a(boolean z11) {
                this.f20303a.u1(z11);
            }
        });
        Q1();
    }

    private void g1(p0 p0Var) {
        androidx.media3.exoplayer.source.i iVar;
        r8.n nVar = new r8.n(getContext(), new r8.a.b());
        p0Var.f20370i = nVar;
        r8.n.e.a aVarH = this.f20370i.H();
        int i11 = this.C;
        if (i11 == 0) {
            i11 = Integer.MAX_VALUE;
        }
        nVar.g0(aVarH.C0(i11));
        f fVar = new f(new s8.g(true, 65536), this.Q.getBufferConfig());
        long initialBitrate = this.Q.getBufferConfig().getInitialBitrate();
        if (initialBitrate > 0) {
            this.f20356b.c(initialBitrate);
            this.f20358c = this.f20356b.getBandWidthMeter();
        }
        z7.d dVarM = new z7.d(getContext()).q(0).p(true).m();
        if (k1(this.Q)) {
            iVar = O0();
        } else {
            iVar = new androidx.media3.exoplayer.source.i(this.f20366g);
            iVar.u(new o8.a.InterfaceC2069a() { // from class: com.brentvatne.exoplayer.o0
                @Override // o8.a.InterfaceC2069a
                public final o8.a a(p7.y.b bVar) {
                    p0.h0(this.f20352a, bVar);
                    return null;
                }
            }, this.f20360d.getPlayerView());
        }
        if (this.J && !this.K) {
            iVar.r(x.f20439a.a(E0(true)));
        }
        this.f20368h = new ExoPlayer.b(getContext(), dVarM).m(p0Var.f20370i).j(this.f20358c).k(fVar).l(iVar).i();
        yi.c.INSTANCE.a().g(this.f20397v0, this.f20368h);
        G1();
        this.f20368h.D0(p0Var);
        this.f20368h.k(this.f20396v ? BitmapDescriptorFactory.HUE_RED : this.B * 1.0f);
        this.f20360d.setPlayer(this.f20368h);
        this.f20381n0.b(p0Var);
        this.f20383o0.c();
        this.f20358c.d(new Handler(), p0Var);
        setPlayWhenReady(!this.f20392t);
        this.f20372j = true;
        this.f20368h.j(new p7.i0(this.f20403z, 1.0f));
        H0(this.A);
        if (this.f20375k0) {
            N1();
        }
    }

    private ArrayList<vi.l> getAudioTrackInfo() {
        ArrayList<vi.l> arrayList = new ArrayList<>();
        r8.n nVar = this.f20370i;
        if (nVar != null) {
            r8.w.a aVarO = nVar.o();
            int iZ0 = Z0(1);
            if (aVarO != null && iZ0 != -1) {
                n8.y yVarF = aVarO.f(iZ0);
                r8.x xVarA = this.f20368h.X0().a(1);
                for (int i11 = 0; i11 < yVarF.f93615a; i11++) {
                    p7.t0 t0VarB = yVarF.b(i11);
                    p7.u uVarC = t0VarB.c(0);
                    boolean z11 = xVarA != null && xVarA.e() == t0VarB;
                    vi.l lVarT0 = T0(uVarC, i11, xVarA, t0VarB);
                    int i12 = uVarC.f101539j;
                    if (i12 == -1) {
                        i12 = 0;
                    }
                    lVarT0.f(i12);
                    lVarT0.j(z11);
                    arrayList.add(lVarT0);
                }
            }
        }
        return arrayList;
    }

    private ArrayList<vi.l> getBasicAudioTrackInfo() {
        ArrayList<vi.l> arrayList = new ArrayList<>();
        r8.n nVar = this.f20370i;
        if (nVar != null) {
            r8.w.a aVarO = nVar.o();
            int iZ0 = Z0(1);
            if (aVarO != null && iZ0 != -1) {
                n8.y yVarF = aVarO.f(iZ0);
                for (int i11 = 0; i11 < yVarF.f93615a; i11++) {
                    p7.u uVarC = yVarF.b(i11).c(0);
                    vi.l lVar = new vi.l();
                    lVar.g(i11);
                    String str = uVarC.f101533d;
                    if (str == null) {
                        str = "unknown";
                    }
                    lVar.h(str);
                    String str2 = uVarC.f101531b;
                    if (str2 == null) {
                        str2 = "Track " + (i11 + 1);
                    }
                    lVar.k(str2);
                    lVar.j(false);
                    String str3 = uVarC.f101544o;
                    if (str3 != null) {
                        lVar.i(str3);
                    }
                    int i12 = uVarC.f101539j;
                    if (i12 == -1) {
                        i12 = 0;
                    }
                    lVar.f(i12);
                    arrayList.add(lVar);
                }
                xi.a.a("ReactExoplayerView", "getBasicAudioTrackInfo: returning " + arrayList.size() + " audio tracks (no selection status)");
            }
        }
        return arrayList;
    }

    private ArrayList<vi.l> getBasicTextTrackInfo() {
        ArrayList<vi.l> arrayList = new ArrayList<>();
        r8.n nVar = this.f20370i;
        if (nVar != null) {
            r8.w.a aVarO = nVar.o();
            int iZ0 = Z0(3);
            if (aVarO != null && iZ0 != -1) {
                n8.y yVarF = aVarO.f(iZ0);
                for (int i11 = 0; i11 < yVarF.f93615a; i11++) {
                    p7.t0 t0VarB = yVarF.b(i11);
                    for (int i12 = 0; i12 < t0VarB.f101499a; i12++) {
                        p7.u uVarC = t0VarB.c(i12);
                        vi.l lVar = new vi.l();
                        lVar.g(arrayList.size());
                        String str = uVarC.f101544o;
                        if (str != null) {
                            lVar.i(str);
                        }
                        String str2 = uVarC.f101533d;
                        if (str2 != null) {
                            lVar.h(str2);
                        }
                        String str3 = uVarC.f101530a;
                        boolean z11 = str3 != null && str3.startsWith("external-subtitle-");
                        String str4 = uVarC.f101531b;
                        if (str4 != null && !str4.isEmpty()) {
                            lVar.k(uVarC.f101531b);
                        } else if (z11) {
                            lVar.k("External " + (i12 + 1));
                        } else {
                            lVar.k("Track " + (arrayList.size() + 1));
                        }
                        lVar.j(false);
                        arrayList.add(lVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private ArrayList<vi.l> getTextTrackInfo() {
        ArrayList<vi.l> arrayList = new ArrayList<>();
        r8.n nVar = this.f20370i;
        if (nVar != null) {
            r8.w.a aVarO = nVar.o();
            int iZ0 = Z0(3);
            if (aVarO != null && iZ0 != -1) {
                r8.x xVarA = this.f20368h.X0().a(3);
                n8.y yVarF = aVarO.f(iZ0);
                for (int i11 = 0; i11 < yVarF.f93615a; i11++) {
                    p7.t0 t0VarB = yVarF.b(i11);
                    for (int i12 = 0; i12 < t0VarB.f101499a; i12++) {
                        p7.u uVarC = t0VarB.c(i12);
                        vi.l lVarT0 = T0(uVarC, i12, xVarA, t0VarB);
                        String str = uVarC.f101530a;
                        boolean z11 = str != null && str.startsWith("external-subtitle-");
                        n1(xVarA, t0VarB, i12);
                        lVarT0.g(arrayList.size());
                        if (lVarT0.getTitle() == null || lVarT0.getTitle().isEmpty()) {
                            if (z11) {
                                lVarT0.k("External " + (i12 + 1));
                            } else {
                                lVarT0.k("Track " + (arrayList.size() + 1));
                            }
                        }
                        arrayList.add(lVarT0);
                    }
                }
            }
        }
        return arrayList;
    }

    private ArrayList<vi.m> getVideoTrackInfo() {
        ArrayList<vi.m> arrayList = new ArrayList<>();
        r8.n nVar = this.f20370i;
        if (nVar != null) {
            r8.w.a aVarO = nVar.o();
            int iZ0 = Z0(2);
            if (aVarO != null && iZ0 != -1) {
                n8.y yVarF = aVarO.f(iZ0);
                for (int i11 = 0; i11 < yVarF.f93615a; i11++) {
                    p7.t0 t0VarB = yVarF.b(i11);
                    for (int i12 = 0; i12 < t0VarB.f101499a; i12++) {
                        p7.u uVarC = t0VarB.c(i12);
                        if (l1(uVarC)) {
                            arrayList.add(U0(uVarC, i12));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private ArrayList<vi.m> getVideoTrackInfoFromManifest() {
        return a1(0);
    }

    public static /* synthetic */ o8.a h0(p0 p0Var, p7.y.b bVar) {
        p0Var.v1(bVar);
        return null;
    }

    private androidx.media3.exoplayer.drm.i h1() {
        UUID uuidH0;
        int i11;
        vi.f drmProps = this.Q.getDrmProps();
        if (drmProps == null || drmProps.getDrmType() == null || (uuidH0 = s7.q0.h0(drmProps.getDrmType())) == null) {
            return null;
        }
        try {
            xi.a.a("ReactExoplayerView", "drm buildDrmSessionManager");
            return D0(uuidH0, drmProps);
        } catch (UnsupportedDrmException e11) {
            if (s7.q0.f110454a < 18) {
                i11 = yi.a.f125598a;
            } else {
                i11 = e11.f9788a == 1 ? yi.a.f125600c : yi.a.f125599b;
            }
            this.f20354a.onVideoError.invoke(getResources().getString(i11), e11, "3003");
            return null;
        }
    }

    private void i1(vi.i iVar) {
        ExoPlayer exoPlayer;
        if (k1(iVar)) {
            d1(iVar);
            return;
        }
        if (iVar.getUri() == null) {
            return;
        }
        androidx.media3.exoplayer.drm.i iVarH1 = h1();
        if (iVarH1 == null && iVar.getDrmProps() != null && iVar.getDrmProps().getDrmType() != null) {
            xi.a.b("ReactExoplayerView", "Failed to initialize DRM Session Manager Framework!");
            return;
        }
        androidx.media3.exoplayer.source.r rVarF0 = F0(iVar.getUri(), iVar.getExtension(), iVarH1, iVar.getCropStartMs(), iVar.getCropEndMs());
        androidx.media3.exoplayer.source.r rVar = (androidx.media3.exoplayer.source.r) b0.a(c1(rVarF0, iVar), rVarF0);
        while (true) {
            exoPlayer = this.f20368h;
            if (exoPlayer != null) {
                break;
            }
            try {
                wait();
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                xi.a.b("ReactExoplayerView", e11.toString());
            }
        }
        int i11 = this.f20382o;
        if (i11 != -1) {
            exoPlayer.M(i11, this.f20384p);
            this.f20368h.P0(rVar, false);
        } else if (iVar.getStartPositionMs() > 0) {
            this.f20368h.Q0(rVar, iVar.getStartPositionMs());
        } else {
            this.f20368h.P0(rVar, true);
        }
        this.f20368h.b();
        this.f20372j = false;
        E1();
        this.f20354a.onVideoLoadStart.invoke();
        this.f20386q = true;
        V0();
    }

    private static boolean j1(PlaybackException playbackException) {
        return playbackException.f9018a == 1002;
    }

    private boolean k1(vi.i iVar) {
        if (iVar == null) {
            return false;
        }
        iVar.b();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l1(p7.u uVar) {
        int i11 = uVar.f101551v;
        if (i11 == -1) {
            i11 = 0;
        }
        int i12 = uVar.f101552w;
        if (i12 == -1) {
            i12 = 0;
        }
        float f11 = uVar.f101555z;
        if (f11 == -1.0f) {
            f11 = BitmapDescriptorFactory.HUE_RED;
        }
        String str = uVar.f101544o;
        if (str == null) {
            return true;
        }
        try {
            return MediaCodecUtil.j(str, false, false).v(i11, i12, f11);
        } catch (Exception unused) {
            return true;
        }
    }

    private boolean m1() {
        ExoPlayer exoPlayer = this.f20368h;
        return exoPlayer != null && exoPlayer.m();
    }

    private static boolean n1(r8.x xVar, p7.t0 t0Var, int i11) {
        return (xVar == null || xVar.e() != t0Var || xVar.d(i11) == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p1(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        t.j(this.f20377l0, this.f20400x, this.f20360d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q1(vi.i iVar, p0 p0Var) {
        if (this.f20393t0 && iVar == this.Q) {
            return;
        }
        try {
            i1(iVar);
        } catch (Exception e11) {
            p0Var.f20372j = true;
            xi.a.b("ReactExoplayerView", "Failed to initialize Player! 1");
            xi.a.b("ReactExoplayerView", e11.toString());
            e11.printStackTrace();
            this.f20354a.onVideoError.invoke(e11.toString(), e11, "1001");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r1(final vi.i iVar, Activity activity, final p0 p0Var) {
        if (this.f20393t0 && iVar == this.Q) {
            return;
        }
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.brentvatne.exoplayer.n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20349a.q1(iVar, p0Var);
                }
            });
        } else {
            xi.a.b("ReactExoplayerView", "Failed to initialize Player!, null activity");
            this.f20354a.onVideoError.invoke("Failed to initialize Player!", new Exception("Current Activity is null!"), "1001");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s1(final vi.i iVar, final p0 p0Var, final Activity activity) {
        if (this.f20393t0 && iVar == this.Q) {
            return;
        }
        try {
            if (iVar.getUri() != null || k1(iVar)) {
                if (this.f20368h == null) {
                    g1(p0Var);
                    this.I = t.d(this.f20377l0, this);
                    t.h(this.f20377l0, this.f20400x, this.f20398w);
                }
                if (this.Q.getIsLocalAssetFile() || this.Q.getIsAsset() || this.Q.getBufferConfig().getCacheSize() <= 0) {
                    this.J = false;
                } else {
                    x.f20439a.b(getContext(), this.Q.getBufferConfig().getCacheSize());
                    this.J = true;
                }
                if (this.f20372j) {
                    this.f20360d.f();
                    Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.brentvatne.exoplayer.m0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20331a.r1(iVar, activity, p0Var);
                        }
                    });
                } else if (iVar == this.Q) {
                    i1(iVar);
                }
            }
        } catch (Exception e11) {
            p0Var.f20372j = true;
            xi.a.b("ReactExoplayerView", "Failed to initialize Player! 2");
            xi.a.b("ReactExoplayerView", e11.toString());
            e11.printStackTrace();
            this.f20354a.onVideoError.invoke(e11.toString(), e11, "1001");
        }
    }

    private void setPlayWhenReady(boolean z11) {
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer == null) {
            return;
        }
        if (!z11) {
            exoPlayer.G(false);
            return;
        }
        boolean zI1 = I1();
        this.f20402y = zI1;
        if (zI1) {
            this.f20368h.G(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t1(int i11) {
        this.f20354a.onControlsVisibilityChange.invoke(Boolean.valueOf(i11 == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u1(boolean z11) {
        setFullscreen(!this.f20388r);
    }

    private /* synthetic */ o8.a v1(p7.y.b bVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w1() {
        if (this.f20360d != null) {
            U1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x1() {
        this.f20354a.onVideoFullscreenPlayerDidPresent.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y1() {
        this.f20354a.onVideoFullscreenPlayerDidDismiss.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1(long j11, long j12, int i11, int i12, ArrayList arrayList, ArrayList arrayList2, String str) {
        ArrayList<vi.m> videoTrackInfoFromManifest = getVideoTrackInfoFromManifest();
        if (videoTrackInfoFromManifest != null) {
            this.E = true;
        }
        this.f20354a.onVideoLoad.g(Long.valueOf(j11), Long.valueOf(j12), Integer.valueOf(i11), Integer.valueOf(i12), arrayList, arrayList2, videoTrackInfoFromManifest, str);
        U1();
    }

    @Override // p7.j0.d
    public void B(r7.e eVar) {
        if (eVar.f107106a.isEmpty() || eVar.f107106a.get(0).f107066a == null) {
            return;
        }
        this.f20354a.onTextTrackDataChanged.invoke(eVar.f107106a.get(0).f107066a.toString());
    }

    @Override // p7.j0.d
    public void F(@NonNull PlaybackException playbackException) {
        String str = "ExoPlaybackException: " + PlaybackException.g(playbackException.f9018a);
        String str2 = "2" + playbackException.f9018a;
        int i11 = playbackException.f9018a;
        if ((i11 == 6000 || i11 == 6002 || i11 == 6004 || i11 == 6006 || i11 == 6007) && !this.D) {
            this.D = true;
            this.f20372j = true;
            T1();
            e1();
            setPlayWhenReady(true);
            return;
        }
        this.f20354a.onVideoError.invoke(str, playbackException, str2);
        this.f20372j = true;
        if (!j1(playbackException)) {
            T1();
            return;
        }
        L0();
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer != null) {
            exoPlayer.E();
            this.f20368h.b();
        }
    }

    @Override // p7.j0.d
    public void H(@NonNull p7.j0.e eVar, @NonNull p7.j0.e eVar2, int i11) {
        if (i11 == 1) {
            this.N = true;
            this.O = eVar2.f101401g;
            if (this.E) {
                setSelectedTrack(2, this.U, this.V);
            }
        }
        if (this.f20372j) {
            T1();
        }
        if (this.E) {
            setSelectedTrack(2, this.U, this.V);
            this.F = true;
        }
        if (i11 == 0 && this.f20368h.h() == 1) {
            S1();
            if (this.P) {
                return;
            }
            this.P = true;
            this.f20354a.onVideoEnd.invoke();
        }
    }

    public void I0() {
        P1();
        this.f20377l0.removeLifecycleEventListener(this);
        H1();
        this.f20393t0 = true;
    }

    public void L1(long j11) {
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer != null) {
            exoPlayer.seekTo(j11);
        }
    }

    public void M0() {
        ExoPlayer exoPlayer;
        if (this.Q.getUri() != null && (exoPlayer = this.f20368h) != null) {
            exoPlayer.stop();
            this.f20368h.v0();
        }
        this.Q = new vi.i();
        this.f20366g = null;
        L0();
    }

    @Override // androidx.media3.exoplayer.drm.h
    public void N(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        xi.a.a("DRM Info", "onDrmSessionReleased");
    }

    public void Q0(int i11) {
        r8.n nVar = this.f20370i;
        if (nVar == null) {
            return;
        }
        this.f20370i.m(nVar.b().I().H0(i11, true).G());
    }

    public void R0() {
        PictureInPictureParams pictureInPictureParamsBuild;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20400x.setActions(t.q(this.f20377l0, this.f20392t, this.f20383o0));
            if (this.f20368h.g() == 3) {
                this.f20400x.setAspectRatio(t.k(this.f20368h));
            }
            pictureInPictureParamsBuild = this.f20400x.build();
        } else {
            pictureInPictureParamsBuild = null;
        }
        t.p(this.f20377l0, pictureInPictureParamsBuild);
    }

    @Override // p7.j0.d
    public void S(@NonNull a1 a1Var) {
        xi.a.a("ReactExoplayerView", "onTracksChanged called - updating track information, controls=" + this.f20373j0);
        if (this.f20373j0) {
            ArrayList<vi.l> basicTextTrackInfo = getBasicTextTrackInfo();
            ArrayList<vi.l> basicAudioTrackInfo = getBasicAudioTrackInfo();
            ArrayList<vi.m> videoTrackInfo = getVideoTrackInfo();
            this.f20354a.onTextTracks.invoke(basicTextTrackInfo);
            this.f20354a.onAudioTracks.invoke(basicAudioTrackInfo);
            this.f20354a.onVideoTracks.invoke(videoTrackInfo);
        } else {
            ArrayList<vi.l> textTrackInfo = getTextTrackInfo();
            ArrayList<vi.l> audioTrackInfo = getAudioTrackInfo();
            ArrayList<vi.m> videoTrackInfo2 = getVideoTrackInfo();
            this.f20354a.onTextTracks.invoke(textTrackInfo);
            this.f20354a.onAudioTracks.invoke(audioTrackInfo);
            this.f20354a.onVideoTracks.invoke(videoTrackInfo2);
            Iterator<vi.l> it = audioTrackInfo.iterator();
            while (it.hasNext()) {
                it.next().getIsSelected();
            }
        }
        U1();
    }

    public void S0() {
        Activity currentActivity = this.f20377l0.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView().findViewById(R.id.content);
        if (!this.M.isEmpty()) {
            if (this.f20360d.getParent().equals(viewGroup)) {
                viewGroup.removeView(this.f20360d);
            }
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                viewGroup.getChildAt(i11).setVisibility(this.M.get(i11).intValue());
            }
            this.M.clear();
        }
        if (currentActivity.isInPictureInPictureMode()) {
            currentActivity.moveTaskToBack(false);
        }
    }

    @Override // p7.j0.d
    public void V(@NonNull p7.j0 j0Var, p7.j0.c cVar) {
        String str;
        String str2;
        if (cVar.a(4) || cVar.a(5)) {
            int iG = j0Var.g();
            boolean zT = j0Var.t();
            String str3 = "onStateChanged: playWhenReady=" + zT + ", playbackState=";
            this.f20354a.onPlaybackRateChange.invoke(Float.valueOf((zT && iG == 3) ? 1.0f : BitmapDescriptorFactory.HUE_RED));
            if (iG != 1) {
                if (iG == 2) {
                    str2 = str3 + "buffering";
                    A1(true);
                    K0();
                    setKeepScreenOn(this.f20365f0);
                } else if (iG == 3) {
                    str = str3 + "ready";
                    this.P = false;
                    this.f20354a.onReadyForDisplay.invoke();
                    A1(false);
                    K0();
                    O1();
                    V1();
                    if (this.F && this.E) {
                        this.F = false;
                        setSelectedTrack(2, this.U, this.V);
                    }
                    l lVar = this.f20360d;
                    if (lVar != null) {
                        lVar.i();
                    }
                    setKeepScreenOn(this.f20365f0);
                } else if (iG != 4) {
                    str2 = str3 + "unknown";
                } else {
                    str2 = str3 + "ended";
                    S1();
                    if (!this.P) {
                        this.P = true;
                        this.f20354a.onVideoEnd.invoke();
                    }
                    B1();
                    setKeepScreenOn(false);
                }
                xi.a.a("ReactExoplayerView", str2);
            }
            str = str3 + "idle";
            this.f20354a.onVideoIdle.invoke();
            K0();
            if (!j0Var.t()) {
                setKeepScreenOn(false);
            }
            str2 = str;
            xi.a.a("ReactExoplayerView", str2);
        }
    }

    @Override // androidx.media3.exoplayer.drm.h
    public void W(int i11, androidx.media3.exoplayer.source.r.b bVar, int i12) {
        xi.a.a("DRM Info", "onDrmSessionAcquired");
    }

    public void W0(Promise promise) {
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer != null) {
            promise.resolve(Float.valueOf(exoPlayer.D() / 1000.0f));
        } else {
            promise.reject("PLAYER_NOT_AVAILABLE", "Player is not initialized.");
        }
    }

    @Override // androidx.media3.exoplayer.drm.h
    public void X(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        xi.a.a("DRM Info", "onDrmKeysRemoved");
    }

    @Override // androidx.media3.exoplayer.drm.h
    public void Y(int i11, androidx.media3.exoplayer.source.r.b bVar, @NonNull Exception exc) {
        xi.a.a("DRM Info", "onDrmSessionManagerError");
        this.f20354a.onVideoError.invoke("onDrmSessionManagerError", exc, "3002");
    }

    public double Y0(long j11) {
        p7.r0.d dVar = new p7.r0.d();
        if (!this.f20368h.J().u()) {
            this.f20368h.J().r(this.f20368h.R(), dVar);
        }
        return dVar.f101486f + j11;
    }

    public int Z0(int i11) {
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer == null) {
            return -1;
        }
        int iT0 = exoPlayer.T0();
        for (int i12 = 0; i12 < iT0; i12++) {
            if (this.f20368h.Y0(i12) == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.drm.h
    public void b0(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        xi.a.a("DRM Info", "onDrmKeysRestored");
    }

    public boolean getPreventsDisplaySleepDuringVideoPlayback() {
        return this.f20365f0;
    }

    @Override // zi.b
    public void n() {
        this.f20354a.onVideoAudioBecomingNoisy.invoke();
    }

    public boolean o1() {
        String str = this.U;
        return str == null || DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        J0();
        super.onDetachedFromWindow();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        I0();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f20390s = true;
        Activity currentActivity = this.f20377l0.getCurrentActivity();
        int i11 = s7.q0.f110454a;
        boolean z11 = i11 >= 24 && currentActivity != null && currentActivity.isInPictureInPictureMode();
        boolean z12 = i11 >= 24 && currentActivity != null && currentActivity.isInMultiWindowMode();
        if (this.f20369h0 || z11 || z12) {
            return;
        }
        setPlayWhenReady(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (!this.f20369h0 || !this.f20390s) {
            setPlayWhenReady(!this.f20392t);
        }
        this.f20390s = false;
    }

    @Override // p7.j0.d
    public void onIsLoadingChanged(boolean z11) {
    }

    @Override // p7.j0.d
    public void onIsPlayingChanged(boolean z11) {
        if (z11 && this.N) {
            this.f20354a.onVideoSeek.invoke(Long.valueOf(this.f20368h.D()), Long.valueOf(this.O));
        }
        t.i(this.f20377l0, this.f20400x, this.f20383o0, !z11);
        this.f20354a.onVideoPlaybackStateChanged.invoke(Boolean.valueOf(z11), Boolean.valueOf(this.N));
        if (z11) {
            this.N = false;
        }
    }

    @Override // p7.j0.d
    public void onVolumeChanged(float f11) {
        this.f20354a.onVolumeChange.invoke(Float.valueOf(f11));
    }

    @Override // s8.d.a
    public void q(int i11, long j11, long j12) {
        int i12;
        int i13;
        int i14 = 0;
        if (this.f20371i0) {
            ExoPlayer exoPlayer = this.f20368h;
            if (exoPlayer == null) {
                this.f20354a.onVideoBandwidthUpdate.invoke(Long.valueOf(j12), 0, 0, null);
                return;
            }
            p7.u uVarV0 = exoPlayer.V0();
            boolean z11 = uVarV0 != null && ((i13 = uVarV0.A) == 90 || i13 == 270);
            if (uVarV0 != null) {
                i12 = z11 ? uVarV0.f101552w : uVarV0.f101551v;
            } else {
                i12 = 0;
            }
            if (uVarV0 != null) {
                i14 = z11 ? uVarV0.f101551v : uVarV0.f101552w;
            }
            this.f20354a.onVideoBandwidthUpdate.invoke(Long.valueOf(j12), Integer.valueOf(i14), Integer.valueOf(i12), uVarV0 != null ? uVarV0.f101530a : null);
        }
    }

    public void setAudioOutput(com.brentvatne.exoplayer.a aVar) {
        if (this.A != aVar) {
            this.A = aVar;
            H0(aVar);
        }
    }

    public void setBufferingStrategy(vi.c.a aVar) {
        this.f20361d0 = aVar;
    }

    public void setCmcdConfigurationFactory(s8.e.a aVar) {
        this.f20399w0 = aVar;
    }

    public void setControls(boolean z11) {
        this.f20373j0 = z11;
        l lVar = this.f20360d;
        if (lVar != null) {
            lVar.setUseController(z11);
            if (z11) {
                this.f20360d.setControllerAutoShow(true);
                this.f20360d.setControllerHideOnTouch(true);
                this.f20360d.setControllerShowTimeoutMs(5000);
            }
        }
        if (z11) {
            A0();
        }
        F1();
    }

    public void setControlsStyles(vi.e eVar) {
        this.L = eVar;
        F1();
    }

    public void setDebug(boolean z11) {
        this.f20380n = z11;
        G1();
    }

    public void setDisableDisconnectError(boolean z11) {
        this.f20363e0 = z11;
    }

    public void setDisableFocus(boolean z11) {
        this.f20357b0 = z11;
    }

    public void setEnterPictureInPictureOnLeave(boolean z11) {
        this.f20398w = z11;
        if (this.f20368h != null) {
            t.h(this.f20377l0, this.f20400x, z11);
        }
    }

    @Override // android.view.View
    public void setFocusable(boolean z11) {
        this.f20359c0 = z11;
        this.f20360d.setFocusable(z11);
    }

    public void setFullscreen(boolean z11) {
        if (z11 == this.f20388r) {
            return;
        }
        this.f20388r = z11;
        if (this.f20377l0.getCurrentActivity() == null) {
            return;
        }
        if (this.f20388r) {
            this.f20362e = new n(getContext(), this.f20360d, this, null, new d(true), this.L);
            this.f20354a.onVideoFullscreenPlayerWillPresent.invoke();
            n nVar = this.f20362e;
            if (nVar != null) {
                nVar.show();
            }
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.brentvatne.exoplayer.i0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20310a.x1();
                }
            });
            return;
        }
        this.f20354a.onVideoFullscreenPlayerWillDismiss.invoke();
        n nVar2 = this.f20362e;
        if (nVar2 != null) {
            nVar2.dismiss();
            E1();
            setControls(this.f20373j0);
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.brentvatne.exoplayer.j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20315a.y1();
            }
        });
    }

    protected void setIsInPictureInPicture(boolean z11) {
        this.f20354a.onPictureInPictureStatusChanged.invoke(Boolean.valueOf(z11));
        n nVar = this.f20362e;
        if (nVar != null && nVar.isShowing()) {
            if (z11) {
                this.f20362e.d();
                return;
            }
            return;
        }
        Activity currentActivity = this.f20377l0.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) currentActivity.getWindow().getDecorView().findViewById(R.id.content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (z11) {
            ViewGroup viewGroup2 = (ViewGroup) this.f20360d.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f20360d);
            }
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                if (viewGroup.getChildAt(i11) != this.f20360d) {
                    this.M.add(Integer.valueOf(viewGroup.getChildAt(i11).getVisibility()));
                    viewGroup.getChildAt(i11).setVisibility(8);
                }
            }
            viewGroup.addView(this.f20360d, layoutParams);
            return;
        }
        viewGroup.removeView(this.f20360d);
        if (this.M.isEmpty()) {
            return;
        }
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            viewGroup.getChildAt(i12).setVisibility(this.M.get(i12).intValue());
        }
        addView(this.f20360d, 0, layoutParams);
        E1();
    }

    public void setMaxBitRateModifier(int i11) {
        this.C = i11;
        if (this.f20368h == null || !o1()) {
            return;
        }
        r8.n nVar = this.f20370i;
        r8.n.e.a aVarH = nVar.H();
        int i12 = this.C;
        if (i12 == 0) {
            i12 = Integer.MAX_VALUE;
        }
        nVar.g0(aVarH.C0(i12));
    }

    public void setMutedModifier(boolean z11) {
        this.f20396v = z11;
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer != null) {
            exoPlayer.k(z11 ? BitmapDescriptorFactory.HUE_RED : this.B);
        }
    }

    public void setPausedModifier(boolean z11) {
        this.f20392t = z11;
        if (this.f20368h != null) {
            if (z11) {
                C1();
            } else {
                K1();
            }
        }
    }

    public void setPlayInBackground(boolean z11) {
        this.f20369h0 = z11;
    }

    public void setPreventsDisplaySleepDuringVideoPlayback(boolean z11) {
        this.f20365f0 = z11;
    }

    public void setProgressUpdateInterval(float f11) {
        this.f20367g0 = f11;
    }

    public void setRateModifier(float f11) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            xi.a.f("ReactExoplayerView", "cannot set rate <= 0");
            return;
        }
        this.f20403z = f11;
        if (this.f20368h != null) {
            this.f20368h.j(new p7.i0(this.f20403z, 1.0f));
        }
    }

    public void setRepeatModifier(boolean z11) {
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer != null) {
            if (z11) {
                exoPlayer.i(1);
            } else {
                exoPlayer.i(0);
            }
        }
        this.R = z11;
    }

    public void setReportBandwidth(boolean z11) {
        this.f20371i0 = z11;
    }

    public void setResizeModeModifier(int i11) {
        l lVar = this.f20360d;
        if (lVar != null) {
            lVar.setResizeMode(i11);
        }
    }

    public void setSelectedAudioTrack(String str, String str2) {
        this.S = str;
        this.T = str2;
        if (this.f20373j0 || this.f20368h == null || this.f20370i == null) {
            return;
        }
        setSelectedTrack(1, str, str2);
    }

    public void setSelectedTextTrack(String str, String str2) {
        this.W = str;
        this.f20355a0 = str2;
        M1(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a A[EDGE_INSN: B:35:0x007a->B:120:0x01a1 BREAK  A[LOOP:0: B:27:0x005f->B:34:0x0077]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    public void setSelectedTrack(int i11, String str, String str2) {
        r8.w.a aVarO;
        int iX0;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        if (this.f20368h == null || this.f20370i == null || this.f20373j0) {
            return;
        }
        int iZ0 = Z0(i11);
        int i16 = -1;
        if (iZ0 == -1 || (aVarO = this.f20370i.o()) == null) {
            return;
        }
        n8.y yVarF = aVarO.f(iZ0);
        ArrayList arrayList = new ArrayList();
        int i17 = 0;
        arrayList.add(0);
        String str3 = TextUtils.isEmpty(str) ? "default" : str;
        if ("disabled".equals(str3)) {
            Q0(iZ0);
            return;
        }
        if ("language".equals(str3)) {
            iX0 = 0;
            while (true) {
                if (iX0 >= yVarF.f93615a) {
                    iX0 = -1;
                    break;
                }
                String str4 = yVarF.b(iX0).c(0).f101533d;
                if (str4 != null && str4.equals(str2)) {
                    break;
                } else {
                    iX0++;
                }
            }
        } else if ("title".equals(str3)) {
            iX0 = 0;
            while (true) {
                if (iX0 >= yVarF.f93615a) {
                    iX0 = -1;
                    break;
                }
                String str5 = yVarF.b(iX0).c(0).f101531b;
                if (str5 != null && str5.equals(str2)) {
                    break;
                } else {
                    iX0++;
                }
            }
        } else if ("index".equals(str3)) {
            int i18 = xi.b.i(str2, -1);
            if (i18 == -1) {
                iX0 = -1;
                break;
            }
            if (i11 == 2 && yVarF.f93615a == 1) {
                if (i18 < yVarF.b(0).f101499a) {
                    arrayList.set(0, Integer.valueOf(i18));
                }
                iX0 = 0;
            } else {
                if (i18 >= yVarF.f93615a) {
                    iX0 = -1;
                    break;
                }
                iX0 = i18;
            }
        } else if ("resolution".equals(str3)) {
            int i19 = xi.b.i(str2, -1);
            if (i19 != -1) {
                int i21 = -1;
                int i22 = 0;
                while (i22 < yVarF.f93615a) {
                    p7.t0 t0VarB = yVarF.b(i22);
                    p7.u uVar = null;
                    int i23 = i16;
                    int i24 = i17;
                    p7.u uVar2 = null;
                    while (true) {
                        if (i24 >= t0VarB.f101499a) {
                            i12 = i22;
                            uVar = uVar2;
                            i13 = i23;
                            z11 = false;
                            break;
                        }
                        p7.u uVarC = t0VarB.c(i24);
                        int i25 = uVarC.f101552w;
                        if (i25 == i19) {
                            arrayList.set(0, Integer.valueOf(i24));
                            i12 = i22;
                            i21 = i12;
                            z11 = true;
                            i13 = -1;
                            break;
                        }
                        int i26 = i22;
                        if (this.E) {
                            if (uVar2 != null) {
                                if ((uVarC.f101539j > uVar2.f101539j || i25 > uVar2.f101552w) && i25 < i19) {
                                    i23 = i24;
                                    uVar2 = uVarC;
                                }
                            } else if (i25 < i19) {
                                i23 = i24;
                                uVar2 = uVarC;
                            }
                        }
                        i24++;
                        i22 = i26;
                    }
                    if (uVar == null && this.E && !z11) {
                        int i27 = Integer.MAX_VALUE;
                        for (int i28 = 0; i28 < t0VarB.f101499a; i28++) {
                            int i29 = t0VarB.c(i28).f101552w;
                            if (i29 < i27) {
                                arrayList.set(0, Integer.valueOf(i28));
                                i21 = i12;
                                i27 = i29;
                            }
                        }
                    }
                    if (uVar != null && i13 != -1) {
                        arrayList.set(0, Integer.valueOf(i13));
                        i21 = i12;
                    }
                    i22 = i12 + 1;
                    i16 = -1;
                    i17 = 0;
                }
                iX0 = i21;
            } else {
                iX0 = -1;
            }
            i16 = -1;
        } else {
            if (i11 == 3 && s7.q0.f110454a > 18) {
                CaptioningManager captioningManager = (CaptioningManager) this.f20377l0.getSystemService("captioning");
                if (captioningManager == null || !captioningManager.isEnabled()) {
                    iX0 = -1;
                } else {
                    iX0 = X0(yVarF);
                }
            } else if (i11 == 1) {
                iX0 = X0(yVarF);
            } else {
                i16 = -1;
                iX0 = -1;
            }
            i16 = -1;
        }
        if (iX0 == i16 && i11 == 2 && yVarF.f93615a != 0) {
            p7.t0 t0VarB2 = yVarF.b(0);
            arrayList = new ArrayList(t0VarB2.f101499a);
            for (int i31 = 0; i31 < t0VarB2.f101499a; i31++) {
                arrayList.add(Integer.valueOf(i31));
            }
            int i32 = 0;
            for (int i33 = 0; i33 < arrayList.size(); i33++) {
                if (l1(t0VarB2.c(i33))) {
                    i32++;
                }
            }
            if (arrayList.size() != 1) {
                ArrayList arrayList2 = new ArrayList(i32 + 1);
                for (int i34 = 0; i34 < arrayList.size(); i34++) {
                    if (l1(t0VarB2.c(i34))) {
                        arrayList2.add((Integer) arrayList.get(i34));
                    }
                }
                arrayList = arrayList2;
            }
            i15 = -1;
            i14 = 0;
        } else {
            i14 = iX0;
            i15 = -1;
        }
        if (i14 == i15) {
            Q0(iZ0);
            return;
        }
        try {
            p7.u0 u0Var = new p7.u0(yVarF.b(i14), arrayList);
            r8.n.e.a aVarH0 = this.f20370i.b().I().w0(true).x0(true).y0(true).H0(iZ0, false);
            if (i11 != 1 || !str3.equals("default")) {
                aVarH0.I(u0Var.b());
            }
            if (i11 == 2 && o1()) {
                int i35 = this.C;
                aVarH0.C0(i35 == 0 ? Integer.MAX_VALUE : i35);
            } else {
                aVarH0.F(u0Var);
            }
            if (i11 == 1) {
                aVarH0.z0(false);
                aVarH0.A0(false);
                xi.a.a("ReactExoplayerView", "Audio track selection: group=" + i14 + ", tracks=" + arrayList + ", override=" + u0Var);
            }
            this.f20370i.m(aVarH0.G());
            xi.a.a("ReactExoplayerView", "Applied track selection for type: " + i11 + ", group: " + i14);
        } catch (Exception e11) {
            xi.a.b("ReactExoplayerView", "Error applying track selection: " + e11.getMessage());
            e11.printStackTrace();
        }
    }

    public void setSelectedVideoTrack(String str, String str2) {
        this.U = str;
        this.V = str2;
        if (this.f20386q) {
            return;
        }
        setSelectedTrack(2, str, str2);
    }

    public void setShowNotificationControls(boolean z11) {
        this.f20375k0 = z11;
        ServiceConnection serviceConnection = this.f20374k;
        if (serviceConnection == null && z11) {
            N1();
        } else {
            if (z11 || serviceConnection == null) {
                return;
            }
            J0();
        }
    }

    public void setShutterColor(Integer num) {
        this.f20360d.setShutterColor(num.intValue());
    }

    public void setSrc(vi.i iVar) {
        if (iVar.getUri() == null && !k1(iVar)) {
            M0();
            return;
        }
        L0();
        boolean zR = iVar.r(this.Q);
        this.D = false;
        this.Q = iVar;
        androidx.media3.datasource.a.InterfaceC0192a interfaceC0192aF = i.f(this.f20377l0, this.f20358c, iVar.j());
        this.f20366g = (androidx.media3.datasource.a.InterfaceC0192a) b0.a(yi.c.INSTANCE.a().d(iVar, interfaceC0192aF), interfaceC0192aF);
        if (iVar.getCmcdProps() != null) {
            setCmcdConfigurationFactory(new com.brentvatne.exoplayer.c(iVar.getCmcdProps()).h());
        } else {
            setCmcdConfigurationFactory(null);
        }
        if (zR) {
            return;
        }
        this.P = false;
        this.f20372j = true;
        e1();
    }

    public void setSubtitleStyle(vi.j jVar) {
        this.f20360d.setSubtitleStyle(jVar);
    }

    public void setViewType(int i11) {
        this.f20360d.k(i11);
    }

    public void setVolumeModifier(float f11) {
        this.B = f11;
        ExoPlayer exoPlayer = this.f20368h;
        if (exoPlayer != null) {
            exoPlayer.k(f11);
        }
    }

    @Override // p7.j0.d
    public void t(@NonNull p7.f0 f0Var) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < f0Var.e(); i11++) {
            p7.f0.a aVarD = f0Var.d(i11);
            if (aVarD instanceof k9.i) {
                k9.i iVar = (k9.i) f0Var.d(i11);
                arrayList.add(new vi.k(iVar.f85426a, iVar instanceof k9.n ? ((k9.n) iVar).f85439c : ""));
            } else if (aVarD instanceof h9.a) {
                h9.a aVar = (h9.a) aVarD;
                arrayList.add(new vi.k(aVar.f71714a, aVar.f71715b));
            } else {
                xi.a.a("ReactExoplayerView", "unhandled metadata " + aVarD);
            }
        }
        this.f20354a.onTimedMetadata.invoke(arrayList);
    }

    @Override // p7.j0.d
    public void v(p7.i0 i0Var) {
        this.f20354a.onPlaybackRateChange.invoke(Float.valueOf(i0Var.f101379a));
    }

    @Override // androidx.media3.exoplayer.drm.h
    public void z(int i11, androidx.media3.exoplayer.source.r.b bVar) {
        xi.a.a("DRM Info", "onDrmKeysLoaded");
    }

    @Override // p7.j0.d
    public void a0(@NonNull p7.r0 r0Var, int i11) {
    }
}
