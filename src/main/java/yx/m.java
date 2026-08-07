package yx;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
final class m extends g {
    public static final Parcelable.Creator<m> CREATOR = new l();

    m(Uri uri, int i11) {
        super(uri, i11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(b(), i11);
        parcel.writeInt(a());
    }
}
