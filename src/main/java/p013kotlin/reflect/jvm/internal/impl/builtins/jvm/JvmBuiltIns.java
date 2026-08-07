package p013kotlin.reflect.jvm.internal.impl.builtins.jvm;

import co0.m;
import java.util.List;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.f0;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p013kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import p013kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import p013kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import p013kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p013kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import wn0.a;

/* JADX INFO: loaded from: classes9.dex */
public final class JvmBuiltIns extends KotlinBuiltIns {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final /* synthetic */ m<Object>[] f86644j = {o0.k(new f0(o0.b(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Kind f86645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a<Settings> f86646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final NotNullLazyValue f86647i;

    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
    }

    public static final class Settings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ModuleDescriptor f86648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f86649b;

        public Settings(ModuleDescriptor ownerModuleDescriptor, boolean z11) {
            s.k(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f86648a = ownerModuleDescriptor;
            this.f86649b = z11;
        }

        public final ModuleDescriptor getOwnerModuleDescriptor() {
            return this.f86648a;
        }

        public final boolean isAdditionalBuiltInsFeatureSupported() {
            return this.f86649b;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[Kind.FROM_DEPENDENCIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Kind.FROM_CLASS_LOADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Kind.FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(StorageManager storageManager, Kind kind) {
        super(storageManager);
        s.k(storageManager, "storageManager");
        s.k(kind, "kind");
        this.f86645g = kind;
        this.f86647i = storageManager.createLazyValue(new c(this, storageManager));
        int i11 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                f(false);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JvmBuiltInsCustomizer t(JvmBuiltIns jvmBuiltIns, StorageManager storageManager) {
        ModuleDescriptorImpl builtInsModule = jvmBuiltIns.getBuiltInsModule();
        s.j(builtInsModule, "getBuiltInsModule(...)");
        return new JvmBuiltInsCustomizer(builtInsModule, storageManager, new e(jvmBuiltIns));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Settings u(JvmBuiltIns jvmBuiltIns) {
        a<Settings> aVar = jvmBuiltIns.f86646h;
        if (aVar == null) {
            throw new AssertionError("JvmBuiltins instance has not been initialized properly");
        }
        Settings settingsInvoke = aVar.invoke();
        jvmBuiltIns.f86646h = null;
        return settingsInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Settings w(ModuleDescriptor moduleDescriptor, boolean z11) {
        return new Settings(moduleDescriptor, z11);
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    protected AdditionalClassPartsProvider g() {
        return getCustomizer();
    }

    public final JvmBuiltInsCustomizer getCustomizer() {
        return (JvmBuiltInsCustomizer) StorageKt.getValue(this.f86647i, this, (m<?>) f86644j[0]);
    }

    public final void initialize(ModuleDescriptor moduleDescriptor, boolean z11) {
        s.k(moduleDescriptor, "moduleDescriptor");
        setPostponedSettingsComputation(new d(moduleDescriptor, z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    protected PlatformDependentDeclarationFilter k() {
        return getCustomizer();
    }

    public final void setPostponedSettingsComputation(a<Settings> computation) {
        s.k(computation, "computation");
        this.f86646h = computation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p013kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public List<ClassDescriptorFactory> getClassDescriptorFactories() {
        Iterable<ClassDescriptorFactory> classDescriptorFactories = super.getClassDescriptorFactories();
        s.j(classDescriptorFactories, "getClassDescriptorFactories(...)");
        StorageManager storageManagerM = m();
        s.j(storageManagerM, "getStorageManager(...)");
        ModuleDescriptorImpl builtInsModule = getBuiltInsModule();
        s.j(builtInsModule, "getBuiltInsModule(...)");
        return v.O0(classDescriptorFactories, new JvmBuiltInClassDescriptorFactory(storageManagerM, builtInsModule, null, 4, null));
    }
}
