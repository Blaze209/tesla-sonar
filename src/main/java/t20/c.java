package t20;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lt20/c;", "Ljava/io/Serializable;", "", "value", "Ljava/util/concurrent/TimeUnit;", "unit", "<init>", "(JLjava/util/concurrent/TimeUnit;)V", "toUnit", "a", "(Ljava/util/concurrent/TimeUnit;)J", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getValue", "()J", "b", "Ljava/util/concurrent/TimeUnit;", "getUnit", "()Ljava/util/concurrent/TimeUnit;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TimeUnit unit;

    public c(long j11, TimeUnit unit) {
        s.k(unit, "unit");
        this.value = j11;
        this.unit = unit;
    }

    public final long a(TimeUnit toUnit) {
        s.k(toUnit, "toUnit");
        return toUnit.convert(this.value, this.unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && s.f(c.class, other.getClass())) {
            c cVar = other instanceof c ? (c) other : null;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long jA = a(timeUnit);
            Long lValueOf = cVar != null ? Long.valueOf(cVar.a(timeUnit)) : null;
            if (lValueOf != null && jA == lValueOf.longValue()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.value;
        return (((int) (j11 ^ (j11 >>> 32))) * 31) + this.unit.hashCode();
    }

    public String toString() {
        return "TimeMeasure{value=" + this.value + ", unit=" + this.unit + CoreConstants.CURLY_RIGHT;
    }
}
