package um;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f116436c = new HashSet(Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded", "non_fatal_decode_error", "original_url", "modified_url", "image_color_space"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Object> f116437a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f116438b;

    @Override // am.a
    public void C(Map<String, ? extends Object> map) {
        if (map == null) {
            return;
        }
        for (String str : f116436c) {
            Object obj = map.get(str);
            if (obj != null) {
                this.f116437a.put(str, obj);
            }
        }
    }

    @Override // um.e
    public boolean J3() {
        return false;
    }

    @Override // um.l, am.a
    public Map<String, Object> getExtras() {
        return this.f116437a;
    }

    @Override // am.a
    public <E> void o(String str, E e11) {
        if (f116436c.contains(str)) {
            this.f116437a.put(str, e11);
        }
    }

    @Override // um.e
    public p o3() {
        return o.f116468d;
    }

    @Override // um.e
    public m z() {
        if (this.f116438b == null) {
            this.f116438b = new n(getWidth(), getHeight(), v(), o3(), getExtras());
        }
        return this.f116438b;
    }
}
