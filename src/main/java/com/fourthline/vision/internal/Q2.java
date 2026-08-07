package com.fourthline.vision.internal;

import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public interface Q2 extends F5 {

    public static final class a {
        public static <IN, OUT> void start(Q2 q11) {
        }

        public static <IN, OUT> void stop(Q2 q11) {
        }
    }

    Object process(Object obj, Continuation<Object> continuation);

    @Override // com.fourthline.vision.internal.F5
    void start();

    @Override // com.fourthline.vision.internal.F5
    void stop();
}
