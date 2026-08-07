package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4227k4 extends InterfaceC4234l4 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.k4$a */
    public static final class a {
        public static <SCANNER_CONFIG> boolean getShouldStartAutomatically(InterfaceC4227k4 interfaceC4227k4) {
            return true;
        }
    }

    Object config();

    @Override // com.fourthline.vision.internal.InterfaceC4234l4
    /* synthetic */ C4165c4 contentDetectionArea();

    boolean getShouldStartAutomatically();
}
