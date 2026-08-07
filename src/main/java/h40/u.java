package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.view.PaymentMethodsRecyclerView;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f70756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f70757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f70758c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final LinearProgressIndicator f70759d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final PaymentMethodsRecyclerView f70760e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final Toolbar f70761f;

    private u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull FrameLayout frameLayout, @NonNull LinearProgressIndicator linearProgressIndicator, @NonNull PaymentMethodsRecyclerView paymentMethodsRecyclerView, @NonNull Toolbar toolbar) {
        this.f70756a = coordinatorLayout;
        this.f70757b = coordinatorLayout2;
        this.f70758c = frameLayout;
        this.f70759d = linearProgressIndicator;
        this.f70760e = paymentMethodsRecyclerView;
        this.f70761f = toolbar;
    }

    @NonNull
    public static u a(@NonNull View view) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
        int i11 = f30.z.S;
        FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
        if (frameLayout != null) {
            i11 = f30.z.f64256f0;
            LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) gb.b.a(view, i11);
            if (linearProgressIndicator != null) {
                i11 = f30.z.f64258g0;
                PaymentMethodsRecyclerView paymentMethodsRecyclerView = (PaymentMethodsRecyclerView) gb.b.a(view, i11);
                if (paymentMethodsRecyclerView != null) {
                    i11 = f30.z.G0;
                    Toolbar toolbar = (Toolbar) gb.b.a(view, i11);
                    if (toolbar != null) {
                        return new u(coordinatorLayout, coordinatorLayout, frameLayout, linearProgressIndicator, paymentMethodsRecyclerView, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static u c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static u d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63925w, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f70756a;
    }
}
