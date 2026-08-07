package com.mrousavy.camera.frameprocessors;

import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@in.a
public class FrameProcessorPluginRegistry {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Map<String, a> Plugins = new HashMap();
    private static final String TAG = "FrameProcessorPluginRegistry";

    public interface a {
        @NonNull
        FrameProcessorPlugin a(@NonNull VisionCameraProxy visionCameraProxy, Map<String, Object> map);
    }

    @Keep
    @in.a
    public static void addFrameProcessorPlugin(String str, a aVar) {
        Plugins.put(str, aVar);
        Log.i(TAG, "Successfully registered Frame Processor Plugin \"" + str + "\"!");
    }

    @Keep
    @in.a
    public static FrameProcessorPlugin getPlugin(String str, VisionCameraProxy visionCameraProxy, Map<String, Object> map) {
        Log.i(TAG, "Looking up Frame Processor Plugin \"" + str + "\"...");
        a aVar = Plugins.get(str);
        if (aVar == null) {
            Log.i(TAG, "Frame Processor Plugin \"" + str + "\" does not exist!");
            return null;
        }
        Log.i(TAG, "Frame Processor Plugin \"" + str + "\" found! Initializing...");
        return aVar.a(visionCameraProxy, map);
    }
}
