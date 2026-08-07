package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p013kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes9.dex */
final class FallbackBuiltIns extends KotlinBuiltIns {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Companion f86616g = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final KotlinBuiltIns f86617h = new FallbackBuiltIns();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KotlinBuiltIns getInstance() {
            return FallbackBuiltIns.f86617h;
        }

        private Companion() {
        }
    }

    private FallbackBuiltIns() {
        super(new LockBasedStorageManager("FallbackBuiltIns"));
        f(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PlatformDependentDeclarationFilter.All k() {
        return PlatformDependentDeclarationFilter.All.INSTANCE;
    }
}
