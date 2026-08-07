package p013kotlin.reflect.jvm.internal.impl.types;

import co0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import p013kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import p013kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import wn0.l;
import xn0.a;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> implements Iterable<TypeAttribute<?>>, a {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final TypeAttributes f88913b = new TypeAttributes((List<? extends TypeAttribute<?>>) v.m());

    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeAttributes create(List<? extends TypeAttribute<?>> attributes) {
            s.k(attributes, "attributes");
            return attributes.isEmpty() ? getEmpty() : new TypeAttributes(attributes, null);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int customComputeIfAbsent(ConcurrentHashMap<String, Integer> concurrentHashMap, String key, l<? super String, Integer> compute) {
            int iIntValue;
            s.k(concurrentHashMap, "<this>");
            s.k(key, "key");
            s.k(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Integer numInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(numInvoke.intValue()));
                        iIntValue = numInvoke.intValue();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iIntValue;
        }

        public final TypeAttributes getEmpty() {
            return TypeAttributes.f88913b;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends TypeAttribute<?>>) list);
    }

    public final TypeAttributes add(TypeAttributes other) {
        TypeAttribute typeAttributeAdd;
        s.k(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.c().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = b().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = other.b().get(iIntValue);
            if (typeAttribute == null) {
                typeAttributeAdd = typeAttribute2 != null ? typeAttribute2.add(typeAttribute) : null;
            } else {
                typeAttributeAdd = typeAttribute.add(typeAttribute2);
            }
            CollectionsKt.addIfNotNull(arrayList, typeAttributeAdd);
        }
        return Companion.create(arrayList);
    }

    public final boolean contains(TypeAttribute<?> attribute) {
        s.k(attribute, "attribute");
        return b().get(Companion.getId((d) attribute.getKey())) != null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    protected TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> d() {
        return Companion;
    }

    public final TypeAttributes intersect(TypeAttributes other) {
        TypeAttribute typeAttributeIntersect;
        s.k(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.c().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = b().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = other.b().get(iIntValue);
            if (typeAttribute == null) {
                typeAttributeIntersect = typeAttribute2 != null ? typeAttribute2.intersect(typeAttribute) : null;
            } else {
                typeAttributeIntersect = typeAttribute.intersect(typeAttribute2);
            }
            CollectionsKt.addIfNotNull(arrayList, typeAttributeIntersect);
        }
        return Companion.create(arrayList);
    }

    public final TypeAttributes plus(TypeAttribute<?> attribute) {
        s.k(attribute, "attribute");
        if (contains(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(attribute);
        }
        return Companion.create(v.Q0(v.m1(this), attribute));
    }

    public final TypeAttributes remove(TypeAttribute<?> attribute) {
        s.k(attribute, "attribute");
        if (!isEmpty()) {
            ArrayMap<TypeAttribute<?>> arrayMapB = b();
            ArrayList arrayList = new ArrayList();
            for (TypeAttribute<?> typeAttribute : arrayMapB) {
                if (!s.f(typeAttribute, attribute)) {
                    arrayList.add(typeAttribute);
                }
            }
            if (arrayList.size() != b().getSize()) {
                return Companion.create(arrayList);
            }
        }
        return this;
    }

    private TypeAttributes(List<? extends TypeAttribute<?>> list) {
        for (TypeAttribute<?> typeAttribute : list) {
            e(typeAttribute.getKey(), typeAttribute);
        }
    }

    private TypeAttributes(TypeAttribute<?> typeAttribute) {
        this((List<? extends TypeAttribute<?>>) v.e(typeAttribute));
    }
}
