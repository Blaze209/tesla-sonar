package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.stripe.android.view.SelectShippingMethodWidget;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class w implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f70764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final SelectShippingMethodWidget f70765b;

    private w(@NonNull FrameLayout frameLayout, @NonNull SelectShippingMethodWidget selectShippingMethodWidget) {
        this.f70764a = frameLayout;
        this.f70765b = selectShippingMethodWidget;
    }

    @NonNull
    public static w a(@NonNull View view) {
        int i11 = f30.z.f64264j0;
        SelectShippingMethodWidget selectShippingMethodWidget = (SelectShippingMethodWidget) gb.b.a(view, i11);
        if (selectShippingMethodWidget != null) {
            return new w((FrameLayout) view, selectShippingMethodWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static w c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63928z, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f70764a;
    }
}
