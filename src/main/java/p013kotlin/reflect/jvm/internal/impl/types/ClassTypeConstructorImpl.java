package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes9.dex */
public class ClassTypeConstructorImpl extends AbstractClassTypeConstructor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClassDescriptor f88864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<TypeParameterDescriptor> f88865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Collection<KotlinType> f88866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassTypeConstructorImpl(ClassDescriptor classDescriptor, List<? extends TypeParameterDescriptor> list, Collection<KotlinType> collection, StorageManager storageManager) {
        super(storageManager);
        if (classDescriptor == null) {
            A(0);
        }
        if (list == null) {
            A(1);
        }
        if (collection == null) {
            A(2);
        }
        if (storageManager == null) {
            A(3);
        }
        this.f88864d = classDescriptor;
        this.f88865e = Collections.unmodifiableList(new ArrayList(list));
        this.f88866f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void A(int i11) {
        String str = (i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i11 == 4) {
            objArr[1] = "getParameters";
        } else if (i11 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i11 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i11 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i11 != 4 && i11 != 5 && i11 != 6 && i11 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        List<TypeParameterDescriptor> list = this.f88865e;
        if (list == null) {
            A(4);
        }
        return list;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return true;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected Collection<KotlinType> l() {
        Collection<KotlinType> collection = this.f88866f;
        if (collection == null) {
            A(6);
        }
        return collection;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected SupertypeLoopChecker p() {
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.INSTANCE;
        if (empty == null) {
            A(7);
        }
        return empty;
    }

    public String toString() {
        return DescriptorUtils.getFqName(this.f88864d).asString();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, p013kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassDescriptor mo500getDeclarationDescriptor() {
        ClassDescriptor classDescriptor = this.f88864d;
        if (classDescriptor == null) {
            A(5);
        }
        return classDescriptor;
    }
}
