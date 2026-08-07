package com.facebook.react.bridge;

import android.view.View;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u0007\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\b\u0010\tJE\u0010\u000e\u001a\u00020\u0007\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H'¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H'¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&¢\u0006\u0004\b\u001d\u0010\u001fJ!\u0010\"\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010 H'¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H&¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H&¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H&¢\u0006\u0004\b+\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b,\u0010-J)\u00100\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b0\u00101J1\u00100\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b0\u00102J\u0019\u00103\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020\nH'¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0011H&¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0011H&¢\u0006\u0004\b7\u00106J\u001f\u00108\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b8\u0010&J\u001f\u00109\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H&¢\u0006\u0004\b9\u0010&R\u0014\u0010=\u001a\u00020:8&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006>À\u0006\u0001"}, d2 = {"Lcom/facebook/react/bridge/UIManager;", "Lcom/facebook/react/bridge/PerformanceCounter;", "Landroid/view/View;", "T", "rootView", "Lcom/facebook/react/bridge/WritableMap;", "initialProps", "", "addRootView", "(Landroid/view/View;Lcom/facebook/react/bridge/WritableMap;)I", "", "moduleName", "widthMeasureSpec", "heightMeasureSpec", "startSurface", "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)I", "surfaceId", "Ljn0/h0;", "stopSurface", "(I)V", "rootTag", "offsetX", "offsetY", "updateRootLayoutSpecs", "(IIIII)V", "reactTag", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "commandArgs", "dispatchCommand", "(IILcom/facebook/react/bridge/ReadableArray;)V", "(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/bridge/ReadableMap;", "props", "synchronouslyUpdateViewOnUIThread", "(ILcom/facebook/react/bridge/ReadableMap;)V", "eventType", "sendAccessibilityEvent", "(II)V", "Lcom/facebook/react/bridge/UIManagerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addUIManagerEventListener", "(Lcom/facebook/react/bridge/UIManagerListener;)V", "removeUIManagerEventListener", "resolveView", "(I)Landroid/view/View;", "eventName", "event", "receiveEvent", "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V", "resolveCustomDirectEventName", "(Ljava/lang/String;)Ljava/lang/String;", "initialize", "()V", "invalidate", "markActiveTouchForTag", "sweepActiveTouchForTag", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UIManager extends PerformanceCounter {
    @jn0.e
    <T extends View> int addRootView(T rootView, WritableMap initialProps);

    void addUIManagerEventListener(UIManagerListener listener);

    void dispatchCommand(int reactTag, int commandId, ReadableArray commandArgs);

    void dispatchCommand(int reactTag, String commandId, ReadableArray commandArgs);

    EventDispatcher getEventDispatcher();

    void initialize();

    void invalidate();

    void markActiveTouchForTag(int surfaceId, int reactTag);

    void receiveEvent(int surfaceId, int reactTag, String eventName, WritableMap event);

    @jn0.e
    void receiveEvent(int reactTag, String eventName, WritableMap event);

    void removeUIManagerEventListener(UIManagerListener listener);

    @jn0.e
    String resolveCustomDirectEventName(String eventName);

    View resolveView(int reactTag);

    void sendAccessibilityEvent(int reactTag, int eventType);

    <T extends View> int startSurface(T rootView, String moduleName, WritableMap initialProps, int widthMeasureSpec, int heightMeasureSpec);

    void stopSurface(int surfaceId);

    void sweepActiveTouchForTag(int surfaceId, int reactTag);

    void synchronouslyUpdateViewOnUIThread(int reactTag, ReadableMap props);

    void updateRootLayoutSpecs(int rootTag, int widthMeasureSpec, int heightMeasureSpec, int offsetX, int offsetY);
}
