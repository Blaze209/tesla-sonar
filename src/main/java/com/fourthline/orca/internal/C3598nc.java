package com.fourthline.orca.internal;

import com.fourthline.core.VideoRecording;
import java.util.List;
import p013kotlin.Pair;

/* JADX INFO: renamed from: com.fourthline.orca.internal.nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3598nc implements InterfaceC4066yD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f33906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4104z8 f33907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC3500l6 f33908c;

    public C3598nc(wn0.a workflowIdProvider, C4104z8 dataBundle, InterfaceC3500l6 dataWorkManager) {
        p013kotlin.jvm.internal.s.k(workflowIdProvider, "workflowIdProvider");
        p013kotlin.jvm.internal.s.k(dataBundle, "dataBundle");
        p013kotlin.jvm.internal.s.k(dataWorkManager, "dataWorkManager");
        this.f33906a = workflowIdProvider;
        this.f33907b = dataBundle;
        this.f33908c = dataWorkManager;
    }

    @Override // com.fourthline.orca.internal.InterfaceC4066yD
    public void a(VideoRecording videoRecording) {
        p013kotlin.jvm.internal.s.k(videoRecording, "videoRecording");
        Pair pairB = A8.b(this.f33907b);
        if (pairB != null) {
            this.f33908c.a(new C2862Ec((String) this.f33906a.invoke(), (List) pairB.b()));
        }
    }
}
