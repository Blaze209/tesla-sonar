package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4258p0 extends J5 {

    /* JADX INFO: renamed from: com.fourthline.vision.internal.p0$a */
    public static final class a {
        public static <SCANNER_STEP> void start(InterfaceC4258p0 interfaceC4258p0) {
            J5.a.start(interfaceC4258p0);
        }

        public static <SCANNER_STEP> void stop(InterfaceC4258p0 interfaceC4258p0) {
            J5.a.stop(interfaceC4258p0);
        }
    }

    @Override // com.fourthline.vision.internal.J5
    /* synthetic */ I5 getStepConfig();

    int getStepsCount();

    void moveToNext();

    void reset();

    void resetStep();
}
