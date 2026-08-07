package uh0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import th0.w0;
import th0.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f116279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f116280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f116281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f116282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f116283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f116284f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f116285g;

    private h(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull TextView textView2) {
        this.f116279a = constraintLayout;
        this.f116280b = constraintLayout2;
        this.f116281c = textView;
        this.f116282d = constraintLayout3;
        this.f116283e = pi2NavigationBar;
        this.f116284f = themeableLottieAnimationView;
        this.f116285g = textView2;
    }

    @NonNull
    public static h a(@NonNull View view) {
        int i11 = w0.f114273a;
        ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
        if (constraintLayout != null) {
            i11 = w0.f114279e;
            TextView textView = (TextView) gb.b.a(view, i11);
            if (textView != null) {
                i11 = w0.f114286l;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) gb.b.a(view, i11);
                if (constraintLayout2 != null) {
                    i11 = w0.E;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                    if (pi2NavigationBar != null) {
                        i11 = w0.H;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) gb.b.a(view, i11);
                        if (themeableLottieAnimationView != null) {
                            i11 = w0.Y;
                            TextView textView2 = (TextView) gb.b.a(view, i11);
                            if (textView2 != null) {
                                return new h((ConstraintLayout) view, constraintLayout, textView, constraintLayout2, pi2NavigationBar, themeableLottieAnimationView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static h c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(x0.f114320h, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f116279a;
    }
}
