package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<d> f13429a = new a();

    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f13432a - dVar2.f13432a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i11, int i12);

        public abstract boolean b(int i11, int i12);

        public Object c(int i11, int i12) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f13430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f13431b;

        c(int i11) {
            int[] iArr = new int[i11];
            this.f13430a = iArr;
            this.f13431b = iArr.length / 2;
        }

        int[] a() {
            return this.f13430a;
        }

        int b(int i11) {
            return this.f13430a[i11 + this.f13431b];
        }

        void c(int i11, int i12) {
            this.f13430a[i11 + this.f13431b] = i12;
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f13434c;

        d(int i11, int i12, int i13) {
            this.f13432a = i11;
            this.f13433b = i12;
            this.f13434c = i13;
        }

        int a() {
            return this.f13432a + this.f13434c;
        }

        int b() {
            return this.f13433b + this.f13434c;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<d> f13435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f13436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f13437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f13438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f13439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f13440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f13441g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z11) {
            this.f13435a = list;
            this.f13436b = iArr;
            this.f13437c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f13438d = bVar;
            this.f13439e = bVar.e();
            this.f13440f = bVar.d();
            this.f13441g = z11;
            a();
            e();
        }

        private void a() {
            d dVar = this.f13435a.isEmpty() ? null : this.f13435a.get(0);
            if (dVar == null || dVar.f13432a != 0 || dVar.f13433b != 0) {
                this.f13435a.add(0, new d(0, 0, 0));
            }
            this.f13435a.add(new d(this.f13439e, this.f13440f, 0));
        }

        private void d(int i11) {
            int size = this.f13435a.size();
            int iB = 0;
            for (int i12 = 0; i12 < size; i12++) {
                d dVar = this.f13435a.get(i12);
                while (iB < dVar.f13433b) {
                    if (this.f13437c[iB] == 0 && this.f13438d.b(i11, iB)) {
                        int i13 = this.f13438d.a(i11, iB) ? 8 : 4;
                        this.f13436b[i11] = (iB << 4) | i13;
                        this.f13437c[iB] = (i11 << 4) | i13;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        private void e() {
            for (d dVar : this.f13435a) {
                for (int i11 = 0; i11 < dVar.f13434c; i11++) {
                    int i12 = dVar.f13432a + i11;
                    int i13 = dVar.f13433b + i11;
                    int i14 = this.f13438d.a(i12, i13) ? 1 : 2;
                    this.f13436b[i12] = (i13 << 4) | i14;
                    this.f13437c[i13] = (i12 << 4) | i14;
                }
            }
            if (this.f13441g) {
                f();
            }
        }

        private void f() {
            int iA = 0;
            for (d dVar : this.f13435a) {
                while (iA < dVar.f13432a) {
                    if (this.f13436b[iA] == 0) {
                        d(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }

        private static g g(Collection<g> collection, int i11, boolean z11) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f13442a == i11 && next.f13444c == z11) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z11) {
                    next2.f13443b--;
                } else {
                    next2.f13443b++;
                }
            }
            return next;
        }

        public void b(@NonNull r rVar) {
            int i11;
            androidx.recyclerview.widget.e eVar = rVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) rVar : new androidx.recyclerview.widget.e(rVar);
            int i12 = this.f13439e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i13 = this.f13439e;
            int i14 = this.f13440f;
            for (int size = this.f13435a.size() - 1; size >= 0; size--) {
                d dVar = this.f13435a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i13 <= iA) {
                        break;
                    }
                    i13--;
                    int i15 = this.f13436b[i13];
                    if ((i15 & 12) != 0) {
                        int i16 = i15 >> 4;
                        g gVarG = g(arrayDeque, i16, false);
                        if (gVarG != null) {
                            int i17 = (i12 - gVarG.f13443b) - 1;
                            eVar.d(i13, i17);
                            if ((i15 & 4) != 0) {
                                eVar.a(i17, 1, this.f13438d.c(i13, i16));
                            }
                        } else {
                            arrayDeque.add(new g(i13, (i12 - i13) - 1, true));
                        }
                    } else {
                        eVar.c(i13, 1);
                        i12--;
                    }
                }
                while (i14 > iB) {
                    i14--;
                    int i18 = this.f13437c[i14];
                    if ((i18 & 12) != 0) {
                        int i19 = i18 >> 4;
                        g gVarG2 = g(arrayDeque, i19, true);
                        if (gVarG2 == null) {
                            arrayDeque.add(new g(i14, i12 - i13, false));
                        } else {
                            eVar.d((i12 - gVarG2.f13443b) - 1, i13);
                            if ((i18 & 4) != 0) {
                                eVar.a(i13, 1, this.f13438d.c(i19, i14));
                            }
                        }
                    } else {
                        eVar.b(i13, 1);
                        i12++;
                    }
                }
                int i21 = dVar.f13432a;
                int i22 = dVar.f13433b;
                for (i11 = 0; i11 < dVar.f13434c; i11++) {
                    if ((this.f13436b[i21] & 15) == 2) {
                        eVar.a(i21, 1, this.f13438d.c(i21, i22));
                    }
                    i21++;
                    i22++;
                }
                i13 = dVar.f13432a;
                i14 = dVar.f13433b;
            }
            eVar.e();
        }

        public void c(@NonNull RecyclerView.h hVar) {
            b(new androidx.recyclerview.widget.b(hVar));
        }
    }

    public static abstract class f<T> {
        public abstract boolean areContentsTheSame(@NonNull T t11, @NonNull T t12);

        public abstract boolean areItemsTheSame(@NonNull T t11, @NonNull T t12);

        public Object getChangePayload(@NonNull T t11, @NonNull T t12) {
            return null;
        }
    }

    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f13444c;

        g(int i11, int i12, boolean z11) {
            this.f13442a = i11;
            this.f13443b = i12;
            this.f13444c = z11;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    static class C0221h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13446b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13447c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13448d;

        public C0221h() {
        }

        int a() {
            return this.f13448d - this.f13447c;
        }

        int b() {
            return this.f13446b - this.f13445a;
        }

        public C0221h(int i11, int i12, int i13, int i14) {
            this.f13445a = i11;
            this.f13446b = i12;
            this.f13447c = i13;
            this.f13448d = i14;
        }
    }

    static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13450b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13452d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f13453e;

        i() {
        }

        int a() {
            return Math.min(this.f13451c - this.f13449a, this.f13452d - this.f13450b);
        }

        boolean b() {
            return this.f13452d - this.f13450b != this.f13451c - this.f13449a;
        }

        boolean c() {
            return this.f13452d - this.f13450b > this.f13451c - this.f13449a;
        }

        @NonNull
        d d() {
            if (!b()) {
                int i11 = this.f13449a;
                return new d(i11, this.f13450b, this.f13451c - i11);
            }
            if (this.f13453e) {
                return new d(this.f13449a, this.f13450b, a());
            }
            return c() ? new d(this.f13449a, this.f13450b + 1, a()) : new d(this.f13449a + 1, this.f13450b, a());
        }
    }

    private static i a(C0221h c0221h, b bVar, c cVar, c cVar2, int i11) {
        int iB;
        int i12;
        int i13;
        boolean z11 = (c0221h.b() - c0221h.a()) % 2 == 0;
        int iB2 = c0221h.b() - c0221h.a();
        int i14 = -i11;
        for (int i15 = i14; i15 <= i11; i15 += 2) {
            if (i15 == i14 || (i15 != i11 && cVar2.b(i15 + 1) < cVar2.b(i15 - 1))) {
                iB = cVar2.b(i15 + 1);
                i12 = iB;
            } else {
                iB = cVar2.b(i15 - 1);
                i12 = iB - 1;
            }
            int i16 = c0221h.f13448d - ((c0221h.f13446b - i12) - i15);
            int i17 = (i11 == 0 || i12 != iB) ? i16 : i16 + 1;
            while (i12 > c0221h.f13445a && i16 > c0221h.f13447c && bVar.b(i12 - 1, i16 - 1)) {
                i12--;
                i16--;
            }
            cVar2.c(i15, i12);
            if (z11 && (i13 = iB2 - i15) >= i14 && i13 <= i11 && cVar.b(i13) >= i12) {
                i iVar = new i();
                iVar.f13449a = i12;
                iVar.f13450b = i16;
                iVar.f13451c = iB;
                iVar.f13452d = i17;
                iVar.f13453e = true;
                return iVar;
            }
        }
        return null;
    }

    @NonNull
    public static e b(@NonNull b bVar) {
        return c(bVar, true);
    }

    @NonNull
    public static e c(@NonNull b bVar, boolean z11) {
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0221h(0, iE, 0, iD));
        int i11 = ((((iE + iD) + 1) / 2) * 2) + 1;
        c cVar = new c(i11);
        c cVar2 = new c(i11);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0221h c0221h = (C0221h) arrayList2.remove(arrayList2.size() - 1);
            i iVarE = e(c0221h, bVar, cVar, cVar2);
            if (iVarE != null) {
                if (iVarE.a() > 0) {
                    arrayList.add(iVarE.d());
                }
                C0221h c0221h2 = arrayList3.isEmpty() ? new C0221h() : (C0221h) arrayList3.remove(arrayList3.size() - 1);
                c0221h2.f13445a = c0221h.f13445a;
                c0221h2.f13447c = c0221h.f13447c;
                c0221h2.f13446b = iVarE.f13449a;
                c0221h2.f13448d = iVarE.f13450b;
                arrayList2.add(c0221h2);
                c0221h.f13446b = c0221h.f13446b;
                c0221h.f13448d = c0221h.f13448d;
                c0221h.f13445a = iVarE.f13451c;
                c0221h.f13447c = iVarE.f13452d;
                arrayList2.add(c0221h);
            } else {
                arrayList3.add(c0221h);
            }
        }
        Collections.sort(arrayList, f13429a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z11);
    }

    private static i d(C0221h c0221h, b bVar, c cVar, c cVar2, int i11) {
        int iB;
        int i12;
        int i13;
        boolean z11 = Math.abs(c0221h.b() - c0221h.a()) % 2 == 1;
        int iB2 = c0221h.b() - c0221h.a();
        int i14 = -i11;
        for (int i15 = i14; i15 <= i11; i15 += 2) {
            if (i15 == i14 || (i15 != i11 && cVar.b(i15 + 1) > cVar.b(i15 - 1))) {
                iB = cVar.b(i15 + 1);
                i12 = iB;
            } else {
                iB = cVar.b(i15 - 1);
                i12 = iB + 1;
            }
            int i16 = (c0221h.f13447c + (i12 - c0221h.f13445a)) - i15;
            int i17 = (i11 == 0 || i12 != iB) ? i16 : i16 - 1;
            while (i12 < c0221h.f13446b && i16 < c0221h.f13448d && bVar.b(i12, i16)) {
                i12++;
                i16++;
            }
            cVar.c(i15, i12);
            if (z11 && (i13 = iB2 - i15) >= i14 + 1 && i13 <= i11 - 1 && cVar2.b(i13) <= i12) {
                i iVar = new i();
                iVar.f13449a = iB;
                iVar.f13450b = i17;
                iVar.f13451c = i12;
                iVar.f13452d = i16;
                iVar.f13453e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(C0221h c0221h, b bVar, c cVar, c cVar2) {
        if (c0221h.b() >= 1 && c0221h.a() >= 1) {
            int iB = ((c0221h.b() + c0221h.a()) + 1) / 2;
            cVar.c(1, c0221h.f13445a);
            cVar2.c(1, c0221h.f13446b);
            for (int i11 = 0; i11 < iB; i11++) {
                i iVarD = d(c0221h, bVar, cVar, cVar2, i11);
                if (iVarD != null) {
                    return iVarD;
                }
                i iVarA = a(c0221h, bVar, cVar, cVar2, i11);
                if (iVarA != null) {
                    return iVarA;
                }
            }
        }
        return null;
    }
}
