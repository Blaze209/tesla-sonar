package z0;

import android.annotation.SuppressLint;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<x> f126067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f126068b;

    a0(@NonNull List<x> list, @NonNull p pVar) {
        u5.h.b((list.isEmpty() && pVar == p.f126201a) ? false : true, "No preferred quality and fallback strategy.");
        this.f126067a = Collections.unmodifiableList(new ArrayList(list));
        this.f126068b = pVar;
    }

    private void a(@NonNull List<x> list, @NonNull Set<x> set) {
        if (list.isEmpty() || set.containsAll(list)) {
            return;
        }
        c0.y0.a("QualitySelector", "Select quality by fallbackStrategy = " + this.f126068b);
        p pVar = this.f126068b;
        if (pVar == p.f126201a) {
            return;
        }
        u5.h.j(pVar instanceof p.b, "Currently only support type RuleStrategy");
        p.b bVar = (p.b) this.f126068b;
        List<x> listB = x.b();
        x xVarB = bVar.b() == x.f126362f ? listB.get(0) : bVar.b() == x.f126361e ? listB.get(listB.size() - 1) : bVar.b();
        u5.h.i(listB.indexOf(xVarB) != -1);
        ArrayList arrayList = new ArrayList();
        for (int i11 = r4 - 1; i11 >= 0; i11--) {
            x xVar = listB.get(i11);
            if (list.contains(xVar)) {
                arrayList.add(xVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = r4 + 1; i12 < listB.size(); i12++) {
            x xVar2 = listB.get(i12);
            if (list.contains(xVar2)) {
                arrayList2.add(xVar2);
            }
        }
        c0.y0.a("QualitySelector", "sizeSortedQualities = " + listB + ", fallback quality = " + xVarB + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
        int iC = bVar.c();
        if (iC != 0) {
            if (iC == 1) {
                set.addAll(arrayList);
                set.addAll(arrayList2);
                return;
            }
            if (iC == 2) {
                set.addAll(arrayList);
                return;
            }
            if (iC != 3) {
                if (iC == 4) {
                    set.addAll(arrayList2);
                    return;
                }
                throw new AssertionError("Unhandled fallback strategy: " + this.f126068b);
            }
            set.addAll(arrayList2);
            set.addAll(arrayList);
        }
    }

    private static void b(@NonNull List<x> list) {
        for (x xVar : list) {
            u5.h.b(x.a(xVar), "qualities contain invalid quality: " + xVar);
        }
    }

    private static void c(@NonNull x xVar) {
        u5.h.b(x.a(xVar), "Invalid quality: " + xVar);
    }

    @NonNull
    public static a0 d(@NonNull x xVar, @NonNull p pVar) {
        u5.h.h(xVar, "quality cannot be null");
        u5.h.h(pVar, "fallbackStrategy cannot be null");
        c(xVar);
        return new a0(Collections.singletonList(xVar), pVar);
    }

    @NonNull
    public static a0 e(@NonNull List<x> list, @NonNull p pVar) {
        u5.h.h(list, "qualities cannot be null");
        u5.h.h(pVar, "fallbackStrategy cannot be null");
        u5.h.b(!list.isEmpty(), "qualities cannot be empty");
        b(list);
        return new a0(list, pVar);
    }

    @NonNull
    private static Size g(@NonNull b1.i iVar) {
        androidx.camera.core.impl.j1.c cVarK = iVar.k();
        return new Size(cVarK.k(), cVarK.h());
    }

    @NonNull
    public static Map<x, Size> h(@NonNull j1 j1Var, @NonNull c0.b0 b0Var) {
        HashMap map = new HashMap();
        for (x xVar : j1Var.f(b0Var)) {
            b1.i iVarE = j1Var.e(xVar, b0Var);
            Objects.requireNonNull(iVarE);
            map.put(xVar, g(iVarE));
        }
        return map;
    }

    @NonNull
    @SuppressLint({"UsesNonDefaultVisibleForTesting"})
    public List<x> f(@NonNull List<x> list) {
        if (list.isEmpty()) {
            c0.y0.l("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        c0.y0.a("QualitySelector", "supportedQualities = " + list);
        Set<x> linkedHashSet = new LinkedHashSet<>();
        for (x xVar : this.f126067a) {
            if (xVar == x.f126362f) {
                linkedHashSet.addAll(list);
                break;
            }
            if (xVar == x.f126361e) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(xVar)) {
                linkedHashSet.add(xVar);
            } else {
                c0.y0.l("QualitySelector", "quality is not supported and will be ignored: " + xVar);
            }
        }
        a(list, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    @NonNull
    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f126067a + ", fallbackStrategy=" + this.f126068b + "}";
    }
}
