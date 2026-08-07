package com.fourthline.orca.internal;

import android.content.ContentResolver;
import android.content.Context;
import androidx.p002activity.result.ActivityResultRegistry;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.sdk.R;
import com.fourthline.vision.RecordingType;
import com.fourthline.vision.selfie.LivenessCheckType;
import com.fourthline.vision.selfie.SelfieScannerConfig;
import com.fourthline.vision.selfie.SelfieScannerResult;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.KotlinNothingValueException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.cu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3146cu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Zt f31010a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cu$a */
    public static final class a implements Lj {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Coordinate f31011a;

        a() {
        }

        @Override // com.fourthline.orca.internal.Lj
        public void a(Coordinate coordinate) {
            this.f31011a = coordinate;
        }

        @Override // com.fourthline.orca.internal.Lj
        public Coordinate getLocation() {
            return this.f31011a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.cu$b */
    public static final class b implements InterfaceC3663oy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Aw f31012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SelfieScannerConfig f31013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f31014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Integer f31015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private SelfieScannerResult f31016e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.fourthline.orca.internal.Aw] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        b(Zt zt2, C3146cu c3146cu) {
            ?? hs2 = 0;
            hs2 = 0;
            if (zt2.getLiveness().getEnabled() && zt2.getLiveness().getRandomness().getEnabled()) {
                hs2 = new Hs(hs2, 1, hs2);
            }
            this.f31012a = hs2;
            this.f31013b = new SelfieScannerConfig(false, zt2.getSelfie().getVideo().getEnabled() ? RecordingType.VIDEO_ONLY : RecordingType.NONE, zt2.getLiveness().getEnabled() ? LivenessCheckType.HEAD_TURN : LivenessCheckType.NONE, false, 8, null);
            this.f31014c = c3146cu.f31010a.getSelfie().getCameraX().getEnabled();
            this.f31015d = c3146cu.f31010a.getSelfie().getVideo().getBitrate();
        }

        @Override // com.fourthline.orca.internal.InterfaceC3663oy
        public SelfieScannerResult a() {
            return this.f31016e;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3663oy
        public Aw b() {
            return this.f31012a;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3663oy
        public SelfieScannerConfig c() {
            return this.f31013b;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3663oy
        public Integer f() {
            return this.f31015d;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3663oy
        public boolean h() {
            return this.f31014c;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3663oy
        public void a(SelfieScannerResult selfieScannerResult) {
            this.f31016e = selfieScannerResult;
        }
    }

    public C3146cu(Zt flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f31010a = flowConfig;
    }

    public final ND a(C3061au flowCoordinator) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        return flowCoordinator;
    }

    public final InterfaceC3663oy c() {
        return new b(this.f31010a, this);
    }

    public final Mv d(C3104bu bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new Nv(bundle);
    }

    public final Cv e(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Cv(tracker);
    }

    public final Mx f(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Mx(tracker);
    }

    public final C3321gy g(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3321gy(tracker);
    }

    public final C3187dt b() {
        return new C3187dt(null, null, 3, null);
    }

    public final C3232ev d(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3232ev(tracker);
    }

    public final C3104bu a(wn0.a workflowIdProvider) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        return new C3104bu((String) workflowIdProvider.invoke(), null, null, null, 14, null);
    }

    public final InterfaceC3872tt b(C3104bu bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new C3915ut(bundle);
    }

    public final InterfaceC4133zv c(C3104bu bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new Av(bundle);
    }

    public final InterfaceC3147cv b(C3187dt bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new C3189dv(bundle);
    }

    public final C3092bi c(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3092bi("qes", tracker);
    }

    public final Bp b(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return new C3105bv(context);
    }

    public final Sx c(Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new Sx(0, 0, lottieServiceLocator, imageServiceLocator, 3, null);
    }

    public final InterfaceC3786rt a(C3104bu bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new C3829st(bundle);
    }

    public final Nj b(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return new Nj(lottieServiceLocator.a(Tj.LocationIntro));
    }

    public final Rv a(C3104bu bundle, InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new Sv(bundle, mainRepository.getFlavor().getLocalization());
    }

    public final InterfaceC3230et a(C3187dt bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new C3273ft(bundle);
    }

    public final C4047xv b(Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        Yj yjA = lottieServiceLocator.a(Tj.LoadingSpinner);
        return new C4047xv(new Si(yjA, lottieServiceLocator.a(Tj.SelfieLivenessLeft), lottieServiceLocator.a(Tj.SelfieLivenessRight), lottieServiceLocator.a(Tj.SelfieLiveness), imageServiceLocator), yjA, imageServiceLocator);
    }

    public final C3061au a(InterfaceC3863tk navigationChannel, C3874tv qesSelfieIntroCoordinator, C3961vv qesSelfieScannerCoordinator, C3572mt qesAgreementCoordinator, C3402iv qesPdfRendererCoordinator, Hv qesSignCoordinator, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(qesSelfieIntroCoordinator, "qesSelfieIntroCoordinator");
        p013kotlin.jvm.internal.s.k(qesSelfieScannerCoordinator, "qesSelfieScannerCoordinator");
        p013kotlin.jvm.internal.s.k(qesAgreementCoordinator, "qesAgreementCoordinator");
        p013kotlin.jvm.internal.s.k(qesPdfRendererCoordinator, "qesPdfRendererCoordinator");
        p013kotlin.jvm.internal.s.k(qesSignCoordinator, "qesSignCoordinator");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        EnumC3319gw enumC3319gwD = this.f31010a.getInitialStatus();
        if (enumC3319gwD != null) {
            return new C3061au(navigationChannel, qesSelfieIntroCoordinator, qesSelfieScannerCoordinator, qesAgreementCoordinator, qesPdfRendererCoordinator, qesSignCoordinator, popupHandlerBuilder.a(new T3(QA.a.a(QA.f27433a, R.string.shared_button_exit_qes, 0, 2, null), imageServiceLocator)), enumC3319gwD);
        }
        AbstractC3989wg.a("Initial QesStatus is not available.");
        throw new KotlinNothingValueException();
    }

    public final C4002wt a(Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C4002wt(lottieServiceLocator.a(Tj.NetworkSpinnerBold), imageServiceLocator);
    }

    public final C3316gt b(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3316gt(tracker);
    }

    public final C4045xt a(C3061au flowCoordinator, InterfaceC3786rt repository, C4002wt stateProvider, InterfaceC3872tt resultRepository, InterfaceC3230et activePdfRepository, InterfaceC3788rv qesRetrieveSigningDetailsWorker, InterfaceC3106bw qesUserAuthorizationWorker, InterfaceC2931Re qesErrorHandler, C3316gt analytics, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(activePdfRepository, "activePdfRepository");
        p013kotlin.jvm.internal.s.k(qesRetrieveSigningDetailsWorker, "qesRetrieveSigningDetailsWorker");
        p013kotlin.jvm.internal.s.k(qesUserAuthorizationWorker, "qesUserAuthorizationWorker");
        p013kotlin.jvm.internal.s.k(qesErrorHandler, "qesErrorHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new C4045xt(new C3520lk(stateProvider), stateProvider, flowCoordinator, repository, resultRepository, activePdfRepository, qesRetrieveSigningDetailsWorker, qesUserAuthorizationWorker, qesErrorHandler, analytics, coroutineScope);
    }

    public final InterfaceC3730qf a(ContentResolver contentResolver, ActivityResultRegistry registry) {
        p013kotlin.jvm.internal.s.k(contentResolver, "contentResolver");
        p013kotlin.jvm.internal.s.k(registry, "registry");
        return new B6(contentResolver, registry);
    }

    public final InterfaceC3772rf a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        return new Ap(context);
    }

    public final C3531lv a(InterfaceC3147cv repository, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3531lv(repository.b(), imageServiceLocator);
    }

    public final C3574mv a(C3531lv stateProvider, C3061au flowCoordinator, InterfaceC3147cv repository, InterfaceC3730qf fileDownloader, InterfaceC3772rf fileSharer, Bp renderer, C3232ev analytics) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(fileDownloader, "fileDownloader");
        p013kotlin.jvm.internal.s.k(fileSharer, "fileSharer");
        p013kotlin.jvm.internal.s.k(renderer, "renderer");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        return new C3574mv(new C3520lk(stateProvider), stateProvider, flowCoordinator, renderer, repository, fileDownloader, fileSharer, analytics);
    }

    public final Yu a(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return new Yu(lottieServiceLocator.a(Tj.QesIntro));
    }

    public final C3991wi.c a(C3104bu bundle, Yu introStateProvider, LocationProvider locationProvider, Uv startSignatureWorker, InterfaceC2931Re errorHandler, Locale locale, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(introStateProvider, "introStateProvider");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(startSignatureWorker, "startSignatureWorker");
        p013kotlin.jvm.internal.s.k(errorHandler, "errorHandler");
        p013kotlin.jvm.internal.s.k(locale, "locale");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        String strD = bundle.d();
        String language = locale.getLanguage();
        p013kotlin.jvm.internal.s.j(language, "getLanguage(...)");
        return new Wu(locationProvider, strD, language, !this.f31010a.getGeolocation().getEnabled(), startSignatureWorker, coroutineScope, errorHandler);
    }

    public final C3991wi a(C3092bi analytics, C3061au flowCoordinator, Yu stateProvider, C3991wi.c finishIntroScreenHandler) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(finishIntroScreenHandler, "finishIntroScreenHandler");
        return new C3991wi(analytics, new C3520lk(stateProvider), stateProvider, flowCoordinator, Xu.f29768a, null, finishIntroScreenHandler, 32, null);
    }

    public final Gj a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Gj(tracker);
    }

    public final Lj a() {
        return new a();
    }

    public final Oj a(Lj repository, Nj stateProvider, C4087ys popupHandlerBuilder, C3061au flowCoordinator, ED viewCompletionHandler, LocationProvider locationProvider, Gj analytics, CoroutineScope coroutineScope, C3104bu qesFlowDataBundle, InterfaceC3997wo orcaDestroyer, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(locationProvider, "locationProvider");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(qesFlowDataBundle, "qesFlowDataBundle");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        C2874Gc c2874Gc = new C2874Gc(coroutineScope);
        List listP0 = p013kotlin.collections.v.P0(p013kotlin.collections.v.P0(p013kotlin.collections.v.p(new Ej(lottieServiceLocator), new Gs(lottieServiceLocator), new Dj(c2874Gc, imageServiceLocator), new Pj(c2874Gc, imageServiceLocator)), a(orcaDestroyer, imageServiceLocator)), a(qesFlowDataBundle, orcaDestroyer, imageServiceLocator));
        C3520lk c3520lk = new C3520lk(stateProvider);
        Cs[] csArr = (Cs[]) listP0.toArray(new Cs[0]);
        return new Oj(c3520lk, c2874Gc, flowCoordinator, viewCompletionHandler, stateProvider, popupHandlerBuilder.a((Cs[]) Arrays.copyOf(csArr, csArr.length)), locationProvider, repository, analytics, coroutineScope);
    }

    public final ED a(Uv startSignatureWorker, Rv repository) {
        p013kotlin.jvm.internal.s.k(startSignatureWorker, "startSignatureWorker");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        return new C3062av(startSignatureWorker, repository);
    }

    public final Qv a(C3061au flowCoordinator, Mv qesSignRepository, InterfaceC3233ew qesUserConfirmationWorker, InterfaceC3703pv qesResendOtpWorker, InterfaceC3732qh imageServiceLocator, InterfaceC2931Re errorHandler, InterfaceC2931Re qesSignErrorHandler, ED viewCompletionHandler, Cv analytics, InterfaceC4044xs popupHandler, C3438jo tracker, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(qesSignRepository, "qesSignRepository");
        p013kotlin.jvm.internal.s.k(qesUserConfirmationWorker, "qesUserConfirmationWorker");
        p013kotlin.jvm.internal.s.k(qesResendOtpWorker, "qesResendOtpWorker");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(errorHandler, "errorHandler");
        p013kotlin.jvm.internal.s.k(qesSignErrorHandler, "qesSignErrorHandler");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        Kh kh2 = new Kh(tracker);
        Pv pv2 = new Pv(imageServiceLocator, qesSignRepository.c(), qesSignRepository.d(), kh2, qesSignRepository.b().a());
        return new Qv(new C3520lk(pv2), new C2874Gc(coroutineScope), pv2, flowCoordinator, viewCompletionHandler, qesSignRepository, qesUserConfirmationWorker, qesResendOtpWorker, errorHandler, qesSignErrorHandler, popupHandler, analytics, coroutineScope);
    }

    public final ED a(InterfaceC3051ak mainRepository, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        Yt yt2 = new Yt(false);
        Wz wz2 = new Wz();
        Vz vz2 = new Vz();
        if (mainRepository.a()) {
            whatsNextWorker = new Yz("QES", true);
        }
        return new C4084yp(yt2, wz2, vz2, whatsNextWorker);
    }

    public final InterfaceC4044xs a(C4087ys popupHandlerBuilder, InterfaceC3997wo orcaDestroyer, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return popupHandlerBuilder.a(new L3(lottieServiceLocator), new Vt(orcaDestroyer, imageServiceLocator));
    }

    public final Tx a(C3061au flowCoordinator, Mx analytics, Sx stateProvider, InterfaceC4044xs popupHandler) {
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        return new Tx(new C3520lk(stateProvider), flowCoordinator, popupHandler, analytics);
    }

    public final ED a(InterfaceC4133zv repository, Zv uploadSelfieWorker) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(uploadSelfieWorker, "uploadSelfieWorker");
        return new C4090yv(repository, uploadSelfieWorker);
    }

    public final C3834sy a(C3104bu qesFlowDataBundle, C4047xv uiStateProvider, InterfaceC3663oy repository, ED viewCompletionHandler, InterfaceC2931Re selfieErrorHandler, C3061au flowCoordinator, C3321gy analytics, C4087ys popupHandlerBuilder, CoroutineScope coroutineScope, InterfaceC3997wo orcaDestroyer, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(qesFlowDataBundle, "qesFlowDataBundle");
        p013kotlin.jvm.internal.s.k(uiStateProvider, "uiStateProvider");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(selfieErrorHandler, "selfieErrorHandler");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(orcaDestroyer, "orcaDestroyer");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        List listP0 = p013kotlin.collections.v.P0(a(qesFlowDataBundle, orcaDestroyer, imageServiceLocator), p013kotlin.collections.v.e(new C3917uv(flowCoordinator, imageServiceLocator)));
        C3520lk c3520lk = new C3520lk(uiStateProvider);
        C2874Gc c2874Gc = new C2874Gc(coroutineScope);
        Cs[] csArr = (Cs[]) listP0.toArray(new Cs[0]);
        return new C3834sy(c3520lk, c2874Gc, uiStateProvider, false, flowCoordinator, viewCompletionHandler, repository, selfieErrorHandler, popupHandlerBuilder.a((Cs[]) Arrays.copyOf(csArr, csArr.length)), analytics, coroutineScope);
    }

    public final C3874tv a(InterfaceC3863tk navigationChannel, final Fp permissionChecker, C4087ys popupHandlerBuilder, Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(permissionChecker, "permissionChecker");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return new C3874tv(navigationChannel, new wn0.a() { // from class: com.fourthline.orca.internal.uz0
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(C3146cu.a(permissionChecker));
            }
        }, popupHandlerBuilder.a(new L3(lottieServiceLocator)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Fp fp2) {
        return !fp2.a();
    }

    private final List a(InterfaceC3997wo interfaceC3997wo, InterfaceC3732qh interfaceC3732qh) {
        return p013kotlin.collections.v.p(new C4088yt(interfaceC3997wo, interfaceC3732qh), new Zu(interfaceC3997wo, interfaceC3732qh), new C3660ov(interfaceC3997wo, interfaceC3732qh), new Xv(interfaceC3997wo, interfaceC3732qh), new Wv(interfaceC3997wo, interfaceC3732qh), new Yv(interfaceC3997wo, interfaceC3732qh));
    }

    private final List a(C3104bu c3104bu, InterfaceC3997wo interfaceC3997wo, InterfaceC3732qh interfaceC3732qh) {
        return p013kotlin.collections.v.p(new C3362hw(interfaceC3997wo, interfaceC3732qh), new C3446jw(interfaceC3997wo, interfaceC3732qh), new C3403iw(interfaceC3997wo, interfaceC3732qh));
    }
}
