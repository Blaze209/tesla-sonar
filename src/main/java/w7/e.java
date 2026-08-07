package w7;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, Object> f121098a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<String> f121099b = new ArrayList();

    private e a(String str, Object obj) {
        this.f121098a.put((String) s7.a.f(str), s7.a.f(obj));
        this.f121099b.remove(str);
        return this;
    }

    public static e g(e eVar, long j11) {
        return eVar.e("exo_len", j11);
    }

    public static e h(e eVar, Uri uri) {
        return uri == null ? eVar.d("exo_redir") : eVar.f("exo_redir", uri.toString());
    }

    public Map<String, Object> b() {
        HashMap map = new HashMap(this.f121098a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.f121099b));
    }

    public e d(String str) {
        this.f121099b.add(str);
        this.f121098a.remove(str);
        return this;
    }

    public e e(String str, long j11) {
        return a(str, Long.valueOf(j11));
    }

    public e f(String str, String str2) {
        return a(str, str2);
    }
}
