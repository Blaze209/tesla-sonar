package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import pt.c;
import st.g;
import st.k;
import st.n;
import zs.l;
import zs.m;

/* JADX INFO: loaded from: classes5.dex */
public class ShapeableImageView extends AppCompatImageView implements n {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f42217u = l.J;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final st.l f42218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f42219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f42220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f42221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f42222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Path f42223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ColorStateList f42224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f42225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private k f42226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f42227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Path f42228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f42230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f42231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f42232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f42233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f42234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f42235t;

    @TargetApi(21)
    class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f42236a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f42226k == null) {
                return;
            }
            if (ShapeableImageView.this.f42225j == null) {
                ShapeableImageView.this.f42225j = new g(ShapeableImageView.this.f42226k);
            }
            ShapeableImageView.this.f42219d.round(this.f42236a);
            ShapeableImageView.this.f42225j.setBounds(this.f42236a);
            ShapeableImageView.this.f42225j.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private void g(Canvas canvas) {
        if (this.f42224i == null) {
            return;
        }
        this.f42221f.setStrokeWidth(this.f42227l);
        int colorForState = this.f42224i.getColorForState(getDrawableState(), this.f42224i.getDefaultColor());
        if (this.f42227l <= BitmapDescriptorFactory.HUE_RED || colorForState == 0) {
            return;
        }
        this.f42221f.setColor(colorForState);
        canvas.drawPath(this.f42223h, this.f42221f);
    }

    private boolean h() {
        return (this.f42233r == Integer.MIN_VALUE && this.f42234s == Integer.MIN_VALUE) ? false : true;
    }

    private boolean i() {
        return getLayoutDirection() == 1;
    }

    private void j(int i11, int i12) {
        this.f42219d.set(getPaddingLeft(), getPaddingTop(), i11 - getPaddingRight(), i12 - getPaddingBottom());
        this.f42218c.d(this.f42226k, 1.0f, this.f42219d, this.f42223h);
        this.f42228m.rewind();
        this.f42228m.addPath(this.f42223h);
        this.f42220e.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i11, i12);
        this.f42228m.addRect(this.f42220e, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f42232q;
    }

    public final int getContentPaddingEnd() {
        int i11 = this.f42234s;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        return i() ? this.f42229n : this.f42231p;
    }

    public int getContentPaddingLeft() {
        int i11;
        int i12;
        if (h()) {
            if (i() && (i12 = this.f42234s) != Integer.MIN_VALUE) {
                return i12;
            }
            if (!i() && (i11 = this.f42233r) != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.f42229n;
    }

    public int getContentPaddingRight() {
        int i11;
        int i12;
        if (h()) {
            if (i() && (i12 = this.f42233r) != Integer.MIN_VALUE) {
                return i12;
            }
            if (!i() && (i11 = this.f42234s) != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.f42231p;
    }

    public final int getContentPaddingStart() {
        int i11 = this.f42233r;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        return i() ? this.f42231p : this.f42229n;
    }

    public int getContentPaddingTop() {
        return this.f42230o;
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @NonNull
    public k getShapeAppearanceModel() {
        return this.f42226k;
    }

    public ColorStateList getStrokeColor() {
        return this.f42224i;
    }

    public float getStrokeWidth() {
        return this.f42227l;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f42228m, this.f42222g);
        g(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (!this.f42235t && isLayoutDirectionResolved()) {
            this.f42235t = true;
            if (isPaddingRelative() || h()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        j(i11, i12);
    }

    public void setContentPadding(int i11, int i12, int i13, int i14) {
        this.f42233r = Integer.MIN_VALUE;
        this.f42234s = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f42229n) + i11, (super.getPaddingTop() - this.f42230o) + i12, (super.getPaddingRight() - this.f42231p) + i13, (super.getPaddingBottom() - this.f42232q) + i14);
        this.f42229n = i11;
        this.f42230o = i12;
        this.f42231p = i13;
        this.f42232q = i14;
    }

    public void setContentPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i11, (super.getPaddingTop() - this.f42230o) + i12, (super.getPaddingEnd() - getContentPaddingEnd()) + i13, (super.getPaddingBottom() - this.f42232q) + i14);
        this.f42229n = i() ? i13 : i11;
        this.f42230o = i12;
        if (!i()) {
            i11 = i13;
        }
        this.f42231p = i11;
        this.f42232q = i14;
    }

    @Override // android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(i11 + getContentPaddingLeft(), i12 + getContentPaddingTop(), i13 + getContentPaddingRight(), i14 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(i11 + getContentPaddingStart(), i12 + getContentPaddingTop(), i13 + getContentPaddingEnd(), i14 + getContentPaddingBottom());
    }

    @Override // st.n
    public void setShapeAppearanceModel(@NonNull k kVar) {
        this.f42226k = kVar;
        g gVar = this.f42225j;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f42224i = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i11) {
        setStrokeColor(j.a.a(getContext(), i11));
    }

    public void setStrokeWidth(float f11) {
        if (this.f42227l != f11) {
            this.f42227l = f11;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i11) {
        setStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, AttributeSet attributeSet, int i11) {
        int i12 = f42217u;
        super(wt.a.c(context, attributeSet, i11, i12), attributeSet, i11);
        this.f42218c = st.l.k();
        this.f42223h = new Path();
        this.f42235t = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f42222g = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f42219d = new RectF();
        this.f42220e = new RectF();
        this.f42228m = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, m.N7, i11, i12);
        setLayerType(2, null);
        this.f42224i = c.a(context2, typedArrayObtainStyledAttributes, m.V7);
        this.f42227l = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.W7, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.O7, 0);
        this.f42229n = dimensionPixelSize;
        this.f42230o = dimensionPixelSize;
        this.f42231p = dimensionPixelSize;
        this.f42232q = dimensionPixelSize;
        this.f42229n = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.R7, dimensionPixelSize);
        this.f42230o = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.U7, dimensionPixelSize);
        this.f42231p = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.S7, dimensionPixelSize);
        this.f42232q = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.P7, dimensionPixelSize);
        this.f42233r = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.T7, Integer.MIN_VALUE);
        this.f42234s = typedArrayObtainStyledAttributes.getDimensionPixelSize(m.Q7, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f42221f = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f42226k = k.e(context2, attributeSet, i11, i12).m();
        setOutlineProvider(new a());
    }
}
