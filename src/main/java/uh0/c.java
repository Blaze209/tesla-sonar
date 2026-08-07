package uh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import th0.w0;
import th0.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f116228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f116229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f116230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f116231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f116232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f116233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f116234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f116235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f116236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final FrameLayout f116237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f116238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f116239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ProgressBar f116240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f116241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ImageView f116242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final Barrier f116243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final FrameLayout f116244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final PreviewView f116245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f116246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final TextView f116247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f116248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final View f116249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final SelfieOverlayView f116250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final TextView f116251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    public final Space f116252y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final ImageView f116253z;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull ImageView imageView, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull View view2, @NonNull FrameLayout frameLayout, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ImageView imageView2, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout2, @NonNull PreviewView previewView, @NonNull CircularProgressIndicator circularProgressIndicator2, @NonNull TextView textView6, @NonNull ConstraintLayout constraintLayout2, @NonNull View view3, @NonNull SelfieOverlayView selfieOverlayView, @NonNull TextView textView7, @NonNull Space space, @NonNull ImageView imageView3) {
        this.f116228a = constraintLayout;
        this.f116229b = textView;
        this.f116230c = circularProgressIndicator;
        this.f116231d = imageView;
        this.f116232e = camera2PreviewView;
        this.f116233f = view;
        this.f116234g = textView2;
        this.f116235h = textView3;
        this.f116236i = view2;
        this.f116237j = frameLayout;
        this.f116238k = textView4;
        this.f116239l = textView5;
        this.f116240m = progressBar;
        this.f116241n = pi2NavigationBar;
        this.f116242o = imageView2;
        this.f116243p = barrier;
        this.f116244q = frameLayout2;
        this.f116245r = previewView;
        this.f116246s = circularProgressIndicator2;
        this.f116247t = textView6;
        this.f116248u = constraintLayout2;
        this.f116249v = view3;
        this.f116250w = selfieOverlayView;
        this.f116251x = textView7;
        this.f116252y = space;
        this.f116253z = imageView3;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i11 = w0.f114275b;
        TextView textView = (TextView) gb.b.a(view, i11);
        if (textView != null) {
            i11 = w0.f114277c;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) gb.b.a(view, i11);
            if (circularProgressIndicator != null) {
                i11 = w0.f114281g;
                ImageView imageView = (ImageView) gb.b.a(view, i11);
                if (imageView != null) {
                    i11 = w0.f114282h;
                    Camera2PreviewView camera2PreviewView = (Camera2PreviewView) gb.b.a(view, i11);
                    if (camera2PreviewView != null && (viewA = gb.b.a(view, (i11 = w0.f114283i))) != null) {
                        i11 = w0.f114284j;
                        TextView textView2 = (TextView) gb.b.a(view, i11);
                        if (textView2 != null) {
                            i11 = w0.f114288n;
                            TextView textView3 = (TextView) gb.b.a(view, i11);
                            if (textView3 != null && (viewA2 = gb.b.a(view, (i11 = w0.f114289o))) != null) {
                                i11 = w0.f114290p;
                                FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
                                if (frameLayout != null) {
                                    i11 = w0.f114295u;
                                    TextView textView4 = (TextView) gb.b.a(view, i11);
                                    if (textView4 != null) {
                                        i11 = w0.f114296v;
                                        TextView textView5 = (TextView) gb.b.a(view, i11);
                                        if (textView5 != null) {
                                            i11 = w0.A;
                                            ProgressBar progressBar = (ProgressBar) gb.b.a(view, i11);
                                            if (progressBar != null) {
                                                i11 = w0.E;
                                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                                                if (pi2NavigationBar != null) {
                                                    i11 = w0.G;
                                                    ImageView imageView2 = (ImageView) gb.b.a(view, i11);
                                                    if (imageView2 != null) {
                                                        i11 = w0.I;
                                                        Barrier barrier = (Barrier) gb.b.a(view, i11);
                                                        if (barrier != null) {
                                                            i11 = w0.J;
                                                            FrameLayout frameLayout2 = (FrameLayout) gb.b.a(view, i11);
                                                            if (frameLayout2 != null) {
                                                                i11 = w0.K;
                                                                PreviewView previewView = (PreviewView) gb.b.a(view, i11);
                                                                if (previewView != null) {
                                                                    i11 = w0.M;
                                                                    CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) gb.b.a(view, i11);
                                                                    if (circularProgressIndicator2 != null) {
                                                                        i11 = w0.N;
                                                                        TextView textView6 = (TextView) gb.b.a(view, i11);
                                                                        if (textView6 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                            i11 = w0.R;
                                                                            View viewA3 = gb.b.a(view, i11);
                                                                            if (viewA3 != null) {
                                                                                i11 = w0.S;
                                                                                SelfieOverlayView selfieOverlayView = (SelfieOverlayView) gb.b.a(view, i11);
                                                                                if (selfieOverlayView != null) {
                                                                                    i11 = w0.Y;
                                                                                    TextView textView7 = (TextView) gb.b.a(view, i11);
                                                                                    if (textView7 != null) {
                                                                                        i11 = w0.Z;
                                                                                        Space space = (Space) gb.b.a(view, i11);
                                                                                        if (space != null) {
                                                                                            i11 = w0.f114274a0;
                                                                                            ImageView imageView3 = (ImageView) gb.b.a(view, i11);
                                                                                            if (imageView3 != null) {
                                                                                                return new c(constraintLayout, textView, circularProgressIndicator, imageView, camera2PreviewView, viewA, textView2, textView3, viewA2, frameLayout, textView4, textView5, progressBar, pi2NavigationBar, imageView2, barrier, frameLayout2, previewView, circularProgressIndicator2, textView6, constraintLayout, viewA3, selfieOverlayView, textView7, space, imageView3);
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
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(x0.f114315c, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f116228a;
    }
}
