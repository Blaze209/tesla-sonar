package d90;

import java.util.LinkedHashMap;
import java.util.Map;
import p010i90.IdentifierSpec;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001aC\u0010\u000b\u001a\u00020\n2\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "", "", "paramMap", "Li90/g0;", "c", "(Ljava/util/Map;)Ljava/util/Map;", "path", "", "output", "Ljn0/h0;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;)V", "original", "add", "b", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {
    private static final void a(Map<String, ? extends Object> map, String str, Map<IdentifierSpec, String> map2) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                map2.put(IdentifierSpec.INSTANCE.b(b(str, entry.getKey())), null);
            } else if (value instanceof String) {
                IdentifierSpec identifierSpecB = IdentifierSpec.INSTANCE.b(b(str, entry.getKey()));
                Object value2 = entry.getValue();
                s.i(value2, "null cannot be cast to non-null type kotlin.String");
                map2.put(identifierSpecB, (String) value2);
            } else if (value instanceof Map) {
                Object value3 = entry.getValue();
                s.i(value3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                a((Map) value3, b(str, entry.getKey()), map2);
            }
        }
    }

    private static final String b(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        return str + "[" + str2 + "]";
    }

    public static final Map<IdentifierSpec, String> c(Map<String, ? extends Object> paramMap) {
        s.k(paramMap, "paramMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a(paramMap, "", linkedHashMap);
        return linkedHashMap;
    }
}
