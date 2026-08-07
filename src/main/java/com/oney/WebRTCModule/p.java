package com.oney.WebRTCModule;

import org.webrtc.Logging;
import org.webrtc.NativeLibraryLoader;

/* JADX INFO: loaded from: classes6.dex */
public class p implements NativeLibraryLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f46046a = "LibraryLoader";

    @Override // org.webrtc.NativeLibraryLoader
    public boolean load(String str) {
        Logging.d(f46046a, "Loading library: " + str);
        System.loadLibrary(str);
        return true;
    }
}
