package p013kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class CapturedType extends SimpleType implements CapturedTypeMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeProjection f88444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CapturedTypeConstructor f88445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f88446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TypeAttributes f88447e;

    public /* synthetic */ CapturedType(TypeProjection typeProjection, CapturedTypeConstructor capturedTypeConstructor, boolean z11, TypeAttributes typeAttributes, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeProjection, (i11 & 2) != 0 ? new CapturedTypeConstructorImpl(typeProjection) : capturedTypeConstructor, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? TypeAttributes.Companion.getEmpty() : typeAttributes);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.f88447e;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f88446d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Captured(");
        sb2.append(this.f88444b);
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        sb2.append(isMarkedNullable() ? CallerData.NA : "");
        return sb2.toString();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public CapturedTypeConstructor getConstructor() {
        return this.f88445c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        s.k(newAttributes, "newAttributes");
        return new CapturedType(this.f88444b, getConstructor(), isMarkedNullable(), newAttributes);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public CapturedType makeNullableAsSpecified(boolean z11) {
        return z11 == isMarkedNullable() ? this : new CapturedType(this.f88444b, getConstructor(), z11, getAttributes());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public CapturedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        TypeProjection typeProjectionRefine = this.f88444b.refine(kotlinTypeRefiner);
        s.j(typeProjectionRefine, "refine(...)");
        return new CapturedType(typeProjectionRefine, getConstructor(), isMarkedNullable(), getAttributes());
    }

    public CapturedType(TypeProjection typeProjection, CapturedTypeConstructor constructor, boolean z11, TypeAttributes attributes) {
        s.k(typeProjection, "typeProjection");
        s.k(constructor, "constructor");
        s.k(attributes, "attributes");
        this.f88444b = typeProjection;
        this.f88445c = constructor;
        this.f88446d = z11;
        this.f88447e = attributes;
    }
}
