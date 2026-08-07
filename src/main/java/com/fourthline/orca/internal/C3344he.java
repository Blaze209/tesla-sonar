package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DocumentType;
import com.fourthline.core.eid.EidServiceProvider;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.orca.internal.he, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3344he {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.he$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC2894Kc.values().length];
            try {
                iArr[EnumC2894Kc.Pin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2894Kc.RetryPin.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2894Kc.Can.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Kn a(final Ln nfcScannerVideos, Uj lottieServiceLocator, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(nfcScannerVideos, "nfcScannerVideos");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        return new Kn(new wn0.a() { // from class: com.fourthline.orca.internal.m31
            @Override // wn0.a
            public final Object invoke() {
                return C3344he.a(nfcScannerVideos);
            }
        }, lottieServiceLocator.a(Tj.LoadingSpinner), imageServiceLocator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final En.e.a a(Ln ln2) {
        return (En.e.a) ln2.invoke(DocumentType.ID_CARD);
    }

    public final InterfaceC3643oe a(C2899Lc bundle, Context context) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(context, "context");
        return new C3686pe(bundle, context);
    }

    public final InterfaceC3814se a(C2899Lc bundle, EidServiceProvider eidServiceProvider) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(eidServiceProvider, "eidServiceProvider");
        int i11 = a.$EnumSwitchMapping$0[bundle.b().ordinal()];
        if (i11 == 1) {
            return new C3943ve(bundle, eidServiceProvider);
        }
        if (i11 == 2) {
            return new C3729qe(bundle, eidServiceProvider);
        }
        if (i11 == 3) {
            return new C3900ue(bundle, eidServiceProvider);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C3857te a(Kn stateProvider, C3343hd flowCoordinator, InterfaceC3643oe repository, C4087ys popupHandlerBuilder, InterfaceC3732qh imageServiceLocator, Uj lottieServiceLocator, InterfaceC3814se eidScannerUseCase, C2899Lc eidBundle, Context context, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        p013kotlin.jvm.internal.s.k(lottieServiceLocator, "lottieServiceLocator");
        p013kotlin.jvm.internal.s.k(eidScannerUseCase, "eidScannerUseCase");
        p013kotlin.jvm.internal.s.k(eidBundle, "eidBundle");
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        C2874Gc c2874Gc = new C2874Gc(coroutineScope);
        return new C3857te(new C3520lk(stateProvider), c2874Gc, stateProvider, flowCoordinator, repository, eidScannerUseCase, popupHandlerBuilder.a(new C3600ne(lottieServiceLocator, c2874Gc, flowCoordinator, repository), new C3301ge(flowCoordinator, imageServiceLocator, eidBundle), new C3173de(flowCoordinator, imageServiceLocator, eidBundle), new C3258fe(flowCoordinator, imageServiceLocator, eidBundle), new C3088be(flowCoordinator, imageServiceLocator, eidBundle, context), new C3130ce(flowCoordinator, imageServiceLocator, eidBundle), new C3215ee(flowCoordinator, imageServiceLocator, eidBundle)), coroutineScope);
    }
}
