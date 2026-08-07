package androidx.work;

import java.util.concurrent.Executor;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/work/o0;", "tracer", "", AnnotatedPrivateKey.LABEL, "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "Ljn0/h0;", "block", "Landroidx/work/d0;", "c", "(Landroidx/work/o0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lwn0/a;)Landroidx/work/d0;", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h0 {
    public static final d0 c(final o0 tracer, final String label, final Executor executor, final wn0.a<jn0.h0> block) {
        p013kotlin.jvm.internal.s.k(tracer, "tracer");
        p013kotlin.jvm.internal.s.k(label, "label");
        p013kotlin.jvm.internal.s.k(executor, "executor");
        p013kotlin.jvm.internal.s.k(block, "block");
        final androidx.p003lifecycle.i0 i0Var = new androidx.p003lifecycle.i0(d0.f14504b);
        com.google.common.util.concurrent.s sVarA = androidx.concurrent.futures.c.a(new androidx.concurrent.futures.c.InterfaceC0146c() { // from class: androidx.work.f0
            @Override // androidx.concurrent.futures.c.InterfaceC0146c
            public final Object a(androidx.concurrent.futures.c.a aVar) {
                return h0.d(executor, tracer, label, block, i0Var, aVar);
            }
        });
        p013kotlin.jvm.internal.s.j(sVarA, "getFuture(...)");
        return new e0(i0Var, sVarA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(Executor executor, final o0 o0Var, final String str, final wn0.a aVar, final androidx.p003lifecycle.i0 i0Var, final androidx.concurrent.futures.c.a completer) {
        p013kotlin.jvm.internal.s.k(completer, "completer");
        executor.execute(new Runnable() { // from class: androidx.work.g0
            @Override // java.lang.Runnable
            public final void run() {
                h0.e(o0Var, str, aVar, i0Var, completer);
            }
        });
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(o0 o0Var, String str, wn0.a aVar, androidx.p003lifecycle.i0 i0Var, androidx.concurrent.futures.c.a aVar2) {
        boolean zIsEnabled = o0Var.isEnabled();
        if (zIsEnabled) {
            try {
                o0Var.a(str);
            } catch (Throwable th2) {
                if (zIsEnabled) {
                    o0Var.b();
                }
                throw th2;
            }
        }
        try {
            aVar.invoke();
            d0.b.c cVar = d0.f14503a;
            i0Var.postValue(cVar);
            aVar2.c(cVar);
        } catch (Throwable th3) {
            i0Var.postValue(new d0.b.a(th3));
            aVar2.f(th3);
        }
        jn0.h0 h0Var = jn0.h0.f84049a;
        if (zIsEnabled) {
            o0Var.b();
        }
    }
}
