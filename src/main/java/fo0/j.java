package fo0;

import p013kotlin.Metadata;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lfo0/j;", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lfo0/a0;", "Ljn0/h0;", "Lfo0/c1;", "container", "<init>", "(Lfo0/c1;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "data", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljn0/h0;)Lfo0/a0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljn0/h0;)Lfo0/a0;", "a", "Lfo0/c1;", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class j extends DeclarationDescriptorVisitorEmptyBodies<a0<?>, jn0.h0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c1 container;

    public j(c1 container) {
        p013kotlin.jvm.internal.s.k(container, "container");
        this.container = container;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a0<?> visitFunctionDescriptor(FunctionDescriptor descriptor, jn0.h0 data) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        p013kotlin.jvm.internal.s.k(data, "data");
        return new h1(this.container, descriptor);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0<?> visitPropertyDescriptor(PropertyDescriptor descriptor, jn0.h0 data) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        p013kotlin.jvm.internal.s.k(data, "data");
        int i11 = (descriptor.getDispatchReceiverParameter() != null ? 1 : 0) + (descriptor.getExtensionReceiverParameter() != null ? 1 : 0);
        if (descriptor.isVar()) {
            if (i11 == 0) {
                return new j1(this.container, descriptor);
            }
            if (i11 == 1) {
                return new l1(this.container, descriptor);
            }
            if (i11 == 2) {
                return new n1(this.container, descriptor);
            }
        } else {
            if (i11 == 0) {
                return new a2(this.container, descriptor);
            }
            if (i11 == 1) {
                return new d2(this.container, descriptor);
            }
            if (i11 == 2) {
                return new g2(this.container, descriptor);
            }
        }
        throw new x2("Unsupported property: " + descriptor);
    }
}
