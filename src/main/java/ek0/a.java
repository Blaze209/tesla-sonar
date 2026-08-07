package ek0;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lek0/a;", "", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Ljava/lang/Exception;)Lcom/facebook/react/bridge/WritableMap;", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f63021a = new a();

    private a() {
    }

    public final WritableMap a(Exception exception) {
        s.k(exception, "exception");
        WritableMap writableMapCreateMap = Arguments.createMap();
        String message = exception.getMessage();
        writableMapCreateMap.putString("code", "unknown");
        writableMapCreateMap.putString("nativeErrorCode", "unknown");
        writableMapCreateMap.putString("message", message);
        writableMapCreateMap.putString("nativeErrorMessage", message);
        s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }
}
