package o80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import com.stripe.android.stripe3ds2.views.ThreeDS2TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final LinearLayout f96857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ThreeDS2TextView f96858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final RadioGroup f96859c;

    private f(@NonNull LinearLayout linearLayout, @NonNull ThreeDS2TextView threeDS2TextView, @NonNull RadioGroup radioGroup) {
        this.f96857a = linearLayout;
        this.f96858b = threeDS2TextView;
        this.f96859c = radioGroup;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i11 = n80.d.f93651t;
        ThreeDS2TextView threeDS2TextView = (ThreeDS2TextView) gb.b.a(view, i11);
        if (threeDS2TextView != null) {
            i11 = n80.d.f93654w;
            RadioGroup radioGroup = (RadioGroup) gb.b.a(view, i11);
            if (radioGroup != null) {
                return new f((LinearLayout) view, threeDS2TextView, radioGroup);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static f c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n80.e.f93663f, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f96857a;
    }
}
