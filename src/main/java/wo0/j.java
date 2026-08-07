package wo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.t0;
import vo0.g0;
import xo0.w0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u0018\u001a\u00020\u0002*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010 \u001a\u00020\u001d*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u0015\u0010$\u001a\u00020!*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\"\u0010#\"\u0017\u0010'\u001a\u0004\u0018\u00010!*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b%\u0010&\"\u0015\u0010+\u001a\u00020(*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010*\"\u0017\u0010.\u001a\u0004\u0018\u00010(*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0015\u00102\u001a\u00020/*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0017\u00105\u001a\u0004\u0018\u00010/*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0015\u00109\u001a\u000206*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u00108\"\u0015\u0010<\u001a\u00020\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b:\u0010;\"\u0017\u0010?\u001a\u0004\u0018\u00010\u0000*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010>\"\u0017\u0010B\u001a\u0004\u0018\u00010\b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"", "value", "Lkotlinx/serialization/json/JsonPrimitive;", "a", "(Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonPrimitive;", "", "b", "(Ljava/lang/Number;)Lkotlinx/serialization/json/JsonPrimitive;", "", "c", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;", DateTokenConverter.CONVERTER_KEY, "Lkotlinx/serialization/json/JsonElement;", "element", "", "e", "(Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)Ljava/lang/Void;", "Lto0/f;", "Lto0/f;", "q", "()Lto0/f;", "jsonUnquotedLiteralDescriptor", "p", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;", "jsonPrimitive", "Lkotlinx/serialization/json/JsonObject;", "o", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;", "jsonObject", "Lkotlinx/serialization/json/JsonArray;", "n", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonArray;", "jsonArray", "", "l", "(Lkotlinx/serialization/json/JsonPrimitive;)I", "int", "m", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;", "intOrNull", "", "r", "(Lkotlinx/serialization/json/JsonPrimitive;)J", "long", "s", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;", "longOrNull", "", IntegerTokenConverter.CONVERTER_KEY, "(Lkotlinx/serialization/json/JsonPrimitive;)D", "double", "j", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;", "doubleOrNull", "", "k", "(Lkotlinx/serialization/json/JsonPrimitive;)F", InquiryField.FloatField.TYPE, "f", "(Lkotlinx/serialization/json/JsonPrimitive;)Z", InquiryField.BooleanField.TYPE, "g", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;", "booleanOrNull", "h", "(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;", "contentOrNull", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final to0.f f122155a = g0.a("kotlinx.serialization.json.JsonUnquotedLiteral", so0.a.F(t0.f86535a));

    public static final JsonPrimitive a(Boolean bool) {
        if (bool == null) {
            return JsonNull.INSTANCE;
        }
        return new v(bool, false, null, 4, null);
    }

    public static final JsonPrimitive b(Number number) {
        if (number == null) {
            return JsonNull.INSTANCE;
        }
        return new v(number, false, null, 4, null);
    }

    public static final JsonPrimitive c(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        return new v(str, true, null, 4, null);
    }

    public static final JsonPrimitive d(String str) {
        if (str == null) {
            return JsonNull.INSTANCE;
        }
        if (p013kotlin.jvm.internal.s.f(str, JsonNull.INSTANCE.getContent())) {
            throw new JsonEncodingException("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new v(str, false, f122155a);
    }

    private static final Void e(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + o0.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final boolean f(JsonPrimitive jsonPrimitive) {
        p013kotlin.jvm.internal.s.k(jsonPrimitive, "<this>");
        Boolean boolD = w0.d(jsonPrimitive.getContent());
        if (boolD != null) {
            return boolD.booleanValue();
        }
        throw new IllegalStateException(jsonPrimitive + " does not represent a Boolean");
    }

    public static final Boolean g(JsonPrimitive jsonPrimitive) {
        p013kotlin.jvm.internal.s.k(jsonPrimitive, "<this>");
        return w0.d(jsonPrimitive.getContent());
    }

    public static final String h(JsonPrimitive jsonPrimitive) {
        p013kotlin.jvm.internal.s.k(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.getContent();
    }

    public static final double i(JsonPrimitive jsonPrimitive) {
        p013kotlin.jvm.internal.s.k(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.getContent());
    }

    public static final Double j(JsonPrimitive jsonPrimitive) {
        p013kotlin.jvm.internal.s.k(jsonPrimitive, "<this>");
        return p013kotlin.text.t.u(jsonPrimitive.getContent());
    }

    public static final float k(JsonPrimitive jsonPrimitive) {
        p013kotlin.jvm.internal.s.k(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.getContent());
    }

    public static final int l(JsonPrimitive jsonPrimitive) {
        p013kotlin.jvm.internal.s.k(jsonPrimitive, "<this>");
        try {
            long jM = new xo0.t0(jsonPrimitive.getContent()).m();
            if (-2147483648L <= jM && jM <= 2147483647L) {
                return (int) jM;
            }
            throw new NumberFormatException(jsonPrimitive.getContent() + " is not an Int");
        } catch (JsonDecodingException e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }

    public static final Integer m(JsonPrimitive jsonPrimitive) {
        Long lValueOf;
        p013kotlin.jvm.internal.s.k(jsonPrimitive, "<this>");
        try {
            lValueOf = Long.valueOf(new xo0.t0(jsonPrimitive.getContent()).m());
        } catch (JsonDecodingException unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final JsonArray n(JsonElement jsonElement) {
        p013kotlin.jvm.internal.s.k(jsonElement, "<this>");
        JsonArray jsonArray = jsonElement instanceof JsonArray ? (JsonArray) jsonElement : null;
        if (jsonArray != null) {
            return jsonArray;
        }
        e(jsonElement, "JsonArray");
        throw new KotlinNothingValueException();
    }

    public static final JsonObject o(JsonElement jsonElement) {
        p013kotlin.jvm.internal.s.k(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        e(jsonElement, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final JsonPrimitive p(JsonElement jsonElement) {
        p013kotlin.jvm.internal.s.k(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        e(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final to0.f q() {
        return f122155a;
    }

    public static final long r(JsonPrimitive jsonPrimitive) {
        p013kotlin.jvm.internal.s.k(jsonPrimitive, "<this>");
        try {
            return new xo0.t0(jsonPrimitive.getContent()).m();
        } catch (JsonDecodingException e11) {
            throw new NumberFormatException(e11.getMessage());
        }
    }

    public static final Long s(JsonPrimitive jsonPrimitive) {
        p013kotlin.jvm.internal.s.k(jsonPrimitive, "<this>");
        try {
            return Long.valueOf(new xo0.t0(jsonPrimitive.getContent()).m());
        } catch (JsonDecodingException unused) {
            return null;
        }
    }
}
