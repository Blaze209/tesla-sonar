package ri0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f108342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Guideline f108343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f108344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f108345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final Guideline f108346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f108347f;

    private g(@NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline2, @NonNull View view) {
        this.f108342a = linearLayout;
        this.f108343b = guideline;
        this.f108344c = linearLayout2;
        this.f108345d = constraintLayout;
        this.f108346e = guideline2;
        this.f108347f = view;
    }

    @NonNull
    public static g a(@NonNull View view) {
        View viewA;
        int i11 = mi0.e.I;
        Guideline guideline = (Guideline) gb.b.a(view, i11);
        if (guideline != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = mi0.e.J;
            ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
            if (constraintLayout != null) {
                i11 = mi0.e.K;
                Guideline guideline2 = (Guideline) gb.b.a(view, i11);
                if (guideline2 != null && (viewA = gb.b.a(view, (i11 = mi0.e.M))) != null) {
                    return new g(linearLayout, guideline, linearLayout, constraintLayout, guideline2, viewA);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(mi0.f.f92217h, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f108342a;
    }
}
