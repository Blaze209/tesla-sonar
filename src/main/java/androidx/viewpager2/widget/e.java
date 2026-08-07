package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class e extends RecyclerView.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f.i f14372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final f f14373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final RecyclerView f14374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final LinearLayoutManager f14375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f14377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f14378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f14379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f14380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f14381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f14382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f14383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f14384m;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f14386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14387c;

        a() {
        }

        void a() {
            this.f14385a = -1;
            this.f14386b = BitmapDescriptorFactory.HUE_RED;
            this.f14387c = 0;
        }
    }

    e(@NonNull f fVar) {
        this.f14373b = fVar;
        RecyclerView recyclerView = fVar.f14398j;
        this.f14374c = recyclerView;
        this.f14375d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f14378g = new a();
        l();
    }

    private void a(int i11, float f11, int i12) {
        f.i iVar = this.f14372a;
        if (iVar != null) {
            iVar.b(i11, f11, i12);
        }
    }

    private void b(int i11) {
        f.i iVar = this.f14372a;
        if (iVar != null) {
            iVar.c(i11);
        }
    }

    private void c(int i11) {
        if ((this.f14376e == 3 && this.f14377f == 0) || this.f14377f == i11) {
            return;
        }
        this.f14377f = i11;
        f.i iVar = this.f14372a;
        if (iVar != null) {
            iVar.a(i11);
        }
    }

    private int d() {
        return this.f14375d.e2();
    }

    private boolean i() {
        int i11 = this.f14376e;
        return i11 == 1 || i11 == 4;
    }

    private void l() {
        this.f14376e = 0;
        this.f14377f = 0;
        this.f14378g.a();
        this.f14379h = -1;
        this.f14380i = -1;
        this.f14381j = false;
        this.f14382k = false;
        this.f14384m = false;
        this.f14383l = false;
    }

    private void n(boolean z11) {
        this.f14384m = z11;
        this.f14376e = z11 ? 4 : 1;
        int i11 = this.f14380i;
        if (i11 != -1) {
            this.f14379h = i11;
            this.f14380i = -1;
        } else if (this.f14379h == -1) {
            this.f14379h = d();
        }
        c(1);
    }

    private void o() {
        int top;
        a aVar = this.f14378g;
        int iE2 = this.f14375d.e2();
        aVar.f14385a = iE2;
        if (iE2 == -1) {
            aVar.a();
            return;
        }
        View viewI = this.f14375d.I(iE2);
        if (viewI == null) {
            aVar.a();
            return;
        }
        int iF0 = this.f14375d.f0(viewI);
        int iO0 = this.f14375d.o0(viewI);
        int iR0 = this.f14375d.r0(viewI);
        int iN = this.f14375d.N(viewI);
        ViewGroup.LayoutParams layoutParams = viewI.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iF0 += marginLayoutParams.leftMargin;
            iO0 += marginLayoutParams.rightMargin;
            iR0 += marginLayoutParams.topMargin;
            iN += marginLayoutParams.bottomMargin;
        }
        int height = viewI.getHeight() + iR0 + iN;
        int width = viewI.getWidth() + iF0 + iO0;
        if (this.f14375d.r2() == 0) {
            top = (viewI.getLeft() - iF0) - this.f14374c.getPaddingLeft();
            if (this.f14373b.d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewI.getTop() - iR0) - this.f14374c.getPaddingTop();
        }
        int i11 = -top;
        aVar.f14387c = i11;
        if (i11 >= 0) {
            aVar.f14386b = height == 0 ? BitmapDescriptorFactory.HUE_RED : i11 / height;
        } else {
            if (!new androidx.viewpager2.widget.a(this.f14375d).d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f14387c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    double e() {
        o();
        a aVar = this.f14378g;
        return ((double) aVar.f14385a) + ((double) aVar.f14386b);
    }

    int f() {
        return this.f14377f;
    }

    boolean g() {
        return this.f14384m;
    }

    boolean h() {
        return this.f14377f == 0;
    }

    void j() {
        this.f14383l = true;
    }

    void k(int i11, boolean z11) {
        this.f14376e = z11 ? 2 : 3;
        this.f14384m = false;
        boolean z12 = this.f14380i != i11;
        this.f14380i = i11;
        c(2);
        if (z12) {
            b(i11);
        }
    }

    void m(f.i iVar) {
        this.f14372a = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i11) {
        if (!(this.f14376e == 1 && this.f14377f == 1) && i11 == 1) {
            n(false);
            return;
        }
        if (i() && i11 == 2) {
            if (this.f14382k) {
                c(2);
                this.f14381j = true;
                return;
            }
            return;
        }
        if (i() && i11 == 0) {
            o();
            if (this.f14382k) {
                a aVar = this.f14378g;
                if (aVar.f14387c == 0) {
                    int i12 = this.f14379h;
                    int i13 = aVar.f14385a;
                    if (i12 != i13) {
                        b(i13);
                    }
                }
            } else {
                int i14 = this.f14378g.f14385a;
                if (i14 != -1) {
                    a(i14, BitmapDescriptorFactory.HUE_RED, 0);
                }
            }
            c(0);
            l();
        }
        if (this.f14376e == 2 && i11 == 0 && this.f14383l) {
            o();
            a aVar2 = this.f14378g;
            if (aVar2.f14387c == 0) {
                int i15 = this.f14380i;
                int i16 = aVar2.f14385a;
                if (i15 != i16) {
                    if (i16 == -1) {
                        i16 = 0;
                    }
                    b(i16);
                }
                c(0);
                l();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:14:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.v
    public void onScrolled(@NonNull RecyclerView recyclerView, int i11, int i12) {
        a aVar;
        int i13;
        this.f14382k = true;
        o();
        if (this.f14381j) {
            this.f14381j = false;
            if (i12 > 0) {
                aVar = this.f14378g;
                if (aVar.f14387c != 0) {
                    i13 = aVar.f14385a + 1;
                } else {
                    i13 = this.f14378g.f14385a;
                }
            } else {
                if (i12 == 0) {
                    if ((i11 < 0) == this.f14373b.d()) {
                        aVar = this.f14378g;
                        if (aVar.f14387c != 0) {
                            i13 = aVar.f14385a + 1;
                        }
                    }
                }
                i13 = this.f14378g.f14385a;
            }
            this.f14380i = i13;
            if (this.f14379h != i13) {
                b(i13);
            }
        } else if (this.f14376e == 0) {
            int i14 = this.f14378g.f14385a;
            if (i14 == -1) {
                i14 = 0;
            }
            b(i14);
        }
        a aVar2 = this.f14378g;
        int i15 = aVar2.f14385a;
        if (i15 == -1) {
            i15 = 0;
        }
        a(i15, aVar2.f14386b, aVar2.f14387c);
        a aVar3 = this.f14378g;
        int i16 = aVar3.f14385a;
        int i17 = this.f14380i;
        if ((i16 == i17 || i17 == -1) && aVar3.f14387c == 0 && this.f14377f != 1) {
            c(0);
            l();
        }
    }
}
