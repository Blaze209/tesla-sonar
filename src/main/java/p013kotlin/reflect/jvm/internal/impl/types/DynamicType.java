package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class DynamicType extends FlexibleType implements DynamicTypeMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TypeAttributes f88874d;

    /* JADX WARN: Illegal instructions before constructor call */
    public DynamicType(KotlinBuiltIns builtIns, TypeAttributes attributes) {
        s.k(builtIns, "builtIns");
        s.k(attributes, "attributes");
        SimpleType nothingType = builtIns.getNothingType();
        s.j(nothingType, "getNothingType(...)");
        SimpleType nullableAnyType = builtIns.getNullableAnyType();
        s.j(nullableAnyType, "getNullableAnyType(...)");
        super(nothingType, nullableAnyType);
        this.f88874d = attributes;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.FlexibleType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.f88874d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public SimpleType getDelegate() {
        return getUpperBound();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.FlexibleType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public DynamicType makeNullableAsSpecified(boolean z11) {
        return this;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public DynamicType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public String render(DescriptorRenderer renderer, DescriptorRendererOptions options) {
        s.k(renderer, "renderer");
        s.k(options, "options");
        return "dynamic";
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public DynamicType replaceAttributes(TypeAttributes newAttributes) {
        s.k(newAttributes, "newAttributes");
        return new DynamicType(TypeUtilsKt.getBuiltIns(getDelegate()), newAttributes);
    }
}
