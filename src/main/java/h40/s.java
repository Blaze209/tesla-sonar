package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.view.PaymentAuthWebView;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f70749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CircularProgressIndicator f70750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Toolbar f70751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final PaymentAuthWebView f70752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f70753e;

    private s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull Toolbar toolbar, @NonNull PaymentAuthWebView paymentAuthWebView, @NonNull FrameLayout frameLayout) {
        this.f70749a = coordinatorLayout;
        this.f70750b = circularProgressIndicator;
        this.f70751c = toolbar;
        this.f70752d = paymentAuthWebView;
        this.f70753e = frameLayout;
    }

    @NonNull
    public static s a(@NonNull View view) {
        int i11 = f30.z.f64256f0;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) gb.b.a(view, i11);
        if (circularProgressIndicator != null) {
            i11 = f30.z.G0;
            Toolbar toolbar = (Toolbar) gb.b.a(view, i11);
            if (toolbar != null) {
                i11 = f30.z.I0;
                PaymentAuthWebView paymentAuthWebView = (PaymentAuthWebView) gb.b.a(view, i11);
                if (paymentAuthWebView != null) {
                    i11 = f30.z.J0;
                    FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
                    if (frameLayout != null) {
                        return new s((CoordinatorLayout) view, circularProgressIndicator, toolbar, paymentAuthWebView, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static s c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static s d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63923u, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CoordinatorLayout getRoot() {
        return this.f70749a;
    }
}
