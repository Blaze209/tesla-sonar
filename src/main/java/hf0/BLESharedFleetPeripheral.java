package hf0;

import android.os.Parcel;
import android.os.Parcelable;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: hf0.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lhf0/b;", "Landroid/os/Parcelable;", "", "rssi", "", "localName", "<init>", "(ILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "setRssi", "(I)V", "Ljava/lang/String;", "setLocalName", "(Ljava/lang/String;)V", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BLESharedFleetPeripheral implements Parcelable {
    public static final Parcelable.Creator<BLESharedFleetPeripheral> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private int rssi;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String localName;

    /* JADX INFO: renamed from: hf0.b$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BLESharedFleetPeripheral> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BLESharedFleetPeripheral createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new BLESharedFleetPeripheral(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BLESharedFleetPeripheral[] newArray(int i11) {
            return new BLESharedFleetPeripheral[i11];
        }
    }

    public BLESharedFleetPeripheral(int i11, String localName) {
        s.k(localName, "localName");
        this.rssi = i11;
        this.localName = localName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLocalName() {
        return this.localName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BLESharedFleetPeripheral)) {
            return false;
        }
        BLESharedFleetPeripheral bLESharedFleetPeripheral = (BLESharedFleetPeripheral) other;
        return this.rssi == bLESharedFleetPeripheral.rssi && s.f(this.localName, bLESharedFleetPeripheral.localName);
    }

    public int hashCode() {
        return (Integer.hashCode(this.rssi) * 31) + this.localName.hashCode();
    }

    public String toString() {
        return "BLESharedFleetPeripheral(rssi=" + this.rssi + ", localName=" + this.localName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeInt(this.rssi);
        dest.writeString(this.localName);
    }
}
