package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.networking.NetworkEnvironment;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.sE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3808sE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3680pE f35273a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3808sE() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final C3723qE a(InterfaceC3863tk navigationChannel) {
        p013kotlin.jvm.internal.s.k(navigationChannel, "navigationChannel");
        return new C3723qE(navigationChannel);
    }

    public C3808sE(C3680pE c3680pE) {
        this.f35273a = c3680pE;
    }

    public final KE a(C3765rE bundle, Locale locale) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(locale, "locale");
        String language = locale.getLanguage();
        p013kotlin.jvm.internal.s.j(language, "getLanguage(...)");
        return new LE(bundle, language);
    }

    public /* synthetic */ C3808sE(C3680pE c3680pE, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : c3680pE);
    }

    public final Xk a(C3765rE bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new Yk(bundle);
    }

    public final QE a(Context context, X3 cdnUrlDownloadWorker, Xk resultRepository, InterfaceC3681pF workflowStartSessionWorker, InterfaceC3508lE workflowConfigurationWorker, InterfaceC3852tF workflowStatusWorker, InterfaceC3551mE workflowDeviceMetadataWorker, InterfaceC3645og workflowWhatsNextWorker, InterfaceC3625o2 bavRedirectUrlWorker, NetworkEnvironment networkEnvironment, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(workflowStartSessionWorker, "workflowStartSessionWorker");
        p013kotlin.jvm.internal.s.k(workflowConfigurationWorker, "workflowConfigurationWorker");
        p013kotlin.jvm.internal.s.k(workflowStatusWorker, "workflowStatusWorker");
        p013kotlin.jvm.internal.s.k(workflowDeviceMetadataWorker, "workflowDeviceMetadataWorker");
        p013kotlin.jvm.internal.s.k(workflowWhatsNextWorker, "workflowWhatsNextWorker");
        p013kotlin.jvm.internal.s.k(bavRedirectUrlWorker, "bavRedirectUrlWorker");
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new SE(context, new C3644of(false, workflowStartSessionWorker, workflowConfigurationWorker, workflowStatusWorker, workflowDeviceMetadataWorker, workflowWhatsNextWorker, bavRedirectUrlWorker, new WE(networkEnvironment), resultRepository), cdnUrlDownloadWorker, ContextExtensionsKt.getAssetsFourthlineDirectory(context), tracker);
    }

    public final NE a() {
        return new NE();
    }

    public final OE a(KE repository, InterfaceC3051ak mainRepository, InterfaceC3955vp themeRepository, NE stateProvider, QE mobileSessionWorker, InterfaceC4044xs popupHandler, EE analytics, C3723qE flowCoordinator, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(repository, "repository");
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(themeRepository, "themeRepository");
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        p013kotlin.jvm.internal.s.k(mobileSessionWorker, "mobileSessionWorker");
        p013kotlin.jvm.internal.s.k(popupHandler, "popupHandler");
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        return new OE(new C3520lk(stateProvider), stateProvider, popupHandler, flowCoordinator, repository, mainRepository, themeRepository, mobileSessionWorker, analytics, coroutineScope);
    }

    public final EE a(C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        return new EE(tracker);
    }

    public final InterfaceC4044xs a(C4087ys popupHandlerBuilder, C3723qE flowCoordinator) {
        p013kotlin.jvm.internal.s.k(popupHandlerBuilder, "popupHandlerBuilder");
        p013kotlin.jvm.internal.s.k(flowCoordinator, "flowCoordinator");
        C3817sh c3817sh = new C3817sh();
        return popupHandlerBuilder.a(new DE(flowCoordinator, c3817sh), new Ri(flowCoordinator, c3817sh), new Ep(flowCoordinator, c3817sh), new C4034xi(flowCoordinator, c3817sh), new C3338hE(flowCoordinator, c3817sh), new C3895uF(flowCoordinator, c3817sh), new C3982wF(flowCoordinator, c3817sh), new C3938vF(flowCoordinator, c3817sh));
    }
}
