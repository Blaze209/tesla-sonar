package l4;

import android.graphics.Paint;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/graphics/Paint$FontMetricsInt;", "", "a", "(Landroid/graphics/Paint$FontMetricsInt;)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {
    public static final int a(Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
