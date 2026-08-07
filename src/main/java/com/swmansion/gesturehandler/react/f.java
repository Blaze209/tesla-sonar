package com.swmansion.gesturehandler.react;

import com.swmansion.gesturehandler.core.GestureHandler;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/swmansion/gesturehandler/react/f;", "", "<init>", "()V", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "T", "handler", "Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "a", "(Lcom/swmansion/gesturehandler/core/GestureHandler;)Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "", "handlerName", "b", "(Ljava/lang/String;)Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "", "[Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "handlerFactories", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f55414a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final GestureHandler.b<?>[] handlerFactories = {new com.swmansion.gesturehandler.core.e.d(), new com.swmansion.gesturehandler.core.l.b(), new com.swmansion.gesturehandler.core.c.b(), new com.swmansion.gesturehandler.core.f.b(), new com.swmansion.gesturehandler.core.g.a(), new com.swmansion.gesturehandler.core.i.b(), new com.swmansion.gesturehandler.core.a.b(), new com.swmansion.gesturehandler.core.d.a(), new com.swmansion.gesturehandler.core.b.C1110b()};

    private f() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends GestureHandler> GestureHandler.b<GestureHandler> a(GestureHandler handler) {
        s.k(handler, "handler");
        for (com.swmansion.gesturehandler.core.l.b bVar : handlerFactories) {
            if (s.f(bVar.e(), handler.getClass())) {
                return bVar;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends GestureHandler> GestureHandler.b<GestureHandler> b(String handlerName) {
        s.k(handlerName, "handlerName");
        for (com.swmansion.gesturehandler.core.l.b bVar : handlerFactories) {
            if (s.f(bVar.getName(), handlerName)) {
                return bVar;
            }
        }
        return null;
    }
}
