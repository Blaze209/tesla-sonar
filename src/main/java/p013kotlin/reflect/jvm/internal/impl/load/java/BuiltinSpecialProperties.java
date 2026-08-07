package p013kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
public final class BuiltinSpecialProperties {
    public static final BuiltinSpecialProperties INSTANCE = new BuiltinSpecialProperties();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<FqName, Name> f87067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Name, List<Name>> f87068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<FqName> f87069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<FqName> f87070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Set<Name> f87071e;

    static {
        FqNameUnsafe fqNameUnsafe = StandardNames.FqNames._enum;
        Pair pairA = x.a(BuiltinSpecialPropertiesKt.b(fqNameUnsafe, "name"), StandardNames.NAME);
        Pair pairA2 = x.a(BuiltinSpecialPropertiesKt.b(fqNameUnsafe, "ordinal"), Name.identifier("ordinal"));
        Pair pairA3 = x.a(BuiltinSpecialPropertiesKt.a(StandardNames.FqNames.collection, "size"), Name.identifier("size"));
        FqName fqName = StandardNames.FqNames.map;
        Map<FqName, Name> mapM = v0.m(pairA, pairA2, pairA3, x.a(BuiltinSpecialPropertiesKt.a(fqName, "size"), Name.identifier("size")), x.a(BuiltinSpecialPropertiesKt.b(StandardNames.FqNames.charSequence, "length"), Name.identifier("length")), x.a(BuiltinSpecialPropertiesKt.a(fqName, "keys"), Name.identifier("keySet")), x.a(BuiltinSpecialPropertiesKt.a(fqName, "values"), Name.identifier("values")), x.a(BuiltinSpecialPropertiesKt.a(fqName, "entries"), Name.identifier("entrySet")));
        f87067a = mapM;
        Set<Map.Entry<FqName, Name>> setEntrySet = mapM.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(v.y(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((FqName) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            Name name = (Name) pair.f();
            Object arrayList2 = linkedHashMap.get(name);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(name, arrayList2);
            }
            ((List) arrayList2).add((Name) pair.e());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), v.h0((Iterable) entry2.getValue()));
        }
        f87068b = linkedHashMap2;
        Map<FqName, Name> map = f87067a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<FqName, Name> entry3 : map.entrySet()) {
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            FqNameUnsafe unsafe = entry3.getKey().parent().toUnsafe();
            s.j(unsafe, "toUnsafe(...)");
            ClassId classIdMapKotlinToJava = javaToKotlinClassMap.mapKotlinToJava(unsafe);
            s.h(classIdMapKotlinToJava);
            linkedHashSet.add(classIdMapKotlinToJava.asSingleFqName().child(entry3.getValue()));
        }
        f87069c = linkedHashSet;
        Set<FqName> setKeySet = f87067a.keySet();
        f87070d = setKeySet;
        Set<FqName> set = setKeySet;
        ArrayList arrayList3 = new ArrayList(v.y(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((FqName) it2.next()).shortName());
        }
        f87071e = v.r1(arrayList3);
    }

    private BuiltinSpecialProperties() {
    }

    public final Map<FqName, Name> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return f87067a;
    }

    public final List<Name> getPropertyNameCandidatesBySpecialGetterName(Name name1) {
        s.k(name1, "name1");
        List<Name> list = f87068b.get(name1);
        return list == null ? v.m() : list;
    }

    public final Set<FqName> getSPECIAL_FQ_NAMES() {
        return f87070d;
    }

    public final Set<Name> getSPECIAL_SHORT_NAMES() {
        return f87071e;
    }
}
