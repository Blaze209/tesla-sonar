package com.fourthline.vision.internal;

import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.fourthline.vision.internal.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4330z3 implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39154a = new a(null);

    /* JADX INFO: renamed from: com.fourthline.vision.internal.z3$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.fourthline.vision.internal.W0
    public T0.c correct(T0.c source, Size detectionArea) {
        p013kotlin.jvm.internal.s.k(source, "source");
        p013kotlin.jvm.internal.s.k(detectionArea, "detectionArea");
        List<T0.d> texts = source.getTexts();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(texts, 10));
        for (T0.d text : texts) {
            List<T0.a> lines = text.getLines();
            if (lines != null && !lines.isEmpty()) {
                Iterator<T> it = text.getLines().iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iHeight = ((T0.a) it.next()).getBox().height();
                while (it.hasNext()) {
                    int iHeight2 = ((T0.a) it.next()).getBox().height();
                    if (iHeight < iHeight2) {
                        iHeight = iHeight2;
                    }
                }
                List<T0.a> lines2 = text.getLines();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : lines2) {
                    T0.a aVar = (T0.a) obj;
                    boolean z11 = ((float) aVar.getBox().height()) / ((float) iHeight) > 0.5f;
                    if (!z11) {
                        if (C4330z3.class.isAnonymousClass()) {
                            String name = C4330z3.class.getName();
                            int length = name.length();
                            p013kotlin.jvm.internal.s.h(name);
                            if (length > 23) {
                                p013kotlin.jvm.internal.s.j(name.substring(name.length() - 23, name.length()), "substring(...)");
                            }
                        } else {
                            String simpleName = C4330z3.class.getSimpleName();
                            int length2 = simpleName.length();
                            p013kotlin.jvm.internal.s.h(simpleName);
                            if (length2 > 23) {
                                p013kotlin.jvm.internal.s.j(simpleName.substring(0, 23), "substring(...)");
                            }
                        }
                        aVar.getText();
                    }
                    if (z11) {
                        arrayList2.add(obj);
                    }
                }
                text = X0.toText(arrayList2);
            }
            arrayList.add(text);
        }
        List listQ0 = p013kotlin.collections.v.Q0(arrayList, X0.merged(arrayList));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listQ0) {
            T0.d dVar = (T0.d) obj2;
            boolean z12 = ((float) dVar.getBox().width()) / ((float) detectionArea.getWidth()) > 0.4f;
            if (!z12) {
                if (C4330z3.class.isAnonymousClass()) {
                    String name2 = C4330z3.class.getName();
                    int length3 = name2.length();
                    p013kotlin.jvm.internal.s.h(name2);
                    if (length3 > 23) {
                        p013kotlin.jvm.internal.s.j(name2.substring(name2.length() - 23, name2.length()), "substring(...)");
                    }
                } else {
                    String simpleName2 = C4330z3.class.getSimpleName();
                    int length4 = simpleName2.length();
                    p013kotlin.jvm.internal.s.h(simpleName2);
                    if (length4 > 23) {
                        p013kotlin.jvm.internal.s.j(simpleName2.substring(0, 23), "substring(...)");
                    }
                }
                dVar.getText();
            }
            if (z12) {
                arrayList3.add(obj2);
            }
        }
        return new T0.c(arrayList3);
    }
}
