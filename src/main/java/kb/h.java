package kb;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public class h extends jb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JsReplyProxyBoundaryInterface f85794a;

    public h(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f85794a = jsReplyProxyBoundaryInterface;
    }

    public static /* synthetic */ Object a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        return new h(jsReplyProxyBoundaryInterface);
    }

    public static h b(InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) oq0.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable() { // from class: kb.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return h.a(jsReplyProxyBoundaryInterface);
            }
        });
    }
}
