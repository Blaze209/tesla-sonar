package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTimeBar extends View implements g0 {
    private int A;
    private long B;
    private int C;
    private Rect D;
    private ValueAnimator E;
    private float F;
    private boolean G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long[] N;
    private boolean[] O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f12694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f12695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f12696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f12697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f12698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f12699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f12700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f12701h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f12702i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f12703j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Drawable f12704k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f12705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f12706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f12707n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f12708o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f12709p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f12710q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f12711r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f12712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f12713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final StringBuilder f12714u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Formatter f12715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f12716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArraySet<g0.a> f12717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Point f12718y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f12719z;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void b(DefaultTimeBar defaultTimeBar, ValueAnimator valueAnimator) {
        defaultTimeBar.getClass();
        defaultTimeBar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.f12694a);
    }

    private static int d(float f11, int i11) {
        return (int) ((i11 * f11) + 0.5f);
    }

    private void e(Canvas canvas) {
        int i11;
        if (this.J <= 0) {
            return;
        }
        Rect rect = this.f12697d;
        int iR = q0.r(rect.right, rect.left, this.f12695b.right);
        int iCenterY = this.f12697d.centerY();
        Drawable drawable = this.f12704k;
        if (drawable == null) {
            if (this.H || isFocused()) {
                i11 = this.f12711r;
            } else {
                i11 = isEnabled() ? this.f12709p : this.f12710q;
            }
            canvas.drawCircle(iR, iCenterY, (int) ((i11 * this.F) / 2.0f), this.f12703j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.f12704k.getIntrinsicHeight() * this.F)) / 2;
        this.f12704k.setBounds(iR - intrinsicWidth, iCenterY - intrinsicHeight, iR + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f12704k.draw(canvas);
    }

    private void f(Canvas canvas) {
        int iHeight = this.f12695b.height();
        int iCenterY = this.f12695b.centerY() - (iHeight / 2);
        int i11 = iHeight + iCenterY;
        if (this.J <= 0) {
            Rect rect = this.f12695b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i11, this.f12700g);
            return;
        }
        Rect rect2 = this.f12696c;
        int i12 = rect2.left;
        int i13 = rect2.right;
        int iMax = Math.max(Math.max(this.f12695b.left, i13), this.f12697d.right);
        int i14 = this.f12695b.right;
        if (iMax < i14) {
            canvas.drawRect(iMax, iCenterY, i14, i11, this.f12700g);
        }
        int iMax2 = Math.max(i12, this.f12697d.right);
        if (i13 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i13, i11, this.f12699f);
        }
        if (this.f12697d.width() > 0) {
            Rect rect3 = this.f12697d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i11, this.f12698e);
        }
        if (this.M == 0) {
            return;
        }
        long[] jArr = (long[]) s7.a.f(this.N);
        boolean[] zArr = (boolean[]) s7.a.f(this.O);
        int i15 = this.f12708o / 2;
        for (int i16 = 0; i16 < this.M; i16++) {
            int iWidth = ((int) ((((long) this.f12695b.width()) * q0.s(jArr[i16], 0L, this.J)) / this.J)) - i15;
            Rect rect4 = this.f12695b;
            int iMin = rect4.left + Math.min(rect4.width() - this.f12708o, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.f12708o, i11, zArr[i16] ? this.f12702i : this.f12701h);
        }
    }

    private long getPositionIncrement() {
        long j11 = this.B;
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        long j12 = this.J;
        if (j12 == -9223372036854775807L) {
            return 0L;
        }
        return j12 / ((long) this.A);
    }

    private String getProgressText() {
        return q0.x0(this.f12714u, this.f12715v, this.K);
    }

    private long getScrubberPosition() {
        if (this.f12695b.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f12697d.width()) * this.J) / ((long) this.f12695b.width());
    }

    private boolean i(float f11, float f12) {
        return this.f12694a.contains((int) f11, (int) f12);
    }

    private void j(float f11) {
        Rect rect = this.f12697d;
        Rect rect2 = this.f12695b;
        rect.right = q0.r((int) f11, rect2.left, rect2.right);
    }

    private static int k(float f11, int i11) {
        return (int) (i11 / f11);
    }

    private Point l(MotionEvent motionEvent) {
        this.f12718y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f12718y;
    }

    private boolean m(long j11) {
        long j12 = this.J;
        if (j12 <= 0) {
            return false;
        }
        long j13 = this.H ? this.I : this.K;
        long jS = q0.s(j13 + j11, 0L, j12);
        if (jS == j13) {
            return false;
        }
        if (this.H) {
            w(jS);
        } else {
            s(jS);
        }
        u();
        return true;
    }

    private boolean n(Drawable drawable) {
        return o(drawable, getLayoutDirection());
    }

    private static boolean o(Drawable drawable, int i11) {
        return drawable.setLayoutDirection(i11);
    }

    private void p(int i11, int i12) {
        Rect rect = this.D;
        if (rect != null && rect.width() == i11 && this.D.height() == i12) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i11, i12);
        this.D = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private void s(long j11) {
        this.I = j11;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<g0.a> it = this.f12717x.iterator();
        while (it.hasNext()) {
            it.next().n(this, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(boolean z11) {
        removeCallbacks(this.f12716w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<g0.a> it = this.f12717x.iterator();
        while (it.hasNext()) {
            it.next().z(this, this.I, z11);
        }
    }

    private void u() {
        this.f12696c.set(this.f12695b);
        this.f12697d.set(this.f12695b);
        long j11 = this.H ? this.I : this.K;
        if (this.J > 0) {
            int iWidth = (int) ((((long) this.f12695b.width()) * this.L) / this.J);
            Rect rect = this.f12696c;
            Rect rect2 = this.f12695b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f12695b.width()) * j11) / this.J);
            Rect rect3 = this.f12697d;
            Rect rect4 = this.f12695b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f12696c;
            int i11 = this.f12695b.left;
            rect5.right = i11;
            this.f12697d.right = i11;
        }
        invalidate(this.f12694a);
    }

    private void v() {
        Drawable drawable = this.f12704k;
        if (drawable != null && drawable.isStateful() && this.f12704k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void w(long j11) {
        if (this.I == j11) {
            return;
        }
        this.I = j11;
        Iterator<g0.a> it = this.f12717x.iterator();
        while (it.hasNext()) {
            it.next().q(this, j11);
        }
    }

    @Override // androidx.media3.ui.g0
    public void a(g0.a aVar) {
        s7.a.f(aVar);
        this.f12717x.add(aVar);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        v();
    }

    public void g(long j11) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.E.setFloatValues(this.F, BitmapDescriptorFactory.HUE_RED);
        this.E.setDuration(j11);
        this.E.start();
    }

    @Override // androidx.media3.ui.g0
    public long getPreferredUpdateDelay() {
        int iK = k(this.f12719z, this.f12695b.width());
        if (iK == 0) {
            return Long.MAX_VALUE;
        }
        long j11 = this.J;
        if (j11 == 0 || j11 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j11 / ((long) iK);
    }

    public void h(boolean z11) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = z11;
        this.F = BitmapDescriptorFactory.HUE_RED;
        invalidate(this.f12694a);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12704k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        f(canvas);
        e(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (!this.H || z11) {
            return;
        }
        t(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x002b  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i11 != 66) {
                switch (i11) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (m(positionIncrement)) {
                            removeCallbacks(this.f12716w);
                            postDelayed(this.f12716w, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m(positionIncrement)) {
                            removeCallbacks(this.f12716w);
                            postDelayed(this.f12716w, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.H) {
                            t(false);
                            return true;
                        }
                        break;
                }
            } else if (this.H) {
                t(false);
                return true;
            }
        }
        return super.onKeyDown(i11, keyEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int paddingBottom;
        int iMax;
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i15 - getPaddingRight();
        int i17 = this.G ? 0 : this.f12712s;
        if (this.f12707n == 1) {
            paddingBottom = (i16 - getPaddingBottom()) - this.f12706m;
            int paddingBottom2 = i16 - getPaddingBottom();
            int i18 = this.f12705l;
            iMax = (paddingBottom2 - i18) - Math.max(i17 - (i18 / 2), 0);
        } else {
            paddingBottom = (i16 - this.f12706m) / 2;
            iMax = (i16 - this.f12705l) / 2;
        }
        this.f12694a.set(paddingLeft, paddingBottom, paddingRight, this.f12706m + paddingBottom);
        Rect rect = this.f12695b;
        Rect rect2 = this.f12694a;
        rect.set(rect2.left + i17, iMax, rect2.right - i17, this.f12705l + iMax);
        if (Build.VERSION.SDK_INT >= 29) {
            p(i15, i16);
        }
        u();
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == 0) {
            size = this.f12706m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f12706m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), size);
        v();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        Drawable drawable = this.f12704k;
        if (drawable == null || !o(drawable, i11)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.J > 0) {
            Point pointL = l(motionEvent);
            int i11 = pointL.x;
            int i12 = pointL.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f11 = i11;
                if (i(f11, i12)) {
                    j(f11);
                    s(getScrubberPosition());
                    u();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.H) {
                    t(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.H) {
                        t(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.H) {
                if (i12 < this.f12713t) {
                    int i13 = this.C;
                    j(i13 + ((i11 - i13) / 3));
                } else {
                    this.C = i11;
                    j(i11);
                }
                w(getScrubberPosition());
                u();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i11, Bundle bundle) {
        if (super.performAccessibilityAction(i11, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i11 == 8192) {
            if (m(-getPositionIncrement())) {
                t(false);
            }
        } else {
            if (i11 != 4096) {
                return false;
            }
            if (m(getPositionIncrement())) {
                t(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void q() {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.F = 1.0f;
        invalidate(this.f12694a);
    }

    public void r(long j11) {
        if (this.E.isStarted()) {
            this.E.cancel();
        }
        this.G = false;
        this.E.setFloatValues(this.F, 1.0f);
        this.E.setDuration(j11);
        this.E.start();
    }

    @Override // androidx.media3.ui.g0
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i11) {
        s7.a.a(i11 == 0 || !(jArr == null || zArr == null));
        this.M = i11;
        this.N = jArr;
        this.O = zArr;
        u();
    }

    public void setAdMarkerColor(int i11) {
        this.f12701h.setColor(i11);
        invalidate(this.f12694a);
    }

    public void setBufferedColor(int i11) {
        this.f12699f.setColor(i11);
        invalidate(this.f12694a);
    }

    @Override // androidx.media3.ui.g0
    public void setBufferedPosition(long j11) {
        if (this.L == j11) {
            return;
        }
        this.L = j11;
        u();
    }

    @Override // androidx.media3.ui.g0
    public void setDuration(long j11) {
        if (this.J == j11) {
            return;
        }
        this.J = j11;
        if (this.H && j11 == -9223372036854775807L) {
            t(true);
        }
        u();
    }

    @Override // android.view.View, androidx.media3.ui.g0
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (!this.H || z11) {
            return;
        }
        t(true);
    }

    public void setKeyCountIncrement(int i11) {
        s7.a.a(i11 > 0);
        this.A = i11;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j11) {
        s7.a.a(j11 > 0);
        this.A = -1;
        this.B = j11;
    }

    public void setPlayedAdMarkerColor(int i11) {
        this.f12702i.setColor(i11);
        invalidate(this.f12694a);
    }

    public void setPlayedColor(int i11) {
        this.f12698e.setColor(i11);
        invalidate(this.f12694a);
    }

    @Override // androidx.media3.ui.g0
    public void setPosition(long j11) {
        if (this.K == j11) {
            return;
        }
        this.K = j11;
        setContentDescription(getProgressText());
        u();
    }

    public void setScrubberColor(int i11) {
        this.f12703j.setColor(i11);
        invalidate(this.f12694a);
    }

    public void setUnplayedColor(int i11) {
        this.f12700g.setColor(i11);
        invalidate(this.f12694a);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2) {
        this(context, attributeSet, i11, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2, int i12) {
        super(context, attributeSet, i11);
        this.f12694a = new Rect();
        this.f12695b = new Rect();
        this.f12696c = new Rect();
        this.f12697d = new Rect();
        Paint paint = new Paint();
        this.f12698e = paint;
        Paint paint2 = new Paint();
        this.f12699f = paint2;
        Paint paint3 = new Paint();
        this.f12700g = paint3;
        Paint paint4 = new Paint();
        this.f12701h = paint4;
        Paint paint5 = new Paint();
        this.f12702i = paint5;
        Paint paint6 = new Paint();
        this.f12703j = paint6;
        paint6.setAntiAlias(true);
        this.f12717x = new CopyOnWriteArraySet<>();
        this.f12718y = new Point();
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f12719z = f11;
        this.f12713t = d(f11, -50);
        int iD = d(f11, 4);
        int iD2 = d(f11, 26);
        int iD3 = d(f11, 4);
        int iD4 = d(f11, 12);
        int iD5 = d(f11, 0);
        int iD6 = d(f11, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, ia.z.f77302e, i11, i12);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(ia.z.f77324p);
                this.f12704k = drawable;
                if (drawable != null) {
                    n(drawable);
                    iD2 = Math.max(drawable.getMinimumHeight(), iD2);
                }
                this.f12705l = typedArrayObtainStyledAttributes.getDimensionPixelSize(ia.z.f77310i, iD);
                this.f12706m = typedArrayObtainStyledAttributes.getDimensionPixelSize(ia.z.f77328r, iD2);
                this.f12707n = typedArrayObtainStyledAttributes.getInt(ia.z.f77308h, 0);
                this.f12708o = typedArrayObtainStyledAttributes.getDimensionPixelSize(ia.z.f77306g, iD3);
                this.f12709p = typedArrayObtainStyledAttributes.getDimensionPixelSize(ia.z.f77326q, iD4);
                this.f12710q = typedArrayObtainStyledAttributes.getDimensionPixelSize(ia.z.f77320n, iD5);
                this.f12711r = typedArrayObtainStyledAttributes.getDimensionPixelSize(ia.z.f77322o, iD6);
                int i13 = typedArrayObtainStyledAttributes.getInt(ia.z.f77316l, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(ia.z.f77318m, -1);
                int i15 = typedArrayObtainStyledAttributes.getInt(ia.z.f77312j, -855638017);
                int i16 = typedArrayObtainStyledAttributes.getInt(ia.z.f77330s, 872415231);
                int i17 = typedArrayObtainStyledAttributes.getInt(ia.z.f77304f, -1291845888);
                int i18 = typedArrayObtainStyledAttributes.getInt(ia.z.f77314k, 872414976);
                paint.setColor(i13);
                paint6.setColor(i14);
                paint2.setColor(i15);
                paint3.setColor(i16);
                paint4.setColor(i17);
                paint5.setColor(i18);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            this.f12705l = iD;
            this.f12706m = iD2;
            this.f12707n = 0;
            this.f12708o = iD3;
            this.f12709p = iD4;
            this.f12710q = iD5;
            this.f12711r = iD6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f12704k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f12714u = sb2;
        this.f12715v = new Formatter(sb2, Locale.getDefault());
        this.f12716w = new Runnable() { // from class: ia.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f77185a.t(false);
            }
        };
        Drawable drawable2 = this.f12704k;
        if (drawable2 != null) {
            this.f12712s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f12712s = (Math.max(this.f12710q, Math.max(this.f12709p, this.f12711r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ia.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.b(this.f77186a, valueAnimator2);
            }
        });
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
