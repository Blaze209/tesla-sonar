package p013kotlin.reflect.jvm.internal.impl.builtins.functions;

import bo0.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.utils.addToStdlib.AddToStdlibKt;

/* JADX INFO: loaded from: classes9.dex */
public final class FunctionClassDescriptor extends AbstractClassDescriptor {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ClassId f86595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final ClassId f86596n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final StorageManager f86597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final PackageFragmentDescriptor f86598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FunctionTypeKind f86599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f86600h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f86601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final FunctionClassScope f86602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<TypeParameterDescriptor> f86603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FunctionClassKind f86604l;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final class a extends AbstractClassTypeConstructor {
        public a() {
            super(FunctionClassDescriptor.this.f86597e);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, p013kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public FunctionClassDescriptor mo500getDeclarationDescriptor() {
            return FunctionClassDescriptor.this;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public List<TypeParameterDescriptor> getParameters() {
            return FunctionClassDescriptor.this.f86603k;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor
        public boolean isDenotable() {
            return true;
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected Collection<KotlinType> l() {
            List listP;
            FunctionTypeKind functionTypeKind = FunctionClassDescriptor.this.getFunctionTypeKind();
            FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
            if (s.f(functionTypeKind, function)) {
                listP = v.e(FunctionClassDescriptor.f86595m);
            } else if (s.f(functionTypeKind, FunctionTypeKind.KFunction.INSTANCE)) {
                listP = v.p(FunctionClassDescriptor.f86596n, new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, function.numberedClassName(FunctionClassDescriptor.this.getArity())));
            } else {
                FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
                if (s.f(functionTypeKind, suspendFunction)) {
                    listP = v.e(FunctionClassDescriptor.f86595m);
                } else {
                    if (!s.f(functionTypeKind, FunctionTypeKind.KSuspendFunction.INSTANCE)) {
                        AddToStdlibKt.shouldNotBeCalled$default(null, 1, null);
                        throw null;
                    }
                    listP = v.p(FunctionClassDescriptor.f86596n, new ClassId(StandardNames.COROUTINES_PACKAGE_FQ_NAME, suspendFunction.numberedClassName(FunctionClassDescriptor.this.getArity())));
                }
            }
            ModuleDescriptor containingDeclaration = FunctionClassDescriptor.this.f86598f.getContainingDeclaration();
            List<ClassId> list = listP;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            for (ClassId classId : list) {
                ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(containingDeclaration, classId);
                if (classDescriptorFindClassAcrossModuleDependencies == null) {
                    throw new IllegalStateException(("Built-in class " + classId + " not found").toString());
                }
                List listE1 = v.e1(getParameters(), classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor().getParameters().size());
                ArrayList arrayList2 = new ArrayList(v.y(listE1, 10));
                Iterator it = listE1.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new TypeProjectionImpl(((TypeParameterDescriptor) it.next()).getDefaultType()));
                }
                arrayList.add(KotlinTypeFactory.simpleNotNullType(TypeAttributes.Companion.getEmpty(), classDescriptorFindClassAcrossModuleDependencies, arrayList2));
            }
            return v.m1(arrayList);
        }

        @Override // p013kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
        protected SupertypeLoopChecker p() {
            return SupertypeLoopChecker.EMPTY.INSTANCE;
        }

        public String toString() {
            return mo500getDeclarationDescriptor().toString();
        }
    }

    static {
        FqName fqName = StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        Name nameIdentifier = Name.identifier("Function");
        s.j(nameIdentifier, "identifier(...)");
        f86595m = new ClassId(fqName, nameIdentifier);
        FqName fqName2 = StandardNames.KOTLIN_REFLECT_FQ_NAME;
        Name nameIdentifier2 = Name.identifier("KFunction");
        s.j(nameIdentifier2, "identifier(...)");
        f86596n = new ClassId(fqName2, nameIdentifier2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FunctionClassDescriptor(StorageManager storageManager, PackageFragmentDescriptor containingDeclaration, FunctionTypeKind functionTypeKind, int i11) {
        super(storageManager, functionTypeKind.numberedClassName(i11));
        s.k(storageManager, "storageManager");
        s.k(containingDeclaration, "containingDeclaration");
        s.k(functionTypeKind, "functionTypeKind");
        this.f86597e = storageManager;
        this.f86598f = containingDeclaration;
        this.f86599g = functionTypeKind;
        this.f86600h = i11;
        this.f86601i = new a();
        this.f86602j = new FunctionClassScope(storageManager, this);
        ArrayList arrayList = new ArrayList();
        j jVar = new j(1, i11);
        ArrayList arrayList2 = new ArrayList(v.y(jVar, 10));
        Iterator<Integer> it = jVar.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            Variance variance = Variance.IN_VARIANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append('P');
            sb2.append(iNextInt);
            b(arrayList, this, variance, sb2.toString());
            arrayList2.add(h0.f84049a);
        }
        b(arrayList, this, Variance.OUT_VARIANCE, "R");
        this.f86603k = v.m1(arrayList);
        this.f86604l = FunctionClassKind.Companion.getFunctionClassKind(this.f86599g);
    }

    private static final void b(ArrayList<TypeParameterDescriptor> arrayList, FunctionClassDescriptor functionClassDescriptor, Variance variance, String str) {
        arrayList.add(TypeParameterDescriptorImpl.createWithDefaultBound(functionClassDescriptor, Annotations.Companion.getEMPTY(), false, variance, Name.identifier(str), arrayList.size(), functionClassDescriptor.f86597e));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FunctionClassScope getUnsubstitutedMemberScope(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f86602j;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return Annotations.Companion.getEMPTY();
    }

    public final int getArity() {
        return this.f86600h;
    }

    public Void getCompanionObjectDescriptor() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.f86603k;
    }

    public final FunctionTypeKind getFunctionTypeKind() {
        return this.f86599g;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public ClassKind getKind() {
        return ClassKind.INTERFACE;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality getModality() {
        return Modality.ABSTRACT;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement getSource() {
        SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
        s.j(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor getTypeConstructor() {
        return this.f86601i;
    }

    public Void getUnsubstitutedPrimaryConstructor() {
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

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
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
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public String toString() {
        String strAsString = getName().asString();
        s.j(strAsString, "asString(...)");
        return strAsString;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getCompanionObjectDescriptor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassDescriptor mo494getCompanionObjectDescriptor() {
        return (ClassDescriptor) getCompanionObjectDescriptor();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassConstructorDescriptor> getConstructors() {
        return v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, p013kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PackageFragmentDescriptor getContainingDeclaration() {
        return this.f86598f;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public List<ClassDescriptor> getSealedSubclasses() {
        return v.m();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public MemberScope.Empty getStaticScope() {
        return MemberScope.Empty.INSTANCE;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* JADX INFO: renamed from: getUnsubstitutedPrimaryConstructor, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ ClassConstructorDescriptor mo495getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) getUnsubstitutedPrimaryConstructor();
    }
}
