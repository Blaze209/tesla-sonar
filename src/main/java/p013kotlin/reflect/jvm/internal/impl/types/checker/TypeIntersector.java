package p013kotlin.reflect.jvm.internal.impl.types.checker;

import co0.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import p013kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import p013kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
public final class TypeIntersector {
    public static final TypeIntersector INSTANCE = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a START = new c("START", 0);
        public static final a ACCEPT_NULL = new C1871a("ACCEPT_NULL", 1);
        public static final a UNKNOWN = new d("UNKNOWN", 2);
        public static final a NOT_NULL = new b("NOT_NULL", 3);

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$a$a, reason: collision with other inner class name */
        static final class C1871a extends a {
            C1871a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            public a combine(UnwrappedType nextType) {
                s.k(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        static final class b extends a {
            b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b combine(UnwrappedType nextType) {
                s.k(nextType, "nextType");
                return this;
            }
        }

        static final class c extends a {
            c(String str, int i11) {
                super(str, i11, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            public a combine(UnwrappedType nextType) {
                s.k(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        static final class d extends a {
            d(String str, int i11) {
                super(str, i11, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.a
            public a combine(UnwrappedType nextType) {
                s.k(nextType, "nextType");
                a resultNullability = getResultNullability(nextType);
                return resultNullability == a.ACCEPT_NULL ? this : resultNullability;
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = on0.a.a(aVarArr$values);
        }

        public /* synthetic */ a(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public abstract a combine(UnwrappedType unwrappedType);

        protected final a getResultNullability(UnwrappedType unwrappedType) {
            s.k(unwrappedType, "<this>");
            if (unwrappedType.isMarkedNullable()) {
                return ACCEPT_NULL;
            }
            if ((unwrappedType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) unwrappedType).getOriginal() instanceof StubTypeForBuilderInference)) {
                return NOT_NULL;
            }
            if (unwrappedType instanceof StubTypeForBuilderInference) {
                return UNKNOWN;
            }
            return NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType) ? NOT_NULL : UNKNOWN;
        }

        private a(String str, int i11) {
            super(str, i11);
        }
    }

    /* synthetic */ class b extends o implements p<KotlinType, KotlinType, Boolean> {
        b(Object obj) {
            super(2, obj);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(KotlinType p11, KotlinType p12) {
            s.k(p11, "p0");
            s.k(p12, "p1");
            return Boolean.valueOf(((TypeIntersector) this.receiver).e(p11, p12));
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "isStrictSupertype";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(TypeIntersector.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    /* synthetic */ class c extends o implements p<KotlinType, KotlinType, Boolean> {
        c(Object obj) {
            super(2, obj);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(KotlinType p11, KotlinType p12) {
            s.k(p11, "p0");
            s.k(p12, "p1");
            return Boolean.valueOf(((NewKotlinTypeCheckerImpl) this.receiver).equalTypes(p11, p12));
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "equalTypes";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(NewKotlinTypeCheckerImpl.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
        }
    }

    private TypeIntersector() {
    }

    private final Collection<SimpleType> b(Collection<? extends SimpleType> collection, p<? super SimpleType, ? super SimpleType, Boolean> pVar) {
        ArrayList<SimpleType> arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        s.j(it, "iterator(...)");
        while (it.hasNext()) {
            SimpleType simpleType = (SimpleType) it.next();
            if (!arrayList.isEmpty()) {
                for (SimpleType simpleType2 : arrayList) {
                    if (simpleType2 != simpleType) {
                        s.h(simpleType2);
                        s.h(simpleType);
                        if (pVar.invoke(simpleType2, simpleType).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final SimpleType c(Set<? extends SimpleType> set) {
        if (set.size() == 1) {
            return (SimpleType) v.T0(set);
        }
        new g(set);
        Set<? extends SimpleType> set2 = set;
        Collection<SimpleType> collectionB = b(set2, new b(this));
        collectionB.isEmpty();
        SimpleType simpleTypeFindIntersectionType = IntegerLiteralTypeConstructor.Companion.findIntersectionType(collectionB);
        if (simpleTypeFindIntersectionType != null) {
            return simpleTypeFindIntersectionType;
        }
        Collection<SimpleType> collectionB2 = b(collectionB, new c(NewKotlinTypeChecker.Companion.getDefault()));
        collectionB2.isEmpty();
        return collectionB2.size() < 2 ? (SimpleType) v.T0(collectionB2) : new IntersectionTypeConstructor(set2).createType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(Set set) {
        return "This collections cannot be empty! input types: " + v.y0(set, null, null, null, 0, null, null, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(KotlinType kotlinType, KotlinType kotlinType2) {
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.getDefault();
        return newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType, kotlinType2) && !newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType2, kotlinType);
    }

    public final SimpleType intersectTypes$descriptors(List<? extends SimpleType> types) {
        s.k(types, "types");
        types.size();
        ArrayList<SimpleType> arrayList = new ArrayList();
        for (SimpleType simpleType : types) {
            if (simpleType.getConstructor() instanceof IntersectionTypeConstructor) {
                Collection<KotlinType> supertypes = simpleType.getConstructor().getSupertypes();
                s.j(supertypes, "getSupertypes(...)");
                Collection<KotlinType> collection = supertypes;
                ArrayList arrayList2 = new ArrayList(v.y(collection, 10));
                for (KotlinType kotlinType : collection) {
                    s.h(kotlinType);
                    SimpleType simpleTypeUpperIfFlexible = FlexibleTypesKt.upperIfFlexible(kotlinType);
                    if (simpleType.isMarkedNullable()) {
                        simpleTypeUpperIfFlexible = simpleTypeUpperIfFlexible.makeNullableAsSpecified(true);
                    }
                    arrayList2.add(simpleTypeUpperIfFlexible);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(simpleType);
            }
        }
        a aVarCombine = a.START;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aVarCombine = aVarCombine.combine((UnwrappedType) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SimpleType simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default : arrayList) {
            if (aVarCombine == a.NOT_NULL) {
                if (simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default instanceof NewCapturedType) {
                    simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default = SpecialTypesKt.withNotNullProjection((NewCapturedType) simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default);
                }
                simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull$default(simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default, false, 1, null);
            }
            linkedHashSet.add(simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default);
        }
        List<? extends SimpleType> list = types;
        ArrayList arrayList3 = new ArrayList(v.y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((SimpleType) it2.next()).getAttributes());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((TypeAttributes) next).intersect((TypeAttributes) it3.next());
        }
        return c(linkedHashSet).replaceAttributes((TypeAttributes) next);
    }
}
