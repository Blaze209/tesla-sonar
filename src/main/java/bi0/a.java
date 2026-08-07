package bi0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import yh0.m;
import yh0.n;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f17415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f17416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f17418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f17419e;

    private a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull View view) {
        this.f17415a = coordinatorLayout;
        this.f17416b = constraintLayout;
        this.f17417c = frameLayout;
        this.f17418d = nestedScrollView;
        this.f17419e = view;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i11 = m.f125535a;
        ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
        if (constraintLayout != null) {
            i11 = m.f125536b;
            FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
            if (frameLayout != null) {
                i11 = m.f125537c;
                NestedScrollView nestedScrollView = (NestedScrollView) gb.b.a(view, i11);
                if (nestedScrollView != null && (viewA = gb.b.a(view, (i11 = m.f125547m))) != null) {
                    return new a((CoordinatorLayout) view, constraintLayout, frameLayout, nestedScrollView, viewA);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n.f125548a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f17415a;
    }
}
