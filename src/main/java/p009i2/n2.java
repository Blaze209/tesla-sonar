package p009i2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.e;
import k3.p1;
import p013kotlin.Metadata;
import p020r2.l;
import p020r2.o;
import p020r2.y3;
import u1.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0012\u0010\u000eJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0013\u0010\u0011J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0014\u0010\u000eJ-\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0015\u0010\u000eJ\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Li2/n2;", "", "", "enabled", "Lr2/y3;", "Lk3/p1;", "h", "(ZLr2/l;I)Lr2/y3;", "a", IntegerTokenConverter.CONVERTER_KEY, AnalyticsAttribute.Error, "Lu1/j;", "interactionSource", "j", "(ZZLu1/j;Lr2/l;I)Lr2/y3;", "isError", DateTokenConverter.CONVERTER_KEY, "(ZZLr2/l;I)Lr2/y3;", "b", "e", "f", "c", "g", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface n2 {
    y3<p1> a(boolean z11, l lVar, int i11);

    default y3<p1> b(boolean z11, boolean z12, j jVar, l lVar, int i11) {
        lVar.o(-1036335134);
        if (o.J()) {
            o.S(-1036335134, i11, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:128)");
        }
        y3<p1> y3VarD = d(z11, z12, lVar, (i11 & 126) | ((i11 >> 3) & 896));
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarD;
    }

    y3<p1> c(boolean z11, boolean z12, j jVar, l lVar, int i11);

    @e
    y3<p1> d(boolean z11, boolean z12, l lVar, int i11);

    @e
    y3<p1> e(boolean z11, boolean z12, l lVar, int i11);

    default y3<p1> f(boolean z11, boolean z12, j jVar, l lVar, int i11) {
        lVar.o(454310320);
        if (o.J()) {
            o.S(454310320, i11, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:161)");
        }
        y3<p1> y3VarE = e(z11, z12, lVar, (i11 & 126) | ((i11 >> 3) & 896));
        if (o.J()) {
            o.R();
        }
        lVar.l();
        return y3VarE;
    }

    y3<p1> g(boolean z11, l lVar, int i11);

    y3<p1> h(boolean z11, l lVar, int i11);

    y3<p1> i(boolean z11, l lVar, int i11);

    y3<p1> j(boolean z11, boolean z12, j jVar, l lVar, int i11);
}
