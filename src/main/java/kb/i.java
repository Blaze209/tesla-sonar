package kb;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<i> f85795c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f85796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f85797b;

    public static class a extends i {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends i {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    i(String str, String str2) {
        this.f85796a = str;
        this.f85797b = str2;
        f85795c.add(this);
    }
}
