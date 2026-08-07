package tg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import pg0.n4;
import pg0.o4;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f113523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f113525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f113527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f113528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f113529g;

    private j(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull TextView textView2) {
        this.f113523a = constraintLayout;
        this.f113524b = constraintLayout2;
        this.f113525c = textView;
        this.f113526d = constraintLayout3;
        this.f113527e = pi2NavigationBar;
        this.f113528f = themeableLottieAnimationView;
        this.f113529g = textView2;
    }

    @NonNull
    public static j a(@NonNull View view) {
        int i11 = n4.f102714b;
        ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
        if (constraintLayout != null) {
            i11 = n4.f102718d;
            TextView textView = (TextView) gb.b.a(view, i11);
            if (textView != null) {
                i11 = n4.f102748s;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) gb.b.a(view, i11);
                if (constraintLayout2 != null) {
                    i11 = n4.Y;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                    if (pi2NavigationBar != null) {
                        i11 = n4.f102723f0;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) gb.b.a(view, i11);
                        if (themeableLottieAnimationView != null) {
                            i11 = n4.D0;
                            TextView textView2 = (TextView) gb.b.a(view, i11);
                            if (textView2 != null) {
                                return new j((ConstraintLayout) view, constraintLayout, textView, constraintLayout2, pi2NavigationBar, themeableLottieAnimationView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static j c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o4.f102829k, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f113523a;
    }
}
