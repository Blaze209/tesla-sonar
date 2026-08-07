package com.adyen.checkout.ui.core.internal.ui;

import java.util.Locale;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/checkout/ui/core/internal/ui/LogoSize;", "", "(Ljava/lang/String;I)V", "toString", "", "SMALL", "MEDIUM", "LARGE", "ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum LogoSize {
    SMALL,
    MEDIUM,
    LARGE;

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());

    public static EnumEntries<LogoSize> getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
