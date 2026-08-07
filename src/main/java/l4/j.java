package l4;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 52\u00020\u0001:\u0001\u001fB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JY\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b#\u0010'R$\u0010,\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00128\u0006@BX\u0086.¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001f\u0010+R$\u0010.\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b$\u0010'R$\u00100\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b!\u0010'R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00066"}, d2 = {"Ll4/j;", "Landroid/text/style/ReplacementSpan;", "", Snapshot.WIDTH, "", "widthUnit", Snapshot.HEIGHT, "heightUnit", "pxPerSp", "verticalAlign", "<init>", "(FIFIFI)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", "x", "top", "y", "bottom", "Ljn0/h0;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "a", Gender.FEMALE, "b", "I", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "()I", "<set-?>", "g", "Landroid/graphics/Paint$FontMetricsInt;", "()Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "h", "widthPx", IntegerTokenConverter.CONVERTER_KEY, "heightPx", "", "j", "Z", "isLaidOut", "k", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends ReplacementSpan {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f89622l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int widthUnit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float height;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int heightUnit;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float pxPerSp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int verticalAlign;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Paint.FontMetricsInt fontMetrics;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int widthPx;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int heightPx;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isLaidOut;

    public j(float f11, int i11, float f12, int i12, float f13, int i13) {
        this.width = f11;
        this.widthUnit = i11;
        this.height = f12;
        this.heightUnit = i12;
        this.pxPerSp = f13;
        this.verticalAlign = i13;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        s.B("fontMetrics");
        return null;
    }

    public final int b() {
        if (this.isLaidOut) {
            return this.heightPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int d() {
        if (this.isLaidOut) {
            return this.widthPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    @SuppressLint({"DocumentExceptions"})
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm2) {
        float f11;
        int iA;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        int i11 = this.widthUnit;
        if (i11 == 0) {
            f11 = this.width * this.pxPerSp;
        } else {
            if (i11 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            f11 = this.width * textSize;
        }
        this.widthPx = k.a(f11);
        int i12 = this.heightUnit;
        if (i12 == 0) {
            iA = k.a(this.height * this.pxPerSp);
        } else {
            if (i12 != 1) {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            iA = k.a(this.height * textSize);
        }
        this.heightPx = iA;
        if (fm2 != null) {
            fm2.ascent = a().ascent;
            fm2.descent = a().descent;
            fm2.leading = a().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm2.ascent > (-b())) {
                        fm2.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (fm2.ascent + b() > fm2.descent) {
                        fm2.descent = fm2.ascent + b();
                    }
                    break;
                case 2:
                case 5:
                    if (fm2.ascent > fm2.descent - b()) {
                        fm2.ascent = fm2.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fm2.descent - fm2.ascent < b()) {
                        int iB = fm2.ascent - ((b() - (fm2.descent - fm2.ascent)) / 2);
                        fm2.ascent = iB;
                        fm2.descent = iB + b();
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown verticalAlign.");
            }
            fm2.top = Math.min(a().top, fm2.ascent);
            fm2.bottom = Math.max(a().bottom, fm2.descent);
        }
        return d();
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x11, int top, int y11, int bottom, Paint paint) {
    }
}
