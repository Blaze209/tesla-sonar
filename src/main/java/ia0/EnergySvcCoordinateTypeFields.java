package ia0;

import com.fourthline.adapters.serialization.OrcaKeys;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ia0.o, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lia0/o;", "", "", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "()Ljava/lang/Double;", "b", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnergySvcCoordinateTypeFields {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double longitude;

    public EnergySvcCoordinateTypeFields(Double d11, Double d12) {
        this.latitude = d11;
        this.longitude = d12;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getLongitude() {
        return this.longitude;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnergySvcCoordinateTypeFields)) {
            return false;
        }
        EnergySvcCoordinateTypeFields energySvcCoordinateTypeFields = (EnergySvcCoordinateTypeFields) other;
        return s.f(this.latitude, energySvcCoordinateTypeFields.latitude) && s.f(this.longitude, energySvcCoordinateTypeFields.longitude);
    }

    public int hashCode() {
        Double d11 = this.latitude;
        int iHashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.longitude;
        return iHashCode + (d12 != null ? d12.hashCode() : 0);
    }

    public String toString() {
        return "EnergySvcCoordinateTypeFields(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
