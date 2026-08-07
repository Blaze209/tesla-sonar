package ri0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f108304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f108306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f108309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108310g;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputLayout textInputLayout4) {
        this.f108304a = constraintLayout;
        this.f108305b = textInputLayout;
        this.f108306c = textInputEditText;
        this.f108307d = textInputLayout2;
        this.f108308e = textInputLayout3;
        this.f108309f = textInputEditText2;
        this.f108310g = textInputLayout4;
    }

    @NonNull
    public static c a(@NonNull View view) {
        int i11 = mi0.e.G;
        TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
        if (textInputLayout != null) {
            i11 = mi0.e.H;
            TextInputEditText textInputEditText = (TextInputEditText) gb.b.a(view, i11);
            if (textInputEditText != null) {
                i11 = mi0.e.L;
                TextInputLayout textInputLayout2 = (TextInputLayout) gb.b.a(view, i11);
                if (textInputLayout2 != null) {
                    i11 = mi0.e.f92203w0;
                    TextInputLayout textInputLayout3 = (TextInputLayout) gb.b.a(view, i11);
                    if (textInputLayout3 != null) {
                        i11 = mi0.e.f92205x0;
                        TextInputEditText textInputEditText2 = (TextInputEditText) gb.b.a(view, i11);
                        if (textInputEditText2 != null) {
                            i11 = mi0.e.E0;
                            TextInputLayout textInputLayout4 = (TextInputLayout) gb.b.a(view, i11);
                            if (textInputLayout4 != null) {
                                return new c((ConstraintLayout) view, textInputLayout, textInputEditText, textInputLayout2, textInputLayout3, textInputEditText2, textInputLayout4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static c c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(mi0.f.f92212c, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f108304a;
    }
}
