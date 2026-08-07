package s10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import o30.StripeError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aI\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u000f\u001a\u00060\u0015j\u0002`\u0016H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u000f\u0010\u001c\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"", "code", "message", "localizedMessage", "declineCode", "type", "stripeErrorCode", "Lcom/facebook/react/bridge/WritableMap;", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/WritableMap;", "f", "()Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/model/u0$g;", AnalyticsAttribute.Error, "a", "(Ljava/lang/String;Lcom/stripe/android/model/u0$g;)Lcom/facebook/react/bridge/WritableMap;", "Lcom/stripe/android/model/d1$e;", "b", "(Ljava/lang/String;Lcom/stripe/android/model/d1$e;)Lcom/facebook/react/bridge/WritableMap;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "c", "(Ljava/lang/String;Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;", "", "e", "(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/facebook/react/bridge/WritableMap;", "g", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e {
    public static final WritableMap a(String code, PaymentIntent.Error error) {
        PaymentIntent.Error.c type;
        s.k(code, "code");
        return h(code, error != null ? error.getMessage() : null, error != null ? error.getMessage() : null, error != null ? error.getDeclineCode() : null, (error == null || (type = error.getType()) == null) ? null : type.getCode(), error != null ? error.getCode() : null);
    }

    public static final WritableMap b(String code, SetupIntent.Error error) {
        SetupIntent.Error.c type;
        s.k(code, "code");
        return h(code, error != null ? error.getMessage() : null, error != null ? error.getMessage() : null, error != null ? error.getDeclineCode() : null, (error == null || (type = error.getType()) == null) ? null : type.getCode(), error != null ? error.getCode() : null);
    }

    public static final WritableMap c(String code, Exception error) {
        s.k(code, "code");
        s.k(error, "error");
        if (error instanceof CardException) {
            String message = error.getMessage();
            CardException cardException = (CardException) error;
            String localizedMessage = cardException.getLocalizedMessage();
            String declineCode = cardException.getDeclineCode();
            StripeError stripeError = cardException.getStripeError();
            String type = stripeError != null ? stripeError.getType() : null;
            StripeError stripeError2 = cardException.getStripeError();
            return h(code, message, localizedMessage, declineCode, type, stripeError2 != null ? stripeError2.getCode() : null);
        }
        if (error instanceof InvalidRequestException) {
            String code2 = null;
            String message2 = error.getMessage();
            InvalidRequestException invalidRequestException = (InvalidRequestException) error;
            String localizedMessage2 = invalidRequestException.getLocalizedMessage();
            StripeError stripeError3 = invalidRequestException.getStripeError();
            String declineCode2 = stripeError3 != null ? stripeError3.getDeclineCode() : null;
            StripeError stripeError4 = invalidRequestException.getStripeError();
            String type2 = stripeError4 != null ? stripeError4.getType() : null;
            StripeError stripeError5 = invalidRequestException.getStripeError();
            if (stripeError5 != null) {
                code2 = stripeError5.getCode();
            }
            return h(code, message2, localizedMessage2, declineCode2, type2, code2);
        }
        String code3 = null;
        if (error instanceof AuthenticationException) {
            String message3 = error.getMessage();
            AuthenticationException authenticationException = (AuthenticationException) error;
            String localizedMessage3 = authenticationException.getLocalizedMessage();
            StripeError stripeError6 = authenticationException.getStripeError();
            String declineCode3 = stripeError6 != null ? stripeError6.getDeclineCode() : null;
            StripeError stripeError7 = authenticationException.getStripeError();
            String type3 = stripeError7 != null ? stripeError7.getType() : null;
            StripeError stripeError8 = authenticationException.getStripeError();
            if (stripeError8 != null) {
                code3 = stripeError8.getCode();
            }
            return h(code, message3, localizedMessage3, declineCode3, type3, code3);
        }
        if (!(error instanceof APIException)) {
            String message4 = error.getMessage();
            String localizedMessage4 = error.getLocalizedMessage();
            if (localizedMessage4 == null) {
                localizedMessage4 = "";
            }
            return h(code, message4, localizedMessage4, null, null, null);
        }
        String message5 = error.getMessage();
        APIException aPIException = (APIException) error;
        String localizedMessage5 = aPIException.getLocalizedMessage();
        StripeError stripeError9 = aPIException.getStripeError();
        String declineCode4 = stripeError9 != null ? stripeError9.getDeclineCode() : null;
        StripeError stripeError10 = aPIException.getStripeError();
        String type4 = stripeError10 != null ? stripeError10.getType() : null;
        StripeError stripeError11 = aPIException.getStripeError();
        if (stripeError11 != null) {
            code3 = stripeError11.getCode();
        }
        return h(code, message5, localizedMessage5, declineCode4, type4, code3);
    }

    public static final WritableMap d(String code, String str) {
        s.k(code, "code");
        return h(code, str, str, null, null, null);
    }

    public static final WritableMap e(String code, Throwable error) {
        s.k(code, "code");
        s.k(error, "error");
        Exception exc = error instanceof Exception ? (Exception) error : null;
        return exc != null ? c(code, exc) : h(code, error.getMessage(), error.getLocalizedMessage(), null, null, null);
    }

    public static final WritableMap f() {
        return h("Failed", "Activity doesn't exist yet. You can safely retry this method.", null, null, null, null);
    }

    public static final WritableMap g() {
        return d(d.Failed.toString(), "Stripe has not been initialized. Initialize Stripe in your app with the StripeProvider component or the initStripe method.");
    }

    public static final WritableMap h(String code, String str, String str2, String str3, String str4, String str5) {
        s.k(code, "code");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("code", code);
        writableNativeMap2.putString("message", str);
        writableNativeMap2.putString("localizedMessage", str2);
        writableNativeMap2.putString("declineCode", str3);
        writableNativeMap2.putString("type", str4);
        writableNativeMap2.putString("stripeErrorCode", str5);
        writableNativeMap.putMap(AnalyticsAttribute.Error, writableNativeMap2);
        return writableNativeMap;
    }
}
