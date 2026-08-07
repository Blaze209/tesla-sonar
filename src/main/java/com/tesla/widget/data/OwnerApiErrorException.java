package com.tesla.widget.data;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.tesla.oapi.OwnerAPIError;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lcom/tesla/widget/data/OwnerApiErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/tesla/oapi/OwnerAPIError;", AnalyticsAttribute.Error, "<init>", "(Lcom/tesla/oapi/OwnerAPIError;)V", "a", "Lcom/tesla/oapi/OwnerAPIError;", "()Lcom/tesla/oapi/OwnerAPIError;", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OwnerApiErrorException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OwnerAPIError error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnerApiErrorException(OwnerAPIError error) {
        super(error.getErrorString());
        s.k(error, "error");
        this.error = error;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OwnerAPIError getError() {
        return this.error;
    }
}
