package com.adyen.checkout.components.core.internal.data.model;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u0000 32\u00020\u0001:\u00014BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJ\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJn\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u000fR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b1\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b2\u0010\u000f¨\u00065"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", AnalyticsTrackLog.ID, "", AnalyticsTrackLog.TIMESTAMP, AnalyticsTrackLog.COMPONENT, "type", AnalyticsTrackLog.SUBTYPE, AnalyticsTrackLog.RESULT, AnalyticsTrackLog.TARGET, AnalyticsTrackLog.MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Long;", "getTimestamp", "getComponent", "getType", "getSubType", "getResult", "getTarget", "getMessage", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsTrackLog extends b {
    private static final String COMPONENT = "component";
    private static final String ID = "id";
    private static final String MESSAGE = "message";
    private static final String RESULT = "result";
    private static final String SUBTYPE = "subType";
    private static final String TARGET = "target";
    private static final String TIMESTAMP = "timestamp";
    private static final String TYPE = "type";
    private final String component;
    private final String id;
    private final String message;
    private final String result;
    private final String subType;
    private final String target;
    private final Long timestamp;
    private final String type;
    public static final Parcelable.Creator<AnalyticsTrackLog> CREATOR = new c();
    public static final b.a<AnalyticsTrackLog> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsTrackLog;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<AnalyticsTrackLog> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AnalyticsTrackLog b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String string = jsonObject.getString(AnalyticsTrackLog.ID);
                s.j(string, "getString(...)");
                return new AnalyticsTrackLog(string, com.adyen.checkout.core.internal.data.model.a.c(jsonObject, AnalyticsTrackLog.TIMESTAMP), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackLog.COMPONENT), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "type"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackLog.SUBTYPE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackLog.RESULT), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackLog.TARGET), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsTrackLog.MESSAGE));
            } catch (JSONException e11) {
                throw new ModelSerializationException(AnalyticsTrackLog.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(AnalyticsTrackLog modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AnalyticsTrackLog.ID, modelObject.getId());
                jSONObject.putOpt(AnalyticsTrackLog.TIMESTAMP, modelObject.getTimestamp());
                jSONObject.putOpt(AnalyticsTrackLog.COMPONENT, modelObject.getComponent());
                jSONObject.putOpt("type", modelObject.getType());
                jSONObject.putOpt(AnalyticsTrackLog.SUBTYPE, modelObject.getSubType());
                jSONObject.putOpt(AnalyticsTrackLog.RESULT, modelObject.getResult());
                jSONObject.putOpt(AnalyticsTrackLog.TARGET, modelObject.getTarget());
                jSONObject.putOpt(AnalyticsTrackLog.MESSAGE, modelObject.getMessage());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(AnalyticsTrackLog.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<AnalyticsTrackLog> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnalyticsTrackLog createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new AnalyticsTrackLog(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AnalyticsTrackLog[] newArray(int i11) {
            return new AnalyticsTrackLog[i11];
        }
    }

    public AnalyticsTrackLog(String id2, Long l11, String str, String str2, String str3, String str4, String str5, String str6) {
        s.k(id2, "id");
        this.id = id2;
        this.timestamp = l11;
        this.component = str;
        this.type = str2;
        this.subType = str3;
        this.result = str4;
        this.target = str5;
        this.message = str6;
    }

    public static /* synthetic */ AnalyticsTrackLog copy$default(AnalyticsTrackLog analyticsTrackLog, String str, Long l11, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = analyticsTrackLog.id;
        }
        if ((i11 & 2) != 0) {
            l11 = analyticsTrackLog.timestamp;
        }
        if ((i11 & 4) != 0) {
            str2 = analyticsTrackLog.component;
        }
        if ((i11 & 8) != 0) {
            str3 = analyticsTrackLog.type;
        }
        if ((i11 & 16) != 0) {
            str4 = analyticsTrackLog.subType;
        }
        if ((i11 & 32) != 0) {
            str5 = analyticsTrackLog.result;
        }
        if ((i11 & 64) != 0) {
            str6 = analyticsTrackLog.target;
        }
        if ((i11 & 128) != 0) {
            str7 = analyticsTrackLog.message;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return analyticsTrackLog.copy(str, l11, str2, str3, str10, str11, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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
    public final String getSubType() {
        return this.subType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final AnalyticsTrackLog copy(String id2, Long timestamp, String component, String type, String subType, String result, String target, String message) {
        s.k(id2, "id");
        return new AnalyticsTrackLog(id2, timestamp, component, type, subType, result, target, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsTrackLog)) {
            return false;
        }
        AnalyticsTrackLog analyticsTrackLog = (AnalyticsTrackLog) other;
        return s.f(this.id, analyticsTrackLog.id) && s.f(this.timestamp, analyticsTrackLog.timestamp) && s.f(this.component, analyticsTrackLog.component) && s.f(this.type, analyticsTrackLog.type) && s.f(this.subType, analyticsTrackLog.subType) && s.f(this.result, analyticsTrackLog.result) && s.f(this.target, analyticsTrackLog.target) && s.f(this.message, analyticsTrackLog.message);
    }

    public final String getComponent() {
        return this.component;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getSubType() {
        return this.subType;
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

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Long l11 = this.timestamp;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.component;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subType;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.result;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.target;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.message;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "AnalyticsTrackLog(id=" + this.id + ", timestamp=" + this.timestamp + ", component=" + this.component + ", type=" + this.type + ", subType=" + this.subType + ", result=" + this.result + ", target=" + this.target + ", message=" + this.message + ")";
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
        parcel.writeString(this.subType);
        parcel.writeString(this.result);
        parcel.writeString(this.target);
        parcel.writeString(this.message);
    }
}
