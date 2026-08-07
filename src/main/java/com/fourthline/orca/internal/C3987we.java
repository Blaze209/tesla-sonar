package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidServiceProvider;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.we, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3987we implements C3991wi.e, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2869Fd f36426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C2899Lc f36427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineScope f36428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final EidServiceProvider f36429d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.we$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36431b;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = C3987we.this.new a(continuation);
            aVar.f36431b = obj;
            return aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objMo84startProcessgIAlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f36430a;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    C3987we c3987we = C3987we.this;
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    EidServiceProvider eidServiceProvider = c3987we.f36429d;
                    boolean zD = c3987we.f36427b.d();
                    this.f36430a = 1;
                    objMo84startProcessgIAlus = eidServiceProvider.mo84startProcessgIAlus(zD, this);
                    if (objMo84startProcessgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                    objMo84startProcessgIAlus = ((jn0.s) obj).getValue();
                }
                jn0.t.b(objMo84startProcessgIAlus);
                objB = jn0.s.b(jn0.h0.f84049a);
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(jn0.t.a(th2));
            }
            return jn0.s.a(objB);
        }
    }

    public C3987we(InterfaceC2869Fd repository, C2899Lc bundle, CoroutineScope coroutineScope, EidServiceProvider eidServiceProvider) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(eidServiceProvider, "eidServiceProvider");
        this.f36426a = repository;
        this.f36427b = bundle;
        this.f36428c = coroutineScope;
        this.f36429d = eidServiceProvider;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f36428c.getCoroutineContext();
    }

    @Override // com.fourthline.orca.internal.C3991wi.e
    public void a(C3991wi c3991wi) {
        p013kotlin.jvm.internal.s.k(c3991wi, "<this>");
        if (this.f36429d.isAvailable()) {
            if (this.f36426a.a()) {
                this.f36427b.a(true);
            }
            if (this.f36427b.g() == null) {
                this.f36427b.a(BuildersKt__Builders_commonKt.async$default(this, null, null, new a(null), 3, null));
            }
        }
    }
}
