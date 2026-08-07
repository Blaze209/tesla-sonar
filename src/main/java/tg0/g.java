package tg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import pg0.n4;
import pg0.o4;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f113480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Button f113481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CheckBox f113482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f113483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f113485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImageView f113486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f113487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final View f113488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Flow f113489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f113490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final View f113491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final ImageView f113492m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113493n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f113494o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113495p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f113496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    public final FrameLayout f113497r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    public final ProgressBar f113498s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    public final Button f113499t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    public final ImageView f113500u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    public final SpotlightView f113501v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    public final SpotlightView f113502w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    public final TextView f113503x;

    private g(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull CheckBox checkBox, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull Flow flow, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view2, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView2, @NonNull FrameLayout frameLayout2, @NonNull ProgressBar progressBar, @NonNull Button button2, @NonNull ImageView imageView3, @NonNull SpotlightView spotlightView, @NonNull SpotlightView spotlightView2, @NonNull TextView textView3) {
        this.f113480a = frameLayout;
        this.f113481b = button;
        this.f113482c = checkBox;
        this.f113483d = coordinatorLayout;
        this.f113484e = constraintLayout;
        this.f113485f = textView;
        this.f113486g = imageView;
        this.f113487h = linearLayout;
        this.f113488i = view;
        this.f113489j = flow;
        this.f113490k = pi2NavigationBar;
        this.f113491l = view2;
        this.f113492m = imageView2;
        this.f113493n = constraintLayout2;
        this.f113494o = themeableLottieAnimationView;
        this.f113495p = constraintLayout3;
        this.f113496q = textView2;
        this.f113497r = frameLayout2;
        this.f113498s = progressBar;
        this.f113499t = button2;
        this.f113500u = imageView3;
        this.f113501v = spotlightView;
        this.f113502w = spotlightView2;
        this.f113503x = textView3;
    }

    @NonNull
    public static g a(@NonNull View view) {
        View viewA;
        View viewA2;
        int i11 = n4.f102712a;
        Button button = (Button) gb.b.a(view, i11);
        if (button != null) {
            i11 = n4.f102716c;
            CheckBox checkBox = (CheckBox) gb.b.a(view, i11);
            if (checkBox != null) {
                i11 = n4.f102734l;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) gb.b.a(view, i11);
                if (coordinatorLayout != null) {
                    i11 = n4.f102736m;
                    ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
                    if (constraintLayout != null) {
                        i11 = n4.f102758x;
                        TextView textView = (TextView) gb.b.a(view, i11);
                        if (textView != null) {
                            i11 = n4.f102760y;
                            ImageView imageView = (ImageView) gb.b.a(view, i11);
                            if (imageView != null) {
                                i11 = n4.A;
                                LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
                                if (linearLayout != null && (viewA = gb.b.a(view, (i11 = n4.D))) != null) {
                                    i11 = n4.F;
                                    Flow flow = (Flow) gb.b.a(view, i11);
                                    if (flow != null) {
                                        i11 = n4.Y;
                                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                                        if (pi2NavigationBar != null && (viewA2 = gb.b.a(view, (i11 = n4.Z))) != null) {
                                            i11 = n4.f102713a0;
                                            ImageView imageView2 = (ImageView) gb.b.a(view, i11);
                                            if (imageView2 != null) {
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
                                                            TextView textView2 = (TextView) gb.b.a(view, i11);
                                                            if (textView2 != null) {
                                                                i11 = n4.f102739n0;
                                                                FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
                                                                if (frameLayout != null) {
                                                                    i11 = n4.f102741o0;
                                                                    ProgressBar progressBar = (ProgressBar) gb.b.a(view, i11);
                                                                    if (progressBar != null) {
                                                                        i11 = n4.f102747r0;
                                                                        Button button2 = (Button) gb.b.a(view, i11);
                                                                        if (button2 != null) {
                                                                            i11 = n4.f102749s0;
                                                                            ImageView imageView3 = (ImageView) gb.b.a(view, i11);
                                                                            if (imageView3 != null) {
                                                                                i11 = n4.f102757w0;
                                                                                SpotlightView spotlightView = (SpotlightView) gb.b.a(view, i11);
                                                                                if (spotlightView != null) {
                                                                                    i11 = n4.f102759x0;
                                                                                    SpotlightView spotlightView2 = (SpotlightView) gb.b.a(view, i11);
                                                                                    if (spotlightView2 != null) {
                                                                                        i11 = n4.D0;
                                                                                        TextView textView3 = (TextView) gb.b.a(view, i11);
                                                                                        if (textView3 != null) {
                                                                                            return new g((FrameLayout) view, button, checkBox, coordinatorLayout, constraintLayout, textView, imageView, linearLayout, viewA, flow, pi2NavigationBar, viewA2, imageView2, constraintLayout2, themeableLottieAnimationView, constraintLayout3, textView2, frameLayout, progressBar, button2, imageView3, spotlightView, spotlightView2, textView3);
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
    public static g c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o4.f102825g, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f113480a;
    }
}
