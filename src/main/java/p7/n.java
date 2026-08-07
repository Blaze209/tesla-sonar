package p7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f101430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f101431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101433d;

    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i11) {
            return new n[i11];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f101434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f101435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f101436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f101437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f101438e;

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

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f101435b);
        }

        public b b(byte[] bArr) {
            return new b(this.f101435b, this.f101436c, this.f101437d, bArr);
        }

        public boolean c() {
            return this.f101438e != null;
        }

        public boolean d(UUID uuid) {
            return h.f101348a.equals(this.f101435b) || uuid.equals(this.f101435b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f101436c, bVar.f101436c) && Objects.equals(this.f101437d, bVar.f101437d) && Objects.equals(this.f101435b, bVar.f101435b) && Arrays.equals(this.f101438e, bVar.f101438e);
        }

        public int hashCode() {
            if (this.f101434a == 0) {
                int iHashCode = this.f101435b.hashCode() * 31;
                String str = this.f101436c;
                this.f101434a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f101437d.hashCode()) * 31) + Arrays.hashCode(this.f101438e);
            }
            return this.f101434a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeLong(this.f101435b.getMostSignificantBits());
            parcel.writeLong(this.f101435b.getLeastSignificantBits());
            parcel.writeString(this.f101436c);
            parcel.writeString(this.f101437d);
            parcel.writeByteArray(this.f101438e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f101435b = (UUID) s7.a.f(uuid);
            this.f101436c = str;
            this.f101437d = g0.u((String) s7.a.f(str2));
            this.f101438e = bArr;
        }

        b(Parcel parcel) {
            this.f101435b = new UUID(parcel.readLong(), parcel.readLong());
            this.f101436c = parcel.readString();
            this.f101437d = (String) s7.q0.l(parcel.readString());
            this.f101438e = parcel.createByteArray();
        }
    }

    public n(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    private static boolean b(ArrayList<b> arrayList, int i11, UUID uuid) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (arrayList.get(i12).f101435b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static n f(n nVar, n nVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (nVar != null) {
            str = nVar.f101432c;
            for (b bVar : nVar.f101430a) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (nVar2 != null) {
            if (str == null) {
                str = nVar2.f101432c;
            }
            int size = arrayList.size();
            for (b bVar2 : nVar2.f101430a) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f101435b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new n(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = h.f101348a;
        if (uuid.equals(bVar.f101435b)) {
            return uuid.equals(bVar2.f101435b) ? 0 : 1;
        }
        return bVar.f101435b.compareTo(bVar2.f101435b);
    }

    public n c(String str) {
        return Objects.equals(this.f101432c, str) ? this : new n(str, false, this.f101430a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (Objects.equals(this.f101432c, nVar.f101432c) && Arrays.equals(this.f101430a, nVar.f101430a)) {
                return true;
            }
        }
        return false;
    }

    public b h(int i11) {
        return this.f101430a[i11];
    }

    public int hashCode() {
        if (this.f101431b == 0) {
            String str = this.f101432c;
            this.f101431b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f101430a);
        }
        return this.f101431b;
    }

    public n j(n nVar) {
        String str;
        String str2 = this.f101432c;
        s7.a.h(str2 == null || (str = nVar.f101432c) == null || TextUtils.equals(str2, str));
        String str3 = this.f101432c;
        if (str3 == null) {
            str3 = nVar.f101432c;
        }
        return new n(str3, (b[]) s7.q0.g1(this.f101430a, nVar.f101430a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f101432c);
        parcel.writeTypedArray(this.f101430a, 0);
    }

    public n(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public n(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public n(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private n(String str, boolean z11, b... bVarArr) {
        this.f101432c = str;
        bVarArr = z11 ? (b[]) bVarArr.clone() : bVarArr;
        this.f101430a = bVarArr;
        this.f101433d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    n(Parcel parcel) {
        this.f101432c = parcel.readString();
        b[] bVarArr = (b[]) s7.q0.l((b[]) parcel.createTypedArray(b.CREATOR));
        this.f101430a = bVarArr;
        this.f101433d = bVarArr.length;
    }
}
