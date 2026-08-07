package ri0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TextInputLayout f108386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f108387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AutoCompleteTextView f108388c;

    private r(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView) {
        this.f108386a = textInputLayout;
        this.f108387b = textInputLayout2;
        this.f108388c = autoCompleteTextView;
    }

    @NonNull
    public static r a(@NonNull View view) {
        TextInputLayout textInputLayout = (TextInputLayout) view;
        int i11 = mi0.e.C0;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) gb.b.a(view, i11);
        if (autoCompleteTextView != null) {
            return new r(textInputLayout, textInputLayout, autoCompleteTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static r c(@NonNull LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    @NonNull
    public static r d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(mi0.f.f92228s, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextInputLayout getRoot() {
        return this.f108386a;
    }
}
