package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import com.stripe.android.view.ShippingInfoWidget;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ScrollView f70762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ShippingInfoWidget f70763b;

    private v(@NonNull ScrollView scrollView, @NonNull ShippingInfoWidget shippingInfoWidget) {
        this.f70762a = scrollView;
        this.f70763b = shippingInfoWidget;
    }

    @NonNull
    public static v a(@NonNull View view) {
        int i11 = f30.z.f64270m0;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) gb.b.a(view, i11);
        if (shippingInfoWidget != null) {
            return new v((ScrollView) view, shippingInfoWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static v c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63927y, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f70762a;
    }
}
