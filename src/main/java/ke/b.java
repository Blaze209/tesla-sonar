package ke;

import be.AnalyticsConfiguration;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lbe/b;", "analyticsConfiguration", "Lke/c;", "b", "(Lbe/b;)Lke/c;", "components-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85957a;

        static {
            int[] iArr = new int[be.c.values().length];
            try {
                iArr[be.c.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[be.c.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f85957a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c b(AnalyticsConfiguration analyticsConfiguration) {
        be.c level = analyticsConfiguration != null ? analyticsConfiguration.getLevel() : null;
        int i11 = level == null ? -1 : a.f85957a[level.ordinal()];
        if (i11 == -1) {
            return c.ALL;
        }
        if (i11 == 1) {
            return c.ALL;
        }
        if (i11 == 2) {
            return c.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
