package p013kotlin.reflect.jvm.internal.impl.resolve;

import p013kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SmartSet f88488a;

    public f(SmartSet smartSet) {
        this.f88488a = smartSet;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return OverridingUtilsKt.b(this.f88488a, obj);
    }
}
