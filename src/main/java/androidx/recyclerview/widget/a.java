package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class a implements s.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u5.f<b> f13334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<b> f13335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<b> f13336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0218a f13337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f13338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f13339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final s f13340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f13341h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0218a {
        void a(int i11, int i12);

        void b(b bVar);

        void c(b bVar);

        RecyclerView.g0 d(int i11);

        void e(int i11, int i12);

        void f(int i11, int i12);

        void g(int i11, int i12);

        void h(int i11, int i12, Object obj);
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f13343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f13344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13345d;

        b(int i11, int i12, int i13, Object obj) {
            this.f13342a = i11;
            this.f13343b = i12;
            this.f13345d = i13;
            this.f13344c = obj;
        }

        String a() {
            int i11 = this.f13342a;
            if (i11 == 1) {
                return "add";
            }
            if (i11 == 2) {
                return "rm";
            }
            if (i11 != 4) {
                return i11 != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i11 = this.f13342a;
            if (i11 != bVar.f13342a) {
                return false;
            }
            if (i11 == 8 && Math.abs(this.f13345d - this.f13343b) == 1 && this.f13345d == bVar.f13343b && this.f13343b == bVar.f13345d) {
                return true;
            }
            if (this.f13345d != bVar.f13345d || this.f13343b != bVar.f13343b) {
                return false;
            }
            Object obj2 = this.f13344c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f13344c)) {
                    return false;
                }
            } else if (bVar.f13344c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f13342a * 31) + this.f13343b) * 31) + this.f13345d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f13343b + "c:" + this.f13345d + ",p:" + this.f13344c + "]";
        }
    }

    a(InterfaceC0218a interfaceC0218a) {
        this(interfaceC0218a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z11;
        byte b11;
        int i11 = bVar.f13343b;
        int i12 = bVar.f13345d + i11;
        byte b12 = -1;
        int i13 = i11;
        int i14 = 0;
        while (i13 < i12) {
            if (this.f13337d.d(i13) != null || h(i13)) {
                if (b12 == 0) {
                    k(a(2, i11, i14, null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                b11 = 1;
            } else {
                if (b12 == 1) {
                    v(a(2, i11, i14, null));
                    z11 = true;
                } else {
                    z11 = false;
                }
                b11 = 0;
            }
            if (z11) {
                i13 -= i14;
                i12 -= i14;
                i14 = 1;
            } else {
                i14++;
            }
            i13++;
            b12 = b11;
        }
        if (i14 != bVar.f13345d) {
            b(bVar);
            bVar = a(2, i11, i14, null);
        }
        if (b12 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i11 = bVar.f13343b;
        int i12 = bVar.f13345d + i11;
        int i13 = 0;
        byte b11 = -1;
        int i14 = i11;
        while (i11 < i12) {
            if (this.f13337d.d(i11) != null || h(i11)) {
                if (b11 == 0) {
                    k(a(4, i14, i13, bVar.f13344c));
                    i14 = i11;
                    i13 = 0;
                }
                b11 = 1;
            } else {
                if (b11 == 1) {
                    v(a(4, i14, i13, bVar.f13344c));
                    i14 = i11;
                    i13 = 0;
                }
                b11 = 0;
            }
            i13++;
            i11++;
        }
        if (i13 != bVar.f13345d) {
            Object obj = bVar.f13344c;
            b(bVar);
            bVar = a(4, i14, i13, obj);
        }
        if (b11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i11) {
        int size = this.f13336c.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.f13336c.get(i12);
            int i13 = bVar.f13342a;
            if (i13 == 8) {
                if (n(bVar.f13345d, i12 + 1) == i11) {
                    return true;
                }
            } else if (i13 == 1) {
                int i14 = bVar.f13343b;
                int i15 = bVar.f13345d + i14;
                while (i14 < i15) {
                    if (n(i14, i12 + 1) == i11) {
                        return true;
                    }
                    i14++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i11;
        int i12 = bVar.f13342a;
        if (i12 == 1 || i12 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f13343b, i12);
        int i13 = bVar.f13343b;
        int i14 = bVar.f13342a;
        if (i14 == 2) {
            i11 = 0;
        } else {
            if (i14 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i11 = 1;
        }
        int i15 = 1;
        for (int i16 = 1; i16 < bVar.f13345d; i16++) {
            int iZ2 = z(bVar.f13343b + (i11 * i16), bVar.f13342a);
            int i17 = bVar.f13342a;
            if (i17 == 2 ? iZ2 != iZ : !(i17 == 4 && iZ2 == iZ + 1)) {
                b bVarA = a(i17, iZ, i15, bVar.f13344c);
                l(bVarA, i13);
                b(bVarA);
                if (bVar.f13342a == 4) {
                    i13 += i15;
                }
                i15 = 1;
                iZ = iZ2;
            } else {
                i15++;
            }
        }
        Object obj = bVar.f13344c;
        b(bVar);
        if (i15 > 0) {
            b bVarA2 = a(bVar.f13342a, iZ, i15, obj);
            l(bVarA2, i13);
            b(bVarA2);
        }
    }

    private void v(b bVar) {
        this.f13336c.add(bVar);
        int i11 = bVar.f13342a;
        if (i11 == 1) {
            this.f13337d.e(bVar.f13343b, bVar.f13345d);
            return;
        }
        if (i11 == 2) {
            this.f13337d.g(bVar.f13343b, bVar.f13345d);
            return;
        }
        if (i11 == 4) {
            this.f13337d.h(bVar.f13343b, bVar.f13345d, bVar.f13344c);
        } else {
            if (i11 == 8) {
                this.f13337d.a(bVar.f13343b, bVar.f13345d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i11, int i12) {
        int i13;
        int i14;
        for (int size = this.f13336c.size() - 1; size >= 0; size--) {
            b bVar = this.f13336c.get(size);
            int i15 = bVar.f13342a;
            if (i15 == 8) {
                int i16 = bVar.f13343b;
                int i17 = bVar.f13345d;
                if (i16 < i17) {
                    i14 = i16;
                    i13 = i17;
                } else {
                    i13 = i16;
                    i14 = i17;
                }
                if (i11 < i14 || i11 > i13) {
                    if (i11 < i16) {
                        if (i12 == 1) {
                            bVar.f13343b = i16 + 1;
                            bVar.f13345d = i17 + 1;
                        } else if (i12 == 2) {
                            bVar.f13343b = i16 - 1;
                            bVar.f13345d = i17 - 1;
                        }
                    }
                } else if (i14 == i16) {
                    if (i12 == 1) {
                        bVar.f13345d = i17 + 1;
                    } else if (i12 == 2) {
                        bVar.f13345d = i17 - 1;
                    }
                    i11++;
                } else {
                    if (i12 == 1) {
                        bVar.f13343b = i16 + 1;
                    } else if (i12 == 2) {
                        bVar.f13343b = i16 - 1;
                    }
                    i11--;
                }
            } else {
                int i18 = bVar.f13343b;
                if (i18 <= i11) {
                    if (i15 == 1) {
                        i11 -= bVar.f13345d;
                    } else if (i15 == 2) {
                        i11 += bVar.f13345d;
                    }
                } else if (i12 == 1) {
                    bVar.f13343b = i18 + 1;
                } else if (i12 == 2) {
                    bVar.f13343b = i18 - 1;
                }
            }
        }
        for (int size2 = this.f13336c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f13336c.get(size2);
            if (bVar2.f13342a == 8) {
                int i19 = bVar2.f13345d;
                if (i19 == bVar2.f13343b || i19 < 0) {
                    this.f13336c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f13345d <= 0) {
                this.f13336c.remove(size2);
                b(bVar2);
            }
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.s.a
    public b a(int i11, int i12, int i13, Object obj) {
        b bVarB = this.f13334a.b();
        if (bVarB == null) {
            return new b(i11, i12, i13, obj);
        }
        bVarB.f13342a = i11;
        bVarB.f13343b = i12;
        bVarB.f13345d = i13;
        bVarB.f13344c = obj;
        return bVarB;
    }

    @Override // androidx.recyclerview.widget.s.a
    public void b(b bVar) {
        if (this.f13339f) {
            return;
        }
        bVar.f13344c = null;
        this.f13334a.a(bVar);
    }

    public int e(int i11) {
        int size = this.f13335b.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = this.f13335b.get(i12);
            int i13 = bVar.f13342a;
            if (i13 != 1) {
                if (i13 == 2) {
                    int i14 = bVar.f13343b;
                    if (i14 <= i11) {
                        int i15 = bVar.f13345d;
                        if (i14 + i15 > i11) {
                            return -1;
                        }
                        i11 -= i15;
                    } else {
                        continue;
                    }
                } else if (i13 == 8) {
                    int i16 = bVar.f13343b;
                    if (i16 == i11) {
                        i11 = bVar.f13345d;
                    } else {
                        if (i16 < i11) {
                            i11--;
                        }
                        if (bVar.f13345d <= i11) {
                            i11++;
                        }
                    }
                }
            } else if (bVar.f13343b <= i11) {
                i11 += bVar.f13345d;
            }
        }
        return i11;
    }

    void i() {
        int size = this.f13336c.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f13337d.c(this.f13336c.get(i11));
        }
        x(this.f13336c);
        this.f13341h = 0;
    }

    void j() {
        i();
        int size = this.f13335b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f13335b.get(i11);
            int i12 = bVar.f13342a;
            if (i12 == 1) {
                this.f13337d.c(bVar);
                this.f13337d.e(bVar.f13343b, bVar.f13345d);
            } else if (i12 == 2) {
                this.f13337d.c(bVar);
                this.f13337d.f(bVar.f13343b, bVar.f13345d);
            } else if (i12 == 4) {
                this.f13337d.c(bVar);
                this.f13337d.h(bVar.f13343b, bVar.f13345d, bVar.f13344c);
            } else if (i12 == 8) {
                this.f13337d.c(bVar);
                this.f13337d.a(bVar.f13343b, bVar.f13345d);
            }
            Runnable runnable = this.f13338e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f13335b);
        this.f13341h = 0;
    }

    void l(b bVar, int i11) {
        this.f13337d.b(bVar);
        int i12 = bVar.f13342a;
        if (i12 == 2) {
            this.f13337d.f(i11, bVar.f13345d);
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f13337d.h(i11, bVar.f13345d, bVar.f13344c);
        }
    }

    int m(int i11) {
        return n(i11, 0);
    }

    int n(int i11, int i12) {
        int size = this.f13336c.size();
        while (i12 < size) {
            b bVar = this.f13336c.get(i12);
            int i13 = bVar.f13342a;
            if (i13 == 8) {
                int i14 = bVar.f13343b;
                if (i14 == i11) {
                    i11 = bVar.f13345d;
                } else {
                    if (i14 < i11) {
                        i11--;
                    }
                    if (bVar.f13345d <= i11) {
                        i11++;
                    }
                }
            } else {
                int i15 = bVar.f13343b;
                if (i15 > i11) {
                    continue;
                } else if (i13 == 2) {
                    int i16 = bVar.f13345d;
                    if (i11 < i15 + i16) {
                        return -1;
                    }
                    i11 -= i16;
                } else if (i13 == 1) {
                    i11 += bVar.f13345d;
                }
            }
            i12++;
        }
        return i11;
    }

    boolean o(int i11) {
        return (i11 & this.f13341h) != 0;
    }

    boolean p() {
        return this.f13335b.size() > 0;
    }

    boolean q() {
        return (this.f13336c.isEmpty() || this.f13335b.isEmpty()) ? false : true;
    }

    boolean r(int i11, int i12, Object obj) {
        if (i12 < 1) {
            return false;
        }
        this.f13335b.add(a(4, i11, i12, obj));
        this.f13341h |= 4;
        return this.f13335b.size() == 1;
    }

    boolean s(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        this.f13335b.add(a(1, i11, i12, null));
        this.f13341h |= 1;
        return this.f13335b.size() == 1;
    }

    boolean t(int i11, int i12, int i13) {
        if (i11 == i12) {
            return false;
        }
        if (i13 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f13335b.add(a(8, i11, i12, null));
        this.f13341h |= 8;
        return this.f13335b.size() == 1;
    }

    boolean u(int i11, int i12) {
        if (i12 < 1) {
            return false;
        }
        this.f13335b.add(a(2, i11, i12, null));
        this.f13341h |= 2;
        return this.f13335b.size() == 1;
    }

    void w() {
        this.f13340g.b(this.f13335b);
        int size = this.f13335b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f13335b.get(i11);
            int i12 = bVar.f13342a;
            if (i12 == 1) {
                c(bVar);
            } else if (i12 == 2) {
                f(bVar);
            } else if (i12 == 4) {
                g(bVar);
            } else if (i12 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f13338e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f13335b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            b(list.get(i11));
        }
        list.clear();
    }

    void y() {
        x(this.f13335b);
        x(this.f13336c);
        this.f13341h = 0;
    }

    a(InterfaceC0218a interfaceC0218a, boolean z11) {
        this.f13334a = new Pools$SimplePool(30);
        this.f13335b = new ArrayList<>();
        this.f13336c = new ArrayList<>();
        this.f13341h = 0;
        this.f13337d = interfaceC0218a;
        this.f13339f = z11;
        this.f13340g = new s(this);
    }
}
