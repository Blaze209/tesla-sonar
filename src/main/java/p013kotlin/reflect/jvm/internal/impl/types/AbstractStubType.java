package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractStubType extends SimpleType {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NewTypeVariableConstructor f88851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f88852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MemberScope f88853d;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AbstractStubType(NewTypeVariableConstructor originalTypeVariable, boolean z11) {
        s.k(originalTypeVariable, "originalTypeVariable");
        this.f88851b = originalTypeVariable;
        this.f88852c = z11;
        this.f88853d = ErrorUtils.createErrorScope(ErrorScopeKind.STUB_TYPE_SCOPE, originalTypeVariable.toString());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return this.f88853d;
    }

    public final NewTypeVariableConstructor getOriginalTypeVariable() {
        return this.f88851b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f88852c;
    }

    public abstract AbstractStubType materialize(boolean z11);

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public AbstractStubType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        s.k(newAttributes, "newAttributes");
        return this;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z11) {
        return z11 == isMarkedNullable() ? this : materialize(z11);
    }
}
