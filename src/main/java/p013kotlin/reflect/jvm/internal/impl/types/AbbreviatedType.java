package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class AbbreviatedType extends DelegatingSimpleType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SimpleType f88849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SimpleType f88850c;

    public AbbreviatedType(SimpleType delegate, SimpleType abbreviation) {
        s.k(delegate, "delegate");
        s.k(abbreviation, "abbreviation");
        this.f88849b = delegate;
        this.f88850c = abbreviation;
    }

    public final SimpleType getAbbreviation() {
        return this.f88850c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected SimpleType getDelegate() {
        return this.f88849b;
    }

    public final SimpleType getExpandedType() {
        return getDelegate();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        s.k(newAttributes, "newAttributes");
        return new AbbreviatedType(getDelegate().replaceAttributes(newAttributes), this.f88850c);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public AbbreviatedType replaceDelegate(SimpleType delegate) {
        s.k(delegate, "delegate");
        return new AbbreviatedType(delegate, this.f88850c);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public AbbreviatedType makeNullableAsSpecified(boolean z11) {
        return new AbbreviatedType(getDelegate().makeNullableAsSpecified(z11), this.f88850c.makeNullableAsSpecified(z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public AbbreviatedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        KotlinType kotlinTypeRefineType = kotlinTypeRefiner.refineType((KotlinTypeMarker) getDelegate());
        s.i(kotlinTypeRefineType, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        KotlinType kotlinTypeRefineType2 = kotlinTypeRefiner.refineType((KotlinTypeMarker) this.f88850c);
        s.i(kotlinTypeRefineType2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new AbbreviatedType((SimpleType) kotlinTypeRefineType, (SimpleType) kotlinTypeRefineType2);
    }
}
