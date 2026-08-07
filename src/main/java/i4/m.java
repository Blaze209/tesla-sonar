package i4;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a<\u0010\u0010\u001a\u00020\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000e0\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0013\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"", "Li4/p;", "paragraphInfoList", "", "index", "a", "(Ljava/util/List;I)I", "", "y", "c", "(Ljava/util/List;F)I", "Li4/p0;", "range", "Lkotlin/Function1;", "Ljn0/h0;", "action", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;JLwn0/l;)V", "lineIndex", "b", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class m {
    public static final int a(List<ParagraphInfo> list, int i11) {
        byte b11;
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i13);
            if (paragraphInfo.getStartIndex() > i11) {
                b11 = 1;
            } else {
                b11 = paragraphInfo.getEndIndex() <= i11 ? (byte) -1 : (byte) 0;
            }
            if (b11 < 0) {
                i12 = i13 + 1;
            } else {
                if (b11 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int b(List<ParagraphInfo> list, int i11) {
        byte b11;
        int size = list.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i13);
            if (paragraphInfo.getStartLineIndex() > i11) {
                b11 = 1;
            } else {
                b11 = paragraphInfo.getEndLineIndex() <= i11 ? (byte) -1 : (byte) 0;
            }
            if (b11 < 0) {
                i12 = i13 + 1;
            } else {
                if (b11 <= 0) {
                    return i13;
                }
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int c(List<ParagraphInfo> list, float f11) {
        byte b11;
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f11 >= ((ParagraphInfo) p013kotlin.collections.v.A0(list)).getBottom()) {
            return p013kotlin.collections.v.o(list);
        }
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i12);
            if (paragraphInfo.getTop() > f11) {
                b11 = 1;
            } else {
                b11 = paragraphInfo.getBottom() <= f11 ? (byte) -1 : (byte) 0;
            }
            if (b11 < 0) {
                i11 = i12 + 1;
            } else {
                if (b11 <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final void d(List<ParagraphInfo> list, long j11, wn0.l<? super ParagraphInfo, jn0.h0> lVar) {
        int size = list.size();
        for (int iA = a(list, p0.l(j11)); iA < size; iA++) {
            ParagraphInfo paragraphInfo = list.get(iA);
            if (paragraphInfo.getStartIndex() >= p0.k(j11)) {
                return;
            }
            if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                lVar.invoke(paragraphInfo);
            }
        }
    }
}
