package wz;

import java.util.Date;
import rz.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b<T> extends f<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static f<Date> f122441c = new a(null);

    class a extends wz.a<Date> {
        a(e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Date b(Object obj) {
            return g.c(obj);
        }
    }
}
