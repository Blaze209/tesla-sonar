package xo0;

import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lxo0/d0;", "Lxo0/c;", "Lwo0/b;", "json", "Lkotlinx/serialization/json/JsonElement;", "value", "", "polymorphicDiscriminator", "<init>", "(Lwo0/b;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "Lto0/f;", "descriptor", "", "A", "(Lto0/f;)I", "tag", "l0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "g", "Lkotlinx/serialization/json/JsonElement;", "z0", "()Lkotlinx/serialization/json/JsonElement;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class d0 extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final JsonElement value;

    public /* synthetic */ d0(wo0.b bVar, JsonElement jsonElement, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, jsonElement, (i11 & 4) != 0 ? null : str);
    }

    @Override // uo0.c
    public int A(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xo0.c
    public JsonElement l0(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        if (tag == "primitive") {
            return getValue();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // xo0.c
    /* JADX INFO: renamed from: z0, reason: from getter */
    public JsonElement getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(wo0.b json, JsonElement value, String str) {
        super(json, value, str, null);
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(value, "value");
        this.value = value;
        c0("primitive");
    }
}
