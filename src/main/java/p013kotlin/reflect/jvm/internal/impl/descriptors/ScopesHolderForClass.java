package p013kotlin.reflect.jvm.internal.impl.descriptors;

import co0.m;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p013kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p013kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p013kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
public final class ScopesHolderForClass<T extends MemberScope> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ClassDescriptor f86715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l<KotlinTypeRefiner, T> f86716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final KotlinTypeRefiner f86717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final NotNullLazyValue f86718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f86714e = {o0.k(new f0(o0.b(ScopesHolderForClass.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends MemberScope> ScopesHolderForClass<T> create(ClassDescriptor classDescriptor, StorageManager storageManager, KotlinTypeRefiner kotlinTypeRefinerForOwnerModule, l<? super KotlinTypeRefiner, ? extends T> scopeFactory) {
            s.k(classDescriptor, "classDescriptor");
            s.k(storageManager, "storageManager");
            s.k(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
            s.k(scopeFactory, "scopeFactory");
            return new ScopesHolderForClass<>(classDescriptor, storageManager, scopeFactory, kotlinTypeRefinerForOwnerModule, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, l lVar, KotlinTypeRefiner kotlinTypeRefiner, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, storageManager, lVar, kotlinTypeRefiner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope c(ScopesHolderForClass scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        return scopesHolderForClass.f86716b.invoke(kotlinTypeRefiner);
    }

    private final T d() {
        return (T) StorageKt.getValue(this.f86718d, this, (m<?>) f86714e[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MemberScope e(ScopesHolderForClass scopesHolderForClass) {
        return scopesHolderForClass.f86716b.invoke(scopesHolderForClass.f86717c);
    }

    public final T getScope(KotlinTypeRefiner kotlinTypeRefiner) {
        s.k(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (!kotlinTypeRefiner.isRefinementNeededForModule(DescriptorUtilsKt.getModule(this.f86715a))) {
            return (T) d();
        }
        TypeConstructor typeConstructor = this.f86715a.getTypeConstructor();
        s.j(typeConstructor, "getTypeConstructor(...)");
        return !kotlinTypeRefiner.isRefinementNeededForTypeConstructor(typeConstructor) ? (T) d() : (T) kotlinTypeRefiner.getOrPutScopeForClass(this.f86715a, new h(this, kotlinTypeRefiner));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ScopesHolderForClass(ClassDescriptor classDescriptor, StorageManager storageManager, l<? super KotlinTypeRefiner, ? extends T> lVar, KotlinTypeRefiner kotlinTypeRefiner) {
        this.f86715a = classDescriptor;
        this.f86716b = lVar;
        this.f86717c = kotlinTypeRefiner;
        this.f86718d = storageManager.createLazyValue(new g(this));
    }
}
