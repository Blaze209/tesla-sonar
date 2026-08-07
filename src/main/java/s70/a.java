package s70;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import n70.v;
import n70.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f110513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final PrimaryButton f110514b;

    private a(@NonNull FrameLayout frameLayout, @NonNull PrimaryButton primaryButton) {
        this.f110513a = frameLayout;
        this.f110514b = primaryButton;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = v.f93499e;
        PrimaryButton primaryButton = (PrimaryButton) gb.b.a(view, i11);
        if (primaryButton != null) {
            return new a((FrameLayout) view, primaryButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(w.f93500a, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f110513a;
    }
}
