package o80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f96854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ThreeDS2TextView f96855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f96856c;

    private e(@NonNull LinearLayout linearLayout, @NonNull ThreeDS2TextView threeDS2TextView, @NonNull LinearLayout linearLayout2) {
        this.f96854a = linearLayout;
        this.f96855b = threeDS2TextView;
        this.f96856c = linearLayout2;
    }

    @NonNull
    public static e a(@NonNull View view) {
        int i11 = n80.d.f93651t;
        ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) gb.b.a(view, i11);
        if (threeDS2TextView != null) {
            i11 = n80.d.f93654w;
            LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
            if (linearLayout != null) {
                return new e((LinearLayout) view, threeDS2TextView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static e c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n80.e.f93662e, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f96854a;
    }
}
