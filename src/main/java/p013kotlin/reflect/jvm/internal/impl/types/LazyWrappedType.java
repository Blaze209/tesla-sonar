package p013kotlin.reflect.jvm.internal.impl.types;

import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p013kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public final class LazyWrappedType extends WrappedType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StorageManager f88895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a<KotlinType> f88896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue<KotlinType> f88897d;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(StorageManager storageManager, a<? extends KotlinType> computation) {
        s.k(storageManager, "storageManager");
        s.k(computation, "computation");
        this.f88895b = storageManager;
        this.f88896c = computation;
        this.f88897d = storageManager.createLazyValue(computation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KotlinType d(KotlinTypeRefiner kotlinTypeRefiner, LazyWrappedType lazyWrappedType) {
        return kotlinTypeRefiner.refineType((KotlinTypeMarker) lazyWrappedType.f88896c.invoke());
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.WrappedType
    protected KotlinType b() {
        return (KotlinType) this.f88897d.invoke();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.WrappedType
    public boolean isComputed() {
        return this.f88897d.isComputed();
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.types.KotlinType
    public LazyWrappedType refine(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new LazyWrappedType(this.f88895b, new p(kotlinTypeRefiner, this));
    }
}
