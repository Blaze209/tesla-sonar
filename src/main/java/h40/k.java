package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.PostalCodeEditText;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CardMultilineWidget f70707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f70708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CountryTextInputLayout f70709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f70710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f70711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PostalCodeEditText f70712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70713h;

    private k(@NonNull View view, @NonNull CardMultilineWidget cardMultilineWidget, @NonNull MaterialCardView materialCardView, @NonNull CountryTextInputLayout countryTextInputLayout, @NonNull View view2, @NonNull TextView textView, @NonNull PostalCodeEditText postalCodeEditText, @NonNull TextInputLayout textInputLayout) {
        this.f70706a = view;
        this.f70707b = cardMultilineWidget;
        this.f70708c = materialCardView;
        this.f70709d = countryTextInputLayout;
        this.f70710e = view2;
        this.f70711f = textView;
        this.f70712g = postalCodeEditText;
        this.f70713h = textInputLayout;
    }

    @NonNull
    public static k a(@NonNull View view) {
        View viewA;
        int i11 = f30.z.f64271n;
        CardMultilineWidget cardMultilineWidget = (CardMultilineWidget) gb.b.a(view, i11);
        if (cardMultilineWidget != null) {
            i11 = f30.z.f64273o;
            MaterialCardView materialCardView = (MaterialCardView) gb.b.a(view, i11);
            if (materialCardView != null) {
                i11 = f30.z.f64289w;
                CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) gb.b.a(view, i11);
                if (countryTextInputLayout != null && (viewA = gb.b.a(view, (i11 = f30.z.f64291x))) != null) {
                    i11 = f30.z.E;
                    TextView textView = (TextView) gb.b.a(view, i11);
                    if (textView != null) {
                        i11 = f30.z.f64246a0;
                        PostalCodeEditText postalCodeEditText = (PostalCodeEditText) gb.b.a(view, i11);
                        if (postalCodeEditText != null) {
                            i11 = f30.z.f64248b0;
                            TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
                            if (textInputLayout != null) {
                                return new k(view, cardMultilineWidget, materialCardView, countryTextInputLayout, viewA, textView, postalCodeEditText, textInputLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static k b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(b0.f63914l, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70706a;
    }
}
