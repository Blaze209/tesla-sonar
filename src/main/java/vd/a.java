package vd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ud.f;
import ud.g;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f119010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AdyenTextInputEditText f119011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AdyenTextInputEditText f119012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AdyenTextInputEditText f119013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final AdyenTextInputEditText f119014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f119015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f119016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f119017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f119018i;

    private a(@NonNull View view, @NonNull AdyenTextInputEditText adyenTextInputEditText, @NonNull AdyenTextInputEditText adyenTextInputEditText2, @NonNull AdyenTextInputEditText adyenTextInputEditText3, @NonNull AdyenTextInputEditText adyenTextInputEditText4, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputLayout textInputLayout4) {
        this.f119010a = view;
        this.f119011b = adyenTextInputEditText;
        this.f119012c = adyenTextInputEditText2;
        this.f119013d = adyenTextInputEditText3;
        this.f119014e = adyenTextInputEditText4;
        this.f119015f = textInputLayout;
        this.f119016g = textInputLayout2;
        this.f119017h = textInputLayout3;
        this.f119018i = textInputLayout4;
    }

    @NonNull
    public static a a(@NonNull View view) {
        int i11 = f.f116126a;
        AdyenTextInputEditText adyenTextInputEditText = (AdyenTextInputEditText) gb.b.a(view, i11);
        if (adyenTextInputEditText != null) {
            i11 = f.f116127b;
            AdyenTextInputEditText adyenTextInputEditText2 = (AdyenTextInputEditText) gb.b.a(view, i11);
            if (adyenTextInputEditText2 != null) {
                i11 = f.f116128c;
                AdyenTextInputEditText adyenTextInputEditText3 = (AdyenTextInputEditText) gb.b.a(view, i11);
                if (adyenTextInputEditText3 != null) {
                    i11 = f.f116129d;
                    AdyenTextInputEditText adyenTextInputEditText4 = (AdyenTextInputEditText) gb.b.a(view, i11);
                    if (adyenTextInputEditText4 != null) {
                        i11 = f.f116132g;
                        TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
                        if (textInputLayout != null) {
                            i11 = f.f116133h;
                            TextInputLayout textInputLayout2 = (TextInputLayout) gb.b.a(view, i11);
                            if (textInputLayout2 != null) {
                                i11 = f.f116134i;
                                TextInputLayout textInputLayout3 = (TextInputLayout) gb.b.a(view, i11);
                                if (textInputLayout3 != null) {
                                    i11 = f.f116135j;
                                    TextInputLayout textInputLayout4 = (TextInputLayout) gb.b.a(view, i11);
                                    if (textInputLayout4 != null) {
                                        return new a(view, adyenTextInputEditText, adyenTextInputEditText2, adyenTextInputEditText3, adyenTextInputEditText4, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4);
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
    public static a b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(g.f116138a, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f119010a;
    }
}
