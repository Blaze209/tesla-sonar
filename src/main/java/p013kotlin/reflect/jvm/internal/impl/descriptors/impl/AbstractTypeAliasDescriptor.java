package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import co0.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractTypeAliasDescriptor extends DeclarationDescriptorNonRootImpl implements TypeAliasDescriptor {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f86769j = {o0.k(new f0(o0.b(AbstractTypeAliasDescriptor.class), "constructors", "getConstructors()Ljava/util/Collection;"))};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final StorageManager f86770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final DescriptorVisibility f86771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final NotNullLazyValue f86772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<? extends TypeParameterDescriptor> f86773h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AbstractTypeAliasDescriptor$typeConstructor$1 f86774i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1] */
    public AbstractTypeAliasDescriptor(StorageManager storageManager, DeclarationDescriptor containingDeclaration, Annotations annotations, Name name, SourceElement sourceElement, DescriptorVisibility visibilityImpl) {
        super(containingDeclaration, annotations, name, sourceElement);
        s.k(storageManager, "storageManager");
        s.k(containingDeclaration, "containingDeclaration");
        s.k(annotations, "annotations");
        s.k(name, "name");
        s.k(sourceElement, "sourceElement");
        s.k(visibilityImpl, "visibilityImpl");
        this.f86770e = storageManager;
        this.f86771f = visibilityImpl;
        this.f86772g = storageManager.createLazyValue(new a(this));
        this.f86774i = new TypeConstructor() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor$typeConstructor$1
            @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public KotlinBuiltIns getBuiltIns() {
                return DescriptorUtilsKt.getBuiltIns(mo500getDeclarationDescriptor());
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public List<TypeParameterDescriptor> getParameters() {
                return this.f86775a.h();
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public Collection<KotlinType> getSupertypes() {
                Collection<KotlinType> supertypes = mo500getDeclarationDescriptor().getUnderlyingType().getConstructor().getSupertypes();
                s.j(supertypes, "getSupertypes(...)");
                return supertypes;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public boolean isDenotable() {
                return true;
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            public TypeConstructor refine(KotlinTypeRefiner kotlinTypeRefiner) {
                s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
                return this;
            }

            public String toString() {
                return "[typealias " + mo500getDeclarationDescriptor().getName().asString() + ']';
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
            /* JADX INFO: renamed from: getDeclarationDescriptor */
            public TypeAliasDescriptor mo500getDeclarationDescriptor() {
                return this.f86775a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType f(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(abstractTypeAliasDescriptor);
        if (classifierDescriptorRefineDescriptor != null) {
            return classifierDescriptorRefineDescriptor.getDefaultType();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection g(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor) {
        return abstractTypeAliasDescriptor.getTypeAliasConstructors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    public static final Boolean i(AbstractTypeAliasDescriptor abstractTypeAliasDescriptor, UnwrappedType unwrappedType) {
        boolean z11;
        s.h(unwrappedType);
        if (KotlinTypeKt.isError(unwrappedType)) {
            z11 = false;
        } else {
            ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = unwrappedType.getConstructor().mo500getDeclarationDescriptor();
            if (!(classifierDescriptorMo500getDeclarationDescriptor instanceof TypeParameterDescriptor) || s.f(((TypeParameterDescriptor) classifierDescriptorMo500getDeclarationDescriptor).getContainingDeclaration(), abstractTypeAliasDescriptor)) {
                z11 = false;
            } else {
                z11 = true;
            }
        }
        return Boolean.valueOf(z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> visitor, D d11) {
        s.k(visitor, "visitor");
        return visitor.visitTypeAliasDescriptor(this, d11);
    }

    protected final SimpleType e() {
        MemberScope unsubstitutedMemberScope;
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null || (unsubstitutedMemberScope = classDescriptor.getUnsubstitutedMemberScope()) == null) {
            unsubstitutedMemberScope = MemberScope.Empty.INSTANCE;
        }
        SimpleType simpleTypeMakeUnsubstitutedType = TypeUtils.makeUnsubstitutedType(this, unsubstitutedMemberScope, new c(this));
        s.j(simpleTypeMakeUnsubstitutedType, "makeUnsubstitutedType(...)");
        return simpleTypeMakeUnsubstitutedType;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List list = this.f86773h;
        if (list != null) {
            return list;
        }
        s.B("declaredTypeParametersImpl");
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return Modality.FINAL;
    }

    protected final StorageManager getStorageManager() {
        return this.f86770e;
    }

    public final Collection<TypeAliasConstructorDescriptor> getTypeAliasConstructors() {
        ClassDescriptor classDescriptor = getClassDescriptor();
        if (classDescriptor == null) {
            return v.m();
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        s.j(constructors, "getConstructors(...)");
        ArrayList arrayList = new ArrayList();
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            TypeAliasConstructorDescriptorImpl.Companion companion = TypeAliasConstructorDescriptorImpl.Companion;
            StorageManager storageManager = this.f86770e;
            s.h(classConstructorDescriptor);
            TypeAliasConstructorDescriptor typeAliasConstructorDescriptorCreateIfAvailable = companion.createIfAvailable(storageManager, this, classConstructorDescriptor);
            if (typeAliasConstructorDescriptorCreateIfAvailable != null) {
                arrayList.add(typeAliasConstructorDescriptorCreateIfAvailable);
            }
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.f86774i;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        return this.f86771f;
    }

    protected abstract List<TypeParameterDescriptor> h();

    public final void initialize(List<? extends TypeParameterDescriptor> declaredTypeParameters) {
        s.k(declaredTypeParameters, "declaredTypeParameters");
        this.f86773h = declaredTypeParameters;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return TypeUtils.contains(getUnderlyingType(), new b(this));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    public String toString() {
        return "typealias " + getName().asString();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeAliasDescriptor getOriginal() {
        DeclarationDescriptorWithSource original = super.getOriginal();
        s.i(original, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor");
        return (TypeAliasDescriptor) original;
    }
}
