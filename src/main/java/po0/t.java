package po0;

import com.google.android.libraries.places.api.model.PlaceTypes;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, d2 = {"Lpo0/t;", "Output", "Lpo0/n;", "Lkotlin/Function1;", "Ljn0/h0;", "operation", "<init>", "(Lwn0/l;)V", PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lpo0/j;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "Lwn0/l;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class t<Output> implements n<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Output, h0> operation;

    /* JADX WARN: Multi-variable type inference failed */
    public t(wn0.l<? super Output, h0> operation) {
        p013kotlin.jvm.internal.s.k(operation, "operation");
        this.operation = operation;
    }

    @Override // po0.n
    public Object a(Output storage, CharSequence input, int startIndex) {
        p013kotlin.jvm.internal.s.k(input, "input");
        this.operation.invoke(storage);
        return j.INSTANCE.b(startIndex);
    }
}
