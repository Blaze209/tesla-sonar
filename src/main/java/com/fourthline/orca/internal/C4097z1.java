package com.fourthline.orca.internal;

import android.net.Uri;
import androidx.p002activity.result.ActivityResultRegistry;
import com.fourthline.sdk.R;
import java.util.Arrays;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.fourthline.orca.internal.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4097z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C4011x1 f37171a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.z1$a */
    public static final class a implements C2 {
        a() {
        }

        @Override // com.fourthline.orca.internal.C2
        public void a(String redirectUrl) {
            p013kotlin.jvm.internal.s.k(redirectUrl, "redirectUrl");
            C4097z1.this.f37171a.a(redirectUrl);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.z1$b */
    public static final class b implements B2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BavPaymentMethod f37173a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f37174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ W0 f37175c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4097z1 f37176d;

        b(W0 w11, wn0.a aVar, C4097z1 c4097z1) {
            this.f37175c = w11;
            this.f37176d = c4097z1;
            BavPaymentMethod c3539m2A = w11.a();
            if (c3539m2A == null) {
                throw new IllegalStateException("A paymentMethod should have been selected at this point.");
            }
            this.f37173a = c3539m2A;
            this.f37174b = (String) aVar.invoke();
        }

        @Override // com.fourthline.orca.internal.B2
        public String a() {
            return this.f37174b;
        }

        @Override // com.fourthline.orca.internal.B2
        public BavPaymentMethod b() {
            return this.f37173a;
        }

        @Override // com.fourthline.orca.internal.B2
        public Uri getUrl() {
            String strD;
            if (this.f37176d.f37171a.getBavStrategy().a(W1.f29385a.a())) {
                AbstractC3582n2 abstractC3582n2C = this.f37175c.c();
                strD = abstractC3582n2C instanceof AbstractC3582n2.Tink ? ((AbstractC3582n2.Tink) abstractC3582n2C).getRedirectUrl() : this.f37176d.f37171a.d();
            } else {
                strD = this.f37176d.f37171a.d();
            }
            Uri uri = Uri.parse(strD);
            p013kotlin.jvm.internal.s.j(uri, "parse(...)");
            return uri;
        }
    }

    public C4097z1(C4011x1 flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f37171a = flowConfig;
    }

    public final E2 b(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return new E2(lottieServiceLocator.a(Tj.NetworkSpinnerThick));
    }

    public final InterfaceC3155d2 c(W0 bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new C3349hj(bundle.e());
    }

    public final L2 d(W0 bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new L2(this.f37171a.getSupportedPaymentMethods(), bundle);
    }

    public final C4054y1 a(InterfaceC3863tk navigationChannel, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C4054y1(navigationChannel, popupHandlerBuilder.a(new T3(QA.a.a(QA.f27433a, R.string.shared_button_exit_bav, 0, 2, null), imageServiceLocator)));
    }

    public final C3925v2 c(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3925v2(tracker);
    }

    public final InterfaceC3452k1 b(W0 bavBundle) {
        p013kotlin.jvm.internal.s.k(bavBundle, "bavBundle");
        return new C3929v6(bavBundle);
    }

    public final C3092bi b(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3092bi("bav", tracker);
    }

    public final C3496l2 a(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return new C3496l2(this.f37171a.getSupportedPaymentMethods(), lottieServiceLocator.a(Tj.BavIntro));
    }

    public final C3991wi a(C3092bi analytics, C4054y1 flowCoordinator, C3991wi.e startScreenHandler, C3283g2 finishScreenHandler, C3496l2 stateProvider) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(startScreenHandler, "startScreenHandler");
        p013kotlin.jvm.internal.s.k(finishScreenHandler, "finishScreenHandler");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        return new C3991wi(analytics, new C3520lk(stateProvider), stateProvider, flowCoordinator, C3369i2.f32418a, startScreenHandler, finishScreenHandler);
    }

    public final C3283g2 a(wn0.a workflowIdProvider, W0 dataBundle, InterfaceC3839t2 startPaymentWorker, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(startPaymentWorker, "startPaymentWorker");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C3283g2(dataBundle, this.f37171a.getSupportedPaymentMethods(), workflowIdProvider, startPaymentWorker, this.f37171a.getBavStrategy().a(W1.f29385a.a()), coroutineScope);
    }

    public final C3991wi.e a(W0 dataBundle, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new Y1(this.f37171a, dataBundle, popupHandler, coroutineScope);
    }

    public final B2 a(W0 dataBundle, wn0.a workflowIdProvider) {
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        return new b(dataBundle, workflowIdProvider, this);
    }

    public final J2 a(wn0.a workflowIdProvider, InterfaceC3839t2 startPaymentWorker, W0 bundle, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(startPaymentWorker, "startPaymentWorker");
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new J2(workflowIdProvider, startPaymentWorker, bundle, coroutineScope);
    }

    public final C4065yC a(C4054y1 flowCoordinator, InterfaceC3732qh imageServiceLocator, L2 repository, J2 finishScreenHandler, C3438jo tracker, C4087ys popupHandlerBuilder, CoroutineScope coroutineScope) {
        Object next;
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(finishScreenHandler, "finishScreenHandler");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        M2 m11 = new M2(repository, imageServiceLocator);
        Iterator it = repository.getSupportedTypes().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((BavPaymentMethod) next).getName() != H2.Sepa);
        BavPaymentMethod c3539m2 = (BavPaymentMethod) next;
        C3711q2 c3711q2 = c3539m2 != null ? new C3711q2(c3539m2.getAmount()) : null;
        C3520lk c3520lk = new C3520lk(m11);
        C3763rC c3763rC = new C3763rC(AbstractC3806sC.a(I2.f26182a), C3668p2.f34427a);
        C3592nC c3592nC = new C3592nC(tracker);
        C3711q2[] c3711q2Arr = (C3711q2[]) p013kotlin.collections.v.q(c3711q2).toArray(new C3711q2[0]);
        return new C4065yC(c3520lk, m11, flowCoordinator, c3763rC, finishScreenHandler, repository, c3592nC, popupHandlerBuilder.a((Cs[]) Arrays.copyOf(c3711q2Arr, c3711q2Arr.length)), coroutineScope);
    }

    public final InterfaceC3069b1 a(W0 bavBundle) {
        p013kotlin.jvm.internal.s.k(bavBundle, "bavBundle");
        return new C3111c1(bavBundle);
    }

    public final C3538m1 a(InterfaceC3452k1 repository, InterfaceC3155d2 validator, InterfaceC3732qh imageServiceLocator, Uj lottieServiceLocator, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(validator, "validator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3538m1(repository, validator, new Kh(tracker), imageServiceLocator, lottieServiceLocator);
    }

    public final Y0 a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Y0(tracker);
    }

    public final C3581n1 a(C3538m1 stateProvider, InterfaceC3069b1 resultRepository, InterfaceC3452k1 repository, Y0 analytics, C4054y1 viewNavigator, InterfaceC3732qh imageServiceLocator, wn0.a workflowIdProvider, N2 validateIbanWorker, InterfaceC3624o1 confirmIbanWorker, InterfaceC3155d2 bavValidator, C4087ys popupHandlerBuilder, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(viewNavigator, "viewNavigator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(validateIbanWorker, "validateIbanWorker");
        p013kotlin.jvm.internal.s.k(confirmIbanWorker, "confirmIbanWorker");
        p013kotlin.jvm.internal.s.k(bavValidator, "bavValidator");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        boolean z11 = this.f37171a.getSupportedPaymentMethods().size() > 1;
        return new C3581n1(stateProvider, resultRepository, repository, analytics, viewNavigator, workflowIdProvider, validateIbanWorker, confirmIbanWorker, bavValidator, new C2874Gc(coroutineScope), new C3520lk(stateProvider), popupHandlerBuilder.a(new X0(viewNavigator, imageServiceLocator, z11), new C3027a2(viewNavigator, imageServiceLocator, z11), new C3070b2(viewNavigator, imageServiceLocator, z11), new C3711q2(repository.c())), coroutineScope);
    }

    public final F2 a(E2 stateProvider, YD webSdkLauncher, InterfaceC4044xs popupHandler, B2 statusRepository, InterfaceC3700ps statusWorker, InterfaceC3625o2 redirectUrlWorker, C3925v2 analytics, C4054y1 flowCoordinator, ED viewCompletionHandler, InterfaceC3886u6 deeplinkDispatcher, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(webSdkLauncher, "webSdkLauncher");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(statusRepository, "statusRepository");
        p013kotlin.jvm.internal.s.k(statusWorker, "statusWorker");
        p013kotlin.jvm.internal.s.k(redirectUrlWorker, "redirectUrlWorker");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(deeplinkDispatcher, "deeplinkDispatcher");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        F2 f11 = new F2(new C3520lk(stateProvider), stateProvider, webSdkLauncher, popupHandler, statusWorker, redirectUrlWorker, flowCoordinator, viewCompletionHandler, statusRepository, new a(), analytics, coroutineScope);
        deeplinkDispatcher.a(f11);
        return f11;
    }

    public final ED a(InterfaceC3051ak mainRepository, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        C3968w1 c3968w1 = new C3968w1(false);
        Wz wz2 = new Wz();
        Vz vz2 = new Vz();
        if (mainRepository.a()) {
            whatsNextWorker = new Yz("BAV", true);
        }
        return new C4084yp(c3968w1, wz2, vz2, whatsNextWorker);
    }

    public final YD a(ActivityResultRegistry activityResultRegistry) {
        p013kotlin.jvm.internal.s.k(activityResultRegistry, "activityResultRegistry");
        return new C3583n3(activityResultRegistry);
    }
}
