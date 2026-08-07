package xo0;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001e"}, d2 = {"Lxo0/j0;", "Lxo0/c;", "Lwo0/b;", "json", "Lkotlinx/serialization/json/JsonArray;", "value", "<init>", "(Lwo0/b;Lkotlinx/serialization/json/JsonArray;)V", "Lto0/f;", "descriptor", "", "index", "", "f0", "(Lto0/f;I)Ljava/lang/String;", "tag", "Lkotlinx/serialization/json/JsonElement;", "l0", "(Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", "A", "(Lto0/f;)I", "g", "Lkotlinx/serialization/json/JsonArray;", "C0", "()Lkotlinx/serialization/json/JsonArray;", "h", "I", "size", IntegerTokenConverter.CONVERTER_KEY, "currentIndex", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class j0 extends c {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final JsonArray value;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(wo0.b json, JsonArray value) {
        super(json, value, null, 4, null);
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(value, "value");
        this.value = value;
        this.size = getValue().size();
        this.currentIndex = -1;
    }

    @Override // uo0.c
    public int A(to0.f descriptor) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        int i11 = this.currentIndex;
        if (i11 >= this.size - 1) {
            return -1;
        }
        int i12 = i11 + 1;
        this.currentIndex = i12;
        return i12;
    }

    @Override // xo0.c
    /* JADX INFO: renamed from: C0, reason: from getter */
    public JsonArray getValue() {
        return this.value;
    }

    @Override // vo0.w0
    protected String f0(to0.f descriptor, int index) {
        p013kotlin.jvm.internal.s.k(descriptor, "descriptor");
        return String.valueOf(index);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // xo0.c
    public JsonElement l0(String tag) {
        p013kotlin.jvm.internal.s.k(tag, "tag");
        return getValue().get(Integer.parseInt(tag));
    }
}
