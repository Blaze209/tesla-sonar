package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract class VariableDescriptorWithInitializerImpl extends VariableDescriptorImpl {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f86971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected NullableLazyValue<ConstantValue<?>> f86972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected a<NullableLazyValue<ConstantValue<?>>> f86973h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableDescriptorWithInitializerImpl(DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, KotlinType kotlinType, boolean z11, SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, kotlinType, sourceElement);
        if (declarationDescriptor == null) {
            a(0);
        }
        if (annotations == null) {
            a(1);
        }
        if (name == null) {
            a(2);
        }
        if (sourceElement == null) {
            a(3);
        }
        this.f86971f = z11;
    }

    private static /* synthetic */ void a(int i11) {
        Object[] objArr = new Object[3];
        if (i11 == 1) {
            objArr[0] = "annotations";
        } else if (i11 == 2) {
            objArr[0] = "name";
        } else if (i11 == 3) {
            objArr[0] = "source";
        } else if (i11 == 4 || i11 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i11 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i11 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* JADX INFO: renamed from: getCompileTimeInitializer */
    public ConstantValue<?> mo497getCompileTimeInitializer() {
        NullableLazyValue<ConstantValue<?>> nullableLazyValue = this.f86972g;
        if (nullableLazyValue != null) {
            return (ConstantValue) nullableLazyValue.invoke();
        }
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return this.f86971f;
    }

    public void setCompileTimeInitializer(NullableLazyValue<ConstantValue<?>> nullableLazyValue, a<NullableLazyValue<ConstantValue<?>>> aVar) {
        if (aVar == null) {
            a(5);
        }
        this.f86973h = aVar;
        if (nullableLazyValue == null) {
            nullableLazyValue = aVar.invoke();
        }
        this.f86972g = nullableLazyValue;
    }

    public void setCompileTimeInitializerFactory(a<NullableLazyValue<ConstantValue<?>>> aVar) {
        if (aVar == null) {
            a(4);
        }
        setCompileTimeInitializer(null, aVar);
    }
}
