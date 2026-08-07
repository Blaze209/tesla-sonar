package wo0;

import jn0.h0;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lwo0/q;", "Lro0/d;", "Lkotlinx/serialization/json/JsonElement;", "<init>", "()V", "Luo0/f;", "encoder", "value", "Ljn0/h0;", "n", "(Luo0/f;Lkotlinx/serialization/json/JsonElement;)V", "Luo0/e;", "decoder", "m", "(Luo0/e;)Lkotlinx/serialization/json/JsonElement;", "Lto0/f;", "b", "Lto0/f;", "getDescriptor", "()Lto0/f;", "descriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q implements ro0.d<JsonElement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f122156a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final to0.f descriptor = to0.m.g("kotlinx.serialization.json.JsonElement", to0.d.b.f114874a, new to0.f[0], new wn0.l() { // from class: wo0.k
        @Override // wn0.l
        public final Object invoke(Object obj) {
            return q.g((to0.a) obj);
        }
    });

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 g(to0.a buildSerialDescriptor) {
        p013kotlin.jvm.internal.s.k(buildSerialDescriptor, "$this$buildSerialDescriptor");
        to0.a.b(buildSerialDescriptor, "JsonPrimitive", r.f(new wn0.a() { // from class: wo0.l
            @Override // wn0.a
            public final Object invoke() {
                return q.h();
            }
        }), null, false, 12, null);
        to0.a.b(buildSerialDescriptor, "JsonNull", r.f(new wn0.a() { // from class: wo0.m
            @Override // wn0.a
            public final Object invoke() {
                return q.i();
            }
        }), null, false, 12, null);
        to0.a.b(buildSerialDescriptor, "JsonLiteral", r.f(new wn0.a() { // from class: wo0.n
            @Override // wn0.a
            public final Object invoke() {
                return q.j();
            }
        }), null, false, 12, null);
        to0.a.b(buildSerialDescriptor, "JsonObject", r.f(new wn0.a() { // from class: wo0.o
            @Override // wn0.a
            public final Object invoke() {
                return q.k();
            }
        }), null, false, 12, null);
        to0.a.b(buildSerialDescriptor, "JsonArray", r.f(new wn0.a() { // from class: wo0.p
            @Override // wn0.a
            public final Object invoke() {
                return q.l();
            }
        }), null, false, 12, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f h() {
        return d0.f122134a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f i() {
        return z.f122164a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f j() {
        return w.f122162a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f k() {
        return c0.f122112a.getDescriptor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final to0.f l() {
        return c.f122107a.getDescriptor();
    }

    @Override // ro0.d, ro0.q, ro0.c
    public to0.f getDescriptor() {
        return descriptor;
    }

    @Override // ro0.c
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public JsonElement deserialize(uo0.e decoder) {
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        return r.d(decoder).y();
    }

    @Override // ro0.q
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void serialize(uo0.f encoder, JsonElement value) {
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        r.h(encoder);
        if (value instanceof JsonPrimitive) {
            encoder.s(d0.f122134a, value);
        } else if (value instanceof JsonObject) {
            encoder.s(c0.f122112a, value);
        } else {
            if (!(value instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.s(c.f122107a, value);
        }
    }
}
