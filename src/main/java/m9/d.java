package m9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s7.c0;
import s7.i0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends m9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f91594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f91596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f91597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f91598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f91599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f91600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<b> f91601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f91602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f91603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f91604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f91605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f91606m;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f91608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f91609c;

        private b(int i11, long j11, long j12) {
            this.f91607a = i11;
            this.f91608b = j11;
            this.f91609c = j12;
        }
    }

    private d(long j11, boolean z11, boolean z12, boolean z13, boolean z14, long j12, long j13, List<b> list, boolean z15, long j14, int i11, int i12, int i13) {
        this.f91594a = j11;
        this.f91595b = z11;
        this.f91596c = z12;
        this.f91597d = z13;
        this.f91598e = z14;
        this.f91599f = j12;
        this.f91600g = j13;
        this.f91601h = Collections.unmodifiableList(list);
        this.f91602i = z15;
        this.f91603j = j14;
        this.f91604k = i11;
        this.f91605l = i12;
        this.f91606m = i13;
    }

    static d a(c0 c0Var, long j11, i0 i0Var) {
        List list;
        long j12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        int iM;
        int iM2;
        boolean z15;
        long jO = c0Var.O();
        boolean z16 = (c0Var.M() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jO2 = -9223372036854775807L;
        if (z16) {
            list = list2;
            j12 = -9223372036854775807L;
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
            i11 = 0;
            iM = 0;
            iM2 = 0;
        } else {
            int iM3 = c0Var.M();
            boolean z17 = (iM3 & 128) != 0;
            boolean z18 = (iM3 & 64) != 0;
            boolean z19 = (iM3 & 32) != 0;
            boolean z21 = (iM3 & 16) != 0;
            long jB = (!z18 || z21) ? -9223372036854775807L : g.b(c0Var, j11);
            if (!z18) {
                int iM4 = c0Var.M();
                ArrayList arrayList = new ArrayList(iM4);
                int i12 = 0;
                while (i12 < iM4) {
                    int iM5 = c0Var.M();
                    long jB2 = !z21 ? g.b(c0Var, j11) : -9223372036854775807L;
                    arrayList.add(new b(iM5, jB2, i0Var.b(jB2)));
                    i12++;
                    iM4 = iM4;
                }
                list2 = arrayList;
            }
            if (z19) {
                long jM = c0Var.M();
                boolean z22 = (128 & jM) != 0;
                jO2 = ((((jM & 1) << 32) | c0Var.O()) * 1000) / 90;
                z15 = z22;
            } else {
                z15 = false;
            }
            int iU = c0Var.U();
            long j13 = jB;
            j12 = jO2;
            jO2 = j13;
            iM = c0Var.M();
            iM2 = c0Var.M();
            i11 = iU;
            z14 = z15;
            z11 = z17;
            z12 = z18;
            list = list2;
            z13 = z21;
        }
        return new d(jO, z16, z11, z12, z13, jO2, i0Var.b(jO2), list, z14, j12, i11, iM, iM2);
    }

    @Override // m9.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f91599f + ", programSplicePlaybackPositionUs= " + this.f91600g + " }";
    }
}
