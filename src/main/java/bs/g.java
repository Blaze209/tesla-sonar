package bs;

import android.os.Parcel;
import android.os.Parcelable;
import ts.d0;
import ts.m0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18051b;

    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i11) {
            return new g[i11];
        }
    }

    /* synthetic */ g(long j11, long j12, a aVar) {
        this(j11, j12);
    }

    static g a(d0 d0Var, long j11, m0 m0Var) {
        long jB = b(d0Var, j11);
        return new g(jB, m0Var.b(jB));
    }

    static long b(d0 d0Var, long j11) {
        long jH = d0Var.H();
        if ((128 & jH) != 0) {
            return 8589934591L & ((((jH & 1) << 32) | d0Var.J()) + j11);
        }
        return -9223372036854775807L;
    }

    @Override // bs.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f18050a + ", playbackPositionUs= " + this.f18051b + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f18050a);
        parcel.writeLong(this.f18051b);
    }

    private g(long j11, long j12) {
        this.f18050a = j11;
        this.f18051b = j12;
    }
}
