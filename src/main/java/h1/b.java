package h1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.j1;
import c0.b0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import u5.h;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Integer, Set<Integer>> f70159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<Integer, Set<Integer>> f70160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<Integer, Integer> f70161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map<Integer, Integer> f70162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<String, Map<b0, Integer>> f70163e;

    static {
        HashMap map = new HashMap();
        f70159a = map;
        HashMap map2 = new HashMap();
        f70160b = map2;
        HashMap map3 = new HashMap();
        f70161c = map3;
        HashMap map4 = new HashMap();
        f70162d = map4;
        HashMap map5 = new HashMap();
        f70163e = map5;
        map.put(8, new HashSet(Collections.singletonList(8)));
        map.put(10, new HashSet(Collections.singletonList(10)));
        map.put(0, new HashSet(Arrays.asList(8, 10)));
        map2.put(0, new HashSet(Arrays.asList(0, 1, 2, 3, 4)));
        map2.put(1, new HashSet(Collections.singletonList(0)));
        map2.put(2, new HashSet(Arrays.asList(1, 2, 3, 4)));
        map2.put(3, new HashSet(Collections.singletonList(1)));
        map2.put(4, new HashSet(Collections.singletonList(2)));
        map2.put(5, new HashSet(Collections.singletonList(3)));
        map2.put(6, new HashSet(Collections.singletonList(4)));
        map3.put(8, 8);
        map3.put(10, 10);
        map4.put(0, 1);
        map4.put(1, 3);
        map4.put(2, 4);
        map4.put(3, 5);
        map4.put(4, 6);
        HashMap map6 = new HashMap();
        b0 b0Var = b0.f18255d;
        map6.put(b0Var, 1);
        b0 b0Var2 = b0.f18257f;
        map6.put(b0Var2, 2);
        b0 b0Var3 = b0.f18258g;
        map6.put(b0Var3, 4096);
        b0 b0Var4 = b0.f18259h;
        Integer numValueOf = Integer.valueOf(PKIFailureInfo.certRevoked);
        map6.put(b0Var4, numValueOf);
        HashMap map7 = new HashMap();
        map7.put(b0Var, 1);
        map7.put(b0Var2, 2);
        map7.put(b0Var3, 4096);
        map7.put(b0Var4, numValueOf);
        HashMap map8 = new HashMap();
        map8.put(b0Var, 1);
        map8.put(b0Var2, 4);
        map8.put(b0Var3, 4096);
        map8.put(b0Var4, 16384);
        HashMap map9 = new HashMap();
        map9.put(b0.f18260i, 256);
        map9.put(b0.f18261j, 512);
        map5.put("video/hevc", map6);
        map5.put("video/av01", map7);
        map5.put("video/x-vnd.on2.vp9", map8);
        map5.put("video/dolby-vision", map9);
    }

    public static int a(@NonNull String str, @NonNull b0 b0Var) {
        Integer num;
        Map<b0, Integer> map = f70163e.get(str);
        if (map == null || (num = map.get(b0Var)) == null) {
            return -1;
        }
        return num.intValue();
    }

    @NonNull
    public static Set<Integer> b(@NonNull b0 b0Var) {
        Set<Integer> set = f70159a.get(Integer.valueOf(b0Var.a()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    @NonNull
    public static Set<Integer> c(@NonNull b0 b0Var) {
        Set<Integer> set = f70160b.get(Integer.valueOf(b0Var.b()));
        return set == null ? Collections.EMPTY_SET : set;
    }

    private static boolean d(int i11, @NonNull b0 b0Var) {
        Set<Integer> set = f70159a.get(Integer.valueOf(b0Var.a()));
        return set != null && set.contains(Integer.valueOf(i11));
    }

    private static boolean e(int i11, @NonNull b0 b0Var) {
        Set<Integer> set = f70160b.get(Integer.valueOf(b0Var.b()));
        return set != null && set.contains(Integer.valueOf(i11));
    }

    public static boolean f(@NonNull j1.c cVar, @NonNull b0 b0Var) {
        return d(cVar.b(), b0Var) && e(cVar.g(), b0Var);
    }

    public static int g(int i11) {
        Map<Integer, Integer> map = f70161c;
        h.a(map.containsKey(Integer.valueOf(i11)));
        Integer num = map.get(Integer.valueOf(i11));
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public static int h(int i11) {
        Map<Integer, Integer> map = f70162d;
        h.a(map.containsKey(Integer.valueOf(i11)));
        Integer num = map.get(Integer.valueOf(i11));
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
