package androidx.compose.ui.window;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/window/t;", "", "isSecureFlagSetOnParent", "a", "(Landroidx/compose/ui/window/t;Z)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6422a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6422a = iArr;
        }
    }

    public static final boolean a(t tVar, boolean z11) {
        int i11 = a.f6422a[tVar.ordinal()];
        if (i11 == 1) {
            return false;
        }
        if (i11 == 2) {
            return true;
        }
        if (i11 == 3) {
            return z11;
        }
        throw new NoWhenBranchMatchedException();
    }
}
