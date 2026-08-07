package com.fourthline.adapters.workflow;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.adapters.common.BridgeKt;
import com.fourthline.orca.workflow.WorkflowSession;
import com.fourthline.scanners.config.orca.common.CommonJsonError;
import com.fourthline.scanners.config.orca.workflow.WorkflowComponentsLauncher;
import com.fourthline.scanners.config.orca.workflow.WorkflowJsonError;
import jn0.h0;
import jn0.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p013kotlin.Metadata;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJE\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowComponentsBridge;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "configJson", "Lkotlin/Function0;", "Ljn0/h0;", "onSuccess", "Lkotlin/Function1;", "onFailure", "startSession", "(Landroid/content/Context;Ljava/lang/String;Lwn0/a;Lwn0/l;)V", "Landroid/app/Activity;", "activity", "launchDocumentComponent", "(Landroid/app/Activity;Ljava/lang/String;Lwn0/l;Lwn0/l;)V", "launchBiometricsComponent", "Lcom/fourthline/orca/workflow/WorkflowSession;", "workflowSession", "Lcom/fourthline/orca/workflow/WorkflowSession;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowComponentsBridge {
    private WorkflowSession workflowSession;

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 launchBiometricsComponent$lambda$4$lambda$3(l lVar, Activity activity, l lVar2, s sVar) {
        BuildersKt__Builders_commonKt.launch$default(BridgeKt.getMainCoroutineScope(), null, null, new WorkflowComponentsBridge$launchBiometricsComponent$1$1$1(lVar, activity, sVar, lVar2, null), 3, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 launchDocumentComponent$lambda$2$lambda$1(l lVar, Activity activity, l lVar2, s sVar) {
        BuildersKt__Builders_commonKt.launch$default(BridgeKt.getMainCoroutineScope(), null, null, new WorkflowComponentsBridge$launchDocumentComponent$1$1$1(lVar, activity, sVar, lVar2, null), 3, null);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 startSession$lambda$0(l lVar, WorkflowComponentsBridge workflowComponentsBridge, wn0.a aVar, s sVar) {
        BuildersKt__Builders_commonKt.launch$default(BridgeKt.getMainCoroutineScope(), null, null, new WorkflowComponentsBridge$startSession$1$1(sVar, lVar, workflowComponentsBridge, aVar, null), 3, null);
        return h0.f84049a;
    }

    public final void launchBiometricsComponent(final Activity activity, String configJson, final l<? super String, h0> onSuccess, final l<? super String, h0> onFailure) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        p013kotlin.jvm.internal.s.k(configJson, "configJson");
        p013kotlin.jvm.internal.s.k(onSuccess, "onSuccess");
        p013kotlin.jvm.internal.s.k(onFailure, "onFailure");
        WorkflowSession workflowSession = this.workflowSession;
        if (workflowSession != null) {
            WorkflowComponentsLauncher.INSTANCE.startBiometricsComponent(activity, workflowSession, new WorkflowBiometricsComponentInputProcessorImpl(null, null, 3, null).fromJson(configJson), new l() { // from class: com.fourthline.adapters.workflow.c
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return WorkflowComponentsBridge.launchBiometricsComponent$lambda$4$lambda$3(onSuccess, activity, onFailure, (s) obj);
                }
            });
        } else {
            String string = WorkflowJsonError.MissingSession.INSTANCE.toFailJson().toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            onFailure.invoke(string);
        }
    }

    public final void launchDocumentComponent(final Activity activity, String configJson, final l<? super String, h0> onSuccess, final l<? super String, h0> onFailure) throws CommonJsonError.IncorrectConfiguration, CommonJsonError.DecodingError {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        p013kotlin.jvm.internal.s.k(configJson, "configJson");
        p013kotlin.jvm.internal.s.k(onSuccess, "onSuccess");
        p013kotlin.jvm.internal.s.k(onFailure, "onFailure");
        WorkflowSession workflowSession = this.workflowSession;
        if (workflowSession != null) {
            WorkflowComponentsLauncher.INSTANCE.startDocumentComponent(activity, workflowSession, new WorkflowDocumentComponentInputProcessorImpl(null, null, 3, null).fromJson(configJson), new l() { // from class: com.fourthline.adapters.workflow.b
                @Override // wn0.l
                public final Object invoke(Object obj) {
                    return WorkflowComponentsBridge.launchDocumentComponent$lambda$2$lambda$1(onSuccess, activity, onFailure, (s) obj);
                }
            });
        } else {
            String string = WorkflowJsonError.MissingSession.INSTANCE.toFailJson().toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            onFailure.invoke(string);
        }
    }

    public final void startSession(Context context, String configJson, final wn0.a<h0> onSuccess, final l<? super String, h0> onFailure) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(configJson, "configJson");
        p013kotlin.jvm.internal.s.k(onSuccess, "onSuccess");
        p013kotlin.jvm.internal.s.k(onFailure, "onFailure");
        WorkflowComponentsLauncher.INSTANCE.startSession(context, new WorkflowInputProcessorImpl().fromJson(configJson), new l() { // from class: com.fourthline.adapters.workflow.d
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return WorkflowComponentsBridge.startSession$lambda$0(onFailure, this, onSuccess, (s) obj);
            }
        });
    }
}
