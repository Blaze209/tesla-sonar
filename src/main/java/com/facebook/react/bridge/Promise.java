package com.facebook.react.bridge;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\t\u0010\rJ+\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\t\u0010\u000eJ\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\t\u0010\u000fJ\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\t\u0010\u0012J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\t\u0010\u0013J)\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\t\u0010\u0014J)\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\t\u0010\u0015J7\u0010\t\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/Promise;", "", "value", "Ljn0/h0;", "resolve", "(Ljava/lang/Object;)V", "", "code", "message", "reject", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "Lcom/facebook/react/bridge/WritableMap;", "userInfo", "(Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Lcom/facebook/react/bridge/WritableMap;)V", "(Ljava/lang/String;)V", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Promise {
    @jn0.e
    void reject(String message);

    void reject(String code, WritableMap userInfo);

    void reject(String code, String message);

    void reject(String code, String message, WritableMap userInfo);

    void reject(String code, String message, Throwable throwable);

    void reject(String code, String message, Throwable throwable, WritableMap userInfo);

    void reject(String code, Throwable throwable);

    void reject(String code, Throwable throwable, WritableMap userInfo);

    void reject(Throwable throwable);

    void reject(Throwable throwable, WritableMap userInfo);

    void resolve(Object value);
}
