package tg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.governmentid.view.ScanningView;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import pg0.n4;
import pg0.o4;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements gb.a {

    @NonNull
    public final LottieAnimationView A;

    @NonNull
    public final ScanningView B;

    @NonNull
    public final SpotlightView C;

    @NonNull
    public final TextView D;

    @NonNull
    public final Space E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f113415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Space f113416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f113417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ProgressBar f113418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f113420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Space f113421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f113422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f113423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final LinearLayout f113424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ToggleButton f113425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f113426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final FrameLayout f113427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f113428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final View f113429o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final ImageView f113430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f113432r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113433s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final TextView f113434t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final Barrier f113435u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final FrameLayout f113436v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final View f113437w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final Barrier f113438x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final PreviewView f113439y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final ProgressBar f113440z;

    private b(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull Camera2PreviewView camera2PreviewView, @NonNull ProgressBar progressBar, @NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Space space2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull LinearLayout linearLayout, @NonNull ToggleButton toggleButton, @NonNull TextView textView3, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView4, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout3, @NonNull View view2, @NonNull Barrier barrier2, @NonNull PreviewView previewView, @NonNull ProgressBar progressBar2, @NonNull LottieAnimationView lottieAnimationView, @NonNull ScanningView scanningView, @NonNull SpotlightView spotlightView, @NonNull TextView textView5, @NonNull Space space3) {
        this.f113415a = frameLayout;
        this.f113416b = space;
        this.f113417c = camera2PreviewView;
        this.f113418d = progressBar;
        this.f113419e = constraintLayout;
        this.f113420f = button;
        this.f113421g = space2;
        this.f113422h = textView;
        this.f113423i = textView2;
        this.f113424j = linearLayout;
        this.f113425k = toggleButton;
        this.f113426l = textView3;
        this.f113427m = frameLayout2;
        this.f113428n = pi2NavigationBar;
        this.f113429o = view;
        this.f113430p = imageView;
        this.f113431q = constraintLayout2;
        this.f113432r = themeableLottieAnimationView;
        this.f113433s = constraintLayout3;
        this.f113434t = textView4;
        this.f113435u = barrier;
        this.f113436v = frameLayout3;
        this.f113437w = view2;
        this.f113438x = barrier2;
        this.f113439y = previewView;
        this.f113440z = progressBar2;
        this.A = lottieAnimationView;
        this.B = scanningView;
        this.C = spotlightView;
        this.D = textView5;
        this.E = space3;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i11 = n4.f102726h;
        Space space = (Space) gb.b.a(view, i11);
        if (space != null) {
            i11 = n4.f102728i;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) gb.b.a(view, i11);
            if (camera2PreviewView != null) {
                i11 = n4.f102732k;
                ProgressBar progressBar = (ProgressBar) gb.b.a(view, i11);
                if (progressBar != null) {
                    i11 = n4.f102736m;
                    ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
                    if (constraintLayout != null) {
                        i11 = n4.f102738n;
                        Button button = (Button) gb.b.a(view, i11);
                        if (button != null) {
                            i11 = n4.f102740o;
                            Space space2 = (Space) gb.b.a(view, i11);
                            if (space2 != null) {
                                i11 = n4.f102742p;
                                TextView textView = (TextView) gb.b.a(view, i11);
                                if (textView != null) {
                                    i11 = n4.f102758x;
                                    TextView textView2 = (TextView) gb.b.a(view, i11);
                                    if (textView2 != null) {
                                        i11 = n4.f102762z;
                                        LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
                                        if (linearLayout != null) {
                                            i11 = n4.E;
                                            ToggleButton toggleButton = (ToggleButton) gb.b.a(view, i11);
                                            if (toggleButton != null) {
                                                i11 = n4.I;
                                                TextView textView3 = (TextView) gb.b.a(view, i11);
                                                if (textView3 != null) {
                                                    i11 = n4.U;
                                                    FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
                                                    if (frameLayout != null) {
                                                        i11 = n4.Y;
                                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                                                        if (pi2NavigationBar != null && (viewA = gb.b.a(view, (i11 = n4.Z))) != null) {
                                                            i11 = n4.f102713a0;
                                                            ImageView imageView = (ImageView) gb.b.a(view, i11);
                                                            if (imageView != null) {
                                                                i11 = n4.f102715b0;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) gb.b.a(view, i11);
                                                                if (constraintLayout2 != null) {
                                                                    i11 = n4.f102717c0;
                                                                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) gb.b.a(view, i11);
                                                                    if (themeableLottieAnimationView != null) {
                                                                        i11 = n4.f102719d0;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) gb.b.a(view, i11);
                                                                        if (constraintLayout3 != null) {
                                                                            i11 = n4.f102721e0;
                                                                            TextView textView4 = (TextView) gb.b.a(view, i11);
                                                                            if (textView4 != null) {
                                                                                i11 = n4.f102729i0;
                                                                                Barrier barrier = (Barrier) gb.b.a(view, i11);
                                                                                if (barrier != null) {
                                                                                    i11 = n4.f102731j0;
                                                                                    FrameLayout frameLayout2 = (FrameLayout) gb.b.a(view, i11);
                                                                                    if (frameLayout2 != null && (viewA2 = gb.b.a(view, (i11 = n4.f102733k0))) != null) {
                                                                                        i11 = n4.f102735l0;
                                                                                        Barrier barrier2 = (Barrier) gb.b.a(view, i11);
                                                                                        if (barrier2 != null) {
                                                                                            i11 = n4.f102737m0;
                                                                                            PreviewView previewView = (PreviewView) gb.b.a(view, i11);
                                                                                            if (previewView != null) {
                                                                                                i11 = n4.f102741o0;
                                                                                                ProgressBar progressBar2 = (ProgressBar) gb.b.a(view, i11);
                                                                                                if (progressBar2 != null) {
                                                                                                    i11 = n4.f102751t0;
                                                                                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) gb.b.a(view, i11);
                                                                                                    if (lottieAnimationView != null) {
                                                                                                        i11 = n4.f102753u0;
                                                                                                        ScanningView scanningView = (ScanningView) gb.b.a(view, i11);
                                                                                                        if (scanningView != null) {
                                                                                                            i11 = n4.f102757w0;
                                                                                                            SpotlightView spotlightView = (SpotlightView) gb.b.a(view, i11);
                                                                                                            if (spotlightView != null) {
                                                                                                                i11 = n4.D0;
                                                                                                                TextView textView5 = (TextView) gb.b.a(view, i11);
                                                                                                                if (textView5 != null) {
                                                                                                                    i11 = n4.E0;
                                                                                                                    Space space3 = (Space) gb.b.a(view, i11);
                                                                                                                    if (space3 != null) {
                                                                                                                        return new b((FrameLayout) view, space, camera2PreviewView, progressBar, constraintLayout, button, space2, textView, textView2, linearLayout, toggleButton, textView3, frameLayout, pi2NavigationBar, viewA, imageView, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView4, barrier, frameLayout2, viewA2, barrier2, previewView, progressBar2, lottieAnimationView, scanningView, spotlightView, textView5, space3);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o4.f102820b, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f113415a;
    }
}
