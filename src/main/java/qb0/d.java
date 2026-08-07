package qb0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import bo0.n;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import com.tesla.logging.TeslaLog;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.text.q;
import p013kotlin.text.t;
import td0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\tJ#\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001c\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001aJ1\u0010 \u001a\u00020\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eH\u0016¢\u0006\u0004\b \u0010!J)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b(\u0010)J!\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010-\u001a\u00020$2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b-\u0010)J'\u0010/\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b/\u00100J!\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b1\u00102J%\u00103\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b3\u0010\rJ-\u00104\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b4\u00105J%\u00106\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b6\u0010\rJ-\u00108\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u00107\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b8\u00105J%\u00109\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b9\u0010\rJ%\u0010:\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b:\u0010\rJ\u000f\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010<J'\u0010@\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ!\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060C0BH\u0016¢\u0006\u0004\bD\u0010EJ)\u0010F\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bF\u0010AJ/\u0010H\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bH\u0010IJ'\u0010J\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u000fH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020NH\u0016¢\u0006\u0004\bQ\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010RR\u0014\u0010U\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010<R\u0016\u0010[\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010<R(\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010<\"\u0004\b]\u0010\u0011R(\u0010a\u001a\u0004\u0018\u00010\u00062\b\u0010^\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b_\u0010<\"\u0004\b`\u0010\u0011R(\u0010e\u001a\u0004\u0018\u00010\u00062\b\u0010b\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010<\"\u0004\bd\u0010\u0011R\u0016\u0010g\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010<R(\u0010h\u001a\u0004\u0018\u00010\u00062\b\u0010h\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010<\"\u0004\bj\u0010\u0011R\u0016\u0010l\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010<R\u0014\u0010n\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010<R0\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00060B2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00060B8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bp\u0010E\"\u0004\bq\u0010rR(\u0010t\u001a\u0004\u0018\u00010\u00062\b\u0010t\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bV\u0010<\"\u0004\bu\u0010\u0011R(\u0010v\u001a\u0004\u0018\u00010\u00062\b\u0010v\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bw\u0010<\"\u0004\bx\u0010\u0011R\u0014\u0010y\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010<R\u0014\u0010{\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010<R\u0014\u0010}\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010<R\u0014\u0010\u007f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010<R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0084\u0001"}, d2 = {"Lqb0/d;", "Lqb0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", Action.KEY_ATTRIBUTE, "a0", "(Ljava/lang/String;)Ljava/lang/String;", "vin", "accountEmail", "Z", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "refreshToken", "Ljn0/h0;", "H", "(Ljava/lang/String;)V", "iceConfigJson", "P", "idToken", "l", "identifier", "z", "name", "K", "(Ljava/lang/String;Ljava/lang/String;)V", "pubkey", "m", Scopes.EMAIL, "", "peripherals", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "W", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;", "", "initializationVector", "p", "(JLjava/lang/String;)J", "R", "(Ljava/lang/String;)J", "count", "h", "(JLjava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "keys", "X", "(Ljava/util/Set;Ljava/lang/String;)V", "a", "(Ljava/lang/String;)Ljava/util/Set;", Gender.OTHER, "T", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "o", "expiration", "D", "L", "C", "E", "()Ljava/lang/String;", "sourcePublicKey", "Lsc0/b;", "domain", "b0", "(Ljava/lang/String;Ljava/lang/String;Lsc0/b;)Ljava/lang/String;", "", "Lkotlin/Pair;", "B", "()Ljava/util/List;", "V", "sessionInfo", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsc0/b;)V", "b", "(Ljava/lang/String;Ljava/lang/String;Lsc0/b;)V", "n", "()V", "", "g", "()I", "r", "Landroid/content/Context;", "c", "Ljava/lang/String;", "KEY_ROUTABLE_SESSION_INFO", DateTokenConverter.CONVERTER_KEY, "KEY_LAST_REALM_COMPACTION_RESTART_PROCESS_TIMESTAMP", "k", "authToken", Gender.FEMALE, "appUUID", "v", "J", "phone", "getAccountPhone", Gender.NONE, "accountPhone", "token", "Q", "s", "remoteNotificationToken", "u", "appPreviouslyLaunched", "selectedProduct", "getSelectedProduct", Gender.UNKNOWN, "I", "lastSelectedVehicle", "t", "buildGitHash", "selectedVINs", "w", "f", "(Ljava/util/List;)V", "recentlySelectedVINs", "publicKeyId", "Y", "keyStorePass", "A", Gender.MALE, "teslaUserAgent", "y", "packageVersion", "S", "appVersion", "G", "buildNumber", "", "x", "()Z", "isRealmCompactionProcessRestartExpired", "configdata_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String KEY_ROUTABLE_SESSION_INFO;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String KEY_LAST_REALM_COMPACTION_RESTART_PROCESS_TIMESTAMP;

    public d(Context context) {
        s.k(context, "context");
        this.context = context;
        this.KEY_ROUTABLE_SESSION_INFO = "_ROUTABLE_SESSION_INFO_";
        this.KEY_LAST_REALM_COMPACTION_RESTART_PROCESS_TIMESTAMP = "LAST_REALM_COMPACTION_RESTART_PROCESS_TIMESTAMP";
    }

    private final String Z(String vin, String accountEmail) {
        t0 t0Var = t0.f86535a;
        String str = String.format("VEHICLE_BLE_%s_%s_PERIPHERALS", Arrays.copyOf(new Object[]{accountEmail, vin}, 2));
        s.j(str, "format(...)");
        return str;
    }

    private final String a0(String key) {
        try {
            return t.n1(t.r1(key, this.KEY_ROUTABLE_SESSION_INFO, null, 2, null), n.w(0, 17));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // qb0.a
    public String A() {
        return m.j().h("_KEY_STORE_PASS");
    }

    @Override // qb0.a
    public List<Pair<String, String>> B() throws Throwable {
        List<android.util.Pair<String, String>> listI = m.j().i(v.m(), v.e(this.KEY_ROUTABLE_SESSION_INFO));
        s.j(listI, "get(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            android.util.Pair pair = (android.util.Pair) it.next();
            TeslaLog teslaLog = TeslaLog.INSTANCE;
            teslaLog.i("TeslaConfigData#getAllSessionInfo", String.valueOf(pair));
            Object first = pair.first;
            s.j(first, "first");
            String strA0 = a0((String) first);
            teslaLog.i("TeslaConfigData#getAllSessionInfo", "parsed VIN: '" + strA0 + "'");
            Pair pairA = strA0 == null ? null : x.a(strA0, pair.second);
            if (pairA != null) {
                arrayList.add(pairA);
            }
        }
        return arrayList;
    }

    @Override // qb0.a
    public String C(String email, String vin) {
        m mVarJ = m.j();
        t0 t0Var = t0.f86535a;
        String str = String.format("PII_%s_%s_SUBSCRIBER_PRIVATE_KEY", Arrays.copyOf(new Object[]{email, vin}, 2));
        s.j(str, "format(...)");
        return mVarJ.h(str);
    }

    @Override // qb0.a
    public void D(String email, String vin, String expiration) {
        m mVarJ = m.j();
        t0 t0Var = t0.f86535a;
        String str = String.format("PII_%s_%s_VEHICLE_PII_KEY_EXPIRATION", Arrays.copyOf(new Object[]{email, vin}, 2));
        s.j(str, "format(...)");
        mVarJ.u(str, expiration);
    }

    @Override // qb0.a
    public String E() {
        m mVarJ = m.j();
        String strH = mVarJ.h("ANONYMOUS_INSTALL_IDENTIFIER");
        if (strH != null) {
            return strH;
        }
        String string = UUID.randomUUID().toString();
        s.j(string, "toString(...)");
        mVarJ.u("ANONYMOUS_INSTALL_IDENTIFIER", string);
        return string;
    }

    @Override // qb0.a
    public String F() {
        return m.j().h("APP_UUID");
    }

    @Override // qb0.a
    public String G() {
        List listM;
        List<String> listM2 = new q("-").m(y(), 0);
        if (listM2.isEmpty()) {
            listM = v.m();
        } else {
            ListIterator<String> listIterator = listM2.listIterator(listM2.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listM = v.d1(listM2, listIterator.nextIndex() + 1);
                }
            }
            listM = v.m();
        }
        String[] strArr = (String[]) listM.toArray(new String[0]);
        return strArr[strArr.length - 1];
    }

    @Override // qb0.a
    public void H(String refreshToken) {
        s.k(refreshToken, "refreshToken");
        m.j().u("_SSO_AUTH_REFRESH_TOKEN", refreshToken);
    }

    @Override // qb0.a
    public String I() {
        return m.j().h("LAST_SELECTED_VEHICLE");
    }

    @Override // qb0.a
    public void J(String str) {
        m.j().u("_ACCOUNT_EMAIL", str);
    }

    @Override // qb0.a
    public void K(String identifier, String name) {
        m.j().u(identifier, name);
    }

    @Override // qb0.a
    public String L(String email, String vin) {
        m mVarJ = m.j();
        t0 t0Var = t0.f86535a;
        String str = String.format("PII_%s_%s_SUBSCRIBER_KEYPAIR_EXPIRATION", Arrays.copyOf(new Object[]{email, vin}, 2));
        s.j(str, "format(...)");
        return mVarJ.h(str);
    }

    @Override // qb0.a
    public void M(String str) {
        m.j().u("_KEY_STORE_PASS", str);
    }

    @Override // qb0.a
    public void N(String str) {
        m.j().u("_ACCOUNT_PHONE", str);
    }

    @Override // qb0.a
    public String O(String email, String vin) {
        m mVarJ = m.j();
        t0 t0Var = t0.f86535a;
        String str = String.format("PII_%s_%s_VEHICLE_PII_KEY", Arrays.copyOf(new Object[]{email, vin}, 2));
        s.j(str, "format(...)");
        return mVarJ.h(str);
    }

    @Override // qb0.a
    public void P(String iceConfigJson) {
        s.k(iceConfigJson, "iceConfigJson");
        m.j().u("_ICE_CONFIG", iceConfigJson);
    }

    @Override // qb0.a
    public String Q() {
        return m.j().h("REMOTE_NOTIFICATION_TOKEN");
    }

    @Override // qb0.a
    public long R(String identifier) {
        return b.e(identifier, this.context);
    }

    @Override // qb0.a
    public String S() {
        List listM;
        List<String> listM2 = new q("-").m(y(), 0);
        if (listM2.isEmpty()) {
            listM = v.m();
        } else {
            ListIterator<String> listIterator = listM2.listIterator(listM2.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    listM = v.d1(listM2, listIterator.nextIndex() + 1);
                }
            }
            listM = v.m();
        }
        return ((String[]) listM.toArray(new String[0]))[0];
    }

    @Override // qb0.a
    public void T(String email, String vin, String key) {
        m mVarJ = m.j();
        t0 t0Var = t0.f86535a;
        String str = String.format("PII_%s_%s_VEHICLE_PII_KEY", Arrays.copyOf(new Object[]{email, vin}, 2));
        s.j(str, "format(...)");
        mVarJ.u(str, key);
    }

    @Override // qb0.a
    public void U(String str) {
        m.j().u("SELECTED_PRODUCT", str);
    }

    @Override // qb0.a
    public String V(String vin, String sourcePublicKey, sc0.b domain) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        return m.j().h(b0(vin, sourcePublicKey, domain));
    }

    @Override // qb0.a
    public Set<String> W(String vin, String email) {
        Set<String> setG = b.g(Z(vin, email), this.context);
        s.j(setG, "getPeripherals(...)");
        return setG;
    }

    @Override // qb0.a
    public void X(Set<String> keys, String identifier) {
        s.k(keys, "keys");
        b.r(keys, identifier, this.context);
    }

    @Override // qb0.a
    public void Y(String str) {
        m.j().u("PUBLIC_KEY_ID", str);
    }

    @Override // qb0.a
    public Set<String> a(String identifier) {
        return b.n(identifier, this.context);
    }

    @Override // qb0.a
    public void b(String vin, String sourcePublicKey, sc0.b domain) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        m.j().r(b0(vin, sourcePublicKey, domain));
    }

    public String b0(String vin, String sourcePublicKey, sc0.b domain) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(domain, "domain");
        return this.KEY_ROUTABLE_SESSION_INFO + vin + sourcePublicKey + domain;
    }

    @Override // qb0.a
    public String c() {
        String strT = t();
        String strY = y();
        String packageName = this.context.getPackageName();
        t0 t0Var = t0.f86535a;
        String str = String.format("%s/%s/%s/android/%s", Arrays.copyOf(new Object[]{packageName, strY, strT, Build.VERSION.RELEASE}, 4));
        s.j(str, "format(...)");
        return str;
    }

    @Override // qb0.a
    public String d() {
        return m.j().h("PUBLIC_KEY_ID");
    }

    @Override // qb0.a
    public void e(String vin, String email, Set<String> peripherals) {
        s.k(peripherals, "peripherals");
        b.p(Z(vin, email), peripherals, this.context);
    }

    @Override // qb0.a
    public void f(List<String> selectedVINs) {
        s.k(selectedVINs, "selectedVINs");
        m.j().u("RECENTLY_SELECTED_VINS", TextUtils.join(":", selectedVINs));
    }

    @Override // qb0.a
    public int g() {
        String strH = m.j().h("SHARED_FLEET_BLE_SCAN_RSSI_THRESHOLD_KEY");
        if (strH != null) {
            return Integer.parseInt(strH);
        }
        return -120;
    }

    @Override // qb0.a
    public void h(long count, String identifier) {
        b.q(count, identifier, this.context);
    }

    @Override // qb0.a
    public long i(String identifier) {
        return b.m(identifier, this.context);
    }

    @Override // qb0.a
    public void j(String vin, String sourcePublicKey, String sessionInfo, sc0.b domain) {
        s.k(vin, "vin");
        s.k(sourcePublicKey, "sourcePublicKey");
        s.k(sessionInfo, "sessionInfo");
        s.k(domain, "domain");
        m.j().u(b0(vin, sourcePublicKey, domain), sessionInfo);
    }

    @Override // qb0.a
    public String k() {
        return m.j().h("_SSO_AUTH_TOKEN");
    }

    @Override // qb0.a
    public void l(String idToken) {
        s.k(idToken, "idToken");
        m.j().u("_SSO_AUTH_ID_TOKEN", idToken);
    }

    @Override // qb0.a
    public void m(String identifier, String pubkey) {
        m.j().u(identifier, pubkey);
    }

    @Override // qb0.a
    public void n() {
        m.j().u(this.KEY_LAST_REALM_COMPACTION_RESTART_PROCESS_TIMESTAMP, String.valueOf(System.currentTimeMillis()));
    }

    @Override // qb0.a
    public String o(String email, String vin) {
        m mVarJ = m.j();
        t0 t0Var = t0.f86535a;
        String str = String.format("PII_%s_%s_VEHICLE_PII_KEY_EXPIRATION", Arrays.copyOf(new Object[]{email, vin}, 2));
        s.j(str, "format(...)");
        return mVarJ.h(str);
    }

    @Override // qb0.a
    public long p(long initializationVector, String identifier) {
        return b.o(initializationVector, identifier, this.context);
    }

    @Override // qb0.a
    public int r() {
        String strH = m.j().h("SHARED_FLEET_BLE_SCAN_RSSI_DIFF_KEY");
        if (strH != null) {
            return Integer.parseInt(strH);
        }
        return 10;
    }

    @Override // qb0.a
    public void s(String str) {
        m.j().u("REMOTE_NOTIFICATION_TOKEN", str);
    }

    @Override // qb0.a
    public String t() {
        return "37b29644";
    }

    @Override // qb0.a
    public String u() {
        return m.j().h("APP_PREVIOUSLY_LAUNCHED");
    }

    @Override // qb0.a
    public String v() {
        return m.j().h("_ACCOUNT_EMAIL");
    }

    @Override // qb0.a
    public List<String> w() {
        String strH = m.j().h("RECENTLY_SELECTED_VINS");
        if (strH == null) {
            return new ArrayList();
        }
        String[] strArrSplit = TextUtils.split(strH, ":");
        return v.p(Arrays.copyOf(strArrSplit, strArrSplit.length));
    }

    @Override // qb0.a
    public boolean x() {
        String strH = m.j().h(this.KEY_LAST_REALM_COMPACTION_RESTART_PROCESS_TIMESTAMP);
        if (strH == null) {
            return true;
        }
        try {
            return System.currentTimeMillis() - Long.parseLong(strH) > TimeUnit.MILLISECONDS.convert(1L, TimeUnit.DAYS);
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    @Override // qb0.a
    public String y() {
        String strU;
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            s.j(packageInfo, "getPackageInfo(...)");
            String str = packageInfo.versionName;
            return (str == null || (strU = t.U(str, ' ', CoreConstants.DOT, false, 4, null)) == null) ? "Unknown" : strU;
        } catch (Exception unused) {
        }
    }

    @Override // qb0.a
    public String z(String identifier) {
        return m.j().h(identifier);
    }
}
