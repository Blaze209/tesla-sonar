package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CardBrandView f70715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CardNumberEditText f70716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final FrameLayout f70718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final CvcEditText f70719f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70720g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final ExpiryDateEditText f70721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70722i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final PostalCodeEditText f70723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70724k;

    private l(@NonNull View view, @NonNull CardBrandView cardBrandView, @NonNull CardNumberEditText cardNumberEditText, @NonNull TextInputLayout textInputLayout, @NonNull FrameLayout frameLayout, @NonNull CvcEditText cvcEditText, @NonNull TextInputLayout textInputLayout2, @NonNull ExpiryDateEditText expiryDateEditText, @NonNull TextInputLayout textInputLayout3, @NonNull PostalCodeEditText postalCodeEditText, @NonNull TextInputLayout textInputLayout4) {
        this.f70714a = view;
        this.f70715b = cardBrandView;
        this.f70716c = cardNumberEditText;
        this.f70717d = textInputLayout;
        this.f70718e = frameLayout;
        this.f70719f = cvcEditText;
        this.f70720g = textInputLayout2;
        this.f70721h = expiryDateEditText;
        this.f70722i = textInputLayout3;
        this.f70723j = postalCodeEditText;
        this.f70724k = textInputLayout4;
    }

    @NonNull
    public static l a(@NonNull View view) {
        int i11 = f30.z.f64267l;
        CardBrandView cardBrandView = (CardBrandView) gb.b.a(view, i11);
        if (cardBrandView != null) {
            i11 = f30.z.f64275p;
            CardNumberEditText cardNumberEditText = (CardNumberEditText) gb.b.a(view, i11);
            if (cardNumberEditText != null) {
                i11 = f30.z.f64279r;
                TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
                if (textInputLayout != null) {
                    i11 = f30.z.f64285u;
                    FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
                    if (frameLayout != null) {
                        i11 = f30.z.f64293y;
                        CvcEditText cvcEditText = (CvcEditText) gb.b.a(view, i11);
                        if (cvcEditText != null) {
                            i11 = f30.z.f64295z;
                            TextInputLayout textInputLayout2 = (TextInputLayout) gb.b.a(view, i11);
                            if (textInputLayout2 != null) {
                                i11 = f30.z.Q;
                                ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) gb.b.a(view, i11);
                                if (expiryDateEditText != null) {
                                    i11 = f30.z.R;
                                    TextInputLayout textInputLayout3 = (TextInputLayout) gb.b.a(view, i11);
                                    if (textInputLayout3 != null) {
                                        i11 = f30.z.f64250c0;
                                        PostalCodeEditText postalCodeEditText = (PostalCodeEditText) gb.b.a(view, i11);
                                        if (postalCodeEditText != null) {
                                            i11 = f30.z.f64252d0;
                                            TextInputLayout textInputLayout4 = (TextInputLayout) gb.b.a(view, i11);
                                            if (textInputLayout4 != null) {
                                                return new l(view, cardBrandView, cardNumberEditText, textInputLayout, frameLayout, cvcEditText, textInputLayout2, expiryDateEditText, textInputLayout3, postalCodeEditText, textInputLayout4);
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
    public static l b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(b0.f63915m, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70714a;
    }
}
