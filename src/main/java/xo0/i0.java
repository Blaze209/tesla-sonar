package xo0;

import ch.qos.logback.core.joran.action.Action;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0006\b\u0012\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u0018\u001a\u00020\u0006\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\b\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u001c8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lxo0/i0;", "Lxo0/e;", "Lwo0/b;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "Ljn0/h0;", "nodeConsumer", "<init>", "(Lwo0/b;Lwn0/l;)V", "", Action.KEY_ATTRIBUTE, "element", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "T", "Lto0/f;", "descriptor", "", "index", "Lro0/q;", "serializer", "value", "y", "(Lto0/f;ILro0/q;Ljava/lang/Object;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "", "g", "Ljava/util/Map;", "x0", "()Ljava/util/Map;", "content", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
class i0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<String, JsonElement> content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(wo0.b json, wn0.l<? super JsonElement, jn0.h0> nodeConsumer) {
        super(json, nodeConsumer, null);
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(nodeConsumer, "nodeConsumer");
        this.content = new LinkedHashMap();
    }

    @Override // xo0.e
    public JsonElement s0() {
        return new JsonObject(this.content);
    }

    @Override // xo0.e
    public void w0(String key, JsonElement element) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(element, "element");
        this.content.put(key, element);
    }

    protected final Map<String, JsonElement> x0() {
        return this.content;
    }

    @Override // vo0.d2, uo0.d
    public <T> void y(to0.f descriptor, int index, ro0.q<? super T> serializer, T value) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        if (value != null || this.configuration.getExplicitNulls()) {
            super.y(descriptor, index, serializer, value);
        }
    }
}
