package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import p013kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import p013kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaToKotlinClassMap {
    public static final JavaToKotlinClassMap INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f86618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f86619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f86620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f86621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ClassId f86622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final FqName f86623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ClassId f86624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final ClassId f86625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final ClassId f86626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, ClassId> f86627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, ClassId> f86628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, FqName> f86629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, FqName> f86630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final HashMap<ClassId, ClassId> f86631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final HashMap<ClassId, ClassId> f86632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final List<PlatformMutabilityMapping> f86633p;

    public static final class PlatformMutabilityMapping {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClassId f86634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClassId f86635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ClassId f86636c;

        public PlatformMutabilityMapping(ClassId javaClass, ClassId kotlinReadOnly, ClassId kotlinMutable) {
            s.k(javaClass, "javaClass");
            s.k(kotlinReadOnly, "kotlinReadOnly");
            s.k(kotlinMutable, "kotlinMutable");
            this.f86634a = javaClass;
            this.f86635b = kotlinReadOnly;
            this.f86636c = kotlinMutable;
        }

        public final ClassId component1() {
            return this.f86634a;
        }

        public final ClassId component2() {
            return this.f86635b;
        }

        public final ClassId component3() {
            return this.f86636c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return s.f(this.f86634a, platformMutabilityMapping.f86634a) && s.f(this.f86635b, platformMutabilityMapping.f86635b) && s.f(this.f86636c, platformMutabilityMapping.f86636c);
        }

        public final ClassId getJavaClass() {
            return this.f86634a;
        }

        public int hashCode() {
            return (((this.f86634a.hashCode() * 31) + this.f86635b.hashCode()) * 31) + this.f86636c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f86634a + ", kotlinReadOnly=" + this.f86635b + ", kotlinMutable=" + this.f86636c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        sb2.append(function.getPackageFqName());
        sb2.append(CoreConstants.DOT);
        sb2.append(function.getClassNamePrefix());
        f86618a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.INSTANCE;
        sb3.append(kFunction.getPackageFqName());
        sb3.append(CoreConstants.DOT);
        sb3.append(kFunction.getClassNamePrefix());
        f86619b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
        sb4.append(suspendFunction.getPackageFqName());
        sb4.append(CoreConstants.DOT);
        sb4.append(suspendFunction.getClassNamePrefix());
        f86620c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.INSTANCE;
        sb5.append(kSuspendFunction.getPackageFqName());
        sb5.append(CoreConstants.DOT);
        sb5.append(kSuspendFunction.getClassNamePrefix());
        f86621d = sb5.toString();
        ClassId.Companion companion = ClassId.Companion;
        ClassId classId = companion.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        f86622e = classId;
        f86623f = classId.asSingleFqName();
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        f86624g = standardClassIds.getKFunction();
        f86625h = standardClassIds.getKClass();
        f86626i = javaToKotlinClassMap.g(Class.class);
        f86627j = new HashMap<>();
        f86628k = new HashMap<>();
        f86629l = new HashMap<>();
        f86630m = new HashMap<>();
        f86631n = new HashMap<>();
        f86632o = new HashMap<>();
        ClassId classId2 = companion.topLevel(StandardNames.FqNames.iterable);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Iterable.class), classId2, new ClassId(classId2.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterable, classId2.getPackageFqName()), false));
        ClassId classId3 = companion.topLevel(StandardNames.FqNames.iterator);
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Iterator.class), classId3, new ClassId(classId3.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterator, classId3.getPackageFqName()), false));
        ClassId classId4 = companion.topLevel(StandardNames.FqNames.collection);
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Collection.class), classId4, new ClassId(classId4.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableCollection, classId4.getPackageFqName()), false));
        ClassId classId5 = companion.topLevel(StandardNames.FqNames.list);
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(List.class), classId5, new ClassId(classId5.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableList, classId5.getPackageFqName()), false));
        ClassId classId6 = companion.topLevel(StandardNames.FqNames.set);
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Set.class), classId6, new ClassId(classId6.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableSet, classId6.getPackageFqName()), false));
        ClassId classId7 = companion.topLevel(StandardNames.FqNames.listIterator);
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(ListIterator.class), classId7, new ClassId(classId7.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableListIterator, classId7.getPackageFqName()), false));
        FqName fqName = StandardNames.FqNames.map;
        ClassId classId8 = companion.topLevel(fqName);
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Map.class), classId8, new ClassId(classId8.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMap, classId8.getPackageFqName()), false));
        ClassId classId9 = companion.topLevel(fqName);
        Name nameShortName = StandardNames.FqNames.mapEntry.shortName();
        s.j(nameShortName, "shortName(...)");
        ClassId classIdCreateNestedClassId = classId9.createNestedClassId(nameShortName);
        List<PlatformMutabilityMapping> listP = v.p(platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(javaToKotlinClassMap.g(Map.Entry.class), classIdCreateNestedClassId, new ClassId(classIdCreateNestedClassId.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMapEntry, classIdCreateNestedClassId.getPackageFqName()), false)));
        f86633p = listP;
        javaToKotlinClassMap.f(Object.class, StandardNames.FqNames.any);
        javaToKotlinClassMap.f(String.class, StandardNames.FqNames.string);
        javaToKotlinClassMap.f(CharSequence.class, StandardNames.FqNames.charSequence);
        javaToKotlinClassMap.e(Throwable.class, StandardNames.FqNames.throwable);
        javaToKotlinClassMap.f(Cloneable.class, StandardNames.FqNames.cloneable);
        javaToKotlinClassMap.f(Number.class, StandardNames.FqNames.number);
        javaToKotlinClassMap.e(Comparable.class, StandardNames.FqNames.comparable);
        javaToKotlinClassMap.f(Enum.class, StandardNames.FqNames._enum);
        javaToKotlinClassMap.e(Annotation.class, StandardNames.FqNames.annotation);
        Iterator<PlatformMutabilityMapping> it = listP.iterator();
        while (it.hasNext()) {
            INSTANCE.d(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId.Companion companion2 = ClassId.Companion;
            FqName wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            s.j(wrapperFqName, "getWrapperFqName(...)");
            ClassId classId10 = companion2.topLevel(wrapperFqName);
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            s.j(primitiveType, "getPrimitiveType(...)");
            javaToKotlinClassMap2.a(classId10, companion2.topLevel(StandardNames.getPrimitiveFqName(primitiveType)));
        }
        for (ClassId classId11 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            INSTANCE.a(ClassId.Companion.topLevel(new FqName("kotlin.jvm.internal." + classId11.getShortClassName().asString() + "CompanionObject")), classId11.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT));
        }
        for (int i11 = 0; i11 < 23; i11++) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            javaToKotlinClassMap3.a(ClassId.Companion.topLevel(new FqName("kotlin.jvm.functions.Function" + i11)), StandardNames.getFunctionClassId(i11));
            javaToKotlinClassMap3.c(new FqName(f86619b + i11), f86624g);
        }
        for (int i12 = 0; i12 < 22; i12++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.INSTANCE;
            INSTANCE.c(new FqName((kSuspendFunction2.getPackageFqName() + CoreConstants.DOT + kSuspendFunction2.getClassNamePrefix()) + i12), f86624g);
        }
        JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
        FqName safe = StandardNames.FqNames.nothing.toSafe();
        s.j(safe, "toSafe(...)");
        javaToKotlinClassMap4.c(safe, javaToKotlinClassMap4.g(Void.class));
    }

    private JavaToKotlinClassMap() {
    }

    private final void a(ClassId classId, ClassId classId2) {
        b(classId, classId2);
        c(classId2.asSingleFqName(), classId);
    }

    private final void b(ClassId classId, ClassId classId2) {
        f86627j.put(classId.asSingleFqName().toUnsafe(), classId2);
    }

    private final void c(FqName fqName, ClassId classId) {
        f86628k.put(fqName.toUnsafe(), classId);
    }

    private final void d(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId classIdComponent1 = platformMutabilityMapping.component1();
        ClassId classIdComponent2 = platformMutabilityMapping.component2();
        ClassId classIdComponent3 = platformMutabilityMapping.component3();
        a(classIdComponent1, classIdComponent2);
        c(classIdComponent3.asSingleFqName(), classIdComponent1);
        f86631n.put(classIdComponent3, classIdComponent2);
        f86632o.put(classIdComponent2, classIdComponent3);
        FqName fqNameAsSingleFqName = classIdComponent2.asSingleFqName();
        FqName fqNameAsSingleFqName2 = classIdComponent3.asSingleFqName();
        f86629l.put(classIdComponent3.asSingleFqName().toUnsafe(), fqNameAsSingleFqName);
        f86630m.put(fqNameAsSingleFqName.toUnsafe(), fqNameAsSingleFqName2);
    }

    private final void e(Class<?> cls, FqName fqName) {
        a(g(cls), ClassId.Companion.topLevel(fqName));
    }

    private final void f(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        FqName safe = fqNameUnsafe.toSafe();
        s.j(safe, "toSafe(...)");
        e(cls, safe);
    }

    private final ClassId g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            return ClassId.Companion.topLevel(new FqName(cls.getCanonicalName()));
        }
        ClassId classIdG = g(declaringClass);
        Name nameIdentifier = Name.identifier(cls.getSimpleName());
        s.j(nameIdentifier, "identifier(...)");
        return classIdG.createNestedClassId(nameIdentifier);
    }

    private final boolean h(FqNameUnsafe fqNameUnsafe, String str) {
        Integer numX;
        String strAsString = fqNameUnsafe.asString();
        s.j(strAsString, "asString(...)");
        if (!t.b0(strAsString, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strAsString.substring(str.length());
        s.j(strSubstring, "substring(...)");
        return (t.j1(strSubstring, '0', false, 2, null) || (numX = t.x(strSubstring)) == null || numX.intValue() < 23) ? false : true;
    }

    public final FqName getFUNCTION_N_FQ_NAME() {
        return f86623f;
    }

    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return f86633p;
    }

    public final boolean isMutable(FqNameUnsafe fqNameUnsafe) {
        return f86629l.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(FqNameUnsafe fqNameUnsafe) {
        return f86630m.containsKey(fqNameUnsafe);
    }

    public final ClassId mapJavaToKotlin(FqName fqName) {
        s.k(fqName, "fqName");
        return f86627j.get(fqName.toUnsafe());
    }

    public final ClassId mapKotlinToJava(FqNameUnsafe kotlinFqName) {
        s.k(kotlinFqName, "kotlinFqName");
        if (h(kotlinFqName, f86618a)) {
            return f86622e;
        }
        if (h(kotlinFqName, f86620c)) {
            return f86622e;
        }
        if (h(kotlinFqName, f86619b)) {
            return f86624g;
        }
        return h(kotlinFqName, f86621d) ? f86624g : f86628k.get(kotlinFqName);
    }

    public final FqName mutableToReadOnly(FqNameUnsafe fqNameUnsafe) {
        return f86629l.get(fqNameUnsafe);
    }

    public final FqName readOnlyToMutable(FqNameUnsafe fqNameUnsafe) {
        return f86630m.get(fqNameUnsafe);
    }
}
