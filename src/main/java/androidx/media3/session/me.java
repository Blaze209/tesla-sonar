package androidx.media3.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ha.g.e f11983a = new ha.g.e("androidx.media3.session.MediaLibraryService", null);

    public static boolean a(ha.p pVar, ha.p pVar2) {
        boolean z11 = pVar != null && pVar.q() == 7;
        boolean z12 = pVar2 != null && pVar2.q() == 7;
        if (z11 && z12) {
            return ((ha.p) s7.q0.l(pVar)).g() == ((ha.p) s7.q0.l(pVar2)).g() && TextUtils.equals(((ha.p) s7.q0.l(pVar)).h(), ((ha.p) s7.q0.l(pVar2)).h());
        }
        return z11 == z12;
    }

    public static boolean b(ue ueVar, ue ueVar2) {
        p7.j0.e eVar = ueVar.f12456a;
        int i11 = eVar.f101397c;
        p7.j0.e eVar2 = ueVar2.f12456a;
        return i11 == eVar2.f101397c && eVar.f101400f == eVar2.f101400f && eVar.f101403i == eVar2.f101403i && eVar.f101404j == eVar2.f101404j;
    }

    public static int c(long j11, long j12) {
        if (j11 == -9223372036854775807L || j12 == -9223372036854775807L) {
            return 0;
        }
        if (j12 == 0) {
            return 100;
        }
        return s7.q0.r(s7.q0.l1(j11, j12), 0, 100);
    }

    public static int[] d(int i11) {
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = i12;
        }
        return iArr;
    }

    public static long e(ne neVar, long j11, long j12, long j13) {
        boolean z11 = neVar.f12022c.equals(ue.f12445l) || j12 < neVar.f12022c.f12458c;
        if (neVar.f12041v) {
            if (z11 || j11 == -9223372036854775807L) {
                if (j13 == -9223372036854775807L) {
                    j13 = SystemClock.elapsedRealtime() - neVar.f12022c.f12458c;
                }
                ue ueVar = neVar.f12022c;
                long j14 = ueVar.f12456a.f101401g + ((long) (j13 * neVar.f12026g.f101379a));
                long j15 = ueVar.f12459d;
                return j15 != -9223372036854775807L ? Math.min(j14, j15) : j14;
            }
        } else if (z11 || j11 == -9223372036854775807L) {
            return neVar.f12022c.f12456a.f101401g;
        }
        return j11;
    }

    public static p7.j0.b f(p7.j0.b bVar, p7.j0.b bVar2) {
        if (bVar == null || bVar2 == null) {
            return p7.j0.b.f101382b;
        }
        p7.j0.b.a aVar = new p7.j0.b.a();
        for (int i11 = 0; i11 < bVar.g(); i11++) {
            if (bVar2.c(bVar.f(i11))) {
                aVar.a(bVar.f(i11));
            }
        }
        return aVar.f();
    }

    public static ne g(ne neVar, ne neVar2, ne.c cVar, p7.j0.b bVar) {
        if (cVar.f12075a && bVar.c(17)) {
            neVar2 = neVar2.u(neVar.f12029j);
        }
        return (cVar.f12076b && bVar.c(30)) ? neVar2.b(neVar.D) : neVar2;
    }

    public static <T> List<T> h(List<T> list) {
        ArrayList arrayList = new ArrayList();
        for (T t11 : list) {
            if (t11 != null) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static void i(p7.j0 j0Var, t7.i iVar) {
        if (iVar.f12401b == -1) {
            if (j0Var.c0(20)) {
                j0Var.Y(iVar.f12400a, true);
                return;
            } else {
                if (iVar.f12400a.isEmpty()) {
                    return;
                }
                j0Var.m0(iVar.f12400a.get(0), true);
                return;
            }
        }
        if (j0Var.c0(20)) {
            j0Var.k0(iVar.f12400a, iVar.f12401b, iVar.f12402c);
        } else {
            if (iVar.f12400a.isEmpty()) {
                return;
            }
            j0Var.q0(iVar.f12400a.get(0), iVar.f12402c);
        }
    }

    public static <T extends Parcelable> List<T> j(List<T> list, int i11) {
        ArrayList arrayList = new ArrayList();
        Parcel parcelObtain = Parcel.obtain();
        for (int i12 = 0; i12 < list.size(); i12++) {
            try {
                T t11 = list.get(i12);
                parcelObtain.writeParcelable(t11, 0);
                if (parcelObtain.dataSize() >= i11) {
                    break;
                }
                arrayList.add(t11);
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        parcelObtain.recycle();
        return arrayList;
    }
}
