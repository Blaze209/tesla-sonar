package no0;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: no0.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lno0/c;", "T", "Lno0/s;", "Lno0/o;", "mainFormat", "", "formats", "<init>", "(Lno0/o;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lpo0/p;", "b", "()Lpo0/p;", "Loo0/e;", "a", "()Loo0/e;", "Lno0/o;", DateTokenConverter.CONVERTER_KEY, "()Lno0/o;", "Ljava/util/List;", "c", "()Ljava/util/List;", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AlternativesParsing<T> implements s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o<T> mainFormat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<o<T>> formats;

    /* JADX WARN: Multi-variable type inference failed */
    public AlternativesParsing(o<? super T> mainFormat, List<? extends o<? super T>> formats) {
        p013kotlin.jvm.internal.s.k(mainFormat, "mainFormat");
        p013kotlin.jvm.internal.s.k(formats, "formats");
        this.mainFormat = mainFormat;
        this.formats = formats;
    }

    @Override // no0.o
    public oo0.e<T> a() {
        return this.mainFormat.a();
    }

    @Override // no0.o
    public po0.p<T> b() {
        List listM = p013kotlin.collections.v.m();
        List listC = p013kotlin.collections.v.c();
        listC.add(this.mainFormat.b());
        Iterator<o<T>> it = this.formats.iterator();
        while (it.hasNext()) {
            listC.add(it.next().b());
        }
        return new po0.p<>(listM, p013kotlin.collections.v.a(listC));
    }

    public final List<o<T>> c() {
        return this.formats;
    }

    public final o<T> d() {
        return this.mainFormat;
    }

    public boolean equals(Object other) {
        if (!(other instanceof AlternativesParsing)) {
            return false;
        }
        AlternativesParsing alternativesParsing = (AlternativesParsing) other;
        return p013kotlin.jvm.internal.s.f(this.mainFormat, alternativesParsing.mainFormat) && p013kotlin.jvm.internal.s.f(this.formats, alternativesParsing.formats);
    }

    public int hashCode() {
        return (this.mainFormat.hashCode() * 31) + this.formats.hashCode();
    }

    public String toString() {
        return "AlternativesParsing(" + this.formats + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
