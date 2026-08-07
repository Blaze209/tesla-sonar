package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;

/* JADX INFO: loaded from: classes9.dex */
public abstract class FlexibleType extends UnwrappedType implements FlexibleTypeMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SimpleType f88878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SimpleType f88879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleType(SimpleType lowerBound, SimpleType upperBound) {
        super(null);
        s.k(lowerBound, "lowerBound");
        s.k(upperBound, "upperBound");
        this.f88878b = lowerBound;
        this.f88879c = upperBound;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    public abstract SimpleType getDelegate();

    public final SimpleType getLowerBound() {
        return this.f88878b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    public final SimpleType getUpperBound() {
        return this.f88879c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    public abstract String render(DescriptorRenderer descriptorRenderer, DescriptorRendererOptions descriptorRendererOptions);

    public String toString() {
        return DescriptorRenderer.DEBUG_TEXT.renderType(this);
    }
}
