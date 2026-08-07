package p013kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
public final class ApproximationBounds<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f89040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f89041b;

    public ApproximationBounds(T t11, T t12) {
        this.f89040a = t11;
        this.f89041b = t12;
    }

    public final T component1() {
        return this.f89040a;
    }

    public final T component2() {
        return this.f89041b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj;
        return s.f(this.f89040a, approximationBounds.f89040a) && s.f(this.f89041b, approximationBounds.f89041b);
    }

    public final T getLower() {
        return this.f89040a;
    }

    public final T getUpper() {
        return this.f89041b;
    }

    public int hashCode() {
        T t11 = this.f89040a;
        int iHashCode = (t11 == null ? 0 : t11.hashCode()) * 31;
        T t12 = this.f89041b;
        return iHashCode + (t12 != null ? t12.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f89040a + ", upper=" + this.f89041b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
