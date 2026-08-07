package com.tesla.oapi.auth;

import java.util.List;
import okhttp3.Interceptor;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/tesla/oapi/auth/InterceptorProvider;", "", "provideInterceptor", "", "Lokhttp3/Interceptor;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface InterceptorProvider {
    List<Interceptor> provideInterceptor();
}
