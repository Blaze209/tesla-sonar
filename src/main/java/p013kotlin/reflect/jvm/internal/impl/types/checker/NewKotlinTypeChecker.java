package p013kotlin.reflect.jvm.internal.impl.types.checker;

import p013kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;

/* JADX INFO: loaded from: classes9.dex */
public interface NewKotlinTypeChecker extends KotlinTypeChecker {
    public static final Companion Companion = Companion.f88965a;

    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f88965a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final NewKotlinTypeCheckerImpl f88966b = new NewKotlinTypeCheckerImpl(KotlinTypeRefiner.Default.INSTANCE, null, 2, 0 == true ? 1 : 0);

        private Companion() {
        }

        public final NewKotlinTypeCheckerImpl getDefault() {
            return f88966b;
        }
    }

    KotlinTypeRefiner getKotlinTypeRefiner();

    OverridingUtil getOverridingUtil();
}
