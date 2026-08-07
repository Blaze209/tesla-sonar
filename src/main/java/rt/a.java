package rt;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import k5.d;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f109198i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float[] f109199j = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f109200k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float[] f109201l = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final Paint f109202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final Paint f109203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final Paint f109204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f109205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f109206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f109207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f109208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f109209h;

    public a() {
        this(-16777216);
    }

    public void a(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i11, float f11, float f12) {
        float f13;
        boolean z11 = f12 < BitmapDescriptorFactory.HUE_RED;
        Path path = this.f109208g;
        if (z11) {
            int[] iArr = f109200k;
            iArr[0] = 0;
            iArr[1] = this.f109207f;
            iArr[2] = this.f109206e;
            iArr[3] = this.f109205d;
            f13 = f11;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f13 = f11;
            path.arcTo(rectF, f13, f12);
            path.close();
            float f14 = -i11;
            rectF.inset(f14, f14);
            int[] iArr2 = f109200k;
            iArr2[0] = 0;
            iArr2[1] = this.f109205d;
            iArr2[2] = this.f109206e;
            iArr2[3] = this.f109207f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f15 = 1.0f - (i11 / fWidth);
        float[] fArr = f109201l;
        fArr[1] = f15;
        fArr[2] = ((1.0f - f15) / 2.0f) + f15;
        this.f109203b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f109200k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z11) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f109209h);
        }
        canvas.drawArc(rectF, f13, f12, true, this.f109203b);
        canvas.restore();
    }

    public void b(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i11) {
        rectF.bottom += i11;
        rectF.offset(BitmapDescriptorFactory.HUE_RED, -i11);
        int[] iArr = f109198i;
        iArr[0] = this.f109207f;
        iArr[1] = this.f109206e;
        iArr[2] = this.f109205d;
        Paint paint = this.f109204c;
        float f11 = rectF.left;
        paint.setShader(new LinearGradient(f11, rectF.top, f11, rectF.bottom, iArr, f109199j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f109204c);
        canvas.restore();
    }

    @NonNull
    public Paint c() {
        return this.f109202a;
    }

    public void d(int i11) {
        this.f109205d = d.l(i11, 68);
        this.f109206e = d.l(i11, 20);
        this.f109207f = d.l(i11, 0);
        this.f109202a.setColor(this.f109205d);
    }

    public a(int i11) {
        this.f109208g = new Path();
        Paint paint = new Paint();
        this.f109209h = paint;
        this.f109202a = new Paint();
        d(i11);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f109203b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f109204c = new Paint(paint2);
    }
}
