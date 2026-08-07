package ll;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001aR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lll/i;", "Lll/g;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "rotationAngle", "exifOrientation", "<init>", "(Landroid/graphics/drawable/Drawable;II)V", "Landroid/graphics/Canvas;", "canvas", "Ljn0/h0;", "draw", "(Landroid/graphics/Canvas;)V", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/Matrix;", "transform", "m", "(Landroid/graphics/Matrix;)V", "e", "Landroid/graphics/Matrix;", "getMRotationMatrix$annotations", "()V", "mRotationMatrix", "f", "I", "g", "h", "tempMatrix", "Landroid/graphics/RectF;", IntegerTokenConverter.CONVERTER_KEY, "Landroid/graphics/RectF;", "tempRectF", "drawee_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final Matrix mRotationMatrix;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int rotationAngle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int exifOrientation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Matrix tempMatrix;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final RectF tempRectF;

    public i(Drawable drawable, int i11, int i12) {
        super(drawable);
        this.mRotationMatrix = new Matrix();
        this.rotationAngle = i11 - (i11 % 90);
        this.exifOrientation = (i12 < 0 || i12 > 8) ? 0 : i12;
        this.tempMatrix = new Matrix();
        this.tempRectF = new RectF();
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i11;
        p013kotlin.jvm.internal.s.k(canvas, "canvas");
        if (this.rotationAngle <= 0 && ((i11 = this.exifOrientation) == 0 || i11 == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.mRotationMatrix);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i11 = this.exifOrientation;
        return (i11 == 5 || i11 == 7 || this.rotationAngle % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i11 = this.exifOrientation;
        return (i11 == 5 || i11 == 7 || this.rotationAngle % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // ll.g, ll.g0
    public void m(Matrix transform) {
        p013kotlin.jvm.internal.s.k(transform, "transform");
        u(transform);
        if (this.mRotationMatrix.isIdentity()) {
            return;
        }
        transform.preConcat(this.mRotationMatrix);
    }

    @Override // ll.g, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        int i11;
        p013kotlin.jvm.internal.s.k(bounds, "bounds");
        Drawable current = getCurrent();
        if (current == null) {
            return;
        }
        int i12 = this.rotationAngle;
        if (i12 <= 0 && ((i11 = this.exifOrientation) == 0 || i11 == 1)) {
            current.setBounds(bounds);
            return;
        }
        int i13 = this.exifOrientation;
        if (i13 == 2) {
            this.mRotationMatrix.setScale(-1.0f, 1.0f);
        } else if (i13 == 7) {
            this.mRotationMatrix.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.mRotationMatrix.postScale(-1.0f, 1.0f);
        } else if (i13 == 4) {
            this.mRotationMatrix.setScale(1.0f, -1.0f);
        } else if (i13 != 5) {
            this.mRotationMatrix.setRotate(i12, bounds.centerX(), bounds.centerY());
        } else {
            this.mRotationMatrix.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            this.mRotationMatrix.postScale(1.0f, -1.0f);
        }
        this.tempMatrix.reset();
        this.mRotationMatrix.invert(this.tempMatrix);
        this.tempRectF.set(bounds);
        this.tempMatrix.mapRect(this.tempRectF);
        RectF rectF = this.tempRectF;
        current.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
