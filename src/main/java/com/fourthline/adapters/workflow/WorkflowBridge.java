package com.fourthline.adapters.workflow;

import android.app.Activity;
import android.content.Context;
import com.fourthline.adapters.common.Bridge;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.workflow.WorkflowFlowConfig;
import com.fourthline.scanners.config.orca.workflow.WorkflowLauncher;
import jn0.h0;
import jn0.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ[\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowBridge;", "Lcom/fourthline/adapters/common/Bridge;", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "configJson", "Lkotlin/Function1;", "Ljn0/h0;", "onSuccess", "onFailure", "launch", "(Landroid/app/Activity;Ljava/lang/String;Lwn0/l;Lwn0/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDataUploaded", "(Landroid/app/Activity;Ljava/lang/String;Lwn0/l;Lwn0/l;Lwn0/l;)V", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowBridge implements Bridge {
    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 launch$lambda$2(WorkflowBridge workflowBridge, Activity activity, l lVar, l lVar2, s sVar) {
        WorkflowDataListener.INSTANCE.setCallbackData(null);
        BuildersKt__Builders_commonKt.launch$default(workflowBridge.getCoroutineScope(activity), null, null, new WorkflowBridge$launch$2$1(lVar, sVar, lVar2, null), 3, null);
        return h0.f84049a;
    }

    @Override // com.fourthline.adapters.common.Bridge
    public CoroutineScope getCoroutineScope(Activity activity) {
        return Bridge.DefaultImpls.getCoroutineScope(this, activity);
    }

    @Override // com.fourthline.adapters.common.Bridge
    public Object launch(Activity activity, String str, l<? super String, h0> lVar, l<? super String, h0> lVar2, Continuation<? super h0> continuation) throws CommonJsonError.IncorrectConfiguration, CommonJsonError.DecodingError {
        launch(activity, str, (l<? super String, h0>) null, lVar, lVar2);
        return h0.f84049a;
    }

    public final void launch(final Activity activity, String configJson, l<? super String, h0> onDataUploaded, final l<? super String, h0> onSuccess, final l<? super String, h0> onFailure) throws CommonJsonError.IncorrectConfiguration, CommonJsonError.DecodingError {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        p013kotlin.jvm.internal.s.k(configJson, "configJson");
        p013kotlin.jvm.internal.s.k(onSuccess, "onSuccess");
        p013kotlin.jvm.internal.s.k(onFailure, "onFailure");
        WorkflowFlowConfig workflowFlowConfigFromJson = new WorkflowInputProcessorImpl().fromJson(configJson);
        WorkflowDataListener workflowDataListener = WorkflowDataListener.INSTANCE;
        if (onDataUploaded != null) {
            Context applicationContext = activity.getApplicationContext();
            p013kotlin.jvm.internal.s.j(applicationContext, "getApplicationContext(...)");
            workflowDataListener.setCallbackData(new WorkflowDataListener.CallbackData(applicationContext, onDataUploaded));
        }
        WorkflowLauncher.INSTANCE.launch(activity, workflowFlowConfigFromJson, workflowDataListener, new l() { // from class: com.fourthline.adapters.workflow.a
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return WorkflowBridge.launch$lambda$2(this.f23998a, activity, onSuccess, onFailure, (s) obj);
            }
        });
    }
}
