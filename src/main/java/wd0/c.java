package wd0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwd0/c;", "", "<init>", "()V", "Lcc0/f;", "c", "()Lcc0/f;", "b", DateTokenConverter.CONVERTER_KEY, "", "count", "e", "(I)Lcc0/f;", "", "parameters", "Ljn0/h0;", "a", "(Ljava/util/List;)V", "report_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f121676a = new c();

    private c() {
    }

    public final void a(List<cc0.f> parameters) {
        s.k(parameters, "parameters");
        pa0.c.c().b(cc0.d.REPORT_UPLOAD_ATTEMPTED, parameters);
    }

    public final cc0.f b() {
        return new cc0.f(cc0.g.REPORT_TYPE, null, null, null, new cc0.h(Action.FILE_ATTRIBUTE, null, 2, null), null, 46, null);
    }

    public final cc0.f c() {
        return new cc0.f(cc0.g.REPORT_TYPE, null, null, null, new cc0.h("log", null, 2, null), null, 46, null);
    }

    public final cc0.f d() {
        return new cc0.f(cc0.g.REPORT_TYPE, null, null, null, new cc0.h("zip_file", null, 2, null), null, 46, null);
    }

    public final cc0.f e(int count) {
        return new cc0.f(cc0.g.RETRY_COUNT, null, new cc0.e(count, null, 2, null), null, null, null, 58, null);
    }
}
