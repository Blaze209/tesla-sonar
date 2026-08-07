package ce0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Arrays;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lce0/a;", "", "<init>", "()V", "b", "a", "Lce0/a$a;", "Lce0/a$b;", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: ce0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lce0/a$a;", "Lce0/a;", "Lce0/j;", "request", "<init>", "(Lce0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lce0/j;", "()Lce0/j;", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Request extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TeslaCommandRequest request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Request(TeslaCommandRequest request) {
            super(null);
            s.k(request, "request");
            this.request = request;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TeslaCommandRequest getRequest() {
            return this.request;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Request) && s.f(this.request, ((Request) other).request);
        }

        public int hashCode() {
            return this.request.hashCode();
        }

        public String toString() {
            return "Request(request=" + this.request + ")";
        }
    }

    /* JADX INFO: renamed from: ce0.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b\u0019\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b#\u0010*¨\u0006+"}, d2 = {"Lce0/a$b;", "Lce0/a;", "Lsc0/b;", "domain", "", "vin", "Lic0/f;", "source", "", "letSleep", "Lce0/j;", "dependentCommand", "", "sourcePublicKey", "<init>", "(Lsc0/b;Ljava/lang/String;Lic0/f;ZLce0/j;[B)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lsc0/b;", "getDomain", "()Lsc0/b;", "b", "Ljava/lang/String;", "e", "c", "Lic0/f;", "()Lic0/f;", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "Lce0/j;", "()Lce0/j;", "f", "[B", "()[B", "requestmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SessionInfoRequest extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final sc0.b domain;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ic0.f source;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean letSleep;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final TeslaCommandRequest dependentCommand;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final byte[] sourcePublicKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SessionInfoRequest(sc0.b domain, String vin, ic0.f source, boolean z11, TeslaCommandRequest teslaCommandRequest, byte[] sourcePublicKey) {
            super(null);
            s.k(domain, "domain");
            s.k(vin, "vin");
            s.k(source, "source");
            s.k(sourcePublicKey, "sourcePublicKey");
            this.domain = domain;
            this.vin = vin;
            this.source = source;
            this.letSleep = z11;
            this.dependentCommand = teslaCommandRequest;
            this.sourcePublicKey = sourcePublicKey;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TeslaCommandRequest getDependentCommand() {
            return this.dependentCommand;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getLetSleep() {
            return this.letSleep;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ic0.f getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final byte[] getSourcePublicKey() {
            return this.sourcePublicKey;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!s.f(SessionInfoRequest.class, other != null ? other.getClass() : null)) {
                return false;
            }
            s.i(other, "null cannot be cast to non-null type com.tesla.requestmanager.ActionableRequest.SessionInfoRequest");
            SessionInfoRequest sessionInfoRequest = (SessionInfoRequest) other;
            return this.domain == sessionInfoRequest.domain && s.f(this.vin, sessionInfoRequest.vin) && this.source == sessionInfoRequest.source && this.letSleep == sessionInfoRequest.letSleep && s.f(this.dependentCommand, sessionInfoRequest.dependentCommand) && Arrays.equals(this.sourcePublicKey, sessionInfoRequest.sourcePublicKey);
        }

        public int hashCode() {
            int iHashCode = ((((((this.domain.hashCode() * 31) + this.vin.hashCode()) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.letSleep)) * 31;
            TeslaCommandRequest teslaCommandRequest = this.dependentCommand;
            return ((iHashCode + (teslaCommandRequest != null ? teslaCommandRequest.hashCode() : 0)) * 31) + Arrays.hashCode(this.sourcePublicKey);
        }

        public String toString() {
            return "SessionInfoRequest(domain=" + this.domain + ", vin=" + this.vin + ", source=" + this.source + ", letSleep=" + this.letSleep + ", dependentCommand=" + this.dependentCommand + ", sourcePublicKey=" + Arrays.toString(this.sourcePublicKey) + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
