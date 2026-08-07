package wk0;

import bl0.r;
import ch.qos.logback.core.joran.action.Action;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\t\u001a\u00020\u0005*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbl0/r;", "", Action.KEY_ATTRIBUTE, "", "value", "Ljn0/h0;", "a", "(Lbl0/r;Ljava/lang/String;Ljava/lang/Object;)V", "Lwk0/c;", "b", "(Lwk0/c;Ljava/lang/String;Ljava/lang/Object;)V", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {
    public static final void a(r rVar, String key, Object obj) {
        s.k(rVar, "<this>");
        s.k(key, "key");
        if (obj != null) {
            rVar.getHeaders().f(key, obj.toString());
            h0 h0Var = h0.f84049a;
        }
    }

    public static final void b(c cVar, String key, Object obj) {
        s.k(cVar, "<this>");
        s.k(key, "key");
        if (obj != null) {
            cVar.getCom.google.android.gms.common.internal.ImagesContract.URL java.lang.String().getParameters().f(key, obj.toString());
            h0 h0Var = h0.f84049a;
        }
    }
}
