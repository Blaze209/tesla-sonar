package com.oney.WebRTCModule;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.List;
import java.util.Objects;
import org.webrtc.EglBase;
import org.webrtc.Logging;
import org.webrtc.MediaStream;
import org.webrtc.RendererCommon;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.VideoTrack;

/* JADX INFO: loaded from: classes6.dex */
public class x2 extends ViewGroup {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final RendererCommon.ScalingType f46144n = RendererCommon.ScalingType.SCALE_ASPECT_FIT;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f46145o = WebRTCModule.TAG;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static int f46146p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f46147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f46148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f46149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f46150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f46151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46152f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RendererCommon.RendererEvents f46153g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f46154h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private RendererCommon.ScalingType f46155i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f46156j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final SurfaceViewRenderer f46157k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VideoTrack f46158l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f46159m;

    class a implements RendererCommon.RendererEvents {
        a() {
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFirstFrameRendered() {
            x2.this.n();
        }

        @Override // org.webrtc.RendererCommon.RendererEvents
        public void onFrameResolutionChanged(int i11, int i12, int i13) {
            x2.this.o(i11, i12, i13);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x2.this.q();
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f46162a;

        static {
            int[] iArr = new int[RendererCommon.ScalingType.values().length];
            f46162a = iArr;
            try {
                iArr[RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46162a[RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public x2(Context context) {
        super(context);
        this.f46150d = new Object();
        this.f46153g = new a();
        this.f46154h = new b();
        this.f46159m = false;
        SurfaceViewRenderer surfaceViewRenderer = new SurfaceViewRenderer(context);
        this.f46157k = surfaceViewRenderer;
        addView(surfaceViewRenderer);
        setMirror(false);
        setScalingType(f46144n);
    }

    private void h() {
        this.f46157k.setBackgroundColor(-16777216);
        this.f46157k.clearImage();
    }

    private VideoTrack i(String str) {
        VideoTrack videoTrack = null;
        if (str != null) {
            MediaStream streamForReactTag = ((WebRTCModule) ((ReactContext) getContext()).getNativeModule(WebRTCModule.class)).getStreamForReactTag(str);
            if (streamForReactTag != null) {
                List<VideoTrack> list = streamForReactTag.videoTracks;
                if (!list.isEmpty()) {
                    videoTrack = list.get(0);
                }
            }
            if (videoTrack == null) {
                Log.w(f46145o, "No video stream for react tag: " + str);
            }
        }
        return videoTrack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Log.d(f46145o, "First frame rendered.");
        this.f46157k.setBackgroundColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(int i11, int i12) {
        try {
            ReactContext reactContext = (ReactContext) getContext();
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt(Snapshot.WIDTH, i11);
            writableMapCreateMap.putInt(Snapshot.HEIGHT, i12);
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onDimensionsChange", writableMapCreateMap);
        } catch (Exception e11) {
            Log.e(f46145o, "Error calling onDimensionsChange callback", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        try {
            this.f46158l.removeSink(this.f46157k);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        try {
            this.f46158l.addSink(this.f46157k);
        } catch (Throwable th2) {
            Log.e(f46145o, "Failed to add renderer", th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        post(new Runnable() { // from class: com.oney.WebRTCModule.v2
            @Override // java.lang.Runnable
            public final void run() {
                this.f46123a.j();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(final int i11, final int i12, int i13) {
        boolean z11;
        boolean z12;
        synchronized (this.f46150d) {
            try {
                z11 = true;
                if (this.f46147a != i12) {
                    this.f46147a = i12;
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.f46148b != i13) {
                    this.f46148b = i13;
                    z12 = true;
                }
                if (this.f46149c != i11) {
                    this.f46149c = i11;
                } else {
                    z11 = z12;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z11) {
            post(this.f46154h);
            if (this.f46159m) {
                post(new Runnable() { // from class: com.oney.WebRTCModule.w2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46133a.k(i11, i12);
                    }
                });
            }
        }
    }

    private void p() {
        if (this.f46152f) {
            if (this.f46158l != null) {
                q0.a(new Runnable() { // from class: com.oney.WebRTCModule.t2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46107a.l();
                    }
                });
            }
            this.f46157k.release();
            f46146p--;
            this.f46152f = false;
            synchronized (this.f46150d) {
                this.f46147a = 0;
                this.f46148b = 0;
                this.f46149c = 0;
            }
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WrongCall"})
    public void q() {
        this.f46157k.requestLayout();
        if (ViewCompat.T(this)) {
            return;
        }
        onLayout(false, getLeft(), getTop(), getRight(), getBottom());
    }

    private void r() {
        if (this.f46152f || this.f46158l == null || !ViewCompat.S(this)) {
            return;
        }
        EglBase.Context contextB = h.b();
        if (contextB == null) {
            Log.e(f46145o, "Failed to render a VideoTrack!");
            return;
        }
        try {
            this.f46157k.init(contextB, this.f46153g);
            f46146p++;
            q0.a(new Runnable() { // from class: com.oney.WebRTCModule.u2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46114a.m();
                }
            });
            this.f46152f = true;
        } catch (Exception e11) {
            Logging.e(f46145o, "Failed to initialize surfaceViewRenderer on instance " + f46146p, e11);
        }
    }

    private void setScalingType(RendererCommon.ScalingType scalingType) {
        synchronized (this.f46150d) {
            try {
                if (this.f46155i == scalingType) {
                    return;
                }
                this.f46155i = scalingType;
                this.f46157k.setScalingType(scalingType);
                q();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void setVideoTrack(VideoTrack videoTrack) {
        VideoTrack videoTrack2 = this.f46158l;
        if (videoTrack2 != videoTrack) {
            if (videoTrack2 != null) {
                if (videoTrack == null) {
                    h();
                }
                p();
            }
            this.f46158l = videoTrack;
            if (videoTrack != null) {
                r();
                if (videoTrack2 == null) {
                    h();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        try {
            r();
        } finally {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            p();
        } finally {
            super.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        RendererCommon.ScalingType scalingType;
        float f11;
        float f12;
        int i21 = i14 - i12;
        int i22 = i13 - i11;
        int i23 = 0;
        if (i21 == 0 || i22 == 0) {
            i15 = 0;
            i16 = 0;
            i21 = 0;
        } else {
            synchronized (this.f46150d) {
                i17 = this.f46147a;
                i18 = this.f46148b;
                i19 = this.f46149c;
                scalingType = this.f46155i;
            }
            if (c.f46162a[scalingType.ordinal()] == 1) {
                i15 = i22;
                i16 = 0;
            } else if (i17 == 0 || i19 == 0) {
                i15 = 0;
                i16 = 0;
                i21 = 0;
            } else {
                if (i18 % 180 == 0) {
                    f11 = i19;
                    f12 = i17;
                } else {
                    f11 = i17;
                    f12 = i19;
                }
                Point displaySize = RendererCommon.getDisplaySize(scalingType, f11 / f12, i22, i21);
                int i24 = displaySize.x;
                int i25 = (i22 - i24) / 2;
                int i26 = displaySize.y;
                i16 = (i21 - i26) / 2;
                i15 = i24 + i25;
                i21 = i16 + i26;
                i23 = i25;
            }
        }
        this.f46157k.layout(i23, i16, i15, i21);
    }

    public void setMirror(boolean z11) {
        if (this.f46151e != z11) {
            this.f46151e = z11;
            this.f46157k.setMirror(z11);
            q();
        }
    }

    public void setObjectFit(String str) {
        setScalingType("cover".equals(str) ? RendererCommon.ScalingType.SCALE_ASPECT_FILL : RendererCommon.ScalingType.SCALE_ASPECT_FIT);
    }

    public void setOnDimensionsChange(boolean z11) {
        this.f46159m = z11;
    }

    void setStreamURL(String str) {
        if (Objects.equals(str, this.f46156j)) {
            return;
        }
        VideoTrack videoTrackI = i(str);
        if (this.f46158l != videoTrackI) {
            setVideoTrack(null);
        }
        this.f46156j = str;
        setVideoTrack(videoTrackI);
    }

    public void setZOrder(int i11) {
        if (i11 == 0) {
            this.f46157k.setZOrderMediaOverlay(false);
        } else if (i11 == 1) {
            this.f46157k.setZOrderMediaOverlay(true);
        } else {
            if (i11 != 2) {
                return;
            }
            this.f46157k.setZOrderOnTop(true);
        }
    }
}
