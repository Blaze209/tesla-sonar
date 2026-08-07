package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.core.GestureHandler;
import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0003J\u001d\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00180\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 ¨\u0006%"}, d2 = {"Lcom/swmansion/gesturehandler/react/j;", "Ly90/h;", "<init>", "()V", "", "viewTag", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "handler", "Ljn0/h0;", "k", "(ILcom/swmansion/gesturehandler/core/GestureHandler;)V", DateTokenConverter.CONVERTER_KEY, "(Lcom/swmansion/gesturehandler/core/GestureHandler;)V", "j", "handlerTag", "h", "(I)Lcom/swmansion/gesturehandler/core/GestureHandler;", "actionType", "", "c", "(III)Z", "g", "(I)V", "f", "Ljava/util/ArrayList;", IntegerTokenConverter.CONVERTER_KEY, "(I)Ljava/util/ArrayList;", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)Ljava/util/ArrayList;", "Landroid/util/SparseArray;", "Landroid/util/SparseArray;", "handlers", "b", "attachedTo", "handlersForView", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j implements y90.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<GestureHandler> handlers = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<Integer> attachedTo = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<ArrayList<GestureHandler>> handlersForView = new SparseArray<>();

    private final synchronized void d(final GestureHandler handler) {
        try {
            Integer num = this.attachedTo.get(handler.getTag());
            if (num != null) {
                this.attachedTo.remove(handler.getTag());
                ArrayList<GestureHandler> arrayList = this.handlersForView.get(num.intValue());
                if (arrayList != null) {
                    synchronized (arrayList) {
                        arrayList.remove(handler);
                    }
                    if (arrayList.size() == 0) {
                        this.handlersForView.remove(num.intValue());
                    }
                }
            }
            if (handler.getView() != null) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.gesturehandler.react.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.e(handler);
                    }
                });
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(GestureHandler gestureHandler) {
        gestureHandler.q();
    }

    private final synchronized void k(int viewTag, GestureHandler handler) {
        try {
            if (this.attachedTo.get(handler.getTag()) != null) {
                throw new IllegalStateException(("Handler " + handler + " already attached").toString());
            }
            this.attachedTo.put(handler.getTag(), Integer.valueOf(viewTag));
            ArrayList<GestureHandler> arrayList = this.handlersForView.get(viewTag);
            if (arrayList == null) {
                ArrayList<GestureHandler> arrayList2 = new ArrayList<>(1);
                arrayList2.add(handler);
                this.handlersForView.put(viewTag, arrayList2);
            } else {
                synchronized (arrayList) {
                    arrayList.add(handler);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // y90.h
    public synchronized ArrayList<GestureHandler> a(View view) {
        s.k(view, "view");
        return i(view.getId());
    }

    public final synchronized boolean c(int handlerTag, int viewTag, int actionType) {
        boolean z11;
        GestureHandler gestureHandler = this.handlers.get(handlerTag);
        if (gestureHandler != null) {
            d(gestureHandler);
            gestureHandler.u0(actionType);
            k(viewTag, gestureHandler);
            z11 = true;
        } else {
            z11 = false;
        }
        return z11;
    }

    public final synchronized void f() {
        this.handlers.clear();
        this.attachedTo.clear();
        this.handlersForView.clear();
    }

    public final synchronized void g(int handlerTag) {
        GestureHandler gestureHandler = this.handlers.get(handlerTag);
        if (gestureHandler != null) {
            d(gestureHandler);
            this.handlers.remove(handlerTag);
        }
    }

    public final synchronized GestureHandler h(int handlerTag) {
        return this.handlers.get(handlerTag);
    }

    public final synchronized ArrayList<GestureHandler> i(int viewTag) {
        return this.handlersForView.get(viewTag);
    }

    public final synchronized void j(GestureHandler handler) {
        s.k(handler, "handler");
        this.handlers.put(handler.getTag(), handler);
    }
}
