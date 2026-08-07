package h40;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.view.BecsDebitAccountNumberEditText;
import com.stripe.android.view.BecsDebitBsbEditText;
import com.stripe.android.view.BecsDebitMandateAcceptanceTextView;
import com.stripe.android.view.EmailEditText;
import com.stripe.android.view.StripeEditText;
import f30.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements gb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f70693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final BecsDebitAccountNumberEditText f70694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final BecsDebitBsbEditText f70696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final EmailEditText f70698f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70699g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final BecsDebitMandateAcceptanceTextView f70700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final StripeEditText f70701i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f70702j;

    private i(@NonNull View view, @NonNull BecsDebitAccountNumberEditText becsDebitAccountNumberEditText, @NonNull TextInputLayout textInputLayout, @NonNull BecsDebitBsbEditText becsDebitBsbEditText, @NonNull TextInputLayout textInputLayout2, @NonNull EmailEditText emailEditText, @NonNull TextInputLayout textInputLayout3, @NonNull BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView, @NonNull StripeEditText stripeEditText, @NonNull TextInputLayout textInputLayout4) {
        this.f70693a = view;
        this.f70694b = becsDebitAccountNumberEditText;
        this.f70695c = textInputLayout;
        this.f70696d = becsDebitBsbEditText;
        this.f70697e = textInputLayout2;
        this.f70698f = emailEditText;
        this.f70699g = textInputLayout3;
        this.f70700h = becsDebitMandateAcceptanceTextView;
        this.f70701i = stripeEditText;
        this.f70702j = textInputLayout4;
    }

    @NonNull
    public static i a(@NonNull View view) {
        int i11 = f30.z.f64245a;
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = (BecsDebitAccountNumberEditText) gb.b.a(view, i11);
        if (becsDebitAccountNumberEditText != null) {
            i11 = f30.z.f64247b;
            TextInputLayout textInputLayout = (TextInputLayout) gb.b.a(view, i11);
            if (textInputLayout != null) {
                i11 = f30.z.f64263j;
                BecsDebitBsbEditText becsDebitBsbEditText = (BecsDebitBsbEditText) gb.b.a(view, i11);
                if (becsDebitBsbEditText != null) {
                    i11 = f30.z.f64265k;
                    TextInputLayout textInputLayout2 = (TextInputLayout) gb.b.a(view, i11);
                    if (textInputLayout2 != null) {
                        i11 = f30.z.C;
                        EmailEditText emailEditText = (EmailEditText) gb.b.a(view, i11);
                        if (emailEditText != null) {
                            i11 = f30.z.D;
                            TextInputLayout textInputLayout3 = (TextInputLayout) gb.b.a(view, i11);
                            if (textInputLayout3 != null) {
                                i11 = f30.z.V;
                                BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = (BecsDebitMandateAcceptanceTextView) gb.b.a(view, i11);
                                if (becsDebitMandateAcceptanceTextView != null) {
                                    i11 = f30.z.Y;
                                    StripeEditText stripeEditText = (StripeEditText) gb.b.a(view, i11);
                                    if (stripeEditText != null) {
                                        i11 = f30.z.Z;
                                        TextInputLayout textInputLayout4 = (TextInputLayout) gb.b.a(view, i11);
                                        if (textInputLayout4 != null) {
                                            return new i(view, becsDebitAccountNumberEditText, textInputLayout, becsDebitBsbEditText, textInputLayout2, emailEditText, textInputLayout3, becsDebitMandateAcceptanceTextView, stripeEditText, textInputLayout4);
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
    public static i b(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(b0.f63911i, viewGroup);
        return a(viewGroup);
    }

    @Override // gb.a
    @NonNull
    public View getRoot() {
        return this.f70693a;
    }
}
