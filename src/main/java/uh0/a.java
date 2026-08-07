package uh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import th0.w0;
import th0.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f116207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f116208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Camera2PreviewView f116209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f116210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f116211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f116212f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ProgressBar f116213g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f116214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Barrier f116215i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final FrameLayout f116216j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final PreviewView f116217k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final OldSelfieOverlayView f116218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f116219m;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Camera2PreviewView camera2PreviewView, @NonNull View view, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ProgressBar progressBar, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull PreviewView previewView, @NonNull OldSelfieOverlayView oldSelfieOverlayView, @NonNull TextView textView3) {
        this.f116207a = constraintLayout;
        this.f116208b = button;
        this.f116209c = camera2PreviewView;
        this.f116210d = view;
        this.f116211e = textView;
        this.f116212f = textView2;
        this.f116213g = progressBar;
        this.f116214h = pi2NavigationBar;
        this.f116215i = barrier;
        this.f116216j = frameLayout;
        this.f116217k = previewView;
        this.f116218l = oldSelfieOverlayView;
        this.f116219m = textView3;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i11 = w0.f114281g;
        Button button = (Button) gb.b.a(view, i11);
        if (button != null) {
            i11 = w0.f114282h;
            Camera2PreviewView camera2PreviewView = (Camera2PreviewView) gb.b.a(view, i11);
            if (camera2PreviewView != null && (viewA = gb.b.a(view, (i11 = w0.f114283i))) != null) {
                i11 = w0.f114288n;
                TextView textView = (TextView) gb.b.a(view, i11);
                if (textView != null) {
                    i11 = w0.f114294t;
                    TextView textView2 = (TextView) gb.b.a(view, i11);
                    if (textView2 != null) {
                        i11 = w0.A;
                        ProgressBar progressBar = (ProgressBar) gb.b.a(view, i11);
                        if (progressBar != null) {
                            i11 = w0.E;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                            if (pi2NavigationBar != null) {
                                i11 = w0.I;
                                Barrier barrier = (Barrier) gb.b.a(view, i11);
                                if (barrier != null) {
                                    i11 = w0.J;
                                    FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
                                    if (frameLayout != null) {
                                        i11 = w0.K;
                                        PreviewView previewView = (PreviewView) gb.b.a(view, i11);
                                        if (previewView != null) {
                                            i11 = w0.T;
                                            OldSelfieOverlayView oldSelfieOverlayView = (OldSelfieOverlayView) gb.b.a(view, i11);
                                            if (oldSelfieOverlayView != null) {
                                                i11 = w0.Y;
                                                TextView textView3 = (TextView) gb.b.a(view, i11);
                                                if (textView3 != null) {
                                                    return new a((ConstraintLayout) view, button, camera2PreviewView, viewA, textView, textView2, progressBar, pi2NavigationBar, barrier, frameLayout, previewView, oldSelfieOverlayView, textView3);
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
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(x0.f114313a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f116207a;
    }
}
