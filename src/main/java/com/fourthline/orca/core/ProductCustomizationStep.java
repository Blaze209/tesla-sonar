package com.fourthline.orca.core;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/fourthline/orca/core/ProductCustomizationStep;", "CUSTOMIZATION", "RESULT_TYPE", "Lcom/fourthline/orca/core/ProductPresentationStep;", "customize", "config", "(Ljava/lang/Object;)Lcom/fourthline/orca/core/ProductPresentationStep;", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProductCustomizationStep<CUSTOMIZATION, RESULT_TYPE> extends ProductPresentationStep<RESULT_TYPE> {
    ProductPresentationStep<RESULT_TYPE> customize(CUSTOMIZATION config);
}
