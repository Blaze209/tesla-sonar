package com.stripe.android.core.exception;

import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/core/exception/APIConnectionException;", "Lcom/stripe/android/core/exception/StripeException;", "", "message", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "a", "()Ljava/lang/String;", "f", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class APIConnectionException extends StripeException {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.stripe.android.core.exception.APIConnectionException$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/core/exception/APIConnectionException$a;", "", "<init>", "()V", "Ljava/io/IOException;", "e", "", ImagesContract.URL, "Lcom/stripe/android/core/exception/APIConnectionException;", "a", "(Ljava/io/IOException;Ljava/lang/String;)Lcom/stripe/android/core/exception/APIConnectionException;", "stripe-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ APIConnectionException b(Companion companion, IOException iOException, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = null;
            }
            return companion.a(iOException, str);
        }

        public final /* synthetic */ APIConnectionException a(IOException e11, String url) {
            s.k(e11, "e");
            String str = "(" + url + ")";
            if (url == null || t.y0(url)) {
                str = null;
            }
            return new APIConnectionException("IOException during API request to " + v.y0(v.r("Stripe", str), " ", null, null, 0, null, null, 62, null) + ": " + e11.getMessage() + ". Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", e11);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public APIConnectionException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.stripe.android.core.exception.StripeException
    public String a() {
        return "connectionError";
    }

    public /* synthetic */ APIConnectionException(String str, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : th2);
    }

    public APIConnectionException(String str, Throwable th2) {
        super(null, null, 0, th2, str, 7, null);
    }
}
