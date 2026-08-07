package qi0;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lqi0/c;", "", "<init>", "()V", "Lkotlin/Function0;", "Ljn0/h0;", "a", "Lwn0/a;", "b", "()Lwn0/a;", "c", "(Lwn0/a;)V", "submitCode", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private wn0.a<h0> submitCode = new wn0.a() { // from class: qi0.b
        @Override // wn0.a
        public final Object invoke() {
            return c.d();
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d() {
        return h0.f84049a;
    }

    public final wn0.a<h0> b() {
        return this.submitCode;
    }

    public final void c(wn0.a<h0> aVar) {
        s.k(aVar, "<set-?>");
        this.submitCode = aVar;
    }
}
