package rb0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.crypto.InvalidVehiclePublicKeyException;
import com.tesla.logging.TeslaLog;
import ie0.q0;
import io.reactivex.rxjava3.core.o;
import java.security.Key;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u001e0\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c¢\u0006\u0004\b\u001f\u0010 R$\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\"R0\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0$j\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010&R\u001c\u0010+\u001a\n )*\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-¨\u0006/"}, d2 = {"Lrb0/e;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/security/KeyPair;", "a", "(Landroid/content/Context;)Ljava/security/KeyPair;", "Ljava/security/PublicKey;", "c", "(Landroid/content/Context;)Ljava/security/PublicKey;", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;)[B", "", "vehicleKeyHex", AnalyticsAttribute.Reason, "Ljava/security/Key;", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/security/Key;", "messageHex", "additionalData", "Lrb0/e$a;", "g", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lrb0/e$a;", "f", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)[B", "Lio/reactivex/rxjava3/core/o;", "emailObservable", "Ljn0/s;", "e", "(Landroid/content/Context;Lio/reactivex/rxjava3/core/o;)Lio/reactivex/rxjava3/core/o;", "Lkotlin/Pair;", "Lkotlin/Pair;", "emailToLocalKeyPair", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "sharedSecrets", "Lrb0/a;", "kotlin.jvm.PlatformType", "Lrb0/a;", "cryptoManager", "Lcom/tesla/logging/g;", "Lcom/tesla/logging/g;", "logger", "crypto_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static Pair<String, KeyPair> emailToLocalKeyPair;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f107486a = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final HashMap<String, byte[]> sharedSecrets = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final rb0.a cryptoManager = rb0.a.l();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("LocalKeyPairEnclave");

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lrb0/e$a;", "", "", "signedMessage", "nonce", "<init>", "([B[B)V", "a", "[B", "b", "()[B", "crypto_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final byte[] signedMessage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final byte[] nonce;

        public a(byte[] signedMessage, byte[] nonce) {
            s.k(signedMessage, "signedMessage");
            s.k(nonce, "nonce");
            this.signedMessage = signedMessage;
            this.nonce = nonce;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final byte[] getNonce() {
            return this.nonce;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final byte[] getSignedMessage() {
            return this.signedMessage;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T> implements cm0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b<T> f107493a = new b<>();

        b() {
        }

        @Override // cm0.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(String it) {
            s.k(it, "it");
            return !t.y0(it);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T, R> implements cm0.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f107494a;

        c(Context context) {
            this.f107494a = context;
        }

        public final Object a(String it) {
            s.k(it, "it");
            try {
                jn0.s.Companion companion = jn0.s.INSTANCE;
                return jn0.s.b(e.f107486a.d(this.f107494a));
            } catch (Exception e11) {
                jn0.s.Companion companion2 = jn0.s.INSTANCE;
                return jn0.s.b(jn0.t.a(e11));
            }
        }

        @Override // cm0.h
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return jn0.s.a(a((String) obj));
        }
    }

    private e() {
    }

    private final KeyPair a(Context context) throws Exception {
        String strE;
        KeyPair keyPairF;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        String strG = he0.b.m(applicationContext).g();
        if (strG == null) {
            throw new Exception("Unable to confirm email address");
        }
        synchronized (this) {
            try {
                Pair<String, KeyPair> pair = emailToLocalKeyPair;
                if (pair == null || (strE = pair.e()) == null) {
                    strE = "emptyEmail";
                }
                if (!s.f(strG, strE)) {
                    emailToLocalKeyPair = null;
                    sharedSecrets.clear();
                }
                if (emailToLocalKeyPair == null) {
                    try {
                        emailToLocalKeyPair = new Pair<>(strG, cryptoManager.n(strG, applicationContext));
                    } catch (Exception e11) {
                        logger.f("Failed to get key keyPair to sign with", e11);
                        throw e11;
                    }
                }
                Pair<String, KeyPair> pair2 = emailToLocalKeyPair;
                if (pair2 == null || (keyPairF = pair2.f()) == null) {
                    throw new Exception("Failed to retrieve the key pair");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return keyPairF;
    }

    public final Key b(Context context, String vehicleKeyHex, String reason) {
        s.k(context, "context");
        s.k(vehicleKeyHex, "vehicleKeyHex");
        s.k(reason, "reason");
        return new SecretKeySpec(f(context, vehicleKeyHex, reason), "AES");
    }

    public final PublicKey c(Context context) {
        s.k(context, "context");
        PublicKey publicKey = a(context).getPublic();
        s.j(publicKey, "getPublic(...)");
        return publicKey;
    }

    public final byte[] d(Context context) {
        s.k(context, "context");
        byte[] bArrT = rb0.a.t(c(context));
        s.j(bArrT, "getUniqueKeyPortion(...)");
        return bArrT;
    }

    public final o<jn0.s<byte[]>> e(Context context, o<String> emailObservable) {
        s.k(context, "context");
        s.k(emailObservable, "emailObservable");
        o oVarD = emailObservable.s(b.f107493a).D(new c(context));
        s.j(oVarD, "map(...)");
        return oVarD;
    }

    public final byte[] f(Context context, String vehicleKeyHex, String reason) {
        byte[] bArr;
        s.k(context, "context");
        s.k(vehicleKeyHex, "vehicleKeyHex");
        s.k(reason, "reason");
        PrivateKey privateKey = a(context).getPrivate();
        HashMap<String, byte[]> map = sharedSecrets;
        synchronized (map) {
            try {
                if (!map.containsKey(vehicleKeyHex)) {
                    com.tesla.logging.g gVar = logger;
                    gVar.j("no cached secret for vehicle " + vehicleKeyHex + ", computing... reason: " + reason);
                    PublicKey publicKeyP = rb0.a.p(q0.a(vehicleKeyHex));
                    if (publicKeyP == null) {
                        TeslaLog teslaLog = TeslaLog.INSTANCE;
                        String tag = gVar.getTag();
                        String strG = gVar.g("Failed to parse vehicle public key: " + vehicleKeyHex);
                        zb0.a aVar = zb0.a.f128044a;
                        Map mapF = v0.f(x.a(tag, strG));
                        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                        for (Map.Entry entry : mapF.entrySet()) {
                            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                        }
                        firebaseCrashlytics.recordException(new Exception(strG));
                        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                        vr0.a.INSTANCE.a(strG, new Object[0]);
                        throw new InvalidVehiclePublicKeyException(vehicleKeyHex, null, 2, null);
                    }
                    map.put(vehicleKeyHex, rb0.a.f(publicKeyP, privateKey, reason + ":" + vehicleKeyHex));
                }
                bArr = map.get(vehicleKeyHex);
                if (bArr == null) {
                    throw new Exception("Unable to perform key exchange");
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    public final a g(Context context, String messageHex, String vehicleKeyHex, String additionalData) {
        s.k(context, "context");
        s.k(messageHex, "messageHex");
        s.k(vehicleKeyHex, "vehicleKeyHex");
        s.k(additionalData, "additionalData");
        byte[] bArrF = f(context, vehicleKeyHex, "signing message");
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(q0.a(additionalData));
        byte[] bArrH = rb0.a.h(q0.a(messageHex), bArrF, bArr, messageDigest.digest());
        if (bArrH != null) {
            return new a(bArrH, bArr);
        }
        throw new Exception("signed message is empty!");
    }
}
