package v;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class u4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f117301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f117302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final w.z f117303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final z.f f117304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f117305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f117306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f117307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f117308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f117309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f117310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f117311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    androidx.camera.core.impl.f3 f117312t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    private final i3 f117314v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final j3 f117317y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<androidx.camera.core.impl.d3> f117293a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<androidx.camera.core.impl.d3> f117294b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<androidx.camera.core.impl.d3> f117295c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<androidx.camera.core.impl.d3> f117296d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<b, List<androidx.camera.core.impl.d3>> f117297e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<androidx.camera.core.impl.d3> f117298f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<androidx.camera.core.impl.d3> f117299g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<androidx.camera.core.impl.d3> f117300h = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    List<Integer> f117313u = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final z.y f117315w = new z.y();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final z.u f117316x = new z.u();

    static class a {
        static Size[] a(StreamConfigurationMap streamConfigurationMap, int i11) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i11);
        }
    }

    static abstract class b {
        b() {
        }

        @NonNull
        static b e(int i11, int i12, boolean z11, boolean z12) {
            return new e(i11, i12, z11, z12);
        }

        abstract int a();

        abstract int b();

        abstract boolean c();

        abstract boolean d();
    }

    u4(@NonNull Context context, @NonNull String str, @NonNull w.m0 m0Var, @NonNull f fVar) throws CameraUnavailableException {
        this.f117306n = false;
        this.f117307o = false;
        this.f117308p = false;
        this.f117309q = false;
        this.f117310r = false;
        this.f117311s = false;
        String str2 = (String) u5.h.g(str);
        this.f117301i = str2;
        this.f117302j = (f) u5.h.g(fVar);
        this.f117304l = new z.f();
        this.f117314v = i3.c(context);
        try {
            w.z zVarC = m0Var.c(str2);
            this.f117303k = zVarC;
            Integer num = (Integer) zVarC.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f117305m = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) zVarC.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i11 : iArr) {
                    if (i11 == 3) {
                        this.f117306n = true;
                    } else if (i11 == 6) {
                        this.f117307o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i11 == 16) {
                        this.f117310r = true;
                    }
                }
            }
            j3 j3Var = new j3(this.f117303k);
            this.f117317y = j3Var;
            k();
            if (this.f117310r) {
                n();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f117308p = zHasSystemFeature;
            if (zHasSystemFeature) {
                h();
            }
            if (j3Var.d()) {
                g();
            }
            if (J()) {
                m();
            }
            boolean zH = s4.h(this.f117303k);
            this.f117309q = zH;
            if (zH) {
                j();
            }
            boolean zA = m5.a(this.f117303k);
            this.f117311s = zA;
            if (zA) {
                i();
            }
            l();
            b();
        } catch (CameraAccessExceptionCompat e11) {
            throw u2.a(e11);
        }
    }

    private List<androidx.camera.core.impl.d3> B(@NonNull b bVar) {
        if (this.f117297e.containsKey(bVar)) {
            return this.f117297e.get(bVar);
        }
        List<androidx.camera.core.impl.d3> arrayList = new ArrayList<>();
        if (bVar.d()) {
            if (bVar.a() == 0) {
                arrayList.addAll(this.f117299g);
            }
        } else if (bVar.b() == 8) {
            int iA = bVar.a();
            if (iA == 1) {
                arrayList = this.f117295c;
            } else if (iA != 2) {
                arrayList.addAll(bVar.c() ? this.f117296d : this.f117293a);
            } else {
                arrayList.addAll(this.f117294b);
                arrayList.addAll(this.f117293a);
            }
        } else if (bVar.b() == 10 && bVar.a() == 0) {
            arrayList.addAll(this.f117298f);
        }
        this.f117297e.put(bVar, arrayList);
        return arrayList;
    }

    private Pair<List<androidx.camera.core.impl.e3>, Integer> C(int i11, List<androidx.camera.core.impl.a> list, List<Size> list2, List<androidx.camera.core.impl.o3<?>> list3, List<Integer> list4, int i12, Map<Integer, androidx.camera.core.impl.a> map, Map<Integer, androidx.camera.core.impl.o3<?>> map2) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.a aVar : list) {
            arrayList.add(aVar.g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), aVar);
            }
        }
        for (int i13 = 0; i13 < list2.size(); i13++) {
            Size size = list2.get(i13);
            androidx.camera.core.impl.o3<?> o3Var = list3.get(list4.get(i13).intValue());
            int inputFormat = o3Var.getInputFormat();
            arrayList.add(androidx.camera.core.impl.e3.h(i11, inputFormat, size, F(inputFormat)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), o3Var);
            }
            i12 = E(i12, o3Var.getInputFormat(), size);
        }
        return new Pair<>(arrayList, Integer.valueOf(i12));
    }

    private Range<Integer> D(@NonNull List<androidx.camera.core.impl.a> list, @NonNull List<androidx.camera.core.impl.o3<?>> list2, @NonNull List<Integer> list3) {
        Iterator<androidx.camera.core.impl.a> it = list.iterator();
        Range<Integer> rangeG = null;
        while (it.hasNext()) {
            rangeG = G(it.next().h(), rangeG);
        }
        Iterator<Integer> it2 = list3.iterator();
        while (it2.hasNext()) {
            rangeG = G(list2.get(it2.next().intValue()).O(null), rangeG);
        }
        return rangeG;
    }

    private int E(int i11, int i12, Size size) {
        return Math.min(i11, q(this.f117303k, i12, size));
    }

    private Range<Integer> G(Range<Integer> range, Range<Integer> range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    private static List<Integer> H(List<androidx.camera.core.impl.o3<?>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<androidx.camera.core.impl.o3<?>> it = list.iterator();
        while (it.hasNext()) {
            int iS = it.next().s(0);
            if (!arrayList2.contains(Integer.valueOf(iS))) {
                arrayList2.add(Integer.valueOf(iS));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            for (androidx.camera.core.impl.o3<?> o3Var : list) {
                if (iIntValue == o3Var.s(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(o3Var)));
                }
            }
        }
        return arrayList;
    }

    private static boolean I(@NonNull List<androidx.camera.core.impl.a> list, @NonNull Map<androidx.camera.core.impl.o3<?>, List<Size>> map) {
        Iterator<androidx.camera.core.impl.a> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().d() == 4101) {
                return true;
            }
        }
        Iterator<androidx.camera.core.impl.o3<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getInputFormat() == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean J() {
        int[] iArrB = this.f117303k.d().b();
        if (iArrB == null) {
            return false;
        }
        for (int i11 : iArrB) {
            if (i11 == 4101) {
                return true;
            }
        }
        return false;
    }

    private boolean K(@NonNull b bVar, @NonNull List<androidx.camera.core.impl.a> list, @NonNull Map<androidx.camera.core.impl.o3<?>, List<Size>> map) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        h0.e eVar = new h0.e();
        for (androidx.camera.core.impl.o3<?> o3Var : map.keySet()) {
            List<Size> list2 = map.get(o3Var);
            u5.h.b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + o3Var + ".");
            Size size = (Size) Collections.min(list2, eVar);
            int inputFormat = o3Var.getInputFormat();
            arrayList.add(androidx.camera.core.impl.e3.h(bVar.a(), inputFormat, size, F(inputFormat)));
        }
        return c(bVar, arrayList);
    }

    private void L() {
        this.f117314v.g();
        if (this.f117312t == null) {
            l();
        } else {
            this.f117312t = androidx.camera.core.impl.f3.a(this.f117312t.b(), this.f117312t.j(), this.f117314v.f(), this.f117312t.h(), this.f117312t.f(), this.f117312t.d(), this.f117312t.l());
        }
    }

    private void N(@NonNull Map<Integer, Size> map, int i11) {
        Size sizeR = r(this.f117303k.d().d(), i11, true);
        if (sizeR != null) {
            map.put(Integer.valueOf(i11), sizeR);
        }
    }

    private void O(@NonNull Map<Integer, Size> map, @NonNull Size size, int i11) {
        if (this.f117308p) {
            Size sizeR = r(this.f117303k.d().d(), i11, false);
            Integer numValueOf = Integer.valueOf(i11);
            if (sizeR != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeR), new h0.e());
            }
            map.put(numValueOf, size);
        }
    }

    private void P(@NonNull Map<Integer, Size> map, int i11) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.f117310r || (streamConfigurationMap = (StreamConfigurationMap) this.f117303k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i11), r(streamConfigurationMap, i11, true));
    }

    private static Range<Integer> d(Range<Integer> range, Range<Integer> range2, Range<Integer> range3) {
        double dV = v(range2.intersect(range));
        double dV2 = v(range3.intersect(range));
        double dV3 = dV2 / ((double) v(range3));
        double dV4 = dV / ((double) v(range2));
        return (dV2 <= dV ? dV2 != dV ? dV4 >= 0.5d || dV3 <= dV4 : dV3 <= dV4 && (dV3 != dV4 || ((Integer) range3.getLower()).intValue() <= ((Integer) range2.getLower()).intValue()) : dV3 < 0.5d && dV3 < dV4) ? range2 : range3;
    }

    @NonNull
    private b e(int i11, @NonNull Map<androidx.camera.core.impl.o3<?>, c0.b0> map, boolean z11, boolean z12) {
        int iZ = z(map);
        if (i11 != 0 && z12) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f117301i, androidx.camera.core.impl.k0.a(i11)));
        }
        if (i11 == 0 || iZ != 10) {
            return b.e(i11, iZ, z11, z12);
        }
        throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f117301i, androidx.camera.core.impl.k0.a(i11)));
    }

    @NonNull
    private Map<androidx.camera.core.impl.o3<?>, List<Size>> f(@NonNull Map<androidx.camera.core.impl.o3<?>, List<Size>> map, @NonNull b bVar, Range<Integer> range) {
        HashMap map2 = new HashMap();
        for (androidx.camera.core.impl.o3<?> o3Var : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            for (Size size : map.get(o3Var)) {
                int inputFormat = o3Var.getInputFormat();
                androidx.camera.core.impl.e3.a aVarC = androidx.camera.core.impl.e3.h(bVar.a(), inputFormat, size, F(inputFormat)).c();
                int iQ = range != null ? q(this.f117303k, inputFormat, size) : Integer.MAX_VALUE;
                Set hashSet = (Set) map3.get(aVarC);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map3.put(aVarC, hashSet);
                }
                if (!hashSet.contains(Integer.valueOf(iQ))) {
                    arrayList.add(size);
                    hashSet.add(Integer.valueOf(iQ));
                }
            }
            map2.put(o3Var, arrayList);
        }
        return map2;
    }

    private void g() {
        this.f117298f.addAll(f4.b());
    }

    private void h() {
        this.f117295c.addAll(f4.d());
    }

    private void i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f117296d.addAll(f4.i());
        }
    }

    private void j() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f117300h.addAll(f4.k());
        }
    }

    private void k() {
        this.f117293a.addAll(f4.a(this.f117305m, this.f117306n, this.f117307o));
        this.f117293a.addAll(this.f117304l.a(this.f117301i));
    }

    private void l() {
        this.f117312t = androidx.camera.core.impl.f3.a(o0.c.f95563c, new HashMap(), this.f117314v.f(), new HashMap(), w(), new HashMap(), new HashMap());
    }

    private void m() {
        this.f117299g.addAll(f4.l());
    }

    private void n() {
        this.f117294b.addAll(f4.m());
    }

    private List<List<Size>> o(List<List<Size>> list) {
        Iterator<List<Size>> it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= it.next().size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / list.get(0).size();
        int i12 = size;
        for (int i13 = 0; i13 < list.size(); i13++) {
            List<Size> list2 = list.get(i13);
            for (int i14 = 0; i14 < size; i14++) {
                ((List) arrayList.get(i14)).add(list2.get((i14 % i12) / size2));
            }
            if (i13 < list.size() - 1) {
                i12 = size2;
                size2 /= list.get(i13 + 1).size();
            }
        }
        return arrayList;
    }

    @NonNull
    private Range<Integer> p(Range<Integer> range, int i11) {
        if (range != null) {
            Range<Integer> rangeD = androidx.camera.core.impl.c3.f3148a;
            if (!range.equals(rangeD)) {
                Range<Integer>[] rangeArr = (Range[]) this.f117303k.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return rangeD;
                }
                Range<T> range2 = new Range<>(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i11)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i11)));
                int iV = 0;
                for (Range<Integer> range3 : rangeArr) {
                    if (i11 >= ((Integer) range3.getLower()).intValue()) {
                        if (rangeD.equals(androidx.camera.core.impl.c3.f3148a)) {
                            rangeD = range3;
                        }
                        if (range3.equals(range2)) {
                            return range3;
                        }
                        try {
                            int iV2 = v(range3.intersect(range2));
                            if (iV == 0) {
                                iV = iV2;
                            } else {
                                if (iV2 >= iV) {
                                    rangeD = d(range2, rangeD, range3);
                                    iV = v(range2.intersect(rangeD));
                                }
                                range3 = rangeD;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (iV != 0 || (u(range3, range2) >= u(rangeD, range2) && (u(range3, range2) != u(rangeD, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeD.getUpper()).intValue() && v(range3) >= v(rangeD))))) {
                            }
                        }
                        rangeD = range3;
                    }
                }
                return rangeD;
            }
        }
        return androidx.camera.core.impl.c3.f3148a;
    }

    static int q(w.z zVar, int i11, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) zVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i11, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    private Size r(StreamConfigurationMap streamConfigurationMap, int i11, boolean z11) {
        Size[] sizeArrA;
        Size[] outputSizes = i11 == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i11);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        h0.e eVar = new h0.e();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), eVar);
        Size size2 = o0.c.f95561a;
        if (z11 && (sizeArrA = a.a(streamConfigurationMap, i11)) != null && sizeArrA.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrA), eVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), eVar);
    }

    private int s(@NonNull List<androidx.camera.core.impl.a> list) {
        int iE = Integer.MAX_VALUE;
        for (androidx.camera.core.impl.a aVar : list) {
            iE = E(iE, aVar.d(), aVar.f());
        }
        return iE;
    }

    private static int u(Range<Integer> range, Range<Integer> range2) {
        u5.h.j((range.contains((Integer) range2.getUpper()) || range.contains((Integer) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static int v(Range<Integer> range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    @NonNull
    private Size w() {
        try {
            int i11 = Integer.parseInt(this.f117301i);
            CamcorderProfile camcorderProfileA = this.f117302j.b(i11, 1) ? this.f117302j.a(i11, 1) : null;
            return camcorderProfileA != null ? new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight) : x(i11);
        } catch (NumberFormatException unused) {
            return y();
        }
    }

    @NonNull
    private Size x(int i11) {
        CamcorderProfile camcorderProfileA;
        Size size = o0.c.f95564d;
        if (this.f117302j.b(i11, 10)) {
            camcorderProfileA = this.f117302j.a(i11, 10);
        } else if (this.f117302j.b(i11, 8)) {
            camcorderProfileA = this.f117302j.a(i11, 8);
        } else if (this.f117302j.b(i11, 12)) {
            camcorderProfileA = this.f117302j.a(i11, 12);
        } else if (this.f117302j.b(i11, 6)) {
            camcorderProfileA = this.f117302j.a(i11, 6);
        } else if (this.f117302j.b(i11, 5)) {
            camcorderProfileA = this.f117302j.a(i11, 5);
        } else {
            camcorderProfileA = this.f117302j.b(i11, 4) ? this.f117302j.a(i11, 4) : null;
        }
        return camcorderProfileA != null ? new Size(camcorderProfileA.videoFrameWidth, camcorderProfileA.videoFrameHeight) : size;
    }

    @NonNull
    private Size y() {
        Size[] outputSizes = this.f117303k.d().d().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return o0.c.f95564d;
        }
        Arrays.sort(outputSizes, new h0.e(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = o0.c.f95566f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return o0.c.f95564d;
    }

    private static int z(@NonNull Map<androidx.camera.core.impl.o3<?>, c0.b0> map) {
        Iterator<c0.b0> it = map.values().iterator();
        while (it.hasNext()) {
            if (it.next().a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    @NonNull
    Pair<Map<androidx.camera.core.impl.o3<?>, androidx.camera.core.impl.c3>, Map<androidx.camera.core.impl.a, androidx.camera.core.impl.c3>> A(int i11, @NonNull List<androidx.camera.core.impl.a> list, @NonNull Map<androidx.camera.core.impl.o3<?>, List<Size>> map, boolean z11, boolean z12) {
        int i12;
        HashMap map2;
        HashMap map3;
        HashMap map4;
        List<androidx.camera.core.impl.e3> list2;
        HashMap map5;
        List<androidx.camera.core.impl.e3> list3;
        String str;
        String str2;
        HashMap map6;
        List<Size> list4;
        List<Size> list5;
        HashMap map7;
        boolean z13;
        L();
        ArrayList arrayList = new ArrayList(map.keySet());
        List<Integer> listH = H(arrayList);
        Map<androidx.camera.core.impl.o3<?>, c0.b0> mapG = this.f117317y.g(list, arrayList, listH);
        b bVarE = e(i11, mapG, z11, I(list, map));
        boolean zK = K(bVarE, list, map);
        String str3 = " New configs: ";
        String str4 = "No supported surface combination is found for camera device - Id : ";
        if (!zK) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f117301i + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range<Integer> rangeD = D(list, arrayList, listH);
        Map<androidx.camera.core.impl.o3<?>, List<Size>> mapF = f(map, bVarE, rangeD);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it = listH.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.o3<?> o3Var = arrayList.get(it.next().intValue());
            arrayList2.add(a(mapF.get(o3Var), o3Var.getInputFormat()));
            mapF = mapF;
        }
        List<List<Size>> listO = o(arrayList2);
        HashMap map8 = new HashMap();
        HashMap map9 = new HashMap();
        HashMap map10 = new HashMap();
        HashMap map11 = new HashMap();
        boolean zD = s4.d(list, arrayList);
        int iS = s(list);
        if (!this.f117309q || zD) {
            i12 = iS;
            map2 = map10;
            map3 = map11;
            map4 = map9;
            list2 = null;
        } else {
            Iterator<List<Size>> it2 = listO.iterator();
            List<androidx.camera.core.impl.e3> listT = null;
            while (true) {
                if (!it2.hasNext()) {
                    HashMap map12 = map11;
                    i12 = iS;
                    map2 = map10;
                    map3 = map12;
                    z13 = zK;
                    map4 = map9;
                    break;
                }
                z13 = zK;
                map4 = map9;
                Pair<List<androidx.camera.core.impl.e3>, Integer> pairC = C(i11, list, it2.next(), arrayList, listH, iS, map10, map11);
                HashMap map13 = map11;
                i12 = iS;
                map2 = map10;
                map3 = map13;
                listT = t(bVarE, (List) pairC.first);
                if (listT != null && !s4.a(map2, map3, listT)) {
                    listT = null;
                }
                if (listT != null) {
                    if (s4.c(this.f117303k, listT)) {
                        break;
                    }
                    listT = null;
                }
                map2.clear();
                map3.clear();
                map10 = map2;
                iS = i12;
                map11 = map3;
                map9 = map4;
                zK = z13;
            }
            if (listT == null && !z13) {
                throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f117301i + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
            }
            list2 = listT;
        }
        Iterator<List<Size>> it3 = listO.iterator();
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        boolean z14 = false;
        boolean z15 = false;
        List<Size> list6 = null;
        List<Size> list7 = null;
        while (true) {
            if (it3.hasNext()) {
                List<Size> next = it3.next();
                HashMap map14 = map2;
                int i16 = i12;
                str = str3;
                map5 = map3;
                int i17 = i14;
                list3 = list2;
                int i18 = i13;
                str2 = str4;
                map6 = map14;
                Pair<List<androidx.camera.core.impl.e3>, Integer> pairC2 = C(i11, list, next, arrayList, listH, i16, null, null);
                List<androidx.camera.core.impl.e3> list8 = (List) pairC2.first;
                int iIntValue = ((Integer) pairC2.second).intValue();
                boolean z16 = rangeD == null || i16 <= iIntValue || iIntValue >= ((Integer) rangeD.getLower()).intValue();
                if (!z14 && c(bVarE, list8)) {
                    if (i17 == i18 || i17 < iIntValue) {
                        list6 = next;
                        i17 = iIntValue;
                    }
                    if (z16) {
                        if (z15) {
                            list4 = next;
                            i14 = iIntValue;
                        } else {
                            list6 = next;
                            i17 = iIntValue;
                            z14 = true;
                        }
                    }
                }
                if (list3 == null || z15 || t(bVarE, list8) == null) {
                    i15 = i15;
                } else {
                    int i19 = i15;
                    if (i19 != i18 && i19 >= iIntValue) {
                        i15 = i19;
                    } else {
                        list7 = next;
                        i15 = iIntValue;
                    }
                    if (!z16) {
                        continue;
                    } else {
                        if (z14) {
                            i15 = iIntValue;
                            list4 = list6;
                            list5 = next;
                            i14 = i17;
                            break;
                        }
                        list7 = next;
                        i15 = iIntValue;
                        z15 = true;
                    }
                }
                i12 = i16;
                i13 = i18;
                i14 = i17;
                map2 = map6;
                str4 = str2;
                list2 = list3;
                map3 = map5;
                str3 = str;
            } else {
                map5 = map3;
                list3 = list2;
                str = str3;
                str2 = str4;
                map6 = map2;
                list4 = list6;
            }
            list5 = list7;
            break;
        }
        if (list4 == null) {
            throw new IllegalArgumentException(str2 + this.f117301i + " and Hardware level: " + this.f117305m + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str + arrayList);
        }
        Range<Integer> rangeP = rangeD != null ? p(rangeD, i14) : null;
        for (androidx.camera.core.impl.o3<?> o3Var2 : arrayList) {
            androidx.camera.core.impl.c3.a aVarF = androidx.camera.core.impl.c3.a(list4.get(listH.indexOf(Integer.valueOf(arrayList.indexOf(o3Var2))))).b((c0.b0) u5.h.g(mapG.get(o3Var2))).d(s4.e(o3Var2)).f(z12);
            if (rangeP != null) {
                aVarF.c(rangeP);
            }
            map4.put(o3Var2, aVarF.a());
        }
        if (list3 == null || i14 != i15 || list4.size() != list5.size()) {
            map7 = map8;
            break;
        }
        int i21 = 0;
        while (true) {
            if (i21 >= list4.size()) {
                map7 = map8;
                if (!s4.k(this.f117303k, list, map4, map7)) {
                    s4.l(map4, map7, map6, map5, list3);
                    break;
                }
                break;
            }
            if (!list4.get(i21).equals(list5.get(i21))) {
                map7 = map8;
                break;
            }
            i21++;
        }
        return new Pair<>(map4, map7);
    }

    @NonNull
    androidx.camera.core.impl.f3 F(int i11) {
        if (!this.f117313u.contains(Integer.valueOf(i11))) {
            O(this.f117312t.j(), o0.c.f95565e, i11);
            O(this.f117312t.h(), o0.c.f95567g, i11);
            N(this.f117312t.d(), i11);
            P(this.f117312t.l(), i11);
            this.f117313u.add(Integer.valueOf(i11));
        }
        return this.f117312t;
    }

    androidx.camera.core.impl.e3 M(int i11, int i12, Size size) {
        return androidx.camera.core.impl.e3.h(i11, i12, size, F(i12));
    }

    @NonNull
    List<Size> a(@NonNull List<Size> list, int i11) {
        Rational rational;
        int iA = this.f117315w.a(this.f117301i, this.f117303k);
        if (iA == 0) {
            rational = h0.a.f70074a;
        } else if (iA == 1) {
            rational = h0.a.f70076c;
        } else if (iA != 2) {
            rational = null;
        } else {
            Size sizeC = F(256).c(256);
            rational = new Rational(sizeC.getWidth(), sizeC.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Size size : list) {
                if (h0.a.a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f117316x.a(androidx.camera.core.impl.e3.e(i11), list);
    }

    boolean c(@NonNull b bVar, List<androidx.camera.core.impl.e3> list) {
        Iterator<androidx.camera.core.impl.d3> it = B(bVar).iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 = it.next().d(list) != null;
            if (z11) {
                break;
            }
        }
        return z11;
    }

    List<androidx.camera.core.impl.e3> t(@NonNull b bVar, List<androidx.camera.core.impl.e3> list) {
        if (!s4.n(bVar)) {
            return null;
        }
        Iterator<androidx.camera.core.impl.d3> it = this.f117300h.iterator();
        while (it.hasNext()) {
            List<androidx.camera.core.impl.e3> listD = it.next().d(list);
            if (listD != null) {
                return listD;
            }
        }
        return null;
    }

    private void b() {
    }
}
