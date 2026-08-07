package p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
public interface ClassDescriptorFactory {
    ClassDescriptor createClass(ClassId classId);

    Collection<ClassDescriptor> getAllContributedClassesIfPossible(FqName fqName);

    boolean shouldCreateClass(FqName fqName, Name name);
}
