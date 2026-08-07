package tg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import pg0.n4;
import pg0.o4;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f113409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f113410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f113411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f113412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f113413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f113414f;

    private a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView) {
        this.f113409a = coordinatorLayout;
        this.f113410b = linearLayout;
        this.f113411c = button;
        this.f113412d = themeableLottieAnimationView;
        this.f113413e = pi2NavigationBar;
        this.f113414f = textView;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = n4.f102750t;
        LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
        if (linearLayout != null) {
            i11 = n4.f102752u;
            Button button = (Button) gb.b.a(view, i11);
            if (button != null) {
                i11 = n4.P;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) gb.b.a(view, i11);
                if (themeableLottieAnimationView != null) {
                    i11 = n4.Y;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                    if (pi2NavigationBar != null) {
                        i11 = n4.D0;
                        TextView textView = (TextView) gb.b.a(view, i11);
                        if (textView != null) {
                            return new a((CoordinatorLayout) view, linearLayout, button, themeableLottieAnimationView, pi2NavigationBar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o4.f102819a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f113409a;
    }
}
