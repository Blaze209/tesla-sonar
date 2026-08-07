package com.adyen.checkout.components.core.action;

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010\u000b¨\u0006\""}, d2 = {"Lcom/adyen/checkout/components/core/action/TwintSdkData;", "Lcom/adyen/checkout/components/core/action/SdkData;", "", TwintSdkData.TOKEN, "", TwintSdkData.IS_STORED, "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/adyen/checkout/components/core/action/TwintSdkData;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getToken", "Z", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TwintSdkData extends SdkData {
    private static final String IS_STORED = "isStored";
    private static final String TOKEN = "token";
    private final boolean isStored;
    private final String token;
    public static final Parcelable.Creator<TwintSdkData> CREATOR = new c();
    public static final b.a<TwintSdkData> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/action/TwintSdkData$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/action/TwintSdkData;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/action/TwintSdkData;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/action/TwintSdkData;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<TwintSdkData> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public TwintSdkData b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                String string = jsonObject.getString(TwintSdkData.TOKEN);
                s.j(string, "getString(...)");
                return new TwintSdkData(string, jsonObject.optBoolean(TwintSdkData.IS_STORED));
            } catch (JSONException e11) {
                throw new ModelSerializationException(TwintSdkData.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(TwintSdkData modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(TwintSdkData.TOKEN, modelObject.getToken());
                jSONObject.putOpt(TwintSdkData.IS_STORED, Boolean.valueOf(modelObject.isStored()));
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(TwintSdkData.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<TwintSdkData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TwintSdkData createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new TwintSdkData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TwintSdkData[] newArray(int i11) {
            return new TwintSdkData[i11];
        }
    }

    public TwintSdkData(String token, boolean z11) {
        s.k(token, "token");
        this.token = token;
        this.isStored = z11;
    }

    public static /* synthetic */ TwintSdkData copy$default(TwintSdkData twintSdkData, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = twintSdkData.token;
        }
        if ((i11 & 2) != 0) {
            z11 = twintSdkData.isStored;
        }
        return twintSdkData.copy(str, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsStored() {
        return this.isStored;
    }

    public final TwintSdkData copy(String token, boolean isStored) {
        s.k(token, "token");
        return new TwintSdkData(token, isStored);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TwintSdkData)) {
            return false;
        }
        TwintSdkData twintSdkData = (TwintSdkData) other;
        return s.f(this.token, twintSdkData.token) && this.isStored == twintSdkData.isStored;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + Boolean.hashCode(this.isStored);
    }

    public final boolean isStored() {
        return this.isStored;
    }

    public String toString() {
        return "TwintSdkData(token=" + this.token + ", isStored=" + this.isStored + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.token);
        parcel.writeInt(this.isStored ? 1 : 0);
    }
}
