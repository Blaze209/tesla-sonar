package ff0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import vc0.g2;
import vc0.o1;

/* JADX INFO: renamed from: ff0.l, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010#R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b$\u0010\u0014\"\u0004\b(\u0010#R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010)\u001a\u0004\b\u001f\u0010*\"\u0004\b+\u0010,R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b'\u0010\u0014\"\u0004\b-\u0010#R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010 \u001a\u0004\b\u0019\u0010\u0014\"\u0004\b3\u0010#¨\u00064"}, d2 = {"Lff0/l;", "", "Lvc0/g2$d;", "serviceRunningState", "", "runningState_timeSince_S", "screenOnReceiver_timeSince_S", "permissionsBitmask", "Lvc0/o1;", "locationPermission", "processStartTime_timeSince_S", "Lvc0/g2$e;", "serviceStartReason", "bootReceiver_timeSince_S", "<init>", "(Lvc0/g2$d;IIILvc0/o1;ILvc0/g2$e;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvc0/g2$d;", "g", "()Lvc0/g2$d;", "o", "(Lvc0/g2$d;)V", "b", "I", "e", "m", "(I)V", "c", "f", "n", DateTokenConverter.CONVERTER_KEY, "k", "Lvc0/o1;", "()Lvc0/o1;", "j", "(Lvc0/o1;)V", "l", "Lvc0/g2$e;", "h", "()Lvc0/g2$e;", "p", "(Lvc0/g2$e;)V", IntegerTokenConverter.CONVERTER_KEY, "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ServiceRelatedTrace {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private g2.d serviceRunningState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private int runningState_timeSince_S;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private int screenOnReceiver_timeSince_S;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private int permissionsBitmask;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private o1 locationPermission;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private int processStartTime_timeSince_S;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private g2.e serviceStartReason;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private int bootReceiver_timeSince_S;

    public ServiceRelatedTrace(g2.d serviceRunningState, int i11, int i12, int i13, o1 locationPermission, int i14, g2.e serviceStartReason, int i15) {
        s.k(serviceRunningState, "serviceRunningState");
        s.k(locationPermission, "locationPermission");
        s.k(serviceStartReason, "serviceStartReason");
        this.serviceRunningState = serviceRunningState;
        this.runningState_timeSince_S = i11;
        this.screenOnReceiver_timeSince_S = i12;
        this.permissionsBitmask = i13;
        this.locationPermission = locationPermission;
        this.processStartTime_timeSince_S = i14;
        this.serviceStartReason = serviceStartReason;
        this.bootReceiver_timeSince_S = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBootReceiver_timeSince_S() {
        return this.bootReceiver_timeSince_S;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o1 getLocationPermission() {
        return this.locationPermission;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPermissionsBitmask() {
        return this.permissionsBitmask;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getProcessStartTime_timeSince_S() {
        return this.processStartTime_timeSince_S;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRunningState_timeSince_S() {
        return this.runningState_timeSince_S;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceRelatedTrace)) {
            return false;
        }
        ServiceRelatedTrace serviceRelatedTrace = (ServiceRelatedTrace) other;
        return this.serviceRunningState == serviceRelatedTrace.serviceRunningState && this.runningState_timeSince_S == serviceRelatedTrace.runningState_timeSince_S && this.screenOnReceiver_timeSince_S == serviceRelatedTrace.screenOnReceiver_timeSince_S && this.permissionsBitmask == serviceRelatedTrace.permissionsBitmask && this.locationPermission == serviceRelatedTrace.locationPermission && this.processStartTime_timeSince_S == serviceRelatedTrace.processStartTime_timeSince_S && this.serviceStartReason == serviceRelatedTrace.serviceStartReason && this.bootReceiver_timeSince_S == serviceRelatedTrace.bootReceiver_timeSince_S;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getScreenOnReceiver_timeSince_S() {
        return this.screenOnReceiver_timeSince_S;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g2.d getServiceRunningState() {
        return this.serviceRunningState;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final g2.e getServiceStartReason() {
        return this.serviceStartReason;
    }

    public int hashCode() {
        return (((((((((((((this.serviceRunningState.hashCode() * 31) + Integer.hashCode(this.runningState_timeSince_S)) * 31) + Integer.hashCode(this.screenOnReceiver_timeSince_S)) * 31) + Integer.hashCode(this.permissionsBitmask)) * 31) + this.locationPermission.hashCode()) * 31) + Integer.hashCode(this.processStartTime_timeSince_S)) * 31) + this.serviceStartReason.hashCode()) * 31) + Integer.hashCode(this.bootReceiver_timeSince_S);
    }

    public final void i(int i11) {
        this.bootReceiver_timeSince_S = i11;
    }

    public final void j(o1 o1Var) {
        s.k(o1Var, "<set-?>");
        this.locationPermission = o1Var;
    }

    public final void k(int i11) {
        this.permissionsBitmask = i11;
    }

    public final void l(int i11) {
        this.processStartTime_timeSince_S = i11;
    }

    public final void m(int i11) {
        this.runningState_timeSince_S = i11;
    }

    public final void n(int i11) {
        this.screenOnReceiver_timeSince_S = i11;
    }

    public final void o(g2.d dVar) {
        s.k(dVar, "<set-?>");
        this.serviceRunningState = dVar;
    }

    public final void p(g2.e eVar) {
        s.k(eVar, "<set-?>");
        this.serviceStartReason = eVar;
    }

    public String toString() {
        return "ServiceRelatedTrace(serviceRunningState=" + this.serviceRunningState + ", runningState_timeSince_S=" + this.runningState_timeSince_S + ", screenOnReceiver_timeSince_S=" + this.screenOnReceiver_timeSince_S + ", permissionsBitmask=" + this.permissionsBitmask + ", locationPermission=" + this.locationPermission + ", processStartTime_timeSince_S=" + this.processStartTime_timeSince_S + ", serviceStartReason=" + this.serviceStartReason + ", bootReceiver_timeSince_S=" + this.bootReceiver_timeSince_S + ")";
    }

    public /* synthetic */ ServiceRelatedTrace(g2.d dVar, int i11, int i12, int i13, o1 o1Var, int i14, g2.e eVar, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? g2.d.SERVICERUNNINGSTATE_SNA : dVar, (i16 & 2) != 0 ? 0 : i11, (i16 & 4) != 0 ? 0 : i12, (i16 & 8) != 0 ? 0 : i13, (i16 & 16) != 0 ? o1.LOCATION_PERMISSION_UNKNOWN : o1Var, (i16 & 32) != 0 ? 0 : i14, (i16 & 64) != 0 ? g2.e.SERVICE_START_REASON_SNA : eVar, (i16 & 128) != 0 ? 0 : i15);
    }
}
