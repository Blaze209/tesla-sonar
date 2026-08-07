package expo.modules.kotlin.records;

import co0.f;
import co0.q;
import do0.c;
import do0.d;
import java.lang.annotation.Annotation;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/records/IsCollectionNotEmptyBinder;", "Lexpo/modules/kotlin/records/ValidationBinder;", "<init>", "()V", "", "annotation", "Lco0/q;", "fieldType", "Lexpo/modules/kotlin/records/FieldValidator;", "bind", "(Ljava/lang/annotation/Annotation;Lco0/q;)Lexpo/modules/kotlin/records/FieldValidator;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IsCollectionNotEmptyBinder implements ValidationBinder {
    @Override // expo.modules.kotlin.records.ValidationBinder
    public FieldValidator<?> bind(Annotation annotation, q fieldType) {
        s.k(annotation, "annotation");
        s.k(fieldType, "fieldType");
        if (s.f(fieldType, d.c(o0.b(int[].class), null, false, null, 7, null))) {
            return new IsNotEmptyIntArrayValidator();
        }
        if (s.f(fieldType, d.c(o0.b(double[].class), null, false, null, 7, null))) {
            return new IsNotEmptyDoubleArrayValidator();
        }
        if (s.f(fieldType, d.c(o0.b(float[].class), null, false, null, 7, null))) {
            return new IsNotEmptyFloatArrayValidator();
        }
        f classifier = fieldType.getClassifier();
        s.i(classifier, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        co0.d dVar = (co0.d) classifier;
        return (c.k(dVar, o0.b(Object[].class)) || vn0.a.b(dVar).isArray()) ? new IsNotEmptyArrayValidator() : new IsNotEmptyCollectionValidator();
    }
}
