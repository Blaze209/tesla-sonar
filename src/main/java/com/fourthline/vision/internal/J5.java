package com.fourthline.vision.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface J5 extends Q2, InterfaceC4237m0, F5 {

    public static final class a {
        public static <SCANNER_STEP> void start(J5 j11) {
            Q2.a.start(j11);
        }

        public static <SCANNER_STEP> void stop(J5 j11) {
            Q2.a.stop(j11);
        }
    }

    I5 getStepConfig();

    @Override // com.fourthline.vision.internal.InterfaceC4237m0
    /* synthetic */ boolean isCompleted();

    @Override // com.fourthline.vision.internal.Q2
    /* synthetic */ Object process(Object obj, Continuation continuation);

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    /* synthetic */ void start();

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    /* synthetic */ void stop();
}
