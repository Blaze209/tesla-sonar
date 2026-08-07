package expo.modules.kotlin.records;

import expo.modules.kotlin.exception.ValidationException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/records/IsNotEmptyArrayValidator;", "Lexpo/modules/kotlin/records/FieldValidator;", "", "<init>", "()V", "value", "Ljn0/h0;", "validate", "([Ljava/lang/Object;)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IsNotEmptyArrayValidator implements FieldValidator<Object[]> {
    @Override // expo.modules.kotlin.records.FieldValidator
    public void validate(Object[] value) throws ValidationException {
        s.k(value, "value");
        if (value.length == 0) {
            throw new ValidationException("Array is empty");
        }
    }
}
