package com.fourthline.orca.internal;

import android.content.Context;
import android.graphics.Bitmap;
import com.fourthline.core.DocumentFileSide;
import com.fourthline.core.DocumentType;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3357hr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3058ar f32347a;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.hr$a */
    public static final class a implements Cr {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3528ls f32348a;

        a(C3528ls c3528ls) {
            this.f32348a = c3528ls;
        }

        @Override // com.fourthline.orca.internal.Cr
        public InterfaceC3272fs a() {
            return AbstractC3571ms.a(this.f32348a);
        }
    }

    public C3357hr(C3058ar flowConfig) {
        p013kotlin.jvm.internal.s.k(flowConfig, "flowConfig");
        this.f32347a = flowConfig;
    }

    public final C3058ar a() {
        return this.f32347a;
    }

    public final C3485ks a(InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new C3485ks(AbstractC3094bk.a(mainRepository));
    }

    public final C3528ls b() {
        return new C3528ls(null, 1, null);
    }

    public final C3092bi c(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new C3092bi("poa", tracker);
    }

    public final Cr a(C3528ls dataBundle) {
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        return new a(dataBundle);
    }

    public final Ur b(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Ur(tracker);
    }

    public final Dr a(final C4104z8 documentFlowDataBundle) {
        p013kotlin.jvm.internal.s.k(documentFlowDataBundle, "documentFlowDataBundle");
        return new Dr() { // from class: com.fourthline.orca.internal.p31
            @Override // com.fourthline.orca.internal.Dr
            public final void a(InterfaceC3272fs interfaceC3272fs) {
                C3357hr.a(documentFlowDataBundle, interfaceC3272fs);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4104z8 c4104z8, InterfaceC3272fs file) {
        C4103z7 c4103z7;
        p013kotlin.jvm.internal.s.k(file, "file");
        if (file instanceof InterfaceC3272fs.a) {
            c4103z7 = new C4103z7(null, ((InterfaceC3272fs.a) file).a(), DocumentFileSide.FRONT, false, null, null, 57, null);
        } else if (file instanceof InterfaceC3272fs.b) {
            c4103z7 = new C4103z7(((InterfaceC3272fs.b) file).a(), null, DocumentFileSide.FRONT, false, null, null, 58, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C3404ix c3404ixN = c4104z8.n();
        List listA = c4104z8.n().a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((C3363hx) obj).d() != DocumentType.PROOF_OF_ADDRESS) {
                arrayList.add(obj);
            }
        }
        c3404ixN.a(p013kotlin.collections.v.Q0(arrayList, new C3363hx(DocumentType.PROOF_OF_ADDRESS, null, null, p013kotlin.collections.v.e(c4103z7), 6, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Fp fp2) {
        return !fp2.a();
    }

    public final C3101br a(InterfaceC3863tk navigationChannel, C4087ys popupHandlerBuilder, final Fp permissionChecker, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(permissionChecker, "permissionChecker");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new C3101br(navigationChannel, popupHandlerBuilder.a(new L3(lottieServiceLocator), new T3(null, imageServiceLocator, 1, null)), new wn0.a() { // from class: com.fourthline.orca.internal.q31
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(C3357hr.a(permissionChecker));
            }
        });
    }

    public final C3314gr a(Uj lottieServiceLocator) {
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        return new C3314gr(lottieServiceLocator.a(Tj.PoaIntro));
    }

    public final C3991wi a(C3092bi analytics, C3101br flowCoordinator, C3314gr stateProvider) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        return new C3991wi(analytics, new C3520lk(stateProvider), stateProvider, flowCoordinator, C3271fr.f31842a, null, null, 96, null);
    }

    public final Fr a(final Context context, final C3528ls dataBundle, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new Fr(new wn0.a() { // from class: com.fourthline.orca.internal.o31
            @Override // wn0.a
            public final Object invoke() {
                return C3357hr.a(context, dataBundle);
            }
        }, lottieServiceLocator.a(Tj.PoaDocumentPlaceholder), imageServiceLocator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap a(Context context, C3528ls c3528ls) {
        return new C3315gs(context).a(AbstractC3571ms.a(c3528ls));
    }

    public final Gr a(Fr stateProvider, Lq analytics, C3101br flowCoordinator, ED viewCompletionHandler, Cr repository, Dr resultRepository, InterfaceC4044xs popupHandler, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(viewCompletionHandler, "viewCompletionHandler");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new Gr(new C3520lk(stateProvider), stateProvider, repository, resultRepository, analytics, flowCoordinator, viewCompletionHandler, popupHandler, coroutineScope);
    }

    public final C3228er a(wn0.a workflowIdProvider, C4104z8 dataBundle) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        return new C3228er(workflowIdProvider, dataBundle);
    }

    public final ED a(C3485ks flowActionProvider, C3228er uploadRequestsBuilder, Vf dataWorkManager, InterfaceC3645og whatsNextWorker) {
        p013kotlin.jvm.internal.s.k(flowActionProvider, "flowActionProvider");
        p013kotlin.jvm.internal.s.k(uploadRequestsBuilder, "uploadRequestsBuilder");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        p013kotlin.jvm.internal.s.k(whatsNextWorker, "whatsNextWorker");
        return new C4084yp(flowActionProvider, uploadRequestsBuilder, dataWorkManager, whatsNextWorker);
    }

    public final Lq a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new Lq(tracker);
    }
}
