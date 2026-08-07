package yz;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class j {
    public static c a(Map<String, Object> map, String str) {
        String strH = h(map, str);
        if (strH == null) {
            return null;
        }
        return new c(strH);
    }

    public static boolean b(Map<String, Object> map, String str) throws ParseException {
        Boolean bool = (Boolean) c(map, str, Boolean.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    private static <T> T c(Map<String, Object> map, String str, Class<T> cls) throws ParseException {
        if (map.get(str) == null) {
            return null;
        }
        T t11 = (T) map.get(str);
        if (cls.isAssignableFrom(t11.getClass())) {
            return t11;
        }
        throw new ParseException("Unexpected type of JSON object member with key " + str + "", 0);
    }

    public static int d(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) c(map, str, Number.class);
        if (number != null) {
            return number.intValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    public static List<Object> e(Map<String, Object> map, String str) {
        return (List) c(map, str, List.class);
    }

    public static Map<String, Object> f(Map<String, Object> map, String str) throws ParseException {
        Map<String, Object> map2 = (Map) c(map, str, Map.class);
        if (map2 == null) {
            return null;
        }
        Iterator<String> it = map2.keySet().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof String)) {
                throw new ParseException("JSON object member with key " + str + " not a JSON object", 0);
            }
        }
        return map2;
    }

    public static long g(Map<String, Object> map, String str) throws ParseException {
        Number number = (Number) c(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    public static String h(Map<String, Object> map, String str) {
        return (String) c(map, str, String.class);
    }

    public static String[] i(Map<String, Object> map, String str) throws ParseException {
        List<Object> listE = e(map, str);
        if (listE == null) {
            return null;
        }
        try {
            return (String[]) listE.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new ParseException("JSON object member with key \"" + str + "\" is not an array of strings", 0);
        }
    }

    public static List<String> j(Map<String, Object> map, String str) throws ParseException {
        String[] strArrI = i(map, str);
        if (strArrI == null) {
            return null;
        }
        return Arrays.asList(strArrI);
    }

    public static URI k(Map<String, Object> map, String str) throws ParseException {
        String strH = h(map, str);
        if (strH == null) {
            return null;
        }
        try {
            return new URI(strH);
        } catch (URISyntaxException e11) {
            throw new ParseException(e11.getMessage(), 0);
        }
    }

    public static Map<String, Object> l() {
        return new HashMap();
    }

    public static Map<String, Object> m(String str) {
        return n(str, -1);
    }

    public static Map<String, Object> n(String str, int i11) throws ParseException {
        if (i11 >= 0 && str.length() > i11) {
            throw new ParseException("The parsed string is longer than the max accepted size of " + i11 + " characters", 0);
        }
        try {
            Object objB = new uz.a(640).b(str);
            if (objB instanceof sz.d) {
                return (sz.d) objB;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (com.nimbusds.jose.shaded.json.parser.ParseException e11) {
            throw new ParseException("Invalid JSON: " + e11.getMessage(), 0);
        } catch (Exception e12) {
            throw new ParseException("Unexpected exception: " + e12.getMessage(), 0);
        } catch (StackOverflowError unused) {
            throw new ParseException("Excessive JSON object and / or array nesting", 0);
        }
    }

    public static String o(Map<String, ?> map) {
        return sz.d.c(map);
    }
}
