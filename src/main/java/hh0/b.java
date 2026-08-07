package hh0;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbh0/f;", "", "a", "(Lbh0/f;)Ljava/lang/String;", "inquiry-internal_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72808a;

        static {
            int[] iArr = new int[bh0.f.values().length];
            try {
                iArr[bh0.f.PRODUCTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bh0.f.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72808a = iArr;
        }
    }

    public static final String a(bh0.f fVar) {
        p013kotlin.jvm.internal.s.k(fVar, "<this>");
        int i11 = a.f72808a[fVar.ordinal()];
        if (i11 == 1) {
            return "production";
        }
        if (i11 == 2) {
            return "sandbox";
        }
        throw new NoWhenBranchMatchedException();
    }
}
