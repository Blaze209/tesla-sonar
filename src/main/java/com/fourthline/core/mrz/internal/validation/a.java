package com.fourthline.core.mrz.internal.validation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0466a f24301b = new C0466a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f24302a;

    /* JADX INFO: renamed from: com.fourthline.core.mrz.internal.validation.a$a, reason: collision with other inner class name */
    public static final class C0466a {
        public /* synthetic */ C0466a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0466a() {
        }
    }

    public a(String mrzString) {
        s.k(mrzString, "mrzString");
        this.f24302a = mrzString;
    }

    public abstract String a();

    public abstract boolean a(String str);

    public boolean b() {
        String strA = a();
        return c(strA) && b(strA) && a(strA);
    }

    public abstract boolean b(String str);

    public abstract boolean c(String str);

    protected final List d(String str) {
        s.k(str, "<this>");
        List listF1 = t.f1(str, new String[]{"\n"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF1) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t.V((String) it.next(), "\n", "", false, 4, null);
        }
        return arrayList;
    }
}
