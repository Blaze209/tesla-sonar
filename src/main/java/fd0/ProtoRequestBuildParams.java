package fd0;

import ce0.TeslaCommandRequest;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.sessionmanager.VehicleSessionInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: fd0.h, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\u0015B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u0012R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006\""}, d2 = {"Lfd0/h;", "", "", "vin", "connectionId", "Lce0/j;", "request", "", "expiresInSeconds", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "vehicleSessionInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lce0/j;ILcom/tesla/sessionmanager/VehicleSessionInfo;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "b", "getConnectionId", "c", "Lce0/j;", "()Lce0/j;", "I", "e", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "()Lcom/tesla/sessionmanager/VehicleSessionInfo;", "f", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProtoRequestBuildParams {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String connectionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TeslaCommandRequest request;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int expiresInSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleSessionInfo vehicleSessionInfo;

    /* JADX INFO: renamed from: fd0.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lfd0/h$a;", "", "<init>", "()V", "", "connectionId", "Lce0/j;", "request", "", "expiresInSeconds", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "vehicleSessionInfo", "Lfd0/h;", "a", "(Ljava/lang/String;Lce0/j;ILcom/tesla/sessionmanager/VehicleSessionInfo;)Lfd0/h;", "message-builder_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProtoRequestBuildParams a(String connectionId, TeslaCommandRequest request, int expiresInSeconds, VehicleSessionInfo vehicleSessionInfo) {
            s.k(connectionId, "connectionId");
            s.k(request, "request");
            return new ProtoRequestBuildParams(request.getVin(), connectionId, request, expiresInSeconds, vehicleSessionInfo);
        }

        private Companion() {
        }
    }

    public ProtoRequestBuildParams(String vin, String connectionId, TeslaCommandRequest request, int i11, VehicleSessionInfo vehicleSessionInfo) {
        s.k(vin, "vin");
        s.k(connectionId, "connectionId");
        s.k(request, "request");
        this.vin = vin;
        this.connectionId = connectionId;
        this.request = request;
        this.expiresInSeconds = i11;
        this.vehicleSessionInfo = vehicleSessionInfo;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TeslaCommandRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VehicleSessionInfo getVehicleSessionInfo() {
        return this.vehicleSessionInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVin() {
        return this.vin;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!s.f(ProtoRequestBuildParams.class, other != null ? other.getClass() : null)) {
            return false;
        }
        s.i(other, "null cannot be cast to non-null type com.tesla.messagebuilder.ProtoRequestBuildParams");
        ProtoRequestBuildParams protoRequestBuildParams = (ProtoRequestBuildParams) other;
        return s.f(this.vin, protoRequestBuildParams.vin) && s.f(this.connectionId, protoRequestBuildParams.connectionId) && s.f(this.request, protoRequestBuildParams.request) && s.f(this.vehicleSessionInfo, protoRequestBuildParams.vehicleSessionInfo);
    }

    public int hashCode() {
        int iHashCode = ((((this.vin.hashCode() * 31) + this.connectionId.hashCode()) * 31) + this.request.hashCode()) * 31;
        VehicleSessionInfo vehicleSessionInfo = this.vehicleSessionInfo;
        return iHashCode + (vehicleSessionInfo != null ? vehicleSessionInfo.hashCode() : 0);
    }

    public String toString() {
        return "ProtoRequestBuildParams(vin=" + this.vin + ", connectionId=" + this.connectionId + ", request=" + this.request + ", expiresInSeconds=" + this.expiresInSeconds + ", vehicleSessionInfo=" + this.vehicleSessionInfo + ")";
    }
}
