package ri0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f108349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialCheckBox f108350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f108351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f108352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f108353e;

    private i(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.f108349a = constraintLayout;
        this.f108350b = materialCheckBox;
        this.f108351c = textView;
        this.f108352d = textView2;
        this.f108353e = textView3;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i11 = mi0.e.f92186o;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) gb.b.a(view, i11);
        if (materialCheckBox != null) {
            i11 = mi0.e.f92188p;
            TextView textView = (TextView) gb.b.a(view, i11);
            if (textView != null) {
                i11 = mi0.e.f92190q;
                TextView textView2 = (TextView) gb.b.a(view, i11);
                if (textView2 != null) {
                    i11 = mi0.e.f92198u;
                    TextView textView3 = (TextView) gb.b.a(view, i11);
                    if (textView3 != null) {
                        return new i((ConstraintLayout) view, materialCheckBox, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static i c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(mi0.f.f92219j, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f108349a;
    }
}
