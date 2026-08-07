package s80;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.security.g;
import com.stripe.android.stripe3ds2.security.l;
import com.stripe.android.stripe3ds2.security.n;
import com.stripe.android.stripe3ds2.transaction.o;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p80.Warning;
import p80.d;
import p80.f;
import p80.k;
import q80.m;
import r80.c;
import t80.i;
import t80.p;
import t80.q;
import t80.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 B2\u00020\u0001:\u00014B?\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u0017B+\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u001aB1\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u001bB1\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u001cBQ\b\u0012\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010#JY\u00100\u001a\u00020/2\u0006\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\f2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u00182\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101Ja\u00104\u001a\u00020/2\u0006\u0010.\u001a\u00020-2\u0006\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u00182\u0006\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u00182\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\f2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u00182\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Ls80/b;", "Ls80/a;", "Lt80/p;", "messageVersionRegistry", "Lv80/b;", "imageCache", "Lr80/c;", "errorReporter", "Lt80/t;", "transactionFactory", "Lcom/stripe/android/stripe3ds2/security/l;", "publicKeyFactory", "", "Lp80/n;", "warnings", "<init>", "(Lt80/p;Lv80/b;Lr80/c;Lt80/t;Lcom/stripe/android/stripe3ds2/security/l;Ljava/util/List;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "enableLogging", "Lkotlin/coroutines/CoroutineContext;", "workContext", "(Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;)V", "", "sdkReferenceNumber", "(Landroid/content/Context;Ljava/lang/String;ZLkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;Lv80/b;Ljava/lang/String;ZLkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;Lv80/b;Ljava/lang/String;Lr80/c;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/stripe3ds2/security/g;", "ephemeralKeyPairGenerator", "Lp80/k;", "hardwareIdSupplier", "Lp80/m;", "securityChecker", "(Landroid/content/Context;Lv80/b;Ljava/lang/String;Lr80/c;Lcom/stripe/android/stripe3ds2/security/g;Lp80/k;Lp80/m;Lt80/p;Lkotlin/coroutines/CoroutineContext;)V", "directoryServerID", "messageVersion", "isLiveMode", "directoryServerName", "Ljava/security/cert/X509Certificate;", "rootCerts", "Ljava/security/PublicKey;", "dsPublicKey", "keyId", "Lt80/q;", "sdkTransactionId", "Lt80/s;", "b", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lt80/q;)Lt80/s;", "Lq80/m;", "uiCustomization", "a", "(Lt80/q;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/security/PublicKey;Ljava/lang/String;Lq80/m;)Lt80/s;", "Lt80/p;", "Lv80/b;", "c", "Lr80/c;", DateTokenConverter.CONVERTER_KEY, "Lt80/t;", "e", "Lcom/stripe/android/stripe3ds2/security/l;", "f", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "g", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b implements s80.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final a f110644g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p messageVersionRegistry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v80.b imageCache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c errorReporter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t transactionFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l publicKeyFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Warning> warnings;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ls80/b$a;", "", "<init>", "()V", "", "STRIPE_SDK_REFERENCE_NUMBER", "Ljava/lang/String;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(p messageVersionRegistry, v80.b imageCache, c errorReporter, t transactionFactory, l publicKeyFactory, List<Warning> warnings) {
        s.k(messageVersionRegistry, "messageVersionRegistry");
        s.k(imageCache, "imageCache");
        s.k(errorReporter, "errorReporter");
        s.k(transactionFactory, "transactionFactory");
        s.k(publicKeyFactory, "publicKeyFactory");
        s.k(warnings, "warnings");
        this.messageVersionRegistry = messageVersionRegistry;
        this.imageCache = imageCache;
        this.errorReporter = errorReporter;
        this.transactionFactory = transactionFactory;
        this.publicKeyFactory = publicKeyFactory;
        this.warnings = warnings;
    }

    private final t80.s b(String directoryServerID, String messageVersion, boolean isLiveMode, String directoryServerName, List<? extends X509Certificate> rootCerts, PublicKey dsPublicKey, String keyId, q sdkTransactionId) {
        if (this.messageVersionRegistry.b(messageVersion)) {
            return this.transactionFactory.a(directoryServerID, rootCerts, dsPublicKey, keyId, sdkTransactionId, isLiveMode, com.stripe.android.stripe3ds2.views.b.INSTANCE.a(directoryServerName, this.errorReporter));
        }
        if (messageVersion == null) {
            messageVersion = "";
        }
        throw new InvalidInputException("Message version is unsupported: " + messageVersion, null, 2, null);
    }

    @Override // s80.a
    public t80.s a(q sdkTransactionId, String directoryServerID, String messageVersion, boolean isLiveMode, String directoryServerName, List<? extends X509Certificate> rootCerts, PublicKey dsPublicKey, String keyId, m uiCustomization) {
        s.k(sdkTransactionId, "sdkTransactionId");
        s.k(directoryServerID, "directoryServerID");
        s.k(directoryServerName, "directoryServerName");
        s.k(rootCerts, "rootCerts");
        s.k(dsPublicKey, "dsPublicKey");
        s.k(uiCustomization, "uiCustomization");
        return b(directoryServerID, messageVersion, isLiveMode, directoryServerName, rootCerts, dsPublicKey, keyId, sdkTransactionId);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, boolean z11, CoroutineContext workContext) {
        this(context, "3DS_LOA_SDK_STIN_020100_00142", z11, workContext);
        s.k(context, "context");
        s.k(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, String sdkReferenceNumber, boolean z11, CoroutineContext workContext) {
        this(context, v80.b.a.f118418a, sdkReferenceNumber, z11, workContext);
        s.k(context, "context");
        s.k(sdkReferenceNumber, "sdkReferenceNumber");
        s.k(workContext, "workContext");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private b(Context context, v80.b bVar, String str, boolean z11, CoroutineContext coroutineContext) {
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this(context, bVar, str, new r80.a(applicationContext, null, null, o.INSTANCE.a(z11), null, null, null, 0, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, null), coroutineContext);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private b(Context context, v80.b bVar, String str, c cVar, CoroutineContext coroutineContext) {
        this(context, bVar, str, cVar, new n(cVar), new k(context), new d(null, 1, 0 == true ? 1 : 0), new p(), coroutineContext);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private b(Context context, v80.b bVar, String str, c cVar, g gVar, k kVar, p80.m mVar, p pVar, CoroutineContext coroutineContext) {
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this(pVar, bVar, cVar, new i(new t80.g(new f(applicationContext, kVar), new p80.i(kVar), mVar, gVar, new p80.c(context, coroutineContext), pVar, str, cVar, coroutineContext), gVar, str), new l(context, cVar), mVar.getWarnings());
    }
}
