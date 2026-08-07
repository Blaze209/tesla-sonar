package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
class a extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animation.AnimationListener f13921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13923c;

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.a$a, reason: collision with other inner class name */
    private static class C0234a extends OvalShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Paint f13924a = new Paint();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f13925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f13926c;

        C0234a(a aVar, int i11) {
            this.f13926c = aVar;
            this.f13925b = i11;
            a((int) rect().width());
        }

        private void a(int i11) {
            float f11 = i11 / 2;
            this.f13924a.setShader(new RadialGradient(f11, f11, this.f13925b, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width = this.f13926c.getWidth() / 2;
            float f11 = width;
            float height = this.f13926c.getHeight() / 2;
            canvas.drawCircle(f11, height, f11, this.f13924a);
            canvas.drawCircle(f11, height, width - this.f13925b, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f11, float f12) {
            super.onResize(f11, f12);
            a((int) f11);
        }
    }

    a(Context context) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f11 = getContext().getResources().getDisplayMetrics().density;
        int i11 = (int) (1.75f * f11);
        int i12 = (int) (BitmapDescriptorFactory.HUE_RED * f11);
        this.f13922b = (int) (3.5f * f11);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(db.a.f60352f);
        this.f13923c = typedArrayObtainStyledAttributes.getColor(db.a.f60353g, -328966);
        typedArrayObtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.x0(this, f11 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0234a(this, this.f13922b));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f13922b, i12, i11, 503316480);
            int i13 = this.f13922b;
            setPadding(i13, i13, i13, i13);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f13923c);
        ViewCompat.t0(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f13921a;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f13921a;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f13922b * 2), getMeasuredHeight() + (this.f13922b * 2));
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f13921a = animationListener;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i11);
            this.f13923c = i11;
        }
    }
}
