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
public final class f implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f108333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextView f108334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f108336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f108337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f108339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f108341i;

    private f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2) {
        this.f108333a = constraintLayout;
        this.f108334b = textView;
        this.f108335c = textInputLayout;
        this.f108336d = textInputEditText;
        this.f108337e = textView2;
        this.f108338f = textInputLayout2;
        this.f108339g = autoCompleteTextView;
        this.f108340h = textInputLayout3;
        this.f108341i = textInputEditText2;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i11 = mi0.e.f92200v;
        TextView textView = (TextView) gb.b.a(view, i11);
        if (textView != null) {
            i11 = mi0.e.f92202w;
            TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
            if (textInputLayout != null) {
                i11 = mi0.e.f92204x;
                TextInputEditText textInputEditText = (TextInputEditText) gb.b.a(view, i11);
                if (textInputEditText != null) {
                    i11 = mi0.e.E;
                    TextView textView2 = (TextView) gb.b.a(view, i11);
                    if (textView2 != null) {
                        i11 = mi0.e.f92159a0;
                        TextInputLayout textInputLayout2 = (TextInputLayout) gb.b.a(view, i11);
                        if (textInputLayout2 != null) {
                            i11 = mi0.e.f92161b0;
                            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) gb.b.a(view, i11);
                            if (autoCompleteTextView != null) {
                                i11 = mi0.e.G0;
                                TextInputLayout textInputLayout3 = (TextInputLayout) gb.b.a(view, i11);
                                if (textInputLayout3 != null) {
                                    i11 = mi0.e.H0;
                                    TextInputEditText textInputEditText2 = (TextInputEditText) gb.b.a(view, i11);
                                    if (textInputEditText2 != null) {
                                        return new f((ConstraintLayout) view, textView, textInputLayout, textInputEditText, textView2, textInputLayout2, autoCompleteTextView, textInputLayout3, textInputEditText2);
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
    public static f c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(mi0.f.f92215f, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f108333a;
    }
}
