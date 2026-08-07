package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeCheckerState f88946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeSystemContext f88947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SimpleTypeMarker f88948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SimpleTypeMarker f88949d;

    public b(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2) {
        this.f88946a = typeCheckerState;
        this.f88947b = typeSystemContext;
        this.f88948c = simpleTypeMarker;
        this.f88949d = simpleTypeMarker2;
    }

    @Override // wn0.a
    public Object invoke() {
        return Boolean.valueOf(AbstractTypeChecker.r(this.f88946a, this.f88947b, this.f88948c, this.f88949d));
    }
}
