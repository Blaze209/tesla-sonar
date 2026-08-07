package com.fourthline.vision.internal;

/* JADX INFO: renamed from: com.fourthline.vision.internal.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC4159b6 {
    void onFail(Object obj, EnumC4241m4 enumC4241m4, Throwable th2);

    void onMoveToNextStep();

    void onPermissionNotGranted(t6 t6Var);

    void onReset();

    void onResetCurrentStep(Object obj);

    void onStart();

    void onStepSuccess(Object obj, K5 k11);

    void onStepUpdate(Object obj);

    void onSuccess(C4275r4 c4275r4);

    void onTakeSnapshot(Object obj);
}
