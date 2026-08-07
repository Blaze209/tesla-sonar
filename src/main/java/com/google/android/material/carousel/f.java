package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f41794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f41795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f41796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41797d;

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f41798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f41799b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f41801d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f41802e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<c> f41800c = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f41803f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f41804g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f41805h = BitmapDescriptorFactory.HUE_RED;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f41806i = -1;

        b(float f11, float f12) {
            this.f41798a = f11;
            this.f41799b = f12;
        }

        private static float j(float f11, float f12, int i11, int i12) {
            return (f11 - (i11 * f12)) + (i12 * f12);
        }

        @NonNull
        b a(float f11, float f12, float f13) {
            return d(f11, f12, f13, false, true);
        }

        @NonNull
        b b(float f11, float f12, float f13) {
            return c(f11, f12, f13, false);
        }

        @NonNull
        b c(float f11, float f12, float f13, boolean z11) {
            return d(f11, f12, f13, z11, false);
        }

        @NonNull
        b d(float f11, float f12, float f13, boolean z11, boolean z12) {
            float fAbs;
            float f14 = f13 / 2.0f;
            float f15 = f11 - f14;
            float f16 = f14 + f11;
            float f17 = this.f41799b;
            if (f16 > f17) {
                fAbs = Math.abs(f16 - Math.max(f16 - f13, f17));
            } else {
                fAbs = BitmapDescriptorFactory.HUE_RED;
                if (f15 < BitmapDescriptorFactory.HUE_RED) {
                    fAbs = Math.abs(f15 - Math.min(f15 + f13, BitmapDescriptorFactory.HUE_RED));
                }
            }
            return e(f11, f12, f13, z11, z12, fAbs);
        }

        @NonNull
        b e(float f11, float f12, float f13, boolean z11, boolean z12, float f14) {
            return f(f11, f12, f13, z11, z12, f14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }

        @NonNull
        b f(float f11, float f12, float f13, boolean z11, boolean z12, float f14, float f15, float f16) {
            if (f13 <= BitmapDescriptorFactory.HUE_RED) {
                return this;
            }
            if (z12) {
                if (z11) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i11 = this.f41806i;
                if (i11 != -1 && i11 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f41806i = this.f41800c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f11, f12, f13, z12, f14, f15, f16);
            if (z11) {
                if (this.f41801d == null) {
                    this.f41801d = cVar;
                    this.f41803f = this.f41800c.size();
                }
                if (this.f41804g != -1 && this.f41800c.size() - this.f41804g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f13 != this.f41801d.f41810d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f41802e = cVar;
                this.f41804g = this.f41800c.size();
            } else {
                if (this.f41801d == null && cVar.f41810d < this.f41805h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f41802e != null && cVar.f41810d > this.f41805h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f41805h = cVar.f41810d;
            this.f41800c.add(cVar);
            return this;
        }

        @NonNull
        b g(float f11, float f12, float f13, int i11) {
            return h(f11, f12, f13, i11, false);
        }

        @NonNull
        b h(float f11, float f12, float f13, int i11, boolean z11) {
            if (i11 > 0 && f13 > BitmapDescriptorFactory.HUE_RED) {
                for (int i12 = 0; i12 < i11; i12++) {
                    c((i12 * f13) + f11, f12, f13, z11);
                }
            }
            return this;
        }

        @NonNull
        f i() {
            if (this.f41801d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f41800c.size(); i11++) {
                c cVar = this.f41800c.get(i11);
                arrayList.add(new c(j(this.f41801d.f41808b, this.f41798a, this.f41803f, i11), cVar.f41808b, cVar.f41809c, cVar.f41810d, cVar.f41811e, cVar.f41812f, cVar.f41813g, cVar.f41814h));
            }
            return new f(this.f41798a, arrayList, this.f41803f, this.f41804g);
        }
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f41807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f41808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f41809c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f41810d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f41811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f41812f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f41813g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f41814h;

        c(float f11, float f12, float f13, float f14) {
            this(f11, f12, f13, f14, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }

        static c a(c cVar, c cVar2, float f11) {
            return new c(at.b.a(cVar.f41807a, cVar2.f41807a, f11), at.b.a(cVar.f41808b, cVar2.f41808b, f11), at.b.a(cVar.f41809c, cVar2.f41809c, f11), at.b.a(cVar.f41810d, cVar2.f41810d, f11));
        }

        c(float f11, float f12, float f13, float f14, boolean z11, float f15, float f16, float f17) {
            this.f41807a = f11;
            this.f41808b = f12;
            this.f41809c = f13;
            this.f41810d = f14;
            this.f41811e = z11;
            this.f41812f = f15;
            this.f41813g = f16;
            this.f41814h = f17;
        }
    }

    static f m(f fVar, f fVar2, float f11) {
        if (fVar.f() != fVar2.f()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> listG = fVar.g();
        List<c> listG2 = fVar2.g();
        if (listG.size() != listG2.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < fVar.g().size(); i11++) {
            arrayList.add(c.a(listG.get(i11), listG2.get(i11), f11));
        }
        return new f(fVar.f(), arrayList, at.b.c(fVar.b(), fVar2.b(), f11), at.b.c(fVar.i(), fVar2.i(), f11));
    }

    static f n(f fVar, float f11) {
        b bVar = new b(fVar.f(), f11);
        float f12 = (f11 - fVar.j().f41808b) - (fVar.j().f41810d / 2.0f);
        int size = fVar.g().size() - 1;
        while (size >= 0) {
            c cVar = fVar.g().get(size);
            bVar.d((cVar.f41810d / 2.0f) + f12, cVar.f41809c, cVar.f41810d, size >= fVar.b() && size <= fVar.i(), cVar.f41811e);
            f12 += cVar.f41810d;
            size--;
        }
        return bVar.i();
    }

    c a() {
        return this.f41795b.get(this.f41796c);
    }

    int b() {
        return this.f41796c;
    }

    c c() {
        return this.f41795b.get(0);
    }

    c d() {
        for (int i11 = 0; i11 < this.f41795b.size(); i11++) {
            c cVar = this.f41795b.get(i11);
            if (!cVar.f41811e) {
                return cVar;
            }
        }
        return null;
    }

    List<c> e() {
        return this.f41795b.subList(this.f41796c, this.f41797d + 1);
    }

    float f() {
        return this.f41794a;
    }

    List<c> g() {
        return this.f41795b;
    }

    c h() {
        return this.f41795b.get(this.f41797d);
    }

    int i() {
        return this.f41797d;
    }

    c j() {
        List<c> list = this.f41795b;
        return list.get(list.size() - 1);
    }

    c k() {
        for (int size = this.f41795b.size() - 1; size >= 0; size--) {
            c cVar = this.f41795b.get(size);
            if (!cVar.f41811e) {
                return cVar;
            }
        }
        return null;
    }

    int l() {
        Iterator<c> it = this.f41795b.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().f41811e) {
                i11++;
            }
        }
        return this.f41795b.size() - i11;
    }

    private f(float f11, List<c> list, int i11, int i12) {
        this.f41794a = f11;
        this.f41795b = Collections.unmodifiableList(list);
        this.f41796c = i11;
        this.f41797d = i12;
    }
}
