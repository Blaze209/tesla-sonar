package m9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends m9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f91610a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f91612b;

        private b(int i11, long j11) {
            this.f91611a = i11;
            this.f91612b = j11;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f91613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f91614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f91615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f91616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f91617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f91618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f91619g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f91620h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f91621i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f91622j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f91623k;

        private c(long j11, boolean z11, boolean z12, boolean z13, List<b> list, long j12, boolean z14, long j13, int i11, int i12, int i13) {
            this.f91613a = j11;
            this.f91614b = z11;
            this.f91615c = z12;
            this.f91616d = z13;
            this.f91618f = Collections.unmodifiableList(list);
            this.f91617e = j12;
            this.f91619g = z14;
            this.f91620h = j13;
            this.f91621i = i11;
            this.f91622j = i12;
            this.f91623k = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(c0 c0Var) {
            ArrayList arrayList;
            boolean z11;
            boolean z12;
            long j11;
            boolean z13;
            long j12;
            int i11;
            int i12;
            int iM;
            boolean z14;
            long jO;
            long jO2 = c0Var.O();
            boolean z15 = true;
            if ((c0Var.M() & 128) == 0) {
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
                iM = 0;
            } else {
                int iM2 = c0Var.M();
                boolean z16 = (iM2 & 128) != 0;
                boolean z17 = (iM2 & 64) != 0 ? z15 : false;
                boolean z18 = (iM2 & 32) != 0 ? z15 : false;
                long jO3 = z17 ? c0Var.O() : -9223372036854775807L;
                if (!z17) {
                    int iM3 = c0Var.M();
                    ArrayList arrayList3 = new ArrayList(iM3);
                    int i13 = 0;
                    while (i13 < iM3) {
                        arrayList3.add(new b(c0Var.M(), c0Var.O()));
                        i13++;
                        iM3 = iM3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z18) {
                    long jM = c0Var.M();
                    boolean z19 = (128 & jM) != 0;
                    jO = ((((jM & 1) << 32) | c0Var.O()) * 1000) / 90;
                    z14 = z19;
                } else {
                    z14 = false;
                    jO = -9223372036854775807L;
                }
                int iU = c0Var.U();
                int iM4 = c0Var.M();
                boolean z21 = z16;
                z13 = z14;
                z11 = z21;
                iM = c0Var.M();
                long j13 = jO3;
                i11 = iU;
                i12 = iM4;
                long j14 = jO;
                arrayList = arrayList2;
                z12 = z17;
                j11 = j13;
                j12 = j14;
            }
            return new c(jO2, z15, z11, z12, arrayList, j11, z13, j12, i11, i12, iM);
        }
    }

    private f(List<c> list) {
        this.f91610a = Collections.unmodifiableList(list);
    }

    static f a(c0 c0Var) {
        int iM = c0Var.M();
        ArrayList arrayList = new ArrayList(iM);
        for (int i11 = 0; i11 < iM; i11++) {
            arrayList.add(c.b(c0Var));
        }
        return new f(arrayList);
    }
}
