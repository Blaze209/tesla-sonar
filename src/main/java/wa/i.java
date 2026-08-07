package wa;

import androidx.room.b0;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aA\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/room/e;", "", "fromVersion", "toVersion", "", DateTokenConverter.CONVERTER_KEY, "(Landroidx/room/e;II)Z", "Landroidx/room/b0$e;", "startVersion", "endVersion", "a", "(Landroidx/room/b0$e;II)Z", "start", "end", "", "Lua/b;", "b", "(Landroidx/room/b0$e;II)Ljava/util/List;", "", "result", "upgrade", "c", "(Landroidx/room/b0$e;Ljava/util/List;ZII)Ljava/util/List;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {
    public static final boolean a(b0.e eVar, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(eVar, "<this>");
        Map<Integer, Map<Integer, ua.b>> mapE = eVar.e();
        if (!mapE.containsKey(Integer.valueOf(i11))) {
            return false;
        }
        Map<Integer, ua.b> mapI = mapE.get(Integer.valueOf(i11));
        if (mapI == null) {
            mapI = v0.i();
        }
        return mapI.containsKey(Integer.valueOf(i12));
    }

    public static final List<ua.b> b(b0.e eVar, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(eVar, "<this>");
        if (i11 == i12) {
            return v.m();
        }
        return c(eVar, new ArrayList(), i12 > i11, i11, i12);
    }

    private static final List<ua.b> c(b0.e eVar, List<ua.b> list, boolean z11, int i11, int i12) {
        int iIntValue;
        boolean z12;
        while (true) {
            if (z11) {
                if (i11 >= i12) {
                    return list;
                }
            } else if (i11 <= i12) {
                return list;
            }
            Pair<Map<Integer, ua.b>, Iterable<Integer>> pairF = z11 ? eVar.f(i11) : eVar.g(i11);
            if (pairF == null) {
                return null;
            }
            Map<Integer, ua.b> mapA = pairF.a();
            Iterator<Integer> it = pairF.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    iIntValue = i11;
                    z12 = false;
                    break;
                }
                iIntValue = it.next().intValue();
                if (!z11) {
                    if (i12 <= iIntValue && iIntValue < i11) {
                        ua.b bVar = mapA.get(Integer.valueOf(iIntValue));
                        p013kotlin.jvm.internal.s.h(bVar);
                        list.add(bVar);
                        z12 = true;
                        break;
                    }
                } else if (i11 + 1 <= iIntValue && iIntValue <= i12) {
                    ua.b bVar2 = mapA.get(Integer.valueOf(iIntValue));
                    p013kotlin.jvm.internal.s.h(bVar2);
                    list.add(bVar2);
                    z12 = true;
                    break;
                }
            }
            if (!z12) {
                return null;
            }
            i11 = iIntValue;
        }
    }

    public static final boolean d(androidx.room.e eVar, int i11, int i12) {
        p013kotlin.jvm.internal.s.k(eVar, "<this>");
        if (i11 > i12 && eVar.allowDestructiveMigrationOnDowngrade) {
            return false;
        }
        Set<Integer> setC = eVar.c();
        return eVar.requireMigration && (setC == null || !setC.contains(Integer.valueOf(i11)));
    }
}
