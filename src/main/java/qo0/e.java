package qo0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import to0.m;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lqo0/e;", "Lro0/d;", "Lko0/c;", "<init>", "()V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lko0/c;", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lko0/c;)V", "Lto0/f;", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e implements ro0.d<ko0.c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f105810a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final to0.f descriptor = m.c("kotlinx.datetime.Instant", to0.e.i.f114883a);

    private e() {
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ko0.c deserialize(uo0.e decoder) {
        s.k(decoder, "decoder");
        return ko0.c.Companion.g(ko0.c.INSTANCE, decoder.r(), null, 2, null);
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, ko0.c value) {
        s.k(encoder, "encoder");
        s.k(value, "value");
        encoder.q(value.toString());
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return descriptor;
    }
}
