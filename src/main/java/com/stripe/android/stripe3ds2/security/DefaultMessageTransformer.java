package com.stripe.android.stripe3ds2.security;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.SecretKey;
import jn0.t;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;

/* JADX INFO: renamed from: com.stripe.android.stripe3ds2.security.c, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \"2\u00020\u0001:\u0001\u001bB!\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\nH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010-¨\u0006."}, d2 = {"Lcom/stripe/android/stripe3ds2/security/c;", "Lcom/stripe/android/stripe3ds2/security/k;", "", "isLiveMode", "", "counterSdkToAcs", "counterAcsToSdk", "<init>", "(ZBB)V", "(Z)V", "Lorg/json/JSONObject;", "challengeRequest", "Ljavax/crypto/SecretKey;", "secretKey", "", "K0", "(Lorg/json/JSONObject;Ljavax/crypto/SecretKey;)Ljava/lang/String;", "message", "s0", "(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;", "cres", "Ljn0/h0;", "e", "(Lorg/json/JSONObject;)V", "b", "keyId", "Ljz/l;", "a", "(Ljava/lang/String;)Ljz/l;", "Ljz/d;", "encryptionMethod", "", "c", "(Ljavax/crypto/SecretKey;Ljz/d;)[B", DateTokenConverter.CONVERTER_KEY, "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "B", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class DefaultMessageTransformer implements k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final jz.d f53942e = jz.d.f84444e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLiveMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private byte counterSdkToAcs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private byte counterAcsToSdk;

    public DefaultMessageTransformer(boolean z11, byte b11, byte b12) {
        this.isLiveMode = z11;
        this.counterSdkToAcs = b11;
        this.counterAcsToSdk = b12;
    }

    @Override // com.stripe.android.stripe3ds2.security.k
    public String K0(JSONObject challengeRequest, SecretKey secretKey) throws JSONException {
        s.k(challengeRequest, "challengeRequest");
        s.k(secretKey, "secretKey");
        String string = challengeRequest.getString("acsTransID");
        s.j(string, "getString(...)");
        jz.l lVarA = a(string);
        t0 t0Var = t0.f86535a;
        String str = String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(this.counterSdkToAcs)}, 1));
        s.j(str, "format(locale, format, *args)");
        challengeRequest.put("sdkCounterStoA", str);
        jz.m mVar = new jz.m(lVarA, new jz.s(challengeRequest.toString()));
        jz.d dVarT = lVarA.t();
        s.j(dVarT, "getEncryptionMethod(...)");
        mVar.g(new o(d(secretKey, dVarT), this.counterSdkToAcs));
        byte b11 = (byte) (this.counterSdkToAcs + 1);
        this.counterSdkToAcs = b11;
        if (b11 == 0) {
            throw new IllegalArgumentException("SDK to ACS counter is zero");
        }
        String strR = mVar.r();
        s.j(strR, "serialize(...)");
        return strR;
    }

    public final jz.l a(String keyId) {
        s.k(keyId, "keyId");
        jz.l lVarD = new jz.l.a(jz.h.f84475l, f53942e).m(keyId).d();
        s.j(lVarD, "build(...)");
        return lVarD;
    }

    public final JSONObject b(String message, SecretKey secretKey) throws ParseException {
        s.k(message, "message");
        s.k(secretKey, "secretKey");
        jz.m mVarQ = jz.m.q(message);
        jz.d dVarT = mVarQ.o().t();
        s.j(dVarT, "getEncryptionMethod(...)");
        mVarQ.f(new kz.a(c(secretKey, dVarT)));
        return new JSONObject(mVarQ.b().toString());
    }

    public final byte[] c(SecretKey secretKey, jz.d encryptionMethod) {
        s.k(secretKey, "secretKey");
        s.k(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        jz.d dVar = jz.d.f84449j;
        if (dVar != encryptionMethod) {
            s.h(encoded);
            return encoded;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, encoded.length - (dVar.b() / 8), encoded.length);
        s.h(bArrCopyOfRange);
        return bArrCopyOfRange;
    }

    public final byte[] d(SecretKey secretKey, jz.d encryptionMethod) {
        s.k(secretKey, "secretKey");
        s.k(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        jz.d dVar = jz.d.f84449j;
        if (dVar != encryptionMethod) {
            s.h(encoded);
            return encoded;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(encoded, 0, dVar.b() / 8);
        s.h(bArrCopyOfRange);
        return bArrCopyOfRange;
    }

    public final void e(JSONObject cres) throws ChallengeResponseParseException {
        Object objB;
        s.k(cres, "cres");
        if (this.isLiveMode) {
            if (!cres.has("acsCounterAtoS")) {
                throw ChallengeResponseParseException.INSTANCE.b("acsCounterAtoS");
            }
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                String string = cres.getString("acsCounterAtoS");
                s.j(string, "getString(...)");
                objB = jn0.s.b(Byte.valueOf(Byte.parseByte(string)));
            } catch (Throwable th2) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                objB = jn0.s.b(t.a(th2));
            }
            if (jn0.s.e(objB) != null) {
                throw ChallengeResponseParseException.INSTANCE.a("acsCounterAtoS");
            }
            byte bByteValue = ((Number) objB).byteValue();
            if (this.counterAcsToSdk == bByteValue) {
                return;
            }
            throw new ChallengeResponseParseException(u80.b.DataDecryptionFailure, "Counters are not equal. SDK counter: " + ((int) this.counterAcsToSdk) + ", ACS counter: " + ((int) bByteValue));
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultMessageTransformer)) {
            return false;
        }
        DefaultMessageTransformer defaultMessageTransformer = (DefaultMessageTransformer) other;
        return this.isLiveMode == defaultMessageTransformer.isLiveMode && this.counterSdkToAcs == defaultMessageTransformer.counterSdkToAcs && this.counterAcsToSdk == defaultMessageTransformer.counterAcsToSdk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.isLiveMode;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return (((r11 * 31) + Byte.hashCode(this.counterSdkToAcs)) * 31) + Byte.hashCode(this.counterAcsToSdk);
    }

    @Override // com.stripe.android.stripe3ds2.security.k
    public JSONObject s0(String message, SecretKey secretKey) throws ChallengeResponseParseException, ParseException {
        s.k(message, "message");
        s.k(secretKey, "secretKey");
        JSONObject jSONObjectB = b(message, secretKey);
        e(jSONObjectB);
        byte b11 = (byte) (this.counterAcsToSdk + 1);
        this.counterAcsToSdk = b11;
        if (b11 != 0) {
            return jSONObjectB;
        }
        throw new IllegalArgumentException("ACS to SDK counter is zero");
    }

    public String toString() {
        return "DefaultMessageTransformer(isLiveMode=" + this.isLiveMode + ", counterSdkToAcs=" + ((int) this.counterSdkToAcs) + ", counterAcsToSdk=" + ((int) this.counterAcsToSdk) + ")";
    }

    public DefaultMessageTransformer(boolean z11) {
        this(z11, (byte) 0, (byte) 0);
    }
}
