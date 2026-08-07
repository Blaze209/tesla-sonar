package com.fourthline.orca.internal;

import java.util.Objects;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Lazy;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3520lk implements Is {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f33338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f33339b;

    public C3520lk(final Eh initialStateProvider) {
        p013kotlin.jvm.internal.s.k(initialStateProvider, "initialStateProvider");
        this.f33338a = jn0.m.b(new wn0.a() { // from class: com.fourthline.orca.internal.s61
            @Override // wn0.a
            public final Object invoke() {
                return C3520lk.a(initialStateProvider);
            }
        });
        this.f33339b = C3520lk.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableStateFlow a(Eh eh2) {
        return StateFlowKt.MutableStateFlow(eh2.getInitialState());
    }

    @Override // com.fourthline.orca.internal.Is
    public QD a() {
        return (QD) b().getValue();
    }

    @Override // com.fourthline.orca.internal.Is
    public MutableStateFlow b() {
        return (MutableStateFlow) this.f33338a.getValue();
    }

    @Override // com.fourthline.orca.internal.Is
    public void a(wn0.l stateProvider) {
        p013kotlin.jvm.internal.s.k(stateProvider, "stateProvider");
        QD qd2 = (QD) b().getValue();
        QD qd3 = (QD) stateProvider.invoke(qd2);
        Objects.toString(qd2);
        Objects.toString(qd3);
        if (p013kotlin.jvm.internal.s.f(qd2, qd3)) {
            return;
        }
        b().setValue(qd3);
    }
}
