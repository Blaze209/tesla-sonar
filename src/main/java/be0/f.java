package be0;

import android.annotation.SuppressLint;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
import ie0.b0;
import io.reactivex.rxjava3.core.o;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0013\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f¢\u0006\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0019"}, d2 = {"Lbe0/f;", "", "<init>", "()V", "Ltd0/m;", "realmHelper", "Ljn0/h0;", "g", "(Ltd0/m;)V", IntegerTokenConverter.CONVERTER_KEY, "e", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/rxjava3/core/o;", "", "h", "()Lio/reactivex/rxjava3/core/o;", "", "f", "Lwm0/e;", "b", "Lwm0/e;", Scopes.EMAIL, "c", "phone", "token", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f17060a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final wm0.e<String> email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final wm0.e<String> phone;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final wm0.e<String> token;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"be0/f$a", "Lie0/b0;", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements b0 {
        a() {
        }

        @Override // ie0.b0
        public void a(String key, String value) {
            s.k(key, "key");
            s.k(value, "value");
            f.token.onNext(value);
        }

        @Override // ie0.b0
        public void b(String key) {
            s.k(key, "key");
            b0.a.a(this, key);
            f.token.onNext("");
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"be0/f$b", "Lie0/b0;", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements b0 {
        b() {
        }

        @Override // ie0.b0
        public void a(String key, String value) {
            s.k(key, "key");
            s.k(value, "value");
            f.email.onNext(value);
        }

        @Override // ie0.b0
        public void b(String key) {
            s.k(key, "key");
            b0.a.a(this, key);
            f.email.onNext("");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T1, T2, R> implements cm0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c<T1, T2, R> f17064a = new c<>();

        c() {
        }

        @Override // cm0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean apply(String emailValue, String tokenValue) {
            s.k(emailValue, "emailValue");
            s.k(tokenValue, "tokenValue");
            return Boolean.valueOf((t.y0(emailValue) || t.y0(tokenValue)) ? false : true);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"be0/f$d", "Lie0/b0;", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements b0 {
        d() {
        }

        @Override // ie0.b0
        public void a(String key, String value) {
            s.k(key, "key");
            s.k(value, "value");
            f.phone.onNext(value);
        }

        @Override // ie0.b0
        public void b(String key) {
            s.k(key, "key");
            b0.a.a(this, key);
            f.phone.onNext("");
        }
    }

    static {
        wm0.e eVarB0 = wm0.a.d0().b0();
        s.j(eVarB0, "toSerialized(...)");
        email = eVarB0;
        wm0.e eVarB1 = wm0.a.d0().b0();
        s.j(eVarB1, "toSerialized(...)");
        phone = eVarB1;
        wm0.e eVarB2 = wm0.a.d0().b0();
        s.j(eVarB2, "toSerialized(...)");
        token = eVarB2;
    }

    private f() {
    }

    @SuppressLint({"CheckResult"})
    private final void e(m realmHelper) {
        String strH = realmHelper.h("_SSO_AUTH_TOKEN");
        wm0.e<String> eVar = token;
        if (strH == null) {
            strH = "";
        }
        eVar.onNext(strH);
        realmHelper.q("_SSO_AUTH_TOKEN", new a());
    }

    @SuppressLint({"CheckResult"})
    private final void g(m realmHelper) {
        String strH = realmHelper.h("_ACCOUNT_EMAIL");
        wm0.e<String> eVar = email;
        if (strH == null) {
            strH = "";
        }
        eVar.onNext(strH);
        realmHelper.q("_ACCOUNT_EMAIL", new b());
    }

    @SuppressLint({"CheckResult"})
    private final void i(m realmHelper) {
        String strH = realmHelper.h("_ACCOUNT_PHONE");
        wm0.e<String> eVar = phone;
        if (strH == null) {
            strH = "";
        }
        eVar.onNext(strH);
        realmHelper.q("_ACCOUNT_PHONE", new d());
    }

    public final void d(m realmHelper) {
        s.k(realmHelper, "realmHelper");
        g(realmHelper);
        i(realmHelper);
        e(realmHelper);
    }

    public final o<String> f() {
        return email;
    }

    public final o<Boolean> h() {
        o<Boolean> oVarJ = o.c(email, token, c.f17064a).j();
        s.j(oVarJ, "distinctUntilChanged(...)");
        return oVarJ;
    }
}
