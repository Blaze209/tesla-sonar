package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class o implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f87376a = new o();

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(LazyJavaClassMemberScope.n0((JavaMember) obj));
    }
}
