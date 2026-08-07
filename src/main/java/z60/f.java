package z60;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import f30.d0;
import f90.h;
import java.util.Locale;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lo30/f;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "e", "(Lo30/f;Landroid/content/Context;)Lo30/f;", "Lcom/stripe/android/model/u0$g;", "c", "(Lcom/stripe/android/model/u0$g;Landroid/content/Context;)Lcom/stripe/android/model/u0$g;", "Lcom/stripe/android/model/d1$e;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/d1$e;Landroid/content/Context;)Lcom/stripe/android/model/d1$e;", "", "code", "b", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "", "a", "()Z", "shouldFallBackToLocalizedError", "payments-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {
    private static final boolean a() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        s.j(language, "getLanguage(...)");
        Locale locale2 = Locale.ROOT;
        String lowerCase = language.toLowerCase(locale2);
        s.j(lowerCase, "toLowerCase(...)");
        if (!s.f(lowerCase, "es")) {
            return false;
        }
        String country = locale.getCountry();
        s.j(country, "getCountry(...)");
        String lowerCase2 = country.toLowerCase(locale2);
        s.j(lowerCase2, "toLowerCase(...)");
        return !s.f(lowerCase2, "es");
    }

    public static final String b(Context context, String str) {
        Integer numValueOf;
        s.k(context, "<this>");
        if (str != null) {
            switch (str) {
                case "generic_decline":
                    numValueOf = Integer.valueOf(d0.f63971s0);
                    break;
                case "invalid_expiry_month":
                    numValueOf = Integer.valueOf(h.H);
                    break;
                case "invalid_cvc":
                    numValueOf = Integer.valueOf(d0.f63981x0);
                    break;
                case "incorrect_number":
                    numValueOf = Integer.valueOf(d0.f63979w0);
                    break;
                case "invalid_owner_name":
                    numValueOf = Integer.valueOf(d0.f63983y0);
                    break;
                case "processing_error":
                    numValueOf = Integer.valueOf(d0.G0);
                    break;
                case "invalid_number":
                    numValueOf = Integer.valueOf(d0.f63979w0);
                    break;
                case "card_declined":
                    numValueOf = Integer.valueOf(d0.Z);
                    break;
                case "invalid_expiry_year":
                    numValueOf = Integer.valueOf(h.I);
                    break;
                case "expired_card":
                    numValueOf = Integer.valueOf(d0.f63957l0);
                    break;
                case "invalid_bank_account_iban":
                    numValueOf = Integer.valueOf(d0.f63977v0);
                    break;
                case "incorrect_cvc":
                    numValueOf = Integer.valueOf(d0.f63981x0);
                    break;
                default:
                    numValueOf = null;
                    break;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return context.getString(numValueOf.intValue());
        }
        return null;
    }

    public static final PaymentIntent.Error c(PaymentIntent.Error error, Context context) {
        String message;
        String str;
        s.k(error, "<this>");
        s.k(context, "context");
        if (a() || (message = error.getMessage()) == null) {
            String strB = b(context, error.getCode());
            str = strB;
        } else {
            str = message;
        }
        return PaymentIntent.Error.b(error, null, null, null, null, str, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, null);
    }

    public static final SetupIntent.Error d(SetupIntent.Error error, Context context) {
        String message;
        String str;
        s.k(error, "<this>");
        s.k(context, "context");
        if (a() || (message = error.getMessage()) == null) {
            String strB = b(context, error.getCode());
            str = strB;
        } else {
            str = message;
        }
        return SetupIntent.Error.b(error, null, null, null, str, null, null, null, 119, null);
    }

    public static final StripeError e(StripeError stripeError, Context context) {
        String message;
        String str;
        s.k(stripeError, "<this>");
        s.k(context, "context");
        if (a() || (message = stripeError.getMessage()) == null) {
            String strB = b(context, stripeError.getCode());
            str = strB;
        } else {
            str = message;
        }
        return StripeError.b(stripeError, null, str, null, null, null, null, null, null, EnumC4419g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }
}
