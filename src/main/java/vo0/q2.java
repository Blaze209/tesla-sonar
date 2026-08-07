package vo0;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lvo0/q2;", "Lro0/d;", "Ljn0/h0;", "<init>", "()V", "Luo0/f;", "encoder", "value", "b", "(Luo0/f;Ljn0/h0;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)V", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q2 implements ro0.d<jn0.h0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q2 f119677b = new q2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ e1<jn0.h0> f119678a = new e1<>("kotlin.Unit", jn0.h0.f84049a);

    private q2() {
    }

    public void a(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        this.f119678a.deserialize(decoder);
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, jn0.h0 value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        this.f119678a.serialize(encoder, value);
    }

    @Override // ro0.c
    public /* bridge */ /* synthetic */ Object deserialize(uo0.e eVar) {
        a(eVar);
        return jn0.h0.f84049a;
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return this.f119678a.getDescriptor();
    }
}
