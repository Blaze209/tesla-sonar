package p013kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.StandardClassIds;

/* JADX INFO: loaded from: classes9.dex */
public final class FakePureImplementationsProvider {
    public static final FakePureImplementationsProvider INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<ClassId, ClassId> f87073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<FqName, FqName> f87074b;

    static {
        FakePureImplementationsProvider fakePureImplementationsProvider = new FakePureImplementationsProvider();
        INSTANCE = fakePureImplementationsProvider;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f87073a = linkedHashMap;
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        fakePureImplementationsProvider.b(standardClassIds.getMutableList(), fakePureImplementationsProvider.a("java.util.ArrayList", "java.util.LinkedList"));
        fakePureImplementationsProvider.b(standardClassIds.getMutableSet(), fakePureImplementationsProvider.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        fakePureImplementationsProvider.b(standardClassIds.getMutableMap(), fakePureImplementationsProvider.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        ClassId.Companion companion = ClassId.Companion;
        fakePureImplementationsProvider.b(companion.topLevel(new FqName("java.util.function.Function")), fakePureImplementationsProvider.a("java.util.function.UnaryOperator"));
        fakePureImplementationsProvider.b(companion.topLevel(new FqName("java.util.function.BiFunction")), fakePureImplementationsProvider.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(x.a(((ClassId) entry.getKey()).asSingleFqName(), ((ClassId) entry.getValue()).asSingleFqName()));
        }
        f87074b = v0.y(arrayList);
    }

    private FakePureImplementationsProvider() {
    }

    private final List<ClassId> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ClassId.Companion.topLevel(new FqName(str)));
        }
        return arrayList;
    }

    private final void b(ClassId classId, List<ClassId> list) {
        Map<ClassId, ClassId> map = f87073a;
        for (Object obj : list) {
            map.put((ClassId) obj, classId);
        }
    }

    public final FqName getPurelyImplementedInterface(FqName classFqName) {
        s.k(classFqName, "classFqName");
        return f87074b.get(classFqName);
    }
}
