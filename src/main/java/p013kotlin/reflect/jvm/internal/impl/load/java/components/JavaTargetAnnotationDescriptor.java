package p013kotlin.reflect.jvm.internal.impl.load.java.components;

import co0.m;
import java.util.Map;
import jn0.x;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f87183h = {o0.k(new f0(o0.b(JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final NotNullLazyValue f87184g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(JavaAnnotation annotation, LazyJavaResolverContext c11) {
        super(c11, annotation, StandardNames.FqNames.target);
        s.k(annotation, "annotation");
        s.k(c11, "c");
        this.f87184g = c11.getStorageManager().createLazyValue(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map e(JavaTargetAnnotationDescriptor javaTargetAnnotationDescriptor) {
        ConstantValue<?> constantValueMapJavaTargetArguments$descriptors_jvm;
        JavaAnnotationArgument javaAnnotationArgumentB = javaTargetAnnotationDescriptor.b();
        if (javaAnnotationArgumentB instanceof JavaArrayAnnotationArgument) {
            constantValueMapJavaTargetArguments$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(((JavaArrayAnnotationArgument) javaTargetAnnotationDescriptor.b()).getElements());
        } else {
            constantValueMapJavaTargetArguments$descriptors_jvm = javaAnnotationArgumentB instanceof JavaEnumValueAnnotationArgument ? JavaAnnotationTargetMapper.INSTANCE.mapJavaTargetArguments$descriptors_jvm(v.e(javaTargetAnnotationDescriptor.b())) : null;
        }
        Map mapF = constantValueMapJavaTargetArguments$descriptors_jvm != null ? v0.f(x.a(JavaAnnotationMapper.INSTANCE.getTARGET_ANNOTATION_ALLOWED_TARGETS$descriptors_jvm(), constantValueMapJavaTargetArguments$descriptors_jvm)) : null;
        return mapF == null ? v0.i() : mapF;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<Object>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.f87184g, this, (m<?>) f87183h[0]);
    }
}
