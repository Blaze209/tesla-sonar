package bj0;

import aj0.m1;
import aj0.n1;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.divider.MaterialDivider;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f17483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f17484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final MaterialDivider f17486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f17487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f17488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final View f17489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final NestedScrollView f17490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final Pi2NavigationBar f17491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final ShadowedNestedScrollView f17492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f17493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final FrameLayout f17494l;

    private a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull MaterialDivider materialDivider, @NonNull LinearLayout linearLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull View view, @NonNull NestedScrollView nestedScrollView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ShadowedNestedScrollView shadowedNestedScrollView, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout2) {
        this.f17483a = coordinatorLayout;
        this.f17484b = constraintLayout;
        this.f17485c = frameLayout;
        this.f17486d = materialDivider;
        this.f17487e = linearLayout;
        this.f17488f = coordinatorLayout2;
        this.f17489g = view;
        this.f17490h = nestedScrollView;
        this.f17491i = pi2NavigationBar;
        this.f17492j = shadowedNestedScrollView;
        this.f17493k = constraintLayout2;
        this.f17494l = frameLayout2;
    }

    @NonNull
    public static a a(@NonNull View view) {
        View viewA;
        int i11 = m1.f1480d;
        ConstraintLayout constraintLayout = (ConstraintLayout) gb.b.a(view, i11);
        if (constraintLayout != null) {
            i11 = m1.f1482f;
            FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
            if (frameLayout != null) {
                i11 = m1.f1483g;
                MaterialDivider materialDivider = (MaterialDivider) gb.b.a(view, i11);
                if (materialDivider != null) {
                    i11 = m1.f1484h;
                    LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
                    if (linearLayout != null) {
                        i11 = m1.f1485i;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) gb.b.a(view, i11);
                        if (coordinatorLayout != null && (viewA = gb.b.a(view, (i11 = m1.f1486j))) != null) {
                            i11 = m1.f1488l;
                            NestedScrollView nestedScrollView = (NestedScrollView) gb.b.a(view, i11);
                            if (nestedScrollView != null) {
                                i11 = m1.f1489m;
                                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) gb.b.a(view, i11);
                                if (pi2NavigationBar != null) {
                                    i11 = m1.f1490n;
                                    ShadowedNestedScrollView shadowedNestedScrollView = (ShadowedNestedScrollView) gb.b.a(view, i11);
                                    if (shadowedNestedScrollView != null) {
                                        i11 = m1.f1491o;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) gb.b.a(view, i11);
                                        if (constraintLayout2 != null) {
                                            i11 = m1.f1498v;
                                            FrameLayout frameLayout2 = (FrameLayout) gb.b.a(view, i11);
                                            if (frameLayout2 != null) {
                                                return new a((CoordinatorLayout) view, constraintLayout, frameLayout, materialDivider, linearLayout, coordinatorLayout, viewA, nestedScrollView, pi2NavigationBar, shadowedNestedScrollView, constraintLayout2, frameLayout2);
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
    public static a c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n1.f1515a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f17483a;
    }
}
