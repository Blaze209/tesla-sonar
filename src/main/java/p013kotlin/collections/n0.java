package p013kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.l0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\u001a7\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "K", "Lkotlin/collections/l0;", "", "", "a", "(Lkotlin/collections/l0;)Ljava/util/Map;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/GroupingKt")
public class n0 {
    public static <T, K> Map<K, Integer> a(l0<T, ? extends K> l0Var) {
        s.k(l0Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itB = l0Var.b();
        while (itB.hasNext()) {
            K kA = l0Var.a(itB.next());
            Object l0Var2 = linkedHashMap.get(kA);
            if (l0Var2 == null && !linkedHashMap.containsKey(kA)) {
                l0Var2 = new l0();
            }
            l0 l0Var3 = (l0) l0Var2;
            l0Var3.f86527a++;
            linkedHashMap.put(kA, l0Var3);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            s.i(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            u0.e(entry).setValue(Integer.valueOf(((l0) entry.getValue()).f86527a));
        }
        return u0.d(linkedHashMap);
    }
}
