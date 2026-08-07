package xb;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.r0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<r0> f123186a;

    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i11) {
            return new n[i11];
        }
    }

    public n(List<r0> list) {
        this.f123186a = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        m[] mVarArr = new m[this.f123186a.size()];
        for (int i12 = 0; i12 < this.f123186a.size(); i12++) {
            mVarArr[i12] = new m(this.f123186a.get(i12));
        }
        parcel.writeParcelableArray(mVarArr, i11);
    }

    protected n(Parcel parcel) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(getClass().getClassLoader());
        this.f123186a = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            this.f123186a.add(((m) parcelable).a());
        }
    }
}
