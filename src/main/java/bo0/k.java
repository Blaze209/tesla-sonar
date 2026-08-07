package bo0;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.collections.t0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001b¨\u0006#"}, d2 = {"Lbo0/k;", "", "", "start", "endInclusive", "step", "<init>", "(JJJ)V", "Lkotlin/collections/t0;", "k", "()Lkotlin/collections/t0;", "", "isEmpty", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "h", "()J", "first", "b", IntegerTokenConverter.CONVERTER_KEY, "last", "c", "j", DateTokenConverter.CONVERTER_KEY, "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class k implements Iterable<Long>, xn0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long first;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long last;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long step;

    /* JADX INFO: renamed from: bo0.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbo0/k$a;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "step", "Lbo0/k;", "a", "(JJJ)Lbo0/k;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(long rangeStart, long rangeEnd, long step) {
            return new k(rangeStart, rangeEnd, step);
        }

        private Companion() {
        }
    }

    public k(long j11, long j12, long j13) {
        if (j13 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j13 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = j11;
        this.last = pn0.c.d(j11, j12, j13);
        this.step = j13;
    }

    public boolean equals(Object other) {
        if (!(other instanceof k)) {
            return false;
        }
        if (isEmpty() && ((k) other).isEmpty()) {
            return true;
        }
        k kVar = (k) other;
        return this.first == kVar.first && this.last == kVar.last && this.step == kVar.step;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getFirst() {
        return this.first;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j11 = 31;
        long j12 = this.first;
        long j13 = this.last;
        long j14 = j11 * (((j12 ^ (j12 >>> 32)) * j11) + (j13 ^ (j13 >>> 32)));
        long j15 = this.step;
        return (int) (j14 + (j15 ^ (j15 >>> 32)));
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getLast() {
        return this.last;
    }

    public boolean isEmpty() {
        long j11 = this.step;
        long j12 = this.first;
        long j13 = this.last;
        if (j11 > 0) {
            return j12 > j13;
        }
        return j12 < j13;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getStep() {
        return this.step;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public t0 iterator() {
        return new l(this.first, this.last, this.step);
    }

    public String toString() {
        StringBuilder sb2;
        long j11;
        if (this.step > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.first);
            sb2.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            sb2.append(this.last);
            sb2.append(" step ");
            j11 = this.step;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.first);
            sb2.append(" downTo ");
            sb2.append(this.last);
            sb2.append(" step ");
            j11 = -this.step;
        }
        sb2.append(j11);
        return sb2.toString();
    }
}
