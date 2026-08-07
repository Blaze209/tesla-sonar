package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import co0.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.x;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import p013kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import p013kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationAsAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassObjectAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaLiteralAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import p013kotlin.reflect.jvm.internal.impl.name.ClassId;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;
import p013kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p013kotlin.reflect.jvm.internal.impl.types.Variance;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p013kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyJavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f87264i = {o0.k(new f0(o0.b(LazyJavaAnnotationDescriptor.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), o0.k(new f0(o0.b(LazyJavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), o0.k(new f0(o0.b(LazyJavaAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LazyJavaResolverContext f87265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JavaAnnotation f87266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NullableLazyValue f87267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue f87268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JavaSourceElement f87269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NotNullLazyValue f87270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f87271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f87272h;

    public LazyJavaAnnotationDescriptor(LazyJavaResolverContext c11, JavaAnnotation javaAnnotation, boolean z11) {
        s.k(c11, "c");
        s.k(javaAnnotation, "javaAnnotation");
        this.f87265a = c11;
        this.f87266b = javaAnnotation;
        this.f87267c = c11.getStorageManager().createNullableLazyValue(new c(this));
        this.f87268d = c11.getStorageManager().createLazyValue(new d(this));
        this.f87269e = c11.getComponents().getSourceElementFactory().source(javaAnnotation);
        this.f87270f = c11.getStorageManager().createLazyValue(new e(this));
        this.f87271g = javaAnnotation.isIdeExternalAnnotation();
        this.f87272h = javaAnnotation.isFreshlySupportedTypeUseAnnotation() || z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map d(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        Collection<JavaAnnotationArgument> arguments = lazyJavaAnnotationDescriptor.f87266b.getArguments();
        ArrayList arrayList = new ArrayList();
        for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
            Name name = javaAnnotationArgument.getName();
            if (name == null) {
                name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
            }
            ConstantValue<?> constantValueG = lazyJavaAnnotationDescriptor.g(javaAnnotationArgument);
            Pair pairA = constantValueG != null ? x.a(name, constantValueG) : null;
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return v0.y(arrayList);
    }

    private final ClassDescriptor e(FqName fqName) {
        return FindClassInModuleKt.findNonGenericClassAcrossDependencies(this.f87265a.getModule(), ClassId.Companion.topLevel(fqName), this.f87265a.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FqName f(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        ClassId classId = lazyJavaAnnotationDescriptor.f87266b.getClassId();
        if (classId != null) {
            return classId.asSingleFqName();
        }
        return null;
    }

    private final ConstantValue<?> g(JavaAnnotationArgument javaAnnotationArgument) {
        if (javaAnnotationArgument instanceof JavaLiteralAnnotationArgument) {
            return ConstantValueFactory.createConstantValue$default(ConstantValueFactory.INSTANCE, ((JavaLiteralAnnotationArgument) javaAnnotationArgument).getValue(), null, 2, null);
        }
        if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
            JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = (JavaEnumValueAnnotationArgument) javaAnnotationArgument;
            return j(javaEnumValueAnnotationArgument.getEnumClassId(), javaEnumValueAnnotationArgument.getEntryName());
        }
        if (!(javaAnnotationArgument instanceof JavaArrayAnnotationArgument)) {
            if (javaAnnotationArgument instanceof JavaAnnotationAsAnnotationArgument) {
                return h(((JavaAnnotationAsAnnotationArgument) javaAnnotationArgument).getAnnotation());
            }
            if (javaAnnotationArgument instanceof JavaClassObjectAnnotationArgument) {
                return k(((JavaClassObjectAnnotationArgument) javaAnnotationArgument).getReferencedType());
            }
            return null;
        }
        JavaArrayAnnotationArgument javaArrayAnnotationArgument = (JavaArrayAnnotationArgument) javaAnnotationArgument;
        Name name = javaArrayAnnotationArgument.getName();
        if (name == null) {
            name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
        }
        s.h(name);
        return i(name, javaArrayAnnotationArgument.getElements());
    }

    private final ConstantValue<?> h(JavaAnnotation javaAnnotation) {
        return new AnnotationValue(new LazyJavaAnnotationDescriptor(this.f87265a, javaAnnotation, false, 4, null));
    }

    private final ConstantValue<?> i(Name name, List<? extends JavaAnnotationArgument> list) {
        KotlinType arrayType;
        if (KotlinTypeKt.isError(getType())) {
            return null;
        }
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(this);
        s.h(annotationClass);
        ValueParameterDescriptor annotationParameterByName = DescriptorResolverUtils.getAnnotationParameterByName(name, annotationClass);
        if (annotationParameterByName == null || (arrayType = annotationParameterByName.getType()) == null) {
            arrayType = this.f87265a.getComponents().getModule().getBuiltIns().getArrayType(Variance.INVARIANT, ErrorUtils.createErrorType(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new String[0]));
            s.j(arrayType, "getArrayType(...)");
        }
        List<? extends JavaAnnotationArgument> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ConstantValue<?> constantValueG = g((JavaAnnotationArgument) it.next());
            if (constantValueG == null) {
                constantValueG = new NullValue();
            }
            arrayList.add(constantValueG);
        }
        return ConstantValueFactory.INSTANCE.createArrayValue(arrayList, arrayType);
    }

    private final ConstantValue<?> j(ClassId classId, Name name) {
        if (classId == null || name == null) {
            return null;
        }
        return new EnumValue(classId, name);
    }

    private final ConstantValue<?> k(JavaType javaType) {
        return KClassValue.Companion.create(this.f87265a.getTypeResolver().transformJavaType(javaType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType l(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor) {
        FqName fqName = lazyJavaAnnotationDescriptor.getFqName();
        if (fqName == null) {
            return ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, lazyJavaAnnotationDescriptor.f87266b.toString());
        }
        ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(JavaToKotlinClassMapper.INSTANCE, fqName, lazyJavaAnnotationDescriptor.f87265a.getModule().getBuiltIns(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            JavaClass javaClassResolve = lazyJavaAnnotationDescriptor.f87266b.resolve();
            classDescriptorMapJavaToKotlin$default = javaClassResolve != null ? lazyJavaAnnotationDescriptor.f87265a.getComponents().getModuleClassResolver().resolveClass(javaClassResolve) : null;
            if (classDescriptorMapJavaToKotlin$default == null) {
                classDescriptorMapJavaToKotlin$default = lazyJavaAnnotationDescriptor.e(fqName);
            }
        }
        return classDescriptorMapJavaToKotlin$default.getDefaultType();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.f87270f, this, (m<?>) f87264i[2]);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return (FqName) StorageKt.getValue(this.f87267c, this, (m<?>) f87264i[0]);
    }

    public final boolean isFreshlySupportedTypeUseAnnotation() {
        return this.f87272h;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.f87271g;
    }

    public String toString() {
        return DescriptorRenderer.renderAnnotation$default(DescriptorRenderer.FQ_NAMES_IN_TYPES, this, null, 2, null);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public JavaSourceElement getSource() {
        return this.f87269e;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.f87268d, this, (m<?>) f87264i[1]);
    }

    public /* synthetic */ LazyJavaAnnotationDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotation javaAnnotation, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotation, (i11 & 4) != 0 ? false : z11);
    }
}
