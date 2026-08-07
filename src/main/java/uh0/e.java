package uh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import th0.w0;
import th0.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ScrollView f116255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f116256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f116257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f116258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f116259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Guideline f116260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f116261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f116262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Guideline f116263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Button f116264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f116265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f116266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f116267m;

    private e(@NonNull ScrollView scrollView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Guideline guideline2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ConstraintLayout constraintLayout2, @NonNull Guideline guideline3, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f116255a = scrollView;
        this.f116256b = guideline;
        this.f116257c = constraintLayout;
        this.f116258d = imageView;
        this.f116259e = themeableLottieAnimationView;
        this.f116260f = guideline2;
        this.f116261g = pi2NavigationBar;
        this.f116262h = constraintLayout2;
        this.f116263i = guideline3;
        this.f116264j = button;
        this.f116265k = textView;
        this.f116266l = textView2;
        this.f116267m = textView3;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i11 = w0.f114280f;
        Guideline guideline = (Guideline) gb.b.a(view, i11);
        if (guideline != null) {
            i11 = w0.f114287m;
            ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
            if (constraintLayout != null) {
                i11 = w0.f114300z;
                ImageView imageView = (ImageView) gb.b.a(view, i11);
                if (imageView != null) {
                    i11 = w0.B;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) gb.b.a(view, i11);
                    if (themeableLottieAnimationView != null) {
                        i11 = w0.D;
                        Guideline guideline2 = (Guideline) gb.b.a(view, i11);
                        if (guideline2 != null) {
                            i11 = w0.E;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                            if (pi2NavigationBar != null) {
                                i11 = w0.F;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) gb.b.a(view, i11);
                                if (constraintLayout2 != null) {
                                    i11 = w0.Q;
                                    Guideline guideline3 = (Guideline) gb.b.a(view, i11);
                                    if (guideline3 != null) {
                                        i11 = w0.U;
                                        Button button = (Button) gb.b.a(view, i11);
                                        if (button != null) {
                                            i11 = w0.V;
                                            TextView textView = (TextView) gb.b.a(view, i11);
                                            if (textView != null) {
                                                i11 = w0.W;
                                                TextView textView2 = (TextView) gb.b.a(view, i11);
                                                if (textView2 != null) {
                                                    i11 = w0.X;
                                                    TextView textView3 = (TextView) gb.b.a(view, i11);
                                                    if (textView3 != null) {
                                                        return new e((ScrollView) view, guideline, constraintLayout, imageView, themeableLottieAnimationView, guideline2, pi2NavigationBar, constraintLayout2, guideline3, button, textView, textView2, textView3);
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
    public static e c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(x0.f114317e, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f116255a;
    }
}
