package com.stripe.android.stripe3ds2.transactions;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\rB!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "code", "", "description", "detail", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "Lu80/b;", "protocolError", "(Lu80/b;Ljava/lang/String;)V", "a", "I", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", DateTokenConverter.CONVERTER_KEY, "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChallengeResponseParseException extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String detail;

    /* JADX INFO: renamed from: com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException$a;", "", "<init>", "()V", "", "fieldName", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "b", "(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;", "a", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChallengeResponseParseException a(String fieldName) {
            s.k(fieldName, "fieldName");
            return new ChallengeResponseParseException(u80.b.InvalidDataElementFormat.getCode(), "Data element not in the required format or value is invalid as defined in Table A.1", fieldName);
        }

        public final ChallengeResponseParseException b(String fieldName) {
            s.k(fieldName, "fieldName");
            return new ChallengeResponseParseException(u80.b.RequiredDataElementMissing.getCode(), "A message element required as defined in Table A.1 is missing from the message.", fieldName);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(int i11, String description, String detail) {
        super(i11 + " - " + description + " (" + detail + ")");
        s.k(description, "description");
        s.k(detail, "detail");
        this.code = i11;
        this.description = description;
        this.detail = detail;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeResponseParseException(u80.b protocolError, String detail) {
        this(protocolError.getCode(), protocolError.getDescription(), detail);
        s.k(protocolError, "protocolError");
        s.k(detail, "detail");
    }
}
