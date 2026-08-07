package p013kotlin.reflect.jvm.internal.impl.load.java.components;

import co0.m;
import java.util.Collection;
import java.util.Map;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes9.dex */
public class JavaAnnotationDescriptor implements PossiblyExternalAnnotationDescriptor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f87167f = {o0.k(new f0(o0.b(JavaAnnotationDescriptor.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FqName f87168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SourceElement f87169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final NotNullLazyValue f87170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final JavaAnnotationArgument f87171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f87172e;

    public JavaAnnotationDescriptor(LazyJavaResolverContext c11, JavaAnnotation javaAnnotation, FqName fqName) {
        SourceElement NO_SOURCE;
        Collection<JavaAnnotationArgument> arguments;
        s.k(c11, "c");
        s.k(fqName, "fqName");
        this.f87168a = fqName;
        if (javaAnnotation == null || (NO_SOURCE = c11.getComponents().getSourceElementFactory().source(javaAnnotation)) == null) {
            NO_SOURCE = SourceElement.NO_SOURCE;
            s.j(NO_SOURCE, "NO_SOURCE");
        }
        this.f87169b = NO_SOURCE;
        this.f87170c = c11.getStorageManager().createLazyValue(new a(c11, this));
        this.f87171d = (javaAnnotation == null || (arguments = javaAnnotation.getArguments()) == null) ? null : (JavaAnnotationArgument) v.p0(arguments);
        boolean z11 = false;
        if (javaAnnotation != null && javaAnnotation.isIdeExternalAnnotation()) {
            z11 = true;
        }
        this.f87172e = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleType c(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationDescriptor javaAnnotationDescriptor) {
        SimpleType defaultType = lazyJavaResolverContext.getModule().getBuiltIns().getBuiltInClassByFqName(javaAnnotationDescriptor.getFqName()).getDefaultType();
        s.j(defaultType, "getDefaultType(...)");
        return defaultType;
    }

    protected final JavaAnnotationArgument b() {
        return this.f87171d;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return v0.i();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return this.f87168a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement getSource() {
        return this.f87169b;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor
    public boolean isIdeExternalAnnotation() {
        return this.f87172e;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SimpleType getType() {
        return (SimpleType) StorageKt.getValue(this.f87170c, this, (m<?>) f87167f[0]);
    }
}
