package com.fourthline.orca.internal;

/* JADX INFO: renamed from: com.fourthline.orca.internal.eD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3208eD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wn0.a f31365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f31366b;

    public C3208eD(wn0.a useCase) {
        p013kotlin.jvm.internal.s.k(useCase, "useCase");
        this.f31365a = useCase;
    }

    public boolean a(boolean z11) {
        Boolean bool = this.f31366b;
        if (!z11 && bool != null) {
            return bool.booleanValue();
        }
        Boolean bool2 = (Boolean) this.f31365a.invoke();
        bool2.getClass();
        this.f31366b = bool2;
        return bool2.booleanValue();
    }
}
