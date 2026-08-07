package p013kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import p013kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p013kotlin.reflect.jvm.internal.impl.name.FqName;
import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import p013kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
public class AnnotationDescriptorImpl implements AnnotationDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinType f86727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Name, ConstantValue<?>> f86728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SourceElement f86729c;

    public AnnotationDescriptorImpl(KotlinType kotlinType, Map<Name, ConstantValue<?>> map, SourceElement sourceElement) {
        if (kotlinType == null) {
            a(0);
        }
        if (map == null) {
            a(1);
        }
        if (sourceElement == null) {
            a(2);
        }
        this.f86727a = kotlinType;
        this.f86728b = map;
        this.f86729c = sourceElement;
    }

    private static /* synthetic */ void a(int i11) {
        String str = (i11 == 3 || i11 == 4 || i11 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i11 == 3 || i11 == 4 || i11 == 5) ? 2 : 3];
        if (i11 == 1) {
            objArr[0] = "valueArguments";
        } else if (i11 == 2) {
            objArr[0] = "source";
        } else if (i11 == 3 || i11 == 4 || i11 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i11 == 3) {
            objArr[1] = "getType";
        } else if (i11 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i11 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        Map<Name, ConstantValue<?>> map = this.f86728b;
        if (map == null) {
            a(4);
        }
        return map;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public FqName getFqName() {
        return AnnotationDescriptor.DefaultImpls.getFqName(this);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public SourceElement getSource() {
        SourceElement sourceElement = this.f86729c;
        if (sourceElement == null) {
            a(5);
        }
        return sourceElement;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public KotlinType getType() {
        KotlinType kotlinType = this.f86727a;
        if (kotlinType == null) {
            a(3);
        }
        return kotlinType;
    }

    public String toString() {
        return DescriptorRenderer.FQ_NAMES_IN_TYPES.renderAnnotation(this, null);
    }
}
