package yc0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import fc0.u5;
import gc0.e0;
import gc0.o;
import gc0.q;
import gc0.r;
import gc0.u;
import gc0.x;
import j$.time.Instant;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\t*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000b*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010 \u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001d*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b \u0010\u001fJ\u001d\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\"\u0010#R\u0017\u0010(\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lyc0/i;", "", "<init>", "()V", "Lorg/json/JSONObject;", "vehicleDataJson", "Lfc0/u5;", "a", "(Lorg/json/JSONObject;)Lfc0/u5;", "", "name", "", "fallback", "k", "(Lorg/json/JSONObject;Ljava/lang/String;F)F", "j", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "", "g", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Float;", "", "c", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Double;", "", IntegerTokenConverter.CONVERTER_KEY, "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Long;", "j$/time/Instant", "Lcom/squareup/wire/Instant;", "e", "(Lorg/json/JSONObject;Ljava/lang/String;)Lj$/time/Instant;", "f", "", "b", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "h", "()Lcom/tesla/logging/g;", "logger", "json2proto_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f125368a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("VehicleDataFactory");

    private i() {
    }

    public final u5 a(JSONObject vehicleDataJson) {
        JSONObject vehicleDataJson2 = vehicleDataJson;
        s.k(vehicleDataJson2, "vehicleDataJson");
        try {
            u5 u5Var = new u5(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, false, null, Integer.MAX_VALUE, null);
            if (vehicleDataJson2.has("response")) {
                vehicleDataJson2 = vehicleDataJson2.optJSONObject("response");
            }
            if (vehicleDataJson2 == null) {
                return null;
            }
            o oVarA = a.a(vehicleDataJson2);
            q qVarB = b.b(vehicleDataJson2);
            u uVarA = d.a(vehicleDataJson2);
            r rVarA = c.a(vehicleDataJson2);
            x xVarA = e.a(vehicleDataJson2);
            e0 e0VarA = f.a(vehicleDataJson2);
            return new u5(xVarA, oVarA, qVarB, uVarA, j.b(vehicleDataJson2), h.f(vehicleDataJson2), e0VarA, rVarA, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, vehicleDataJson2.optInt("proto_json_version", u5Var.getProto_json_version()), null, null, null, null, true, null, 1593835264, null);
        } catch (Exception e11) {
            logger.f("Failed to convert JSON to vehicle data", e11);
            return null;
        }
    }

    public final Boolean b(JSONObject jSONObject, String name) throws JSONException {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        if (jSONObject.has(name)) {
            Object obj = jSONObject.get(name);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            if (obj instanceof Integer) {
                return Boolean.valueOf(!s.f(obj, 0));
            }
        }
        return null;
    }

    public final Double c(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        Double dValueOf = Double.valueOf(jSONObject.optDouble(name));
        if (Double.isNaN(dValueOf.doubleValue())) {
            dValueOf = null;
        }
        if (dValueOf != null) {
            return dValueOf;
        }
        return null;
    }

    public final Float d(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        Double dValueOf = Double.valueOf(jSONObject.optDouble(name));
        if (Double.isNaN(dValueOf.doubleValue())) {
            dValueOf = null;
        }
        if (dValueOf != null) {
            return Float.valueOf((float) dValueOf.doubleValue());
        }
        return null;
    }

    public final Instant e(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        if (jSONObject.has(name)) {
            Long lValueOf = Long.valueOf(jSONObject.optLong(name, -1L));
            if (lValueOf.longValue() == -1) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                return Instant.ofEpochMilli(lValueOf.longValue());
            }
        }
        return null;
    }

    public final Instant f(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        if (jSONObject.has(name)) {
            Long lValueOf = Long.valueOf(jSONObject.optLong(name, -1L));
            if (lValueOf.longValue() == -1) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                return Instant.ofEpochMilli(lValueOf.longValue() * ((long) 1000));
            }
        }
        return null;
    }

    public final Integer g(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        if (jSONObject.has(name)) {
            return Integer.valueOf(jSONObject.optInt(name));
        }
        return null;
    }

    public final com.tesla.logging.g h() {
        return logger;
    }

    public final Long i(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        if (jSONObject.has(name)) {
            return Long.valueOf(jSONObject.optLong(name));
        }
        return null;
    }

    public final String j(JSONObject jSONObject, String name) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        if (jSONObject.isNull(name)) {
            return null;
        }
        String strOptString = jSONObject.optString(name);
        s.h(strOptString);
        if (strOptString.length() > 0) {
            return strOptString;
        }
        return null;
    }

    public final float k(JSONObject jSONObject, String name, float f11) {
        s.k(jSONObject, "<this>");
        s.k(name, "name");
        Double dValueOf = Double.valueOf(jSONObject.optDouble(name));
        if (Double.isNaN(dValueOf.doubleValue())) {
            dValueOf = null;
        }
        return dValueOf != null ? (float) dValueOf.doubleValue() : f11;
    }
}
