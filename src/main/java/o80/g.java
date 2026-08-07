package o80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TextInputLayout f96860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f96861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputEditText f96862c;

    private g(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputEditText textInputEditText) {
        this.f96860a = textInputLayout;
        this.f96861b = textInputLayout2;
        this.f96862c = textInputEditText;
    }

    @NonNull
    public static g a(@NonNull View view) {
        TextInputLayout textInputLayout = (TextInputLayout) view;
        int i11 = n80.d.f93656y;
        TextInputEditText textInputEditText = (TextInputEditText) gb.b.a(view, i11);
        if (textInputEditText != null) {
            return new g(textInputLayout, textInputLayout, textInputEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static g c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(n80.e.f93664g, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @Override // gb.a
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextInputLayout getRoot() {
        return this.f96860a;
    }
}
