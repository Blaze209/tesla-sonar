package expo.modules.kotlin.records;

import co0.q;
import java.lang.annotation.Annotation;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/records/LongRangeBinder;", "Lexpo/modules/kotlin/records/ValidationBinder;", "<init>", "()V", "", "annotation", "Lco0/q;", "fieldType", "Lexpo/modules/kotlin/records/FieldValidator;", "bind", "(Ljava/lang/annotation/Annotation;Lco0/q;)Lexpo/modules/kotlin/records/FieldValidator;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LongRangeBinder implements ValidationBinder {
    @Override // expo.modules.kotlin.records.ValidationBinder
    public FieldValidator<?> bind(Annotation annotation, q fieldType) {
        s.k(annotation, "annotation");
        s.k(fieldType, "fieldType");
        LongRange longRange = (LongRange) annotation;
        return new NumericRangeValidator(Long.valueOf(longRange.from()), Long.valueOf(longRange.to()), longRange.fromInclusive(), longRange.toInclusive());
    }
}
