package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class b extends View implements e0 {
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
    private final Rect f40839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f40840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f40841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f40842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f40843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f40844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f40845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f40846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Paint f40847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Paint f40848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Drawable f40849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f40850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f40851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f40852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f40853o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f40854p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f40855q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f40856r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f40857s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f40858t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final StringBuilder f40859u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Formatter f40860v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f40861w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final CopyOnWriteArraySet<e0.a> f40862x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Point f40863y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f40864z;

    public b(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void b(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        bVar.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.invalidate(bVar.f40839a);
    }

    private static int d(float f11, int i11) {
        return (int) ((i11 * f11) + 0.5f);
    }

    private void e(Canvas canvas) {
        int i11;
        if (this.J <= 0) {
            return;
        }
        Rect rect = this.f40842d;
        int iQ = p0.q(rect.right, rect.left, this.f40840b.right);
        int iCenterY = this.f40842d.centerY();
        Drawable drawable = this.f40849k;
        if (drawable == null) {
            if (this.H || isFocused()) {
                i11 = this.f40856r;
            } else {
                i11 = isEnabled() ? this.f40854p : this.f40855q;
            }
            canvas.drawCircle(iQ, iCenterY, (int) ((i11 * this.F) / 2.0f), this.f40848j);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
        int intrinsicHeight = ((int) (this.f40849k.getIntrinsicHeight() * this.F)) / 2;
        this.f40849k.setBounds(iQ - intrinsicWidth, iCenterY - intrinsicHeight, iQ + intrinsicWidth, iCenterY + intrinsicHeight);
        this.f40849k.draw(canvas);
    }

    private void f(Canvas canvas) {
        int iHeight = this.f40840b.height();
        int iCenterY = this.f40840b.centerY() - (iHeight / 2);
        int i11 = iHeight + iCenterY;
        if (this.J <= 0) {
            Rect rect = this.f40840b;
            canvas.drawRect(rect.left, iCenterY, rect.right, i11, this.f40845g);
            return;
        }
        Rect rect2 = this.f40841c;
        int i12 = rect2.left;
        int i13 = rect2.right;
        int iMax = Math.max(Math.max(this.f40840b.left, i13), this.f40842d.right);
        int i14 = this.f40840b.right;
        if (iMax < i14) {
            canvas.drawRect(iMax, iCenterY, i14, i11, this.f40845g);
        }
        int iMax2 = Math.max(i12, this.f40842d.right);
        if (i13 > iMax2) {
            canvas.drawRect(iMax2, iCenterY, i13, i11, this.f40844f);
        }
        if (this.f40842d.width() > 0) {
            Rect rect3 = this.f40842d;
            canvas.drawRect(rect3.left, iCenterY, rect3.right, i11, this.f40843e);
        }
        if (this.M == 0) {
            return;
        }
        long[] jArr = (long[]) ts.a.e(this.N);
        boolean[] zArr = (boolean[]) ts.a.e(this.O);
        int i15 = this.f40853o / 2;
        for (int i16 = 0; i16 < this.M; i16++) {
            int iWidth = ((int) ((((long) this.f40840b.width()) * p0.r(jArr[i16], 0L, this.J)) / this.J)) - i15;
            Rect rect4 = this.f40840b;
            int iMin = rect4.left + Math.min(rect4.width() - this.f40853o, Math.max(0, iWidth));
            canvas.drawRect(iMin, iCenterY, iMin + this.f40853o, i11, zArr[i16] ? this.f40847i : this.f40846h);
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
        return p0.f0(this.f40859u, this.f40860v, this.K);
    }

    private long getScrubberPosition() {
        if (this.f40840b.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f40842d.width()) * this.J) / ((long) this.f40840b.width());
    }

    private boolean i(float f11, float f12) {
        return this.f40839a.contains((int) f11, (int) f12);
    }

    private void j(float f11) {
        Rect rect = this.f40842d;
        Rect rect2 = this.f40840b;
        rect.right = p0.q((int) f11, rect2.left, rect2.right);
    }

    private static int k(float f11, int i11) {
        return (int) (i11 / f11);
    }

    private Point l(MotionEvent motionEvent) {
        this.f40863y.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f40863y;
    }

    private boolean m(long j11) {
        long j12 = this.J;
        if (j12 <= 0) {
            return false;
        }
        long j13 = this.H ? this.I : this.K;
        long jR = p0.r(j13 + j11, 0L, j12);
        if (jR == j13) {
            return false;
        }
        if (this.H) {
            w(jR);
        } else {
            s(jR);
        }
        u();
        return true;
    }

    private boolean n(Drawable drawable) {
        return p0.f115040a >= 23 && o(drawable, getLayoutDirection());
    }

    private static boolean o(Drawable drawable, int i11) {
        return p0.f115040a >= 23 && drawable.setLayoutDirection(i11);
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
        Iterator<e0.a> it = this.f40862x.iterator();
        while (it.hasNext()) {
            it.next().u(this, j11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(boolean z11) {
        removeCallbacks(this.f40861w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<e0.a> it = this.f40862x.iterator();
        while (it.hasNext()) {
            it.next().n(this, this.I, z11);
        }
    }

    private void u() {
        this.f40841c.set(this.f40840b);
        this.f40842d.set(this.f40840b);
        long j11 = this.H ? this.I : this.K;
        if (this.J > 0) {
            int iWidth = (int) ((((long) this.f40840b.width()) * this.L) / this.J);
            Rect rect = this.f40841c;
            Rect rect2 = this.f40840b;
            rect.right = Math.min(rect2.left + iWidth, rect2.right);
            int iWidth2 = (int) ((((long) this.f40840b.width()) * j11) / this.J);
            Rect rect3 = this.f40842d;
            Rect rect4 = this.f40840b;
            rect3.right = Math.min(rect4.left + iWidth2, rect4.right);
        } else {
            Rect rect5 = this.f40841c;
            int i11 = this.f40840b.left;
            rect5.right = i11;
            this.f40842d.right = i11;
        }
        invalidate(this.f40839a);
    }

    private void v() {
        Drawable drawable = this.f40849k;
        if (drawable != null && drawable.isStateful() && this.f40849k.setState(getDrawableState())) {
            invalidate();
        }
    }

    private void w(long j11) {
        if (this.I == j11) {
            return;
        }
        this.I = j11;
        Iterator<e0.a> it = this.f40862x.iterator();
        while (it.hasNext()) {
            it.next().q(this, j11);
        }
    }

    @Override // com.google.android.exoplayer2.ui.e0
    public void a(e0.a aVar) {
        ts.a.e(aVar);
        this.f40862x.add(aVar);
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

    @Override // com.google.android.exoplayer2.ui.e0
    public long getPreferredUpdateDelay() {
        int iK = k(this.f40864z, this.f40840b.width());
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
        invalidate(this.f40839a);
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f40849k;
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
        if (p0.f115040a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(PKIFailureInfo.certRevoked);
        }
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
                            removeCallbacks(this.f40861w);
                            postDelayed(this.f40861w, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m(positionIncrement)) {
                            removeCallbacks(this.f40861w);
                            postDelayed(this.f40861w, 1000L);
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
        int i17 = this.G ? 0 : this.f40857s;
        if (this.f40852n == 1) {
            paddingBottom = (i16 - getPaddingBottom()) - this.f40851m;
            int paddingBottom2 = i16 - getPaddingBottom();
            int i18 = this.f40850l;
            iMax = (paddingBottom2 - i18) - Math.max(i17 - (i18 / 2), 0);
        } else {
            paddingBottom = (i16 - this.f40851m) / 2;
            iMax = (i16 - this.f40850l) / 2;
        }
        this.f40839a.set(paddingLeft, paddingBottom, paddingRight, this.f40851m + paddingBottom);
        Rect rect = this.f40840b;
        Rect rect2 = this.f40839a;
        rect.set(rect2.left + i17, iMax, rect2.right - i17, this.f40850l + iMax);
        if (p0.f115040a >= 29) {
            p(i15, i16);
        }
        u();
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode == 0) {
            size = this.f40851m;
        } else if (mode != 1073741824) {
            size = Math.min(this.f40851m, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i11), size);
        v();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i11) {
        Drawable drawable = this.f40849k;
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
                if (i12 < this.f40858t) {
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
        invalidate(this.f40839a);
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

    @Override // com.google.android.exoplayer2.ui.e0
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i11) {
        ts.a.a(i11 == 0 || !(jArr == null || zArr == null));
        this.M = i11;
        this.N = jArr;
        this.O = zArr;
        u();
    }

    public void setAdMarkerColor(int i11) {
        this.f40846h.setColor(i11);
        invalidate(this.f40839a);
    }

    public void setBufferedColor(int i11) {
        this.f40844f.setColor(i11);
        invalidate(this.f40839a);
    }

    @Override // com.google.android.exoplayer2.ui.e0
    public void setBufferedPosition(long j11) {
        if (this.L == j11) {
            return;
        }
        this.L = j11;
        u();
    }

    @Override // com.google.android.exoplayer2.ui.e0
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

    @Override // android.view.View, com.google.android.exoplayer2.ui.e0
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        if (!this.H || z11) {
            return;
        }
        t(true);
    }

    public void setKeyCountIncrement(int i11) {
        ts.a.a(i11 > 0);
        this.A = i11;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j11) {
        ts.a.a(j11 > 0);
        this.A = -1;
        this.B = j11;
    }

    public void setPlayedAdMarkerColor(int i11) {
        this.f40847i.setColor(i11);
        invalidate(this.f40839a);
    }

    public void setPlayedColor(int i11) {
        this.f40843e.setColor(i11);
        invalidate(this.f40839a);
    }

    @Override // com.google.android.exoplayer2.ui.e0
    public void setPosition(long j11) {
        if (this.K == j11) {
            return;
        }
        this.K = j11;
        setContentDescription(getProgressText());
        u();
    }

    public void setScrubberColor(int i11) {
        this.f40848j.setColor(i11);
        invalidate(this.f40839a);
    }

    public void setUnplayedColor(int i11) {
        this.f40845g.setColor(i11);
        invalidate(this.f40839a);
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2) {
        this(context, attributeSet, i11, attributeSet2, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2, int i12) {
        super(context, attributeSet, i11);
        this.f40839a = new Rect();
        this.f40840b = new Rect();
        this.f40841c = new Rect();
        this.f40842d = new Rect();
        Paint paint = new Paint();
        this.f40843e = paint;
        Paint paint2 = new Paint();
        this.f40844f = paint2;
        Paint paint3 = new Paint();
        this.f40845g = paint3;
        Paint paint4 = new Paint();
        this.f40846h = paint4;
        Paint paint5 = new Paint();
        this.f40847i = paint5;
        Paint paint6 = new Paint();
        this.f40848j = paint6;
        paint6.setAntiAlias(true);
        this.f40862x = new CopyOnWriteArraySet<>();
        this.f40863y = new Point();
        float f11 = context.getResources().getDisplayMetrics().density;
        this.f40864z = f11;
        this.f40858t = d(f11, -50);
        int iD = d(f11, 4);
        int iD2 = d(f11, 26);
        int iD3 = d(f11, 4);
        int iD4 = d(f11, 12);
        int iD5 = d(f11, 0);
        int iD6 = d(f11, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, rs.q.f109173e, i11, i12);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(rs.q.f109184p);
                this.f40849k = drawable;
                if (drawable != null) {
                    n(drawable);
                    iD2 = Math.max(drawable.getMinimumHeight(), iD2);
                }
                this.f40850l = typedArrayObtainStyledAttributes.getDimensionPixelSize(rs.q.f109177i, iD);
                this.f40851m = typedArrayObtainStyledAttributes.getDimensionPixelSize(rs.q.f109186r, iD2);
                this.f40852n = typedArrayObtainStyledAttributes.getInt(rs.q.f109176h, 0);
                this.f40853o = typedArrayObtainStyledAttributes.getDimensionPixelSize(rs.q.f109175g, iD3);
                this.f40854p = typedArrayObtainStyledAttributes.getDimensionPixelSize(rs.q.f109185q, iD4);
                this.f40855q = typedArrayObtainStyledAttributes.getDimensionPixelSize(rs.q.f109182n, iD5);
                this.f40856r = typedArrayObtainStyledAttributes.getDimensionPixelSize(rs.q.f109183o, iD6);
                int i13 = typedArrayObtainStyledAttributes.getInt(rs.q.f109180l, -1);
                int i14 = typedArrayObtainStyledAttributes.getInt(rs.q.f109181m, -1);
                int i15 = typedArrayObtainStyledAttributes.getInt(rs.q.f109178j, -855638017);
                int i16 = typedArrayObtainStyledAttributes.getInt(rs.q.f109187s, 872415231);
                int i17 = typedArrayObtainStyledAttributes.getInt(rs.q.f109174f, -1291845888);
                int i18 = typedArrayObtainStyledAttributes.getInt(rs.q.f109179k, 872414976);
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
            this.f40850l = iD;
            this.f40851m = iD2;
            this.f40852n = 0;
            this.f40853o = iD3;
            this.f40854p = iD4;
            this.f40855q = iD5;
            this.f40856r = iD6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f40849k = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f40859u = sb2;
        this.f40860v = new Formatter(sb2, Locale.getDefault());
        this.f40861w = new Runnable() { // from class: rs.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f109081a.t(false);
            }
        };
        Drawable drawable2 = this.f40849k;
        if (drawable2 != null) {
            this.f40857s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f40857s = (Math.max(this.f40855q, Math.max(this.f40854p, this.f40856r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rs.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                com.google.android.exoplayer2.ui.b.b(this.f109082a, valueAnimator2);
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
