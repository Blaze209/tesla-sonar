package p013kotlin.reflect.jvm.internal.impl.types;

import ch.qos.logback.classic.spi.CallerData;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.model.StubTypeMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class StubTypeForBuilderInference extends AbstractStubType implements StubTypeMarker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TypeConstructor f88904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final MemberScope f88905f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StubTypeForBuilderInference(NewTypeVariableConstructor originalTypeVariable, boolean z11, TypeConstructor constructor) {
        super(originalTypeVariable, z11);
        s.k(originalTypeVariable, "originalTypeVariable");
        s.k(constructor, "constructor");
        this.f88904e = constructor;
        this.f88905f = originalTypeVariable.getBuiltIns().getAnyType().getMemberScope();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return this.f88904e;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractStubType, p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return this.f88905f;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractStubType
    public AbstractStubType materialize(boolean z11) {
        return new StubTypeForBuilderInference(getOriginalTypeVariable(), z11, getConstructor());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.SimpleType
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(getOriginalTypeVariable());
        sb2.append(isMarkedNullable() ? CallerData.NA : "");
        return sb2.toString();
    }
}
