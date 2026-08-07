package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class H5 {
    public final D5 a(Rw resourcesManager) {
        p013kotlin.jvm.internal.s.k(resourcesManager, "resourcesManager");
        return new E5(resourcesManager);
    }

    public final C5 a(Rw resourcesManager, P5 countrySupportedUseCase) {
        p013kotlin.jvm.internal.s.k(resourcesManager, "resourcesManager");
        p013kotlin.jvm.internal.s.k(countrySupportedUseCase, "countrySupportedUseCase");
        return new M5(resourcesManager, countrySupportedUseCase);
    }

    public final InterfaceC3988wf a(D5 countriesFilter, C5 countriesComparator, wn0.a resourcesFactory) {
        p013kotlin.jvm.internal.s.k(countriesFilter, "countriesFilter");
        p013kotlin.jvm.internal.s.k(countriesComparator, "countriesComparator");
        p013kotlin.jvm.internal.s.k(resourcesFactory, "resourcesFactory");
        return new C4031xf(countriesFilter, countriesComparator, resourcesFactory);
    }

    public final InterfaceC4117zf a(D5 countriesFilter, C5 countriesComparator) {
        p013kotlin.jvm.internal.s.k(countriesFilter, "countriesFilter");
        p013kotlin.jvm.internal.s.k(countriesComparator, "countriesComparator");
        return new C4074yf(countriesFilter, countriesComparator);
    }
}
