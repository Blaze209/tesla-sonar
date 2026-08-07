package th0;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "Lth0/d2;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;)Lth0/d2;", "selfie_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class e2 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113872a;

        static {
            int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
            try {
                iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f113872a = iArr;
        }
    }

    public static final d2 a(NextStep.Selfie.CaptureMethod captureMethod) {
        p013kotlin.jvm.internal.s.k(captureMethod, "<this>");
        int i11 = a.f113872a[captureMethod.ordinal()];
        if (i11 == 1) {
            return d2.a.f113622a;
        }
        if (i11 == 2) {
            return d2.c.f113624a;
        }
        if (i11 == 3) {
            return d2.b.f113623a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
