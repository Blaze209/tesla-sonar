package of0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import v5.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lof0/a;", "", "<init>", "()V", "a", "b", "c", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: of0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lof0/a$a;", "Lof0/a;", "", "vin", "", "sessionId", "Lv5/d;", "position", "<init>", "(Ljava/lang/String;ILv5/d;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getVin", "b", "I", "c", "Lv5/d;", "()Lv5/d;", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PositionUpdated extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int sessionId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final d position;

        public PositionUpdated(String vin, int i11, d position) {
            s.k(vin, "vin");
            s.k(position, "position");
            this.vin = vin;
            this.sessionId = i11;
            this.position = position;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public int getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PositionUpdated)) {
                return false;
            }
            PositionUpdated positionUpdated = (PositionUpdated) other;
            return s.f(this.vin, positionUpdated.vin) && this.sessionId == positionUpdated.sessionId && s.f(this.position, positionUpdated.position);
        }

        public int hashCode() {
            return (((this.vin.hashCode() * 31) + Integer.hashCode(this.sessionId)) * 31) + this.position.hashCode();
        }

        public String toString() {
            return "PositionUpdated(vin=" + this.vin + ", sessionId=" + this.sessionId + ", position=" + this.position + ")";
        }
    }

    /* JADX INFO: renamed from: of0.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0015"}, d2 = {"Lof0/a$b;", "Lof0/a;", "", "vin", "", "sessionId", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UwbDisconnected extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int sessionId;

        public UwbDisconnected(String vin, int i11) {
            s.k(vin, "vin");
            this.vin = vin;
            this.sessionId = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public int getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public String getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UwbDisconnected)) {
                return false;
            }
            UwbDisconnected uwbDisconnected = (UwbDisconnected) other;
            return s.f(this.vin, uwbDisconnected.vin) && this.sessionId == uwbDisconnected.sessionId;
        }

        public int hashCode() {
            return (this.vin.hashCode() * 31) + Integer.hashCode(this.sessionId);
        }

        public String toString() {
            return "UwbDisconnected(vin=" + this.vin + ", sessionId=" + this.sessionId + ")";
        }
    }

    /* JADX INFO: renamed from: of0.a$c, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0016"}, d2 = {"Lof0/a$c;", "Lof0/a;", "", "vin", "", "sessionId", "<init>", "(Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getVin", "b", "I", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UwbEndpointFound extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int sessionId;

        public UwbEndpointFound(String vin, int i11) {
            s.k(vin, "vin");
            this.vin = vin;
            this.sessionId = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public int getSessionId() {
            return this.sessionId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UwbEndpointFound)) {
                return false;
            }
            UwbEndpointFound uwbEndpointFound = (UwbEndpointFound) other;
            return s.f(this.vin, uwbEndpointFound.vin) && this.sessionId == uwbEndpointFound.sessionId;
        }

        public int hashCode() {
            return (this.vin.hashCode() * 31) + Integer.hashCode(this.sessionId);
        }

        public String toString() {
            return "UwbEndpointFound(vin=" + this.vin + ", sessionId=" + this.sessionId + ")";
        }
    }
}
