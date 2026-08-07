package gk;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f69053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f69054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f69055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f69056d;

    public f1(j settings) {
        p013kotlin.jvm.internal.s.k(settings, "settings");
        this.f69053a = settings;
        a1 a1Var = new a1();
        this.f69054b = a1Var;
        this.f69055c = CoroutineScopeKt.CoroutineScope(a1.a());
        this.f69056d = new m1(a(), new u(a(), a1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gk.b1
    public final void a(q0 event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        Iterator it = p013kotlin.collections.v.p(y0.f69161d.a(new i0(a())), h.f69057a.a(new a2(a()))).iterator();
        while (it.hasNext()) {
            ((v0) it.next()).a(event);
        }
    }

    @Override // gk.b1
    public final j a() {
        return this.f69053a;
    }
}
