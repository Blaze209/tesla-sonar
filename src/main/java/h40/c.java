package h40;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ScrollView f70663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinearLayout f70664b;

    private c(@NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout) {
        this.f70663a = scrollView;
        this.f70664b = linearLayout;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i11 = f30.z.f64260h0;
        LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
        if (linearLayout != null) {
            return new c((ScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f70663a;
    }
}
