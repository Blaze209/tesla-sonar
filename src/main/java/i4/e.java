package i4;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\r\u001a'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u000b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\f\u001a3\u0010\u000f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\f\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aK\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00122\u0016\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010!\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0000¢\u0006\u0004\b!\u0010\u001c\u001a\u000f\u0010\"\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Li4/d;", "Li4/u;", "defaultParagraphStyle", "", "Li4/d$c;", "m", "(Li4/d;Li4/u;)Ljava/util/List;", "", "start", "end", "Li4/d0;", "k", "(Li4/d;II)Ljava/util/List;", "j", "", IntegerTokenConverter.CONVERTER_KEY, "n", "(Li4/d;II)Li4/d;", "T", "ranges", "h", "(Ljava/util/List;II)Ljava/util/List;", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "f", "(IIII)Z", "lStart", "lEnd", "rStart", "rEnd", "l", "g", "()Li4/d;", "a", "Li4/d;", "EmptyAnnotatedString", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d f75704a = new d("", null, null, 6, null);

    public static final boolean f(int i11, int i12, int i13, int i14) {
        if (i11 <= i13 && i14 <= i12) {
            if (i12 == i14) {
                if ((i13 == i14) == (i11 == i12)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final d g() {
        return f75704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<d.Range<T>> h(List<? extends d.Range<? extends T>> list, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException(("start (" + i11 + ") should be less than or equal to end (" + i12 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            d.Range<? extends T> range = list.get(i13);
            d.Range<? extends T> range2 = range;
            if (l(i11, i12, range2.f(), range2.d())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            d.Range range3 = (d.Range) arrayList.get(i14);
            arrayList2.add(new d.Range(range3.e(), Math.max(i11, range3.f()) - i11, Math.min(i12, range3.d()) - i11, range3.getTag()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<d.Range<? extends Object>> i(d dVar, int i11, int i12) {
        List<d.Range<? extends Object>> listB;
        if (i11 == i12 || (listB = dVar.b()) == null) {
            return null;
        }
        if (i11 == 0 && i12 >= dVar.getText().length()) {
            return listB;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i13 = 0; i13 < size; i13++) {
            d.Range<? extends Object> range = listB.get(i13);
            d.Range<? extends Object> range2 = range;
            if (l(i11, i12, range2.f(), range2.d())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            d.Range range3 = (d.Range) arrayList.get(i14);
            arrayList2.add(new d.Range(range3.e(), bo0.n.n(range3.f(), i11, i12) - i11, bo0.n.n(range3.d(), i11, i12) - i11, range3.getTag()));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<d.Range<ParagraphStyle>> j(d dVar, int i11, int i12) {
        List<d.Range<ParagraphStyle>> listF;
        if (i11 == i12 || (listF = dVar.f()) == null) {
            return null;
        }
        if (i11 == 0 && i12 >= dVar.getText().length()) {
            return listF;
        }
        ArrayList arrayList = new ArrayList(listF.size());
        int size = listF.size();
        for (int i13 = 0; i13 < size; i13++) {
            d.Range<ParagraphStyle> range = listF.get(i13);
            d.Range<ParagraphStyle> range2 = range;
            if (l(i11, i12, range2.f(), range2.d())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            d.Range range3 = (d.Range) arrayList.get(i14);
            arrayList2.add(new d.Range(range3.e(), bo0.n.n(range3.f(), i11, i12) - i11, bo0.n.n(range3.d(), i11, i12) - i11));
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<d.Range<SpanStyle>> k(d dVar, int i11, int i12) {
        List<d.Range<SpanStyle>> listH;
        if (i11 == i12 || (listH = dVar.h()) == null) {
            return null;
        }
        if (i11 == 0 && i12 >= dVar.getText().length()) {
            return listH;
        }
        ArrayList arrayList = new ArrayList(listH.size());
        int size = listH.size();
        for (int i13 = 0; i13 < size; i13++) {
            d.Range<SpanStyle> range = listH.get(i13);
            d.Range<SpanStyle> range2 = range;
            if (l(i11, i12, range2.f(), range2.d())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            d.Range range3 = (d.Range) arrayList.get(i14);
            arrayList2.add(new d.Range(range3.e(), bo0.n.n(range3.f(), i11, i12) - i11, bo0.n.n(range3.d(), i11, i12) - i11));
        }
        return arrayList2;
    }

    public static final boolean l(int i11, int i12, int i13, int i14) {
        return Math.max(i11, i13) < Math.min(i12, i14) || f(i11, i12, i13, i14) || f(i13, i14, i11, i12);
    }

    public static final List<d.Range<ParagraphStyle>> m(d dVar, ParagraphStyle uVar) {
        int length = dVar.getText().length();
        List<d.Range<ParagraphStyle>> listF = dVar.f();
        if (listF == null) {
            listF = p013kotlin.collections.v.m();
        }
        ArrayList arrayList = new ArrayList();
        int size = listF.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            d.Range<ParagraphStyle> range = listF.get(i11);
            ParagraphStyle uVarA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            if (start != i12) {
                arrayList.add(new d.Range(uVar, i12, start));
            }
            arrayList.add(new d.Range(uVar.l(uVarA), start, end));
            i11++;
            i12 = end;
        }
        if (i12 != length) {
            arrayList.add(new d.Range(uVar, i12, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new d.Range(uVar, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d n(d dVar, int i11, int i12) {
        String strSubstring;
        if (i11 != i12) {
            strSubstring = dVar.getText().substring(i11, i12);
            p013kotlin.jvm.internal.s.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new d(strSubstring, k(dVar, i11, i12), null, null, 12, null);
    }
}
