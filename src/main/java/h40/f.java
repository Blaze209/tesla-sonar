package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.StripeEditText;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final CountryTextInputLayout f70672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final StripeEditText f70673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final StripeEditText f70674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final StripeEditText f70675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final StripeEditText f70676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final StripeEditText f70677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final StripeEditText f70678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final StripeEditText f70679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70685o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70686p;

    private f(@NonNull View view, @NonNull CountryTextInputLayout countryTextInputLayout, @NonNull StripeEditText stripeEditText, @NonNull StripeEditText stripeEditText2, @NonNull StripeEditText stripeEditText3, @NonNull StripeEditText stripeEditText4, @NonNull StripeEditText stripeEditText5, @NonNull StripeEditText stripeEditText6, @NonNull StripeEditText stripeEditText7, @NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5, @NonNull TextInputLayout textInputLayout6, @NonNull TextInputLayout textInputLayout7) {
        this.f70671a = view;
        this.f70672b = countryTextInputLayout;
        this.f70673c = stripeEditText;
        this.f70674d = stripeEditText2;
        this.f70675e = stripeEditText3;
        this.f70676f = stripeEditText4;
        this.f70677g = stripeEditText5;
        this.f70678h = stripeEditText6;
        this.f70679i = stripeEditText7;
        this.f70680j = textInputLayout;
        this.f70681k = textInputLayout2;
        this.f70682l = textInputLayout3;
        this.f70683m = textInputLayout4;
        this.f70684n = textInputLayout5;
        this.f70685o = textInputLayout6;
        this.f70686p = textInputLayout7;
    }

    @NonNull
    public static f a(@NonNull View view) {
        int i11 = f30.z.f64287v;
        CountryTextInputLayout countryTextInputLayout = (CountryTextInputLayout) gb.b.a(view, i11);
        if (countryTextInputLayout != null) {
            i11 = f30.z.F;
            StripeEditText stripeEditText = (StripeEditText) gb.b.a(view, i11);
            if (stripeEditText != null) {
                i11 = f30.z.G;
                StripeEditText stripeEditText2 = (StripeEditText) gb.b.a(view, i11);
                if (stripeEditText2 != null) {
                    i11 = f30.z.I;
                    StripeEditText stripeEditText3 = (StripeEditText) gb.b.a(view, i11);
                    if (stripeEditText3 != null) {
                        i11 = f30.z.L;
                        StripeEditText stripeEditText4 = (StripeEditText) gb.b.a(view, i11);
                        if (stripeEditText4 != null) {
                            i11 = f30.z.M;
                            StripeEditText stripeEditText5 = (StripeEditText) gb.b.a(view, i11);
                            if (stripeEditText5 != null) {
                                i11 = f30.z.O;
                                StripeEditText stripeEditText6 = (StripeEditText) gb.b.a(view, i11);
                                if (stripeEditText6 != null) {
                                    i11 = f30.z.P;
                                    StripeEditText stripeEditText7 = (StripeEditText) gb.b.a(view, i11);
                                    if (stripeEditText7 != null) {
                                        i11 = f30.z.f64288v0;
                                        TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
                                        if (textInputLayout != null) {
                                            i11 = f30.z.f64290w0;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) gb.b.a(view, i11);
                                            if (textInputLayout2 != null) {
                                                i11 = f30.z.f64294y0;
                                                TextInputLayout textInputLayout3 = (TextInputLayout) gb.b.a(view, i11);
                                                if (textInputLayout3 != null) {
                                                    i11 = f30.z.B0;
                                                    TextInputLayout textInputLayout4 = (TextInputLayout) gb.b.a(view, i11);
                                                    if (textInputLayout4 != null) {
                                                        i11 = f30.z.C0;
                                                        TextInputLayout textInputLayout5 = (TextInputLayout) gb.b.a(view, i11);
                                                        if (textInputLayout5 != null) {
                                                            i11 = f30.z.E0;
                                                            TextInputLayout textInputLayout6 = (TextInputLayout) gb.b.a(view, i11);
                                                            if (textInputLayout6 != null) {
                                                                i11 = f30.z.F0;
                                                                TextInputLayout textInputLayout7 = (TextInputLayout) gb.b.a(view, i11);
                                                                if (textInputLayout7 != null) {
                                                                    return new f(view, countryTextInputLayout, stripeEditText, stripeEditText2, stripeEditText3, stripeEditText4, stripeEditText5, stripeEditText6, stripeEditText7, textInputLayout, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5, textInputLayout6, textInputLayout7);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static f b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(b0.f63908f, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70671a;
    }
}
