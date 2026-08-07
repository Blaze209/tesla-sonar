package xo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlinx.serialization.json.JsonElement;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\"\u0018\u0010\r\u001a\u00020\n*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"T", "Lwo0/b;", "json", "value", "Lro0/q;", "serializer", "Lkotlinx/serialization/json/JsonElement;", DateTokenConverter.CONVERTER_KEY, "(Lwo0/b;Ljava/lang/Object;Lro0/q;)Lkotlinx/serialization/json/JsonElement;", "Lto0/f;", "", "c", "(Lto0/f;)Z", "requiresTopLevelTag", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class z0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(to0.f fVar) {
        return (fVar.getKind() instanceof to0.e) || fVar.getKind() == to0.n.b.f114905a;
    }

    public static final <T> JsonElement d(wo0.b json, T t11, ro0.q<? super T> serializer) {
        p013kotlin.jvm.internal.s.k(json, "json");
        p013kotlin.jvm.internal.s.k(serializer, "serializer");
        final p013kotlin.jvm.internal.n0 n0Var = new p013kotlin.jvm.internal.n0();
        new i0(json, new wn0.l() { // from class: xo0.y0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return z0.e(n0Var, (JsonElement) obj);
            }
        }).s(serializer, t11);
        T t12 = n0Var.f86529a;
        if (t12 != null) {
            return (JsonElement) t12;
        }
        p013kotlin.jvm.internal.s.B("result");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final jn0.h0 e(p013kotlin.jvm.internal.n0 n0Var, JsonElement it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        n0Var.f86529a = it;
        return jn0.h0.f84049a;
    }
}
