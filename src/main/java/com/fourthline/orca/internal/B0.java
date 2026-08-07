package com.fourthline.orca.internal;

import com.fourthline.networking.NetworkEnvironment;
import p013kotlin.Lazy;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 implements Gl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Gl f25042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final wn0.a f25043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f25044c;

    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25045a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25047c;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f25045a = obj;
            this.f25047c |= Integer.MIN_VALUE;
            Object objA = B0.this.a((Cl.a) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25048a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25050c;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f25048a = obj;
            this.f25050c |= Integer.MIN_VALUE;
            Object objA = B0.this.a((Cl.c) null, this);
            return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : jn0.s.a(objA);
        }
    }

    public B0(Gl networkService, wn0.a authTokenProvider) {
        p013kotlin.jvm.internal.s.k(networkService, "networkService");
        p013kotlin.jvm.internal.s.k(authTokenProvider, "authTokenProvider");
        this.f25042a = networkService;
        this.f25043b = authTokenProvider;
        this.f25044c = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.p00
            @Override // wn0.a
            public final Object invoke() {
                return B0.a(this.f34421a);
            }
        });
    }

    @Override // com.fourthline.orca.internal.Gl
    public NetworkEnvironment a() {
        return this.f25042a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(B0 b11) {
        return (String) b11.f25043b.invoke();
    }

    private final String b() {
        return (String) this.f25044c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Gl
    public Object a(Cl.a aVar, Continuation continuation) {
        a aVar2;
        if (continuation instanceof a) {
            aVar2 = (a) continuation;
            int i11 = aVar2.f25047c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.f25047c = i11 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(continuation);
            }
        } else {
            aVar2 = new a(continuation);
        }
        Object obj = aVar2.f25045a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar2.f25047c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        Cl.a aVarA = Cl.a.a(aVar, null, null, null, p013kotlin.collections.v0.s(aVar.b(), C0.b(b())), null, null, 55, null);
        Gl gl2 = this.f25042a;
        aVar2.f25047c = 1;
        Object objA = gl2.a(aVarA, aVar2);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.Gl
    public Object a(Cl.c cVar, Continuation continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i11 = bVar.f25050c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f25050c = i11 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f25048a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = bVar.f25050c;
        if (i12 != 0) {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            return ((jn0.s) obj).getValue();
        }
        jn0.t.b(obj);
        Cl.c cVarA = Cl.c.a(cVar, null, null, p013kotlin.collections.v0.s(cVar.b(), C0.b(b())), null, null, 27, null);
        Gl gl2 = this.f25042a;
        bVar.f25050c = 1;
        Object objA = gl2.a(cVarA, bVar);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
