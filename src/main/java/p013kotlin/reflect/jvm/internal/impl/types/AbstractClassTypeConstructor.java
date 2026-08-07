package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(StorageManager storageManager) {
        super(storageManager);
        if (storageManager == null) {
            A(0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    private static /* synthetic */ void A(int i11) {
        String str = (i11 == 1 || i11 == 3 || i11 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 1 || i11 == 3 || i11 == 4) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else if (i11 == 2) {
            objArr[0] = "classifier";
        } else if (i11 == 3 || i11 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        } else {
            objArr[0] = "storageManager";
        }
        if (i11 == 1) {
            objArr[1] = "getBuiltIns";
        } else if (i11 == 3 || i11 == 4) {
            objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        }
        if (i11 != 1) {
            if (i11 == 2) {
                objArr[2] = "isSameClassifier";
            } else if (i11 != 3 && i11 != 4) {
                objArr[2] = "<init>";
            }
        }
        String str2 = String.format(str, objArr);
        if (i11 != 1 && i11 != 3 && i11 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    protected boolean c(ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            A(2);
        }
        return (classifierDescriptor instanceof ClassDescriptor) && a(mo500getDeclarationDescriptor(), classifierDescriptor);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(mo500getDeclarationDescriptor());
        if (builtIns == null) {
            A(1);
        }
        return builtIns;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public abstract ClassDescriptor mo500getDeclarationDescriptor();

    @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected KotlinType m() {
        if (KotlinBuiltIns.isSpecialClassWithNoSupertypes(mo500getDeclarationDescriptor())) {
            return null;
        }
        return getBuiltIns().getAnyType();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected Collection<KotlinType> n(boolean z11) {
        DeclarationDescriptor containingDeclaration = mo500getDeclarationDescriptor().getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                A(3);
            }
            return list;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        smartList.add(classDescriptor.getDefaultType());
        ClassDescriptor classDescriptorMo494getCompanionObjectDescriptor = classDescriptor.mo494getCompanionObjectDescriptor();
        if (z11 && classDescriptorMo494getCompanionObjectDescriptor != null) {
            smartList.add(classDescriptorMo494getCompanionObjectDescriptor.getDefaultType());
        }
        return smartList;
    }
}
