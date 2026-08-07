package com.adyen.checkout.components.core.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0001OB\u009f\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J¬\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020#HÖ\u0001¢\u0006\u0004\b+\u0010%J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020#HÖ\u0001¢\u0006\u0004\b0\u00101R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u00105R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u00102\u001a\u0004\b6\u0010\u0013\"\u0004\b7\u00105R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00102\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u00105R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00102\u001a\u0004\b:\u0010\u0013\"\u0004\b;\u00105R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00102\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u00105R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00102\u001a\u0004\b>\u0010\u0013\"\u0004\b?\u00105R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00102\u001a\u0004\b@\u0010\u0013\"\u0004\bA\u00105R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00102\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u00105R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00102\u001a\u0004\bD\u0010\u0013\"\u0004\bE\u00105R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00102\u001a\u0004\bF\u0010\u0013\"\u0004\bG\u00105R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00102\u001a\u0004\bH\u0010\u0013\"\u0004\bI\u00105R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00102\u001a\u0004\bJ\u0010\u0013\"\u0004\bK\u00105R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00102\u001a\u0004\bL\u0010\u0013\"\u0004\bM\u00105¨\u0006P"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "", "type", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, CardPaymentMethod.ENCRYPTED_CARD_NUMBER, CardPaymentMethod.ENCRYPTED_EXPIRY_MONTH, CardPaymentMethod.ENCRYPTED_EXPIRY_YEAR, CardPaymentMethod.ENCRYPTED_SECURITY_CODE, CardPaymentMethod.ENCRYPTED_PASSWORD, CardPaymentMethod.HOLDER_NAME, CardPaymentMethod.STORED_PAYMENT_METHOD_ID, CardPaymentMethod.TAX_NUMBER, CardPaymentMethod.BRAND, CardPaymentMethod.THREEDS2_SDK_VERSION, CardPaymentMethod.FUNDING_SOURCE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getEncryptedCardNumber", "setEncryptedCardNumber", "getEncryptedExpiryMonth", "setEncryptedExpiryMonth", "getEncryptedExpiryYear", "setEncryptedExpiryYear", "getEncryptedSecurityCode", "setEncryptedSecurityCode", "getEncryptedPassword", "setEncryptedPassword", "getHolderName", "setHolderName", "getStoredPaymentMethodId", "setStoredPaymentMethodId", "getTaxNumber", "setTaxNumber", "getBrand", "setBrand", "getThreeDS2SdkVersion", "setThreeDS2SdkVersion", "getFundingSource", "setFundingSource", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class CardPaymentMethod extends PaymentMethodDetails {
    private static final String BRAND = "brand";
    private static final String ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
    private static final String ENCRYPTED_EXPIRY_MONTH = "encryptedExpiryMonth";
    private static final String ENCRYPTED_EXPIRY_YEAR = "encryptedExpiryYear";
    private static final String ENCRYPTED_PASSWORD = "encryptedPassword";
    private static final String ENCRYPTED_SECURITY_CODE = "encryptedSecurityCode";
    private static final String FUNDING_SOURCE = "fundingSource";
    private static final String HOLDER_NAME = "holderName";
    public static final String PAYMENT_METHOD_TYPE = "scheme";
    private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
    private static final String TAX_NUMBER = "taxNumber";
    private static final String THREEDS2_SDK_VERSION = "threeDS2SdkVersion";
    private String brand;
    private String checkoutAttemptId;
    private String encryptedCardNumber;
    private String encryptedExpiryMonth;
    private String encryptedExpiryYear;
    private String encryptedPassword;
    private String encryptedSecurityCode;
    private String fundingSource;
    private String holderName;
    private String storedPaymentMethodId;
    private String taxNumber;
    private String threeDS2SdkVersion;
    private String type;
    public static final Parcelable.Creator<CardPaymentMethod> CREATOR = new c();
    public static final b.a<CardPaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/paymentmethod/CardPaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/paymentmethod/CardPaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<CardPaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CardPaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new CardPaymentMethod(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.ENCRYPTED_CARD_NUMBER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.ENCRYPTED_EXPIRY_MONTH), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.ENCRYPTED_EXPIRY_YEAR), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.ENCRYPTED_SECURITY_CODE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.ENCRYPTED_PASSWORD), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.HOLDER_NAME), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.STORED_PAYMENT_METHOD_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.TAX_NUMBER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.BRAND), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.THREEDS2_SDK_VERSION), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, CardPaymentMethod.FUNDING_SOURCE));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(CardPaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(CardPaymentMethod.ENCRYPTED_CARD_NUMBER, modelObject.getEncryptedCardNumber());
                jSONObject.putOpt(CardPaymentMethod.ENCRYPTED_EXPIRY_MONTH, modelObject.getEncryptedExpiryMonth());
                jSONObject.putOpt(CardPaymentMethod.ENCRYPTED_EXPIRY_YEAR, modelObject.getEncryptedExpiryYear());
                jSONObject.putOpt(CardPaymentMethod.ENCRYPTED_SECURITY_CODE, modelObject.getEncryptedSecurityCode());
                jSONObject.putOpt(CardPaymentMethod.HOLDER_NAME, modelObject.getHolderName());
                jSONObject.putOpt(CardPaymentMethod.STORED_PAYMENT_METHOD_ID, modelObject.getStoredPaymentMethodId());
                jSONObject.putOpt(CardPaymentMethod.ENCRYPTED_PASSWORD, modelObject.getEncryptedPassword());
                jSONObject.putOpt(CardPaymentMethod.TAX_NUMBER, modelObject.getTaxNumber());
                jSONObject.putOpt(CardPaymentMethod.BRAND, modelObject.getBrand());
                jSONObject.putOpt(CardPaymentMethod.THREEDS2_SDK_VERSION, modelObject.getThreeDS2SdkVersion());
                jSONObject.putOpt(CardPaymentMethod.FUNDING_SOURCE, modelObject.getFundingSource());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(CardPaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<CardPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardPaymentMethod createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new CardPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CardPaymentMethod[] newArray(int i11) {
            return new CardPaymentMethod[i11];
        }
    }

    public /* synthetic */ CardPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13);
    }

    public static /* synthetic */ CardPaymentMethod copy$default(CardPaymentMethod cardPaymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardPaymentMethod.type;
        }
        return cardPaymentMethod.copy(str, (i11 & 2) != 0 ? cardPaymentMethod.checkoutAttemptId : str2, (i11 & 4) != 0 ? cardPaymentMethod.encryptedCardNumber : str3, (i11 & 8) != 0 ? cardPaymentMethod.encryptedExpiryMonth : str4, (i11 & 16) != 0 ? cardPaymentMethod.encryptedExpiryYear : str5, (i11 & 32) != 0 ? cardPaymentMethod.encryptedSecurityCode : str6, (i11 & 64) != 0 ? cardPaymentMethod.encryptedPassword : str7, (i11 & 128) != 0 ? cardPaymentMethod.holderName : str8, (i11 & 256) != 0 ? cardPaymentMethod.storedPaymentMethodId : str9, (i11 & 512) != 0 ? cardPaymentMethod.taxNumber : str10, (i11 & 1024) != 0 ? cardPaymentMethod.brand : str11, (i11 & 2048) != 0 ? cardPaymentMethod.threeDS2SdkVersion : str12, (i11 & 4096) != 0 ? cardPaymentMethod.fundingSource : str13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTaxNumber() {
        return this.taxNumber;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getThreeDS2SdkVersion() {
        return this.threeDS2SdkVersion;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getFundingSource() {
        return this.fundingSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEncryptedExpiryMonth() {
        return this.encryptedExpiryMonth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEncryptedExpiryYear() {
        return this.encryptedExpiryYear;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    public final CardPaymentMethod copy(String type, String checkoutAttemptId, String encryptedCardNumber, String encryptedExpiryMonth, String encryptedExpiryYear, String encryptedSecurityCode, String encryptedPassword, String holderName, String storedPaymentMethodId, String taxNumber, String brand, String threeDS2SdkVersion, String fundingSource) {
        return new CardPaymentMethod(type, checkoutAttemptId, encryptedCardNumber, encryptedExpiryMonth, encryptedExpiryYear, encryptedSecurityCode, encryptedPassword, holderName, storedPaymentMethodId, taxNumber, brand, threeDS2SdkVersion, fundingSource);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardPaymentMethod)) {
            return false;
        }
        CardPaymentMethod cardPaymentMethod = (CardPaymentMethod) other;
        return s.f(this.type, cardPaymentMethod.type) && s.f(this.checkoutAttemptId, cardPaymentMethod.checkoutAttemptId) && s.f(this.encryptedCardNumber, cardPaymentMethod.encryptedCardNumber) && s.f(this.encryptedExpiryMonth, cardPaymentMethod.encryptedExpiryMonth) && s.f(this.encryptedExpiryYear, cardPaymentMethod.encryptedExpiryYear) && s.f(this.encryptedSecurityCode, cardPaymentMethod.encryptedSecurityCode) && s.f(this.encryptedPassword, cardPaymentMethod.encryptedPassword) && s.f(this.holderName, cardPaymentMethod.holderName) && s.f(this.storedPaymentMethodId, cardPaymentMethod.storedPaymentMethodId) && s.f(this.taxNumber, cardPaymentMethod.taxNumber) && s.f(this.brand, cardPaymentMethod.brand) && s.f(this.threeDS2SdkVersion, cardPaymentMethod.threeDS2SdkVersion) && s.f(this.fundingSource, cardPaymentMethod.fundingSource);
    }

    public final String getBrand() {
        return this.brand;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    public final String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    public final String getEncryptedExpiryMonth() {
        return this.encryptedExpiryMonth;
    }

    public final String getEncryptedExpiryYear() {
        return this.encryptedExpiryYear;
    }

    public final String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    public final String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    public final String getFundingSource() {
        return this.fundingSource;
    }

    public final String getHolderName() {
        return this.holderName;
    }

    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    public final String getTaxNumber() {
        return this.taxNumber;
    }

    public final String getThreeDS2SdkVersion() {
        return this.threeDS2SdkVersion;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.checkoutAttemptId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.encryptedCardNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.encryptedExpiryMonth;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.encryptedExpiryYear;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.encryptedSecurityCode;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.encryptedPassword;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.holderName;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.storedPaymentMethodId;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.taxNumber;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.brand;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.threeDS2SdkVersion;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.fundingSource;
        return iHashCode12 + (str13 != null ? str13.hashCode() : 0);
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(String str) {
        this.checkoutAttemptId = str;
    }

    public final void setEncryptedCardNumber(String str) {
        this.encryptedCardNumber = str;
    }

    public final void setEncryptedExpiryMonth(String str) {
        this.encryptedExpiryMonth = str;
    }

    public final void setEncryptedExpiryYear(String str) {
        this.encryptedExpiryYear = str;
    }

    public final void setEncryptedPassword(String str) {
        this.encryptedPassword = str;
    }

    public final void setEncryptedSecurityCode(String str) {
        this.encryptedSecurityCode = str;
    }

    public final void setFundingSource(String str) {
        this.fundingSource = str;
    }

    public final void setHolderName(String str) {
        this.holderName = str;
    }

    public final void setStoredPaymentMethodId(String str) {
        this.storedPaymentMethodId = str;
    }

    public final void setTaxNumber(String str) {
        this.taxNumber = str;
    }

    public final void setThreeDS2SdkVersion(String str) {
        this.threeDS2SdkVersion = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "CardPaymentMethod(type=" + this.type + ", checkoutAttemptId=" + this.checkoutAttemptId + ", encryptedCardNumber=" + this.encryptedCardNumber + ", encryptedExpiryMonth=" + this.encryptedExpiryMonth + ", encryptedExpiryYear=" + this.encryptedExpiryYear + ", encryptedSecurityCode=" + this.encryptedSecurityCode + ", encryptedPassword=" + this.encryptedPassword + ", holderName=" + this.holderName + ", storedPaymentMethodId=" + this.storedPaymentMethodId + ", taxNumber=" + this.taxNumber + ", brand=" + this.brand + ", threeDS2SdkVersion=" + this.threeDS2SdkVersion + ", fundingSource=" + this.fundingSource + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.encryptedCardNumber);
        parcel.writeString(this.encryptedExpiryMonth);
        parcel.writeString(this.encryptedExpiryYear);
        parcel.writeString(this.encryptedSecurityCode);
        parcel.writeString(this.encryptedPassword);
        parcel.writeString(this.holderName);
        parcel.writeString(this.storedPaymentMethodId);
        parcel.writeString(this.taxNumber);
        parcel.writeString(this.brand);
        parcel.writeString(this.threeDS2SdkVersion);
        parcel.writeString(this.fundingSource);
    }

    public CardPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.encryptedCardNumber = str3;
        this.encryptedExpiryMonth = str4;
        this.encryptedExpiryYear = str5;
        this.encryptedSecurityCode = str6;
        this.encryptedPassword = str7;
        this.holderName = str8;
        this.storedPaymentMethodId = str9;
        this.taxNumber = str10;
        this.brand = str11;
        this.threeDS2SdkVersion = str12;
        this.fundingSource = str13;
    }
}
