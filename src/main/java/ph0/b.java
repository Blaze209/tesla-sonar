package ph0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import oh0.m1;
import oh0.n1;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f102983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f102984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f102985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final Flow f102986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f102987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Button f102988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Button f102989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final View f102990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f102991i;

    private b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Flow flow, @NonNull TextView textView, @NonNull Button button, @NonNull Button button2, @NonNull View view, @NonNull TextView textView2) {
        this.f102983a = coordinatorLayout;
        this.f102984b = frameLayout;
        this.f102985c = constraintLayout;
        this.f102986d = flow;
        this.f102987e = textView;
        this.f102988f = button;
        this.f102989g = button2;
        this.f102990h = view;
        this.f102991i = textView2;
    }

    @NonNull
    public static b a(@NonNull View view) {
        View viewA;
        int i11 = m1.f97454a;
        FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
        if (frameLayout != null) {
            i11 = m1.f97455b;
            ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
            if (constraintLayout != null) {
                i11 = m1.f97456c;
                Flow flow = (Flow) gb.b.a(view, i11);
                if (flow != null) {
                    i11 = m1.f97457d;
                    TextView textView = (TextView) gb.b.a(view, i11);
                    if (textView != null) {
                        i11 = m1.f97458e;
                        Button button = (Button) gb.b.a(view, i11);
                        if (button != null) {
                            i11 = m1.f97459f;
                            Button button2 = (Button) gb.b.a(view, i11);
                            if (button2 != null && (viewA = gb.b.a(view, (i11 = m1.f97460g))) != null) {
                                i11 = m1.f97461h;
                                TextView textView2 = (TextView) gb.b.a(view, i11);
                                if (textView2 != null) {
                                    return new b((CoordinatorLayout) view, frameLayout, constraintLayout, flow, textView, button, button2, viewA, textView2);
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
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n1.f97465b, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f102983a;
    }
}
