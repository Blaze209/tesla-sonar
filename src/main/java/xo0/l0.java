package xo0;

import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010$\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!¨\u0006%"}, d2 = {"Lxo0/l0;", "Lxo0/h0;", "Lwo0/b;", "json", "Lkotlinx/serialization/json/JsonObject;", "value", "<init>", "(Lwo0/b;Lkotlinx/serialization/json/JsonObject;)V", "Lto0/f;", "descriptor", "", "index", "", "f0", "(Lto0/f;I)Ljava/lang/String;", "A", "(Lto0/f;)I", "tag", "Lkotlinx/serialization/json/JsonElement;", "l0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "Ljn0/h0;", "c", "(Lto0/f;)V", "k", "Lkotlinx/serialization/json/JsonObject;", "E0", "()Lkotlinx/serialization/json/JsonObject;", "", "l", "Ljava/util/List;", "keys", "m", "I", "size", "n", "position", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class l0 extends h0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final JsonObject value;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<String> keys;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(wo0.b json, JsonObject value) {
        super(json, value, null, null, 12, null);
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(value, "value");
        this.value = value;
        List<String> listM1 = p013kotlin.collections.v.m1(z0().keySet());
        this.keys = listM1;
        this.size = listM1.size() * 2;
        this.position = -1;
    }

    @Override // xo0.h0, uo0.c
    public int A(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        int i11 = this.position;
        if (i11 >= this.size - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.position = i12;
        return i12;
    }

    @Override // xo0.h0, xo0.c
    /* JADX INFO: renamed from: E0, reason: from getter and merged with bridge method [inline-methods] */
    public JsonObject getValue() {
        return this.value;
    }

    @Override // xo0.h0, xo0.c, uo0.c
    public void c(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
    }

    @Override // xo0.h0, vo0.w0
    protected String f0(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return this.keys.get(index / 2);
    }

    @Override // xo0.h0, xo0.c
    protected JsonElement l0(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        return this.position % 2 == 0 ? wo0.j.c(tag) : (JsonElement) p013kotlin.collections.v0.j(z0(), tag);
    }
}
