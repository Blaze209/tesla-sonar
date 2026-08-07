package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.stripe.android.view.MaskedCardView;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f70743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaskedCardView f70744b;

    private q(@NonNull FrameLayout frameLayout, @NonNull MaskedCardView maskedCardView) {
        this.f70743a = frameLayout;
        this.f70744b = maskedCardView;
    }

    @NonNull
    public static q a(@NonNull View view) {
        int i11 = f30.z.W;
        MaskedCardView maskedCardView = (MaskedCardView) gb.b.a(view, i11);
        if (maskedCardView != null) {
            return new q((FrameLayout) view, maskedCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static q c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(b0.f63921s, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f70743a;
    }
}
