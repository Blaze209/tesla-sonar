package bh0;

import com.withpersona.sdk2.inquiry.network.dto.CheckInquiryResponse;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;", "Lbh0/j2;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;)Lbh0/j2;", "inquiry-internal_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class k2 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17284a;

        static {
            int[] iArr = new int[CheckInquiryResponse.PollingMode.values().length];
            try {
                iArr[CheckInquiryResponse.PollingMode.Blocking.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CheckInquiryResponse.PollingMode.Background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CheckInquiryResponse.PollingMode.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17284a = iArr;
        }
    }

    public static final j2 a(CheckInquiryResponse.PollingMode pollingMode) {
        p013kotlin.jvm.internal.s.k(pollingMode, "<this>");
        int i11 = a.f17284a[pollingMode.ordinal()];
        if (i11 == 1) {
            return j2.Blocking;
        }
        if (i11 == 2) {
            return j2.Background;
        }
        if (i11 == 3) {
            return j2.Blocking;
        }
        throw new NoWhenBranchMatchedException();
    }
}
