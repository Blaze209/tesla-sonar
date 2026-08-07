package p013kotlin.reflect.jvm.internal.impl.resolve.scopes;

import p013kotlin.reflect.jvm.internal.impl.name.Name;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f88541a = new c();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(MemberScope.Companion.a((Name) obj));
    }
}
