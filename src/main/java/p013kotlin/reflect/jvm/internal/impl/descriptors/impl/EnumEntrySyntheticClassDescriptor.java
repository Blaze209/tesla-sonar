package p013kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public class EnumEntrySyntheticClassDescriptor extends ClassDescriptorBase {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TypeConstructor f86804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MemberScope f86805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final NotNullLazyValue<Set<Name>> f86806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Annotations f86807k;

    private class a extends MemberScopeImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MemoizedFunctionToNotNull<Name, Collection<? extends SimpleFunctionDescriptor>> f86808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MemoizedFunctionToNotNull<Name, Collection<? extends PropertyDescriptor>> f86809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> f86810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EnumEntrySyntheticClassDescriptor f86811d;

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor$a$a, reason: collision with other inner class name */
        class C1864a implements l<Name, Collection<? extends SimpleFunctionDescriptor>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ EnumEntrySyntheticClassDescriptor f86812a;

            C1864a(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor) {
                this.f86812a = enumEntrySyntheticClassDescriptor;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends SimpleFunctionDescriptor> invoke(Name name) {
                return a.this.f(name);
            }
        }

        class b implements l<Name, Collection<? extends PropertyDescriptor>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ EnumEntrySyntheticClassDescriptor f86814a;

            b(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor) {
                this.f86814a = enumEntrySyntheticClassDescriptor;
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<? extends PropertyDescriptor> invoke(Name name) {
                return a.this.g(name);
            }
        }

        class c implements wn0.a<Collection<DeclarationDescriptor>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ EnumEntrySyntheticClassDescriptor f86816a;

            c(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor) {
                this.f86816a = enumEntrySyntheticClassDescriptor;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<DeclarationDescriptor> invoke() {
                return a.this.e();
            }
        }

        class d extends NonReportingOverrideStrategy {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f86818a;

            d(Set set) {
                this.f86818a = set;
            }

            private static /* synthetic */ void b(int i11) {
                Object[] objArr = new Object[3];
                if (i11 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i11 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i11 == 1 || i11 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
            protected void a(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor == null) {
                    b(1);
                }
                if (callableMemberDescriptor2 == null) {
                    b(2);
                }
            }

            @Override // p013kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            public void addFakeOverride(CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    b(0);
                }
                OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                this.f86818a.add(callableMemberDescriptor);
            }
        }

        public a(EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, StorageManager storageManager) {
            if (storageManager == null) {
                a(0);
            }
            this.f86811d = enumEntrySyntheticClassDescriptor;
            this.f86808a = storageManager.createMemoizedFunction(new C1864a(enumEntrySyntheticClassDescriptor));
            this.f86809b = storageManager.createMemoizedFunction(new b(enumEntrySyntheticClassDescriptor));
            this.f86810c = storageManager.createLazyValue(new c(enumEntrySyntheticClassDescriptor));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        private static /* synthetic */ void a(int i11) {
            String str;
            int i12;
            if (i11 != 3 && i11 != 7 && i11 != 9 && i11 != 12) {
                switch (i11) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i11 != 3 && i11 != 7 && i11 != 9 && i11 != 12) {
                switch (i11) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        i12 = 2;
                        break;
                    default:
                        i12 = 3;
                        break;
                }
            } else {
                i12 = 2;
            }
            Object[] objArr = new Object[i12];
            switch (i11) {
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i11 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i11 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i11 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i11 != 12) {
                switch (i11) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i11) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i11 != 3 && i11 != 7 && i11 != 9 && i11 != 12) {
                switch (i11) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<DeclarationDescriptor> e() {
            HashSet hashSet = new HashSet();
            for (Name name : (Set) this.f86811d.f86806j.invoke()) {
                NoLookupLocation noLookupLocation = NoLookupLocation.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(getContributedFunctions(name, noLookupLocation));
                hashSet.addAll(getContributedVariables(name, noLookupLocation));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<? extends SimpleFunctionDescriptor> f(Name name) {
            if (name == null) {
                a(8);
            }
            return i(name, h().getContributedFunctions(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<? extends PropertyDescriptor> g(Name name) {
            if (name == null) {
                a(4);
            }
            return i(name, h().getContributedVariables(name, NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        private MemberScope h() {
            MemberScope memberScope = this.f86811d.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
            if (memberScope == null) {
                a(9);
            }
            return memberScope;
        }

        private <D extends CallableMemberDescriptor> Collection<? extends D> i(Name name, Collection<? extends D> collection) {
            if (name == null) {
                a(10);
            }
            if (collection == null) {
                a(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.DEFAULT.generateOverridesInFunctionGroup(name, collection, Collections.EMPTY_SET, this.f86811d, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> getClassifierNames() {
            Set<Name> set = Collections.EMPTY_SET;
            if (set == null) {
                a(18);
            }
            return set;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, l<? super Name, Boolean> lVar) {
            if (descriptorKindFilter == null) {
                a(13);
            }
            if (lVar == null) {
                a(14);
            }
            Collection<DeclarationDescriptor> collection = (Collection) this.f86810c.invoke();
            if (collection == null) {
                a(15);
            }
            return collection;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                a(5);
            }
            if (lookupLocation == null) {
                a(6);
            }
            Collection<? extends SimpleFunctionDescriptor> collection = (Collection) this.f86808a.invoke(name);
            if (collection == null) {
                a(7);
            }
            return collection;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
            if (name == null) {
                a(1);
            }
            if (lookupLocation == null) {
                a(2);
            }
            Collection<? extends PropertyDescriptor> collection = (Collection) this.f86809b.invoke(name);
            if (collection == null) {
                a(3);
            }
            return collection;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> getFunctionNames() {
            Set<Name> set = (Set) this.f86811d.f86806j.invoke();
            if (set == null) {
                a(17);
            }
            return set;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public Set<Name> getVariableNames() {
            Set<Name> set = (Set) this.f86811d.f86806j.invoke();
            if (set == null) {
                a(19);
            }
            return set;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private EnumEntrySyntheticClassDescriptor(StorageManager storageManager, ClassDescriptor classDescriptor, KotlinType kotlinType, Name name, NotNullLazyValue<Set<Name>> notNullLazyValue, Annotations annotations, SourceElement sourceElement) {
        super(storageManager, classDescriptor, name, sourceElement, false);
        if (storageManager == null) {
            a(6);
        }
        if (classDescriptor == null) {
            a(7);
        }
        if (kotlinType == null) {
            a(8);
        }
        if (name == null) {
            a(9);
        }
        if (notNullLazyValue == null) {
            a(10);
        }
        if (annotations == null) {
            a(11);
        }
        if (sourceElement == null) {
            a(12);
        }
        this.f86807k = annotations;
        this.f86804h = new ClassTypeConstructorImpl(this, Collections.EMPTY_LIST, Collections.singleton(kotlinType), storageManager);
        this.f86805i = new a(this, storageManager);
        this.f86806j = notNullLazyValue;
    }

    private static /* synthetic */ void a(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i11) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i11) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static EnumEntrySyntheticClassDescriptor create(StorageManager storageManager, ClassDescriptor classDescriptor, Name name, NotNullLazyValue<Set<Name>> notNullLazyValue, Annotations annotations, SourceElement sourceElement) {
        if (storageManager == null) {
            a(0);
        }
        if (classDescriptor == null) {
            a(1);
        }
        if (name == null) {
            a(2);
        }
        if (notNullLazyValue == null) {
            a(3);
        }
        if (annotations == null) {
            a(4);
        }
        if (sourceElement == null) {
            a(5);
        }
        return new EnumEntrySyntheticClassDescriptor(storageManager, classDescriptor, classDescriptor.getDefaultType(), name, notNullLazyValue, annotations, sourceElement);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.f86807k;
        if (annotations == null) {
            a(21);
        }
        return annotations;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor */
    public ClassDescriptor mo494getCompanionObjectDescriptor() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassConstructorDescriptor> getConstructors() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            a(16);
        }
        return list;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        List<TypeParameterDescriptor> list = Collections.EMPTY_LIST;
        if (list == null) {
            a(22);
        }
        return list;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        ClassKind classKind = ClassKind.ENUM_ENTRY;
        if (classKind == null) {
            a(18);
        }
        return classKind;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        Modality modality = Modality.FINAL;
        if (modality == null) {
            a(19);
        }
        return modality;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public Collection<ClassDescriptor> getSealedSubclasses() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            a(23);
        }
        return list;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope getStaticScope() {
        MemberScope.Empty empty = MemberScope.Empty.INSTANCE;
        if (empty == null) {
            a(15);
        }
        return empty;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        TypeConstructor typeConstructor = this.f86804h;
        if (typeConstructor == null) {
            a(17);
        }
        return typeConstructor;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            a(13);
        }
        MemberScope memberScope = this.f86805i;
        if (memberScope == null) {
            a(14);
        }
        return memberScope;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor */
    public ClassConstructorDescriptor mo495getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ValueClassRepresentation<SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility == null) {
            a(20);
        }
        return descriptorVisibility;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public String toString() {
        return "enum entry " + getName();
    }
}
