package com.fourthline.orca.core;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/orca/core/ProductPresentationStep;", "RESULT_TYPE", "", "Lcom/fourthline/orca/core/OnProductCompleted;", "onProductCompleted", "Ljn0/h0;", "present", "(Lcom/fourthline/orca/core/OnProductCompleted;)V", "fourthline-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ProductPresentationStep<RESULT_TYPE> {
    void present(OnProductCompleted<RESULT_TYPE> onProductCompleted);
}
