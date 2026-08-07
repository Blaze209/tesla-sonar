package cu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f59189a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f59189a = new HashMap();
        new du.i("PlayCoreVersion");
    }

    public static synchronized Map a() {
        Map map;
        map = f59189a;
        map.put("java", 20002);
        return map;
    }
}
