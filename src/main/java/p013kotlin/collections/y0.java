package p013kotlin.collections;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import ho0.i;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u001a%\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001aQ\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001aQ\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000b\u0010\t\u001aa\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\r\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000f\u001aa\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0011\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0015\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0014\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aI\u0010\u0018\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u001a\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u0018\u0010\u0019\u001aG\u0010\u001b\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001a¢\u0006\u0004\b\u001b\u0010\u001c\u001aG\u0010\u001e\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n2\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001d¢\u0006\u0004\b\u001e\u0010\u001f\u001a;\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001a¢\u0006\u0004\b \u0010!\u001aQ\u0010$\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001a2\u0006\u0010#\u001a\u00028\u0002¢\u0006\u0004\b$\u0010%\u001a=\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b&\u0010\t\u001aS\u0010'\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010#\u001a\u00028\u0002¢\u0006\u0004\b'\u0010(\u001a;\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001d¢\u0006\u0004\b)\u0010*\u001aQ\u0010+\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0018\b\u0002\u0010\"*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010\n*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001d2\u0006\u0010#\u001a\u00028\u0002¢\u0006\u0004\b+\u0010,\u001a9\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b-\u0010.\u001a9\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b/\u0010.\u001aN\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\u0002¢\u0006\u0004\b1\u00102\u001aT\u00103\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u001aH\u0086\u0002¢\u0006\u0004\b3\u00104\u001aP\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0014\u00105\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0086\u0002¢\u0006\u0004\b6\u00107\u001aB\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0014\u001a\u00028\u0000H\u0087\u0002¢\u0006\u0004\b8\u00109\u001a7\u0010:\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0000¢\u0006\u0004\b:\u0010.¨\u0006;"}, d2 = {"K", "V", "", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/util/Map;", "", "Lkotlin/Pair;", "pairs", "m", "([Lkotlin/Pair;)Ljava/util/Map;", "", "o", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "k", "([Lkotlin/Pair;)Ljava/util/HashMap;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "l", "([Lkotlin/Pair;)Ljava/util/LinkedHashMap;", Action.KEY_ATTRIBUTE, "j", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Ljn0/h0;", "v", "(Ljava/util/Map;[Lkotlin/Pair;)V", "", "u", "(Ljava/util/Map;Ljava/lang/Iterable;)V", "Lho0/i;", "t", "(Ljava/util/Map;Lho0/i;)V", "y", "(Ljava/lang/Iterable;)Ljava/util/Map;", Gender.MALE, "destination", "z", "(Ljava/lang/Iterable;Ljava/util/Map;)Ljava/util/Map;", "B", "C", "([Lkotlin/Pair;Ljava/util/Map;)Ljava/util/Map;", "w", "(Lho0/i;)Ljava/util/Map;", "x", "(Lho0/i;Ljava/util/Map;)Ljava/util/Map;", "A", "(Ljava/util/Map;)Ljava/util/Map;", "D", "pair", "s", "(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;", "q", "(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;", "map", "r", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "n", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "p", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
public class y0 extends x0 {
    public static <K, V> Map<K, V> A(Map<? extends K, ? extends V> map) {
        s.k(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? D(map) : x0.g(map);
        }
        return i();
    }

    public static <K, V> Map<K, V> B(Pair<? extends K, ? extends V>[] pairArr) {
        s.k(pairArr, "<this>");
        int length = pairArr.length;
        if (length != 0) {
            return length != 1 ? C(pairArr, new LinkedHashMap(x0.e(pairArr.length))) : x0.f(pairArr[0]);
        }
        return i();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M C(Pair<? extends K, ? extends V>[] pairArr, M destination) {
        s.k(pairArr, "<this>");
        s.k(destination, "destination");
        v(destination, pairArr);
        return destination;
    }

    public static <K, V> Map<K, V> D(Map<? extends K, ? extends V> map) {
        s.k(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static <K, V> Map<K, V> i() {
        j0 j0Var = j0.f86481a;
        s.i(j0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return j0Var;
    }

    public static <K, V> V j(Map<K, ? extends V> map, K k11) {
        s.k(map, "<this>");
        return (V) w0.a(map, k11);
    }

    public static <K, V> HashMap<K, V> k(Pair<? extends K, ? extends V>... pairs) {
        s.k(pairs, "pairs");
        HashMap<K, V> map = new HashMap<>(x0.e(pairs.length));
        v(map, pairs);
        return map;
    }

    public static <K, V> LinkedHashMap<K, V> l(Pair<? extends K, ? extends V>... pairs) {
        s.k(pairs, "pairs");
        return (LinkedHashMap) C(pairs, new LinkedHashMap(x0.e(pairs.length)));
    }

    public static <K, V> Map<K, V> m(Pair<? extends K, ? extends V>... pairs) {
        s.k(pairs, "pairs");
        return pairs.length > 0 ? C(pairs, new LinkedHashMap(x0.e(pairs.length))) : i();
    }

    public static <K, V> Map<K, V> n(Map<? extends K, ? extends V> map, K k11) {
        s.k(map, "<this>");
        Map mapD = D(map);
        mapD.remove(k11);
        return p(mapD);
    }

    public static <K, V> Map<K, V> o(Pair<? extends K, ? extends V>... pairs) {
        s.k(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(x0.e(pairs.length));
        v(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        s.k(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? map : x0.g(map);
        }
        return i();
    }

    public static <K, V> Map<K, V> q(Map<? extends K, ? extends V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        s.k(map, "<this>");
        s.k(pairs, "pairs");
        if (map.isEmpty()) {
            return y(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        u(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> r(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        s.k(map, "<this>");
        s.k(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static <K, V> Map<K, V> s(Map<? extends K, ? extends V> map, Pair<? extends K, ? extends V> pair) {
        s.k(map, "<this>");
        s.k(pair, "pair");
        if (map.isEmpty()) {
            return x0.f(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.e(), pair.f());
        return linkedHashMap;
    }

    public static final <K, V> void t(Map<? super K, ? super V> map, i<? extends Pair<? extends K, ? extends V>> pairs) {
        s.k(map, "<this>");
        s.k(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    public static final <K, V> void u(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        s.k(map, "<this>");
        s.k(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    public static final <K, V> void v(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        s.k(map, "<this>");
        s.k(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.a(), pair.b());
        }
    }

    public static <K, V> Map<K, V> w(i<? extends Pair<? extends K, ? extends V>> iVar) {
        s.k(iVar, "<this>");
        return p(x(iVar, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M x(i<? extends Pair<? extends K, ? extends V>> iVar, M destination) {
        s.k(iVar, "<this>");
        s.k(destination, "destination");
        t(destination, iVar);
        return destination;
    }

    public static <K, V> Map<K, V> y(Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        s.k(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return p(z(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i();
        }
        if (size != 1) {
            return z(iterable, new LinkedHashMap(x0.e(collection.size())));
        }
        return x0.f((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M z(Iterable<? extends Pair<? extends K, ? extends V>> iterable, M destination) {
        s.k(iterable, "<this>");
        s.k(destination, "destination");
        u(destination, iterable);
        return destination;
    }
}
