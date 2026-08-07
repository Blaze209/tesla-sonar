package pg0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: pg0.f4, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Lpg0/f4;", "Landroid/os/Parcelable;", "", "countryName", "countryCode", "", "Lpg0/d4;", "ids", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getCountryCode", "c", "Ljava/util/List;", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IdConfigForCountry implements Parcelable {
    public static final Parcelable.Creator<IdConfigForCountry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String countryCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<IdConfig> ids;

    /* JADX INFO: renamed from: pg0.f4$a */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IdConfigForCountry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IdConfigForCountry createFromParcel(Parcel parcel) {
            p013kotlin.jvm.internal.s.k(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(IdConfig.CREATOR.createFromParcel(parcel));
            }
            return new IdConfigForCountry(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final IdConfigForCountry[] newArray(int i11) {
            return new IdConfigForCountry[i11];
        }
    }

    public IdConfigForCountry(String countryName, String countryCode, List<IdConfig> ids) {
        p013kotlin.jvm.internal.s.k(countryName, "countryName");
        p013kotlin.jvm.internal.s.k(countryCode, "countryCode");
        p013kotlin.jvm.internal.s.k(ids, "ids");
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.ids = ids;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryName() {
        return this.countryName;
    }

    public final List<IdConfig> b() {
        return this.ids;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdConfigForCountry)) {
            return false;
        }
        IdConfigForCountry idConfigForCountry = (IdConfigForCountry) other;
        return p013kotlin.jvm.internal.s.f(this.countryName, idConfigForCountry.countryName) && p013kotlin.jvm.internal.s.f(this.countryCode, idConfigForCountry.countryCode) && p013kotlin.jvm.internal.s.f(this.ids, idConfigForCountry.ids);
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public int hashCode() {
        return (((this.countryName.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.ids.hashCode();
    }

    public String toString() {
        return "IdConfigForCountry(countryName=" + this.countryName + ", countryCode=" + this.countryCode + ", ids=" + this.ids + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        p013kotlin.jvm.internal.s.k(dest, "dest");
        dest.writeString(this.countryName);
        dest.writeString(this.countryCode);
        List<IdConfig> list = this.ids;
        dest.writeInt(list.size());
        Iterator<IdConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
