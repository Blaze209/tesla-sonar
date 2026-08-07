package yr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.y0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class c implements ur.a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f125789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125791c;

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

    public c(byte[] bArr, String str, String str2) {
        this.f125789a = bArr;
        this.f125790b = str;
        this.f125791c = str2;
    }

    @Override // ur.a.b
    public void O0(y0.b bVar) {
        String str = this.f125790b;
        if (str != null) {
            bVar.m0(str);
        }
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
        return Arrays.equals(this.f125789a, ((c) obj).f125789a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f125789a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f125790b, this.f125791c, Integer.valueOf(this.f125789a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByteArray(this.f125789a);
        parcel.writeString(this.f125790b);
        parcel.writeString(this.f125791c);
    }

    c(Parcel parcel) {
        this.f125789a = (byte[]) ts.a.e(parcel.createByteArray());
        this.f125790b = parcel.readString();
        this.f125791c = parcel.readString();
    }
}
