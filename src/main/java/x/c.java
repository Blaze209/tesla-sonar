package x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import c0.b0;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Long, b0> f122448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<b0, List<Long>> f122449b;

    static {
        HashMap map = new HashMap();
        f122448a = map;
        HashMap map2 = new HashMap();
        f122449b = map2;
        b0 b0Var = b0.f18255d;
        map.put(1L, b0Var);
        map2.put(b0Var, Collections.singletonList(1L));
        map.put(2L, b0.f18257f);
        map2.put((b0) map.get(2L), Collections.singletonList(2L));
        b0 b0Var2 = b0.f18258g;
        map.put(4L, b0Var2);
        map2.put(b0Var2, Collections.singletonList(4L));
        b0 b0Var3 = b0.f18259h;
        map.put(8L, b0Var3);
        map2.put(b0Var3, Collections.singletonList(8L));
        List<Long> listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator<Long> it = listAsList.iterator();
        while (it.hasNext()) {
            f122448a.put(it.next(), b0.f18260i);
        }
        f122449b.put(b0.f18260i, listAsList);
        List<Long> listAsList2 = Arrays.asList(1024L, Long.valueOf(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX), 256L, 512L);
        Iterator<Long> it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f122448a.put(it2.next(), b0.f18261j);
        }
        f122449b.put(b0.f18261j, listAsList2);
    }

    public static Long a(@NonNull b0 b0Var, @NonNull DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = f122449b.get(b0Var);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l11 : list) {
            if (supportedProfiles.contains(l11)) {
                return l11;
            }
        }
        return null;
    }

    public static b0 b(long j11) {
        return f122448a.get(Long.valueOf(j11));
    }
}
