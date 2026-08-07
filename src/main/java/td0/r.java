package td0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn0.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u0017"}, d2 = {"Ltd0/r;", "", "<init>", "()V", "Lorg/json/JSONObject;", "c", "()Lorg/json/JSONObject;", "", "e", "()Z", DateTokenConverter.CONVERTER_KEY, "a", "b", "", "jsonString", "g", "(Ljava/lang/String;)Lorg/json/JSONObject;", "", "f", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "realm_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f113232a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("ReduxPropertyHelper");

    private r() {
    }

    private final JSONObject c() {
        String strH = m.j().h("persist:userPref");
        if (strH != null) {
            try {
                return new JSONObject(strH);
            } catch (Exception unused) {
                com.tesla.logging.g gVar = logger;
                TeslaLog teslaLog = TeslaLog.INSTANCE;
                String tag = gVar.getTag();
                String strG = gVar.g("Failed to decode UserPreferences into JSON");
                zb0.a aVar = zb0.a.f128044a;
                Map mapF = v0.f(x.a(tag, strG));
                FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry : mapF.entrySet()) {
                    zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                }
                firebaseCrashlytics.recordException(new Exception(strG));
                TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                vr0.a.INSTANCE.a(strG, new Object[0]);
            }
        }
        return null;
    }

    public static final boolean d() {
        JSONObject jSONObjectC = f113232a.c();
        return p013kotlin.jvm.internal.s.f(jSONObjectC != null ? jSONObjectC.get("calendarSyncEnabled") : null, "true");
    }

    public static final boolean e() throws JSONException {
        JSONObject jSONObjectA = f113232a.a();
        if (jSONObjectA == null) {
            return false;
        }
        Object obj = jSONObjectA.get("isFeedbackEnabled");
        if (obj instanceof String) {
            return p013kotlin.jvm.internal.s.f(obj, "true");
        }
        return false;
    }

    public final JSONObject a() {
        String strH = m.j().h("persist:appSettings");
        if (strH != null) {
            try {
                return new JSONObject(strH);
            } catch (Exception e11) {
                logger.d("Failed to decode app settings into JSON", e11);
            }
        }
        return null;
    }

    public final JSONObject b() {
        String strH = m.j().h("persist:energySites");
        if (strH != null) {
            try {
                return new JSONObject(strH);
            } catch (Exception e11) {
                logger.d("Failed to decode energySites into JSON", e11);
            }
        }
        return null;
    }

    public final List<String> f(String jsonString) {
        p013kotlin.jvm.internal.s.k(jsonString, "jsonString");
        try {
            JSONArray jSONArray = new JSONArray(jsonString);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                if (jSONArray.get(i11) instanceof String) {
                    Object obj = jSONArray.get(i11);
                    p013kotlin.jvm.internal.s.i(obj, "null cannot be cast to non-null type kotlin.String");
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (JSONException e11) {
            com.tesla.logging.g gVar = logger;
            String str = "Failed to parse JSON: " + e11.getMessage();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return null;
        }
    }

    public final JSONObject g(String jsonString) {
        p013kotlin.jvm.internal.s.k(jsonString, "jsonString");
        try {
            return new JSONObject(jsonString);
        } catch (JSONException e11) {
            com.tesla.logging.g gVar = logger;
            String str = "Failed to parse JSON: " + e11.getMessage();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            String tag = gVar.getTag();
            String strG = gVar.g(str);
            zb0.a aVar = zb0.a.f128044a;
            Map mapF = v0.f(x.a(tag, strG));
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            for (Map.Entry entry : mapF.entrySet()) {
                zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
            }
            firebaseCrashlytics.recordException(new Exception(strG));
            TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
            vr0.a.INSTANCE.a(strG, new Object[0]);
            return null;
        }
    }
}
