package p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import ch.qos.logback.core.CoreConstants;
import co0.g;
import ho0.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.s0;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import p013kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import p013kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.text.t;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f87028a;

    /* synthetic */ class a extends o implements l<Member, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f87029a = new a();

        a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p11) {
            s.k(p11, "p0");
            return Boolean.valueOf(p11.isSynthetic());
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(Member.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* synthetic */ class b extends o implements l<Constructor<?>, ReflectJavaConstructor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f87030a = new b();

        b() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReflectJavaConstructor invoke(Constructor<?> p11) {
            s.k(p11, "p0");
            return new ReflectJavaConstructor(p11);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "<init>";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(ReflectJavaConstructor.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Constructor;)V";
        }
    }

    /* synthetic */ class c extends o implements l<Member, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f87031a = new c();

        c() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Member p11) {
            s.k(p11, "p0");
            return Boolean.valueOf(p11.isSynthetic());
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "isSynthetic";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(Member.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "isSynthetic()Z";
        }
    }

    /* synthetic */ class d extends o implements l<Field, ReflectJavaField> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f87032a = new d();

        d() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReflectJavaField invoke(Field p11) {
            s.k(p11, "p0");
            return new ReflectJavaField(p11);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "<init>";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(ReflectJavaField.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Field;)V";
        }
    }

    /* synthetic */ class e extends o implements l<Method, ReflectJavaMethod> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f87033a = new e();

        e() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReflectJavaMethod invoke(Method p11) {
            s.k(p11, "p0");
            return new ReflectJavaMethod(p11);
        }

        @Override // p013kotlin.jvm.internal.f, co0.c
        public final String getName() {
            return "<init>";
        }

        @Override // p013kotlin.jvm.internal.f
        public final g getOwner() {
            return o0.b(ReflectJavaMethod.class);
        }

        @Override // p013kotlin.jvm.internal.f
        public final String getSignature() {
            return "<init>(Ljava/lang/reflect/Method;)V";
        }
    }

    public ReflectJavaClass(Class<?> klass) {
        s.k(klass, "klass");
        this.f87028a = klass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Class cls) {
        String simpleName = cls.getSimpleName();
        s.j(simpleName, "getSimpleName(...)");
        return simpleName.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Name b(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!Name.isValidIdentifier(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.identifier(simpleName);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(ReflectJavaClass reflectJavaClass, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (!reflectJavaClass.isEnum()) {
            return true;
        }
        s.h(method);
        return !reflectJavaClass.g(method);
    }

    private final boolean g(Method method) {
        String name = method.getName();
        if (s.f(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            s.j(parameterTypes, "getParameterTypes(...)");
            return parameterTypes.length == 0;
        }
        if (s.f(name, CoreConstants.VALUE_OF)) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ReflectJavaClass) && s.f(this.f87028a, ((ReflectJavaClass) obj).f87028a);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ JavaAnnotation findAnnotation(FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public FqName getFqName() {
        return ReflectClassUtilKt.getClassId(this.f87028a).asSingleFqName();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public LightClassOriginKind getLightClassOriginKind() {
        return null;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.f87028a.getModifiers();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public Name getName() {
        if (!this.f87028a.isAnonymousClass()) {
            Name nameIdentifier = Name.identifier(this.f87028a.getSimpleName());
            s.h(nameIdentifier);
            return nameIdentifier;
        }
        String name = this.f87028a.getName();
        s.j(name, "getName(...)");
        Name nameIdentifier2 = Name.identifier(t.v1(name, ".", null, 2, null));
        s.h(nameIdentifier2);
        return nameIdentifier2;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public i<JavaClassifierType> getPermittedTypes() throws IllegalAccessException, InvocationTargetException {
        Class<?>[] clsArrC = Java16SealedRecordLoader.f87006a.c(this.f87028a);
        if (clsArrC != null) {
            ArrayList arrayList = new ArrayList(clsArrC.length);
            for (Class<?> cls : clsArrC) {
                arrayList.add(new ReflectJavaClassifierType(cls));
            }
            i<JavaClassifierType> iVarE0 = v.e0(arrayList);
            if (iVarE0 != null) {
                return iVarE0;
            }
        }
        return ho0.l.j();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection<JavaRecordComponent> getRecordComponents() {
        Object[] objArrD = Java16SealedRecordLoader.f87006a.d(this.f87028a);
        if (objArrD == null) {
            objArrD = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrD.length);
        for (Object obj : objArrD) {
            arrayList.add(new ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public Collection<JavaClassifierType> getSupertypes() {
        if (s.f(this.f87028a, Object.class)) {
            return v.m();
        }
        s0 s0Var = new s0(2);
        Type genericSuperclass = this.f87028a.getGenericSuperclass();
        s0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        s0Var.b(this.f87028a.getGenericInterfaces());
        List listP = v.p(s0Var.d(new Type[s0Var.c()]));
        ArrayList arrayList = new ArrayList(v.y(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReflectJavaClassifierType((Type) it.next()));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f87028a.getTypeParameters();
        s.j(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return Visibilities.Public.INSTANCE;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Visibilities.Private.INSTANCE;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.INSTANCE : JavaVisibilities.ProtectedAndPackage.INSTANCE;
        }
        return JavaVisibilities.PackageVisibility.INSTANCE;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean hasDefaultConstructor() {
        return false;
    }

    public int hashCode() {
        return this.f87028a.hashCode();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isAnnotationType() {
        return this.f87028a.isAnnotation();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isEnum() {
        return this.f87028a.isEnum();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isInterface() {
        return this.f87028a.isInterface();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isRecord() throws IllegalAccessException, InvocationTargetException {
        Boolean boolE = Java16SealedRecordLoader.f87006a.e(this.f87028a);
        if (boolE != null) {
            return boolE.booleanValue();
        }
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isSealed() throws IllegalAccessException, InvocationTargetException {
        Boolean boolF = Java16SealedRecordLoader.f87006a.f(this.f87028a);
        if (boolF != null) {
            return boolF.booleanValue();
        }
        return false;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return Modifier.isStatic(getModifiers());
    }

    public String toString() {
        return ReflectJavaClass.class.getName() + ": " + this.f87028a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public ReflectJavaAnnotation findAnnotation(FqName fqName) {
        Annotation[] declaredAnnotations;
        s.k(fqName, "fqName");
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> annotations;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? v.m() : annotations;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<ReflectJavaConstructor> getConstructors() {
        Constructor<?>[] declaredConstructors = this.f87028a.getDeclaredConstructors();
        s.j(declaredConstructors, "getDeclaredConstructors(...)");
        return ho0.l.c0(ho0.l.U(ho0.l.I(n.Z(declaredConstructors), a.f87029a), b.f87030a));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public Class<?> getElement() {
        return this.f87028a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<ReflectJavaField> getFields() {
        Field[] declaredFields = this.f87028a.getDeclaredFields();
        s.j(declaredFields, "getDeclaredFields(...)");
        return ho0.l.c0(ho0.l.U(ho0.l.I(n.Z(declaredFields), c.f87031a), d.f87032a));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<Name> getInnerClassNames() {
        Class<?>[] declaredClasses = this.f87028a.getDeclaredClasses();
        s.j(declaredClasses, "getDeclaredClasses(...)");
        return ho0.l.c0(ho0.l.V(ho0.l.I(n.Z(declaredClasses), p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.c.f87057a), p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.f87058a));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public List<ReflectJavaMethod> getMethods() {
        Method[] declaredMethods = this.f87028a.getDeclaredMethods();
        s.j(declaredMethods, "getDeclaredMethods(...)");
        return ho0.l.c0(ho0.l.U(ho0.l.H(n.Z(declaredMethods), new p013kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e(this)), e.f87033a));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public ReflectJavaClass getOuterClass() {
        Class<?> declaringClass = this.f87028a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }
}
