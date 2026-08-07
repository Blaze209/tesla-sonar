package w7;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f121100c = new f(Collections.EMPTY_MAP);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f121101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, byte[]> f121102b;

    public f() {
        this(Collections.EMPTY_MAP);
    }

    private static void e(HashMap<String, byte[]> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map2.entrySet()) {
            map.put(entry.getKey(), i(entry.getValue()));
        }
    }

    private static Map<String, byte[]> f(Map<String, byte[]> map, e eVar) {
        HashMap map2 = new HashMap(map);
        k(map2, eVar.c());
        e(map2, eVar.b());
        return map2;
    }

    private static byte[] i(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(StandardCharsets.UTF_8);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    private static boolean j(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    private static void k(HashMap<String, byte[]> map, List<String> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            map.remove(list.get(i11));
        }
    }

    @Override // w7.d
    public final long b(String str, long j11) {
        byte[] bArr = this.f121102b.get(str);
        return bArr != null ? ByteBuffer.wrap(bArr).getLong() : j11;
    }

    @Override // w7.d
    public final String d(String str, String str2) {
        byte[] bArr = this.f121102b.get(str);
        return bArr != null ? new String(bArr, StandardCharsets.UTF_8) : str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return j(this.f121102b, ((f) obj).f121102b);
    }

    public f g(e eVar) {
        Map<String, byte[]> mapF = f(this.f121102b, eVar);
        return j(this.f121102b, mapF) ? this : new f(mapF);
    }

    public Set<Map.Entry<String, byte[]>> h() {
        return this.f121102b.entrySet();
    }

    public int hashCode() {
        if (this.f121101a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f121102b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f121101a = iHashCode;
        }
        return this.f121101a;
    }

    public f(Map<String, byte[]> map) {
        this.f121102b = Collections.unmodifiableMap(map);
    }
}
