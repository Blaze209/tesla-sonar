package s6;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Interpolator f110353x = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f110354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f110355b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f110357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f110358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f110359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f110360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f110361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f110362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f110363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f110364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f110365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f110366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f110367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f110368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f110369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f110370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private OverScroller f110371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AbstractC2350c f110372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f110373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f110374u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ViewGroup f110375v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f110356c = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f110376w = new b();

    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * f12 * f12 * f12) + 1.0f;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.K(0);
        }
    }

    private c(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull AbstractC2350c abstractC2350c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC2350c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f110375v = viewGroup;
        this.f110372s = abstractC2350c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i11 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f110369p = i11;
        this.f110368o = i11;
        this.f110355b = viewConfiguration.getScaledTouchSlop();
        this.f110366m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f110367n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f110371r = new OverScroller(context, f110353x);
    }

    private boolean D(int i11) {
        if (C(i11)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i11 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    private void G() {
        this.f110365l.computeCurrentVelocity(1000, this.f110366m);
        p(g(this.f110365l.getXVelocity(this.f110356c), this.f110367n, this.f110366m), g(this.f110365l.getYVelocity(this.f110356c), this.f110367n, this.f110366m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [s6.c$c] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void H(float f11, float f12, int i11) {
        int i12;
        boolean zC = c(f11, f12, i11, 1);
        ?? r11 = zC;
        if (c(f12, f11, i11, 4)) {
            r11 = (zC ? 1 : 0) | 4;
        }
        ?? r12 = r11;
        if (c(f11, f12, i11, 2)) {
            r12 = (r11 == true ? 1 : 0) | 2;
        }
        ?? r13 = r12;
        if (c(f12, f11, i11, 8)) {
            i12 = (r12 == true ? 1 : 0) | 8;
        }
        if (r13 == 0) {
            r13 = i12;
            return;
        }
        r13 = i12;
        int[] iArr = this.f110362i;
        iArr[i11] = (iArr[i11] | r13) == true ? 1 : 0;
        this.f110372s.f(r13, i11);
    }

    private void I(float f11, float f12, int i11) {
        s(i11);
        float[] fArr = this.f110357d;
        this.f110359f[i11] = f11;
        fArr[i11] = f11;
        float[] fArr2 = this.f110358e;
        this.f110360g[i11] = f12;
        fArr2[i11] = f12;
        this.f110361h[i11] = y((int) f11, (int) f12);
        this.f110364k |= 1 << i11;
    }

    private void J(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            int pointerId = motionEvent.getPointerId(i11);
            if (D(pointerId)) {
                float x11 = motionEvent.getX(i11);
                float y11 = motionEvent.getY(i11);
                this.f110359f[pointerId] = x11;
                this.f110360g[pointerId] = y11;
            }
        }
    }

    private boolean c(float f11, float f12, int i11, int i12) {
        float fAbs = Math.abs(f11);
        float fAbs2 = Math.abs(f12);
        if ((this.f110361h[i11] & i12) == i12 && (this.f110370q & i12) != 0 && (this.f110363j[i11] & i12) != i12 && (this.f110362i[i11] & i12) != i12) {
            int i13 = this.f110355b;
            if (fAbs > i13 || fAbs2 > i13) {
                if (fAbs < fAbs2 * 0.5f && this.f110372s.g(i12)) {
                    int[] iArr = this.f110363j;
                    iArr[i11] = iArr[i11] | i12;
                    return false;
                }
                if ((this.f110362i[i11] & i12) == 0 && fAbs > this.f110355b) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean f(View view, float f11, float f12) {
        if (view == null) {
            return false;
        }
        boolean z11 = this.f110372s.d(view) > 0;
        boolean z12 = this.f110372s.e(view) > 0;
        if (z11 && z12) {
            float f13 = (f11 * f11) + (f12 * f12);
            int i11 = this.f110355b;
            return f13 > ((float) (i11 * i11));
        }
        if (z11) {
            return Math.abs(f11) > ((float) this.f110355b);
        }
        return z12 && Math.abs(f12) > ((float) this.f110355b);
    }

    private float g(float f11, float f12, float f13) {
        float fAbs = Math.abs(f11);
        if (fAbs < f12) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (fAbs > f13) {
            return f11 > BitmapDescriptorFactory.HUE_RED ? f13 : -f13;
        }
        return f11;
    }

    private int h(int i11, int i12, int i13) {
        int iAbs = Math.abs(i11);
        if (iAbs < i12) {
            return 0;
        }
        if (iAbs > i13) {
            return i11 > 0 ? i13 : -i13;
        }
        return i11;
    }

    private void i() {
        float[] fArr = this.f110357d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.f110358e, BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.f110359f, BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.f110360g, BitmapDescriptorFactory.HUE_RED);
        Arrays.fill(this.f110361h, 0);
        Arrays.fill(this.f110362i, 0);
        Arrays.fill(this.f110363j, 0);
        this.f110364k = 0;
    }

    private void j(int i11) {
        if (this.f110357d == null || !C(i11)) {
            return;
        }
        this.f110357d[i11] = 0.0f;
        this.f110358e[i11] = 0.0f;
        this.f110359f[i11] = 0.0f;
        this.f110360g[i11] = 0.0f;
        this.f110361h[i11] = 0;
        this.f110362i[i11] = 0;
        this.f110363j[i11] = 0;
        this.f110364k = (~(1 << i11)) & this.f110364k;
    }

    private int k(int i11, int i12, int i13) {
        if (i11 == 0) {
            return 0;
        }
        int width = this.f110375v.getWidth();
        float f11 = width / 2;
        float fQ = f11 + (q(Math.min(1.0f, Math.abs(i11) / width)) * f11);
        int iAbs = Math.abs(i12);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fQ / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i11) / i13) + 1.0f) * 256.0f), 600);
    }

    private int l(View view, int i11, int i12, int i13, int i14) {
        float f11;
        float f12;
        float f13;
        float f14;
        int iH = h(i13, (int) this.f110367n, (int) this.f110366m);
        int iH2 = h(i14, (int) this.f110367n, (int) this.f110366m);
        int iAbs = Math.abs(i11);
        int iAbs2 = Math.abs(i12);
        int iAbs3 = Math.abs(iH);
        int iAbs4 = Math.abs(iH2);
        int i15 = iAbs3 + iAbs4;
        int i16 = iAbs + iAbs2;
        if (iH != 0) {
            f11 = iAbs3;
            f12 = i15;
        } else {
            f11 = iAbs;
            f12 = i16;
        }
        float f15 = f11 / f12;
        if (iH2 != 0) {
            f13 = iAbs4;
            f14 = i15;
        } else {
            f13 = iAbs2;
            f14 = i16;
        }
        return (int) ((k(i11, iH, this.f110372s.d(view)) * f15) + (k(i12, iH2, this.f110372s.e(view)) * (f13 / f14)));
    }

    public static c n(@NonNull ViewGroup viewGroup, float f11, @NonNull AbstractC2350c abstractC2350c) {
        c cVarO = o(viewGroup, abstractC2350c);
        cVarO.f110355b = (int) (cVarO.f110355b * (1.0f / f11));
        return cVarO;
    }

    public static c o(@NonNull ViewGroup viewGroup, @NonNull AbstractC2350c abstractC2350c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC2350c);
    }

    private void p(float f11, float f12) {
        this.f110374u = true;
        this.f110372s.l(this.f110373t, f11, f12);
        this.f110374u = false;
        if (this.f110354a == 1) {
            K(0);
        }
    }

    private float q(float f11) {
        return (float) Math.sin((f11 - 0.5f) * 0.47123894f);
    }

    private void r(int i11, int i12, int i13, int i14) {
        int left = this.f110373t.getLeft();
        int top = this.f110373t.getTop();
        if (i13 != 0) {
            i11 = this.f110372s.a(this.f110373t, i11, i13);
            ViewCompat.Z(this.f110373t, i11 - left);
        }
        int i15 = i11;
        if (i14 != 0) {
            i12 = this.f110372s.b(this.f110373t, i12, i14);
            ViewCompat.a0(this.f110373t, i12 - top);
        }
        int i16 = i12;
        if (i13 == 0 && i14 == 0) {
            return;
        }
        this.f110372s.k(this.f110373t, i15, i16, i15 - left, i16 - top);
    }

    private void s(int i11) {
        float[] fArr = this.f110357d;
        if (fArr == null || fArr.length <= i11) {
            int i12 = i11 + 1;
            float[] fArr2 = new float[i12];
            float[] fArr3 = new float[i12];
            float[] fArr4 = new float[i12];
            float[] fArr5 = new float[i12];
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f110358e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f110359f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f110360g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f110361h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f110362i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f110363j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f110357d = fArr2;
            this.f110358e = fArr3;
            this.f110359f = fArr4;
            this.f110360g = fArr5;
            this.f110361h = iArr;
            this.f110362i = iArr2;
            this.f110363j = iArr3;
        }
    }

    private boolean u(int i11, int i12, int i13, int i14) {
        int left = this.f110373t.getLeft();
        int top = this.f110373t.getTop();
        int i15 = i11 - left;
        int i16 = i12 - top;
        if (i15 == 0 && i16 == 0) {
            this.f110371r.abortAnimation();
            K(0);
            return false;
        }
        this.f110371r.startScroll(left, top, i15, i16, l(this.f110373t, i15, i16, i13, i14));
        K(2);
        return true;
    }

    private int y(int i11, int i12) {
        int i13 = i11 < this.f110375v.getLeft() + this.f110368o ? 1 : 0;
        if (i12 < this.f110375v.getTop() + this.f110368o) {
            i13 |= 4;
        }
        if (i11 > this.f110375v.getRight() - this.f110368o) {
            i13 |= 2;
        }
        return i12 > this.f110375v.getBottom() - this.f110368o ? i13 | 8 : i13;
    }

    public int A() {
        return this.f110354a;
    }

    public boolean B(int i11, int i12) {
        return E(this.f110373t, i11, i12);
    }

    public boolean C(int i11) {
        return ((1 << i11) & this.f110364k) != 0;
    }

    public boolean E(View view, int i11, int i12) {
        return view != null && i11 >= view.getLeft() && i11 < view.getRight() && i12 >= view.getTop() && i12 < view.getBottom();
    }

    public void F(@NonNull MotionEvent motionEvent) {
        int i11;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f110365l == null) {
            this.f110365l = VelocityTracker.obtain();
        }
        this.f110365l.addMovement(motionEvent);
        int i12 = 0;
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewT = t((int) x11, (int) y11);
            I(x11, y11, pointerId);
            R(viewT, pointerId);
            int i13 = this.f110361h[pointerId];
            int i14 = this.f110370q;
            if ((i13 & i14) != 0) {
                this.f110372s.h(i13 & i14, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f110354a == 1) {
                G();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f110354a == 1) {
                if (D(this.f110356c)) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f110356c);
                    float x12 = motionEvent.getX(iFindPointerIndex);
                    float y12 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.f110359f;
                    int i15 = this.f110356c;
                    int i16 = (int) (x12 - fArr[i15]);
                    int i17 = (int) (y12 - this.f110360g[i15]);
                    r(this.f110373t.getLeft() + i16, this.f110373t.getTop() + i17, i16, i17);
                    J(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i12 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i12);
                if (D(pointerId2)) {
                    float x13 = motionEvent.getX(i12);
                    float y13 = motionEvent.getY(i12);
                    float f11 = x13 - this.f110357d[pointerId2];
                    float f12 = y13 - this.f110358e[pointerId2];
                    H(f11, f12, pointerId2);
                    if (this.f110354a != 1) {
                        View viewT2 = t((int) x13, (int) y13);
                        if (f(viewT2, f11, f12) && R(viewT2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i12++;
            }
            J(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f110354a == 1) {
                p(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x14 = motionEvent.getX(actionIndex);
            float y14 = motionEvent.getY(actionIndex);
            I(x14, y14, pointerId3);
            if (this.f110354a != 0) {
                if (B((int) x14, (int) y14)) {
                    R(this.f110373t, pointerId3);
                    return;
                }
                return;
            } else {
                R(t((int) x14, (int) y14), pointerId3);
                int i18 = this.f110361h[pointerId3];
                int i19 = this.f110370q;
                if ((i18 & i19) != 0) {
                    this.f110372s.h(i18 & i19, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f110354a == 1 && pointerId4 == this.f110356c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i12 >= pointerCount2) {
                    i11 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i12);
                if (pointerId5 != this.f110356c) {
                    View viewT3 = t((int) motionEvent.getX(i12), (int) motionEvent.getY(i12));
                    View view = this.f110373t;
                    if (viewT3 == view && R(view, pointerId5)) {
                        i11 = this.f110356c;
                        break;
                    }
                }
                i12++;
            }
            if (i11 == -1) {
                G();
            }
        }
        j(pointerId4);
    }

    void K(int i11) {
        this.f110375v.removeCallbacks(this.f110376w);
        if (this.f110354a != i11) {
            this.f110354a = i11;
            this.f110372s.j(i11);
            if (this.f110354a == 0) {
                this.f110373t = null;
            }
        }
    }

    public void L(int i11) {
        this.f110368o = i11;
    }

    public void M(int i11) {
        this.f110370q = i11;
    }

    public void N(float f11) {
        this.f110367n = f11;
    }

    public boolean O(int i11, int i12) {
        if (this.f110374u) {
            return u(i11, i12, (int) this.f110365l.getXVelocity(this.f110356c), (int) this.f110365l.getYVelocity(this.f110356c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    public boolean P(@NonNull MotionEvent motionEvent) {
        View viewT;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f110365l == null) {
            this.f110365l = VelocityTracker.obtain();
        }
        this.f110365l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            I(x11, y11, pointerId);
            View viewT2 = t((int) x11, (int) y11);
            if (viewT2 == this.f110373t && this.f110354a == 2) {
                R(viewT2, pointerId);
            }
            int i11 = this.f110361h[pointerId];
            int i12 = this.f110370q;
            if ((i11 & i12) != 0) {
                this.f110372s.h(i11 & i12, pointerId);
            }
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                a();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x12 = motionEvent.getX(actionIndex);
                float y12 = motionEvent.getY(actionIndex);
                I(x12, y12, pointerId2);
                int i13 = this.f110354a;
                if (i13 == 0) {
                    int i14 = this.f110361h[pointerId2];
                    int i15 = this.f110370q;
                    if ((i14 & i15) != 0) {
                        this.f110372s.h(i14 & i15, pointerId2);
                    }
                } else if (i13 == 2 && (viewT = t((int) x12, (int) y12)) == this.f110373t) {
                    R(viewT, pointerId2);
                }
            } else if (actionMasked == 6) {
                j(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f110357d != null && this.f110358e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i16 = 0; i16 < pointerCount; i16++) {
                int pointerId3 = motionEvent.getPointerId(i16);
                if (D(pointerId3)) {
                    float x13 = motionEvent.getX(i16);
                    float y13 = motionEvent.getY(i16);
                    float f11 = x13 - this.f110357d[pointerId3];
                    float f12 = y13 - this.f110358e[pointerId3];
                    View viewT3 = t((int) x13, (int) y13);
                    boolean z11 = viewT3 != null && f(viewT3, f11, f12);
                    if (!z11) {
                        H(f11, f12, pointerId3);
                        if (this.f110354a != 1) {
                            break;
                        }
                    } else {
                        int left = viewT3.getLeft();
                        int i17 = (int) f11;
                        int iA = this.f110372s.a(viewT3, left + i17, i17);
                        int top = viewT3.getTop();
                        int i18 = (int) f12;
                        int iB = this.f110372s.b(viewT3, top + i18, i18);
                        int iD = this.f110372s.d(viewT3);
                        int iE = this.f110372s.e(viewT3);
                        if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                            break;
                        }
                        H(f11, f12, pointerId3);
                        if (this.f110354a != 1 || (z11 && R(viewT3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            J(motionEvent);
        }
        return this.f110354a == 1;
    }

    public boolean Q(@NonNull View view, int i11, int i12) {
        this.f110373t = view;
        this.f110356c = -1;
        boolean zU = u(i11, i12, 0, 0);
        if (!zU && this.f110354a == 0 && this.f110373t != null) {
            this.f110373t = null;
        }
        return zU;
    }

    boolean R(View view, int i11) {
        if (view == this.f110373t && this.f110356c == i11) {
            return true;
        }
        if (view == null || !this.f110372s.m(view, i11)) {
            return false;
        }
        this.f110356c = i11;
        b(view, i11);
        return true;
    }

    public void a() {
        this.f110356c = -1;
        i();
        VelocityTracker velocityTracker = this.f110365l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f110365l = null;
        }
    }

    public void b(@NonNull View view, int i11) {
        if (view.getParent() == this.f110375v) {
            this.f110373t = view;
            this.f110356c = i11;
            this.f110372s.i(view, i11);
            K(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f110375v + ")");
    }

    public boolean d(int i11) {
        int length = this.f110357d.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (e(i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public boolean e(int i11, int i12) {
        if (!C(i12)) {
            return false;
        }
        boolean z11 = (i11 & 1) == 1;
        boolean z12 = (i11 & 2) == 2;
        float f11 = this.f110359f[i12] - this.f110357d[i12];
        float f12 = this.f110360g[i12] - this.f110358e[i12];
        if (z11 && z12) {
            float f13 = (f11 * f11) + (f12 * f12);
            int i13 = this.f110355b;
            return f13 > ((float) (i13 * i13));
        }
        if (z11) {
            return Math.abs(f11) > ((float) this.f110355b);
        }
        return z12 && Math.abs(f12) > ((float) this.f110355b);
    }

    public boolean m(boolean z11) {
        if (this.f110354a == 2) {
            boolean zComputeScrollOffset = this.f110371r.computeScrollOffset();
            int currX = this.f110371r.getCurrX();
            int currY = this.f110371r.getCurrY();
            int left = currX - this.f110373t.getLeft();
            int top = currY - this.f110373t.getTop();
            if (left != 0) {
                ViewCompat.Z(this.f110373t, left);
            }
            if (top != 0) {
                ViewCompat.a0(this.f110373t, top);
            }
            if (left != 0 || top != 0) {
                this.f110372s.k(this.f110373t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f110371r.getFinalX() && currY == this.f110371r.getFinalY()) {
                this.f110371r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z11) {
                    this.f110375v.post(this.f110376w);
                } else {
                    K(0);
                }
            }
        }
        return this.f110354a == 2;
    }

    public View t(int i11, int i12) {
        for (int childCount = this.f110375v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f110375v.getChildAt(this.f110372s.c(childCount));
            if (i11 >= childAt.getLeft() && i11 < childAt.getRight() && i12 >= childAt.getTop() && i12 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View v() {
        return this.f110373t;
    }

    public int w() {
        return this.f110369p;
    }

    public int x() {
        return this.f110368o;
    }

    public int z() {
        return this.f110355b;
    }

    /* JADX INFO: renamed from: s6.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC2350c {
        public abstract int a(@NonNull View view, int i11, int i12);

        public abstract int b(@NonNull View view, int i11, int i12);

        public int d(@NonNull View view) {
            return 0;
        }

        public int e(@NonNull View view) {
            return 0;
        }

        public boolean g(int i11) {
            return false;
        }

        public abstract void j(int i11);

        public abstract void k(@NonNull View view, int i11, int i12, int i13, int i14);

        public abstract void l(@NonNull View view, float f11, float f12);

        public abstract boolean m(@NonNull View view, int i11);

        public int c(int i11) {
            return i11;
        }

        public void f(int i11, int i12) {
        }

        public void h(int i11, int i12) {
        }

        public void i(@NonNull View view, int i11) {
        }
    }
}
