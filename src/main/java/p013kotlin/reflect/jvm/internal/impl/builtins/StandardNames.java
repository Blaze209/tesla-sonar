package p013kotlin.reflect.jvm.internal.impl.builtins;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class StandardNames {
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;
    public static final Name BACKING_FIELD;
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;
    public static final Name BUILT_INS_PACKAGE_NAME;
    public static final Name CHAR_CODE;
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;
    public static final String DATA_CLASS_COMPONENT_PREFIX;
    public static final Name DATA_CLASS_COPY;
    public static final Name DEFAULT_VALUE_PARAMETER;
    public static final FqName DYNAMIC_FQ_NAME;
    public static final Name ENUM_ENTRIES;
    public static final Name ENUM_VALUES;
    public static final Name ENUM_VALUE_OF;
    public static final Name EQUALS_NAME;
    public static final Name HASHCODE_NAME;
    public static final Name IMPLICIT_LAMBDA_PARAMETER_NAME;
    public static final StandardNames INSTANCE = new StandardNames();
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;
    public static final FqName KOTLIN_REFLECT_FQ_NAME;
    public static final Name MAIN;
    public static final Name NAME;
    public static final Name NEXT_CHAR;
    public static final List<String> PREFIXES;
    public static final FqName RANGES_PACKAGE_FQ_NAME;
    public static final FqName RESULT_FQ_NAME;
    public static final FqName TEXT_PACKAGE_FQ_NAME;
    public static final Name TO_STRING_NAME;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final FqName f86580a;

    public static final class FqNames {
        public static final FqNames INSTANCE;
        public static final FqNameUnsafe _boolean;
        public static final FqNameUnsafe _byte;
        public static final FqNameUnsafe _char;
        public static final FqNameUnsafe _double;
        public static final FqNameUnsafe _enum;
        public static final FqNameUnsafe _float;
        public static final FqNameUnsafe _int;
        public static final FqNameUnsafe _long;
        public static final FqNameUnsafe _short;
        public static final FqName accessibleLateinitPropertyLiteral;
        public static final FqName annotation;
        public static final FqName annotationRetention;
        public static final FqName annotationTarget;
        public static final FqNameUnsafe any;
        public static final FqNameUnsafe array;
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;
        public static final FqNameUnsafe charSequence;
        public static final FqNameUnsafe cloneable;
        public static final FqName collection;
        public static final FqName comparable;
        public static final FqName contextFunctionTypeParams;
        public static final FqName deprecated;
        public static final FqName deprecatedSinceKotlin;
        public static final FqName deprecationLevel;
        public static final FqName extensionFunctionType;
        public static final FqNameUnsafe findAssociatedObject;
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;
        public static final FqNameUnsafe functionSupertype;
        public static final FqNameUnsafe intRange;
        public static final FqName iterable;
        public static final FqName iterator;
        public static final FqNameUnsafe kCallable;
        public static final FqNameUnsafe kClass;
        public static final FqNameUnsafe kDeclarationContainer;
        public static final FqNameUnsafe kMutableProperty0;
        public static final FqNameUnsafe kMutableProperty1;
        public static final FqNameUnsafe kMutableProperty2;
        public static final FqNameUnsafe kMutablePropertyFqName;
        public static final ClassId kProperty;
        public static final FqNameUnsafe kProperty0;
        public static final FqNameUnsafe kProperty1;
        public static final FqNameUnsafe kProperty2;
        public static final FqNameUnsafe kPropertyFqName;
        public static final FqNameUnsafe kType;
        public static final FqName list;
        public static final FqName listIterator;
        public static final FqNameUnsafe longRange;
        public static final FqName map;
        public static final FqName mapEntry;
        public static final FqName mustBeDocumented;
        public static final FqName mutableCollection;
        public static final FqName mutableIterable;
        public static final FqName mutableIterator;
        public static final FqName mutableList;
        public static final FqName mutableListIterator;
        public static final FqName mutableMap;
        public static final FqName mutableMapEntry;
        public static final FqName mutableSet;
        public static final FqNameUnsafe nothing;
        public static final FqNameUnsafe number;
        public static final FqName parameterName;
        public static final ClassId parameterNameClassId;
        public static final FqName platformDependent;
        public static final ClassId platformDependentClassId;
        public static final Set<Name> primitiveArrayTypeShortNames;
        public static final Set<Name> primitiveTypeShortNames;
        public static final FqName publishedApi;
        public static final FqName repeatable;
        public static final ClassId repeatableClassId;
        public static final FqName replaceWith;
        public static final FqName retention;
        public static final ClassId retentionClassId;
        public static final FqName set;
        public static final FqNameUnsafe string;
        public static final FqName suppress;
        public static final FqName target;
        public static final ClassId targetClassId;
        public static final FqName throwable;
        public static final ClassId uByte;
        public static final FqName uByteArrayFqName;
        public static final FqName uByteFqName;
        public static final ClassId uInt;
        public static final FqName uIntArrayFqName;
        public static final FqName uIntFqName;
        public static final ClassId uLong;
        public static final FqName uLongArrayFqName;
        public static final FqName uLongFqName;
        public static final ClassId uShort;
        public static final FqName uShortArrayFqName;
        public static final FqName uShortFqName;
        public static final FqNameUnsafe unit;
        public static final FqName unsafeVariance;

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            any = fqNames.d("Any");
            nothing = fqNames.d("Nothing");
            cloneable = fqNames.d("Cloneable");
            suppress = fqNames.c("Suppress");
            unit = fqNames.d("Unit");
            charSequence = fqNames.d("CharSequence");
            string = fqNames.d("String");
            array = fqNames.d("Array");
            _boolean = fqNames.d("Boolean");
            _char = fqNames.d("Char");
            _byte = fqNames.d("Byte");
            _short = fqNames.d("Short");
            _int = fqNames.d("Int");
            _long = fqNames.d("Long");
            _float = fqNames.d("Float");
            _double = fqNames.d("Double");
            number = fqNames.d("Number");
            _enum = fqNames.d("Enum");
            functionSupertype = fqNames.d("Function");
            throwable = fqNames.c("Throwable");
            comparable = fqNames.c("Comparable");
            intRange = fqNames.f("IntRange");
            longRange = fqNames.f("LongRange");
            deprecated = fqNames.c("Deprecated");
            deprecatedSinceKotlin = fqNames.c("DeprecatedSinceKotlin");
            deprecationLevel = fqNames.c("DeprecationLevel");
            replaceWith = fqNames.c("ReplaceWith");
            extensionFunctionType = fqNames.c("ExtensionFunctionType");
            contextFunctionTypeParams = fqNames.c("ContextFunctionTypeParams");
            FqName fqNameC = fqNames.c("ParameterName");
            parameterName = fqNameC;
            ClassId.Companion companion = ClassId.Companion;
            parameterNameClassId = companion.topLevel(fqNameC);
            annotation = fqNames.c("Annotation");
            FqName fqNameA = fqNames.a("Target");
            target = fqNameA;
            targetClassId = companion.topLevel(fqNameA);
            annotationTarget = fqNames.a("AnnotationTarget");
            annotationRetention = fqNames.a("AnnotationRetention");
            FqName fqNameA2 = fqNames.a("Retention");
            retention = fqNameA2;
            retentionClassId = companion.topLevel(fqNameA2);
            FqName fqNameA3 = fqNames.a("Repeatable");
            repeatable = fqNameA3;
            repeatableClassId = companion.topLevel(fqNameA3);
            mustBeDocumented = fqNames.a("MustBeDocumented");
            unsafeVariance = fqNames.c("UnsafeVariance");
            publishedApi = fqNames.c("PublishedApi");
            accessibleLateinitPropertyLiteral = fqNames.e("AccessibleLateinitPropertyLiteral");
            FqName fqName = new FqName("kotlin.internal.PlatformDependent");
            platformDependent = fqName;
            platformDependentClassId = companion.topLevel(fqName);
            iterator = fqNames.b("Iterator");
            iterable = fqNames.b("Iterable");
            collection = fqNames.b("Collection");
            list = fqNames.b("List");
            listIterator = fqNames.b("ListIterator");
            set = fqNames.b("Set");
            FqName fqNameB = fqNames.b("Map");
            map = fqNameB;
            FqName fqNameChild = fqNameB.child(Name.identifier("Entry"));
            s.j(fqNameChild, "child(...)");
            mapEntry = fqNameChild;
            mutableIterator = fqNames.b("MutableIterator");
            mutableIterable = fqNames.b("MutableIterable");
            mutableCollection = fqNames.b("MutableCollection");
            mutableList = fqNames.b("MutableList");
            mutableListIterator = fqNames.b("MutableListIterator");
            mutableSet = fqNames.b("MutableSet");
            FqName fqNameB2 = fqNames.b("MutableMap");
            mutableMap = fqNameB2;
            FqName fqNameChild2 = fqNameB2.child(Name.identifier("MutableEntry"));
            s.j(fqNameChild2, "child(...)");
            mutableMapEntry = fqNameChild2;
            kClass = reflect("KClass");
            kType = reflect("KType");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeReflect = reflect("KProperty");
            kPropertyFqName = fqNameUnsafeReflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            FqName safe = fqNameUnsafeReflect.toSafe();
            s.j(safe, "toSafe(...)");
            kProperty = companion.topLevel(safe);
            kDeclarationContainer = reflect("KDeclarationContainer");
            findAssociatedObject = reflect("findAssociatedObject");
            FqName fqNameC2 = fqNames.c("UByte");
            uByteFqName = fqNameC2;
            FqName fqNameC3 = fqNames.c("UShort");
            uShortFqName = fqNameC3;
            FqName fqNameC4 = fqNames.c("UInt");
            uIntFqName = fqNameC4;
            FqName fqNameC5 = fqNames.c("ULong");
            uLongFqName = fqNameC5;
            uByte = companion.topLevel(fqNameC2);
            uShort = companion.topLevel(fqNameC3);
            uInt = companion.topLevel(fqNameC4);
            uLong = companion.topLevel(fqNameC5);
            uByteArrayFqName = fqNames.c("UByteArray");
            uShortArrayFqName = fqNames.c("UShortArray");
            uIntArrayFqName = fqNames.c("UIntArray");
            uLongArrayFqName = fqNames.c("ULongArray");
            HashSet hashSetNewHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = hashSetNewHashSetWithExpectedSize;
            HashSet hashSetNewHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = hashSetNewHashSetWithExpectedSize2;
            HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String strAsString = primitiveType3.getTypeName().asString();
                s.j(strAsString, "asString(...)");
                mapNewHashMapWithExpectedSize.put(fqNames2.d(strAsString), primitiveType3);
            }
            fqNameToPrimitiveType = mapNewHashMapWithExpectedSize;
            HashMap mapNewHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames3 = INSTANCE;
                String strAsString2 = primitiveType4.getArrayTypeName().asString();
                s.j(strAsString2, "asString(...)");
                mapNewHashMapWithExpectedSize2.put(fqNames3.d(strAsString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = mapNewHashMapWithExpectedSize2;
        }

        private FqNames() {
        }

        private final FqName a(String str) {
            FqName fqNameChild = StandardNames.ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(str));
            s.j(fqNameChild, "child(...)");
            return fqNameChild;
        }

        private final FqName b(String str) {
            FqName fqNameChild = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            s.j(fqNameChild, "child(...)");
            return fqNameChild;
        }

        private final FqName c(String str) {
            FqName fqNameChild = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            s.j(fqNameChild, "child(...)");
            return fqNameChild;
        }

        private final FqNameUnsafe d(String str) {
            FqNameUnsafe unsafe = c(str).toUnsafe();
            s.j(unsafe, "toUnsafe(...)");
            return unsafe;
        }

        private final FqName e(String str) {
            FqName fqNameChild = StandardNames.KOTLIN_INTERNAL_FQ_NAME.child(Name.identifier(str));
            s.j(fqNameChild, "child(...)");
            return fqNameChild;
        }

        private final FqNameUnsafe f(String str) {
            FqNameUnsafe unsafe = StandardNames.RANGES_PACKAGE_FQ_NAME.child(Name.identifier(str)).toUnsafe();
            s.j(unsafe, "toUnsafe(...)");
            return unsafe;
        }

        public static final FqNameUnsafe reflect(String simpleName) {
            s.k(simpleName, "simpleName");
            FqNameUnsafe unsafe = StandardNames.KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe();
            s.j(unsafe, "toUnsafe(...)");
            return unsafe;
        }
    }

    static {
        Name nameIdentifier = Name.identifier("field");
        s.j(nameIdentifier, "identifier(...)");
        BACKING_FIELD = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("value");
        s.j(nameIdentifier2, "identifier(...)");
        DEFAULT_VALUE_PARAMETER = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("values");
        s.j(nameIdentifier3, "identifier(...)");
        ENUM_VALUES = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("entries");
        s.j(nameIdentifier4, "identifier(...)");
        ENUM_ENTRIES = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier(CoreConstants.VALUE_OF);
        s.j(nameIdentifier5, "identifier(...)");
        ENUM_VALUE_OF = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("copy");
        s.j(nameIdentifier6, "identifier(...)");
        DATA_CLASS_COPY = nameIdentifier6;
        DATA_CLASS_COMPONENT_PREFIX = "component";
        Name nameIdentifier7 = Name.identifier("hashCode");
        s.j(nameIdentifier7, "identifier(...)");
        HASHCODE_NAME = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("toString");
        s.j(nameIdentifier8, "identifier(...)");
        TO_STRING_NAME = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("equals");
        s.j(nameIdentifier9, "identifier(...)");
        EQUALS_NAME = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("code");
        s.j(nameIdentifier10, "identifier(...)");
        CHAR_CODE = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier("name");
        s.j(nameIdentifier11, "identifier(...)");
        NAME = nameIdentifier11;
        Name nameIdentifier12 = Name.identifier("main");
        s.j(nameIdentifier12, "identifier(...)");
        MAIN = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("nextChar");
        s.j(nameIdentifier13, "identifier(...)");
        NEXT_CHAR = nameIdentifier13;
        Name nameIdentifier14 = Name.identifier("it");
        s.j(nameIdentifier14, "identifier(...)");
        IMPLICIT_LAMBDA_PARAMETER_NAME = nameIdentifier14;
        Name nameIdentifier15 = Name.identifier("count");
        s.j(nameIdentifier15, "identifier(...)");
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = nameIdentifier15;
        DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        FqName fqNameChild = fqName.child(Name.identifier("Continuation"));
        s.j(fqNameChild, "child(...)");
        CONTINUATION_INTERFACE_FQ_NAME = fqNameChild;
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = v.p("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        Name nameIdentifier16 = Name.identifier("kotlin");
        s.j(nameIdentifier16, "identifier(...)");
        BUILT_INS_PACKAGE_NAME = nameIdentifier16;
        FqName fqName3 = FqName.topLevel(nameIdentifier16);
        s.j(fqName3, "topLevel(...)");
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName fqNameChild2 = fqName3.child(Name.identifier("annotation"));
        s.j(fqNameChild2, "child(...)");
        ANNOTATION_PACKAGE_FQ_NAME = fqNameChild2;
        FqName fqNameChild3 = fqName3.child(Name.identifier("collections"));
        s.j(fqNameChild3, "child(...)");
        COLLECTIONS_PACKAGE_FQ_NAME = fqNameChild3;
        FqName fqNameChild4 = fqName3.child(Name.identifier("ranges"));
        s.j(fqNameChild4, "child(...)");
        RANGES_PACKAGE_FQ_NAME = fqNameChild4;
        FqName fqNameChild5 = fqName3.child(Name.identifier("text"));
        s.j(fqNameChild5, "child(...)");
        TEXT_PACKAGE_FQ_NAME = fqNameChild5;
        FqName fqNameChild6 = fqName3.child(Name.identifier("internal"));
        s.j(fqNameChild6, "child(...)");
        KOTLIN_INTERNAL_FQ_NAME = fqNameChild6;
        f86580a = new FqName("error.NonExistentClass");
        BUILT_INS_PACKAGE_FQ_NAMES = d1.i(fqName3, fqNameChild3, fqNameChild4, fqNameChild2, fqName2, fqNameChild6, fqName);
    }

    private StandardNames() {
    }

    public static final ClassId getFunctionClassId(int i11) {
        FqName fqName = BUILT_INS_PACKAGE_FQ_NAME;
        Name nameIdentifier = Name.identifier(getFunctionName(i11));
        s.j(nameIdentifier, "identifier(...)");
        return new ClassId(fqName, nameIdentifier);
    }

    public static final String getFunctionName(int i11) {
        return "Function" + i11;
    }

    public static final FqName getPrimitiveFqName(PrimitiveType primitiveType) {
        s.k(primitiveType, "primitiveType");
        FqName fqNameChild = BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
        s.j(fqNameChild, "child(...)");
        return fqNameChild;
    }

    public static final String getSuspendFunctionName(int i11) {
        return FunctionTypeKind.SuspendFunction.INSTANCE.getClassNamePrefix() + i11;
    }

    public static final boolean isPrimitiveArray(FqNameUnsafe arrayFqName) {
        s.k(arrayFqName, "arrayFqName");
        return FqNames.arrayClassFqNameToPrimitiveType.get(arrayFqName) != null;
    }
}
