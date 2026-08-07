package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0001PB\u009d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J¦\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J \u0010/\u001a\u00020.2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020#HÖ\u0001¢\u0006\u0004\b/\u00100R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0013\"\u0004\b3\u00104R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u00101\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u00104R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00101\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u00104R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u00101\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u00104R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00101\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u00104R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00101\u001a\u0004\b=\u0010\u0013\"\u0004\b>\u00104R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00101\u001a\u0004\b?\u0010\u0013\"\u0004\b@\u00104R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00101\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u00104R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00101\u001a\u0004\bC\u0010\u0013\"\u0004\bD\u00104R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010HR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00101\u001a\u0004\bI\u0010\u0013\"\u0004\bJ\u00104R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\bK\u0010\u0013\"\u0004\bL\u00104R\u0011\u0010M\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", "type", "name", StoredPaymentMethod.BRAND, StoredPaymentMethod.EXPIRY_MONTH, StoredPaymentMethod.EXPIRY_YEAR, StoredPaymentMethod.HOLDER_NAME, StoredPaymentMethod.ID, StoredPaymentMethod.LAST_FOUR, "shopperEmail", "", StoredPaymentMethod.SUPPORTED_SHOPPER_INTERACTIONS, StoredPaymentMethod.BANK_ACCOUNT_NUMBER, StoredPaymentMethod.CASH_TAG, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "setType", "(Ljava/lang/String;)V", "getName", "setName", "getBrand", "setBrand", "getExpiryMonth", "setExpiryMonth", "getExpiryYear", "setExpiryYear", "getHolderName", "setHolderName", "getId", "setId", "getLastFour", "setLastFour", "getShopperEmail", "setShopperEmail", "Ljava/util/List;", "getSupportedShopperInteractions", "setSupportedShopperInteractions", "(Ljava/util/List;)V", "getBankAccountNumber", "setBankAccountNumber", "getCashtag", "setCashtag", "isEcommerce", "()Z", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class StoredPaymentMethod extends b {
    private static final String BANK_ACCOUNT_NUMBER = "bankAccountNumber";
    private static final String BRAND = "brand";
    private static final String CASH_TAG = "cashtag";
    private static final String ECOMMERCE = "Ecommerce";
    private static final String EXPIRY_MONTH = "expiryMonth";
    private static final String EXPIRY_YEAR = "expiryYear";
    private static final String HOLDER_NAME = "holderName";
    private static final String ID = "id";
    private static final String LAST_FOUR = "lastFour";
    private static final String NAME = "name";
    private static final String SHOPPER_EMAIL = "shopperEmail";
    private static final String SUPPORTED_SHOPPER_INTERACTIONS = "supportedShopperInteractions";
    private static final String TYPE = "type";
    private String bankAccountNumber;
    private String brand;
    private String cashtag;
    private String expiryMonth;
    private String expiryYear;
    private String holderName;
    private String id;
    private String lastFour;
    private String name;
    private String shopperEmail;
    private List<String> supportedShopperInteractions;
    private String type;
    public static final Parcelable.Creator<StoredPaymentMethod> CREATOR = new c();
    public static final b.a<StoredPaymentMethod> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/StoredPaymentMethod$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/StoredPaymentMethod;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/StoredPaymentMethod;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<StoredPaymentMethod> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public StoredPaymentMethod b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new StoredPaymentMethod(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "name"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, StoredPaymentMethod.BRAND), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, StoredPaymentMethod.EXPIRY_MONTH), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, StoredPaymentMethod.EXPIRY_YEAR), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, StoredPaymentMethod.HOLDER_NAME), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, StoredPaymentMethod.ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, StoredPaymentMethod.LAST_FOUR), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "shopperEmail"), oe.a.b(jsonObject.optJSONArray(StoredPaymentMethod.SUPPORTED_SHOPPER_INTERACTIONS)), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, StoredPaymentMethod.BANK_ACCOUNT_NUMBER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, StoredPaymentMethod.CASH_TAG));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(StoredPaymentMethod modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt("name", modelObject.getName());
                jSONObject.putOpt(StoredPaymentMethod.BRAND, modelObject.getBrand());
                jSONObject.putOpt(StoredPaymentMethod.EXPIRY_MONTH, modelObject.getExpiryMonth());
                jSONObject.putOpt(StoredPaymentMethod.EXPIRY_YEAR, modelObject.getExpiryYear());
                jSONObject.putOpt(StoredPaymentMethod.HOLDER_NAME, modelObject.getHolderName());
                jSONObject.putOpt(StoredPaymentMethod.ID, modelObject.getId());
                jSONObject.putOpt(StoredPaymentMethod.LAST_FOUR, modelObject.getLastFour());
                jSONObject.putOpt("shopperEmail", modelObject.getShopperEmail());
                jSONObject.putOpt(StoredPaymentMethod.SUPPORTED_SHOPPER_INTERACTIONS, new JSONArray((Collection) modelObject.getSupportedShopperInteractions()));
                jSONObject.putOpt(StoredPaymentMethod.BANK_ACCOUNT_NUMBER, modelObject.getBankAccountNumber());
                jSONObject.putOpt(StoredPaymentMethod.CASH_TAG, modelObject.getCashtag());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(StoredPaymentMethod.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<StoredPaymentMethod> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StoredPaymentMethod createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new StoredPaymentMethod(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final StoredPaymentMethod[] newArray(int i11) {
            return new StoredPaymentMethod[i11];
        }
    }

    public StoredPaymentMethod() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoredPaymentMethod copy$default(StoredPaymentMethod storedPaymentMethod, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storedPaymentMethod.type;
        }
        if ((i11 & 2) != 0) {
            str2 = storedPaymentMethod.name;
        }
        if ((i11 & 4) != 0) {
            str3 = storedPaymentMethod.brand;
        }
        if ((i11 & 8) != 0) {
            str4 = storedPaymentMethod.expiryMonth;
        }
        if ((i11 & 16) != 0) {
            str5 = storedPaymentMethod.expiryYear;
        }
        if ((i11 & 32) != 0) {
            str6 = storedPaymentMethod.holderName;
        }
        if ((i11 & 64) != 0) {
            str7 = storedPaymentMethod.id;
        }
        if ((i11 & 128) != 0) {
            str8 = storedPaymentMethod.lastFour;
        }
        if ((i11 & 256) != 0) {
            str9 = storedPaymentMethod.shopperEmail;
        }
        if ((i11 & 512) != 0) {
            list = storedPaymentMethod.supportedShopperInteractions;
        }
        if ((i11 & 1024) != 0) {
            str10 = storedPaymentMethod.bankAccountNumber;
        }
        if ((i11 & 2048) != 0) {
            str11 = storedPaymentMethod.cashtag;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str9;
        List list2 = list;
        String str15 = str7;
        String str16 = str8;
        String str17 = str5;
        String str18 = str6;
        return storedPaymentMethod.copy(str, str2, str3, str4, str17, str18, str15, str16, str14, list2, str12, str13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final List<String> component10() {
        return this.supportedShopperInteractions;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCashtag() {
        return this.cashtag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExpiryYear() {
        return this.expiryYear;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHolderName() {
        return this.holderName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getShopperEmail() {
        return this.shopperEmail;
    }

    public final StoredPaymentMethod copy(String type, String name, String brand, String expiryMonth, String expiryYear, String holderName, String id2, String lastFour, String shopperEmail, List<String> supportedShopperInteractions, String bankAccountNumber, String cashtag) {
        return new StoredPaymentMethod(type, name, brand, expiryMonth, expiryYear, holderName, id2, lastFour, shopperEmail, supportedShopperInteractions, bankAccountNumber, cashtag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoredPaymentMethod)) {
            return false;
        }
        StoredPaymentMethod storedPaymentMethod = (StoredPaymentMethod) other;
        return s.f(this.type, storedPaymentMethod.type) && s.f(this.name, storedPaymentMethod.name) && s.f(this.brand, storedPaymentMethod.brand) && s.f(this.expiryMonth, storedPaymentMethod.expiryMonth) && s.f(this.expiryYear, storedPaymentMethod.expiryYear) && s.f(this.holderName, storedPaymentMethod.holderName) && s.f(this.id, storedPaymentMethod.id) && s.f(this.lastFour, storedPaymentMethod.lastFour) && s.f(this.shopperEmail, storedPaymentMethod.shopperEmail) && s.f(this.supportedShopperInteractions, storedPaymentMethod.supportedShopperInteractions) && s.f(this.bankAccountNumber, storedPaymentMethod.bankAccountNumber) && s.f(this.cashtag, storedPaymentMethod.cashtag);
    }

    public final String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCashtag() {
        return this.cashtag;
    }

    public final String getExpiryMonth() {
        return this.expiryMonth;
    }

    public final String getExpiryYear() {
        return this.expiryYear;
    }

    public final String getHolderName() {
        return this.holderName;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShopperEmail() {
        return this.shopperEmail;
    }

    public final List<String> getSupportedShopperInteractions() {
        return this.supportedShopperInteractions;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.brand;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expiryMonth;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.expiryYear;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.holderName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.id;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastFour;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.shopperEmail;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<String> list = this.supportedShopperInteractions;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        String str10 = this.bankAccountNumber;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.cashtag;
        return iHashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    public final boolean isEcommerce() {
        List<String> list = this.supportedShopperInteractions;
        return list != null && list.contains(ECOMMERCE);
    }

    public final void setBankAccountNumber(String str) {
        this.bankAccountNumber = str;
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    public final void setCashtag(String str) {
        this.cashtag = str;
    }

    public final void setExpiryMonth(String str) {
        this.expiryMonth = str;
    }

    public final void setExpiryYear(String str) {
        this.expiryYear = str;
    }

    public final void setHolderName(String str) {
        this.holderName = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setLastFour(String str) {
        this.lastFour = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setShopperEmail(String str) {
        this.shopperEmail = str;
    }

    public final void setSupportedShopperInteractions(List<String> list) {
        this.supportedShopperInteractions = list;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        return "StoredPaymentMethod(type=" + this.type + ", name=" + this.name + ", brand=" + this.brand + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", holderName=" + this.holderName + ", id=" + this.id + ", lastFour=" + this.lastFour + ", shopperEmail=" + this.shopperEmail + ", supportedShopperInteractions=" + this.supportedShopperInteractions + ", bankAccountNumber=" + this.bankAccountNumber + ", cashtag=" + this.cashtag + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.type);
        parcel.writeString(this.name);
        parcel.writeString(this.brand);
        parcel.writeString(this.expiryMonth);
        parcel.writeString(this.expiryYear);
        parcel.writeString(this.holderName);
        parcel.writeString(this.id);
        parcel.writeString(this.lastFour);
        parcel.writeString(this.shopperEmail);
        parcel.writeStringList(this.supportedShopperInteractions);
        parcel.writeString(this.bankAccountNumber);
        parcel.writeString(this.cashtag);
    }

    public /* synthetic */ StoredPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : list, (i11 & 1024) != 0 ? null : str10, (i11 & 2048) != 0 ? null : str11);
    }

    public StoredPaymentMethod(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<String> list, String str10, String str11) {
        this.type = str;
        this.name = str2;
        this.brand = str3;
        this.expiryMonth = str4;
        this.expiryYear = str5;
        this.holderName = str6;
        this.id = str7;
        this.lastFour = str8;
        this.shopperEmail = str9;
        this.supportedShopperInteractions = list;
        this.bankAccountNumber = str10;
        this.cashtag = str11;
    }
}
