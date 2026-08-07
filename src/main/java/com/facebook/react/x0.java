package com.facebook.react;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class x0 extends FrameLayout implements com.facebook.react.uimanager.q0, com.facebook.react.uimanager.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j0 f23876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f23878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f23879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.facebook.react.uimanager.k f23883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.facebook.react.uimanager.j f23884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w f23885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f23887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f23890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f23891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f23892q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f23893r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AtomicInteger f23894s;

    private class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f23895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23897c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f23898d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f23899e = 0;

        a() {
            com.facebook.react.uimanager.d.g(x0.this.getContext().getApplicationContext());
            this.f23895a = new Rect();
            this.f23896b = (int) com.facebook.react.uimanager.w.h(60.0f);
        }

        private void a() {
            g();
        }

        private void b() {
            int rotation = ((WindowManager) x0.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.f23899e == rotation) {
                return;
            }
            this.f23899e = rotation;
            com.facebook.react.uimanager.d.f(x0.this.getContext().getApplicationContext());
            f(rotation);
        }

        private void c() {
            boolean zIsVisible;
            x0.this.getRootView().getWindowVisibleDisplayFrame(this.f23895a);
            WindowInsets rootWindowInsets = x0.this.getRootView().getRootWindowInsets();
            if (rootWindowInsets == null || (zIsVisible = rootWindowInsets.isVisible(WindowInsets.Type.ime())) == this.f23897c) {
                return;
            }
            this.f23897c = zIsVisible;
            if (!zIsVisible) {
                x0.this.r("keyboardDidHide", e(com.facebook.react.uimanager.w.f(this.f23895a.height()), 0.0d, com.facebook.react.uimanager.w.f(this.f23895a.width()), 0.0d));
                return;
            }
            int i11 = rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom - rootWindowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
            ViewGroup.LayoutParams layoutParams = x0.this.getRootView().getLayoutParams();
            gn.a.a(layoutParams instanceof WindowManager.LayoutParams);
            x0.this.r("keyboardDidShow", e(com.facebook.react.uimanager.w.f(((WindowManager.LayoutParams) layoutParams).softInputMode == 48 ? this.f23895a.bottom - i11 : this.f23895a.bottom), com.facebook.react.uimanager.w.f(this.f23895a.left), com.facebook.react.uimanager.w.f(this.f23895a.width()), com.facebook.react.uimanager.w.f(i11)));
        }

        private void d() {
            WindowInsets rootWindowInsets;
            DisplayCutout displayCutout;
            x0.this.getRootView().getWindowVisibleDisplayFrame(this.f23895a);
            int safeInsetTop = (Build.VERSION.SDK_INT < 28 || (rootWindowInsets = x0.this.getRootView().getRootWindowInsets()) == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) ? 0 : displayCutout.getSafeInsetTop();
            int i11 = com.facebook.react.uimanager.d.e().heightPixels;
            Rect rect = this.f23895a;
            int i12 = rect.bottom;
            int i13 = (i11 - i12) + safeInsetTop;
            int i14 = this.f23898d;
            if (i14 != i13 && i13 > this.f23896b) {
                this.f23898d = i13;
                this.f23897c = true;
                x0.this.r("keyboardDidShow", e(com.facebook.react.uimanager.w.f(i12), com.facebook.react.uimanager.w.f(this.f23895a.left), com.facebook.react.uimanager.w.f(this.f23895a.width()), com.facebook.react.uimanager.w.f(this.f23898d)));
            } else {
                if (i14 == 0 || i13 > this.f23896b) {
                    return;
                }
                this.f23898d = 0;
                this.f23897c = false;
                x0.this.r("keyboardDidHide", e(com.facebook.react.uimanager.w.f(rect.height()), 0.0d, com.facebook.react.uimanager.w.f(this.f23895a.width()), 0.0d));
            }
        }

        private WritableMap e(double d11, double d12, double d13, double d14) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putDouble(Snapshot.HEIGHT, d14);
            writableMapCreateMap2.putDouble("screenX", d12);
            writableMapCreateMap2.putDouble(Snapshot.WIDTH, d13);
            writableMapCreateMap2.putDouble("screenY", d11);
            writableMapCreateMap.putMap("endCoordinates", writableMapCreateMap2);
            writableMapCreateMap.putString("easing", "keyboard");
            writableMapCreateMap.putDouble("duration", 0.0d);
            return writableMapCreateMap;
        }

        private void f(int i11) {
            String str;
            double d11;
            boolean z11 = false;
            if (i11 != 0) {
                if (i11 == 1) {
                    str = "landscape-primary";
                    d11 = -90.0d;
                } else if (i11 == 2) {
                    str = "portrait-secondary";
                    d11 = 180.0d;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    str = "landscape-secondary";
                    d11 = 90.0d;
                }
                z11 = true;
            } else {
                str = "portrait-primary";
                d11 = 0.0d;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("name", str);
            writableMapCreateMap.putDouble("rotationDegrees", d11);
            writableMapCreateMap.putBoolean("isLandscape", z11);
            x0.this.r("namedOrientationDidChange", writableMapCreateMap);
        }

        private void g() {
            DeviceInfoModule deviceInfoModule;
            ReactContext currentReactContext = x0.this.getCurrentReactContext();
            if (currentReactContext == null || (deviceInfoModule = (DeviceInfoModule) currentReactContext.getNativeModule(DeviceInfoModule.class)) == null) {
                return;
            }
            deviceInfoModule.emitUpdateDimensionsEvent();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (x0.this.i() && x0.this.o()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    c();
                } else {
                    d();
                }
                b();
                a();
            }
        }
    }

    public interface b {
    }

    public x0(Context context) {
        super(context);
        this.f23880e = 0;
        this.f23885j = new w(this);
        this.f23886k = false;
        this.f23887l = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f23888m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f23889n = 0;
        this.f23890o = 0;
        this.f23891p = Integer.MIN_VALUE;
        this.f23892q = Integer.MIN_VALUE;
        this.f23893r = 1;
        this.f23894s = new AtomicInteger(0);
        k();
    }

    private void e() {
        ep.a.c(0L, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException("ReactRootView", new IllegalViewOperationException("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (!this.f23881f) {
                this.f23881f = true;
                ((j0) gn.a.c(this.f23876a)).t(this);
                getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
            }
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            ep.a.i(0L);
        }
    }

    private a getCustomGlobalLayoutListener() {
        if (this.f23879d == null) {
            this.f23879d = new a();
        }
        return this.f23879d;
    }

    private void k() {
        setRootViewTag(com.facebook.react.uimanager.h0.a());
        setClipChildren(false);
    }

    private boolean l() {
        if (!i() || !o()) {
            qk.a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return false;
        }
        if (this.f23883h == null) {
            qk.a.I("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return false;
        }
        if (!ReactFeatureFlags.dispatchPointerEvents || this.f23884i != null) {
            return true;
        }
        qk.a.I("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
        return false;
    }

    private boolean m() {
        return getUIManagerType() == 2;
    }

    private boolean n() {
        int i11 = this.f23880e;
        return (i11 == 0 || i11 == -1) ? false : true;
    }

    private void q() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void s() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f23887l = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        this.f23888m = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
    }

    private void w(boolean z11, int i11, int i12) {
        UIManager uIManagerG;
        int i13;
        int i14;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (!j()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            qk.a.I("ReactRootView", "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean zM = m();
        if (zM && !n()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            qk.a.m("ReactRootView", "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (uIManagerG = b1.g(currentReactContext, getUIManagerType())) != null) {
            if (zM) {
                Point pointB = com.facebook.react.uimanager.r0.b(this);
                int i15 = pointB.x;
                i14 = pointB.y;
                i13 = i15;
            } else {
                i13 = 0;
                i14 = 0;
            }
            if (z11 || i13 != this.f23891p || i14 != this.f23892q) {
                uIManagerG.updateRootLayoutSpecs(getRootViewTag(), i11, i12, i13, i14);
            }
            this.f23891p = i13;
            this.f23892q = i14;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    public void a(View view, MotionEvent motionEvent) {
        EventDispatcher eventDispatcherB;
        com.facebook.react.uimanager.j jVar;
        if (l() && (eventDispatcherB = b1.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f23883h.g(motionEvent, eventDispatcherB);
            if (view == null || (jVar = this.f23884i) == null) {
                return;
            }
            jVar.p(view, motionEvent, eventDispatcherB);
        }
    }

    @Override // com.facebook.react.uimanager.g0
    public void b(int i11) {
        if (i11 != 101) {
            return;
        }
        p();
    }

    @Override // com.facebook.react.uimanager.g0
    public void c() {
        ep.a.c(0L, "ReactRootView.runApplication");
        try {
            if (j() && o()) {
                ReactContext currentReactContext = getCurrentReactContext();
                if (currentReactContext == null) {
                    return;
                }
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.f23886k) {
                    w(true, this.f23887l, this.f23888m);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.f23882g = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
            }
        } finally {
            ep.a.i(0L);
        }
    }

    public void d(View view, MotionEvent motionEvent) {
        EventDispatcher eventDispatcherB;
        if (l() && (eventDispatcherB = b1.b(getCurrentReactContext(), getUIManagerType())) != null) {
            this.f23883h.f(motionEvent, eventDispatcherB);
            com.facebook.react.uimanager.j jVar = this.f23884i;
            if (jVar != null) {
                jVar.o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e11) {
            h(e11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (i() && o()) {
            this.f23885j.d(keyEvent);
            return super.dispatchKeyEvent(keyEvent);
        }
        qk.a.I("ReactRootView", "Unable to handle key event as the catalyst instance has not been attached");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        Canvas canvas2;
        BlendMode blendModeA;
        if (Build.VERSION.SDK_INT >= 29 && oo.a.c(this) == 2 && com.facebook.react.uimanager.c.a(this)) {
            blendModeA = w0.a(view.getTag(m.f22668r));
            if (blendModeA != null) {
                Paint paint = new Paint();
                paint.setBlendMode(blendModeA);
                canvas2 = canvas;
                canvas2.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            blendModeA = null;
        }
        boolean zDrawChild = super.drawChild(canvas2, view, j11);
        if (blendModeA != null) {
            canvas2.restore();
        }
        return zDrawChild;
    }

    protected void f(MotionEvent motionEvent, boolean z11) {
        if (!i() || !o()) {
            qk.a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        if (this.f23884i == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                qk.a.I("ReactRootView", "Unable to dispatch pointer events to JS before the dispatcher is available");
            }
        } else {
            EventDispatcher eventDispatcherB = b1.b(getCurrentReactContext(), getUIManagerType());
            if (eventDispatcherB != null) {
                this.f23884i.k(motionEvent, eventDispatcherB, z11);
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        gn.a.b(!this.f23881f, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    protected void g(MotionEvent motionEvent) {
        if (!i() || !o()) {
            qk.a.I("ReactRootView", "Unable to dispatch touch to JS as the catalyst instance has not been attached");
            return;
        }
        if (this.f23883h == null) {
            qk.a.I("ReactRootView", "Unable to dispatch touch to JS before the dispatcher is available");
            return;
        }
        EventDispatcher eventDispatcherB = b1.b(getCurrentReactContext(), getUIManagerType());
        if (eventDispatcherB != null) {
            this.f23883h.d(motionEvent, eventDispatcherB, getCurrentReactContext());
        }
    }

    @Override // com.facebook.react.uimanager.g0
    public Bundle getAppProperties() {
        return this.f23878c;
    }

    public ReactContext getCurrentReactContext() {
        j0 j0Var = this.f23876a;
        if (j0Var == null) {
            return null;
        }
        return j0Var.E();
    }

    @Override // com.facebook.react.uimanager.g0
    public int getHeightMeasureSpec() {
        return this.f23888m;
    }

    public String getJSModuleName() {
        return (String) gn.a.c(this.f23877b);
    }

    public j0 getReactInstanceManager() {
        return this.f23876a;
    }

    @Override // com.facebook.react.uimanager.g0
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // com.facebook.react.uimanager.g0
    public int getRootViewTag() {
        return this.f23880e;
    }

    @Override // com.facebook.react.uimanager.g0
    public AtomicInteger getState() {
        return this.f23894s;
    }

    @Override // com.facebook.react.uimanager.g0
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    public int getUIManagerType() {
        return this.f23893r;
    }

    @Override // com.facebook.react.uimanager.g0
    public int getWidthMeasureSpec() {
        return this.f23887l;
    }

    public void h(Throwable th2) {
        if (!i()) {
            throw new RuntimeException(th2);
        }
        getCurrentReactContext().handleException(new IllegalViewOperationException(th2.getMessage(), this, th2));
    }

    public boolean i() {
        j0 j0Var = this.f23876a;
        return (j0Var == null || j0Var.E() == null) ? false : true;
    }

    public boolean j() {
        return this.f23876a != null;
    }

    public boolean o() {
        return this.f23881f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (o()) {
            q();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (o()) {
            q();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        if (i() && o()) {
            this.f23885j.a();
            super.onFocusChanged(z11, i11, rect);
        } else {
            qk.a.I("ReactRootView", "Unable to handle focus changed event as the catalyst instance has not been attached");
            super.onFocusChanged(z11, i11, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        f(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        f(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            g(motionEvent);
        }
        f(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f23886k && m()) {
            w(false, this.f23887l, this.f23888m);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int iMax;
        int iMax2;
        ep.a.c(0L, "ReactRootView.onMeasure");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START);
        try {
            boolean z11 = (i11 == this.f23887l && i12 == this.f23888m) ? false : true;
            this.f23887l = i11;
            this.f23888m = i12;
            int mode = View.MeasureSpec.getMode(i11);
            if (mode == Integer.MIN_VALUE || mode == 0) {
                iMax = 0;
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt = getChildAt(i13);
                    iMax = Math.max(iMax, childAt.getLeft() + childAt.getMeasuredWidth() + childAt.getPaddingLeft() + childAt.getPaddingRight());
                }
            } else {
                iMax = View.MeasureSpec.getSize(i11);
            }
            int mode2 = View.MeasureSpec.getMode(i12);
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                iMax2 = 0;
                for (int i14 = 0; i14 < getChildCount(); i14++) {
                    View childAt2 = getChildAt(i14);
                    iMax2 = Math.max(iMax2, childAt2.getTop() + childAt2.getMeasuredHeight() + childAt2.getPaddingTop() + childAt2.getPaddingBottom());
                }
            } else {
                iMax2 = View.MeasureSpec.getSize(i12);
            }
            setMeasuredDimension(iMax, iMax2);
            this.f23886k = true;
            if (j() && !o()) {
                e();
            } else if (z11 || this.f23889n != iMax || this.f23890o != iMax2) {
                w(true, this.f23887l, this.f23888m);
            }
            this.f23889n = iMax;
            this.f23890o = iMax2;
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END);
            ep.a.i(0L);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (t(motionEvent)) {
            g(motionEvent);
        }
        f(motionEvent, false);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.f23882g) {
            this.f23882g = false;
            ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, getJSModuleName(), this.f23880e);
        }
    }

    public void p() {
        this.f23883h = new com.facebook.react.uimanager.k(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f23884i = new com.facebook.react.uimanager.j(this);
        }
    }

    void r(String str, WritableMap writableMap) {
        if (j()) {
            getCurrentReactContext().emitDeviceEvent(str, writableMap);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (i() && o()) {
            this.f23885j.e(view2);
            super.requestChildFocus(view, view2);
        } else {
            qk.a.I("ReactRootView", "Unable to handle child focus changed event as the catalyst instance has not been attached");
            super.requestChildFocus(view, view2);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z11);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.f23878c = bundle;
        if (n()) {
            c();
        }
    }

    public void setEventListener(b bVar) {
    }

    public void setIsFabric(boolean z11) {
        this.f23893r = z11 ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.g0
    public void setRootViewTag(int i11) {
        this.f23880e = i11;
    }

    @Override // com.facebook.react.uimanager.g0
    public void setShouldLogContentAppeared(boolean z11) {
        this.f23882g = z11;
    }

    public boolean t(MotionEvent motionEvent) {
        return true;
    }

    public void u(j0 j0Var, String str, Bundle bundle) {
        ep.a.c(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            gn.a.b(this.f23876a == null, "This root view has already been attached to a catalyst instance manager");
            this.f23876a = j0Var;
            this.f23877b = str;
            this.f23878c = bundle;
            j0Var.z();
            if (tn.b.d()) {
                if (!this.f23886k) {
                    s();
                }
                e();
            }
        } finally {
            ep.a.i(0L);
        }
    }

    public void v() {
        UiThreadUtil.assertOnUiThread();
        j0 j0Var = this.f23876a;
        if (j0Var != null && this.f23881f) {
            j0Var.C(this);
            this.f23881f = false;
        }
        this.f23876a = null;
        this.f23882g = false;
    }

    public x0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23880e = 0;
        this.f23885j = new w(this);
        this.f23886k = false;
        this.f23887l = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f23888m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f23889n = 0;
        this.f23890o = 0;
        this.f23891p = Integer.MIN_VALUE;
        this.f23892q = Integer.MIN_VALUE;
        this.f23893r = 1;
        this.f23894s = new AtomicInteger(0);
        k();
    }

    public x0(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f23880e = 0;
        this.f23885j = new w(this);
        this.f23886k = false;
        this.f23887l = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f23888m = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f23889n = 0;
        this.f23890o = 0;
        this.f23891p = Integer.MIN_VALUE;
        this.f23892q = Integer.MIN_VALUE;
        this.f23893r = 1;
        this.f23894s = new AtomicInteger(0);
        k();
    }
}
