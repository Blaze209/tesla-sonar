package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.WebrtcBuildVersion;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: com.stripe.android.model.k1, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u0001#BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$R\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010$R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010$R\u0014\u00100\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010/R\u0014\u00101\u001a\u00020.8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010/¨\u00063"}, d2 = {"Lcom/stripe/android/model/k1;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "sourceId", "sdkAppId", "sdkReferenceNumber", "sdkTransactionId", "deviceData", "sdkEphemeralPublicKey", "messageVersion", "", "maxTimeout", "returnUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "", "", "c3", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "I", IntegerTokenConverter.CONVERTER_KEY, "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "deviceRenderOptions", "appParams", "j", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class Stripe3ds2AuthParams implements o1, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sourceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdkAppId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdkReferenceNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdkTransactionId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sdkEphemeralPublicKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String messageVersion;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxTimeout;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String returnUrl;
    public static final Parcelable.Creator<Stripe3ds2AuthParams> CREATOR = new b();

    /* JADX INFO: renamed from: com.stripe.android.model.k1$b */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<Stripe3ds2AuthParams> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2AuthParams createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            return new Stripe3ds2AuthParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Stripe3ds2AuthParams[] newArray(int i11) {
            return new Stripe3ds2AuthParams[i11];
        }
    }

    public Stripe3ds2AuthParams(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i11, String str) {
        p013kotlin.jvm.internal.s.k(sourceId, "sourceId");
        p013kotlin.jvm.internal.s.k(sdkAppId, "sdkAppId");
        p013kotlin.jvm.internal.s.k(sdkReferenceNumber, "sdkReferenceNumber");
        p013kotlin.jvm.internal.s.k(sdkTransactionId, "sdkTransactionId");
        p013kotlin.jvm.internal.s.k(deviceData, "deviceData");
        p013kotlin.jvm.internal.s.k(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        p013kotlin.jvm.internal.s.k(messageVersion, "messageVersion");
        this.sourceId = sourceId;
        this.sdkAppId = sdkAppId;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkTransactionId = sdkTransactionId;
        this.deviceData = deviceData;
        this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
        this.messageVersion = messageVersion;
        this.maxTimeout = i11;
        this.returnUrl = str;
    }

    private final JSONObject b() {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new JSONObject().put("sdkInterface", "03").put("sdkUiType", new JSONArray((Collection) p013kotlin.collections.v.p("01", "02", "03", WebrtcBuildVersion.webrtc_commit, "05"))));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        JSONObject jSONObject = new JSONObject();
        if (jn0.s.g(objB)) {
            objB = jSONObject;
        }
        return (JSONObject) objB;
    }

    public final /* synthetic */ JSONObject a() {
        Object objB;
        try {
            jn0.s.Companion companion = jn0.s.INSTANCE;
            objB = jn0.s.b(new JSONObject().put("sdkAppID", this.sdkAppId).put("sdkTransID", this.sdkTransactionId).put("sdkEncData", this.deviceData).put("sdkEphemPubKey", new JSONObject(this.sdkEphemeralPublicKey)).put("sdkMaxTimeout", p013kotlin.text.t.K0(String.valueOf(this.maxTimeout), 2, '0')).put("sdkReferenceNumber", this.sdkReferenceNumber).put("messageVersion", this.messageVersion).put("deviceRenderOptions", b()));
        } catch (Throwable th2) {
            jn0.s.Companion companion2 = jn0.s.INSTANCE;
            objB = jn0.s.b(jn0.t.a(th2));
        }
        JSONObject jSONObject = new JSONObject();
        if (jn0.s.g(objB)) {
            objB = jSONObject;
        }
        return (JSONObject) objB;
    }

    @Override // com.stripe.android.model.o1
    public Map<String, Object> c3() {
        Map mapM = p013kotlin.collections.v0.m(jn0.x.a("source", this.sourceId), jn0.x.a("app", a().toString()));
        String str = this.returnUrl;
        Map mapF = str != null ? p013kotlin.collections.v0.f(jn0.x.a("fallback_return_url", str)) : null;
        if (mapF == null) {
            mapF = p013kotlin.collections.v0.i();
        }
        return p013kotlin.collections.v0.r(mapM, mapF);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stripe3ds2AuthParams)) {
            return false;
        }
        Stripe3ds2AuthParams stripe3ds2AuthParams = (Stripe3ds2AuthParams) other;
        return p013kotlin.jvm.internal.s.f(this.sourceId, stripe3ds2AuthParams.sourceId) && p013kotlin.jvm.internal.s.f(this.sdkAppId, stripe3ds2AuthParams.sdkAppId) && p013kotlin.jvm.internal.s.f(this.sdkReferenceNumber, stripe3ds2AuthParams.sdkReferenceNumber) && p013kotlin.jvm.internal.s.f(this.sdkTransactionId, stripe3ds2AuthParams.sdkTransactionId) && p013kotlin.jvm.internal.s.f(this.deviceData, stripe3ds2AuthParams.deviceData) && p013kotlin.jvm.internal.s.f(this.sdkEphemeralPublicKey, stripe3ds2AuthParams.sdkEphemeralPublicKey) && p013kotlin.jvm.internal.s.f(this.messageVersion, stripe3ds2AuthParams.messageVersion) && this.maxTimeout == stripe3ds2AuthParams.maxTimeout && p013kotlin.jvm.internal.s.f(this.returnUrl, stripe3ds2AuthParams.returnUrl);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.sourceId.hashCode() * 31) + this.sdkAppId.hashCode()) * 31) + this.sdkReferenceNumber.hashCode()) * 31) + this.sdkTransactionId.hashCode()) * 31) + this.deviceData.hashCode()) * 31) + this.sdkEphemeralPublicKey.hashCode()) * 31) + this.messageVersion.hashCode()) * 31) + Integer.hashCode(this.maxTimeout)) * 31;
        String str = this.returnUrl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Stripe3ds2AuthParams(sourceId=" + this.sourceId + ", sdkAppId=" + this.sdkAppId + ", sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkTransactionId=" + this.sdkTransactionId + ", deviceData=" + this.deviceData + ", sdkEphemeralPublicKey=" + this.sdkEphemeralPublicKey + ", messageVersion=" + this.messageVersion + ", maxTimeout=" + this.maxTimeout + ", returnUrl=" + this.returnUrl + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        p013kotlin.jvm.internal.s.k(parcel, "out");
        parcel.writeString(this.sourceId);
        parcel.writeString(this.sdkAppId);
        parcel.writeString(this.sdkReferenceNumber);
        parcel.writeString(this.sdkTransactionId);
        parcel.writeString(this.deviceData);
        parcel.writeString(this.sdkEphemeralPublicKey);
        parcel.writeString(this.messageVersion);
        parcel.writeInt(this.maxTimeout);
        parcel.writeString(this.returnUrl);
    }
}
