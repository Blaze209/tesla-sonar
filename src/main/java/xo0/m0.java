package xo0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lxo0/m0;", "Lxo0/i0;", "Lwo0/b;", "json", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "Ljn0/h0;", "nodeConsumer", "<init>", "(Lwo0/b;Lwn0/l;)V", "", Action.KEY_ATTRIBUTE, "element", "w0", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "s0", "()Lkotlinx/serialization/json/JsonElement;", "h", "Ljava/lang/String;", "tag", "", IntegerTokenConverter.CONVERTER_KEY, "Z", "isKey", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class m0 extends i0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String tag;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(wo0.b json, wn0.l<? super JsonElement, jn0.h0> nodeConsumer) {
        super(json, nodeConsumer);
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(nodeConsumer, "nodeConsumer");
        this.isKey = true;
    }

    @Override // xo0.i0, xo0.e
    public JsonElement s0() {
        return new JsonObject(x0());
    }

    @Override // xo0.i0, xo0.e
    public void w0(String key, JsonElement element) {
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(element, "element");
        if (!this.isKey) {
            Map<String, JsonElement> mapX0 = x0();
            String str = this.tag;
            if (str == null) {
                p013kotlin.jvm.internal.s.B("tag");
                str = null;
            }
            mapX0.put(str, element);
            this.isKey = true;
            return;
        }
        if (element instanceof JsonPrimitive) {
            this.tag = ((JsonPrimitive) element).getContent();
            this.isKey = false;
        } else {
            if (element instanceof JsonObject) {
                throw z.d(wo0.c0.f122112a.getDescriptor());
            }
            if (!(element instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            throw z.d(wo0.c.f122107a.getDescriptor());
        }
    }
}
