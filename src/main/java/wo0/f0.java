package wo0;

import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;
import xo0.z0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lwo0/f0;", "", "T", "Lro0/d;", "tSerializer", "<init>", "(Lro0/d;)V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "serialize", "(Luo0/f;Ljava/lang/Object;)V", "Luo0/e;", "decoder", "deserialize", "(Luo0/e;)Ljava/lang/Object;", "Lkotlinx/serialization/json/JsonElement;", "element", "a", "(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonElement;", "b", "Lro0/d;", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class f0<T> implements ro0.d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ro0.d<T> tSerializer;

    public f0(ro0.d<T> tSerializer) {
        p013kotlin.jvm.internal.s.k(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    protected abstract JsonElement a(JsonElement element);

    protected JsonElement b(JsonElement element) {
        p013kotlin.jvm.internal.s.k(element, "element");
        return element;
    }

    @Override // ro0.c
    public final T deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        h hVarD = r.d(decoder);
        return (T) hVarD.getJson().c(this.tSerializer, a(hVarD.y()));
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // ro0.q
    public final void serialize(uo0.f encoder, T value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        s sVarE = r.e(encoder);
        sVarE.n(b(z0.d(sVarE.getJson(), value, this.tSerializer)));
    }
}
