package p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import co0.g;
import ho0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.n0;
import p013kotlin.jvm.internal.o;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt;
import p013kotlin.reflect.jvm.internal.impl.types.checker.Ref;
import p013kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport;
import p013kotlin.reflect.jvm.internal.impl.utils.DFS;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class DescriptorUtilsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Name f88478a;

    /* synthetic */ class a extends o implements l<ValueParameterDescriptor, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f88479a = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(ValueParameterDescriptor p11) {
            s.k(p11, "p0");
            return Boolean.valueOf(p11.declaresDefaultValue());
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "declaresDefaultValue";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(ValueParameterDescriptor.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "declaresDefaultValue()Z";
        }
    }

    static {
        Name nameIdentifier = Name.identifier("value");
        s.j(nameIdentifier, "identifier(...)");
        f88478a = nameIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeclarationDescriptor a(DeclarationDescriptor it) {
        s.k(it, "it");
        return it.getContainingDeclaration();
    }

    public static final boolean declaresOrInheritsDefaultValue(ValueParameterDescriptor valueParameterDescriptor) {
        s.k(valueParameterDescriptor, "<this>");
        Boolean boolIfAny = DFS.ifAny(v.e(valueParameterDescriptor), p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f88482a, a.f88479a);
        s.j(boolIfAny, "ifAny(...)");
        return boolIfAny.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable f(ValueParameterDescriptor valueParameterDescriptor) {
        Collection<ValueParameterDescriptor> overriddenDescriptors = valueParameterDescriptor.getOverriddenDescriptors();
        ArrayList arrayList = new ArrayList(v.y(overriddenDescriptors, 10));
        Iterator<T> it = overriddenDescriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getOriginal());
        }
        return arrayList;
    }

    public static final CallableMemberDescriptor firstOverridden(CallableMemberDescriptor callableMemberDescriptor, boolean z11, final l<? super CallableMemberDescriptor, Boolean> predicate) {
        s.k(callableMemberDescriptor, "<this>");
        s.k(predicate, "predicate");
        final n0 n0Var = new n0();
        return (CallableMemberDescriptor) DFS.dfs(v.e(callableMemberDescriptor), new c(z11), new DFS.AbstractNodeHandler<CallableMemberDescriptor, CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstOverridden.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public void afterChildren(CallableMemberDescriptor current) {
                s.k(current, "current");
                if (n0Var.f86529a == null && predicate.invoke(current).booleanValue()) {
                    n0Var.f86529a = current;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public boolean beforeChildren(CallableMemberDescriptor current) {
                s.k(current, "current");
                return n0Var.f86529a == null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public CallableMemberDescriptor result() {
                return n0Var.f86529a;
            }
        });
    }

    public static /* synthetic */ CallableMemberDescriptor firstOverridden$default(CallableMemberDescriptor callableMemberDescriptor, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return firstOverridden(callableMemberDescriptor, z11, lVar);
    }

    public static final FqName fqNameOrNull(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "<this>");
        FqNameUnsafe fqNameUnsafe = getFqNameUnsafe(declarationDescriptor);
        if (!fqNameUnsafe.isSafe()) {
            fqNameUnsafe = null;
        }
        if (fqNameUnsafe != null) {
            return fqNameUnsafe.toSafe();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g(boolean z11, CallableMemberDescriptor callableMemberDescriptor) {
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors;
        if (z11) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.getOriginal() : null;
        }
        return (callableMemberDescriptor == null || (overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors()) == null) ? v.m() : overriddenDescriptors;
    }

    public static final ClassDescriptor getAnnotationClass(AnnotationDescriptor annotationDescriptor) {
        s.k(annotationDescriptor, "<this>");
        ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = annotationDescriptor.getType().getConstructor().mo500getDeclarationDescriptor();
        if (classifierDescriptorMo500getDeclarationDescriptor instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor;
        }
        return null;
    }

    public static final KotlinBuiltIns getBuiltIns(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "<this>");
        return getModule(declarationDescriptor).getBuiltIns();
    }

    public static final ClassId getClassId(ClassifierDescriptor classifierDescriptor) {
        DeclarationDescriptor containingDeclaration;
        ClassId classId;
        if (classifierDescriptor != null && (containingDeclaration = classifierDescriptor.getContainingDeclaration()) != null) {
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
                Name name = classifierDescriptor.getName();
                s.j(name, "getName(...)");
                return new ClassId(fqName, name);
            }
            if ((containingDeclaration instanceof ClassifierDescriptorWithTypeParameters) && (classId = getClassId((ClassifierDescriptor) containingDeclaration)) != null) {
                Name name2 = classifierDescriptor.getName();
                s.j(name2, "getName(...)");
                return classId.createNestedClassId(name2);
            }
        }
        return null;
    }

    public static final FqName getFqNameSafe(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "<this>");
        FqName fqNameSafe = DescriptorUtils.getFqNameSafe(declarationDescriptor);
        s.j(fqNameSafe, "getFqNameSafe(...)");
        return fqNameSafe;
    }

    public static final FqNameUnsafe getFqNameUnsafe(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "<this>");
        FqNameUnsafe fqName = DescriptorUtils.getFqName(declarationDescriptor);
        s.j(fqName, "getFqName(...)");
        return fqName;
    }

    public static final InlineClassRepresentation<SimpleType> getInlineClassRepresentation(ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof InlineClassRepresentation) {
            return (InlineClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    public static final KotlinTypeRefiner getKotlinTypeRefiner(ModuleDescriptor moduleDescriptor) {
        s.k(moduleDescriptor, "<this>");
        Ref ref = (Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        TypeRefinementSupport typeRefinementSupport = ref != null ? (TypeRefinementSupport) ref.getValue() : null;
        return typeRefinementSupport instanceof TypeRefinementSupport.Enabled ? ((TypeRefinementSupport.Enabled) typeRefinementSupport).getTypeRefiner() : KotlinTypeRefiner.Default.INSTANCE;
    }

    public static final ModuleDescriptor getModule(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "<this>");
        ModuleDescriptor containingModule = DescriptorUtils.getContainingModule(declarationDescriptor);
        s.j(containingModule, "getContainingModule(...)");
        return containingModule;
    }

    public static final MultiFieldValueClassRepresentation<SimpleType> getMultiFieldValueClassRepresentation(ClassDescriptor classDescriptor) {
        ValueClassRepresentation<SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof MultiFieldValueClassRepresentation) {
            return (MultiFieldValueClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    public static final i<DeclarationDescriptor> getParents(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "<this>");
        return ho0.l.C(getParentsWithSelf(declarationDescriptor), 1);
    }

    public static final i<DeclarationDescriptor> getParentsWithSelf(DeclarationDescriptor declarationDescriptor) {
        s.k(declarationDescriptor, "<this>");
        return ho0.l.q(declarationDescriptor, b.f88483a);
    }

    public static final CallableMemberDescriptor getPropertyIfAccessor(CallableMemberDescriptor callableMemberDescriptor) {
        s.k(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        PropertyDescriptor correspondingProperty = ((PropertyAccessorDescriptor) callableMemberDescriptor).getCorrespondingProperty();
        s.j(correspondingProperty, "getCorrespondingProperty(...)");
        return correspondingProperty;
    }

    public static final ClassDescriptor getSuperClassNotAny(ClassDescriptor classDescriptor) {
        s.k(classDescriptor, "<this>");
        for (KotlinType kotlinType : classDescriptor.getDefaultType().getConstructor().getSupertypes()) {
            if (!KotlinBuiltIns.isAnyOrNullableAny(kotlinType)) {
                ClassifierDescriptor classifierDescriptorMo500getDeclarationDescriptor = kotlinType.getConstructor().mo500getDeclarationDescriptor();
                if (DescriptorUtils.isClassOrEnumClass(classifierDescriptorMo500getDeclarationDescriptor)) {
                    s.i(classifierDescriptorMo500getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (ClassDescriptor) classifierDescriptorMo500getDeclarationDescriptor;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i h(boolean z11, CallableMemberDescriptor callableMemberDescriptor) {
        s.h(callableMemberDescriptor);
        return overriddenTreeAsSequence(callableMemberDescriptor, z11);
    }

    public static final boolean isTypeRefinementEnabled(ModuleDescriptor moduleDescriptor) {
        TypeRefinementSupport typeRefinementSupport;
        s.k(moduleDescriptor, "<this>");
        Ref ref = (Ref) moduleDescriptor.getCapability(KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        return (ref == null || (typeRefinementSupport = (TypeRefinementSupport) ref.getValue()) == null || !typeRefinementSupport.isEnabled()) ? false : true;
    }

    public static final i<CallableMemberDescriptor> overriddenTreeAsSequence(CallableMemberDescriptor callableMemberDescriptor, boolean z11) {
        s.k(callableMemberDescriptor, "<this>");
        if (z11) {
            callableMemberDescriptor = callableMemberDescriptor.getOriginal();
        }
        i iVarV = ho0.l.v(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        s.j(overriddenDescriptors, "getOverriddenDescriptors(...)");
        return ho0.l.W(iVarV, ho0.l.N(v.e0(overriddenDescriptors), new d(z11)));
    }

    public static final ClassDescriptor resolveTopLevelClass(ModuleDescriptor moduleDescriptor, FqName topLevelClassFqName, LookupLocation location) {
        s.k(moduleDescriptor, "<this>");
        s.k(topLevelClassFqName, "topLevelClassFqName");
        s.k(location, "location");
        topLevelClassFqName.isRoot();
        FqName fqNameParent = topLevelClassFqName.parent();
        s.j(fqNameParent, "parent(...)");
        MemberScope memberScope = moduleDescriptor.getPackage(fqNameParent).getMemberScope();
        Name nameShortName = topLevelClassFqName.shortName();
        s.j(nameShortName, "shortName(...)");
        ClassifierDescriptor classifierDescriptorMo501getContributedClassifier = memberScope.mo501getContributedClassifier(nameShortName, location);
        if (classifierDescriptorMo501getContributedClassifier instanceof ClassDescriptor) {
            return (ClassDescriptor) classifierDescriptorMo501getContributedClassifier;
        }
        return null;
    }
}
