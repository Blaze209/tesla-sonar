package r4;

import android.text.Spannable;
import androidx.emoji2.text.i;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import i4.Placeholder;
import java.util.List;
import l4.j;
import p013kotlin.Metadata;
import w4.v;
import w4.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0015\u001a\u00020\u000b*\u00020\u00108BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u001b\u001a\u00020\u000b*\u00020\u00168BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroid/text/Spannable;", "", "Li4/d$c;", "Li4/w;", "placeholders", "Lw4/d;", "density", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Landroid/text/Spannable;Ljava/util/List;Lw4/d;)V", "placeholder", "", "start", "end", "c", "(Landroid/text/Spannable;Li4/w;IILw4/d;)V", "Lw4/v;", "a", "(J)I", "getSpanUnit--R2X_6o$annotations", "(J)V", "spanUnit", "Li4/x;", "b", "(I)I", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "spanVerticalAlign", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class b {
    private static final int a(long j11) {
        long jG = v.g(j11);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            return 0;
        }
        return x.g(jG, companion.a()) ? 1 : 2;
    }

    private static final int b(int i11) {
        i4.x.Companion companion = i4.x.INSTANCE;
        if (i4.x.i(i11, companion.a())) {
            return 0;
        }
        if (i4.x.i(i11, companion.g())) {
            return 1;
        }
        if (i4.x.i(i11, companion.b())) {
            return 2;
        }
        if (i4.x.i(i11, companion.c())) {
            return 3;
        }
        if (i4.x.i(i11, companion.f())) {
            return 4;
        }
        if (i4.x.i(i11, companion.d())) {
            return 5;
        }
        if (i4.x.i(i11, companion.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static final void c(Spannable spannable, Placeholder placeholder, int i11, int i12, w4.d dVar) {
        for (Object obj : spannable.getSpans(i11, i12, i.class)) {
            spannable.removeSpan((i) obj);
        }
        c.u(spannable, new j(v.h(placeholder.getWidth()), a(placeholder.getWidth()), v.h(placeholder.getHeight()), a(placeholder.getHeight()), dVar.getFontScale() * dVar.getDensity(), b(placeholder.getPlaceholderVerticalAlign())), i11, i12);
    }

    public static final void d(Spannable spannable, List<i4.d.Range<Placeholder>> list, w4.d dVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            i4.d.Range<Placeholder> range = list.get(i11);
            c(spannable, range.a(), range.getStart(), range.getEnd(), dVar);
        }
    }
}
