package wg0;

import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import zf0.ImageIdMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwg0/a;", "Lzf0/g0;", "newFrame", "b", "(Lwg0/a;Lzf0/g0;)Lwg0/a;", "", "a", "(Lwg0/a;)Z", "government-id_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class b {
    public static final boolean a(AutocaptureState autocaptureState) {
        s.k(autocaptureState, "<this>");
        if (autocaptureState.b().size() < 3) {
            return false;
        }
        Iterator<T> it = autocaptureState.b().iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((ImageIdMetadata) it.next()).getTextOnImage().length();
        }
        double size = ((double) length) / ((double) autocaptureState.b().size());
        double length2 = 0.0d;
        for (ImageIdMetadata imageIdMetadata : autocaptureState.b()) {
            length2 += (((double) imageIdMetadata.getTextOnImage().length()) - size) * (((double) imageIdMetadata.getTextOnImage().length()) - size);
        }
        return Math.sqrt(length2 / ((double) autocaptureState.b().size())) / size < 0.05d;
    }

    public static final AutocaptureState b(AutocaptureState autocaptureState, ImageIdMetadata newFrame) {
        s.k(autocaptureState, "<this>");
        s.k(newFrame, "newFrame");
        return autocaptureState.a(v.Q0(v.e1(autocaptureState.b(), 2), newFrame));
    }
}
