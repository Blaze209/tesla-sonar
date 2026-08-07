package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.fourthline.orca.internal.lv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3531lv implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3361hv f33449a;

    public C3531lv(String title, InterfaceC3732qh imageServiceLocator) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(imageServiceLocator, "imageServiceLocator");
        QA.d dVarA = QA.a.a(QA.f27433a, R.string.shared_button_close, 0, 2, null);
        this.f33449a = new C3361hv(title, p013kotlin.collections.v.m(), dVarA, imageServiceLocator.a(EnumC3689ph.V0), imageServiceLocator.a(EnumC3689ph.U0));
    }

    public final wn0.l a(final String title, final List pages) {
        p013kotlin.jvm.internal.s.k(title, "title");
        p013kotlin.jvm.internal.s.k(pages, "pages");
        return new wn0.l() { // from class: com.fourthline.orca.internal.t61
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return C3531lv.a(title, pages, (C3361hv) obj);
            }
        };
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C3361hv getInitialState() {
        return this.f33449a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3361hv a(String str, List list, C3361hv c3361hv) {
        p013kotlin.jvm.internal.s.k(c3361hv, "<this>");
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k3.n0.c((Bitmap) it.next()));
        }
        return C3361hv.a(c3361hv, str, arrayList, null, null, null, 28, null);
    }
}
