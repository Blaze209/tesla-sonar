package hf0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.spi.CallerData;
import com.teslamotors.plugins.ble.Peripheral;

/* JADX INFO: loaded from: classes8.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f72653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f72654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f72655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f72656d;

    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i11) {
            return new g[i11];
        }
    }

    protected g(Parcel parcel) {
        this.f72653a = parcel.readString();
        this.f72654b = parcel.readByte() != 0;
        this.f72655c = parcel.readString();
        this.f72656d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f72653a);
        parcel.writeByte(this.f72654b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f72655c);
        parcel.writeInt(this.f72656d);
    }

    public g(Peripheral peripheral) {
        this.f72653a = CallerData.NA;
        this.f72654b = peripheral.isConnected();
        this.f72655c = peripheral.getIdentifier();
        this.f72656d = peripheral.getRssi();
    }

    public g(String str, boolean z11, String str2, int i11) {
        this.f72653a = str;
        this.f72654b = z11;
        this.f72655c = str2;
        this.f72656d = i11;
    }
}
