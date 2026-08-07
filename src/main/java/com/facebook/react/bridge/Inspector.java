package com.facebook.react.bridge;

import ch.qos.logback.core.CoreConstants;
import com.facebook.jni.HybridData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@in.a
public class Inspector {
    private final HybridData mHybridData;

    @in.a
    public static class LocalConnection {
        private final HybridData mHybridData;

        private LocalConnection(HybridData hybridData) {
            this.mHybridData = hybridData;
        }

        public native void disconnect();

        public native void sendMessage(String str);
    }

    @in.a
    public static class Page {
        private final int mId;
        private final String mTitle;
        private final String mVM;

        @in.a
        private Page(int i11, String str, String str2) {
            this.mId = i11;
            this.mTitle = str;
            this.mVM = str2;
        }

        public int getId() {
            return this.mId;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public String getVM() {
            return this.mVM;
        }

        public String toString() {
            return "Page{mId=" + this.mId + ", mTitle='" + this.mTitle + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
        }
    }

    @in.a
    public interface RemoteConnection {
        @in.a
        void onDisconnect();

        @in.a
        void onMessage(String str);
    }

    static {
        ReactBridge.staticInit();
    }

    private Inspector(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public static LocalConnection connect(int i11, RemoteConnection remoteConnection) {
        try {
            LocalConnection localConnectionConnectNative = instance().connectNative(i11, remoteConnection);
            if (localConnectionConnectNative != null) {
                return localConnectionConnectNative;
            }
            throw new IllegalStateException("Can't open failed connection");
        } catch (UnsatisfiedLinkError e11) {
            qk.a.n("ReactNative", "Inspector doesn't work in open source yet", e11);
            throw new RuntimeException(e11);
        }
    }

    private native LocalConnection connectNative(int i11, RemoteConnection remoteConnection);

    public static List<Page> getPages() {
        try {
            return Arrays.asList(instance().getPagesNative());
        } catch (UnsatisfiedLinkError e11) {
            qk.a.n("ReactNative", "Inspector doesn't work in open source yet", e11);
            return Collections.EMPTY_LIST;
        }
    }

    private native Page[] getPagesNative();

    private static native Inspector instance();
}
