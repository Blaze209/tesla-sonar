package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f13579a;

    interface a {
        androidx.recyclerview.widget.a.b a(int i11, int i12, int i13, Object obj);

        void b(androidx.recyclerview.widget.a.b bVar);
    }

    s(a aVar) {
        this.f13579a = aVar;
    }

    private int a(List<androidx.recyclerview.widget.a.b> list) {
        boolean z11 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f13342a != 8) {
                z11 = true;
            } else if (z11) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<androidx.recyclerview.widget.a.b> list, int i11, androidx.recyclerview.widget.a.b bVar, int i12, androidx.recyclerview.widget.a.b bVar2) {
        int i13 = bVar.f13345d;
        int i14 = bVar2.f13343b;
        int i15 = i13 < i14 ? -1 : 0;
        int i16 = bVar.f13343b;
        if (i16 < i14) {
            i15++;
        }
        if (i14 <= i16) {
            bVar.f13343b = i16 + bVar2.f13345d;
        }
        int i17 = bVar2.f13343b;
        if (i17 <= i13) {
            bVar.f13345d = i13 + bVar2.f13345d;
        }
        bVar2.f13343b = i17 + i15;
        list.set(i11, bVar2);
        list.set(i12, bVar);
    }

    private void d(List<androidx.recyclerview.widget.a.b> list, int i11, int i12) {
        androidx.recyclerview.widget.a.b bVar = list.get(i11);
        androidx.recyclerview.widget.a.b bVar2 = list.get(i12);
        int i13 = bVar2.f13342a;
        if (i13 == 1) {
            c(list, i11, bVar, i12, bVar2);
        } else if (i13 == 2) {
            e(list, i11, bVar, i12, bVar2);
        } else {
            if (i13 != 4) {
                return;
            }
            f(list, i11, bVar, i12, bVar2);
        }
    }

    void b(List<androidx.recyclerview.widget.a.b> list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    void e(List<androidx.recyclerview.widget.a.b> list, int i11, androidx.recyclerview.widget.a.b bVar, int i12, androidx.recyclerview.widget.a.b bVar2) {
        boolean z11;
        int i13 = bVar.f13343b;
        int i14 = bVar.f13345d;
        boolean z12 = false;
        if (i13 < i14) {
            if (bVar2.f13343b == i13 && bVar2.f13345d == i14 - i13) {
                z11 = false;
                z12 = true;
            } else {
                z11 = false;
            }
        } else if (bVar2.f13343b == i14 + 1 && bVar2.f13345d == i13 - i14) {
            z11 = true;
            z12 = true;
        } else {
            z11 = true;
        }
        int i15 = bVar2.f13343b;
        if (i14 < i15) {
            bVar2.f13343b = i15 - 1;
        } else {
            int i16 = bVar2.f13345d;
            if (i14 < i15 + i16) {
                bVar2.f13345d = i16 - 1;
                bVar.f13342a = 2;
                bVar.f13345d = 1;
                if (bVar2.f13345d == 0) {
                    list.remove(i12);
                    this.f13579a.b(bVar2);
                    return;
                }
                return;
            }
        }
        int i17 = bVar.f13343b;
        int i18 = bVar2.f13343b;
        androidx.recyclerview.widget.a.b bVarA = null;
        if (i17 <= i18) {
            bVar2.f13343b = i18 + 1;
        } else {
            int i19 = bVar2.f13345d;
            if (i17 < i18 + i19) {
                bVarA = this.f13579a.a(2, i17 + 1, (i18 + i19) - i17, null);
                bVar2.f13345d = bVar.f13343b - bVar2.f13343b;
            }
        }
        if (z12) {
            list.set(i11, bVar2);
            list.remove(i12);
            this.f13579a.b(bVar);
            return;
        }
        if (z11) {
            if (bVarA != null) {
                int i21 = bVar.f13343b;
                if (i21 > bVarA.f13343b) {
                    bVar.f13343b = i21 - bVarA.f13345d;
                }
                int i22 = bVar.f13345d;
                if (i22 > bVarA.f13343b) {
                    bVar.f13345d = i22 - bVarA.f13345d;
                }
            }
            int i23 = bVar.f13343b;
            if (i23 > bVar2.f13343b) {
                bVar.f13343b = i23 - bVar2.f13345d;
            }
            int i24 = bVar.f13345d;
            if (i24 > bVar2.f13343b) {
                bVar.f13345d = i24 - bVar2.f13345d;
            }
        } else {
            if (bVarA != null) {
                int i25 = bVar.f13343b;
                if (i25 >= bVarA.f13343b) {
                    bVar.f13343b = i25 - bVarA.f13345d;
                }
                int i26 = bVar.f13345d;
                if (i26 >= bVarA.f13343b) {
                    bVar.f13345d = i26 - bVarA.f13345d;
                }
            }
            int i27 = bVar.f13343b;
            if (i27 >= bVar2.f13343b) {
                bVar.f13343b = i27 - bVar2.f13345d;
            }
            int i28 = bVar.f13345d;
            if (i28 >= bVar2.f13343b) {
                bVar.f13345d = i28 - bVar2.f13345d;
            }
        }
        list.set(i11, bVar2);
        if (bVar.f13343b != bVar.f13345d) {
            list.set(i12, bVar);
        } else {
            list.remove(i12);
        }
        if (bVarA != null) {
            list.add(i11, bVarA);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    void f(List<androidx.recyclerview.widget.a.b> list, int i11, androidx.recyclerview.widget.a.b bVar, int i12, androidx.recyclerview.widget.a.b bVar2) {
        androidx.recyclerview.widget.a.b bVarA;
        int i13;
        int i14;
        int i15;
        int i16 = bVar.f13345d;
        int i17 = bVar2.f13343b;
        androidx.recyclerview.widget.a.b bVarA2 = null;
        if (i16 >= i17) {
            int i18 = bVar2.f13345d;
            if (i16 < i17 + i18) {
                bVar2.f13345d = i18 - 1;
                bVarA = this.f13579a.a(4, bVar.f13343b, 1, bVar2.f13344c);
            }
            i13 = bVar.f13343b;
            i14 = bVar2.f13343b;
            if (i13 <= i14) {
                bVar2.f13343b = i14 + 1;
            } else {
                i15 = bVar2.f13345d;
                if (i13 < i14 + i15) {
                    int i19 = (i14 + i15) - i13;
                    bVarA2 = this.f13579a.a(4, i13 + 1, i19, bVar2.f13344c);
                    bVar2.f13345d -= i19;
                }
            }
            list.set(i12, bVar);
            if (bVar2.f13345d > 0) {
                list.set(i11, bVar2);
            } else {
                list.remove(i11);
                this.f13579a.b(bVar2);
            }
            if (bVarA != null) {
                list.add(i11, bVarA);
            }
            if (bVarA2 != null) {
                list.add(i11, bVarA2);
            }
        }
        bVar2.f13343b = i17 - 1;
        bVarA = null;
        i13 = bVar.f13343b;
        i14 = bVar2.f13343b;
        if (i13 <= i14) {
            bVar2.f13343b = i14 + 1;
        } else {
            i15 = bVar2.f13345d;
            if (i13 < i14 + i15) {
                int i110 = (i14 + i15) - i13;
                bVarA2 = this.f13579a.a(4, i13 + 1, i110, bVar2.f13344c);
                bVar2.f13345d -= i110;
            }
        }
        list.set(i12, bVar);
        if (bVar2.f13345d > 0) {
            list.set(i11, bVar2);
        } else {
            list.remove(i11);
            this.f13579a.b(bVar2);
        }
        if (bVarA != null) {
            list.add(i11, bVarA);
        }
        if (bVarA2 != null) {
            list.add(i11, bVarA2);
        }
    }
}
