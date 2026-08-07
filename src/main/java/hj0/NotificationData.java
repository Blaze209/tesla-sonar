package hj0;

import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: hj0.f, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\b\u0018\u0000 02\u00020\u0001:\u0001!B\u009b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\"R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\"R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\"R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\"R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\"R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\"R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lhj0/f;", "", "", "alertId", "", "deliveryConfirmation", "overrideString", "", "priority", "alertArgs", "carName", "txid", "productType", "productSubtype", "productId", "view", "appState", "", "timestamp", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "b", "()Z", "Lorg/json/JSONObject;", "c", "()Lorg/json/JSONObject;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "Z", DateTokenConverter.CONVERTER_KEY, "I", "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "k", "l", "m", "J", "n", "react-native-notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NotificationData {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String alertId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean deliveryConfirmation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String overrideString;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int priority;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String alertArgs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String carName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String txid;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productSubtype;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String view;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: hj0.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"Lhj0/f$a;", "", "<init>", "()V", "", "str", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)I", "timeString", "", "b", "(Ljava/lang/String;)J", "alertArgs", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Bundle;", "data", "", "isInForeground", "Lhj0/f;", "c", "(Landroid/os/Bundle;Ljava/lang/Boolean;)Lhj0/f;", "TAG", "Ljava/lang/String;", "PRIORITY_HIGH", "APP_STATE_FOREGROUND", "APP_STATE_BACKGROUND", "ALERT_ID", "PRODUCT_TYPE", "PRODUCT_SUBTYPE", "PRODUCT_ID", "DELIVERY_CONFIRMATION", "OVERRIDE_STRING", "PRIORITY", "VIEW", "ALERT_ARGS", "ALERT_TIME", "TXID", "APP_STATE", "react-native-notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String a(String alertArgs) {
            if (alertArgs == null) {
                return null;
            }
            try {
                return new JSONArray(alertArgs).getString(0);
            } catch (JSONException e11) {
                Log.e("Notification", "Failed to parse notification args", e11);
                return null;
            }
        }

        private final long b(String timeString) {
            return timeString != null ? Long.parseLong(timeString) : System.currentTimeMillis() / ((long) 1000);
        }

        private final int d(String str) {
            return (str == null || !s.f(str, "high")) ? 0 : 1;
        }

        public final NotificationData c(Bundle data, Boolean isInForeground) {
            String string;
            s.k(data, "data");
            try {
                String string2 = data.getString("alert_args");
                String string3 = data.getString("alert_id");
                boolean z11 = Boolean.parseBoolean(data.getString("delivery_confirmation"));
                String string4 = data.getString("product_type");
                String string5 = data.getString("product_subtype");
                String string6 = data.getString("product_id");
                String string7 = data.getString("view");
                String string8 = data.getString("override_string");
                int iD = d(data.getString("priority"));
                String strA = a(string2);
                long jB = b(data.getString("alert_time"));
                String string9 = data.getString("txid");
                if (isInForeground == null) {
                    string = data.getString("app_state");
                    if (string == null) {
                        string = "unknown";
                    }
                } else {
                    string = isInForeground.booleanValue() ? "active" : AppStateModule.APP_STATE_BACKGROUND;
                }
                return new NotificationData(string3, z11, string8, iD, string2, strA, string9, string4, string5, string6, string7, string, jB);
            } catch (JSONException e11) {
                Log.e("Notification", "Failed to parse local Notification Json", e11);
                return null;
            }
        }

        private Companion() {
        }
    }

    public NotificationData(String str, boolean z11, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String appState, long j11) {
        s.k(appState, "appState");
        this.alertId = str;
        this.deliveryConfirmation = z11;
        this.overrideString = str2;
        this.priority = i11;
        this.alertArgs = str3;
        this.carName = str4;
        this.txid = str5;
        this.productType = str6;
        this.productSubtype = str7;
        this.productId = str8;
        this.view = str9;
        this.appState = appState;
        this.timestamp = j11;
    }

    public static final NotificationData a(Bundle bundle, Boolean bool) {
        return INSTANCE.c(bundle, bool);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDeliveryConfirmation() {
        return this.deliveryConfirmation;
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alert_id", this.alertId);
            jSONObject.put("override_string", this.overrideString);
            jSONObject.put("delivery_confirmation", this.deliveryConfirmation);
            jSONObject.put("product_type", this.productType);
            jSONObject.put("product_id", this.productId);
            jSONObject.put("priority", this.priority);
            jSONObject.put("alert_args", this.alertArgs);
            jSONObject.put("txid", this.txid);
            jSONObject.put("alert_time", this.timestamp);
            jSONObject.put("app_state", this.appState);
            String str = this.view;
            if (str != null) {
                jSONObject.put("view", str);
            }
            String str2 = this.productSubtype;
            if (str2 != null) {
                jSONObject.put("product_subtype", str2);
            }
            return jSONObject;
        } catch (JSONException e11) {
            Log.e("Notification", "Failed to create JSON from notification", e11);
            return null;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationData)) {
            return false;
        }
        NotificationData notificationData = (NotificationData) other;
        return s.f(this.alertId, notificationData.alertId) && this.deliveryConfirmation == notificationData.deliveryConfirmation && s.f(this.overrideString, notificationData.overrideString) && this.priority == notificationData.priority && s.f(this.alertArgs, notificationData.alertArgs) && s.f(this.carName, notificationData.carName) && s.f(this.txid, notificationData.txid) && s.f(this.productType, notificationData.productType) && s.f(this.productSubtype, notificationData.productSubtype) && s.f(this.productId, notificationData.productId) && s.f(this.view, notificationData.view) && s.f(this.appState, notificationData.appState) && this.timestamp == notificationData.timestamp;
    }

    public int hashCode() {
        String str = this.alertId;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.deliveryConfirmation)) * 31;
        String str2 = this.overrideString;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.priority)) * 31;
        String str3 = this.alertArgs;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.carName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.txid;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.productType;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.productSubtype;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.productId;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.view;
        return ((((iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.appState.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "NotificationData(alertId=" + this.alertId + ", deliveryConfirmation=" + this.deliveryConfirmation + ", overrideString=" + this.overrideString + ", priority=" + this.priority + ", alertArgs=" + this.alertArgs + ", carName=" + this.carName + ", txid=" + this.txid + ", productType=" + this.productType + ", productSubtype=" + this.productSubtype + ", productId=" + this.productId + ", view=" + this.view + ", appState=" + this.appState + ", timestamp=" + this.timestamp + ")";
    }
}
