package p013kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class CompanionObjectMappingUtilsKt {
    public static final boolean isMappedIntrinsicCompanionObject(CompanionObjectMapping companionObjectMapping, ClassDescriptor classDescriptor) {
        s.k(companionObjectMapping, "<this>");
        s.k(classDescriptor, "classDescriptor");
        if (!DescriptorUtils.isCompanionObject(classDescriptor)) {
            return false;
        }
        Set<ClassId> classIds = companionObjectMapping.getClassIds();
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        return v.g0(classIds, classId != null ? classId.getOuterClassId() : null);
    }
}
