package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class TypeParameterDescriptorImpl extends AbstractTypeParameterDescriptor {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l<KotlinType, Void> f86960k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<KotlinType> f86961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f86962m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private TypeParameterDescriptorImpl(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z11, Variance variance, Name name, int i11, SourceElement sourceElement, l<KotlinType, Void> lVar, SupertypeLoopChecker supertypeLoopChecker, StorageManager storageManager) {
        super(storageManager, declarationDescriptor, annotations, name, variance, z11, i11, sourceElement, supertypeLoopChecker);
        if (declarationDescriptor == null) {
            a(19);
        }
        if (annotations == null) {
            a(20);
        }
        if (variance == null) {
            a(21);
        }
        if (name == null) {
            a(22);
        }
        if (sourceElement == null) {
            a(23);
        }
        if (supertypeLoopChecker == null) {
            a(24);
        }
        if (storageManager == null) {
            a(25);
        }
        this.f86961l = new ArrayList(1);
        this.f86962m = false;
        this.f86960k = lVar;
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 5 || i11 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 5 || i11 == 28) ? 2 : 3];
        switch (i11) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i11 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i11 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i11) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 5 && i11 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static TypeParameterDescriptorImpl createForFurtherModification(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z11, Variance variance, Name name, int i11, SourceElement sourceElement, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            a(6);
        }
        if (annotations == null) {
            a(7);
        }
        if (variance == null) {
            a(8);
        }
        if (name == null) {
            a(9);
        }
        if (sourceElement == null) {
            a(10);
        }
        if (storageManager == null) {
            a(11);
        }
        return createForFurtherModification(declarationDescriptor, annotations, z11, variance, name, i11, sourceElement, null, SupertypeLoopChecker.EMPTY.INSTANCE, storageManager);
    }

    public static TypeParameterDescriptor createWithDefaultBound(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z11, Variance variance, Name name, int i11, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            a(0);
        }
        if (annotations == null) {
            a(1);
        }
        if (variance == null) {
            a(2);
        }
        if (name == null) {
            a(3);
        }
        if (storageManager == null) {
            a(4);
        }
        TypeParameterDescriptorImpl typeParameterDescriptorImplCreateForFurtherModification = createForFurtherModification(declarationDescriptor, annotations, z11, variance, name, i11, SourceElement.NO_SOURCE, storageManager);
        typeParameterDescriptorImplCreateForFurtherModification.addUpperBound(DescriptorUtilsKt.getBuiltIns(declarationDescriptor).getDefaultBound());
        typeParameterDescriptorImplCreateForFurtherModification.setInitialized();
        return typeParameterDescriptorImplCreateForFurtherModification;
    }

    private void d() {
        if (this.f86962m) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + g());
    }

    private void e() {
        if (this.f86962m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + g());
        }
    }

    private void f(KotlinType kotlinType) {
        if (KotlinTypeKt.isError(kotlinType)) {
            return;
        }
        this.f86961l.add(kotlinType);
    }

    private String g() {
        return getName() + " declared in " + DescriptorUtils.getFqName(getContainingDeclaration());
    }

    public void addUpperBound(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(26);
        }
        e();
        f(kotlinType);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected List<KotlinType> c() {
        d();
        List<KotlinType> list = this.f86961l;
        if (list == null) {
            a(28);
        }
        return list;
    }

    public boolean isInitialized() {
        return this.f86962m;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected void reportSupertypeLoopError(KotlinType kotlinType) {
        if (kotlinType == null) {
            a(27);
        }
        l<KotlinType, Void> lVar = this.f86960k;
        if (lVar == null) {
            return;
        }
        lVar.invoke(kotlinType);
    }

    public void setInitialized() {
        e();
        this.f86962m = true;
    }

    public static TypeParameterDescriptorImpl createForFurtherModification(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z11, Variance variance, Name name, int i11, SourceElement sourceElement, l<KotlinType, Void> lVar, SupertypeLoopChecker supertypeLoopChecker, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            a(12);
        }
        if (annotations == null) {
            a(13);
        }
        if (variance == null) {
            a(14);
        }
        if (name == null) {
            a(15);
        }
        if (sourceElement == null) {
            a(16);
        }
        if (supertypeLoopChecker == null) {
            a(17);
        }
        if (storageManager == null) {
            a(18);
        }
        return new TypeParameterDescriptorImpl(declarationDescriptor, annotations, z11, variance, name, i11, sourceElement, lVar, supertypeLoopChecker, storageManager);
    }
}
