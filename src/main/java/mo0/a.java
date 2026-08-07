package mo0;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lmo0/a;", "", "", "fractionalPart", "digits", "<init>", "(II)V", "newDigits", "b", "(I)I", "other", "a", "(Lmo0/a;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "I", "getFractionalPart", "getDigits", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int fractionalPart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int digits;

    public a(int i11, int i12) {
        this.fractionalPart = i11;
        this.digits = i12;
        if (i12 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Digits must be non-negative, but was " + i12).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a other) {
        s.k(other, "other");
        int iMax = Math.max(this.digits, other.digits);
        return s.m(b(iMax), other.b(iMax));
    }

    public final int b(int newDigits) {
        int i11 = this.digits;
        if (newDigits == i11) {
            return this.fractionalPart;
        }
        return newDigits > i11 ? this.fractionalPart * c.b()[newDigits - this.digits] : this.fractionalPart / c.b()[this.digits - newDigits];
    }

    public boolean equals(Object other) {
        return (other instanceof a) && compareTo((a) other) == 0;
    }

    public int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = c.b()[this.digits];
        sb2.append(this.fractionalPart / i11);
        sb2.append(CoreConstants.DOT);
        sb2.append(t.T0(String.valueOf(i11 + (this.fractionalPart % i11)), "1"));
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }
}
