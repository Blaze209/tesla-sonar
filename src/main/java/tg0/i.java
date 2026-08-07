package tg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import pg0.n4;
import pg0.o4;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f113514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f113515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Button f113516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f113517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f113518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f113519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f113520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f113521h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f113522i;

    private i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull TextView textView2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView3) {
        this.f113514a = coordinatorLayout;
        this.f113515b = linearLayout;
        this.f113516c = button;
        this.f113517d = textInputLayout;
        this.f113518e = textView;
        this.f113519f = textInputLayout2;
        this.f113520g = textView2;
        this.f113521h = pi2NavigationBar;
        this.f113522i = textView3;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i11 = n4.f102750t;
        LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
        if (linearLayout != null) {
            i11 = n4.f102752u;
            Button button = (Button) gb.b.a(view, i11);
            if (button != null) {
                i11 = n4.f102754v;
                TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
                if (textInputLayout != null) {
                    i11 = n4.f102756w;
                    TextView textView = (TextView) gb.b.a(view, i11);
                    if (textView != null) {
                        i11 = n4.L;
                        TextInputLayout textInputLayout2 = (TextInputLayout) gb.b.a(view, i11);
                        if (textInputLayout2 != null) {
                            i11 = n4.M;
                            TextView textView2 = (TextView) gb.b.a(view, i11);
                            if (textView2 != null) {
                                i11 = n4.Y;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                                if (pi2NavigationBar != null) {
                                    i11 = n4.D0;
                                    TextView textView3 = (TextView) gb.b.a(view, i11);
                                    if (textView3 != null) {
                                        return new i((CoordinatorLayout) view, linearLayout, button, textInputLayout, textView, textInputLayout2, textView2, pi2NavigationBar, textView3);
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
    public static i c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o4.f102828j, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f113514a;
    }
}
