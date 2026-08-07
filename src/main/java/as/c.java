package as;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ou.l;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c implements ur.a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f14965a;

    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public static final class b implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f14967a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f14968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f14969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator<b> f14966d = new Comparator() { // from class: as.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                c.b bVar = (c.b) obj;
                c.b bVar2 = (c.b) obj2;
                return p.j().e(bVar.f14967a, bVar2.f14967a).e(bVar.f14968b, bVar2.f14968b).d(bVar.f14969c, bVar2.f14969c).i();
            }
        };
        public static final Parcelable.Creator<b> CREATOR = new a();

        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(long j11, long j12, int i11) {
            ts.a.a(j11 < j12);
            this.f14967a = j11;
            this.f14968b = j12;
            this.f14969c = i11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f14967a == bVar.f14967a && this.f14968b == bVar.f14968b && this.f14969c == bVar.f14969c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return l.b(Long.valueOf(this.f14967a), Long.valueOf(this.f14968b), Integer.valueOf(this.f14969c));
        }

        public String toString() {
            return p0.B("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f14967a), Long.valueOf(this.f14968b), Integer.valueOf(this.f14969c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeLong(this.f14967a);
            parcel.writeLong(this.f14968b);
            parcel.writeInt(this.f14969c);
        }
    }

    public c(List<b> list) {
        this.f14965a = list;
        ts.a.a(!a(list));
    }

    private static boolean a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j11 = list.get(0).f14968b;
        for (int i11 = 1; i11 < list.size(); i11++) {
            if (list.get(i11).f14967a < j11) {
                return true;
            }
            j11 = list.get(i11).f14968b;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f14965a.equals(((c) obj).f14965a);
    }

    public int hashCode() {
        return this.f14965a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f14965a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeList(this.f14965a);
    }
}
