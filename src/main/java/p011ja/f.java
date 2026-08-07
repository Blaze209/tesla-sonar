package p011ja;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "name", "Lkotlin/Function1;", "Lja/i;", "Ljn0/h0;", "builder", "Lja/e;", "a", "(Ljava/lang/String;Lwn0/l;)Lja/e;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    public static final e a(String name, l<? super i, h0> builder) {
        s.k(name, "name");
        s.k(builder, "builder");
        i iVar = new i();
        builder.invoke(iVar);
        return new e(name, iVar.a());
    }
}
