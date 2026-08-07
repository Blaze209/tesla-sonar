package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CardBrandView;
import com.stripe.android.view.CardNumberEditText;
import com.stripe.android.view.CardNumberTextInputLayout;
import com.stripe.android.view.CvcEditText;
import com.stripe.android.view.ExpiryDateEditText;
import com.stripe.android.view.PostalCodeEditText;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CardBrandView f70726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f70727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final CardNumberEditText f70728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final CvcEditText f70729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final ExpiryDateEditText f70730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final PostalCodeEditText f70731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final LinearLayout f70732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final CardNumberTextInputLayout f70733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70736l;

    private m(@NonNull View view, @NonNull CardBrandView cardBrandView, @NonNull FrameLayout frameLayout, @NonNull CardNumberEditText cardNumberEditText, @NonNull CvcEditText cvcEditText, @NonNull ExpiryDateEditText expiryDateEditText, @NonNull PostalCodeEditText postalCodeEditText, @NonNull LinearLayout linearLayout, @NonNull CardNumberTextInputLayout cardNumberTextInputLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3) {
        this.f70725a = view;
        this.f70726b = cardBrandView;
        this.f70727c = frameLayout;
        this.f70728d = cardNumberEditText;
        this.f70729e = cvcEditText;
        this.f70730f = expiryDateEditText;
        this.f70731g = postalCodeEditText;
        this.f70732h = linearLayout;
        this.f70733i = cardNumberTextInputLayout;
        this.f70734j = textInputLayout;
        this.f70735k = textInputLayout2;
        this.f70736l = textInputLayout3;
    }

    @NonNull
    public static m a(@NonNull View view) {
        int i11 = f30.z.f64267l;
        CardBrandView cardBrandView = (CardBrandView) gb.b.a(view, i11);
        if (cardBrandView != null) {
            i11 = f30.z.f64277q;
            FrameLayout frameLayout = (FrameLayout) gb.b.a(view, i11);
            if (frameLayout != null) {
                i11 = f30.z.H;
                CardNumberEditText cardNumberEditText = (CardNumberEditText) gb.b.a(view, i11);
                if (cardNumberEditText != null) {
                    i11 = f30.z.J;
                    CvcEditText cvcEditText = (CvcEditText) gb.b.a(view, i11);
                    if (cvcEditText != null) {
                        i11 = f30.z.K;
                        ExpiryDateEditText expiryDateEditText = (ExpiryDateEditText) gb.b.a(view, i11);
                        if (expiryDateEditText != null) {
                            i11 = f30.z.N;
                            PostalCodeEditText postalCodeEditText = (PostalCodeEditText) gb.b.a(view, i11);
                            if (postalCodeEditText != null) {
                                i11 = f30.z.f64262i0;
                                LinearLayout linearLayout = (LinearLayout) gb.b.a(view, i11);
                                if (linearLayout != null) {
                                    i11 = f30.z.f64292x0;
                                    CardNumberTextInputLayout cardNumberTextInputLayout = (CardNumberTextInputLayout) gb.b.a(view, i11);
                                    if (cardNumberTextInputLayout != null) {
                                        i11 = f30.z.f64296z0;
                                        TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
                                        if (textInputLayout != null) {
                                            i11 = f30.z.A0;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) gb.b.a(view, i11);
                                            if (textInputLayout2 != null) {
                                                i11 = f30.z.D0;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) gb.b.a(view, i11);
                                                if (textInputLayout3 != null) {
                                                    return new m(view, cardBrandView, frameLayout, cardNumberEditText, cvcEditText, expiryDateEditText, postalCodeEditText, linearLayout, cardNumberTextInputLayout, textInputLayout, textInputLayout2, textInputLayout3);
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
    public static m b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(b0.f63916n, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70725a;
    }
}
