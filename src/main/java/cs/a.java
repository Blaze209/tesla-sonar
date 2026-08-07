package cs;

import android.os.Parcel;
import android.os.Parcelable;
import xr.b;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C1205a();

    /* JADX INFO: renamed from: cs.a$a, reason: collision with other inner class name */
    class C1205a implements Parcelable.Creator<a> {
        C1205a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(String str, String str2) {
        super(str, str2);
    }

    a(Parcel parcel) {
        super(parcel);
    }
}
