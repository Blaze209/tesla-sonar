package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class k0 implements Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ArrayList<String> f8564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<String> f8565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    b[] f8566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f8567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f8568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<String> f8569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<c> f8570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ArrayList<FragmentManager.l> f8571h;

    class a implements Parcelable.Creator<k0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k0 createFromParcel(Parcel parcel) {
            return new k0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k0[] newArray(int i11) {
            return new k0[i11];
        }
    }

    public k0() {
        this.f8568e = null;
        this.f8569f = new ArrayList<>();
        this.f8570g = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeStringList(this.f8564a);
        parcel.writeStringList(this.f8565b);
        parcel.writeTypedArray(this.f8566c, i11);
        parcel.writeInt(this.f8567d);
        parcel.writeString(this.f8568e);
        parcel.writeStringList(this.f8569f);
        parcel.writeTypedList(this.f8570g);
        parcel.writeTypedList(this.f8571h);
    }

    public k0(Parcel parcel) {
        this.f8568e = null;
        this.f8569f = new ArrayList<>();
        this.f8570g = new ArrayList<>();
        this.f8564a = parcel.createStringArrayList();
        this.f8565b = parcel.createStringArrayList();
        this.f8566c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f8567d = parcel.readInt();
        this.f8568e = parcel.readString();
        this.f8569f = parcel.createStringArrayList();
        this.f8570g = parcel.createTypedArrayList(c.CREATOR);
        this.f8571h = parcel.createTypedArrayList(FragmentManager.l.CREATOR);
    }
}
