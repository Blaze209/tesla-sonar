package com.tesla.godot;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.tesla.logging.g;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
class TMGodotViewModule extends ReactContextBaseJavaModule implements TMGodot.Listener {
    private static final String TAG = "TMGodotViewModule";
    private final g logger;

    TMGodotViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.logger = g.h(TAG);
        TMGodot.setListener(this);
    }

    private synchronized void sendQueuedMessages() {
        try {
            Iterator<String> it = TMGodot.getQueuedMessages().iterator();
            while (it.hasNext()) {
                TMGodot.sendMessageToGodot(it.next());
            }
            TMGodot.clearQueuedMessages();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "GodotModule";
    }

    @Override // com.tesla.godot.TMGodot.Listener
    public void onGodotReady() {
        sendQueuedMessages();
    }

    @ReactMethod
    public void sendMessageToGodot(String str) {
        TMGodot.queueMessage(str);
        if (TMGodot.godotReady()) {
            sendQueuedMessages();
        }
    }
}
