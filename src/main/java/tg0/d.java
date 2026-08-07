package tg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import pg0.n4;
import pg0.o4;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f113453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f113454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialButton f113455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f113456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f113457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final CardView f113459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f113460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f113461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Button f113462j;

    private d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull MaterialButton materialButton, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView2, @NonNull Button button) {
        this.f113453a = coordinatorLayout;
        this.f113454b = textView;
        this.f113455c = materialButton;
        this.f113456d = themeableLottieAnimationView;
        this.f113457e = view;
        this.f113458f = constraintLayout;
        this.f113459g = cardView;
        this.f113460h = pi2NavigationBar;
        this.f113461i = textView2;
        this.f113462j = button;
    }

    @NonNull
    public static d a(@NonNull View view) {
        View viewA;
        int i11 = n4.f102718d;
        TextView textView = (TextView) gb.b.a(view, i11);
        if (textView != null) {
            i11 = n4.f102730j;
            MaterialButton materialButton = (MaterialButton) gb.b.a(view, i11);
            if (materialButton != null) {
                i11 = n4.N;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) gb.b.a(view, i11);
                if (themeableLottieAnimationView != null && (viewA = gb.b.a(view, (i11 = n4.O))) != null) {
                    i11 = n4.S;
                    ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
                    if (constraintLayout != null) {
                        i11 = n4.X;
                        CardView cardView = (CardView) gb.b.a(view, i11);
                        if (cardView != null) {
                            i11 = n4.Y;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                            if (pi2NavigationBar != null) {
                                i11 = n4.D0;
                                TextView textView2 = (TextView) gb.b.a(view, i11);
                                if (textView2 != null) {
                                    i11 = n4.F0;
                                    Button button = (Button) gb.b.a(view, i11);
                                    if (button != null) {
                                        return new d((CoordinatorLayout) view, textView, materialButton, themeableLottieAnimationView, viewA, constraintLayout, cardView, pi2NavigationBar, textView2, button);
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
    public static d c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o4.f102822d, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f113453a;
    }
}
