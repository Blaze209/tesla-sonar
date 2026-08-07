package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lvo0/g2;", "Lro0/d;", "Ljn0/y;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;B)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)B", "Lto0/f;", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g2 implements ro0.d<jn0.y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2 f119618a = new g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final to0.f descriptor = g0.a("kotlin.UByte", so0.a.y(p013kotlin.jvm.internal.e.f86512a));

    private g2() {
    }

    public byte a(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        return jn0.y.b(decoder.q(getDescriptor()).H());
    }

    public void b(uo0.f encoder, byte value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        encoder.E(getDescriptor()).f(value);
    }

    @Override // ro0.c
    public /* bridge */ /* synthetic */ Object deserialize(uo0.e eVar) {
        return jn0.y.a(a(eVar));
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.q
    public /* bridge */ /* synthetic */ void serialize(uo0.f fVar, Object obj) {
        b(fVar, ((jn0.y) obj).getData());
    }
}
