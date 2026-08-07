package com.fourthline.orca.internal;

import com.fourthline.orca.workflow.WorkflowDataDelegate;
import com.fourthline.orca.workflow.WorkflowResults;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class Ti {

    static final class a implements InterfaceC3414j6 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3051ak f27913a;

        a(InterfaceC3051ak interfaceC3051ak) {
            this.f27913a = interfaceC3051ak;
        }

        @Override // com.fourthline.orca.internal.InterfaceC3414j6
        public final Object a(WorkflowResults.IDV idv, Continuation continuation) {
            WorkflowDataDelegate workflowDataDelegateB = this.f27913a.b();
            if (workflowDataDelegateB != null) {
                workflowDataDelegateB.onDataUploaded(idv);
            }
            return jn0.h0.f84049a;
        }
    }

    public final Vf a(InterfaceC3051ak mainRepository, InterfaceC3414j6 dataListener, Provider networkServiceProvider, CoroutineScope coroutineScope) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(dataListener, "dataListener");
        p013kotlin.jvm.internal.s.k(networkServiceProvider, "networkServiceProvider");
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        if (mainRepository.a()) {
            return new Vz();
        }
        Object obj = networkServiceProvider.get();
        p013kotlin.jvm.internal.s.j(obj, "get(...)");
        return new C3435jl(new C3137cl((Gl) obj, null, null, coroutineScope, 6, null), dataListener);
    }

    public final InterfaceC3414j6 a(InterfaceC3051ak mainRepository, C3081bD uploadDataListener) {
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        p013kotlin.jvm.internal.s.k(uploadDataListener, "uploadDataListener");
        return new B4(p013kotlin.collections.v.p(new a(mainRepository), uploadDataListener));
    }

    public final C3081bD a(InterfaceC3457k6 dataUploaderWorker, E6 deviceDataBundle, final InterfaceC3051ak mainRepository) {
        p013kotlin.jvm.internal.s.k(dataUploaderWorker, "dataUploaderWorker");
        p013kotlin.jvm.internal.s.k(deviceDataBundle, "deviceDataBundle");
        p013kotlin.jvm.internal.s.k(mainRepository, "mainRepository");
        return new C3081bD(dataUploaderWorker, deviceDataBundle, new wn0.a() { // from class: com.fourthline.orca.internal.fq0
            @Override // wn0.a
            public final Object invoke() {
                return Ti.a(mainRepository);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(InterfaceC3051ak interfaceC3051ak) {
        XE xeF = interfaceC3051ak.f();
        String strD = xeF != null ? xeF.d() : null;
        if (strD != null) {
            return strD;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) "The workflow network config must be present at this moment!")).toString());
    }
}
