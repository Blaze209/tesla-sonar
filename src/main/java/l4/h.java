package l4;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b!\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001eR\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001eR$\u00100\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010\u001e\u001a\u0004\b\u001f\u0010/R$\u00102\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u0010\u001e\u001a\u0004\b \u0010/¨\u00063"}, d2 = {"Ll4/h;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "", "startIndex", "endIndex", "", "trimFirstLineTop", "trimLastLineBottom", "topRatio", "<init>", "(FIIZZF)V", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "Ljn0/h0;", "a", "(Landroid/graphics/Paint$FontMetricsInt;)V", "", "text", "start", "end", "spanStartVertical", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "b", "(IIZ)Ll4/h;", Gender.FEMALE, "getLineHeight", "()F", "I", "c", DateTokenConverter.CONVERTER_KEY, "Z", "e", "()Z", "f", "g", "firstAscent", "h", "ascent", IntegerTokenConverter.CONVERTER_KEY, "descent", "j", "lastDescent", "<set-?>", "k", "()I", "firstAscentDiff", "l", "lastDescentDiff", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements LineHeightSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float lineHeight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int endIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean trimFirstLineTop;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean trimLastLineBottom;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float topRatio;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int firstAscent = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int ascent = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int descent = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int lastDescent = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int firstAscentDiff;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int lastDescentDiff;

    public h(float f11, int i11, int i12, boolean z11, boolean z12, float f12) {
        this.lineHeight = f11;
        this.startIndex = i11;
        this.endIndex = i12;
        this.trimFirstLineTop = z11;
        this.trimLastLineBottom = z12;
        this.topRatio = f12;
        if ((BitmapDescriptorFactory.HUE_RED > f12 || f12 > 1.0f) && f12 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    private final void a(Paint.FontMetricsInt fontMetricsInt) {
        int iA = i.a(fontMetricsInt);
        int iCeil = (int) Math.ceil(this.lineHeight);
        int i11 = iCeil - iA;
        float fAbs = this.topRatio;
        if (fAbs == -1.0f) {
            fAbs = Math.abs(fontMetricsInt.ascent) / i.a(fontMetricsInt);
        }
        int iCeil2 = (int) (i11 <= 0 ? Math.ceil(i11 * fAbs) : Math.ceil(i11 * (1.0f - fAbs)));
        int i12 = fontMetricsInt.descent;
        int i13 = iCeil2 + i12;
        this.descent = i13;
        int i14 = i13 - iCeil;
        this.ascent = i14;
        if (this.trimFirstLineTop) {
            i14 = fontMetricsInt.ascent;
        }
        this.firstAscent = i14;
        if (this.trimLastLineBottom) {
            i13 = i12;
        }
        this.lastDescent = i13;
        this.firstAscentDiff = fontMetricsInt.ascent - i14;
        this.lastDescentDiff = i13 - i12;
    }

    public final h b(int startIndex, int endIndex, boolean trimFirstLineTop) {
        return new h(this.lineHeight, startIndex, endIndex, trimFirstLineTop, this.trimLastLineBottom, this.topRatio);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanStartVertical, int lineHeight, Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        boolean z11 = start == this.startIndex;
        boolean z12 = end == this.endIndex;
        if (z11 && z12 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            a(fontMetricsInt);
        }
        fontMetricsInt.ascent = z11 ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z12 ? this.lastDescent : this.descent;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }
}
