package xo0;

import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "Lwo0/b;", "json", "Lkotlinx/serialization/json/JsonElement;", "element", "Lro0/c;", "deserializer", "a", "(Lwo0/b;Lkotlinx/serialization/json/JsonElement;Lro0/c;)Ljava/lang/Object;", "", "discriminator", "Lkotlinx/serialization/json/JsonObject;", "b", "(Lwo0/b;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lro0/c;)Ljava/lang/Object;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class x0 {
    public static final <T> T a(wo0.b json, JsonElement element, ro0.c<? extends T> deserializer) {
        uo0.e d0Var;
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(element, "element");
        p013kotlin.jvm.internal.s.k(deserializer, "deserializer");
        if (element instanceof JsonObject) {
            d0Var = new h0(json, (JsonObject) element, null, null, 12, null);
        } else if (element instanceof JsonArray) {
            d0Var = new j0(json, (JsonArray) element);
        } else {
            if (!(element instanceof wo0.v) && !p013kotlin.jvm.internal.s.f(element, JsonNull.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            d0Var = new d0(json, (JsonPrimitive) element, null, 4, null);
        }
        return (T) d0Var.o(deserializer);
    }

    public static final <T> T b(wo0.b bVar, String discriminator, JsonObject element, ro0.c<? extends T> deserializer) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        p013kotlin.jvm.internal.s.k(discriminator, "discriminator");
        p013kotlin.jvm.internal.s.k(element, "element");
        p013kotlin.jvm.internal.s.k(deserializer, "deserializer");
        return (T) new h0(bVar, element, discriminator, deserializer.getDescriptor()).o(deserializer);
    }
}
