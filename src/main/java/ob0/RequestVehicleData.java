package ob0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import gc0.u0;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ob0.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001d\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lob0/b;", "", "Lgc0/u0$d;", "carType", "", "keyVersion", "apiVersion", "", "featuresBitmask", "<init>", "(Lgc0/u0$d;IILjava/util/List;)V", "a", "()Lgc0/u0$d;", "b", "()I", "c", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgc0/u0$d;", "getCarType", "I", "getKeyVersion", "getApiVersion", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "getFeaturesBitmask", "command-utils_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RequestVehicleData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final u0.d carType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int keyVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int apiVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Integer> featuresBitmask;

    public RequestVehicleData(u0.d dVar, int i11, int i12, List<Integer> featuresBitmask) {
        s.k(featuresBitmask, "featuresBitmask");
        this.carType = dVar;
        this.keyVersion = i11;
        this.apiVersion = i12;
        this.featuresBitmask = featuresBitmask;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u0.d getCarType() {
        return this.carType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getApiVersion() {
        return this.apiVersion;
    }

    public final List<Integer> c() {
        return this.featuresBitmask;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestVehicleData)) {
            return false;
        }
        RequestVehicleData requestVehicleData = (RequestVehicleData) other;
        return s.f(this.carType, requestVehicleData.carType) && this.keyVersion == requestVehicleData.keyVersion && this.apiVersion == requestVehicleData.apiVersion && s.f(this.featuresBitmask, requestVehicleData.featuresBitmask);
    }

    public int hashCode() {
        u0.d dVar = this.carType;
        return ((((((dVar == null ? 0 : dVar.hashCode()) * 31) + Integer.hashCode(this.keyVersion)) * 31) + Integer.hashCode(this.apiVersion)) * 31) + this.featuresBitmask.hashCode();
    }

    public String toString() {
        return "RequestVehicleData(carType=" + this.carType + ", keyVersion=" + this.keyVersion + ", apiVersion=" + this.apiVersion + ", featuresBitmask=" + this.featuresBitmask + ")";
    }
}
