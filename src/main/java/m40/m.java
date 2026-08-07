package m40;

import java.util.Locale;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lm40/m;", "", "<init>", "()V", "Lw30/l$c;", "apiRequestOptions", "Lu50/c;", "c", "(Lw30/l$c;)Lu50/c;", "Lr50/a;", "requestExecutor", "Lw30/l$b;", "apiRequestFactory", "provideApiRequestOptions", "Ljava/util/Locale;", "locale", "Lo30/d;", "logger", "Lt50/p;", "b", "(Lr50/a;Lw30/l$b;Lu50/c;Ljava/util/Locale;Lo30/d;)Lt50/p;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f91193a = new m();

    private m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w30.l.Options d(w30.l.Options apiRequestOptions, boolean z11) {
        p013kotlin.jvm.internal.s.k(apiRequestOptions, "$apiRequestOptions");
        return apiRequestOptions;
    }

    public final t50.p b(r50.a requestExecutor, w30.l.b apiRequestFactory, u50.c provideApiRequestOptions, Locale locale, o30.d logger) {
        p013kotlin.jvm.internal.s.k(requestExecutor, "requestExecutor");
        p013kotlin.jvm.internal.s.k(apiRequestFactory, "apiRequestFactory");
        p013kotlin.jvm.internal.s.k(provideApiRequestOptions, "provideApiRequestOptions");
        p013kotlin.jvm.internal.s.k(logger, "logger");
        t50.p.Companion companion = t50.p.INSTANCE;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Locale locale2 = locale;
        p013kotlin.jvm.internal.s.h(locale2);
        return companion.a(requestExecutor, apiRequestFactory, provideApiRequestOptions, logger, locale2, null);
    }

    public final u50.c c(final w30.l.Options apiRequestOptions) {
        p013kotlin.jvm.internal.s.k(apiRequestOptions, "apiRequestOptions");
        return new u50.c() { // from class: m40.l
            @Override // u50.c
            public final w30.l.Options a(boolean z11) {
                return m.d(apiRequestOptions, z11);
            }
        };
    }
}
