package yk0;

import hl0.Phase;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\r"}, d2 = {"Lyk0/b;", "Lhl0/d;", "Lyk0/c;", "Ljn0/h0;", "", "developmentMode", "<init>", "(Z)V", "g", "Z", "()Z", "h", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b extends hl0.d<c, h0> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Phase f125657i = new Phase("Before");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Phase f125658j = new Phase("State");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Phase f125659k = new Phase("After");

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean developmentMode;

    /* JADX INFO: renamed from: yk0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyk0/b$a;", "", "<init>", "()V", "Lhl0/h;", "After", "Lhl0/h;", "a", "()Lhl0/h;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Phase a() {
            return b.f125659k;
        }

        private Companion() {
        }
    }

    public b(boolean z11) {
        super(f125657i, f125658j, f125659k);
        this.developmentMode = z11;
    }

    @Override // hl0.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getDevelopmentMode() {
        return this.developmentMode;
    }
}
