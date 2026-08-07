package p013kotlin.reflect.jvm.internal.impl.name;

import bo0.n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class StandardClassIdsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId a(String str) {
        FqName base_annotation_package = StandardClassIds.INSTANCE.getBASE_ANNOTATION_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        s.j(nameIdentifier, "identifier(...)");
        return new ClassId(base_annotation_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId b(String str) {
        FqName base_kotlin_package = StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        s.j(nameIdentifier, "identifier(...)");
        return new ClassId(base_kotlin_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId c(String str) {
        FqName base_collections_package = StandardClassIds.INSTANCE.getBASE_COLLECTIONS_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        s.j(nameIdentifier, "identifier(...)");
        return new ClassId(base_collections_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId d(String str) {
        FqName base_coroutines_package = StandardClassIds.INSTANCE.getBASE_COROUTINES_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        s.j(nameIdentifier, "identifier(...)");
        return new ClassId(base_coroutines_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId e(String str) {
        FqName base_enums_package = StandardClassIds.INSTANCE.getBASE_ENUMS_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        s.j(nameIdentifier, "identifier(...)");
        return new ClassId(base_enums_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<V, K> f(Map<K, ? extends V> map) {
        Set<Map.Entry<K, ? extends V>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = x.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId g(Name name) {
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        FqName packageFqName = standardClassIds.getArray().getPackageFqName();
        Name nameIdentifier = Name.identifier(name.getIdentifier() + standardClassIds.getArray().getShortClassName().getIdentifier());
        s.j(nameIdentifier, "identifier(...)");
        return new ClassId(packageFqName, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId h(String str) {
        FqName base_ranges_package = StandardClassIds.INSTANCE.getBASE_RANGES_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        s.j(nameIdentifier, "identifier(...)");
        return new ClassId(base_ranges_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId i(String str) {
        FqName base_reflect_package = StandardClassIds.INSTANCE.getBASE_REFLECT_PACKAGE();
        Name nameIdentifier = Name.identifier(str);
        s.j(nameIdentifier, "identifier(...)");
        return new ClassId(base_reflect_package, nameIdentifier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassId j(ClassId classId) {
        FqName base_kotlin_package = StandardClassIds.INSTANCE.getBASE_KOTLIN_PACKAGE();
        Name nameIdentifier = Name.identifier('U' + classId.getShortClassName().getIdentifier());
        s.j(nameIdentifier, "identifier(...)");
        return new ClassId(base_kotlin_package, nameIdentifier);
    }
}
