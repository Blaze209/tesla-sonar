package gk;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 extends w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f69139a;

    public t1(Object obj) {
        super(0);
        this.f69139a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1) && p013kotlin.jvm.internal.s.f(this.f69139a, ((t1) obj).f69139a);
    }

    public final int hashCode() {
        Object obj = this.f69139a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.f69139a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
