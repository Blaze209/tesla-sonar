package ce;

import be.h;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.CheckoutException;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J%\u0010\u0010\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lce/m;", "Lbe/h;", "T", "Lce/j;", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ljn0/h0;", "g", "(Lkotlinx/coroutines/CoroutineScope;)V", "b", "Lce/p;", "event", "Lce/f;", "componentCallback", "h", "(Lce/p;Lce/f;)V", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m<T extends be.h<?>> implements j<T> {
    @Override // ce.j
    public void g(CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ce.j
    public void h(p<T> event, f componentCallback) {
        p013kotlin.jvm.internal.s.k(event, "event");
        p013kotlin.jvm.internal.s.k(componentCallback, "componentCallback");
        be.f fVar = componentCallback instanceof be.f ? (be.f) componentCallback : 0;
        if (fVar == 0) {
            throw new CheckoutException("Callback must be type of " + be.f.class.getCanonicalName(), null, 2, null);
        }
        me.a aVar = me.a.VERBOSE;
        me.b.Companion companion = me.b.INSTANCE;
        if (companion.a().a(aVar)) {
            String name = m.class.getName();
            p013kotlin.jvm.internal.s.h(name);
            String strU1 = p013kotlin.text.t.u1(p013kotlin.text.t.y1(name, CoreConstants.DOLLAR, null, 2, null), CoreConstants.DOT, null, 2, null);
            if (strU1.length() != 0) {
                name = p013kotlin.text.t.W0(strU1, "Kt");
            }
            me.b bVarA = companion.a();
            bVarA.b(aVar, "CO." + name, "Event received " + event, null);
        }
        if (event instanceof p.a) {
            fVar.a(((p.a) event).getData());
            return;
        }
        if (event instanceof p.b) {
            fVar.b(((p.b) event).getCom.fourthline.analytics.internal.AnalyticsAttribute.Error java.lang.String());
            return;
        }
        if (event instanceof p.d) {
            fVar.e(((p.d) event).a());
            return;
        }
        if (event instanceof p.e) {
            fVar.d(((p.e) event).a());
        } else if (event instanceof p.c) {
            p.c cVar = (p.c) event;
            fVar.c(cVar.getRequiredPermission(), cVar.getPermissionCallback());
        }
    }

    @Override // ce.j
    public void b() {
    }
}
