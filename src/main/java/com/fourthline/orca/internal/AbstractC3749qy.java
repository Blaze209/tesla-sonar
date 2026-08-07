package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p002activity.result.contract.ActivityResultContracts$StartActivityForResult;
import com.fourthline.sdk.R;
import com.fourthline.vision.internal.camera.recording.RecordingExtensionsKt;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.compose.SelfieScannerComposableKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.orca.internal.qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3749qy {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qy$a */
    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f34922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f34923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f.h f34924d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kq.a f34925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Lazy f34926f;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qy$a$a, reason: collision with other inner class name */
        static final class C0605a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f34927a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f34928b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f34929c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ f.h f34930d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kq.a f34931e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Lazy f34932f;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.qy$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0606a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[InterfaceC3364hy.d.a.values().length];
                    try {
                        iArr[InterfaceC3364hy.d.a.LONG.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[InterfaceC3364hy.d.a.TICK.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0605a(Context context, f.h hVar, kq.a aVar, Lazy lazy, Continuation continuation) {
                super(2, continuation);
                this.f34929c = context;
                this.f34930d = hVar;
                this.f34931e = aVar;
                this.f34932f = lazy;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC3364hy interfaceC3364hy, Continuation continuation) {
                return ((C0605a) create(interfaceC3364hy, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0605a c0605a = new C0605a(this.f34929c, this.f34930d, this.f34931e, this.f34932f, continuation);
                c0605a.f34928b = obj;
                return c0605a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f34927a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                InterfaceC3364hy interfaceC3364hy = (InterfaceC3364hy) this.f34928b;
                if (interfaceC3364hy instanceof InterfaceC3364hy.d) {
                    int i11 = C0606a.$EnumSwitchMapping$0[((InterfaceC3364hy.d) interfaceC3364hy).a().ordinal()];
                    if (i11 == 1) {
                        AbstractC3972w5.a(this.f34929c, 0L, 1, null);
                    } else {
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC3972w5.a(this.f34929c, 50L);
                    }
                } else if (interfaceC3364hy instanceof InterfaceC3364hy.b) {
                    this.f34930d.b(AbstractC3749qy.a(this.f34932f));
                } else if (interfaceC3364hy instanceof InterfaceC3364hy.c) {
                    this.f34931e.a();
                } else if (!(interfaceC3364hy instanceof InterfaceC3364hy.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Flow flow, Context context, f.h hVar, kq.a aVar, Lazy lazy, Continuation continuation) {
            super(2, continuation);
            this.f34922b = flow;
            this.f34923c = context;
            this.f34924d = hVar;
            this.f34925e = aVar;
            this.f34926f = lazy;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f34922b, this.f34923c, this.f34924d, this.f34925e, this.f34926f, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f34921a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flow = this.f34922b;
                if (flow != null) {
                    C0605a c0605a = new C0605a(this.f34923c, this.f34924d, this.f34925e, this.f34926f, null);
                    this.f34921a = 1;
                    if (AbstractC3989wg.a(flow, c0605a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qy$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f34937b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(wn0.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f34937b = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f34937b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f34936a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f34937b.invoke(InterfaceC3405iy.h.f32623a);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3834sy c3834sy, InterfaceC3491ky interfaceC3491ky, Flow flow, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(c3834sy, interfaceC3491ky, flow, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 d(wn0.l lVar) {
        lVar.invoke(InterfaceC3405iy.f.f32621a);
        return jn0.h0.f84049a;
    }

    public static final void a(final C3834sy viewModel, final InterfaceC3491ky state, final Flow flow, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        String str;
        jn0.h0 h0Var;
        int i13;
        int i14;
        p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(-295670220);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(viewModel) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? lVarV.n(state) : lVarV.K(state) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(flow) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarV.K(onEventSent) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-295670220, i12, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.SelfieScannerScreen (SelfieScannerScreen.kt:56)");
            }
            final Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            lVarV.o(537534266);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = p020r2.s3.d(j3.i.INSTANCE.a(), null, 2, null);
                lVarV.B(objI);
            }
            final p020r2.p1 p1Var = (p020r2.p1) objI;
            lVarV.l();
            lVarV.o(537536647);
            boolean zK = lVarV.K(context);
            Object objI2 = lVarV.I();
            if (zK || objI2 == companion.a()) {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.fa1
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3749qy.a(context);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            Lazy lazyB = jn0.m.b((wn0.a) objI2);
            List<String> requiredPermissions = RecordingExtensionsKt.getRequiredPermissions(viewModel.e().getRecordingType());
            lVarV.o(537546861);
            int i15 = i12 & 7168;
            boolean z11 = i15 == 2048;
            Object objI3 = lVarV.I();
            if (z11 || objI3 == companion.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.ia1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3749qy.a(onEventSent, (Map) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            final kq.a aVarA = kq.b.a(requiredPermissions, (wn0.l) objI3, lVarV, 0, 0);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            lVarV.o(537553949);
            boolean zN = lVarV.n(aVarA);
            Object objI4 = lVarV.I();
            if (zN || objI4 == companion.a()) {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.ja1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3749qy.a(aVarA, (h.a) obj);
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            f.h hVarA = f.c.a(activityResultContracts$StartActivityForResult, (wn0.l) objI4, lVarV, 0);
            jn0.h0 h0Var2 = jn0.h0.f84049a;
            lVarV.o(537562638);
            boolean zK2 = lVarV.K(flow) | lVarV.K(context) | lVarV.K(hVarA) | lVarV.K(lazyB) | lVarV.n(aVarA);
            Object objI5 = lVarV.I();
            if (zK2 || objI5 == companion.a()) {
                a aVar = new a(flow, context, hVarA, aVarA, lazyB, null);
                lVarV.B(aVar);
                objI5 = aVar;
            }
            lVarV.l();
            Function0.g(h0Var2, (wn0.p) objI5, lVarV, 6);
            lVarV.o(537581927);
            boolean z12 = i15 == 2048;
            Object objI6 = lVarV.I();
            if (z12 || objI6 == companion.a()) {
                objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.ka1
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3749qy.a(onEventSent);
                    }
                };
                lVarV.B(objI6);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI6, lVarV, 0, 1);
            androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
            lVarV.o(537585583);
            Object objI7 = lVarV.I();
            if (objI7 == companion.a()) {
                objI7 = new wn0.l() { // from class: com.fourthline.orca.internal.la1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3749qy.a((g4.y) obj);
                    }
                };
                lVarV.B(objI7);
            }
            lVarV.l();
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(g4.o.d(companion2, false, (wn0.l) objI7, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            boolean z13 = state instanceof InterfaceC3491ky.b;
            if (z13) {
                str = "selfie_scan";
            } else {
                if (!(state instanceof InterfaceC3491ky.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "selfie_scan_confirm";
            }
            androidx.compose.ui.d dVarB = AbstractC3307gk.b(dVarF, str);
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarB);
            b4.g.Companion companion3 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA2 = companion3.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarH, companion3.c());
            p020r2.d4.b(lVarA, xVarC, companion3.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion3.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion3.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            if (z13) {
                lVarV.o(-1797895325);
                h0Var = h0Var2;
                SelfieScannerConfig selfieScannerConfigE = viewModel.e();
                lVarV.o(-1720561400);
                Object objI8 = lVarV.I();
                if (objI8 == companion.a()) {
                    objI8 = new wn0.a() { // from class: com.fourthline.orca.internal.ma1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3749qy.b(p1Var);
                        }
                    };
                    lVarV.B(objI8);
                }
                wn0.a aVar2 = (wn0.a) objI8;
                lVarV.l();
                i13 = i15;
                i14 = 2048;
                SelfieScannerComposableKt.SelfieScanner(selfieScannerConfigE, aVar2, viewModel.i(), viewModel.j(), z2.c.e(2145340943, true, new b(state, onEventSent, p1Var), lVarV, 54), lVarV, SelfieScannerConfig.$stable | 24624, 0);
                lVarV = lVarV;
                lVarV.l();
            } else {
                h0Var = h0Var2;
                i13 = i15;
                i14 = 2048;
                if (state instanceof InterfaceC3491ky.a.C0572a) {
                    lVarV.o(-1796921336);
                    final InterfaceC3491ky.a.C0572a c0572a = (InterfaceC3491ky.a.C0572a) state;
                    if (c0572a.t() != null) {
                        lVarV.o(693827565);
                        C2916Oe c2916OeT = c0572a.t();
                        lVarV.o(-1363087483);
                        boolean z14 = i13 == 2048;
                        Object objI9 = lVarV.I();
                        if (z14 || objI9 == companion.a()) {
                            objI9 = new wn0.a() { // from class: com.fourthline.orca.internal.na1
                                @Override // wn0.a
                                public final Object invoke() {
                                    return AbstractC3749qy.b(onEventSent);
                                }
                            };
                            lVarV.B(objI9);
                        }
                        lVarV.l();
                        AbstractC2921Pe.a(c2916OeT, true, (wn0.a) objI9, lVarV, 48, 0);
                        lVarV.l();
                    } else {
                        lVarV.o(694152538);
                        String strC = RA.c(c0572a.a(), lVarV, 0);
                        String strC2 = RA.c(QA.a.a(QA.f27433a, R.string.shared_selfie_confirmation_header_accessibility, 0, 2, null), lVarV, 0);
                        VD.b bVar = new VD.b(c0572a.u());
                        String strC3 = RA.c(c0572a.p(), lVarV, 0);
                        String strC4 = RA.c(c0572a.r(), lVarV, 0);
                        String strC5 = RA.c(c0572a.q(), lVarV, 0);
                        String strC6 = RA.c(c0572a.v(), lVarV, 0);
                        String strC7 = RA.c(c0572a.w(), lVarV, 0);
                        InterfaceC3903uh interfaceC3903uhS = c0572a.s();
                        lVarV.o(-1363055760);
                        boolean z15 = i13 == 2048;
                        Object objI10 = lVarV.I();
                        if (z15 || objI10 == companion.a()) {
                            objI10 = new wn0.a() { // from class: com.fourthline.orca.internal.oa1
                                @Override // wn0.a
                                public final Object invoke() {
                                    return AbstractC3749qy.c(onEventSent);
                                }
                            };
                            lVarV.B(objI10);
                        }
                        wn0.a aVar3 = (wn0.a) objI10;
                        lVarV.l();
                        lVarV.o(-1363051152);
                        boolean z16 = i13 == 2048;
                        Object objI11 = lVarV.I();
                        if (z16 || objI11 == companion.a()) {
                            objI11 = new wn0.a() { // from class: com.fourthline.orca.internal.pa1
                                @Override // wn0.a
                                public final Object invoke() {
                                    return AbstractC3749qy.d(onEventSent);
                                }
                            };
                            lVarV.B(objI11);
                        }
                        wn0.a aVar4 = (wn0.a) objI11;
                        lVarV.l();
                        lVarV.o(-1363046501);
                        boolean zK3 = (i13 == 2048) | lVarV.K(c0572a);
                        Object objI12 = lVarV.I();
                        if (zK3 || objI12 == companion.a()) {
                            objI12 = new wn0.l() { // from class: com.fourthline.orca.internal.ga1
                                @Override // wn0.l
                                public final Object invoke(Object obj) {
                                    return AbstractC3749qy.a(onEventSent, c0572a, (Bitmap) obj);
                                }
                            };
                            lVarV.B(objI12);
                        }
                        lVarV.l();
                        WD.a(strC, strC2, bVar, true, strC3, strC4, strC5, strC6, strC7, interfaceC3903uhS, false, aVar3, aVar4, (wn0.l) objI12, null, lVarV, 3072, 0, 17408);
                        lVarV = lVarV;
                        lVarV.l();
                    }
                    lVarV.l();
                } else {
                    if (!(state instanceof InterfaceC3491ky.a.b)) {
                        lVarV.o(-1720564010);
                        lVarV.l();
                        throw new NoWhenBranchMatchedException();
                    }
                    lVarV.o(-1795282366);
                    InterfaceC3491ky.a.b bVar2 = (InterfaceC3491ky.a.b) state;
                    XD.a(RA.c(bVar2.a(), lVarV, 0), RA.c(bVar2.b(), lVarV, 0), bVar2.d(), bVar2.p(), bVar2.q(), bVar2.r(), true, lVarV, 1572864, 0);
                    lVarV = lVarV;
                    lVarV.l();
                }
            }
            lVarV.g();
            lVarV.o(537700132);
            boolean z17 = i13 == i14;
            Object objI13 = lVarV.I();
            if (z17 || objI13 == companion.a()) {
                objI13 = new c(onEventSent, null);
                lVarV.B(objI13);
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI13, lVarV, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ha1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3749qy.a(viewModel, state, flow, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(wn0.l lVar) {
        lVar.invoke(InterfaceC3405iy.a.f32616a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3.i b(p020r2.p1 p1Var) {
        return a(p1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar) {
        lVar.invoke(InterfaceC3405iy.b.f32617a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.qy$b */
    static final class b implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3491ky f34933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f34934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p020r2.p1 f34935c;

        b(InterfaceC3491ky interfaceC3491ky, wn0.l lVar, p020r2.p1 p1Var) {
            this.f34933a = interfaceC3491ky;
            this.f34934b = lVar;
            this.f34935c = p1Var;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(2145340943, i11, -1, "com.fourthline.orca.core.internal.capabilities.biometrics.screens.scanner.SelfieScannerScreen.<anonymous>.<anonymous> (SelfieScannerScreen.kt:124)");
            }
            InterfaceC3491ky.b bVar = (InterfaceC3491ky.b) this.f34933a;
            lVar.o(-1363110420);
            final p020r2.p1 p1Var = this.f34935c;
            Object objI = lVar.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.qa1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3749qy.b.a(p1Var, (j3.i) obj);
                    }
                };
                lVar.B(objI);
            }
            wn0.l lVar2 = (wn0.l) objI;
            lVar.l();
            lVar.o(-1363107979);
            boolean zN = lVar.n(this.f34934b);
            final wn0.l lVar3 = this.f34934b;
            Object objI2 = lVar.I();
            if (zN || objI2 == companion.a()) {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.ra1
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3749qy.b.a(lVar3);
                    }
                };
                lVar.B(objI2);
            }
            wn0.a aVar = (wn0.a) objI2;
            lVar.l();
            lVar.o(-1363102220);
            boolean zN2 = lVar.n(this.f34934b);
            final wn0.l lVar4 = this.f34934b;
            Object objI3 = lVar.I();
            if (zN2 || objI3 == companion.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.sa1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3749qy.b.a(lVar4, ((Float) obj).floatValue());
                    }
                };
                lVar.B(objI3);
            }
            lVar.l();
            AbstractC3620ny.b(bVar, lVar2, aVar, (wn0.l) objI3, lVar, 48);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(p020r2.p1 p1Var, j3.i it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            AbstractC3749qy.a(p1Var, it);
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar) {
            lVar.invoke(InterfaceC3405iy.c.f32618a);
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, float f11) {
            lVar.invoke(InterfaceC3405iy.e.f32620a);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, Map permissions) {
        p013kotlin.jvm.internal.s.k(permissions, "permissions");
        lVar.invoke(new InterfaceC3405iy.g(permissions));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(kq.a aVar, h.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        aVar.a();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(InterfaceC3405iy.c.f32618a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        g4.v.i0(semantics, " ");
        g4.w.a(semantics, true);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, InterfaceC3491ky.a.C0572a c0572a, Bitmap it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(new InterfaceC3405iy.d(c0572a.u()));
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final j3.i a(p020r2.p1 p1Var) {
        return (j3.i) p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(p020r2.p1 p1Var, j3.i iVar) {
        p1Var.setValue(iVar);
    }
}
