package com.stripe.android.stripe3ds2.security;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.text.t;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TestRsa' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB3\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#¨\u0006$"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/e;", "", "", "", "ids", "Lcom/stripe/android/stripe3ds2/security/a;", "algorithm", "fileName", "Lqz/h;", "keyUse", "<init>", "(Ljava/lang/String;ILjava/util/List;Lcom/stripe/android/stripe3ds2/security/a;Ljava/lang/String;Lqz/h;)V", "Ljava/util/List;", "getIds", "()Ljava/util/List;", "Lcom/stripe/android/stripe3ds2/security/a;", "getAlgorithm", "()Lcom/stripe/android/stripe3ds2/security/a;", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "Lqz/h;", "getKeyUse", "()Lqz/h;", "", "isCertificate", "()Z", "Companion", "a", "TestRsa", "TestEc", "Visa", "Mastercard", "Amex", "Discover", "CartesBancaires", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e Amex;
    private static final Set<String> CERTIFICATE_EXTENSIONS;
    public static final e CartesBancaires;
    public static final e Discover;
    public static final e Mastercard;
    public static final e TestEc;
    public static final e TestRsa;
    public static final e Visa;
    private final a algorithm;
    private final String fileName;
    private final List<String> ids;
    private final qz.h keyUse;

    private static final /* synthetic */ e[] $values() {
        return new e[]{TestRsa, TestEc, Visa, Mastercard, Amex, Discover, CartesBancaires};
    }

    static {
        List listE = v.e("F055545342");
        a aVar = a.RSA;
        TestRsa = new e("TestRsa", 0, listE, aVar, "ds-test-rsa.txt", null, 8, null);
        TestEc = new e("TestEc", 1, v.e("F155545342"), a.EC, "ds-test-ec.txt", null, 8, null);
        int i11 = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        qz.h hVar = null;
        Visa = new e("Visa", 2, v.e("A000000003"), aVar, "ds-visa.crt", hVar, i11, defaultConstructorMarker);
        Mastercard = new e("Mastercard", 3, v.e("A000000004"), aVar, "ds-mastercard.crt", hVar, i11, defaultConstructorMarker);
        Amex = new e("Amex", 4, v.e("A000000025"), aVar, "ds-amex.pem", hVar, i11, defaultConstructorMarker);
        Discover = new e("Discover", 5, v.p("A000000152", "A000000324"), aVar, "ds-discover.cer", null);
        CartesBancaires = new e("CartesBancaires", 6, v.e("A000000042"), aVar, "ds-cartesbancaires.pem", hVar, i11, defaultConstructorMarker);
        e[] eVarArr$values = $values();
        $VALUES = eVarArr$values;
        $ENTRIES = on0.a.a(eVarArr$values);
        INSTANCE = new Companion(null);
        CERTIFICATE_EXTENSIONS = d1.i(".crt", ".cer", ".pem");
    }

    private e(String str, int i11, List list, a aVar, String str2, qz.h hVar) {
        super(str, i11);
        this.ids = list;
        this.algorithm = aVar;
        this.fileName = str2;
        this.keyUse = hVar;
    }

    public static EnumEntries<e> getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final a getAlgorithm() {
        return this.algorithm;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final qz.h getKeyUse() {
        return this.keyUse;
    }

    public final boolean isCertificate() {
        Set<String> set = CERTIFICATE_EXTENSIONS;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (t.L(this.fileName, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    /* synthetic */ e(String str, int i11, List list, a aVar, String str2, qz.h hVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, list, aVar, str2, (i12 & 8) != 0 ? qz.h.f106257b : hVar);
    }
}
