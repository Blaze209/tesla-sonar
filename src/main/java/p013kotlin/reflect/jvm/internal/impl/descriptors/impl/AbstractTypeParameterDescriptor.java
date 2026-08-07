package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractTypeParameterDescriptor extends DeclarationDescriptorNonRootImpl implements TypeParameterDescriptor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Variance f86776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f86777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f86778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final NotNullLazyValue<TypeConstructor> f86779h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final NotNullLazyValue<SimpleType> f86780i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final StorageManager f86781j;

    class a implements wn0.a<TypeConstructor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StorageManager f86782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SupertypeLoopChecker f86783b;

        a(StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            this.f86782a = storageManager;
            this.f86783b = supertypeLoopChecker;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TypeConstructor invoke() {
            return new c(AbstractTypeParameterDescriptor.this, this.f86782a, this.f86783b);
        }
    }

    class b implements wn0.a<SimpleType> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Name f86785a;

        class a implements wn0.a<MemberScope> {
            a() {
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public MemberScope invoke() {
                return TypeIntersectionScope.create("Scope for type parameter " + b.this.f86785a.asString(), AbstractTypeParameterDescriptor.this.getUpperBounds());
            }
        }

        b(Name name) {
            this.f86785a = name;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke() {
            return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), AbstractTypeParameterDescriptor.this.getTypeConstructor(), Collections.EMPTY_LIST, false, new LazyScopeAdapter(new a()));
        }
    }

    private class c extends AbstractTypeConstructor {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SupertypeLoopChecker f86788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AbstractTypeParameterDescriptor f86789e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractTypeParameterDescriptor abstractTypeParameterDescriptor, StorageManager storageManager, SupertypeLoopChecker supertypeLoopChecker) {
            super(storageManager);
            if (storageManager == null) {
                A(0);
            }
            this.f86789e = abstractTypeParameterDescriptor;
            this.f86788d = supertypeLoopChecker;
        }

        private static /* synthetic */ void A(int i11) {
            String str = (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) ? 2 : 3];
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i11 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i11 == 2) {
                objArr[1] = "getParameters";
            } else if (i11 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i11 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i11 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i11 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
        protected boolean c(ClassifierDescriptor classifierDescriptor) {
            if (classifierDescriptor == null) {
                A(9);
            }
            return (classifierDescriptor instanceof TypeParameterDescriptor) && DescriptorEquivalenceForOverrides.INSTANCE.areTypeParametersEquivalent(this.f86789e, (TypeParameterDescriptor) classifierDescriptor, true);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public KotlinBuiltIns getBuiltIns() {
            KotlinBuiltIns builtIns = DescriptorUtilsKt.getBuiltIns(this.f86789e);
            if (builtIns == null) {
                A(4);
            }
            return builtIns;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: getDeclarationDescriptor */
        public ClassifierDescriptor mo500getDeclarationDescriptor() {
            AbstractTypeParameterDescriptor abstractTypeParameterDescriptor = this.f86789e;
            if (abstractTypeParameterDescriptor == null) {
                A(3);
            }
            return abstractTypeParameterDescriptor;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
            if (list == null) {
                A(2);
            }
            return list;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected Collection<KotlinType> l() {
            List<KotlinType> listC = this.f86789e.c();
            if (listC == null) {
                A(1);
            }
            return listC;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected KotlinType m() {
            return ErrorUtils.createErrorType(ErrorTypeKind.CYCLIC_UPPER_BOUNDS, new String[0]);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected SupertypeLoopChecker p() {
            SupertypeLoopChecker supertypeLoopChecker = this.f86788d;
            if (supertypeLoopChecker == null) {
                A(5);
            }
            return supertypeLoopChecker;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected List<KotlinType> q(List<KotlinType> list) {
            if (list == null) {
                A(7);
            }
            List<KotlinType> listB = this.f86789e.b(list);
            if (listB == null) {
                A(8);
            }
            return listB;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected void s(KotlinType kotlinType) {
            if (kotlinType == null) {
                A(6);
            }
            this.f86789e.reportSupertypeLoopError(kotlinType);
        }

        public String toString() {
            return this.f86789e.getName().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected AbstractTypeParameterDescriptor(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, Variance variance, boolean z11, int i11, SourceElement sourceElement, SupertypeLoopChecker supertypeLoopChecker) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (storageManager == null) {
            a(0);
        }
        if (declarationDescriptor == null) {
            a(1);
        }
        if (annotations == null) {
            a(2);
        }
        if (name == null) {
            a(3);
        }
        if (variance == null) {
            a(4);
        }
        if (sourceElement == null) {
            a(5);
        }
        if (supertypeLoopChecker == null) {
            a(6);
        }
        this.f86776e = variance;
        this.f86777f = z11;
        this.f86778g = i11;
        this.f86779h = storageManager.createLazyValue(new a(storageManager, supertypeLoopChecker));
        this.f86780i = storageManager.createLazyValue(new b(name));
        this.f86781j = storageManager;
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i12 = 2;
                break;
            case 12:
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i11) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i11) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return declarationDescriptorVisitor.visitTypeParameterDescriptor(this, d11);
    }

    protected List<KotlinType> b(List<KotlinType> list) {
        if (list == null) {
            a(12);
        }
        if (list == null) {
            a(13);
        }
        return list;
    }

    protected abstract List<KotlinType> c();

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleType = (SimpleType) this.f86780i.invoke();
        if (simpleType == null) {
            a(10);
        }
        return simpleType;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.f86778g;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public StorageManager getStorageManager() {
        StorageManager storageManager = this.f86781j;
        if (storageManager == null) {
            a(14);
        }
        return storageManager;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public final TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = (TypeConstructor) this.f86779h.invoke();
        if (typeConstructor == null) {
            a(9);
        }
        return typeConstructor;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> supertypes = ((c) getTypeConstructor()).getSupertypes();
        if (supertypes == null) {
            a(8);
        }
        return supertypes;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public Variance getVariance() {
        Variance variance = this.f86776e;
        if (variance == null) {
            a(7);
        }
        return variance;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isCapturedFromOuterDeclaration() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean isReified() {
        return this.f86777f;
    }

    protected abstract void reportSupertypeLoopError(KotlinType kotlinType);

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeParameterDescriptor getOriginal() {
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) super.getOriginal();
        if (typeParameterDescriptor == null) {
            a(11);
        }
        return typeParameterDescriptor;
    }
}
