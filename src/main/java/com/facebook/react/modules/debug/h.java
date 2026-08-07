package com.facebook.react.modules.debug;

import android.view.Choreographer;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.TreeMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0018\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010-\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(R\u0016\u0010.\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00102R$\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u000204\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0011\u00109\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u00108R\u0011\u0010:\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u00108R\u0011\u0010;\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R\u0011\u0010<\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b*\u0010\u0013R\u0011\u0010=\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010>\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b,\u0010\u0013¨\u0006?"}, d2 = {"Lcom/facebook/react/modules/debug/h;", "Landroid/view/Choreographer$FrameCallback;", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "l", "Ljn0/h0;", "doFrame", "(J)V", "", "targetFps", "k", "(D)V", "n", "()V", "", "c", "()I", "j", "a", "Lcom/facebook/react/bridge/ReactContext;", "Landroid/view/Choreographer;", "b", "Landroid/view/Choreographer;", "choreographer", "Lcom/facebook/react/uimanager/UIManagerModule;", "Lcom/facebook/react/uimanager/UIManagerModule;", "uiManagerModule", "Lcom/facebook/react/modules/debug/d;", DateTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/modules/debug/d;", "didJSUpdateUiDuringFrameDetector", "e", "J", "firstFrameTime", "f", "lastFrameTime", "g", "I", "numFrameCallbacks", "h", "expectedNumFramesPrev", IntegerTokenConverter.CONVERTER_KEY, "fourPlusFrameStutters", "numFrameCallbacksWithBatchDispatches", "", "Z", "isRecordingFpsInfoAtEachFrame", "D", "Ljava/util/TreeMap;", "Lcom/facebook/react/modules/debug/h$b;", "m", "Ljava/util/TreeMap;", "timeToFps", "()D", "fps", "jsFPS", "numFrames", "numJSFrames", "expectedNumFrames", "totalTimeMS", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a f22764n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactContext reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Choreographer choreographer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final UIManagerModule uiManagerModule;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d didJSUpdateUiDuringFrameDetector;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long firstFrameTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long lastFrameTime;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int numFrameCallbacks;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int expectedNumFramesPrev;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int fourPlusFrameStutters;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int numFrameCallbacksWithBatchDispatches;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isRecordingFpsInfoAtEachFrame;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private double targetFps;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private TreeMap<Long, b> timeToFps;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/modules/debug/h$a;", "", "<init>", "()V", "", "DEFAULT_FPS", "D", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0018\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/modules/debug/h$b;", "", "", "totalFrames", "totalJsFrames", "totalExpectedFrames", "total4PlusFrameStutters", "", "fps", "jsFps", "totalTimeMs", "<init>", "(IIIIDDI)V", "a", "I", "getTotalFrames", "()I", "b", "getTotalJsFrames", "c", "getTotalExpectedFrames", DateTokenConverter.CONVERTER_KEY, "getTotal4PlusFrameStutters", "e", "D", "getFps", "()D", "f", "getJsFps", "g", "getTotalTimeMs", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int totalFrames;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int totalJsFrames;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int totalExpectedFrames;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int total4PlusFrameStutters;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final double fps;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final double jsFps;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final int totalTimeMs;

        public b(int i11, int i12, int i13, int i14, double d11, double d12, int i15) {
            this.totalFrames = i11;
            this.totalJsFrames = i12;
            this.totalExpectedFrames = i13;
            this.total4PlusFrameStutters = i14;
            this.fps = d11;
            this.jsFps = d12;
            this.totalTimeMs = i15;
        }
    }

    public h(ReactContext reactContext) {
        s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.uiManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.didJSUpdateUiDuringFrameDetector = new d();
        this.firstFrameTime = -1L;
        this.lastFrameTime = -1L;
        this.targetFps = 60.0d;
    }

    public static /* synthetic */ void l(h hVar, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = hVar.targetFps;
        }
        hVar.k(d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(h hVar) {
        Choreographer choreographer = Choreographer.getInstance();
        hVar.choreographer = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(h hVar) {
        Choreographer choreographer = Choreographer.getInstance();
        hVar.choreographer = choreographer;
        if (choreographer != null) {
            choreographer.removeFrameCallback(hVar);
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFourPlusFrameStutters() {
        return this.fourPlusFrameStutters;
    }

    public final int d() {
        return (int) (((this.targetFps * ((double) i())) / ((double) 1000)) + ((double) 1));
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long l11) {
        if (this.firstFrameTime == -1) {
            this.firstFrameTime = l11;
        }
        long j11 = this.lastFrameTime;
        this.lastFrameTime = l11;
        if (this.didJSUpdateUiDuringFrameDetector.d(j11, l11)) {
            this.numFrameCallbacksWithBatchDispatches++;
        }
        this.numFrameCallbacks++;
        int iD = d();
        if ((iD - this.expectedNumFramesPrev) - 1 >= 4) {
            this.fourPlusFrameStutters++;
        }
        if (this.isRecordingFpsInfoAtEachFrame) {
            gn.a.c(this.timeToFps);
            b bVar = new b(g(), h(), iD, this.fourPlusFrameStutters, e(), f(), i());
            TreeMap<Long, b> treeMap = this.timeToFps;
            if (treeMap != null) {
                treeMap.put(Long.valueOf(System.currentTimeMillis()), bVar);
            }
        }
        this.expectedNumFramesPrev = iD;
        Choreographer choreographer = this.choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    public final double e() {
        if (this.lastFrameTime == this.firstFrameTime) {
            return 0.0d;
        }
        return (((double) g()) * 1.0E9d) / (this.lastFrameTime - this.firstFrameTime);
    }

    public final double f() {
        if (this.lastFrameTime == this.firstFrameTime) {
            return 0.0d;
        }
        return (((double) h()) * 1.0E9d) / (this.lastFrameTime - this.firstFrameTime);
    }

    public final int g() {
        return this.numFrameCallbacks - 1;
    }

    public final int h() {
        return this.numFrameCallbacksWithBatchDispatches - 1;
    }

    public final int i() {
        return (int) ((this.lastFrameTime - this.firstFrameTime) / 1000000.0d);
    }

    public final void j() {
        this.firstFrameTime = -1L;
        this.lastFrameTime = -1L;
        this.numFrameCallbacks = 0;
        this.fourPlusFrameStutters = 0;
        this.numFrameCallbacksWithBatchDispatches = 0;
        this.isRecordingFpsInfoAtEachFrame = false;
        this.timeToFps = null;
    }

    public final void k(double targetFps) {
        if (!this.reactContext.isBridgeless()) {
            this.reactContext.getCatalystInstance().addBridgeIdleDebugListener(this.didJSUpdateUiDuringFrameDetector);
        }
        UIManagerModule uIManagerModule = this.uiManagerModule;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(this.didJSUpdateUiDuringFrameDetector);
        }
        this.targetFps = targetFps;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.f
            @Override // java.lang.Runnable
            public final void run() {
                h.m(this.f22762a);
            }
        });
    }

    public final void n() {
        if (!this.reactContext.isBridgeless()) {
            this.reactContext.getCatalystInstance().removeBridgeIdleDebugListener(this.didJSUpdateUiDuringFrameDetector);
        }
        UIManagerModule uIManagerModule = this.uiManagerModule;
        if (uIManagerModule != null) {
            uIManagerModule.setViewHierarchyUpdateDebugListener(null);
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.debug.g
            @Override // java.lang.Runnable
            public final void run() {
                h.o(this.f22763a);
            }
        });
    }
}
