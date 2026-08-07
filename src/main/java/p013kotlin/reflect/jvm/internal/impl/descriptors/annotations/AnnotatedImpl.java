package p013kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX INFO: loaded from: classes9.dex */
public class AnnotatedImpl implements Annotated {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Annotations f86726a;

    public AnnotatedImpl(Annotations annotations) {
        if (annotations == null) {
            a(0);
        }
        this.f86726a = annotations;
    }

    private static /* synthetic */ void a(int i11) {
        String str = i11 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i11 != 1 ? 3 : 2];
        if (i11 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i11 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i11 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i11 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        Annotations annotations = this.f86726a;
        if (annotations == null) {
            a(1);
        }
        return annotations;
    }
}
