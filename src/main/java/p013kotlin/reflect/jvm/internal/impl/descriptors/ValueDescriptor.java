package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public interface ValueDescriptor extends CallableDescriptor {
    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    DeclarationDescriptor getContainingDeclaration();

    KotlinType getType();
}
