package po0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lpo0/d;", "Receiver", "Lpo0/e;", "", "minLength", "maxLength", "Lpo0/a;", "Lmo0/a;", "setter", "", "name", "<init>", "(IILpo0/a;Ljava/lang/String;)V", PlaceTypes.STORAGE, "", "input", "start", "end", "Lpo0/g;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lpo0/g;", "c", "I", DateTokenConverter.CONVERTER_KEY, "e", "Lpo0/a;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d<Receiver> extends e<Receiver> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int maxLength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a<Receiver, mo0.a> setter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(int i11, int i12, a<? super Receiver, mo0.a> setter, String name) {
        super(i11 == i12 ? Integer.valueOf(i11) : null, name, null);
        p013kotlin.jvm.internal.s.k(setter, "setter");
        p013kotlin.jvm.internal.s.k(name, "name");
        this.minLength = i11;
        this.maxLength = i12;
        this.setter = setter;
        if (1 > i11 || i11 >= 10) {
            throw new IllegalArgumentException(("Invalid minimum length " + i11 + " for field " + getWhatThisExpects() + ": expected 1..9").toString());
        }
        if (i11 > i12 || i12 >= 10) {
            throw new IllegalArgumentException(("Invalid maximum length " + i12 + " for field " + getWhatThisExpects() + ": expected " + i11 + "..9").toString());
        }
    }

    @Override // po0.e
    public g a(Receiver storage, CharSequence input, int start, int end) {
        p013kotlin.jvm.internal.s.k(input, "input");
        int i11 = end - start;
        int i12 = this.minLength;
        if (i11 < i12) {
            return new g.c(i12);
        }
        int i13 = this.maxLength;
        return i11 > i13 ? new g.d(i13) : f.f(this.setter, storage, new mo0.a(f.d(input, start, end), i11));
    }
}
