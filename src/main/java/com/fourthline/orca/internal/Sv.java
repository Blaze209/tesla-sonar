package com.fourthline.orca.internal;

import com.fourthline.orca.core.flavor.OrcaLocalization;

/* JADX INFO: loaded from: classes4.dex */
public final class Sv implements Rv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3104bu f27810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OrcaLocalization f27811b;

    public Sv(C3104bu bundle, OrcaLocalization localization) {
        p013kotlin.jvm.internal.s.k(bundle, "bundle");
        p013kotlin.jvm.internal.s.k(localization, "localization");
        this.f27810a = bundle;
        this.f27811b = localization;
    }

    @Override // com.fourthline.orca.internal.Rv
    public String a() {
        return this.f27810a.d();
    }

    @Override // com.fourthline.orca.internal.Rv
    public OrcaLocalization.LanguageType b() {
        OrcaLocalization.LanguageType fixedLanguage = this.f27811b.getFixedLanguage();
        return fixedLanguage == null ? this.f27811b.getBaseLanguage() : fixedLanguage;
    }
}
