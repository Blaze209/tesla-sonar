package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.reflect.jvm.internal.impl.name.Name;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Name f86683a;

    public j(Name name) {
        this.f86683a = name;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return JvmBuiltInsCustomizer.s(this.f86683a, (MemberScope) obj);
    }
}
