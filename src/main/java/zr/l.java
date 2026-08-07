package zr;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f128537c;

    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i11) {
            return new l[i11];
        }
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f128536b = str;
        this.f128537c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (p0.c(this.f128536b, lVar.f128536b) && Arrays.equals(this.f128537c, lVar.f128537c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f128536b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f128537c);
    }

    @Override // zr.i
    public String toString() {
        return this.f128527a + ": owner=" + this.f128536b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f128536b);
        parcel.writeByteArray(this.f128537c);
    }

    l(Parcel parcel) {
        super("PRIV");
        this.f128536b = (String) p0.j(parcel.readString());
        this.f128537c = (byte[]) p0.j(parcel.createByteArray());
    }
}
