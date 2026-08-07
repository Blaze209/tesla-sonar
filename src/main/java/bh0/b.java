package bh0;

import com.withpersona.sdk2.inquiry.internal.network.CreateInquirySessionResponse;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;", "Lhi0/a;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsCollectionRequirement;)Lhi0/a;", "Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;", "Lhi0/e;", "b", "(Lcom/withpersona/sdk2/inquiry/internal/network/CreateInquirySessionResponse$GpsPrecisionRequirement;)Lhi0/e;", "inquiry-internal_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f17185b;

        static {
            int[] iArr = new int[CreateInquirySessionResponse.GpsCollectionRequirement.values().length];
            try {
                iArr[CreateInquirySessionResponse.GpsCollectionRequirement.REQUIRE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateInquirySessionResponse.GpsCollectionRequirement.OPTIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreateInquirySessionResponse.GpsCollectionRequirement.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f17184a = iArr;
            int[] iArr2 = new int[CreateInquirySessionResponse.GpsPrecisionRequirement.values().length];
            try {
                iArr2[CreateInquirySessionResponse.GpsPrecisionRequirement.PRECISE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CreateInquirySessionResponse.GpsPrecisionRequirement.ROUGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f17185b = iArr2;
        }
    }

    public static final hi0.a a(CreateInquirySessionResponse.GpsCollectionRequirement gpsCollectionRequirement) {
        p013kotlin.jvm.internal.s.k(gpsCollectionRequirement, "<this>");
        int i11 = a.f17184a[gpsCollectionRequirement.ordinal()];
        if (i11 == 1) {
            return hi0.a.REQUIRED;
        }
        if (i11 == 2) {
            return hi0.a.OPTIONAL;
        }
        if (i11 == 3) {
            return hi0.a.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final hi0.e b(CreateInquirySessionResponse.GpsPrecisionRequirement gpsPrecisionRequirement) {
        p013kotlin.jvm.internal.s.k(gpsPrecisionRequirement, "<this>");
        int i11 = a.f17185b[gpsPrecisionRequirement.ordinal()];
        if (i11 == 1) {
            return hi0.e.PRECISE;
        }
        if (i11 == 2) {
            return hi0.e.ROUGH;
        }
        throw new NoWhenBranchMatchedException();
    }
}
