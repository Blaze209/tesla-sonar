package bs;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ts.d0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f extends bs.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f18036a;

    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i11) {
            return new f[i11];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18038b;

        /* synthetic */ b(int i11, long j11, a aVar) {
            this(i11, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f18037a);
            parcel.writeLong(this.f18038b);
        }

        private b(int i11, long j11) {
            this.f18037a = i11;
            this.f18038b = j11;
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    static f a(d0 d0Var) {
        int iH = d0Var.H();
        ArrayList arrayList = new ArrayList(iH);
        for (int i11 = 0; i11 < iH; i11++) {
            arrayList.add(c.e(d0Var));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int size = this.f18036a.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            this.f18036a.get(i12).f(parcel);
        }
    }

    private f(List<c> list) {
        this.f18036a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int i11 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(c.d(parcel));
        }
        this.f18036a = Collections.unmodifiableList(arrayList);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f18041c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f18042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f18043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f18044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f18045g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f18046h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f18047i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f18048j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f18049k;

        private c(long j11, boolean z11, boolean z12, boolean z13, List<b> list, long j12, boolean z14, long j13, int i11, int i12, int i13) {
            this.f18039a = j11;
            this.f18040b = z11;
            this.f18041c = z12;
            this.f18042d = z13;
            this.f18044f = Collections.unmodifiableList(list);
            this.f18043e = j12;
            this.f18045g = z14;
            this.f18046h = j13;
            this.f18047i = i11;
            this.f18048j = i12;
            this.f18049k = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(d0 d0Var) {
            ArrayList arrayList;
            boolean z11;
            boolean z12;
            long j11;
            boolean z13;
            long j12;
            int i11;
            int i12;
            int iH;
            boolean z14;
            long J;
            long J2 = d0Var.J();
            boolean z15 = true;
            if ((d0Var.H() & 128) == 0) {
                z15 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z15) {
                arrayList = arrayList2;
                z11 = false;
                z12 = false;
                j11 = -9223372036854775807L;
                z13 = false;
                j12 = -9223372036854775807L;
                i11 = 0;
                i12 = 0;
                iH = 0;
            } else {
                int iH2 = d0Var.H();
                boolean z16 = (iH2 & 128) != 0;
                boolean z17 = (iH2 & 64) != 0 ? z15 : false;
                boolean z18 = (iH2 & 32) != 0 ? z15 : false;
                long J3 = z17 ? d0Var.J() : -9223372036854775807L;
                if (!z17) {
                    int iH3 = d0Var.H();
                    ArrayList arrayList3 = new ArrayList(iH3);
                    int i13 = 0;
                    while (i13 < iH3) {
                        arrayList3.add(new b(d0Var.H(), d0Var.J(), null));
                        i13++;
                        iH3 = iH3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z18) {
                    long jH = d0Var.H();
                    boolean z19 = (128 & jH) != 0;
                    J = ((((jH & 1) << 32) | d0Var.J()) * 1000) / 90;
                    z14 = z19;
                } else {
                    z14 = false;
                    J = -9223372036854775807L;
                }
                int iN = d0Var.N();
                int iH4 = d0Var.H();
                boolean z21 = z16;
                z13 = z14;
                z11 = z21;
                iH = d0Var.H();
                long j13 = J3;
                i11 = iN;
                i12 = iH4;
                long j14 = J;
                arrayList = arrayList2;
                z12 = z17;
                j11 = j13;
                j12 = j14;
            }
            return new c(J2, z15, z11, z12, arrayList, j11, z13, j12, i11, i12, iH);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f18039a);
            parcel.writeByte(this.f18040b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18041c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f18042d ? (byte) 1 : (byte) 0);
            int size = this.f18044f.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                this.f18044f.get(i11).d(parcel);
            }
            parcel.writeLong(this.f18043e);
            parcel.writeByte(this.f18045g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f18046h);
            parcel.writeInt(this.f18047i);
            parcel.writeInt(this.f18048j);
            parcel.writeInt(this.f18049k);
        }

        private c(Parcel parcel) {
            this.f18039a = parcel.readLong();
            this.f18040b = parcel.readByte() == 1;
            this.f18041c = parcel.readByte() == 1;
            this.f18042d = parcel.readByte() == 1;
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(b.c(parcel));
            }
            this.f18044f = Collections.unmodifiableList(arrayList);
            this.f18043e = parcel.readLong();
            this.f18045g = parcel.readByte() == 1;
            this.f18046h = parcel.readLong();
            this.f18047i = parcel.readInt();
            this.f18048j = parcel.readInt();
            this.f18049k = parcel.readInt();
        }
    }
}
