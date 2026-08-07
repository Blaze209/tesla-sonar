package com.tesla.dashcam_viewer;

import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\tR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/tesla/dashcam_viewer/d;", "", "<init>", "()V", "", "b", "Ljava/lang/String;", "getCurrentEventPath", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "currentEventPath", "", "a", "()Z", "selectedEventSupportsBPillarCamera", "dashcam-viewer_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f55787a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static String currentEventPath = "";

    private d() {
    }

    public final boolean a() {
        DashcamViewerEventMetadata dashcamViewerEventMetadata;
        List<String> listG;
        if (currentEventPath.length() != 0) {
            o1 o1Var = o1.f55932a;
            return o1Var.h().keySet().contains(currentEventPath) && (dashcamViewerEventMetadata = o1Var.h().get(currentEventPath)) != null && (listG = dashcamViewerEventMetadata.g()) != null && listG.contains(h.LEFT_PILLAR.getValue()) && listG.contains(h.RIGHT_PILLAR.getValue());
        }
        return false;
    }

    public final void b(String str) {
        p013kotlin.jvm.internal.s.k(str, "<set-?>");
        currentEventPath = str;
    }
}
