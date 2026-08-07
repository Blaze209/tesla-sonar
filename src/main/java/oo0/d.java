package oo0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Loo0/d;", "T", "Loo0/e;", "Lkotlin/Function1;", "Lmo0/a;", InquiryField.FloatField.TYPE2, "", "minDigits", "maxDigits", "", "zerosToAdd", "<init>", "(Lwn0/l;IILjava/util/List;)V", "a", "Lwn0/l;", "b", "I", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<T, mo0.a> number;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minDigits;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxDigits;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> zerosToAdd;

    /* JADX WARN: Multi-variable type inference failed */
    public d(l<? super T, mo0.a> number, int i11, int i12, List<Integer> zerosToAdd) {
        s.k(number, "number");
        s.k(zerosToAdd, "zerosToAdd");
        this.number = number;
        this.minDigits = i11;
        this.maxDigits = i12;
        this.zerosToAdd = zerosToAdd;
        if (1 > i11 || i11 >= 10) {
            throw new IllegalArgumentException(("The minimum number of digits (" + i11 + ") is not in range 1..9").toString());
        }
        if (i11 > i12 || i12 >= 10) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i12 + ") is not in range " + i11 + "..9").toString());
        }
    }
}
