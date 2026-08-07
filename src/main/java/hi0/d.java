package hi0;

import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhi0/c;", "", "a", "(Lhi0/c;)Ljava/lang/String;", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72903a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.ROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.PRECISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72903a = iArr;
        }
    }

    public static final String a(c cVar) {
        s.k(cVar, "<this>");
        int i11 = a.f72903a[cVar.ordinal()];
        if (i11 == 1) {
            return "rough";
        }
        if (i11 == 2) {
            return "precise";
        }
        throw new NoWhenBranchMatchedException();
    }
}
