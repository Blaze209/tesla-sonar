package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import java.util.Iterator;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.fourthline.orca.internal.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3666p0 implements Gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f34409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Jk f34410b;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.p0$a */
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34413c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f34415e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34413c = obj;
            this.f34415e |= Integer.MIN_VALUE;
            Object objA = C3666p0.this.a((Cl.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.p0$b */
    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34418c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f34420e;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34418c = obj;
            this.f34420e |= Integer.MIN_VALUE;
            Object objA = C3666p0.this.a((Cl.c) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public C3666p0(Gl networkService, Jk networkAnalytics) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(networkAnalytics, "networkAnalytics");
        this.f34409a = networkService;
        this.f34410b = networkAnalytics;
    }

    @Override // com.fourthline.orca.internal.Gl
    public NetworkEnvironment a() {
        return this.f34409a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Gl
    public Object a(Cl.a aVar, Continuation continuation) {
        a aVar2;
        Object objA;
        C3666p0 c3666p0;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f34415e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f34415e = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f34413c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f34415e;
        if (i12 == 0) {
            jn0.t.b(obj);
            this.f34410b.a(aVar.getAlias(), a(aVar));
            Gl gl2 = this.f34409a;
            aVar2.f34411a = this;
            aVar2.f34412b = aVar;
            aVar2.f34415e = 1;
            objA = gl2.a(aVar, aVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3666p0 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (Cl.a) aVar2.f34412b;
            c3666p0 = (C3666p0) aVar2.f34411a;
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        if (jn0.s.h(objA)) {
            c3666p0.a(aVar, (Dl) objA);
        }
        Throwable thE = jn0.s.e(objA);
        if (thE != null) {
            c3666p0.a(aVar, thE);
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Gl
    public Object a(Cl.c cVar, Continuation continuation) {
        b bVar;
        Object objA;
        C3666p0 c3666p0;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f34420e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f34420e = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f34418c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f34420e;
        if (i12 == 0) {
            jn0.t.b(obj);
            this.f34410b.a(cVar.getAlias(), a(cVar));
            Gl gl2 = this.f34409a;
            bVar.f34416a = this;
            bVar.f34417b = cVar;
            bVar.f34420e = 1;
            objA = gl2.a(cVar, bVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3666p0 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (Cl.c) bVar.f34417b;
            c3666p0 = (C3666p0) bVar.f34416a;
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        if (jn0.s.h(objA)) {
            c3666p0.a(cVar, (Dl) objA);
        }
        Throwable thE = jn0.s.e(objA);
        if (thE != null) {
            c3666p0.a(cVar, thE);
        }
        return objA;
    }

    private final void a(Cl cl2, Dl dl2) {
        if (El.e(dl2)) {
            this.f34410b.a(cl2.getAlias(), a(cl2), Integer.valueOf(dl2.c()), El.c(dl2));
        } else {
            this.f34410b.a(cl2.getAlias(), a(cl2), Integer.valueOf(dl2.c()), El.c(dl2), null);
        }
    }

    private final void a(Cl cl2, Throwable th2) {
        Jk.a.a(this.f34410b, cl2.getAlias(), a(cl2), null, null, th2, 12, null);
    }

    private final Integer a(Cl cl2) {
        if (!(cl2 instanceof Cl.c)) {
            return null;
        }
        Iterator it = ((Cl.c) cl2).a().iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((Cl.c.a) it.next()).c().b().length;
        }
        return Integer.valueOf(length);
    }
}
