package ri0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f108300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final MaterialRadioButton f108301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f108302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f108303d;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialRadioButton materialRadioButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f108300a = constraintLayout;
        this.f108301b = materialRadioButton;
        this.f108302c = textView;
        this.f108303d = textView2;
    }

    @NonNull
    public static b a(@NonNull View view) {
        int i11 = mi0.e.f92183m0;
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) gb.b.a(view, i11);
        if (materialRadioButton != null) {
            i11 = mi0.e.f92187o0;
            TextView textView = (TextView) gb.b.a(view, i11);
            if (textView != null) {
                i11 = mi0.e.f92189p0;
                TextView textView2 = (TextView) gb.b.a(view, i11);
                if (textView2 != null) {
                    return new b((ConstraintLayout) view, materialRadioButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static b c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(mi0.f.f92211b, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f108300a;
    }
}
