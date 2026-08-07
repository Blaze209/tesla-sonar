package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@in.a
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/facebook/react/jscexecutor/JSCExecutor;", "Lcom/facebook/react/bridge/JavaScriptExecutor;", "Lcom/facebook/react/bridge/ReadableNativeMap;", "jscConfig", "<init>", "(Lcom/facebook/react/bridge/ReadableNativeMap;)V", "", "getName", "()Ljava/lang/String;", "a", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JSCExecutor extends JavaScriptExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f22644a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0083 ¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u0003¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/jscexecutor/JSCExecutor$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReadableNativeMap;", "jscConfig", "Lcom/facebook/jni/HybridData;", "b", "(Lcom/facebook/react/bridge/ReadableNativeMap;)Lcom/facebook/jni/HybridData;", "Ljn0/h0;", "c", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final HybridData b(ReadableNativeMap jscConfig) {
            return JSCExecutor.initHybrid(jscConfig);
        }

        public final void c() {
            SoLoader.t("jscexecutor");
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f22644a = aVar;
        aVar.c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSCExecutor(ReadableNativeMap jscConfig) {
        super(f22644a.b(jscConfig));
        s.k(jscConfig, "jscConfig");
    }

    public static final void b() {
        f22644a.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "JSCExecutor";
    }
}
