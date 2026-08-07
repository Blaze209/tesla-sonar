package p013kotlin.reflect.jvm.internal.impl.builtins;

import co0.m;
import java.util.List;
import jn0.p;
import p013kotlin.Lazy;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import p013kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p013kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import p013kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import p013kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectionTypes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NotFoundClasses f86569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f86570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f86571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f86572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f86573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f86574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f86575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f86576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f86577i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f86578j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f86568k = {o0.k(new f0(o0.b(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.k(new f0(o0.b(ReflectionTypes.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.k(new f0(o0.b(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.k(new f0(o0.b(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.k(new f0(o0.b(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.k(new f0(o0.b(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.k(new f0(o0.b(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), o0.k(new f0(o0.b(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KotlinType createKPropertyStarType(ModuleDescriptor module) {
            s.k(module, "module");
            ClassDescriptor classDescriptorFindClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(module, StandardNames.FqNames.kProperty);
            if (classDescriptorFindClassAcrossModuleDependencies == null) {
                return null;
            }
            TypeAttributes empty = TypeAttributes.Companion.getEmpty();
            List<TypeParameterDescriptor> parameters = classDescriptorFindClassAcrossModuleDependencies.getTypeConstructor().getParameters();
            s.j(parameters, "getParameters(...)");
            Object objU0 = v.U0(parameters);
            s.j(objU0, "single(...)");
            return KotlinTypeFactory.simpleNotNullType(empty, classDescriptorFindClassAcrossModuleDependencies, v.e(new StarProjectionImpl((TypeParameterDescriptor) objU0)));
        }

        private Companion() {
        }
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f86579a;

        public a(int i11) {
            this.f86579a = i11;
        }

        public final ClassDescriptor a(ReflectionTypes types, m<?> property) {
            s.k(types, "types");
            s.k(property, "property");
            return types.b(CapitalizeDecapitalizeKt.capitalizeAsciiOnly(property.getName()), this.f86579a);
        }
    }

    public ReflectionTypes(ModuleDescriptor module, NotFoundClasses notFoundClasses) {
        s.k(module, "module");
        s.k(notFoundClasses, "notFoundClasses");
        this.f86569a = notFoundClasses;
        this.f86570b = jn0.m.a(p.PUBLICATION, new e(module));
        this.f86571c = new a(1);
        this.f86572d = new a(1);
        this.f86573e = new a(1);
        this.f86574f = new a(2);
        this.f86575g = new a(3);
        this.f86576h = new a(1);
        this.f86577i = new a(2);
        this.f86578j = new a(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassDescriptor b(String str, int i11) {
        Name nameIdentifier = Name.identifier(str);
        s.j(nameIdentifier, "identifier(...)");
        ClassifierDescriptor classifierDescriptorMo501getContributedClassifier = c().mo501getContributedClassifier(nameIdentifier, NoLookupLocation.FROM_REFLECTION);
        ClassDescriptor classDescriptor = classifierDescriptorMo501getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo501getContributedClassifier : null;
        return classDescriptor == null ? this.f86569a.getClass(new ClassId(StandardNames.KOTLIN_REFLECT_FQ_NAME, nameIdentifier), v.e(Integer.valueOf(i11))) : classDescriptor;
    }

    private final MemberScope c() {
        return (MemberScope) this.f86570b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope d(ModuleDescriptor moduleDescriptor) {
        return moduleDescriptor.getPackage(StandardNames.KOTLIN_REFLECT_FQ_NAME).getMemberScope();
    }

    public final ClassDescriptor getKClass() {
        return this.f86571c.a(this, f86568k[0]);
    }
}
