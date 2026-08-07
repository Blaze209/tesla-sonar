package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes5.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    s6.c f41509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f41510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41512d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f41514f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f41513e = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f41515g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f41516h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f41517i = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f41518j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final s6.c.AbstractC2350c f41519k = new a();

    class a extends s6.c.AbstractC2350c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f41520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f41521b = -1;

        a() {
        }

        private boolean n(@NonNull View view, float f11) {
            if (f11 == BitmapDescriptorFactory.HUE_RED) {
                return Math.abs(view.getLeft() - this.f41520a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f41516h);
            }
            boolean z11 = ViewCompat.A(view) == 1;
            int i11 = SwipeDismissBehavior.this.f41515g;
            if (i11 == 2) {
                return true;
            }
            if (i11 == 0) {
                if (z11) {
                    return f11 < BitmapDescriptorFactory.HUE_RED;
                }
                return f11 > BitmapDescriptorFactory.HUE_RED;
            }
            if (i11 == 1) {
                if (z11) {
                    return f11 > BitmapDescriptorFactory.HUE_RED;
                }
                if (f11 < BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
            }
            return false;
        }

        @Override // s6.c.AbstractC2350c
        public int a(@NonNull View view, int i11, int i12) {
            int width;
            int width2;
            int width3;
            boolean z11 = ViewCompat.A(view) == 1;
            int i13 = SwipeDismissBehavior.this.f41515g;
            if (i13 == 0) {
                if (z11) {
                    width = this.f41520a - view.getWidth();
                    width2 = this.f41520a;
                } else {
                    width = this.f41520a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i13 != 1) {
                width = this.f41520a - view.getWidth();
                width2 = view.getWidth() + this.f41520a;
            } else if (z11) {
                width = this.f41520a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f41520a - view.getWidth();
                width2 = this.f41520a;
            }
            return SwipeDismissBehavior.L(width, i11, width2);
        }

        @Override // s6.c.AbstractC2350c
        public int b(@NonNull View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // s6.c.AbstractC2350c
        public int d(@NonNull View view) {
            return view.getWidth();
        }

        @Override // s6.c.AbstractC2350c
        public void i(@NonNull View view, int i11) {
            this.f41521b = i11;
            this.f41520a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f41512d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f41512d = false;
            }
        }

        @Override // s6.c.AbstractC2350c
        public void j(int i11) {
            c cVar = SwipeDismissBehavior.this.f41510b;
            if (cVar != null) {
                cVar.b(i11);
            }
        }

        @Override // s6.c.AbstractC2350c
        public void k(@NonNull View view, int i11, int i12, int i13, int i14) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f41517i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f41518j;
            float fAbs = Math.abs(i11 - this.f41520a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            } else {
                view.setAlpha(SwipeDismissBehavior.K(BitmapDescriptorFactory.HUE_RED, 1.0f - SwipeDismissBehavior.N(width, width2, fAbs), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001d  */
        @Override // s6.c.AbstractC2350c
        public void l(@NonNull View view, float f11, float f12) {
            int i11;
            boolean z11;
            c cVar;
            this.f41521b = -1;
            int width = view.getWidth();
            if (n(view, f11)) {
                if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    int left = view.getLeft();
                    int i12 = this.f41520a;
                    if (left < i12) {
                        i11 = this.f41520a - width;
                    } else {
                        i11 = i12 + width;
                    }
                } else {
                    i11 = this.f41520a - width;
                }
                z11 = true;
            } else {
                i11 = this.f41520a;
                z11 = false;
            }
            if (SwipeDismissBehavior.this.f41509a.O(i11, view.getTop())) {
                ViewCompat.h0(view, new d(view, z11));
            } else {
                if (!z11 || (cVar = SwipeDismissBehavior.this.f41510b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // s6.c.AbstractC2350c
        public boolean m(View view, int i11) {
            int i12 = this.f41521b;
            return (i12 == -1 || i12 == i11) && SwipeDismissBehavior.this.J(view);
        }
    }

    class b implements AccessibilityViewCommand {
        b() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean a(@NonNull View view, AccessibilityViewCommand.a aVar) {
            if (!SwipeDismissBehavior.this.J(view)) {
                return false;
            }
            boolean z11 = ViewCompat.A(view) == 1;
            int i11 = SwipeDismissBehavior.this.f41515g;
            ViewCompat.Z(view, (!(i11 == 0 && z11) && (i11 != 1 || z11)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            c cVar = SwipeDismissBehavior.this.f41510b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i11);
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f41524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f41525b;

        d(View view, boolean z11) {
            this.f41524a = view;
            this.f41525b = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            s6.c cVar2 = SwipeDismissBehavior.this.f41509a;
            if (cVar2 != null && cVar2.m(true)) {
                ViewCompat.h0(this.f41524a, this);
            } else {
                if (!this.f41525b || (cVar = SwipeDismissBehavior.this.f41510b) == null) {
                    return;
                }
                cVar.a(this.f41524a);
            }
        }
    }

    static float K(float f11, float f12, float f13) {
        return Math.min(Math.max(f11, f12), f13);
    }

    static int L(int i11, int i12, int i13) {
        return Math.min(Math.max(i11, i12), i13);
    }

    private void M(ViewGroup viewGroup) {
        if (this.f41509a == null) {
            this.f41509a = this.f41514f ? s6.c.n(viewGroup, this.f41513e, this.f41519k) : s6.c.o(viewGroup, this.f41519k);
        }
    }

    static float N(float f11, float f12, float f13) {
        return (f13 - f11) / (f12 - f11);
    }

    private void S(View view) {
        ViewCompat.j0(view, PKIFailureInfo.badCertTemplate);
        if (J(view)) {
            ViewCompat.l0(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7762y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean H(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
        if (this.f41509a == null) {
            return false;
        }
        if (this.f41512d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f41509a.F(motionEvent);
        return true;
    }

    public boolean J(@NonNull View view) {
        return true;
    }

    public void O(float f11) {
        this.f41518j = K(BitmapDescriptorFactory.HUE_RED, f11, 1.0f);
    }

    public void P(c cVar) {
        this.f41510b = cVar;
    }

    public void Q(float f11) {
        this.f41517i = K(BitmapDescriptorFactory.HUE_RED, f11, 1.0f);
    }

    public void R(int i11) {
        this.f41515g = i11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, @NonNull MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.f41511c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v11, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f41511c = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f41511c = false;
        }
        if (zIsPointInChildBounds) {
            M(coordinatorLayout);
            if (!this.f41512d && this.f41509a.P(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v11, int i11) {
        boolean zP = super.p(coordinatorLayout, v11, i11);
        if (ViewCompat.y(v11) == 0) {
            ViewCompat.z0(v11, 1);
            S(v11);
        }
        return zP;
    }
}
