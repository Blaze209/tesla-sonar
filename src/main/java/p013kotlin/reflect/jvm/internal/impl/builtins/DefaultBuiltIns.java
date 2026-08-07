package p013kotlin.reflect.jvm.internal.impl.builtins;

import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Lazy<DefaultBuiltIns> f86553g = m.b(b.f86589a);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DefaultBuiltIns getInstance() {
            return (DefaultBuiltIns) DefaultBuiltIns.f86553g.getValue();
        }

        private Companion() {
        }
    }

    public DefaultBuiltIns() {
        this(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultBuiltIns q() {
        return new DefaultBuiltIns(false, 1, null);
    }

    public DefaultBuiltIns(boolean z11) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z11) {
            f(false);
        }
    }

    public /* synthetic */ DefaultBuiltIns(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}
