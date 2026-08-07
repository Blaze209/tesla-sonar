package ok0;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrk0/a;", "engine", "Lkotlin/Function1;", "Lok0/b;", "Ljn0/h0;", "block", "Lok0/a;", "a", "(Lrk0/a;Lwn0/l;)Lok0/a;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final a a(rk0.a engine, l<? super b<?>, h0> block) {
        s.k(engine, "engine");
        s.k(block, "block");
        b bVar = new b();
        block.invoke(bVar);
        return new a(engine, bVar, false);
    }
}
