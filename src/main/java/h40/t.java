package h40;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.stripe.android.view.PaymentFlowViewPager;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f70754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final PaymentFlowViewPager f70755b;

    private t(@NonNull FrameLayout frameLayout, @NonNull PaymentFlowViewPager paymentFlowViewPager) {
        this.f70754a = frameLayout;
        this.f70755b = paymentFlowViewPager;
    }

    @NonNull
    public static t a(@NonNull View view) {
        int i11 = f30.z.f64268l0;
        PaymentFlowViewPager paymentFlowViewPager = (PaymentFlowViewPager) gb.b.a(view, i11);
        if (paymentFlowViewPager != null) {
            return new t((FrameLayout) view, paymentFlowViewPager);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f70754a;
    }
}
