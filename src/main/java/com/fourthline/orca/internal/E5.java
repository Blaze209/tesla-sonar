package com.fourthline.orca.internal;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public class E5 implements D5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f25555b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f25556c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rw f25557a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public E5(Rw resourcesManager) {
        p013kotlin.jvm.internal.s.k(resourcesManager, "resourcesManager");
        this.f25557a = resourcesManager;
    }

    @Override // com.fourthline.orca.internal.D5
    public List a(String input, List items) {
        D5.a aVar;
        p013kotlin.jvm.internal.s.k(input, "input");
        p013kotlin.jvm.internal.s.k(items, "items");
        String strA = AbstractC3157d4.a(input);
        if (strA.length() < 1) {
            return p013kotlin.collections.v.m();
        }
        List listR = p013kotlin.collections.v.r(this.f25557a.b(), a());
        ArrayList arrayList = new ArrayList();
        Iterator it = items.iterator();
        while (it.hasNext()) {
            InterfaceC3447jx interfaceC3447jx = (InterfaceC3447jx) it.next();
            Iterator it2 = listR.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    aVar = null;
                    break;
                }
                p013kotlin.text.m mVarA = a(a((Resources) it2.next(), interfaceC3447jx.getName()), strA);
                if (mVarA != null) {
                    aVar = new D5.a(mVarA.d(), interfaceC3447jx);
                    break;
                }
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private final p013kotlin.text.m a(String str, String str2) {
        return p013kotlin.text.q.d(new p013kotlin.text.q(str2, p013kotlin.text.s.IGNORE_CASE), str, 0, 2, null);
    }

    private final String a(Resources resources, QA qa2) {
        return AbstractC3157d4.a(RA.a(qa2, resources));
    }

    private final Resources a() {
        if (p013kotlin.jvm.internal.s.f(this.f25557a.a().getLanguage(), "en")) {
            return null;
        }
        Rw rw2 = this.f25557a;
        Locale ENGLISH = Locale.ENGLISH;
        p013kotlin.jvm.internal.s.j(ENGLISH, "ENGLISH");
        return rw2.b(ENGLISH);
    }
}
