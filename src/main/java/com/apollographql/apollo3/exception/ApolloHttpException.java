package com.apollographql.apollo3.exception;

import java.util.List;
import ji.HttpHeader;
import okio.j;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/apollographql/apollo3/exception/ApolloHttpException;", "Lcom/apollographql/apollo3/exception/ApolloException;", "", "statusCode", "", "Lji/d;", "headers", "Lokio/j;", "body", "", "message", "", "cause", "<init>", "(ILjava/util/List;Lokio/j;Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "I", "getStatusCode", "()I", "b", "Ljava/util/List;", "getHeaders", "()Ljava/util/List;", "c", "Lokio/j;", "getBody", "()Lokio/j;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ApolloHttpException extends ApolloException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int statusCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<HttpHeader> headers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j body;

    public /* synthetic */ ApolloHttpException(int i11, List list, j jVar, String str, Throwable th2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, list, jVar, str, (i12 & 16) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i11, List<HttpHeader> headers, j jVar, String message, Throwable th2) {
        super(message, th2);
        s.k(headers, "headers");
        s.k(message, "message");
        this.statusCode = i11;
        this.headers = headers;
        this.body = jVar;
    }
}
