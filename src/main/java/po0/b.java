package po0;

import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpo0/b;", "Receiver", "Lpo0/e;", "", "expected", "<init>", "(Ljava/lang/String;)V", PlaceTypes.STORAGE, "", "input", "", "start", "end", "Lpo0/g;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lpo0/g;", "c", "Ljava/lang/String;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b<Receiver> extends e<Receiver> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String expected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String expected) {
        super(Integer.valueOf(expected.length()), "the predefined string " + expected, null);
        p013kotlin.jvm.internal.s.k(expected, "expected");
        this.expected = expected;
    }

    @Override // po0.e
    public g a(Receiver storage, CharSequence input, int start, int end) {
        p013kotlin.jvm.internal.s.k(input, "input");
        if (p013kotlin.jvm.internal.s.f(input.subSequence(start, end).toString(), this.expected)) {
            return null;
        }
        return new g.e(this.expected);
    }
}
