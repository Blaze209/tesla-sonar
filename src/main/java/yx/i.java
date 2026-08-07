package yx;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class i extends e {
    public static final Parcelable.Creator<i> CREATOR = new h();

    i(List list, d.b bVar) {
        super(list, bVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeList(b());
        parcel.writeParcelable(c(), i11);
    }
}
