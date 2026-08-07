package p013kotlin.reflect.jvm.internal.impl.load.java;

import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.x;
import on0.a;
import p013kotlin.Pair;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes9.dex */
public class SpecialGenericSignatures {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<Companion.NameAndSignature> f87142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f87143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f87144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<Companion.NameAndSignature, TypeSafeBarrierDescription> f87145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, TypeSafeBarrierDescription> f87146e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<Name> f87147f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set<String> f87148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Companion.NameAndSignature f87149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<Companion.NameAndSignature, Name> f87150i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Map<String, Name> f87151j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set<String> f87152k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Set<Name> f87153l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Map<Name, Name> f87154m;

    public static final class Companion {

        public static final class NameAndSignature {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f87155a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Name f87156b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final String f87157c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final String f87158d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private final String f87159e;

            public NameAndSignature(String classInternalName, Name name, String parameters, String returnType) {
                s.k(classInternalName, "classInternalName");
                s.k(name, "name");
                s.k(parameters, "parameters");
                s.k(returnType, "returnType");
                this.f87155a = classInternalName;
                this.f87156b = name;
                this.f87157c = parameters;
                this.f87158d = returnType;
                this.f87159e = SignatureBuildingComponents.INSTANCE.signature(classInternalName, name + CoreConstants.LEFT_PARENTHESIS_CHAR + parameters + CoreConstants.RIGHT_PARENTHESIS_CHAR + returnType);
            }

            public static /* synthetic */ NameAndSignature copy$default(NameAndSignature nameAndSignature, String str, Name name, String str2, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = nameAndSignature.f87155a;
                }
                if ((i11 & 2) != 0) {
                    name = nameAndSignature.f87156b;
                }
                if ((i11 & 4) != 0) {
                    str2 = nameAndSignature.f87157c;
                }
                if ((i11 & 8) != 0) {
                    str3 = nameAndSignature.f87158d;
                }
                return nameAndSignature.copy(str, name, str2, str3);
            }

            public final NameAndSignature copy(String classInternalName, Name name, String parameters, String returnType) {
                s.k(classInternalName, "classInternalName");
                s.k(name, "name");
                s.k(parameters, "parameters");
                s.k(returnType, "returnType");
                return new NameAndSignature(classInternalName, name, parameters, returnType);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj;
                return s.f(this.f87155a, nameAndSignature.f87155a) && s.f(this.f87156b, nameAndSignature.f87156b) && s.f(this.f87157c, nameAndSignature.f87157c) && s.f(this.f87158d, nameAndSignature.f87158d);
            }

            public final Name getName() {
                return this.f87156b;
            }

            public final String getSignature() {
                return this.f87159e;
            }

            public int hashCode() {
                return (((((this.f87155a.hashCode() * 31) + this.f87156b.hashCode()) * 31) + this.f87157c.hashCode()) * 31) + this.f87158d.hashCode();
            }

            public String toString() {
                return "NameAndSignature(classInternalName=" + this.f87155a + ", name=" + this.f87156b + ", parameters=" + this.f87157c + ", returnType=" + this.f87158d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NameAndSignature a(String str, String str2, String str3, String str4) {
            Name nameIdentifier = Name.identifier(str2);
            s.j(nameIdentifier, "identifier(...)");
            return new NameAndSignature(str, nameIdentifier, str3, str4);
        }

        public final Name getBuiltinFunctionNamesByJvmName(Name name) {
            s.k(name, "name");
            return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name);
        }

        public final List<String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return SpecialGenericSignatures.f87143b;
        }

        public final Set<Name> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return SpecialGenericSignatures.f87147f;
        }

        public final Set<String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return SpecialGenericSignatures.f87148g;
        }

        public final Map<Name, Name> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return SpecialGenericSignatures.f87154m;
        }

        public final Set<Name> getORIGINAL_SHORT_NAMES() {
            return SpecialGenericSignatures.f87153l;
        }

        public final NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return SpecialGenericSignatures.f87149h;
        }

        public final Map<String, TypeSafeBarrierDescription> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return SpecialGenericSignatures.f87146e;
        }

        public final Map<String, Name> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return SpecialGenericSignatures.f87151j;
        }

        public final boolean getSameAsRenamedInJvmBuiltin(Name name) {
            s.k(name, "<this>");
            return getORIGINAL_SHORT_NAMES().contains(name);
        }

        public final SpecialSignatureInfo getSpecialSignatureInfo(String builtinSignature) {
            s.k(builtinSignature, "builtinSignature");
            if (getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(builtinSignature)) {
                return SpecialSignatureInfo.ONE_COLLECTION_PARAMETER;
            }
            return ((TypeSafeBarrierDescription) v0.j(getSIGNATURE_TO_DEFAULT_VALUES_MAP(), builtinSignature)) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }

        private Companion() {
        }
    }

    public enum SpecialSignatureInfo {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        SpecialSignatureInfo(String str, boolean z11) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES;
        private final Object defaultValue;
        public static final TypeSafeBarrierDescription NULL = new TypeSafeBarrierDescription(ActionConst.NULL, 0, null);
        public static final TypeSafeBarrierDescription INDEX = new TypeSafeBarrierDescription("INDEX", 1, -1);
        public static final TypeSafeBarrierDescription FALSE = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT = new a("MAP_GET_OR_DEFAULT", 3);

        static final class a extends TypeSafeBarrierDescription {
            /* JADX WARN: Illegal instructions before constructor call */
            a(String str, int i11) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                super(str, i11, defaultConstructorMarker, defaultConstructorMarker);
            }
        }

        private static final /* synthetic */ TypeSafeBarrierDescription[] $values() {
            return new TypeSafeBarrierDescription[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        static {
            TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArr$values = $values();
            $VALUES = typeSafeBarrierDescriptionArr$values;
            $ENTRIES = on0.a.a(typeSafeBarrierDescriptionArr$values);
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i11, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, obj);
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }

        private TypeSafeBarrierDescription(String str, int i11, Object obj) {
            super(str, i11);
            this.defaultValue = obj;
        }
    }

    static {
        Set<String> setI = d1.i("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(v.y(setI, 10));
        for (String str : setI) {
            Companion companion = Companion;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            s.j(desc, "getDesc(...)");
            arrayList.add(companion.a("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f87142a = arrayList;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(v.y(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((Companion.NameAndSignature) it.next()).getSignature());
        }
        f87143b = arrayList3;
        List<Companion.NameAndSignature> list = f87142a;
        ArrayList arrayList4 = new ArrayList(v.y(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it2.next()).getName().asString());
        }
        f87144c = arrayList4;
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion2 = Companion;
        String strJavaUtil = signatureBuildingComponents.javaUtil("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        s.j(desc2, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureA = companion2.a(strJavaUtil, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Pair pairA = x.a(nameAndSignatureA, typeSafeBarrierDescription);
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        s.j(desc3, "getDesc(...)");
        Pair pairA2 = x.a(companion2.a(strJavaUtil2, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String strJavaUtil3 = signatureBuildingComponents.javaUtil("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        s.j(desc4, "getDesc(...)");
        Pair pairA3 = x.a(companion2.a(strJavaUtil3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String strJavaUtil4 = signatureBuildingComponents.javaUtil("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        s.j(desc5, "getDesc(...)");
        Pair pairA4 = x.a(companion2.a(strJavaUtil4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String strJavaUtil5 = signatureBuildingComponents.javaUtil("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        s.j(desc6, "getDesc(...)");
        Pair pairA5 = x.a(companion2.a(strJavaUtil5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        Pair pairA6 = x.a(companion2.a(signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        Companion.NameAndSignature nameAndSignatureA2 = companion2.a(signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        Pair pairA7 = x.a(nameAndSignatureA2, typeSafeBarrierDescription2);
        Pair pairA8 = x.a(companion2.a(signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strJavaUtil6 = signatureBuildingComponents.javaUtil("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        s.j(desc7, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureA3 = companion2.a(strJavaUtil6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Pair pairA9 = x.a(nameAndSignatureA3, typeSafeBarrierDescription3);
        String strJavaUtil7 = signatureBuildingComponents.javaUtil("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        s.j(desc8, "getDesc(...)");
        Map<Companion.NameAndSignature, TypeSafeBarrierDescription> mapM = v0.m(pairA, pairA2, pairA3, pairA4, pairA5, pairA6, pairA7, pairA8, pairA9, x.a(companion2.a(strJavaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f87145d = mapM;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapM.size()));
        Iterator<T> it3 = mapM.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        f87146e = linkedHashMap;
        Set setN = d1.n(f87145d.keySet(), f87142a);
        ArrayList arrayList5 = new ArrayList(v.y(setN, 10));
        Iterator it4 = setN.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it4.next()).getName());
        }
        f87147f = v.r1(arrayList5);
        ArrayList arrayList6 = new ArrayList(v.y(setN, 10));
        Iterator it5 = setN.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it5.next()).getSignature());
        }
        f87148g = v.r1(arrayList6);
        Companion companion3 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        s.j(desc9, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureA4 = companion3.a("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f87149h = nameAndSignatureA4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String strJavaLang = signatureBuildingComponents2.javaLang("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        s.j(desc10, "getDesc(...)");
        Pair pairA10 = x.a(companion3.a(strJavaLang, "toByte", "", desc10), Name.identifier("byteValue"));
        String strJavaLang2 = signatureBuildingComponents2.javaLang("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        s.j(desc11, "getDesc(...)");
        Pair pairA11 = x.a(companion3.a(strJavaLang2, "toShort", "", desc11), Name.identifier("shortValue"));
        String strJavaLang3 = signatureBuildingComponents2.javaLang("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        s.j(desc12, "getDesc(...)");
        Pair pairA12 = x.a(companion3.a(strJavaLang3, "toInt", "", desc12), Name.identifier("intValue"));
        String strJavaLang4 = signatureBuildingComponents2.javaLang("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        s.j(desc13, "getDesc(...)");
        Pair pairA13 = x.a(companion3.a(strJavaLang4, "toLong", "", desc13), Name.identifier("longValue"));
        String strJavaLang5 = signatureBuildingComponents2.javaLang("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        s.j(desc14, "getDesc(...)");
        Pair pairA14 = x.a(companion3.a(strJavaLang5, "toFloat", "", desc14), Name.identifier("floatValue"));
        String strJavaLang6 = signatureBuildingComponents2.javaLang("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        s.j(desc15, "getDesc(...)");
        Pair pairA15 = x.a(companion3.a(strJavaLang6, "toDouble", "", desc15), Name.identifier("doubleValue"));
        Pair pairA16 = x.a(nameAndSignatureA4, Name.identifier("remove"));
        String strJavaLang7 = signatureBuildingComponents2.javaLang("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        s.j(desc16, "getDesc(...)");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        s.j(desc17, "getDesc(...)");
        Map<Companion.NameAndSignature, Name> mapM2 = v0.m(pairA10, pairA11, pairA12, pairA13, pairA14, pairA15, pairA16, x.a(companion3.a(strJavaLang7, "get", desc16, desc17), Name.identifier("charAt")));
        f87150i = mapM2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.e(mapM2.size()));
        Iterator<T> it6 = mapM2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).getSignature(), entry2.getValue());
        }
        f87151j = linkedHashMap2;
        Map<Companion.NameAndSignature, Name> map = f87150i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<Companion.NameAndSignature, Name> entry3 : map.entrySet()) {
            linkedHashSet.add(Companion.NameAndSignature.copy$default(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).getSignature());
        }
        f87152k = linkedHashSet;
        Set<Companion.NameAndSignature> setKeySet = f87150i.keySet();
        HashSet hashSet = new HashSet();
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            hashSet.add(((Companion.NameAndSignature) it7.next()).getName());
        }
        f87153l = hashSet;
        Set<Map.Entry<Companion.NameAndSignature, Name>> setEntrySet = f87150i.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(v.y(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList7.add(new Pair(((Companion.NameAndSignature) entry4.getKey()).getName(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(n.f(v0.e(v.y(arrayList7, 10)), 16));
        for (Pair pair : arrayList7) {
            linkedHashMap3.put((Name) pair.f(), (Name) pair.e());
        }
        f87154m = linkedHashMap3;
    }
}
