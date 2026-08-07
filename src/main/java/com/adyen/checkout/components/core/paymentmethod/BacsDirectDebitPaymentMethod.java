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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001/B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010%R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u001a\u0004\b&\u0010\u000b\"\u0004\b'\u0010%R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010%R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b*\u0010\u000b\"\u0004\b+\u0010%R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010%¨\u00060"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/BacsDirectDebitPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "", "type", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, BacsDirectDebitPaymentMethod.HOLDER_NAME, BacsDirectDebitPaymentMethod.BANK_ACCOUNT_NUMBER, BacsDirectDebitPaymentMethod.BANK_LOCATION_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/paymentmethod/BacsDirectDebitPaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getHolderName", "setHolderName", "getBankAccountNumber", "setBankAccountNumber", "getBankLocationId", "setBankLocationId", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class BacsDirectDebitPaymentMethod extends PaymentMethodDetails {
    private static final String BANK_ACCOUNT_NUMBER = "bankAccountNumber";
    private static final String BANK_LOCATION_ID = "bankLocationId";
    private static final String HOLDER_NAME = "holderName";
    public static final String PAYMENT_METHOD_TYPE = "directdebit_GB";
    private String bankAccountNumber;
    private String bankLocationId;
    private String checkoutAttemptId;
    private String holderName;
    private String type;
    public static final Parcelable.Creator<BacsDirectDebitPaymentMethod> CREATOR = new c();
    public static final b.a<BacsDirectDebitPaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/paymentmethod/BacsDirectDebitPaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/BacsDirectDebitPaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/paymentmethod/BacsDirectDebitPaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/paymentmethod/BacsDirectDebitPaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<BacsDirectDebitPaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BacsDirectDebitPaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new BacsDirectDebitPaymentMethod(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, BacsDirectDebitPaymentMethod.HOLDER_NAME), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, BacsDirectDebitPaymentMethod.BANK_ACCOUNT_NUMBER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, BacsDirectDebitPaymentMethod.BANK_LOCATION_ID));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(BacsDirectDebitPaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(BacsDirectDebitPaymentMethod.HOLDER_NAME, modelObject.getHolderName());
                jSONObject.putOpt(BacsDirectDebitPaymentMethod.BANK_ACCOUNT_NUMBER, modelObject.getBankAccountNumber());
                jSONObject.putOpt(BacsDirectDebitPaymentMethod.BANK_LOCATION_ID, modelObject.getBankLocationId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(BacsDirectDebitPaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<BacsDirectDebitPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BacsDirectDebitPaymentMethod createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new BacsDirectDebitPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BacsDirectDebitPaymentMethod[] newArray(int i11) {
            return new BacsDirectDebitPaymentMethod[i11];
        }
    }

    public BacsDirectDebitPaymentMethod(String str, String str2, String str3, String str4, String str5) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.holderName = str3;
        this.bankAccountNumber = str4;
        this.bankLocationId = str5;
    }

    public static /* synthetic */ BacsDirectDebitPaymentMethod copy$default(BacsDirectDebitPaymentMethod bacsDirectDebitPaymentMethod, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bacsDirectDebitPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = bacsDirectDebitPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = bacsDirectDebitPaymentMethod.holderName;
        }
        if ((i11 & 8) != 0) {
            str4 = bacsDirectDebitPaymentMethod.bankAccountNumber;
        }
        if ((i11 & 16) != 0) {
            str5 = bacsDirectDebitPaymentMethod.bankLocationId;
        }
        String str6 = str5;
        String str7 = str3;
        return bacsDirectDebitPaymentMethod.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBankLocationId() {
        return this.bankLocationId;
    }

    public final BacsDirectDebitPaymentMethod copy(String type, String checkoutAttemptId, String holderName, String bankAccountNumber, String bankLocationId) {
        return new BacsDirectDebitPaymentMethod(type, checkoutAttemptId, holderName, bankAccountNumber, bankLocationId);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BacsDirectDebitPaymentMethod)) {
            return false;
        }
        BacsDirectDebitPaymentMethod bacsDirectDebitPaymentMethod = (BacsDirectDebitPaymentMethod) other;
        return s.f(this.type, bacsDirectDebitPaymentMethod.type) && s.f(this.checkoutAttemptId, bacsDirectDebitPaymentMethod.checkoutAttemptId) && s.f(this.holderName, bacsDirectDebitPaymentMethod.holderName) && s.f(this.bankAccountNumber, bacsDirectDebitPaymentMethod.bankAccountNumber) && s.f(this.bankLocationId, bacsDirectDebitPaymentMethod.bankLocationId);
    }

    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public final String getBankLocationId() {
        return this.bankLocationId;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    public final String getHolderName() {
        return this.holderName;
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
        String str3 = this.holderName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bankAccountNumber;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bankLocationId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setBankAccountNumber(String str) {
        this.bankAccountNumber = str;
    }

    public final void setBankLocationId(String str) {
        this.bankLocationId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(String str) {
        this.checkoutAttemptId = str;
    }

    public final void setHolderName(String str) {
        this.holderName = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "BacsDirectDebitPaymentMethod(type=" + this.type + ", checkoutAttemptId=" + this.checkoutAttemptId + ", holderName=" + this.holderName + ", bankAccountNumber=" + this.bankAccountNumber + ", bankLocationId=" + this.bankLocationId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.holderName);
        parcel.writeString(this.bankAccountNumber);
        parcel.writeString(this.bankLocationId);
    }
}
