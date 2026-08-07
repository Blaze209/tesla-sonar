package p014n4;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Ln4/a0;", "", "<init>", "()V", "", "Ln4/p;", "fontList", "Ln4/f0;", "fontWeight", "Ln4/b0;", "fontStyle", "a", "(Ljava/util/List;Ln4/f0;I)Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 {
    public final List<p> a(List<? extends p> fontList, FontWeight fontWeight, int fontStyle) {
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            p pVar = fontList.get(i12);
            p pVar2 = pVar;
            if (s.f(pVar2.a(), fontWeight) && b0.f(pVar2.c(), fontStyle)) {
                arrayList.add(pVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            p pVar3 = fontList.get(i13);
            if (b0.f(pVar3.c(), fontStyle)) {
                arrayList2.add(pVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        List<? extends p> list = fontList;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.f()) < 0) {
            int size3 = list.size();
            FontWeight fontWeight3 = null;
            for (int i14 = 0; i14 < size3; i14++) {
                FontWeight fontWeightA = list.get(i14).a();
                if (fontWeightA.compareTo(fontWeight) >= 0) {
                    if (fontWeightA.compareTo(fontWeight) <= 0) {
                        fontWeight3 = fontWeightA;
                        fontWeight2 = fontWeight3;
                        break;
                    }
                    if (fontWeight3 == null || fontWeightA.compareTo(fontWeight3) < 0) {
                        fontWeight3 = fontWeightA;
                    }
                } else if (fontWeight2 == null || fontWeightA.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightA;
                }
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i11 < size4) {
                p pVar4 = list.get(i11);
                if (s.f(pVar4.a(), fontWeight3)) {
                    arrayList3.add(pVar4);
                }
                i11++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.g()) > 0) {
            int size5 = list.size();
            FontWeight fontWeight4 = null;
            for (int i15 = 0; i15 < size5; i15++) {
                FontWeight fontWeightA2 = list.get(i15).a();
                if (fontWeightA2.compareTo(fontWeight) >= 0) {
                    if (fontWeightA2.compareTo(fontWeight) <= 0) {
                        fontWeight4 = fontWeightA2;
                        fontWeight2 = fontWeight4;
                        break;
                    }
                    if (fontWeight4 == null || fontWeightA2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = fontWeightA2;
                    }
                } else if (fontWeight2 == null || fontWeightA2.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightA2;
                }
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i11 < size6) {
                p pVar5 = list.get(i11);
                if (s.f(pVar5.a(), fontWeight4)) {
                    arrayList4.add(pVar5);
                }
                i11++;
            }
            return arrayList4;
        }
        FontWeight fontWeightG = companion.g();
        int size7 = list.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        for (int i16 = 0; i16 < size7; i16++) {
            FontWeight fontWeightA3 = list.get(i16).a();
            if (fontWeightG == null || fontWeightA3.compareTo(fontWeightG) <= 0) {
                if (fontWeightA3.compareTo(fontWeight) >= 0) {
                    if (fontWeightA3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = fontWeightA3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || fontWeightA3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = fontWeightA3;
                    }
                } else if (fontWeight5 == null || fontWeightA3.compareTo(fontWeight5) > 0) {
                    fontWeight5 = fontWeightA3;
                }
            }
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size8 = list.size();
        for (int i17 = 0; i17 < size8; i17++) {
            p pVar6 = list.get(i17);
            if (s.f(pVar6.a(), fontWeight5)) {
                arrayList5.add(pVar6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight fontWeightG2 = FontWeight.INSTANCE.g();
        int size9 = list.size();
        FontWeight fontWeight7 = null;
        for (int i18 = 0; i18 < size9; i18++) {
            FontWeight fontWeightA4 = list.get(i18).a();
            if (fontWeightG2 == null || fontWeightA4.compareTo(fontWeightG2) >= 0) {
                if (fontWeightA4.compareTo(fontWeight) >= 0) {
                    if (fontWeightA4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = fontWeightA4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || fontWeightA4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = fontWeightA4;
                    }
                } else if (fontWeight2 == null || fontWeightA4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = fontWeightA4;
                }
            }
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size10 = list.size();
        while (i11 < size10) {
            p pVar7 = list.get(i11);
            if (s.f(pVar7.a(), fontWeight2)) {
                arrayList6.add(pVar7);
            }
            i11++;
        }
        return arrayList6;
    }
}
