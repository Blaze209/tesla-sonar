package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    private static final Property<SwitchCompat, Float> N = new a(Float.class, "thumbPos");
    private static final int[] O = {R.attr.state_checked};
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private final TextPaint F;
    private ColorStateList G;
    private Layout H;
    private Layout I;
    private TransformationMethod J;
    ObjectAnimator K;
    private final a0 L;
    private final Rect M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Drawable f2517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f2518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f2519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f2520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f2522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f2523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private PorterDuff.Mode f2524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2525i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2526j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2527k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f2528l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2529m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f2530n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f2531o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f2532p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f2533q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f2534r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2535s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f2536t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f2537u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private VelocityTracker f2538v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f2539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    float f2540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f2541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f2542z;

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f2540x);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f11) {
            switchCompat.setThumbPosition(f11.floatValue());
        }
    }

    public SwitchCompat(@NonNull Context context) {
        this(context, null);
    }

    private void a(boolean z11) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, N, z11 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        this.K = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.K.setAutoCancel(true);
        this.K.start();
    }

    private void b() {
        Drawable drawable = this.f2517a;
        if (drawable != null) {
            if (this.f2520d || this.f2521e) {
                Drawable drawableMutate = l5.a.r(drawable).mutate();
                this.f2517a = drawableMutate;
                if (this.f2520d) {
                    l5.a.o(drawableMutate, this.f2518b);
                }
                if (this.f2521e) {
                    l5.a.p(this.f2517a, this.f2519c);
                }
                if (this.f2517a.isStateful()) {
                    this.f2517a.setState(getDrawableState());
                }
            }
        }
    }

    private void c() {
        Drawable drawable = this.f2522f;
        if (drawable != null) {
            if (this.f2525i || this.f2526j) {
                Drawable drawableMutate = l5.a.r(drawable).mutate();
                this.f2522f = drawableMutate;
                if (this.f2525i) {
                    l5.a.o(drawableMutate, this.f2523g);
                }
                if (this.f2526j) {
                    l5.a.p(this.f2522f, this.f2524h);
                }
                if (this.f2522f.isStateful()) {
                    this.f2522f.setState(getDrawableState());
                }
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.K;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    private static float f(float f11, float f12, float f13) {
        if (f11 < f12) {
            return f12;
        }
        return f11 > f13 ? f13 : f11;
    }

    private boolean g(float f11, float f12) {
        if (this.f2517a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f2517a.getPadding(this.M);
        int i11 = this.C;
        int i12 = this.f2535s;
        int i13 = i11 - i12;
        int i14 = (this.B + thumbOffset) - i12;
        int i15 = this.A + i14;
        Rect rect = this.M;
        return f11 > ((float) i14) && f11 < ((float) (((i15 + rect.left) + rect.right) + i12)) && f12 > ((float) i13) && f12 < ((float) (this.E + i12));
    }

    private boolean getTargetCheckedState() {
        return this.f2540x > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((h1.b(this) ? 1.0f - this.f2540x : this.f2540x) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f2522f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.M;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f2517a;
        Rect rectC = drawable2 != null ? j0.c(drawable2) : j0.f2712c;
        return ((((this.f2541y - this.A) - rect.left) - rect.right) - rectC.left) - rectC.right;
    }

    private Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.J;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.F;
        return new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
    }

    private void i() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f2532p;
            if (string == null) {
                string = getResources().getString(i.h.f73847b);
            }
            ViewCompat.I0(this, string);
        }
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence string = this.f2531o;
            if (string == null) {
                string = getResources().getString(i.h.f73848c);
            }
            ViewCompat.I0(this, string);
        }
    }

    private void k(int i11, int i12) {
        Typeface typeface;
        if (i11 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i11 != 2) {
            typeface = i11 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        setSwitchTypeface(typeface, i12);
    }

    private void l(MotionEvent motionEvent) {
        this.f2534r = 0;
        boolean targetCheckedState = true;
        boolean z11 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z11) {
            this.f2538v.computeCurrentVelocity(1000);
            float xVelocity = this.f2538v.getXVelocity();
            if (Math.abs(xVelocity) <= this.f2539w) {
                targetCheckedState = getTargetCheckedState();
            } else if (!h1.b(this) ? xVelocity <= BitmapDescriptorFactory.HUE_RED : xVelocity >= BitmapDescriptorFactory.HUE_RED) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i11;
        int i12;
        Rect rect = this.M;
        int i13 = this.B;
        int i14 = this.C;
        int i15 = this.D;
        int i16 = this.E;
        int thumbOffset = getThumbOffset() + i13;
        Drawable drawable = this.f2517a;
        Rect rectC = drawable != null ? j0.c(drawable) : j0.f2712c;
        Drawable drawable2 = this.f2522f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i17 = rect.left;
            thumbOffset += i17;
            if (rectC != null) {
                int i18 = rectC.left;
                if (i18 > i17) {
                    i13 += i18 - i17;
                }
                int i19 = rectC.top;
                int i21 = rect.top;
                i11 = i19 > i21 ? (i19 - i21) + i14 : i14;
                int i22 = rectC.right;
                int i23 = rect.right;
                if (i22 > i23) {
                    i15 -= i22 - i23;
                }
                int i24 = rectC.bottom;
                int i25 = rect.bottom;
                if (i24 > i25) {
                    i12 = i16 - (i24 - i25);
                }
                this.f2522f.setBounds(i13, i11, i15, i12);
            } else {
                i11 = i14;
            }
            i12 = i16;
            this.f2522f.setBounds(i13, i11, i15, i12);
        }
        Drawable drawable3 = this.f2517a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i26 = thumbOffset - rect.left;
            int i27 = thumbOffset + this.A + rect.right;
            this.f2517a.setBounds(i26, i14, i27, i16);
            Drawable background = getBackground();
            if (background != null) {
                l5.a.l(background, i26, i14, i27, i16);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f11, float f12) {
        super.drawableHotspotChanged(f11, f12);
        Drawable drawable = this.f2517a;
        if (drawable != null) {
            l5.a.k(drawable, f11, f12);
        }
        Drawable drawable2 = this.f2522f;
        if (drawable2 != null) {
            l5.a.k(drawable2, f11, f12);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2517a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f2522f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!h1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2541y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f2529m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (h1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2541y;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f2529m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f2533q;
    }

    public boolean getSplitTrack() {
        return this.f2530n;
    }

    public int getSwitchMinWidth() {
        return this.f2528l;
    }

    public int getSwitchPadding() {
        return this.f2529m;
    }

    public CharSequence getTextOff() {
        return this.f2532p;
    }

    public CharSequence getTextOn() {
        return this.f2531o;
    }

    public Drawable getThumbDrawable() {
        return this.f2517a;
    }

    public int getThumbTextPadding() {
        return this.f2527k;
    }

    public ColorStateList getThumbTintList() {
        return this.f2518b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f2519c;
    }

    public Drawable getTrackDrawable() {
        return this.f2522f;
    }

    public ColorStateList getTrackTintList() {
        return this.f2523g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2524h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2517a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2522f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.K;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.K.end();
        this.K = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, O);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.M;
        Drawable drawable = this.f2522f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i11 = this.C;
        int i12 = this.E;
        int i13 = i11 + rect.top;
        int i14 = i12 - rect.bottom;
        Drawable drawable2 = this.f2517a;
        if (drawable != null) {
            if (!this.f2530n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectC = j0.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectC.left;
                rect.right -= rectC.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.H : this.I;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.G;
            if (colorStateList != null) {
                this.F.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.F.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i13 + i14) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f2531o : this.f2532p;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int iMax;
        int width;
        int paddingLeft;
        int i15;
        int paddingTop;
        int height;
        super.onLayout(z11, i11, i12, i13, i14);
        int iMax2 = 0;
        if (this.f2517a != null) {
            Rect rect = this.M;
            Drawable drawable = this.f2522f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectC = j0.c(this.f2517a);
            iMax = Math.max(0, rectC.left - rect.left);
            iMax2 = Math.max(0, rectC.right - rect.right);
        } else {
            iMax = 0;
        }
        if (h1.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f2541y + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f2541y) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                paddingTop = getPaddingTop();
                i15 = this.f2542z;
            } else {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f2542z;
            }
            this.B = paddingLeft;
            this.C = paddingTop;
            this.E = height;
            this.D = width;
        }
        int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
        i15 = this.f2542z;
        paddingTop = paddingTop2 - (i15 / 2);
        height = i15 + paddingTop;
        this.B = paddingLeft;
        this.C = paddingTop;
        this.E = height;
        this.D = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f2533q) {
            if (this.H == null) {
                this.H = h(this.f2531o);
            }
            if (this.I == null) {
                this.I = h(this.f2532p);
            }
        }
        Rect rect = this.M;
        Drawable drawable = this.f2517a;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f2517a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f2517a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.A = Math.max(this.f2533q ? Math.max(this.H.getWidth(), this.I.getWidth()) + (this.f2527k * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f2522f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f2522f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f2517a;
        if (drawable3 != null) {
            Rect rectC = j0.c(drawable3);
            iMax = Math.max(iMax, rectC.left);
            iMax2 = Math.max(iMax2, rectC.right);
        }
        int iMax3 = Math.max(this.f2528l, (this.A * 2) + iMax + iMax2);
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f2541y = iMax3;
        this.f2542z = iMax4;
        super.onMeasure(i11, i12);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f2531o : this.f2532p;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f11;
        this.f2538v.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            if (isEnabled() && g(x11, y11)) {
                this.f2534r = 1;
                this.f2536t = x11;
                this.f2537u = y11;
            }
        } else if (actionMasked == 1) {
            if (this.f2534r == 2) {
                l(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f2534r = 0;
            this.f2538v.clear();
        } else if (actionMasked == 2) {
            int i11 = this.f2534r;
            if (i11 == 1) {
                float x12 = motionEvent.getX();
                float y12 = motionEvent.getY();
                if (Math.abs(x12 - this.f2536t) > this.f2535s || Math.abs(y12 - this.f2537u) > this.f2535s) {
                    this.f2534r = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f2536t = x12;
                    this.f2537u = y12;
                    return true;
                }
            } else if (i11 == 2) {
                float x13 = motionEvent.getX();
                int thumbScrollRange = getThumbScrollRange();
                float f12 = x13 - this.f2536t;
                if (thumbScrollRange != 0) {
                    f11 = f12 / thumbScrollRange;
                } else {
                    f11 = f12 > BitmapDescriptorFactory.HUE_RED ? 1.0f : -1.0f;
                }
                if (h1.b(this)) {
                    f11 = -f11;
                }
                float f13 = f(this.f2540x + f11, BitmapDescriptorFactory.HUE_RED, 1.0f);
                if (f13 != this.f2540x) {
                    this.f2536t = x13;
                    setThumbPosition(f13);
                }
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.f2534r == 2) {
                l(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.f2534r = 0;
            this.f2538v.clear();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        super.setChecked(z11);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            j();
        } else {
            i();
        }
        if (getWindowToken() != null && ViewCompat.U(this)) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.m.t(this, callback));
    }

    public void setShowText(boolean z11) {
        if (this.f2533q != z11) {
            this.f2533q = z11;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z11) {
        this.f2530n = z11;
        invalidate();
    }

    public void setSwitchMinWidth(int i11) {
        this.f2528l = i11;
        requestLayout();
    }

    public void setSwitchPadding(int i11) {
        this.f2529m = i11;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i11) {
        b1 b1VarT = b1.t(context, i11, i.j.f73899f3);
        ColorStateList colorStateListC = b1VarT.c(i.j.f73919j3);
        if (colorStateListC != null) {
            this.G = colorStateListC;
        } else {
            this.G = getTextColors();
        }
        int iF = b1VarT.f(i.j.f73904g3, 0);
        if (iF != 0) {
            float f11 = iF;
            if (f11 != this.F.getTextSize()) {
                this.F.setTextSize(f11);
                requestLayout();
            }
        }
        k(b1VarT.k(i.j.f73909h3, -1), b1VarT.k(i.j.f73914i3, -1));
        if (b1VarT.a(i.j.f73944o3, false)) {
            this.J = new m.a(getContext());
        } else {
            this.J = null;
        }
        b1VarT.w();
    }

    public void setSwitchTypeface(Typeface typeface, int i11) {
        float f11 = BitmapDescriptorFactory.HUE_RED;
        if (i11 <= 0) {
            this.F.setFakeBoldText(false);
            this.F.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
            setSwitchTypeface(typeface);
            return;
        }
        Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typeface, i11);
        setSwitchTypeface(typefaceDefaultFromStyle);
        int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
        this.F.setFakeBoldText((i12 & 1) != 0);
        TextPaint textPaint = this.F;
        if ((i12 & 2) != 0) {
            f11 = -0.25f;
        }
        textPaint.setTextSkewX(f11);
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2532p = charSequence;
        requestLayout();
        if (isChecked()) {
            return;
        }
        i();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f2531o = charSequence;
        requestLayout();
        if (isChecked()) {
            j();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2517a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2517a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f11) {
        this.f2540x = f11;
        invalidate();
    }

    public void setThumbResource(int i11) {
        setThumbDrawable(j.a.b(getContext(), i11));
    }

    public void setThumbTextPadding(int i11) {
        this.f2527k = i11;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2518b = colorStateList;
        this.f2520d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f2519c = mode;
        this.f2521e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2522f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2522f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i11) {
        setTrackDrawable(j.a.b(getContext(), i11));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2523g = colorStateList;
        this.f2525i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2524h = mode;
        this.f2526j = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2517a || drawable == this.f2522f;
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.O);
    }

    public SwitchCompat(@NonNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f2518b = null;
        this.f2519c = null;
        this.f2520d = false;
        this.f2521e = false;
        this.f2523g = null;
        this.f2524h = null;
        this.f2525i = false;
        this.f2526j = false;
        this.f2538v = VelocityTracker.obtain();
        this.M = new Rect();
        w0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        b1 b1VarV = b1.v(context, attributeSet, i.j.Q2, i11, 0);
        ViewCompat.n0(this, context, i.j.Q2, attributeSet, b1VarV.r(), i11, 0);
        Drawable drawableG = b1VarV.g(i.j.T2);
        this.f2517a = drawableG;
        if (drawableG != null) {
            drawableG.setCallback(this);
        }
        Drawable drawableG2 = b1VarV.g(i.j.f73881c3);
        this.f2522f = drawableG2;
        if (drawableG2 != null) {
            drawableG2.setCallback(this);
        }
        this.f2531o = b1VarV.p(i.j.R2);
        this.f2532p = b1VarV.p(i.j.S2);
        this.f2533q = b1VarV.a(i.j.U2, true);
        this.f2527k = b1VarV.f(i.j.Z2, 0);
        this.f2528l = b1VarV.f(i.j.W2, 0);
        this.f2529m = b1VarV.f(i.j.X2, 0);
        this.f2530n = b1VarV.a(i.j.V2, false);
        ColorStateList colorStateListC = b1VarV.c(i.j.f73869a3);
        if (colorStateListC != null) {
            this.f2518b = colorStateListC;
            this.f2520d = true;
        }
        PorterDuff.Mode modeD = j0.d(b1VarV.k(i.j.f73875b3, -1), null);
        if (this.f2519c != modeD) {
            this.f2519c = modeD;
            this.f2521e = true;
        }
        if (this.f2520d || this.f2521e) {
            b();
        }
        ColorStateList colorStateListC2 = b1VarV.c(i.j.f73887d3);
        if (colorStateListC2 != null) {
            this.f2523g = colorStateListC2;
            this.f2525i = true;
        }
        PorterDuff.Mode modeD2 = j0.d(b1VarV.k(i.j.f73893e3, -1), null);
        if (this.f2524h != modeD2) {
            this.f2524h = modeD2;
            this.f2526j = true;
        }
        if (this.f2525i || this.f2526j) {
            c();
        }
        int iN = b1VarV.n(i.j.Y2, 0);
        if (iN != 0) {
            setSwitchTextAppearance(context, iN);
        }
        a0 a0Var = new a0(this);
        this.L = a0Var;
        a0Var.m(attributeSet, i11);
        b1VarV.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2535s = viewConfiguration.getScaledTouchSlop();
        this.f2539w = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.F.getTypeface() == null || this.F.getTypeface().equals(typeface)) && (this.F.getTypeface() != null || typeface == null)) {
            return;
        }
        this.F.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
