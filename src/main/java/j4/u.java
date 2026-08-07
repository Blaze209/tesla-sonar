package j4;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "text", "Landroid/text/TextPaint;", "paint", "", "c", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)F", "desiredWidth", "charSequence", "textPaint", "", "e", "(FLjava/lang/CharSequence;Landroid/text/TextPaint;)Z", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u {
    public static final float c(CharSequence charSequence, TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        int i11 = 0;
        lineInstance.setText(new n(charSequence, 0, charSequence.length()));
        PriorityQueue<Pair> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: j4.t
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return u.d((Pair) obj, (Pair) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i12 = i11;
            i11 = next;
            if (i11 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i12), Integer.valueOf(i11)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.f()).intValue() - ((Number) pair.e()).intValue() < i11 - i12) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i12), Integer.valueOf(i11)));
                }
            }
            next = lineInstance.next();
        }
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (Pair pair2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) pair2.a()).intValue(), ((Number) pair2.b()).intValue(), textPaint));
        }
        return fMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(Pair pair, Pair pair2) {
        return (((Number) pair.f()).intValue() - ((Number) pair.e()).intValue()) - (((Number) pair2.f()).intValue() - ((Number) pair2.e()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(float f11, CharSequence charSequence, TextPaint textPaint) {
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (x.a(spanned, l4.f.class) || x.a(spanned, l4.e.class)) {
                return true;
            }
        }
        return textPaint.getLetterSpacing() != BitmapDescriptorFactory.HUE_RED;
    }
}
