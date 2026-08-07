package com.content;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.facebook.react.bridge.ReadableMap;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.android.gms.common.Scopes;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.n;
import com.stripe.android.model.y0;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import s10.i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\rJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\rJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\rJ\u000f\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010\rJ\u001f\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b'\u0010&J\u001f\u0010(\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b(\u0010&J\u0019\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u000b2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J'\u00103\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b3\u00104R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00105R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00105R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00106R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00107R\u0016\u0010:\u001a\u0004\u0018\u0001088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00109R\"\u0010=\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0018\u00010;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010<¨\u0006>"}, d2 = {"Lcom/reactnativestripesdk/r0;", "", "Lcom/facebook/react/bridge/ReadableMap;", "paymentMethodData", "options", "Lcom/reactnativestripesdk/k;", "cardFieldView", "Lcom/reactnativestripesdk/v;", "cardFormView", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/ReadableMap;Lcom/reactnativestripesdk/k;Lcom/reactnativestripesdk/v;)V", "Lcom/stripe/android/model/w0;", "o", "()Lcom/stripe/android/model/w0;", "e", "x", "g", "w", "q", "m", "k", "n", "r", "l", DateTokenConverter.CONVERTER_KEY, "f", "p", "t", "b", "j", "v", "h", "", "clientSecret", "", "isPaymentIntent", "Lcom/stripe/android/model/n;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Z)Lcom/stripe/android/model/n;", "z", "c", "params", "y", "(Lcom/facebook/react/bridge/ReadableMap;)Lcom/stripe/android/model/w0;", "Lcom/stripe/android/model/q0;", "a", "()Lcom/stripe/android/model/q0;", "Lcom/stripe/android/model/v0$p;", Action.PAYMENT_METHOD_TYPE, "u", "(Lcom/stripe/android/model/v0$p;)Lcom/stripe/android/model/w0;", "s", "(Ljava/lang/String;Lcom/stripe/android/model/v0$p;Z)Lcom/stripe/android/model/n;", "Lcom/facebook/react/bridge/ReadableMap;", "Lcom/reactnativestripesdk/k;", "Lcom/reactnativestripesdk/v;", "Lcom/stripe/android/model/v0$e;", "Lcom/stripe/android/model/v0$e;", "billingDetailsParams", "", "Ljava/util/Map;", "metadataParams", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReadableMap paymentMethodData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReadableMap options;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k cardFieldView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v cardFormView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final PaymentMethod.BillingDetails billingDetailsParams;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<String, String> metadataParams;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48917a;

        static {
            int[] iArr = new int[PaymentMethod.p.values().length];
            try {
                iArr[PaymentMethod.p.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentMethod.p.Ideal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaymentMethod.p.Alipay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaymentMethod.p.Sofort.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaymentMethod.p.Bancontact.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaymentMethod.p.SepaDebit.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PaymentMethod.p.Oxxo.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PaymentMethod.p.Giropay.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PaymentMethod.p.Eps.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[PaymentMethod.p.GrabPay.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[PaymentMethod.p.P24.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[PaymentMethod.p.Fpx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[PaymentMethod.p.AfterpayClearpay.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[PaymentMethod.p.AuBecsDebit.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[PaymentMethod.p.Klarna.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[PaymentMethod.p.USBankAccount.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[PaymentMethod.p.PayPal.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[PaymentMethod.p.Affirm.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[PaymentMethod.p.CashAppPay.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[PaymentMethod.p.RevolutPay.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            f48917a = iArr;
        }
    }

    public r0(ReadableMap readableMap, ReadableMap options, k kVar, v vVar) {
        Address cardAddress;
        s.k(options, "options");
        this.paymentMethodData = readableMap;
        this.options = options;
        this.cardFieldView = kVar;
        this.cardFormView = vVar;
        this.billingDetailsParams = i.K(i.g(readableMap, "billingDetails"), (kVar == null || (cardAddress = kVar.getCardAddress()) == null) ? vVar != null ? vVar.getCardAddress() : null : cardAddress);
        this.metadataParams = i.L(i.g(readableMap, OrcaKeys.METADATA));
    }

    private final MandateDataParams a() {
        ReadableMap readableMapG;
        ReadableMap readableMapG2;
        ReadableMap readableMapG3 = i.g(this.paymentMethodData, "mandateData");
        if (readableMapG3 == null || (readableMapG = i.g(readableMapG3, "customerAcceptance")) == null || (readableMapG2 = i.g(readableMapG, "online")) == null) {
            return null;
        }
        String strI = i.i(readableMapG2, "ipAddress", "");
        if (strI == null) {
            strI = "";
        }
        String strI2 = i.i(readableMapG2, "userAgent", "");
        return new MandateDataParams(new MandateDataParams.c.Online(strI, strI2 != null ? strI2 : ""));
    }

    private final PaymentMethodCreateParams b() {
        return PaymentMethodCreateParams.Companion.r(PaymentMethodCreateParams.INSTANCE, this.billingDetailsParams, this.metadataParams, null, 4, null);
    }

    private final n c(String clientSecret, boolean isPaymentIntent) throws PaymentMethodCreateParamsException {
        if (!isPaymentIntent) {
            throw new PaymentMethodCreateParamsException("Affirm is not yet supported through SetupIntents.");
        }
        PaymentMethodCreateParams paymentMethodCreateParamsB = b();
        return ConfirmPaymentIntentParams.Companion.f(ConfirmPaymentIntentParams.INSTANCE, paymentMethodCreateParamsB, clientSecret, null, null, a(), i.M(i.j(this.options, "setupFutureUsage", null, 4, null)), null, null, EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, null);
    }

    private final PaymentMethodCreateParams d() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.t(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams e() {
        return PaymentMethodCreateParams.Companion.v(PaymentMethodCreateParams.INSTANCE, null, null, 3, null);
    }

    private final PaymentMethodCreateParams f() throws PaymentMethodCreateParamsException {
        ReadableMap readableMapG = i.g(this.paymentMethodData, "formDetails");
        if (readableMapG == null) {
            throw new PaymentMethodCreateParamsException("You must provide form details");
        }
        String strJ = i.j(readableMapG, "bsbNumber", null, 4, null);
        s.i(strJ, "null cannot be cast to non-null type kotlin.String");
        String strJ2 = i.j(readableMapG, "accountNumber", null, 4, null);
        s.i(strJ2, "null cannot be cast to non-null type kotlin.String");
        String strJ3 = i.j(readableMapG, "name", null, 4, null);
        s.i(strJ3, "null cannot be cast to non-null type kotlin.String");
        String strJ4 = i.j(readableMapG, Scopes.EMAIL, null, 4, null);
        s.i(strJ4, "null cannot be cast to non-null type kotlin.String");
        return PaymentMethodCreateParams.Companion.i(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.AuBecsDebit(strJ, strJ2), new PaymentMethod.BillingDetails.a().d(strJ3).c(strJ4).a(), this.metadataParams, null, 8, null);
    }

    private final PaymentMethodCreateParams g() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.y(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams h() throws PaymentMethodCreateParamsException {
        PaymentMethodCreateParams.Card cardParams;
        PaymentMethodCreateParams.Card cardParams2 = null;
        String strI = i.i(this.paymentMethodData, "token", null);
        k kVar = this.cardFieldView;
        if (kVar == null || (cardParams = kVar.getCardParams()) == null) {
            v vVar = this.cardFormView;
            if (vVar != null) {
                cardParams2 = vVar.getCardParams();
            }
        } else {
            cardParams2 = cardParams;
        }
        if (strI != null) {
            cardParams2 = PaymentMethodCreateParams.Card.INSTANCE.a(strI);
        }
        PaymentMethodCreateParams.Card card = cardParams2;
        if (card != null) {
            return PaymentMethodCreateParams.Companion.j(PaymentMethodCreateParams.INSTANCE, card, this.billingDetailsParams, null, null, 12, null);
        }
        throw new PaymentMethodCreateParamsException("Card details not complete");
    }

    private final n i(String clientSecret, boolean isPaymentIntent) throws PaymentMethodCreateParamsException {
        String strI = i.i(this.paymentMethodData, "paymentMethodId", null);
        ConfirmPaymentIntentParams.c cVarM = i.M(i.j(this.options, "setupFutureUsage", null, 4, null));
        if (strI != null) {
            String strI2 = i.i(this.paymentMethodData, "cvc", null);
            return isPaymentIntent ? ConfirmPaymentIntentParams.Companion.h(ConfirmPaymentIntentParams.INSTANCE, strI, clientSecret, null, strI2 != null ? new y0.Card(strI2, null, null, 6, null) : null, null, null, cVarM, null, 180, null) : ConfirmSetupIntentParams.Companion.e(ConfirmSetupIntentParams.INSTANCE, strI, clientSecret, null, null, 12, null);
        }
        PaymentMethodCreateParams paymentMethodCreateParamsH = h();
        return isPaymentIntent ? ConfirmPaymentIntentParams.Companion.f(ConfirmPaymentIntentParams.INSTANCE, paymentMethodCreateParamsH, clientSecret, null, null, null, cVarM, null, null, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, null) : ConfirmSetupIntentParams.Companion.d(ConfirmSetupIntentParams.INSTANCE, paymentMethodCreateParamsH, clientSecret, null, null, 12, null);
    }

    private final PaymentMethodCreateParams j() {
        return PaymentMethodCreateParams.Companion.A(PaymentMethodCreateParams.INSTANCE, this.billingDetailsParams, this.metadataParams, null, 4, null);
    }

    private final PaymentMethodCreateParams k() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.C(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams l() {
        i.e(this.paymentMethodData, "testOfflineBank");
        return PaymentMethodCreateParams.Companion.k(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.Fpx("test_offline_bank"), null, this.metadataParams, null, 10, null);
    }

    private final PaymentMethodCreateParams m() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.F(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams n() {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        return PaymentMethodCreateParams.Companion.H(PaymentMethodCreateParams.INSTANCE, billingDetails == null ? new PaymentMethod.BillingDetails(null, null, null, null, 15, null) : billingDetails, null, null, 6, null);
    }

    private final PaymentMethodCreateParams o() {
        return PaymentMethodCreateParams.Companion.l(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.Ideal(i.i(this.paymentMethodData, "bankName", null)), this.billingDetailsParams, this.metadataParams, null, 8, null);
    }

    private final PaymentMethodCreateParams p() throws PaymentMethodCreateParamsException {
        String str;
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            Address address = billingDetails.address;
            String country = address != null ? address.getCountry() : null;
            if (country != null && !t.y0(country) && (str = this.billingDetailsParams.email) != null && !t.y0(str)) {
                return PaymentMethodCreateParams.Companion.K(PaymentMethodCreateParams.INSTANCE, this.billingDetailsParams, this.metadataParams, null, 4, null);
            }
        }
        throw new PaymentMethodCreateParamsException("Klarna requires that you provide the following billing details: email, country");
    }

    private final PaymentMethodCreateParams q() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.N(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams r() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails != null) {
            return PaymentMethodCreateParams.Companion.P(PaymentMethodCreateParams.INSTANCE, billingDetails, this.metadataParams, null, 4, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide billing details");
    }

    private final PaymentMethodCreateParams t() {
        return PaymentMethodCreateParams.Companion.R(PaymentMethodCreateParams.INSTANCE, this.metadataParams, null, 2, null);
    }

    private final PaymentMethodCreateParams v() {
        return PaymentMethodCreateParams.Companion.T(PaymentMethodCreateParams.INSTANCE, this.billingDetailsParams, this.metadataParams, null, 4, null);
    }

    private final PaymentMethodCreateParams w() throws PaymentMethodCreateParamsException {
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        if (billingDetails == null) {
            throw new PaymentMethodCreateParamsException("You must provide billing details");
        }
        String strI = i.i(this.paymentMethodData, "iban", null);
        if (strI != null) {
            return PaymentMethodCreateParams.Companion.n(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.SepaDebit(strI), billingDetails, this.metadataParams, null, 8, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide IBAN");
    }

    private final PaymentMethodCreateParams x() throws PaymentMethodCreateParamsException {
        String strI = i.i(this.paymentMethodData, PlaceTypes.COUNTRY, null);
        if (strI != null) {
            return PaymentMethodCreateParams.Companion.o(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.Sofort(strI), this.billingDetailsParams, this.metadataParams, null, 8, null);
        }
        throw new PaymentMethodCreateParamsException("You must provide bank account country");
    }

    private final PaymentMethodCreateParams y(ReadableMap params) throws PaymentMethodCreateParamsException {
        String strI = i.i(params, "accountNumber", null);
        String strI2 = i.i(params, "routingNumber", null);
        if (strI == null || t.y0(strI)) {
            throw new PaymentMethodCreateParamsException("When creating a US bank account payment method, you must provide the bank account number");
        }
        if (strI2 == null || t.y0(strI2)) {
            throw new PaymentMethodCreateParamsException("When creating a US bank account payment method, you must provide the bank routing number");
        }
        return PaymentMethodCreateParams.Companion.p(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.USBankAccount(strI, strI2, i.T(i.i(params, "accountType", null)), i.S(i.i(params, "accountHolderType", null))), this.billingDetailsParams, this.metadataParams, null, 8, null);
    }

    private final n z(String clientSecret, boolean isPaymentIntent) throws PaymentMethodCreateParamsException {
        if (this.paymentMethodData == null) {
            return isPaymentIntent ? ConfirmPaymentIntentParams.INSTANCE.b(clientSecret, PaymentMethod.p.USBankAccount) : ConfirmSetupIntentParams.INSTANCE.b(clientSecret, PaymentMethod.p.USBankAccount);
        }
        PaymentMethod.BillingDetails billingDetails = this.billingDetailsParams;
        String str = billingDetails != null ? billingDetails.name : null;
        if (str == null || t.y0(str)) {
            throw new PaymentMethodCreateParamsException("When creating a US bank account payment method, you must provide the following billing details: name");
        }
        return isPaymentIntent ? ConfirmPaymentIntentParams.Companion.f(ConfirmPaymentIntentParams.INSTANCE, y(this.paymentMethodData), clientSecret, null, null, null, i.M(i.j(this.options, "setupFutureUsage", null, 4, null)), null, null, EnumC4419g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, null) : ConfirmSetupIntentParams.Companion.d(ConfirmSetupIntentParams.INSTANCE, y(this.paymentMethodData), clientSecret, null, null, 12, null);
    }

    public final n s(String clientSecret, PaymentMethod.p paymentMethodType, boolean isPaymentIntent) throws Exception {
        s.k(clientSecret, "clientSecret");
        switch (paymentMethodType == null ? -1 : a.f48917a[paymentMethodType.ordinal()]) {
            case -1:
                return ConfirmPaymentIntentParams.Companion.c(ConfirmPaymentIntentParams.INSTANCE, clientSecret, null, null, 6, null);
            case 0:
            default:
                throw new Exception("This paymentMethodType is not supported yet");
            case 1:
                return i(clientSecret, isPaymentIntent);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 19:
            case 20:
                PaymentMethodCreateParams paymentMethodCreateParamsU = u(paymentMethodType);
                if (isPaymentIntent) {
                    return ConfirmPaymentIntentParams.Companion.f(ConfirmPaymentIntentParams.INSTANCE, paymentMethodCreateParamsU, clientSecret, null, null, a(), i.M(i.j(this.options, "setupFutureUsage", null, 4, null)), null, null, EnumC4419g.SDK_ASSET_ICON_CLEARED_REC_VALUE, null);
                }
                return ConfirmSetupIntentParams.Companion.d(ConfirmSetupIntentParams.INSTANCE, paymentMethodCreateParamsU, clientSecret, a(), null, 8, null);
            case 16:
                return z(clientSecret, isPaymentIntent);
            case 18:
                return c(clientSecret, isPaymentIntent);
        }
    }

    public final PaymentMethodCreateParams u(PaymentMethod.p paymentMethodType) throws Exception {
        s.k(paymentMethodType, "paymentMethodType");
        switch (a.f48917a[paymentMethodType.ordinal()]) {
            case 1:
                return h();
            case 2:
                return o();
            case 3:
                return e();
            case 4:
                return x();
            case 5:
                return g();
            case 6:
                return w();
            case 7:
                return q();
            case 8:
                return m();
            case 9:
                return k();
            case 10:
                return n();
            case 11:
                return r();
            case 12:
                return l();
            case 13:
                return d();
            case 14:
                return f();
            case 15:
                return p();
            case 16:
                return y(this.paymentMethodData);
            case 17:
                return t();
            case 18:
                return b();
            case 19:
                return j();
            case 20:
                return v();
            default:
                throw new Exception("This paymentMethodType is not supported yet");
        }
    }
}
