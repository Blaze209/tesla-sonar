package x20;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.o;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0014\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0016\u0010\u0017\u001aM\u0010\u001a\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00112\u0016\u0010\u0019\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0018\"\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b \u0010!\u001a\u0015\u0010\u0012\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u001e¨\u0006#"}, d2 = {"T", "", "name", "", "list", "f", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "K", "V", "", "map", "g", "(Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;", "Lcom/squareup/wire/ProtoAdapter;", "adapter", "a", "(Ljava/util/List;Lcom/squareup/wire/ProtoAdapter;)Ljava/util/List;", "", "b", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)I", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I", "", "rest", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)I", "value", "h", "(Ljava/lang/String;)Ljava/lang/String;", "values", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Ljava/lang/String;", "oneOfName", "wire-runtime"}, k = 5, mv = {1, 4, 0}, xs = "com/squareup/wire/internal/Internal")
final /* synthetic */ class f {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "p1", "o", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {1, 4, 0})
    static final /* synthetic */ class a extends o implements wn0.l<String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f122717a = new a();

        a() {
            super(1);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "sanitize";
        }

        @Override // p013kotlin.jvm.internal.f
        public final co0.g getOwner() {
            return o0.d(d.class, "wire-runtime");
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "sanitize(Ljava/lang/String;)Ljava/lang/String;";
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p11) {
            s.k(p11, "p1");
            return d.i(p11);
        }
    }

    public static final <T> List<T> a(List<? extends T> redactElements, ProtoAdapter<T> adapter) {
        s.k(redactElements, "$this$redactElements");
        s.k(adapter, "adapter");
        List<? extends T> list = redactElements;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(adapter.redact(it.next()));
        }
        return arrayList;
    }

    public static final String b(String oneOfName) {
        s.k(oneOfName, "oneOfName");
        String str = oneOfName + "_keys";
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String upperCase = str.toUpperCase();
        s.j(upperCase, "(this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    public static final int c(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
    }

    public static final int d(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 != null ? 1 : 0);
    }

    public static final int e(Object obj, Object obj2, Object obj3, Object obj4, Object... rest) {
        s.k(rest, "rest");
        int i11 = obj != null ? 1 : 0;
        if (obj2 != null) {
            i11++;
        }
        if (obj3 != null) {
            i11++;
        }
        if (obj4 != null) {
            i11++;
        }
        for (Object obj5 : rest) {
            if (obj5 != null) {
                i11++;
            }
        }
        return i11;
    }

    public static final <T> List<T> f(String name, List<? extends T> list) {
        s.k(name, "name");
        s.k(list, "list");
        if (list instanceof h) {
            list = (List<T>) ((h) list).e();
        }
        if (list == v.m() || (list instanceof c)) {
            return (List<T>) list;
        }
        c cVar = new c(list);
        if (!cVar.contains(null)) {
            return cVar;
        }
        throw new IllegalArgumentException((name + ".contains(null)").toString());
    }

    public static final <K, V> Map<K, V> g(String name, Map<K, ? extends V> map) {
        s.k(name, "name");
        s.k(map, "map");
        if (map.isEmpty()) {
            return v0.i();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set<K> setKeySet = linkedHashMap.keySet();
        if (setKeySet == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Collection<K?>");
        }
        if (setKeySet.contains(null)) {
            throw new IllegalArgumentException((name + ".containsKey(null)").toString());
        }
        Collection<V> collectionValues = linkedHashMap.values();
        if (collectionValues == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Collection<V?>");
        }
        if (!collectionValues.contains(null)) {
            Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
            s.j(mapUnmodifiableMap, "Collections.unmodifiableMap(this)");
            return mapUnmodifiableMap;
        }
        throw new IllegalArgumentException((name + ".containsValue(null)").toString());
    }

    public static final String h(String value) {
        s.k(value, "value");
        StringBuilder sb2 = new StringBuilder(value.length());
        for (int i11 = 0; i11 < value.length(); i11++) {
            char cCharAt = value.charAt(i11);
            if (t.g0(",[]{}\\", cCharAt, false, 2, null)) {
                sb2.append(CoreConstants.ESCAPE_CHAR);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        s.j(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final String i(List<String> values) {
        s.k(values, "values");
        return v.y0(values, null, "[", "]", 0, null, a.f122717a, 25, null);
    }
}
