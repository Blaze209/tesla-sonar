package com.fourthline.nfc.internal;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0007\b\t\n\u000b\fB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/fourthline/nfc/internal/NfcException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", "e", "b", DateTokenConverter.CONVERTER_KEY, "f", "a", "c", "Lcom/fourthline/nfc/internal/NfcException$a;", "Lcom/fourthline/nfc/internal/NfcException$b;", "Lcom/fourthline/nfc/internal/NfcException$c;", "Lcom/fourthline/nfc/internal/NfcException$d;", "Lcom/fourthline/nfc/internal/NfcException$e;", "Lcom/fourthline/nfc/internal/NfcException$f;", "fourthline-nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class NfcException extends Exception {
    public static final int $stable = 0;

    public static final class a extends NfcException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message) {
            super(message, null);
            p013kotlin.jvm.internal.s.k(message, "message");
        }
    }

    public static final class b extends NfcException {
        public b(String str) {
            super(str, null);
        }
    }

    public static final class c extends NfcException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String message) {
            super(message, null);
            p013kotlin.jvm.internal.s.k(message, "message");
        }
    }

    public static final class d extends NfcException {
        public d(String str) {
            super(str, null);
        }
    }

    public static final class e extends NfcException {
        public e(String str) {
            super(str, null);
        }
    }

    public static final class f extends NfcException {
        public f(String str) {
            super(str, null);
        }
    }

    public /* synthetic */ NfcException(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private NfcException(String str) {
        super(str);
    }

    public /* synthetic */ NfcException(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, null);
    }
}
