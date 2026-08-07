package bo0;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.lang.Comparable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lbo0/g;", "", "T", "Lbo0/f;", "start", "endInclusive", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Comparable;", "getStart", "()Ljava/lang/Comparable;", "b", "e", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
class g<T extends Comparable<? super T>> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T start;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T endInclusive;

    public g(T start, T endInclusive) {
        s.k(start, "start");
        s.k(endInclusive, "endInclusive");
        this.start = start;
        this.endInclusive = endInclusive;
    }

    @Override // bo0.f
    public boolean d(T t11) {
        return f.a.a(this, t11);
    }

    @Override // bo0.f
    public T e() {
        return this.endInclusive;
    }

    public boolean equals(Object other) {
        if (!(other instanceof g)) {
            return false;
        }
        if (isEmpty() && ((g) other).isEmpty()) {
            return true;
        }
        g gVar = (g) other;
        return s.f(getStart(), gVar.getStart()) && s.f(e(), gVar.e());
    }

    @Override // bo0.f
    public T getStart() {
        return this.start;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (getStart().hashCode() * 31) + e().hashCode();
    }

    @Override // bo0.f
    public boolean isEmpty() {
        return f.a.b(this);
    }

    public String toString() {
        return getStart() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + e();
    }
}
