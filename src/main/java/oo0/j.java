package oo0;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Loo0/j;", "T", "Loo0/e;", "Lkotlin/Function1;", "", InquiryField.FloatField.TYPE2, "zeroPadding", "<init>", "(Lwn0/l;I)V", "a", "Lwn0/l;", "b", "I", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class j<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<T, Integer> number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int zeroPadding;

    /* JADX WARN: Multi-variable type inference failed */
    public j(l<? super T, Integer> number, int i11) {
        s.k(number, "number");
        this.number = number;
        this.zeroPadding = i11;
        if (i11 < 0) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i11 + ") is negative").toString());
        }
        if (i11 <= 9) {
            return;
        }
        throw new IllegalArgumentException(("The minimum number of digits (" + i11 + ") exceeds the length of an Int").toString());
    }
}
