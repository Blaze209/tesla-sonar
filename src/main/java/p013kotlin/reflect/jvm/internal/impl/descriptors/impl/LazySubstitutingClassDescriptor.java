package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import p013kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import p013kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import p013kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class LazySubstitutingClassDescriptor extends ModuleAwareClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ModuleAwareClassDescriptor f86878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeSubstitutor f86879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypeSubstitutor f86880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<TypeParameterDescriptor> f86881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<TypeParameterDescriptor> f86882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TypeConstructor f86883f;

    class a implements l<TypeParameterDescriptor, Boolean> {
        a() {
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(TypeParameterDescriptor typeParameterDescriptor) {
            return Boolean.valueOf(!typeParameterDescriptor.isCapturedFromOuterDeclaration());
        }
    }

    class b implements l<SimpleType, SimpleType> {
        b() {
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke(SimpleType simpleType) {
            return LazySubstitutingClassDescriptor.this.d(simpleType);
        }
    }

    public LazySubstitutingClassDescriptor(ModuleAwareClassDescriptor moduleAwareClassDescriptor, TypeSubstitutor typeSubstitutor) {
        this.f86878a = moduleAwareClassDescriptor;
        this.f86879b = typeSubstitutor;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 13 || i11 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 10 || i11 == 13 || i11 == 23) ? 3 : 2];
        if (i11 == 2) {
            objArr[0] = "typeArguments";
        } else if (i11 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i11 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i11 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i11 == 8) {
            objArr[0] = "typeArguments";
        } else if (i11 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i11 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i11 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i11) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i11 == 2 || i11 == 3 || i11 == 5 || i11 == 6 || i11 == 8 || i11 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i11 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i11 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 5 && i11 != 6 && i11 != 8 && i11 != 10 && i11 != 13 && i11 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    private TypeSubstitutor c() {
        if (this.f86880c == null) {
            if (this.f86879b.isEmpty()) {
                this.f86880c = this.f86879b;
            } else {
                List<TypeParameterDescriptor> parameters = this.f86878a.getTypeConstructor().getParameters();
                this.f86881d = new ArrayList(parameters.size());
                this.f86880c = DescriptorSubstitutor.substituteTypeParameters(parameters, this.f86879b.getSubstitution(), this, this.f86881d);
                this.f86882e = v.k0(this.f86881d, new a());
            }
        }
        return this.f86880c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SimpleType d(SimpleType simpleType) {
        return (simpleType == null || this.f86879b.isEmpty()) ? simpleType : (SimpleType) c().substitute(simpleType, Variance.INVARIANT);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.f86878a.getAnnotations();
        if (annotations == null) {
            a(19);
        }
        return annotations;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo494getCompanionObjectDescriptor() {
        return this.f86878a.mo494getCompanionObjectDescriptor();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        Collection<ClassConstructorDescriptor> constructors = this.f86878a.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (ClassConstructorDescriptor classConstructorDescriptor : constructors) {
            arrayList.add(((ClassConstructorDescriptor) classConstructorDescriptor.newCopyBuilder().setOriginal(classConstructorDescriptor.getOriginal()).setModality(classConstructorDescriptor.getModality()).setVisibility(classConstructorDescriptor.getVisibility()).setKind(classConstructorDescriptor.getKind()).setCopyOverrides(false).build()).substitute(c()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor getContainingDeclaration() {
        DeclarationDescriptor containingDeclaration = this.f86878a.getContainingDeclaration();
        if (containingDeclaration == null) {
            a(22);
        }
        return containingDeclaration;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            a(17);
        }
        return list;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        c();
        List<TypeParameterDescriptor> list = this.f86882e;
        if (list == null) {
            a(30);
        }
        return list;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleTypeSimpleTypeWithNonTrivialMemberScope = KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(DefaultTypeAttributeTranslator.INSTANCE.toAttributes(getAnnotations(), null, null), getTypeConstructor(), TypeUtils.getDefaultTypeProjections(getTypeConstructor().getParameters()), false, getUnsubstitutedMemberScope());
        if (simpleTypeSimpleTypeWithNonTrivialMemberScope == null) {
            a(16);
        }
        return simpleTypeSimpleTypeWithNonTrivialMemberScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        ClassKind kind = this.f86878a.getKind();
        if (kind == null) {
            a(25);
        }
        return kind;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            a(5);
        }
        if (kotlinTypeRefiner == null) {
            a(6);
        }
        MemberScope memberScope = this.f86878a.getMemberScope(typeSubstitution, kotlinTypeRefiner);
        if (!this.f86879b.isEmpty()) {
            return new SubstitutingScope(memberScope, c());
        }
        if (memberScope == null) {
            a(7);
        }
        return memberScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = this.f86878a.getModality();
        if (modality == null) {
            a(26);
        }
        return modality;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.f86878a.getName();
        if (name == null) {
            a(20);
        }
        return name;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        Collection<ClassDescriptor> sealedSubclasses = this.f86878a.getSealedSubclasses();
        if (sealedSubclasses == null) {
            a(31);
        }
        return sealedSubclasses;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        SourceElement sourceElement = SourceElement.NO_SOURCE;
        if (sourceElement == null) {
            a(29);
        }
        return sourceElement;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        MemberScope staticScope = this.f86878a.getStaticScope();
        if (staticScope == null) {
            a(15);
        }
        return staticScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        throw new UnsupportedOperationException();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.f86878a.getTypeConstructor();
        if (this.f86879b.isEmpty()) {
            if (typeConstructor == null) {
                a(0);
            }
            return typeConstructor;
        }
        if (this.f86883f == null) {
            TypeSubstitutor typeSubstitutorC = c();
            Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
            ArrayList arrayList = new ArrayList(supertypes.size());
            Iterator<KotlinType> it = supertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorC.substitute(it.next(), Variance.INVARIANT));
            }
            this.f86883f = new ClassTypeConstructorImpl(this, this.f86881d, arrayList, LockBasedStorageManager.NO_LOCKS);
        }
        TypeConstructor typeConstructor2 = this.f86883f;
        if (typeConstructor2 == null) {
            a(1);
        }
        return typeConstructor2;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope unsubstitutedInnerClassesScope = this.f86878a.getUnsubstitutedInnerClassesScope();
        if (unsubstitutedInnerClassesScope == null) {
            a(28);
        }
        return unsubstitutedInnerClassesScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this.f86878a)));
        if (unsubstitutedMemberScope == null) {
            a(12);
        }
        return unsubstitutedMemberScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo495getUnsubstitutedPrimaryConstructor() {
        return this.f86878a.mo495getUnsubstitutedPrimaryConstructor();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = this.f86878a.getValueClassRepresentation();
        if (valueClassRepresentation == null) {
            return null;
        }
        return valueClassRepresentation.mapUnderlyingType(new b());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility visibility = this.f86878a.getVisibility();
        if (visibility == null) {
            a(27);
        }
        return visibility;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return this.f86878a.isActual();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return this.f86878a.isCompanionObject();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return this.f86878a.isData();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return this.f86878a.isExpect();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f86878a.isExternal();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return this.f86878a.isFun();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return this.f86878a.isInline();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return this.f86878a.isInner();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return this.f86878a.isValue();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            a(13);
        }
        MemberScope unsubstitutedMemberScope = this.f86878a.getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (!this.f86879b.isEmpty()) {
            return new SubstitutingScope(unsubstitutedMemberScope, c());
        }
        if (unsubstitutedMemberScope == null) {
            a(14);
        }
        return unsubstitutedMemberScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public ClassDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            a(23);
        }
        return typeSubstitutor.isEmpty() ? this : new LazySubstitutingClassDescriptor(this, TypeSubstitutor.createChainedSubstitutor(typeSubstitutor.getSubstitution(), c().getSubstitution()));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ClassDescriptor getOriginal() {
        ClassDescriptor original = this.f86878a.getOriginal();
        if (original == null) {
            a(21);
        }
        return original;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            a(10);
        }
        MemberScope memberScope = getMemberScope(typeSubstitution, DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
        if (memberScope == null) {
            a(11);
        }
        return memberScope;
    }
}
