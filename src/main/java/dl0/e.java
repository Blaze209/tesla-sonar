package dl0;

import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004*J\b\u0007\u0010\u000f\u001a\u0004\b\u0000\u0010\u0005\"\b\u0012\u0004\u0012\u00028\u00000\u00062\b\u0012\u0004\u0012\u00028\u00000\u0006B*\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u001c\b\n\u0012\u0018\b\u000bB\u0014\b\u000b\u0012\u0006\b\f\u0012\u0002\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e¨\u0006\u0010"}, d2 = {"Ldl0/b;", "other", "Ljn0/h0;", "a", "(Ldl0/b;Ldl0/b;)V", "T", "Ldl0/a;", "Ljn0/e;", "message", "Please use `AttributeKey` class instead", "replaceWith", "Ljn0/r;", "imports", "expression", "AttributeKey", "EquatableAttributeKey", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final void a(b bVar, b other) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        p013kotlin.jvm.internal.s.k(other, "other");
        Iterator<T> it = other.d().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            p013kotlin.jvm.internal.s.i(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            bVar.c(aVar, other.e(aVar));
        }
    }
}
