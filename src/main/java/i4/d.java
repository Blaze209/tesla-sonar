package i4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 D2\u00020\u0001:\u0003\u0014=AB[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rB=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u0004¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001f\u0010 J1\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%J%\u0010'\u001a\u00020&2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b'\u0010(J)\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J)\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b,\u0010*J+\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011H\u0007¢\u0006\u0004\b.\u0010*J)\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00050\u00042\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b0\u0010*J\u001d\u00101\u001a\u00020&2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0011¢\u0006\u0004\b1\u00102J\u001a\u00103\u001a\u00020&2\b\u0010\u001e\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0011H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0002H\u0016¢\u0006\u0004\b7\u00108J\u0015\u00109\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u0000¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010;\u001a\u0004\b<\u00108R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R(\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010>\u001a\u0004\bB\u0010@R*\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010>\u001a\u0004\b=\u0010@R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048F¢\u0006\u0006\u001a\u0004\bC\u0010@R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00048F¢\u0006\u0006\u001a\u0004\bD\u0010@R\u0014\u0010E\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u00106\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Li4/d;", "", "", "text", "", "Li4/d$c;", "Li4/d0;", "spanStylesOrNull", "Li4/u;", "paragraphStylesOrNull", "", "annotations", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "spanStyles", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "", "index", "", "a", "(I)C", "startIndex", "endIndex", "r", "(II)Li4/d;", "Li4/p0;", "range", "s", "(J)Li4/d;", "other", "q", "(Li4/d;)Li4/d;", "tag", "start", "end", "j", "(Ljava/lang/String;II)Ljava/util/List;", "", "p", "(Ljava/lang/String;II)Z", IntegerTokenConverter.CONVERTER_KEY, "(II)Ljava/util/List;", "Li4/t0;", "l", "Li4/u0;", "m", "Li4/h;", DateTokenConverter.CONVERTER_KEY, "o", "(II)Z", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "n", "(Li4/d;)Z", "Ljava/lang/String;", "k", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "c", "f", "g", "e", "length", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d implements CharSequence {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a3.j<d, ?> f75670f = c0.h();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Range<SpanStyle>> spanStylesOrNull;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Range<? extends Object>> annotations;

    /* JADX INFO: renamed from: i4.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C1579d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(Integer.valueOf(((Range) t11).f()), Integer.valueOf(((Range) t12).f()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2, List<? extends Range<? extends Object>> list3) {
        List listA1;
        this.text = str;
        this.spanStylesOrNull = list;
        this.paragraphStylesOrNull = list2;
        this.annotations = list3;
        if (list2 == null || (listA1 = p013kotlin.collections.v.a1(list2, new C1579d())) == null) {
            return;
        }
        int size = listA1.size();
        int iD = -1;
        for (int i11 = 0; i11 < size; i11++) {
            Range range = (Range) listA1.get(i11);
            if (range.f() < iD) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap");
            }
            if (range.d() > this.text.length()) {
                throw new IllegalArgumentException(("ParagraphStyle range [" + range.f() + ", " + range.d() + ") is out of boundary").toString());
            }
            iD = range.d();
        }
    }

    public char a(int index) {
        return this.text.charAt(index);
    }

    public final List<Range<? extends Object>> b() {
        return this.annotations;
    }

    public int c() {
        return this.text.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return a(i11);
    }

    public final List<Range<h>> d(int start, int end) {
        List listM;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Range<? extends Object> range = list.get(i11);
                Range<? extends Object> range2 = range;
                if ((range2.e() instanceof h) && e.l(start, end, range2.f(), range2.d())) {
                    listM.add(range);
                }
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        p013kotlin.jvm.internal.s.i(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listM;
    }

    public final List<Range<ParagraphStyle>> e() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? p013kotlin.collections.v.m() : list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return p013kotlin.jvm.internal.s.f(this.text, dVar.text) && p013kotlin.jvm.internal.s.f(this.spanStylesOrNull, dVar.spanStylesOrNull) && p013kotlin.jvm.internal.s.f(this.paragraphStylesOrNull, dVar.paragraphStylesOrNull) && p013kotlin.jvm.internal.s.f(this.annotations, dVar.annotations);
    }

    public final List<Range<ParagraphStyle>> f() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> g() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? p013kotlin.collections.v.m() : list;
    }

    public final List<Range<SpanStyle>> h() {
        return this.spanStylesOrNull;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Range<ParagraphStyle>> list2 = this.paragraphStylesOrNull;
        int iHashCode3 = (iHashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Range<? extends Object>> list3 = this.annotations;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    public final List<Range<String>> i(int start, int end) {
        List listM;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Range<? extends Object> range = list.get(i11);
                Range<? extends Object> range2 = range;
                if ((range2.e() instanceof String) && e.l(start, end, range2.f(), range2.d())) {
                    listM.add(range);
                }
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        p013kotlin.jvm.internal.s.i(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listM;
    }

    public final List<Range<String>> j(String tag, int start, int end) {
        List listM;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Range<? extends Object> range = list.get(i11);
                Range<? extends Object> range2 = range;
                if ((range2.e() instanceof String) && p013kotlin.jvm.internal.s.f(tag, range2.getTag()) && e.l(start, end, range2.f(), range2.d())) {
                    listM.add(range);
                }
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        p013kotlin.jvm.internal.s.i(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return listM;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<Range<t0>> l(int start, int end) {
        List listM;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Range<? extends Object> range = list.get(i11);
                Range<? extends Object> range2 = range;
                if ((range2.e() instanceof t0) && e.l(start, end, range2.f(), range2.d())) {
                    listM.add(range);
                }
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        p013kotlin.jvm.internal.s.i(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listM;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @jn0.e
    public final List<Range<UrlAnnotation>> m(int start, int end) {
        List listM;
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            listM = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Range<? extends Object> range = list.get(i11);
                Range<? extends Object> range2 = range;
                if ((range2.e() instanceof UrlAnnotation) && e.l(start, end, range2.f(), range2.d())) {
                    listM.add(range);
                }
            }
        } else {
            listM = p013kotlin.collections.v.m();
        }
        p013kotlin.jvm.internal.s.i(listM, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listM;
    }

    public final boolean n(d other) {
        return p013kotlin.jvm.internal.s.f(this.annotations, other.annotations);
    }

    public final boolean o(int start, int end) {
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Range<? extends Object> range = list.get(i11);
                if ((range.e() instanceof h) && e.l(start, end, range.f(), range.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean p(String tag, int start, int end) {
        List<Range<? extends Object>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                Range<? extends Object> range = list.get(i11);
                if ((range.e() instanceof String) && p013kotlin.jvm.internal.s.f(tag, range.getTag()) && e.l(start, end, range.f(), range.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final d q(d other) {
        a aVar = new a(this);
        aVar.g(other);
        return aVar.o();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public d subSequence(int startIndex, int endIndex) {
        if (startIndex <= endIndex) {
            if (startIndex == 0 && endIndex == this.text.length()) {
                return this;
            }
            String strSubstring = this.text.substring(startIndex, endIndex);
            p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new d(strSubstring, e.h(this.spanStylesOrNull, startIndex, endIndex), e.h(this.paragraphStylesOrNull, startIndex, endIndex), e.h(this.annotations, startIndex, endIndex));
        }
        throw new IllegalArgumentException(("start (" + startIndex + ") should be less or equal to end (" + endIndex + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final d s(long range) {
        return subSequence(p0.l(range), p0.k(range));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    /* JADX INFO: renamed from: i4.d$c, reason: from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0012¨\u0006\u001f"}, d2 = {"Li4/d$c;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "a", "()Ljava/lang/Object;", "b", "()I", "c", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "e", "I", "f", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "g", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Range<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final T item;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int start;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int end;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tag;

        public Range(T t11, int i11, int i12, String str) {
            this.item = t11;
            this.start = i11;
            this.end = i12;
            this.tag = str;
            if (i11 > i12) {
                throw new IllegalArgumentException("Reversed range is not supported");
            }
        }

        public final T a() {
            return this.item;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        public final int d() {
            return this.end;
        }

        public final T e() {
            return this.item;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return p013kotlin.jvm.internal.s.f(this.item, range.item) && this.start == range.start && this.end == range.end && p013kotlin.jvm.internal.s.f(this.tag, range.tag);
        }

        public final int f() {
            return this.start;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            T t11 = this.item;
            return ((((((t11 == null ? 0 : t11.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public Range(T t11, int i11, int i12) {
            this(t11, i11, i12, "");
        }
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001%B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\tJ%\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J-\u0010%\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020 ¢\u0006\u0004\b)\u0010*J\u001d\u0010+\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u0003¢\u0006\u0004\b0\u0010\u0006J\r\u00101\u001a\u00020\u0007¢\u0006\u0004\b1\u00102R\u0018\u0010\b\u001a\u000603j\u0002`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00105R \u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c07068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u00108R \u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 07068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00108R\"\u0010<\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020;07068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00108R\"\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020;07068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108¨\u0006>"}, d2 = {"Li4/d$a;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "Li4/d;", "text", "(Li4/d;)V", "", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)V", "", "e", "(Ljava/lang/CharSequence;)Li4/d$a;", "start", "end", "f", "(Ljava/lang/CharSequence;II)Li4/d$a;", "", "char", DateTokenConverter.CONVERTER_KEY, "(C)Li4/d$a;", "g", "h", "(Li4/d;II)V", "Li4/d0;", "style", "c", "(Li4/d0;II)V", "Li4/u;", "b", "(Li4/u;II)V", "tag", "annotation", "a", "(Ljava/lang/String;Ljava/lang/String;II)V", "n", "(Li4/d0;)I", "m", "(Li4/u;)I", "l", "(Ljava/lang/String;Ljava/lang/String;)I", "j", "()V", "index", "k", "o", "()Li4/d;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "Li4/d$a$a;", "Ljava/util/List;", "spanStyles", "paragraphStyles", "", "annotations", "styleStack", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Appendable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final StringBuilder text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<SpanStyle>> spanStyles;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<ParagraphStyle>> paragraphStyles;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<? extends Object>> annotations;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List<MutableRange<? extends Object>> styleStack;

        public a(int i11) {
            this.text = new StringBuilder(i11);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public final void a(String tag, String annotation, int start, int end) {
            this.annotations.add(new MutableRange<>(annotation, start, end, tag));
        }

        public final void b(ParagraphStyle style, int start, int end) {
            this.paragraphStyles.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        public final void c(SpanStyle style, int start, int end) {
            this.spanStyles.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a append(char c11) {
            this.text.append(c11);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a append(CharSequence text) {
            if (text instanceof d) {
                g((d) text);
                return this;
            }
            this.text.append(text);
            return this;
        }

        @Override // java.lang.Appendable
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a append(CharSequence text, int start, int end) {
            if (text instanceof d) {
                h((d) text, start, end);
                return this;
            }
            this.text.append(text, start, end);
            return this;
        }

        public final void g(d text) {
            int length = this.text.length();
            this.text.append(text.getText());
            List<Range<SpanStyle>> listH = text.h();
            if (listH != null) {
                int size = listH.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Range<SpanStyle> range = listH.get(i11);
                    c(range.e(), range.f() + length, range.d() + length);
                }
            }
            List<Range<ParagraphStyle>> listF = text.f();
            if (listF != null) {
                int size2 = listF.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Range<ParagraphStyle> range2 = listF.get(i12);
                    b(range2.e(), range2.f() + length, range2.d() + length);
                }
            }
            List<Range<? extends Object>> listB = text.b();
            if (listB != null) {
                int size3 = listB.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    Range<? extends Object> range3 = listB.get(i13);
                    this.annotations.add(new MutableRange<>(range3.e(), range3.f() + length, range3.d() + length, range3.getTag()));
                }
            }
        }

        public final void h(d text, int start, int end) {
            int length = this.text.length();
            this.text.append((CharSequence) text.getText(), start, end);
            List listK = e.k(text, start, end);
            if (listK != null) {
                int size = listK.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Range range = (Range) listK.get(i11);
                    c((SpanStyle) range.e(), range.f() + length, range.d() + length);
                }
            }
            List listJ = e.j(text, start, end);
            if (listJ != null) {
                int size2 = listJ.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Range range2 = (Range) listJ.get(i12);
                    b((ParagraphStyle) range2.e(), range2.f() + length, range2.d() + length);
                }
            }
            List listI = e.i(text, start, end);
            if (listI != null) {
                int size3 = listI.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    Range range3 = (Range) listI.get(i13);
                    this.annotations.add(new MutableRange<>(range3.e(), range3.f() + length, range3.d() + length, range3.getTag()));
                }
            }
        }

        public final void i(String text) {
            this.text.append(text);
        }

        public final void j() {
            if (this.styleStack.isEmpty()) {
                throw new IllegalStateException("Nothing to pop.");
            }
            List<MutableRange<? extends Object>> list = this.styleStack;
            list.remove(list.size() - 1).a(this.text.length());
        }

        public final void k(int index) {
            if (index < this.styleStack.size()) {
                while (this.styleStack.size() - 1 >= index) {
                    j();
                }
            } else {
                throw new IllegalStateException((index + " should be less than " + this.styleStack.size()).toString());
            }
        }

        public final int l(String tag, String annotation) {
            MutableRange<? extends Object> mutableRange = new MutableRange<>(annotation, this.text.length(), 0, tag, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int m(ParagraphStyle style) {
            MutableRange<ParagraphStyle> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.paragraphStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int n(SpanStyle style) {
            MutableRange<SpanStyle> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.spanStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final d o() {
            String string = this.text.toString();
            List<MutableRange<SpanStyle>> list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(list.get(i11).b(this.text.length()));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<MutableRange<ParagraphStyle>> list2 = this.paragraphStyles;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(list2.get(i12).b(this.text.length()));
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            List<MutableRange<? extends Object>> list3 = this.annotations;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                arrayList3.add(list3.get(i13).b(this.text.length()));
            }
            return new d(string, arrayList, arrayList2, arrayList3.isEmpty() ? null : arrayList3);
        }

        /* JADX INFO: renamed from: i4.d$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012\"\u0004\b\u0017\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Li4/d$a$a;", "T", "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "Li4/d$c;", "b", "(I)Li4/d$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "I", "getStart", "c", "getEnd", "(I)V", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getTag", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private static final /* data */ class MutableRange<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final T item;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int start;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private int end;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String tag;

            public MutableRange(T t11, int i11, int i12, String str) {
                this.item = t11;
                this.start = i11;
                this.end = i12;
                this.tag = str;
            }

            public final void a(int i11) {
                this.end = i11;
            }

            public final Range<T> b(int defaultEnd) {
                int i11 = this.end;
                if (i11 != Integer.MIN_VALUE) {
                    defaultEnd = i11;
                }
                if (defaultEnd != Integer.MIN_VALUE) {
                    return new Range<>(this.item, this.start, defaultEnd, this.tag);
                }
                throw new IllegalStateException("Item.end should be set first");
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return p013kotlin.jvm.internal.s.f(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && p013kotlin.jvm.internal.s.f(this.tag, mutableRange.tag);
            }

            public int hashCode() {
                T t11 = this.item;
                return ((((((t11 == null ? 0 : t11.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            public /* synthetic */ MutableRange(Object obj, int i11, int i12, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i11, (i13 & 4) != 0 ? Integer.MIN_VALUE : i12, (i13 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ a(int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 16 : i11);
        }

        public a(d dVar) {
            this(0, 1, null);
            g(dVar);
        }
    }

    public /* synthetic */ d(String str, List list, List list2, List list3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : list2, (i11 & 8) != 0 ? null : list3);
    }

    public /* synthetic */ d(String str, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? p013kotlin.collections.v.m() : list, (i11 & 4) != 0 ? p013kotlin.collections.v.m() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        List<Range<SpanStyle>> list3 = list;
        List<Range<ParagraphStyle>> list4 = list2;
        this(str, list3.isEmpty() ? null : list3, list4.isEmpty() ? null : list4, null);
    }
}
