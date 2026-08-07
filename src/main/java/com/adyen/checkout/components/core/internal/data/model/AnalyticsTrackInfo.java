package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0001AB\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0014J\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!J\u009e\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020%HÖ\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b\n\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b:\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b;\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b<\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b=\u0010\u0014R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010!¨\u0006B"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", AnalyticsTrackInfo.ID, "", AnalyticsTrackInfo.TIMESTAMP, AnalyticsTrackInfo.COMPONENT, "type", AnalyticsTrackInfo.TARGET, "", AnalyticsTrackInfo.IS_STORED_PAYMENT_METHOD, AnalyticsTrackInfo.BRAND, "issuer", AnalyticsTrackInfo.VALIDATION_ERROR_CODE, AnalyticsTrackInfo.VALIDATION_ERROR_MESSAGE, "", AnalyticsTrackInfo.CONFIG_DATA, "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "component9", "component10", "component11", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Long;", "getTimestamp", "getComponent", "getType", "getTarget", "Ljava/lang/Boolean;", "getBrand", "getIssuer", "getValidationErrorCode", "getValidationErrorMessage", "Ljava/util/Map;", "getConfigData", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsTrackInfo extends b {
    private static final String BRAND = "brand";
    private static final String COMPONENT = "component";
    private static final String CONFIG_DATA = "configData";
    private static final String ID = "id";
    private static final String ISSUER = "issuer";
    private static final String IS_STORED_PAYMENT_METHOD = "isStoredPaymentMethod";
    private static final String TARGET = "target";
    private static final String TIMESTAMP = "timestamp";
    private static final String TYPE = "type";
    private static final String VALIDATION_ERROR_CODE = "validationErrorCode";
    private static final String VALIDATION_ERROR_MESSAGE = "validationErrorMessage";
    private final String brand;
    private final String component;
    private final Map<String, String> configData;
    private final String id;
    private final Boolean isStoredPaymentMethod;
    private final String issuer;
    private final String target;
    private final Long timestamp;
    private final String type;
    private final String validationErrorCode;
    private final String validationErrorMessage;
    public static final Parcelable.Creator<AnalyticsTrackInfo> CREATOR = new c();
    public static final b.a<AnalyticsTrackInfo> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackInfo;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<AnalyticsTrackInfo> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AnalyticsTrackInfo b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String string = jsonObject.getString(AnalyticsTrackInfo.ID);
                s.j(string, "getString(...)");
                return new AnalyticsTrackInfo(string, com.adyen.checkout.core.internal.data.model.a.c(jsonObject, AnalyticsTrackInfo.TIMESTAMP), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackInfo.COMPONENT), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackInfo.TARGET), com.adyen.checkout.core.internal.data.model.a.a(jsonObject, AnalyticsTrackInfo.IS_STORED_PAYMENT_METHOD), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackInfo.BRAND), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "issuer"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackInfo.VALIDATION_ERROR_CODE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackInfo.VALIDATION_ERROR_MESSAGE), com.adyen.checkout.core.internal.data.model.a.d(jsonObject, AnalyticsTrackInfo.CONFIG_DATA));
            } catch (JSONException e11) {
                throw new ModelSerializationException(AnalyticsTrackInfo.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(AnalyticsTrackInfo modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AnalyticsTrackInfo.ID, modelObject.getId());
                jSONObject.putOpt(AnalyticsTrackInfo.TIMESTAMP, modelObject.getTimestamp());
                jSONObject.putOpt(AnalyticsTrackInfo.COMPONENT, modelObject.getComponent());
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(AnalyticsTrackInfo.TARGET, modelObject.getTarget());
                jSONObject.putOpt(AnalyticsTrackInfo.IS_STORED_PAYMENT_METHOD, modelObject.isStoredPaymentMethod());
                jSONObject.putOpt(AnalyticsTrackInfo.BRAND, modelObject.getBrand());
                jSONObject.putOpt("issuer", modelObject.getIssuer());
                jSONObject.putOpt(AnalyticsTrackInfo.VALIDATION_ERROR_CODE, modelObject.getValidationErrorCode());
                jSONObject.putOpt(AnalyticsTrackInfo.VALIDATION_ERROR_MESSAGE, modelObject.getValidationErrorMessage());
                Map<String, String> configData = modelObject.getConfigData();
                jSONObject.putOpt(AnalyticsTrackInfo.CONFIG_DATA, configData != null ? new JSONObject(configData) : null);
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(AnalyticsTrackInfo.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<AnalyticsTrackInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnalyticsTrackInfo createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            s.k(parcel, "parcel");
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AnalyticsTrackInfo(string, lValueOf, string2, string3, string4, boolValueOf, string5, string6, string7, string8, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AnalyticsTrackInfo[] newArray(int i11) {
            return new AnalyticsTrackInfo[i11];
        }
    }

    public AnalyticsTrackInfo(String id2, Long l11, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, Map<String, String> map) {
        s.k(id2, "id");
        this.id = id2;
        this.timestamp = l11;
        this.component = str;
        this.type = str2;
        this.target = str3;
        this.isStoredPaymentMethod = bool;
        this.brand = str4;
        this.issuer = str5;
        this.validationErrorCode = str6;
        this.validationErrorMessage = str7;
        this.configData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsTrackInfo copy$default(AnalyticsTrackInfo analyticsTrackInfo, String str, Long l11, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsTrackInfo.id;
        }
        if ((i11 & 2) != 0) {
            l11 = analyticsTrackInfo.timestamp;
        }
        if ((i11 & 4) != 0) {
            str2 = analyticsTrackInfo.component;
        }
        if ((i11 & 8) != 0) {
            str3 = analyticsTrackInfo.type;
        }
        if ((i11 & 16) != 0) {
            str4 = analyticsTrackInfo.target;
        }
        if ((i11 & 32) != 0) {
            bool = analyticsTrackInfo.isStoredPaymentMethod;
        }
        if ((i11 & 64) != 0) {
            str5 = analyticsTrackInfo.brand;
        }
        if ((i11 & 128) != 0) {
            str6 = analyticsTrackInfo.issuer;
        }
        if ((i11 & 256) != 0) {
            str7 = analyticsTrackInfo.validationErrorCode;
        }
        if ((i11 & 512) != 0) {
            str8 = analyticsTrackInfo.validationErrorMessage;
        }
        if ((i11 & 1024) != 0) {
            map = analyticsTrackInfo.configData;
        }
        String str9 = str8;
        Map map2 = map;
        String str10 = str6;
        String str11 = str7;
        Boolean bool2 = bool;
        String str12 = str5;
        String str13 = str4;
        String str14 = str2;
        return analyticsTrackInfo.copy(str, l11, str14, str3, str13, bool2, str12, str10, str11, str9, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getValidationErrorMessage() {
        return this.validationErrorMessage;
    }

    public final Map<String, String> component11() {
        return this.configData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getComponent() {
        return this.component;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsStoredPaymentMethod() {
        return this.isStoredPaymentMethod;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getValidationErrorCode() {
        return this.validationErrorCode;
    }

    public final AnalyticsTrackInfo copy(String id2, Long timestamp, String component, String type, String target, Boolean isStoredPaymentMethod, String brand, String issuer, String validationErrorCode, String validationErrorMessage, Map<String, String> configData) {
        s.k(id2, "id");
        return new AnalyticsTrackInfo(id2, timestamp, component, type, target, isStoredPaymentMethod, brand, issuer, validationErrorCode, validationErrorMessage, configData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsTrackInfo)) {
            return false;
        }
        AnalyticsTrackInfo analyticsTrackInfo = (AnalyticsTrackInfo) other;
        return s.f(this.id, analyticsTrackInfo.id) && s.f(this.timestamp, analyticsTrackInfo.timestamp) && s.f(this.component, analyticsTrackInfo.component) && s.f(this.type, analyticsTrackInfo.type) && s.f(this.target, analyticsTrackInfo.target) && s.f(this.isStoredPaymentMethod, analyticsTrackInfo.isStoredPaymentMethod) && s.f(this.brand, analyticsTrackInfo.brand) && s.f(this.issuer, analyticsTrackInfo.issuer) && s.f(this.validationErrorCode, analyticsTrackInfo.validationErrorCode) && s.f(this.validationErrorMessage, analyticsTrackInfo.validationErrorMessage) && s.f(this.configData, analyticsTrackInfo.configData);
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getComponent() {
        return this.component;
    }

    public final Map<String, String> getConfigData() {
        return this.configData;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getTarget() {
        return this.target;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValidationErrorCode() {
        return this.validationErrorCode;
    }

    public final String getValidationErrorMessage() {
        return this.validationErrorMessage;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Long l11 = this.timestamp;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.component;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.target;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isStoredPaymentMethod;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.brand;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.issuer;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.validationErrorCode;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.validationErrorMessage;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map<String, String> map = this.configData;
        return iHashCode10 + (map != null ? map.hashCode() : 0);
    }

    public final Boolean isStoredPaymentMethod() {
        return this.isStoredPaymentMethod;
    }

    public String toString() {
        return "AnalyticsTrackInfo(id=" + this.id + ", timestamp=" + this.timestamp + ", component=" + this.component + ", type=" + this.type + ", target=" + this.target + ", isStoredPaymentMethod=" + this.isStoredPaymentMethod + ", brand=" + this.brand + ", issuer=" + this.issuer + ", validationErrorCode=" + this.validationErrorCode + ", validationErrorMessage=" + this.validationErrorMessage + ", configData=" + this.configData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.id);
        Long l11 = this.timestamp;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        parcel.writeString(this.component);
        parcel.writeString(this.type);
        parcel.writeString(this.target);
        Boolean bool = this.isStoredPaymentMethod;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.brand);
        parcel.writeString(this.issuer);
        parcel.writeString(this.validationErrorCode);
        parcel.writeString(this.validationErrorMessage);
        Map<String, String> map = this.configData;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }
}
