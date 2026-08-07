package po0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002BA\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lpo0/u;", "Receiver", "Lpo0/e;", "", "minLength", "maxLength", "Lpo0/a;", "setter", "", "name", "", "multiplyByMinus1", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Lpo0/a;Ljava/lang/String;Z)V", PlaceTypes.STORAGE, "", "input", "start", "end", "Lpo0/g;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;II)Lpo0/g;", "c", "Ljava/lang/Integer;", DateTokenConverter.CONVERTER_KEY, "e", "Lpo0/a;", "f", "Z", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class u<Receiver> extends e<Receiver> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer minLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer maxLength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a<Receiver, Integer> setter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean multiplyByMinus1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(Integer num, Integer num2, a<? super Receiver, Integer> setter, String name, boolean z11) {
        super(p013kotlin.jvm.internal.s.f(num, num2) ? num : null, name, null);
        p013kotlin.jvm.internal.s.k(setter, "setter");
        p013kotlin.jvm.internal.s.k(name, "name");
        this.minLength = num;
        this.maxLength = num2;
        this.setter = setter;
        this.multiplyByMinus1 = z11;
        if (getLength() == null || new bo0.j(1, 9).c(getLength().intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + getWhatThisExpects() + ": " + getLength()).toString());
    }

    @Override // po0.e
    public g a(Receiver storage, CharSequence input, int start, int end) {
        p013kotlin.jvm.internal.s.k(input, "input");
        Integer num = this.maxLength;
        if (num != null && end - start > num.intValue()) {
            return new g.d(this.maxLength.intValue());
        }
        Integer num2 = this.minLength;
        if (num2 != null && end - start < num2.intValue()) {
            return new g.c(this.minLength.intValue());
        }
        Integer numE = f.e(input, start, end);
        if (numE == null) {
            return g.b.f103484a;
        }
        a<Receiver, Integer> aVar = this.setter;
        boolean z11 = this.multiplyByMinus1;
        int iIntValue = numE.intValue();
        if (z11) {
            iIntValue = -iIntValue;
        }
        return f.f(aVar, storage, Integer.valueOf(iIntValue));
    }
}
