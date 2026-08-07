package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import java.util.Set;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class Qj implements Gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f27478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3607nl f27479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f27480c;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f27482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27483c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27485e;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27483c = obj;
            this.f27485e |= Integer.MIN_VALUE;
            Object objA = Qj.this.a((Cl.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27487b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27489d;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f27487b = obj;
            this.f27489d |= Integer.MIN_VALUE;
            Object objA = Qj.this.a((Cl.c) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public Qj(Gl delegate, InterfaceC3607nl networkLogger) {
        p013kotlin.jvm.internal.s.k(delegate, "delegate");
        p013kotlin.jvm.internal.s.k(networkLogger, "networkLogger");
        this.f27478a = delegate;
        this.f27479b = networkLogger;
        this.f27480c = p013kotlin.collections.d1.c("/newanalytics");
    }

    @Override // com.fourthline.orca.internal.Gl
    public NetworkEnvironment a() {
        return this.f27478a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Gl
    public Object a(Cl.a aVar, Continuation continuation) {
        a aVar2;
        Object value;
        boolean z11;
        Qj qj2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f27485e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f27485e = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f27483c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f27485e;
        if (i12 == 0) {
            jn0.t.b(obj);
            boolean zContains = this.f27480c.contains(aVar.e());
            if (!zContains) {
                try {
                    this.f27479b.a(aVar);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            Gl gl2 = this.f27478a;
            aVar2.f27481a = this;
            aVar2.f27482b = zContains;
            aVar2.f27485e = 1;
            Object objA = gl2.a(aVar, aVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            value = objA;
            z11 = zContains;
            qj2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z11 = aVar2.f27482b;
            qj2 = (Qj) aVar2.f27481a;
            jn0.t.b(obj);
            value = ((jn0.s) obj).getValue();
        }
        if (!z11) {
            try {
                qj2.f27479b.a(value);
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
        return value;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Gl
    public Object a(Cl.c cVar, Continuation continuation) {
        b bVar;
        Object objA;
        Qj qj2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f27489d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f27489d = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f27487b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f27489d;
        if (i12 == 0) {
            jn0.t.b(obj);
            try {
                this.f27479b.a(cVar);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            Gl gl2 = this.f27478a;
            bVar.f27486a = this;
            bVar.f27489d = 1;
            objA = gl2.a(cVar, bVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            qj2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qj2 = (Qj) bVar.f27486a;
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        try {
            qj2.f27479b.a(objA);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        return objA;
    }
}
