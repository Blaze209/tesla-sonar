package wo0;

import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;
import p013kotlin.text.n0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lwo0/w;", "Lro0/d;", "Lwo0/v;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "b", "(Luo0/f;Lwo0/v;)V", "Luo0/e;", "decoder", "a", "(Luo0/e;)Lwo0/v;", "Lto0/f;", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class w implements ro0.d<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f122162a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final to0.f descriptor = to0.m.c("kotlinx.serialization.json.JsonLiteral", to0.e.i.f114883a);

    private w() {
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public v deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        JsonElement jsonElementY = r.d(decoder).y();
        if (jsonElementY instanceof v) {
            return (v) jsonElementY;
        }
        throw xo0.z.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + o0.b(jsonElementY.getClass()), jsonElementY.toString());
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, v value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        r.h(encoder);
        if (value.getIsString()) {
            encoder.q(value.getContent());
            return;
        }
        if (value.getCoerceToInlineType() != null) {
            encoder.E(value.getCoerceToInlineType()).q(value.getContent());
            return;
        }
        Long lZ = p013kotlin.text.t.z(value.getContent());
        if (lZ != null) {
            encoder.v(lZ.longValue());
            return;
        }
        jn0.c0 c0VarI = n0.i(value.getContent());
        if (c0VarI != null) {
            encoder.E(so0.a.t(jn0.c0.INSTANCE).getDescriptor()).v(c0VarI.getData());
            return;
        }
        Double dU = p013kotlin.text.t.u(value.getContent());
        if (dU != null) {
            encoder.r(dU.doubleValue());
            return;
        }
        Boolean boolE1 = p013kotlin.text.t.E1(value.getContent());
        if (boolE1 != null) {
            encoder.l(boolE1.booleanValue());
        } else {
            encoder.q(value.getContent());
        }
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return descriptor;
    }
}
