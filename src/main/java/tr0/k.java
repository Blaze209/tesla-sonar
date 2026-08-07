package tr0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00052\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ltr0/k;", "Lkotlin/Function0;", "", "<init>", "()V", "a", "Ltr0/a;", "Ltr0/c;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class k implements wn0.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: tr0.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ltr0/k$a;", "", "<init>", "()V", "", "mode", "Ltr0/j;", "replaceData", "Ltr0/k;", "a", "(Ljava/lang/String;Ltr0/j;)Ltr0/k;", "operations-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String mode, ReplaceData replaceData) {
            p013kotlin.jvm.internal.s.k(mode, "mode");
            p013kotlin.jvm.internal.s.k(replaceData, "replaceData");
            if (p013kotlin.jvm.internal.s.f(mode, "all")) {
                return new a(replaceData);
            }
            if (p013kotlin.text.t.x(mode) != null) {
                return new c(replaceData, Integer.parseInt(mode));
            }
            throw new IllegalArgumentException(mode);
        }

        private Companion() {
        }
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private k() {
    }
}
