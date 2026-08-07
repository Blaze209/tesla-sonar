package wk0;

import hl0.Phase;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Lwk0/h;", "Lhl0/d;", "", "Lwk0/c;", "", "developmentMode", "<init>", "(Z)V", "g", "Z", "()Z", "h", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h extends hl0.d<Object, c> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Phase f122021i = new Phase("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Phase f122022j = new Phase("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Phase f122023k = new Phase("Monitoring");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Phase f122024l = new Phase("Engine");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Phase f122025m = new Phase("Receive");

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean developmentMode;

    /* JADX INFO: renamed from: wk0.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lwk0/h$a;", "", "<init>", "()V", "Lhl0/h;", "Engine", "Lhl0/h;", "a", "()Lhl0/h;", "Receive", "b", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Phase a() {
            return h.f122024l;
        }

        public final Phase b() {
            return h.f122025m;
        }

        private Companion() {
        }
    }

    public h(boolean z11) {
        super(f122021i, f122022j, f122023k, f122024l, f122025m);
        this.developmentMode = z11;
    }

    @Override // hl0.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }
}
