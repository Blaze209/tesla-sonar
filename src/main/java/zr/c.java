package zr;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f128506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f128507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f128508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i[] f128509g;

    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c(String str, int i11, int i12, long j11, long j12, i[] iVarArr) {
        super("CHAP");
        this.f128504b = str;
        this.f128505c = i11;
        this.f128506d = i12;
        this.f128507e = j11;
        this.f128508f = j12;
        this.f128509g = iVarArr;
    }

    @Override // zr.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f128505c == cVar.f128505c && this.f128506d == cVar.f128506d && this.f128507e == cVar.f128507e && this.f128508f == cVar.f128508f && p0.c(this.f128504b, cVar.f128504b) && Arrays.equals(this.f128509g, cVar.f128509g)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (((((((527 + this.f128505c) * 31) + this.f128506d) * 31) + ((int) this.f128507e)) * 31) + ((int) this.f128508f)) * 31;
        String str = this.f128504b;
        return i11 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f128504b);
        parcel.writeInt(this.f128505c);
        parcel.writeInt(this.f128506d);
        parcel.writeLong(this.f128507e);
        parcel.writeLong(this.f128508f);
        parcel.writeInt(this.f128509g.length);
        for (i iVar : this.f128509g) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f128504b = (String) p0.j(parcel.readString());
        this.f128505c = parcel.readInt();
        this.f128506d = parcel.readInt();
        this.f128507e = parcel.readLong();
        this.f128508f = parcel.readLong();
        int i11 = parcel.readInt();
        this.f128509g = new i[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f128509g[i12] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
