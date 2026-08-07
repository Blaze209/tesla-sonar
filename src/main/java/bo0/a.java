package bo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.collections.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lbo0/a;", "", "", "start", "endInclusive", "", "step", "<init>", "(CCI)V", "Lkotlin/collections/u;", "j", "()Lkotlin/collections/u;", "a", "C", "h", "()C", "first", "b", IntegerTokenConverter.CONVERTER_KEY, "last", "c", "I", "getStep", "()I", DateTokenConverter.CONVERTER_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a implements Iterable<Character>, xn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final char first;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final char last;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int step;

    public a(char c11, char c12, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i11 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = c11;
        this.last = (char) pn0.c.c(c11, c12, i11);
        this.step = i11;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final char getFirst() {
        return this.first;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final char getLast() {
        return this.last;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public u iterator() {
        return new b(this.first, this.last, this.step);
    }
}
