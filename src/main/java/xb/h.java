package xb;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f123172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r f123173b;

    class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i11) {
            return new h[i11];
        }
    }

    public h(String str, WorkerParameters workerParameters) {
        this.f123172a = str;
        this.f123173b = new r(workerParameters);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f123172a);
        this.f123173b.writeToParcel(parcel, i11);
    }

    protected h(Parcel parcel) {
        this.f123172a = parcel.readString();
        this.f123173b = new r(parcel);
    }
}
