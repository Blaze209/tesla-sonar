package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class o implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeConstructor f89023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f89024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TypeAttributes f89025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f89026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MemberScope f89027e;

    public o(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z11, MemberScope memberScope) {
        this.f89023a = typeConstructor;
        this.f89024b = list;
        this.f89025c = typeAttributes;
        this.f89026d = z11;
        this.f89027e = memberScope;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return KotlinTypeFactory.f(this.f89023a, this.f89024b, this.f89025c, this.f89026d, this.f89027e, (KotlinTypeRefiner) obj);
    }
}
