package com.adyen.checkout.sessions.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001,BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJL\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u000fR'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b*\u0010\r¨\u0006-"}, d2 = {"Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", SessionSetupConfiguration.ENABLE_STORE_DETAILS, SessionSetupConfiguration.SHOW_INSTALLMENT_AMOUNT, "", "", "Lcom/adyen/checkout/sessions/core/SessionSetupInstallmentOptions;", SessionSetupConfiguration.INSTALLMENT_OPTIONS, SessionSetupConfiguration.SHOW_REMOVE_PAYMENT_METHOD_BUTTON, "<init>", "(Ljava/lang/Boolean;ZLjava/util/Map;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Z", "component3", "()Ljava/util/Map;", "component4", "copy", "(Ljava/lang/Boolean;ZLjava/util/Map;Ljava/lang/Boolean;)Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getEnableStoreDetails", "Z", "getShowInstallmentAmount", "Ljava/util/Map;", "getInstallmentOptions", "getShowRemovePaymentMethodButton", "Companion", "b", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SessionSetupConfiguration extends b {
    private static final String ENABLE_STORE_DETAILS = "enableStoreDetails";
    private static final String INSTALLMENT_OPTIONS = "installmentOptions";
    private static final String SHOW_INSTALLMENT_AMOUNT = "showInstallmentAmount";
    private static final String SHOW_REMOVE_PAYMENT_METHOD_BUTTON = "showRemovePaymentMethodButton";
    private final Boolean enableStoreDetails;
    private final Map<String, SessionSetupInstallmentOptions> installmentOptions;
    private final boolean showInstallmentAmount;
    private final Boolean showRemovePaymentMethodButton;
    public static final Parcelable.Creator<SessionSetupConfiguration> CREATOR = new c();
    public static final b.a<SessionSetupConfiguration> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/sessions/core/SessionSetupConfiguration$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/sessions/core/SessionSetupConfiguration;", "sessions-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<SessionSetupConfiguration> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SessionSetupConfiguration b(JSONObject jsonObject) {
            LinkedHashMap linkedHashMap;
            s.k(jsonObject, "jsonObject");
            try {
                Boolean boolA = com.adyen.checkout.core.internal.data.model.a.a(jsonObject, SessionSetupConfiguration.ENABLE_STORE_DETAILS);
                boolean zOptBoolean = jsonObject.optBoolean(SessionSetupConfiguration.SHOW_INSTALLMENT_AMOUNT);
                JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject(SessionSetupConfiguration.INSTALLMENT_OPTIONS);
                if (jSONObjectOptJSONObject != null) {
                    b.a<SessionSetupInstallmentOptions> aVar = SessionSetupInstallmentOptions.SERIALIZER;
                    linkedHashMap = new LinkedHashMap();
                    if (jSONObjectOptJSONObject != JSONObject.NULL) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            Object obj = jSONObjectOptJSONObject.get(next);
                            if (obj instanceof JSONObject) {
                                s.h(next);
                                linkedHashMap.put(next, com.adyen.checkout.core.internal.data.model.c.a((JSONObject) obj, aVar));
                            }
                        }
                    }
                } else {
                    linkedHashMap = null;
                }
                return new SessionSetupConfiguration(boolA, zOptBoolean, linkedHashMap, com.adyen.checkout.core.internal.data.model.a.a(jsonObject, SessionSetupConfiguration.SHOW_REMOVE_PAYMENT_METHOD_BUTTON));
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionSetupConfiguration.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(SessionSetupConfiguration modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(SessionSetupConfiguration.ENABLE_STORE_DETAILS, modelObject.getEnableStoreDetails());
                jSONObject.putOpt(SessionSetupConfiguration.SHOW_INSTALLMENT_AMOUNT, Boolean.valueOf(modelObject.getShowInstallmentAmount()));
                Map<String, SessionSetupInstallmentOptions> installmentOptions = modelObject.getInstallmentOptions();
                jSONObject.putOpt(SessionSetupConfiguration.INSTALLMENT_OPTIONS, installmentOptions != null ? new JSONObject(installmentOptions) : null);
                jSONObject.putOpt(SessionSetupConfiguration.SHOW_REMOVE_PAYMENT_METHOD_BUTTON, modelObject.getShowRemovePaymentMethodButton());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(SessionSetupConfiguration.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<SessionSetupConfiguration> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SessionSetupConfiguration createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            s.k(parcel, "parcel");
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            boolean z11 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readInt() == 0 ? null : SessionSetupInstallmentOptions.CREATOR.createFromParcel(parcel));
                }
            }
            return new SessionSetupConfiguration(boolValueOf, z11, linkedHashMap, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SessionSetupConfiguration[] newArray(int i11) {
            return new SessionSetupConfiguration[i11];
        }
    }

    public SessionSetupConfiguration() {
        this(null, false, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SessionSetupConfiguration copy$default(SessionSetupConfiguration sessionSetupConfiguration, Boolean bool, boolean z11, Map map, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = sessionSetupConfiguration.enableStoreDetails;
        }
        if ((i11 & 2) != 0) {
            z11 = sessionSetupConfiguration.showInstallmentAmount;
        }
        if ((i11 & 4) != 0) {
            map = sessionSetupConfiguration.installmentOptions;
        }
        if ((i11 & 8) != 0) {
            bool2 = sessionSetupConfiguration.showRemovePaymentMethodButton;
        }
        return sessionSetupConfiguration.copy(bool, z11, map, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnableStoreDetails() {
        return this.enableStoreDetails;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowInstallmentAmount() {
        return this.showInstallmentAmount;
    }

    public final Map<String, SessionSetupInstallmentOptions> component3() {
        return this.installmentOptions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getShowRemovePaymentMethodButton() {
        return this.showRemovePaymentMethodButton;
    }

    public final SessionSetupConfiguration copy(Boolean enableStoreDetails, boolean showInstallmentAmount, Map<String, SessionSetupInstallmentOptions> installmentOptions, Boolean showRemovePaymentMethodButton) {
        return new SessionSetupConfiguration(enableStoreDetails, showInstallmentAmount, installmentOptions, showRemovePaymentMethodButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionSetupConfiguration)) {
            return false;
        }
        SessionSetupConfiguration sessionSetupConfiguration = (SessionSetupConfiguration) other;
        return s.f(this.enableStoreDetails, sessionSetupConfiguration.enableStoreDetails) && this.showInstallmentAmount == sessionSetupConfiguration.showInstallmentAmount && s.f(this.installmentOptions, sessionSetupConfiguration.installmentOptions) && s.f(this.showRemovePaymentMethodButton, sessionSetupConfiguration.showRemovePaymentMethodButton);
    }

    public final Boolean getEnableStoreDetails() {
        return this.enableStoreDetails;
    }

    public final Map<String, SessionSetupInstallmentOptions> getInstallmentOptions() {
        return this.installmentOptions;
    }

    public final boolean getShowInstallmentAmount() {
        return this.showInstallmentAmount;
    }

    public final Boolean getShowRemovePaymentMethodButton() {
        return this.showRemovePaymentMethodButton;
    }

    public int hashCode() {
        Boolean bool = this.enableStoreDetails;
        int iHashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + Boolean.hashCode(this.showInstallmentAmount)) * 31;
        Map<String, SessionSetupInstallmentOptions> map = this.installmentOptions;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool2 = this.showRemovePaymentMethodButton;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "SessionSetupConfiguration(enableStoreDetails=" + this.enableStoreDetails + ", showInstallmentAmount=" + this.showInstallmentAmount + ", installmentOptions=" + this.installmentOptions + ", showRemovePaymentMethodButton=" + this.showRemovePaymentMethodButton + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        Boolean bool = this.enableStoreDetails;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.showInstallmentAmount ? 1 : 0);
        Map<String, SessionSetupInstallmentOptions> map = this.installmentOptions;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, SessionSetupInstallmentOptions> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                SessionSetupInstallmentOptions value = entry.getValue();
                if (value == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    value.writeToParcel(parcel, flags);
                }
            }
        }
        Boolean bool2 = this.showRemovePaymentMethodButton;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ SessionSetupConfiguration(Boolean bool, boolean z11, Map map, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? null : bool2);
    }

    public SessionSetupConfiguration(Boolean bool, boolean z11, Map<String, SessionSetupInstallmentOptions> map, Boolean bool2) {
        this.enableStoreDetails = bool;
        this.showInstallmentAmount = z11;
        this.installmentOptions = map;
        this.showRemovePaymentMethodButton = bool2;
    }
}
