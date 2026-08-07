package com.apollographql.apollo3.exception;

import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/apollographql/apollo3/exception/SubscriptionOperationException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "", "operationName", "", StatusResponse.PAYLOAD, "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "a", "Ljava/lang/Object;", "getPayload", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SubscriptionOperationException extends ApolloException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriptionOperationException(String operationName, Object obj) {
        super("Operation error " + operationName, null, 2, null);
        s.k(operationName, "operationName");
        this.payload = obj;
    }
}
