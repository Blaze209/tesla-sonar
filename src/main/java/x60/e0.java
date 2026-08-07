package x60;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.s0;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\t\u0007\n\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lx60/e0;", "Lu30/a;", "Lcom/stripe/android/model/l1;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/l1;", "a", "c", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e0 implements u30.a<Stripe3ds2AuthResult> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f122832b = new b(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/e0$a;", "Lu30/a;", "Lcom/stripe/android/model/l1$a;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/l1$a;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements u30.a<Stripe3ds2AuthResult.Ares> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final C2649a f122833b = new C2649a(null);

        /* JADX INFO: renamed from: x60.e0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"Lx60/e0$a$a;", "", "<init>", "()V", "", "FIELD_ACS_CHALLENGE_MANDATED", "Ljava/lang/String;", "FIELD_ACS_SIGNED_CONTENT", "FIELD_ACS_TRANS_ID", "FIELD_ACS_URL", "FIELD_AUTHENTICATION_TYPE", "FIELD_CARDHOLDER_INFO", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_THREE_DS_SERVER_TRANS_ID", "FIELD_TRANS_STATUS", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class C2649a {
            public /* synthetic */ C2649a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2649a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Stripe3ds2AuthResult.Ares a(JSONObject json) throws JSONException {
            p013kotlin.jvm.internal.s.k(json, "json");
            String strL = t30.e.l(json, "threeDSServerTransID");
            String strL2 = t30.e.l(json, "acsChallengeMandated");
            String strL3 = t30.e.l(json, "acsSignedContent");
            String string = json.getString("acsTransID");
            String strL4 = t30.e.l(json, "acsURL");
            String strL5 = t30.e.l(json, "authenticationType");
            String strL6 = t30.e.l(json, "cardholderInfo");
            String string2 = json.getString("messageType");
            String string3 = json.getString("messageVersion");
            String strL7 = t30.e.l(json, "sdkTransID");
            String strL8 = t30.e.l(json, "transStatus");
            JSONArray jSONArrayOptJSONArray = json.optJSONArray("messageExtension");
            return new Stripe3ds2AuthResult.Ares(strL, strL2, strL3, string, strL4, strL5, strL6, jSONArrayOptJSONArray != null ? new c().c(jSONArrayOptJSONArray) : null, string2, string3, strL7, strL8);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lx60/e0$b;", "", "<init>", "()V", "", "FIELD_ARES", "Ljava/lang/String;", "FIELD_CREATED", "FIELD_CREQ", "FIELD_ERROR", "FIELD_FALLBACK_REDIRECT_URL", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_SOURCE", "FIELD_STATE", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lx60/e0$c;", "Lu30/a;", "Lcom/stripe/android/model/l1$c;", "<init>", "()V", "Lorg/json/JSONArray;", "jsonArray", "", "c", "(Lorg/json/JSONArray;)Ljava/util/List;", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/l1$c;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements u30.a<Stripe3ds2AuthResult.MessageExtension> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122834b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lx60/e0$c$a;", "", "<init>", "()V", "", "FIELD_CRITICALITY_INDICATOR", "Ljava/lang/String;", "FIELD_DATA", "FIELD_ID", "FIELD_NAME", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Stripe3ds2AuthResult.MessageExtension a(JSONObject json) {
            Map mapI;
            p013kotlin.jvm.internal.s.k(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                JSONArray jSONArrayNames = jSONObjectOptJSONObject.names();
                if (jSONArrayNames == null) {
                    jSONArrayNames = new JSONArray();
                }
                bo0.j jVarW = bo0.n.w(0, jSONArrayNames.length());
                ArrayList<String> arrayList = new ArrayList(p013kotlin.collections.v.y(jVarW, 10));
                Iterator<Integer> it = jVarW.iterator();
                while (it.hasNext()) {
                    arrayList.add(jSONArrayNames.getString(((s0) it).nextInt()));
                }
                ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
                for (String str : arrayList) {
                    arrayList2.add(v0.f(jn0.x.a(str, jSONObjectOptJSONObject.getString(str))));
                }
                mapI = v0.i();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    mapI = v0.r(mapI, (Map) it2.next());
                }
            } else {
                mapI = v0.i();
            }
            return new Stripe3ds2AuthResult.MessageExtension(t30.e.l(json, "name"), json.optBoolean("criticalityIndicator"), t30.e.l(json, "id"), v0.A(mapI));
        }

        public final List<Stripe3ds2AuthResult.MessageExtension> c(JSONArray jsonArray) {
            p013kotlin.jvm.internal.s.k(jsonArray, "jsonArray");
            bo0.j jVarW = bo0.n.w(0, jsonArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(((s0) it).nextInt());
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(jSONObjectOptJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a((JSONObject) it2.next()));
            }
            return arrayList2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lx60/e0$d;", "Lu30/a;", "Lcom/stripe/android/model/l1$d;", "<init>", "()V", "Lorg/json/JSONObject;", "json", "b", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/l1$d;", "a", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements u30.a<Stripe3ds2AuthResult.ThreeDS2Error> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final a f122835b = new a(null);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lx60/e0$d$a;", "", "<init>", "()V", "", "FIELD_ACS_TRANS_ID", "Ljava/lang/String;", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "FIELD_THREE_DS_SERVER_TRANS_ID", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        @Override // u30.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Stripe3ds2AuthResult.ThreeDS2Error a(JSONObject json) {
            p013kotlin.jvm.internal.s.k(json, "json");
            return new Stripe3ds2AuthResult.ThreeDS2Error(json.getString("threeDSServerTransID"), t30.e.l(json, "acsTransID"), t30.e.l(json, "dsTransID"), json.getString("errorCode"), json.getString("errorComponent"), json.getString("errorDescription"), json.getString("errorDetail"), t30.e.l(json, "errorMessageType"), json.getString("messageType"), json.getString("messageVersion"), t30.e.l(json, "sdkTransID"));
        }
    }

    @Override // u30.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Stripe3ds2AuthResult a(JSONObject json) throws JSONException {
        p013kotlin.jvm.internal.s.k(json, "json");
        String string = json.getString("id");
        long j11 = json.getLong("created");
        boolean z11 = json.getBoolean("livemode");
        String string2 = json.getString("source");
        String strOptString = json.optString("state");
        JSONObject jSONObjectOptJSONObject = json.optJSONObject("ares");
        Stripe3ds2AuthResult.Ares aresA = jSONObjectOptJSONObject != null ? new a().a(jSONObjectOptJSONObject) : null;
        JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(AnalyticsAttribute.Error);
        return new Stripe3ds2AuthResult(string, aresA, Long.valueOf(j11), string2, strOptString, z11, jSONObjectOptJSONObject2 != null ? new d().a(jSONObjectOptJSONObject2) : null, t30.e.l(json, "fallback_redirect_url"), t30.e.l(json, "creq"));
    }
}
