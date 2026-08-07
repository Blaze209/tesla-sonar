package p013kotlin.reflect.jvm.internal.impl.types.checker;

/* JADX INFO: loaded from: classes9.dex */
public abstract class TypeRefinementSupport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f88971a;

    public static final class Enabled extends TypeRefinementSupport {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final KotlinTypeRefiner f88972b;

        public final KotlinTypeRefiner getTypeRefiner() {
            return this.f88972b;
        }
    }

    public final boolean isEnabled() {
        return this.f88971a;
    }
}
