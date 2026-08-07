package ri0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f108373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f108374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f108376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f108377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f108379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f108380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f108382j;

    private p(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextInputLayout textInputLayout, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView2, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText) {
        this.f108373a = constraintLayout;
        this.f108374b = constraintLayout2;
        this.f108375c = textInputLayout;
        this.f108376d = autoCompleteTextView;
        this.f108377e = textView;
        this.f108378f = textInputLayout2;
        this.f108379g = autoCompleteTextView2;
        this.f108380h = textView2;
        this.f108381i = textInputLayout3;
        this.f108382j = textInputEditText;
    }

    @NonNull
    public static p a(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = mi0.e.O;
        TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
        if (textInputLayout != null) {
            i11 = mi0.e.P;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) gb.b.a(view, i11);
            if (autoCompleteTextView != null) {
                i11 = mi0.e.Q;
                TextView textView = (TextView) gb.b.a(view, i11);
                if (textView != null) {
                    i11 = mi0.e.R;
                    TextInputLayout textInputLayout2 = (TextInputLayout) gb.b.a(view, i11);
                    if (textInputLayout2 != null) {
                        i11 = mi0.e.S;
                        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) gb.b.a(view, i11);
                        if (autoCompleteTextView2 != null) {
                            i11 = mi0.e.T;
                            TextView textView2 = (TextView) gb.b.a(view, i11);
                            if (textView2 != null) {
                                i11 = mi0.e.U;
                                TextInputLayout textInputLayout3 = (TextInputLayout) gb.b.a(view, i11);
                                if (textInputLayout3 != null) {
                                    i11 = mi0.e.V;
                                    TextInputEditText textInputEditText = (TextInputEditText) gb.b.a(view, i11);
                                    if (textInputEditText != null) {
                                        return new p(constraintLayout, constraintLayout, textInputLayout, autoCompleteTextView, textView, textInputLayout2, autoCompleteTextView2, textView2, textInputLayout3, textInputEditText);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static p c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static p d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(mi0.f.f92226q, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f108373a;
    }
}
