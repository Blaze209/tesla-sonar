package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.location.LocationProviderError;
import com.fourthline.orca.qes.internal.error.QesError;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Wu implements C3991wi.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f29615h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f29616i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocationProvider f29617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uv f29621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CoroutineScope f29622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC2931Re f29623g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29624a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3991wi f29626c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3991wi c3991wi, Continuation continuation) {
            super(2, continuation);
            this.f29626c = c3991wi;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Wu.this.new b(this.f29626c, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f29624a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            LocationProvider locationProvider = Wu.this.f29617a;
            final Wu wu2 = Wu.this;
            final C3991wi c3991wi = this.f29626c;
            wn0.l<? super Coordinate, jn0.h0> lVar = new wn0.l() { // from class: com.fourthline.orca.internal.ov0
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return Wu.b.a(wu2, c3991wi, (Coordinate) obj2);
                }
            };
            final Wu wu3 = Wu.this;
            final C3991wi c3991wi2 = this.f29626c;
            locationProvider.requestLocation(lVar, new wn0.l() { // from class: com.fourthline.orca.internal.pv0
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return Wu.b.a(wu3, c3991wi2, (LocationProviderError) obj2);
                }
            });
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(Wu wu2, C3991wi c3991wi, Coordinate coordinate) {
            wu2.a(c3991wi, coordinate);
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(Wu wu2, C3991wi c3991wi, LocationProviderError locationProviderError) {
            wu2.b(c3991wi);
            return jn0.h0.f84049a;
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29627a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3991wi f29629c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Coordinate f29630d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3991wi c3991wi, Coordinate coordinate, Continuation continuation) {
            super(2, continuation);
            this.f29629c = c3991wi;
            this.f29630d = coordinate;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Wu.this.new c(this.f29629c, this.f29630d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f29627a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Wu wu2 = Wu.this;
                C3991wi c3991wi = this.f29629c;
                Coordinate coordinate = this.f29630d;
                this.f29627a = 1;
                if (wu2.a(c3991wi, coordinate, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29633c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f29635e;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f29633c = obj;
            this.f29635e |= Integer.MIN_VALUE;
            return Wu.this.a((C3991wi) null, (Coordinate) null, this);
        }
    }

    public Wu(LocationProvider locationProvider, String signatureId, String languageCode, boolean z11, Uv startSignatureWorker, CoroutineScope coroutineScope, InterfaceC2931Re errorHandler) {
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(signatureId, "signatureId");
        p013kotlin.jvm.internal.s.k(languageCode, "languageCode");
        p013kotlin.jvm.internal.s.k(startSignatureWorker, "startSignatureWorker");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(errorHandler, "errorHandler");
        this.f29617a = locationProvider;
        this.f29618b = signatureId;
        this.f29619c = languageCode;
        this.f29620d = z11;
        this.f29621e = startSignatureWorker;
        this.f29622f = coroutineScope;
        this.f29623g = errorHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(Wu wu2, C3991wi c3991wi) {
        wu2.d(c3991wi);
        return jn0.h0.f84049a;
    }

    private final void d(C3991wi c3991wi) {
        a(c3991wi, new Coordinate(0.0d, 0.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(C3991wi c3991wi) {
        c3991wi.b().a(c3991wi.c().a(false));
        c3991wi.d().a(C3690pi.f34593a);
    }

    private final void c(C3991wi c3991wi) {
        c3991wi.b().a(c3991wi.c().a(true));
        BuildersKt__Builders_commonKt.launch$default(this.f29622f, null, null, new b(c3991wi, null), 3, null);
    }

    @Override // com.fourthline.orca.internal.C3991wi.c
    public void a(C3991wi c3991wi) {
        p013kotlin.jvm.internal.s.k(c3991wi, "<this>");
        if (this.f29620d) {
            d(c3991wi);
        } else if (this.f29617a.getAuthorizationStatus() == LocationProvider.AuthorizationStatus.AUTHORIZED && this.f29617a.getAccuracyAuthorization() == LocationProvider.AccuracyAuthorization.FULL && this.f29617a.getLocationServicesEnabled()) {
            c(c3991wi);
        } else {
            c3991wi.d().a(C3690pi.f34593a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(C3991wi c3991wi, Coordinate coordinate) {
        c3991wi.b().a(c3991wi.c().a(true));
        BuildersKt__Builders_commonKt.launch$default(this.f29622f, null, null, new c(c3991wi, coordinate, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(final C3991wi c3991wi, Coordinate coordinate, Continuation continuation) {
        d dVar;
        Object objA;
        final Wu wu2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f29635e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f29635e = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object obj = dVar.f29633c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = dVar.f29635e;
        if (i12 == 0) {
            jn0.t.b(obj);
            Uv uv2 = this.f29621e;
            Uv.a aVar = new Uv.a(this.f29618b, coordinate, this.f29619c);
            dVar.f29631a = this;
            dVar.f29632b = c3991wi;
            dVar.f29635e = 1;
            objA = uv2.a(aVar, dVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            wu2 = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3991wi = (C3991wi) dVar.f29632b;
            wu2 = (Wu) dVar.f29631a;
            jn0.t.b(obj);
            objA = ((jn0.s) obj).getValue();
        }
        Throwable thE = jn0.s.e(objA);
        if (thE == null) {
            Uv.b bVar = (Uv.b) objA;
            c3991wi.b().a(c3991wi.c().a(false));
            if (bVar instanceof Uv.b.d) {
                c3991wi.d().a(C3049ai.f30425a);
            } else if (bVar instanceof Uv.b.c) {
                c3991wi.d().a(C3861ti.f35671a);
            } else if (bVar instanceof Uv.b.a) {
                wu2.f29623g.handleError(QesError.KycRequired.INSTANCE, "location_scan");
            } else if (bVar instanceof Uv.b.C0525b) {
                wu2.f29623g.handleError(QesError.Rejected.INSTANCE, "intro");
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ZD zdA = AbstractC3039aE.a(thE);
            c3991wi.b().a(c3991wi.c().a(false));
            if (wu2.f29620d) {
                wu2.f29623g.handleRecoverableError(zdA, "intro", new wn0.a() { // from class: com.fourthline.orca.internal.nv0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Wu.b(this.f34000a, c3991wi);
                    }
                });
            } else {
                c3991wi.d().a(C3690pi.f34593a);
            }
        }
        return jn0.h0.f84049a;
    }
}
