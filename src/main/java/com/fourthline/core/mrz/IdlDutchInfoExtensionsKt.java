package com.fourthline.core.mrz;

import bo0.j;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.core.mrz.internal.transformation.f;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u000e\"\u0014\u0010\u0001\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0018\u0010\u0005\u001a\u00020\u0000*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0007\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004\"\u0018\u0010\u000b\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0018\u0010\r\u001a\u00020\u0000*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"", "NL_IDL_PREFIX", "Ljava/lang/String;", "getCleanNLIDLPrefix", "(Ljava/lang/String;)Ljava/lang/String;", "cleanNLIDLPrefix", "b", "cleanDocumentCode", "a", "cleanConfiguration", "c", "cleanIssuingCountry", DateTokenConverter.CONVERTER_KEY, "cleanUnknownCharacter", "fourthline-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IdlDutchInfoExtensionsKt {
    public static final String NL_IDL_PREFIX = "D1NLD";

    private static final String a(String str) {
        return f.c(String.valueOf(str.charAt(1)));
    }

    private static final String b(String str) {
        return f.b(String.valueOf(str.charAt(0)));
    }

    private static final String c(String str) {
        return f.b(t.n1(str, new j(2, 4)));
    }

    private static final String d(String str) {
        return f.c(String.valueOf(str.charAt(5)));
    }

    public static final String getCleanNLIDLPrefix(String str) {
        s.k(str, "<this>");
        return b(str) + a(str) + c(str) + d(str);
    }
}
