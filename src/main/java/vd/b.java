package vd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import com.adyen.checkout.ui.core.internal.ui.view.AdyenTextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import ud.f;
import ud.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f119019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final AdyenTextInputEditText f119020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final AdyenTextInputEditText f119021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final AdyenTextInputEditText f119022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final AdyenTextInputEditText f119023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final SwitchCompat f119024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final SwitchCompat f119025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f119026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f119027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f119028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f119029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextView f119030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextView f119031m;

    private b(@NonNull View view, @NonNull AdyenTextInputEditText adyenTextInputEditText, @NonNull AdyenTextInputEditText adyenTextInputEditText2, @NonNull AdyenTextInputEditText adyenTextInputEditText3, @NonNull AdyenTextInputEditText adyenTextInputEditText4, @NonNull SwitchCompat switchCompat, @NonNull SwitchCompat switchCompat2, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputLayout textInputLayout4, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f119019a = view;
        this.f119020b = adyenTextInputEditText;
        this.f119021c = adyenTextInputEditText2;
        this.f119022d = adyenTextInputEditText3;
        this.f119023e = adyenTextInputEditText4;
        this.f119024f = switchCompat;
        this.f119025g = switchCompat2;
        this.f119026h = textInputLayout;
        this.f119027i = textInputLayout2;
        this.f119028j = textInputLayout3;
        this.f119029k = textInputLayout4;
        this.f119030l = textView;
        this.f119031m = textView2;
    }

    @NonNull
    public static b a(@NonNull View view) {
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
                        i11 = f.f116130e;
                        SwitchCompat switchCompat = (SwitchCompat) gb.b.a(view, i11);
                        if (switchCompat != null) {
                            i11 = f.f116131f;
                            SwitchCompat switchCompat2 = (SwitchCompat) gb.b.a(view, i11);
                            if (switchCompat2 != null) {
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
                                                i11 = f.f116136k;
                                                TextView textView = (TextView) gb.b.a(view, i11);
                                                if (textView != null) {
                                                    i11 = f.f116137l;
                                                    TextView textView2 = (TextView) gb.b.a(view, i11);
                                                    if (textView2 != null) {
                                                        return new b(view, adyenTextInputEditText, adyenTextInputEditText2, adyenTextInputEditText3, adyenTextInputEditText4, switchCompat, switchCompat2, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textView, textView2);
                                                    }
                                                }
                                            }
                                        }
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
    public static b b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(g.f116139b, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f119019a;
    }
}
