package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.d3;
import androidx.camera.core.impl.e3;
import androidx.camera.core.impl.m2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d3 f2989a = g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d3 f2990b = h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f2991c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<String> f2992d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));

    @NonNull
    private static d3 g() {
        d3 d3Var = new d3();
        e3.b bVar = e3.b.YUV;
        d3Var.a(e3.a(bVar, e3.a.VGA));
        d3Var.a(e3.a(e3.b.PRIV, e3.a.PREVIEW));
        d3Var.a(e3.a(bVar, e3.a.MAXIMUM));
        return d3Var;
    }

    private static d3 h() {
        d3 d3Var = new d3();
        e3.b bVar = e3.b.PRIV;
        d3Var.a(e3.a(bVar, e3.a.PREVIEW));
        d3Var.a(e3.a(bVar, e3.a.VGA));
        d3Var.a(e3.a(e3.b.YUV, e3.a.MAXIMUM));
        return d3Var;
    }

    @NonNull
    private List<d3> j(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("1")) {
            arrayList.add(f2989a);
        }
        return arrayList;
    }

    private static boolean k() {
        String str = Build.DEVICE;
        return "heroqltevzw".equalsIgnoreCase(str) || "heroqltetmo".equalsIgnoreCase(str);
    }

    static boolean l() {
        return k() || m() || n();
    }

    private static boolean m() {
        if (!"google".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        return f2991c.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    private static boolean n() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator<String> it = f2992d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public List<d3> i(@NonNull String str) {
        if (k()) {
            return j(str);
        }
        return (m() || n()) ? Collections.singletonList(f2990b) : Collections.EMPTY_LIST;
    }
}
