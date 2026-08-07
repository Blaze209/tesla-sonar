package pg0;

import com.withpersona.sdk2.inquiry.governmentid.RawExtraction;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzf0/g;", "Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "a", "(Lzf0/g;)Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class r4 {
    public static final RawExtraction a(zf0.g gVar) {
        p013kotlin.jvm.internal.s.k(gVar, "<this>");
        if (gVar instanceof zf0.g.MrzBarcodeInfo) {
            return new RawExtraction("mrz", ((zf0.g.MrzBarcodeInfo) gVar).getExtractionRawPayload());
        }
        if (gVar instanceof zf0.g.Pdf417BarcodeInfo) {
            return new RawExtraction("pdf417", ((zf0.g.Pdf417BarcodeInfo) gVar).getExtractionRawPayload());
        }
        throw new NoWhenBranchMatchedException();
    }
}
