package com.fourthline.core.mrz.internal.validation.idl;

import com.fourthline.core.mrz.IdlDutchInfoExtensionsKt;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.q;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends com.fourthline.core.mrz.internal.validation.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0467a f24306d = new C0467a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final q f24307e = new q("([A-Z0-9<!|blqgi])+");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f24308c;

    /* JADX INFO: renamed from: com.fourthline.core.mrz.internal.validation.idl.a$a, reason: collision with other inner class name */
    public static final class C0467a {
        public /* synthetic */ C0467a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0467a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String mrzString) {
        super(mrzString);
        s.k(mrzString, "mrzString");
        this.f24308c = mrzString;
    }

    private final boolean e(String str) {
        return str.length() >= 6 && t.Z(IdlDutchInfoExtensionsKt.getCleanNLIDLPrefix(str), IdlDutchInfoExtensionsKt.NL_IDL_PREFIX, true);
    }

    @Override // com.fourthline.core.mrz.internal.validation.a
    public String a() {
        return this.f24308c;
    }

    @Override // com.fourthline.core.mrz.internal.validation.a
    public boolean b(String str) {
        s.k(str, "<this>");
        return str.length() == 30;
    }

    @Override // com.fourthline.core.mrz.internal.validation.a
    public boolean c(String str) {
        s.k(str, "<this>");
        return str.length() != 0 && d(str).size() == 1;
    }

    @Override // com.fourthline.core.mrz.internal.validation.a
    public boolean a(String str) {
        s.k(str, "<this>");
        return f24307e.i(str) && e(str);
    }
}
