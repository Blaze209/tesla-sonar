package z3;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ)\u0010\f\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tJ)\u0010\r\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\tJ,\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0011\u001a\u00020\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lz3/i0;", "", "Lz3/r;", "", "Lz3/q;", "measurables", "", Snapshot.HEIGHT, "g", "(Lz3/r;Ljava/util/List;I)I", Snapshot.WIDTH, "j", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "Lz3/k0;", "Lz3/h0;", "Lw4/b;", CryptoServicesPermission.CONSTRAINTS, "Lz3/j0;", "measure", "(Lz3/k0;Ljava/util/List;Lw4/b;)Lz3/j0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface i0 {
    j0 c(k0 k0Var, List<? extends h0> list, long j11);

    default int d(r rVar, List<? extends q> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new m(list.get(i12), s.Max, t.Width));
        }
        return c(new u(rVar, rVar.getLayoutDirection()), arrayList, w4.c.b(0, 0, 0, i11, 7, null)).getF126790a();
    }

    default int g(r rVar, List<? extends q> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new m(list.get(i12), s.Min, t.Width));
        }
        return c(new u(rVar, rVar.getLayoutDirection()), arrayList, w4.c.b(0, 0, 0, i11, 7, null)).getF126790a();
    }

    default int i(r rVar, List<? extends q> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new m(list.get(i12), s.Max, t.Height));
        }
        return c(new u(rVar, rVar.getLayoutDirection()), arrayList, w4.c.b(0, i11, 0, 0, 13, null)).getF126791b();
    }

    default int j(r rVar, List<? extends q> list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(new m(list.get(i12), s.Min, t.Height));
        }
        return c(new u(rVar, rVar.getLayoutDirection()), arrayList, w4.c.b(0, i11, 0, 0, 13, null)).getF126791b();
    }
}
