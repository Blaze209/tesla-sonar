package com.stripe.android.stripe3ds2.transaction;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import javax.crypto.SecretKey;
import jn0.t;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import u80.ErrorData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/f;", "", "Lcom/stripe/android/stripe3ds2/transactions/a;", "creqData", "Lt80/l;", "response", "Lcom/stripe/android/stripe3ds2/transaction/d;", "a", "(Lcom/stripe/android/stripe3ds2/transactions/a;Lt80/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface f {

    @Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010!\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0016H\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/f$a;", "Lcom/stripe/android/stripe3ds2/transaction/f;", "Lcom/stripe/android/stripe3ds2/security/k;", "messageTransformer", "Ljavax/crypto/SecretKey;", "secretKey", "Lr80/c;", "errorReporter", "Lcom/stripe/android/stripe3ds2/transaction/c$a;", "creqExecutorConfig", "<init>", "(Lcom/stripe/android/stripe3ds2/security/k;Ljavax/crypto/SecretKey;Lr80/c;Lcom/stripe/android/stripe3ds2/transaction/c$a;)V", "Lcom/stripe/android/stripe3ds2/transactions/a;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/b;", "cresData", "", "e", "(Lcom/stripe/android/stripe3ds2/transactions/a;Lcom/stripe/android/stripe3ds2/transactions/b;)Z", DateTokenConverter.CONVERTER_KEY, "", "responseBody", "Lorg/json/JSONObject;", "c", "(Ljava/lang/String;)Lorg/json/JSONObject;", "", "code", "description", "detail", "Lu80/a;", "b", "(Lcom/stripe/android/stripe3ds2/transactions/a;ILjava/lang/String;Ljava/lang/String;)Lu80/a;", "Lt80/l;", "response", "Lcom/stripe/android/stripe3ds2/transaction/d;", "a", "(Lcom/stripe/android/stripe3ds2/transactions/a;Lt80/l;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", StatusResponse.PAYLOAD, "f", "(Lcom/stripe/android/stripe3ds2/transactions/a;Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transaction/d;", "Lcom/stripe/android/stripe3ds2/security/k;", "Ljavax/crypto/SecretKey;", "Lr80/c;", "Lcom/stripe/android/stripe3ds2/transaction/c$a;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final com.stripe.android.stripe3ds2.security.k messageTransformer;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final SecretKey secretKey;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final r80.c errorReporter;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final c.Config creqExecutorConfig;

        public a(com.stripe.android.stripe3ds2.security.k messageTransformer, SecretKey secretKey, r80.c errorReporter, c.Config creqExecutorConfig) {
            s.k(messageTransformer, "messageTransformer");
            s.k(secretKey, "secretKey");
            s.k(errorReporter, "errorReporter");
            s.k(creqExecutorConfig, "creqExecutorConfig");
            this.messageTransformer = messageTransformer;
            this.secretKey = secretKey;
            this.errorReporter = errorReporter;
            this.creqExecutorConfig = creqExecutorConfig;
        }

        private final ErrorData b(ChallengeRequestData creqData, int code, String description, String detail) {
            String strValueOf = String.valueOf(code);
            ErrorData.c cVar = ErrorData.c.ThreeDsSdk;
            return new ErrorData(creqData.getThreeDsServerTransId(), creqData.getAcsTransId(), null, strValueOf, cVar, description, detail, "CRes", creqData.getMessageVersion(), creqData.getSdkTransId(), 4, null);
        }

        private final JSONObject c(String responseBody) {
            return this.messageTransformer.s0(responseBody, this.secretKey);
        }

        private final boolean d(ChallengeRequestData creqData, ChallengeResponseData cresData) {
            return s.f(creqData.getMessageVersion(), cresData.getMessageVersion());
        }

        private final boolean e(ChallengeRequestData creqData, ChallengeResponseData cresData) {
            return s.f(creqData.getSdkTransId(), cresData.getSdkTransId()) && s.f(creqData.getThreeDsServerTransId(), cresData.getServerTransId()) && s.f(creqData.getAcsTransId(), cresData.getAcsTransId());
        }

        @Override // com.stripe.android.stripe3ds2.transaction.f
        public Object a(ChallengeRequestData challengeRequestData, t80.l lVar, Continuation<? super d> continuation) {
            Object objB;
            if (lVar.getIsJsonContentType()) {
                JSONObject jSONObject = new JSONObject(lVar.getContent());
                ErrorData.Companion companion = ErrorData.INSTANCE;
                return companion.b(jSONObject) ? new d.ProtocolError(companion.a(jSONObject)) : new d.RuntimeError(new IllegalArgumentException("Received a JSON response that was not an Error message."));
            }
            try {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(c(lVar.getContent()));
            } catch (Throwable th2) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                this.errorReporter.Y0(new RuntimeException(p013kotlin.text.t.n("\n                            Failed to process challenge response.\n\n                            CReq = " + challengeRequestData.i() + "\n                            "), thE));
            }
            Throwable thE2 = jn0.s.e(objB);
            if (thE2 == null) {
                return f(challengeRequestData, (JSONObject) objB);
            }
            u80.b bVar = u80.b.DataDecryptionFailure;
            int code = bVar.getCode();
            String description = bVar.getDescription();
            String message = thE2.getMessage();
            if (message == null) {
                message = "";
            }
            return new d.ProtocolError(b(challengeRequestData, code, description, message));
        }

        public final d f(ChallengeRequestData creqData, JSONObject payload) {
            Object objB;
            s.k(creqData, "creqData");
            s.k(payload, "payload");
            ErrorData.Companion companion = ErrorData.INSTANCE;
            if (companion.b(payload)) {
                return new d.ProtocolError(companion.a(payload));
            }
            try {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(ChallengeResponseData.INSTANCE.d(payload));
            } catch (Throwable th2) {
                jn0.s.Companion companion3 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            Throwable thE = jn0.s.e(objB);
            if (thE != null) {
                if (!(thE instanceof ChallengeResponseParseException)) {
                    return new d.RuntimeError(thE);
                }
                ChallengeResponseParseException challengeResponseParseException = (ChallengeResponseParseException) thE;
                return new d.ProtocolError(b(creqData, challengeResponseParseException.getCode(), challengeResponseParseException.getDescription(), challengeResponseParseException.getDetail()));
            }
            ChallengeResponseData challengeResponseData = (ChallengeResponseData) objB;
            if (!e(creqData, challengeResponseData)) {
                u80.b bVar = u80.b.InvalidTransactionId;
                return new d.ProtocolError(b(creqData, bVar.getCode(), bVar.getDescription(), "The Transaction ID received was invalid."));
            }
            if (d(creqData, challengeResponseData)) {
                return new d.Success(creqData, challengeResponseData, this.creqExecutorConfig);
            }
            u80.b bVar2 = u80.b.UnsupportedMessageVersion;
            return new d.ProtocolError(b(creqData, bVar2.getCode(), bVar2.getDescription(), creqData.getMessageVersion()));
        }
    }

    Object a(ChallengeRequestData challengeRequestData, t80.l lVar, Continuation<? super d> continuation);
}
