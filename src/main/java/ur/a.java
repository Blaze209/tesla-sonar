package ur;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.y0;
import java.util.Arrays;
import java.util.List;
import ru.h;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2512a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f116508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f116509b;

    /* JADX INFO: renamed from: ur.a$a, reason: collision with other inner class name */
    class C2512a implements Parcelable.Creator<a> {
        C2512a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public a a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new a(this.f116509b, (b[]) p0.G0(this.f116508a, bVarArr));
    }

    public a b(a aVar) {
        return aVar == null ? this : a(aVar.f116508a);
    }

    public a c(long j11) {
        return this.f116509b == j11 ? this : new a(j11, this.f116508a);
    }

    public b d(int i11) {
        return this.f116508a[i11];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f116508a.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (Arrays.equals(this.f116508a, aVar.f116508a) && this.f116509b == aVar.f116509b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f116508a) * 31) + h.c(this.f116509b);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f116508a));
        if (this.f116509b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f116509b;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f116508a.length);
        for (b bVar : this.f116508a) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f116509b);
    }

    public a(long j11, b... bVarArr) {
        this.f116509b = j11;
        this.f116508a = bVarArr;
    }

    public a(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public a(long j11, List<? extends b> list) {
        this(j11, (b[]) list.toArray(new b[0]));
    }

    a(Parcel parcel) {
        this.f116508a = new b[parcel.readInt()];
        int i11 = 0;
        while (true) {
            b[] bVarArr = this.f116508a;
            if (i11 < bVarArr.length) {
                bVarArr[i11] = (b) parcel.readParcelable(b.class.getClassLoader());
                i11++;
            } else {
                this.f116509b = parcel.readLong();
                return;
            }
        }
    }

    public interface b extends Parcelable {
        default byte[] C() {
            return null;
        }

        default u0 H() {
            return null;
        }

        default void O0(y0.b bVar) {
        }
    }
}
