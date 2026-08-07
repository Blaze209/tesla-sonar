package com.th3rdwave.safeareacontext;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/th3rdwave/safeareacontext/f;", "view", "Lcom/th3rdwave/safeareacontext/a;", "insets", "Lcom/th3rdwave/safeareacontext/c;", "frame", "Ljn0/h0;", "b", "(Lcom/th3rdwave/safeareacontext/f;Lcom/th3rdwave/safeareacontext/a;Lcom/th3rdwave/safeareacontext/c;)V", "react-native-safe-area-context_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(f fVar, EdgeInsets edgeInsets, Rect rect) {
        Context context = fVar.getContext();
        s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int id2 = fVar.getId();
        EventDispatcher eventDispatcherC = b1.c(reactContext, id2);
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new b(r.b(reactContext), id2, edgeInsets, rect));
        }
    }
}
