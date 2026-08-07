package t80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p80.AppInfo;
import p80.Warning;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u0000 82\u00020\u0001:\u0001!BQ\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015BQ\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0018J=\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u000eH\u0001¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u000e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u00106\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lt80/g;", "Lt80/d;", "Lp80/e;", "deviceDataFactory", "Lp80/h;", "deviceParamNotAvailableFactory", "Lp80/m;", "securityChecker", "Lp80/b;", "appInfoRepository", "Lcom/stripe/android/stripe3ds2/security/i;", "jweEncrypter", "Lt80/p;", "messageVersionRegistry", "", "sdkReferenceNumber", "Lr80/c;", "errorReporter", "Lkotlin/coroutines/CoroutineContext;", "workContext", "<init>", "(Lp80/e;Lp80/h;Lp80/m;Lp80/b;Lcom/stripe/android/stripe3ds2/security/i;Lt80/p;Ljava/lang/String;Lr80/c;Lkotlin/coroutines/CoroutineContext;)V", "Lcom/stripe/android/stripe3ds2/security/g;", "ephemeralKeyPairGenerator", "(Lp80/e;Lp80/h;Lp80/m;Lcom/stripe/android/stripe3ds2/security/g;Lp80/b;Lt80/p;Ljava/lang/String;Lr80/c;Lkotlin/coroutines/CoroutineContext;)V", "directoryServerId", "Ljava/security/PublicKey;", "directoryServerPublicKey", "keyId", "Lt80/q;", "sdkTransactionId", "sdkPublicKey", "Lt80/c;", "a", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lt80/q;Ljava/security/PublicKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqz/h;", "h", "(Ljava/lang/String;)Lqz/h;", "Lp80/e;", "b", "Lp80/h;", "c", "Lp80/m;", DateTokenConverter.CONVERTER_KEY, "Lp80/b;", "e", "Lcom/stripe/android/stripe3ds2/security/i;", "f", "Lt80/p;", "g", "Ljava/lang/String;", "Lr80/c;", IntegerTokenConverter.CONVERTER_KEY, "Lkotlin/coroutines/CoroutineContext;", "()Ljava/lang/String;", "deviceDataJson", "j", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g implements d {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p80.e deviceDataFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p80.h deviceParamNotAvailableFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p80.m securityChecker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p80.b appInfoRepository;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final com.stripe.android.stripe3ds2.security.i jweEncrypter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p messageVersionRegistry;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String sdkReferenceNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final r80.c errorReporter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext workContext;

    /* JADX INFO: renamed from: t80.g$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lt80/g$a;", "", "<init>", "()V", "Ljava/security/PublicKey;", "publicKey", "", "keyId", "Lqz/h;", "keyUse", "Lqz/d;", "a", "(Ljava/security/PublicKey;Ljava/lang/String;Lqz/h;)Lqz/d;", "DATA_VERSION", "Ljava/lang/String;", "KEY_DATA_VERSION", "KEY_DEVICE_DATA", "KEY_DEVICE_PARAM_NOT_AVAILABLE", "KEY_SECURITY_WARNINGS", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qz.d a(PublicKey publicKey, String keyId, qz.h keyUse) {
            p013kotlin.jvm.internal.s.k(publicKey, "publicKey");
            qz.b.a aVarC = new qz.b.a(qz.a.f106204d, (ECPublicKey) publicKey).c(keyUse);
            if (keyId == null || p013kotlin.text.t.y0(keyId)) {
                keyId = null;
            }
            qz.b bVarZ = aVarC.b(keyId).a().z();
            p013kotlin.jvm.internal.s.j(bVarZ, "toPublicJWK(...)");
            return bVarZ;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lt80/c;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lt80/c;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$create$2", f = "DefaultAuthenticationRequestParametersFactory.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super AuthenticationRequestParameters>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f112911n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f112912o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f112913p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ q f112914q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ g f112915r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ PublicKey f112916s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f112917t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f112918u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ PublicKey f112919v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(q qVar, g gVar, PublicKey publicKey, String str, String str2, PublicKey publicKey2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f112914q = qVar;
            this.f112915r = gVar;
            this.f112916s = publicKey;
            this.f112917t = str;
            this.f112918u = str2;
            this.f112919v = publicKey2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f112914q, this.f112915r, this.f112916s, this.f112917t, this.f112918u, this.f112919v, continuation);
            bVar.f112913p = obj;
            return bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            q qVar;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f112912o;
            if (i11 == 0) {
                jn0.t.b(obj);
                g gVar = this.f112915r;
                PublicKey publicKey = this.f112919v;
                String str2 = this.f112918u;
                String str3 = this.f112917t;
                try {
                    jn0.s.Companion companion = jn0.s.INSTANCE;
                    objB = jn0.s.b(gVar.jweEncrypter.a(gVar.g(), publicKey, str2, str3));
                } catch (Throwable th2) {
                    jn0.s.Companion companion2 = jn0.s.INSTANCE;
                    objB = jn0.s.b(jn0.t.a(th2));
                }
                g gVar2 = this.f112915r;
                String str4 = this.f112918u;
                String str5 = this.f112917t;
                q qVar2 = this.f112914q;
                Throwable thE = jn0.s.e(objB);
                if (thE != null) {
                    gVar2.errorReporter.Y0(new RuntimeException(p013kotlin.text.t.n("\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId=" + str4 + "\n                    keyId=" + str5 + "\n                    sdkTransactionId=" + qVar2 + "\n                    "), thE));
                }
                Throwable thE2 = jn0.s.e(objB);
                if (thE2 != null) {
                    throw new SDKRuntimeException(thE2);
                }
                String str6 = (String) objB;
                qVar = this.f112914q;
                p80.b bVar = this.f112915r.appInfoRepository;
                this.f112913p = str6;
                this.f112911n = qVar;
                this.f112912o = 1;
                Object objA = bVar.a(this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str6;
                obj = objA;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar = (q) this.f112911n;
                str = (String) this.f112913p;
                jn0.t.b(obj);
            }
            q qVar3 = qVar;
            String sdkAppId = ((AppInfo) obj).getSdkAppId();
            String str7 = this.f112915r.sdkReferenceNumber;
            String strN = g.INSTANCE.a(this.f112916s, this.f112917t, this.f112915r.h(this.f112918u)).n();
            p013kotlin.jvm.internal.s.j(strN, "toJSONString(...)");
            return new AuthenticationRequestParameters(str, qVar3, sdkAppId, str7, strN, this.f112915r.messageVersionRegistry.a());
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AuthenticationRequestParameters> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public g(p80.e deviceDataFactory, p80.h deviceParamNotAvailableFactory, p80.m securityChecker, p80.b appInfoRepository, com.stripe.android.stripe3ds2.security.i jweEncrypter, p messageVersionRegistry, String sdkReferenceNumber, r80.c errorReporter, CoroutineContext workContext) {
        p013kotlin.jvm.internal.s.k(deviceDataFactory, "deviceDataFactory");
        p013kotlin.jvm.internal.s.k(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        p013kotlin.jvm.internal.s.k(securityChecker, "securityChecker");
        p013kotlin.jvm.internal.s.k(appInfoRepository, "appInfoRepository");
        p013kotlin.jvm.internal.s.k(jweEncrypter, "jweEncrypter");
        p013kotlin.jvm.internal.s.k(messageVersionRegistry, "messageVersionRegistry");
        p013kotlin.jvm.internal.s.k(sdkReferenceNumber, "sdkReferenceNumber");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
        this.deviceDataFactory = deviceDataFactory;
        this.deviceParamNotAvailableFactory = deviceParamNotAvailableFactory;
        this.securityChecker = securityChecker;
        this.appInfoRepository = appInfoRepository;
        this.jweEncrypter = jweEncrypter;
        this.messageVersionRegistry = messageVersionRegistry;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    @Override // t80.d
    public Object a(String str, PublicKey publicKey, String str2, q qVar, PublicKey publicKey2, Continuation<? super AuthenticationRequestParameters> continuation) {
        return BuildersKt.withContext(this.workContext, new b(qVar, this, publicKey2, str2, str, publicKey, null), continuation);
    }

    public final String g() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("DV", "1.1").put("DD", new JSONObject(this.deviceDataFactory.create())).put("DPNA", new JSONObject(this.deviceParamNotAvailableFactory.create()));
        List<Warning> warnings = this.securityChecker.getWarnings();
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(warnings, 10));
        Iterator<T> it = warnings.iterator();
        while (it.hasNext()) {
            arrayList.add(((Warning) it.next()).getId());
        }
        String string = jSONObjectPut.put("SW", new JSONArray((Collection) arrayList)).toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return string;
    }

    public final qz.h h(String directoryServerId) {
        com.stripe.android.stripe3ds2.security.e next;
        p013kotlin.jvm.internal.s.k(directoryServerId, "directoryServerId");
        Iterator<com.stripe.android.stripe3ds2.security.e> it = com.stripe.android.stripe3ds2.security.e.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!next.getIds().contains(directoryServerId));
        com.stripe.android.stripe3ds2.security.e eVar = next;
        return eVar != null ? eVar.getKeyUse() : qz.h.f106257b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(p80.e deviceDataFactory, p80.h deviceParamNotAvailableFactory, p80.m securityChecker, com.stripe.android.stripe3ds2.security.g ephemeralKeyPairGenerator, p80.b appInfoRepository, p messageVersionRegistry, String sdkReferenceNumber, r80.c errorReporter, CoroutineContext workContext) {
        this(deviceDataFactory, deviceParamNotAvailableFactory, securityChecker, appInfoRepository, new com.stripe.android.stripe3ds2.security.b(ephemeralKeyPairGenerator, errorReporter), messageVersionRegistry, sdkReferenceNumber, errorReporter, workContext);
        p013kotlin.jvm.internal.s.k(deviceDataFactory, "deviceDataFactory");
        p013kotlin.jvm.internal.s.k(deviceParamNotAvailableFactory, "deviceParamNotAvailableFactory");
        p013kotlin.jvm.internal.s.k(securityChecker, "securityChecker");
        p013kotlin.jvm.internal.s.k(ephemeralKeyPairGenerator, "ephemeralKeyPairGenerator");
        p013kotlin.jvm.internal.s.k(appInfoRepository, "appInfoRepository");
        p013kotlin.jvm.internal.s.k(messageVersionRegistry, "messageVersionRegistry");
        p013kotlin.jvm.internal.s.k(sdkReferenceNumber, "sdkReferenceNumber");
        p013kotlin.jvm.internal.s.k(errorReporter, "errorReporter");
        p013kotlin.jvm.internal.s.k(workContext, "workContext");
    }
}
