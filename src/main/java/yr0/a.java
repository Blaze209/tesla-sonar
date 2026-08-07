package yr0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0004*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\u0006\"\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b*\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\")\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\" \u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f*\u0004\u0018\u00010\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u001f\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\b*\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\n\"(\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\b*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0018"}, d2 = {"", "", "h", "(Ljava/lang/Object;)Ljava/lang/String;", "", "g", "(Ljava/lang/Object;)Z", "f", "", "c", "(Ljava/lang/Object;)Ljava/util/List;", "asList", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;)Ljava/util/List;", "comparableList", "a", "(Ljava/lang/Object;)Ljava/lang/Comparable;", "asComparable", "", "b", "asDoubleList", "e", "doubleList", "utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    private static final Comparable<?> a(Object obj) {
        if (obj instanceof Comparable) {
            return (Comparable) obj;
        }
        if (obj instanceof List) {
            return new wr0.a((List) obj);
        }
        return null;
    }

    public static final List<Double> b(Object obj) {
        return e(c(obj));
    }

    public static final List<Object> c(Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        return list != null ? new wr0.a(list) : new wr0.a(v.e(obj));
    }

    public static final List<Comparable<?>> d(List<? extends Object> list) {
        s.k(list, "<this>");
        List<Object> listC = c(list);
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    private static final List<Double> e(List<? extends Object> list) {
        List<? extends Object> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (Object obj : list2) {
            arrayList.add(obj instanceof Number ? Double.valueOf(((Number) obj).doubleValue()) : obj instanceof String ? t.u((String) obj) : null);
        }
        return arrayList;
    }

    public static final boolean f(Object obj) {
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map != null && !map.isEmpty()) {
            Set setKeySet = map.keySet();
            if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                return true;
            }
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean g(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        return list.size() == 1 && v.o0(list) == null;
    }

    public static final String h(Object obj) {
        String string = obj != null ? obj.toString() : null;
        return string == null ? "" : string;
    }
}
