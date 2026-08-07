package expo.modules.kotlin.records;

import expo.modules.kotlin.exception.ValidationException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lexpo/modules/kotlin/records/IntArraySizeValidator;", "Lexpo/modules/kotlin/records/FieldValidator;", "", "", "min", "max", "<init>", "(II)V", "value", "Ljn0/h0;", "validate", "([I)V", "I", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IntArraySizeValidator implements FieldValidator<int[]> {
    private final int max;
    private final int min;

    public IntArraySizeValidator(int i11, int i12) {
        this.min = i11;
        this.max = i12;
    }

    @Override // expo.modules.kotlin.records.FieldValidator
    public void validate(int[] value) throws ValidationException {
        s.k(value, "value");
        if (value.length < this.min || value.length > this.max) {
            throw new ValidationException("Number of elements in the array should be between " + this.min + " and " + this.max + ", got " + value.length);
        }
    }
}
