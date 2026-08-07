package ro0;

import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a9\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", "T", "Lvo0/b;", "Luo0/c;", "decoder", "", "klassName", "Lro0/c;", "a", "(Lvo0/b;Luo0/c;Ljava/lang/String;)Lro0/c;", "Luo0/f;", "encoder", "value", "Lro0/q;", "b", "(Lvo0/b;Luo0/f;Ljava/lang/Object;)Lro0/q;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class i {
    public static final <T> c<T> a(vo0.b<T> bVar, uo0.c decoder, String str) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        p013kotlin.jvm.internal.s.k(decoder, "decoder");
        c<T> cVarC = bVar.c(decoder, str);
        if (cVarC != null) {
            return cVarC;
        }
        vo0.c.b(str, bVar.e());
        throw new KotlinNothingValueException();
    }

    public static final <T> q<T> b(vo0.b<T> bVar, uo0.f encoder, T value) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        p013kotlin.jvm.internal.s.k(encoder, "encoder");
        p013kotlin.jvm.internal.s.k(value, "value");
        q<T> qVarD = bVar.d(encoder, value);
        if (qVarD != null) {
            return qVarD;
        }
        vo0.c.a(o0.b(value.getClass()), bVar.e());
        throw new KotlinNothingValueException();
    }
}
