package com.adyen.checkout.components.core.internal.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.Amount;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.internal.data.model.b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0081\b\u0018\u0000 P2\u00020\u0001:\u0001QB£\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u0019JÊ\u0001\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019J\u0010\u0010/\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J \u0010:\u001a\u0002092\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b:\u0010;R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010<\u001a\u0004\b>\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b?\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b@\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\bA\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bB\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\bC\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\bD\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\bE\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\bF\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bH\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010I\u001a\u0004\bJ\u0010&R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010M\u001a\u0004\bN\u0010*R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\bO\u0010\u0019¨\u0006R"}, d2 = {"Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "Lcom/adyen/checkout/core/internal/data/model/b;", "", AnalyticsSetupRequest.VERSION, AnalyticsSetupRequest.CHANNEL, AnalyticsSetupRequest.PLATFORM, AnalyticsSetupRequest.LOCALE, AnalyticsSetupRequest.COMPONENT, "flavor", AnalyticsSetupRequest.DEVICE_BRAND, AnalyticsSetupRequest.DEVICE_MODEL, AnalyticsSetupRequest.REFERRER, AnalyticsSetupRequest.SYSTEM_VERSION, "", AnalyticsSetupRequest.CONTAINER_WIDTH, "", AnalyticsSetupRequest.SCREEN_WIDTH, "", AnalyticsSetupRequest.PAYMENT_METHODS, "Lcom/adyen/checkout/components/core/Amount;", AnalyticsSetupRequest.AMOUNT, AnalyticsSetupRequest.SESSION_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "()Ljava/lang/Long;", "component12", "()Ljava/lang/Integer;", "component13", "()Ljava/util/List;", "component14", "()Lcom/adyen/checkout/components/core/Amount;", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Lcom/adyen/checkout/components/core/Amount;Ljava/lang/String;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getVersion", "getChannel", "getPlatform", "getLocale", "getComponent", "getFlavor", "getDeviceBrand", "getDeviceModel", "getReferrer", "getSystemVersion", "Ljava/lang/Long;", "getContainerWidth", "Ljava/lang/Integer;", "getScreenWidth", "Ljava/util/List;", "getPaymentMethods", "Lcom/adyen/checkout/components/core/Amount;", "getAmount", "getSessionId", "Companion", "b", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsSetupRequest extends b {
    private static final String AMOUNT = "amount";
    private static final String CHANNEL = "channel";
    private static final String COMPONENT = "component";
    private static final String CONTAINER_WIDTH = "containerWidth";
    private static final String DEVICE_BRAND = "deviceBrand";
    private static final String DEVICE_MODEL = "deviceModel";
    private static final String FLAVOR = "flavor";
    private static final String LOCALE = "locale";
    private static final String PAYMENT_METHODS = "paymentMethods";
    private static final String PLATFORM = "platform";
    private static final String REFERRER = "referrer";
    private static final String SCREEN_WIDTH = "screenWidth";
    private static final String SESSION_ID = "sessionId";
    private static final String SYSTEM_VERSION = "systemVersion";
    private static final String VERSION = "version";
    private final Amount amount;
    private final String channel;
    private final String component;
    private final Long containerWidth;
    private final String deviceBrand;
    private final String deviceModel;
    private final String flavor;
    private final String locale;
    private final List<String> paymentMethods;
    private final String platform;
    private final String referrer;
    private final Integer screenWidth;
    private final String sessionId;
    private final String systemVersion;
    private final String version;
    public static final Parcelable.Creator<AnalyticsSetupRequest> CREATOR = new c();
    public static final b.a<AnalyticsSetupRequest> SERIALIZER = new a();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest$a", "Lcom/adyen/checkout/core/internal/data/model/b$a;", "Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "modelObject", "Lorg/json/JSONObject;", DateTokenConverter.CONVERTER_KEY, "(Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;)Lorg/json/JSONObject;", "jsonObject", "c", "(Lorg/json/JSONObject;)Lcom/adyen/checkout/components/core/internal/data/model/AnalyticsSetupRequest;", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a<AnalyticsSetupRequest> {
        a() {
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public AnalyticsSetupRequest b(JSONObject jsonObject) {
            s.k(jsonObject, "jsonObject");
            try {
                return new AnalyticsSetupRequest(com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsSetupRequest.VERSION), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsSetupRequest.CHANNEL), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsSetupRequest.PLATFORM), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsSetupRequest.LOCALE), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsSetupRequest.COMPONENT), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, "flavor"), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsSetupRequest.DEVICE_BRAND), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsSetupRequest.DEVICE_MODEL), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsSetupRequest.REFERRER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsSetupRequest.SYSTEM_VERSION), com.adyen.checkout.core.internal.data.model.a.c(jsonObject, AnalyticsSetupRequest.CONTAINER_WIDTH), com.adyen.checkout.core.internal.data.model.a.b(jsonObject, AnalyticsSetupRequest.SCREEN_WIDTH), com.adyen.checkout.core.internal.data.model.a.g(jsonObject, AnalyticsSetupRequest.PAYMENT_METHODS), (Amount) com.adyen.checkout.core.internal.data.model.c.a(jsonObject.optJSONObject(AnalyticsSetupRequest.AMOUNT), Amount.SERIALIZER), com.adyen.checkout.core.internal.data.model.a.e(jsonObject, AnalyticsSetupRequest.SESSION_ID));
            } catch (JSONException e11) {
                throw new ModelSerializationException(AnalyticsSetupRequest.class, e11);
            }
        }

        @Override // com.adyen.checkout.core.internal.data.model.b.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public JSONObject a(AnalyticsSetupRequest modelObject) {
            s.k(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(AnalyticsSetupRequest.VERSION, modelObject.getVersion());
                jSONObject.putOpt(AnalyticsSetupRequest.CHANNEL, modelObject.getChannel());
                jSONObject.putOpt(AnalyticsSetupRequest.PLATFORM, modelObject.getPlatform());
                jSONObject.putOpt(AnalyticsSetupRequest.LOCALE, modelObject.getLocale());
                jSONObject.putOpt(AnalyticsSetupRequest.COMPONENT, modelObject.getComponent());
                jSONObject.putOpt("flavor", modelObject.getFlavor());
                jSONObject.putOpt(AnalyticsSetupRequest.DEVICE_BRAND, modelObject.getDeviceBrand());
                jSONObject.putOpt(AnalyticsSetupRequest.DEVICE_MODEL, modelObject.getDeviceModel());
                jSONObject.putOpt(AnalyticsSetupRequest.REFERRER, modelObject.getReferrer());
                jSONObject.putOpt(AnalyticsSetupRequest.SYSTEM_VERSION, modelObject.getSystemVersion());
                jSONObject.putOpt(AnalyticsSetupRequest.CONTAINER_WIDTH, modelObject.getContainerWidth());
                jSONObject.putOpt(AnalyticsSetupRequest.SCREEN_WIDTH, modelObject.getScreenWidth());
                jSONObject.putOpt(AnalyticsSetupRequest.PAYMENT_METHODS, oe.a.d(modelObject.getPaymentMethods()));
                jSONObject.putOpt(AnalyticsSetupRequest.AMOUNT, com.adyen.checkout.core.internal.data.model.c.c(modelObject.getAmount(), Amount.SERIALIZER));
                jSONObject.putOpt(AnalyticsSetupRequest.SESSION_ID, modelObject.getSessionId());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(AnalyticsSetupRequest.class, e11);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements Parcelable.Creator<AnalyticsSetupRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AnalyticsSetupRequest createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new AnalyticsSetupRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.createStringArrayList(), parcel.readInt() != 0 ? Amount.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AnalyticsSetupRequest[] newArray(int i11) {
            return new AnalyticsSetupRequest[i11];
        }
    }

    public AnalyticsSetupRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Long l11, Integer num, List<String> list, Amount amount, String str11) {
        this.version = str;
        this.channel = str2;
        this.platform = str3;
        this.locale = str4;
        this.component = str5;
        this.flavor = str6;
        this.deviceBrand = str7;
        this.deviceModel = str8;
        this.referrer = str9;
        this.systemVersion = str10;
        this.containerWidth = l11;
        this.screenWidth = num;
        this.paymentMethods = list;
        this.amount = amount;
        this.sessionId = str11;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSystemVersion() {
        return this.systemVersion;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getContainerWidth() {
        return this.containerWidth;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getScreenWidth() {
        return this.screenWidth;
    }

    public final List<String> component13() {
        return this.paymentMethods;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Amount getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getComponent() {
        return this.component;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFlavor() {
        return this.flavor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getReferrer() {
        return this.referrer;
    }

    public final AnalyticsSetupRequest copy(String version, String channel, String platform, String locale, String component, String flavor, String deviceBrand, String deviceModel, String referrer, String systemVersion, Long containerWidth, Integer screenWidth, List<String> paymentMethods, Amount amount, String sessionId) {
        return new AnalyticsSetupRequest(version, channel, platform, locale, component, flavor, deviceBrand, deviceModel, referrer, systemVersion, containerWidth, screenWidth, paymentMethods, amount, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsSetupRequest)) {
            return false;
        }
        AnalyticsSetupRequest analyticsSetupRequest = (AnalyticsSetupRequest) other;
        return s.f(this.version, analyticsSetupRequest.version) && s.f(this.channel, analyticsSetupRequest.channel) && s.f(this.platform, analyticsSetupRequest.platform) && s.f(this.locale, analyticsSetupRequest.locale) && s.f(this.component, analyticsSetupRequest.component) && s.f(this.flavor, analyticsSetupRequest.flavor) && s.f(this.deviceBrand, analyticsSetupRequest.deviceBrand) && s.f(this.deviceModel, analyticsSetupRequest.deviceModel) && s.f(this.referrer, analyticsSetupRequest.referrer) && s.f(this.systemVersion, analyticsSetupRequest.systemVersion) && s.f(this.containerWidth, analyticsSetupRequest.containerWidth) && s.f(this.screenWidth, analyticsSetupRequest.screenWidth) && s.f(this.paymentMethods, analyticsSetupRequest.paymentMethods) && s.f(this.amount, analyticsSetupRequest.amount) && s.f(this.sessionId, analyticsSetupRequest.sessionId);
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getComponent() {
        return this.component;
    }

    public final Long getContainerWidth() {
        return this.containerWidth;
    }

    public final String getDeviceBrand() {
        return this.deviceBrand;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getFlavor() {
        return this.flavor;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final List<String> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getReferrer() {
        return this.referrer;
    }

    public final Integer getScreenWidth() {
        return this.screenWidth;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getSystemVersion() {
        return this.systemVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.channel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.platform;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.locale;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.component;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.flavor;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.deviceBrand;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deviceModel;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.referrer;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.systemVersion;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l11 = this.containerWidth;
        int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.screenWidth;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.paymentMethods;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Amount amount = this.amount;
        int iHashCode14 = (iHashCode13 + (amount == null ? 0 : amount.hashCode())) * 31;
        String str11 = this.sessionId;
        return iHashCode14 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        return "AnalyticsSetupRequest(version=" + this.version + ", channel=" + this.channel + ", platform=" + this.platform + ", locale=" + this.locale + ", component=" + this.component + ", flavor=" + this.flavor + ", deviceBrand=" + this.deviceBrand + ", deviceModel=" + this.deviceModel + ", referrer=" + this.referrer + ", systemVersion=" + this.systemVersion + ", containerWidth=" + this.containerWidth + ", screenWidth=" + this.screenWidth + ", paymentMethods=" + this.paymentMethods + ", amount=" + this.amount + ", sessionId=" + this.sessionId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        s.k(parcel, "out");
        parcel.writeString(this.version);
        parcel.writeString(this.channel);
        parcel.writeString(this.platform);
        parcel.writeString(this.locale);
        parcel.writeString(this.component);
        parcel.writeString(this.flavor);
        parcel.writeString(this.deviceBrand);
        parcel.writeString(this.deviceModel);
        parcel.writeString(this.referrer);
        parcel.writeString(this.systemVersion);
        Long l11 = this.containerWidth;
        if (l11 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l11.longValue());
        }
        Integer num = this.screenWidth;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeStringList(this.paymentMethods);
        Amount amount = this.amount;
        if (amount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            amount.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.sessionId);
    }
}
