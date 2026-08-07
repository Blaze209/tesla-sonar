package expo.modules.kotlin.records;

import expo.modules.kotlin.exception.ValidationException;
import java.lang.Comparable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B'\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0014\u0010\u0005\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/kotlin/records/NumericRangeValidator;", "", "T", "Lexpo/modules/kotlin/records/FieldValidator;", "from", "to", "", "fromInclusive", "toInclusive", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;ZZ)V", "value", "Ljn0/h0;", "validate", "(Ljava/lang/Comparable;)V", "Ljava/lang/Comparable;", "Z", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NumericRangeValidator<T extends Comparable<? super T>> implements FieldValidator<T> {
    private final T from;
    private final boolean fromInclusive;
    private final T to;
    private final boolean toInclusive;

    public NumericRangeValidator(T from, T to2, boolean z11, boolean z12) {
        s.k(from, "from");
        s.k(to2, "to");
        this.from = from;
        this.to = to2;
        this.fromInclusive = z11;
        this.toInclusive = z12;
    }

    @Override // expo.modules.kotlin.records.FieldValidator
    public void validate(T value) throws ValidationException {
        s.k(value, "value");
        if (value.compareTo(this.from) < 0 || this.to.compareTo(value) < 0 || ((s.f(value, this.from) && !this.fromInclusive) || (s.f(value, this.to) && !this.toInclusive))) {
            throw new ValidationException("Value should be in range " + this.from + " " + (this.fromInclusive ? "<=" : "<") + " 'value' " + (this.toInclusive ? "<=" : "<") + " " + this.to + ", got " + value);
        }
    }
}
