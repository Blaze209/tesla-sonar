package p013kotlin.reflect.jvm.internal.impl.types;

import co0.m;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.properties.c;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotationsTypeAttributeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f88862a = {o0.k(new f0(o0.d(AnnotationsTypeAttributeKt.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f88863b;

    static {
        c cVarGenerateNullableAccessor = TypeAttributes.Companion.generateNullableAccessor(o0.b(AnnotationsTypeAttribute.class));
        s.i(cVarGenerateNullableAccessor, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f88863b = cVarGenerateNullableAccessor;
    }

    public static final Annotations getAnnotations(TypeAttributes typeAttributes) {
        Annotations annotations;
        s.k(typeAttributes, "<this>");
        AnnotationsTypeAttribute annotationsAttribute = getAnnotationsAttribute(typeAttributes);
        return (annotationsAttribute == null || (annotations = annotationsAttribute.getAnnotations()) == null) ? Annotations.Companion.getEMPTY() : annotations;
    }

    public static final AnnotationsTypeAttribute getAnnotationsAttribute(TypeAttributes typeAttributes) {
        s.k(typeAttributes, "<this>");
        return (AnnotationsTypeAttribute) f88863b.getValue(typeAttributes, f88862a[0]);
    }
}
