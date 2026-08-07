package com.fourthline.core.mrz.internal.validation.mrtd;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends com.fourthline.core.mrz.internal.validation.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C0468a f24310d = new C0468a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24311c;

    /* JADX INFO: renamed from: com.fourthline.core.mrz.internal.validation.mrtd.a$a, reason: collision with other inner class name */
    private static final class C0468a {
        public /* synthetic */ C0468a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0468a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String mrzString) {
        super(mrzString);
        s.k(mrzString, "mrzString");
        this.f24311c = mrzString;
    }

    @Override // com.fourthline.core.mrz.internal.validation.a
    public String a() {
        return this.f24311c;
    }

    @Override // com.fourthline.core.mrz.internal.validation.a
    public boolean b(String str) {
        s.k(str, "<this>");
        List<String> listD = d(str);
        boolean z11 = listD instanceof Collection;
        if (!z11 || !listD.isEmpty()) {
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() != ((String) v.o0(listD)).length()) {
                    return false;
                }
            }
        }
        if (z11 && listD.isEmpty()) {
            return true;
        }
        for (String str2 : listD) {
            if (str2.length() != 30 && str2.length() != 36 && str2.length() != 44) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fourthline.core.mrz.internal.validation.a
    public boolean c(String str) {
        int size;
        s.k(str, "<this>");
        return str.length() != 0 && 2 <= (size = d(str).size()) && size < 4;
    }

    @Override // com.fourthline.core.mrz.internal.validation.a
    public boolean a(String str) {
        s.k(str, "<this>");
        return new q("([A-Z0-9<!|bi])+").i(t.V(str, "\n", "", false, 4, null));
    }
}
