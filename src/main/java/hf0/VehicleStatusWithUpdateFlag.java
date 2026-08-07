package hf0;

import android.os.Parcel;
import android.os.Parcelable;
import expo.modules.interfaces.permissions.PermissionsResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: hf0.n, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0005\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lhf0/n;", "Landroid/os/Parcelable;", "Lhf0/m;", PermissionsResponse.STATUS_KEY, "", "isUpdated", "<init>", "(Lhf0/m;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhf0/m;", "()Lhf0/m;", "setStatus", "(Lhf0/m;)V", "b", "Z", "()Z", "setUpdated", "(Z)V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleStatusWithUpdateFlag implements Parcelable {
    public static final Parcelable.Creator<VehicleStatusWithUpdateFlag> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private m status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isUpdated;

    /* JADX INFO: renamed from: hf0.n$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VehicleStatusWithUpdateFlag> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VehicleStatusWithUpdateFlag createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new VehicleStatusWithUpdateFlag((m) parcel.readParcelable(VehicleStatusWithUpdateFlag.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final VehicleStatusWithUpdateFlag[] newArray(int i11) {
            return new VehicleStatusWithUpdateFlag[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VehicleStatusWithUpdateFlag() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleStatusWithUpdateFlag)) {
            return false;
        }
        VehicleStatusWithUpdateFlag vehicleStatusWithUpdateFlag = (VehicleStatusWithUpdateFlag) other;
        return s.f(this.status, vehicleStatusWithUpdateFlag.status) && this.isUpdated == vehicleStatusWithUpdateFlag.isUpdated;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + Boolean.hashCode(this.isUpdated);
    }

    public String toString() {
        return "VehicleStatusWithUpdateFlag(status=" + this.status + ", isUpdated=" + this.isUpdated + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeParcelable(this.status, flags);
        dest.writeInt(this.isUpdated ? 1 : 0);
    }

    public VehicleStatusWithUpdateFlag(m status, boolean z11) {
        s.k(status, "status");
        this.status = status;
        this.isUpdated = z11;
    }

    public /* synthetic */ VehicleStatusWithUpdateFlag(m mVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new m() : mVar, (i11 & 2) != 0 ? false : z11);
    }
}
