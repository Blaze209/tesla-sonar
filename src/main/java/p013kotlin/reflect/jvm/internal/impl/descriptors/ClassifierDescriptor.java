package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes9.dex */
public interface ClassifierDescriptor extends DeclarationDescriptorNonRoot {
    SimpleType getDefaultType();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    ClassifierDescriptor getOriginal();

    TypeConstructor getTypeConstructor();
}
