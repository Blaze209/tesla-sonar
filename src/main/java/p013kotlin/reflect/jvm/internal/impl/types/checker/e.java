package p013kotlin.reflect.jvm.internal.impl.types.checker;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes9.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KotlinType f88978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f88979b;

    public e(KotlinType type, e eVar) {
        s.k(type, "type");
        this.f88978a = type;
        this.f88979b = eVar;
    }

    public final e a() {
        return this.f88979b;
    }

    public final KotlinType b() {
        return this.f88978a;
    }
}
