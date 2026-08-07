package androidx.media3.ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p7.a1;
import p7.e1;
import p7.j0;
import p7.r0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerView extends FrameLayout implements p7.c {
    private int A;
    private boolean B;
    private CharSequence C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f12720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f12721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f12722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f12723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f12725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImageView f12726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ImageView f12727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SubtitleView f12728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f12729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final TextView f12730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final androidx.media3.ui.d f12731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final FrameLayout f12732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FrameLayout f12733n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Handler f12734o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Class<?> f12735p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Method f12736q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Object f12737r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private j0 f12738s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f12739t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private d f12740u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private androidx.media3.ui.d.m f12741v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private e f12742w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f12743x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f12744y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f12745z;

    private static class b {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    private final class c implements j0.d, View.OnClickListener, androidx.media3.ui.d.m, androidx.media3.ui.d.InterfaceC0213d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final r0.b f12746a = new r0.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f12747b;

        public c() {
        }

        @Override // p7.j0.d
        public void B(r7.e eVar) {
            if (PlayerView.this.f12728i != null) {
                PlayerView.this.f12728i.setCues(eVar.f107106a);
            }
        }

        @Override // p7.j0.d
        public void H(j0.e eVar, j0.e eVar2, int i11) {
            if (PlayerView.this.J() && PlayerView.this.F) {
                PlayerView.this.F();
            }
        }

        @Override // p7.j0.d
        public void S(a1 a1Var) {
            j0 j0Var = (j0) s7.a.f(PlayerView.this.f12738s);
            r0 r0VarJ = j0Var.c0(17) ? j0Var.J() : r0.f101451a;
            if (r0VarJ.u()) {
                this.f12747b = null;
            } else if (!j0Var.c0(30) || j0Var.p().c()) {
                Object obj = this.f12747b;
                if (obj != null) {
                    int iF = r0VarJ.f(obj);
                    if (iF != -1) {
                        if (j0Var.R() == r0VarJ.j(iF, this.f12746a).f101462c) {
                            return;
                        }
                    }
                    this.f12747b = null;
                }
            } else {
                this.f12747b = r0VarJ.k(j0Var.x(), this.f12746a, true).f101461b;
            }
            PlayerView.this.a0(false);
        }

        @Override // p7.j0.d
        public void b(e1 e1Var) {
            if (e1Var.equals(e1.f101328e) || PlayerView.this.f12738s == null || PlayerView.this.f12738s.g() == 1) {
                return;
            }
            PlayerView.this.V();
        }

        @Override // androidx.media3.ui.d.m
        public void n(int i11) {
            PlayerView.this.X();
            if (PlayerView.this.f12740u != null) {
                PlayerView.this.f12740u.a(i11);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.U();
        }

        @Override // p7.j0.d
        public void onPlayWhenReadyChanged(boolean z11, int i11) {
            PlayerView.this.W();
            PlayerView.this.Y();
        }

        @Override // p7.j0.d
        public void onPlaybackStateChanged(int i11) {
            PlayerView.this.W();
            PlayerView.this.Z();
            PlayerView.this.Y();
        }

        @Override // p7.j0.d
        public void onRenderedFirstFrame() {
            if (PlayerView.this.f12722c != null) {
                PlayerView.this.f12722c.setVisibility(4);
                if (PlayerView.this.B()) {
                    PlayerView.this.G();
                } else {
                    PlayerView.this.D();
                }
            }
        }

        @Override // p7.j0.d
        public void onSurfaceSizeChanged(int i11, int i12) {
            if (Build.VERSION.SDK_INT == 34 && (PlayerView.this.f12723d instanceof SurfaceView) && PlayerView.this.H) {
                f fVar = (f) s7.a.f(PlayerView.this.f12725f);
                Handler handler = PlayerView.this.f12734o;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.f12723d;
                final PlayerView playerView = PlayerView.this;
                fVar.d(handler, surfaceView, new Runnable() { // from class: ia.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        playerView.invalidate();
                    }
                });
            }
        }

        @Override // androidx.media3.ui.d.InterfaceC0213d
        public void q(boolean z11) {
            if (PlayerView.this.f12742w != null) {
                PlayerView.this.f12742w.a(z11);
            }
        }
    }

    public interface d {
        void a(int i11);
    }

    public interface e {
        void a(boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SurfaceSyncGroup f12749a;

        private f() {
        }

        public static /* synthetic */ void a(f fVar, SurfaceView surfaceView, Runnable runnable) {
            fVar.getClass();
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroupA = ia.m.a("exo-sync-b-334901521");
            fVar.f12749a = surfaceSyncGroupA;
            s7.a.h(surfaceSyncGroupA.add(rootSurfaceControl, new Runnable() { // from class: androidx.media3.ui.y
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.b();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(ia.n.a());
        }

        public static /* synthetic */ void b() {
        }

        public void c() {
            SurfaceSyncGroup surfaceSyncGroup = this.f12749a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f12749a = null;
            }
        }

        public void d(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: androidx.media3.ui.x
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.a(this.f12983a, surfaceView, runnable);
                }
            });
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B() {
        j0 j0Var = this.f12738s;
        return j0Var != null && this.f12737r != null && j0Var.c0(30) && j0Var.p().d(4);
    }

    private boolean C() {
        j0 j0Var = this.f12738s;
        return j0Var != null && j0Var.c0(30) && j0Var.p().d(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        G();
        ImageView imageView = this.f12726g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    private void E() {
        ImageView imageView = this.f12727h;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f12727h.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        ImageView imageView = this.f12726g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean H(int i11) {
        return i11 == 19 || i11 == 270 || i11 == 22 || i11 == 271 || i11 == 20 || i11 == 269 || i11 == 21 || i11 == 268 || i11 == 23;
    }

    private boolean I() {
        Drawable drawable;
        ImageView imageView = this.f12726g;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J() {
        j0 j0Var = this.f12738s;
        return j0Var != null && j0Var.c0(16) && this.f12738s.m() && this.f12738s.t();
    }

    private void K(boolean z11) {
        if (!(J() && this.F) && d0()) {
            boolean z12 = this.f12731l.k0() && this.f12731l.getShowTimeoutMs() <= 0;
            boolean zQ = Q();
            if (z11 || z12 || zQ) {
                S(zQ);
            }
        }
    }

    private void M(final Bitmap bitmap) {
        this.f12734o.post(new Runnable() { // from class: ia.k
            @Override // java.lang.Runnable
            public final void run() {
                PlayerView.a(this.f77194a, bitmap);
            }
        });
    }

    private boolean N(j0 j0Var) {
        byte[] bArr;
        if (j0Var == null || !j0Var.c0(18) || (bArr = j0Var.V().f101286k) == null) {
            return false;
        }
        return O(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean O(Drawable drawable) {
        if (this.f12727h != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f12743x == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                L(this.f12721b, width);
                this.f12727h.setScaleType(scaleType);
                this.f12727h.setImageDrawable(drawable);
                this.f12727h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void P(AspectRatioFrameLayout aspectRatioFrameLayout, int i11) {
        aspectRatioFrameLayout.setResizeMode(i11);
    }

    private boolean Q() {
        j0 j0Var = this.f12738s;
        if (j0Var == null) {
            return true;
        }
        int iG = j0Var.g();
        if (!this.E) {
            return false;
        }
        if (this.f12738s.c0(17) && this.f12738s.J().u()) {
            return false;
        }
        return iG == 1 || iG == 4 || !((j0) s7.a.f(this.f12738s)).t();
    }

    private void S(boolean z11) {
        if (d0()) {
            this.f12731l.setShowTimeoutMs(z11 ? 0 : this.D);
            this.f12731l.v0();
        }
    }

    private void T() {
        ImageView imageView = this.f12726g;
        if (imageView != null) {
            imageView.setVisibility(0);
            b0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        if (!d0() || this.f12738s == null) {
            return;
        }
        if (!this.f12731l.k0()) {
            K(true);
        } else if (this.G) {
            this.f12731l.e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V() {
        j0 j0Var = this.f12738s;
        e1 e1VarO = j0Var != null ? j0Var.O() : e1.f101328e;
        int i11 = e1VarO.f101332a;
        int i12 = e1VarO.f101333b;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float f12 = (i12 == 0 || i11 == 0) ? 0.0f : (i11 * e1VarO.f101335d) / i12;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f12721b;
        if (!this.f12724e) {
            f11 = f12;
        }
        L(aspectRatioFrameLayout, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public void W() {
        boolean z11;
        if (this.f12729j != null) {
            j0 j0Var = this.f12738s;
            if (j0Var == null || j0Var.g() != 2) {
                z11 = false;
            } else {
                int i11 = this.A;
                z11 = true;
                if (i11 != 2 && (i11 != 1 || !this.f12738s.t())) {
                    z11 = false;
                }
            }
            this.f12729j.setVisibility(z11 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        androidx.media3.ui.d dVar = this.f12731l;
        if (dVar == null || !this.f12739t) {
            setContentDescription(null);
        } else if (dVar.k0()) {
            setContentDescription(this.G ? getResources().getString(ia.x.f77271e) : null);
        } else {
            setContentDescription(getResources().getString(ia.x.f77278l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (J() && this.F) {
            F();
        } else {
            K(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        TextView textView = this.f12730k;
        if (textView != null) {
            CharSequence charSequence = this.C;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f12730k.setVisibility(0);
            } else {
                j0 j0Var = this.f12738s;
                if (j0Var != null) {
                    j0Var.a();
                }
                this.f12730k.setVisibility(8);
            }
        }
    }

    public static /* synthetic */ void a(PlayerView playerView, Bitmap bitmap) {
        playerView.getClass();
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        if (playerView.C()) {
            return;
        }
        playerView.T();
        playerView.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(boolean z11) {
        j0 j0Var = this.f12738s;
        boolean z12 = false;
        boolean z13 = (j0Var == null || !j0Var.c0(30) || j0Var.p().c()) ? false : true;
        if (!this.B && (!z13 || z11)) {
            E();
            y();
            D();
        }
        if (z13) {
            boolean zC = C();
            boolean zB = B();
            if (!zC && !zB) {
                y();
                D();
            }
            View view = this.f12722c;
            if (view != null && view.getVisibility() == 4 && I()) {
                z12 = true;
            }
            if (zB && !zC && z12) {
                y();
                T();
            } else if (zC && !zB && z12) {
                D();
            }
            if (zC || zB || !c0() || !(N(j0Var) || O(this.f12745z))) {
                E();
            }
        }
    }

    public static /* synthetic */ Object b(PlayerView playerView, Object obj, Method method, Object[] objArr) {
        playerView.getClass();
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        playerView.M((Bitmap) objArr[1]);
        return null;
    }

    private void b0() {
        Drawable drawable;
        ImageView imageView = this.f12726g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f12744y == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f12726g.getVisibility() == 0) {
            L(this.f12721b, width);
        }
        this.f12726g.setScaleType(scaleType);
    }

    private boolean c0() {
        if (this.f12743x == 0) {
            return false;
        }
        s7.a.j(this.f12727h);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean d0() {
        if (!this.f12739t) {
            return false;
        }
        s7.a.j(this.f12731l);
        return true;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f12726g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        b0();
    }

    private void setImageOutput(j0 j0Var) {
        Class<?> cls = this.f12735p;
        if (cls == null || !cls.isAssignableFrom(j0Var.getClass())) {
            return;
        }
        try {
            ((Method) s7.a.f(this.f12736q)).invoke(j0Var, s7.a.f(this.f12737r));
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private void x(j0 j0Var) {
        Class<?> cls = this.f12735p;
        if (cls == null || !cls.isAssignableFrom(j0Var.getClass())) {
            return;
        }
        try {
            ((Method) s7.a.f(this.f12736q)).invoke(j0Var, null);
        } catch (IllegalAccessException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    private void y() {
        View view = this.f12722c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(q0.g0(context, resources, ia.r.f77203a));
        imageView.setBackgroundColor(resources.getColor(ia.p.f77198a, null));
    }

    public boolean A(KeyEvent keyEvent) {
        return d0() && this.f12731l.a0(keyEvent);
    }

    public void F() {
        androidx.media3.ui.d dVar = this.f12731l;
        if (dVar != null) {
            dVar.e0();
        }
    }

    protected void L(AspectRatioFrameLayout aspectRatioFrameLayout, float f11) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f11);
        }
    }

    public void R() {
        S(Q());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        f fVar;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (fVar = this.f12725f) != null && this.H) {
            fVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        j0 j0Var = this.f12738s;
        if (j0Var != null && j0Var.c0(16) && this.f12738s.m()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zH = H(keyEvent.getKeyCode());
        if (zH && d0() && !this.f12731l.k0()) {
            K(true);
            return true;
        }
        if (A(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            K(true);
            return true;
        }
        if (zH && d0()) {
            K(true);
        }
        return false;
    }

    public List<p7.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f12733n;
        if (frameLayout != null) {
            arrayList.add(new p7.a.C2150a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        androidx.media3.ui.d dVar = this.f12731l;
        if (dVar != null) {
            arrayList.add(new p7.a.C2150a(dVar, 1).a());
        }
        return com.google.common.collect.x.n(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) s7.a.k(this.f12732m, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f12743x;
    }

    public boolean getControllerAutoShow() {
        return this.E;
    }

    public boolean getControllerHideOnTouch() {
        return this.G;
    }

    public int getControllerShowTimeoutMs() {
        return this.D;
    }

    public Drawable getDefaultArtwork() {
        return this.f12745z;
    }

    public int getImageDisplayMode() {
        return this.f12744y;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f12733n;
    }

    public j0 getPlayer() {
        return this.f12738s;
    }

    public int getResizeMode() {
        s7.a.j(this.f12721b);
        return this.f12721b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f12728i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f12743x != 0;
    }

    public boolean getUseController() {
        return this.f12739t;
    }

    public View getVideoSurfaceView() {
        return this.f12723d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!d0() || this.f12738s == null) {
            return false;
        }
        K(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        U();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i11) {
        s7.a.h(i11 == 0 || this.f12727h != null);
        if (this.f12743x != i11) {
            this.f12743x = i11;
            a0(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        s7.a.j(this.f12721b);
        this.f12721b.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setAnimationEnabled(z11);
    }

    public void setControllerAutoShow(boolean z11) {
        this.E = z11;
    }

    public void setControllerHideDuringAds(boolean z11) {
        this.F = z11;
    }

    public void setControllerHideOnTouch(boolean z11) {
        s7.a.j(this.f12731l);
        this.G = z11;
        X();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(androidx.media3.ui.d.InterfaceC0213d interfaceC0213d) {
        s7.a.j(this.f12731l);
        this.f12742w = null;
        this.f12731l.setOnFullScreenModeChangedListener(interfaceC0213d);
    }

    public void setControllerShowTimeoutMs(int i11) {
        s7.a.j(this.f12731l);
        this.D = i11;
        if (this.f12731l.k0()) {
            R();
        }
    }

    public void setControllerVisibilityListener(d dVar) {
        this.f12740u = dVar;
        if (dVar != null) {
            setControllerVisibilityListener((androidx.media3.ui.d.m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        s7.a.h(this.f12730k != null);
        this.C = charSequence;
        Z();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f12745z != drawable) {
            this.f12745z = drawable;
            a0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z11) {
        this.H = z11;
    }

    public void setErrorMessageProvider(p7.o<? super PlaybackException> oVar) {
        if (oVar != null) {
            Z();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        s7.a.j(this.f12731l);
        this.f12731l.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(e eVar) {
        s7.a.j(this.f12731l);
        this.f12742w = eVar;
        this.f12731l.setOnFullScreenModeChangedListener(this.f12720a);
    }

    public void setFullscreenButtonState(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.B0(z11);
    }

    public void setImageDisplayMode(int i11) {
        s7.a.h(this.f12726g != null);
        if (this.f12744y != i11) {
            this.f12744y = i11;
            b0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z11) {
        if (this.B != z11) {
            this.B = z11;
            a0(false);
        }
    }

    public void setPlayer(j0 j0Var) {
        s7.a.h(Looper.myLooper() == Looper.getMainLooper());
        s7.a.a(j0Var == null || j0Var.F0() == Looper.getMainLooper());
        j0 j0Var2 = this.f12738s;
        if (j0Var2 == j0Var) {
            return;
        }
        if (j0Var2 != null) {
            j0Var2.e0(this.f12720a);
            if (j0Var2.c0(27)) {
                View view = this.f12723d;
                if (view instanceof TextureView) {
                    j0Var2.y((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    j0Var2.S((SurfaceView) view);
                }
            }
            x(j0Var2);
        }
        SubtitleView subtitleView = this.f12728i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f12738s = j0Var;
        if (d0()) {
            this.f12731l.setPlayer(j0Var);
        }
        W();
        Z();
        a0(true);
        if (j0Var == null) {
            F();
            return;
        }
        if (j0Var.c0(27)) {
            View view2 = this.f12723d;
            if (view2 instanceof TextureView) {
                j0Var.L((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                j0Var.o((SurfaceView) view2);
            }
            if (!j0Var.c0(30) || j0Var.p().e(2)) {
                V();
            }
        }
        if (this.f12728i != null && j0Var.c0(28)) {
            this.f12728i.setCues(j0Var.H().f107106a);
        }
        j0Var.D0(this.f12720a);
        setImageOutput(j0Var);
        K(false);
    }

    public void setRepeatToggleModes(int i11) {
        s7.a.j(this.f12731l);
        this.f12731l.setRepeatToggleModes(i11);
    }

    public void setResizeMode(int i11) {
        s7.a.j(this.f12721b);
        this.f12721b.setResizeMode(i11);
    }

    public void setShowBuffering(int i11) {
        if (this.A != i11) {
            this.A = i11;
            W();
        }
    }

    public void setShowFastForwardButton(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setShowFastForwardButton(z11);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setShowMultiWindowTimeBar(z11);
    }

    public void setShowNextButton(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setShowNextButton(z11);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setShowPlayButtonIfPlaybackIsSuppressed(z11);
    }

    public void setShowPreviousButton(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setShowPreviousButton(z11);
    }

    public void setShowRewindButton(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setShowRewindButton(z11);
    }

    public void setShowShuffleButton(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setShowShuffleButton(z11);
    }

    public void setShowSubtitleButton(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setShowSubtitleButton(z11);
    }

    public void setShowVrButton(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setShowVrButton(z11);
    }

    public void setShutterBackgroundColor(int i11) {
        View view = this.f12722c;
        if (view != null) {
            view.setBackgroundColor(i11);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z11) {
        s7.a.j(this.f12731l);
        this.f12731l.setTimeBarScrubbingEnabled(z11);
    }

    @Deprecated
    public void setUseArtwork(boolean z11) {
        setArtworkDisplayMode(!z11 ? 1 : 0);
    }

    public void setUseController(boolean z11) {
        boolean z12 = true;
        s7.a.h((z11 && this.f12731l == null) ? false : true);
        if (!z11 && !hasOnClickListeners()) {
            z12 = false;
        }
        setClickable(z12);
        if (this.f12739t == z11) {
            return;
        }
        this.f12739t = z11;
        if (d0()) {
            this.f12731l.setPlayer(this.f12738s);
        } else {
            androidx.media3.ui.d dVar = this.f12731l;
            if (dVar != null) {
                dVar.e0();
                this.f12731l.setPlayer(null);
            }
        }
        X();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        View view = this.f12723d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i11);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i11) {
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        boolean z15;
        boolean z16;
        a aVar;
        boolean z17;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i22;
        super(context, attributeSet, i11);
        c cVar = new c();
        this.f12720a = cVar;
        this.f12734o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f12721b = null;
            this.f12722c = null;
            this.f12723d = null;
            this.f12724e = false;
            this.f12725f = null;
            this.f12726g = null;
            this.f12727h = null;
            this.f12728i = null;
            this.f12729j = null;
            this.f12730k = null;
            this.f12731l = null;
            this.f12732m = null;
            this.f12733n = null;
            this.f12735p = null;
            this.f12736q = null;
            this.f12737r = null;
            ImageView imageView = new ImageView(context);
            z(context, getResources(), imageView);
            addView(imageView);
            return;
        }
        int i23 = ia.v.f77261d;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ia.z.f77317l0, i11, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(ia.z.f77341x0);
                int color = typedArrayObtainStyledAttributes.getColor(ia.z.f77341x0, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(ia.z.f77333t0, i23);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(ia.z.f77345z0, true);
                int i24 = typedArrayObtainStyledAttributes.getInt(ia.z.f77319m0, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ia.z.f77323o0, 0);
                int i25 = typedArrayObtainStyledAttributes.getInt(ia.z.f77329r0, 0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(ia.z.A0, true);
                int i26 = typedArrayObtainStyledAttributes.getInt(ia.z.f77343y0, 1);
                int i27 = typedArrayObtainStyledAttributes.getInt(ia.z.f77335u0, 0);
                i12 = typedArrayObtainStyledAttributes.getInt(ia.z.f77339w0, 5000);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(ia.z.f77327q0, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(ia.z.f77321n0, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(ia.z.f77337v0, 0);
                this.B = typedArrayObtainStyledAttributes.getBoolean(ia.z.f77331s0, this.B);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(ia.z.f77325p0, true);
                typedArrayObtainStyledAttributes.recycle();
                i15 = resourceId2;
                z12 = z21;
                z15 = zHasValue;
                i16 = i27;
                z14 = z23;
                i13 = resourceId;
                z11 = z19;
                z13 = z22;
                z16 = z18;
                i18 = i25;
                i21 = i24;
                i19 = color;
                i17 = i26;
                i14 = integer;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i12 = 5000;
            i13 = i23;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 1;
            i18 = 0;
            i19 = 0;
            i21 = 1;
            z15 = false;
            z16 = true;
        }
        LayoutInflater.from(context).inflate(i13, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(ia.t.f77238i);
        this.f12721b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            P(aspectRatioFrameLayout, i16);
        }
        View viewFindViewById = findViewById(ia.t.P);
        this.f12722c = viewFindViewById;
        if (viewFindViewById != null && z15) {
            viewFindViewById.setBackgroundColor(i19);
        }
        if (aspectRatioFrameLayout != null && i17 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i17 == 2) {
                this.f12723d = new TextureView(context);
            } else {
                if (i17 == 3) {
                    try {
                        int i28 = v8.l.f118387m;
                        this.f12723d = (View) v8.l.class.getConstructor(Context.class).newInstance(context);
                        z17 = true;
                    } catch (Exception e11) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                } else if (i17 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        b.a(surfaceView);
                    }
                    this.f12723d = surfaceView;
                } else {
                    try {
                        int i29 = u8.i.f115879b;
                        this.f12723d = (View) u8.i.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e12) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e12);
                    }
                }
                this.f12723d.setLayoutParams(layoutParams);
                this.f12723d.setOnClickListener(cVar);
                this.f12723d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f12723d, 0);
                aVar = null;
            }
            z17 = false;
            this.f12723d.setLayoutParams(layoutParams);
            this.f12723d.setOnClickListener(cVar);
            this.f12723d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f12723d, 0);
            aVar = null;
        } else {
            aVar = null;
            this.f12723d = null;
            z17 = false;
        }
        this.f12724e = z17;
        this.f12725f = Build.VERSION.SDK_INT == 34 ? new f() : null;
        this.f12732m = (FrameLayout) findViewById(ia.t.f77230a);
        this.f12733n = (FrameLayout) findViewById(ia.t.B);
        this.f12726g = (ImageView) findViewById(ia.t.f77250u);
        this.f12744y = i18;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.f10306a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: ia.j
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return PlayerView.b(this.f77193a, obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f12735p = cls;
        this.f12736q = method;
        this.f12737r = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(ia.t.f77231b);
        this.f12727h = imageView2;
        this.f12743x = (!z16 || i21 == 0 || imageView2 == null) ? 0 : i21;
        if (i15 != 0) {
            this.f12745z = androidx.core.content.b.getDrawable(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(ia.t.S);
        this.f12728i = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(ia.t.f77235f);
        this.f12729j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.A = i14;
        TextView textView = (TextView) findViewById(ia.t.f77243n);
        this.f12730k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        androidx.media3.ui.d dVar = (androidx.media3.ui.d) findViewById(ia.t.f77239j);
        View viewFindViewById3 = findViewById(ia.t.f77240k);
        if (dVar != null) {
            this.f12731l = dVar;
            i22 = 0;
        } else if (viewFindViewById3 != null) {
            i22 = 0;
            androidx.media3.ui.d dVar2 = new androidx.media3.ui.d(context, null, 0, attributeSet);
            this.f12731l = dVar2;
            dVar2.setId(ia.t.f77239j);
            dVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(dVar2, iIndexOfChild);
        } else {
            i22 = 0;
            this.f12731l = null;
        }
        androidx.media3.ui.d dVar3 = this.f12731l;
        this.D = dVar3 != null ? i12 : i22;
        this.G = z12;
        this.E = z13;
        this.F = z14;
        this.f12739t = (!z11 || dVar3 == null) ? i22 : 1;
        if (dVar3 != null) {
            dVar3.f0();
            this.f12731l.Y(this.f12720a);
        }
        if (z11) {
            setClickable(true);
        }
        X();
    }

    @Deprecated
    public void setControllerVisibilityListener(androidx.media3.ui.d.m mVar) {
        s7.a.j(this.f12731l);
        androidx.media3.ui.d.m mVar2 = this.f12741v;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f12731l.s0(mVar2);
        }
        this.f12741v = mVar;
        if (mVar != null) {
            this.f12731l.Y(mVar);
            setControllerVisibilityListener((d) null);
        }
    }
}
