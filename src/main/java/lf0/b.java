package lf0;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import java.util.List;
import mf0.j;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Llf0/b;", "", "<init>", "()V", "a", "b", "c", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: lf0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Llf0/b$a;", "Llf0/b;", "", "vin", "", "", "sessionIds", "Lvc0/q0;", "firaRequest", "<init>", "(Ljava/lang/String;Ljava/util/List;Lvc0/q0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/util/List;", "()Ljava/util/List;", "Lvc0/q0;", "()Lvc0/q0;", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FiraSessionStart extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Integer> sessionIds;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final q0 firaRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FiraSessionStart(String vin, List<Integer> sessionIds, q0 firaRequest) {
            super(null);
            s.k(vin, "vin");
            s.k(sessionIds, "sessionIds");
            s.k(firaRequest, "firaRequest");
            this.vin = vin;
            this.sessionIds = sessionIds;
            this.firaRequest = firaRequest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final q0 getFiraRequest() {
            return this.firaRequest;
        }

        public List<Integer> b() {
            return this.sessionIds;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public String getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FiraSessionStart)) {
                return false;
            }
            FiraSessionStart firaSessionStart = (FiraSessionStart) other;
            return s.f(this.vin, firaSessionStart.vin) && s.f(this.sessionIds, firaSessionStart.sessionIds) && s.f(this.firaRequest, firaSessionStart.firaRequest);
        }

        public int hashCode() {
            return (((this.vin.hashCode() * 31) + this.sessionIds.hashCode()) * 31) + this.firaRequest.hashCode();
        }

        public String toString() {
            return "FiraSessionStart(vin=" + this.vin + ", sessionIds=" + this.sessionIds + ", firaRequest=" + this.firaRequest + ")";
        }
    }

    /* JADX INFO: renamed from: lf0.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Llf0/b$b;", "Llf0/b;", "", "vin", "", "", "sessionIds", "Lmf0/j;", AnalyticsAttribute.Reason, "<init>", "(Ljava/lang/String;Ljava/util/List;Lmf0/j;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getVin", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "Lmf0/j;", "getReason", "()Lmf0/j;", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FiraSessionStop extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Integer> sessionIds;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final j reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FiraSessionStop(String vin, List<Integer> sessionIds, j reason) {
            super(null);
            s.k(vin, "vin");
            s.k(sessionIds, "sessionIds");
            s.k(reason, "reason");
            this.vin = vin;
            this.sessionIds = sessionIds;
            this.reason = reason;
        }

        public List<Integer> a() {
            return this.sessionIds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FiraSessionStop)) {
                return false;
            }
            FiraSessionStop firaSessionStop = (FiraSessionStop) other;
            return s.f(this.vin, firaSessionStop.vin) && s.f(this.sessionIds, firaSessionStop.sessionIds) && this.reason == firaSessionStop.reason;
        }

        public int hashCode() {
            return (((this.vin.hashCode() * 31) + this.sessionIds.hashCode()) * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "FiraSessionStop(vin=" + this.vin + ", sessionIds=" + this.sessionIds + ", reason=" + this.reason + ")";
        }
    }

    /* JADX INFO: renamed from: lf0.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Llf0/b$c;", "Llf0/b;", "", "vin", "", "", "sessionIds", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getVin", "b", "Ljava/util/List;", "()Ljava/util/List;", "tesla-uwb_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FiraSessionStopped extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Integer> sessionIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FiraSessionStopped(String vin, List<Integer> sessionIds) {
            super(null);
            s.k(vin, "vin");
            s.k(sessionIds, "sessionIds");
            this.vin = vin;
            this.sessionIds = sessionIds;
        }

        public List<Integer> a() {
            return this.sessionIds;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FiraSessionStopped)) {
                return false;
            }
            FiraSessionStopped firaSessionStopped = (FiraSessionStopped) other;
            return s.f(this.vin, firaSessionStopped.vin) && s.f(this.sessionIds, firaSessionStopped.sessionIds);
        }

        public int hashCode() {
            return (this.vin.hashCode() * 31) + this.sessionIds.hashCode();
        }

        public String toString() {
            return "FiraSessionStopped(vin=" + this.vin + ", sessionIds=" + this.sessionIds + ")";
        }
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b() {
    }
}
