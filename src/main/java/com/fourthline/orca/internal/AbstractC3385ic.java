package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3385ic {
    public static final List a(InterfaceC3299gc interfaceC3299gc) {
        X7 x11;
        X7 x12;
        p013kotlin.jvm.internal.s.k(interfaceC3299gc, "<this>");
        ArrayList arrayList = new ArrayList();
        List listB = interfaceC3299gc.b();
        if (!(listB instanceof Collection) || !listB.isEmpty()) {
            Iterator it = listB.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(DocumentType.PASSPORT);
                    break;
                }
            } while (((X7) it.next()).c() != DocumentType.PASSPORT);
        } else {
            arrayList.add(DocumentType.PASSPORT);
            break;
        }
        List listB2 = interfaceC3299gc.b();
        if (!(listB2 instanceof Collection) || !listB2.isEmpty()) {
            Iterator it2 = listB2.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList.add(DocumentType.ID_CARD);
                    break;
                }
                x11 = (X7) it2.next();
                if (x11.c() == DocumentType.ID_CARD) {
                    break;
                }
            } while (x11.c() != DocumentType.FRENCH_ID_CARD);
        } else {
            arrayList.add(DocumentType.ID_CARD);
            break;
        }
        List listB3 = interfaceC3299gc.b();
        if (!(listB3 instanceof Collection) || !listB3.isEmpty()) {
            Iterator it3 = listB3.iterator();
            do {
                if (!it3.hasNext()) {
                    arrayList.add(DocumentType.DRIVERS_LICENSE);
                    break;
                }
                x12 = (X7) it3.next();
                if (x12.c() == DocumentType.DRIVERS_LICENSE) {
                    break;
                }
            } while (x12.c() != DocumentType.DUTCH_DRIVERS_LICENSE);
        } else {
            arrayList.add(DocumentType.DRIVERS_LICENSE);
            break;
        }
        List listB4 = interfaceC3299gc.b();
        if (!(listB4 instanceof Collection) || !listB4.isEmpty()) {
            Iterator it4 = listB4.iterator();
            while (it4.hasNext()) {
                if (((X7) it4.next()).c() == DocumentType.RESIDENCE_PERMIT) {
                    return arrayList;
                }
            }
        }
        arrayList.add(DocumentType.RESIDENCE_PERMIT);
        return arrayList;
    }
}
