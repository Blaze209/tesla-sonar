package p3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u001a;\u0010\n\u001a\u00020\t*\u00020\u00002\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a-\u0010\u000f\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "Ljava/util/ArrayList;", "Lp3/h;", "Lkotlin/collections/ArrayList;", "nodes", "", "args", "", "count", "Ljn0/h0;", "a", "(CLjava/util/ArrayList;[FI)V", "", "b", "(Ljava/util/List;[FI)V", "c", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class i {
    public static final void a(char c11, ArrayList<h> arrayList, float[] fArr, int i11) {
        if (c11 == 'z' || c11 == 'Z') {
            arrayList.add(h.b.f100957c);
            return;
        }
        if (c11 == 'm') {
            c(arrayList, fArr, i11);
            return;
        }
        if (c11 == 'M') {
            b(arrayList, fArr, i11);
            return;
        }
        int i12 = 0;
        if (c11 == 'l') {
            int i13 = i11 - 2;
            while (i12 <= i13) {
                arrayList.add(new h.RelativeLineTo(fArr[i12], fArr[i12 + 1]));
                i12 += 2;
            }
            return;
        }
        if (c11 == 'L') {
            int i14 = i11 - 2;
            while (i12 <= i14) {
                arrayList.add(new h.LineTo(fArr[i12], fArr[i12 + 1]));
                i12 += 2;
            }
            return;
        }
        if (c11 == 'h') {
            int i15 = i11 - 1;
            while (i12 <= i15) {
                arrayList.add(new h.RelativeHorizontalTo(fArr[i12]));
                i12++;
            }
            return;
        }
        if (c11 == 'H') {
            int i16 = i11 - 1;
            while (i12 <= i16) {
                arrayList.add(new h.HorizontalTo(fArr[i12]));
                i12++;
            }
            return;
        }
        if (c11 == 'v') {
            int i17 = i11 - 1;
            while (i12 <= i17) {
                arrayList.add(new h.RelativeVerticalTo(fArr[i12]));
                i12++;
            }
            return;
        }
        if (c11 == 'V') {
            int i18 = i11 - 1;
            while (i12 <= i18) {
                arrayList.add(new h.VerticalTo(fArr[i12]));
                i12++;
            }
            return;
        }
        if (c11 == 'c') {
            int i19 = i11 - 6;
            while (i12 <= i19) {
                arrayList.add(new h.RelativeCurveTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3], fArr[i12 + 4], fArr[i12 + 5]));
                i12 += 6;
            }
            return;
        }
        if (c11 == 'C') {
            int i21 = i11 - 6;
            while (i12 <= i21) {
                arrayList.add(new h.CurveTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3], fArr[i12 + 4], fArr[i12 + 5]));
                i12 += 6;
            }
            return;
        }
        if (c11 == 's') {
            int i22 = i11 - 4;
            while (i12 <= i22) {
                arrayList.add(new h.RelativeReflectiveCurveTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                i12 += 4;
            }
            return;
        }
        if (c11 == 'S') {
            int i23 = i11 - 4;
            while (i12 <= i23) {
                arrayList.add(new h.ReflectiveCurveTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                i12 += 4;
            }
            return;
        }
        if (c11 == 'q') {
            int i24 = i11 - 4;
            while (i12 <= i24) {
                arrayList.add(new h.RelativeQuadTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                i12 += 4;
            }
            return;
        }
        if (c11 == 'Q') {
            int i25 = i11 - 4;
            while (i12 <= i25) {
                arrayList.add(new h.QuadTo(fArr[i12], fArr[i12 + 1], fArr[i12 + 2], fArr[i12 + 3]));
                i12 += 4;
            }
            return;
        }
        if (c11 == 't') {
            int i26 = i11 - 2;
            while (i12 <= i26) {
                arrayList.add(new h.RelativeReflectiveQuadTo(fArr[i12], fArr[i12 + 1]));
                i12 += 2;
            }
            return;
        }
        if (c11 == 'T') {
            int i27 = i11 - 2;
            while (i12 <= i27) {
                arrayList.add(new h.ReflectiveQuadTo(fArr[i12], fArr[i12 + 1]));
                i12 += 2;
            }
            return;
        }
        if (c11 == 'a') {
            int i28 = i11 - 7;
            for (int i29 = 0; i29 <= i28; i29 += 7) {
                arrayList.add(new h.RelativeArcTo(fArr[i29], fArr[i29 + 1], fArr[i29 + 2], Float.compare(fArr[i29 + 3], BitmapDescriptorFactory.HUE_RED) != 0, Float.compare(fArr[i29 + 4], BitmapDescriptorFactory.HUE_RED) != 0, fArr[i29 + 5], fArr[i29 + 6]));
            }
            return;
        }
        if (c11 != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c11);
        }
        int i31 = i11 - 7;
        for (int i32 = 0; i32 <= i31; i32 += 7) {
            arrayList.add(new h.ArcTo(fArr[i32], fArr[i32 + 1], fArr[i32 + 2], Float.compare(fArr[i32 + 3], BitmapDescriptorFactory.HUE_RED) != 0, Float.compare(fArr[i32 + 4], BitmapDescriptorFactory.HUE_RED) != 0, fArr[i32 + 5], fArr[i32 + 6]));
        }
    }

    private static final void b(List<h> list, float[] fArr, int i11) {
        int i12 = i11 - 2;
        if (i12 >= 0) {
            list.add(new h.MoveTo(fArr[0], fArr[1]));
            for (int i13 = 2; i13 <= i12; i13 += 2) {
                list.add(new h.LineTo(fArr[i13], fArr[i13 + 1]));
            }
        }
    }

    private static final void c(List<h> list, float[] fArr, int i11) {
        int i12 = i11 - 2;
        if (i12 >= 0) {
            list.add(new h.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i13 = 2; i13 <= i12; i13 += 2) {
                list.add(new h.RelativeLineTo(fArr[i13], fArr[i13 + 1]));
            }
        }
    }
}
