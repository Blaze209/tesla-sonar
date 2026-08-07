package oo0;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Loo0/f;", "T", "Loo0/e;", "formatter", "Lkotlin/Function1;", "", "allSubFormatsNegative", "alwaysOutputSign", "<init>", "(Loo0/e;Lwn0/l;Z)V", "a", "Loo0/e;", "b", "Lwn0/l;", "c", "Z", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e<T> formatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<T, Boolean> allSubFormatsNegative;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean alwaysOutputSign;

    /* JADX WARN: Multi-variable type inference failed */
    public f(e<? super T> formatter, l<? super T, Boolean> allSubFormatsNegative, boolean z11) {
        s.k(formatter, "formatter");
        s.k(allSubFormatsNegative, "allSubFormatsNegative");
        this.formatter = formatter;
        this.allSubFormatsNegative = allSubFormatsNegative;
        this.alwaysOutputSign = z11;
    }
}
