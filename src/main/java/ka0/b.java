package ka0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ii.k;
import mi.f;
import mi.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lka0/b;", "Lii/b;", "Lja0/b;", "<init>", "()V", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Lja0/b;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;Lja0/b;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements ii.b<ja0.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f85784a = new b();

    private b() {
    }

    @Override // ii.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ja0.b a(f reader, k customScalarAdapters) {
        s.k(reader, "reader");
        s.k(customScalarAdapters, "customScalarAdapters");
        String strO = reader.O();
        s.h(strO);
        return ja0.b.INSTANCE.a(strO);
    }

    @Override // ii.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(g writer, k customScalarAdapters, ja0.b value) {
        s.k(writer, "writer");
        s.k(customScalarAdapters, "customScalarAdapters");
        s.k(value, "value");
        writer.w(value.getRawValue());
    }
}
