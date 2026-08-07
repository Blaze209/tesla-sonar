package z0;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f126357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f126358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x f126359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f126360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f126361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final x f126362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final x f126363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Set<x> f126364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final List<x> f126365i;

    public static abstract class b extends x {
        public b() {
            super();
        }

        @NonNull
        static b f(int i11, @NonNull String str, @NonNull List<Size> list) {
            return new j(i11, str, list);
        }

        @NonNull
        public abstract String c();

        @NonNull
        public abstract List<Size> d();

        public abstract int e();
    }

    static {
        b bVarF = b.f(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f126357a = bVarF;
        b bVarF2 = b.f(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f126358b = bVarF2;
        b bVarF3 = b.f(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f126359c = bVarF3;
        b bVarF4 = b.f(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f126360d = bVarF4;
        List list = Collections.EMPTY_LIST;
        b bVarF5 = b.f(0, "LOWEST", list);
        f126361e = bVarF5;
        b bVarF6 = b.f(1, "HIGHEST", list);
        f126362f = bVarF6;
        f126363g = b.f(-1, "NONE", list);
        f126364h = new HashSet(Arrays.asList(bVarF5, bVarF6, bVarF, bVarF2, bVarF3, bVarF4));
        f126365i = Arrays.asList(bVarF4, bVarF3, bVarF2, bVarF);
    }

    static boolean a(@NonNull x xVar) {
        return f126364h.contains(xVar);
    }

    @NonNull
    public static List<x> b() {
        return new ArrayList(f126365i);
    }

    private x() {
    }
}
