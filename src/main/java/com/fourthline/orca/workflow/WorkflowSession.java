package com.fourthline.orca.workflow;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.orca.core.ProductCustomizationStep;
import com.fourthline.orca.document.DocumentCustomizationConfig;
import com.fourthline.orca.selfie.SelfieCustomizationConfig;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\r"}, d2 = {"Lcom/fourthline/orca/workflow/WorkflowSession;", "", "documentComponent", "Lcom/fourthline/orca/core/ProductCustomizationStep;", "Lcom/fourthline/orca/document/DocumentCustomizationConfig;", "Lcom/fourthline/orca/workflow/DocumentComponentResult;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "config", "Lcom/fourthline/orca/workflow/DocumentComponentConfig;", "biometricsComponent", "Lcom/fourthline/orca/selfie/SelfieCustomizationConfig;", "Lcom/fourthline/orca/workflow/BiometricsComponentResult;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface WorkflowSession {
    ProductCustomizationStep<SelfieCustomizationConfig, BiometricsComponentResult> biometricsComponent(Context context);

    ProductCustomizationStep<DocumentCustomizationConfig, DocumentComponentResult> documentComponent(Context context, DocumentComponentConfig config);
}
