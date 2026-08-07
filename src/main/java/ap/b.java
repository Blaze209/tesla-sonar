package ap;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lap/b;", "Landroid/text/style/LineHeightSpan;", "Lap/i;", "", Snapshot.HEIGHT, "<init>", "(F)V", "", "text", "", "start", "end", "spanstartv", "v", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "Ljn0/h0;", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "a", "I", "getLineHeight", "()I", "lineHeight", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements LineHeightSpan, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int lineHeight;

    public b(float f11) {
        this.lineHeight = (int) Math.ceil(f11);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartv, int v11, Paint.FontMetricsInt fm2) {
        s.k(text, "text");
        s.k(fm2, "fm");
        int i11 = this.lineHeight;
        int i12 = fm2.ascent;
        double d11 = (i11 - ((-i12) + fm2.descent)) / 2.0f;
        fm2.ascent = i12 - ((int) Math.ceil(d11));
        fm2.descent += (int) Math.floor(d11);
        if (start == 0) {
            fm2.top = fm2.ascent;
        }
        if (end == text.length()) {
            fm2.bottom = fm2.descent;
        }
    }
}
