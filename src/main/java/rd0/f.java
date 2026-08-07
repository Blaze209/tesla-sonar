package rd0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.TimeUnit;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lrd0/f;", "", "<init>", "()V", "", "id", "Lkotlin/Function0;", "Ljn0/h0;", "work", "", "delayMilliseconds", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lwn0/a;J)V", "c", "Lam0/b;", "a", "Lam0/b;", "disposable", "b", "Ljava/lang/String;", "phonekeyauthengine_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.tesla.logging.g f107765d = com.tesla.logging.g.INSTANCE.a("DelayWorkManager");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private am0.b disposable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String id;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final String str, final wn0.a aVar) {
        bd0.b.f17041a.b(new wn0.a() { // from class: rd0.e
            @Override // wn0.a
            public final Object invoke() {
                return f.f(str, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 f(String str, wn0.a aVar) {
        f107765d.j(str + " running delayed work");
        aVar.invoke();
        return h0.f84049a;
    }

    public final void c() {
        String str = this.id;
        if (str != null) {
            f107765d.j(str + " cancelled work");
        }
        this.id = null;
        am0.b bVar = this.disposable;
        if (bVar != null) {
            bVar.dispose();
        }
        this.disposable = null;
    }

    public final void d(final String id2, final wn0.a<h0> work, long delayMilliseconds) {
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(work, "work");
        c();
        this.id = id2;
        f107765d.j(id2 + " delaying work for " + delayMilliseconds + "ms");
        this.disposable = io.reactivex.rxjava3.core.b.l(delayMilliseconds, TimeUnit.MILLISECONDS).h(new cm0.a() { // from class: rd0.d
            @Override // cm0.a
            public final void run() {
                f.e(id2, work);
            }
        });
    }
}
