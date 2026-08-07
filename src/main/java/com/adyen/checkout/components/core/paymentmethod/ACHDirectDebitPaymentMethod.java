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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00013BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010'R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010$\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010'R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010$\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010'R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010'R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010$\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010'R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010$\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010'¨\u00064"}, d2 = {"Lcom/adyen/checkout/components/core/paymentmethod/ACHDirectDebitPaymentMethod;", "Lcom/adyen/checkout/components/core/paymentmethod/PaymentMethodDetails;", "", "type", PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, ACHDirectDebitPaymentMethod.ENCRYPTED_BANK_ACCOUNT_NUMBER, ACHDirectDebitPaymentMethod.ENCRYPTED_BANK_LOCATION_ID, ACHDirectDebitPaymentMethod.OWNER_NAME, ACHDirectDebitPaymentMethod.STORED_PAYMENT_METHOD_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/paymentmethod/ACHDirectDebitPaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getCheckoutAttemptId", "setCheckoutAttemptId", "getEncryptedBankAccountNumber", "setEncryptedBankAccountNumber", "getEncryptedBankLocationId", "setEncryptedBankLocationId", "getOwnerName", "setOwnerName", "getStoredPaymentMethodId", "setStoredPaymentMethodId", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class ACHDirectDebitPaymentMethod extends PaymentMethodDetails {
    private static final String ENCRYPTED_BANK_ACCOUNT_NUMBER = "encryptedBankAccountNumber";
    private static final String ENCRYPTED_BANK_LOCATION_ID = "encryptedBankLocationId";
    private static final String OWNER_NAME = "ownerName";
    public static final String PAYMENT_METHOD_TYPE = "ach";
    private static final String STORED_PAYMENT_METHOD_ID = "storedPaymentMethodId";
    private String checkoutAttemptId;
    private String encryptedBankAccountNumber;
    private String encryptedBankLocationId;
    private String ownerName;
    private String storedPaymentMethodId;
    private String type;
    public static final Parcelable.Creator<ACHDirectDebitPaymentMethod> CREATOR = new c();
    public static final b.a<ACHDirectDebitPaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/paymentmethod/ACHDirectDebitPaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/paymentmethod/ACHDirectDebitPaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/paymentmethod/ACHDirectDebitPaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/paymentmethod/ACHDirectDebitPaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<ACHDirectDebitPaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ACHDirectDebitPaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new ACHDirectDebitPaymentMethod(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, PaymentMethodDetails.CHECKOUT_ATTEMPT_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, ACHDirectDebitPaymentMethod.ENCRYPTED_BANK_ACCOUNT_NUMBER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, ACHDirectDebitPaymentMethod.ENCRYPTED_BANK_LOCATION_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, ACHDirectDebitPaymentMethod.OWNER_NAME), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, ACHDirectDebitPaymentMethod.STORED_PAYMENT_METHOD_ID));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(ACHDirectDebitPaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(PaymentMethodDetails.CHECKOUT_ATTEMPT_ID, modelObject.getCheckoutAttemptId());
                jSONObject.putOpt(ACHDirectDebitPaymentMethod.ENCRYPTED_BANK_ACCOUNT_NUMBER, modelObject.getEncryptedBankAccountNumber());
                jSONObject.putOpt(ACHDirectDebitPaymentMethod.ENCRYPTED_BANK_LOCATION_ID, modelObject.getEncryptedBankLocationId());
                jSONObject.putOpt(ACHDirectDebitPaymentMethod.OWNER_NAME, modelObject.getOwnerName());
                jSONObject.putOpt(ACHDirectDebitPaymentMethod.STORED_PAYMENT_METHOD_ID, modelObject.getStoredPaymentMethodId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(ACHDirectDebitPaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<ACHDirectDebitPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ACHDirectDebitPaymentMethod createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new ACHDirectDebitPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ACHDirectDebitPaymentMethod[] newArray(int i11) {
            return new ACHDirectDebitPaymentMethod[i11];
        }
    }

    public /* synthetic */ ACHDirectDebitPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ ACHDirectDebitPaymentMethod copy$default(ACHDirectDebitPaymentMethod aCHDirectDebitPaymentMethod, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aCHDirectDebitPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = aCHDirectDebitPaymentMethod.checkoutAttemptId;
        }
        if ((i11 & 4) != 0) {
            str3 = aCHDirectDebitPaymentMethod.encryptedBankAccountNumber;
        }
        if ((i11 & 8) != 0) {
            str4 = aCHDirectDebitPaymentMethod.encryptedBankLocationId;
        }
        if ((i11 & 16) != 0) {
            str5 = aCHDirectDebitPaymentMethod.ownerName;
        }
        if ((i11 & 32) != 0) {
            str6 = aCHDirectDebitPaymentMethod.storedPaymentMethodId;
        }
        String str7 = str5;
        String str8 = str6;
        return aCHDirectDebitPaymentMethod.copy(str, str2, str3, str4, str7, str8);
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
    public final String getEncryptedBankAccountNumber() {
        return this.encryptedBankAccountNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEncryptedBankLocationId() {
        return this.encryptedBankLocationId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOwnerName() {
        return this.ownerName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
    }

    public final ACHDirectDebitPaymentMethod copy(String type, String checkoutAttemptId, String encryptedBankAccountNumber, String encryptedBankLocationId, String ownerName, String storedPaymentMethodId) {
        return new ACHDirectDebitPaymentMethod(type, checkoutAttemptId, encryptedBankAccountNumber, encryptedBankLocationId, ownerName, storedPaymentMethodId);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ACHDirectDebitPaymentMethod)) {
            return false;
        }
        ACHDirectDebitPaymentMethod aCHDirectDebitPaymentMethod = (ACHDirectDebitPaymentMethod) other;
        return s.f(this.type, aCHDirectDebitPaymentMethod.type) && s.f(this.checkoutAttemptId, aCHDirectDebitPaymentMethod.checkoutAttemptId) && s.f(this.encryptedBankAccountNumber, aCHDirectDebitPaymentMethod.encryptedBankAccountNumber) && s.f(this.encryptedBankLocationId, aCHDirectDebitPaymentMethod.encryptedBankLocationId) && s.f(this.ownerName, aCHDirectDebitPaymentMethod.ownerName) && s.f(this.storedPaymentMethodId, aCHDirectDebitPaymentMethod.storedPaymentMethodId);
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public String getCheckoutAttemptId() {
        return this.checkoutAttemptId;
    }

    public final String getEncryptedBankAccountNumber() {
        return this.encryptedBankAccountNumber;
    }

    public final String getEncryptedBankLocationId() {
        return this.encryptedBankLocationId;
    }

    public final String getOwnerName() {
        return this.ownerName;
    }

    public final String getStoredPaymentMethodId() {
        return this.storedPaymentMethodId;
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
        String str3 = this.encryptedBankAccountNumber;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.encryptedBankLocationId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.ownerName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.storedPaymentMethodId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setCheckoutAttemptId(String str) {
        this.checkoutAttemptId = str;
    }

    public final void setEncryptedBankAccountNumber(String str) {
        this.encryptedBankAccountNumber = str;
    }

    public final void setEncryptedBankLocationId(String str) {
        this.encryptedBankLocationId = str;
    }

    public final void setOwnerName(String str) {
        this.ownerName = str;
    }

    public final void setStoredPaymentMethodId(String str) {
        this.storedPaymentMethodId = str;
    }

    @Override // com.adyen.checkout.components.core.paymentmethod.PaymentMethodDetails
    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "ACHDirectDebitPaymentMethod(type=" + this.type + ", checkoutAttemptId=" + this.checkoutAttemptId + ", encryptedBankAccountNumber=" + this.encryptedBankAccountNumber + ", encryptedBankLocationId=" + this.encryptedBankLocationId + ", ownerName=" + this.ownerName + ", storedPaymentMethodId=" + this.storedPaymentMethodId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.checkoutAttemptId);
        parcel.writeString(this.encryptedBankAccountNumber);
        parcel.writeString(this.encryptedBankLocationId);
        parcel.writeString(this.ownerName);
        parcel.writeString(this.storedPaymentMethodId);
    }

    public ACHDirectDebitPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6) {
        this.type = str;
        this.checkoutAttemptId = str2;
        this.encryptedBankAccountNumber = str3;
        this.encryptedBankLocationId = str4;
        this.ownerName = str5;
        this.storedPaymentMethodId = str6;
    }
}
