package p024x1;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lx1/t;", "", Action.KEY_ATTRIBUTE, "", "lastKnownIndex", "a", "(Lx1/t;Ljava/lang/Object;I)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u {
    public static final int a(t tVar, Object obj, int i11) {
        int iB;
        return (obj == null || tVar.a() == 0 || (i11 < tVar.a() && s.f(obj, tVar.c(i11))) || (iB = tVar.b(obj)) == -1) ? i11 : iB;
    }
}
