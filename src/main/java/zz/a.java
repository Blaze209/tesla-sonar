package zz;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import yz.i;
import yz.j;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f129198b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f129199a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f129200a = new LinkedHashMap();

        public b a(String str) {
            if (str == null) {
                this.f129200a.put("aud", null);
                return this;
            }
            this.f129200a.put("aud", Collections.singletonList(str));
            return this;
        }

        public b b(List<String> list) {
            this.f129200a.put("aud", list);
            return this;
        }

        public a c() {
            return new a(this.f129200a);
        }

        public b d(String str, Object obj) {
            this.f129200a.put(str, obj);
            return this;
        }

        public b e(Date date) {
            this.f129200a.put("exp", date);
            return this;
        }

        public b f(Date date) {
            this.f129200a.put("iat", date);
            return this;
        }

        public b g(String str) {
            this.f129200a.put("iss", str);
            return this;
        }

        public b h(String str) {
            this.f129200a.put("jti", str);
            return this;
        }

        public b i(Date date) {
            this.f129200a.put("nbf", date);
            return this;
        }

        public b j(String str) {
            this.f129200a.put("sub", str);
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        f129198b = Collections.unmodifiableSet(hashSet);
    }

    public static a e(String str) {
        return f(j.m(str));
    }

    public static a f(Map<String, Object> map) {
        b bVar = new b();
        for (String str : map.keySet()) {
            str.getClass();
            switch (str) {
                case "aud":
                    Object obj = map.get("aud");
                    if (!(obj instanceof String)) {
                        if (obj instanceof List) {
                            bVar.b(j.j(map, "aud"));
                        } else if (obj == null) {
                            bVar.a(null);
                        }
                        break;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(j.h(map, "aud"));
                        bVar.b(arrayList);
                        break;
                    }
                    break;
                case "exp":
                    bVar.e(new Date(j.g(map, "exp") * 1000));
                    break;
                case "iat":
                    bVar.f(new Date(j.g(map, "iat") * 1000));
                    break;
                case "iss":
                    bVar.g(j.h(map, "iss"));
                    break;
                case "jti":
                    bVar.h(j.h(map, "jti"));
                    break;
                case "nbf":
                    bVar.i(new Date(j.g(map, "nbf") * 1000));
                    break;
                case "sub":
                    bVar.j(j.h(map, "sub"));
                    break;
                default:
                    bVar.d(str, map.get(str));
                    break;
            }
        }
        return bVar.c();
    }

    public List<String> a() {
        Object objB = b("aud");
        if (objB instanceof String) {
            return Collections.singletonList((String) objB);
        }
        try {
            List<String> listD = d("aud");
            return listD != null ? listD : Collections.EMPTY_LIST;
        } catch (ParseException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    public Object b(String str) {
        return this.f129199a.get(str);
    }

    public String[] c(String str) throws ParseException {
        if (b(str) == null) {
            return null;
        }
        try {
            List list = (List) b(str);
            int size = list.size();
            String[] strArr = new String[size];
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    strArr[i11] = (String) list.get(i11);
                } catch (ClassCastException unused) {
                    throw new ParseException("The " + str + " claim is not a list / JSON array of strings", 0);
                }
            }
            return strArr;
        } catch (ClassCastException unused2) {
            throw new ParseException("The " + str + " claim is not a list / JSON array", 0);
        }
    }

    public List<String> d(String str) throws ParseException {
        String[] strArrC = c(str);
        if (strArrC == null) {
            return null;
        }
        return Collections.unmodifiableList(Arrays.asList(strArrC));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return Objects.equals(this.f129199a, ((a) obj).f129199a);
        }
        return false;
    }

    public Map<String, Object> g() {
        return h(false);
    }

    public Map<String, Object> h(boolean z11) {
        Map<String, Object> mapL = j.l();
        for (Map.Entry<String, Object> entry : this.f129199a.entrySet()) {
            if (entry.getValue() instanceof Date) {
                mapL.put(entry.getKey(), Long.valueOf(a00.a.a((Date) entry.getValue())));
            } else if ("aud".equals(entry.getKey())) {
                List<String> listA = a();
                if (listA == null || listA.isEmpty()) {
                    if (z11) {
                        mapL.put("aud", null);
                    }
                } else if (listA.size() == 1) {
                    mapL.put("aud", listA.get(0));
                } else {
                    List<Object> listA2 = i.a();
                    listA2.addAll(listA);
                    mapL.put("aud", listA2);
                }
            } else if (entry.getValue() != null) {
                mapL.put(entry.getKey(), entry.getValue());
            } else if (z11) {
                mapL.put(entry.getKey(), null);
            }
        }
        return mapL;
    }

    public int hashCode() {
        return Objects.hash(this.f129199a);
    }

    public String toString() {
        return j.o(g());
    }

    private a(Map<String, Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f129199a = linkedHashMap;
        linkedHashMap.putAll(map);
    }
}
