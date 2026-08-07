package u10;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.rncamerakit.k;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 :2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\rJ\u0017\u0010\u0019\u001a\u00020\u00062\b\b\u0001\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\b\b\u0001\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\"R\"\u0010+\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0016\u00100\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00104\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010/R\u0016\u00107\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010/¨\u0006;"}, d2 = {"Lu10/a;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "a", "()V", "Landroid/graphics/Canvas;", "canvas", "b", "(Landroid/graphics/Canvas;)V", "", "timeElapsed", "c", "(Landroid/graphics/Canvas;J)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onDraw", "borderColor", "setFrameColor", "(I)V", "laserColor", "setLaserColor", "Landroid/util/Size;", "size", "setFrameSize", "(Landroid/util/Size;)V", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "borderPaint", "laserPaint", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "getFrameRect", "()Landroid/graphics/Rect;", "setFrameRect", "(Landroid/graphics/Rect;)V", "frameRect", "Landroid/util/Size;", "barcodeFrameSize", "e", "I", "frameWidth", "f", "frameHeight", "g", "borderMargin", "h", "J", "previousFrameTime", IntegerTokenConverter.CONVERTER_KEY, "laserY", "j", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends View {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Size f115292k = new Size(300, 150);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Paint borderPaint;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Paint laserPaint;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Rect frameRect;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Size barcodeFrameSize;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int frameWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int frameHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int borderMargin;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long previousFrameTime;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int laserY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        s.k(context, "context");
        this.borderPaint = new Paint();
        this.laserPaint = new Paint();
        this.frameRect = new Rect();
        this.barcodeFrameSize = f115292k;
        this.previousFrameTime = System.currentTimeMillis();
        d(context);
    }

    private final void a() {
        float width = this.barcodeFrameSize.getWidth() * getContext().getResources().getDisplayMetrics().density;
        float height = this.barcodeFrameSize.getHeight() * getContext().getResources().getDisplayMetrics().density;
        this.frameWidth = Math.max(100, Math.min((int) width, getMeasuredWidth() - 80));
        this.frameHeight = Math.max(100, Math.min((int) height, getMeasuredHeight() - 80));
        this.frameRect.left = (getMeasuredWidth() / 2) - (this.frameWidth / 2);
        this.frameRect.right = (getMeasuredWidth() / 2) + (this.frameWidth / 2);
        this.frameRect.top = (getMeasuredHeight() / 2) - (this.frameHeight / 2);
        this.frameRect.bottom = (getMeasuredHeight() / 2) + (this.frameHeight / 2);
    }

    private final void b(Canvas canvas) {
        Rect rect = this.frameRect;
        int i11 = rect.left;
        int i12 = rect.top;
        canvas.drawLine(i11, i12, i11, i12 + this.borderMargin, this.borderPaint);
        Rect rect2 = this.frameRect;
        int i13 = rect2.left;
        int i14 = rect2.top;
        canvas.drawLine(i13, i14, i13 + this.borderMargin, i14, this.borderPaint);
        Rect rect3 = this.frameRect;
        int i15 = rect3.left;
        int i16 = rect3.bottom;
        canvas.drawLine(i15, i16, i15, i16 - this.borderMargin, this.borderPaint);
        Rect rect4 = this.frameRect;
        int i17 = rect4.left;
        int i18 = rect4.bottom;
        canvas.drawLine(i17, i18, i17 + this.borderMargin, i18, this.borderPaint);
        Rect rect5 = this.frameRect;
        int i19 = rect5.right;
        int i21 = rect5.top;
        canvas.drawLine(i19, i21, i19 - this.borderMargin, i21, this.borderPaint);
        Rect rect6 = this.frameRect;
        int i22 = rect6.right;
        int i23 = rect6.top;
        canvas.drawLine(i22, i23, i22, i23 + this.borderMargin, this.borderPaint);
        Rect rect7 = this.frameRect;
        int i24 = rect7.right;
        int i25 = rect7.bottom;
        canvas.drawLine(i24, i25, i24, i25 - this.borderMargin, this.borderPaint);
        Rect rect8 = this.frameRect;
        int i26 = rect8.right;
        int i27 = rect8.bottom;
        canvas.drawLine(i26, i27, i26 - this.borderMargin, i27, this.borderPaint);
    }

    private final void c(Canvas canvas, long timeElapsed) {
        int i11 = this.laserY;
        Rect rect = this.frameRect;
        if (i11 > rect.bottom || i11 < rect.top) {
            this.laserY = rect.top;
        }
        float f11 = rect.left + 5;
        int i12 = this.laserY;
        canvas.drawLine(f11, i12, rect.right - 5, i12, this.laserPaint);
        this.laserY += (int) (timeElapsed / ((long) 4));
    }

    private final void d(Context context) {
        Paint paint = new Paint();
        this.borderPaint = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.borderPaint.setStrokeWidth(5.0f);
        this.laserPaint.setStyle(style);
        this.laserPaint.setStrokeWidth(5.0f);
        this.borderMargin = context.getResources().getDimensionPixelSize(k.f49020a);
    }

    public final Rect getFrameRect() {
        return this.frameRect;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        s.k(canvas, "canvas");
        long jCurrentTimeMillis = System.currentTimeMillis() - this.previousFrameTime;
        super.onDraw(canvas);
        b(canvas);
        c(canvas, jCurrentTimeMillis);
        this.previousFrameTime = System.currentTimeMillis();
        invalidate(this.frameRect);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        a();
    }

    public final void setFrameColor(int borderColor) {
        this.borderPaint.setColor(borderColor);
    }

    public final void setFrameRect(Rect rect) {
        s.k(rect, "<set-?>");
        this.frameRect = rect;
    }

    public final void setFrameSize(Size size) {
        if (size == null) {
            size = f115292k;
        }
        this.barcodeFrameSize = size;
        a();
    }

    public final void setLaserColor(int laserColor) {
        this.laserPaint.setColor(laserColor);
    }
}
