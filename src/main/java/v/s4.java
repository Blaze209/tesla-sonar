package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.camera.core.impl.x0.a<Long> f117261a = androidx.camera.core.impl.x0.a.a("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Long, Set<androidx.camera.core.impl.p3.b>> f117262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Long, Set<androidx.camera.core.impl.p3.b>> f117263c;

    static {
        HashMap map = new HashMap();
        f117262b = map;
        HashMap map2 = new HashMap();
        f117263c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.p3.b bVar = androidx.camera.core.impl.p3.b.PREVIEW;
            hashSet.add(bVar);
            androidx.camera.core.impl.p3.b bVar2 = androidx.camera.core.impl.p3.b.METERING_REPEATING;
            hashSet.add(bVar2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(bVar2);
            hashSet2.add(androidx.camera.core.impl.p3.b.IMAGE_ANALYSIS);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            androidx.camera.core.impl.p3.b bVar3 = androidx.camera.core.impl.p3.b.IMAGE_CAPTURE;
            hashSet3.add(bVar3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            androidx.camera.core.impl.p3.b bVar4 = androidx.camera.core.impl.p3.b.VIDEO_CAPTURE;
            hashSet4.add(bVar4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar3);
            hashSet5.add(bVar4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar4);
            map2.put(3L, hashSet6);
        }
    }

    public static boolean a(@NonNull Map<Integer, androidx.camera.core.impl.a> map, @NonNull Map<Integer, androidx.camera.core.impl.o3<?>> map2, @NonNull List<androidx.camera.core.impl.e3> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jF = list.get(i11).f();
            if (map.containsKey(Integer.valueOf(i11))) {
                androidx.camera.core.impl.a aVar = map.get(Integer.valueOf(i11));
                if (!g(aVar.b().size() == 1 ? aVar.b().get(0) : androidx.camera.core.impl.p3.b.STREAM_SHARING, jF, aVar.b())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(Integer.valueOf(i11))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.o3<?> o3Var = map2.get(Integer.valueOf(i11));
                if (!g(o3Var.U(), jF, o3Var.U() == androidx.camera.core.impl.p3.b.STREAM_SHARING ? ((t0.h) o3Var).Z() : Collections.EMPTY_LIST)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean b(Set<Long> set, Set<Long> set2) {
        Iterator<Long> it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(@NonNull w.z zVar, @NonNull List<androidx.camera.core.impl.e3> list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) zVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j11 : jArr) {
            hashSet.add(Long.valueOf(j11));
        }
        Iterator<androidx.camera.core.impl.e3> it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(it.next().f()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(@NonNull List<androidx.camera.core.impl.a> list, @NonNull List<androidx.camera.core.impl.o3<?>> list2) {
        for (androidx.camera.core.impl.a aVar : list) {
            if (j(aVar.e(), aVar.b().get(0))) {
                return true;
            }
        }
        for (androidx.camera.core.impl.o3<?> o3Var : list2) {
            if (j(o3Var, o3Var.U())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static u.a e(@NonNull androidx.camera.core.impl.o3<?> o3Var) {
        androidx.camera.core.impl.d2 d2VarC0 = androidx.camera.core.impl.d2.c0();
        androidx.camera.core.impl.x0.a<?> aVar = u.a.M;
        if (o3Var.e(aVar)) {
            d2VarC0.K(aVar, (Long) o3Var.a(aVar));
        }
        androidx.camera.core.impl.x0.a<?> aVar2 = androidx.camera.core.impl.o3.A;
        if (o3Var.e(aVar2)) {
            d2VarC0.K(aVar2, (Boolean) o3Var.a(aVar2));
        }
        androidx.camera.core.impl.x0.a<?> aVar3 = androidx.camera.core.impl.p1.L;
        if (o3Var.e(aVar3)) {
            d2VarC0.K(aVar3, (Integer) o3Var.a(aVar3));
        }
        androidx.camera.core.impl.x0.a<?> aVar4 = androidx.camera.core.impl.q1.f3281h;
        if (o3Var.e(aVar4)) {
            d2VarC0.K(aVar4, (Integer) o3Var.a(aVar4));
        }
        return new u.a(d2VarC0);
    }

    private static androidx.camera.core.impl.x0 f(androidx.camera.core.impl.x0 x0Var, long j11) {
        androidx.camera.core.impl.x0.a<Long> aVar = f117261a;
        if (x0Var.e(aVar) && ((Long) x0Var.a(aVar)).longValue() == j11) {
            return null;
        }
        androidx.camera.core.impl.d2 d2VarD0 = androidx.camera.core.impl.d2.d0(x0Var);
        d2VarD0.K(aVar, Long.valueOf(j11));
        return new u.a(d2VarD0);
    }

    private static boolean g(androidx.camera.core.impl.p3.b bVar, long j11, List<androidx.camera.core.impl.p3.b> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != androidx.camera.core.impl.p3.b.STREAM_SHARING) {
            Map<Long, Set<androidx.camera.core.impl.p3.b>> map = f117262b;
            return map.containsKey(Long.valueOf(j11)) && map.get(Long.valueOf(j11)).contains(bVar);
        }
        Map<Long, Set<androidx.camera.core.impl.p3.b>> map2 = f117263c;
        if (!map2.containsKey(Long.valueOf(j11))) {
            return false;
        }
        Set<androidx.camera.core.impl.p3.b> set = map2.get(Long.valueOf(j11));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator<androidx.camera.core.impl.p3.b> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(@NonNull w.z zVar) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) zVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    private static boolean i(List<androidx.camera.core.impl.a> list, List<androidx.camera.core.impl.o3<?>> list2, Set<Long> set) {
        boolean z11;
        boolean z12;
        HashSet hashSet = new HashSet();
        Iterator<androidx.camera.core.impl.a> it = list.iterator();
        if (it.hasNext()) {
            androidx.camera.core.impl.a next = it.next();
            androidx.camera.core.impl.x0 x0VarE = next.e();
            androidx.camera.core.impl.x0.a<Long> aVar = u.a.M;
            if (x0VarE.e(aVar) && ((Long) next.e().a(aVar)).longValue() != 0) {
                z11 = true;
                z12 = false;
            } else {
                z12 = true;
                z11 = false;
            }
        } else {
            z11 = false;
            z12 = false;
        }
        for (androidx.camera.core.impl.o3<?> o3Var : list2) {
            androidx.camera.core.impl.x0.a<?> aVar2 = u.a.M;
            if (o3Var.e(aVar2)) {
                Long l11 = (Long) o3Var.a(aVar2);
                if (l11.longValue() != 0) {
                    if (z12) {
                        o();
                    }
                    hashSet.add(l11);
                    z11 = true;
                } else if (z11) {
                    o();
                }
            } else if (z11) {
                o();
            }
            z12 = true;
        }
        return !z12 && b(set, hashSet);
    }

    private static boolean j(androidx.camera.core.impl.x0 x0Var, androidx.camera.core.impl.p3.b bVar) {
        if (((Boolean) x0Var.d(androidx.camera.core.impl.o3.A, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        androidx.camera.core.impl.x0.a<Integer> aVar = androidx.camera.core.impl.p1.L;
        return x0Var.e(aVar) && h5.b(bVar, ((Integer) x0Var.a(aVar)).intValue()) == 5;
    }

    public static boolean k(@NonNull w.z zVar, @NonNull List<androidx.camera.core.impl.a> list, @NonNull Map<androidx.camera.core.impl.o3<?>, androidx.camera.core.impl.c3> map, @NonNull Map<androidx.camera.core.impl.a, androidx.camera.core.impl.c3> map2) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<androidx.camera.core.impl.o3<?>> arrayList = new ArrayList(map.keySet());
        Iterator<androidx.camera.core.impl.a> it = list.iterator();
        while (it.hasNext()) {
            u5.h.g(it.next().e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            u5.h.g(((androidx.camera.core.impl.c3) u5.h.g(map.get((androidx.camera.core.impl.o3) it2.next()))).d());
        }
        long[] jArr = (long[]) zVar.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j11 : jArr) {
                hashSet.add(Long.valueOf(j11));
            }
            if (i(list, arrayList, hashSet)) {
                for (androidx.camera.core.impl.a aVar : list) {
                    androidx.camera.core.impl.x0 x0VarE = aVar.e();
                    androidx.camera.core.impl.x0 x0VarF = f(x0VarE, ((Long) x0VarE.a(u.a.M)).longValue());
                    if (x0VarF != null) {
                        map2.put(aVar, aVar.i(x0VarF));
                    }
                }
                for (androidx.camera.core.impl.o3<?> o3Var : arrayList) {
                    androidx.camera.core.impl.c3 c3Var = map.get(o3Var);
                    androidx.camera.core.impl.x0 x0VarD = c3Var.d();
                    androidx.camera.core.impl.x0 x0VarF2 = f(x0VarD, ((Long) x0VarD.a(u.a.M)).longValue());
                    if (x0VarF2 != null) {
                        map.put(o3Var, c3Var.g().d(x0VarF2).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void l(@NonNull Map<androidx.camera.core.impl.o3<?>, androidx.camera.core.impl.c3> map, @NonNull Map<androidx.camera.core.impl.a, androidx.camera.core.impl.c3> map2, @NonNull Map<Integer, androidx.camera.core.impl.a> map3, @NonNull Map<Integer, androidx.camera.core.impl.o3<?>> map4, @NonNull List<androidx.camera.core.impl.e3> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jF = list.get(i11).f();
            if (map3.containsKey(Integer.valueOf(i11))) {
                androidx.camera.core.impl.a aVar = map3.get(Integer.valueOf(i11));
                androidx.camera.core.impl.x0 x0VarF = f(aVar.e(), jF);
                if (x0VarF != null) {
                    map2.put(aVar, aVar.i(x0VarF));
                }
            } else {
                if (!map4.containsKey(Integer.valueOf(i11))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.o3<?> o3Var = map4.get(Integer.valueOf(i11));
                androidx.camera.core.impl.c3 c3Var = map.get(o3Var);
                androidx.camera.core.impl.x0 x0VarF2 = f(c3Var.d(), jF);
                if (x0VarF2 != null) {
                    map.put(o3Var, c3Var.g().d(x0VarF2).a());
                }
            }
        }
    }

    public static void m(@NonNull Collection<androidx.camera.core.impl.x2> collection, @NonNull Collection<androidx.camera.core.impl.o3<?>> collection2, @NonNull Map<DeferrableSurface, Long> map) {
        ArrayList arrayList = new ArrayList(collection2);
        for (androidx.camera.core.impl.x2 x2Var : collection) {
            androidx.camera.core.impl.x0 x0VarF = x2Var.f();
            androidx.camera.core.impl.x0.a<Long> aVar = f117261a;
            if (x0VarF.e(aVar) && x2Var.o().size() != 1) {
                c0.y0.c("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(x2Var.o().size())));
                return;
            }
            if (x2Var.f().e(aVar)) {
                int i11 = 0;
                for (androidx.camera.core.impl.x2 x2Var2 : collection) {
                    if (((androidx.camera.core.impl.o3) arrayList.get(i11)).U() == androidx.camera.core.impl.p3.b.METERING_REPEATING) {
                        u5.h.j(!x2Var2.o().isEmpty(), "MeteringRepeating should contain a surface");
                        map.put(x2Var2.o().get(0), 1L);
                    } else {
                        androidx.camera.core.impl.x0 x0VarF2 = x2Var2.f();
                        androidx.camera.core.impl.x0.a<Long> aVar2 = f117261a;
                        if (x0VarF2.e(aVar2) && !x2Var2.o().isEmpty()) {
                            map.put(x2Var2.o().get(0), (Long) x2Var2.f().a(aVar2));
                        }
                    }
                    i11++;
                }
                return;
            }
        }
    }

    public static boolean n(@NonNull u4.b bVar) {
        return bVar.a() == 0 && bVar.b() == 8;
    }

    private static void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
