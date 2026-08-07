package p013kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {
    private Boolean F;
    private Boolean G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected JavaClassConstructorDescriptor(ClassDescriptor classDescriptor, JavaClassConstructorDescriptor javaClassConstructorDescriptor, Annotations annotations, boolean z11, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z11, kind, sourceElement);
        if (classDescriptor == null) {
            a(0);
        }
        if (annotations == null) {
            a(1);
        }
        if (kind == null) {
            a(2);
        }
        if (sourceElement == null) {
            a(3);
        }
        this.F = null;
        this.G = null;
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 11 || i11 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 11 || i11 == 18) ? 2 : 3];
        switch (i11) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i11 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i11 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i11) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 11 && i11 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static JavaClassConstructorDescriptor createJavaConstructor(ClassDescriptor classDescriptor, Annotations annotations, boolean z11, SourceElement sourceElement) {
        if (classDescriptor == null) {
            a(4);
        }
        if (annotations == null) {
            a(5);
        }
        if (sourceElement == null) {
            a(6);
        }
        return new JavaClassConstructorDescriptor(classDescriptor, null, annotations, z11, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public /* bridge */ /* synthetic */ JavaCallableMemberDescriptor enhance(KotlinType kotlinType, List list, KotlinType kotlinType2, Pair pair) {
        return enhance(kotlinType, (List<KotlinType>) list, kotlinType2, (Pair<CallableDescriptor.UserDataKey<?>, ?>) pair);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean hasStableParameterNames() {
        return this.F.booleanValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean hasSynthesizedParameterNames() {
        return this.G.booleanValue();
    }

    protected JavaClassConstructorDescriptor j(ClassDescriptor classDescriptor, JavaClassConstructorDescriptor javaClassConstructorDescriptor, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, Annotations annotations) {
        if (classDescriptor == null) {
            a(12);
        }
        if (kind == null) {
            a(13);
        }
        if (sourceElement == null) {
            a(14);
        }
        if (annotations == null) {
            a(15);
        }
        return new JavaClassConstructorDescriptor(classDescriptor, javaClassConstructorDescriptor, annotations, this.E, kind, sourceElement);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public JavaClassConstructorDescriptor createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            a(7);
        }
        if (kind == null) {
            a(8);
        }
        if (annotations == null) {
            a(9);
        }
        if (sourceElement == null) {
            a(10);
        }
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            JavaClassConstructorDescriptor javaClassConstructorDescriptorJ = j((ClassDescriptor) declarationDescriptor, (JavaClassConstructorDescriptor) functionDescriptor, kind, sourceElement, annotations);
            javaClassConstructorDescriptorJ.setHasStableParameterNames(hasStableParameterNames());
            javaClassConstructorDescriptorJ.setHasSynthesizedParameterNames(hasSynthesizedParameterNames());
            return javaClassConstructorDescriptorJ;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasStableParameterNames(boolean z11) {
        this.F = Boolean.valueOf(z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void setHasSynthesizedParameterNames(boolean z11) {
        this.G = Boolean.valueOf(z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public JavaClassConstructorDescriptor enhance(KotlinType kotlinType, List<KotlinType> list, KotlinType kotlinType2, Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        if (list == null) {
            a(16);
        }
        if (kotlinType2 == null) {
            a(17);
        }
        JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateSubstitutedCopy = createSubstitutedCopy(getContainingDeclaration(), null, getKind(), null, getAnnotations(), getSource());
        javaClassConstructorDescriptorCreateSubstitutedCopy.initialize(kotlinType == null ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(javaClassConstructorDescriptorCreateSubstitutedCopy, kotlinType, Annotations.Companion.getEMPTY()), getDispatchReceiverParameter(), v.m(), getTypeParameters(), UtilKt.copyValueParameters(list, getValueParameters(), javaClassConstructorDescriptorCreateSubstitutedCopy), kotlinType2, getModality(), getVisibility());
        if (pair != null) {
            javaClassConstructorDescriptorCreateSubstitutedCopy.putInUserDataMap(pair.e(), pair.f());
        }
        return javaClassConstructorDescriptorCreateSubstitutedCopy;
    }
}
