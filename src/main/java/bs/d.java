package bs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ts.d0;
import ts.m0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d extends bs.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f18026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f18027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f18028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f18029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f18031l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18032m;

    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i11) {
            return new d[i11];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f18035c;

        /* synthetic */ b(int i11, long j11, long j12, a aVar) {
            this(i11, j11, j12);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f18033a);
            parcel.writeLong(this.f18034b);
            parcel.writeLong(this.f18035c);
        }

        private b(int i11, long j11, long j12) {
            this.f18033a = i11;
            this.f18034b = j11;
            this.f18035c = j12;
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static d a(d0 d0Var, long j11, m0 m0Var) {
        List list;
        long j12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        int iH;
        int iH2;
        boolean z15;
        long J = d0Var.J();
        boolean z16 = (d0Var.H() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long J2 = -9223372036854775807L;
        if (z16) {
            list = list2;
            j12 = -9223372036854775807L;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            i11 = 0;
            iH = 0;
            iH2 = 0;
        } else {
            int iH3 = d0Var.H();
            boolean z17 = (iH3 & 128) != 0;
            boolean z18 = (iH3 & 64) != 0;
            boolean z19 = (iH3 & 32) != 0;
            boolean z21 = (iH3 & 16) != 0;
            long jB = (!z18 || z21) ? -9223372036854775807L : g.b(d0Var, j11);
            if (!z18) {
                int iH4 = d0Var.H();
                ArrayList arrayList = new ArrayList(iH4);
                int i12 = 0;
                while (i12 < iH4) {
                    int iH5 = d0Var.H();
                    long jB2 = !z21 ? g.b(d0Var, j11) : -9223372036854775807L;
                    arrayList.add(new b(iH5, jB2, m0Var.b(jB2), null));
                    i12++;
                    iH4 = iH4;
                }
                list2 = arrayList;
            }
            if (z19) {
                long jH = d0Var.H();
                boolean z22 = (128 & jH) != 0;
                J2 = ((((jH & 1) << 32) | d0Var.J()) * 1000) / 90;
                z15 = z22;
            } else {
                z15 = false;
            }
            int iN = d0Var.N();
            long j13 = jB;
            j12 = J2;
            J2 = j13;
            iH = d0Var.H();
            iH2 = d0Var.H();
            i11 = iN;
            z14 = z15;
            z11 = z17;
            z12 = z18;
            list = list2;
            z13 = z21;
        }
        return new d(J, z16, z11, z12, z13, J2, m0Var.b(J2), list, z14, j12, i11, iH, iH2);
    }

    @Override // bs.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f18025f + ", programSplicePlaybackPositionUs= " + this.f18026g + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f18020a);
        parcel.writeByte(this.f18021b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18022c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18023d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f18024e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f18025f);
        parcel.writeLong(this.f18026g);
        int size = this.f18027h.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            this.f18027h.get(i12).b(parcel);
        }
        parcel.writeByte(this.f18028i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f18029j);
        parcel.writeInt(this.f18030k);
        parcel.writeInt(this.f18031l);
        parcel.writeInt(this.f18032m);
    }

    private d(long j11, boolean z11, boolean z12, boolean z13, boolean z14, long j12, long j13, List<b> list, boolean z15, long j14, int i11, int i12, int i13) {
        this.f18020a = j11;
        this.f18021b = z11;
        this.f18022c = z12;
        this.f18023d = z13;
        this.f18024e = z14;
        this.f18025f = j12;
        this.f18026g = j13;
        this.f18027h = Collections.unmodifiableList(list);
        this.f18028i = z15;
        this.f18029j = j14;
        this.f18030k = i11;
        this.f18031l = i12;
        this.f18032m = i13;
    }

    private d(Parcel parcel) {
        this.f18020a = parcel.readLong();
        this.f18021b = parcel.readByte() == 1;
        this.f18022c = parcel.readByte() == 1;
        this.f18023d = parcel.readByte() == 1;
        this.f18024e = parcel.readByte() == 1;
        this.f18025f = parcel.readLong();
        this.f18026g = parcel.readLong();
        int i11 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(b.a(parcel));
        }
        this.f18027h = Collections.unmodifiableList(arrayList);
        this.f18028i = parcel.readByte() == 1;
        this.f18029j = parcel.readLong();
        this.f18030k = parcel.readInt();
        this.f18031l = parcel.readInt();
        this.f18032m = parcel.readInt();
    }
}
