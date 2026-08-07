package k3;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a<\u0010\u000f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0016\u001a\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001d\u0010\u001e*\n\u0010\u001f\"\u00020\n2\u00020\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lj3/g;", "from", "to", "", "Lk3/p1;", "colors", "", "colorStops", "Lk3/l4;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "a", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "center", "b", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "", "c", "(Ljava/util/List;)I", "numTransparentColors", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/util/List;I)[I", "stops", "", "e", "(Ljava/util/List;Ljava/util/List;I)[F", "Ljn0/h0;", "f", "(Ljava/util/List;Ljava/util/List;)V", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x0 {
    public static final Shader a(long j11, long j12, List<p1> list, List<Float> list2, int i11) {
        f(list, list2);
        int iC = c(list);
        return new LinearGradient(j3.g.m(j11), j3.g.n(j11), j3.g.m(j12), j3.g.n(j12), d(list, iC), e(list2, list, iC), y0.a(i11));
    }

    public static final Shader b(long j11, List<p1> list, List<Float> list2) {
        f(list, list2);
        int iC = c(list);
        return new SweepGradient(j3.g.m(j11), j3.g.n(j11), d(list, iC), e(list2, list, iC));
    }

    public static final int c(List<p1> list) {
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int iO = p013kotlin.collections.v.o(list);
        for (int i12 = 1; i12 < iO; i12++) {
            if (p1.s(list.get(i12).getValue()) == BitmapDescriptorFactory.HUE_RED) {
                i11++;
            }
        }
        return i11;
    }

    public static final int[] d(List<p1> list, int i11) {
        int i12;
        int i13 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i13 < size) {
                iArr[i13] = r1.k(list.get(i13).getValue());
                i13++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i11];
        int iO = p013kotlin.collections.v.o(list);
        int size2 = list.size();
        int i14 = 0;
        while (i13 < size2) {
            long value = list.get(i13).getValue();
            if (p1.s(value) == BitmapDescriptorFactory.HUE_RED) {
                if (i13 == 0) {
                    i12 = i14 + 1;
                    iArr2[i14] = r1.k(p1.p(list.get(1).getValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
                } else if (i13 == iO) {
                    i12 = i14 + 1;
                    iArr2[i14] = r1.k(p1.p(list.get(i13 - 1).getValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
                } else {
                    int i15 = i14 + 1;
                    iArr2[i14] = r1.k(p1.p(list.get(i13 - 1).getValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
                    i14 += 2;
                    iArr2[i15] = r1.k(p1.p(list.get(i13 + 1).getValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null));
                }
                i14 = i12;
            } else {
                iArr2[i14] = r1.k(value);
                i14++;
            }
            i13++;
        }
        return iArr2;
    }

    public static final float[] e(List<Float> list, List<p1> list2, int i11) {
        if (i11 == 0) {
            if (list != null) {
                return p013kotlin.collections.v.j1(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i11];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int iO = p013kotlin.collections.v.o(list2);
        int i12 = 1;
        for (int i13 = 1; i13 < iO; i13++) {
            long value = list2.get(i13).getValue();
            float fFloatValue = list != null ? list.get(i13).floatValue() : i13 / p013kotlin.collections.v.o(list2);
            int i14 = i12 + 1;
            fArr[i12] = fFloatValue;
            if (p1.s(value) == BitmapDescriptorFactory.HUE_RED) {
                i12 += 2;
                fArr[i14] = fFloatValue;
            } else {
                i12 = i14;
            }
        }
        fArr[i12] = list != null ? list.get(p013kotlin.collections.v.o(list2)).floatValue() : 1.0f;
        return fArr;
    }

    private static final void f(List<p1> list, List<Float> list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}
