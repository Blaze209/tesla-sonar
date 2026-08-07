package xb;

import android.annotation.SuppressLint;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WorkerParameters.a f123175a;

    class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i11) {
            return new j[i11];
        }
    }

    public j(WorkerParameters.a aVar) {
        this.f123175a = aVar;
    }

    public WorkerParameters.a a() {
        return this.f123175a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @SuppressLint({"NewApi"})
    public void writeToParcel(Parcel parcel, int i11) {
        Network network = Build.VERSION.SDK_INT >= 28 ? this.f123175a.f14450c : null;
        boolean z11 = false;
        boolean z12 = network != null;
        xb.b.c(parcel, z12);
        if (z12) {
            parcel.writeParcelable(b.a(network), i11);
        }
        WorkerParameters.a aVar = this.f123175a;
        List<Uri> list = aVar.f14449b;
        List<String> list2 = aVar.f14448a;
        boolean z13 = (list == null || list.isEmpty()) ? false : true;
        xb.b.c(parcel, z13);
        if (z13) {
            int size = list.size();
            Uri[] uriArr = new Uri[size];
            for (int i12 = 0; i12 < size; i12++) {
                uriArr[i12] = list.get(i12);
            }
            parcel.writeParcelableArray(uriArr, i11);
        }
        if (list2 != null && !list2.isEmpty()) {
            z11 = true;
        }
        xb.b.c(parcel, z11);
        if (z11) {
            parcel.writeStringList(list2);
        }
    }

    public j(Parcel parcel) {
        ArrayList arrayList;
        ClassLoader classLoader = getClass().getClassLoader();
        Network network = xb.b.a(parcel) ? (Network) parcel.readParcelable(classLoader) : null;
        if (xb.b.a(parcel)) {
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((Uri) parcelable);
            }
        } else {
            arrayList = null;
        }
        ArrayList<String> arrayListCreateStringArrayList = xb.b.a(parcel) ? parcel.createStringArrayList() : null;
        WorkerParameters.a aVar = new WorkerParameters.a();
        this.f123175a = aVar;
        if (Build.VERSION.SDK_INT >= 28) {
            aVar.f14450c = network;
        }
        if (arrayList != null) {
            aVar.f14449b = arrayList;
        }
        if (arrayListCreateStringArrayList != null) {
            aVar.f14448a = arrayListCreateStringArrayList;
        }
    }

    static class b {
        static Parcelable a(Network network) {
            return network;
        }
    }
}
