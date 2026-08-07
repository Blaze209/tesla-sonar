package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w.z f117060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x.f f117061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f117062c;

    static final class a {
        static c0.b0 a(@NonNull w.z zVar) {
            Long l11 = (Long) zVar.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l11 != null) {
                return x.c.b(l11.longValue());
            }
            return null;
        }
    }

    j3(@NonNull w.z zVar) {
        this.f117060a = zVar;
        this.f117061b = x.f.a(zVar);
        int[] iArr = (int[]) zVar.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z11 = false;
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == 18) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f117062c = z11;
    }

    private static boolean a(@NonNull c0.b0 b0Var, @NonNull c0.b0 b0Var2) {
        u5.h.j(b0Var2.e(), "Fully specified range is not actually fully specified.");
        if (b0Var.b() == 2 && b0Var2.b() == 1) {
            return false;
        }
        if (b0Var.b() == 2 || b0Var.b() == 0 || b0Var.b() == b0Var2.b()) {
            return b0Var.a() == 0 || b0Var.a() == b0Var2.a();
        }
        return false;
    }

    private static boolean b(@NonNull c0.b0 b0Var, @NonNull c0.b0 b0Var2, @NonNull Set<c0.b0> set) {
        if (set.contains(b0Var2)) {
            return a(b0Var, b0Var2);
        }
        c0.y0.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", b0Var, b0Var2));
        return false;
    }

    private static c0.b0 c(@NonNull c0.b0 b0Var, @NonNull Collection<c0.b0> collection, @NonNull Set<c0.b0> set) {
        if (b0Var.b() == 1) {
            return null;
        }
        for (c0.b0 b0Var2 : collection) {
            u5.h.h(b0Var2, "Fully specified DynamicRange cannot be null.");
            int iB = b0Var2.b();
            u5.h.j(b0Var2.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (iB != 1 && b(b0Var, b0Var2, set)) {
                return b0Var2;
            }
        }
        return null;
    }

    private static boolean e(@NonNull c0.b0 b0Var) {
        return Objects.equals(b0Var, c0.b0.f18254c);
    }

    private static boolean f(@NonNull c0.b0 b0Var) {
        if (b0Var.b() == 2) {
            return true;
        }
        if (b0Var.b() == 0 || b0Var.a() != 0) {
            return b0Var.b() == 0 && b0Var.a() != 0;
        }
        return true;
    }

    private c0.b0 h(@NonNull c0.b0 b0Var, @NonNull Set<c0.b0> set, @NonNull Set<c0.b0> set2, @NonNull Set<c0.b0> set3, @NonNull String str) {
        c0.b0 b0VarA;
        if (b0Var.e()) {
            if (set.contains(b0Var)) {
                return b0Var;
            }
            return null;
        }
        int iB = b0Var.b();
        int iA = b0Var.a();
        if (iB == 1 && iA == 0) {
            c0.b0 b0Var2 = c0.b0.f18255d;
            if (set.contains(b0Var2)) {
                return b0Var2;
            }
            return null;
        }
        c0.b0 b0VarC = c(b0Var, set2, set);
        if (b0VarC != null) {
            c0.y0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, b0Var, b0VarC));
            return b0VarC;
        }
        c0.b0 b0VarC2 = c(b0Var, set3, set);
        if (b0VarC2 != null) {
            c0.y0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, b0Var, b0VarC2));
            return b0VarC2;
        }
        c0.b0 b0Var3 = c0.b0.f18255d;
        if (b(b0Var, b0Var3, set)) {
            c0.y0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, b0Var, b0Var3));
            return b0Var3;
        }
        if (iB == 2 && (iA == 10 || iA == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                b0VarA = a.a(this.f117060a);
                if (b0VarA != null) {
                    linkedHashSet.add(b0VarA);
                }
            } else {
                b0VarA = null;
            }
            linkedHashSet.add(c0.b0.f18257f);
            c0.b0 b0VarC3 = c(b0Var, linkedHashSet, set);
            if (b0VarC3 != null) {
                c0.y0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", str, b0VarC3.equals(b0VarA) ? "recommended" : "required", b0Var, b0VarC3));
                return b0VarC3;
            }
        }
        for (c0.b0 b0Var4 : set) {
            u5.h.j(b0Var4.e(), "Candidate dynamic range must be fully specified.");
            if (!b0Var4.equals(c0.b0.f18255d) && a(b0Var, b0Var4)) {
                c0.y0.a("DynamicRangeResolver", String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, b0Var, b0Var4));
                return b0Var4;
            }
        }
        return null;
    }

    private c0.b0 i(@NonNull Set<c0.b0> set, @NonNull Set<c0.b0> set2, @NonNull Set<c0.b0> set3, @NonNull androidx.camera.core.impl.o3<?> o3Var, @NonNull Set<c0.b0> set4) {
        c0.b0 b0VarW = o3Var.w();
        c0.b0 b0VarH = h(b0VarW, set4, set2, set3, o3Var.D());
        if (b0VarH == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", o3Var.D(), b0VarW, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        j(set4, b0VarH, this.f117061b);
        return b0VarH;
    }

    private static void j(@NonNull Set<c0.b0> set, @NonNull c0.b0 b0Var, @NonNull x.f fVar) {
        u5.h.j(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<c0.b0> setB = fVar.b(b0Var);
        if (setB.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(setB);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", b0Var, TextUtils.join("\n  ", setB), TextUtils.join("\n  ", hashSet)));
        }
    }

    boolean d() {
        return this.f117062c;
    }

    Map<androidx.camera.core.impl.o3<?>, c0.b0> g(@NonNull List<androidx.camera.core.impl.a> list, @NonNull List<androidx.camera.core.impl.o3<?>> list2, @NonNull List<Integer> list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<androidx.camera.core.impl.a> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().c());
        }
        Set<c0.b0> setC = this.f117061b.c();
        HashSet hashSet = new HashSet(setC);
        Iterator<c0.b0> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, it2.next(), this.f117061b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            androidx.camera.core.impl.o3<?> o3Var = list2.get(it3.next().intValue());
            c0.b0 b0VarW = o3Var.w();
            if (e(b0VarW)) {
                arrayList3.add(o3Var);
            } else if (f(b0VarW)) {
                arrayList2.add(o3Var);
            } else {
                arrayList.add(o3Var);
            }
        }
        HashMap map = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<androidx.camera.core.impl.o3<?>> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (androidx.camera.core.impl.o3<?> o3Var2 : arrayList4) {
            c0.b0 b0VarI = i(setC, linkedHashSet, linkedHashSet2, o3Var2, hashSet);
            map.put(o3Var2, b0VarI);
            if (!linkedHashSet.contains(b0VarI)) {
                linkedHashSet2.add(b0VarI);
            }
        }
        return map;
    }
}
