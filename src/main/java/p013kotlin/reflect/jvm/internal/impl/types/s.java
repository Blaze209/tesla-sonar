package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorScope;
import p013kotlin.reflect.jvm.internal.impl.types.error.ThrowingScope;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
final class s extends SimpleType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeConstructor f89030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<TypeProjection> f89031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f89032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MemberScope f89033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l<KotlinTypeRefiner, SimpleType> f89034f;

    /* JADX WARN: Multi-variable type inference failed */
    public s(TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z11, MemberScope memberScope, l<? super KotlinTypeRefiner, ? extends SimpleType> refinedTypeFactory) {
        p013kotlin.jvm.internal.s.k(constructor, "constructor");
        p013kotlin.jvm.internal.s.k(arguments, "arguments");
        p013kotlin.jvm.internal.s.k(memberScope, "memberScope");
        p013kotlin.jvm.internal.s.k(refinedTypeFactory, "refinedTypeFactory");
        this.f89030b = constructor;
        this.f89031c = arguments;
        this.f89032d = z11;
        this.f89033e = memberScope;
        this.f89034f = refinedTypeFactory;
        if (!(getMemberScope() instanceof ErrorScope) || (getMemberScope() instanceof ThrowingScope)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + getMemberScope() + '\n' + getConstructor());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return this.f89031c;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return TypeAttributes.Companion.getEmpty();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return this.f89030b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return this.f89033e;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return this.f89032d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType makeNullableAsSpecified(boolean z11) {
        if (z11 == isMarkedNullable()) {
            return this;
        }
        return z11 ? new r(this) : new q(this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public SimpleType replaceAttributes(TypeAttributes newAttributes) {
        p013kotlin.jvm.internal.s.k(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new t(this, newAttributes);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public SimpleType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        p013kotlin.jvm.internal.s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        SimpleType simpleTypeInvoke = this.f89034f.invoke(kotlinTypeRefiner);
        return simpleTypeInvoke == null ? this : simpleTypeInvoke;
    }
}
