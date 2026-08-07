package com.fourthline.orca.internal;

import com.fourthline.core.VideoRecording;
import com.fourthline.orca.workflow.BiometricsComponentResult;
import com.fourthline.orca.workflow.WorkflowError;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.vision.selfie.SelfieScannerResult;

/* JADX INFO: loaded from: classes4.dex */
public final class Z2 {
    public Object a(Object obj) {
        Throwable unexpected;
        Throwable thE = jn0.s.e(obj);
        if (thE == null) {
            SelfieScannerResult selfieScannerResult = (SelfieScannerResult) obj;
            WorkflowResults.IDV.Selfie selfie = new WorkflowResults.IDV.Selfie(selfieScannerResult.getImage().getFull(), selfieScannerResult.getMetadata().getLocation(), Long.valueOf(selfieScannerResult.getMetadata().getTimestamp().getTime()));
            VideoRecording videoRecording = selfieScannerResult.getVideoRecording();
            return jn0.s.b(new BiometricsComponentResult(selfie, videoRecording != null ? new WorkflowResults.IDV.SelfieVideo(videoRecording) : null));
        }
        if (thE instanceof AbstractC3397ip.a) {
            unexpected = WorkflowError.Canceled.INSTANCE;
        } else {
            String message = thE.getMessage();
            if (message == null) {
                message = thE instanceof Bo ? ((Bo) thE).getAlias() : thE.getClass().getSimpleName();
            }
            p013kotlin.jvm.internal.s.h(message);
            unexpected = new WorkflowError.Unexpected(message);
        }
        return jn0.s.b(jn0.t.a(unexpected));
    }
}
