package r20;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import h20.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000f\u001a\u00020\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\n0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u0015\u001a\u00020\u00072\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001b\u001a\n \u0019*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR6\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u001cj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n`\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010#¨\u0006%"}, d2 = {"Lr20/c;", "Lr20/a;", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "", "e", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "map", "c", "(Ljava/util/Map;)V", "", "base64_encoded", "type_encoded", "type_no_encoded", "a", "(Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "f", "()Ljava/util/HashMap;", "", "()J", "byteSize", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String TAG = c.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<String, Object> map = new HashMap<>();

    @Override // r20.a
    public void a(Map<?, ?> map, boolean base64_encoded, String type_encoded, String type_no_encoded) {
        s.k(map, "map");
        s.k(type_encoded, "type_encoded");
        s.k(type_no_encoded, "type_no_encoded");
        String string = new JSONObject(map).toString();
        s.j(string, "JSONObject(map).toString()");
        String TAG = this.TAG;
        s.j(TAG, "TAG");
        g.j(TAG, "Adding new map: %s", map);
        if (base64_encoded) {
            d(type_encoded, i20.c.b(string));
        } else {
            d(type_no_encoded, string);
        }
    }

    @Override // r20.a
    public long b() {
        return i20.c.i(toString());
    }

    @Override // r20.a
    public void c(Map<String, ? extends Object> map) {
        s.k(map, "map");
        String TAG = this.TAG;
        s.j(TAG, "TAG");
        g.j(TAG, "Adding new map: %s", map);
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            e(entry.getKey(), entry.getValue());
        }
    }

    @Override // r20.a
    public void d(String key, String value) {
        s.k(key, "key");
        if (value == null || value.length() == 0) {
            String TAG = this.TAG;
            s.j(TAG, "TAG");
            g.j(TAG, "The keys value is empty, removing the key: %s", key);
            getMap().remove(key);
            return;
        }
        String TAG2 = this.TAG;
        s.j(TAG2, "TAG");
        g.j(TAG2, "Adding new kv pair: " + key + "->%s", value);
        getMap().put(key, value);
    }

    public void e(String key, Object value) {
        s.k(key, "key");
        if (value == null) {
            String TAG = this.TAG;
            s.j(TAG, "TAG");
            g.j(TAG, "The value is empty, removing the key: %s", key);
            getMap().remove(key);
            return;
        }
        String TAG2 = this.TAG;
        s.j(TAG2, "TAG");
        g.j(TAG2, "Adding new kv pair: " + key + "->%s", value);
        getMap().put(key, value);
    }

    @Override // r20.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public HashMap<String, Object> getMap() {
        return this.map;
    }

    public String toString() {
        HashMap<String, Object> map = getMap();
        s.i(map, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        String string = new JSONObject(map).toString();
        s.j(string, "JSONObject(map as Map<*, *>).toString()");
        return string;
    }
}
