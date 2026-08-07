package com.fourthline.orca.internal;

import java.util.Objects;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Te, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2941Te implements InterfaceC2931Re, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC3216ef f27897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Bs f27898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3131cf f27899d;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Te$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27904e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Throwable f27906g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f27907h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ wn0.a f27908i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Throwable th2, String str, wn0.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f27906g = th2;
            this.f27907h = str;
            this.f27908i = aVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C2941Te.this.new a(this.f27906g, this.f27907h, this.f27908i, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            InterfaceC3131cf interfaceC3131cf;
            String str;
            wn0.a aVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f27904e;
            if (i11 == 0) {
                jn0.t.b(obj);
                InterfaceC3131cf interfaceC3131cf2 = C2941Te.this.f27899d;
                C2941Te c2941Te = C2941Te.this;
                th2 = this.f27906g;
                String str2 = this.f27907h;
                wn0.a aVar2 = this.f27908i;
                InterfaceC4001ws interfaceC4001wsBuildStateFor = c2941Te.f27897b.buildStateFor(th2);
                Bs bs2 = c2941Te.f27898c;
                this.f27900a = th2;
                this.f27901b = str2;
                this.f27902c = aVar2;
                this.f27903d = interfaceC3131cf2;
                this.f27904e = 1;
                Object objA = bs2.a(interfaceC4001wsBuildStateFor, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC3131cf = interfaceC3131cf2;
                obj = objA;
                str = str2;
                aVar = aVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3131cf = (InterfaceC3131cf) this.f27903d;
                aVar = (wn0.a) this.f27902c;
                str = (String) this.f27901b;
                th2 = (Throwable) this.f27900a;
                jn0.t.b(obj);
            }
            InterfaceC3958vs interfaceC3958vs = (InterfaceC3958vs) obj;
            if (interfaceC3958vs instanceof InterfaceC3958vs.a) {
                interfaceC3131cf.onPrimaryClicked(((InterfaceC3958vs.a) interfaceC3958vs).a(), th2, str, aVar);
            } else if (interfaceC3958vs instanceof InterfaceC3958vs.b) {
                interfaceC3131cf.onSecondaryClicked(((InterfaceC3958vs.b) interfaceC3958vs).a(), th2, str, aVar);
            } else if (!(interfaceC3958vs instanceof InterfaceC3958vs.c)) {
                throw new NoWhenBranchMatchedException();
            }
            return jn0.h0.f84049a;
        }
    }

    public C2941Te(InterfaceC3216ef errorPopupStateBuilder, Bs popupPresenter, InterfaceC3131cf clicksHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(errorPopupStateBuilder, "errorPopupStateBuilder");
        p013kotlin.jvm.internal.s.k(popupPresenter, "popupPresenter");
        p013kotlin.jvm.internal.s.k(clicksHandler, "clicksHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        this.f27896a = coroutineScope;
        this.f27897b = errorPopupStateBuilder;
        this.f27898c = popupPresenter;
        this.f27899d = clicksHandler;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f27896a.getCoroutineContext();
    }

    @Override // com.fourthline.orca.internal.InterfaceC2931Re
    public void handleError(final Throwable error, String source) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        handleRecoverableError(error, source, new wn0.a() { // from class: com.fourthline.orca.internal.qp0
            @Override // wn0.a
            public final Object invoke() {
                return C2941Te.a(error);
            }
        });
    }

    @Override // com.fourthline.orca.internal.InterfaceC2931Re
    public void handleRecoverableError(Throwable error, String source, wn0.a onRetry) {
        p013kotlin.jvm.internal.s.k(error, "error");
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(onRetry, "onRetry");
        Objects.toString(error);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(error, source, onRetry, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Throwable th2) {
        throw new IllegalStateException(("Developer error. `onRetry` block was called for non-recoverable error: " + th2).toString());
    }
}
