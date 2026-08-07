package gk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements g, b1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f69140d = p013kotlin.collections.v.p(new Pair("Content-Type", "application/json; charset=utf-8"), new Pair("Accept", "application/json; charset=utf-8"), new Pair("x-platform", "android"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f69141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f69142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f69143c;

    public u(j settings, a1 dispatcherProvider) {
        p013kotlin.jvm.internal.s.k(settings, "settings");
        p013kotlin.jvm.internal.s.k(dispatcherProvider, "dispatcherProvider");
        this.f69141a = settings;
        this.f69142b = dispatcherProvider;
        this.f69143c = new ArrayList();
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

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object b(String str, k kVar, String str2, boolean z11, Continuation continuation) {
        o oVar;
        u uVar;
        k kVar2;
        boolean z12;
        String string;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i11 = oVar.f69102s;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f69102s = i11 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, continuation);
            }
        } else {
            oVar = new o(this, continuation);
        }
        o oVar2 = oVar;
        Object objWithContext = oVar2.f69100q;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = oVar2.f69102s;
        if (i12 == 0) {
            jn0.t.b(objWithContext);
            try {
                this.f69142b.getClass();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                r rVar = new r(kVar, this, str, str2, null, z11);
                oVar2.f69097n = this;
                oVar2.f69098o = kVar;
                oVar2.f69099p = z11;
                oVar2.f69102s = 1;
                objWithContext = BuildersKt.withContext(io2, rVar, oVar2);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                uVar = this;
                kVar2 = kVar;
                z12 = z11;
                return (w) objWithContext;
            } catch (Exception e11) {
                e = e11;
                uVar = this;
                kVar2 = kVar;
                z12 = z11;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z13 = oVar2.f69099p;
            k kVar3 = oVar2.f69098o;
            uVar = oVar2.f69097n;
            try {
                jn0.t.b(objWithContext);
                z12 = z13;
                kVar2 = kVar3;
                try {
                    return (w) objWithContext;
                } catch (Exception e12) {
                    e = e12;
                }
            } catch (Exception e13) {
                e = e13;
                z12 = z13;
                kVar2 = kVar3;
            }
        }
        if (!z12) {
            Throwable cause = e.getCause();
            if (cause == null || (string = cause.getMessage()) == null) {
                string = e.toString();
            }
            uVar.getClass();
            x0.a(uVar, "Failed to send " + kVar2 + " request: " + string);
        }
        return new t(e.getLocalizedMessage());
    }

    public final void c(List list) {
        this.f69143c.clear();
        this.f69143c.addAll(f69140d);
        if (list != null) {
            this.f69143c.addAll(list);
        }
    }

    @Override // gk.b1
    public final j a() {
        return this.f69141a;
    }
}
