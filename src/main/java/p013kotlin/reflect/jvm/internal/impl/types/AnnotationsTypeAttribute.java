package p013kotlin.reflect.jvm.internal.impl.types;

import co0.d;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;

/* JADX INFO: loaded from: classes9.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Annotations f88861a;

    public AnnotationsTypeAttribute(Annotations annotations) {
        s.k(annotations, "annotations");
        this.f88861a = annotations;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return s.f(((AnnotationsTypeAttribute) obj).f88861a, this.f88861a);
        }
        return false;
    }

    public final Annotations getAnnotations() {
        return this.f88861a;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public d<? extends AnnotationsTypeAttribute> getKey() {
        return o0.b(AnnotationsTypeAttribute.class);
    }

    public int hashCode() {
        return this.f88861a.hashCode();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public AnnotationsTypeAttribute add(AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.composeAnnotations(this.f88861a, annotationsTypeAttribute.f88861a));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public AnnotationsTypeAttribute intersect(AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (s.f(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }
}
