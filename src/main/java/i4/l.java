package i4;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Li4/d$c;", "Li4/w;", "", "start", "end", "b", "(Ljava/util/List;II)Ljava/util/List;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<d.Range<Placeholder>> b(List<d.Range<Placeholder>> list, int i11, int i12) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            d.Range<Placeholder> range = list.get(i13);
            d.Range<Placeholder> range2 = range;
            if (e.l(i11, i12, range2.f(), range2.d())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i14 = 0; i14 < size2; i14++) {
            d.Range range3 = (d.Range) arrayList.get(i14);
            if (i11 > range3.f() || range3.d() > i12) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new d.Range(range3.e(), range3.f() - i11, range3.d() - i11));
        }
        return arrayList2;
    }
}
