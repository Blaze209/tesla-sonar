package com.google.android.exoplayer2.ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
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
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class StyledPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f40768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AspectRatioFrameLayout f40769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f40770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f40771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f40772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f40773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SubtitleView f40774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final View f40775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f40776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final g f40777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final FrameLayout f40778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f40779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private v1 f40780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f40781n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f40782o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private g.m f40783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f40784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f40785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f40786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f40787t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CharSequence f40788u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f40789v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f40790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f40791x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f40792y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f40793z;

    private final class a implements v1.d, View.OnLayoutChangeListener, View.OnClickListener, g.m, g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f2.b f40794a = new f2.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f40795b;

        public a() {
        }

        @Override // com.google.android.exoplayer2.ui.g.m
        public void n(int i11) {
            StyledPlayerView.this.K();
            if (StyledPlayerView.this.f40782o != null) {
                StyledPlayerView.this.f40782o.a(i11);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            StyledPlayerView.this.H();
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void onCues(gs.f fVar) {
            if (StyledPlayerView.this.f40774g != null) {
                StyledPlayerView.this.f40774g.setCues(fVar.f69511a);
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            StyledPlayerView.q((TextureView) view, StyledPlayerView.this.f40793z);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void onPlayWhenReadyChanged(boolean z11, int i11) {
            StyledPlayerView.this.J();
            StyledPlayerView.this.L();
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void onPlaybackStateChanged(int i11) {
            StyledPlayerView.this.J();
            StyledPlayerView.this.M();
            StyledPlayerView.this.L();
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void onPositionDiscontinuity(v1.e eVar, v1.e eVar2, int i11) {
            if (StyledPlayerView.this.y() && StyledPlayerView.this.f40791x) {
                StyledPlayerView.this.w();
            }
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void onRenderedFirstFrame() {
            if (StyledPlayerView.this.f40770c != null) {
                StyledPlayerView.this.f40770c.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void onTracksChanged(g2 g2Var) {
            v1 v1Var = (v1) ts.a.e(StyledPlayerView.this.f40780m);
            f2 f2VarJ = v1Var.c0(17) ? v1Var.J() : f2.f39911a;
            if (f2VarJ.u()) {
                this.f40795b = null;
            } else if (!v1Var.c0(30) || v1Var.p().c()) {
                Object obj = this.f40795b;
                if (obj != null) {
                    int iF = f2VarJ.f(obj);
                    if (iF != -1) {
                        if (v1Var.R() == f2VarJ.j(iF, this.f40794a).f39924c) {
                            return;
                        }
                    }
                    this.f40795b = null;
                }
            } else {
                this.f40795b = f2VarJ.k(v1Var.x(), this.f40794a, true).f39923b;
            }
            StyledPlayerView.this.N(false);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void onVideoSizeChanged(us.z zVar) {
            if (zVar.equals(us.z.f116707e) || StyledPlayerView.this.f40780m == null || StyledPlayerView.this.f40780m.g() == 1) {
                return;
            }
            StyledPlayerView.this.I();
        }

        @Override // com.google.android.exoplayer2.ui.g.d
        public void q(boolean z11) {
            StyledPlayerView.h(StyledPlayerView.this);
        }
    }

    public interface b {
        void a(int i11);
    }

    public interface c {
    }

    public StyledPlayerView(Context context) {
        this(context, null);
    }

    @RequiresNonNull({"artworkView"})
    private boolean B(v1 v1Var) {
        byte[] bArr;
        if (v1Var.c0(18) && (bArr = v1Var.V().f41343j) != null) {
            return C(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
        }
        return false;
    }

    @RequiresNonNull({"artworkView"})
    private boolean C(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f40784q == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                A(this.f40769b, width);
                this.f40773f.setScaleType(scaleType);
                this.f40773f.setImageDrawable(drawable);
                this.f40773f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void D(AspectRatioFrameLayout aspectRatioFrameLayout, int i11) {
        aspectRatioFrameLayout.setResizeMode(i11);
    }

    private boolean E() {
        v1 v1Var = this.f40780m;
        if (v1Var == null) {
            return true;
        }
        int iG = v1Var.g();
        if (!this.f40790w) {
            return false;
        }
        if (this.f40780m.c0(17) && this.f40780m.J().u()) {
            return false;
        }
        return iG == 1 || iG == 4 || !((v1) ts.a.e(this.f40780m)).t();
    }

    private void G(boolean z11) {
        if (P()) {
            this.f40777j.setShowTimeoutMs(z11 ? 0 : this.f40789v);
            this.f40777j.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        if (!P() || this.f40780m == null) {
            return;
        }
        if (!this.f40777j.b0()) {
            z(true);
        } else if (this.f40792y) {
            this.f40777j.X();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        v1 v1Var = this.f40780m;
        us.z zVarO = v1Var != null ? v1Var.O() : us.z.f116707e;
        int i11 = zVarO.f116713a;
        int i12 = zVarO.f116714b;
        int i13 = zVarO.f116715c;
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float f12 = (i12 == 0 || i11 == 0) ? 0.0f : (i11 * zVarO.f116716d) / i12;
        View view = this.f40771d;
        if (view instanceof TextureView) {
            if (f12 > BitmapDescriptorFactory.HUE_RED && (i13 == 90 || i13 == 270)) {
                f12 = 1.0f / f12;
            }
            if (this.f40793z != 0) {
                view.removeOnLayoutChangeListener(this.f40768a);
            }
            this.f40793z = i13;
            if (i13 != 0) {
                this.f40771d.addOnLayoutChangeListener(this.f40768a);
            }
            q((TextureView) this.f40771d, this.f40793z);
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f40769b;
        if (!this.f40772e) {
            f11 = f12;
        }
        A(aspectRatioFrameLayout, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public void J() {
        boolean z11;
        if (this.f40775h != null) {
            v1 v1Var = this.f40780m;
            if (v1Var == null || v1Var.g() != 2) {
                z11 = false;
            } else {
                int i11 = this.f40786s;
                z11 = true;
                if (i11 != 2 && (i11 != 1 || !this.f40780m.t())) {
                    z11 = false;
                }
            }
            this.f40775h.setVisibility(z11 ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        g gVar = this.f40777j;
        if (gVar == null || !this.f40781n) {
            setContentDescription(null);
        } else if (gVar.b0()) {
            setContentDescription(this.f40792y ? getResources().getString(rs.o.f109144e) : null);
        } else {
            setContentDescription(getResources().getString(rs.o.f109151l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (y() && this.f40791x) {
            w();
        } else {
            z(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        TextView textView = this.f40776i;
        if (textView != null) {
            CharSequence charSequence = this.f40788u;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f40776i.setVisibility(0);
            } else {
                v1 v1Var = this.f40780m;
                if (v1Var != null) {
                    v1Var.a();
                }
                this.f40776i.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z11) {
        v1 v1Var = this.f40780m;
        if (v1Var == null || !v1Var.c0(30) || v1Var.p().c()) {
            if (this.f40787t) {
                return;
            }
            v();
            r();
            return;
        }
        if (z11 && !this.f40787t) {
            r();
        }
        if (v1Var.p().d(2)) {
            v();
            return;
        }
        r();
        if (O() && (B(v1Var) || C(this.f40785r))) {
            return;
        }
        v();
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    private boolean O() {
        if (this.f40784q == 0) {
            return false;
        }
        ts.a.i(this.f40773f);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean P() {
        if (!this.f40781n) {
            return false;
        }
        ts.a.i(this.f40777j);
        return true;
    }

    static /* synthetic */ c h(StyledPlayerView styledPlayerView) {
        styledPlayerView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(TextureView textureView, int i11) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != BitmapDescriptorFactory.HUE_RED && height != BitmapDescriptorFactory.HUE_RED && i11 != 0) {
            float f11 = width / 2.0f;
            float f12 = height / 2.0f;
            matrix.postRotate(i11, f11, f12);
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f11, f12);
        }
        textureView.setTransform(matrix);
    }

    private void r() {
        View view = this.f40770c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void s(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(p0.R(context, resources, rs.i.f109090a));
        imageView.setBackgroundColor(resources.getColor(rs.g.f109085a));
    }

    private static void t(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(p0.R(context, resources, rs.i.f109090a));
        imageView.setBackgroundColor(resources.getColor(rs.g.f109085a, null));
    }

    private void v() {
        ImageView imageView = this.f40773f;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f40773f.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean x(int i11) {
        return i11 == 19 || i11 == 270 || i11 == 22 || i11 == 271 || i11 == 20 || i11 == 269 || i11 == 21 || i11 == 268 || i11 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        v1 v1Var = this.f40780m;
        return v1Var != null && v1Var.c0(16) && this.f40780m.m() && this.f40780m.t();
    }

    private void z(boolean z11) {
        if (!(y() && this.f40791x) && P()) {
            boolean z12 = this.f40777j.b0() && this.f40777j.getShowTimeoutMs() <= 0;
            boolean zE = E();
            if (z11 || z12 || zE) {
                G(zE);
            }
        }
    }

    protected void A(AspectRatioFrameLayout aspectRatioFrameLayout, float f11) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f11);
        }
    }

    public void F() {
        G(E());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        v1 v1Var = this.f40780m;
        if (v1Var != null && v1Var.c0(16) && this.f40780m.m()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zX = x(keyEvent.getKeyCode());
        if (zX && P() && !this.f40777j.b0()) {
            z(true);
            return true;
        }
        if (u(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            z(true);
            return true;
        }
        if (zX && P()) {
            z(true);
        }
        return false;
    }

    public List<rs.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f40779l;
        if (frameLayout != null) {
            arrayList.add(new rs.a(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        g gVar = this.f40777j;
        if (gVar != null) {
            arrayList.add(new rs.a(gVar, 1));
        }
        return com.google.common.collect.x.n(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) ts.a.j(this.f40778k, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f40784q;
    }

    public boolean getControllerAutoShow() {
        return this.f40790w;
    }

    public boolean getControllerHideOnTouch() {
        return this.f40792y;
    }

    public int getControllerShowTimeoutMs() {
        return this.f40789v;
    }

    public Drawable getDefaultArtwork() {
        return this.f40785r;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f40779l;
    }

    public v1 getPlayer() {
        return this.f40780m;
    }

    public int getResizeMode() {
        ts.a.i(this.f40769b);
        return this.f40769b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f40774g;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f40784q != 0;
    }

    public boolean getUseController() {
        return this.f40781n;
    }

    public View getVideoSurfaceView() {
        return this.f40771d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!P() || this.f40780m == null) {
            return false;
        }
        z(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        H();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i11) {
        ts.a.g(i11 == 0 || this.f40773f != null);
        if (this.f40784q != i11) {
            this.f40784q = i11;
            N(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        ts.a.i(this.f40769b);
        this.f40769b.setAspectRatioListener(bVar);
    }

    public void setControllerAutoShow(boolean z11) {
        this.f40790w = z11;
    }

    public void setControllerHideDuringAds(boolean z11) {
        this.f40791x = z11;
    }

    public void setControllerHideOnTouch(boolean z11) {
        ts.a.i(this.f40777j);
        this.f40792y = z11;
        K();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(g.d dVar) {
        ts.a.i(this.f40777j);
        this.f40777j.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i11) {
        ts.a.i(this.f40777j);
        this.f40789v = i11;
        if (this.f40777j.b0()) {
            F();
        }
    }

    public void setControllerVisibilityListener(b bVar) {
        this.f40782o = bVar;
        if (bVar != null) {
            setControllerVisibilityListener((g.m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        ts.a.g(this.f40776i != null);
        this.f40788u = charSequence;
        M();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f40785r != drawable) {
            this.f40785r = drawable;
            N(false);
        }
    }

    public void setErrorMessageProvider(ts.m<? super PlaybackException> mVar) {
        if (mVar != null) {
            M();
        }
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        ts.a.i(this.f40777j);
        this.f40777j.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(c cVar) {
        ts.a.i(this.f40777j);
        this.f40777j.setOnFullScreenModeChangedListener(this.f40768a);
    }

    public void setKeepContentOnPlayerReset(boolean z11) {
        if (this.f40787t != z11) {
            this.f40787t = z11;
            N(false);
        }
    }

    public void setPlayer(v1 v1Var) {
        ts.a.g(Looper.myLooper() == Looper.getMainLooper());
        ts.a.a(v1Var == null || v1Var.F0() == Looper.getMainLooper());
        v1 v1Var2 = this.f40780m;
        if (v1Var2 == v1Var) {
            return;
        }
        if (v1Var2 != null) {
            v1Var2.G0(this.f40768a);
            if (v1Var2.c0(27)) {
                View view = this.f40771d;
                if (view instanceof TextureView) {
                    v1Var2.y((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    v1Var2.S((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.f40774g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f40780m = v1Var;
        if (P()) {
            this.f40777j.setPlayer(v1Var);
        }
        J();
        M();
        N(true);
        if (v1Var == null) {
            w();
            return;
        }
        if (v1Var.c0(27)) {
            View view2 = this.f40771d;
            if (view2 instanceof TextureView) {
                v1Var.L((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                v1Var.o((SurfaceView) view2);
            }
            if (!v1Var.c0(30) || v1Var.p().e(2)) {
                I();
            }
        }
        if (this.f40774g != null && v1Var.c0(28)) {
            this.f40774g.setCues(v1Var.H().f69511a);
        }
        v1Var.I0(this.f40768a);
        z(false);
    }

    public void setRepeatToggleModes(int i11) {
        ts.a.i(this.f40777j);
        this.f40777j.setRepeatToggleModes(i11);
    }

    public void setResizeMode(int i11) {
        ts.a.i(this.f40769b);
        this.f40769b.setResizeMode(i11);
    }

    public void setShowBuffering(int i11) {
        if (this.f40786s != i11) {
            this.f40786s = i11;
            J();
        }
    }

    public void setShowFastForwardButton(boolean z11) {
        ts.a.i(this.f40777j);
        this.f40777j.setShowFastForwardButton(z11);
    }

    public void setShowMultiWindowTimeBar(boolean z11) {
        ts.a.i(this.f40777j);
        this.f40777j.setShowMultiWindowTimeBar(z11);
    }

    public void setShowNextButton(boolean z11) {
        ts.a.i(this.f40777j);
        this.f40777j.setShowNextButton(z11);
    }

    public void setShowPreviousButton(boolean z11) {
        ts.a.i(this.f40777j);
        this.f40777j.setShowPreviousButton(z11);
    }

    public void setShowRewindButton(boolean z11) {
        ts.a.i(this.f40777j);
        this.f40777j.setShowRewindButton(z11);
    }

    public void setShowShuffleButton(boolean z11) {
        ts.a.i(this.f40777j);
        this.f40777j.setShowShuffleButton(z11);
    }

    public void setShowSubtitleButton(boolean z11) {
        ts.a.i(this.f40777j);
        this.f40777j.setShowSubtitleButton(z11);
    }

    public void setShowVrButton(boolean z11) {
        ts.a.i(this.f40777j);
        this.f40777j.setShowVrButton(z11);
    }

    public void setShutterBackgroundColor(int i11) {
        View view = this.f40770c;
        if (view != null) {
            view.setBackgroundColor(i11);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z11) {
        setArtworkDisplayMode(!z11 ? 1 : 0);
    }

    public void setUseController(boolean z11) {
        boolean z12 = true;
        ts.a.g((z11 && this.f40777j == null) ? false : true);
        if (!z11 && !hasOnClickListeners()) {
            z12 = false;
        }
        setClickable(z12);
        if (this.f40781n == z11) {
            return;
        }
        this.f40781n = z11;
        if (P()) {
            this.f40777j.setPlayer(this.f40780m);
        } else {
            g gVar = this.f40777j;
            if (gVar != null) {
                gVar.X();
                this.f40777j.setPlayer(null);
            }
        }
        K();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        View view = this.f40771d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i11);
        }
    }

    public boolean u(KeyEvent keyEvent) {
        return P() && this.f40777j.T(keyEvent);
    }

    public void w() {
        g gVar = this.f40777j;
        if (gVar != null) {
            gVar.X();
        }
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, AttributeSet attributeSet, int i11) {
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        int i18;
        boolean z15;
        boolean z16;
        boolean z17;
        int i19;
        super(context, attributeSet, i11);
        a aVar = new a();
        this.f40768a = aVar;
        if (isInEditMode()) {
            this.f40769b = null;
            this.f40770c = null;
            this.f40771d = null;
            this.f40772e = false;
            this.f40773f = null;
            this.f40774g = null;
            this.f40775h = null;
            this.f40776i = null;
            this.f40777j = null;
            this.f40778k = null;
            this.f40779l = null;
            ImageView imageView = new ImageView(context);
            if (p0.f115040a >= 23) {
                t(context, getResources(), imageView);
            } else {
                s(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i21 = rs.m.f109134b;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rs.q.N, i11, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(rs.q.Y);
                int color = typedArrayObtainStyledAttributes.getColor(rs.q.Y, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(rs.q.U, i21);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(rs.q.f109168a0, true);
                int i22 = typedArrayObtainStyledAttributes.getInt(rs.q.O, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(rs.q.Q, 0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(rs.q.f109170b0, true);
                int i23 = typedArrayObtainStyledAttributes.getInt(rs.q.Z, 1);
                int i24 = typedArrayObtainStyledAttributes.getInt(rs.q.V, 0);
                int i25 = typedArrayObtainStyledAttributes.getInt(rs.q.X, 5000);
                z12 = typedArrayObtainStyledAttributes.getBoolean(rs.q.S, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(rs.q.P, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(rs.q.W, 0);
                this.f40787t = typedArrayObtainStyledAttributes.getBoolean(rs.q.T, this.f40787t);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(rs.q.R, true);
                typedArrayObtainStyledAttributes.recycle();
                z11 = z21;
                i14 = integer;
                z16 = zHasValue;
                i15 = i24;
                z13 = z22;
                i21 = resourceId;
                i12 = i25;
                i13 = i23;
                z15 = z19;
                i18 = i22;
                i17 = color;
                i16 = resourceId2;
                z14 = z18;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i12 = 5000;
            z11 = true;
            z12 = true;
            z13 = true;
            i13 = 1;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 0;
            z14 = true;
            i18 = 1;
            z15 = true;
            z16 = false;
        }
        LayoutInflater.from(context).inflate(i21, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(rs.k.f109113i);
        this.f40769b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            D(aspectRatioFrameLayout, i15);
        }
        View viewFindViewById = findViewById(rs.k.M);
        this.f40770c = viewFindViewById;
        if (viewFindViewById != null && z16) {
            viewFindViewById.setBackgroundColor(i17);
        }
        if (aspectRatioFrameLayout != null && i13 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 == 2) {
                this.f40771d = new TextureView(context);
            } else {
                if (i13 == 3) {
                    try {
                        int i26 = vs.l.f119831m;
                        this.f40771d = (View) vs.l.class.getConstructor(Context.class).newInstance(context);
                        z17 = true;
                    } catch (Exception e11) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                } else if (i13 != 4) {
                    this.f40771d = new SurfaceView(context);
                } else {
                    try {
                        int i27 = us.i.f116635b;
                        this.f40771d = (View) us.i.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e12) {
                        throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e12);
                    }
                }
                this.f40771d.setLayoutParams(layoutParams);
                this.f40771d.setOnClickListener(aVar);
                this.f40771d.setClickable(false);
                aspectRatioFrameLayout.addView(this.f40771d, 0);
            }
            z17 = false;
            this.f40771d.setLayoutParams(layoutParams);
            this.f40771d.setOnClickListener(aVar);
            this.f40771d.setClickable(false);
            aspectRatioFrameLayout.addView(this.f40771d, 0);
        } else {
            this.f40771d = null;
            z17 = false;
        }
        this.f40772e = z17;
        this.f40778k = (FrameLayout) findViewById(rs.k.f109105a);
        this.f40779l = (FrameLayout) findViewById(rs.k.A);
        ImageView imageView2 = (ImageView) findViewById(rs.k.f109106b);
        this.f40773f = imageView2;
        this.f40784q = (!z14 || i18 == 0 || imageView2 == null) ? 0 : i18;
        if (i16 != 0) {
            this.f40785r = androidx.core.content.b.getDrawable(getContext(), i16);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(rs.k.P);
        this.f40774g = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(rs.k.f109110f);
        this.f40775h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f40786s = i14;
        TextView textView = (TextView) findViewById(rs.k.f109118n);
        this.f40776i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        g gVar = (g) findViewById(rs.k.f109114j);
        View viewFindViewById3 = findViewById(rs.k.f109115k);
        if (gVar != null) {
            this.f40777j = gVar;
            i19 = 0;
        } else if (viewFindViewById3 != null) {
            i19 = 0;
            g gVar2 = new g(context, null, 0, attributeSet);
            this.f40777j = gVar2;
            gVar2.setId(rs.k.f109114j);
            gVar2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(gVar2, iIndexOfChild);
        } else {
            i19 = 0;
            this.f40777j = null;
        }
        g gVar3 = this.f40777j;
        this.f40789v = gVar3 != null ? i12 : i19;
        this.f40792y = z12;
        this.f40790w = z11;
        this.f40791x = z13;
        this.f40781n = (!z15 || gVar3 == null) ? i19 : 1;
        if (gVar3 != null) {
            gVar3.Y();
            this.f40777j.R(aVar);
        }
        if (z15) {
            setClickable(true);
        }
        K();
    }

    @Deprecated
    public void setControllerVisibilityListener(g.m mVar) {
        ts.a.i(this.f40777j);
        g.m mVar2 = this.f40783p;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f40777j.i0(mVar2);
        }
        this.f40783p = mVar;
        if (mVar != null) {
            this.f40777j.R(mVar);
            setControllerVisibilityListener((b) null);
        }
    }
}
