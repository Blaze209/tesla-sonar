package w30;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\f2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001aJ+\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lw30/y;", "", "<init>", "()V", "", "", "params", "", "Lw30/y$a;", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/Map;)Ljava/util/List;", "value", "", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Z", "l", "j", "(Ljava/util/List;)Z", "keyPrefix", "e", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "f", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;", "h", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/List;", "b", "(Ljava/util/Map;)Ljava/lang/String;", "c", "a", "(Ljava/util/Map;)Ljava/util/Map;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f120698a = new y();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lw30/y$a;", "", "", Action.KEY_ATTRIBUTE, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "str", "a", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "b", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String key;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String value;

        public a(String key, String value) {
            p013kotlin.jvm.internal.s.k(key, "key");
            p013kotlin.jvm.internal.s.k(value, "value");
            this.key = key;
            this.value = value;
        }

        private final String a(String str) throws UnsupportedEncodingException {
            String strEncode = URLEncoder.encode(str, p013kotlin.text.d.UTF_8.name());
            p013kotlin.jvm.internal.s.j(strEncode, "encode(...)");
            return strEncode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return p013kotlin.jvm.internal.s.f(this.key, aVar.key) && p013kotlin.jvm.internal.s.f(this.value, aVar.value);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() throws UnsupportedEncodingException {
            return a(this.key) + "=" + a(this.value);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw30/y$a;", "it", "", "a", "(Lw30/y$a;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<a, CharSequence> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f120701c = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(a it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            return it.toString();
        }
    }

    private y() {
    }

    private final List<a> d(Map<String, ?> params) {
        return g(this, params, null, 2, null);
    }

    private final List<a> e(List<?> params, String keyPrefix) {
        if (params.isEmpty()) {
            return p013kotlin.collections.v.e(new a(keyPrefix, ""));
        }
        if (j(params)) {
            String str = keyPrefix + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = params.iterator();
            while (it.hasNext()) {
                p013kotlin.collections.v.E(arrayList, f120698a.h(it.next(), str));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        for (Object obj : params) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                p013kotlin.collections.v.x();
            }
            p013kotlin.collections.v.E(arrayList2, f120698a.h(obj, keyPrefix + "[" + i11 + "]"));
            i11 = i12;
        }
        return arrayList2;
    }

    private final List<a> f(Map<String, ?> params, String keyPrefix) {
        if (params == null) {
            return p013kotlin.collections.v.m();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (keyPrefix != null) {
                String str = keyPrefix + "[" + key + "]";
                if (str != null) {
                    key = str;
                }
            }
            p013kotlin.collections.v.E(arrayList, f120698a.h(value, key));
        }
        return arrayList;
    }

    static /* synthetic */ List g(y yVar, Map map, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return yVar.f(map, str);
    }

    private final List<a> h(Object value, String keyPrefix) {
        if (value instanceof Map) {
            return f((Map) value, keyPrefix);
        }
        if (value instanceof List) {
            return e((List) value, keyPrefix);
        }
        return value == null ? p013kotlin.collections.v.e(new a(keyPrefix, "")) : p013kotlin.collections.v.e(new a(keyPrefix, value.toString()));
    }

    private final boolean i(Object value) {
        return (value instanceof String) || (value instanceof Number) || (value instanceof Boolean) || (value instanceof Character);
    }

    private final boolean j(List<?> l11) {
        List<?> list = l11;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!f120698a.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Map<String, Object> a(Map<String, ?> params) {
        p013kotlin.jvm.internal.s.k(params, "params");
        HashMap map = new HashMap(params);
        for (String str : new HashSet(map.keySet())) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                p013kotlin.jvm.internal.s.h(str);
                map.put(str, a((Map) obj));
            } else if (obj == null) {
                map.remove(str);
            }
        }
        return map;
    }

    public final String b(Map<String, ?> params) {
        return p013kotlin.collections.v.y0(d(params), "&", null, null, 0, null, b.f120701c, 30, null);
    }

    public final String c(Map<String, ?> params) {
        y yVar;
        Map<String, Object> mapA;
        String strB;
        return (params == null || (mapA = (yVar = f120698a).a(params)) == null || (strB = yVar.b(mapA)) == null) ? "" : strB;
    }
}
