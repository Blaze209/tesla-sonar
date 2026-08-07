package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes9.dex */
public abstract class WrappedType extends KotlinType {
    public WrappedType() {
        super(null);
    }

    protected abstract KotlinType b();

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public List<TypeProjection> getArguments() {
        return b().getArguments();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeAttributes getAttributes() {
        return b().getAttributes();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public TypeConstructor getConstructor() {
        return b().getConstructor();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public MemberScope getMemberScope() {
        return b().getMemberScope();
    }

    public boolean isComputed() {
        return true;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return b().isMarkedNullable();
    }

    public String toString() {
        return isComputed() ? b().toString() : "<Not computed yet>";
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final UnwrappedType unwrap() {
        KotlinType kotlinTypeB = b();
        while (kotlinTypeB instanceof WrappedType) {
            kotlinTypeB = ((WrappedType) kotlinTypeB).b();
        }
        s.i(kotlinTypeB, "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType");
        return (UnwrappedType) kotlinTypeB;
    }
}
