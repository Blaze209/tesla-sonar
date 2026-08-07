package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.InnerClassesScopeWrapper;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p013kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractClassDescriptor extends ModuleAwareClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Name f86761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final NotNullLazyValue<SimpleType> f86762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue<MemberScope> f86763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue<ReceiverParameterDescriptor> f86764d;

    class a implements wn0.a<SimpleType> {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor$a$a, reason: collision with other inner class name */
        class C1863a implements l<KotlinTypeRefiner, SimpleType> {
            C1863a() {
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SimpleType invoke(KotlinTypeRefiner kotlinTypeRefiner) {
                ClassifierDescriptor classifierDescriptorRefineDescriptor = kotlinTypeRefiner.refineDescriptor(AbstractClassDescriptor.this);
                if (classifierDescriptorRefineDescriptor == null) {
                    return (SimpleType) AbstractClassDescriptor.this.f86762b.invoke();
                }
                if (classifierDescriptorRefineDescriptor instanceof TypeAliasDescriptor) {
                    return KotlinTypeFactory.computeExpandedType((TypeAliasDescriptor) classifierDescriptorRefineDescriptor, TypeUtils.getDefaultTypeProjections(classifierDescriptorRefineDescriptor.getTypeConstructor().getParameters()));
                }
                return classifierDescriptorRefineDescriptor instanceof ModuleAwareClassDescriptor ? TypeUtils.makeUnsubstitutedType(classifierDescriptorRefineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner), ((ModuleAwareClassDescriptor) classifierDescriptorRefineDescriptor).getUnsubstitutedMemberScope(kotlinTypeRefiner), this) : classifierDescriptorRefineDescriptor.getDefaultType();
            }
        }

        a() {
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleType invoke() {
            AbstractClassDescriptor abstractClassDescriptor = AbstractClassDescriptor.this;
            return TypeUtils.makeUnsubstitutedType(abstractClassDescriptor, abstractClassDescriptor.getUnsubstitutedMemberScope(), new C1863a());
        }
    }

    class b implements wn0.a<MemberScope> {
        b() {
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MemberScope invoke() {
            return new InnerClassesScopeWrapper(AbstractClassDescriptor.this.getUnsubstitutedMemberScope());
        }
    }

    class c implements wn0.a<ReceiverParameterDescriptor> {
        c() {
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ReceiverParameterDescriptor invoke() {
            return new LazyClassReceiverParameterDescriptor(AbstractClassDescriptor.this);
        }
    }

    public AbstractClassDescriptor(StorageManager storageManager, Name name) {
        if (storageManager == null) {
            a(0);
        }
        if (name == null) {
            a(1);
        }
        this.f86761a = name;
        this.f86762b = storageManager.createLazyValue(new a());
        this.f86763c = storageManager.createLazyValue(new b());
        this.f86764d = storageManager.createLazyValue(new c());
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16 || i11 == 17 || i11 == 19 || i11 == 20) ? 2 : 3];
        switch (i11) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i11 == 2) {
            objArr[1] = "getName";
        } else if (i11 == 3) {
            objArr[1] = "getOriginal";
        } else if (i11 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i11 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i11 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i11 == 9 || i11 == 12 || i11 == 14 || i11 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i11 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i11 == 19) {
            objArr[1] = "substitute";
        } else if (i11 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i11) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 6 && i11 != 9 && i11 != 12 && i11 != 14 && i11 != 16 && i11 != 17 && i11 != 19 && i11 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d11) {
        return declarationDescriptorVisitor.visitClassDescriptor(this, d11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ReceiverParameterDescriptor> getContextReceivers() {
        List<ReceiverParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            a(6);
        }
        return list;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType getDefaultType() {
        SimpleType simpleType = (SimpleType) this.f86762b.invoke();
        if (simpleType == null) {
            a(20);
        }
        return simpleType;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        if (typeSubstitution == null) {
            a(10);
        }
        if (kotlinTypeRefiner == null) {
            a(11);
        }
        if (!typeSubstitution.isEmpty()) {
            return new SubstitutingScope(getUnsubstitutedMemberScope(kotlinTypeRefiner), TypeSubstitutor.create(typeSubstitution));
        }
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(kotlinTypeRefiner);
        if (unsubstitutedMemberScope == null) {
            a(12);
        }
        return unsubstitutedMemberScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.f86761a;
        if (name == null) {
            a(2);
        }
        return name;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ClassDescriptor getOriginal() {
        return this;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ReceiverParameterDescriptor getThisAsReceiverParameter() {
        ReceiverParameterDescriptor receiverParameterDescriptor = (ReceiverParameterDescriptor) this.f86764d.invoke();
        if (receiverParameterDescriptor == null) {
            a(5);
        }
        return receiverParameterDescriptor;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedInnerClassesScope() {
        MemberScope memberScope = (MemberScope) this.f86763c.invoke();
        if (memberScope == null) {
            a(4);
        }
        return memberScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getUnsubstitutedMemberScope() {
        MemberScope unsubstitutedMemberScope = getUnsubstitutedMemberScope(DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
        if (unsubstitutedMemberScope == null) {
            a(17);
        }
        return unsubstitutedMemberScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public ClassDescriptor substitute(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            a(18);
        }
        return typeSubstitutor.isEmpty() ? this : new LazySubstitutingClassDescriptor(this, typeSubstitutor);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getMemberScope(TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            a(15);
        }
        MemberScope memberScope = getMemberScope(typeSubstitution, DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtils.getContainingModule(this)));
        if (memberScope == null) {
            a(16);
        }
        return memberScope;
    }
}
