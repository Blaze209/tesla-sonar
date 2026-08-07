package com.wix.reactnativenotifications.oem;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.WritableMap;
import lj0.a;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/wix/reactnativenotifications/oem/EmptyOemPushInterface;", "Llj0/a;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "init", "(Landroid/content/Context;)V", "", "hasOemPush", "(Landroid/content/Context;)Z", "Lcom/facebook/react/bridge/WritableMap;", "getOemDeviceInfo", "(Landroid/content/Context;)Lcom/facebook/react/bridge/WritableMap;", "deleteOemPushChannel", "react-native-notifications_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmptyOemPushInterface implements a {
    public static final EmptyOemPushInterface INSTANCE = new EmptyOemPushInterface();

    private EmptyOemPushInterface() {
    }

    public void deleteOemPushChannel(Context context) {
        s.k(context, "context");
    }

    public WritableMap getOemDeviceInfo(Context context) {
        s.k(context, "context");
        return null;
    }

    public boolean hasOemPush(Context context) {
        s.k(context, "context");
        return false;
    }

    public void init(Context context) {
        s.k(context, "context");
    }
}
