package p013kotlin.reflect.jvm.internal.impl.incremental.components;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class Position implements Serializable {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Position f87060c = new Position(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f87061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f87062b;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Position getNO_POSITION() {
            return Position.f87060c;
        }

        private Companion() {
        }
    }

    public Position(int i11, int i12) {
        this.f87061a = i11;
        this.f87062b = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return this.f87061a == position.f87061a && this.f87062b == position.f87062b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f87061a) * 31) + Integer.hashCode(this.f87062b);
    }

    public String toString() {
        return "Position(line=" + this.f87061a + ", column=" + this.f87062b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
