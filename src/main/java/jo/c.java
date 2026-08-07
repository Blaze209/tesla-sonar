package jo;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljo/c;", "Ljo/f;", "<init>", "()V", "", "params", "Ljo/h;", "responder", "Ljn0/h0;", "b", "(Ljava/lang/Object;Ljo/h;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class c implements f {
    @Override // jo.f
    public final void b(Object params, h responder) {
        s.k(responder, "responder");
        responder.a("Request is not supported");
        qk.a.m(b.class.getSimpleName(), "Request is not supported");
    }
}
