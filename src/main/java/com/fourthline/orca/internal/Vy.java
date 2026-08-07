package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.networking.NetworkEnvironment;

/* JADX INFO: loaded from: classes4.dex */
public final class Vy {
    public final QE a(Context context, X3 cdnUrlDownloadWorker, Xk resultRepository, InterfaceC3681pF workflowStartSessionWorker, InterfaceC3508lE workflowConfigurationWorker, InterfaceC3852tF workflowStatusWorker, InterfaceC3625o2 bavRedirectUrlWorker, NetworkEnvironment networkEnvironment, C3438jo tracker) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        p013kotlin.jvm.internal.s.k(resultRepository, "resultRepository");
        p013kotlin.jvm.internal.s.k(workflowStartSessionWorker, "workflowStartSessionWorker");
        p013kotlin.jvm.internal.s.k(workflowConfigurationWorker, "workflowConfigurationWorker");
        p013kotlin.jvm.internal.s.k(workflowStatusWorker, "workflowStatusWorker");
        p013kotlin.jvm.internal.s.k(bavRedirectUrlWorker, "bavRedirectUrlWorker");
        p013kotlin.jvm.internal.s.k(networkEnvironment, "networkEnvironment");
        p013kotlin.jvm.internal.s.k(tracker, "tracker");
        C4020xA c4020xA = new C4020xA();
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return new SE(context, new C3644of(true, workflowStartSessionWorker, workflowConfigurationWorker, workflowStatusWorker, c4020xA, new C3835sz(jn0.s.b(new InterfaceC3645og.b(InterfaceC3645og.c.b.f34275a))), bavRedirectUrlWorker, new WE(networkEnvironment), resultRepository), cdnUrlDownloadWorker, ContextExtensionsKt.getAssetsFourthlineDirectory(context), tracker);
    }

    public final Gg a(QE mobileSessionWorker, InterfaceC4018x8 documentFlowConfigWorker, InterfaceC4049xx selfieFlowConfigWorker) {
        p013kotlin.jvm.internal.s.k(mobileSessionWorker, "mobileSessionWorker");
        p013kotlin.jvm.internal.s.k(documentFlowConfigWorker, "documentFlowConfigWorker");
        p013kotlin.jvm.internal.s.k(selfieFlowConfigWorker, "selfieFlowConfigWorker");
        return new C3515lf(mobileSessionWorker, documentFlowConfigWorker, selfieFlowConfigWorker);
    }

    public final Xk a(C3765rE bundle) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        return new Yk(bundle);
    }
}
