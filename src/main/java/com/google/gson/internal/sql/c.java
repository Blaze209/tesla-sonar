package com.google.gson.internal.sql;

import com.google.gson.f;
import com.google.gson.x;
import com.google.gson.y;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
class c extends x<Timestamp> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final y f45002b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x<Date> f45003a;

    class a implements y {
        a() {
        }

        @Override // com.google.gson.y
        public <T> x<T> a(f fVar, com.google.gson.reflect.a<T> aVar) {
            a aVar2 = null;
            if (aVar.getRawType() == Timestamp.class) {
                return new c(fVar.m(Date.class), aVar2);
            }
            return null;
        }
    }

    /* synthetic */ c(x xVar, a aVar) {
        this(xVar);
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(ex.a aVar) {
        Date dateB = this.f45003a.b(aVar);
        if (dateB != null) {
            return new Timestamp(dateB.getTime());
        }
        return null;
    }

    @Override // com.google.gson.x
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(ex.c cVar, Timestamp timestamp) {
        this.f45003a.d(cVar, timestamp);
    }

    private c(x<Date> xVar) {
        this.f45003a = xVar;
    }
}
