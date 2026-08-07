package com.adyen.checkout.card.internal.data.model;

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u00012B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJd\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b0\u0010\u000f¨\u00063"}, d2 = {"Lcom/adyen/checkout/card/internal/data/model/Brand;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", Brand.BRAND, "", Brand.ENABLE_LUHN_CHECK, Brand.SUPPORTED, Brand.CVC_POLICY, Brand.EXPIRY_DATE_POLICY, "", Brand.PAN_LENGTH, Brand.PAYMENT_METHOD_VARIANT, "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/adyen/checkout/card/internal/data/model/Brand;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBrand", "Ljava/lang/Boolean;", "getEnableLuhnCheck", "getSupported", "getCvcPolicy", "getExpiryDatePolicy", "Ljava/lang/Integer;", "getPanLength", "getPaymentMethodVariant", "Companion", "b", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Brand extends b {
    private static final String BRAND = "brand";
    private static final String CVC_POLICY = "cvcPolicy";
    private static final String ENABLE_LUHN_CHECK = "enableLuhnCheck";
    private static final String EXPIRY_DATE_POLICY = "expiryDatePolicy";
    private static final String PAN_LENGTH = "panLength";
    private static final String PAYMENT_METHOD_VARIANT = "paymentMethodVariant";
    private static final String SUPPORTED = "supported";
    private final String brand;
    private final String cvcPolicy;
    private final Boolean enableLuhnCheck;
    private final String expiryDatePolicy;
    private final Integer panLength;
    private final String paymentMethodVariant;
    private final Boolean supported;
    public static final Parcelable.Creator<Brand> CREATOR = new c();
    public static final b.a<Brand> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/card/internal/data/model/Brand$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/card/internal/data/model/Brand;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/card/internal/data/model/Brand;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/card/internal/data/model/Brand;", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<Brand> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Brand b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                return new Brand(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Brand.BRAND), com.adyen.checkout.core.internal.data.model.a.a(jsonObject, Brand.ENABLE_LUHN_CHECK), com.adyen.checkout.core.internal.data.model.a.a(jsonObject, Brand.SUPPORTED), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Brand.CVC_POLICY), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Brand.EXPIRY_DATE_POLICY), com.adyen.checkout.core.internal.data.model.a.b(jsonObject, Brand.PAN_LENGTH), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, Brand.PAYMENT_METHOD_VARIANT));
            } catch (JSONException e11) {
                throw new ModelSerializationException(Brand.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(Brand modelObject) {
            s.k(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(Brand.BRAND, modelObject.getBrand());
                jSONObject.putOpt(Brand.ENABLE_LUHN_CHECK, modelObject.getEnableLuhnCheck());
                jSONObject.putOpt(Brand.SUPPORTED, modelObject.getSupported());
                jSONObject.putOpt(Brand.CVC_POLICY, modelObject.getCvcPolicy());
                jSONObject.putOpt(Brand.EXPIRY_DATE_POLICY, modelObject.getExpiryDatePolicy());
                jSONObject.putOpt(Brand.EXPIRY_DATE_POLICY, modelObject.getExpiryDatePolicy());
                jSONObject.putOpt(Brand.PAN_LENGTH, modelObject.getPanLength());
                jSONObject.putOpt(Brand.PAYMENT_METHOD_VARIANT, modelObject.getPaymentMethodVariant());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(Brand.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<Brand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Brand createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Integer numValueOf;
            s.k(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                numValueOf = null;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new Brand(string, boolValueOf, boolValueOf2, string2, string3, numValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Brand[] newArray(int i11) {
            return new Brand[i11];
        }
    }

    public Brand() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ Brand copy$default(Brand brand, String str, Boolean bool, Boolean bool2, String str2, String str3, Integer num, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = brand.brand;
        }
        if ((i11 & 2) != 0) {
            bool = brand.enableLuhnCheck;
        }
        if ((i11 & 4) != 0) {
            bool2 = brand.supported;
        }
        if ((i11 & 8) != 0) {
            str2 = brand.cvcPolicy;
        }
        if ((i11 & 16) != 0) {
            str3 = brand.expiryDatePolicy;
        }
        if ((i11 & 32) != 0) {
            num = brand.panLength;
        }
        if ((i11 & 64) != 0) {
            str4 = brand.paymentMethodVariant;
        }
        Integer num2 = num;
        String str5 = str4;
        String str6 = str3;
        Boolean bool3 = bool2;
        return brand.copy(str, bool, bool3, str2, str6, num2, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getEnableLuhnCheck() {
        return this.enableLuhnCheck;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getSupported() {
        return this.supported;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCvcPolicy() {
        return this.cvcPolicy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpiryDatePolicy() {
        return this.expiryDatePolicy;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPanLength() {
        return this.panLength;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPaymentMethodVariant() {
        return this.paymentMethodVariant;
    }

    public final Brand copy(String brand, Boolean enableLuhnCheck, Boolean supported, String cvcPolicy, String expiryDatePolicy, Integer panLength, String paymentMethodVariant) {
        return new Brand(brand, enableLuhnCheck, supported, cvcPolicy, expiryDatePolicy, panLength, paymentMethodVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Brand)) {
            return false;
        }
        Brand brand = (Brand) other;
        return s.f(this.brand, brand.brand) && s.f(this.enableLuhnCheck, brand.enableLuhnCheck) && s.f(this.supported, brand.supported) && s.f(this.cvcPolicy, brand.cvcPolicy) && s.f(this.expiryDatePolicy, brand.expiryDatePolicy) && s.f(this.panLength, brand.panLength) && s.f(this.paymentMethodVariant, brand.paymentMethodVariant);
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCvcPolicy() {
        return this.cvcPolicy;
    }

    public final Boolean getEnableLuhnCheck() {
        return this.enableLuhnCheck;
    }

    public final String getExpiryDatePolicy() {
        return this.expiryDatePolicy;
    }

    public final Integer getPanLength() {
        return this.panLength;
    }

    public final String getPaymentMethodVariant() {
        return this.paymentMethodVariant;
    }

    public final Boolean getSupported() {
        return this.supported;
    }

    public int hashCode() {
        String str = this.brand;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.enableLuhnCheck;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.supported;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.cvcPolicy;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expiryDatePolicy;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.panLength;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.paymentMethodVariant;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Brand(brand=" + this.brand + ", enableLuhnCheck=" + this.enableLuhnCheck + ", supported=" + this.supported + ", cvcPolicy=" + this.cvcPolicy + ", expiryDatePolicy=" + this.expiryDatePolicy + ", panLength=" + this.panLength + ", paymentMethodVariant=" + this.paymentMethodVariant + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.brand);
        Boolean bool = this.enableLuhnCheck;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.supported;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.cvcPolicy);
        parcel.writeString(this.expiryDatePolicy);
        Integer num = this.panLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.paymentMethodVariant);
    }

    public /* synthetic */ Brand(String str, Boolean bool, Boolean bool2, String str2, String str3, Integer num, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : bool2, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? null : str4);
    }

    public Brand(String str, Boolean bool, Boolean bool2, String str2, String str3, Integer num, String str4) {
        this.brand = str;
        this.enableLuhnCheck = bool;
        this.supported = bool2;
        this.cvcPolicy = str2;
        this.expiryDatePolicy = str3;
        this.panLength = num;
        this.paymentMethodVariant = str4;
    }
}
