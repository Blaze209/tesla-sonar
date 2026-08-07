package p013kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import p013kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassDeclaredMemberIndex f87343a;

    public a(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        this.f87343a = classDeclaredMemberIndex;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return Boolean.valueOf(ClassDeclaredMemberIndex.b(this.f87343a, (JavaMethod) obj));
    }
}
