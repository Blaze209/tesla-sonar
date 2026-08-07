package com.fourthline.orca.internal;

import android.content.Context;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.orca.internal.pA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3676pA {
    /* JADX WARN: Multi-variable type inference failed */
    public final C3977wA a(Context context) {
        p013kotlin.jvm.internal.s.k(context, "context");
        jn0.s.Companion companion = jn0.s.INSTANCE;
        int i11 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        WorkflowConfigurationTenantSettings workflowConfigurationTenantSettings = new WorkflowConfigurationTenantSettings("Fourthline", new WorkflowConfigurationTenantAnalytics(true), (DeviceDataCollection) null, new RemoteAssetsConfig(AbstractC3972w5.b(context)), (BackButtonOnTopConfig) null, (EidConfig) null, 52, defaultConstructorMarker);
        List listE = p013kotlin.collections.v.e("IdentityVerification");
        C3153d0 c3153d0 = C3153d0.INSTANCE;
        Object[] objArr = 0 == true ? 1 : 0;
        String str = "allowed";
        DocumentAnalysisSettings documentAnalysisSettings = null;
        CameraX cameraX = null;
        Object[] objArr2 = 0 == true ? 1 : 0;
        DocumentSettings documentSettings = new DocumentSettings(p013kotlin.collections.v.e(new SupportedDocumentsResponse("NLD", p013kotlin.collections.v.p(new IdDocument("Passport", p013kotlin.collections.v.e("NLD"), (String) objArr, 0, 12, defaultConstructorMarker), new IdDocument("DrivingLicense", p013kotlin.collections.v.e("NLD"), (String) null, 0, 12, (DefaultConstructorMarker) null)))), str, documentAnalysisSettings, (Boolean) objArr2, cameraX, 28, defaultConstructorMarker);
        NfcSettings nfcSettings = new NfcSettings(true, "Default");
        GeolocationSettings geolocationSettings = new GeolocationSettings(true);
        C2901Le c2901Le = C2901Le.INSTANCE;
        PersonSettings personSettings = new PersonSettings(0, i11, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        C3657os c3657os = C3657os.INSTANCE;
        int i12 = 3;
        LivenessSettings livenessSettings = null;
        return new C3977wA(jn0.s.b(new InterfaceC3508lE.b(new WorkflowConfigurationResponse(workflowConfigurationTenantSettings, new WorkflowConfiguration(listE, new IdvSettings(documentSettings, nfcSettings, new TinSettings((Boolean) (0 == true ? 1 : 0), "NLD", i11, (DefaultConstructorMarker) (0 == true ? 1 : 0)), livenessSettings, new SelfieSettings((SelfieVideoSettings) (0 == true ? 1 : 0), (CameraX) (0 == true ? 1 : 0), i12, (DefaultConstructorMarker) (0 == true ? 1 : 0)), geolocationSettings, personSettings, c2901Le, c3153d0, c3657os, 8, (DefaultConstructorMarker) null), new QesSettings(new SelfieSettings((SelfieVideoSettings) (0 == true ? 1 : 0), (CameraX) (0 == true ? 1 : 0), i12, (DefaultConstructorMarker) (0 == true ? 1 : 0)), (LivenessSettings) null, new GeolocationSettings(true), Ay.INSTANCE, 2, (DefaultConstructorMarker) null), (BavSettings) null, (CdrSettings) null, (CcrSettings) null, 56, (DefaultConstructorMarker) null)))), 0L, 2, null);
    }

    public final C4063yA b() {
        return new C4063yA(0L, 1, null);
    }

    public final Lz a() {
        jn0.s.Companion companion = jn0.s.INSTANCE;
        return new Lz(jn0.s.b(new InterfaceC3625o2.b("https://fourthline.com/")), 0L, 2, null);
    }
}
