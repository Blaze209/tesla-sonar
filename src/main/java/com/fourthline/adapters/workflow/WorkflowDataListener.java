package com.fourthline.adapters.workflow;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.adapters.common.KycMrzJsonProducer;
import com.fourthline.adapters.kyc.BitmapSaverImpl;
import com.fourthline.orca.workflow.WorkflowDataDelegate;
import com.fourthline.orca.workflow.WorkflowResults;
import jn0.h0;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowDataListener;", "Lcom/fourthline/orca/workflow/WorkflowDataDelegate;", "<init>", "()V", "Lcom/fourthline/orca/workflow/WorkflowResults;", "data", "Ljn0/h0;", "onDataUploaded", "(Lcom/fourthline/orca/workflow/WorkflowResults;)V", "Lcom/fourthline/adapters/workflow/WorkflowResultsProcessor;", "resultsProcessor$delegate", "Lkotlin/Lazy;", "getResultsProcessor", "()Lcom/fourthline/adapters/workflow/WorkflowResultsProcessor;", "resultsProcessor", "Lcom/fourthline/adapters/workflow/WorkflowDataListener$CallbackData;", "callbackData", "Lcom/fourthline/adapters/workflow/WorkflowDataListener$CallbackData;", "getCallbackData", "()Lcom/fourthline/adapters/workflow/WorkflowDataListener$CallbackData;", "setCallbackData", "(Lcom/fourthline/adapters/workflow/WorkflowDataListener$CallbackData;)V", "CallbackData", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkflowDataListener implements WorkflowDataDelegate {
    private static CallbackData callbackData;
    public static final WorkflowDataListener INSTANCE = new WorkflowDataListener();

    /* JADX INFO: renamed from: resultsProcessor$delegate, reason: from kotlin metadata */
    private static final Lazy resultsProcessor = m.b(new wn0.a() { // from class: com.fourthline.adapters.workflow.e
        @Override // wn0.a
        public final Object invoke() {
            return WorkflowDataListener.resultsProcessor_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/fourthline/adapters/workflow/WorkflowDataListener$CallbackData;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function1;", "", "Ljn0/h0;", "callback", "<init>", "(Landroid/content/Context;Lwn0/l;)V", "component1", "()Landroid/content/Context;", "component2", "()Lwn0/l;", "copy", "(Landroid/content/Context;Lwn0/l;)Lcom/fourthline/adapters/workflow/WorkflowDataListener$CallbackData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "getContext", "Lwn0/l;", "getCallback", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CallbackData {
        private final l<String, h0> callback;
        private final Context context;

        /* JADX WARN: Multi-variable type inference failed */
        public CallbackData(Context context, l<? super String, h0> callback) {
            s.k(context, "context");
            s.k(callback, "callback");
            this.context = context;
            this.callback = callback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CallbackData copy$default(CallbackData callbackData, Context context, l lVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                context = callbackData.context;
            }
            if ((i11 & 2) != 0) {
                lVar = callbackData.callback;
            }
            return callbackData.copy(context, lVar);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Context getContext() {
            return this.context;
        }

        public final l<String, h0> component2() {
            return this.callback;
        }

        public final CallbackData copy(Context context, l<? super String, h0> callback) {
            s.k(context, "context");
            s.k(callback, "callback");
            return new CallbackData(context, callback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallbackData)) {
                return false;
            }
            CallbackData callbackData = (CallbackData) other;
            return s.f(this.context, callbackData.context) && s.f(this.callback, callbackData.callback);
        }

        public final l<String, h0> getCallback() {
            return this.callback;
        }

        public final Context getContext() {
            return this.context;
        }

        public int hashCode() {
            return (this.context.hashCode() * 31) + this.callback.hashCode();
        }

        public String toString() {
            return "CallbackData(context=" + this.context + ", callback=" + this.callback + ")";
        }
    }

    private WorkflowDataListener() {
    }

    private final WorkflowResultsProcessor getResultsProcessor() {
        return (WorkflowResultsProcessor) resultsProcessor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonWorkflowResultsProcessor resultsProcessor_delegate$lambda$0() {
        Context context;
        KycMrzJsonProducer kycMrzJsonProducer = new KycMrzJsonProducer();
        CallbackData callbackData2 = callbackData;
        if (callbackData2 == null || (context = callbackData2.getContext()) == null) {
            throw new IllegalStateException("Context must be set in order to use the callback");
        }
        return new JsonWorkflowResultsProcessor(new BitmapSaverImpl(context), kycMrzJsonProducer);
    }

    public final CallbackData getCallbackData() {
        return callbackData;
    }

    @Override // com.fourthline.orca.workflow.WorkflowDataDelegate
    public void onDataUploaded(WorkflowResults data) {
        l<String, h0> callback;
        s.k(data, "data");
        CallbackData callbackData2 = callbackData;
        if (callbackData2 == null || (callback = callbackData2.getCallback()) == null) {
            return;
        }
        callback.invoke(getResultsProcessor().handle(data));
    }

    public final void setCallbackData(CallbackData callbackData2) {
        callbackData = callbackData2;
    }
}
