package t90;

import o30.StripeError;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lt90/b;", "", "<init>", "()V", "Lt90/a;", "a", "()Lt90/a;", "Lt90/b$a;", "b", "Lt90/b$a;", "DEFAULT_ERROR_MESSAGE_TRANSLATOR", "c", "Lt90/a;", "errorMessageTranslator", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static t90.a errorMessageTranslator;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f113003a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final a DEFAULT_ERROR_MESSAGE_TRANSLATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f113006d = 8;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lt90/b$a;", "Lt90/a;", "<init>", "()V", "", "httpCode", "", "errorMessage", "Lo30/f;", "stripeError", "a", "(ILjava/lang/String;Lo30/f;)Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a implements t90.a {
        @Override // t90.a
        public String a(int httpCode, String errorMessage, StripeError stripeError) {
            return errorMessage == null ? "" : errorMessage;
        }
    }

    private b() {
    }

    public final t90.a a() {
        t90.a aVar = errorMessageTranslator;
        return aVar == null ? DEFAULT_ERROR_MESSAGE_TRANSLATOR : aVar;
    }
}
