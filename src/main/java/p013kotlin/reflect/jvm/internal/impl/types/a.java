package p013kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import p013kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import p013kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f88942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypeCheckerState f88943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TypeSystemContext f88944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SimpleTypeMarker f88945d;

    public a(Collection collection, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, SimpleTypeMarker simpleTypeMarker) {
        this.f88942a = collection;
        this.f88943b = typeCheckerState;
        this.f88944c = typeSystemContext;
        this.f88945d = simpleTypeMarker;
    }

    @Override // wn0.l
    public Object invoke(Object obj) {
        return AbstractTypeChecker.q(this.f88942a, this.f88943b, this.f88944c, this.f88945d, (TypeCheckerState.ForkPointContext) obj);
    }
}
