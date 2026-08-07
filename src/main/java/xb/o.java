package xb;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.r0;
import androidx.work.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import sb.c2;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"BanParcelableUsage"})
public class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f123187a;

    class a implements Parcelable.Creator<o> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o[] newArray(int i11) {
            return new o[i11];
        }
    }

    protected o(Parcel parcel) {
        List arrayList = Collections.EMPTY_LIST;
        int i11 = parcel.readInt();
        if (i11 > 0) {
            arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(UUID.fromString(parcel.readString()));
            }
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        List<? extends r0.c> arrayList2 = Collections.EMPTY_LIST;
        int i13 = parcel.readInt();
        if (i13 > 0) {
            arrayList2 = new ArrayList<>(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                arrayList2.add(c2.g(parcel.readInt()));
            }
        }
        this.f123187a = t0.a.f(arrayList).d(arrayListCreateStringArrayList).c(arrayListCreateStringArrayList2).b(arrayList2).e();
    }

    public t0 a() {
        return this.f123187a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        List<UUID> listA = this.f123187a.a();
        parcel.writeInt(listA.size());
        if (!listA.isEmpty()) {
            Iterator<UUID> it = listA.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next().toString());
            }
        }
        parcel.writeStringList(this.f123187a.d());
        parcel.writeStringList(this.f123187a.c());
        List<r0.c> listB = this.f123187a.b();
        parcel.writeInt(listB.size());
        if (listB.isEmpty()) {
            return;
        }
        Iterator<r0.c> it2 = listB.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(c2.k(it2.next()));
        }
    }
}
