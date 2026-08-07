package ce;

import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lce/l;", "Lce/c;", "<init>", "()V", "Lce/b;", "event", "Lbe/a;", "actionComponentCallback", "Ljn0/h0;", "a", "(Lce/b;Lbe/a;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l implements c {
    @Override // ce.c
    public void a(b event, be.a actionComponentCallback) {
        p013kotlin.jvm.internal.s.k(event, "event");
        p013kotlin.jvm.internal.s.k(actionComponentCallback, "actionComponentCallback");
        me.a aVar = me.a.VERBOSE;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = l.class.getName();
            p013kotlin.jvm.internal.s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            me.b bVarA = companion.a();
            bVarA.b(aVar, "CO." + name, "Event received " + event, null);
        }
        if (event instanceof b.a) {
            actionComponentCallback.a(((b.a) event).getData());
            return;
        }
        if (event instanceof b.C0392b) {
            actionComponentCallback.b(((b.C0392b) event).getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String());
        } else if (event instanceof b.c) {
            b.c cVar = (b.c) event;
            actionComponentCallback.c(cVar.getRequiredPermission(), cVar.getPermissionCallback());
        }
    }
}
