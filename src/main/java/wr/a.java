package wr;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.u0;
import java.util.Arrays;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a implements ur.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f122338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f122339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f122340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f122341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f122342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f122343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final u0 f122336g = new u0.b().g0("application/id3").G();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u0 f122337h = new u0.b().g0("application/x-scte35").G();
    public static final Parcelable.Creator<a> CREATOR = new C2626a();

    /* JADX INFO: renamed from: wr.a$a, reason: collision with other inner class name */
    class C2626a implements Parcelable.Creator<a> {
        C2626a() {
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

    public a(String str, String str2, long j11, long j12, byte[] bArr) {
        this.f122338a = str;
        this.f122339b = str2;
        this.f122340c = j11;
        this.f122341d = j12;
        this.f122342e = bArr;
    }

    @Override // ur.a.b
    public byte[] C() {
        if (H() != null) {
            return this.f122342e;
        }
        return null;
    }

    @Override // ur.a.b
    public u0 H() {
        String str = this.f122338a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f122337h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f122336g;
            default:
                return null;
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f122340c == aVar.f122340c && this.f122341d == aVar.f122341d && p0.c(this.f122338a, aVar.f122338a) && p0.c(this.f122339b, aVar.f122339b) && Arrays.equals(this.f122342e, aVar.f122342e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f122343f == 0) {
            String str = this.f122338a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f122339b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j11 = this.f122340c;
            int i11 = (((iHashCode + iHashCode2) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f122341d;
            this.f122343f = ((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + Arrays.hashCode(this.f122342e);
        }
        return this.f122343f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f122338a + ", id=" + this.f122341d + ", durationMs=" + this.f122340c + ", value=" + this.f122339b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f122338a);
        parcel.writeString(this.f122339b);
        parcel.writeLong(this.f122340c);
        parcel.writeLong(this.f122341d);
        parcel.writeByteArray(this.f122342e);
    }

    a(Parcel parcel) {
        this.f122338a = (String) p0.j(parcel.readString());
        this.f122339b = (String) p0.j(parcel.readString());
        this.f122340c = parcel.readLong();
        this.f122341d = parcel.readLong();
        this.f122342e = (byte[]) p0.j(parcel.createByteArray());
    }
}
