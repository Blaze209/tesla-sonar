package xo0;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0017j\b\u0012\u0004\u0012\u00020\u0005`\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lxo0/k0;", "Lxo0/e;", "Lwo0/b;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "Ljn0/h0;", "nodeConsumer", "<init>", "(Lwo0/b;Lwn0/l;)V", "Lto0/f;", "descriptor", "", "index", "", "b0", "(Lto0/f;I)Ljava/lang/String;", Action.KEY_ATTRIBUTE, "element", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "g", "Ljava/util/ArrayList;", "array", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class k0 extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<JsonElement> array;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(wo0.b json, wn0.l<? super JsonElement, jn0.h0> nodeConsumer) {
        super(json, nodeConsumer, null);
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(nodeConsumer, "nodeConsumer");
        this.array = new ArrayList<>();
    }

    @Override // xo0.e, vo0.x0
    protected String b0(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return String.valueOf(index);
    }

    @Override // xo0.e
    public JsonElement s0() {
        return new JsonArray(this.array);
    }

    @Override // xo0.e
    public void w0(String key, JsonElement element) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(element, "element");
        this.array.add(Integer.parseInt(key), element);
    }
}
