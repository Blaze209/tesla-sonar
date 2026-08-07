package w30;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.core.exception.InvalidSerializationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t*\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u0001*\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/json/JsonElement;", "", "", "a", "(Lkotlinx/serialization/json/JsonElement;)Ljava/util/Map;", "", "c", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonArray;", "", DateTokenConverter.CONVERTER_KEY, "(Lkotlinx/serialization/json/JsonArray;)Ljava/util/List;", "Lkotlinx/serialization/json/JsonObject;", "b", "(Lkotlinx/serialization/json/JsonObject;)Ljava/util/Map;", "stripe-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class t {
    public static final Map<String, ?> a(JsonElement jsonElement) throws InvalidSerializationException {
        p013kotlin.jvm.internal.s.k(jsonElement, "<this>");
        if (jsonElement instanceof JsonObject) {
            return b((JsonObject) jsonElement);
        }
        String simpleName = jsonElement.getClass().getSimpleName();
        p013kotlin.jvm.internal.s.j(simpleName, "getSimpleName(...)");
        throw new InvalidSerializationException(simpleName);
    }

    public static final Map<String, ?> b(JsonObject jsonObject) {
        p013kotlin.jvm.internal.s.k(jsonObject, "<this>");
        ArrayList arrayList = new ArrayList(jsonObject.size());
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            arrayList.add(jn0.x.a(entry.getKey(), c(entry.getValue())));
        }
        return v0.y(arrayList);
    }

    public static final Object c(JsonElement jsonElement) {
        p013kotlin.jvm.internal.s.k(jsonElement, "<this>");
        if (p013kotlin.jvm.internal.s.f(jsonElement, JsonNull.INSTANCE)) {
            return null;
        }
        if (jsonElement instanceof JsonArray) {
            return d((JsonArray) jsonElement);
        }
        if (jsonElement instanceof JsonObject) {
            return b((JsonObject) jsonElement);
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            throw new NoWhenBranchMatchedException();
        }
        return new p013kotlin.text.q("^\"|\"$").j(((JsonPrimitive) jsonElement).getContent(), "");
    }

    public static final List<?> d(JsonArray jsonArray) {
        p013kotlin.jvm.internal.s.k(jsonArray, "<this>");
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(jsonArray, 10));
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add(c(it.next()));
        }
        return arrayList;
    }
}
