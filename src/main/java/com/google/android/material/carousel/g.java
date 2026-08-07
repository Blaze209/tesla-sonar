package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f41815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<f> f41816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<f> f41817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f41818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float[] f41819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f41820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f41821g;

    private g(@NonNull f fVar, List<f> list, List<f> list2) {
        this.f41815a = fVar;
        this.f41816b = Collections.unmodifiableList(list);
        this.f41817c = Collections.unmodifiableList(list2);
        float f11 = list.get(list.size() - 1).c().f41807a - fVar.c().f41807a;
        this.f41820f = f11;
        float f12 = fVar.j().f41807a - list2.get(list2.size() - 1).j().f41807a;
        this.f41821g = f12;
        this.f41818d = m(f11, list, true);
        this.f41819e = m(f12, list2, false);
    }

    private f a(List<f> list, float f11, float[] fArr) {
        float[] fArrO = o(list, f11, fArr);
        return fArrO[0] >= 0.5f ? list.get((int) fArrO[2]) : list.get((int) fArrO[1]);
    }

    private static int b(f fVar, float f11) {
        for (int i11 = fVar.i(); i11 < fVar.g().size(); i11++) {
            if (f11 == fVar.g().get(i11).f41809c) {
                return i11;
            }
        }
        return fVar.g().size() - 1;
    }

    private static int c(f fVar) {
        for (int i11 = 0; i11 < fVar.g().size(); i11++) {
            if (!fVar.g().get(i11).f41811e) {
                return i11;
            }
        }
        return -1;
    }

    private static int d(f fVar, float f11) {
        for (int iB = fVar.b() - 1; iB >= 0; iB--) {
            if (f11 == fVar.g().get(iB).f41809c) {
                return iB;
            }
        }
        return 0;
    }

    private static int e(f fVar) {
        for (int size = fVar.g().size() - 1; size >= 0; size--) {
            if (!fVar.g().get(size).f41811e) {
                return size;
            }
        }
        return -1;
    }

    static g f(b bVar, f fVar, float f11, float f12, float f13) {
        return new g(fVar, p(bVar, fVar, f11, f12), n(bVar, fVar, f11, f13));
    }

    private static float[] m(float f11, List<f> list, boolean z11) {
        int size = list.size();
        float[] fArr = new float[size];
        int i11 = 1;
        while (i11 < size) {
            int i12 = i11 - 1;
            f fVar = list.get(i12);
            f fVar2 = list.get(i11);
            fArr[i11] = i11 == size + (-1) ? 1.0f : fArr[i12] + ((z11 ? fVar2.c().f41807a - fVar.c().f41807a : fVar.j().f41807a - fVar2.j().f41807a) / f11);
            i11++;
        }
        return fArr;
    }

    private static List<f> n(b bVar, f fVar, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int iE = e(fVar);
        float fD = bVar.g() ? bVar.d() : bVar.b();
        if (!r(bVar, fVar) && iE != -1) {
            int i11 = iE - fVar.i();
            float f13 = fVar.c().f41808b - (fVar.c().f41810d / 2.0f);
            if (i11 <= 0 && fVar.h().f41812f > BitmapDescriptorFactory.HUE_RED) {
                arrayList.add(v(fVar, f13 - fVar.h().f41812f, fD));
                return arrayList;
            }
            int i12 = 0;
            float f14 = 0.0f;
            while (i12 < i11) {
                f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                int i13 = iE - i12;
                float f15 = f14 + fVar.g().get(i13).f41812f;
                int i14 = i13 + 1;
                f fVarT = t(fVar2, iE, i14 < fVar.g().size() ? d(fVar2, fVar.g().get(i14).f41809c) + 1 : 0, f13 - f15, fVar.b() + i12 + 1, fVar.i() + i12 + 1, fD);
                if (i12 == i11 - 1 && f12 > BitmapDescriptorFactory.HUE_RED) {
                    fVarT = u(fVarT, f12, fD, false, f11);
                }
                arrayList.add(fVarT);
                i12++;
                f14 = f15;
            }
        } else if (f12 > BitmapDescriptorFactory.HUE_RED) {
            arrayList.add(u(fVar, f12, fD, false, f11));
        }
        return arrayList;
    }

    private static float[] o(List<f> list, float f11, float[] fArr) {
        int size = list.size();
        float f12 = fArr[0];
        int i11 = 1;
        while (i11 < size) {
            float f13 = fArr[i11];
            if (f11 <= f13) {
                return new float[]{at.b.b(BitmapDescriptorFactory.HUE_RED, 1.0f, f12, f13, f11), i11 - 1, i11};
            }
            i11++;
            f12 = f13;
        }
        return new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    }

    private static List<f> p(b bVar, f fVar, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(fVar);
        int iC = c(fVar);
        float fD = bVar.g() ? bVar.d() : bVar.b();
        if (!q(fVar) && iC != -1) {
            int iB = fVar.b() - iC;
            float f13 = fVar.c().f41808b - (fVar.c().f41810d / 2.0f);
            if (iB <= 0 && fVar.a().f41812f > BitmapDescriptorFactory.HUE_RED) {
                arrayList.add(v(fVar, f13 + fVar.a().f41812f, fD));
                return arrayList;
            }
            int i11 = 0;
            float f14 = 0.0f;
            while (i11 < iB) {
                f fVar2 = (f) arrayList.get(arrayList.size() - 1);
                int i12 = iC + i11;
                int size = fVar.g().size() - 1;
                float f15 = f14 + fVar.g().get(i12).f41812f;
                int i13 = i12 - 1;
                if (i13 >= 0) {
                    size = b(fVar2, fVar.g().get(i13).f41809c) - 1;
                }
                f fVarT = t(fVar2, iC, size, f13 + f15, (fVar.b() - i11) - 1, (fVar.i() - i11) - 1, fD);
                if (i11 == iB - 1 && f12 > BitmapDescriptorFactory.HUE_RED) {
                    fVarT = u(fVarT, f12, fD, true, f11);
                }
                arrayList.add(fVarT);
                i11++;
                f14 = f15;
            }
        } else if (f12 > BitmapDescriptorFactory.HUE_RED) {
            arrayList.add(u(fVar, f12, fD, true, f11));
        }
        return arrayList;
    }

    private static boolean q(f fVar) {
        return fVar.a().f41808b - (fVar.a().f41810d / 2.0f) >= BitmapDescriptorFactory.HUE_RED && fVar.a() == fVar.d();
    }

    private static boolean r(b bVar, f fVar) {
        int iB = bVar.b();
        if (bVar.g()) {
            iB = bVar.d();
        }
        return fVar.h().f41808b + (fVar.h().f41810d / 2.0f) <= ((float) iB) && fVar.h() == fVar.k();
    }

    private static f s(List<f> list, float f11, float[] fArr) {
        float[] fArrO = o(list, f11, fArr);
        return f.m(list.get((int) fArrO[1]), list.get((int) fArrO[2]), fArrO[0]);
    }

    private static f t(f fVar, int i11, int i12, float f11, int i13, int i14, float f12) {
        ArrayList arrayList = new ArrayList(fVar.g());
        arrayList.add(i12, (f.c) arrayList.remove(i11));
        f.b bVar = new f.b(fVar.f(), f12);
        int i15 = 0;
        while (i15 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i15);
            float f13 = cVar.f41810d;
            bVar.e(f11 + (f13 / 2.0f), cVar.f41809c, f13, i15 >= i13 && i15 <= i14, cVar.f41811e, cVar.f41812f);
            f11 += cVar.f41810d;
            i15++;
        }
        return bVar.i();
    }

    private static f u(f fVar, float f11, float f12, boolean z11, float f13) {
        ArrayList arrayList = new ArrayList(fVar.g());
        f.b bVar = new f.b(fVar.f(), f12);
        float fL = f11 / fVar.l();
        float f14 = z11 ? f11 : 0.0f;
        int i11 = 0;
        while (i11 < arrayList.size()) {
            f.c cVar = (f.c) arrayList.get(i11);
            if (cVar.f41811e) {
                bVar.e(cVar.f41808b, cVar.f41809c, cVar.f41810d, false, true, cVar.f41812f);
            } else {
                boolean z12 = i11 >= fVar.b() && i11 <= fVar.i();
                float f15 = cVar.f41810d - fL;
                float fB = d.b(f15, fVar.f(), f13);
                float f16 = (f15 / 2.0f) + f14;
                float f17 = f16 - cVar.f41808b;
                bVar.f(f16, fB, f15, z12, false, cVar.f41812f, z11 ? f17 : 0.0f, z11 ? 0.0f : f17);
                f14 += f15;
            }
            i11++;
        }
        return bVar.i();
    }

    private static f v(f fVar, float f11, float f12) {
        return t(fVar, 0, 0, f11, fVar.b(), fVar.i(), f12);
    }

    f g() {
        return this.f41815a;
    }

    f h() {
        List<f> list = this.f41817c;
        return list.get(list.size() - 1);
    }

    Map<Integer, f> i(int i11, int i12, int i13, boolean z11) {
        float f11 = this.f41815a.f();
        HashMap map = new HashMap();
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 >= i11) {
                break;
            }
            int i16 = z11 ? (i11 - i14) - 1 : i14;
            if (i16 * f11 * (z11 ? -1 : 1) > i13 - this.f41821g || i14 >= i11 - this.f41817c.size()) {
                Integer numValueOf = Integer.valueOf(i16);
                List<f> list = this.f41817c;
                map.put(numValueOf, list.get(o5.a.b(i15, 0, list.size() - 1)));
                i15++;
            }
            i14++;
        }
        int i17 = 0;
        for (int i18 = i11 - 1; i18 >= 0; i18--) {
            int i19 = z11 ? (i11 - i18) - 1 : i18;
            if (i19 * f11 * (z11 ? -1 : 1) < i12 + this.f41820f || i18 < this.f41816b.size()) {
                Integer numValueOf2 = Integer.valueOf(i19);
                List<f> list2 = this.f41816b;
                map.put(numValueOf2, list2.get(o5.a.b(i17, 0, list2.size() - 1)));
                i17++;
            }
        }
        return map;
    }

    public f j(float f11, float f12, float f13) {
        return k(f11, f12, f13, false);
    }

    f k(float f11, float f12, float f13, boolean z11) {
        float fB;
        List<f> list;
        float[] fArr;
        float f14 = this.f41820f + f12;
        float f15 = f13 - this.f41821g;
        float f16 = l().a().f41813g;
        float f17 = h().h().f41814h;
        if (this.f41820f == f16) {
            f14 += f16;
        }
        if (this.f41821g == f17) {
            f15 -= f17;
        }
        if (f11 < f14) {
            fB = at.b.b(1.0f, BitmapDescriptorFactory.HUE_RED, f12, f14, f11);
            list = this.f41816b;
            fArr = this.f41818d;
        } else {
            if (f11 <= f15) {
                return this.f41815a;
            }
            fB = at.b.b(BitmapDescriptorFactory.HUE_RED, 1.0f, f15, f13, f11);
            list = this.f41817c;
            fArr = this.f41819e;
        }
        return z11 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    f l() {
        List<f> list = this.f41816b;
        return list.get(list.size() - 1);
    }
}
