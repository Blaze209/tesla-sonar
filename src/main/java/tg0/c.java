package tg0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import pg0.n4;
import pg0.o4;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f113441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Space f113442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f113443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearLayout f113444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Button f113445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final ThemeableLottieAnimationView f113447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f113448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f113449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final View f113450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextView f113451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f113452l;

    private c(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f113441a = frameLayout;
        this.f113442b = space;
        this.f113443c = frameLayout2;
        this.f113444d = linearLayout;
        this.f113445e = button;
        this.f113446f = constraintLayout;
        this.f113447g = themeableLottieAnimationView;
        this.f113448h = constraintLayout2;
        this.f113449i = textView;
        this.f113450j = view;
        this.f113451k = textView2;
        this.f113452l = textView3;
    }

    @NonNull
    public static c a(@NonNull View view) {
        View viewA;
        int i11 = n4.f102720e;
        Space space = (Space) gb.b.a(view, i11);
        if (space != null) {
            i11 = n4.f102722f;
            FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
            if (frameLayout != null) {
                i11 = n4.f102724g;
                LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
                if (linearLayout != null) {
                    i11 = n4.f102738n;
                    Button button = (Button) gb.b.a(view, i11);
                    if (button != null) {
                        i11 = n4.f102748s;
                        ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
                        if (constraintLayout != null) {
                            i11 = n4.P;
                            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) gb.b.a(view, i11);
                            if (themeableLottieAnimationView != null) {
                                i11 = n4.Q;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) gb.b.a(view, i11);
                                if (constraintLayout2 != null) {
                                    i11 = n4.f102743p0;
                                    TextView textView = (TextView) gb.b.a(view, i11);
                                    if (textView != null && (viewA = gb.b.a(view, (i11 = n4.f102755v0))) != null) {
                                        i11 = n4.C0;
                                        TextView textView2 = (TextView) gb.b.a(view, i11);
                                        if (textView2 != null) {
                                            i11 = n4.D0;
                                            TextView textView3 = (TextView) gb.b.a(view, i11);
                                            if (textView3 != null) {
                                                return new c((FrameLayout) view, space, frameLayout, linearLayout, button, constraintLayout, themeableLottieAnimationView, constraintLayout2, textView, viewA, textView2, textView3);
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
    public static c c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(o4.f102821c, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f113441a;
    }
}
