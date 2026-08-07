package xb;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f123190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.work.g f123191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<String> f123192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WorkerParameters.a f123193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f123194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f123195f;

    class a implements Parcelable.Creator<r> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r[] newArray(int i11) {
            return new r[i11];
        }
    }

    public r(WorkerParameters workerParameters) {
        this.f123190a = workerParameters.d();
        this.f123191b = workerParameters.e();
        this.f123192c = workerParameters.j();
        this.f123193d = workerParameters.i();
        this.f123194e = workerParameters.h();
        this.f123195f = workerParameters.c();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f123190a.toString());
        new d(this.f123191b).writeToParcel(parcel, i11);
        parcel.writeStringList(new ArrayList(this.f123192c));
        new j(this.f123193d).writeToParcel(parcel, i11);
        parcel.writeInt(this.f123194e);
        parcel.writeInt(this.f123195f);
    }

    public r(Parcel parcel) {
        this.f123190a = UUID.fromString(parcel.readString());
        this.f123191b = new d(parcel).getData();
        this.f123192c = new HashSet(parcel.createStringArrayList());
        this.f123193d = new j(parcel).a();
        this.f123194e = parcel.readInt();
        this.f123195f = parcel.readInt();
    }
}
