package p013kotlin.reflect.jvm.internal.impl.descriptors;

import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;

/* JADX INFO: loaded from: classes9.dex */
public interface DeclarationDescriptor extends Named, Annotated {
    <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11);

    DeclarationDescriptor getContainingDeclaration();

    DeclarationDescriptor getOriginal();
}
