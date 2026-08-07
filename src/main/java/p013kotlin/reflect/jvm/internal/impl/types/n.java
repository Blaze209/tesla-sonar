package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeConstructor f89019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f89020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TypeAttributes f89021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f89022d;

    public n(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z11) {
        this.f89019a = typeConstructor;
        this.f89020b = list;
        this.f89021c = typeAttributes;
        this.f89022d = z11;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return KotlinTypeFactory.e(this.f89019a, this.f89020b, this.f89021c, this.f89022d, (KotlinTypeRefiner) obj);
    }
}
