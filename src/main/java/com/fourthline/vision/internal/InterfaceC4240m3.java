package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import java.net.URI;
import p013kotlin.coroutines.Continuation;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.vision.internal.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4240m3 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.m3$a */
    public enum a {
        NONE,
        VIDEO,
        VIDEO_AUDIO;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f38562e = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return f38562e;
        }
    }

    Object cancel(Continuation<? super jn0.h0> continuation);

    C4298v getVideoRecorder();

    void setVideoRecorder(C4298v c4298v);

    Try<jn0.h0> start();

    Object stop(Continuation<? super Try<URI>> continuation);
}
