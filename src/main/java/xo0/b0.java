package xo0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\u0012\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0013\u001a-\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\",\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"&\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\"\u0010\u001f¨\u0006$"}, d2 = {"Lto0/f;", "Lwo0/b;", "json", "", "", "", "b", "(Lto0/f;Lwo0/b;)Ljava/util/Map;", "descriptor", "e", "(Lwo0/b;Lto0/f;)Ljava/util/Map;", "index", "h", "(Lto0/f;Lwo0/b;I)Ljava/lang/String;", "Lwo0/y;", "m", "(Lto0/f;Lwo0/b;)Lwo0/y;", "name", "l", "(Lto0/f;Lwo0/b;Ljava/lang/String;)I", "", DateTokenConverter.CONVERTER_KEY, "(Lwo0/b;Lto0/f;)Z", IntegerTokenConverter.CONVERTER_KEY, "suffix", "j", "(Lto0/f;Lwo0/b;Ljava/lang/String;Ljava/lang/String;)I", "Lxo0/v$a;", "a", "Lxo0/v$a;", "g", "()Lxo0/v$a;", "JsonDeserializationNamesKey", "", "getJsonSerializationNamesKey", "JsonSerializationNamesKey", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v.a<Map<String, Integer>> f123814a = new v.a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final v.a<String[]> f123815b = new v.a<>();

    private static final Map<String, Integer> b(to0.f fVar, wo0.b bVar) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zD = d(bVar, fVar);
        m(fVar, bVar);
        int elementsCount = fVar.getElementsCount();
        for (int i11 = 0; i11 < elementsCount; i11++) {
            List<Annotation> listG = fVar.g(i11);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (obj instanceof wo0.x) {
                    arrayList.add(obj);
                }
            }
            wo0.x xVar = (wo0.x) p013kotlin.collections.v.W0(arrayList);
            if (xVar != null && (strArrNames = xVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zD) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        p013kotlin.jvm.internal.s.j(lowerCase2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, fVar, lowerCase2, i11);
                }
            }
            if (zD) {
                lowerCase = fVar.f(i11).toLowerCase(Locale.ROOT);
                p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                c(linkedHashMap, fVar, lowerCase, i11);
            }
        }
        return linkedHashMap.isEmpty() ? p013kotlin.collections.v0.i() : linkedHashMap;
    }

    private static final void c(Map<String, Integer> map, to0.f fVar, String str, int i11) {
        String str2 = p013kotlin.jvm.internal.s.f(fVar.getKind(), to0.n.b.f114905a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i11));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + fVar.f(i11) + " is already one of the names for " + str2 + ' ' + fVar.f(((Number) p013kotlin.collections.v0.j(map, str)).intValue()) + " in " + fVar);
    }

    private static final boolean d(wo0.b bVar, to0.f fVar) {
        return bVar.getConfiguration().getDecodeEnumsCaseInsensitive() && p013kotlin.jvm.internal.s.f(fVar.getKind(), to0.n.b.f114905a);
    }

    public static final Map<String, Integer> e(final wo0.b bVar, final to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return (Map) wo0.e0.a(bVar).b(descriptor, f123814a, new wn0.a() { // from class: xo0.a0
            @Override // wn0.a
            public final Object invoke() {
                return b0.f(descriptor, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map f(to0.f fVar, wo0.b bVar) {
        return b(fVar, bVar);
    }

    public static final v.a<Map<String, Integer>> g() {
        return f123814a;
    }

    public static final String h(to0.f fVar, wo0.b json, int i11) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        p013kotlin.jvm.internal.s.k(json, "json");
        m(fVar, json);
        return fVar.f(i11);
    }

    public static final int i(to0.f fVar, wo0.b json, String name) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(name, "name");
        if (d(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            p013kotlin.jvm.internal.s.j(lowerCase, "toLowerCase(...)");
            return l(fVar, json, lowerCase);
        }
        m(fVar, json);
        int iC = fVar.c(name);
        return (iC == -3 && json.getConfiguration().getUseAlternativeNames()) ? l(fVar, json, name) : iC;
    }

    public static final int j(to0.f fVar, wo0.b json, String name, String suffix) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(suffix, "suffix");
        int i11 = i(fVar, json, name);
        if (i11 != -3) {
            return i11;
        }
        throw new SerializationException(fVar.getSerialName() + " does not contain element with name '" + name + CoreConstants.SINGLE_QUOTE_CHAR + suffix);
    }

    public static /* synthetic */ int k(to0.f fVar, wo0.b bVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return j(fVar, bVar, str, str2);
    }

    private static final int l(to0.f fVar, wo0.b bVar, String str) {
        Integer num = e(bVar, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final wo0.y m(to0.f fVar, wo0.b json) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        p013kotlin.jvm.internal.s.k(json, "json");
        if (p013kotlin.jvm.internal.s.f(fVar.getKind(), to0.o.a.f114906a)) {
            json.getConfiguration().l();
        }
        return null;
    }
}
