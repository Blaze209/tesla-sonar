package com.fourthline.vision.internal;

import java.io.File;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: renamed from: com.fourthline.vision.internal.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4226k3 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.k3$a */
    public enum a {
        VIDEO,
        AUDIO;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f38507d = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return f38507d;
        }
    }

    File createResultFile(a aVar);

    File createTempFile(a aVar);

    void deleteTempFiles();
}
