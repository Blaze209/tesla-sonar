package com.fourthline.adapters.workflow;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.adapters.kyc.BitmapSaver;
import com.fourthline.adapters.kyc.BitmapSaverImpl;
import com.fourthline.core.VideoRecording;
import com.fourthline.orca.workflow.BiometricsComponentResult;
import com.fourthline.orca.workflow.WorkflowResults;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.workflow.WorkflowJsonError;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowBiometricsComponentOutputProcessorImpl;", "Lcom/fourthline/adapters/workflow/WorkflowBiometricsComponentOutputProcessor;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/fourthline/adapters/kyc/BitmapSaver;", "bitmapSaver", "<init>", "(Landroid/content/Context;Lcom/fourthline/adapters/kyc/BitmapSaver;)V", "Ljn0/s;", "Lcom/fourthline/orca/workflow/BiometricsComponentResult;", "documentComponentResult", "", "handle", "(Ljava/lang/Object;)Ljava/lang/String;", "Landroid/content/Context;", "Lcom/fourthline/adapters/kyc/BitmapSaver;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowBiometricsComponentOutputProcessorImpl implements WorkflowBiometricsComponentOutputProcessor {
    private final BitmapSaver bitmapSaver;
    private final Context context;

    public WorkflowBiometricsComponentOutputProcessorImpl(Context context, BitmapSaver bitmapSaver) {
        s.k(context, "context");
        s.k(bitmapSaver, "bitmapSaver");
        this.context = context;
        this.bitmapSaver = bitmapSaver;
    }

    @Override // com.fourthline.adapters.workflow.WorkflowBiometricsComponentOutputProcessor
    public String handle(Object documentComponentResult) throws JSONException, WorkflowJsonError.ClientRejected, CommonJsonError.Unexpected, WorkflowJsonError.ModuleError, WorkflowJsonError.InvalidWorkflowStatus, CommonJsonError.UserCanceled, WorkflowJsonError.InvalidSession, WorkflowJsonError.ConfigurationNotSupported {
        VideoRecording recording;
        Throwable thE = jn0.s.e(documentComponentResult);
        if (thE != null) {
            WorkflowOutputProcessorKt.handleWorkflowError(thE);
            return "";
        }
        BiometricsComponentResult biometricsComponentResult = (BiometricsComponentResult) documentComponentResult;
        JSONObject jSONObjectPut = new JSONObject().put("selfie", WorkflowResultsIdvModelsKt.selfieToJson(biometricsComponentResult.getSelfie(), this.bitmapSaver));
        WorkflowResults.IDV.SelfieVideo liveness = biometricsComponentResult.getLiveness();
        return jSONObjectPut.putOpt("liveness", (liveness == null || (recording = liveness.getRecording()) == null) ? null : WorkflowResultsIdvModelsKt.recordingToJson(recording)).toString();
    }

    public /* synthetic */ WorkflowBiometricsComponentOutputProcessorImpl(Context context, BitmapSaver bitmapSaver, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? new BitmapSaverImpl(context) : bitmapSaver);
    }
}
