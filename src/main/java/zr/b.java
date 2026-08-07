package zr;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f128503b;

    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f128503b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f128527a.equals(bVar.f128527a) && Arrays.equals(this.f128503b, bVar.f128503b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f128527a.hashCode()) * 31) + Arrays.hashCode(this.f128503b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f128527a);
        parcel.writeByteArray(this.f128503b);
    }

    b(Parcel parcel) {
        super((String) p0.j(parcel.readString()));
        this.f128503b = (byte[]) p0.j(parcel.createByteArray());
    }
}
