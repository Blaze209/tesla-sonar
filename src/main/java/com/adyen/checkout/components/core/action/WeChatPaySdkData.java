package com.adyen.checkout.components.core.action;

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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 62\u00020\u0001:\u00017B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010)R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010&\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010)R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010&\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010)R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010&\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010)R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010&\u001a\u0004\b2\u0010\r\"\u0004\b3\u0010)R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010&\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010)¨\u00068"}, d2 = {"Lcom/adyen/checkout/components/core/action/WeChatPaySdkData;", "Lcom/adyen/checkout/components/core/action/SdkData;", "", WeChatPaySdkData.APP_ID, WeChatPaySdkData.NONCE_STR, WeChatPaySdkData.PACKAGE_VALUE, WeChatPaySdkData.PARTNER_ID, WeChatPaySdkData.PREPAY_ID, WeChatPaySdkData.SIGN, WeChatPaySdkData.TIMESTAMP, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/adyen/checkout/components/core/action/WeChatPaySdkData;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAppid", "setAppid", "(Ljava/lang/String;)V", "getNoncestr", "setNoncestr", "getPackageValue", "setPackageValue", "getPartnerid", "setPartnerid", "getPrepayid", "setPrepayid", "getSign", "setSign", "getTimestamp", "setTimestamp", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class WeChatPaySdkData extends SdkData {
    private static final String APP_ID = "appid";
    private static final String NONCE_STR = "noncestr";
    private static final String PACKAGE_VALUE = "packageValue";
    private static final String PARTNER_ID = "partnerid";
    private static final String PREPAY_ID = "prepayid";
    private static final String SIGN = "sign";
    private static final String TIMESTAMP = "timestamp";
    private String appid;
    private String noncestr;
    private String packageValue;
    private String partnerid;
    private String prepayid;
    private String sign;
    private String timestamp;
    public static final Parcelable.Creator<WeChatPaySdkData> CREATOR = new c();
    public static final b.a<WeChatPaySdkData> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/action/WeChatPaySdkData$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/action/WeChatPaySdkData;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/action/WeChatPaySdkData;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/action/WeChatPaySdkData;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<WeChatPaySdkData> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public WeChatPaySdkData b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            return new WeChatPaySdkData(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, WeChatPaySdkData.APP_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, WeChatPaySdkData.NONCE_STR), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, WeChatPaySdkData.PACKAGE_VALUE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, WeChatPaySdkData.PARTNER_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, WeChatPaySdkData.PREPAY_ID), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, WeChatPaySdkData.SIGN), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, WeChatPaySdkData.TIMESTAMP));
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(WeChatPaySdkData modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(WeChatPaySdkData.APP_ID, modelObject.getAppid());
                jSONObject.putOpt(WeChatPaySdkData.NONCE_STR, modelObject.getNoncestr());
                jSONObject.putOpt(WeChatPaySdkData.PACKAGE_VALUE, modelObject.getPackageValue());
                jSONObject.putOpt(WeChatPaySdkData.PARTNER_ID, modelObject.getPartnerid());
                jSONObject.putOpt(WeChatPaySdkData.PREPAY_ID, modelObject.getPrepayid());
                jSONObject.putOpt(WeChatPaySdkData.SIGN, modelObject.getSign());
                jSONObject.putOpt(WeChatPaySdkData.TIMESTAMP, modelObject.getTimestamp());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(WeChatPaySdkData.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<WeChatPaySdkData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeChatPaySdkData createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new WeChatPaySdkData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WeChatPaySdkData[] newArray(int i11) {
            return new WeChatPaySdkData[i11];
        }
    }

    public WeChatPaySdkData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ WeChatPaySdkData copy$default(WeChatPaySdkData weChatPaySdkData, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = weChatPaySdkData.appid;
        }
        if ((i11 & 2) != 0) {
            str2 = weChatPaySdkData.noncestr;
        }
        if ((i11 & 4) != 0) {
            str3 = weChatPaySdkData.packageValue;
        }
        if ((i11 & 8) != 0) {
            str4 = weChatPaySdkData.partnerid;
        }
        if ((i11 & 16) != 0) {
            str5 = weChatPaySdkData.prepayid;
        }
        if ((i11 & 32) != 0) {
            str6 = weChatPaySdkData.sign;
        }
        if ((i11 & 64) != 0) {
            str7 = weChatPaySdkData.timestamp;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return weChatPaySdkData.copy(str, str2, str11, str4, str10, str8, str9);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppid() {
        return this.appid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNoncestr() {
        return this.noncestr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPackageValue() {
        return this.packageValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPartnerid() {
        return this.partnerid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrepayid() {
        return this.prepayid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final WeChatPaySdkData copy(String appid, String noncestr, String packageValue, String partnerid, String prepayid, String sign, String timestamp) {
        return new WeChatPaySdkData(appid, noncestr, packageValue, partnerid, prepayid, sign, timestamp);
    }

    @Override // com.adyen.checkout.core.internal.data.model.b, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeChatPaySdkData)) {
            return false;
        }
        WeChatPaySdkData weChatPaySdkData = (WeChatPaySdkData) other;
        return s.f(this.appid, weChatPaySdkData.appid) && s.f(this.noncestr, weChatPaySdkData.noncestr) && s.f(this.packageValue, weChatPaySdkData.packageValue) && s.f(this.partnerid, weChatPaySdkData.partnerid) && s.f(this.prepayid, weChatPaySdkData.prepayid) && s.f(this.sign, weChatPaySdkData.sign) && s.f(this.timestamp, weChatPaySdkData.timestamp);
    }

    public final String getAppid() {
        return this.appid;
    }

    public final String getNoncestr() {
        return this.noncestr;
    }

    public final String getPackageValue() {
        return this.packageValue;
    }

    public final String getPartnerid() {
        return this.partnerid;
    }

    public final String getPrepayid() {
        return this.prepayid;
    }

    public final String getSign() {
        return this.sign;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.appid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.noncestr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.packageValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.partnerid;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.prepayid;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sign;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.timestamp;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAppid(String str) {
        this.appid = str;
    }

    public final void setNoncestr(String str) {
        this.noncestr = str;
    }

    public final void setPackageValue(String str) {
        this.packageValue = str;
    }

    public final void setPartnerid(String str) {
        this.partnerid = str;
    }

    public final void setPrepayid(String str) {
        this.prepayid = str;
    }

    public final void setSign(String str) {
        this.sign = str;
    }

    public final void setTimestamp(String str) {
        this.timestamp = str;
    }

    public String toString() {
        return "WeChatPaySdkData(appid=" + this.appid + ", noncestr=" + this.noncestr + ", packageValue=" + this.packageValue + ", partnerid=" + this.partnerid + ", prepayid=" + this.prepayid + ", sign=" + this.sign + ", timestamp=" + this.timestamp + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.appid);
        parcel.writeString(this.noncestr);
        parcel.writeString(this.packageValue);
        parcel.writeString(this.partnerid);
        parcel.writeString(this.prepayid);
        parcel.writeString(this.sign);
        parcel.writeString(this.timestamp);
    }

    public /* synthetic */ WeChatPaySdkData(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7);
    }

    public WeChatPaySdkData(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.appid = str;
        this.noncestr = str2;
        this.packageValue = str3;
        this.partnerid = str4;
        this.prepayid = str5;
        this.sign = str6;
        this.timestamp = str7;
    }
}
