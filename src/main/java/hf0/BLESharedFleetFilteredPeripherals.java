package hf0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: hf0.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u0006¨\u0006\u001d"}, d2 = {"Lhf0/a;", "Landroid/os/Parcelable;", "", "Lhf0/b;", "filteredPeripherals", "<init>", "(Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "setFilteredPeripherals", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BLESharedFleetFilteredPeripherals implements Parcelable {
    public static final Parcelable.Creator<BLESharedFleetFilteredPeripherals> CREATOR = new C1529a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private List<BLESharedFleetPeripheral> filteredPeripherals;

    /* JADX INFO: renamed from: hf0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C1529a implements Parcelable.Creator<BLESharedFleetFilteredPeripherals> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BLESharedFleetFilteredPeripherals createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(BLESharedFleetPeripheral.CREATOR.createFromParcel(parcel));
            }
            return new BLESharedFleetFilteredPeripherals(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final BLESharedFleetFilteredPeripherals[] newArray(int i11) {
            return new BLESharedFleetFilteredPeripherals[i11];
        }
    }

    public BLESharedFleetFilteredPeripherals(List<BLESharedFleetPeripheral> filteredPeripherals) {
        s.k(filteredPeripherals, "filteredPeripherals");
        this.filteredPeripherals = filteredPeripherals;
    }

    public final List<BLESharedFleetPeripheral> a() {
        return this.filteredPeripherals;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BLESharedFleetFilteredPeripherals) && s.f(this.filteredPeripherals, ((BLESharedFleetFilteredPeripherals) other).filteredPeripherals);
    }

    public int hashCode() {
        return this.filteredPeripherals.hashCode();
    }

    public String toString() {
        return "BLESharedFleetFilteredPeripherals(filteredPeripherals=" + this.filteredPeripherals + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        List<BLESharedFleetPeripheral> list = this.filteredPeripherals;
        dest.writeInt(list.size());
        Iterator<BLESharedFleetPeripheral> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
