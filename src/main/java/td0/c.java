package td0;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Ltd0/c;", "", "<init>", "()V", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "log", "Ltd0/f;", "c", "Ltd0/f;", "()Ltd0/f;", "getEncryptionHelper$annotations", "encryptionHelper", "a", "realm_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f113196a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g log = com.tesla.logging.g.INSTANCE.a("Encryption");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final f encryptionHelper = new a();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J#\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ltd0/c$a;", "Ltd0/f;", "<init>", "()V", "Ljavax/crypto/SecretKey;", "g", "()Ljavax/crypto/SecretKey;", "c", "T", "Lkotlin/Function0;", "task", "f", "(Lwn0/a;)Ljava/lang/Object;", "", "rawData", "Ltd0/g;", "encrypt", "([B)Ltd0/g;", "iv", "encryptedData", "decrypt", "([B[B)[B", "a", "Ljavax/crypto/SecretKey;", "mMasterKey", "b", "realm_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private SecretKey mMasterKey;

        public a() throws Exception {
            try {
                g();
            } catch (Exception e11) {
                c.log.d("[Realm] unable to generate Cipher", e11);
                throw e11;
            }
        }

        private final synchronized SecretKey c() {
            SecretKey secretKeyGenerateKey;
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("tm_master_key", 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setUserAuthenticationRequired(false).build();
                p013kotlin.jvm.internal.s.j(keyGenParameterSpecBuild, "build(...)");
                keyGenerator.init(keyGenParameterSpecBuild);
                secretKeyGenerateKey = keyGenerator.generateKey();
                this.mMasterKey = secretKeyGenerateKey;
            } catch (Exception e11) {
                c.log.d("[Realm] unable to create master key", e11);
                throw e11;
            }
            return secretKeyGenerateKey;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final byte[] d(Cipher cipher, a aVar, IvParameterSpec ivParameterSpec, byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
            cipher.init(2, aVar.mMasterKey, ivParameterSpec);
            return cipher.doFinal(bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final EncryptionResult e(Cipher cipher, a aVar, byte[] bArr) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException {
            cipher.init(1, aVar.mMasterKey);
            byte[] iv2 = cipher.getIV();
            p013kotlin.jvm.internal.s.j(iv2, "getIV(...)");
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            p013kotlin.jvm.internal.s.j(bArrDoFinal, "doFinal(...)");
            return new EncryptionResult(iv2, bArrDoFinal);
        }

        private final <T> T f(wn0.a<? extends T> task) throws InterruptedException {
            if (Build.VERSION.SDK_INT != 29) {
                return task.invoke();
            }
            ProviderException e11 = null;
            for (int i11 = 0; i11 < 4; i11++) {
                try {
                    return task.invoke();
                } catch (ProviderException e12) {
                    e11 = e12;
                    com.tesla.logging.g gVar = c.log;
                    String str = "Applying Android 10 KeyStoreConnectException bug workaround. Counter: " + i11 + ", Exception: " + e11.getMessage();
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g(str);
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = v0.f(x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                    Thread.sleep(100L);
                }
            }
            if (e11 != null) {
                throw e11;
            }
            throw new IllegalStateException("Unknown error occurred in keyStoreWorkaroundForAndroid10");
        }

        private final SecretKey g() throws Exception {
            try {
                if (this.mMasterKey == null) {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    SecretKey secretKey = (SecretKey) keyStore.getKey("tm_master_key", null);
                    this.mMasterKey = secretKey;
                    if (secretKey == null) {
                        c();
                    }
                }
                return this.mMasterKey;
            } catch (Exception e11) {
                c.log.d("[Realm] unable to retrieve master key", e11);
                throw e11;
            }
        }

        @Override // td0.f
        public byte[] decrypt(byte[] iv2, final byte[] encryptedData) throws Exception {
            byte[] bArr;
            p013kotlin.jvm.internal.s.k(iv2, "iv");
            p013kotlin.jvm.internal.s.k(encryptedData, "encryptedData");
            try {
                final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                final IvParameterSpec ivParameterSpec = new IvParameterSpec(iv2);
                synchronized (this) {
                    Object objF = f(new wn0.a() { // from class: td0.b
                        @Override // wn0.a
                        public final Object invoke() {
                            return c.a.d(cipher, this, ivParameterSpec, encryptedData);
                        }
                    });
                    p013kotlin.jvm.internal.s.j(objF, "keyStoreWorkaroundForAndroid10(...)");
                    bArr = (byte[]) objF;
                }
                return bArr;
            } catch (Exception e11) {
                c.log.d("[Realm] unable to decrypt", e11);
                throw e11;
            }
        }

        @Override // td0.f
        public EncryptionResult encrypt(final byte[] rawData) throws Exception {
            EncryptionResult encryptionResult;
            p013kotlin.jvm.internal.s.k(rawData, "rawData");
            try {
                final Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
                synchronized (this) {
                    encryptionResult = (EncryptionResult) f(new wn0.a() { // from class: td0.a
                        @Override // wn0.a
                        public final Object invoke() {
                            return c.a.e(cipher, this, rawData);
                        }
                    });
                }
                return encryptionResult;
            } catch (Exception e11) {
                c.log.d("[Realm] unable to encrypt", e11);
                throw e11;
            }
        }
    }

    private c() {
    }

    public static final f b() {
        return encryptionHelper;
    }
}
