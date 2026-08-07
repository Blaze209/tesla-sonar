package be0;

import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tesla.domain.model.Product;
import com.tesla.logging.TeslaLog;
import fc0.u5;
import ie0.b0;
import io.reactivex.rxjava3.core.o;
import io.reactivex.rxjava3.core.p;
import io.reactivex.rxjava3.core.q;
import ke0.i;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lbe0/b;", "", "Ltd0/m;", "realmHelper", "<init>", "(Ltd0/m;)V", "Lbe0/b$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "b", "(Lbe0/b$a;)Ljava/lang/String;", "Lio/reactivex/rxjava3/core/o;", "Lfc0/u5;", "c", "()Lio/reactivex/rxjava3/core/o;", "a", "Ltd0/m;", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m realmHelper;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lbe0/b$a;", "", "Lcom/tesla/domain/model/Product;", "product", "Ljn0/h0;", "a", "(Lcom/tesla/domain/model/Product;)V", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        void a(Product product);
    }

    /* JADX INFO: renamed from: be0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"be0/b$b", "Lie0/b0;", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0342b implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f17054a;

        C0342b(a aVar) {
            this.f17054a = aVar;
        }

        @Override // ie0.b0
        public void a(String key, String value) {
            s.k(key, "key");
            s.k(value, "value");
            try {
                Product productFromJson = xb0.c.f123196a.d().fromJson(value);
                if (productFromJson != null) {
                    this.f17054a.a(productFromJson);
                }
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("GetSelectedProduct", "Failed to deserialize", e11);
            }
        }

        @Override // ie0.b0
        public void b(String str) {
            b0.a.a(this, str);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"be0/b$c", "Lie0/b0;", "", Action.KEY_ATTRIBUTE, "value", "Ljn0/h0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "repository_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<u5> f17055a;

        c(p<u5> pVar) {
            this.f17055a = pVar;
        }

        @Override // ie0.b0
        public void a(String key, String value) {
            s.k(key, "key");
            s.k(value, "value");
            try {
                u5 u5VarE = ke0.b.f85979a.e(new JSONObject(value), i.LOCAL_NON_REDUX_VEHICLE);
                if (u5VarE != null) {
                    this.f17055a.onNext(u5VarE);
                }
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("GetSelectedProduct", "Failed to deserialize", e11);
            }
        }

        @Override // ie0.b0
        public void b(String str) {
            b0.a.a(this, str);
        }
    }

    public b(m realmHelper) {
        s.k(realmHelper, "realmHelper");
        this.realmHelper = realmHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b bVar, p source) {
        s.k(source, "source");
        bVar.realmHelper.q("LAST_SELECTED_VEHICLE", new c(source));
    }

    public final String b(a listener) {
        s.k(listener, "listener");
        String strQ = this.realmHelper.q("SELECTED_PRODUCT", new C0342b(listener));
        s.j(strQ, "observe(...)");
        return strQ;
    }

    public final o<u5> c() {
        o<u5> oVarG = o.g(new q() { // from class: be0.a
            @Override // io.reactivex.rxjava3.core.q
            public final void a(p pVar) {
                b.d(this.f17052a, pVar);
            }
        });
        s.j(oVarG, "create(...)");
        return oVarG;
    }
}
