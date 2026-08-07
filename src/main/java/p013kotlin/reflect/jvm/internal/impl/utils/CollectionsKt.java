package p013kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class CollectionsKt {
    private static final int a(int i11) {
        if (i11 < 3) {
            return 3;
        }
        return i11 + (i11 / 3) + 1;
    }

    public static final <T> void addIfNotNull(Collection<T> collection, T t11) {
        s.k(collection, "<this>");
        if (t11 != null) {
            collection.add(t11);
        }
    }

    public static final <T> List<T> compact(ArrayList<T> arrayList) {
        s.k(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return v.m();
        }
        if (size == 1) {
            return v.e(v.o0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final <K> Map<K, Integer> mapToIndex(Iterable<? extends K> iterable) {
        s.k(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i11));
            i11++;
        }
        return linkedHashMap;
    }

    public static final <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i11) {
        return new HashMap<>(a(i11));
    }

    public static final <E> HashSet<E> newHashSetWithExpectedSize(int i11) {
        return new HashSet<>(a(i11));
    }

    public static final <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i11) {
        return new LinkedHashSet<>(a(i11));
    }
}
