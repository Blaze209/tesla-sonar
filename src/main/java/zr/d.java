package zr;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f128511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f128512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f128513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f128514f;

    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i11) {
            return new d[i11];
        }
    }

    public d(String str, boolean z11, boolean z12, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f128510b = str;
        this.f128511c = z11;
        this.f128512d = z12;
        this.f128513e = strArr;
        this.f128514f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f128511c == dVar.f128511c && this.f128512d == dVar.f128512d && p0.c(this.f128510b, dVar.f128510b) && Arrays.equals(this.f128513e, dVar.f128513e) && Arrays.equals(this.f128514f, dVar.f128514f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = (((527 + (this.f128511c ? 1 : 0)) * 31) + (this.f128512d ? 1 : 0)) * 31;
        String str = this.f128510b;
        return i11 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f128510b);
        parcel.writeByte(this.f128511c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f128512d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f128513e);
        parcel.writeInt(this.f128514f.length);
        for (i iVar : this.f128514f) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f128510b = (String) p0.j(parcel.readString());
        this.f128511c = parcel.readByte() != 0;
        this.f128512d = parcel.readByte() != 0;
        this.f128513e = (String[]) p0.j(parcel.createStringArray());
        int i11 = parcel.readInt();
        this.f128514f = new i[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            this.f128514f[i12] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
