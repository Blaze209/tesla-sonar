package ja0;

import com.fourthline.adapters.serialization.OrcaKeys;
import ii.x;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: ja0.d, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lja0/d;", "", "Lii/x;", "", OrcaKeys.LATITUDE, OrcaKeys.LONGITUDE, "<init>", "(Lii/x;Lii/x;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lii/x;", "()Lii/x;", "b", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EnergySvcCoordinateInputType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final x<Double> latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final x<Double> longitude;

    /* JADX WARN: Multi-variable type inference failed */
    public EnergySvcCoordinateInputType() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final x<Double> a() {
        return this.latitude;
    }

    public final x<Double> b() {
        return this.longitude;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnergySvcCoordinateInputType)) {
            return false;
        }
        EnergySvcCoordinateInputType energySvcCoordinateInputType = (EnergySvcCoordinateInputType) other;
        return s.f(this.latitude, energySvcCoordinateInputType.latitude) && s.f(this.longitude, energySvcCoordinateInputType.longitude);
    }

    public int hashCode() {
        return (this.latitude.hashCode() * 31) + this.longitude.hashCode();
    }

    public String toString() {
        return "EnergySvcCoordinateInputType(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }

    public EnergySvcCoordinateInputType(x<Double> latitude, x<Double> longitude) {
        s.k(latitude, "latitude");
        s.k(longitude, "longitude");
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public /* synthetic */ EnergySvcCoordinateInputType(x xVar, x xVar2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? x.a.f78171b : xVar, (i11 & 2) != 0 ? x.a.f78171b : xVar2);
    }
}
