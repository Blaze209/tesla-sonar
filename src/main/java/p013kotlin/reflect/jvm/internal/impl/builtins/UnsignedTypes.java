package p013kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import jn0.x;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class UnsignedTypes {
    public static final UnsignedTypes INSTANCE = new UnsignedTypes();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<Name> f86582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<Name> f86583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HashMap<ClassId, ClassId> f86584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap<ClassId, ClassId> f86585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap<UnsignedArrayType, Name> f86586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<Name> f86587f;

    static {
        UnsignedType[] unsignedTypeArrValues = UnsignedType.values();
        ArrayList arrayList = new ArrayList(unsignedTypeArrValues.length);
        for (UnsignedType unsignedType : unsignedTypeArrValues) {
            arrayList.add(unsignedType.getTypeName());
        }
        f86582a = v.r1(arrayList);
        UnsignedArrayType[] unsignedArrayTypeArrValues = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(unsignedArrayTypeArrValues.length);
        for (UnsignedArrayType unsignedArrayType : unsignedArrayTypeArrValues) {
            arrayList2.add(unsignedArrayType.getTypeName());
        }
        f86583b = v.r1(arrayList2);
        f86584c = new HashMap<>();
        f86585d = new HashMap<>();
        f86586e = v0.k(x.a(UnsignedArrayType.UBYTEARRAY, Name.identifier("ubyteArrayOf")), x.a(UnsignedArrayType.USHORTARRAY, Name.identifier("ushortArrayOf")), x.a(UnsignedArrayType.UINTARRAY, Name.identifier("uintArrayOf")), x.a(UnsignedArrayType.ULONGARRAY, Name.identifier("ulongArrayOf")));
        UnsignedType[] unsignedTypeArrValues2 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (UnsignedType unsignedType2 : unsignedTypeArrValues2) {
            linkedHashSet.add(unsignedType2.getArrayClassId().getShortClassName());
        }
        f86587f = linkedHashSet;
        for (UnsignedType unsignedType3 : UnsignedType.values()) {
            f86584c.put(unsignedType3.getArrayClassId(), unsignedType3.getClassId());
            f86585d.put(unsignedType3.getClassId(), unsignedType3.getArrayClassId());
        }
    }

    private UnsignedTypes() {
    }

    public static final boolean isUnsignedType(KotlinType type) {
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor;
        s.k(type, "type");
        if (TypeUtils.noExpectedType(type) || (classifierDescriptorMo500getDeclarationDescriptor = type.getConstructor().mo500getDeclarationDescriptor()) == null) {
            return false;
        }
        return INSTANCE.isUnsignedClass(classifierDescriptorMo500getDeclarationDescriptor);
    }

    public final ClassId getUnsignedClassIdByArrayClassId(ClassId arrayClassId) {
        s.k(arrayClassId, "arrayClassId");
        return f86584c.get(arrayClassId);
    }

    public final boolean isShortNameOfUnsignedArray(Name name) {
        s.k(name, "name");
        return f86587f.contains(name);
    }

    public final boolean isUnsignedClass(DeclarationDescriptor descriptor) {
        s.k(descriptor, "descriptor");
        DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
        return (containingDeclaration instanceof PackageFragmentDescriptor) && s.f(((PackageFragmentDescriptor) containingDeclaration).getFqName(), StandardNames.BUILT_INS_PACKAGE_FQ_NAME) && f86582a.contains(descriptor.getName());
    }
}
