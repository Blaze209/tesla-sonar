package gk;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.SerializationException;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f69093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f69094b;

    public m1(j settings, u apiClient) {
        p013kotlin.jvm.internal.s.k(settings, "settings");
        p013kotlin.jvm.internal.s.k(apiClient, "apiClient");
        this.f69093a = settings;
        this.f69094b = apiClient;
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

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object b(fk.a aVar, Continuation continuation) {
        i1 i1Var;
        String strB;
        m1 m1Var;
        p1 p1Var;
        if (continuation instanceof i1) {
            i1Var = (i1) continuation;
            int i11 = i1Var.f69069q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i1Var.f69069q = i11 - Integer.MIN_VALUE;
            } else {
                i1Var = new i1(this, continuation);
            }
        } else {
            i1Var = new i1(this, continuation);
        }
        i1 i1Var2 = i1Var;
        Object objB = i1Var2.f69067o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = i1Var2.f69069q;
        Object objD = null;
        if (i12 == 0) {
            jn0.t.b(objB);
            ((u) this.f69094b).c(d());
            String holderName = aVar.getHolderName();
            String cardNumber = aVar.getCardNumber();
            String cvv = aVar.getCvv();
            int expirationMonth = aVar.getExpirationMonth();
            int expirationYear = aVar.getExpirationYear();
            j jVar = this.f69093a;
            e0 e0Var = new e0(holderName, cardNumber, cvv, expirationMonth, expirationYear, jVar.f69071b, jVar.f69070a);
            try {
                wo0.b bVar = w0.f69151a;
                bVar.getSerializersModule();
                strB = bVar.b(e0.f69037h.a(), e0Var);
            } catch (SerializationException | IllegalArgumentException | Exception e11) {
                c(e11);
                strB = null;
            }
            g gVar = this.f69094b;
            j jVar2 = this.f69093a;
            p013kotlin.jvm.internal.s.k(jVar2, "<this>");
            String str = jVar2.f69072c ? "https://ppmcc-sandbox.dlocal.com/cvault/credit-card/temporal" : "https://ppmcc.dlocal.com/cvault/credit-card/temporal";
            i1Var2.f69066n = this;
            i1Var2.f69069q = 1;
            u uVar = (u) gVar;
            uVar.getClass();
            objB = uVar.b(str, k.f69076a, strB, true, i1Var2);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            m1Var = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m1Var = i1Var2.f69066n;
            jn0.t.b(objB);
        }
        w wVar = (w) objB;
        if (!(wVar instanceof q)) {
            if (wVar instanceof m) {
                p1Var = new p1(new fk.c(((m) wVar).f69092b, fk.d.NETWORKING));
            } else {
                if (!(wVar instanceof t)) {
                    throw new NoWhenBranchMatchedException();
                }
                p1Var = new p1(new fk.c(((t) wVar).f69135a, fk.d.UNAVAILABLE));
            }
            return p1Var;
        }
        String str2 = ((q) wVar).f69109a;
        try {
            wo0.b bVar2 = w0.f69151a;
            bVar2.getSerializersModule();
            objD = bVar2.d(so0.a.p(x1.f69157b.a()), str2);
        } catch (SerializationException | IllegalArgumentException | Exception e12) {
            m1Var.c(e12);
        }
        x1 x1Var = (x1) objD;
        return x1Var != null ? new t1(new fk.b(x1Var.f69158a)) : new p1(new fk.c("Cannot decode card token result", fk.d.INTERNAL));
    }

    public final void c(Exception exception) {
        p013kotlin.jvm.internal.s.k(exception, "exception");
        a(h1.a(exception, this.f69093a.f69071b));
    }

    public final List d() {
        return p013kotlin.collections.v.p(new Pair("x-version", "1.1.0"), new Pair("x-fields-api-key", this.f69093a.f69070a));
    }

    @Override // gk.b1
    public final j a() {
        return this.f69093a;
    }
}
