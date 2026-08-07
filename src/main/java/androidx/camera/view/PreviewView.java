package androidx.camera.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.j0;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.core.view.ViewCompat;
import androidx.p003lifecycle.d0;
import androidx.p003lifecycle.i0;
import c0.c1;
import c0.c2;
import c0.h1;
import c0.r0;
import c0.y0;
import c0.z1;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final c f3671p = c.PERFORMANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    c f3672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    m f3673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final r f3674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    final androidx.camera.view.f f3675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f3676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    final i0<f> f3677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AtomicReference<androidx.camera.view.e> f3678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Executor f3679h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    n f3680i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final j1.a f3681j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    androidx.camera.core.impl.i0 f3682k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MotionEvent f3683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    private final b f3684m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View.OnLayoutChangeListener f3685n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final h1.c f3686o;

    class a implements h1.c {
        a() {
        }

        public static /* synthetic */ void c(a aVar, androidx.camera.view.e eVar, j0 j0Var) {
            if (i.a(PreviewView.this.f3678g, eVar, null)) {
                eVar.i(f.IDLE);
            }
            eVar.f();
            j0Var.a().d(eVar);
        }

        public static /* synthetic */ void d(a aVar, j0 j0Var, z1 z1Var, z1.h hVar) {
            PreviewView previewView;
            m mVar;
            aVar.getClass();
            y0.a("PreviewView", "Preview transformation info updated. " + hVar);
            PreviewView.this.f3675d.r(hVar, z1Var.p(), j0Var.e().f() == 0);
            if (hVar.d() == -1 || ((mVar = (previewView = PreviewView.this).f3673b) != null && (mVar instanceof v))) {
                PreviewView.this.f3676e = true;
            } else {
                previewView.f3676e = false;
            }
            PreviewView.this.d();
        }

        @Override // c0.h1.c
        public void a(@NonNull final z1 z1Var) {
            m vVar;
            if (!h0.r.d()) {
                androidx.core.content.b.getMainExecutor(PreviewView.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.this.f3686o.a(z1Var);
                    }
                });
                return;
            }
            y0.a("PreviewView", "Surface requested by Preview.");
            final j0 j0VarL = z1Var.l();
            PreviewView.this.f3682k = j0VarL.e();
            PreviewView.this.f3680i.g(j0VarL.l().l());
            z1Var.v(androidx.core.content.b.getMainExecutor(PreviewView.this.getContext()), new z1.i() { // from class: androidx.camera.view.k
                @Override // c0.z1.i
                public final void a(z1.h hVar) {
                    PreviewView.a.d(this.f3738a, j0VarL, z1Var, hVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (!PreviewView.e(previewView.f3673b, z1Var, previewView.f3672a)) {
                PreviewView previewView2 = PreviewView.this;
                if (PreviewView.f(z1Var, previewView2.f3672a)) {
                    PreviewView previewView3 = PreviewView.this;
                    vVar = new c0(previewView3, previewView3.f3675d);
                } else {
                    PreviewView previewView4 = PreviewView.this;
                    vVar = new v(previewView4, previewView4.f3675d);
                }
                previewView2.f3673b = vVar;
            }
            androidx.camera.core.impl.i0 i0VarE = j0VarL.e();
            PreviewView previewView5 = PreviewView.this;
            final androidx.camera.view.e eVar = new androidx.camera.view.e(i0VarE, previewView5.f3677f, previewView5.f3673b);
            PreviewView.this.f3678g.set(eVar);
            j0VarL.a().c(androidx.core.content.b.getMainExecutor(PreviewView.this.getContext()), eVar);
            PreviewView.this.f3673b.g(z1Var, new m.a() { // from class: androidx.camera.view.l
                @Override // androidx.camera.view.m.a
                public final void a() {
                    PreviewView.a.c(this.f3741a, eVar, j0VarL);
                }
            });
            PreviewView previewView6 = PreviewView.this;
            if (previewView6.indexOfChild(previewView6.f3674c) == -1) {
                PreviewView previewView7 = PreviewView.this;
                previewView7.addView(previewView7.f3674c);
            }
            PreviewView.this.getClass();
        }
    }

    class b implements DisplayManager.DisplayListener {
        b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i11) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i11) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i11) {
                return;
            }
            PreviewView.this.d();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i11) {
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);

        private final int mId;

        c(int i11) {
            this.mId = i11;
        }

        static c fromId(int i11) {
            for (c cVar : values()) {
                if (cVar.mId == i11) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i11);
        }

        int getId() {
            return this.mId;
        }
    }

    public interface d {
    }

    public enum e {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        private final int mId;

        e(int i11) {
            this.mId = i11;
        }

        static e fromId(int i11) {
            for (e eVar : values()) {
                if (eVar.mId == i11) {
                    return eVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i11);
        }

        int getId() {
            return this.mId;
        }
    }

    public enum f {
        IDLE,
        STREAMING
    }

    public PreviewView(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(PreviewView previewView, View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        previewView.getClass();
        if (i13 - i11 == i17 - i15 && i14 - i12 == i18 - i16) {
            return;
        }
        previewView.d();
        previewView.b(true);
    }

    private void b(boolean z11) {
        h0.r.b();
        getViewPort();
    }

    static boolean e(m mVar, @NonNull z1 z1Var, @NonNull c cVar) {
        return (mVar instanceof v) && !f(z1Var, cVar);
    }

    static boolean f(@NonNull z1 z1Var, @NonNull c cVar) {
        boolean zEquals = z1Var.l().e().x().equals("androidx.camera.camera2.legacy");
        boolean z11 = (androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewStretchedQuirk.class) == null && androidx.camera.view.internal.compat.quirk.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT <= 24 || zEquals || z11) {
            return true;
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    private void g() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f3684m, new Handler(Looper.getMainLooper()));
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private r0.i getScreenFlashInternal() {
        return this.f3674c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i11 = 1;
        if (iOrdinal != 1) {
            i11 = 2;
            if (iOrdinal != 2) {
                i11 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i11;
    }

    private void h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f3684m);
    }

    private void setScreenFlashUiInfo(r0.i iVar) {
        y0.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    @SuppressLint({"WrongConstant"})
    public c2 c(int i11) {
        h0.r.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new c2.a(new Rational(getWidth(), getHeight()), i11).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    void d() {
        h0.r.b();
        if (this.f3673b != null) {
            i();
            this.f3673b.h();
        }
        this.f3680i.f(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public Bitmap getBitmap() {
        h0.r.b();
        m mVar = this.f3673b;
        if (mVar == null) {
            return null;
        }
        return mVar.a();
    }

    public androidx.camera.view.a getController() {
        h0.r.b();
        return null;
    }

    @NonNull
    public c getImplementationMode() {
        h0.r.b();
        return this.f3672a;
    }

    @NonNull
    public c1 getMeteringPointFactory() {
        h0.r.b();
        return this.f3680i;
    }

    public l1.b getOutputTransform() {
        Matrix matrixJ;
        h0.r.b();
        try {
            matrixJ = this.f3675d.j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixJ = null;
        }
        Rect rectI = this.f3675d.i();
        if (matrixJ == null || rectI == null) {
            y0.a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrixJ.preConcat(h0.s.b(rectI));
        if (this.f3673b instanceof c0) {
            matrixJ.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            y0.l("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new l1.b(matrixJ, new Size(rectI.width(), rectI.height()));
    }

    @NonNull
    public d0<f> getPreviewStreamState() {
        return this.f3677f;
    }

    @NonNull
    public e getScaleType() {
        h0.r.b();
        return this.f3675d.g();
    }

    public r0.i getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        h0.r.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f3675d.h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    @NonNull
    public h1.c getSurfaceProvider() {
        h0.r.b();
        return this.f3686o;
    }

    public c2 getViewPort() {
        h0.r.b();
        if (getDisplay() == null) {
            return null;
        }
        return c(getDisplay().getRotation());
    }

    void i() {
        Display display;
        androidx.camera.core.impl.i0 i0Var;
        if (!this.f3676e || (display = getDisplay()) == null || (i0Var = this.f3682k) == null) {
            return;
        }
        this.f3675d.o(i0Var.i(display.getRotation()), display.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        g();
        addOnLayoutChangeListener(this.f3685n);
        m mVar = this.f3673b;
        if (mVar != null) {
            mVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f3685n);
        m mVar = this.f3673b;
        if (mVar != null) {
            mVar.e();
        }
        h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f3683l = null;
        return super.performClick();
    }

    public void setController(androidx.camera.view.a aVar) {
        h0.r.b();
        b(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setFrameUpdateListener(@NonNull Executor executor, @NonNull d dVar) {
        if (this.f3672a == c.PERFORMANCE) {
            throw new IllegalArgumentException("PERFORMANCE mode doesn't support frame update listener");
        }
        this.f3679h = executor;
        m mVar = this.f3673b;
        if (mVar != null) {
            mVar.i(executor, dVar);
        }
    }

    public void setImplementationMode(@NonNull c cVar) {
        h0.r.b();
        this.f3672a = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(@NonNull e eVar) {
        h0.r.b();
        this.f3675d.q(eVar);
        d();
        b(false);
    }

    public void setScreenFlashOverlayColor(int i11) {
        this.f3674c.setBackgroundColor(i11);
    }

    public void setScreenFlashWindow(Window window) {
        h0.r.b();
        this.f3674c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public PreviewView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(@NonNull Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public PreviewView(@NonNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        c cVar = f3671p;
        this.f3672a = cVar;
        androidx.camera.view.f fVar = new androidx.camera.view.f();
        this.f3675d = fVar;
        this.f3676e = true;
        this.f3677f = new i0<>(f.IDLE);
        this.f3678g = new AtomicReference<>();
        this.f3680i = new n(fVar);
        this.f3684m = new b();
        this.f3685n = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
                PreviewView.a(this.f3733a, view, i13, i14, i15, i16, i17, i18, i19, i21);
            }
        };
        this.f3686o = new a();
        h0.r.b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o.f3752a, i11, i12);
        ViewCompat.n0(this, context, o.f3752a, attributeSet, typedArrayObtainStyledAttributes, i11, i12);
        try {
            setScaleType(e.fromId(typedArrayObtainStyledAttributes.getInteger(o.f3754c, fVar.g().getId())));
            setImplementationMode(c.fromId(typedArrayObtainStyledAttributes.getInteger(o.f3753b, cVar.getId())));
            typedArrayObtainStyledAttributes.recycle();
            this.f3681j = new j1.a(context, new j1.a.b() { // from class: androidx.camera.view.h
            });
            if (getBackground() == null) {
                setBackgroundColor(androidx.core.content.b.getColor(getContext(), R.color.black));
            }
            r rVar = new r(context);
            this.f3674c = rVar;
            rVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
