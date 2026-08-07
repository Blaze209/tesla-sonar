package com.fourthline.vision.internal;

import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.List;
import java.util.Objects;
import p013kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class V2 implements Q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T2 f38023a;

    public V2(T2 isSteadyDataSource) {
        p013kotlin.jvm.internal.s.k(isSteadyDataSource, "isSteadyDataSource");
        this.f38023a = isSteadyDataSource;
    }

    @Override // com.fourthline.vision.internal.Q2
    public /* bridge */ /* synthetic */ Object process(Object obj, Continuation continuation) {
        return process((List<? extends AbstractC4273r2>) obj, (Continuation<? super List<? extends SelfieScannerWarning>>) continuation);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void start() {
        Q2.a.start(this);
    }

    @Override // com.fourthline.vision.internal.Q2, com.fourthline.vision.internal.F5
    public void stop() {
        Q2.a.stop(this);
    }

    public Object process(List<? extends AbstractC4273r2> list, Continuation<? super List<? extends SelfieScannerWarning>> continuation) {
        if (V2.class.isAnonymousClass()) {
            String name = V2.class.getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = V2.class.getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(list);
        boolean zBooleanValue = this.f38023a.get().booleanValue();
        if (V2.class.isAnonymousClass()) {
            String name2 = V2.class.getName();
            int length3 = name2.length();
            p013kotlin.jvm.internal.s.h(name2);
            if (length3 > 23) {
                p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
            }
        } else {
            String simpleName2 = V2.class.getSimpleName();
            int length4 = simpleName2.length();
            p013kotlin.jvm.internal.s.h(simpleName2);
            if (length4 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
            }
        }
        return zBooleanValue ? p013kotlin.collections.v.m() : p013kotlin.collections.v.e(SelfieScannerWarning.DEVICE_NOT_STEADY);
    }
}
