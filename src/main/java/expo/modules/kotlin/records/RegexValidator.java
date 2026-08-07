package expo.modules.kotlin.records;

import expo.modules.kotlin.exception.ValidationException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/records/RegexValidator;", "Lexpo/modules/kotlin/records/FieldValidator;", "", "Lkotlin/text/q;", "regex", "<init>", "(Lkotlin/text/q;)V", "value", "Ljn0/h0;", "validate", "(Ljava/lang/CharSequence;)V", "Lkotlin/text/q;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RegexValidator implements FieldValidator<CharSequence> {
    private final q regex;

    public RegexValidator(q regex) {
        s.k(regex, "regex");
        this.regex = regex;
    }

    @Override // expo.modules.kotlin.records.FieldValidator
    public void validate(CharSequence value) throws ValidationException {
        s.k(value, "value");
        if (this.regex.i(value)) {
            return;
        }
        throw new ValidationException("Provided string " + ((Object) value) + " didn't match regex " + this.regex);
    }
}
