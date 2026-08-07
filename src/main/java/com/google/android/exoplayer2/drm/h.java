package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class h implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f39820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f39822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f39823d;

    class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i11) {
            return new h[i11];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f39824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f39825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f39826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f39827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f39828e;

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

        public b a(byte[] bArr) {
            return new b(this.f39825b, this.f39826c, this.f39827d, bArr);
        }

        public boolean b(UUID uuid) {
            return br.d.f17902a.equals(this.f39825b) || uuid.equals(this.f39825b);
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
            return p0.c(this.f39826c, bVar.f39826c) && p0.c(this.f39827d, bVar.f39827d) && p0.c(this.f39825b, bVar.f39825b) && Arrays.equals(this.f39828e, bVar.f39828e);
        }

        public int hashCode() {
            if (this.f39824a == 0) {
                int iHashCode = this.f39825b.hashCode() * 31;
                String str = this.f39826c;
                this.f39824a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f39827d.hashCode()) * 31) + Arrays.hashCode(this.f39828e);
            }
            return this.f39824a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeLong(this.f39825b.getMostSignificantBits());
            parcel.writeLong(this.f39825b.getLeastSignificantBits());
            parcel.writeString(this.f39826c);
            parcel.writeString(this.f39827d);
            parcel.writeByteArray(this.f39828e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f39825b = (UUID) ts.a.e(uuid);
            this.f39826c = str;
            this.f39827d = (String) ts.a.e(str2);
            this.f39828e = bArr;
        }

        b(Parcel parcel) {
            this.f39825b = new UUID(parcel.readLong(), parcel.readLong());
            this.f39826c = parcel.readString();
            this.f39827d = (String) p0.j(parcel.readString());
            this.f39828e = parcel.createByteArray();
        }
    }

    public h(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = br.d.f17902a;
        if (uuid.equals(bVar.f39825b)) {
            return uuid.equals(bVar2.f39825b) ? 0 : 1;
        }
        return bVar.f39825b.compareTo(bVar2.f39825b);
    }

    public h b(String str) {
        return p0.c(this.f39822c, str) ? this : new h(str, false, this.f39820a);
    }

    public b c(int i11) {
        return this.f39820a[i11];
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
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (p0.c(this.f39822c, hVar.f39822c) && Arrays.equals(this.f39820a, hVar.f39820a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f39821b == 0) {
            String str = this.f39822c;
            this.f39821b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f39820a);
        }
        return this.f39821b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f39822c);
        parcel.writeTypedArray(this.f39820a, 0);
    }

    public h(b... bVarArr) {
        this(null, bVarArr);
    }

    public h(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private h(String str, boolean z11, b... bVarArr) {
        this.f39822c = str;
        bVarArr = z11 ? (b[]) bVarArr.clone() : bVarArr;
        this.f39820a = bVarArr;
        this.f39823d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    h(Parcel parcel) {
        this.f39822c = parcel.readString();
        b[] bVarArr = (b[]) p0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f39820a = bVarArr;
        this.f39823d = bVarArr.length;
    }
}
