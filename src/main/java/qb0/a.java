package qb0;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import ezvcard.property.Gender;
import java.util.List;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 (2\u00020\u0001:\u0001(J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u001b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0012\u0010\u0010J1\u0010\u0017\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b$\u0010 J'\u0010&\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b&\u0010'J!\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b(\u0010)J%\u0010*\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b*\u0010+J-\u0010-\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b/\u0010+J-\u00101\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u00100\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b1\u0010.J%\u00102\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b2\u0010+J%\u00103\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b3\u0010+J\u000f\u00104\u001a\u00020\u0002H&¢\u0006\u0004\b4\u00105J)\u00109\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00108\u001a\u000207H&¢\u0006\u0004\b9\u0010:J/\u0010<\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u000207H&¢\u0006\u0004\b<\u0010=J'\u0010>\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00022\u0006\u00108\u001a\u000207H&¢\u0006\u0004\b>\u0010?J!\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020A0@H&¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0004H&¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH&¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020FH&¢\u0006\u0004\bI\u0010HR\u0016\u0010K\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u00105R\u0016\u0010M\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bL\u00105R\u001e\u0010P\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\bN\u00105\"\u0004\bO\u0010\u0006R\u001e\u0010S\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\bQ\u00105\"\u0004\bR\u0010\u0006R\u001e\u0010V\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\bT\u00105\"\u0004\bU\u0010\u0006R\u0016\u0010X\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u00105R\u001e\u0010[\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\bY\u00105\"\u0004\bZ\u0010\u0006R\u0016\u0010]\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u00105R\u0014\u0010_\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b^\u00105R\"\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00020@8&@&X¦\u000e¢\u0006\f\u001a\u0004\b`\u0010C\"\u0004\ba\u0010bR\u001e\u0010f\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\bd\u00105\"\u0004\be\u0010\u0006R\u001e\u0010i\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\bg\u00105\"\u0004\bh\u0010\u0006R\u0014\u0010k\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u00105R\u0014\u0010m\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u00105R\u0014\u0010o\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bn\u00105R\u0014\u0010q\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u00105R\u0014\u0010u\u001a\u00020r8&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006v"}, d2 = {"Lqb0/a;", "", "", "refreshToken", "Ljn0/h0;", "H", "(Ljava/lang/String;)V", "iceConfigJson", "P", "idToken", "l", "identifier", "z", "(Ljava/lang/String;)Ljava/lang/String;", "name", "K", "(Ljava/lang/String;Ljava/lang/String;)V", "pubkey", "m", "vin", Scopes.EMAIL, "", "peripherals", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "W", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Set;", "", "initializationVector", "p", "(JLjava/lang/String;)J", "R", "(Ljava/lang/String;)J", "count", "h", "(JLjava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "keys", "X", "(Ljava/util/Set;Ljava/lang/String;)V", "a", "(Ljava/lang/String;)Ljava/util/Set;", Gender.OTHER, "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", Action.KEY_ATTRIBUTE, "T", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "o", "expiration", "D", "L", "C", "E", "()Ljava/lang/String;", "sourcePublicKey", "Lsc0/b;", "domain", "V", "(Ljava/lang/String;Ljava/lang/String;Lsc0/b;)Ljava/lang/String;", "sessionInfo", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsc0/b;)V", "b", "(Ljava/lang/String;Ljava/lang/String;Lsc0/b;)V", "", "Lkotlin/Pair;", "B", "()Ljava/util/List;", "n", "()V", "", "g", "()I", "r", "k", "authToken", Gender.FEMALE, "appUUID", "v", "J", "accountEmail", "getAccountPhone", Gender.NONE, "accountPhone", "Q", "s", "remoteNotificationToken", "u", "appPreviouslyLaunched", "getSelectedProduct", Gender.UNKNOWN, "selectedProduct", "I", "lastSelectedVehicle", "t", "buildGitHash", "w", "f", "(Ljava/util/List;)V", "recentlySelectedVINs", DateTokenConverter.CONVERTER_KEY, "Y", "publicKeyId", "A", Gender.MALE, "keyStorePass", "c", "teslaUserAgent", "y", "packageVersion", "S", "appVersion", "G", "buildNumber", "", "x", "()Z", "isRealmCompactionProcessRestartExpired", "configdata_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f105314a;

    /* JADX INFO: renamed from: qb0.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lqb0/a$a;", "", "<init>", "()V", "Lqb0/a;", "b", "()Lqb0/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "a", "(Landroid/content/Context;)V", "Lqb0/a;", "_instance", "configdata_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f105314a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static a _instance;

        private Companion() {
        }

        public final void a(Context context) {
            s.k(context, "context");
            Context applicationContext = context.getApplicationContext();
            s.j(applicationContext, "getApplicationContext(...)");
            _instance = new d(applicationContext);
        }

        public final a b() {
            a aVar = _instance;
            if (aVar != null) {
                return aVar;
            }
            s.B("_instance");
            return null;
        }
    }

    static a q() {
        return INSTANCE.b();
    }

    String A();

    List<Pair<String, String>> B();

    String C(String email, String vin);

    void D(String email, String vin, String expiration);

    String E();

    String F();

    String G();

    void H(String refreshToken);

    String I();

    void J(String str);

    void K(String identifier, String name);

    String L(String email, String vin);

    void M(String str);

    void N(String str);

    String O(String email, String vin);

    void P(String iceConfigJson);

    String Q();

    long R(String identifier);

    String S();

    void T(String email, String vin, String key);

    void U(String str);

    String V(String vin, String sourcePublicKey, sc0.b domain);

    Set<String> W(String vin, String email);

    void X(Set<String> keys, String identifier);

    void Y(String str);

    Set<String> a(String identifier);

    void b(String vin, String sourcePublicKey, sc0.b domain);

    String c();

    String d();

    void e(String vin, String email, Set<String> peripherals);

    void f(List<String> list);

    int g();

    void h(long count, String identifier);

    long i(String identifier);

    void j(String vin, String sourcePublicKey, String sessionInfo, sc0.b domain);

    String k();

    void l(String idToken);

    void m(String identifier, String pubkey);

    void n();

    String o(String email, String vin);

    long p(long initializationVector, String identifier);

    int r();

    void s(String str);

    String t();

    String u();

    String v();

    List<String> w();

    boolean x();

    String y();

    String z(String identifier);
}
