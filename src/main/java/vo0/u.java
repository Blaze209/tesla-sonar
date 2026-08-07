package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lvo0/u;", "Lro0/d;", "Lio0/b;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;J)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)J", "Lto0/f;", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u implements ro0.d<io0.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f119697a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final to0.f descriptor = new PrimitiveDescriptor("kotlin.time.Duration", to0.e.i.f114883a);

    private u() {
    }

    public long a(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        return io0.b.INSTANCE.d(decoder.r());
    }

    public void b(uo0.f encoder, long value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        encoder.q(io0.b.I(value));
    }

    @Override // ro0.c
    public /* bridge */ /* synthetic */ Object deserialize(uo0.e eVar) {
        return io0.b.f(a(eVar));
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public /* bridge */ /* synthetic */ void serialize(uo0.f fVar, Object obj) {
        b(fVar, ((io0.b) obj).getRawValue());
    }
}
