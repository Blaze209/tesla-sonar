package p013kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import p013kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p013kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class NewCapturedType extends SimpleType implements CapturedTypeMarker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CaptureStatus f88954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NewCapturedTypeConstructor f88955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final UnwrappedType f88956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TypeAttributes f88957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f88958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f88959g;

    public /* synthetic */ NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor newCapturedTypeConstructor, UnwrappedType unwrappedType, TypeAttributes typeAttributes, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureStatus, newCapturedTypeConstructor, unwrappedType, (i11 & 8) != 0 ? TypeAttributes.Companion.getEmpty() : typeAttributes, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? false : z12);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return this.f88957e;
    }

    public final CaptureStatus getCaptureStatus() {
        return this.f88954b;
    }

    public final UnwrappedType getLowerType() {
        return this.f88956d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return ErrorUtils.createErrorScope(ErrorScopeKind.CAPTURED_TYPE_SCOPE, true, new String[0]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f88958f;
    }

    public final boolean isProjectionNotNull() {
        return this.f88959g;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public NewCapturedTypeConstructor getConstructor() {
        return this.f88955c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        s.k(newAttributes, "newAttributes");
        return new NewCapturedType(this.f88954b, getConstructor(), this.f88956d, newAttributes, isMarkedNullable(), this.f88959g);
    }

    public NewCapturedType(CaptureStatus captureStatus, NewCapturedTypeConstructor constructor, UnwrappedType unwrappedType, TypeAttributes attributes, boolean z11, boolean z12) {
        s.k(captureStatus, "captureStatus");
        s.k(constructor, "constructor");
        s.k(attributes, "attributes");
        this.f88954b = captureStatus;
        this.f88955c = constructor;
        this.f88956d = unwrappedType;
        this.f88957e = attributes;
        this.f88958f = z11;
        this.f88959g = z12;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public NewCapturedType makeNullableAsSpecified(boolean z11) {
        return new NewCapturedType(this.f88954b, getConstructor(), this.f88956d, getAttributes(), z11, false, 32, null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public NewCapturedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        CaptureStatus captureStatus = this.f88954b;
        NewCapturedTypeConstructor newCapturedTypeConstructorRefine = getConstructor().refine(kotlinTypeRefiner);
        UnwrappedType unwrappedType = this.f88956d;
        return new NewCapturedType(captureStatus, newCapturedTypeConstructorRefine, unwrappedType != null ? kotlinTypeRefiner.refineType((KotlinTypeMarker) unwrappedType).unwrap() : null, getAttributes(), isMarkedNullable(), false, 32, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedType(CaptureStatus captureStatus, UnwrappedType unwrappedType, TypeProjection projection, TypeParameterDescriptor typeParameter) {
        this(captureStatus, new NewCapturedTypeConstructor(projection, null, null, typeParameter, 6, null), unwrappedType, null, false, false, 56, null);
        s.k(captureStatus, "captureStatus");
        s.k(projection, "projection");
        s.k(typeParameter, "typeParameter");
    }
}
