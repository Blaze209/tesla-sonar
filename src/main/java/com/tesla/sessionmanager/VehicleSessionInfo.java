package com.tesla.sessionmanager;

import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.tesla.logging.TeslaLog;
import ie0.n;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import rc0.k;
import sc0.b;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00015BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012Jb\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0010\"\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b*\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b+\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b,\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0019R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010#\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u00101R\u0011\u00103\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b2\u0010\u0010¨\u00066"}, d2 = {"Lcom/tesla/sessionmanager/VehicleSessionInfo;", "", "", "publicKeyHex", "", "handle", "counter", "clockTime", "epochHex", "epochStartSeconds", "Lsc0/b;", "domain", "requestId", "<init>", "(Ljava/lang/String;IIILjava/lang/String;ILsc0/b;Ljava/lang/String;)V", "incrementCounter", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lsc0/b;", "component8", "copy", "(Ljava/lang/String;IIILjava/lang/String;ILsc0/b;Ljava/lang/String;)Lcom/tesla/sessionmanager/VehicleSessionInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPublicKeyHex", "I", "getHandle", "getCounter", "setCounter", "(I)V", "getClockTime", "getEpochHex", "getEpochStartSeconds", "Lsc0/b;", "getDomain", "getRequestId", "setRequestId", "(Ljava/lang/String;)V", "getVehicleClockSeconds", "vehicleClockSeconds", "Companion", "a", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleSessionInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int clockTime;
    private int counter;
    private final b domain;
    private final String epochHex;
    private final int epochStartSeconds;
    private final int handle;
    private final String publicKeyHex;
    private String requestId;

    /* JADX INFO: renamed from: com.tesla.sessionmanager.VehicleSessionInfo$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tesla/sessionmanager/VehicleSessionInfo$a;", "", "<init>", "()V", "Lrc0/k;", "info", "Lsc0/b;", "domain", "", "requestId", "Lcom/tesla/sessionmanager/VehicleSessionInfo;", "a", "(Lrc0/k;Lsc0/b;Ljava/lang/String;)Lcom/tesla/sessionmanager/VehicleSessionInfo;", "sessionmanager_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VehicleSessionInfo a(k info, b domain, String requestId) {
            s.k(info, "info");
            s.k(domain, "domain");
            int clock_time = info.getClock_time();
            int counter = info.getCounter();
            return new VehicleSessionInfo(n.e(info.getPublicKey().J(), 0, 1, null), info.getHandle(), counter, clock_time, n.e(info.getEpoch().J(), 0, 1, null), ((int) (System.currentTimeMillis() / ((long) 1000))) - clock_time, domain, requestId);
        }

        private Companion() {
        }
    }

    public VehicleSessionInfo(String publicKeyHex, int i11, int i12, int i13, String epochHex, int i14, b domain, String str) {
        s.k(publicKeyHex, "publicKeyHex");
        s.k(epochHex, "epochHex");
        s.k(domain, "domain");
        this.publicKeyHex = publicKeyHex;
        this.handle = i11;
        this.counter = i12;
        this.clockTime = i13;
        this.epochHex = epochHex;
        this.epochStartSeconds = i14;
        this.domain = domain;
        this.requestId = str;
    }

    public static /* synthetic */ VehicleSessionInfo copy$default(VehicleSessionInfo vehicleSessionInfo, String str, int i11, int i12, int i13, String str2, int i14, b bVar, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = vehicleSessionInfo.publicKeyHex;
        }
        if ((i15 & 2) != 0) {
            i11 = vehicleSessionInfo.handle;
        }
        if ((i15 & 4) != 0) {
            i12 = vehicleSessionInfo.counter;
        }
        if ((i15 & 8) != 0) {
            i13 = vehicleSessionInfo.clockTime;
        }
        if ((i15 & 16) != 0) {
            str2 = vehicleSessionInfo.epochHex;
        }
        if ((i15 & 32) != 0) {
            i14 = vehicleSessionInfo.epochStartSeconds;
        }
        if ((i15 & 64) != 0) {
            bVar = vehicleSessionInfo.domain;
        }
        if ((i15 & 128) != 0) {
            str3 = vehicleSessionInfo.requestId;
        }
        b bVar2 = bVar;
        String str4 = str3;
        String str5 = str2;
        int i16 = i14;
        return vehicleSessionInfo.copy(str, i11, i12, i13, str5, i16, bVar2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPublicKeyHex() {
        return this.publicKeyHex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHandle() {
        return this.handle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCounter() {
        return this.counter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getClockTime() {
        return this.clockTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEpochHex() {
        return this.epochHex;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getEpochStartSeconds() {
        return this.epochStartSeconds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final b getDomain() {
        return this.domain;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    public final VehicleSessionInfo copy(String publicKeyHex, int handle, int counter, int clockTime, String epochHex, int epochStartSeconds, b domain, String requestId) {
        s.k(publicKeyHex, "publicKeyHex");
        s.k(epochHex, "epochHex");
        s.k(domain, "domain");
        return new VehicleSessionInfo(publicKeyHex, handle, counter, clockTime, epochHex, epochStartSeconds, domain, requestId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleSessionInfo)) {
            return false;
        }
        VehicleSessionInfo vehicleSessionInfo = (VehicleSessionInfo) other;
        return s.f(this.publicKeyHex, vehicleSessionInfo.publicKeyHex) && this.handle == vehicleSessionInfo.handle && this.counter == vehicleSessionInfo.counter && this.clockTime == vehicleSessionInfo.clockTime && s.f(this.epochHex, vehicleSessionInfo.epochHex) && this.epochStartSeconds == vehicleSessionInfo.epochStartSeconds && this.domain == vehicleSessionInfo.domain && s.f(this.requestId, vehicleSessionInfo.requestId);
    }

    public final int getClockTime() {
        return this.clockTime;
    }

    public final int getCounter() {
        return this.counter;
    }

    public final b getDomain() {
        return this.domain;
    }

    public final String getEpochHex() {
        return this.epochHex;
    }

    public final int getEpochStartSeconds() {
        return this.epochStartSeconds;
    }

    public final int getHandle() {
        return this.handle;
    }

    public final String getPublicKeyHex() {
        return this.publicKeyHex;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getVehicleClockSeconds() {
        return ((int) (System.currentTimeMillis() / ((long) 1000))) - this.epochStartSeconds;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.publicKeyHex.hashCode() * 31) + Integer.hashCode(this.handle)) * 31) + Integer.hashCode(this.counter)) * 31) + Integer.hashCode(this.clockTime)) * 31) + this.epochHex.hashCode()) * 31) + Integer.hashCode(this.epochStartSeconds)) * 31) + this.domain.hashCode()) * 31;
        String str = this.requestId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final int incrementCounter() {
        int i11 = this.counter;
        int i12 = i11 + 1;
        this.counter = i12;
        TeslaLog.INSTANCE.i("SessionInfoManager", "Counter incremented from " + i11 + " to " + i12);
        return this.counter;
    }

    public final void setCounter(int i11) {
        this.counter = i11;
    }

    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public String toString() {
        return "VehicleSessionInfo(publicKeyHex=" + this.publicKeyHex + ", handle=" + this.handle + ", counter=" + this.counter + ", clockTime=" + this.clockTime + ", epochHex=" + this.epochHex + ", epochStartSeconds=" + this.epochStartSeconds + ", domain=" + this.domain + ", requestId=" + this.requestId + ")";
    }

    public /* synthetic */ VehicleSessionInfo(String str, int i11, int i12, int i13, String str2, int i14, b bVar, String str3, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, i13, str2, i14, bVar, (i15 & 128) != 0 ? null : str3);
    }
}
