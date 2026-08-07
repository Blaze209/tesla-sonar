package p013kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Iterator;
import java.util.Set;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class ClassDeserializer {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<ClassId> f88589c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeserializationComponents f88590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<a, ClassDescriptor> f88591b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.f88589c;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClassId f88592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClassData f88593b;

        public a(ClassId classId, ClassData classData) {
            s.k(classId, "classId");
            this.f88592a = classId;
            this.f88593b = classData;
        }

        public final ClassData a() {
            return this.f88593b;
        }

        public final ClassId b() {
            return this.f88592a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && s.f(this.f88592a, ((a) obj).f88592a);
        }

        public int hashCode() {
            return this.f88592a.hashCode();
        }
    }

    static {
        ClassId.Companion companion = ClassId.Companion;
        FqName safe = StandardNames.FqNames.cloneable.toSafe();
        s.j(safe, "toSafe(...)");
        f88589c = d1.c(companion.topLevel(safe));
    }

    public ClassDeserializer(DeserializationComponents components) {
        s.k(components, "components");
        this.f88590a = components;
        this.f88591b = components.getStorageManager().createMemoizedFunctionWithNullableValues(new b(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor b(ClassDeserializer classDeserializer, a key) {
        s.k(key, "key");
        return classDeserializer.c(key);
    }

    private final ClassDescriptor c(a aVar) {
        Object next;
        DeserializationContext deserializationContextCreateContext;
        PackageFragmentDescriptor packageFragmentDescriptor;
        ClassId classIdB = aVar.b();
        Iterator<ClassDescriptorFactory> it = this.f88590a.getFictitiousClassDescriptorFactories().iterator();
        while (it.hasNext()) {
            ClassDescriptor classDescriptorCreateClass = it.next().createClass(classIdB);
            if (classDescriptorCreateClass != null) {
                return classDescriptorCreateClass;
            }
        }
        if (f88589c.contains(classIdB)) {
            return null;
        }
        ClassData classDataA = aVar.a();
        if (classDataA == null && (classDataA = this.f88590a.getClassDataFinder().findClassData(classIdB)) == null) {
            return null;
        }
        NameResolver nameResolverComponent1 = classDataA.component1();
        ProtoBuf.Class classComponent2 = classDataA.component2();
        BinaryVersion binaryVersionComponent3 = classDataA.component3();
        SourceElement sourceElementComponent4 = classDataA.component4();
        ClassId outerClassId = classIdB.getOuterClassId();
        if (outerClassId != null) {
            ClassDescriptor classDescriptorDeserializeClass$default = deserializeClass$default(this, outerClassId, null, 2, null);
            DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorDeserializeClass$default instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorDeserializeClass$default : null;
            if (deserializedClassDescriptor == null || !deserializedClassDescriptor.hasNestedClass$deserialization(classIdB.getShortClassName())) {
                return null;
            }
            deserializationContextCreateContext = deserializedClassDescriptor.getC();
        } else {
            Iterator<T> it2 = PackageFragmentProviderKt.packageFragments(this.f88590a.getPackageFragmentProvider(), classIdB.getPackageFqName()).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                packageFragmentDescriptor = (PackageFragmentDescriptor) next;
                if (!(packageFragmentDescriptor instanceof DeserializedPackageFragment)) {
                    break;
                }
            } while (!((DeserializedPackageFragment) packageFragmentDescriptor).hasTopLevelClass(classIdB.getShortClassName()));
            PackageFragmentDescriptor packageFragmentDescriptor2 = (PackageFragmentDescriptor) next;
            if (packageFragmentDescriptor2 == null) {
                return null;
            }
            DeserializationComponents deserializationComponents = this.f88590a;
            ProtoBuf.TypeTable typeTable = classComponent2.getTypeTable();
            s.j(typeTable, "getTypeTable(...)");
            TypeTable typeTable2 = new TypeTable(typeTable);
            VersionRequirementTable.Companion companion = VersionRequirementTable.Companion;
            ProtoBuf.VersionRequirementTable versionRequirementTable = classComponent2.getVersionRequirementTable();
            s.j(versionRequirementTable, "getVersionRequirementTable(...)");
            deserializationContextCreateContext = deserializationComponents.createContext(packageFragmentDescriptor2, nameResolverComponent1, typeTable2, companion.create(versionRequirementTable), binaryVersionComponent3, null);
            binaryVersionComponent3 = binaryVersionComponent3;
        }
        return new DeserializedClassDescriptor(deserializationContextCreateContext, classComponent2, nameResolverComponent1, binaryVersionComponent3, sourceElementComponent4);
    }

    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    public final ClassDescriptor deserializeClass(ClassId classId, ClassData classData) {
        s.k(classId, "classId");
        return this.f88591b.invoke(new a(classId, classData));
    }
}
