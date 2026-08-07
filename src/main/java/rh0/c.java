package rh0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0010\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00068F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\b\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lrh0/c;", "", "<init>", "()V", "Ljn0/h0;", "f", "", "a", "Z", "c", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "isSandboxModeEnabled", "Lrh0/c$b;", "value", "b", "Lrh0/c$b;", "()Lrh0/c$b;", "debugForcedStatus", "e", "simulateGovIdNfc", "sandbox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean isSandboxModeEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b debugForcedStatus = b.Passed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean simulateGovIdNfc = true;

    /* JADX INFO: renamed from: rh0.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrh0/c$a;", "", "<init>", "()V", "Lrh0/c$b;", "", "a", "(Lrh0/c$b;)Ljava/lang/String;", "sandbox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: rh0.c$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class C2300a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f108262a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.Failed.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.Passed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f108262a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(b bVar) {
            s.k(bVar, "<this>");
            int i11 = C2300a.f108262a[bVar.ordinal()];
            if (i11 == 1) {
                return "failed";
            }
            if (i11 == 2) {
                return "passed";
            }
            throw new NoWhenBranchMatchedException();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lrh0/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "Failed", "Passed", "sandbox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum b {
        Failed,
        Passed;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<b> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: renamed from: rh0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C2301c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f108263a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Failed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Passed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f108263a = iArr;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getDebugForcedStatus() {
        return this.debugForcedStatus;
    }

    public final boolean b() {
        return this.isSandboxModeEnabled && this.simulateGovIdNfc;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSandboxModeEnabled() {
        return this.isSandboxModeEnabled;
    }

    public final void d(boolean z11) {
        this.isSandboxModeEnabled = z11;
    }

    public final void e(boolean z11) {
        this.simulateGovIdNfc = z11;
    }

    public final void f() {
        b bVar;
        int i11 = C2301c.f108263a[this.debugForcedStatus.ordinal()];
        if (i11 == 1) {
            bVar = b.Passed;
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = b.Failed;
        }
        this.debugForcedStatus = bVar;
    }
}
