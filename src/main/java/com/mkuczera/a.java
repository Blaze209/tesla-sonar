package com.mkuczera;

import android.content.Context;
import android.media.AudioManager;
import android.os.Vibrator;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static boolean a(Context context) {
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        AudioManager audioManager = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        return (vibrator != null && vibrator.hasVibrator()) && ((audioManager.getRingerMode() != 0) || (audioManager.getRingerMode() == 1));
    }

    public static void b(ReactApplicationContext reactApplicationContext, String str, ReadableMap readableMap) {
        boolean z11 = readableMap.getBoolean("ignoreAndroidSystemSettings");
        boolean zA = a(reactApplicationContext);
        if (z11 || zA) {
            Vibrator vibrator = (Vibrator) reactApplicationContext.getSystemService("vibrator");
            cz.a aVarA = cz.b.a(str);
            if (vibrator == null || aVarA == null) {
                return;
            }
            aVarA.a(vibrator);
        }
    }
}
