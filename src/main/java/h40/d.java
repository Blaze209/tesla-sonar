package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.ShippingInfoWidget;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f70665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f70666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final ShippingInfoWidget f70667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CardMultilineWidget f70668d;

    private d(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ShippingInfoWidget shippingInfoWidget, @NonNull CardMultilineWidget cardMultilineWidget) {
        this.f70665a = linearLayout;
        this.f70666b = linearLayout2;
        this.f70667c = shippingInfoWidget;
        this.f70668d = cardMultilineWidget;
    }

    @NonNull
    public static d a(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = f30.z.f64255f;
        ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) gb.b.a(view, i11);
        if (shippingInfoWidget != null) {
            i11 = f30.z.f64271n;
            CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) gb.b.a(view, i11);
            if (cardMultilineWidget != null) {
                return new d(linearLayout, linearLayout, shippingInfoWidget, cardMultilineWidget);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static d c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63906d, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f70665a;
    }
}
