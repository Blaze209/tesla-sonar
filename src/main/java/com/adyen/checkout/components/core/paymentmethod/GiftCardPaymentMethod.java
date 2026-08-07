package com.adyen.checkout.components.core.paymentmethod;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019¨\u0006("}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/GiftCardPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "", "type", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, GiftCardPaymentMethod.ENCRYPTED_CARD_NUMBER, GiftCardPaymentMethod.ENCRYPTED_SECURITY_CODE, GiftCardPaymentMethod.ENCRYPTED_EXPIRY_MONTH, GiftCardPaymentMethod.ENCRYPTED_EXPIRY_YEAR, GiftCardPaymentMethod.BRAND, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getEncryptedCardNumber", "setEncryptedCardNumber", "getEncryptedSecurityCode", "setEncryptedSecurityCode", "getEncryptedExpiryMonth", "setEncryptedExpiryMonth", "getEncryptedExpiryYear", "setEncryptedExpiryYear", "getBrand", "setBrand", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GiftCardPaymentMethod extends PaymentMethodDetails {
    private static final String BRAND = "brand";
    private static final String ENCRYPTED_CARD_NUMBER = "encryptedCardNumber";
    private static final String ENCRYPTED_EXPIRY_MONTH = "encryptedExpiryMonth";
    private static final String ENCRYPTED_EXPIRY_YEAR = "encryptedExpiryYear";
    private static final String ENCRYPTED_SECURITY_CODE = "encryptedSecurityCode";
    public static final String PAYMENT_METHOD_TYPE = "giftcard";
    private String brand;
    private String checkoutAttemptId;
    private String encryptedCardNumber;
    private String encryptedExpiryMonth;
    private String encryptedExpiryYear;
    private String encryptedSecurityCode;
    private String type;
    public static final Parcelable.Creator<GiftCardPaymentMethod> CREATOR = new c();
    public static final b.a<GiftCardPaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/paymentmethod/GiftCardPaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/GiftCardPaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/paymentmethod/GiftCardPaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/paymentmethod/GiftCardPaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<GiftCardPaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GiftCardPaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new GiftCardPaymentMethod(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, GiftCardPaymentMethod.ENCRYPTED_CARD_NUMBER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, GiftCardPaymentMethod.ENCRYPTED_SECURITY_CODE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, GiftCardPaymentMethod.ENCRYPTED_EXPIRY_MONTH), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, GiftCardPaymentMethod.ENCRYPTED_EXPIRY_YEAR), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, GiftCardPaymentMethod.BRAND));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(GiftCardPaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(GiftCardPaymentMethod.ENCRYPTED_CARD_NUMBER, modelObject.getEncryptedCardNumber());
                jSONObject.putOpt(GiftCardPaymentMethod.ENCRYPTED_SECURITY_CODE, modelObject.getEncryptedSecurityCode());
                jSONObject.putOpt(GiftCardPaymentMethod.ENCRYPTED_EXPIRY_MONTH, modelObject.getEncryptedExpiryMonth());
                jSONObject.putOpt(GiftCardPaymentMethod.ENCRYPTED_EXPIRY_YEAR, modelObject.getEncryptedExpiryYear());
                jSONObject.putOpt(GiftCardPaymentMethod.BRAND, modelObject.getBrand());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(GooglePayPaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<GiftCardPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GiftCardPaymentMethod createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new GiftCardPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GiftCardPaymentMethod[] newArray(int i11) {
            return new GiftCardPaymentMethod[i11];
        }
    }

    public GiftCardPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.encryptedCardNumber = str3;
        this.encryptedSecurityCode = str4;
        this.encryptedExpiryMonth = str5;
        this.encryptedExpiryYear = str6;
        this.brand = str7;
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
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

    public final String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getType() {
        return this.type;
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

    public final void setEncryptedSecurityCode(String str) {
        this.encryptedSecurityCode = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(String str) {
        this.type = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.encryptedCardNumber);
        parcel.writeString(this.encryptedSecurityCode);
        parcel.writeString(this.encryptedExpiryMonth);
        parcel.writeString(this.encryptedExpiryYear);
        parcel.writeString(this.brand);
    }
}
