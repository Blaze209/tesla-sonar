package p013kotlin.reflect.jvm.internal.impl.load.java.components;

import co0.m;
import java.util.Map;
import jn0.x;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p013kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: loaded from: classes9.dex */
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f87181h = {o0.k(new f0(o0.b(JavaRetentionAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final NotNullLazyValue f87182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(JavaAnnotation annotation, LazyJavaResolverContext c11) {
        super(c11, annotation, StandardNames.FqNames.retention);
        s.k(annotation, "annotation");
        s.k(c11, "c");
        this.f87182g = c11.getStorageManager().createLazyValue(new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map e(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        ConstantValue<?> constantValueMapJavaRetentionArgument$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(javaRetentionAnnotationDescriptor.b());
        Map mapF = constantValueMapJavaRetentionArgument$descriptors_jvm != null ? v0.f(x.a(JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), constantValueMapJavaRetentionArgument$descriptors_jvm)) : null;
        return mapF == null ? v0.i() : mapF;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.f87182g, this, (m<?>) f87181h[0]);
    }
}
