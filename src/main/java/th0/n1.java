package th0;

import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lth0/n1;", "", "a", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: th0.n1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lth0/n1$a;", "", "<init>", "()V", "Lth0/o0;", "oldSelfieCameraScreenViewFactory", "Lth0/f1;", "selfieCameraScreenViewFactory", "", "La30/c0;", "a", "(Lth0/o0;Lth0/f1;)Ljava/util/Set;", "selfie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<a30.c0<?>> a(o0 oldSelfieCameraScreenViewFactory, f1 selfieCameraScreenViewFactory) {
            p013kotlin.jvm.internal.s.k(oldSelfieCameraScreenViewFactory, "oldSelfieCameraScreenViewFactory");
            p013kotlin.jvm.internal.s.k(selfieCameraScreenViewFactory, "selfieCameraScreenViewFactory");
            return p013kotlin.collections.d1.i(l1.INSTANCE, oldSelfieCameraScreenViewFactory, selfieCameraScreenViewFactory, c2.INSTANCE, p1.INSTANCE, u1.INSTANCE);
        }

        private Companion() {
        }
    }

    public static final Set<a30.c0<?>> a(o0 o0Var, f1 f1Var) {
        return INSTANCE.a(o0Var, f1Var);
    }
}
