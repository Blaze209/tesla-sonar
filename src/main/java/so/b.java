package so;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u0088\u0001\u0004\u0092\u0001\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\r"}, d2 = {"Lso/b;", "", "", "", "edgeColors", "a", "([Ljava/lang/Integer;)[Ljava/lang/Integer;", "layoutDirection", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lso/h;", "c", "([Ljava/lang/Integer;ILandroid/content/Context;)Lso/h;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@vn0.b
public final class b {
    public static Integer[] a(Integer[] edgeColors) {
        s.k(edgeColors, "edgeColors");
        return edgeColors;
    }

    public static /* synthetic */ Integer[] b(Integer[] numArr, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i11 & 1) != 0) {
            numArr = new Integer[n.values().length];
        }
        return a(numArr);
    }

    public static final ColorEdges c(Integer[] numArr, int i11, Context context) {
        s.k(context, "context");
        int iIntValue = -16777216;
        if (i11 == 0) {
            Integer num = numArr[n.START.ordinal()];
            int iIntValue2 = (num == null && (num = numArr[n.LEFT.ordinal()]) == null && (num = numArr[n.HORIZONTAL.ordinal()]) == null && (num = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num.intValue();
            Integer num2 = numArr[n.BLOCK_START.ordinal()];
            int iIntValue3 = (num2 == null && (num2 = numArr[n.TOP.ordinal()]) == null && (num2 = numArr[n.BLOCK.ordinal()]) == null && (num2 = numArr[n.VERTICAL.ordinal()]) == null && (num2 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num2.intValue();
            Integer num3 = numArr[n.END.ordinal()];
            int iIntValue4 = (num3 == null && (num3 = numArr[n.RIGHT.ordinal()]) == null && (num3 = numArr[n.HORIZONTAL.ordinal()]) == null && (num3 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num3.intValue();
            Integer num4 = numArr[n.BLOCK_END.ordinal()];
            if (num4 == null && (num4 = numArr[n.BOTTOM.ordinal()]) == null && (num4 = numArr[n.BLOCK.ordinal()]) == null && (num4 = numArr[n.VERTICAL.ordinal()]) == null) {
                Integer num5 = numArr[n.ALL.ordinal()];
                if (num5 != null) {
                    iIntValue = num5.intValue();
                }
            } else {
                iIntValue = num4.intValue();
            }
            return new ColorEdges(iIntValue2, iIntValue3, iIntValue4, iIntValue);
        }
        if (i11 != 1) {
            throw new IllegalArgumentException("Expected resolved layout direction");
        }
        if (com.facebook.react.modules.i18nmanager.a.INSTANCE.a().d(context)) {
            Integer num6 = numArr[n.END.ordinal()];
            int iIntValue5 = (num6 == null && (num6 = numArr[n.RIGHT.ordinal()]) == null && (num6 = numArr[n.HORIZONTAL.ordinal()]) == null && (num6 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num6.intValue();
            Integer num7 = numArr[n.BLOCK_START.ordinal()];
            int iIntValue6 = (num7 == null && (num7 = numArr[n.TOP.ordinal()]) == null && (num7 = numArr[n.BLOCK.ordinal()]) == null && (num7 = numArr[n.VERTICAL.ordinal()]) == null && (num7 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num7.intValue();
            Integer num8 = numArr[n.START.ordinal()];
            int iIntValue7 = (num8 == null && (num8 = numArr[n.LEFT.ordinal()]) == null && (num8 = numArr[n.HORIZONTAL.ordinal()]) == null && (num8 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num8.intValue();
            Integer num9 = numArr[n.BLOCK_END.ordinal()];
            if (num9 == null && (num9 = numArr[n.BOTTOM.ordinal()]) == null && (num9 = numArr[n.BLOCK.ordinal()]) == null && (num9 = numArr[n.VERTICAL.ordinal()]) == null) {
                Integer num10 = numArr[n.ALL.ordinal()];
                if (num10 != null) {
                    iIntValue = num10.intValue();
                }
            } else {
                iIntValue = num9.intValue();
            }
            return new ColorEdges(iIntValue5, iIntValue6, iIntValue7, iIntValue);
        }
        Integer num11 = numArr[n.END.ordinal()];
        int iIntValue8 = (num11 == null && (num11 = numArr[n.LEFT.ordinal()]) == null && (num11 = numArr[n.HORIZONTAL.ordinal()]) == null && (num11 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num11.intValue();
        Integer num12 = numArr[n.BLOCK_START.ordinal()];
        int iIntValue9 = (num12 == null && (num12 = numArr[n.TOP.ordinal()]) == null && (num12 = numArr[n.BLOCK.ordinal()]) == null && (num12 = numArr[n.VERTICAL.ordinal()]) == null && (num12 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num12.intValue();
        Integer num13 = numArr[n.START.ordinal()];
        int iIntValue10 = (num13 == null && (num13 = numArr[n.RIGHT.ordinal()]) == null && (num13 = numArr[n.HORIZONTAL.ordinal()]) == null && (num13 = numArr[n.ALL.ordinal()]) == null) ? -16777216 : num13.intValue();
        Integer num14 = numArr[n.BLOCK_END.ordinal()];
        if (num14 == null && (num14 = numArr[n.BOTTOM.ordinal()]) == null && (num14 = numArr[n.BLOCK.ordinal()]) == null && (num14 = numArr[n.VERTICAL.ordinal()]) == null) {
            Integer num15 = numArr[n.ALL.ordinal()];
            if (num15 != null) {
                iIntValue = num15.intValue();
            }
        } else {
            iIntValue = num14.intValue();
        }
        return new ColorEdges(iIntValue8, iIntValue9, iIntValue10, iIntValue);
    }
}
