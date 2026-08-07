package com.fourthline.vision.internal;

import com.fourthline.core.internal.Try;
import java.util.Objects;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.fourthline.vision.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4168d implements InterfaceC4205h4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4159b6 f38205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f38207c;

    public AbstractC4168d(InterfaceC4159b6 analytics) {
        p013kotlin.jvm.internal.s.k(analytics, "analytics");
        this.f38205a = analytics;
        this.f38206b = true;
    }

    protected final Object getCurrentStep() {
        return this.f38207c;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4205h4
    public boolean getScannerLevelCallbacksAllowed() {
        return this.f38206b;
    }

    @Override // com.fourthline.vision.internal.InterfaceC4205h4
    public void onMoveToNextStep() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        this.f38205a.onMoveToNextStep();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4205h4
    public void onResetCurrentStep(Object obj) {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(obj);
        this.f38205a.onResetCurrentStep(obj);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4205h4
    public void onScannerResult(Try<? extends C4275r4> result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(result);
        Object obj = this.f38207c;
        if (obj != null) {
            if (result instanceof Try.Failure) {
                Throwable exception = ((Try.Failure) result).getException();
                if (exception instanceof AbstractC4255o4.a) {
                    this.f38205a.onFail(obj, ((AbstractC4255o4.a) exception).getError(), exception);
                    return;
                }
                return;
            }
            if (!(result instanceof Try.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f38205a.onSuccess((C4275r4) ((Try.Success) result).getValue());
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4205h4
    public void onStart() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        this.f38205a.onStart();
    }

    @Override // com.fourthline.vision.internal.InterfaceC4205h4
    public void onStepResult(Try<? extends K5> result) {
        p013kotlin.jvm.internal.s.k(result, "result");
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(result);
        Object obj = this.f38207c;
        if (obj != null) {
            if (result instanceof Try.Failure) {
                Throwable exception = ((Try.Failure) result).getException();
                if (exception instanceof AbstractC4255o4.a) {
                    this.f38205a.onFail(obj, ((AbstractC4255o4.a) exception).getError(), exception);
                    return;
                }
                return;
            }
            if (!(result instanceof Try.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            this.f38205a.onStepSuccess(obj, (K5) ((Try.Success) result).getValue());
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4205h4
    public void onStepUpdate(Object obj) {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Objects.toString(obj);
        this.f38207c = obj;
        this.f38205a.onStepUpdate(obj);
    }

    @Override // com.fourthline.vision.internal.InterfaceC4205h4
    public void onStepsSizeUpdate(int i11) {
    }

    @Override // com.fourthline.vision.internal.InterfaceC4205h4
    public void onTakeSnapshot() {
        if (getClass().isAnonymousClass()) {
            String name = getClass().getName();
            int length = name.length();
            p013kotlin.jvm.internal.s.h(name);
            if (length > 23) {
                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
            }
        } else {
            String simpleName = getClass().getSimpleName();
            int length2 = simpleName.length();
            p013kotlin.jvm.internal.s.h(simpleName);
            if (length2 > 23) {
                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
            }
        }
        Object obj = this.f38207c;
        if (obj != null) {
            this.f38205a.onTakeSnapshot(obj);
        }
    }

    @Override // com.fourthline.vision.internal.InterfaceC4205h4
    public void reset() {
        this.f38205a.onReset();
        setScannerLevelCallbacksAllowed(true);
        this.f38207c = null;
    }

    protected final void setCurrentStep(Object obj) {
        this.f38207c = obj;
    }

    public void setScannerLevelCallbacksAllowed(boolean z11) {
        this.f38206b = z11;
    }
}
