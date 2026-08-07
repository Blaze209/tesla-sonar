package com.tesla.oapi;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tesla/oapi/OwnerApiEndpoint;", "", "method", "Lcom/tesla/oapi/HttpMethodType;", "uri", "", "isAuthenticated", "", "<init>", "(Lcom/tesla/oapi/HttpMethodType;Ljava/lang/String;Z)V", "getMethod", "()Lcom/tesla/oapi/HttpMethodType;", "getUri", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OwnerApiEndpoint {
    private final boolean isAuthenticated;
    private final HttpMethodType method;
    private final String uri;

    public OwnerApiEndpoint(@g(name = "TYPE") HttpMethodType method, @g(name = "URI") String uri, @g(name = "AUTH") boolean z11) {
        s.k(method, "method");
        s.k(uri, "uri");
        this.method = method;
        this.uri = uri;
        this.isAuthenticated = z11;
    }

    public static /* synthetic */ OwnerApiEndpoint copy$default(OwnerApiEndpoint ownerApiEndpoint, HttpMethodType httpMethodType, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            httpMethodType = ownerApiEndpoint.method;
        }
        if ((i11 & 2) != 0) {
            str = ownerApiEndpoint.uri;
        }
        if ((i11 & 4) != 0) {
            z11 = ownerApiEndpoint.isAuthenticated;
        }
        return ownerApiEndpoint.copy(httpMethodType, str, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HttpMethodType getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsAuthenticated() {
        return this.isAuthenticated;
    }

    public final OwnerApiEndpoint copy(@g(name = "TYPE") HttpMethodType method, @g(name = "URI") String uri, @g(name = "AUTH") boolean isAuthenticated) {
        s.k(method, "method");
        s.k(uri, "uri");
        return new OwnerApiEndpoint(method, uri, isAuthenticated);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnerApiEndpoint)) {
            return false;
        }
        OwnerApiEndpoint ownerApiEndpoint = (OwnerApiEndpoint) other;
        return this.method == ownerApiEndpoint.method && s.f(this.uri, ownerApiEndpoint.uri) && this.isAuthenticated == ownerApiEndpoint.isAuthenticated;
    }

    public final HttpMethodType getMethod() {
        return this.method;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        return (((this.method.hashCode() * 31) + this.uri.hashCode()) * 31) + Boolean.hashCode(this.isAuthenticated);
    }

    public final boolean isAuthenticated() {
        return this.isAuthenticated;
    }

    public String toString() {
        return "OwnerApiEndpoint(method=" + this.method + ", uri=" + this.uri + ", isAuthenticated=" + this.isAuthenticated + ")";
    }
}
