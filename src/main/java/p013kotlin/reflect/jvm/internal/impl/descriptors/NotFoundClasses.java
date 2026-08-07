package p013kotlin.reflect.jvm.internal.impl.descriptors;

import bo0.j;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.d1;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes9.dex */
public final class NotFoundClasses {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StorageManager f86701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ModuleDescriptor f86702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<FqName, PackageFragmentDescriptor> f86703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final MemoizedFunctionToNotNull<a, ClassDescriptor> f86704d;

    public static final class MockClassDescriptor extends ClassDescriptorBase {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f86705h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final List<TypeParameterDescriptor> f86706i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final ClassTypeConstructorImpl f86707j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(StorageManager storageManager, DeclarationDescriptor container, Name name, boolean z11, int i11) {
            super(storageManager, container, name, SourceElement.NO_SOURCE, false);
            s.k(storageManager, "storageManager");
            s.k(container, "container");
            s.k(name, "name");
            this.f86705h = z11;
            j jVarW = n.w(0, i11);
            ArrayList arrayList = new ArrayList(v.y(jVarW, 10));
            Iterator<Integer> it = jVarW.iterator();
            while (it.hasNext()) {
                int iNextInt = ((s0) it).nextInt();
                Annotations empty = Annotations.Companion.getEMPTY();
                Variance variance = Variance.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(iNextInt);
                arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(this, empty, false, variance, Name.identifier(sb2.toString()), iNextInt, storageManager));
            }
            this.f86706i = arrayList;
            this.f86707j = new ClassTypeConstructorImpl(this, TypeParameterUtilsKt.computeConstructorTypeParameters(this), d1.c(DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MemberScope.Empty getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
            s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
            return MemberScope.Empty.INSTANCE;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        public Annotations getAnnotations() {
            return Annotations.Companion.getEMPTY();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* JADX INFO: renamed from: getCompanionObjectDescriptor */
        public ClassDescriptor mo494getCompanionObjectDescriptor() {
            return null;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Collection<ClassConstructorDescriptor> getConstructors() {
            return d1.d();
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.f86706i;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public Modality getModality() {
            return Modality.FINAL;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public Collection<ClassDescriptor> getSealedSubclasses() {
            return v.m();
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
            DescriptorVisibility PUBLIC = DescriptorVisibilities.PUBLIC;
            s.j(PUBLIC, "PUBLIC");
            return PUBLIC;
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

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public boolean isExternal() {
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
            return this.f86705h;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public boolean isValue() {
            return false;
        }

        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public MemberScope.Empty getStaticScope() {
            return MemberScope.Empty.INSTANCE;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        public ClassTypeConstructorImpl getTypeConstructor() {
            return this.f86707j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClassId f86708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<Integer> f86709b;

        public a(ClassId classId, List<Integer> typeParametersCount) {
            s.k(classId, "classId");
            s.k(typeParametersCount, "typeParametersCount");
            this.f86708a = classId;
            this.f86709b = typeParametersCount;
        }

        public final ClassId a() {
            return this.f86708a;
        }

        public final List<Integer> b() {
            return this.f86709b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.f(this.f86708a, aVar.f86708a) && s.f(this.f86709b, aVar.f86709b);
        }

        public int hashCode() {
            return (this.f86708a.hashCode() * 31) + this.f86709b.hashCode();
        }

        public String toString() {
            return "ClassRequest(classId=" + this.f86708a + ", typeParametersCount=" + this.f86709b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public NotFoundClasses(StorageManager storageManager, ModuleDescriptor module) {
        s.k(storageManager, "storageManager");
        s.k(module, "module");
        this.f86701a = storageManager;
        this.f86702b = module;
        this.f86703c = storageManager.createMemoizedFunction(new c(this));
        this.f86704d = storageManager.createMemoizedFunction(new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ClassDescriptor c(NotFoundClasses notFoundClasses, a aVar) {
        DeclarationDescriptor declarationDescriptor;
        s.k(aVar, "<destruct>");
        ClassId classIdA = aVar.a();
        List<Integer> listB = aVar.b();
        if (classIdA.isLocal()) {
            throw new UnsupportedOperationException("Unresolved local class: " + classIdA);
        }
        ClassId outerClassId = classIdA.getOuterClassId();
        if (outerClassId == null || (declarationDescriptor = notFoundClasses.getClass(outerClassId, v.i0(listB, 1))) == null) {
            declarationDescriptor = (ClassOrPackageFragmentDescriptor) notFoundClasses.f86703c.invoke(classIdA.getPackageFqName());
        }
        DeclarationDescriptor declarationDescriptor2 = declarationDescriptor;
        boolean zIsNestedClass = classIdA.isNestedClass();
        StorageManager storageManager = notFoundClasses.f86701a;
        Name shortClassName = classIdA.getShortClassName();
        Integer num = (Integer) v.q0(listB);
        return new MockClassDescriptor(storageManager, declarationDescriptor2, shortClassName, zIsNestedClass, num != null ? num.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PackageFragmentDescriptor d(NotFoundClasses notFoundClasses, FqName fqName) {
        s.k(fqName, "fqName");
        return new EmptyPackageFragmentDescriptor(notFoundClasses.f86702b, fqName);
    }

    public final ClassDescriptor getClass(ClassId classId, List<Integer> typeParametersCount) {
        s.k(classId, "classId");
        s.k(typeParametersCount, "typeParametersCount");
        return (ClassDescriptor) this.f86704d.invoke(new a(classId, typeParametersCount));
    }
}
