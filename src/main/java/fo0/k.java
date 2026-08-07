package fo0;

import java.util.Collection;
import p013kotlin.Metadata;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lfo0/k;", "Lfo0/c1;", "<init>", "()V", "", "K", "()Ljava/lang/Void;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "E", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "A", "", "index", "B", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "z", "()Ljava/util/Collection;", "constructorDescriptors", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k extends c1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f66175d = new k();

    private k() {
    }

    private final Void K() {
        throw new x2("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    @Override // fo0.c1
    public Collection<FunctionDescriptor> A(Name name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        K();
        throw null;
    }

    @Override // fo0.c1
    public PropertyDescriptor B(int index) {
        return null;
    }

    @Override // fo0.c1
    public Collection<PropertyDescriptor> E(Name name) {
        p013kotlin.jvm.internal.s.k(name, "name");
        K();
        throw null;
    }

    @Override // p013kotlin.jvm.internal.h
    public Class<?> a() {
        K();
        throw null;
    }

    @Override // fo0.c1
    public Collection<ConstructorDescriptor> z() {
        K();
        throw null;
    }
}
