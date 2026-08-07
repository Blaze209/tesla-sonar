package com.adyen.checkout.components.core.paymentmethod;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.action.Action;
import com.adyen.checkout.core.exception.CheckoutException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b&\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "Lcom/adyen/checkout/core/internal/data/model/b;", "<init>", "()V", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "type", "getCheckoutAttemptId", "setCheckoutAttemptId", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class PaymentMethodDetails extends b {
    public static final String CHECKOUT_ATTEMPT_ID = "checkoutAttemptId";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final b.a<PaymentMethodDetails> SERIALIZER = new a();
    public static final String TYPE = "type";

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<PaymentMethodDetails> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PaymentMethodDetails b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            String strE = com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type");
            if (strE == null || strE.length() == 0) {
                throw new CheckoutException("PaymentMethod type not found", null, 2, null);
            }
            return (PaymentMethodDetails) PaymentMethodDetails.INSTANCE.a(strE).b(jsonObject);
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(PaymentMethodDetails modelObject) {
            s.k(modelObject, "modelObject");
            String type = modelObject.getType();
            if (type == null || type.length() == 0) {
                throw new CheckoutException("PaymentMethod type not found", null, 2, null);
            }
            return PaymentMethodDetails.INSTANCE.a(type).a(modelObject);
        }
    }

    /* JADX INFO: renamed from: com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails$b;", "", "<init>", "()V", "", Action.PAYMENT_METHOD_TYPE, "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "a", "(Ljava/lang/String;)Lcom/adyen/checkout/core/internal/data/model/b$a;", "CHECKOUT_ATTEMPT_ID", "Ljava/lang/String;", "SERIALIZER", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "TYPE", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:130:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:133:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:134:0x01c4  */
        /* JADX WARN: Code duplicated, block: B:36:0x0078  */
        /* JADX WARN: Code duplicated, block: B:88:0x0130  */
        public final b.a<PaymentMethodDetails> a(String paymentMethodType) {
            b.a<PaymentMethodDetails> aVarA;
            s.k(paymentMethodType, "paymentMethodType");
            switch (paymentMethodType) {
                case "upi_collect":
                    aVarA = UPIPaymentMethod.SERIALIZER;
                    break;
                case "molpay_ebanking_fpx_MY":
                    aVarA = MolpayPaymentMethod.SERIALIZER;
                    break;
                case "dotpay":
                    aVarA = DotpayPaymentMethod.SERIALIZER;
                    break;
                case "scheme":
                    aVarA = CardPaymentMethod.SERIALIZER;
                    break;
                case "entercash":
                    aVarA = EntercashPaymentMethod.SERIALIZER;
                    break;
                case "upi_qr":
                    aVarA = UPIPaymentMethod.SERIALIZER;
                    break;
                case "paybybank":
                    aVarA = PayByBankPaymentMethod.SERIALIZER;
                    break;
                case "econtext_seven_eleven":
                    aVarA = SevenElevenPaymentMethod.SERIALIZER;
                    break;
                case "ach":
                    aVarA = ACHDirectDebitPaymentMethod.SERIALIZER;
                    break;
                case "eps":
                    aVarA = EPSPaymentMethod.SERIALIZER;
                    break;
                case "upi":
                    aVarA = UPIPaymentMethod.SERIALIZER;
                    break;
                case "blik":
                    aVarA = BlikPaymentMethod.SERIALIZER;
                    break;
                case "mealVoucher_FR":
                    aVarA = GiftCardPaymentMethod.SERIALIZER;
                    break;
                case "directdebit_GB":
                    aVarA = BacsDirectDebitPaymentMethod.SERIALIZER;
                    break;
                case "econtext_atm":
                    aVarA = PayEasyPaymentMethod.SERIALIZER;
                    break;
                case "ideal":
                    aVarA = IdealPaymentMethod.SERIALIZER;
                    break;
                case "mbway":
                    aVarA = MBWayPaymentMethod.SERIALIZER;
                    break;
                case "twint":
                    aVarA = TwintPaymentMethod.SERIALIZER;
                    break;
                case "mealVoucher_FR_sodexo":
                    aVarA = GiftCardPaymentMethod.SERIALIZER;
                    break;
                case "cashapp":
                    aVarA = CashAppPayPaymentMethod.INSTANCE.a();
                    break;
                case "giftcard":
                    aVarA = GiftCardPaymentMethod.SERIALIZER;
                    break;
                case "onlineBanking_CZ":
                    aVarA = OnlineBankingCZPaymentMethod.SERIALIZER;
                    break;
                case "onlineBanking_PL":
                    aVarA = OnlineBankingPLPaymentMethod.SERIALIZER;
                    break;
                case "onlineBanking_SK":
                    aVarA = OnlineBankingSKPaymentMethod.SERIALIZER;
                    break;
                case "molpay_ebanking_TH":
                case "molpay_ebanking_VN":
                    aVarA = MolpayPaymentMethod.SERIALIZER;
                    break;
                case "paywithgoogle":
                    aVarA = GooglePayPaymentMethod.SERIALIZER;
                    break;
                case "econtext_online":
                    aVarA = OnlineBankingJPPaymentMethod.SERIALIZER;
                    break;
                case "googlepay":
                    aVarA = GooglePayPaymentMethod.SERIALIZER;
                    break;
                case "sepadirectdebit":
                    aVarA = SepaPaymentMethod.SERIALIZER;
                    break;
                case "mealVoucher_FR_groupeup":
                    aVarA = GiftCardPaymentMethod.SERIALIZER;
                    break;
                case "econtext_stores":
                    aVarA = ConvenienceStoresJPPaymentMethod.SERIALIZER;
                    break;
                case "mealVoucher_FR_natixis":
                    aVarA = GiftCardPaymentMethod.SERIALIZER;
                    break;
                case "openbanking_UK":
                    aVarA = OpenBankingPaymentMethod.SERIALIZER;
                    break;
                case "upi_intent":
                    aVarA = UPIPaymentMethod.SERIALIZER;
                    break;
                default:
                    aVarA = GenericPaymentMethod.SERIALIZER;
                    break;
            }
            s.i(aVarA, "null cannot be cast to non-null type com.adyen.checkout.core.internal.data.model.ModelObject.Serializer<com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails>");
            return aVarA;
        }

        private Companion() {
        }
    }

    public abstract String getCheckoutAttemptId();

    public abstract String getType();

    public abstract void setCheckoutAttemptId(String str);

    public abstract void setType(String str);
}
